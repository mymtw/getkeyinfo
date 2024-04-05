package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.BaseModelImage;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import kotlin.Pair;

public class ShopIcon extends BaseModelImage {
    public static final String DEFAULT_SHOP_ICON_FULL = "https://www.etsy.com/images/avatars/default_shop_icon_fullxfull.png";
    public static final Pair<Integer, String>[] IMG_SIZES_ARR;
    public static final Pair<Integer, String> IMG_SIZE_280;
    public static final Pair<Integer, String> IMG_SIZE_75;
    public static final Pair<Integer, String> IMG_SIZE_FULL;
    private static final long serialVersionUID = 8065727694601420688L;
    public EtsyId mId;
    public String mUrl280x280;

    static {
        Pair<Integer, String> pair = new Pair<>(75, "75x75");
        IMG_SIZE_75 = pair;
        Pair<Integer, String> pair2 = new Pair<>(280, "280x280");
        IMG_SIZE_280 = pair2;
        Pair<Integer, String> pair3 = new Pair<>(0, "fullxfull");
        IMG_SIZE_FULL = pair3;
        IMG_SIZES_ARR = new Pair[]{pair, pair2, pair3};
    }

    public ShopIcon() {
        this.mUrl280x280 = "";
        this.mId = new EtsyId();
    }

    public static String getDefaultShopUrlForPixelWidth(int i) {
        Pair<Integer, String> pair = IMG_SIZE_75;
        if (i <= pair.getFirst().intValue()) {
            return DEFAULT_SHOP_ICON_FULL.replace(IMG_SIZE_FULL.getSecond(), pair.getSecond());
        }
        Pair<Integer, String> pair2 = IMG_SIZE_280;
        return i <= pair2.getFirst().intValue() ? DEFAULT_SHOP_ICON_FULL.replace(IMG_SIZE_FULL.getSecond(), pair2.getSecond()) : DEFAULT_SHOP_ICON_FULL;
    }

    private void setUrls(String str) {
        Pair<Integer, String> pair = IMG_SIZE_FULL;
        this.mUrl75x75 = str.replace(pair.getSecond(), IMG_SIZE_75.getSecond());
        this.mUrl280x280 = str.replace(pair.getSecond(), IMG_SIZE_280.getSecond());
    }

    public EtsyId getImageId() {
        return this.mId;
    }

    public Pair<Integer, String>[] getImageSizesArray() {
        return IMG_SIZES_ARR;
    }

    public String getImageUrl() {
        return getImageUrlForPixelWidth(IMG_SIZE_75.getFirst().intValue());
    }

    public String getImageUrlForPixelWidth(int i) {
        return i == IMG_SIZE_FULL.getFirst().intValue() ? this.mUrlFullxFull : i <= IMG_SIZE_75.getFirst().intValue() ? this.mUrl75x75 : i <= IMG_SIZE_280.getFirst().intValue() ? this.mUrl280x280 : this.mUrlFullxFull;
    }

    public String getLargestDimension() {
        return IMG_SIZE_FULL.getSecond();
    }

    public String getReplaceDimensionForWidth(int i) {
        return super.getReplaceDimensionForWidth(i);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                if (currentName.equals(ResponseConstants.IMAGE_ID)) {
                    this.mId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (!currentName.equals("url")) {
                    jsonParser.skipChildren();
                } else {
                    String parseStringURL = BaseModel.parseStringURL(jsonParser);
                    this.mUrlFullxFull = parseStringURL;
                    setUrls(parseStringURL);
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

    public ShopIcon(String str) {
        this(new EtsyId(), str);
    }

    public ShopIcon(EtsyId etsyId, String str) {
        this.mUrl280x280 = "";
        this.mId = etsyId;
        this.mUrlFullxFull = str;
        if (str != null) {
            setUrls(str);
        }
    }
}
