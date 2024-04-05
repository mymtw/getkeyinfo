package com.etsy.android.search;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class AutoSuggestVariant {

    /* renamed from: a */
    public final String f19774a;

    public AutoSuggestVariant(@C17402n(name = "variant") String str) {
        C19383o.m32797g(str, "variant");
        this.f19774a = str;
    }

    public final AutoSuggestVariant copy(@C17402n(name = "variant") String str) {
        C19383o.m32797g(str, "variant");
        return new AutoSuggestVariant(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoSuggestVariant) && C19383o.m32792b(this.f19774a, ((AutoSuggestVariant) obj).f19774a);
    }

    public final int hashCode() {
        return this.f19774a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("AutoSuggestVariant(variant="), this.f19774a, ')');
    }
}
