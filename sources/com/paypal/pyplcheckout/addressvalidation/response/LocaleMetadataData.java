package com.paypal.pyplcheckout.addressvalidation.response;

import kotlin.jvm.internal.C19383o;

public final class LocaleMetadataData {
    private final LocaleMetadata localeMetadata;

    public LocaleMetadataData(LocaleMetadata localeMetadata2) {
        C19383o.m32797g(localeMetadata2, "localeMetadata");
        this.localeMetadata = localeMetadata2;
    }

    public static /* synthetic */ LocaleMetadataData copy$default(LocaleMetadataData localeMetadataData, LocaleMetadata localeMetadata2, int i, Object obj) {
        if ((i & 1) != 0) {
            localeMetadata2 = localeMetadataData.localeMetadata;
        }
        return localeMetadataData.copy(localeMetadata2);
    }

    public final LocaleMetadata component1() {
        return this.localeMetadata;
    }

    public final LocaleMetadataData copy(LocaleMetadata localeMetadata2) {
        C19383o.m32797g(localeMetadata2, "localeMetadata");
        return new LocaleMetadataData(localeMetadata2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocaleMetadataData) && C19383o.m32792b(this.localeMetadata, ((LocaleMetadataData) obj).localeMetadata);
    }

    public final LocaleMetadata getLocaleMetadata() {
        return this.localeMetadata;
    }

    public int hashCode() {
        return this.localeMetadata.hashCode();
    }

    public String toString() {
        LocaleMetadata localeMetadata2 = this.localeMetadata;
        return "LocaleMetadataData(localeMetadata=" + localeMetadata2 + ")";
    }
}
