// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.servicefabric.fluent.ApplicationTypesClient;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationTypeResourceInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypeResource;
import com.azure.resourcemanager.servicefabric.models.ApplicationTypes;

public final class ApplicationTypesImpl implements ApplicationTypes {
    private static final ClientLogger LOGGER = new ClientLogger(ApplicationTypesImpl.class);

    private final ApplicationTypesClient innerClient;

    private final com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager;

    public ApplicationTypesImpl(ApplicationTypesClient innerClient,
        com.azure.resourcemanager.servicefabric.ServiceFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ApplicationTypeResource> getWithResponse(String resourceGroupName, String clusterName,
        String applicationTypeName, Context context) {
        Response<ApplicationTypeResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, clusterName, applicationTypeName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApplicationTypeResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApplicationTypeResource get(String resourceGroupName, String clusterName, String applicationTypeName) {
        ApplicationTypeResourceInner inner
            = this.serviceClient().get(resourceGroupName, clusterName, applicationTypeName);
        if (inner != null) {
            return new ApplicationTypeResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String applicationTypeName) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationTypeName);
    }

    public void delete(String resourceGroupName, String clusterName, String applicationTypeName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, applicationTypeName, context);
    }

    public PagedIterable<ApplicationTypeResource> list(String resourceGroupName, String clusterName) {
        PagedIterable<ApplicationTypeResourceInner> inner = this.serviceClient().list(resourceGroupName, clusterName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationTypeResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ApplicationTypeResource> list(String resourceGroupName, String clusterName, Context context) {
        PagedIterable<ApplicationTypeResourceInner> inner
            = this.serviceClient().list(resourceGroupName, clusterName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApplicationTypeResourceImpl(inner1, this.manager()));
    }

    public ApplicationTypeResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationTypeName = ResourceManagerUtils.getValueFromIdByName(id, "applicationTypes");
        if (applicationTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationTypes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationTypeName, Context.NONE).getValue();
    }

    public Response<ApplicationTypeResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationTypeName = ResourceManagerUtils.getValueFromIdByName(id, "applicationTypes");
        if (applicationTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationTypes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, applicationTypeName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationTypeName = ResourceManagerUtils.getValueFromIdByName(id, "applicationTypes");
        if (applicationTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationTypes'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationTypeName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String applicationTypeName = ResourceManagerUtils.getValueFromIdByName(id, "applicationTypes");
        if (applicationTypeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'applicationTypes'.", id)));
        }
        this.delete(resourceGroupName, clusterName, applicationTypeName, context);
    }

    private ApplicationTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.servicefabric.ServiceFabricManager manager() {
        return this.serviceManager;
    }

    public ApplicationTypeResourceImpl define(String name) {
        return new ApplicationTypeResourceImpl(name, this.manager());
    }
}
