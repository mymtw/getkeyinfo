package com.paypal.pyplcheckout.pojo;

import androidx.compose.animation.C0388a;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p650pn.C18417a;

public final class Name {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("familyName")
    private String familyName;
    @C18417a("fullName")
    private String fullName;
    @C18417a("givenName")
    private String givenName;

    public Name(String str, String str2, String str3, Map<String, Object> map) {
        C19383o.m32797g(str, "fullName");
        C19383o.m32797g(str2, "givenName");
        C19383o.m32797g(str3, "familyName");
        C19383o.m32797g(map, "additionalProperties");
        this.fullName = str;
        this.givenName = str2;
        this.familyName = str3;
        this.additionalProperties = map;
    }

    public static /* synthetic */ Name copy$default(Name name, String str, String str2, String str3, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = name.fullName;
        }
        if ((i & 2) != 0) {
            str2 = name.givenName;
        }
        if ((i & 4) != 0) {
            str3 = name.familyName;
        }
        if ((i & 8) != 0) {
            map = name.additionalProperties;
        }
        return name.copy(str, str2, str3, map);
    }

    public final String component1() {
        return this.fullName;
    }

    public final String component2() {
        return this.givenName;
    }

    public final String component3() {
        return this.familyName;
    }

    public final Map<String, Object> component4() {
        return this.additionalProperties;
    }

    public final Name copy(String str, String str2, String str3, Map<String, Object> map) {
        C19383o.m32797g(str, "fullName");
        C19383o.m32797g(str2, "givenName");
        C19383o.m32797g(str3, "familyName");
        C19383o.m32797g(map, "additionalProperties");
        return new Name(str, str2, str3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return C19383o.m32792b(this.fullName, name.fullName) && C19383o.m32792b(this.givenName, name.givenName) && C19383o.m32792b(this.familyName, name.familyName) && C19383o.m32792b(this.additionalProperties, name.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public int hashCode() {
        return this.additionalProperties.hashCode() + C0023f.m105e(this.familyName, C0023f.m105e(this.givenName, this.fullName.hashCode() * 31, 31), 31);
    }

    public final void setAdditionalProperty(String str, Object obj) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(obj, "value");
        this.additionalProperties.put(str, obj);
    }

    public final void setFamilyName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.familyName = str;
    }

    public final void setFullName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.fullName = str;
    }

    public final void setGivenName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.givenName = str;
    }

    public String toString() {
        String str = this.fullName;
        String str2 = this.givenName;
        String str3 = this.familyName;
        Map<String, Object> map = this.additionalProperties;
        StringBuilder f = C0388a.m1050f("Name(fullName=", str, ", givenName=", str2, ", familyName=");
        f.append(str3);
        f.append(", additionalProperties=");
        f.append(map);
        f.append(")");
        return f.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Name(String str, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? new HashMap() : map);
    }
}
