package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Url {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("href")
    private String href;

    public Url() {
        this((String) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public Url(String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.href = str;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Url copy$default(Url url, String str, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = url.href;
        }
        if ((i & 2) != 0) {
            map = url.additionalProperties;
        }
        return url.copy(str, map);
    }

    public final String component1() {
        return this.href;
    }

    public final Map<String, Object> component2() {
        return this.additionalProperties;
    }

    public final Url copy(String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new Url(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Url)) {
            return false;
        }
        Url url = (Url) obj;
        return C19383o.m32792b(this.href, url.href) && C19383o.m32792b(this.additionalProperties, url.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getHref() {
        return this.href;
    }

    public int hashCode() {
        String str = this.href;
        return this.additionalProperties.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setHref(String str) {
        this.href = str;
    }

    public String toString() {
        String str = this.href;
        Map<String, Object> map = this.additionalProperties;
        return "Url(href=" + str + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Url(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new HashMap() : map);
    }
}
