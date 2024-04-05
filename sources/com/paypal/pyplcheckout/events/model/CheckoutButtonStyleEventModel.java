package com.paypal.pyplcheckout.events.model;

import com.paypal.pyplcheckout.home.view.customviews.ActionButtonColor;
import kotlin.jvm.internal.C19383o;

public final class CheckoutButtonStyleEventModel {
    private final ActionButtonColor buttonColor;
    private final String buttonText;
    private final boolean isVisible;

    public CheckoutButtonStyleEventModel(boolean z, String str, ActionButtonColor actionButtonColor) {
        C19383o.m32797g(str, "buttonText");
        C19383o.m32797g(actionButtonColor, "buttonColor");
        this.isVisible = z;
        this.buttonText = str;
        this.buttonColor = actionButtonColor;
    }

    public final ActionButtonColor getButtonColor() {
        return this.buttonColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final boolean isVisible() {
        return this.isVisible;
    }
}
