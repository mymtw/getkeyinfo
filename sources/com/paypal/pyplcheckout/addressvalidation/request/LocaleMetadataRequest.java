package com.paypal.pyplcheckout.addressvalidation.request;

import kotlin.jvm.internal.C19383o;
import p010a9.C0048b;

public final class LocaleMetadataRequest {
    private final String country;

    public LocaleMetadataRequest(String str) {
        C19383o.m32797g(str, "country");
        this.country = str;
    }

    public static /* synthetic */ LocaleMetadataRequest copy$default(LocaleMetadataRequest localeMetadataRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localeMetadataRequest.country;
        }
        return localeMetadataRequest.copy(str);
    }

    public final String component1() {
        return this.country;
    }

    public final LocaleMetadataRequest copy(String str) {
        C19383o.m32797g(str, "country");
        return new LocaleMetadataRequest(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleMetadataRequest) && C19383o.m32792b(this.country, ((LocaleMetadataRequest) obj).country);
    }

    public final String getCountry() {
        return this.country;
    }

    public int hashCode() {
        return this.country.hashCode();
    }

    public String toString() {
        return C0048b.m163a("LocaleMetadataRequest(country=", this.country, ")");
    }
}
