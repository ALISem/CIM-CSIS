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

import context.diagram.edit.policies.LocationItemSemanticEditPolicy;
import context.diagram.part.CIM3VisualIDRegistry;

/**
 * @generated
 */
public class LocationEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2017;

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
	public LocationEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new LocationItemSemanticEditPolicy());
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
		return primaryShape = new LocationFigure();
	}

	/**
	* @generated
	*/
	public LocationFigure getPrimaryShape() {
		return (LocationFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LocationNameEditPart) {
			((LocationNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureLocationNameFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LocationNameEditPart) {
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
		return getChildBySemanticHint(CIM3VisualIDRegistry.getType(LocationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class LocationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationIsAbstractFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationIsMonitorableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationIsVerifiableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationIsFactualFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationDescriptionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationFormalSpecificationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureLocationPropertyFigure;

		/**
		 * @generated
		 */
		public LocationFigure() {

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

			fFigureLocationNameFigure = new WrappingLabel();

			fFigureLocationNameFigure.setText("<...>");

			this.add(fFigureLocationNameFigure);

			fFigureLocationIsAbstractFigure = new WrappingLabel();

			fFigureLocationIsAbstractFigure.setText("<...>");

			this.add(fFigureLocationIsAbstractFigure);

			fFigureLocationIsMonitorableFigure = new WrappingLabel();

			fFigureLocationIsMonitorableFigure.setText("<...>");

			this.add(fFigureLocationIsMonitorableFigure);

			fFigureLocationIsVerifiableFigure = new WrappingLabel();

			fFigureLocationIsVerifiableFigure.setText("<...>");

			this.add(fFigureLocationIsVerifiableFigure);

			fFigureLocationIsFactualFigure = new WrappingLabel();

			fFigureLocationIsFactualFigure.setText("<...>");

			this.add(fFigureLocationIsFactualFigure);

			fFigureLocationDescriptionFigure = new WrappingLabel();

			fFigureLocationDescriptionFigure.setText("<...>");

			this.add(fFigureLocationDescriptionFigure);

			fFigureLocationFormalSpecificationFigure = new WrappingLabel();

			fFigureLocationFormalSpecificationFigure.setText("<...>");

			this.add(fFigureLocationFormalSpecificationFigure);

			fFigureLocationPropertyFigure = new WrappingLabel();

			fFigureLocationPropertyFigure.setText("<...>");

			this.add(fFigureLocationPropertyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationNameFigure() {
			return fFigureLocationNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationIsAbstractFigure() {
			return fFigureLocationIsAbstractFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationIsMonitorableFigure() {
			return fFigureLocationIsMonitorableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationIsVerifiableFigure() {
			return fFigureLocationIsVerifiableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationIsFactualFigure() {
			return fFigureLocationIsFactualFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationDescriptionFigure() {
			return fFigureLocationDescriptionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationFormalSpecificationFigure() {
			return fFigureLocationFormalSpecificationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureLocationPropertyFigure() {
			return fFigureLocationPropertyFigure;
		}

	}

}
