package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiptReview extends BaseModel {
    private static final long serialVersionUID = 5105434964070945926L;
    public Date mDate;
    public EtsyId mReceiptId = new EtsyId();
    public List<Review> mReviews = new ArrayList(0);
    public String mUserAvatarUrl = "";
    public EtsyId mUserId = new EtsyId();
    public String mUserLoginName = "";
    public String mUserRealName = "";

    public ReceiptReview cloneWithSingleReview(Review review) {
        ReceiptReview receiptReview = new ReceiptReview();
        receiptReview.mReceiptId = new EtsyId(this.mReceiptId.getId());
        receiptReview.mDate = new Date(this.mDate.getTime());
        receiptReview.mUserId = new EtsyId(this.mUserId.getId());
        receiptReview.mUserAvatarUrl = this.mUserAvatarUrl;
        receiptReview.mUserRealName = this.mUserRealName;
        receiptReview.mUserLoginName = this.mUserLoginName;
        ArrayList arrayList = new ArrayList();
        receiptReview.mReviews = arrayList;
        arrayList.add(review.copy());
        return receiptReview;
    }

    public boolean containsReviewForListing(EtsyId etsyId) {
        List<Review> reviews = getReviews();
        if (reviews == null || reviews.size() <= 0) {
            return false;
        }
        for (Review listingId : reviews) {
            if (listingId.getListingId().equals(etsyId)) {
                return true;
            }
        }
        return false;
    }

    public Date getDate() {
        return this.mDate;
    }

    public EtsyId getReceiptId() {
        return this.mReceiptId;
    }

    public List<Review> getReviews() {
        return this.mReviews;
    }

    public String getUserAvatarUrl() {
        return this.mUserAvatarUrl;
    }

    public String getUserDisplayName() {
        return C8885d0.m17323g(this.mUserRealName) ? this.mUserRealName : this.mUserLoginName;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public String getUserLoginName() {
        return this.mUserLoginName;
    }

    public String getUserRealName() {
        return this.mUserRealName;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if (ResponseConstants.RECEIPT_ID.equals(currentName)) {
                    this.mReceiptId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.BUYER_USER_ID.equals(currentName)) {
                    this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.BUYER_REAL_NAME.equals(currentName)) {
                    this.mUserRealName = BaseModel.parseString(jsonParser);
                } else if ("buyer_login_name".equals(currentName)) {
                    this.mUserLoginName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.BUYER_AVATAR_URL.equals(currentName)) {
                    this.mUserAvatarUrl = BaseModel.parseStringURL(jsonParser);
                } else if ("date".equals(currentName)) {
                    this.mDate = BaseModel.parseIntoDate(jsonParser);
                } else if (ResponseConstants.REVIEWS.equals(currentName)) {
                    this.mReviews = BaseModel.parseArray(jsonParser, Review.class);
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public void setReviews(List<Review> list) {
        this.mReviews = list;
    }

    public void setUserAvatarUrl(String str) {
        this.mUserAvatarUrl = str;
    }

    public void setUserId(EtsyId etsyId) {
        this.mUserId = etsyId;
    }

    public void setUserLoginName(String str) {
        this.mUserLoginName = str;
    }

    public void setUserRealName(String str) {
        this.mUserRealName = str;
    }
}
