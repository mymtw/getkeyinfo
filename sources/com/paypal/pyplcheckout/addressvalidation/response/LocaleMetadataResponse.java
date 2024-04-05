package com.paypal.pyplcheckout.addressvalidation.response;

import kotlin.jvm.internal.C19383o;

public final class LocaleMetadataResponse {
    private final LocaleMetadataData data;

    public LocaleMetadataResponse(LocaleMetadataData localeMetadataData) {
        C19383o.m32797g(localeMetadataData, "data");
        this.data = localeMetadataData;
    }

    public static /* synthetic */ LocaleMetadataResponse copy$default(LocaleMetadataResponse localeMetadataResponse, LocaleMetadataData localeMetadataData, int i, Object obj) {
        if ((i & 1) != 0) {
            localeMetadataData = localeMetadataResponse.data;
        }
        return localeMetadataResponse.copy(localeMetadataData);
    }

    public final LocaleMetadataData component1() {
        return this.data;
    }

    public final LocaleMetadataResponse copy(LocaleMetadataData localeMetadataData) {
        C19383o.m32797g(localeMetadataData, "data");
        return new LocaleMetadataResponse(localeMetadataData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleMetadataResponse) && C19383o.m32792b(this.data, ((LocaleMetadataResponse) obj).data);
    }

    public final LocaleMetadataData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        LocaleMetadataData localeMetadataData = this.data;
        return "LocaleMetadataResponse(data=" + localeMetadataData + ")";
    }
}
