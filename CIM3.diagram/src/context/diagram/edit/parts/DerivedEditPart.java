package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.DerivedItemSemanticEditPolicy;

/**
 * @generated
 */
public class DerivedEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4010;

	/**
	* @generated
	*/
	public DerivedEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DerivedItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DerivedNameEditPart) {
			((DerivedNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureDerivedNameFigure());
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
		if (childEditPart instanceof DerivedNameEditPart) {
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
		return new DerivedFigure();
	}

	/**
	* @generated
	*/
	public DerivedFigure getPrimaryShape() {
		return (DerivedFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DerivedFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedUpdateFrequencyFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivedExpressionFigure;

		/**
		 * @generated
		 */
		public DerivedFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDerivedNameFigure = new WrappingLabel();

			fFigureDerivedNameFigure.setText("<...>");

			this.add(fFigureDerivedNameFigure);

			fFigureDerivedUpdateFrequencyFigure = new WrappingLabel();

			fFigureDerivedUpdateFrequencyFigure.setText("<...>");

			this.add(fFigureDerivedUpdateFrequencyFigure);

			fFigureDerivedExpressionFigure = new WrappingLabel();

			fFigureDerivedExpressionFigure.setText("<...>");

			this.add(fFigureDerivedExpressionFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedNameFigure() {
			return fFigureDerivedNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedUpdateFrequencyFigure() {
			return fFigureDerivedUpdateFrequencyFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivedExpressionFigure() {
			return fFigureDerivedExpressionFigure;
		}

	}

}
