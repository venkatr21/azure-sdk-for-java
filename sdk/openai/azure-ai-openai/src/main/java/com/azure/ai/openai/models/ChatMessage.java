// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A single, role-attributed message within a chat completion interaction. */
@Fluent
public final class ChatMessage {
    /*
     * The role associated with this message payload.
     */
    @Generated
    @JsonProperty(value = "role")
    private ChatRole role;

    /*
     * The text associated with this message payload.
     */
    @Generated
    @JsonProperty(value = "content")
    private String content;

    /**
     * Creates an instance of ChatMessage class.
     *
     * @param role the role value to set.
     */
    @Generated
    @JsonCreator
    public ChatMessage(@JsonProperty(value = "role") ChatRole role) {
        this.role = role;
    }

    /**
     * Get the role property: The role associated with this message payload.
     *
     * @return the role value.
     */
    @Generated
    public ChatRole getRole() {
        return this.role;
    }

    /**
     * Get the content property: The text associated with this message payload.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: The text associated with this message payload.
     *
     * @param content the content value to set.
     * @return the ChatMessage object itself.
     */
    @Generated
    public ChatMessage setContent(String content) {
        this.content = content;
        return this;
    }
}