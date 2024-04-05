package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p010a9.C0048b;
import p650pn.C18417a;

public final class ReturnUrl {
    @C18417a("additionalProperties")
    private Map<String, ? extends Object> additionalProperties = new HashMap();
    @C18417a("href")
    private final String href;

    public ReturnUrl(String str) {
        C19383o.m32797g(str, "href");
        this.href = str;
    }

    public static /* synthetic */ ReturnUrl copy$default(ReturnUrl returnUrl, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = returnUrl.href;
        }
        return returnUrl.copy(str);
    }

    public final String component1() {
        return this.href;
    }

    public final ReturnUrl copy(String str) {
        C19383o.m32797g(str, "href");
        return new ReturnUrl(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReturnUrl) && C19383o.m32792b(this.href, ((ReturnUrl) obj).href);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getHref() {
        return this.href;
    }

    public int hashCode() {
        return this.href.hashCode();
    }

    public final void setAdditionalProperties(Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "<set-?>");
        this.additionalProperties = map;
    }

    public final void setAdditionalProperty(String str, Object obj) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(obj, "value");
        this.additionalProperties = C19294b0.m32564u0(this.additionalProperties, C19421p.m32931U(new Pair(str, obj)));
    }

    public String toString() {
        return C0048b.m163a("ReturnUrl(href=", this.href, ")");
    }
}
