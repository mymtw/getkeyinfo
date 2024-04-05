package com.bugsnag.android;

import android.os.strictmode.Violation;
import android.p012os.StrictMode$OnThreadViolationListener;

public class BugsnagThreadViolationListener implements StrictMode$OnThreadViolationListener {
    private final C5917u client;
    private final StrictMode$OnThreadViolationListener listener;

    public BugsnagThreadViolationListener() {
        this(C5777k.m11576b(), (StrictMode$OnThreadViolationListener) null);
    }

    public void onThreadViolation(Violation violation) {
        C5917u uVar = this.client;
        if (uVar != null) {
            uVar.mo16685d(violation, new C5809m2("StrictMode policy violation detected: ThreadPolicy"));
        }
        StrictMode$OnThreadViolationListener strictMode$OnThreadViolationListener = this.listener;
        if (strictMode$OnThreadViolationListener != null) {
            strictMode$OnThreadViolationListener.onThreadViolation(violation);
        }
    }

    public BugsnagThreadViolationListener(C5917u uVar) {
        this(uVar, (StrictMode$OnThreadViolationListener) null);
    }

    public BugsnagThreadViolationListener(C5917u uVar, StrictMode$OnThreadViolationListener strictMode$OnThreadViolationListener) {
        this.client = uVar;
        this.listener = strictMode$OnThreadViolationListener;
    }
}
