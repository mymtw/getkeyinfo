package com.etsy.android.shophome;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class ListingMemberDataRepository$getListingMemberData$content$1 extends Lambda implements C19857l<String, CharSequence> {
    public static final ListingMemberDataRepository$getListingMemberData$content$1 INSTANCE = new ListingMemberDataRepository$getListingMemberData$content$1();

    public ListingMemberDataRepository$getListingMemberData$content$1() {
        super(1);
    }

    public final CharSequence invoke(String str) {
        C19383o.m32797g(str, "it");
        return "listing_ids[]=" + str;
    }
}
