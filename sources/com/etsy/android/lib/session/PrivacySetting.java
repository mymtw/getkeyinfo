package com.etsy.android.lib.session;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class PrivacySetting {

    /* renamed from: a */
    public final String f19533a;

    /* renamed from: b */
    public final int f19534b;

    /* renamed from: c */
    public final boolean f19535c;

    public PrivacySetting(@C17402n(name = "setting") String str, @C17402n(name = "raw_value") int i, @C17402n(name = "consent_value") boolean z) {
        C19383o.m32797g(str, "key");
        this.f19533a = str;
        this.f19534b = i;
        this.f19535c = z;
    }

    public final PrivacySetting copy(@C17402n(name = "setting") String str, @C17402n(name = "raw_value") int i, @C17402n(name = "consent_value") boolean z) {
        C19383o.m32797g(str, "key");
        return new PrivacySetting(str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySetting)) {
            return false;
        }
        PrivacySetting privacySetting = (PrivacySetting) obj;
        return C19383o.m32792b(this.f19533a, privacySetting.f19533a) && this.f19534b == privacySetting.f19534b && this.f19535c == privacySetting.f19535c;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f19534b, this.f19533a.hashCode() * 31, 31);
        boolean z = this.f19535c;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PrivacySetting(key=");
        h.append(this.f19533a);
        h.append(", logValue=");
        h.append(this.f19534b);
        h.append(", enabled=");
        return C0391c.m1058d(h, this.f19535c, ')');
    }
}
