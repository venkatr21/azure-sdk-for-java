// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.fluent.models.EmergingIssuesGetResultInner;
import com.azure.resourcemanager.resourcehealth.models.EmergingIssueListResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EmergingIssueListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EmergingIssueListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"refreshTimestamp\":\"2021-05-16T16:57:57Z\",\"statusBanners\":[],\"statusActiveEvents\":[]},\"id\":\"mwsrcrgvxpvgo\",\"name\":\"zlfmisgwbnbbeld\",\"type\":\"wkz\"},{\"properties\":{\"refreshTimestamp\":\"2021-02-02T16:45:23Z\",\"statusBanners\":[],\"statusActiveEvents\":[]},\"id\":\"qhakauhashsf\",\"name\":\"xosow\",\"type\":\"xcug\"},{\"properties\":{\"refreshTimestamp\":\"2020-12-22T21:46:37Z\",\"statusBanners\":[],\"statusActiveEvents\":[]},\"id\":\"j\",\"name\":\"bwpucwwfvovbv\",\"type\":\"euecivyhzceuoj\"}],\"nextLink\":\"rw\"}")
                .toObject(EmergingIssueListResult.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-16T16:57:57Z"), model.value().get(0).refreshTimestamp());
        Assertions.assertEquals("rw", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EmergingIssueListResult model =
            new EmergingIssueListResult()
                .withValue(
                    Arrays
                        .asList(
                            new EmergingIssuesGetResultInner()
                                .withRefreshTimestamp(OffsetDateTime.parse("2021-05-16T16:57:57Z"))
                                .withStatusBanners(Arrays.asList())
                                .withStatusActiveEvents(Arrays.asList()),
                            new EmergingIssuesGetResultInner()
                                .withRefreshTimestamp(OffsetDateTime.parse("2021-02-02T16:45:23Z"))
                                .withStatusBanners(Arrays.asList())
                                .withStatusActiveEvents(Arrays.asList()),
                            new EmergingIssuesGetResultInner()
                                .withRefreshTimestamp(OffsetDateTime.parse("2020-12-22T21:46:37Z"))
                                .withStatusBanners(Arrays.asList())
                                .withStatusActiveEvents(Arrays.asList())))
                .withNextLink("rw");
        model = BinaryData.fromObject(model).toObject(EmergingIssueListResult.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-16T16:57:57Z"), model.value().get(0).refreshTimestamp());
        Assertions.assertEquals("rw", model.nextLink());
    }
}