package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.BaseModelImage;
import com.etsy.android.lib.models.ImageSizes;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShortenedUrl;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.AppreciationPhotoLike;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import p628nj.C18263b;

public class AppreciationPhoto extends BaseModelImage implements AppreciationPhotoLike {
    private static final String ACTIVE = "active";
    public static final Pair<Integer, String>[] IMG_SIZES_ARR = {ImageSizes.IMG_SIZE_75, ImageSizes.IMG_SIZE_300, ImageSizes.IMG_SIZE_640, ImageSizes.IMG_SIZE_FULL};
    public static final Pair<Integer, String> IMG_SIZE_640 = new Pair<>(640, "640x640");
    private static final long serialVersionUID = -4615967532699006555L;
    public Date mCreateDate;
    public EtsyId mImageId = new EtsyId();
    public boolean mIsSellerApproved;
    public String mListingTitle = "";
    public String mSellerAvatarUrl = "";
    public String mShopName = "";
    public ShortenedUrl mShortenedShareUrl;
    public String mStatus;
    public EtsyId mTransactionId = new EtsyId();

    public static String buildShareUrl(EtsyId etsyId) {
        StringBuilder sb = new StringBuilder();
        List<String> list = C8591a.f18700r;
        sb.append(C18263b.f40056T.f18706f.mo21136f(C8592b.f18819p0));
        sb.append("/transaction/");
        sb.append(etsyId.getId());
        sb.append("/buyer-photo");
        return sb.toString();
    }

    public AppreciationPhoto copy() {
        AppreciationPhoto appreciationPhoto = new AppreciationPhoto();
        appreciationPhoto.from(this);
        appreciationPhoto.mImageId = this.mImageId;
        appreciationPhoto.mTransactionId = this.mTransactionId;
        appreciationPhoto.mIsSellerApproved = this.mIsSellerApproved;
        appreciationPhoto.mStatus = this.mStatus;
        appreciationPhoto.mCreateDate = new Date(this.mCreateDate.getTime());
        appreciationPhoto.mShortenedShareUrl = this.mShortenedShareUrl;
        appreciationPhoto.mShopName = this.mShopName;
        appreciationPhoto.mSellerAvatarUrl = this.mSellerAvatarUrl;
        appreciationPhoto.mListingTitle = this.mListingTitle;
        return appreciationPhoto;
    }

    public Date getCreatedDate() {
        return this.mCreateDate;
    }

    public EtsyId getImageId() {
        return this.mImageId;
    }

    public Pair<Integer, String>[] getImageSizesArray() {
        return IMG_SIZES_ARR;
    }

    public String getImageUrl() {
        return replaceImageUrlWithSize(IMG_SIZE_640.getSecond());
    }

    public String getImageUrlForPixelWidth(int i) {
        for (Pair pair : getImageSizesArray()) {
            if (i <= ((Integer) pair.getFirst()).intValue()) {
                return replaceImageUrlWithSize((String) pair.getSecond());
            }
        }
        return this.mUrlFullxFull;
    }

    public String getLargestDimension() {
        return BaseModelImage.IMG_SIZE_FULL.getSecond();
    }

    public String getListingTitle() {
        return this.mListingTitle;
    }

    public String getSellerAvatarUrl() {
        return this.mSellerAvatarUrl;
    }

    public String getShareImageUrl() {
        return getImageUrl();
    }

    public String getShopName() {
        return this.mShopName;
    }

    public ShortenedUrl getShortenedShareUrl() {
        return this.mShortenedShareUrl;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public EtsyId getTransactionId() {
        return this.mTransactionId;
    }

    public boolean isActive() {
        String str = this.mStatus;
        return str != null && str.equals("active");
    }

    public boolean isSellerApproved() {
        return this.mIsSellerApproved;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2078324984:
                        if (currentName.equals(ResponseConstants.URL_FULLxFULL)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1131866526:
                        if (currentName.equals(ResponseConstants.IS_SELLER_APPROVED)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -892481550:
                        if (currentName.equals(ResponseConstants.STATUS)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -859601281:
                        if (currentName.equals(ResponseConstants.IMAGE_ID)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -494058223:
                        if (currentName.equals(ResponseConstants.CREATE_DATE)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1010584092:
                        if (currentName.equals(ResponseConstants.TRANSACTION_ID)) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mUrlFullxFull = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 1:
                        this.mIsSellerApproved = jsonParser.getValueAsBoolean();
                        break;
                    case 2:
                        this.mStatus = BaseModel.parseString(jsonParser);
                        break;
                    case 3:
                        this.mImageId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 4:
                        this.mCreateDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    case 5:
                        this.mTransactionId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setFullHeight(int i) {
    }

    public void setFullWidth(int i) {
    }

    public void setImageColor(int i) {
    }

    public void setImageId(EtsyId etsyId) {
        this.mImageId = etsyId;
    }

    public void setIsSellerApproved(boolean z) {
        this.mIsSellerApproved = z;
    }

    public void setListingTitle(String str) {
        this.mListingTitle = str;
    }

    public void setSellerAvatarUrl(String str) {
        this.mSellerAvatarUrl = str;
    }

    public void setShopName(String str) {
        this.mShopName = str;
    }

    public void setShortenedShareUrl(ShortenedUrl shortenedUrl) {
        this.mShortenedShareUrl = shortenedUrl;
    }

    public void setStatus(String str) {
        this.mStatus = str;
    }

    public void setTransactionId(EtsyId etsyId) {
        this.mTransactionId = etsyId;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.TRANSACTION_ID, this.mTransactionId.getId());
        hashMap.put(PredefinedAnalyticsProperty.IMAGE_ID, this.mImageId.getId());
        return hashMap;
    }
}
