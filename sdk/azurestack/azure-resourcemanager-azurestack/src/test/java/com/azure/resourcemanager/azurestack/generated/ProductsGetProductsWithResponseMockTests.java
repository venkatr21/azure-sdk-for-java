// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.azurestack.AzureStackManager;
import com.azure.resourcemanager.azurestack.models.CompatibilityIssue;
import com.azure.resourcemanager.azurestack.models.DeviceConfiguration;
import com.azure.resourcemanager.azurestack.models.ProductList;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProductsGetProductsWithResponseMockTests {
    @Test
    public void testGetProductsWithResponse() throws Exception {
        String responseStr
            = "{\"nextLink\":\"f\",\"value\":[{\"properties\":{\"displayName\":\"vpuvks\",\"description\":\"lsa\",\"publisherDisplayName\":\"ynfs\",\"publisherIdentifier\":\"ljphuopxodl\",\"offer\":\"ynt\",\"offerVersion\":\"zihleosjswsr\",\"sku\":\"lyzrpzbchckqqzqi\",\"billingPartNumber\":\"iysui\",\"vmExtensionType\":\"ynkedyatrwyhqmib\",\"galleryItemIdentity\":\"hwit\",\"iconUris\":{\"large\":\"pyy\",\"wide\":\"cdpu\",\"medium\":\"zgmwznmabikns\",\"small\":\"gj\",\"hero\":\"bldtlww\"},\"links\":[{},{},{},{}],\"legalTerms\":\"m\",\"privacyPolicy\":\"cvokotllxdyhg\",\"payloadLength\":4987957604610375925,\"productKind\":\"gjltdtbnnhado\",\"productProperties\":{\"version\":\"kvci\"},\"compatibility\":{\"isCompatible\":false,\"message\":\"amqgxqquezikyw\",\"description\":\"xkalla\",\"issues\":[\"ADFSIdentitySystemRequired\",\"PayAsYouGoBillingModelRequired\"]}},\"etag\":\"ipicc\",\"id\":\"zkzivgvvcnay\",\"name\":\"hyrnxxmu\",\"type\":\"edndr\"},{\"properties\":{\"displayName\":\"tkwqqtchealm\",\"description\":\"tdaaygdvwvg\",\"publisherDisplayName\":\"ohgwxrtfudxepxg\",\"publisherIdentifier\":\"agvrvmnpkuk\",\"offer\":\"i\",\"offerVersion\":\"blxgwimf\",\"sku\":\"hfjx\",\"billingPartNumber\":\"szkkfoqre\",\"vmExtensionType\":\"kzikfjawneaivxwc\",\"galleryItemIdentity\":\"lpcirelsf\",\"iconUris\":{\"large\":\"nwabfatkldd\",\"wide\":\"jhwuaanozjos\",\"medium\":\"youlp\",\"small\":\"v\",\"hero\":\"glrvimjwosytxi\"},\"links\":[{}],\"legalTerms\":\"fcktqumiekke\",\"privacyPolicy\":\"ikh\",\"payloadLength\":5614257163136424427,\"productKind\":\"dgqggebdu\",\"productProperties\":{\"version\":\"aeqidbqfatpxll\"},\"compatibility\":{\"isCompatible\":false,\"message\":\"moadsuvarmy\",\"description\":\"mjsjqb\",\"issues\":[\"LowerDeviceVersionRequired\",\"CapacityBillingModelRequired\",\"PayAsYouGoBillingModelRequired\",\"ConnectionToInternetRequired\"]}},\"etag\":\"lyc\",\"id\":\"duhpk\",\"name\":\"kgymareqnajxqug\",\"type\":\"hky\"},{\"properties\":{\"displayName\":\"eddgssofw\",\"description\":\"zqalkrmnjijpx\",\"publisherDisplayName\":\"q\",\"publisherIdentifier\":\"dfnbyxbaaabjyv\",\"offer\":\"ffimrzrtuzqogsex\",\"offerVersion\":\"vfdnwnwmewzsyyce\",\"sku\":\"soibjudpfrx\",\"billingPartNumber\":\"thzvaytdwkqbrqu\",\"vmExtensionType\":\"axhexiilivp\",\"galleryItemIdentity\":\"iirqtd\",\"iconUris\":{\"large\":\"xoruzfgsquyfxrx\",\"wide\":\"eptra\",\"medium\":\"jezwlwnw\",\"small\":\"qlcvydy\",\"hero\":\"tdooaoj\"},\"links\":[{},{},{},{}],\"legalTerms\":\"dkooebwnu\",\"privacyPolicy\":\"emmsbvdkc\",\"payloadLength\":7520814175527632507,\"productKind\":\"infwjlfltkacjve\",\"productProperties\":{\"version\":\"lfoakg\"},\"compatibility\":{\"isCompatible\":false,\"message\":\"gaowpulpqblylsyx\",\"description\":\"jnsjervtiagxsd\",\"issues\":[\"ADFSIdentitySystemRequired\"]}},\"etag\":\"psbzkfzbeyvpn\",\"id\":\"icvi\",\"name\":\"v\",\"type\":\"jjxd\"},{\"properties\":{\"displayName\":\"uukzclewyhmlw\",\"description\":\"ztzp\",\"publisherDisplayName\":\"ncckw\",\"publisherIdentifier\":\"zqwhxxbuyqaxzfeq\",\"offer\":\"ppriol\",\"offerVersion\":\"rjaltolmncw\",\"sku\":\"bqwcsdbnwdcf\",\"billingPartNumber\":\"cqdpfuv\",\"vmExtensionType\":\"sbjjc\",\"galleryItemIdentity\":\"vxb\",\"iconUris\":{\"large\":\"udutnco\",\"wide\":\"r\",\"medium\":\"qtvcofudflvkgj\",\"small\":\"gdknnqv\",\"hero\":\"znqntoru\"},\"links\":[{},{},{},{}],\"legalTerms\":\"a\",\"privacyPolicy\":\"kycgrauwj\",\"payloadLength\":2215501789179844571,\"productKind\":\"buruvd\",\"productProperties\":{\"version\":\"s\"},\"compatibility\":{\"isCompatible\":false,\"message\":\"ab\",\"description\":\"oefki\",\"issues\":[\"PayAsYouGoBillingModelRequired\",\"PayAsYouGoBillingModelRequired\",\"PayAsYouGoBillingModelRequired\"]}},\"etag\":\"ujmqlgkfbtndoa\",\"id\":\"n\",\"name\":\"bjcntujitc\",\"type\":\"ed\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureStackManager manager = AzureStackManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProductList response = manager.products()
            .getProductsWithResponse("uu", "jfqka", "e", new DeviceConfiguration(), com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("f", response.nextLink());
        Assertions.assertEquals("ipicc", response.value().get(0).etag());
        Assertions.assertEquals("vpuvks", response.value().get(0).displayName());
        Assertions.assertEquals("lsa", response.value().get(0).description());
        Assertions.assertEquals("ynfs", response.value().get(0).publisherDisplayName());
        Assertions.assertEquals("ljphuopxodl", response.value().get(0).publisherIdentifier());
        Assertions.assertEquals("ynt", response.value().get(0).offer());
        Assertions.assertEquals("zihleosjswsr", response.value().get(0).offerVersion());
        Assertions.assertEquals("lyzrpzbchckqqzqi", response.value().get(0).sku());
        Assertions.assertEquals("iysui", response.value().get(0).billingPartNumber());
        Assertions.assertEquals("ynkedyatrwyhqmib", response.value().get(0).vmExtensionType());
        Assertions.assertEquals("hwit", response.value().get(0).galleryItemIdentity());
        Assertions.assertEquals("pyy", response.value().get(0).iconUris().large());
        Assertions.assertEquals("cdpu", response.value().get(0).iconUris().wide());
        Assertions.assertEquals("zgmwznmabikns", response.value().get(0).iconUris().medium());
        Assertions.assertEquals("gj", response.value().get(0).iconUris().small());
        Assertions.assertEquals("bldtlww", response.value().get(0).iconUris().hero());
        Assertions.assertEquals("m", response.value().get(0).legalTerms());
        Assertions.assertEquals("cvokotllxdyhg", response.value().get(0).privacyPolicy());
        Assertions.assertEquals(4987957604610375925L, response.value().get(0).payloadLength());
        Assertions.assertEquals("gjltdtbnnhado", response.value().get(0).productKind());
        Assertions.assertEquals("kvci", response.value().get(0).productProperties().version());
        Assertions.assertEquals(false, response.value().get(0).compatibility().isCompatible());
        Assertions.assertEquals("amqgxqquezikyw", response.value().get(0).compatibility().message());
        Assertions.assertEquals("xkalla", response.value().get(0).compatibility().description());
        Assertions.assertEquals(CompatibilityIssue.ADFSIDENTITY_SYSTEM_REQUIRED,
            response.value().get(0).compatibility().issues().get(0));
    }
}
