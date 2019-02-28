package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.StaticItemSemanticEditPolicy;

/**
 * @generated
 */
public class StaticEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4011;

	/**
	* @generated
	*/
	public StaticEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StaticItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StaticNameEditPart) {
			((StaticNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureStaticNameFigure());
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
		if (childEditPart instanceof StaticNameEditPart) {
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
		return new StaticFigure();
	}

	/**
	* @generated
	*/
	public StaticFigure getPrimaryShape() {
		return (StaticFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class StaticFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureStaticNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureStaticUpdateFrequencyFigure;

		/**
		 * @generated
		 */
		public StaticFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureStaticNameFigure = new WrappingLabel();

			fFigureStaticNameFigure.setText("<...>");

			this.add(fFigureStaticNameFigure);

			fFigureStaticUpdateFrequencyFigure = new WrappingLabel();

			fFigureStaticUpdateFrequencyFigure.setText("<...>");

			this.add(fFigureStaticUpdateFrequencyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStaticNameFigure() {
			return fFigureStaticNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureStaticUpdateFrequencyFigure() {
			return fFigureStaticUpdateFrequencyFigure;
		}

	}

}
