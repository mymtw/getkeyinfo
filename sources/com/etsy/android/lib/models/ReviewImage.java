package com.etsy.android.lib.models;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.StringEscapeUtils;

public final class ReviewImage extends BaseFieldModel {
    public static final int $stable = 8;
    public static final transient String BUYER_NAME = "buyer_name";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final transient String LISTING_ONLY = "listing_only";
    public static final transient String REVIEW_RATING = "review_rating";
    public static final transient String REVIEW_TEXT = "review_text";
    public String buyerAvatarUrl;
    public String buyerName;
    public String buyerProfileUrl;
    public Date createDate;
    private Image image;
    private boolean isListingOnly;
    private EtsyId listingId = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
    private List<String> listingImages;
    private String listingTitle;
    private Integer reviewRating = 0;
    public String reviewText;
    private String transactionId;
    private String translatedReview;
    private MachineTranslationViewState translationState = new MachineTranslationViewState((String) null, 1, (DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getBuyerAvatarUrl() {
        String str = this.buyerAvatarUrl;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("buyerAvatarUrl");
        throw null;
    }

    public final String getBuyerName() {
        String str = this.buyerName;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("buyerName");
        throw null;
    }

    public final String getBuyerProfileUrl() {
        String str = this.buyerProfileUrl;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("buyerProfileUrl");
        throw null;
    }

    public final Date getCreateDate() {
        Date date = this.createDate;
        if (date != null) {
            return date;
        }
        C19383o.m32805o("createDate");
        throw null;
    }

    public final Image getImage() {
        return this.image;
    }

    public final EtsyId getListingId() {
        return this.listingId;
    }

    public final List<String> getListingImages() {
        return this.listingImages;
    }

    public final String getListingTitle() {
        return this.listingTitle;
    }

    public final Integer getReviewRating() {
        return this.reviewRating;
    }

    public final String getReviewText() {
        String str = this.reviewText;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("reviewText");
        throw null;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getTranslatedReview() {
        return this.translatedReview;
    }

    public final MachineTranslationViewState getTranslationState() {
        return this.translationState;
    }

    public final boolean isListingOnly() {
        return this.isListingOnly;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        switch (C0072d.m197c(jsonParser, "jp", str, "fieldName")) {
            case -2134044643:
                if (str.equals("review_translated")) {
                    setTranslatedReview(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case -1446449843:
                if (str.equals(ResponseConstants.BUYER_PROFILE_URL)) {
                    setBuyerProfileUrl(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case -1085518627:
                if (str.equals(ResponseConstants.LISTING_TITLE)) {
                    this.listingTitle = BaseModel.Companion.parseString(jsonParser);
                    return true;
                }
                break;
            case -593774699:
                if (str.equals(ResponseConstants.BUYER_AVATAR_URL)) {
                    setBuyerAvatarUrl(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case -494058223:
                if (str.equals(ResponseConstants.CREATE_DATE)) {
                    setCreateDate(BaseModel.parseIntoDate(jsonParser));
                    return true;
                }
                break;
            case 100313435:
                if (str.equals(ResponseConstants.IMAGE)) {
                    this.image = (Image) BaseModel.Companion.parseObject(jsonParser, Image.class);
                    return true;
                }
                break;
            case 127814039:
                if (str.equals(BUYER_NAME)) {
                    setBuyerName(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
            case 396863635:
                if (str.equals(ResponseConstants.LISTING_IMAGES)) {
                    this.listingImages = BaseModel.Companion.parseStringArray(jsonParser);
                    return true;
                }
                break;
            case 988969142:
                if (str.equals("listing_id")) {
                    this.listingId.setIdKt(BaseModel.Companion.parseStringIdOrNumericValue(jsonParser));
                    return true;
                }
                break;
            case 1010584092:
                if (str.equals(ResponseConstants.TRANSACTION_ID)) {
                    this.transactionId = BaseModel.Companion.parseStringIdOrNumericValue(jsonParser);
                    return true;
                }
                break;
            case 1160397924:
                if (str.equals(REVIEW_RATING)) {
                    this.reviewRating = Integer.valueOf(Integer.parseInt(BaseModel.Companion.parseString(jsonParser)));
                    return true;
                }
                break;
            case 1211764871:
                if (str.equals(LISTING_ONLY)) {
                    this.isListingOnly = jsonParser.getValueAsBoolean();
                    return true;
                }
                break;
            case 1359928756:
                if (str.equals(REVIEW_TEXT)) {
                    setReviewText(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
                break;
        }
        return false;
    }

    public final void setBuyerAvatarUrl(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.buyerAvatarUrl = str;
    }

    public final void setBuyerName(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.buyerName = str;
    }

    public final void setBuyerProfileUrl(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.buyerProfileUrl = str;
    }

    public final void setCreateDate(Date date) {
        C19383o.m32797g(date, "<set-?>");
        this.createDate = date;
    }

    public final void setImage(Image image2) {
        this.image = image2;
    }

    public final void setListingId(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "<set-?>");
        this.listingId = etsyId;
    }

    public final void setListingImages(List<String> list) {
        this.listingImages = list;
    }

    public final void setListingOnly(boolean z) {
        this.isListingOnly = z;
    }

    public final void setListingTitle(String str) {
        this.listingTitle = str;
    }

    public final void setReviewRating(Integer num) {
        this.reviewRating = num;
    }

    public final void setReviewText(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.reviewText = str;
    }

    public final void setTransactionId(String str) {
        this.transactionId = str;
    }

    public final void setTranslatedReview(String str) {
        this.translatedReview = StringEscapeUtils.unescapeHtml4(str);
        this.translationState = new MachineTranslationViewState(str);
    }

    public final void setTranslationState(MachineTranslationViewState machineTranslationViewState) {
        C19383o.m32797g(machineTranslationViewState, "<set-?>");
        this.translationState = machineTranslationViewState;
    }
}
