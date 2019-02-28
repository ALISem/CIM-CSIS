package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.RelationshipTocontextelement3ItemSemanticEditPolicy;

/**
 * @generated
 */
public class RelationshipTocontextelement3EditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4020;

	/**
	* @generated
	*/
	public RelationshipTocontextelement3EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RelationshipTocontextelement3ItemSemanticEditPolicy());
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
		return new SupportFigure();
	}

	/**
	* @generated
	*/
	public SupportFigure getPrimaryShape() {
		return (SupportFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SupportFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSupportNameFigure;

		/**
		 * @generated
		 */
		public SupportFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSupportNameFigure = new WrappingLabel();

			fFigureSupportNameFigure.setText("<...>");

			this.add(fFigureSupportNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSupportNameFigure() {
			return fFigureSupportNameFigure;
		}

	}

}
