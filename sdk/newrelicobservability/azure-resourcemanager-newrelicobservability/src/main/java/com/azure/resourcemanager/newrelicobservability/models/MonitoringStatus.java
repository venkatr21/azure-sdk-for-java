// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Flag specifying if the resource monitoring is enabled or disabled. */
public final class MonitoringStatus extends ExpandableStringEnum<MonitoringStatus> {
    /** Static value Enabled for MonitoringStatus. */
    public static final MonitoringStatus ENABLED = fromString("Enabled");

    /** Static value Disabled for MonitoringStatus. */
    public static final MonitoringStatus DISABLED = fromString("Disabled");

    /**
     * Creates a new instance of MonitoringStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MonitoringStatus() {
    }

    /**
     * Creates or finds a MonitoringStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MonitoringStatus.
     */
    @JsonCreator
    public static MonitoringStatus fromString(String name) {
        return fromString(name, MonitoringStatus.class);
    }

    /**
     * Gets known MonitoringStatus values.
     *
     * @return known MonitoringStatus values.
     */
    public static Collection<MonitoringStatus> values() {
        return values(MonitoringStatus.class);
    }
}