package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.fasterxml.jackson.core.JsonParser;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReviewCarouselCard extends BaseFieldModel {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String REVIEW_CAROUSEL = "reviewCarousel";
    public ListingImage listingImage;
    public String listingTitle;
    public String title;
    private long transactionId;
    private List<Long> transactionIds = EmptyList.INSTANCE;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ListingImage getListingImage() {
        ListingImage listingImage2 = this.listingImage;
        if (listingImage2 != null) {
            return listingImage2;
        }
        C19383o.m32805o("listingImage");
        throw null;
    }

    public final String getListingTitle() {
        String str = this.listingTitle;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("listingTitle");
        throw null;
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("title");
        throw null;
    }

    public final long getTransactionId() {
        return this.transactionId;
    }

    public final List<Long> getTransactionIds() {
        return this.transactionIds;
    }

    public int getViewType() {
        return R.id.view_type_review_card;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "parser", str, "fieldName")) {
            case -1085518627:
                if (str.equals(ResponseConstants.LISTING_TITLE)) {
                    setListingTitle(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case 100313435:
                if (str.equals(ResponseConstants.IMAGE)) {
                    Object parseObject = BaseModel.Companion.parseObject(jsonParser, ListingImage.class);
                    C19383o.m32794d(parseObject);
                    setListingImage((ListingImage) parseObject);
                    return true;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    setTitle(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case 1010584092:
                if (str.equals(ResponseConstants.TRANSACTION_ID)) {
                    this.transactionId = jsonParser.getLongValue();
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setListingImage(ListingImage listingImage2) {
        C19383o.m32797g(listingImage2, "<set-?>");
        this.listingImage = listingImage2;
    }

    public final void setListingTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.listingTitle = str;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }

    public final void setTransactionId(long j) {
        this.transactionId = j;
    }

    public final void setTransactionIds(List<Long> list) {
        C19383o.m32797g(list, "<set-?>");
        this.transactionIds = list;
    }
}
