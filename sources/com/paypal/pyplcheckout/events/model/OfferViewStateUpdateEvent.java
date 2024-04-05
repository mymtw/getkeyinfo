package com.paypal.pyplcheckout.events.model;

public final class OfferViewStateUpdateEvent {
    private final String ctaText;
    private final String termsLink;
    private final String termsText;

    public OfferViewStateUpdateEvent(String str, String str2, String str3) {
        this.ctaText = str;
        this.termsText = str2;
        this.termsLink = str3;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getTermsLink() {
        return this.termsLink;
    }

    public final String getTermsText() {
        return this.termsText;
    }
}
