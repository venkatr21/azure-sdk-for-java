// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservices.models.CrossSubscriptionRestoreSettings;
import com.azure.resourcemanager.recoveryservices.models.CrossSubscriptionRestoreState;
import org.junit.jupiter.api.Assertions;

public final class CrossSubscriptionRestoreSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CrossSubscriptionRestoreSettings model =
            BinaryData
                .fromString("{\"crossSubscriptionRestoreState\":\"Enabled\"}")
                .toObject(CrossSubscriptionRestoreSettings.class);
        Assertions.assertEquals(CrossSubscriptionRestoreState.ENABLED, model.crossSubscriptionRestoreState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CrossSubscriptionRestoreSettings model =
            new CrossSubscriptionRestoreSettings()
                .withCrossSubscriptionRestoreState(CrossSubscriptionRestoreState.ENABLED);
        model = BinaryData.fromObject(model).toObject(CrossSubscriptionRestoreSettings.class);
        Assertions.assertEquals(CrossSubscriptionRestoreState.ENABLED, model.crossSubscriptionRestoreState());
    }
}