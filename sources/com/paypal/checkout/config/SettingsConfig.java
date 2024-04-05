package com.paypal.checkout.config;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SettingsConfig {
    private final boolean loggingEnabled;
    private final boolean shouldFailEligibility;

    public SettingsConfig() {
        this(false, false, 3, (DefaultConstructorMarker) null);
    }

    public SettingsConfig(boolean z, boolean z2) {
        this.loggingEnabled = z;
        this.shouldFailEligibility = z2;
    }

    public final boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final boolean getShouldFailEligibility() {
        return this.shouldFailEligibility;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SettingsConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
