package com.paypal.pyplcheckout.pojo;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p650pn.C18417a;

public final class ProfileImage {
    @C18417a("additionalProperties")
    private final Map<String, Object> additionalProperties;
    @C18417a("url")
    private Url url;

    public ProfileImage() {
        this((Url) null, (Map) null, 3, (DefaultConstructorMarker) null);
    }

    public ProfileImage(Url url2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        this.url = url2;
        this.additionalProperties = map;
    }

    public static /* synthetic */ ProfileImage copy$default(ProfileImage profileImage, Url url2, Map<String, Object> map, int i, Object obj) {
        if ((i & 1) != 0) {
            url2 = profileImage.url;
        }
        if ((i & 2) != 0) {
            map = profileImage.additionalProperties;
        }
        return profileImage.copy(url2, map);
    }

    public final Url component1() {
        return this.url;
    }

    public final Map<String, Object> component2() {
        return this.additionalProperties;
    }

    public final ProfileImage copy(Url url2, Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "additionalProperties");
        return new ProfileImage(url2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileImage)) {
            return false;
        }
        ProfileImage profileImage = (ProfileImage) obj;
        return C19383o.m32792b(this.url, profileImage.url) && C19383o.m32792b(this.additionalProperties, profileImage.additionalProperties);
    }

    public final Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final Url getUrl() {
        return this.url;
    }

    public int hashCode() {
        Url url2 = this.url;
        return this.additionalProperties.hashCode() + ((url2 == null ? 0 : url2.hashCode()) * 31);
    }

    public final void setUrl(Url url2) {
        this.url = url2;
    }

    public String toString() {
        Url url2 = this.url;
        Map<String, Object> map = this.additionalProperties;
        return "ProfileImage(url=" + url2 + ", additionalProperties=" + map + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileImage(Url url2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : url2, (i & 2) != 0 ? new HashMap() : map);
    }
}
