package com.etsy.android.lib.models.apiv3;

import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class StarSellerAboutCard {
    public static final int $stable = 0;
    private final String body;
    private final String title;

    public StarSellerAboutCard(@C17402n(name = "title") String str, @C17402n(name = "body") String str2) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, DetailsBottomSheetNavigationKey.PARAM_BODY);
        this.title = str;
        this.body = str2;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getTitle() {
        return this.title;
    }
}
