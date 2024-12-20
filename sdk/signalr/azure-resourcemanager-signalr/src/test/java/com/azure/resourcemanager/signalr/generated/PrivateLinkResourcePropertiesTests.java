// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.signalr.fluent.models.PrivateLinkResourceProperties;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceProperties;
import com.azure.resourcemanager.signalr.models.ShareablePrivateLinkResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceProperties model = BinaryData.fromString(
            "{\"groupId\":\"vu\",\"requiredMembers\":[\"tcktyhjtqedcgzu\",\"wmmrq\"],\"requiredZoneNames\":[\"rjvpglydzgkrvqee\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"pryu\",\"properties\":{\"description\":\"ytp\",\"groupId\":\"mov\",\"type\":\"fvaawzqa\"}},{\"name\":\"lgzurig\",\"properties\":{\"description\":\"cx\",\"groupId\":\"t\",\"type\":\"okpvzm\"}}]}")
            .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("vu", model.groupId());
        Assertions.assertEquals("tcktyhjtqedcgzu", model.requiredMembers().get(0));
        Assertions.assertEquals("rjvpglydzgkrvqee", model.requiredZoneNames().get(0));
        Assertions.assertEquals("pryu", model.shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("ytp", model.shareablePrivateLinkResourceTypes().get(0).properties().description());
        Assertions.assertEquals("mov", model.shareablePrivateLinkResourceTypes().get(0).properties().groupId());
        Assertions.assertEquals("fvaawzqa", model.shareablePrivateLinkResourceTypes().get(0).properties().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceProperties model = new PrivateLinkResourceProperties().withGroupId("vu")
            .withRequiredMembers(Arrays.asList("tcktyhjtqedcgzu", "wmmrq"))
            .withRequiredZoneNames(Arrays.asList("rjvpglydzgkrvqee"))
            .withShareablePrivateLinkResourceTypes(Arrays.asList(
                new ShareablePrivateLinkResourceType().withName("pryu")
                    .withProperties(new ShareablePrivateLinkResourceProperties().withDescription("ytp")
                        .withGroupId("mov")
                        .withType("fvaawzqa")),
                new ShareablePrivateLinkResourceType().withName("lgzurig")
                    .withProperties(new ShareablePrivateLinkResourceProperties().withDescription("cx")
                        .withGroupId("t")
                        .withType("okpvzm"))));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("vu", model.groupId());
        Assertions.assertEquals("tcktyhjtqedcgzu", model.requiredMembers().get(0));
        Assertions.assertEquals("rjvpglydzgkrvqee", model.requiredZoneNames().get(0));
        Assertions.assertEquals("pryu", model.shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("ytp", model.shareablePrivateLinkResourceTypes().get(0).properties().description());
        Assertions.assertEquals("mov", model.shareablePrivateLinkResourceTypes().get(0).properties().groupId());
        Assertions.assertEquals("fvaawzqa", model.shareablePrivateLinkResourceTypes().get(0).properties().type());
    }
}
