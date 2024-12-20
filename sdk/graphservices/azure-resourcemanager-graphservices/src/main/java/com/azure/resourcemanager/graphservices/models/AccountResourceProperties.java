// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Property bag from billing account. */
@Fluent
public final class AccountResourceProperties {
    /*
     * Provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Customer owned application ID
     */
    @JsonProperty(value = "appId", required = true)
    private String appId;

    /*
     * Billing Plan Id
     */
    @JsonProperty(value = "billingPlanId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingPlanId;

    /** Creates an instance of AccountResourceProperties class. */
    public AccountResourceProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the appId property: Customer owned application ID.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: Customer owned application ID.
     *
     * @param appId the appId value to set.
     * @return the AccountResourceProperties object itself.
     */
    public AccountResourceProperties withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the billingPlanId property: Billing Plan Id.
     *
     * @return the billingPlanId value.
     */
    public String billingPlanId() {
        return this.billingPlanId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property appId in model AccountResourceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AccountResourceProperties.class);
}
