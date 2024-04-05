package com.etsy.android.lib.models;

import com.etsy.android.lib.models.apiv3.Image;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.Pair;

public class BaseModelImageWrapper extends BaseModelImage {
    private static final long serialVersionUID = -2449543120721865761L;
    public Image mImage;

    public BaseModelImageWrapper(Image image) {
        this.mImage = image;
    }

    public Pair<Integer, String>[] getImageSizesArray() {
        return null;
    }

    public String getImageUrl() {
        return this.mImage.getUrl();
    }

    public String getImageUrlForPixelWidth(int i) {
        return this.mImage.pickBestImageSource(i, 0);
    }

    public String getLargestDimension() {
        return null;
    }

    public Image getWrappedImage() {
        return this.mImage;
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
