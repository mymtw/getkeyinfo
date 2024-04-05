package com.etsy.android.p327ui.core;

import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import java.util.List;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20183f;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.core.i */
public interface C9621i {
    @C20183f("/etsyapps/v3/bespoke/public/listings/{listing_id}/reviews")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo32302a(@C20196s("listing_id") long j, @C20197t("offset") int i, @C20197t("reviews_dsml_models_variant") String str, @C20197t("see_all_reviews_filtering") String str2, @C20197t("sort") String str3, @C20197t("rating") Integer num, @C20197t("with_photos_only") Boolean bool, @C20197t("with_videos_only") Boolean bool2, @C20197t("include_videos") Boolean bool3);

    @C20183f("/etsyapps/v3/bespoke/member/listings/{listing_id}")
    /* renamed from: b */
    C8071s<C20145v<ListingFetch>> mo32303b(@C20196s("listing_id") long j, @C20197t("listing_id") long j2, @C20197t("include_recommendations") boolean z, @C20197t("supports_google_pay") boolean z2, @C20197t("show_more_review_images_carousel") Boolean bool, @C20197t("include_split_listing_shop_reviews_data") Boolean bool2, @C20197t("show_only_listing_reviews") Boolean bool3, @C20197t("include_is_shop_favorited") Boolean bool4, @C20197t("include_featured_review") Boolean bool5);

    @C20183f("/etsyapps/v3/bespoke/public/listings/{listing_id}/offerings/find-by-variations")
    /* renamed from: c */
    C8071s<C20145v<AppsInventoryAddToCartContext>> mo32304c(@C20196s("listing_id") long j, @C20197t("listing_variation_ids[]") List<String> list, @C20197t("selected_quantity") int i, @C20197t("include_video") boolean z);
}
