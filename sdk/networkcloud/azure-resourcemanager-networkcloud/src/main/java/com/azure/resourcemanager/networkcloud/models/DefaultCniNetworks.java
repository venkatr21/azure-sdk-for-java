// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DefaultCniNetworks. */
public interface DefaultCniNetworks {
    /**
     * List default CNI networks in the subscription.
     *
     * <p>Get a list of default CNI networks in the provided subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of default CNI networks in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<DefaultCniNetwork> list();

    /**
     * List default CNI networks in the subscription.
     *
     * <p>Get a list of default CNI networks in the provided subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of default CNI networks in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<DefaultCniNetwork> list(Context context);

    /**
     * List default CNI networks in the resource group.
     *
     * <p>Get a list of default CNI networks in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of default CNI networks in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<DefaultCniNetwork> listByResourceGroup(String resourceGroupName);

    /**
     * List default CNI networks in the resource group.
     *
     * <p>Get a list of default CNI networks in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of default CNI networks in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<DefaultCniNetwork> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve the default CNI network.
     *
     * <p>Get properties of the provided default CNI network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param defaultCniNetworkName The name of the default CNI network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided default CNI network along with {@link Response}.
     */
    Response<DefaultCniNetwork> getByResourceGroupWithResponse(
        String resourceGroupName, String defaultCniNetworkName, Context context);

    /**
     * Retrieve the default CNI network.
     *
     * <p>Get properties of the provided default CNI network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param defaultCniNetworkName The name of the default CNI network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided default CNI network.
     */
    DefaultCniNetwork getByResourceGroup(String resourceGroupName, String defaultCniNetworkName);

    /**
     * Delete the default CNI network.
     *
     * <p>Delete the provided default CNI network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param defaultCniNetworkName The name of the default CNI network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String defaultCniNetworkName);

    /**
     * Delete the default CNI network.
     *
     * <p>Delete the provided default CNI network.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param defaultCniNetworkName The name of the default CNI network.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String defaultCniNetworkName, Context context);

    /**
     * Retrieve the default CNI network.
     *
     * <p>Get properties of the provided default CNI network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided default CNI network along with {@link Response}.
     */
    DefaultCniNetwork getById(String id);

    /**
     * Retrieve the default CNI network.
     *
     * <p>Get properties of the provided default CNI network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided default CNI network along with {@link Response}.
     */
    Response<DefaultCniNetwork> getByIdWithResponse(String id, Context context);

    /**
     * Delete the default CNI network.
     *
     * <p>Delete the provided default CNI network.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the default CNI network.
     *
     * <p>Delete the provided default CNI network.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new DefaultCniNetwork resource.
     *
     * @param name resource name.
     * @return the first stage of the new DefaultCniNetwork definition.
     */
    DefaultCniNetwork.DefinitionStages.Blank define(String name);
}