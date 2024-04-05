package com.google.firebase.perf.application;

import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import java.lang.ref.WeakReference;

/* renamed from: com.google.firebase.perf.application.a */
public abstract class C16592a implements AppStateMonitor.C16591b {
    private final WeakReference<AppStateMonitor.C16591b> appStateCallback;
    private final AppStateMonitor appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public C16592a() {
        this(AppStateMonitor.getInstance());
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.incrementTsnsCount(i);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else if (applicationProcessState2 != applicationProcessState && applicationProcessState != applicationProcessState3) {
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (!this.isRegisteredForAppState) {
            this.currentAppState = this.appStateMonitor.getAppState();
            this.appStateMonitor.registerForAppState(this.appStateCallback);
            this.isRegisteredForAppState = true;
        }
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            this.appStateMonitor.unregisterForAppState(this.appStateCallback);
            this.isRegisteredForAppState = false;
        }
    }

    public C16592a(AppStateMonitor appStateMonitor2) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = appStateMonitor2;
        this.appStateCallback = new WeakReference<>(this);
    }
}
