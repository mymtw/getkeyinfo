package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.compose.animation.C0391c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zas;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public final class NonGmsServiceBrokerClient implements ServiceConnection, Api.Client {
    private static final String zaa = "NonGmsServiceBrokerClient";
    private final String zab;
    private final String zac;
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    private IBinder zai;
    private boolean zaj;
    private String zak;
    private String zal;

    static {
        Class<NonGmsServiceBrokerClient> cls = NonGmsServiceBrokerClient.class;
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, (ComponentName) null, connectionCallbacks, onConnectionFailedListener);
    }

    private final void zab() {
        if (Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public final void connect(@RecentlyNonNull BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        zab();
        zab("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.zad;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            boolean bindService = this.zae.bindService(intent, this, GmsClientSupervisor.getDefaultBindFlags());
            this.zaj = bindService;
            if (!bindService) {
                this.zai = null;
                this.zah.onConnectionFailed(new ConnectionResult(16));
            }
            zab("Finished connect.");
        } catch (SecurityException e) {
            this.zaj = false;
            this.zai = null;
            throw e;
        }
    }

    public final void disconnect(@RecentlyNonNull String str) {
        zab();
        this.zak = str;
        disconnect();
    }

    public final void dump(@RecentlyNonNull String str, FileDescriptor fileDescriptor, @RecentlyNonNull PrintWriter printWriter, String[] strArr) {
    }

    @RecentlyNonNull
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @KeepForSdk
    @RecentlyNullable
    public final IBinder getBinder() {
        zab();
        return this.zai;
    }

    @RecentlyNonNull
    public final String getEndpointPackageName() {
        String str = this.zab;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    @RecentlyNullable
    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    @RecentlyNonNull
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @RecentlyNullable
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @RecentlyNonNull
    public final Intent getSignInIntent() {
        return new Intent();
    }

    public final boolean isConnected() {
        zab();
        return this.zai != null;
    }

    public final boolean isConnecting() {
        zab();
        return this.zaj;
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.zag.post(new zabs(this, iBinder));
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        this.zag.post(new zabt(this));
    }

    public final void onUserSignOut(@RecentlyNonNull BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresAccount() {
        return false;
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }

    public final void zaa(String str) {
        this.zal = str;
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull ComponentName componentName, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, (String) null, (String) null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    public final /* synthetic */ void zaa() {
        this.zaj = false;
        this.zai = null;
        zab("Disconnected.");
        this.zaf.onConnectionSuspended(1);
    }

    private NonGmsServiceBrokerClient(Context context, Looper looper, String str, String str2, ComponentName componentName, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        boolean z = false;
        this.zaj = false;
        this.zak = null;
        this.zae = context;
        this.zag = new zas(looper);
        this.zaf = connectionCallbacks;
        this.zah = onConnectionFailedListener;
        boolean z2 = (str == null || str2 == null) ? false : true;
        z = componentName != null ? true : z;
        if (!z2 ? !z : z) {
            throw new AssertionError("Must specify either package or component, but not both");
        }
        this.zab = str;
        this.zac = str2;
        this.zad = componentName;
    }

    private final void zab(String str) {
        String valueOf = String.valueOf(this.zai);
        new StringBuilder(valueOf.length() + C0391c.m1055a(str, 30));
    }

    public final void disconnect() {
        zab();
        zab("Disconnect called.");
        try {
            this.zae.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.zaj = false;
        this.zai = null;
    }

    public final /* synthetic */ void zaa(IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        zab("Connected.");
        this.zaf.onConnected(new Bundle());
    }
}
