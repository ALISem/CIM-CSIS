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

import context.diagram.edit.policies.PreferenceItemSemanticEditPolicy;
import context.diagram.part.CIM3VisualIDRegistry;

/**
 * @generated
 */
public class PreferenceEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2008;

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
	public PreferenceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PreferenceItemSemanticEditPolicy());
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
		return primaryShape = new PreferenceFigure();
	}

	/**
	* @generated
	*/
	public PreferenceFigure getPrimaryShape() {
		return (PreferenceFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PreferenceNameEditPart) {
			((PreferenceNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigurePreferenceNameFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PreferenceNameEditPart) {
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
		return getChildBySemanticHint(CIM3VisualIDRegistry.getType(PreferenceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PreferenceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferenceNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferenceIsAbstractFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferenceIsMonitorableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferenceIsVerifiableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferenceIsFactualFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferenceDescriptionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferenceFormalSpecificationFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePreferencePropertyFigure;

		/**
		 * @generated
		 */
		public PreferenceFigure() {

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

			fFigurePreferenceNameFigure = new WrappingLabel();

			fFigurePreferenceNameFigure.setText("<...>");

			this.add(fFigurePreferenceNameFigure);

			fFigurePreferenceIsAbstractFigure = new WrappingLabel();

			fFigurePreferenceIsAbstractFigure.setText("<...>");

			this.add(fFigurePreferenceIsAbstractFigure);

			fFigurePreferenceIsMonitorableFigure = new WrappingLabel();

			fFigurePreferenceIsMonitorableFigure.setText("<...>");

			this.add(fFigurePreferenceIsMonitorableFigure);

			fFigurePreferenceIsVerifiableFigure = new WrappingLabel();

			fFigurePreferenceIsVerifiableFigure.setText("<...>");

			this.add(fFigurePreferenceIsVerifiableFigure);

			fFigurePreferenceIsFactualFigure = new WrappingLabel();

			fFigurePreferenceIsFactualFigure.setText("<...>");

			this.add(fFigurePreferenceIsFactualFigure);

			fFigurePreferenceDescriptionFigure = new WrappingLabel();

			fFigurePreferenceDescriptionFigure.setText("<...>");

			this.add(fFigurePreferenceDescriptionFigure);

			fFigurePreferenceFormalSpecificationFigure = new WrappingLabel();

			fFigurePreferenceFormalSpecificationFigure.setText("<...>");

			this.add(fFigurePreferenceFormalSpecificationFigure);

			fFigurePreferencePropertyFigure = new WrappingLabel();

			fFigurePreferencePropertyFigure.setText("<...>");

			this.add(fFigurePreferencePropertyFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferenceNameFigure() {
			return fFigurePreferenceNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferenceIsAbstractFigure() {
			return fFigurePreferenceIsAbstractFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferenceIsMonitorableFigure() {
			return fFigurePreferenceIsMonitorableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferenceIsVerifiableFigure() {
			return fFigurePreferenceIsVerifiableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferenceIsFactualFigure() {
			return fFigurePreferenceIsFactualFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferenceDescriptionFigure() {
			return fFigurePreferenceDescriptionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferenceFormalSpecificationFigure() {
			return fFigurePreferenceFormalSpecificationFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePreferencePropertyFigure() {
			return fFigurePreferencePropertyFigure;
		}

	}

}
