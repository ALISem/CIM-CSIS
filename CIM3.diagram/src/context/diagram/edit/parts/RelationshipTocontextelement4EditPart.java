package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.RelationshipTocontextelement4ItemSemanticEditPolicy;

/**
 * @generated
 */
public class RelationshipTocontextelement4EditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4021;

	/**
	* @generated
	*/
	public RelationshipTocontextelement4EditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new RelationshipTocontextelement4ItemSemanticEditPolicy());
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
