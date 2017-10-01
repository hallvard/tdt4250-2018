package no.hal.pg.ui;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import no.hal.pg.http.IRequestPathResolver;
import no.hal.pg.http.IRequestQueryExecutor;
import no.hal.pg.http.IResponseSerializer;

public class ResourceRequestView extends AbstractSelectionView {

	@Override
	protected boolean isValidSelection(Object o) {
		return o instanceof EObject;
	}

	protected EObject getSelectedEObject() {
		return (EObject) getSelection();
	}

	private boolean autoUpdateView = true;
	
	private Text requestText;
	private Button updateButton;

	private Text resultText;

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = 1;
		layout.verticalSpacing = 1;
		parent.setLayout(layout);

		requestText = new Text(parent, SWT.BORDER);
		requestText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				updateView();
			}
		});
		requestText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		updateButton = new Button(parent, SWT.PUSH);
		updateButton.setText("Update");
		updateButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false));
		updateButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (autoUpdateView) {
					updateView();
				}
			}
		});
		updateButton.setEnabled(! autoUpdateView);

		resultText = new Text(parent, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
		resultText.setEditable(false);
		resultText.setText("\n\n\n\n\n\n\n");
		resultText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
	}

	@Override
	public void setFocus() {
		requestText.setFocus();
	}
	
	private IRequestPathResolver requestPathResolver;
	private IRequestQueryExecutor requestQueryExecutor;
	private IResponseSerializer responseSerializer;

	@Override
	protected void updateView() {
		updateServices();
		EObject selection = getSelectedEObject();
		if (selection == null) {
			resultText.setText("<No selection>");
		} else {
			List<String> segments = new ArrayList<>(Arrays.asList(requestText.getText().split("/")));
			while (segments.remove(""));
			if (requestPathResolver != null) {
				String[] segmentsArray = segments.toArray(new String[segments.size()]);
				Collection<EObject> rootObjects = Collections.<EObject>singletonList(selection);
				Object objects = requestPathResolver.getObjectForPath(rootObjects, segmentsArray);
				if (responseSerializer != null) {
					StringWriter stringWriter = new StringWriter();
					try {
						responseSerializer.serialize(objects, stringWriter);
						resultText.setText(stringWriter.toString());
					} catch (Exception e) {
						resultText.setText(e.getMessage());
					}
				}
			}
		}
	}

	private boolean updateServicesAlways = true;
	
	protected void updateServices() {
		if (updateServicesAlways || requestPathResolver == null || requestQueryExecutor == null || responseSerializer == null) {
			BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
			if (updateServicesAlways || requestPathResolver == null) {
				ServiceReference<IRequestPathResolver> requestPathResolverServiceReference = bundleContext.getServiceReference(IRequestPathResolver.class);
				if (requestPathResolverServiceReference != null) {
					requestPathResolver = bundleContext.getService(requestPathResolverServiceReference);
				}
			}
			if (updateServicesAlways || requestQueryExecutor == null) {
				ServiceReference<IRequestQueryExecutor> requestQueryExecutorServiceReference = bundleContext.getServiceReference(IRequestQueryExecutor.class);
				if (requestQueryExecutorServiceReference != null) {
					requestQueryExecutor = bundleContext.getService(requestQueryExecutorServiceReference);
				}
			}
			if (updateServicesAlways || responseSerializer == null) {
				ServiceReference<IResponseSerializer> responseSerializerServiceReference = bundleContext.getServiceReference(IResponseSerializer.class);
				if (responseSerializerServiceReference != null) {
					responseSerializer = bundleContext.getService(responseSerializerServiceReference);
				}
			}
		}
	}
}
