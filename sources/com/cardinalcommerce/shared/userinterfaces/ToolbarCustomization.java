package com.cardinalcommerce.shared.userinterfaces;

import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.google.android.play.core.assetpacks.C15588c1;

public class ToolbarCustomization extends Customization {

    /* renamed from: a */
    private String f14082a;

    /* renamed from: b */
    private String f14083b;

    /* renamed from: c */
    private String f14084c;

    public String getBackgroundColor() {
        return this.f14082a;
    }

    public String getButtonText() {
        return this.f14084c;
    }

    public String getHeaderText() {
        return this.f14083b;
    }

    public void setBackgroundColor(String str) {
        if (C15588c1.m25310V(str)) {
            this.f14082a = str;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ToolbarCustomization.setBackgroundColor"));
    }

    public void setButtonText(String str) {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ToolbarCustomization.setButtonText"));
        }
        this.f14084c = str;
    }

    public void setHeaderText(String str) {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ToolbarCustomization.setHeaderText"));
        }
        this.f14083b = str;
    }
}
