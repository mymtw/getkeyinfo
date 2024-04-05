package com.etsy.android.lib.models;

import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.Pair;

public class ImageUrl extends BaseModelImage {
    private static final long serialVersionUID = -457466355359540088L;
    private String mUrl;

    public ImageUrl(String str) {
        this.mUrl = str;
    }

    public Pair<Integer, String>[] getImageSizesArray() {
        return BaseModelImage.IMG_SIZES_ARRAY;
    }

    public String getImageUrl() {
        return this.mUrl;
    }

    public String getImageUrlForPixelWidth(int i) {
        return this.mUrl.replace(BaseModelImage.IMG_SIZE_FULL.getSecond(), getReplaceDimensionForWidth(i));
    }

    public String getLargestDimension() {
        return BaseModelImage.IMG_SIZE_FULL.getSecond();
    }

    public void parseData(JsonParser jsonParser) throws IOException {
    }

    public void setFullHeight(int i) {
    }

    public void setFullWidth(int i) {
    }

    public void setImageColor(int i) {
    }
}
