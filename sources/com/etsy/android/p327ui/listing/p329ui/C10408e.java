package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.C10487a;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.e */
public final class C10408e {

    /* renamed from: a */
    public CharSequence f22783a;

    /* renamed from: b */
    public CharSequence f22784b;

    /* renamed from: c */
    public final List<C10487a> f22785c;

    /* renamed from: d */
    public String f22786d;

    /* renamed from: e */
    public String f22787e;

    /* renamed from: f */
    public final Boolean f22788f;

    /* renamed from: g */
    public final Boolean f22789g;

    /* renamed from: h */
    public String f22790h;

    /* renamed from: i */
    public String f22791i;

    /* renamed from: j */
    public boolean f22792j;

    /* renamed from: k */
    public String f22793k;

    /* renamed from: l */
    public String f22794l;

    /* renamed from: m */
    public String f22795m;

    /* renamed from: n */
    public MachineTranslationViewState f22796n;

    /* renamed from: o */
    public boolean f22797o;

    public C10408e(CharSequence charSequence, CharSequence charSequence2, List<C10487a> list, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, boolean z, String str5, String str6, String str7, MachineTranslationViewState machineTranslationViewState, boolean z2) {
        MachineTranslationViewState machineTranslationViewState2 = machineTranslationViewState;
        C19383o.m32797g(machineTranslationViewState2, "machineTranslationViewState");
        this.f22783a = charSequence;
        this.f22784b = charSequence2;
        this.f22785c = list;
        this.f22786d = str;
        this.f22787e = str2;
        this.f22788f = bool;
        this.f22789g = bool2;
        this.f22790h = str3;
        this.f22791i = str4;
        this.f22792j = z;
        this.f22793k = str5;
        this.f22794l = str6;
        this.f22795m = str7;
        this.f22796n = machineTranslationViewState2;
        this.f22797o = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10408e)) {
            return false;
        }
        C10408e eVar = (C10408e) obj;
        return C19383o.m32792b(this.f22783a, eVar.f22783a) && C19383o.m32792b(this.f22784b, eVar.f22784b) && C19383o.m32792b(this.f22785c, eVar.f22785c) && C19383o.m32792b(this.f22786d, eVar.f22786d) && C19383o.m32792b(this.f22787e, eVar.f22787e) && C19383o.m32792b(this.f22788f, eVar.f22788f) && C19383o.m32792b(this.f22789g, eVar.f22789g) && C19383o.m32792b(this.f22790h, eVar.f22790h) && C19383o.m32792b(this.f22791i, eVar.f22791i) && this.f22792j == eVar.f22792j && C19383o.m32792b(this.f22793k, eVar.f22793k) && C19383o.m32792b(this.f22794l, eVar.f22794l) && C19383o.m32792b(this.f22795m, eVar.f22795m) && this.f22796n == eVar.f22796n && this.f22797o == eVar.f22797o;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f22783a;
        int i = 0;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f22784b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List<C10487a> list = this.f22785c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f22786d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22787e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f22788f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f22789g;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f22790h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f22791i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.f22792j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        String str5 = this.f22793k;
        int hashCode10 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f22794l;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f22795m;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int hashCode12 = (this.f22796n.hashCode() + ((hashCode11 + i) * 31)) * 31;
        boolean z3 = this.f22797o;
        if (!z3) {
            z2 = z3;
        }
        return hashCode12 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ItemDetailsPanelBuilder(specialOfferDetails=");
        h.append(this.f22783a);
        h.append(", freeShippingDetails=");
        h.append(this.f22784b);
        h.append(", itemDetails=");
        h.append(this.f22785c);
        h.append(", description=");
        h.append(this.f22786d);
        h.append(", descriptionTitleText=");
        h.append(this.f22787e);
        h.append(", showInlineDescription=");
        h.append(this.f22788f);
        h.append(", ellipsizeDescription=");
        h.append(this.f22789g);
        h.append(", descriptionInAlternateLanguage=");
        h.append(this.f22790h);
        h.append(", manufacturers=");
        h.append(this.f22791i);
        h.append(", isTranslated=");
        h.append(this.f22792j);
        h.append(", originalLanguageCode=");
        h.append(this.f22793k);
        h.append(", languageCode=");
        h.append(this.f22794l);
        h.append(", alternateLanguageCode=");
        h.append(this.f22795m);
        h.append(", machineTranslationViewState=");
        h.append(this.f22796n);
        h.append(", isExpanded=");
        return C0391c.m1058d(h, this.f22797o, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10408e() {
        /*
            r16 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.etsy.android.ui.listing.ui.MachineTranslationViewState r14 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.VISIBLE
            r15 = 0
            r0 = r16
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.C10408e.<init>():void");
    }
}
