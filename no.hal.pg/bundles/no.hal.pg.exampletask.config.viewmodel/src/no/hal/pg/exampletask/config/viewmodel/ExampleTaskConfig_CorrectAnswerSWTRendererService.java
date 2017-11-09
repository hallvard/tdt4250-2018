package no.hal.pg.exampletask.config.viewmodel;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VDomainModelReference;
import org.eclipse.emf.ecp.view.spi.model.VElement;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.swt.core.AbstractSWTRenderer;
import org.eclipse.emfforms.spi.swt.core.di.EMFFormsDIRendererService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.config.viewmodel.BooleanComboViewerSWTRenderer;
import no.hal.pg.exampletask.config.ConfigPackage;

@Component
public class ExampleTaskConfig_CorrectAnswerSWTRendererService implements EMFFormsDIRendererService<VControl> {

	private EMFFormsDatabinding databindingService;

	@Reference(cardinality=ReferenceCardinality.MANDATORY, policy=ReferencePolicy.DYNAMIC)
	public void setEMFFormsDatabinding(EMFFormsDatabinding databindingService) {
		this.databindingService = databindingService;
	}
	public void unsetEMFFormsDatabinding(EMFFormsDatabinding databindingService) {
		this.databindingService = null;
	}
	
	@Override
	public double isApplicable(VElement vElement, ViewModelContext viewModelContext) {
		if (vElement instanceof VControl) {
			VDomainModelReference model = ((VControl) vElement).getDomainModelReference();
			if (databindingService != null && model != null) {
				try {
					IValueProperty<?, ?> valueProperty = databindingService.getValueProperty(model, viewModelContext.getDomainModel());
					if (ConfigPackage.eINSTANCE.getExampleTaskConfig_CorrectAnswer() == valueProperty.getValueType()) {
						return 10;
					}
				} catch (DatabindingFailedException ex) {
				}
			}
		}
		return NOT_APPLICABLE;
	}

	@Override
	public Class<? extends AbstractSWTRenderer<VControl>> getRendererClass() {
		return BooleanComboViewerSWTRenderer.class;
	}
}
