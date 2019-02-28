package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.ConflictItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConflictEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4016;

	/**
	* @generated
	*/
	public ConflictEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ConflictItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConflictNameEditPart) {
			((ConflictNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureConflictNameFigure());
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
		if (childEditPart instanceof ConflictNameEditPart) {
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
		return new ConflictFigure();
	}

	/**
	* @generated
	*/
	public ConflictFigure getPrimaryShape() {
		return (ConflictFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ConflictFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConflictNameFigure;

		/**
		 * @generated
		 */
		public ConflictFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConflictNameFigure = new WrappingLabel();

			fFigureConflictNameFigure.setText("<...>");

			this.add(fFigureConflictNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConflictNameFigure() {
			return fFigureConflictNameFigure;
		}

	}

}
