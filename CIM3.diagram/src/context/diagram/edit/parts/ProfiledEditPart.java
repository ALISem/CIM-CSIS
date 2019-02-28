package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.ProfiledItemSemanticEditPolicy;

/**
 * @generated
 */
public class ProfiledEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4005;

	/**
	* @generated
	*/
	public ProfiledEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ProfiledItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProfiledNameEditPart) {
			((ProfiledNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureProfiledNameFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProfiledNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ProfiledFigure();
	}

	/**
	* @generated
	*/
	public ProfiledFigure getPrimaryShape() {
		return (ProfiledFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ProfiledFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureProfiledNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureProfiledUpdateFrequencyFigure;

		/**
		 * @generated
		 */
		public ProfiledFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureProfiledNameFigure = new WrappingLabel();

			fFigureProfiledNameFigure.setText("<...>");

			this.add(fFigureProfiledNameFigure);

			fFigureProfiledUpdateFrequencyFigure = new WrappingLabel();

			fFigureProfiledUpdateFrequencyFigure.setText("<...>");

			this.add(fFigureProfiledUpdateFrequencyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProfiledNameFigure() {
			return fFigureProfiledNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureProfiledUpdateFrequencyFigure() {
			return fFigureProfiledUpdateFrequencyFigure;
		}

	}

}
