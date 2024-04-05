package com.google.android.play.core.missingsplits;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import p648pl.C18392a;
import p648pl.C18393b;
import p648pl.C18394c;

@Deprecated
public class MissingSplitsDetectingApplication extends Application {
    private boolean onCreateCalled = false;

    public final void onCreate() {
        if (!this.onCreateCalled) {
            this.onCreateCalled = true;
            AtomicReference atomicReference = C18392a.f40450a;
            if (!new C18394c(this, Runtime.getRuntime(), new C18393b(this, getPackageManager()), C18392a.f40450a).mo69931a()) {
                super.onCreate();
                onCreateCustom();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }

    @Deprecated
    public void onCreateCustom() {
    }
}
