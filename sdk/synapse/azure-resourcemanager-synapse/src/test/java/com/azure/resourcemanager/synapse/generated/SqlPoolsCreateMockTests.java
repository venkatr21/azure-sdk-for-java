// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.synapse.SynapseManager;
import com.azure.resourcemanager.synapse.models.CreateMode;
import com.azure.resourcemanager.synapse.models.Sku;
import com.azure.resourcemanager.synapse.models.SqlPool;
import com.azure.resourcemanager.synapse.models.StorageAccountType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SqlPoolsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"sku\":{\"tier\":\"xkukm\",\"name\":\"zynuh\",\"capacity\":556850765},\"properties\":{\"maxSizeBytes\":1119204092487656709,\"collation\":\"vl\",\"sourceDatabaseId\":\"k\",\"recoverableDatabaseId\":\"rqolnthbb\",\"provisioningState\":\"Succeeded\",\"status\":\"nzkjthfceyjn\",\"restorePointInTime\":\"2021-11-10T15:42:33Z\",\"createMode\":\"Default\",\"creationDate\":\"2021-01-15T20:08:38Z\",\"storageAccountType\":\"GRS\",\"sourceDatabaseDeletionDate\":\"2021-08-31T04:50:59Z\"},\"location\":\"fiddhlrufzcq\",\"tags\":{\"k\":\"qrfuiocusel\"},\"id\":\"sazrhxuddqmdtff\",\"name\":\"sjmrkkhm\",\"type\":\"dmdlgyqixokw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SynapseManager manager = SynapseManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SqlPool response = manager.sqlPools()
            .define("nm")
            .withRegion("whvuldbkk")
            .withExistingWorkspace("krvfsxxbydes", "lvgecpwgoljtz")
            .withTags(mapOf("gawgazmxjqi", "kj", "jjsbcmlzaahzbhur", "h", "lirh", "olk"))
            .withSku(new Sku().withTier("obygoo").withName("qa").withCapacity(323165043))
            .withMaxSizeBytes(6874264411354040379L)
            .withCollation("fucsaodjnosdkvi")
            .withSourceDatabaseId("asgmatrnzpd")
            .withRecoverableDatabaseId("daaktuj")
            .withProvisioningState("zboimyfpqdo")
            .withRestorePointInTime(OffsetDateTime.parse("2021-09-15T03:44:33Z"))
            .withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
            .withStorageAccountType(StorageAccountType.LRS)
            .withSourceDatabaseDeletionDate(OffsetDateTime.parse("2021-08-30T07:51:53Z"))
            .create();

        Assertions.assertEquals("fiddhlrufzcq", response.location());
        Assertions.assertEquals("qrfuiocusel", response.tags().get("k"));
        Assertions.assertEquals("xkukm", response.sku().tier());
        Assertions.assertEquals("zynuh", response.sku().name());
        Assertions.assertEquals(556850765, response.sku().capacity());
        Assertions.assertEquals(1119204092487656709L, response.maxSizeBytes());
        Assertions.assertEquals("vl", response.collation());
        Assertions.assertEquals("k", response.sourceDatabaseId());
        Assertions.assertEquals("rqolnthbb", response.recoverableDatabaseId());
        Assertions.assertEquals("Succeeded", response.provisioningState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-10T15:42:33Z"), response.restorePointInTime());
        Assertions.assertEquals(CreateMode.DEFAULT, response.createMode());
        Assertions.assertEquals(StorageAccountType.GRS, response.storageAccountType());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-31T04:50:59Z"), response.sourceDatabaseDeletionDate());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
