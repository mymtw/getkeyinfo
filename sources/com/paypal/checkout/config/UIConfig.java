package com.paypal.checkout.config;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UIConfig {
    private final boolean showExitSurveyDialog;

    public UIConfig() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public UIConfig(boolean z) {
        this.showExitSurveyDialog = z;
    }

    public final boolean getShowExitSurveyDialog() {
        return this.showExitSurveyDialog;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UIConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
