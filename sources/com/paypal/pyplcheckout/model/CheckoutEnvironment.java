package com.paypal.pyplcheckout.model;

import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.interfaces.Environment;
import com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class CheckoutEnvironment {
    private final Map<Environment, String> ELMO_URL;
    private final Map<Environment, String> ENVIRONMENT;
    private final Map<Environment, String> GRAPHQL_ENDPOINT;
    private final Map<Environment, String> HOSTS;
    private final String LOCAL_HOST = "http://localhost:";
    private final Map<Environment, String> LOGGER_URL;
    private final Map<Environment, String> REST_URL;
    private Environment currentMerchantPayPalEnvironment;
    private final Environment defaultMerchantPayPalEnvironment;
    private String port;
    private String stagingUrl;

    public CheckoutEnvironment() {
        RunTimeEnvironment runTimeEnvironment = RunTimeEnvironment.LIVE;
        this.defaultMerchantPayPalEnvironment = runTimeEnvironment;
        this.currentMerchantPayPalEnvironment = runTimeEnvironment;
        this.port = "";
        this.stagingUrl = "test24.stage.paypal.com";
        RunTimeEnvironment runTimeEnvironment2 = RunTimeEnvironment.SANDBOX;
        RunTimeEnvironment runTimeEnvironment3 = RunTimeEnvironment.STAGE;
        this.ELMO_URL = C19294b0.m32563t0(new Pair(runTimeEnvironment2, "https://node-sb-elmonodeweb-vip.slc.paypal.com/elmo/api/elmoserv/runtime"), new Pair(runTimeEnvironment, "https://www.paypal.com/elmo/api/elmoserv/runtime"), new Pair(runTimeEnvironment3, C0048b.m163a("https://api.", this.stagingUrl, "/elmo/api/elmoserv/runtime")));
        this.GRAPHQL_ENDPOINT = C19294b0.m32563t0(new Pair(runTimeEnvironment2, "https://www.sandbox.paypal.com/graphql"), new Pair(runTimeEnvironment, "https://www.paypal.com/graphql"), new Pair(runTimeEnvironment3, C0048b.m163a("https://www.", this.stagingUrl, "/graphql")));
        this.HOSTS = C19294b0.m32563t0(new Pair(runTimeEnvironment2, "www.sandbox.paypal.com"), new Pair(runTimeEnvironment, "www.paypal.com"), new Pair(runTimeEnvironment3, C0326j.m864i("www.", this.stagingUrl)));
        this.ENVIRONMENT = C19294b0.m32562s0(new Pair(runTimeEnvironment2, "Sandbox"), new Pair(runTimeEnvironment, "Live"), new Pair(runTimeEnvironment3, "StageT24"), new Pair(RunTimeEnvironment.LOCAL, "Local"));
        this.LOGGER_URL = C19294b0.m32563t0(new Pair(runTimeEnvironment2, "https://www.paypal.com/xoplatform/logger/api/logger"), new Pair(runTimeEnvironment, "https://www.paypal.com/xoplatform/logger/api/logger"), new Pair(runTimeEnvironment3, C0048b.m163a("https://api.", this.stagingUrl, "/xoplatform/logger/api/logger")));
        this.REST_URL = C19294b0.m32563t0(new Pair(runTimeEnvironment2, "https://api.sandbox.paypal.com"), new Pair(runTimeEnvironment, "https://api.paypal.com"), new Pair(runTimeEnvironment3, C0326j.m864i("https://api.", this.stagingUrl)));
    }

    public final Environment getCurrentMerchantPayPalEnvironment() {
        return this.currentMerchantPayPalEnvironment;
    }

    public final String getELMOUrl() {
        return (String) C19294b0.m32560q0(this.currentMerchantPayPalEnvironment, this.ELMO_URL);
    }

    public final String getEnvironment() {
        return (String) C19294b0.m32560q0(this.currentMerchantPayPalEnvironment, this.ENVIRONMENT);
    }

    public final String getGraphQlEndpoint() {
        return (String) C19294b0.m32560q0(this.currentMerchantPayPalEnvironment, this.GRAPHQL_ENDPOINT);
    }

    public final String getHost() {
        return (String) C19294b0.m32560q0(this.currentMerchantPayPalEnvironment, this.HOSTS);
    }

    public final String getLoggerUrl() {
        return (String) C19294b0.m32560q0(this.currentMerchantPayPalEnvironment, this.LOGGER_URL);
    }

    public final String getPort() {
        return this.port;
    }

    public final String getRestUrl() {
        return (String) C19294b0.m32560q0(this.currentMerchantPayPalEnvironment, this.REST_URL);
    }

    public final String getStagingUrl() {
        return this.stagingUrl;
    }

    public final void setCurrentMerchantPayPalEnvironment(Environment environment) {
        C19383o.m32797g(environment, "<set-?>");
        this.currentMerchantPayPalEnvironment = environment;
    }

    public final void setPort(String str) {
        C19383o.m32797g(str, "value");
        this.port = str;
        Map<Environment, String> map = this.ELMO_URL;
        RunTimeEnvironment runTimeEnvironment = RunTimeEnvironment.LOCAL;
        String str2 = this.LOCAL_HOST;
        map.put(runTimeEnvironment, str2 + str + "/elmo/api/elmoserv/runtime");
        Map<Environment, String> map2 = this.GRAPHQL_ENDPOINT;
        String str3 = this.LOCAL_HOST;
        String str4 = this.port;
        map2.put(runTimeEnvironment, str3 + str4 + "/graphql");
        Map<Environment, String> map3 = this.HOSTS;
        String str5 = this.LOCAL_HOST;
        String str6 = this.port;
        map3.put(runTimeEnvironment, str5 + str6);
        Map<Environment, String> map4 = this.LOGGER_URL;
        String str7 = this.LOCAL_HOST;
        String str8 = this.port;
        map4.put(runTimeEnvironment, str7 + str8 + "/xoplatform/logger/api/logger");
        Map<Environment, String> map5 = this.REST_URL;
        String str9 = this.LOCAL_HOST;
        String str10 = this.port;
        map5.put(runTimeEnvironment, str9 + str10);
    }

    public final void setStagingUrl(String str) {
        C19383o.m32797g(str, "value");
        this.stagingUrl = str;
        Map<Environment, String> map = this.ELMO_URL;
        RunTimeEnvironment runTimeEnvironment = RunTimeEnvironment.STAGE;
        map.put(runTimeEnvironment, "https://api." + str + "/elmo/api/elmoserv/runtime");
        Map<Environment, String> map2 = this.GRAPHQL_ENDPOINT;
        String str2 = this.stagingUrl;
        map2.put(runTimeEnvironment, "https://www." + str2 + "/graphql");
        Map<Environment, String> map3 = this.HOSTS;
        String str3 = this.stagingUrl;
        map3.put(runTimeEnvironment, "www." + str3);
        Map<Environment, String> map4 = this.LOGGER_URL;
        String str4 = this.stagingUrl;
        map4.put(runTimeEnvironment, "https://api." + str4 + "/xoplatform/logger/api/logger");
        Map<Environment, String> map5 = this.REST_URL;
        String str5 = this.stagingUrl;
        map5.put(runTimeEnvironment, "https://api." + str5);
    }
}
