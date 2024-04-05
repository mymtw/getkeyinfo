package com.etsy.android.marketing.sweepstakes;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class SweepstakesBanner {

    /* renamed from: a */
    public final String f19694a;

    /* renamed from: b */
    public final String f19695b;

    /* renamed from: c */
    public final String f19696c;

    public SweepstakesBanner(String str, String str2, String str3) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, "description");
        this.f19694a = str;
        this.f19695b = str2;
        this.f19696c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepstakesBanner)) {
            return false;
        }
        SweepstakesBanner sweepstakesBanner = (SweepstakesBanner) obj;
        return C19383o.m32792b(this.f19694a, sweepstakesBanner.f19694a) && C19383o.m32792b(this.f19695b, sweepstakesBanner.f19695b) && C19383o.m32792b(this.f19696c, sweepstakesBanner.f19696c);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f19695b, this.f19694a.hashCode() * 31, 31);
        String str = this.f19696c;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SweepstakesBanner(title=");
        h.append(this.f19694a);
        h.append(", description=");
        h.append(this.f19695b);
        h.append(", icon=");
        return C0391c.m1057c(h, this.f19696c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SweepstakesBanner(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3);
    }
}
