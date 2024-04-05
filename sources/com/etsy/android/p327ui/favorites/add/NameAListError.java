package com.etsy.android.p327ui.favorites.add;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.favorites.add.NameAListError */
public final class NameAListError {

    /* renamed from: a */
    public final String f21567a;

    public NameAListError(String str) {
        this.f21567a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NameAListError) && C19383o.m32792b(this.f21567a, ((NameAListError) obj).f21567a);
    }

    public final int hashCode() {
        String str = this.f21567a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("NameAListError(error="), this.f21567a, ')');
    }
}
