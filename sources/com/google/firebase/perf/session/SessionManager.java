package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.appboy.p043ui.C4946a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.C16592a;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p599jn.C18038a;

@Keep
public class SessionManager extends C16592a {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final AppStateMonitor appStateMonitor;
    private final Set<WeakReference<C18038a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.create(), AppStateMonitor.getInstance());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setApplicationContext$0(Context context, PerfSession perfSession2) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession2.isGaugeAndEventCollectionEnabled()) {
            this.gaugeManager.logGaugeMetadata(perfSession2.sessionId(), ApplicationProcessState.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        if (this.perfSession.isGaugeAndEventCollectionEnabled()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.sessionId(), applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
        if (this.perfSession.isGaugeAndEventCollectionEnabled()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, applicationProcessState);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        super.onUpdateAppState(applicationProcessState);
        if (!this.appStateMonitor.isColdStart()) {
            if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
                updatePerfSession(applicationProcessState);
            } else if (!updatePerfSessionIfExpired()) {
                startOrStopCollectingGauges(applicationProcessState);
            }
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<C18038a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new C4946a(this, 1, context, this.perfSession));
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession2) {
        this.perfSession = perfSession2;
    }

    public void unregisterForSessionUpdates(WeakReference<C18038a> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(ApplicationProcessState applicationProcessState) {
        synchronized (this.clients) {
            this.perfSession = PerfSession.create();
            Iterator<WeakReference<C18038a>> it = this.clients.iterator();
            while (it.hasNext()) {
                C18038a aVar = (C18038a) it.next().get();
                if (aVar != null) {
                    aVar.updateSession(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    public boolean updatePerfSessionIfExpired() {
        if (!this.perfSession.isExpired()) {
            return false;
        }
        updatePerfSession(this.appStateMonitor.getAppState());
        return true;
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager2, PerfSession perfSession2, AppStateMonitor appStateMonitor2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager2;
        this.perfSession = perfSession2;
        this.appStateMonitor = appStateMonitor2;
        registerForAppState();
    }
}
