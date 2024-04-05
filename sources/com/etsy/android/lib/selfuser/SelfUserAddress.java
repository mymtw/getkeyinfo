package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SelfUserAddress {

    /* renamed from: a */
    public final String f19487a;

    /* renamed from: b */
    public final int f19488b;

    /* renamed from: c */
    public final boolean f19489c;

    public SelfUserAddress(@C17402n(name = "zip") String str, @C17402n(name = "country_id") int i, @C17402n(name = "is_default_shipping") boolean z) {
        C19383o.m32797g(str, ResponseConstants.ZIP);
        this.f19487a = str;
        this.f19488b = i;
        this.f19489c = z;
    }

    public final SelfUserAddress copy(@C17402n(name = "zip") String str, @C17402n(name = "country_id") int i, @C17402n(name = "is_default_shipping") boolean z) {
        C19383o.m32797g(str, ResponseConstants.ZIP);
        return new SelfUserAddress(str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUserAddress)) {
            return false;
        }
        SelfUserAddress selfUserAddress = (SelfUserAddress) obj;
        return C19383o.m32792b(this.f19487a, selfUserAddress.f19487a) && this.f19488b == selfUserAddress.f19488b && this.f19489c == selfUserAddress.f19489c;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f19488b, this.f19487a.hashCode() * 31, 31);
        boolean z = this.f19489c;
        if (z) {
            z = true;
        }
        return a + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUserAddress(zip=");
        h.append(this.f19487a);
        h.append(", countryId=");
        h.append(this.f19488b);
        h.append(", isDefaultShipping=");
        return C0391c.m1058d(h, this.f19489c, ')');
    }
}
