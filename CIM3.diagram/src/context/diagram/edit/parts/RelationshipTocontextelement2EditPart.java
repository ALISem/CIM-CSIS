package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.RelationshipTocontextelement2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class RelationshipTocontextelement2EditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4019;

	/**
	* @generated
	*/
	public RelationshipTocontextelement2EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RelationshipTocontextelement2ItemSemanticEditPolicy());
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
		return new CausalFigure();
	}

	/**
	* @generated
	*/
	public CausalFigure getPrimaryShape() {
		return (CausalFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CausalFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCausalNameFigure;

		/**
		 * @generated
		 */
		public CausalFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCausalNameFigure = new WrappingLabel();

			fFigureCausalNameFigure.setText("<...>");

			this.add(fFigureCausalNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCausalNameFigure() {
			return fFigureCausalNameFigure;
		}

	}

}
