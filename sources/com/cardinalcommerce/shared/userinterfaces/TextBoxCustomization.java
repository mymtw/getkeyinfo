package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.google.android.play.core.assetpacks.C15588c1;

public class TextBoxCustomization extends Customization {

    /* renamed from: a */
    private int f14079a = 0;

    /* renamed from: b */
    private int f14080b = 0;

    /* renamed from: c */
    private String f14081c = "#545454";

    public TextBoxCustomization() {
        setTextFontSize(0);
    }

    public String getBorderColor() {
        return this.f14081c;
    }

    public int getBorderWidth() {
        return this.f14080b;
    }

    public int getCornerRadius() {
        return this.f14079a;
    }

    public void setBorderColor(String str) {
        if (C15588c1.m25310V(str)) {
            this.f14081c = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in TextBoxCustomization.setBorderColor"));
    }

    public void setBorderWidth(int i) {
        if (i > 0) {
            this.f14080b = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in TextBoxCustomization.setBorderWidth"));
    }

    public void setCornerRadius(int i) {
        if (i > 0) {
            this.f14079a = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in TextBoxCustomization.setCornerRadius"));
    }
}
