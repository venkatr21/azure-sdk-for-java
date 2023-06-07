// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkcloud.fluent.models.CloudServicesNetworkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CloudServicesNetworkList represents a list of cloud services networks. */
@Fluent
public final class CloudServicesNetworkList {
    /*
     * The link used to get the next page of operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * The list of cloud services networks.
     */
    @JsonProperty(value = "value")
    private List<CloudServicesNetworkInner> value;

    /** Creates an instance of CloudServicesNetworkList class. */
    public CloudServicesNetworkList() {
    }

    /**
     * Get the nextLink property: The link used to get the next page of operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the CloudServicesNetworkList object itself.
     */
    public CloudServicesNetworkList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: The list of cloud services networks.
     *
     * @return the value value.
     */
    public List<CloudServicesNetworkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of cloud services networks.
     *
     * @param value the value value to set.
     * @return the CloudServicesNetworkList object itself.
     */
    public CloudServicesNetworkList withValue(List<CloudServicesNetworkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}