// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * StorageApplianceEnableRemoteVendorManagementParameters represents the body of the request to enable remote vendor
 * management of a storage appliance.
 */
@Fluent
public final class StorageApplianceEnableRemoteVendorManagementParameters {
    /*
     * Field Deprecated. This field is not used and will be rejected if provided. The list of IPv4 subnets (in CIDR
     * format), IPv6 subnets (in CIDR format), or hostnames that the storage appliance needs accessible in order to
     * turn on the remote vendor management.
     */
    @JsonProperty(value = "supportEndpoints")
    private List<String> supportEndpoints;

    /** Creates an instance of StorageApplianceEnableRemoteVendorManagementParameters class. */
    public StorageApplianceEnableRemoteVendorManagementParameters() {
    }

    /**
     * Get the supportEndpoints property: Field Deprecated. This field is not used and will be rejected if provided. The
     * list of IPv4 subnets (in CIDR format), IPv6 subnets (in CIDR format), or hostnames that the storage appliance
     * needs accessible in order to turn on the remote vendor management.
     *
     * @return the supportEndpoints value.
     */
    public List<String> supportEndpoints() {
        return this.supportEndpoints;
    }

    /**
     * Set the supportEndpoints property: Field Deprecated. This field is not used and will be rejected if provided. The
     * list of IPv4 subnets (in CIDR format), IPv6 subnets (in CIDR format), or hostnames that the storage appliance
     * needs accessible in order to turn on the remote vendor management.
     *
     * @param supportEndpoints the supportEndpoints value to set.
     * @return the StorageApplianceEnableRemoteVendorManagementParameters object itself.
     */
    public StorageApplianceEnableRemoteVendorManagementParameters withSupportEndpoints(List<String> supportEndpoints) {
        this.supportEndpoints = supportEndpoints;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}