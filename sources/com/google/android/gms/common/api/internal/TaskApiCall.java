package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import p605kk.C18124h;

@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        /* access modifiers changed from: private */
        public RemoteCall<A, C18124h<ResultT>> zaa;
        private boolean zab;
        private Feature[] zac;
        private int zad;

        private Builder() {
            this.zab = true;
            this.zad = 0;
        }

        @RecentlyNonNull
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            return new zacj(this, this.zac, this.zab, this.zad);
        }

        @RecentlyNonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@RecentlyNonNull BiConsumer<A, C18124h<ResultT>> biConsumer) {
            this.zaa = new zack(biConsumer);
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> run(@RecentlyNonNull RemoteCall<A, C18124h<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zab = z;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> setFeatures(@RecentlyNonNull Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i) {
            this.zad = i;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    @RecentlyNonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>();
    }

    @KeepForSdk
    public abstract void doExecute(@RecentlyNonNull A a, @RecentlyNonNull C18124h<ResultT> hVar) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    @RecentlyNullable
    public final Feature[] zaa() {
        return this.zaa;
    }

    public final int zab() {
        return this.zac;
    }

    @KeepForSdk
    public TaskApiCall(@RecentlyNonNull Feature[] featureArr, boolean z, int i) {
        this.zaa = featureArr;
        this.zab = featureArr != null && z;
        this.zac = i;
    }
}
