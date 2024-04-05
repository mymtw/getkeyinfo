package com.etsy.android.lib.core.http;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class HttpErrorMessage {

    /* renamed from: a */
    public final String f18955a;

    public HttpErrorMessage(@C17402n(name = "error") String str) {
        this.f18955a = str;
    }

    public final HttpErrorMessage copy(@C17402n(name = "error") String str) {
        return new HttpErrorMessage(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HttpErrorMessage) && C19383o.m32792b(this.f18955a, ((HttpErrorMessage) obj).f18955a);
    }

    public final int hashCode() {
        String str = this.f18955a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("HttpErrorMessage(error="), this.f18955a, ')');
    }
}
