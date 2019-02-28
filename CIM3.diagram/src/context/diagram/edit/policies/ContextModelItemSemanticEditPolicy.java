package context.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import context.diagram.edit.commands.ActivityCreateCommand;
import context.diagram.edit.commands.CompositeCreateCommand;
import context.diagram.edit.commands.ComputingCreateCommand;
import context.diagram.edit.commands.CongnitiveCreateCommand;
import context.diagram.edit.commands.ContextSourceCreateCommand;
import context.diagram.edit.commands.CurrentCreateCommand;
import context.diagram.edit.commands.EntityCreateCommand;
import context.diagram.edit.commands.FixedCreateCommand;
import context.diagram.edit.commands.FocusCreateCommand;
import context.diagram.edit.commands.FutureCreateCommand;
import context.diagram.edit.commands.IdentifyCreateCommand;
import context.diagram.edit.commands.LocationCreateCommand;
import context.diagram.edit.commands.PastCreateCommand;
import context.diagram.edit.commands.PreferenceCreateCommand;
import context.diagram.edit.commands.RefinementCreateCommand;
import context.diagram.edit.commands.RelativeCreateCommand;
import context.diagram.edit.commands.SocialCreateCommand;
import context.diagram.edit.commands.UserCreateCommand;
import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class ContextModelItemSemanticEditPolicy extends CIM3BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContextModelItemSemanticEditPolicy() {
		super(CIM3ElementTypes.ContextModel_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CIM3ElementTypes.Congnitive_2001 == req.getElementType()) {
			return getGEFWrapper(new CongnitiveCreateCommand(req));
		}
		if (CIM3ElementTypes.Identify_2002 == req.getElementType()) {
			return getGEFWrapper(new IdentifyCreateCommand(req));
		}
		if (CIM3ElementTypes.Current_2003 == req.getElementType()) {
			return getGEFWrapper(new CurrentCreateCommand(req));
		}
		if (CIM3ElementTypes.Social_2004 == req.getElementType()) {
			return getGEFWrapper(new SocialCreateCommand(req));
		}
		if (CIM3ElementTypes.Activity_2005 == req.getElementType()) {
			return getGEFWrapper(new ActivityCreateCommand(req));
		}
		if (CIM3ElementTypes.Past_2006 == req.getElementType()) {
			return getGEFWrapper(new PastCreateCommand(req));
		}
		if (CIM3ElementTypes.Refinement_2007 == req.getElementType()) {
			return getGEFWrapper(new RefinementCreateCommand(req));
		}
		if (CIM3ElementTypes.Preference_2008 == req.getElementType()) {
			return getGEFWrapper(new PreferenceCreateCommand(req));
		}
		if (CIM3ElementTypes.Entity_2009 == req.getElementType()) {
			return getGEFWrapper(new EntityCreateCommand(req));
		}
		if (CIM3ElementTypes.Computing_2010 == req.getElementType()) {
			return getGEFWrapper(new ComputingCreateCommand(req));
		}
		if (CIM3ElementTypes.Future_2011 == req.getElementType()) {
			return getGEFWrapper(new FutureCreateCommand(req));
		}
		if (CIM3ElementTypes.Relative_2012 == req.getElementType()) {
			return getGEFWrapper(new RelativeCreateCommand(req));
		}
		if (CIM3ElementTypes.ContextSource_2013 == req.getElementType()) {
			return getGEFWrapper(new ContextSourceCreateCommand(req));
		}
		if (CIM3ElementTypes.Focus_2014 == req.getElementType()) {
			return getGEFWrapper(new FocusCreateCommand(req));
		}
		if (CIM3ElementTypes.Fixed_2015 == req.getElementType()) {
			return getGEFWrapper(new FixedCreateCommand(req));
		}
		if (CIM3ElementTypes.Composite_2016 == req.getElementType()) {
			return getGEFWrapper(new CompositeCreateCommand(req));
		}
		if (CIM3ElementTypes.Location_2017 == req.getElementType()) {
			return getGEFWrapper(new LocationCreateCommand(req));
		}
		if (CIM3ElementTypes.User_2018 == req.getElementType()) {
			return getGEFWrapper(new UserCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
