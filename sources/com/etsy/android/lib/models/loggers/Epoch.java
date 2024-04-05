package com.etsy.android.lib.models.loggers;

import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import p003a2.C0015b;

@C17403o(generateAdapter = true)
public final class Epoch {
    public static final int $stable = 0;
    private final long serverTime;

    public Epoch(@C17402n(name = "server_epoch") long j) {
        this.serverTime = j;
    }

    public static /* synthetic */ Epoch copy$default(Epoch epoch, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = epoch.serverTime;
        }
        return epoch.copy(j);
    }

    public final long component1() {
        return this.serverTime;
    }

    public final Epoch copy(@C17402n(name = "server_epoch") long j) {
        return new Epoch(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Epoch) && this.serverTime == ((Epoch) obj).serverTime;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        return Long.hashCode(this.serverTime);
    }

    public String toString() {
        return C0015b.m91j(C0072d.m201h("Epoch(serverTime="), this.serverTime, ')');
    }
}
