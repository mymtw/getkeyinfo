package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.etsy.android.lib.conversation.MessageDraft;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import p193o.C7494b;
import p581hk.C17821a;
import p581hk.C17826f;

final class zas implements zabo {
    private final Context zaa;
    private final zaar zab;
    private final Looper zac;
    /* access modifiers changed from: private */
    public final zaaz zad;
    /* access modifiers changed from: private */
    public final zaaz zae;
    private final Map<Api.AnyClientKey<?>, zaaz> zaf;
    private final Set<SignInConnectionListener> zag = Collections.newSetFromMap(new WeakHashMap());
    private final Api.Client zah;
    private Bundle zai;
    /* access modifiers changed from: private */
    public ConnectionResult zaj = null;
    /* access modifiers changed from: private */
    public ConnectionResult zak = null;
    /* access modifiers changed from: private */
    public boolean zal = false;
    /* access modifiers changed from: private */
    public final Lock zam;
    private int zan = 0;

    private zas(Context context, zaar zaar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends C17826f, C17821a> abstractClientBuilder, Api.Client client, ArrayList<zaq> arrayList, ArrayList<zaq> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.zaa = context;
        this.zab = zaar;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        Context context2 = context;
        zaar zaar2 = zaar;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zaaz zaaz = r3;
        zaaz zaaz2 = new zaaz(context2, zaar2, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder<? extends C17826f, C17821a>) null, arrayList2, new zau(this, (zar) null));
        this.zad = zaaz;
        this.zae = new zaaz(context2, zaar2, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new zat(this, (zar) null));
        C7494b bVar = new C7494b();
        for (Api.AnyClientKey<?> put : map2.keySet()) {
            bVar.put(put, this.zad);
        }
        for (Api.AnyClientKey<?> put2 : map.keySet()) {
            bVar.put(put2, this.zae);
        }
        this.zaf = Collections.unmodifiableMap(bVar);
    }

    public static zas zaa(Context context, zaar zaar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, ClientSettings clientSettings, Map<Api<?>, Boolean> map2, Api.AbstractClientBuilder<? extends C17826f, C17821a> abstractClientBuilder, ArrayList<zaq> arrayList) {
        Map<Api<?>, Boolean> map3 = map2;
        C7494b bVar = new C7494b();
        C7494b bVar2 = new C7494b();
        Api.Client client = null;
        for (Map.Entry next : map.entrySet()) {
            Api.Client client2 = (Api.Client) next.getValue();
            if (client2.providesSignIn()) {
                client = client2;
            }
            if (client2.requiresSignIn()) {
                bVar.put((Api.AnyClientKey) next.getKey(), client2);
            } else {
                bVar2.put((Api.AnyClientKey) next.getKey(), client2);
            }
        }
        Preconditions.checkState(!bVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C7494b bVar3 = new C7494b();
        C7494b bVar4 = new C7494b();
        for (Api next2 : map2.keySet()) {
            Api.AnyClientKey<?> zac2 = next2.zac();
            if (bVar.containsKey(zac2)) {
                bVar3.put(next2, map3.get(next2));
            } else if (bVar2.containsKey(zac2)) {
                bVar4.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            zaq zaq = arrayList.get(i);
            i++;
            zaq zaq2 = zaq;
            if (bVar3.containsKey(zaq2.zaa)) {
                arrayList2.add(zaq2);
            } else if (bVar4.containsKey(zaq2.zaa)) {
                arrayList3.add(zaq2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zas(context, zaar, lock, looper, googleApiAvailabilityLight, bVar, bVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, bVar3, bVar4);
    }

    /* access modifiers changed from: private */
    public final void zah() {
        ConnectionResult connectionResult;
        if (zab(this.zaj)) {
            if (zab(this.zak) || zaj()) {
                int i = this.zan;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.zan = 0;
                        return;
                    }
                    ((zaar) Preconditions.checkNotNull(this.zab)).zaa(this.zai);
                }
                zai();
                this.zan = 0;
                return;
            }
            ConnectionResult connectionResult2 = this.zak;
            if (connectionResult2 == null) {
                return;
            }
            if (this.zan == 1) {
                zai();
                return;
            }
            zaa(connectionResult2);
            this.zad.zac();
        } else if (this.zaj == null || !zab(this.zak)) {
            ConnectionResult connectionResult3 = this.zaj;
            if (connectionResult3 != null && (connectionResult = this.zak) != null) {
                if (this.zae.zac < this.zad.zac) {
                    connectionResult3 = connectionResult;
                }
                zaa(connectionResult3);
            }
        } else {
            this.zae.zac();
            zaa((ConnectionResult) Preconditions.checkNotNull(this.zaj));
        }
    }

    private final void zai() {
        for (SignInConnectionListener onComplete : this.zag) {
            onComplete.onComplete();
        }
        this.zag.clear();
    }

    private final boolean zaj() {
        ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final PendingIntent zak() {
        if (this.zah == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), this.zah.getSignInIntent(), 134217728);
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        if (!zac((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.zad.zab(t);
        }
        if (!zaj()) {
            return this.zae.zab(t);
        }
        t.setFailedResult(new Status(4, (String) null, zak()));
        return t;
    }

    public final void zac() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zac();
        this.zae.zac();
        zai();
    }

    public final boolean zad() {
        this.zam.lock();
        try {
            boolean z = true;
            if (!this.zad.zad() || (!this.zae.zad() && !zaj() && this.zan != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }

    public final boolean zae() {
        this.zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.zam.unlock();
        }
    }

    public final void zaf() {
        this.zad.zaf();
        this.zae.zaf();
    }

    public final void zag() {
        this.zam.lock();
        try {
            boolean zae2 = zae();
            this.zae.zac();
            this.zak = new ConnectionResult(4);
            if (zae2) {
                new com.google.android.gms.internal.base.zas(this.zac).post(new zar(this));
            } else {
                zai();
            }
        } finally {
            this.zam.unlock();
        }
    }

    private final boolean zac(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        zaaz zaaz = this.zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zaaz, "GoogleApiClient is not configured to use the API required for this call.");
        return zaaz.equals(this.zae);
    }

    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    private static boolean zab(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        if (!zac((BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient>) t)) {
            return this.zad.zaa(t);
        }
        if (!zaj()) {
            return this.zae.zaa(t);
        }
        t.setFailedResult(new Status(4, (String) null, zak()));
        return t;
    }

    public final ConnectionResult zaa(Api<?> api) {
        if (!Objects.equal(this.zaf.get(api.zac()), this.zae)) {
            return this.zad.zaa(api);
        }
        if (zaj()) {
            return new ConnectionResult(4, zak());
        }
        return this.zae.zaa(api);
    }

    public final void zaa() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaa();
        this.zae.zaa();
    }

    public final ConnectionResult zaa(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final boolean zaa(SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            if ((zae() || zad()) && !this.zae.zad()) {
                this.zag.add(signInConnectionListener);
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaa();
                return true;
            }
            this.zam.unlock();
            return false;
        } finally {
            this.zam.unlock();
        }
    }

    private final void zaa(ConnectionResult connectionResult) {
        int i = this.zan;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zan = 0;
            }
            this.zab.zaa(connectionResult);
        }
        zai();
        this.zan = 0;
    }

    /* access modifiers changed from: private */
    public final void zaa(int i, boolean z) {
        this.zab.zaa(i, z);
        this.zak = null;
        this.zaj = null;
    }

    /* access modifiers changed from: private */
    public final void zaa(Bundle bundle) {
        Bundle bundle2 = this.zai;
        if (bundle2 == null) {
            this.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public final void zaa(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(MessageDraft.IMAGE_DELIMITER);
        this.zae.zaa(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(MessageDraft.IMAGE_DELIMITER);
        this.zad.zaa(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
