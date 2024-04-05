package com.etsy.android.lib.selfuser;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class SelfUserProfileCountry {

    /* renamed from: a */
    public final String f19510a;

    /* renamed from: b */
    public final int f19511b;

    /* renamed from: c */
    public final String f19512c;

    /* renamed from: d */
    public final String f19513d;

    public SelfUserProfileCountry(@C17402n(name = "name") String str, @C17402n(name = "country_id") int i, @C17402n(name = "iso_country_code") String str2, @C17402n(name = "world_bank_country_code") String str3) {
        C19383o.m32797g(str, "name");
        this.f19510a = str;
        this.f19511b = i;
        this.f19512c = str2;
        this.f19513d = str3;
    }

    public final SelfUserProfileCountry copy(@C17402n(name = "name") String str, @C17402n(name = "country_id") int i, @C17402n(name = "iso_country_code") String str2, @C17402n(name = "world_bank_country_code") String str3) {
        C19383o.m32797g(str, "name");
        return new SelfUserProfileCountry(str, i, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfUserProfileCountry)) {
            return false;
        }
        SelfUserProfileCountry selfUserProfileCountry = (SelfUserProfileCountry) obj;
        return C19383o.m32792b(this.f19510a, selfUserProfileCountry.f19510a) && this.f19511b == selfUserProfileCountry.f19511b && C19383o.m32792b(this.f19512c, selfUserProfileCountry.f19512c) && C19383o.m32792b(this.f19513d, selfUserProfileCountry.f19513d);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f19511b, this.f19510a.hashCode() * 31, 31);
        String str = this.f19512c;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19513d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SelfUserProfileCountry(name=");
        h.append(this.f19510a);
        h.append(", countryId=");
        h.append(this.f19511b);
        h.append(", isoCountryCode=");
        h.append(this.f19512c);
        h.append(", worldBankCountryCode=");
        return C0391c.m1057c(h, this.f19513d, ')');
    }
}
