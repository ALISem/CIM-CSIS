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
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.FlowLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import context.diagram.edit.policies.ActivityItemSemanticEditPolicy;
import context.diagram.part.CIM3VisualIDRegistry;

/**
 * @generated
 */
public class ActivityEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2005;

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
	public ActivityEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActivityItemSemanticEditPolicy());
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
		return primaryShape = new ActivityFigure();
	}

	/**
	* @generated
	*/
	public ActivityFigure getPrimaryShape() {
		return (ActivityFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPart) {
			((ActivityNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureActivityNameFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPart) {
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
		super.addChildVisual(childEditPart, -1);
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
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
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
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(CIM3VisualIDRegistry.getType(ActivityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ActivityFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityIsAbstractFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityIsMonitorableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityIsVerifiableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityIsFactualFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityDescriptionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityFormalSpecificationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityPropertyFigure;

		/**
		 * @generated
		 */
		public ActivityFigure() {

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

			fFigureActivityNameFigure = new WrappingLabel();

			fFigureActivityNameFigure.setText("<...>");

			this.add(fFigureActivityNameFigure);

			fFigureActivityIsAbstractFigure = new WrappingLabel();

			fFigureActivityIsAbstractFigure.setText("<...>");

			this.add(fFigureActivityIsAbstractFigure);

			fFigureActivityIsMonitorableFigure = new WrappingLabel();

			fFigureActivityIsMonitorableFigure.setText("<...>");

			this.add(fFigureActivityIsMonitorableFigure);

			fFigureActivityIsVerifiableFigure = new WrappingLabel();

			fFigureActivityIsVerifiableFigure.setText("<...>");

			this.add(fFigureActivityIsVerifiableFigure);

			fFigureActivityIsFactualFigure = new WrappingLabel();

			fFigureActivityIsFactualFigure.setText("<...>");

			this.add(fFigureActivityIsFactualFigure);

			fFigureActivityDescriptionFigure = new WrappingLabel();

			fFigureActivityDescriptionFigure.setText("<...>");

			this.add(fFigureActivityDescriptionFigure);

			fFigureActivityFormalSpecificationFigure = new WrappingLabel();

			fFigureActivityFormalSpecificationFigure.setText("<...>");

			this.add(fFigureActivityFormalSpecificationFigure);

			fFigureActivityPropertyFigure = new WrappingLabel();

			fFigureActivityPropertyFigure.setText("<...>");

			this.add(fFigureActivityPropertyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityNameFigure() {
			return fFigureActivityNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityIsAbstractFigure() {
			return fFigureActivityIsAbstractFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityIsMonitorableFigure() {
			return fFigureActivityIsMonitorableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityIsVerifiableFigure() {
			return fFigureActivityIsVerifiableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityIsFactualFigure() {
			return fFigureActivityIsFactualFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityDescriptionFigure() {
			return fFigureActivityDescriptionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityFormalSpecificationFigure() {
			return fFigureActivityFormalSpecificationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityPropertyFigure() {
			return fFigureActivityPropertyFigure;
		}

	}

}