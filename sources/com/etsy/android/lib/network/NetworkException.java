package com.etsy.android.lib.network;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

public final class NetworkException extends IllegalArgumentException {
    public static final int $stable = 0;
    private final int code;
    private final String statusMessage;

    public NetworkException(int i, String str) {
        C19383o.m32797g(str, "statusMessage");
        this.code = i;
        this.statusMessage = str;
    }

    public static /* synthetic */ NetworkException copy$default(NetworkException networkException, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = networkException.code;
        }
        if ((i2 & 2) != 0) {
            str = networkException.statusMessage;
        }
        return networkException.copy(i, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.statusMessage;
    }

    public final NetworkException copy(int i, String str) {
        C19383o.m32797g(str, "statusMessage");
        return new NetworkException(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkException)) {
            return false;
        }
        NetworkException networkException = (NetworkException) obj;
        return this.code == networkException.code && C19383o.m32792b(this.statusMessage, networkException.statusMessage);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public int hashCode() {
        return this.statusMessage.hashCode() + (Integer.hashCode(this.code) * 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("NetworkException(code=");
        h.append(this.code);
        h.append(", statusMessage=");
        return C0391c.m1057c(h, this.statusMessage, ')');
    }
}
