package com.etsy.android.lib.models;

import com.etsy.android.lib.models.datatypes.EtsyId;

public interface BaseModelImageCompat extends IFullImage {
    String get4to3ImageUrlForPixelWidth(int i);

    String getAltText();

    int getFullHeight();

    String getFullHeightImageUrlForPixelWidth(int i);

    String getFullSizedImage();

    int getFullWidth();

    int getImageColor();

    EtsyId getImageId();

    String getImageUrl();

    String getImageUrlForPixelWidth(int i);

    String getUrl170x135();

    String getUrl224xN();

    String getUrl300x300();

    String getUrl340x270();

    String getUrl570xN();

    String getUrl680x540();

    String getUrl75x75();

    String getUrlFullxFull();

    void setAltText(String str);

    void setFullHeight(int i);

    void setFullWidth(int i);

    void setImageColor(int i);

    void setUrl170x135(String str);

    void setUrl224xN(String str);

    void setUrl300x300(String str);

    void setUrl340x270(String str);

    void setUrl570xN(String str);

    void setUrl680x540(String str);

    void setUrl75x75(String str);

    void setUrlFullxFull(String str);
}
