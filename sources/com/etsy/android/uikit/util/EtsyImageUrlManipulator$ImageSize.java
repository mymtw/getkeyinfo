package com.etsy.android.uikit.util;

public enum EtsyImageUrlManipulator$ImageSize {
    FULLxFULL("fullxfull"),
    SIZE_570xN("570xN");
    
    private final String size;

    private EtsyImageUrlManipulator$ImageSize(String str) {
        this.size = str;
    }

    public final String getSize() {
        return this.size;
    }
}
