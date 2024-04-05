package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModelImage;
import com.fasterxml.jackson.core.JsonParser;
import com.google.logging.type.LogSeverity;
import java.io.IOException;
import kotlin.Pair;

public class UserAvatar extends BaseModelImage {
    public static final Pair<Integer, String>[] IMG_SIZES_ARR;
    public static final Pair<Integer, String> IMG_SIZE_400;
    public static final Pair<Integer, String> IMG_SIZE_75;
    private static final long serialVersionUID = -3839220856434950431L;
    public String mUrl400x400 = "";

    static {
        Pair<Integer, String> pair = new Pair<>(75, "75x75");
        IMG_SIZE_75 = pair;
        Pair<Integer, String> pair2 = new Pair<>(Integer.valueOf(LogSeverity.WARNING_VALUE), "400x400");
        IMG_SIZE_400 = pair2;
        IMG_SIZES_ARR = new Pair[]{pair, pair2};
    }

    public UserAvatar() {
    }

    public Pair<Integer, String>[] getImageSizesArray() {
        return IMG_SIZES_ARR;
    }

    public String getImageUrl() {
        return getImageUrlForPixelWidth(IMG_SIZE_75.getFirst().intValue());
    }

    public String getImageUrlForPixelWidth(int i) {
        return i <= IMG_SIZE_75.getFirst().intValue() ? this.mUrl75x75 : this.mUrl400x400;
    }

    public String getLargestDimension() {
        return IMG_SIZE_400.getSecond();
    }

    public String getReplaceDimensionForWidth(int i) {
        return super.getReplaceDimensionForWidth(i);
    }

    public void parseData(JsonParser jsonParser) throws IOException {
    }

    public void setFullHeight(int i) {
    }

    public void setFullWidth(int i) {
    }

    public void setImageColor(int i) {
    }

    public UserAvatar(String str) {
        this.mUrl75x75 = str;
        if (str != null) {
            this.mUrl400x400 = str.replace(IMG_SIZE_75.getSecond(), IMG_SIZE_400.getSecond());
        }
    }
}
