package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.h */
public final class C10208h {

    /* renamed from: a */
    public final String f22441a;

    /* renamed from: b */
    public final Image f22442b;

    /* renamed from: c */
    public final CharSequence f22443c;

    /* renamed from: d */
    public final Boolean f22444d;

    /* renamed from: e */
    public final Boolean f22445e;

    /* renamed from: f */
    public final MachineTranslationViewState f22446f;

    /* renamed from: g */
    public final boolean f22447g;

    /* renamed from: h */
    public final boolean f22448h;

    public C10208h() {
        this(0);
    }

    public C10208h(String str, Image image, CharSequence charSequence, Boolean bool, Boolean bool2, MachineTranslationViewState machineTranslationViewState, boolean z, boolean z2) {
        C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
        this.f22441a = str;
        this.f22442b = image;
        this.f22443c = charSequence;
        this.f22444d = bool;
        this.f22445e = bool2;
        this.f22446f = machineTranslationViewState;
        this.f22447g = z;
        this.f22448h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10208h)) {
            return false;
        }
        C10208h hVar = (C10208h) obj;
        return C19383o.m32792b(this.f22441a, hVar.f22441a) && C19383o.m32792b(this.f22442b, hVar.f22442b) && C19383o.m32792b(this.f22443c, hVar.f22443c) && C19383o.m32792b(this.f22444d, hVar.f22444d) && C19383o.m32792b(this.f22445e, hVar.f22445e) && this.f22446f == hVar.f22446f && this.f22447g == hVar.f22447g && this.f22448h == hVar.f22448h;
    }

    public final int hashCode() {
        String str = this.f22441a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.f22442b;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        CharSequence charSequence = this.f22443c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Boolean bool = this.f22444d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f22445e;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        int hashCode5 = (this.f22446f.hashCode() + ((hashCode4 + i) * 31)) * 31;
        boolean z = this.f22447g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f22448h;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BottomSheetContent(title=");
        h.append(this.f22441a);
        h.append(", image=");
        h.append(this.f22442b);
        h.append(", body=");
        h.append(this.f22443c);
        h.append(", enableLinkNavigation=");
        h.append(this.f22444d);
        h.append(", enableTranslations=");
        h.append(this.f22445e);
        h.append(", machineTranslationViewState=");
        h.append(this.f22446f);
        h.append(", isShowingTranslatedContent=");
        h.append(this.f22447g);
        h.append(", prependWarningIcon=");
        return C0391c.m1058d(h, this.f22448h, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C10208h(int r10) {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            com.etsy.android.ui.listing.ui.MachineTranslationViewState r6 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.VISIBLE
            r7 = 0
            r8 = 0
            r0 = r9
            r4 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10208h.<init>(int):void");
    }
}
