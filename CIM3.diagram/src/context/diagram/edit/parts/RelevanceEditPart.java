package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.RelevanceItemSemanticEditPolicy;

/**
 * @generated
 */
public class RelevanceEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4015;

	/**
	* @generated
	*/
	public RelevanceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RelevanceItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RelevanceArgumentEditPart) {
			((RelevanceArgumentEditPart) childEditPart).setLabel(getPrimaryShape().getFigureRelevanceArgumentFigure());
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
		if (childEditPart instanceof RelevanceArgumentEditPart) {
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
		return new RelevanceFigure();
	}

	/**
	* @generated
	*/
	public RelevanceFigure getPrimaryShape() {
		return (RelevanceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RelevanceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRelevanceLevelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRelevanceArgumentFigure;

		/**
		 * @generated
		 */
		public RelevanceFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRelevanceLevelFigure = new WrappingLabel();

			fFigureRelevanceLevelFigure.setText("<...>");

			this.add(fFigureRelevanceLevelFigure);

			fFigureRelevanceArgumentFigure = new WrappingLabel();

			fFigureRelevanceArgumentFigure.setText("<...>");

			this.add(fFigureRelevanceArgumentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelevanceLevelFigure() {
			return fFigureRelevanceLevelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelevanceArgumentFigure() {
			return fFigureRelevanceArgumentFigure;
		}

	}

}
