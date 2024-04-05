package com.etsy.android.lib.models.apiv3;

import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;

@C17403o(generateAdapter = true)
public final class NewTranslatedReview {
    public static final int $stable = 0;
    private final String review;

    public NewTranslatedReview(@C17402n(name = "review") String str) {
        this.review = str;
    }

    public final String getReview() {
        return this.review;
    }
}
