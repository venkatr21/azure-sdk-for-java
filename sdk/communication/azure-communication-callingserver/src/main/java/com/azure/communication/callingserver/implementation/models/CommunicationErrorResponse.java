// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/** The Communication Services error response. */
@Fluent
public final class CommunicationErrorResponse implements JsonSerializable<CommunicationErrorResponse> {
    /*
     * The error property.
     */
    private CommunicationError error;

    /**
     * Get the error property: The error property.
     *
     * @return the error value.
     */
    public CommunicationError getError() {
        return this.error;
    }

    /**
     * Set the error property: The error property.
     *
     * @param error the error value to set.
     * @return the CommunicationErrorResponse object itself.
     */
    public CommunicationErrorResponse setError(CommunicationError error) {
        this.error = error;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeStartObject().writeJsonField("error", error).writeEndObject();
    }

    /**
     * Reads an instance of {@link CommunicationErrorResponse} from the {@link JsonReader}.
     *
     * @param jsonReader The {@link JsonReader} to read.
     * @return An instance of {@link CommunicationErrorResponse}, or null if the {@link JsonReader} was pointing to
     * {@link JsonToken#NULL}.
     * @throws IOException If an error occurs while reading the {@link JsonReader}.
     */
    public static CommunicationErrorResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationErrorResponse response = new CommunicationErrorResponse();

            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("error".equals(fieldName)) {
                    response.error = CommunicationError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return response;
        });
    }
}
