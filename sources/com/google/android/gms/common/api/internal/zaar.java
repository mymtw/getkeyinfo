package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.compose.animation.C0391c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.login.LoginStatusClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zah;
import com.google.android.gms.common.internal.zak;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import p581hk.C17821a;
import p581hk.C17826f;

public final class zaar extends GoogleApiClient implements zabn {
    @VisibleForTesting
    public final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zaa = new LinkedList();
    public final Map<Api.AnyClientKey<?>, Api.Client> zab;
    public Set<Scope> zac;
    public Set<zacn> zad;
    public final zaco zae;
    private final Lock zaf;
    private final zah zag;
    private zabo zah = null;
    private final int zai;
    /* access modifiers changed from: private */
    public final Context zaj;
    private final Looper zak;
    private volatile boolean zal;
    private long zam;
    private long zan;
    private final zaau zao;
    private final GoogleApiAvailability zap;
    @VisibleForTesting
    private zabk zaq;
    private final ClientSettings zar;
    private final Map<Api<?>, Boolean> zas;
    private final Api.AbstractClientBuilder<? extends C17826f, C17821a> zat;
    private final ListenerHolders zau;
    private final ArrayList<zaq> zav;
    private Integer zaw;
    private final zak zax;

    public zaar(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends C17826f, C17821a> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zaq> arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.zam = ClientLibraryUtils.isPackageSide() ? NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION : 120000;
        this.zan = LoginStatusClient.DEFAULT_TOAST_DURATION_MS;
        this.zac = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zad = null;
        zaaq zaaq = new zaaq(this);
        this.zax = zaaq;
        this.zaj = context;
        this.zaf = lock;
        this.zag = new zah(looper, zaaq);
        this.zak = looper2;
        this.zao = new zaau(this, looper);
        this.zap = googleApiAvailability;
        this.zai = i3;
        if (i3 >= 0) {
            this.zaw = Integer.valueOf(i2);
        }
        this.zas = map;
        this.zab = map2;
        this.zav = arrayList;
        this.zae = new zaco();
        for (GoogleApiClient.ConnectionCallbacks zaa2 : list) {
            this.zag.zaa(zaa2);
        }
        for (GoogleApiClient.OnConnectionFailedListener zaa3 : list2) {
            this.zag.zaa(zaa3);
        }
        this.zar = clientSettings;
        this.zat = abstractClientBuilder;
    }

    /* access modifiers changed from: private */
    public final void zaa(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zaav(this, statusPendingResult, z, googleApiClient));
    }

    private static String zab(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    private final void zad() {
        this.zag.zab();
        ((zabo) Preconditions.checkNotNull(this.zah)).zaa();
    }

    /* access modifiers changed from: private */
    public final void zae() {
        this.zaf.lock();
        try {
            if (this.zal) {
                zad();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    /* access modifiers changed from: private */
    public final void zaf() {
        this.zaf.lock();
        try {
            if (zab()) {
                zad();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    private final boolean zag() {
        this.zaf.lock();
        try {
            Set<zacn> set = this.zad;
            if (set == null) {
                this.zaf.unlock();
                return false;
            }
            boolean z = !set.isEmpty();
            this.zaf.unlock();
            return z;
        } catch (Throwable th) {
            this.zaf.unlock();
            throw th;
        }
    }

    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaf.lock();
        try {
            if (this.zai >= 0) {
                if (this.zaw == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaa((Iterable<Api.Client>) this.zab.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zaa(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zag.zab();
            return ((zabo) Preconditions.checkNotNull(this.zah)).zab();
        } finally {
            this.zaf.unlock();
        }
    }

    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        Preconditions.checkState(num == null || num.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult((GoogleApiClient) this);
        if (this.zab.containsKey(Common.CLIENT_KEY)) {
            zaa(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient build = new GoogleApiClient.Builder(this.zaj).addApi(Common.API).addConnectionCallbacks(new zaat(this, atomicReference, statusPendingResult)).addOnConnectionFailedListener(new zaas(this, statusPendingResult)).setHandler(this.zao).build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    public final void connect() {
        this.zaf.lock();
        try {
            boolean z = false;
            if (this.zai >= 0) {
                if (this.zaw != null) {
                    z = true;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zaa((Iterable<Api.Client>) this.zab.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            connect(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
        } finally {
            this.zaf.unlock();
        }
    }

    public final void disconnect() {
        this.zaf.lock();
        try {
            this.zae.zaa();
            zabo zabo = this.zah;
            if (zabo != null) {
                zabo.zac();
            }
            this.zau.zaa();
            for (BaseImplementation.ApiMethodImpl next : this.zaa) {
                next.zaa((zacq) null);
                next.cancel();
            }
            this.zaa.clear();
            if (this.zah != null) {
                zab();
                this.zag.zaa();
                this.zaf.unlock();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.zaj);
        printWriter.append(str).append("mResuming=").print(this.zal);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zae.zab.size());
        zabo zabo = this.zah;
        if (zabo != null) {
            zabo.zaa(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t) {
        Api<?> api = t.getApi();
        boolean containsKey = this.zab.containsKey(t.getClientKey());
        String zad2 = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(C0391c.m1055a(zad2, 65));
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(zad2);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaf.lock();
        try {
            zabo zabo = this.zah;
            if (zabo == null) {
                this.zaa.add(t);
                return t;
            }
            T zaa2 = zabo.zaa(t);
            this.zaf.unlock();
            return zaa2;
        } finally {
            this.zaf.unlock();
        }
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t) {
        Api<?> api = t.getApi();
        boolean containsKey = this.zab.containsKey(t.getClientKey());
        String zad2 = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(C0391c.m1055a(zad2, 65));
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(zad2);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaf.lock();
        try {
            zabo zabo = this.zah;
            if (zabo == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.zal) {
                this.zaa.add(t);
                while (!this.zaa.isEmpty()) {
                    BaseImplementation.ApiMethodImpl remove = this.zaa.remove();
                    this.zae.zaa(remove);
                    remove.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                return t;
            } else {
                T zab2 = zabo.zab(t);
                this.zaf.unlock();
                return zab2;
            }
        } finally {
            this.zaf.unlock();
        }
    }

    public final <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        C c = (Api.Client) this.zab.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    public final ConnectionResult getConnectionResult(Api<?> api) {
        this.zaf.lock();
        try {
            if (!isConnected()) {
                if (!this.zal) {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }
            if (this.zab.containsKey(api.zac())) {
                ConnectionResult zaa2 = ((zabo) Preconditions.checkNotNull(this.zah)).zaa(api);
                if (zaa2 != null) {
                    this.zaf.unlock();
                    return zaa2;
                } else if (this.zal) {
                    return ConnectionResult.RESULT_SUCCESS;
                } else {
                    Log.w("GoogleApiClientImpl", zac());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(api.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                    ConnectionResult connectionResult = new ConnectionResult(8, (PendingIntent) null);
                    this.zaf.unlock();
                    return connectionResult;
                }
            } else {
                throw new IllegalArgumentException(String.valueOf(api.zad()).concat(" was never registered with GoogleApiClient"));
            }
        } finally {
            this.zaf.unlock();
        }
    }

    public final Context getContext() {
        return this.zaj;
    }

    public final Looper getLooper() {
        return this.zak;
    }

    public final boolean hasApi(Api<?> api) {
        return this.zab.containsKey(api.zac());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r2.zab.get(r3.zac());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasConnectedApi(com.google.android.gms.common.api.Api<?> r3) {
        /*
            r2 = this;
            boolean r0 = r2.isConnected()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.api.Api$Client> r0 = r2.zab
            com.google.android.gms.common.api.Api$AnyClientKey r3 = r3.zac()
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.common.api.Api$Client r3 = (com.google.android.gms.common.api.Api.Client) r3
            if (r3 == 0) goto L_0x001e
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L_0x001e
            r3 = 1
            return r3
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaar.hasConnectedApi(com.google.android.gms.common.api.Api):boolean");
    }

    public final boolean isConnected() {
        zabo zabo = this.zah;
        return zabo != null && zabo.zad();
    }

    public final boolean isConnecting() {
        zabo zabo = this.zah;
        return zabo != null && zabo.zae();
    }

    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zag.zab(connectionCallbacks);
    }

    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zag.zab(onConnectionFailedListener);
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zabo zabo = this.zah;
        return zabo != null && zabo.zaa(signInConnectionListener);
    }

    public final void maybeSignOut() {
        zabo zabo = this.zah;
        if (zabo != null) {
            zabo.zag();
        }
    }

    public final void reconnect() {
        disconnect();
        connect();
    }

    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zag.zaa(connectionCallbacks);
    }

    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zag.zaa(onConnectionFailedListener);
    }

    public final <L> ListenerHolder<L> registerListener(L l) {
        this.zaf.lock();
        try {
            return this.zau.zaa(l, this.zak, "NO_TYPE");
        } finally {
            this.zaf.unlock();
        }
    }

    public final void stopAutoManage(FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zai >= 0) {
            zai.zaa(lifecycleActivity).zaa(this.zai);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zag.zac(connectionCallbacks);
    }

    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zag.zac(onConnectionFailedListener);
    }

    public final boolean zab() {
        if (!this.zal) {
            return false;
        }
        this.zal = false;
        this.zao.removeMessages(2);
        this.zao.removeMessages(1);
        zabk zabk = this.zaq;
        if (zabk != null) {
            zabk.zaa();
            this.zaq = null;
        }
        return true;
    }

    public final String zac() {
        StringWriter stringWriter = new StringWriter();
        dump("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    private final void zaa(int i) {
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String zab2 = zab(i);
            String zab3 = zab(this.zaw.intValue());
            StringBuilder sb = new StringBuilder(C0391c.m1055a(zab3, C0391c.m1055a(zab2, 51)));
            sb.append("Cannot use sign-in mode: ");
            sb.append(zab2);
            sb.append(". Mode was already set to ");
            sb.append(zab3);
            throw new IllegalStateException(sb.toString());
        }
        if (this.zah == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.Client next : this.zab.values()) {
                if (next.requiresSignIn()) {
                    z = true;
                }
                if (next.providesSignIn()) {
                    z2 = true;
                }
            }
            int intValue = this.zaw.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    this.zah = zas.zaa(this.zaj, this, this.zaf, this.zak, this.zap, this.zab, this.zar, this.zas, this.zat, this.zav);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.zah = new zaaz(this.zaj, this, this.zaf, this.zak, this.zap, this.zab, this.zar, this.zas, this.zat, this.zav, this);
        }
    }

    public final void zab(zacn zacn) {
        zabo zabo;
        this.zaf.lock();
        try {
            Set<zacn> set = this.zad;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!set.remove(zacn)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!zag() && (zabo = this.zah) != null) {
                zabo.zaf();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    public final void connect(int i) {
        this.zaf.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            zaa(i);
            zad();
        } finally {
            this.zaf.unlock();
        }
    }

    public final ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaf.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zaa((Iterable<Api.Client>) this.zab.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zaa(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zag.zab();
            return ((zabo) Preconditions.checkNotNull(this.zah)).zaa(j, timeUnit);
        } finally {
            this.zaf.unlock();
        }
    }

    public final void zaa(Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute(this.zaa.remove());
        }
        this.zag.zaa(bundle);
    }

    public final void zaa(ConnectionResult connectionResult) {
        if (!this.zap.isPlayServicesPossiblyUpdating(this.zaj, connectionResult.getErrorCode())) {
            zab();
        }
        if (!this.zal) {
            this.zag.zaa(connectionResult);
            this.zag.zaa();
        }
    }

    public final void zaa(int i, boolean z) {
        if (i == 1 && !z && !this.zal) {
            this.zal = true;
            if (this.zaq == null && !ClientLibraryUtils.isPackageSide()) {
                try {
                    this.zaq = this.zap.zaa(this.zaj.getApplicationContext(), (zabm) new zaax(this));
                } catch (SecurityException unused) {
                }
            }
            zaau zaau = this.zao;
            zaau.sendMessageDelayed(zaau.obtainMessage(1), this.zam);
            zaau zaau2 = this.zao;
            zaau2.sendMessageDelayed(zaau2.obtainMessage(2), this.zan);
        }
        for (BasePendingResult forceFailureUnlessReady : (BasePendingResult[]) this.zae.zab.toArray(new BasePendingResult[0])) {
            forceFailureUnlessReady.forceFailureUnlessReady(zaco.zaa);
        }
        this.zag.zaa(i);
        this.zag.zaa();
        if (i == 2) {
            zad();
        }
    }

    public final void zaa(zacn zacn) {
        this.zaf.lock();
        try {
            if (this.zad == null) {
                this.zad = new HashSet();
            }
            this.zad.add(zacn);
        } finally {
            this.zaf.unlock();
        }
    }

    public static int zaa(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client next : iterable) {
            if (next.requiresSignIn()) {
                z2 = true;
            }
            if (next.providesSignIn()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
