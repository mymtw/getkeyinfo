package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.compose.animation.C0391c;
import com.facebook.login.LoginStatusClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.service.zaq;
import com.google.android.gms.common.internal.service.zar;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaac;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.internal.zao;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zas;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p003a2.C0015b;
import p003a2.C0023f;
import p193o.C7494b;
import p193o.C7496d;
import p605kk.C18117a0;
import p605kk.C18123g;
import p605kk.C18124h;

@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {
    @RecentlyNonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object zag = new Object();
    private static GoogleApiManager zaj;
    /* access modifiers changed from: private */
    public long zac = LoginStatusClient.DEFAULT_TOAST_DURATION_MS;
    /* access modifiers changed from: private */
    public long zad = 120000;
    /* access modifiers changed from: private */
    public long zae = NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION;
    /* access modifiers changed from: private */
    public boolean zaf = false;
    private zaaa zah;
    private zaac zai;
    /* access modifiers changed from: private */
    public final Context zak;
    /* access modifiers changed from: private */
    public final GoogleApiAvailability zal;
    /* access modifiers changed from: private */
    public final zaj zam;
    private final AtomicInteger zan = new AtomicInteger(1);
    private final AtomicInteger zao = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map<ApiKey<?>, zaa<?>> zap = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    public zay zaq = null;
    /* access modifiers changed from: private */
    public final Set<ApiKey<?>> zar = new C7496d();
    private final Set<ApiKey<?>> zas = new C7496d();
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final Handler zat;
    /* access modifiers changed from: private */
    public volatile boolean zau = true;

    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zap {
        private final Queue<zab> zab = new LinkedList();
        /* access modifiers changed from: private */
        @NotOnlyInitialized
        public final Api.Client zac;
        /* access modifiers changed from: private */
        public final ApiKey<O> zad;
        private final zav zae;
        private final Set<zaj> zaf = new HashSet();
        private final Map<ListenerHolder.ListenerKey<?>, zabv> zag = new HashMap();
        private final int zah;
        private final zace zai;
        private boolean zaj;
        private final List<zab> zak = new ArrayList();
        private ConnectionResult zal = null;
        private int zam = 0;

        public zaa(GoogleApi<O> googleApi) {
            Api.Client zaa2 = googleApi.zaa(GoogleApiManager.this.zat.getLooper(), (zaa<O>) this);
            this.zac = zaa2;
            this.zad = googleApi.getApiKey();
            this.zae = new zav();
            this.zah = googleApi.zaa();
            if (zaa2.requiresSignIn()) {
                this.zai = googleApi.zaa(GoogleApiManager.this.zak, GoogleApiManager.this.zat);
            } else {
                this.zai = null;
            }
        }

        /* access modifiers changed from: private */
        public final void zaa(int i) {
            zad();
            this.zaj = true;
            this.zae.zaa(i, this.zac.getLastDisconnectMessage());
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 9, this.zad), GoogleApiManager.this.zac);
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 11, this.zad), GoogleApiManager.this.zad);
            GoogleApiManager.this.zam.zaa();
            for (zabv zabv : this.zag.values()) {
                zabv.zac.run();
            }
        }

        private final boolean zab(ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.zag) {
                if (GoogleApiManager.this.zaq == null || !GoogleApiManager.this.zar.contains(this.zad)) {
                    return false;
                }
                GoogleApiManager.this.zaq.zab(connectionResult, this.zah);
                return true;
            }
        }

        /* access modifiers changed from: private */
        public final void zao() {
            zad();
            zac(ConnectionResult.RESULT_SUCCESS);
            zaq();
            Iterator<zabv> it = this.zag.values().iterator();
            while (it.hasNext()) {
                zabv next = it.next();
                if (zaa(next.zaa.getRequiredFeatures()) != null) {
                    it.remove();
                } else {
                    try {
                        next.zaa.registerListener(this.zac, new C18124h());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(3);
                        this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            zap();
            zar();
        }

        private final void zap() {
            ArrayList arrayList = new ArrayList(this.zab);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zab zab2 = (zab) obj;
                if (!this.zac.isConnected()) {
                    return;
                }
                if (zab(zab2)) {
                    this.zab.remove(zab2);
                }
            }
        }

        private final void zaq() {
            if (this.zaj) {
                GoogleApiManager.this.zat.removeMessages(11, this.zad);
                GoogleApiManager.this.zat.removeMessages(9, this.zad);
                this.zaj = false;
            }
        }

        private final void zar() {
            GoogleApiManager.this.zat.removeMessages(12, this.zad);
            GoogleApiManager.this.zat.sendMessageDelayed(GoogleApiManager.this.zat.obtainMessage(12, this.zad), GoogleApiManager.this.zae);
        }

        public final void onConnected(Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.zat.getLooper()) {
                zao();
            } else {
                GoogleApiManager.this.zat.post(new zabf(this));
            }
        }

        public final void onConnectionFailed(ConnectionResult connectionResult) {
            zaa(connectionResult, (Exception) null);
        }

        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == GoogleApiManager.this.zat.getLooper()) {
                zaa(i);
            } else {
                GoogleApiManager.this.zat.post(new zabe(this, i));
            }
        }

        public final Map<ListenerHolder.ListenerKey<?>, zabv> zac() {
            return this.zag;
        }

        public final void zad() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            this.zal = null;
        }

        public final ConnectionResult zae() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            return this.zal;
        }

        public final void zaf() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (this.zaj) {
                zai();
            }
        }

        public final void zag() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (this.zaj) {
                zaq();
                zaa(GoogleApiManager.this.zal.isGooglePlayServicesAvailable(GoogleApiManager.this.zak) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
                this.zac.disconnect("Timing out connection while resuming.");
            }
        }

        public final boolean zah() {
            return zaa(true);
        }

        public final void zai() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (!this.zac.isConnected() && !this.zac.isConnecting()) {
                try {
                    int zaa2 = GoogleApiManager.this.zam.zaa(GoogleApiManager.this.zak, this.zac);
                    if (zaa2 != 0) {
                        ConnectionResult connectionResult = new ConnectionResult(zaa2, (PendingIntent) null);
                        String name = this.zac.getClass().getName();
                        String valueOf = String.valueOf(connectionResult);
                        StringBuilder sb = new StringBuilder(name.length() + 35 + valueOf.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(valueOf);
                        Log.w("GoogleApiManager", sb.toString());
                        onConnectionFailed(connectionResult);
                        return;
                    }
                    zac zac2 = new zac(this.zac, this.zad);
                    if (this.zac.requiresSignIn()) {
                        ((zace) Preconditions.checkNotNull(this.zai)).zaa((zach) zac2);
                    }
                    try {
                        this.zac.connect(zac2);
                    } catch (SecurityException e) {
                        zaa(new ConnectionResult(10), (Exception) e);
                    }
                } catch (IllegalStateException e2) {
                    zaa(new ConnectionResult(10), (Exception) e2);
                }
            }
        }

        public final boolean zaj() {
            return this.zac.isConnected();
        }

        public final boolean zak() {
            return this.zac.requiresSignIn();
        }

        public final int zal() {
            return this.zah;
        }

        public final int zam() {
            return this.zam;
        }

        public final void zan() {
            this.zam++;
        }

        private final void zac(zab zab2) {
            zab2.zaa(this.zae, zak());
            try {
                zab2.zaa((zaa<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.zac.getClass().getName()}), th);
            }
        }

        private final Status zad(ConnectionResult connectionResult) {
            return GoogleApiManager.zab((ApiKey<?>) this.zad, connectionResult);
        }

        public final Api.Client zab() {
            return this.zac;
        }

        private final boolean zab(zab zab2) {
            if (!(zab2 instanceof zad)) {
                zac(zab2);
                return true;
            }
            zad zad2 = (zad) zab2;
            Feature zaa2 = zaa(zad2.zac(this));
            if (zaa2 == null) {
                zac(zab2);
                return true;
            }
            String name = this.zac.getClass().getName();
            String name2 = zaa2.getName();
            long version = zaa2.getVersion();
            StringBuilder k = C0015b.m92k(C0391c.m1055a(name2, name.length() + 77), name, " could not execute call because it requires feature (", name2, ", ");
            k.append(version);
            k.append(").");
            Log.w("GoogleApiManager", k.toString());
            if (!GoogleApiManager.this.zau || !zad2.zad(this)) {
                zad2.zaa((Exception) new UnsupportedApiCallException(zaa2));
                return true;
            }
            zab zab3 = new zab(this.zad, zaa2, (zabd) null);
            int indexOf = this.zak.indexOf(zab3);
            if (indexOf >= 0) {
                zab zab4 = this.zak.get(indexOf);
                GoogleApiManager.this.zat.removeMessages(15, zab4);
                GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 15, zab4), GoogleApiManager.this.zac);
                return false;
            }
            this.zak.add(zab3);
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 15, zab3), GoogleApiManager.this.zac);
            GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 16, zab3), GoogleApiManager.this.zad);
            ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
            if (zab(connectionResult)) {
                return false;
            }
            GoogleApiManager.this.zaa(connectionResult, this.zah);
            return false;
        }

        private final void zac(ConnectionResult connectionResult) {
            for (zaj next : this.zaf) {
                String str = null;
                if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.zac.getEndpointPackageName();
                }
                next.zaa(this.zad, connectionResult, str);
            }
            this.zaf.clear();
        }

        public final void zaa(ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            Api.Client client = this.zac;
            String name = client.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(valueOf.length() + name.length() + 25);
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            client.disconnect(sb.toString());
            onConnectionFailed(connectionResult);
        }

        public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.zat.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                GoogleApiManager.this.zat.post(new zabh(this, connectionResult));
            }
        }

        private final void zaa(ConnectionResult connectionResult, Exception exc) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            zace zace = this.zai;
            if (zace != null) {
                zace.zaa();
            }
            zad();
            GoogleApiManager.this.zam.zaa();
            zac(connectionResult);
            if (this.zac instanceof zar) {
                boolean unused = GoogleApiManager.this.zaf = true;
                GoogleApiManager.this.zat.sendMessageDelayed(GoogleApiManager.this.zat.obtainMessage(19), 300000);
            }
            if (connectionResult.getErrorCode() == 4) {
                zaa(GoogleApiManager.zab);
            } else if (this.zab.isEmpty()) {
                this.zal = connectionResult;
            } else if (exc != null) {
                Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
                zaa((Status) null, exc, false);
            } else if (!GoogleApiManager.this.zau) {
                zaa(zad(connectionResult));
            } else {
                zaa(zad(connectionResult), (Exception) null, true);
                if (!this.zab.isEmpty() && !zab(connectionResult) && !GoogleApiManager.this.zaa(connectionResult, this.zah)) {
                    if (connectionResult.getErrorCode() == 18) {
                        this.zaj = true;
                    }
                    if (this.zaj) {
                        GoogleApiManager.this.zat.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zat, 9, this.zad), GoogleApiManager.this.zac);
                    } else {
                        zaa(zad(connectionResult));
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        public final void zab(zab zab2) {
            Feature[] zac2;
            if (this.zak.remove(zab2)) {
                GoogleApiManager.this.zat.removeMessages(15, zab2);
                GoogleApiManager.this.zat.removeMessages(16, zab2);
                Feature zab3 = zab2.zab;
                ArrayList arrayList = new ArrayList(this.zab.size());
                for (zab next : this.zab) {
                    if ((next instanceof zad) && (zac2 = ((zad) next).zac(this)) != null && ArrayUtils.contains((T[]) zac2, zab3)) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    zab zab4 = (zab) obj;
                    this.zab.remove(zab4);
                    zab4.zaa((Exception) new UnsupportedApiCallException(zab3));
                }
            }
        }

        public final void zaa(zab zab2) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (!this.zac.isConnected()) {
                this.zab.add(zab2);
                ConnectionResult connectionResult = this.zal;
                if (connectionResult == null || !connectionResult.hasResolution()) {
                    zai();
                } else {
                    onConnectionFailed(this.zal);
                }
            } else if (zab(zab2)) {
                zar();
            } else {
                this.zab.add(zab2);
            }
        }

        public final void zaa() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            zaa(GoogleApiManager.zaa);
            this.zae.zab();
            for (ListenerHolder.ListenerKey zag2 : (ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
                zaa((zab) new zag(zag2, new C18124h()));
            }
            zac(new ConnectionResult(4));
            if (this.zac.isConnected()) {
                this.zac.onUserSignOut(new zabg(this));
            }
        }

        private final void zaa(Status status, Exception exc, boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            boolean z2 = true;
            boolean z3 = status == null;
            if (exc != null) {
                z2 = false;
            }
            if (z3 != z2) {
                Iterator<zab> it = this.zab.iterator();
                while (it.hasNext()) {
                    zab next = it.next();
                    if (!z || next.zaa == 2) {
                        if (status != null) {
                            next.zaa(status);
                        } else {
                            next.zaa(exc);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        /* access modifiers changed from: private */
        public final void zaa(Status status) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            zaa(status, (Exception) null, false);
        }

        /* access modifiers changed from: private */
        public final boolean zaa(boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            if (!this.zac.isConnected() || this.zag.size() != 0) {
                return false;
            }
            if (this.zae.zaa()) {
                if (z) {
                    zar();
                }
                return false;
            }
            this.zac.disconnect("Timing out service connection.");
            return true;
        }

        public final void zaa(zaj zaj2) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zat);
            this.zaf.add(zaj2);
        }

        private final Feature zaa(Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.zac.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                C7494b bVar = new C7494b(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    bVar.put(feature.getName(), Long.valueOf(feature.getVersion()));
                }
                for (Feature feature2 : featureArr) {
                    Long l = (Long) bVar.getOrDefault(feature2.getName(), null);
                    if (l == null || l.longValue() < feature2.getVersion()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        public final void zaa(zab zab2) {
            if (!this.zak.contains(zab2) || this.zaj) {
                return;
            }
            if (!this.zac.isConnected()) {
                zai();
            } else {
                zap();
            }
        }
    }

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zak = context;
        zas zas2 = new zas(looper, this);
        this.zat = zas2;
        this.zal = googleApiAvailability;
        this.zam = new zaj(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zau = false;
        }
        zas2.sendMessage(zas2.obtainMessage(6));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zag) {
            GoogleApiManager googleApiManager = zaj;
            if (googleApiManager != null) {
                googleApiManager.zao.incrementAndGet();
                Handler handler = googleApiManager.zat;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    @RecentlyNonNull
    public static GoogleApiManager zaa(@RecentlyNonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zag) {
            if (zaj == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zaj = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zaj;
        }
        return googleApiManager;
    }

    private final zaa<?> zac(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.getApiKey();
        zaa<?> zaa2 = this.zap.get(apiKey);
        if (zaa2 == null) {
            zaa2 = new zaa<>(googleApi);
            this.zap.put(apiKey, zaa2);
        }
        if (zaa2.zak()) {
            this.zas.add(apiKey);
        }
        zaa2.zai();
        return zaa2;
    }

    private final void zag() {
        zaaa zaaa = this.zah;
        if (zaaa != null) {
            if (zaaa.zaa() > 0 || zad()) {
                zah().zaa(zaaa);
            }
            this.zah = null;
        }
    }

    private final zaac zah() {
        if (this.zai == null) {
            this.zai = new zaq(this.zak);
        }
        return this.zai;
    }

    public boolean handleMessage(@RecentlyNonNull Message message) {
        int i = message.what;
        long j = 300000;
        zaa zaa2 = null;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION;
                }
                this.zae = j;
                this.zat.removeMessages(12);
                for (ApiKey<?> obtainMessage : this.zap.keySet()) {
                    Handler handler = this.zat;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.zae);
                }
                break;
            case 2:
                zaj zaj2 = (zaj) message.obj;
                Iterator<ApiKey<?>> it = zaj2.zaa().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey next = it.next();
                        zaa zaa3 = this.zap.get(next);
                        if (zaa3 == null) {
                            zaj2.zaa(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zaa3.zaj()) {
                            zaj2.zaa(next, ConnectionResult.RESULT_SUCCESS, zaa3.zab().getEndpointPackageName());
                        } else {
                            ConnectionResult zae2 = zaa3.zae();
                            if (zae2 != null) {
                                zaj2.zaa(next, zae2, (String) null);
                            } else {
                                zaa3.zaa(zaj2);
                                zaa3.zai();
                            }
                        }
                    }
                }
            case 3:
                for (zaa next2 : this.zap.values()) {
                    next2.zad();
                    next2.zai();
                }
                break;
            case 4:
            case 8:
            case 13:
                zabu zabu = (zabu) message.obj;
                zaa<?> zaa4 = this.zap.get(zabu.zac.getApiKey());
                if (zaa4 == null) {
                    zaa4 = zac(zabu.zac);
                }
                if (zaa4.zak() && this.zao.get() != zabu.zab) {
                    zabu.zaa.zaa(zaa);
                    zaa4.zaa();
                    break;
                } else {
                    zaa4.zaa(zabu.zaa);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.zap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa next3 = it2.next();
                        if (next3.zal() == i2) {
                            zaa2 = next3;
                        }
                    }
                }
                if (zaa2 != null) {
                    if (connectionResult.getErrorCode() != 13) {
                        zaa2.zaa(zab((ApiKey<?>) zaa2.zad, connectionResult));
                        break;
                    } else {
                        String errorString = this.zal.getErrorString(connectionResult.getErrorCode());
                        String errorMessage = connectionResult.getErrorMessage();
                        StringBuilder sb = new StringBuilder(C0391c.m1055a(errorMessage, C0391c.m1055a(errorString, 69)));
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(errorString);
                        sb.append(": ");
                        sb.append(errorMessage);
                        zaa2.zaa(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.zak.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zak.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabd(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000;
                        break;
                    }
                }
                break;
            case 7:
                zac((GoogleApi<?>) (GoogleApi) message.obj);
                break;
            case 9:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zaf();
                    break;
                }
                break;
            case 10:
                for (ApiKey<?> remove : this.zas) {
                    zaa remove2 = this.zap.remove(remove);
                    if (remove2 != null) {
                        remove2.zaa();
                    }
                }
                this.zas.clear();
                break;
            case 11:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zag();
                    break;
                }
                break;
            case 12:
                if (this.zap.containsKey(message.obj)) {
                    this.zap.get(message.obj).zah();
                    break;
                }
                break;
            case 14:
                zaz zaz = (zaz) message.obj;
                ApiKey<?> zaa5 = zaz.zaa();
                if (this.zap.containsKey(zaa5)) {
                    zaz.zab().mo69678b(Boolean.valueOf(this.zap.get(zaa5).zaa(false)));
                    break;
                } else {
                    zaz.zab().mo69678b(Boolean.FALSE);
                    break;
                }
            case 15:
                zab zab2 = (zab) message.obj;
                if (this.zap.containsKey(zab2.zaa)) {
                    this.zap.get(zab2.zaa).zaa(zab2);
                    break;
                }
                break;
            case 16:
                zab zab3 = (zab) message.obj;
                if (this.zap.containsKey(zab3.zaa)) {
                    this.zap.get(zab3.zaa).zab(zab3);
                    break;
                }
                break;
            case 17:
                zag();
                break;
            case 18:
                zabq zabq = (zabq) message.obj;
                if (zabq.zac != 0) {
                    zaaa zaaa = this.zah;
                    if (zaaa != null) {
                        List<zao> zab4 = zaaa.zab();
                        if (this.zah.zaa() != zabq.zab || (zab4 != null && zab4.size() >= zabq.zad)) {
                            this.zat.removeMessages(17);
                            zag();
                        } else {
                            this.zah.zaa(zabq.zaa);
                        }
                    }
                    if (this.zah == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(zabq.zaa);
                        this.zah = new zaaa(zabq.zab, arrayList);
                        Handler handler2 = this.zat;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), zabq.zac);
                        break;
                    }
                } else {
                    zah().zaa(new zaaa(zabq.zab, Arrays.asList(new zao[]{zabq.zaa})));
                    break;
                }
                break;
            case 19:
                this.zaf = false;
                break;
            default:
                C0023f.m112m(31, "Unknown message id: ", i, "GoogleApiManager");
                return false;
        }
        return true;
    }

    public final int zab() {
        return this.zan.getAndIncrement();
    }

    public final boolean zad() {
        if (this.zaf) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int zaa2 = this.zam.zaa(this.zak, 203390000);
        if (zaa2 == -1 || zaa2 == 0) {
            return true;
        }
        return false;
    }

    public class zac implements zach, BaseGmsClient.ConnectionProgressReportCallbacks {
        /* access modifiers changed from: private */
        public final Api.Client zab;
        /* access modifiers changed from: private */
        public final ApiKey<?> zac;
        private IAccountAccessor zad = null;
        private Set<Scope> zae = null;
        /* access modifiers changed from: private */
        public boolean zaf = false;

        public zac(Api.Client client, ApiKey<?> apiKey) {
            this.zab = client;
            this.zac = apiKey;
        }

        public final void onReportServiceBinding(ConnectionResult connectionResult) {
            GoogleApiManager.this.zat.post(new zabj(this, connectionResult));
        }

        public final void zaa(ConnectionResult connectionResult) {
            zaa zaa2 = (zaa) GoogleApiManager.this.zap.get(this.zac);
            if (zaa2 != null) {
                zaa2.zaa(connectionResult);
            }
        }

        public final void zaa(IAccountAccessor iAccountAccessor, Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                zaa(new ConnectionResult(4));
                return;
            }
            this.zad = iAccountAccessor;
            this.zae = set;
            zaa();
        }

        /* access modifiers changed from: private */
        public final void zaa() {
            IAccountAccessor iAccountAccessor;
            if (this.zaf && (iAccountAccessor = this.zad) != null) {
                this.zab.getRemoteService(iAccountAccessor, this.zae);
            }
        }
    }

    public final void zab(zay zay) {
        synchronized (zag) {
            if (this.zaq == zay) {
                this.zaq = null;
                this.zar.clear();
            }
        }
    }

    public static class zab {
        /* access modifiers changed from: private */
        public final ApiKey<?> zaa;
        /* access modifiers changed from: private */
        public final Feature zab;

        private zab(ApiKey<?> apiKey, Feature feature) {
            this.zaa = apiKey;
            this.zab = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof zab)) {
                zab zab2 = (zab) obj;
                return Objects.equal(this.zaa, zab2.zaa) && Objects.equal(this.zab, zab2.zab);
            }
        }

        public final int hashCode() {
            return Objects.hashCode(this.zaa, this.zab);
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
        }

        public /* synthetic */ zab(ApiKey apiKey, Feature feature, zabd zabd) {
            this(apiKey, feature);
        }
    }

    @RecentlyNonNull
    public final C18123g<Boolean> zab(@RecentlyNonNull GoogleApi<?> googleApi) {
        zaz zaz = new zaz(googleApi.getApiKey());
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(14, zaz));
        return zaz.zab().f39566a;
    }

    public final void zac() {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @RecentlyNonNull
    public static GoogleApiManager zaa() {
        GoogleApiManager googleApiManager;
        synchronized (zag) {
            Preconditions.checkNotNull(zaj, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zaj;
        }
        return googleApiManager;
    }

    public final void zab(@RecentlyNonNull ConnectionResult connectionResult, int i) {
        if (!zaa(connectionResult, i)) {
            Handler handler = this.zat;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void zaa(@RecentlyNonNull GoogleApi<?> googleApi) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    /* access modifiers changed from: private */
    public static Status zab(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String zaa2 = apiKey.zaa();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(valueOf.length() + C0391c.m1055a(zaa2, 63));
        sb.append("API: ");
        sb.append(zaa2);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    public final void zaa(zay zay) {
        synchronized (zag) {
            if (this.zaq != zay) {
                this.zaq = zay;
                this.zar.clear();
            }
            this.zar.addAll(zay.zac());
        }
    }

    public final zaa zaa(ApiKey<?> apiKey) {
        return this.zap.get(apiKey);
    }

    @RecentlyNonNull
    public final C18123g<Map<ApiKey<?>, String>> zaa(@RecentlyNonNull Iterable<? extends HasApiKey<?>> iterable) {
        zaj zaj2 = new zaj(iterable);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(2, zaj2));
        return zaj2.zab();
    }

    public final <O extends Api.ApiOptions> void zaa(@RecentlyNonNull GoogleApi<O> googleApi, int i, @RecentlyNonNull BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zaf zaf2 = new zaf(i, apiMethodImpl);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zabu(zaf2, this.zao.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zaa(@RecentlyNonNull GoogleApi<O> googleApi, int i, @RecentlyNonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @RecentlyNonNull C18124h<ResultT> hVar, @RecentlyNonNull StatusExceptionMapper statusExceptionMapper) {
        zaa(hVar, taskApiCall.zab(), (GoogleApi<?>) googleApi);
        zah zah2 = new zah(i, taskApiCall, hVar, statusExceptionMapper);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(4, new zabu(zah2, this.zao.get(), googleApi)));
    }

    @RecentlyNonNull
    public final <O extends Api.ApiOptions> C18123g<Void> zaa(@RecentlyNonNull GoogleApi<O> googleApi, @RecentlyNonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @RecentlyNonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @RecentlyNonNull Runnable runnable) {
        C18124h hVar = new C18124h();
        zaa(hVar, registerListenerMethod.zab(), (GoogleApi<?>) googleApi);
        zae zae2 = new zae(new zabv(registerListenerMethod, unregisterListenerMethod, runnable), hVar);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(8, new zabu(zae2, this.zao.get(), googleApi)));
        return hVar.f39566a;
    }

    @RecentlyNonNull
    public final <O extends Api.ApiOptions> C18123g<Boolean> zaa(@RecentlyNonNull GoogleApi<O> googleApi, @RecentlyNonNull ListenerHolder.ListenerKey<?> listenerKey, int i) {
        C18124h hVar = new C18124h();
        zaa(hVar, i, (GoogleApi<?>) googleApi);
        zag zag2 = new zag(listenerKey, hVar);
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(13, new zabu(zag2, this.zao.get(), googleApi)));
        return hVar.f39566a;
    }

    private final <T> void zaa(C18124h<T> hVar, int i, GoogleApi<?> googleApi) {
        zabr<T> zaa2;
        if (i != 0 && (zaa2 = zabr.zaa(this, i, googleApi.getApiKey())) != null) {
            C18117a0<TResult> a0Var = hVar.f39566a;
            Handler handler = this.zat;
            handler.getClass();
            a0Var.mo69655b(zabc.zaa(handler), zaa2);
        }
    }

    public final boolean zaa(ConnectionResult connectionResult, int i) {
        return this.zal.zaa(this.zak, connectionResult, i);
    }

    public final void zaa(zao zao2, int i, long j, int i2) {
        Handler handler = this.zat;
        handler.sendMessage(handler.obtainMessage(18, new zabq(zao2, i, j, i2)));
    }
}
