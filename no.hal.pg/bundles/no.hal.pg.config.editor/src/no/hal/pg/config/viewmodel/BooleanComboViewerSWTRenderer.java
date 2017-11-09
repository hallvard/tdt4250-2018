package no.hal.pg.config.viewmodel;

import java.util.Arrays;
import java.util.Collection;

import javax.inject.Inject;

import org.eclipse.core.databinding.Binding;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.SimpleControlJFaceViewerSWTRenderer;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.template.model.VTViewTemplateProvider;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.core.services.editsupport.EMFFormsEditSupport;
import org.eclipse.emfforms.spi.core.services.label.EMFFormsLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;

// ripped from EnumComboViewerSWTRenderer
public class BooleanComboViewerSWTRenderer extends SimpleControlJFaceViewerSWTRenderer {

	public final static String[]
			trueFalseLabels = { "False", "True" },
			xvLabels = { "x", "v" },
			yesNoLabels = { "No", "Yes" }
	;
	
	private String[] booleanLabels = yesNoLabels;
	
	public void setTrueFalseLabels(Collection<String> labels) {
		booleanLabels = labels.toArray(new String[labels.size()]);
	}

	protected String getBooleanLabel(Object element) {
		return element instanceof Boolean ? booleanLabels[((Boolean) element).booleanValue() ? 1 : 0] : "";
	}

	private final EMFFormsEditSupport emfFormsEditSupport;

	/**
	 * Default constructor.
	 *
	 * @param vElement the view model element to be rendered
	 * @param viewContext the view context
	 * @param reportService The {@link ReportService}
	 * @param emfFormsDatabinding The {@link EMFFormsDatabinding}
	 * @param emfFormsLabelProvider The {@link EMFFormsLabelProvider}
	 * @param vtViewTemplateProvider The {@link VTViewTemplateProvider}
	 * @param emfFormsEditSupport The {@link EMFFormsEditSupport}
	 */
	@Inject
	public BooleanComboViewerSWTRenderer(VControl vElement, ViewModelContext viewContext,
		ReportService reportService, EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
		VTViewTemplateProvider vtViewTemplateProvider, EMFFormsEditSupport emfFormsEditSupport) {
		super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider);
		this.emfFormsEditSupport = emfFormsEditSupport;
	}

	@Override
	protected Binding[] createBindings(Viewer viewer) throws DatabindingFailedException {
		final Binding binding = getDataBindingContext().bindValue(ViewersObservables.observeSingleSelection(viewer),
			getModelValue());
		final Binding tooltipBinding = getDataBindingContext().bindValue(
			WidgetProperties.tooltipText().observe(viewer.getControl()),
			getModelValue());
		return new Binding[] { binding, tooltipBinding };
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.view.spi.core.swt.SimpleControlJFaceViewerSWTRenderer#createJFaceViewer(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Viewer createJFaceViewer(Composite parent) throws DatabindingFailedException {
		ComboViewer combo = new ComboViewer(parent);
		combo.setContentProvider(new ArrayContentProvider());
		combo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return getBooleanLabel(element);
//				return getEMFFormsEditSupport().getText(getVElement().getDomainModelReference(), getViewModelContext().getDomainModel(), element);
			}
		});
		combo.setInput(Arrays.asList(Boolean.FALSE, Boolean.TRUE));
		return combo;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.ecp.view.spi.core.swt.SimpleControlSWTRenderer#getUnsetText()
	 */
	@Override
	protected String getUnsetText() {
		return "No value set";
	}

	/**
	 * Return the {@link EMFFormsEditSupport}.
	 *
	 * @return the {@link EMFFormsEditSupport}
	 */
	protected EMFFormsEditSupport getEMFFormsEditSupport() {
		return emfFormsEditSupport;
	}
}
