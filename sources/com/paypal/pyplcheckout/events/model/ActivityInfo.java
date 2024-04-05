package com.paypal.pyplcheckout.events.model;

import android.content.Intent;
import kotlin.jvm.internal.C19383o;

public final class ActivityInfo {
    private final Intent intent;

    public ActivityInfo(Intent intent2) {
        C19383o.m32797g(intent2, "intent");
        this.intent = intent2;
    }

    public final Intent getIntent() {
        return this.intent;
    }
}
