package com.bugsnag.android;

import android.os.strictmode.Violation;
import android.p012os.StrictMode$OnVmViolationListener;

public class BugsnagVmViolationListener implements StrictMode$OnVmViolationListener {
    private final C5917u client;
    private final StrictMode$OnVmViolationListener listener;

    public BugsnagVmViolationListener() {
        this(C5777k.m11576b(), (StrictMode$OnVmViolationListener) null);
    }

    public void onVmViolation(Violation violation) {
        C5917u uVar = this.client;
        if (uVar != null) {
            uVar.mo16685d(violation, new C5809m2("StrictMode policy violation detected: VmPolicy"));
        }
        StrictMode$OnVmViolationListener strictMode$OnVmViolationListener = this.listener;
        if (strictMode$OnVmViolationListener != null) {
            strictMode$OnVmViolationListener.onVmViolation(violation);
        }
    }

    public BugsnagVmViolationListener(C5917u uVar) {
        this(uVar, (StrictMode$OnVmViolationListener) null);
    }

    public BugsnagVmViolationListener(C5917u uVar, StrictMode$OnVmViolationListener strictMode$OnVmViolationListener) {
        this.client = uVar;
        this.listener = strictMode$OnVmViolationListener;
    }
}
