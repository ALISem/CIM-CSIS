package context.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import context.diagram.edit.policies.UserItemSemanticEditPolicy;

/**
 * @generated
 */
public class UserEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2018;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public UserEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new UserItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {

		FlowLayoutEditPolicy lep = new FlowLayoutEditPolicy() {

			protected Command createAddCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command createMoveChildCommand(EditPart child, EditPart after) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new UserFigure();
	}

	/**
	* @generated
	*/
	public UserFigure getPrimaryShape() {
		return (UserFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public class UserFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserIsAbstractFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserIsMonitorableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserIsVerifiableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserIsFactualFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserDescriptionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserFormalSpecificationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUserPropertyFigure;

		/**
		 * @generated
		 */
		public UserFigure() {

			FlowLayout layoutThis = new FlowLayout();
			layoutThis.setStretchMinorAxis(false);
			layoutThis.setMinorAlignment(FlowLayout.ALIGN_LEFTTOP);

			layoutThis.setMajorAlignment(FlowLayout.ALIGN_LEFTTOP);
			layoutThis.setMajorSpacing(5);
			layoutThis.setMinorSpacing(5);
			layoutThis.setHorizontal(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureUserNameFigure = new WrappingLabel();

			fFigureUserNameFigure.setText("<...>");

			this.add(fFigureUserNameFigure);

			fFigureUserIsAbstractFigure = new WrappingLabel();

			fFigureUserIsAbstractFigure.setText("<...>");

			this.add(fFigureUserIsAbstractFigure);

			fFigureUserIsMonitorableFigure = new WrappingLabel();

			fFigureUserIsMonitorableFigure.setText("<...>");

			this.add(fFigureUserIsMonitorableFigure);

			fFigureUserIsVerifiableFigure = new WrappingLabel();

			fFigureUserIsVerifiableFigure.setText("<...>");

			this.add(fFigureUserIsVerifiableFigure);

			fFigureUserIsFactualFigure = new WrappingLabel();

			fFigureUserIsFactualFigure.setText("<...>");

			this.add(fFigureUserIsFactualFigure);

			fFigureUserDescriptionFigure = new WrappingLabel();

			fFigureUserDescriptionFigure.setText("<...>");

			this.add(fFigureUserDescriptionFigure);

			fFigureUserFormalSpecificationFigure = new WrappingLabel();

			fFigureUserFormalSpecificationFigure.setText("<...>");

			this.add(fFigureUserFormalSpecificationFigure);

			fFigureUserPropertyFigure = new WrappingLabel();

			fFigureUserPropertyFigure.setText("<...>");

			this.add(fFigureUserPropertyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserNameFigure() {
			return fFigureUserNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserIsAbstractFigure() {
			return fFigureUserIsAbstractFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserIsMonitorableFigure() {
			return fFigureUserIsMonitorableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserIsVerifiableFigure() {
			return fFigureUserIsVerifiableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserIsFactualFigure() {
			return fFigureUserIsFactualFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserDescriptionFigure() {
			return fFigureUserDescriptionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserFormalSpecificationFigure() {
			return fFigureUserFormalSpecificationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUserPropertyFigure() {
			return fFigureUserPropertyFigure;
		}

	}

}
