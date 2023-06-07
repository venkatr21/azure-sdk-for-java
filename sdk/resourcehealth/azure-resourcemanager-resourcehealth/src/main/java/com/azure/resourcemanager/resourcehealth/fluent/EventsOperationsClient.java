// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcehealth.fluent.models.EventInner;

/** An instance of this class provides access to all the operations defined in EventsOperationsClient. */
public interface EventsOperationsClient {
    /**
     * Lists service health events in the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> list();

    /**
     * Lists service health events in the subscription.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param queryStartTime Specifies from when to return events, based on the lastUpdateTime property. For example,
     *     queryStartTime = 7/24/2020 OR queryStartTime=7%2F24%2F2020.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> list(String filter, String queryStartTime, Context context);

    /**
     * Lists current service health events in the tenant.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> listByTenantId();

    /**
     * Lists current service health events in the tenant.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param queryStartTime Specifies from when to return events, based on the lastUpdateTime property. For example,
     *     queryStartTime = 7/24/2020 OR queryStartTime=7%2F24%2F2020.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> listByTenantId(String filter, String queryStartTime, Context context);

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> listBySingleResource(String resourceUri);

    /**
     * Lists current service health events for given resource.
     *
     * @param resourceUri The fully qualified ID of the resource, including the resource name and resource type.
     *     Currently the API support not nested and one nesting level resource types :
     *     /subscriptions/{subscriptionId}/resourceGroups/{resource-group-name}/providers/{resource-provider-name}/{resource-type}/{resource-name}
     *     and
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resource-provider-name}/{parentResourceType}/{parentResourceName}/{resourceType}/{resourceName}.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://docs.microsoft.com/en-us/rest/api/apimanagement/apis?redirectedfrom=MSDN.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List events operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventInner> listBySingleResource(String resourceUri, String filter, Context context);
}