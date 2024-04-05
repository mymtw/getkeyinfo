package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.AppreciationPhoto;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.Video;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.uikit.util.MachineTranslationViewState;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.HashMap;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.StringEscapeUtils;

public class Review extends BaseModel {
    public static final int BAD_RATING = 3;
    public static final int MAX_RATING = 5;
    public static final int MIN_RATING = 1;
    public static final int MIN_WORDS = 5;
    private static final long serialVersionUID = 200103804358240208L;
    public Video appreciationVideo;
    public AppreciationPhoto mAppreciationPhoto;
    public boolean mIsListingDisplayable;
    public Listing mListing;
    public EtsyId mListingId;
    public ListingImage mListingImage;
    public String mListingImageUrl;
    public String mListingTitle;
    public int mRating;
    public ReviewResponse mResponse;
    public String mReviewLanguage;
    public String mReviewMessage;
    public MachineTranslationViewState mReviewTranslationState;
    public EtsyId mTransactionId;
    public String translatedReview;

    public Review() {
        this.mReviewMessage = "";
        this.translatedReview = null;
        this.mListingTitle = "";
        this.mListingImageUrl = "";
        this.mReviewLanguage = "";
        this.mReviewTranslationState = new MachineTranslationViewState();
        this.mListingId = new EtsyId();
        this.mTransactionId = new EtsyId();
    }

    public Review copy() {
        Review review = new Review();
        review.mTransactionId = this.mTransactionId;
        review.mRating = this.mRating;
        review.mReviewMessage = this.mReviewMessage;
        review.mListingId = this.mListingId;
        review.mListingTitle = this.mListingTitle;
        review.mListingImageUrl = this.mListingImageUrl;
        AppreciationPhoto appreciationPhoto = this.mAppreciationPhoto;
        ListingImage listingImage = null;
        review.mAppreciationPhoto = appreciationPhoto == null ? null : appreciationPhoto.copy();
        Video video = this.appreciationVideo;
        review.appreciationVideo = video == null ? null : video.copy();
        ReviewResponse reviewResponse = this.mResponse;
        review.mResponse = reviewResponse == null ? null : reviewResponse.copy();
        review.mListing = this.mListing;
        review.mReviewLanguage = this.mReviewLanguage;
        MachineTranslationViewState machineTranslationViewState = this.mReviewTranslationState;
        review.mReviewTranslationState = machineTranslationViewState == null ? null : machineTranslationViewState.copy(this.translatedReview);
        review.translatedReview = this.translatedReview;
        review.mIsListingDisplayable = this.mIsListingDisplayable;
        ListingImage listingImage2 = this.mListingImage;
        if (listingImage2 != null) {
            listingImage = listingImage2.copyCompat();
        }
        review.mListingImage = listingImage;
        return review;
    }

    public AppreciationPhoto getAppreciationPhoto() {
        return this.mAppreciationPhoto;
    }

    public Video getAppreciationVideo() {
        return this.appreciationVideo;
    }

    public Listing getListing() {
        return this.mListing;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public ListingImage getListingImage() {
        return this.mListingImage;
    }

    public String getListingImageUrl() {
        return this.mListingImageUrl;
    }

    public String getListingTitle() {
        return this.mListingTitle;
    }

    public int getRating() {
        return this.mRating;
    }

    public String getResponse() {
        return hasResponse() ? this.mResponse.getMessage() : "";
    }

    public String getReviewLanguage() {
        return this.mReviewLanguage;
    }

    public String getReviewMessage() {
        return this.mReviewMessage;
    }

    public ReviewResponse getReviewResponse() {
        return this.mResponse;
    }

    public EtsyId getTransactionId() {
        return this.mTransactionId;
    }

    public String getTranslatedReview() {
        return this.translatedReview;
    }

    public MachineTranslationViewState getTranslationState() {
        return this.mReviewTranslationState;
    }

    public boolean hasAppreciationPhoto() {
        AppreciationPhoto appreciationPhoto = this.mAppreciationPhoto;
        return appreciationPhoto != null && this.mRating == 5 && appreciationPhoto.isActive();
    }

    public boolean hasResponse() {
        ReviewResponse reviewResponse = this.mResponse;
        return reviewResponse != null && C8885d0.m17324h(reviewResponse.getMessage());
    }

    public boolean isListingDisplayable() {
        return this.mIsListingDisplayable;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2134044643:
                        if (currentName.equals("review_translated")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1613589672:
                        if (currentName.equals("language")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1095576608:
                        if (currentName.equals(ResponseConstants.LISTING_IMAGE)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1085518627:
                        if (currentName.equals(ResponseConstants.LISTING_TITLE)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1080895344:
                        if (currentName.equals(ResponseConstants.LISTING_IMAGE_URL)) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1059040948:
                        if (currentName.equals(ResponseConstants.IS_LISTING_DISPLAYABLE)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -938102371:
                        if (currentName.equals(ResponseConstants.RATING)) {
                            c = 6;
                            break;
                        }
                        break;
                    case -934348968:
                        if (currentName.equals("review")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -340323263:
                        if (currentName.equals(ResponseConstants.RESPONSE)) {
                            c = 8;
                            break;
                        }
                        break;
                    case 181975684:
                        if (currentName.equals(ResponseConstants.LISTING)) {
                            c = 9;
                            break;
                        }
                        break;
                    case 988969142:
                        if (currentName.equals("listing_id")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1010584092:
                        if (currentName.equals(ResponseConstants.TRANSACTION_ID)) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1060712215:
                        if (currentName.equals(ResponseConstants.Includes.APPRECIATION_PHOTO)) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1412375726:
                        if (currentName.equals(ResponseConstants.APPRECIATION_PHOTO)) {
                            c = CharUtils.f44393CR;
                            break;
                        }
                        break;
                    case 1417935607:
                        if (currentName.equals(ResponseConstants.APPRECIATION_VIDEO)) {
                            c = 14;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        setTranslatedReview(BaseModel.parseString(jsonParser));
                        break;
                    case 1:
                        this.mReviewLanguage = BaseModel.parseString(jsonParser).trim();
                        break;
                    case 2:
                        this.mListingImage = (ListingImage) BaseModel.parseObject(jsonParser, ListingImage.class);
                        break;
                    case 3:
                        this.mListingTitle = BaseModel.parseString(jsonParser).trim();
                        break;
                    case 4:
                        this.mListingImageUrl = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 5:
                        this.mIsListingDisplayable = jsonParser.getValueAsBoolean();
                        break;
                    case 6:
                        this.mRating = jsonParser.getValueAsInt();
                        break;
                    case 7:
                        setReviewMessage(BaseModel.parseString(jsonParser));
                        break;
                    case 8:
                        this.mResponse = (ReviewResponse) BaseModel.parseObject(jsonParser, ReviewResponse.class);
                        break;
                    case 9:
                        this.mListing = (Listing) BaseModel.parseObject(jsonParser, Listing.class);
                        break;
                    case 10:
                        this.mListingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 11:
                        this.mTransactionId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 12:
                    case 13:
                        this.mAppreciationPhoto = (AppreciationPhoto) BaseModel.parseObject(jsonParser, AppreciationPhoto.class);
                        break;
                    case 14:
                        this.appreciationVideo = (Video) BaseModel.parseObject(jsonParser, Video.class);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setAppreciationPhoto(AppreciationPhoto appreciationPhoto) {
        this.mAppreciationPhoto = appreciationPhoto;
    }

    public void setAppreciationVideo(Video video) {
        this.appreciationVideo = video;
    }

    public void setListingDisplayable(boolean z) {
        this.mIsListingDisplayable = z;
    }

    public void setListingId(EtsyId etsyId) {
        this.mListingId = etsyId;
    }

    public void setListingImageUrl(String str) {
        this.mListingImageUrl = str;
    }

    public void setListingTitle(String str) {
        this.mListingTitle = str;
    }

    public void setRating(int i) {
        this.mRating = i;
    }

    public void setReviewLanguage(String str) {
        this.mReviewLanguage = str;
    }

    public void setReviewMessage(String str) {
        this.mReviewMessage = StringEscapeUtils.unescapeHtml4(str != null ? str.trim() : "");
    }

    public void setReviewResponse(ReviewResponse reviewResponse) {
        this.mResponse = reviewResponse;
    }

    public void setTransactionId(EtsyId etsyId) {
        this.mTransactionId = etsyId;
    }

    public void setTranslatedReview(String str) {
        this.translatedReview = StringEscapeUtils.unescapeHtml4(str != null ? str.trim() : "");
        MachineTranslationViewState machineTranslationViewState = this.mReviewTranslationState;
        if (machineTranslationViewState == null) {
            this.mReviewTranslationState = new MachineTranslationViewState(str);
        } else if (str != null) {
            machineTranslationViewState.setTranslated();
        } else {
            machineTranslationViewState.setUntranslated();
        }
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.TRANSACTION_ID, this.mTransactionId.getId());
        return hashMap;
    }

    public Review(int i, String str) {
        this.mReviewMessage = "";
        this.translatedReview = null;
        this.mListingTitle = "";
        this.mListingImageUrl = "";
        this.mReviewLanguage = "";
        this.mReviewTranslationState = new MachineTranslationViewState();
        this.mRating = i;
        this.mReviewMessage = str;
        this.mListingId = new EtsyId();
        this.mTransactionId = new EtsyId();
    }
}
