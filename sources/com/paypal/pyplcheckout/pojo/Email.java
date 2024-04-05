package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class Email {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("stringValue")
    private final String stringValue;

    public Email() {
        this((String) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public Email(String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.stringValue = str;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Email copy$default(Email email, String str, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = email.stringValue;
        }
        if ((i & 2) != 0) {
            map = email.additionalProperties;
        }
        return email.copy(str, map);
    }

    public final String component1() {
        return this.stringValue;
    }

    public final Map<String, Object> component2() {
        return this.additionalProperties;
    }

    public final Email copy(String str, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new Email(str, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Email)) {
            return false;
        }
        Email email = (Email) obj;
        return C19383o.m32792b(this.stringValue, email.stringValue) && C19383o.m32792b(this.additionalProperties, email.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getStringValue() {
        return this.stringValue;
    }

    public int hashCode() {
        String str = this.stringValue;
        return this.additionalProperties.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        String str = this.stringValue;
        Map<String, Object> map = this.additionalProperties;
        return "Email(stringValue=" + str + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Email(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new HashMap() : map);
    }
}
