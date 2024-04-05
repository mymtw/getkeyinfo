package com.etsy.android.lib.session;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class Feature {

    /* renamed from: a */
    public final String f19530a;

    /* renamed from: b */
    public final boolean f19531b;

    /* renamed from: c */
    public final String f19532c;

    public Feature(@C17402n(name = "name") String str, @C17402n(name = "enabled") boolean z, @C17402n(name = "variant") String str2) {
        C19383o.m32797g(str, "name");
        this.f19530a = str;
        this.f19531b = z;
        this.f19532c = str2;
    }

    public final Feature copy(@C17402n(name = "name") String str, @C17402n(name = "enabled") boolean z, @C17402n(name = "variant") String str2) {
        C19383o.m32797g(str, "name");
        return new Feature(str, z, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        return C19383o.m32792b(this.f19530a, feature.f19530a) && this.f19531b == feature.f19531b && C19383o.m32792b(this.f19532c, feature.f19532c);
    }

    public final int hashCode() {
        int hashCode = this.f19530a.hashCode() * 31;
        boolean z = this.f19531b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.f19532c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Feature(name=");
        h.append(this.f19530a);
        h.append(", enabled=");
        h.append(this.f19531b);
        h.append(", variant=");
        return C0391c.m1057c(h, this.f19532c, ')');
    }
}
