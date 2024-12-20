// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.BlobDataSourceProperties;
import com.azure.resourcemanager.streamanalytics.models.StorageAccount;
import java.io.IOException;
import java.util.List;

/**
 * The properties that are associated with a blob input containing stream data.
 */
@Fluent
public final class BlobStreamInputDataSourceProperties extends BlobDataSourceProperties {
    /*
     * The partition count of the blob input data source. Range 1 - 1024.
     */
    private Integer sourcePartitionCount;

    /**
     * Creates an instance of BlobStreamInputDataSourceProperties class.
     */
    public BlobStreamInputDataSourceProperties() {
    }

    /**
     * Get the sourcePartitionCount property: The partition count of the blob input data source. Range 1 - 1024.
     * 
     * @return the sourcePartitionCount value.
     */
    public Integer sourcePartitionCount() {
        return this.sourcePartitionCount;
    }

    /**
     * Set the sourcePartitionCount property: The partition count of the blob input data source. Range 1 - 1024.
     * 
     * @param sourcePartitionCount the sourcePartitionCount value to set.
     * @return the BlobStreamInputDataSourceProperties object itself.
     */
    public BlobStreamInputDataSourceProperties withSourcePartitionCount(Integer sourcePartitionCount) {
        this.sourcePartitionCount = sourcePartitionCount;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobStreamInputDataSourceProperties withStorageAccounts(List<StorageAccount> storageAccounts) {
        super.withStorageAccounts(storageAccounts);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobStreamInputDataSourceProperties withContainer(String container) {
        super.withContainer(container);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobStreamInputDataSourceProperties withPathPattern(String pathPattern) {
        super.withPathPattern(pathPattern);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobStreamInputDataSourceProperties withDateFormat(String dateFormat) {
        super.withDateFormat(dateFormat);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobStreamInputDataSourceProperties withTimeFormat(String timeFormat) {
        super.withTimeFormat(timeFormat);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlobStreamInputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        super.withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("storageAccounts", storageAccounts(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("container", container());
        jsonWriter.writeStringField("pathPattern", pathPattern());
        jsonWriter.writeStringField("dateFormat", dateFormat());
        jsonWriter.writeStringField("timeFormat", timeFormat());
        jsonWriter.writeStringField("authenticationMode",
            authenticationMode() == null ? null : authenticationMode().toString());
        jsonWriter.writeNumberField("sourcePartitionCount", this.sourcePartitionCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobStreamInputDataSourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobStreamInputDataSourceProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the BlobStreamInputDataSourceProperties.
     */
    public static BlobStreamInputDataSourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobStreamInputDataSourceProperties deserializedBlobStreamInputDataSourceProperties
                = new BlobStreamInputDataSourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("storageAccounts".equals(fieldName)) {
                    List<StorageAccount> storageAccounts
                        = reader.readArray(reader1 -> StorageAccount.fromJson(reader1));
                    deserializedBlobStreamInputDataSourceProperties.withStorageAccounts(storageAccounts);
                } else if ("container".equals(fieldName)) {
                    deserializedBlobStreamInputDataSourceProperties.withContainer(reader.getString());
                } else if ("pathPattern".equals(fieldName)) {
                    deserializedBlobStreamInputDataSourceProperties.withPathPattern(reader.getString());
                } else if ("dateFormat".equals(fieldName)) {
                    deserializedBlobStreamInputDataSourceProperties.withDateFormat(reader.getString());
                } else if ("timeFormat".equals(fieldName)) {
                    deserializedBlobStreamInputDataSourceProperties.withTimeFormat(reader.getString());
                } else if ("authenticationMode".equals(fieldName)) {
                    deserializedBlobStreamInputDataSourceProperties
                        .withAuthenticationMode(AuthenticationMode.fromString(reader.getString()));
                } else if ("sourcePartitionCount".equals(fieldName)) {
                    deserializedBlobStreamInputDataSourceProperties.sourcePartitionCount
                        = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobStreamInputDataSourceProperties;
        });
    }
}
