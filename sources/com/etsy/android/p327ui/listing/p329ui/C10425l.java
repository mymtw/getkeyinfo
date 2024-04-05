package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.l */
public final class C10425l {

    /* renamed from: j */
    public static final C10426a f22892j = new C10426a();

    /* renamed from: a */
    public final boolean f22893a;

    /* renamed from: b */
    public final boolean f22894b;

    /* renamed from: c */
    public final String f22895c;

    /* renamed from: d */
    public final String f22896d;

    /* renamed from: e */
    public final String f22897e;

    /* renamed from: f */
    public final String f22898f;

    /* renamed from: g */
    public final String f22899g;

    /* renamed from: h */
    public final String f22900h;

    /* renamed from: i */
    public final boolean f22901i;

    /* renamed from: com.etsy.android.ui.listing.ui.l$a */
    public static final class C10426a {
    }

    public C10425l() {
        this(false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10425l(boolean r14, boolean r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22) {
        /*
            r13 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r14
        L_0x000a:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            r5 = r2
            goto L_0x0011
        L_0x0010:
            r5 = r15
        L_0x0011:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0018
            r6 = r2
            goto L_0x001a
        L_0x0018:
            r6 = r16
        L_0x001a:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0020
            r7 = r2
            goto L_0x0022
        L_0x0020:
            r7 = r17
        L_0x0022:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0028
            r8 = r2
            goto L_0x002a
        L_0x0028:
            r8 = r18
        L_0x002a:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0030
            r9 = r2
            goto L_0x0032
        L_0x0030:
            r9 = r19
        L_0x0032:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0038
            r10 = r2
            goto L_0x003a
        L_0x0038:
            r10 = r20
        L_0x003a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0040
            r11 = r2
            goto L_0x0042
        L_0x0040:
            r11 = r21
        L_0x0042:
            r12 = 0
            r3 = r13
            r3.<init>((boolean) r4, (boolean) r5, (java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (boolean) r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.C10425l.<init>(boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: a */
    public static C10425l m18427a(C10425l lVar, boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? lVar.f22893a : false;
        if ((i & 2) != 0) {
            z = lVar.f22894b;
        }
        boolean z4 = z;
        String str = (i & 4) != 0 ? lVar.f22895c : null;
        String str2 = (i & 8) != 0 ? lVar.f22896d : null;
        String str3 = (i & 16) != 0 ? lVar.f22897e : null;
        String str4 = (i & 32) != 0 ? lVar.f22898f : null;
        String str5 = (i & 64) != 0 ? lVar.f22899g : null;
        String str6 = (i & 128) != 0 ? lVar.f22900h : null;
        if ((i & 256) != 0) {
            z2 = lVar.f22901i;
        }
        lVar.getClass();
        return new C10425l(z3, z4, str, str2, str3, str4, str5, str6, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10425l)) {
            return false;
        }
        C10425l lVar = (C10425l) obj;
        return this.f22893a == lVar.f22893a && this.f22894b == lVar.f22894b && C19383o.m32792b(this.f22895c, lVar.f22895c) && C19383o.m32792b(this.f22896d, lVar.f22896d) && C19383o.m32792b(this.f22897e, lVar.f22897e) && C19383o.m32792b(this.f22898f, lVar.f22898f) && C19383o.m32792b(this.f22899g, lVar.f22899g) && C19383o.m32792b(this.f22900h, lVar.f22900h) && this.f22901i == lVar.f22901i;
    }

    public final int hashCode() {
        boolean z = this.f22893a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f22894b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        String str = this.f22895c;
        int i3 = 0;
        int hashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22896d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f22897e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22898f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f22899g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f22900h;
        if (str6 != null) {
            i3 = str6.hashCode();
        }
        int i4 = (hashCode5 + i3) * 31;
        boolean z4 = this.f22901i;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MachineTranslationData(isContentMachineTranslatable=");
        h.append(this.f22893a);
        h.append(", isContentMachineTranslated=");
        h.append(this.f22894b);
        h.append(", translatedTitle=");
        h.append(this.f22895c);
        h.append(", untranslatedTitle=");
        h.append(this.f22896d);
        h.append(", translatedDescription=");
        h.append(this.f22897e);
        h.append(", untranslatedDescription=");
        h.append(this.f22898f);
        h.append(", fromLangCode=");
        h.append(this.f22899g);
        h.append(", toLangCode=");
        h.append(this.f22900h);
        h.append(", isFaqMachineTranslated=");
        return C0391c.m1058d(h, this.f22901i, ')');
    }

    public C10425l(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, boolean z3) {
        this.f22893a = z;
        this.f22894b = z2;
        this.f22895c = str;
        this.f22896d = str2;
        this.f22897e = str3;
        this.f22898f = str4;
        this.f22899g = str5;
        this.f22900h = str6;
        this.f22901i = z3;
    }
}
