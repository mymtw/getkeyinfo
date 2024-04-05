package com.etsy.android.lib.push.registration;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class TokenRegistrationResult {

    /* renamed from: a */
    public final String f19408a;

    public TokenRegistrationResult(@C17402n(name = "prev_rejected_notif_token") String str) {
        this.f19408a = str;
    }

    public final TokenRegistrationResult copy(@C17402n(name = "prev_rejected_notif_token") String str) {
        return new TokenRegistrationResult(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TokenRegistrationResult) && C19383o.m32792b(this.f19408a, ((TokenRegistrationResult) obj).f19408a);
    }

    public final int hashCode() {
        String str = this.f19408a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("TokenRegistrationResult(rejectedToken="), this.f19408a, ')');
    }
}
