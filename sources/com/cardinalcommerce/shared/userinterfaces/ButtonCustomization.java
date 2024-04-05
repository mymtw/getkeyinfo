package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.google.android.play.core.assetpacks.C15588c1;

public class ButtonCustomization extends Customization {

    /* renamed from: a */
    private String f14071a;

    /* renamed from: b */
    private int f14072b;

    public String getBackgroundColor() {
        return this.f14071a;
    }

    public int getCornerRadius() {
        return this.f14072b;
    }

    public void setBackgroundColor(String str) {
        if (C15588c1.m25310V(str)) {
            this.f14071a = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setBackgroundColor"));
    }

    public void setCornerRadius(int i) {
        if (i > 0) {
            this.f14072b = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setCornerRadius"));
    }
}
