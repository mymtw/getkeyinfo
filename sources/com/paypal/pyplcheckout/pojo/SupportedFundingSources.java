package com.paypal.pyplcheckout.pojo;

import kotlin.jvm.internal.C19383o;
import p650pn.C18417a;

public final class SupportedFundingSources {
    @C18417a("brand")
    private final CardIssuerType brand;
    @C18417a("brandLogoUrl")
    private final Url brandLogoUrl;

    public SupportedFundingSources(CardIssuerType cardIssuerType, Url url) {
        C19383o.m32797g(cardIssuerType, "brand");
        C19383o.m32797g(url, "brandLogoUrl");
        this.brand = cardIssuerType;
        this.brandLogoUrl = url;
    }

    public static /* synthetic */ SupportedFundingSources copy$default(SupportedFundingSources supportedFundingSources, CardIssuerType cardIssuerType, Url url, int i, Object obj) {
        if ((i & 1) != 0) {
            cardIssuerType = supportedFundingSources.brand;
        }
        if ((i & 2) != 0) {
            url = supportedFundingSources.brandLogoUrl;
        }
        return supportedFundingSources.copy(cardIssuerType, url);
    }

    public final CardIssuerType component1() {
        return this.brand;
    }

    public final Url component2() {
        return this.brandLogoUrl;
    }

    public final SupportedFundingSources copy(CardIssuerType cardIssuerType, Url url) {
        C19383o.m32797g(cardIssuerType, "brand");
        C19383o.m32797g(url, "brandLogoUrl");
        return new SupportedFundingSources(cardIssuerType, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportedFundingSources)) {
            return false;
        }
        SupportedFundingSources supportedFundingSources = (SupportedFundingSources) obj;
        return this.brand == supportedFundingSources.brand && C19383o.m32792b(this.brandLogoUrl, supportedFundingSources.brandLogoUrl);
    }

    public final CardIssuerType getBrand() {
        return this.brand;
    }

    public final Url getBrandLogoUrl() {
        return this.brandLogoUrl;
    }

    public int hashCode() {
        return this.brandLogoUrl.hashCode() + (this.brand.hashCode() * 31);
    }

    public String toString() {
        CardIssuerType cardIssuerType = this.brand;
        Url url = this.brandLogoUrl;
        return "SupportedFundingSources(brand=" + cardIssuerType + ", brandLogoUrl=" + url + ")";
    }
}
