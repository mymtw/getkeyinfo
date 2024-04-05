package com.etsy.android.lib.models;

public abstract class BaseBackgroundColorFieldModel extends BaseFieldModel {
    public int backgroundColorTop = 0;

    public int getBackgroundColorTop() {
        return this.backgroundColorTop;
    }

    public void setBackgroundColorTop(int i) {
        this.backgroundColorTop = i;
    }
}
