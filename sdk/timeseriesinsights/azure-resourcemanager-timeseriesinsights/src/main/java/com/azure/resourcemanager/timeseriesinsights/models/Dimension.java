// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Dimension of blobs, possibly be blob type or access tier.
 */
@Fluent
public final class Dimension implements JsonSerializable<Dimension> {
    /*
     * Display name of dimension.
     */
    private String name;

    /*
     * Display name of dimension.
     */
    private String displayName;

    /**
     * Creates an instance of Dimension class.
     */
    public Dimension() {
    }

    /**
     * Get the name property: Display name of dimension.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Display name of dimension.
     * 
     * @param name the name value to set.
     * @return the Dimension object itself.
     */
    public Dimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Display name of dimension.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of dimension.
     * 
     * @param displayName the displayName value to set.
     * @return the Dimension object itself.
     */
    public Dimension withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("displayName", this.displayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Dimension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Dimension if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the Dimension.
     */
    public static Dimension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Dimension deserializedDimension = new Dimension();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedDimension.name = reader.getString();
                } else if ("displayName".equals(fieldName)) {
                    deserializedDimension.displayName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDimension;
        });
    }
}
