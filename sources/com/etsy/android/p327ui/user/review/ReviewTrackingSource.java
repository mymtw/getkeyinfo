package com.etsy.android.p327ui.user.review;

/* renamed from: com.etsy.android.ui.user.review.ReviewTrackingSource */
public enum ReviewTrackingSource {
    EMAIL("email"),
    MISC_EXTERNAL_LINK("misc_external_link"),
    PUSH_NOTIFICATION("review_push_notification"),
    HOME_SCREEN_CAROUSEL("homepage_nudger"),
    PURCHASES_SCREEN("purchases_page"),
    PURCHASES_CAROUSEL("purchases_carousel"),
    RECEIPT_SCREEN("receipt_page"),
    REVIEW("review_form");
    
    private final String source;

    private ReviewTrackingSource(String str) {
        this.source = str;
    }

    public final String getSource() {
        return this.source;
    }
}
