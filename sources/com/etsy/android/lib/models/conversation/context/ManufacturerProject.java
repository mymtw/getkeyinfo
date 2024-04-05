package com.etsy.android.lib.models.conversation.context;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.BaseModelImage;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8900g;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.apache.commons.lang3.CharUtils;

public class ManufacturerProject extends ConversationContext {
    private static final long serialVersionUID = -5773001994520122614L;
    public String mBudgetCurrency = "";
    public String mBudgetMax = "";
    public String mBudgetMin = "";
    public List<String> mCapabilities;
    public EtsyId mConversationId = new EtsyId();
    public Image mDefaultImage;
    public String mDescription = "";
    public String mDesignerMadeBefore = "";
    public String mDesignerRealName = "";
    public EtsyId mDesignerUserId = new EtsyId();
    public List<String> mDevelopmentMaterials;
    public Map<String, List<ManufacturerProjectCapability>> mHumanReadableCapabilities;
    public List<String> mHumanReadableDevelopmentMaterials;
    public int mIsDeleted;
    public EtsyId mListingId = new EtsyId();
    public List<Image> mListingImages;
    public String mListingTitle = "";
    public String mListingUrl = "";
    public EtsyId mManufacturerId = new EtsyId();
    public String mManufacturerNote = "";
    public String mName = "";
    public EtsyId mProjectId = new EtsyId();
    public List<Image> mProjectImages;
    public String mQuantity = "";
    public String mSearchData = "";
    public String mState = "";
    public long mTimelineDate;
    public int mTimelineFlexible;

    public static class Image extends BaseModelImage {
        public static final Pair<Integer, String>[] IMG_SIZES_ARR = {BaseModelImage.IMG_SIZE_170, BaseModelImage.IMG_SIZE_340, BaseModelImage.IMG_SIZE_FULL};
        private static final long serialVersionUID = -2239394808485199391L;
        public EtsyId mImageId = new EtsyId();

        public Pair<Integer, String>[] getImageSizesArray() {
            return IMG_SIZES_ARR;
        }

        public String getImageUrl() {
            return this.mUrlFullxFull;
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

        public String getUrl170x135() {
            return this.mUrl170x135;
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
                        case -859601281:
                            if (currentName.equals(ResponseConstants.IMAGE_ID)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -736226638:
                            if (currentName.equals(ResponseConstants.URL_340x270)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1869619669:
                            if (currentName.equals(ResponseConstants.URL_170x135)) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.mUrlFullxFull = BaseModel.parseStringURL(jsonParser);
                            break;
                        case 1:
                            this.mImageId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                            break;
                        case 2:
                            this.mUrl340x270 = BaseModel.parseStringURL(jsonParser);
                            break;
                        case 3:
                            this.mUrl170x135 = BaseModel.parseStringURL(jsonParser);
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
    }

    /* renamed from: com.etsy.android.lib.models.conversation.context.ManufacturerProject$a */
    public class C8719a extends C8900g<JsonParser, List<ManufacturerProjectCapability>> {
        public final Object exec(Object obj) {
            try {
                return BaseModel.parseArray((JsonParser) obj, ManufacturerProjectCapability.class);
            } catch (Exception unused) {
                return new ArrayList(0);
            }
        }
    }

    public String getBudgetCurrency() {
        return this.mBudgetCurrency;
    }

    public String getBudgetMax() {
        return this.mBudgetMax;
    }

    public String getBudgetMin() {
        return this.mBudgetMin;
    }

    public Image getDefaultImage() {
        return this.mDefaultImage;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDesignerRealName() {
        return this.mDesignerRealName;
    }

    public EtsyId getDesignerUserId() {
        return this.mDesignerUserId;
    }

    public Map<String, List<ManufacturerProjectCapability>> getHumanReadableCapabilities() {
        if (this.mHumanReadableCapabilities == null) {
            this.mHumanReadableCapabilities = new HashMap(0);
        }
        return this.mHumanReadableCapabilities;
    }

    public List<String> getHumanReadableDevelopmentMaterials() {
        if (this.mHumanReadableDevelopmentMaterials == null) {
            this.mHumanReadableDevelopmentMaterials = new ArrayList(0);
        }
        return this.mHumanReadableDevelopmentMaterials;
    }

    public EtsyId getListingId() {
        return this.mListingId;
    }

    public List<Image> getListingImages() {
        if (this.mListingImages == null) {
            this.mListingImages = new ArrayList(0);
        }
        return this.mListingImages;
    }

    public String getListingTitle() {
        return this.mListingTitle;
    }

    public String getListingUrl() {
        return this.mListingUrl;
    }

    public String getName() {
        return this.mName;
    }

    public List<Image> getProjectImages() {
        if (this.mProjectImages == null) {
            this.mProjectImages = new ArrayList(0);
        }
        return this.mProjectImages;
    }

    public String getQuantity() {
        return this.mQuantity;
    }

    public long getTimelineDate() {
        return this.mTimelineDate;
    }

    public boolean hasDesignerMadeBefore() {
        return this.mDesignerMadeBefore.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public boolean isTimelineFlexible() {
        return this.mTimelineFlexible == 1;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1969970175:
                if (str.equals(ResponseConstants.PROJECT_ID)) {
                    c = 0;
                    break;
                }
                break;
            case -1949106272:
                if (str.equals(ResponseConstants.MANUFACTURER_NOTE)) {
                    c = 1;
                    break;
                }
                break;
            case -1769974548:
                if (str.equals(ResponseConstants.TIMELINE_DATE)) {
                    c = 2;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c = 3;
                    break;
                }
                break;
            case -1531559317:
                if (str.equals(ResponseConstants.CAPABILITIES_HUMAN_READABLE)) {
                    c = 4;
                    break;
                }
                break;
            case -1487597642:
                if (str.equals(ResponseConstants.CAPABILITIES)) {
                    c = 5;
                    break;
                }
                break;
            case -1450653144:
                if (str.equals(ResponseConstants.DEVELOPMENT_MATERIALS)) {
                    c = 6;
                    break;
                }
                break;
            case -1285004149:
                if (str.equals(ResponseConstants.QUANTITY)) {
                    c = 7;
                    break;
                }
                break;
            case -1244194300:
                if (str.equals(ResponseConstants.IS_DELETED)) {
                    c = 8;
                    break;
                }
                break;
            case -1198329195:
                if (str.equals(ResponseConstants.DESIGNER_MADE_BEFORE)) {
                    c = 9;
                    break;
                }
                break;
            case -1085518627:
                if (str.equals(ResponseConstants.LISTING_TITLE)) {
                    c = 10;
                    break;
                }
                break;
            case -689677974:
                if (str.equals(ResponseConstants.BUDGET_MAX)) {
                    c = 11;
                    break;
                }
                break;
            case -689677736:
                if (str.equals(ResponseConstants.BUDGET_MIN)) {
                    c = 12;
                    break;
                }
                break;
            case -655961925:
                if (str.equals(ResponseConstants.DESIGNER_USER_ID)) {
                    c = CharUtils.f44393CR;
                    break;
                }
                break;
            case -539718687:
                if (str.equals(ResponseConstants.SEARCH_DATA)) {
                    c = 14;
                    break;
                }
                break;
            case -419323305:
                if (str.equals(ResponseConstants.CONVERSATION_ID)) {
                    c = 15;
                    break;
                }
                break;
            case -243002312:
                if (str.equals(ResponseConstants.DESIGNER_REAL_NAME)) {
                    c = 16;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 17;
                    break;
                }
                break;
            case 8333833:
                if (str.equals(ResponseConstants.TIMELINE_FLEXIBLE)) {
                    c = 18;
                    break;
                }
                break;
            case 72095161:
                if (str.equals(ResponseConstants.DEVELOPMENT_MATERIALS_HUMAN_READABLE)) {
                    c = 19;
                    break;
                }
                break;
            case 109757585:
                if (str.equals("state")) {
                    c = 20;
                    break;
                }
                break;
            case 396863635:
                if (str.equals(ResponseConstants.LISTING_IMAGES)) {
                    c = 21;
                    break;
                }
                break;
            case 418082889:
                if (str.equals(ResponseConstants.MANUFACTURER_ID)) {
                    c = 22;
                    break;
                }
                break;
            case 593284404:
                if (str.equals(ResponseConstants.LISTING_URL)) {
                    c = 23;
                    break;
                }
                break;
            case 677197406:
                if (str.equals(ResponseConstants.PROJECT_IMAGES)) {
                    c = 24;
                    break;
                }
                break;
            case 988969142:
                if (str.equals("listing_id")) {
                    c = 25;
                    break;
                }
                break;
            case 1307012573:
                if (str.equals(ResponseConstants.DEFAULT_IMAGE)) {
                    c = 26;
                    break;
                }
                break;
            case 2067189707:
                if (str.equals(ResponseConstants.BUDGET_CURRENCY)) {
                    c = 27;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mProjectId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 1:
                this.mManufacturerNote = BaseModel.parseString(jsonParser);
                break;
            case 2:
                this.mTimelineDate = jsonParser.getValueAsLong() * 1000;
                break;
            case 3:
                this.mDescription = BaseModel.parseString(jsonParser);
                break;
            case 4:
                this.mHumanReadableCapabilities = BaseModel.parseMap(jsonParser, BaseModel.defaultKeyMapper(), new C8719a());
                break;
            case 5:
                this.mCapabilities = BaseModel.parseStringArray(jsonParser);
                break;
            case 6:
                this.mDevelopmentMaterials = BaseModel.parseStringArray(jsonParser);
                break;
            case 7:
                this.mQuantity = BaseModel.parseString(jsonParser);
                break;
            case 8:
                this.mIsDeleted = jsonParser.getValueAsInt();
                break;
            case 9:
                this.mDesignerMadeBefore = BaseModel.parseString(jsonParser);
                break;
            case 10:
                this.mListingTitle = BaseModel.parseString(jsonParser);
                break;
            case 11:
                this.mBudgetMax = BaseModel.parseString(jsonParser);
                break;
            case 12:
                this.mBudgetMin = BaseModel.parseString(jsonParser);
                break;
            case 13:
                this.mDesignerUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 14:
                this.mSearchData = BaseModel.parseString(jsonParser);
                break;
            case 15:
                this.mConversationId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 16:
                this.mDesignerRealName = BaseModel.parseString(jsonParser);
                break;
            case 17:
                this.mName = BaseModel.parseString(jsonParser);
                break;
            case 18:
                this.mTimelineFlexible = jsonParser.getValueAsInt();
                break;
            case 19:
                this.mHumanReadableDevelopmentMaterials = BaseModel.parseStringArray(jsonParser);
                break;
            case 20:
                this.mState = BaseModel.parseString(jsonParser);
                break;
            case 21:
                this.mListingImages = BaseModel.parseArray(jsonParser, Image.class);
                break;
            case 22:
                this.mManufacturerId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 23:
                this.mListingUrl = BaseModel.parseStringURL(jsonParser);
                break;
            case 24:
                this.mProjectImages = BaseModel.parseArray(jsonParser, Image.class);
                break;
            case 25:
                this.mListingId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                break;
            case 26:
                this.mDefaultImage = (Image) BaseModel.parseObject(jsonParser, Image.class);
                break;
            case 27:
                this.mBudgetCurrency = BaseModel.parseString(jsonParser);
                break;
            default:
                return false;
        }
        return true;
    }
}
