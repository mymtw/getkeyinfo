package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.google.android.play.core.assetpacks.C15588c1;

public class LabelCustomization extends Customization {

    /* renamed from: a */
    private String f14076a;

    /* renamed from: b */
    private String f14077b;

    /* renamed from: c */
    private int f14078c;

    public String getHeadingTextColor() {
        return this.f14076a;
    }

    public String getHeadingTextFontName() {
        return this.f14077b;
    }

    public int getHeadingTextFontSize() {
        return this.f14078c;
    }

    public void setHeadingTextColor(String str) {
        if (C15588c1.m25310V(str)) {
            this.f14076a = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in LabelCustomization.setHeadingTextColor"));
    }

    public void setHeadingTextFontName(String str) {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in LabelCustomization.setHeadingTextFontName"));
        }
        this.f14077b = str;
    }

    public void setHeadingTextFontSize(int i) {
        if (i > 0) {
            this.f14078c = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in LabelCustomization.setHeadingTextFontSize"));
    }
}
