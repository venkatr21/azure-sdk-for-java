// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.reservations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.reservations.models.ReservationSplitProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ReservationSplitPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationSplitProperties model
            = BinaryData.fromString("{\"splitDestinations\":[\"mijcmmxdcufufs\"],\"splitSource\":\"ymzidn\"}")
                .toObject(ReservationSplitProperties.class);
        Assertions.assertEquals("mijcmmxdcufufs", model.splitDestinations().get(0));
        Assertions.assertEquals("ymzidn", model.splitSource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationSplitProperties model
            = new ReservationSplitProperties().withSplitDestinations(Arrays.asList("mijcmmxdcufufs"))
                .withSplitSource("ymzidn");
        model = BinaryData.fromObject(model).toObject(ReservationSplitProperties.class);
        Assertions.assertEquals("mijcmmxdcufufs", model.splitDestinations().get(0));
        Assertions.assertEquals("ymzidn", model.splitSource());
    }
}
