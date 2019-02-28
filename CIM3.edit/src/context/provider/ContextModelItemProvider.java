/**
 */
package context.provider;


import context.ContextFactory;
import context.ContextModel;
import context.ContextPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link context.ContextModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContextModel_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContextModel_name_feature", "_UI_ContextModel_type"),
				 ContextPackage.Literals.CONTEXT_MODEL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__REFINEMENTS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__RELATIONSHIPS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__SOURCES);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__ACQUISITIONS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__ENTITIES);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__CHARACTERIZATIONS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__VALIDITY);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__TIMECONSTRAINTS);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__FOCI);
			childrenFeatures.add(ContextPackage.Literals.CONTEXT_MODEL__RELEVANCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ContextModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContextModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContextModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContextModel_type") :
			getString("_UI_ContextModel_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ContextModel.class)) {
			case ContextPackage.CONTEXT_MODEL__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContextPackage.CONTEXT_MODEL__CONTEXTELEMENTS:
			case ContextPackage.CONTEXT_MODEL__REFINEMENTS:
			case ContextPackage.CONTEXT_MODEL__RELATIONSHIPS:
			case ContextPackage.CONTEXT_MODEL__SOURCES:
			case ContextPackage.CONTEXT_MODEL__ACQUISITIONS:
			case ContextPackage.CONTEXT_MODEL__ENTITIES:
			case ContextPackage.CONTEXT_MODEL__CHARACTERIZATIONS:
			case ContextPackage.CONTEXT_MODEL__VALIDITY:
			case ContextPackage.CONTEXT_MODEL__TIMECONSTRAINTS:
			case ContextPackage.CONTEXT_MODEL__FOCI:
			case ContextPackage.CONTEXT_MODEL__RELEVANCE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createContextElement()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createAtomic()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createComposite()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createCongnitive()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createSocial()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createPhysical()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createTemporal()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createPast()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createCurrent()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createFuture()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createComputing()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createIdentify()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CONTEXTELEMENTS,
				 ContextFactory.eINSTANCE.createPreference()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__REFINEMENTS,
				 ContextFactory.eINSTANCE.createRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__RELATIONSHIPS,
				 ContextFactory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__RELATIONSHIPS,
				 ContextFactory.eINSTANCE.createCausal()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__RELATIONSHIPS,
				 ContextFactory.eINSTANCE.createSupport()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__RELATIONSHIPS,
				 ContextFactory.eINSTANCE.createConflict()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__RELATIONSHIPS,
				 ContextFactory.eINSTANCE.createParallel()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__SOURCES,
				 ContextFactory.eINSTANCE.createContextSource()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__ACQUISITIONS,
				 ContextFactory.eINSTANCE.createAcquisition()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__ACQUISITIONS,
				 ContextFactory.eINSTANCE.createStatic()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__ACQUISITIONS,
				 ContextFactory.eINSTANCE.createProfiled()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__ACQUISITIONS,
				 ContextFactory.eINSTANCE.createDerived()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__ACQUISITIONS,
				 ContextFactory.eINSTANCE.createSensed()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__ENTITIES,
				 ContextFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__CHARACTERIZATIONS,
				 ContextFactory.eINSTANCE.createCharacterization()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__VALIDITY,
				 ContextFactory.eINSTANCE.createValidity()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__TIMECONSTRAINTS,
				 ContextFactory.eINSTANCE.createTimeConstraint()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__TIMECONSTRAINTS,
				 ContextFactory.eINSTANCE.createFixed()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__TIMECONSTRAINTS,
				 ContextFactory.eINSTANCE.createRelative()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__FOCI,
				 ContextFactory.eINSTANCE.createFocus()));

		newChildDescriptors.add
			(createChildParameter
				(ContextPackage.Literals.CONTEXT_MODEL__RELEVANCE,
				 ContextFactory.eINSTANCE.createRelevance()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CIM3EditPlugin.INSTANCE;
	}

}
