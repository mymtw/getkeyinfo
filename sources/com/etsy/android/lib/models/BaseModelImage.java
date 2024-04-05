package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.util.C8885d0;
import kotlin.Pair;

public abstract class BaseModelImage extends BaseModel implements IFullImage, BaseModelImageCompat {
    public static final int DEFAULT_LOADING_COLOR = -1842209;
    public static final Pair<Integer, String>[] IMG_SIZES_ARRAY = {ImageSizes.IMG_SIZE_75, ImageSizes.IMG_SIZE_170, ImageSizes.IMG_SIZE_224, ImageSizes.IMG_SIZE_300, ImageSizes.IMG_SIZE_340, ImageSizes.IMG_SIZE_570, ImageSizes.IMG_SIZE_680};
    public static final Pair<Integer, String> IMG_SIZE_170 = new Pair<>(170, "170x135");
    public static final Pair<Integer, String> IMG_SIZE_340 = new Pair<>(340, "340x270");
    public static final Pair<Integer, String> IMG_SIZE_570 = new Pair<>(570, "570xN");
    public static final Pair<Integer, String> IMG_SIZE_75 = new Pair<>(75, "75x75");
    public static final Pair<Integer, String> IMG_SIZE_FULL = new Pair<>(0, "fullxfull");
    public String altText = null;
    public String mUrl170x135 = "";
    public String mUrl224xN = "";
    public String mUrl300x300 = "";
    public String mUrl340x270 = "";
    public String mUrl570xN = "";
    public String mUrl680x540 = "";
    public String mUrl75x75 = "";
    public String mUrlFullxFull = "";

    public void from(BaseModelImage baseModelImage) {
        if (baseModelImage != null) {
            this.mUrl75x75 = baseModelImage.mUrl75x75;
            this.mUrl170x135 = baseModelImage.mUrl170x135;
            this.mUrl224xN = baseModelImage.mUrl224xN;
            this.mUrl340x270 = baseModelImage.mUrl340x270;
            this.mUrl570xN = baseModelImage.mUrl570xN;
            this.mUrlFullxFull = baseModelImage.mUrlFullxFull;
            this.mUrl300x300 = baseModelImage.mUrl300x300;
            this.mUrl680x540 = baseModelImage.mUrl680x540;
        }
    }

    public String get4to3ImageUrlForPixelWidth(int i) {
        return null;
    }

    public String getAltText() {
        return this.altText;
    }

    public int getFullHeight() {
        return -1;
    }

    public String getFullHeightImageUrlForPixelWidth(int i) {
        return null;
    }

    public String getFullSizedImage() {
        return replaceImageUrlWithSize(IMG_SIZE_FULL.getSecond());
    }

    public int getFullWidth() {
        return -1;
    }

    public int getImageColor() {
        return 0;
    }

    public EtsyId getImageId() {
        return null;
    }

    public abstract Pair<Integer, String>[] getImageSizesArray();

    public abstract String getLargestDimension();

    public String getReplaceDimensionForWidth(int i) {
        String str;
        int i2 = 0;
        while (true) {
            if (i2 >= getImageSizesArray().length) {
                str = null;
                break;
            } else if (i <= ((Integer) getImageSizesArray()[i2].getFirst()).intValue()) {
                str = (String) getImageSizesArray()[i2].getSecond();
                break;
            } else {
                i2++;
            }
        }
        return str == null ? getLargestDimension() : str;
    }

    public String getUrl170x135() {
        return this.mUrl170x135;
    }

    public String getUrl224xN() {
        return this.mUrl224xN;
    }

    public String getUrl300x300() {
        return this.mUrl300x300;
    }

    public String getUrl340x270() {
        return this.mUrl340x270;
    }

    public String getUrl570xN() {
        return this.mUrl570xN;
    }

    public String getUrl680x540() {
        return this.mUrl680x540;
    }

    public String getUrl75x75() {
        return this.mUrl75x75;
    }

    public String getUrlFullxFull() {
        return this.mUrlFullxFull;
    }

    public String replaceImageUrlWithSize(String str) {
        if (C8885d0.m17324h(this.mUrl75x75)) {
            return this.mUrl75x75.replace(IMG_SIZE_75.getSecond(), str);
        }
        if (C8885d0.m17324h(this.mUrl170x135)) {
            return this.mUrl170x135.replace(IMG_SIZE_170.getSecond(), str);
        }
        if (C8885d0.m17324h(this.mUrl570xN)) {
            return this.mUrl570xN.replace(IMG_SIZE_570.getSecond(), str);
        }
        if (C8885d0.m17324h(this.mUrlFullxFull)) {
            return this.mUrlFullxFull.replace(IMG_SIZE_FULL.getSecond(), str);
        }
        return null;
    }

    public void setAltText(String str) {
        this.altText = str;
    }

    public void setUrl170x135(String str) {
        this.mUrl170x135 = str;
    }

    public void setUrl224xN(String str) {
        this.mUrl224xN = str;
    }

    public void setUrl300x300(String str) {
        this.mUrl300x300 = str;
    }

    public void setUrl340x270(String str) {
        this.mUrl340x270 = str;
    }

    public void setUrl570xN(String str) {
        this.mUrl570xN = str;
    }

    public void setUrl680x540(String str) {
        this.mUrl680x540 = str;
    }

    public void setUrl75x75(String str) {
        this.mUrl75x75 = str;
    }

    public void setUrlFullxFull(String str) {
        this.mUrlFullxFull = str;
    }
}
