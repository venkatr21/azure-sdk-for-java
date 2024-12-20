// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.synapse.models.LanguageExtensionName;
import java.io.IOException;

/**
 * The language extension object.
 */
@Fluent
public final class LanguageExtensionInner implements JsonSerializable<LanguageExtensionInner> {
    /*
     * The language extension name.
     */
    private LanguageExtensionName languageExtensionName;

    /**
     * Creates an instance of LanguageExtensionInner class.
     */
    public LanguageExtensionInner() {
    }

    /**
     * Get the languageExtensionName property: The language extension name.
     * 
     * @return the languageExtensionName value.
     */
    public LanguageExtensionName languageExtensionName() {
        return this.languageExtensionName;
    }

    /**
     * Set the languageExtensionName property: The language extension name.
     * 
     * @param languageExtensionName the languageExtensionName value to set.
     * @return the LanguageExtensionInner object itself.
     */
    public LanguageExtensionInner withLanguageExtensionName(LanguageExtensionName languageExtensionName) {
        this.languageExtensionName = languageExtensionName;
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
        jsonWriter.writeStringField("languageExtensionName",
            this.languageExtensionName == null ? null : this.languageExtensionName.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LanguageExtensionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LanguageExtensionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LanguageExtensionInner.
     */
    public static LanguageExtensionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LanguageExtensionInner deserializedLanguageExtensionInner = new LanguageExtensionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("languageExtensionName".equals(fieldName)) {
                    deserializedLanguageExtensionInner.languageExtensionName
                        = LanguageExtensionName.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLanguageExtensionInner;
        });
    }
}
