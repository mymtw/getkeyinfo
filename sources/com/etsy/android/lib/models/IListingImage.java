package com.etsy.android.lib.models;

public interface IListingImage {
    int getImageColor();

    String getImageUrl();

    String getImageUrl300x300();

    String getImageUrlForPixelWidth(int i);

    String getUrl();
}
