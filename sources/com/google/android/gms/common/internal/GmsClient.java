package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public abstract class GmsClient<T extends IInterface> extends BaseGmsClient<T> implements Api.Client, zak {
    private final ClientSettings zaa;
    private final Set<Scope> zab;
    private final Account zac;

    @KeepForSdk
    @VisibleForTesting
    public GmsClient(@RecentlyNonNull Context context, @RecentlyNonNull Handler handler, int i, @RecentlyNonNull ClientSettings clientSettings) {
        this(context, handler, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (GoogleApiClient.ConnectionCallbacks) null, (GoogleApiClient.OnConnectionFailedListener) null);
    }

    private final Set<Scope> zaa(Set<Scope> set) {
        Set<Scope> validateScopes = validateScopes(set);
        for (Scope contains : validateScopes) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return validateScopes;
    }

    @RecentlyNullable
    public final Account getAccount() {
        return this.zac;
    }

    @RecentlyNonNull
    @KeepForSdk
    public final ClientSettings getClientSettings() {
        return this.zaa;
    }

    @RecentlyNonNull
    @KeepForSdk
    public Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @RecentlyNonNull
    @KeepForSdk
    public final Set<Scope> getScopes() {
        return this.zab;
    }

    @KeepForSdk
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zab : Collections.emptySet();
    }

    @KeepForSdk
    public Set<Scope> validateScopes(@RecentlyNonNull Set<Scope> set) {
        return set;
    }

    @KeepForSdk
    public GmsClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull ClientSettings clientSettings, @RecentlyNonNull ConnectionCallbacks connectionCallbacks, @RecentlyNonNull OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (ConnectionCallbacks) Preconditions.checkNotNull(connectionCallbacks), (OnConnectionFailedListener) Preconditions.checkNotNull(onConnectionFailedListener));
    }

    private static BaseGmsClient.BaseConnectionCallbacks zaa(ConnectionCallbacks connectionCallbacks) {
        if (connectionCallbacks == null) {
            return null;
        }
        return new zag(connectionCallbacks);
    }

    private static BaseGmsClient.BaseOnConnectionFailedListener zaa(OnConnectionFailedListener onConnectionFailedListener) {
        if (onConnectionFailedListener == null) {
            return null;
        }
        return new zai(onConnectionFailedListener);
    }

    @KeepForSdk
    @Deprecated
    public GmsClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull ClientSettings clientSettings, @RecentlyNonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks, @RecentlyNonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, i, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
    }

    @KeepForSdk
    public GmsClient(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, int i, @RecentlyNonNull ClientSettings clientSettings) {
        this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailability.getInstance(), i, clientSettings, (GoogleApiClient.ConnectionCallbacks) null, (GoogleApiClient.OnConnectionFailedListener) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    private GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, gmsClientSupervisor, googleApiAvailability, i, zaa(connectionCallbacks), zaa(onConnectionFailedListener), clientSettings.zab());
        this.zaa = clientSettings;
        this.zac = clientSettings.getAccount();
        this.zab = zaa(clientSettings.getAllRequestedScopes());
    }

    @VisibleForTesting
    private GmsClient(Context context, Looper looper, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, gmsClientSupervisor, googleApiAvailability, i, clientSettings, (ConnectionCallbacks) null, (OnConnectionFailedListener) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    private GmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, handler, gmsClientSupervisor, googleApiAvailability, i, zaa((ConnectionCallbacks) null), zaa((OnConnectionFailedListener) null));
        this.zaa = (ClientSettings) Preconditions.checkNotNull(clientSettings);
        this.zac = clientSettings.getAccount();
        this.zab = zaa(clientSettings.getAllRequestedScopes());
    }

    @Deprecated
    @VisibleForTesting
    private GmsClient(Context context, Handler handler, GmsClientSupervisor gmsClientSupervisor, GoogleApiAvailability googleApiAvailability, int i, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this(context, handler, gmsClientSupervisor, googleApiAvailability, i, clientSettings, (ConnectionCallbacks) null, (OnConnectionFailedListener) null);
    }
}
