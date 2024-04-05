package com.etsy.android.p327ui.favorites.createalist;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
/* renamed from: com.etsy.android.ui.favorites.createalist.CreateAListError */
public final class CreateAListError {

    /* renamed from: a */
    public final String f21664a;

    public CreateAListError(String str) {
        this.f21664a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateAListError) && C19383o.m32792b(this.f21664a, ((CreateAListError) obj).f21664a);
    }

    public final int hashCode() {
        String str = this.f21664a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("CreateAListError(error="), this.f21664a, ')');
    }
}
