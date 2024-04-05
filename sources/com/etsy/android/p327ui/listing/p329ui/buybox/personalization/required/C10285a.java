package com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p498zc.C13949d;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.personalization.required.a */
public final class C10285a extends C10423j implements C13949d {

    /* renamed from: a */
    public final boolean f22599a;

    /* renamed from: b */
    public final String f22600b;

    /* renamed from: c */
    public final int f22601c;

    /* renamed from: d */
    public final Integer f22602d;

    /* renamed from: e */
    public final String f22603e;

    public C10285a(boolean z, String str, int i, Integer num, String str2) {
        this.f22599a = z;
        this.f22600b = str;
        this.f22601c = i;
        this.f22602d = num;
        this.f22603e = str2;
    }

    /* renamed from: b */
    public static C10285a m18346b(C10285a aVar, boolean z, Integer num, String str, int i) {
        if ((i & 1) != 0) {
            z = aVar.f22599a;
        }
        boolean z2 = z;
        String str2 = (i & 2) != 0 ? aVar.f22600b : null;
        int i2 = (i & 4) != 0 ? aVar.f22601c : 0;
        if ((i & 8) != 0) {
            num = aVar.f22602d;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            str = aVar.f22603e;
        }
        aVar.getClass();
        C19383o.m32797g(str2, "instructions");
        return new C10285a(z2, str2, i2, num2, str);
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.PERSONALIZATION_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10285a)) {
            return false;
        }
        C10285a aVar = (C10285a) obj;
        return this.f22599a == aVar.f22599a && C19383o.m32792b(this.f22600b, aVar.f22600b) && this.f22601c == aVar.f22601c && C19383o.m32792b(this.f22602d, aVar.f22602d) && C19383o.m32792b(this.f22603e, aVar.f22603e);
    }

    public final int hashCode() {
        boolean z = this.f22599a;
        if (z) {
            z = true;
        }
        int a = C0069a.m170a(this.f22601c, C0023f.m105e(this.f22600b, (z ? 1 : 0) * true, 31), 31);
        Integer num = this.f22602d;
        int i = 0;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f22603e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("PersonalizationRequired(isExpanded=");
        h.append(this.f22599a);
        h.append(", instructions=");
        h.append(this.f22600b);
        h.append(", maxLength=");
        h.append(this.f22601c);
        h.append(", errorMessageRes=");
        h.append(this.f22602d);
        h.append(", userInput=");
        return C0391c.m1057c(h, this.f22603e, ')');
    }
}
