// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceIdentityType;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceModelWithAllowedPropertySetIdentity;
import org.junit.jupiter.api.Assertions;

public final class ResourceModelWithAllowedPropertySetIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceModelWithAllowedPropertySetIdentity model =
            BinaryData
                .fromString("{\"principalId\":\"rokft\",\"tenantId\":\"olniwpwcukjf\",\"type\":\"SystemAssigned\"}")
                .toObject(ResourceModelWithAllowedPropertySetIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceModelWithAllowedPropertySetIdentity model =
            new ResourceModelWithAllowedPropertySetIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED);
        model = BinaryData.fromObject(model).toObject(ResourceModelWithAllowedPropertySetIdentity.class);
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.type());
    }
}