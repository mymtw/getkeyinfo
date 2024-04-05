package com.cardinalcommerce.shared.userinterfaces;

import android.graphics.Typeface;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import java.io.Serializable;

public class Customization implements Serializable {

    /* renamed from: a */
    private String f14073a = Typeface.DEFAULT.toString();

    /* renamed from: b */
    private String f14074b;

    /* renamed from: c */
    private int f14075c;

    public String getTextColor() {
        return this.f14074b;
    }

    public String getTextFontName() {
        return this.f14073a;
    }

    public int getTextFontSize() {
        return this.f14075c;
    }

    public void setTextColor(String str) {
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setTextColor"));
        }
        this.f14074b = str;
    }

    public void setTextFontName(String str) {
        Throwable th = new Throwable("Caught in ButtonCustomization.setTextFontName");
        if (str == null || str.isEmpty()) {
            throw new InvalidInputException("InvalidInputException", th);
        }
        this.f14073a = str;
    }

    public void setTextFontSize(int i) {
        if (i >= 0) {
            this.f14075c = i;
            return;
        }
        throw new InvalidInputException("InvalidInputException", new Throwable("Caught in ButtonCustomization.setTextFontSize"));
    }
}
