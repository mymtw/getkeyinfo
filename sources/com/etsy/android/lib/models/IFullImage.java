package com.etsy.android.lib.models;

public interface IFullImage {
    String get4to3ImageUrlForPixelWidth(int i);

    int getFullHeight();

    String getFullHeightImageUrlForPixelWidth(int i);

    int getFullWidth();

    int getImageColor();

    void setFullHeight(int i);

    void setFullWidth(int i);
}
