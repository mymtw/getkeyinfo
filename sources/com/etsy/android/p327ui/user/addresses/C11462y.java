package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.addresses.y */
public final class C11462y {

    /* renamed from: a */
    public final String f25301a;

    /* renamed from: b */
    public final String f25302b;

    /* renamed from: c */
    public final String f25303c;

    /* renamed from: d */
    public final String f25304d;

    /* renamed from: e */
    public final String f25305e;

    /* renamed from: f */
    public final String f25306f;

    /* renamed from: g */
    public final int f25307g;

    /* renamed from: h */
    public final String f25308h;

    /* renamed from: i */
    public final boolean f25309i;

    /* renamed from: j */
    public final int f25310j = 0;

    public C11462y(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, boolean z) {
        this.f25301a = str;
        this.f25302b = str2;
        this.f25303c = str3;
        this.f25304d = str4;
        this.f25305e = str5;
        this.f25306f = str6;
        this.f25307g = i;
        this.f25308h = str7;
        this.f25309i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11462y)) {
            return false;
        }
        C11462y yVar = (C11462y) obj;
        return C19383o.m32792b(this.f25301a, yVar.f25301a) && C19383o.m32792b(this.f25302b, yVar.f25302b) && C19383o.m32792b(this.f25303c, yVar.f25303c) && C19383o.m32792b(this.f25304d, yVar.f25304d) && C19383o.m32792b(this.f25305e, yVar.f25305e) && C19383o.m32792b(this.f25306f, yVar.f25306f) && this.f25307g == yVar.f25307g && C19383o.m32792b(this.f25308h, yVar.f25308h) && this.f25309i == yVar.f25309i && this.f25310j == yVar.f25310j;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f25307g, C0023f.m105e(this.f25306f, C0023f.m105e(this.f25305e, C0023f.m105e(this.f25304d, C0023f.m105e(this.f25303c, C0023f.m105e(this.f25302b, this.f25301a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
        String str = this.f25308h;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f25309i;
        if (z) {
            z = true;
        }
        return Integer.hashCode(this.f25310j) + ((hashCode + (z ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AddressParameters(name=");
        h.append(this.f25301a);
        h.append(", firstLine=");
        h.append(this.f25302b);
        h.append(", secondLine=");
        h.append(this.f25303c);
        h.append(", city=");
        h.append(this.f25304d);
        h.append(", state=");
        h.append(this.f25305e);
        h.append(", zip=");
        h.append(this.f25306f);
        h.append(", countryId=");
        h.append(this.f25307g);
        h.append(", phoneNumber=");
        h.append(this.f25308h);
        h.append(", isDefaultShipping=");
        h.append(this.f25309i);
        h.append(", verificationState=");
        return C0073e.m208h(h, this.f25310j, ')');
    }
}
