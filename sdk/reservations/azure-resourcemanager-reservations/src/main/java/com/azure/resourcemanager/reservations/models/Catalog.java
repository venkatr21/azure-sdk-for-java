// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.models;

import com.azure.resourcemanager.reservations.fluent.models.CatalogInner;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of Catalog.
 */
public interface Catalog {
    /**
     * Gets the resourceType property: The type of resource the sku applies to.
     * 
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * Gets the name property: The name of sku.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the billingPlans property: The billing plan options available for this sku.
     * 
     * @return the billingPlans value.
     */
    Map<String, List<ReservationBillingPlan>> billingPlans();

    /**
     * Gets the terms property: Available reservation terms for this resource.
     * 
     * @return the terms value.
     */
    List<ReservationTerm> terms();

    /**
     * Gets the locations property: The locations property.
     * 
     * @return the locations value.
     */
    List<String> locations();

    /**
     * Gets the skuProperties property: The skuProperties property.
     * 
     * @return the skuProperties value.
     */
    List<SkuProperty> skuProperties();

    /**
     * Gets the msrp property: Pricing information about the sku.
     * 
     * @return the msrp value.
     */
    CatalogMsrp msrp();

    /**
     * Gets the restrictions property: The restrictions property.
     * 
     * @return the restrictions value.
     */
    List<SkuRestriction> restrictions();

    /**
     * Gets the tier property: The tier of this sku.
     * 
     * @return the tier value.
     */
    String tier();

    /**
     * Gets the size property: The size of this sku.
     * 
     * @return the size value.
     */
    String size();

    /**
     * Gets the capabilities property: The capabilities property.
     * 
     * @return the capabilities value.
     */
    List<SkuCapability> capabilities();

    /**
     * Gets the inner com.azure.resourcemanager.reservations.fluent.models.CatalogInner object.
     * 
     * @return the inner object.
     */
    CatalogInner innerModel();
}
