package com.etsy.android.lib.models;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Transaction extends BaseModel {
    public static final long serialVersionUID = 9088323166398192522L;
    public EtsyId mBuyerUserId = new EtsyId();
    public String mCurrencyCode = "";
    public Date mFeedbackOpenDate;
    public GiftCardDesign mGiftCardDesign;
    public GiftCardInfo mGiftCardInfo;
    public Image mImage;
    public boolean mIsFeedbackMutable;
    public boolean mIsGiftCard;
    public Listing mListing;
    public EtsyId mListingId = new EtsyId();
    public ListingImage mMainImage;
    public double mPrice;
    public int mQuantity;
    public Review mReview;
    public User mSeller;
    public String mTitle = "";
    public EtsyId mTransactionId = new EtsyId();
    public List<Variation> mVariations = new ArrayList(0);

    public boolean equals(Object obj) {
        return obj instanceof Transaction ? ((Transaction) obj).getTransactionId().equals(getTransactionId()) : super.equals(obj);
    }

    public EtsyId getBuyerUserId() {
        return this.mBuyerUserId;
    }

    public String getCurrencyCode() {
        return this.mCurrencyCode;
    }

    public Date getFeedbackOpenDate() {
        return this.mFeedbackOpenDate;
    }

    public String getFormattedPrice() {
        return C8630b.f18964e.mo21248a(Double.toString(getPrice()), getCurrencyCode()).format();
    }

    public GiftCardDesign getGiftCardDesign() {
        return this.mGiftCardDesign;
    }

    public GiftCardInfo getGiftCardInfo() {
        return this.mGiftCardInfo;
    }

    public Image getImage() {
        return this.mImage;
    }

    public Listing getListing() {
        return this.mListing;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    @Deprecated
    public ListingImage getMainImage() {
        return this.mMainImage;
    }

    public double getPrice() {
        return this.mPrice;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public Review getReview() {
        return this.mReview;
    }

    public User getSeller() {
        return this.mSeller;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public EtsyId getTransactionId() {
        return this.mTransactionId;
    }

    public List<Variation> getVariations() {
        return this.mVariations;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mFeedbackOpenDate;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasFutureReviewDate() {
        /*
            r2 = this;
            boolean r0 = r2.mIsGiftCard
            if (r0 != 0) goto L_0x0015
            java.util.Date r0 = r2.mFeedbackOpenDate
            if (r0 == 0) goto L_0x0015
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            boolean r0 = r0.after(r1)
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.Transaction.hasFutureReviewDate():boolean");
    }

    public boolean hasVariations() {
        List<Variation> list = this.mVariations;
        return list != null && list.size() > 0;
    }

    public int hashCode() {
        return this.mTransactionId.hashCode();
    }

    public boolean isFeedbackMutable() {
        return this.mIsFeedbackMutable;
    }

    public boolean isGiftCard() {
        return this.mIsGiftCard;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.PRICE.equals(currentName)) {
                    this.mPrice = jsonParser.getValueAsDouble();
                } else if (ResponseConstants.CURRENCY_CODE.equals(currentName)) {
                    this.mCurrencyCode = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.QUANTITY.equals(currentName)) {
                    this.mQuantity = jsonParser.getValueAsInt();
                } else if (ResponseConstants.TRANSACTION_ID.equals(currentName)) {
                    this.mTransactionId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if ("listing_id".equals(currentName)) {
                    this.mListingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.IS_GIFT_CARD.equals(currentName)) {
                    this.mIsGiftCard = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.IS_FEEDBACK_MUTABLE.equals(currentName)) {
                    this.mIsFeedbackMutable = jsonParser.getValueAsBoolean();
                } else if ("title".equals(currentName)) {
                    this.mTitle = BaseModel.parseString(jsonParser);
                } else if (currentName.equals("main_image") || ResponseConstants.Includes.MAINIMAGE.equals(currentName)) {
                    this.mMainImage = (ListingImage) BaseModel.parseObject(jsonParser, ListingImage.class);
                } else if (ResponseConstants.IMAGE.equals(currentName)) {
                    this.mImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
                } else if (ResponseConstants.VARIATIONS.equals(currentName)) {
                    this.mVariations = BaseModel.parseArray(jsonParser, Variation.class);
                } else if (currentName.equals(ResponseConstants.LISTING) || ResponseConstants.LISTING_V2.equals(currentName)) {
                    this.mListing = (Listing) BaseModel.parseObject(jsonParser, Listing.class);
                } else if (ResponseConstants.FEEDBACK_OPEN_DATE.equals(currentName)) {
                    long valueAsLong = jsonParser.getValueAsLong();
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(valueAsLong * 1000);
                    this.mFeedbackOpenDate = instance.getTime();
                } else if (ResponseConstants.GIFT_CARD_INFO.equals(currentName)) {
                    if (jsonParser.getCurrentToken() != JsonToken.START_ARRAY) {
                        this.mGiftCardInfo = (GiftCardInfo) BaseModel.parseObject(jsonParser, GiftCardInfo.class);
                    } else if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                        this.mGiftCardInfo = (GiftCardInfo) BaseModel.parseObject(jsonParser, GiftCardInfo.class);
                        return;
                    }
                } else if (currentName.equals("gift_card_design") || ResponseConstants.Includes.GIFT_CARD_DESIGN.equals(currentName)) {
                    this.mGiftCardDesign = new GiftCardDesign().parseData(jsonParser);
                } else if (currentName.equals("user_review") || ResponseConstants.Includes.USER_REVIEW.equals(currentName) || "review".equals(currentName)) {
                    this.mReview = (Review) BaseModel.parseObject(jsonParser, Review.class);
                } else if (ResponseConstants.Includes.SELLER.equals(currentName)) {
                    this.mSeller = (User) BaseModel.parseObject(jsonParser, User.class);
                } else if (ResponseConstants.BUYER_USER_ID.equals(currentName)) {
                    this.mBuyerUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setReview(Review review) {
        this.mReview = review;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.TRANSACTION_ID, this.mTransactionId.getId());
        return hashMap;
    }
}
