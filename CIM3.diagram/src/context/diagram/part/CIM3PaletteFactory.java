
package context.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class CIM3PaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createContext1Group());
	}

	/**
	* Creates "context" palette tool group
	* @generated
	*/
	private PaletteContainer createContext1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Context1Group_title);
		paletteContainer.setId("createContext1Group"); //$NON-NLS-1$
		paletteContainer.add(createCompositeContext1CreationTool());
		paletteContainer.add(createRefinement2CreationTool());
		paletteContainer.add(createRelationship3CreationTool());
		paletteContainer.add(createFocus4CreationTool());
		paletteContainer.add(createRelevance5CreationTool());
		paletteContainer.add(createEntity6CreationTool());
		paletteContainer.add(createCharacterization7CreationTool());
		paletteContainer.add(createContextSource8CreationTool());
		paletteContainer.add(createAcquisition9CreationTool());
		paletteContainer.add(createFixedTimeConstraint10CreationTool());
		paletteContainer.add(createRelativeTimeConstraint11CreationTool());
		paletteContainer.add(createValidity12CreationTool());
		paletteContainer.add(createCongnitive13CreationTool());
		paletteContainer.add(createSocial14CreationTool());
		paletteContainer.add(createLocation15CreationTool());
		paletteContainer.add(createPast16CreationTool());
		paletteContainer.add(createCurrent17CreationTool());
		paletteContainer.add(createFuture18CreationTool());
		paletteContainer.add(createComputing19CreationTool());
		paletteContainer.add(createActivity20CreationTool());
		paletteContainer.add(createUser21CreationTool());
		paletteContainer.add(createIdentify22CreationTool());
		paletteContainer.add(createPreference23CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCompositeContext1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.CompositeContext1CreationTool_title,
				Messages.CompositeContext1CreationTool_desc,
				Collections.singletonList(CIM3ElementTypes.Composite_2016));
		entry.setId("createCompositeContext1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Composite_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRefinement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Refinement2CreationTool_title,
				Messages.Refinement2CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Refinement_2007));
		entry.setId("createRefinement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Refinement_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelationship3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(10);
		types.add(CIM3ElementTypes.ContextElementRefinement_4001);
		types.add(CIM3ElementTypes.RefinementRefiningcontexts_4002);
		types.add(CIM3ElementTypes.Parallel_4003);
		types.add(CIM3ElementTypes.RelationshipTocontextelement_4018);
		types.add(CIM3ElementTypes.Causal_4007);
		types.add(CIM3ElementTypes.RelationshipTocontextelement_4019);
		types.add(CIM3ElementTypes.Support_4013);
		types.add(CIM3ElementTypes.RelationshipTocontextelement_4020);
		types.add(CIM3ElementTypes.Conflict_4016);
		types.add(CIM3ElementTypes.RelationshipTocontextelement_4021);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Relationship3CreationTool_title,
				Messages.Relationship3CreationTool_desc, types);
		entry.setId("createRelationship3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.ContextElementRefinement_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFocus4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Focus4CreationTool_title,
				Messages.Focus4CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Focus_2014));
		entry.setId("createFocus4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Focus_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelevance5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Relevance5CreationTool_title,
				Messages.Relevance5CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Relevance_4015));
		entry.setId("createRelevance5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Relevance_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntity6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Entity6CreationTool_title,
				Messages.Entity6CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Entity_2009));
		entry.setId("createEntity6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Entity_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCharacterization7CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Characterization7CreationTool_title,
				Messages.Characterization7CreationTool_desc,
				Collections.singletonList(CIM3ElementTypes.Characterization_4006));
		entry.setId("createCharacterization7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Characterization_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContextSource8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.ContextSource8CreationTool_title,
				Messages.ContextSource8CreationTool_desc,
				Collections.singletonList(CIM3ElementTypes.ContextSource_2013));
		entry.setId("createContextSource8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.ContextSource_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAcquisition9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(CIM3ElementTypes.Profiled_4005);
		types.add(CIM3ElementTypes.Derived_4010);
		types.add(CIM3ElementTypes.Static_4011);
		types.add(CIM3ElementTypes.Sensed_4012);
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Acquisition9CreationTool_title,
				Messages.Acquisition9CreationTool_desc, types);
		entry.setId("createAcquisition9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Profiled_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFixedTimeConstraint10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.FixedTimeConstraint10CreationTool_title,
				Messages.FixedTimeConstraint10CreationTool_desc,
				Collections.singletonList(CIM3ElementTypes.Fixed_2015));
		entry.setId("createFixedTimeConstraint10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Fixed_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelativeTimeConstraint11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RelativeTimeConstraint11CreationTool_title,
				Messages.RelativeTimeConstraint11CreationTool_desc,
				Collections.singletonList(CIM3ElementTypes.Relative_2012));
		entry.setId("createRelativeTimeConstraint11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Relative_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createValidity12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Validity12CreationTool_title,
				Messages.Validity12CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Validity_4009));
		entry.setId("createValidity12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Validity_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCongnitive13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Congnitive13CreationTool_title,
				Messages.Congnitive13CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Congnitive_2001));
		entry.setId("createCongnitive13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Congnitive_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocial14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Social14CreationTool_title,
				Messages.Social14CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Social_2004));
		entry.setId("createSocial14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Social_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLocation15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Location15CreationTool_title,
				Messages.Location15CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Location_2017));
		entry.setId("createLocation15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Location_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPast16CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Past16CreationTool_title, Messages.Past16CreationTool_desc, null,
				null) {
		};
		entry.setId("createPast16CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCurrent17CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Current17CreationTool_title, Messages.Current17CreationTool_desc, null,
				null) {
		};
		entry.setId("createCurrent17CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFuture18CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CIM3ElementTypes.Past_2006);
		types.add(CIM3ElementTypes.Future_2011);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Future18CreationTool_title,
				Messages.Future18CreationTool_desc, types);
		entry.setId("createFuture18CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Past_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createComputing19CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Computing19CreationTool_title,
				Messages.Computing19CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Current_2003));
		entry.setId("createComputing19CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Current_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActivity20CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Activity20CreationTool_title, Messages.Activity20CreationTool_desc,
				null, null) {
		};
		entry.setId("createActivity20CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createUser21CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.User21CreationTool_title,
				Messages.User21CreationTool_desc, Collections.singletonList(CIM3ElementTypes.Computing_2010));
		entry.setId("createUser21CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Computing_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIdentify22CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CIM3ElementTypes.Identify_2002);
		types.add(CIM3ElementTypes.Activity_2005);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Identify22CreationTool_title,
				Messages.Identify22CreationTool_desc, types);
		entry.setId("createIdentify22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Identify_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPreference23CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(CIM3ElementTypes.Preference_2008);
		types.add(CIM3ElementTypes.User_2018);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Preference23CreationTool_title,
				Messages.Preference23CreationTool_desc, types);
		entry.setId("createPreference23CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(CIM3ElementTypes.getImageDescriptor(CIM3ElementTypes.Preference_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
