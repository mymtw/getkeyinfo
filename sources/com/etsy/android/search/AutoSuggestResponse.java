package com.etsy.android.search;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class AutoSuggestResponse {

    /* renamed from: a */
    public final String f19773a;

    public AutoSuggestResponse(@C17402n(name = "query") String str) {
        this.f19773a = str;
    }

    public final AutoSuggestResponse copy(@C17402n(name = "query") String str) {
        return new AutoSuggestResponse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutoSuggestResponse) && C19383o.m32792b(this.f19773a, ((AutoSuggestResponse) obj).f19773a);
    }

    public final int hashCode() {
        String str = this.f19773a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("AutoSuggestResponse(query="), this.f19773a, ')');
    }
}
