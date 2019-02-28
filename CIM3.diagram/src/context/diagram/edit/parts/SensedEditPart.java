package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.SensedItemSemanticEditPolicy;

/**
 * @generated
 */
public class SensedEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4012;

	/**
	* @generated
	*/
	public SensedEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new SensedItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof SensedNameEditPart) {
			((SensedNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureSensedNameFigure());
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
		if (childEditPart instanceof SensedNameEditPart) {
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
		return new SensedFigure();
	}

	/**
	* @generated
	*/
	public SensedFigure getPrimaryShape() {
		return (SensedFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SensedFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSensedNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSensedUpdateFrequencyFigure;

		/**
		 * @generated
		 */
		public SensedFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSensedNameFigure = new WrappingLabel();

			fFigureSensedNameFigure.setText("<...>");

			this.add(fFigureSensedNameFigure);

			fFigureSensedUpdateFrequencyFigure = new WrappingLabel();

			fFigureSensedUpdateFrequencyFigure.setText("<...>");

			this.add(fFigureSensedUpdateFrequencyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSensedNameFigure() {
			return fFigureSensedNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSensedUpdateFrequencyFigure() {
			return fFigureSensedUpdateFrequencyFigure;
		}

	}

}
