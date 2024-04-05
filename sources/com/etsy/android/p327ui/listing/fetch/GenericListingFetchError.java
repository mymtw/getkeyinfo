package com.etsy.android.p327ui.listing.fetch;

/* renamed from: com.etsy.android.ui.listing.fetch.GenericListingFetchError */
public final class GenericListingFetchError extends Throwable {
    public static final int $stable = 0;
    private final String message;

    public GenericListingFetchError(String str) {
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }
}
