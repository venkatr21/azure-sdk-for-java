// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.PublisherInfo;
import org.junit.jupiter.api.Assertions;

public final class PublisherInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PublisherInfo model =
            BinaryData
                .fromString(
                    "{\"publisherName\":\"yrpfoobrlttymsj\",\"productName\":\"gqdnfwqzd\",\"binaryName\":\"tilaxh\",\"version\":\"hqlyvijo\"}")
                .toObject(PublisherInfo.class);
        Assertions.assertEquals("yrpfoobrlttymsj", model.publisherName());
        Assertions.assertEquals("gqdnfwqzd", model.productName());
        Assertions.assertEquals("tilaxh", model.binaryName());
        Assertions.assertEquals("hqlyvijo", model.version());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PublisherInfo model =
            new PublisherInfo()
                .withPublisherName("yrpfoobrlttymsj")
                .withProductName("gqdnfwqzd")
                .withBinaryName("tilaxh")
                .withVersion("hqlyvijo");
        model = BinaryData.fromObject(model).toObject(PublisherInfo.class);
        Assertions.assertEquals("yrpfoobrlttymsj", model.publisherName());
        Assertions.assertEquals("gqdnfwqzd", model.productName());
        Assertions.assertEquals("tilaxh", model.binaryName());
        Assertions.assertEquals("hqlyvijo", model.version());
    }
}