package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p498zc.C13949d;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.optional.a */
public final class C10279a extends C10423j implements C13949d {

    /* renamed from: a */
    public final boolean f22585a;

    /* renamed from: b */
    public final String f22586b;

    /* renamed from: c */
    public final int f22587c;

    /* renamed from: d */
    public final Integer f22588d;

    /* renamed from: e */
    public final String f22589e;

    public C10279a(boolean z, String str, int i, Integer num, String str2) {
        this.f22585a = z;
        this.f22586b = str;
        this.f22587c = i;
        this.f22588d = num;
        this.f22589e = str2;
    }

    /* renamed from: b */
    public static C10279a m18340b(C10279a aVar, boolean z, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            z = aVar.f22585a;
        }
        boolean z2 = z;
        String str2 = (i & 2) != 0 ? aVar.f22586b : null;
        int i2 = (i & 4) != 0 ? aVar.f22587c : 0;
        if ((i & 8) != 0) {
            num = aVar.f22588d;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str = aVar.f22589e;
        }
        aVar.getClass();
        C19383o.m32797g(str2, "instructions");
        return new C10279a(z2, str2, i2, num2, str);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.PERSONALIZATION_OPTIONAL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10279a)) {
            return false;
        }
        C10279a aVar = (C10279a) obj;
        return this.f22585a == aVar.f22585a && C19383o.m32792b(this.f22586b, aVar.f22586b) && this.f22587c == aVar.f22587c && C19383o.m32792b(this.f22588d, aVar.f22588d) && C19383o.m32792b(this.f22589e, aVar.f22589e);
    }

    public final int hashCode() {
        boolean z = this.f22585a;
        if (z) {
            z = true;
        }
        int a = C0069a.m170a(this.f22587c, C0023f.m105e(this.f22586b, (z ? 1 : 0) * true, 31), 31);
        Integer num = this.f22588d;
        int i = 0;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f22589e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PersonalizationOptional(isChecked=");
        h.append(this.f22585a);
        h.append(", instructions=");
        h.append(this.f22586b);
        h.append(", maxLength=");
        h.append(this.f22587c);
        h.append(", errorMessageRes=");
        h.append(this.f22588d);
        h.append(", userInput=");
        return C0391c.m1057c(h, this.f22589e, ')');
    }
}
