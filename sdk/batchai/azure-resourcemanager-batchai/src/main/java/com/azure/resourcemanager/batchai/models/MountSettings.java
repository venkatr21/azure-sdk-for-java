// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** File Server mount Information. */
@Fluent
public final class MountSettings {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(MountSettings.class);

    /*
     * Path where the data disks are mounted on the File Server.
     */
    @JsonProperty(value = "mountPoint")
    private String mountPoint;

    /*
     * Public IP address of the File Server which can be used to SSH to the
     * node from outside of the subnet.
     */
    @JsonProperty(value = "fileServerPublicIP")
    private String fileServerPublicIp;

    /*
     * Internal IP address of the File Server which can be used to access the
     * File Server from within the subnet.
     */
    @JsonProperty(value = "fileServerInternalIP")
    private String fileServerInternalIp;

    /**
     * Get the mountPoint property: Path where the data disks are mounted on the File Server.
     *
     * @return the mountPoint value.
     */
    public String mountPoint() {
        return this.mountPoint;
    }

    /**
     * Set the mountPoint property: Path where the data disks are mounted on the File Server.
     *
     * @param mountPoint the mountPoint value to set.
     * @return the MountSettings object itself.
     */
    public MountSettings withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * Get the fileServerPublicIp property: Public IP address of the File Server which can be used to SSH to the node
     * from outside of the subnet.
     *
     * @return the fileServerPublicIp value.
     */
    public String fileServerPublicIp() {
        return this.fileServerPublicIp;
    }

    /**
     * Set the fileServerPublicIp property: Public IP address of the File Server which can be used to SSH to the node
     * from outside of the subnet.
     *
     * @param fileServerPublicIp the fileServerPublicIp value to set.
     * @return the MountSettings object itself.
     */
    public MountSettings withFileServerPublicIp(String fileServerPublicIp) {
        this.fileServerPublicIp = fileServerPublicIp;
        return this;
    }

    /**
     * Get the fileServerInternalIp property: Internal IP address of the File Server which can be used to access the
     * File Server from within the subnet.
     *
     * @return the fileServerInternalIp value.
     */
    public String fileServerInternalIp() {
        return this.fileServerInternalIp;
    }

    /**
     * Set the fileServerInternalIp property: Internal IP address of the File Server which can be used to access the
     * File Server from within the subnet.
     *
     * @param fileServerInternalIp the fileServerInternalIp value to set.
     * @return the MountSettings object itself.
     */
    public MountSettings withFileServerInternalIp(String fileServerInternalIp) {
        this.fileServerInternalIp = fileServerInternalIp;
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
