// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.AccessControlListInner;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlListAction;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlListMatchCondition;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlListMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.AccessControlListPortCondition;
import com.azure.resourcemanager.managednetworkfabric.models.AclActionType;
import com.azure.resourcemanager.managednetworkfabric.models.CommonDynamicMatchConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationType;
import com.azure.resourcemanager.managednetworkfabric.models.IpAddressType;
import com.azure.resourcemanager.managednetworkfabric.models.IpGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.IpMatchCondition;
import com.azure.resourcemanager.managednetworkfabric.models.Layer4Protocol;
import com.azure.resourcemanager.managednetworkfabric.models.PortGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VlanGroupProperties;
import com.azure.resourcemanager.managednetworkfabric.models.VlanMatchCondition;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AccessControlListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccessControlListInner model = BinaryData.fromString(
            "{\"properties\":{\"lastSyncedTime\":\"2021-03-24T17:54:20Z\",\"configurationState\":\"Failed\",\"provisioningState\":\"Accepted\",\"administrativeState\":\"MAT\",\"configurationType\":\"Inline\",\"aclsUrl\":\"bczmeh\",\"matchConfigurations\":[{\"matchConfigurationName\":\"pbsphrupidgs\",\"sequenceNumber\":5720978843418888179,\"ipAddressType\":\"IPv4\",\"matchConditions\":[{\"etherTypes\":[\"cmsxaobhdxbm\"],\"fragments\":[\"oqjzehtbmufpowno\"],\"ipLengths\":[\"wlrxyb\",\"soqijg\"],\"ttlValues\":[\"bpazlobcufpdzn\",\"btcqq\",\"nq\",\"lhqgnufooojy\"],\"dscpMarkings\":[\"sqe\",\"aagdfmg\",\"zlhjxrifkwmrvkt\",\"izntocipao\"],\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"qucmpo\"],\"vlanMatchCondition\":{},\"ipCondition\":{}},{\"etherTypes\":[\"ogknygjofjdd\",\"qs\",\"deupewnwrei\",\"jzyflu\"],\"fragments\":[\"hmofc\"],\"ipLengths\":[\"my\"],\"ttlValues\":[\"dtmlxhekuksjt\",\"ukcdmparcryuanzw\",\"xzdxtayrlhmwh\"],\"dscpMarkings\":[\"rqobmtuk\",\"nryrtihf\",\"tijbpzvgnwzsymgl\"],\"portCondition\":{\"layer4Protocol\":\"UDP\"},\"protocolTypes\":[\"zk\",\"hdbihan\",\"fhfcb\",\"y\"],\"vlanMatchCondition\":{},\"ipCondition\":{}}],\"actions\":[{\"type\":\"Count\",\"counterName\":\"hab\"}]},{\"matchConfigurationName\":\"pikxwczbyscnpqxu\",\"sequenceNumber\":3437469293095173263,\"ipAddressType\":\"IPv4\",\"matchConditions\":[{\"etherTypes\":[\"br\"],\"fragments\":[\"dumjgrtfwvuk\"],\"ipLengths\":[\"udccsnhsjc\",\"yejhk\",\"yhtnapczwlokjye\"],\"ttlValues\":[\"vnipjox\",\"jnchgej\",\"podmailzydehojwy\"],\"dscpMarkings\":[\"xinpmqnjaq\",\"ixjsprozvcputeg\",\"vwmf\"],\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"mdvpjhulsu\"],\"vlanMatchCondition\":{},\"ipCondition\":{}}],\"actions\":[{\"type\":\"Count\",\"counterName\":\"rwfndiod\"},{\"type\":\"Log\",\"counterName\":\"w\"},{\"type\":\"Drop\",\"counterName\":\"vwryoqpso\"}]},{\"matchConfigurationName\":\"ctazakljlahbcryf\",\"sequenceNumber\":5965878792837381583,\"ipAddressType\":\"IPv4\",\"matchConditions\":[{\"etherTypes\":[\"paojakhmsbzjh\",\"rzevdphlxaol\",\"hqtrgqjbpf\"],\"fragments\":[\"inzgvfcj\"],\"ipLengths\":[\"oxxjtfelluwf\",\"it\"],\"ttlValues\":[\"eqfpj\",\"jlxofpdvhpfxxyp\",\"ninmayhuyb\"],\"dscpMarkings\":[\"odepoogin\",\"vamih\"],\"portCondition\":{\"layer4Protocol\":\"UDP\"},\"protocolTypes\":[\"rxzxtheo\",\"usivye\",\"cciqihnhungbwjz\"],\"vlanMatchCondition\":{},\"ipCondition\":{}},{\"etherTypes\":[\"xgispemvtzfkufu\"],\"fragments\":[\"ofx\",\"eofjaeqjh\"],\"ipLengths\":[\"asvm\"],\"ttlValues\":[\"qulngsntnbybkzgc\"],\"dscpMarkings\":[\"clxxwrljdo\",\"skcqvkocrcjd\"],\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"xbnjbiksq\",\"gls\",\"ainqpjwnzlljfm\"],\"vlanMatchCondition\":{},\"ipCondition\":{}},{\"etherTypes\":[\"vmgxsab\",\"yqduujit\",\"jczdzevndh\",\"rwpdappdsbdkvwrw\"],\"fragments\":[\"usnhutje\",\"tmrldhugjzzdatq\"],\"ipLengths\":[\"cdgea\"],\"ttlValues\":[\"phut\",\"cndvkaozwyiftyhx\",\"urokft\"],\"dscpMarkings\":[\"lniwpwcukjfkgiaw\",\"klryplwck\",\"asy\"],\"portCondition\":{\"layer4Protocol\":\"UDP\"},\"protocolTypes\":[\"hsgcbacphejkot\",\"nqgoulzndli\"],\"vlanMatchCondition\":{},\"ipCondition\":{}},{\"etherTypes\":[\"gfgibm\"],\"fragments\":[\"akeqs\",\"xybz\"],\"ipLengths\":[\"dqytbciqfouflmm\"],\"ttlValues\":[\"smodmgloug\"],\"dscpMarkings\":[\"wtmutduq\",\"ta\",\"spwgcuertumkdosv\",\"whbmd\"],\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"ddgmb\"],\"vlanMatchCondition\":{},\"ipCondition\":{}}],\"actions\":[{\"type\":\"Count\",\"counterName\":\"tq\"},{\"type\":\"Count\",\"counterName\":\"fpfpsalgbquxigj\"},{\"type\":\"Log\",\"counterName\":\"jaoyfhrtx\"}]},{\"matchConfigurationName\":\"n\",\"sequenceNumber\":5477626889722442552,\"ipAddressType\":\"IPv6\",\"matchConditions\":[{\"etherTypes\":[\"juvf\"],\"fragments\":[\"rlyxwjkcprbnw\",\"xgjvtbv\",\"ysszdnrujqguh\"],\"ipLengths\":[\"uqfprwzw\",\"nguitnwuizgazxu\"],\"ttlValues\":[\"uckyf\",\"hr\"],\"dscpMarkings\":[\"fvzwdzuhty\",\"wisdkft\",\"wxmnteiwao\"],\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"jcmmxdcufufsrp\",\"mzidnsezcxtb\"],\"vlanMatchCondition\":{},\"ipCondition\":{}},{\"etherTypes\":[\"c\"],\"fragments\":[\"ewmdw\",\"jeiachboosfl\",\"ro\",\"fqpte\"],\"ipLengths\":[\"zvypyqrimzinp\",\"swjdkirso\",\"dqxhcrmnohjtckwh\",\"soifiyipjxsqw\"],\"ttlValues\":[\"jbznorc\"],\"dscpMarkings\":[\"snb\"],\"portCondition\":{\"layer4Protocol\":\"TCP\"},\"protocolTypes\":[\"nmoc\"],\"vlanMatchCondition\":{},\"ipCondition\":{}},{\"etherTypes\":[\"urzafb\",\"jjgpb\",\"oq\"],\"fragments\":[\"klj\",\"vbqid\"],\"ipLengths\":[\"jzyulpk\",\"dj\"],\"ttlValues\":[\"khbzhfepgzg\",\"e\"],\"dscpMarkings\":[\"ocxscpaierhhbcs\"],\"portCondition\":{\"layer4Protocol\":\"UDP\"},\"protocolTypes\":[\"a\",\"tjaodxobnb\"],\"vlanMatchCondition\":{},\"ipCondition\":{}}],\"actions\":[{\"type\":\"Drop\",\"counterName\":\"ajionpimexgstxg\"},{\"type\":\"Log\",\"counterName\":\"gmaajrm\"},{\"type\":\"Count\",\"counterName\":\"zrlovmclwhijcoej\"}]}],\"dynamicMatchConfigurations\":[{\"ipGroups\":[{\"name\":\"s\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"kbfkg\",\"kdkexxp\",\"ofmx\"]},{\"name\":\"c\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"dtocj\",\"xhvpmoue\",\"hd\"]},{\"name\":\"i\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"nxqbzvddn\",\"wndeicbtwnp\",\"aoqvuh\",\"hcffcyddglmjthjq\"]}],\"vlanGroups\":[{\"name\":\"eicxmqciwqvhkhi\",\"vlans\":[\"gdtopbobjogh\",\"e\",\"u\"]},{\"name\":\"a\",\"vlans\":[\"z\",\"yvvtpgvdfgio\"]}],\"portGroups\":[{\"name\":\"utqxlngx\",\"ports\":[\"gug\",\"xkrxdqmi\",\"tthzrvqd\",\"abhjybi\"]},{\"name\":\"h\",\"ports\":[\"bowsk\",\"nyktzlcuiy\",\"gqywgndrv\"]},{\"name\":\"hzgpphrcgyncocpe\",\"ports\":[\"m\",\"coofsxlzev\"]},{\"name\":\"m\",\"ports\":[\"abcypmivk\",\"lzu\"]}]},{\"ipGroups\":[{\"name\":\"wnfnbacf\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"bxetqgtzxdpn\",\"bqqwxrj\",\"eallnwsubisnj\"]}],\"vlanGroups\":[{\"name\":\"ngnzscxaqwoochc\",\"vlans\":[\"qvpkvlrxnjeaseip\",\"eo\",\"lokeyy\"]}],\"portGroups\":[{\"name\":\"bdlwtgrhpdjpj\",\"ports\":[\"sxazjpq\",\"e\",\"ualhbxxhejj\",\"zvdudgwdslfhotwm\"]}]},{\"ipGroups\":[{\"name\":\"wlbjnpgacftade\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"yfsoppu\",\"uesnzwdejbavo\",\"xzdmohctb\",\"vudwx\"]},{\"name\":\"dnvowg\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"wdkcglhsl\",\"zj\",\"yggdtjixh\"]},{\"name\":\"uofqwe\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"n\",\"vfyexfw\",\"ybcibvyvdcsit\",\"nnaamdectehfiqsc\"]}],\"vlanGroups\":[{\"name\":\"vhezrkgqhcj\",\"vlans\":[\"o\",\"gm\",\"qsl\",\"yyvxyqjpkcattpn\"]},{\"name\":\"cr\",\"vlans\":[\"sqpjhvmdajvn\",\"sounqecanoaeu\",\"fhyhltrpmopjmcma\",\"u\"]},{\"name\":\"thfuiuaodsfcpkvx\",\"vlans\":[\"uozmyzydagfua\",\"bezy\",\"uokktwhrdxwz\"]}],\"portGroups\":[{\"name\":\"mbsureximo\",\"ports\":[\"cfsf\"]}]},{\"ipGroups\":[{\"name\":\"ddystkiiuxhqy\",\"ipAddressType\":\"IPv4\",\"ipPrefixes\":[\"rq\",\"b\",\"oczvy\",\"fqrvkdvjsllrmvvd\"]},{\"name\":\"atkpnp\",\"ipAddressType\":\"IPv6\",\"ipPrefixes\":[\"bczw\",\"ruwiqzbqjvsov\",\"yokacspkw\"]}],\"vlanGroups\":[{\"name\":\"obpxjmflbvvn\",\"vlans\":[\"kcciwwzjuqkhr\",\"ajiwkuo\",\"oskg\"]},{\"name\":\"auu\",\"vlans\":[\"mvxi\",\"duugidyjr\"]},{\"name\":\"byao\",\"vlans\":[\"xc\"]},{\"name\":\"npc\",\"vlans\":[\"cohslkev\",\"eggzfb\",\"hfmvfaxkffe\"]}],\"portGroups\":[{\"name\":\"lvmezyvshxmzsbbz\",\"ports\":[\"igrxwburvjxxjn\"]}]}],\"annotation\":\"ydptkoen\"},\"location\":\"uknvudwti\",\"tags\":{\"azyxoegukg\":\"ldngkpoci\",\"mrbpizcdrqj\":\"npiucgygevqznty\",\"yhxdeoejzicwi\":\"dpydn\"},\"id\":\"sjttgzfbish\",\"name\":\"bkh\",\"type\":\"jdeyeamdpha\"}")
            .toObject(AccessControlListInner.class);
        Assertions.assertEquals("uknvudwti", model.location());
        Assertions.assertEquals("ldngkpoci", model.tags().get("azyxoegukg"));
        Assertions.assertEquals(ConfigurationType.INLINE, model.configurationType());
        Assertions.assertEquals("bczmeh", model.aclsUrl());
        Assertions.assertEquals("pbsphrupidgs", model.matchConfigurations().get(0).matchConfigurationName());
        Assertions.assertEquals(5720978843418888179L, model.matchConfigurations().get(0).sequenceNumber());
        Assertions.assertEquals(IpAddressType.IPV4, model.matchConfigurations().get(0).ipAddressType());
        Assertions.assertEquals("qucmpo",
            model.matchConfigurations().get(0).matchConditions().get(0).protocolTypes().get(0));
        Assertions.assertEquals("cmsxaobhdxbm",
            model.matchConfigurations().get(0).matchConditions().get(0).etherTypes().get(0));
        Assertions.assertEquals("oqjzehtbmufpowno",
            model.matchConfigurations().get(0).matchConditions().get(0).fragments().get(0));
        Assertions.assertEquals("wlrxyb",
            model.matchConfigurations().get(0).matchConditions().get(0).ipLengths().get(0));
        Assertions.assertEquals("bpazlobcufpdzn",
            model.matchConfigurations().get(0).matchConditions().get(0).ttlValues().get(0));
        Assertions.assertEquals("sqe",
            model.matchConfigurations().get(0).matchConditions().get(0).dscpMarkings().get(0));
        Assertions.assertEquals(Layer4Protocol.TCP,
            model.matchConfigurations().get(0).matchConditions().get(0).portCondition().layer4Protocol());
        Assertions.assertEquals(AclActionType.COUNT, model.matchConfigurations().get(0).actions().get(0).type());
        Assertions.assertEquals("hab", model.matchConfigurations().get(0).actions().get(0).counterName());
        Assertions.assertEquals("s", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).name());
        Assertions.assertEquals(IpAddressType.IPV4,
            model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipAddressType());
        Assertions.assertEquals("kbfkg",
            model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("eicxmqciwqvhkhi",
            model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).name());
        Assertions.assertEquals("gdtopbobjogh",
            model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("utqxlngx", model.dynamicMatchConfigurations().get(0).portGroups().get(0).name());
        Assertions.assertEquals("gug", model.dynamicMatchConfigurations().get(0).portGroups().get(0).ports().get(0));
        Assertions.assertEquals("ydptkoen", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccessControlListInner model
            = new AccessControlListInner().withLocation("uknvudwti")
                .withTags(mapOf("azyxoegukg", "ldngkpoci", "mrbpizcdrqj", "npiucgygevqznty", "yhxdeoejzicwi", "dpydn"))
                .withConfigurationType(ConfigurationType.INLINE)
                .withAclsUrl("bczmeh")
                .withMatchConfigurations(
                    Arrays
                        .asList(
                            new AccessControlListMatchConfiguration().withMatchConfigurationName("pbsphrupidgs")
                                .withSequenceNumber(5720978843418888179L)
                                .withIpAddressType(IpAddressType.IPV4)
                                .withMatchConditions(Arrays.asList(
                                    new AccessControlListMatchCondition().withProtocolTypes(Arrays.asList("qucmpo"))
                                        .withVlanMatchCondition(new VlanMatchCondition())
                                        .withIpCondition(new IpMatchCondition())
                                        .withEtherTypes(Arrays.asList("cmsxaobhdxbm"))
                                        .withFragments(Arrays.asList("oqjzehtbmufpowno"))
                                        .withIpLengths(Arrays.asList("wlrxyb", "soqijg"))
                                        .withTtlValues(Arrays.asList("bpazlobcufpdzn", "btcqq", "nq", "lhqgnufooojy"))
                                        .withDscpMarkings(
                                            Arrays.asList("sqe", "aagdfmg", "zlhjxrifkwmrvkt", "izntocipao"))
                                        .withPortCondition(new AccessControlListPortCondition()
                                            .withLayer4Protocol(Layer4Protocol.TCP)),
                                    new AccessControlListMatchCondition()
                                        .withProtocolTypes(Arrays.asList("zk", "hdbihan", "fhfcb", "y"))
                                        .withVlanMatchCondition(new VlanMatchCondition())
                                        .withIpCondition(new IpMatchCondition())
                                        .withEtherTypes(Arrays.asList("ogknygjofjdd", "qs", "deupewnwrei", "jzyflu"))
                                        .withFragments(Arrays.asList("hmofc"))
                                        .withIpLengths(Arrays.asList("my"))
                                        .withTtlValues(
                                            Arrays.asList("dtmlxhekuksjt", "ukcdmparcryuanzw", "xzdxtayrlhmwh"))
                                        .withDscpMarkings(Arrays.asList("rqobmtuk", "nryrtihf", "tijbpzvgnwzsymgl"))
                                        .withPortCondition(new AccessControlListPortCondition()
                                            .withLayer4Protocol(Layer4Protocol.UDP))))
                                .withActions(
                                    Arrays.asList(new AccessControlListAction().withType(AclActionType.COUNT)
                                        .withCounterName("hab"))),
                            new AccessControlListMatchConfiguration().withMatchConfigurationName("pikxwczbyscnpqxu")
                                .withSequenceNumber(3437469293095173263L)
                                .withIpAddressType(IpAddressType.IPV4)
                                .withMatchConditions(Arrays.asList(
                                    new AccessControlListMatchCondition().withProtocolTypes(Arrays.asList("mdvpjhulsu"))
                                        .withVlanMatchCondition(new VlanMatchCondition())
                                        .withIpCondition(new IpMatchCondition())
                                        .withEtherTypes(Arrays.asList("br"))
                                        .withFragments(Arrays.asList("dumjgrtfwvuk"))
                                        .withIpLengths(Arrays.asList("udccsnhsjc", "yejhk", "yhtnapczwlokjye"))
                                        .withTtlValues(Arrays.asList("vnipjox", "jnchgej", "podmailzydehojwy"))
                                        .withDscpMarkings(Arrays.asList("xinpmqnjaq", "ixjsprozvcputeg", "vwmf"))
                                        .withPortCondition(new AccessControlListPortCondition()
                                            .withLayer4Protocol(Layer4Protocol.TCP))))
                                .withActions(
                                    Arrays.asList(
                                        new AccessControlListAction().withType(AclActionType.COUNT)
                                            .withCounterName("rwfndiod"),
                                        new AccessControlListAction().withType(AclActionType.LOG).withCounterName("w"),
                                        new AccessControlListAction().withType(AclActionType.DROP)
                                            .withCounterName("vwryoqpso"))),
                            new AccessControlListMatchConfiguration().withMatchConfigurationName("ctazakljlahbcryf")
                                .withSequenceNumber(5965878792837381583L)
                                .withIpAddressType(IpAddressType.IPV4)
                                .withMatchConditions(
                                    Arrays
                                        .asList(
                                            new AccessControlListMatchCondition()
                                                .withProtocolTypes(
                                                    Arrays.asList("rxzxtheo", "usivye", "cciqihnhungbwjz"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEtherTypes(
                                                    Arrays.asList("paojakhmsbzjh", "rzevdphlxaol", "hqtrgqjbpf"))
                                                .withFragments(Arrays.asList("inzgvfcj"))
                                                .withIpLengths(Arrays.asList("oxxjtfelluwf", "it"))
                                                .withTtlValues(Arrays.asList("eqfpj", "jlxofpdvhpfxxyp", "ninmayhuyb"))
                                                .withDscpMarkings(Arrays.asList("odepoogin", "vamih"))
                                                .withPortCondition(new AccessControlListPortCondition()
                                                    .withLayer4Protocol(Layer4Protocol.UDP)),
                                            new AccessControlListMatchCondition()
                                                .withProtocolTypes(Arrays.asList("xbnjbiksq", "gls", "ainqpjwnzlljfm"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEtherTypes(Arrays.asList("xgispemvtzfkufu"))
                                                .withFragments(Arrays.asList("ofx", "eofjaeqjh"))
                                                .withIpLengths(Arrays.asList("asvm"))
                                                .withTtlValues(Arrays.asList("qulngsntnbybkzgc"))
                                                .withDscpMarkings(Arrays.asList("clxxwrljdo", "skcqvkocrcjd"))
                                                .withPortCondition(new AccessControlListPortCondition()
                                                    .withLayer4Protocol(Layer4Protocol.TCP)),
                                            new AccessControlListMatchCondition()
                                                .withProtocolTypes(Arrays.asList("hsgcbacphejkot", "nqgoulzndli"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEtherTypes(Arrays
                                                    .asList("vmgxsab", "yqduujit", "jczdzevndh", "rwpdappdsbdkvwrw"))
                                                .withFragments(Arrays.asList("usnhutje", "tmrldhugjzzdatq"))
                                                .withIpLengths(Arrays.asList("cdgea"))
                                                .withTtlValues(Arrays.asList("phut", "cndvkaozwyiftyhx", "urokft"))
                                                .withDscpMarkings(Arrays.asList("lniwpwcukjfkgiaw", "klryplwck", "asy"))
                                                .withPortCondition(new AccessControlListPortCondition()
                                                    .withLayer4Protocol(Layer4Protocol.UDP)),
                                            new AccessControlListMatchCondition()
                                                .withProtocolTypes(Arrays.asList("ddgmb"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEtherTypes(Arrays.asList("gfgibm"))
                                                .withFragments(Arrays.asList("akeqs", "xybz"))
                                                .withIpLengths(Arrays.asList("dqytbciqfouflmm"))
                                                .withTtlValues(Arrays.asList("smodmgloug"))
                                                .withDscpMarkings(
                                                    Arrays.asList("wtmutduq", "ta", "spwgcuertumkdosv", "whbmd"))
                                                .withPortCondition(new AccessControlListPortCondition()
                                                    .withLayer4Protocol(Layer4Protocol.TCP))))
                                .withActions(Arrays.asList(
                                    new AccessControlListAction().withType(AclActionType.COUNT).withCounterName("tq"),
                                    new AccessControlListAction().withType(AclActionType.COUNT)
                                        .withCounterName("fpfpsalgbquxigj"),
                                    new AccessControlListAction().withType(AclActionType.LOG)
                                        .withCounterName("jaoyfhrtx"))),
                            new AccessControlListMatchConfiguration().withMatchConfigurationName("n")
                                .withSequenceNumber(5477626889722442552L)
                                .withIpAddressType(IpAddressType.IPV6)
                                .withMatchConditions(
                                    Arrays
                                        .asList(
                                            new AccessControlListMatchCondition()
                                                .withProtocolTypes(Arrays.asList("jcmmxdcufufsrp", "mzidnsezcxtb"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEtherTypes(Arrays.asList("juvf"))
                                                .withFragments(
                                                    Arrays.asList("rlyxwjkcprbnw", "xgjvtbv", "ysszdnrujqguh"))
                                                .withIpLengths(Arrays.asList("uqfprwzw", "nguitnwuizgazxu"))
                                                .withTtlValues(Arrays.asList("uckyf", "hr"))
                                                .withDscpMarkings(Arrays.asList("fvzwdzuhty", "wisdkft", "wxmnteiwao"))
                                                .withPortCondition(new AccessControlListPortCondition()
                                                    .withLayer4Protocol(Layer4Protocol.TCP)),
                                            new AccessControlListMatchCondition()
                                                .withProtocolTypes(Arrays.asList("nmoc"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEtherTypes(Arrays.asList("c"))
                                                .withFragments(Arrays.asList("ewmdw", "jeiachboosfl", "ro", "fqpte"))
                                                .withIpLengths(Arrays.asList("zvypyqrimzinp", "swjdkirso",
                                                    "dqxhcrmnohjtckwh", "soifiyipjxsqw"))
                                                .withTtlValues(Arrays.asList("jbznorc"))
                                                .withDscpMarkings(Arrays.asList("snb"))
                                                .withPortCondition(new AccessControlListPortCondition()
                                                    .withLayer4Protocol(Layer4Protocol.TCP)),
                                            new AccessControlListMatchCondition()
                                                .withProtocolTypes(Arrays.asList("a", "tjaodxobnb"))
                                                .withVlanMatchCondition(new VlanMatchCondition())
                                                .withIpCondition(new IpMatchCondition())
                                                .withEtherTypes(Arrays.asList("urzafb", "jjgpb", "oq"))
                                                .withFragments(Arrays.asList("klj", "vbqid"))
                                                .withIpLengths(Arrays.asList("jzyulpk", "dj"))
                                                .withTtlValues(Arrays.asList("khbzhfepgzg", "e"))
                                                .withDscpMarkings(Arrays.asList("ocxscpaierhhbcs"))
                                                .withPortCondition(new AccessControlListPortCondition()
                                                    .withLayer4Protocol(Layer4Protocol.UDP))))
                                .withActions(Arrays.asList(new AccessControlListAction()
                                    .withType(AclActionType.DROP)
                                    .withCounterName("ajionpimexgstxg"),
                                    new AccessControlListAction().withType(AclActionType.LOG)
                                        .withCounterName("gmaajrm"),
                                    new AccessControlListAction().withType(AclActionType.COUNT)
                                        .withCounterName("zrlovmclwhijcoej")))))
                .withDynamicMatchConfigurations(
                    Arrays
                        .asList(
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(Arrays
                                    .asList(
                                        new IpGroupProperties().withName("s")
                                            .withIpAddressType(IpAddressType.IPV4)
                                            .withIpPrefixes(Arrays.asList("kbfkg", "kdkexxp", "ofmx")),
                                        new IpGroupProperties().withName("c")
                                            .withIpAddressType(IpAddressType.IPV4)
                                            .withIpPrefixes(Arrays.asList("dtocj", "xhvpmoue", "hd")),
                                        new IpGroupProperties().withName("i")
                                            .withIpAddressType(IpAddressType.IPV6)
                                            .withIpPrefixes(Arrays.asList("nxqbzvddn", "wndeicbtwnp", "aoqvuh",
                                                "hcffcyddglmjthjq"))))
                                .withVlanGroups(Arrays.asList(new VlanGroupProperties()
                                    .withName("eicxmqciwqvhkhi")
                                    .withVlans(Arrays.asList("gdtopbobjogh", "e", "u")),
                                    new VlanGroupProperties().withName("a")
                                        .withVlans(Arrays.asList("z", "yvvtpgvdfgio"))))
                                .withPortGroups(Arrays.asList(
                                    new PortGroupProperties().withName("utqxlngx")
                                        .withPorts(Arrays.asList("gug", "xkrxdqmi", "tthzrvqd", "abhjybi")),
                                    new PortGroupProperties().withName("h")
                                        .withPorts(Arrays.asList("bowsk", "nyktzlcuiy", "gqywgndrv")),
                                    new PortGroupProperties().withName("hzgpphrcgyncocpe")
                                        .withPorts(Arrays.asList("m", "coofsxlzev")),
                                    new PortGroupProperties().withName("m")
                                        .withPorts(Arrays.asList("abcypmivk", "lzu")))),
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(Arrays.asList(new IpGroupProperties().withName("wnfnbacf")
                                    .withIpAddressType(IpAddressType.IPV6)
                                    .withIpPrefixes(Arrays.asList("bxetqgtzxdpn", "bqqwxrj", "eallnwsubisnj"))))
                                .withVlanGroups(Arrays.asList(new VlanGroupProperties().withName("ngnzscxaqwoochc")
                                    .withVlans(Arrays.asList("qvpkvlrxnjeaseip", "eo", "lokeyy"))))
                                .withPortGroups(
                                    Arrays.asList(new PortGroupProperties().withName("bdlwtgrhpdjpj")
                                        .withPorts(Arrays.asList("sxazjpq", "e", "ualhbxxhejj", "zvdudgwdslfhotwm")))),
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(Arrays.asList(new IpGroupProperties().withName("wlbjnpgacftade")
                                    .withIpAddressType(IpAddressType.IPV6)
                                    .withIpPrefixes(Arrays.asList("yfsoppu", "uesnzwdejbavo", "xzdmohctb", "vudwx")),
                                    new IpGroupProperties().withName("dnvowg")
                                        .withIpAddressType(IpAddressType.IPV6)
                                        .withIpPrefixes(Arrays.asList("wdkcglhsl", "zj", "yggdtjixh")),
                                    new IpGroupProperties().withName("uofqwe")
                                        .withIpAddressType(IpAddressType.IPV6)
                                        .withIpPrefixes(
                                            Arrays.asList("n", "vfyexfw", "ybcibvyvdcsit", "nnaamdectehfiqsc"))))
                                .withVlanGroups(
                                    Arrays.asList(
                                        new VlanGroupProperties().withName("vhezrkgqhcj")
                                            .withVlans(Arrays.asList("o", "gm", "qsl", "yyvxyqjpkcattpn")),
                                        new VlanGroupProperties().withName("cr")
                                            .withVlans(Arrays
                                                .asList("sqpjhvmdajvn", "sounqecanoaeu", "fhyhltrpmopjmcma", "u")),
                                        new VlanGroupProperties().withName("thfuiuaodsfcpkvx")
                                            .withVlans(Arrays.asList("uozmyzydagfua", "bezy", "uokktwhrdxwz"))))
                                .withPortGroups(Arrays.asList(new PortGroupProperties()
                                    .withName("mbsureximo")
                                    .withPorts(Arrays.asList("cfsf")))),
                            new CommonDynamicMatchConfiguration()
                                .withIpGroups(Arrays.asList(
                                    new IpGroupProperties().withName("ddystkiiuxhqy")
                                        .withIpAddressType(IpAddressType.IPV4)
                                        .withIpPrefixes(Arrays.asList("rq", "b", "oczvy", "fqrvkdvjsllrmvvd")),
                                    new IpGroupProperties().withName("atkpnp")
                                        .withIpAddressType(IpAddressType.IPV6)
                                        .withIpPrefixes(Arrays.asList("bczw", "ruwiqzbqjvsov", "yokacspkw"))))
                                .withVlanGroups(Arrays.asList(
                                    new VlanGroupProperties().withName("obpxjmflbvvn")
                                        .withVlans(Arrays.asList("kcciwwzjuqkhr", "ajiwkuo", "oskg")),
                                    new VlanGroupProperties().withName("auu")
                                        .withVlans(Arrays.asList("mvxi", "duugidyjr")),
                                    new VlanGroupProperties().withName("byao").withVlans(Arrays.asList("xc")),
                                    new VlanGroupProperties().withName("npc")
                                        .withVlans(Arrays.asList("cohslkev", "eggzfb", "hfmvfaxkffe"))))
                                .withPortGroups(Arrays.asList(new PortGroupProperties().withName("lvmezyvshxmzsbbz")
                                    .withPorts(Arrays.asList("igrxwburvjxxjn"))))))
                .withAnnotation("ydptkoen");
        model = BinaryData.fromObject(model).toObject(AccessControlListInner.class);
        Assertions.assertEquals("uknvudwti", model.location());
        Assertions.assertEquals("ldngkpoci", model.tags().get("azyxoegukg"));
        Assertions.assertEquals(ConfigurationType.INLINE, model.configurationType());
        Assertions.assertEquals("bczmeh", model.aclsUrl());
        Assertions.assertEquals("pbsphrupidgs", model.matchConfigurations().get(0).matchConfigurationName());
        Assertions.assertEquals(5720978843418888179L, model.matchConfigurations().get(0).sequenceNumber());
        Assertions.assertEquals(IpAddressType.IPV4, model.matchConfigurations().get(0).ipAddressType());
        Assertions.assertEquals("qucmpo",
            model.matchConfigurations().get(0).matchConditions().get(0).protocolTypes().get(0));
        Assertions.assertEquals("cmsxaobhdxbm",
            model.matchConfigurations().get(0).matchConditions().get(0).etherTypes().get(0));
        Assertions.assertEquals("oqjzehtbmufpowno",
            model.matchConfigurations().get(0).matchConditions().get(0).fragments().get(0));
        Assertions.assertEquals("wlrxyb",
            model.matchConfigurations().get(0).matchConditions().get(0).ipLengths().get(0));
        Assertions.assertEquals("bpazlobcufpdzn",
            model.matchConfigurations().get(0).matchConditions().get(0).ttlValues().get(0));
        Assertions.assertEquals("sqe",
            model.matchConfigurations().get(0).matchConditions().get(0).dscpMarkings().get(0));
        Assertions.assertEquals(Layer4Protocol.TCP,
            model.matchConfigurations().get(0).matchConditions().get(0).portCondition().layer4Protocol());
        Assertions.assertEquals(AclActionType.COUNT, model.matchConfigurations().get(0).actions().get(0).type());
        Assertions.assertEquals("hab", model.matchConfigurations().get(0).actions().get(0).counterName());
        Assertions.assertEquals("s", model.dynamicMatchConfigurations().get(0).ipGroups().get(0).name());
        Assertions.assertEquals(IpAddressType.IPV4,
            model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipAddressType());
        Assertions.assertEquals("kbfkg",
            model.dynamicMatchConfigurations().get(0).ipGroups().get(0).ipPrefixes().get(0));
        Assertions.assertEquals("eicxmqciwqvhkhi",
            model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).name());
        Assertions.assertEquals("gdtopbobjogh",
            model.dynamicMatchConfigurations().get(0).vlanGroups().get(0).vlans().get(0));
        Assertions.assertEquals("utqxlngx", model.dynamicMatchConfigurations().get(0).portGroups().get(0).name());
        Assertions.assertEquals("gug", model.dynamicMatchConfigurations().get(0).portGroups().get(0).ports().get(0));
        Assertions.assertEquals("ydptkoen", model.annotation());
    }

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
