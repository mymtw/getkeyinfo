package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10208h;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.a */
public final class C10194a {

    /* renamed from: a */
    public String f22367a;

    /* renamed from: b */
    public Image f22368b;

    /* renamed from: c */
    public CharSequence f22369c;

    /* renamed from: d */
    public Boolean f22370d;

    /* renamed from: e */
    public Boolean f22371e;

    /* renamed from: f */
    public MachineTranslationViewState f22372f;

    /* renamed from: g */
    public boolean f22373g;

    /* renamed from: h */
    public boolean f22374h;

    public C10194a(C10208h hVar) {
        String str = hVar.f22441a;
        Image image = hVar.f22442b;
        CharSequence charSequence = hVar.f22443c;
        Boolean bool = hVar.f22444d;
        Boolean bool2 = hVar.f22445e;
        MachineTranslationViewState machineTranslationViewState = hVar.f22446f;
        boolean z = hVar.f22447g;
        boolean z2 = hVar.f22448h;
        C19383o.m32797g(machineTranslationViewState, "machineTranslationViewState");
        this.f22367a = str;
        this.f22368b = image;
        this.f22369c = charSequence;
        this.f22370d = bool;
        this.f22371e = bool2;
        this.f22372f = machineTranslationViewState;
        this.f22373g = z;
        this.f22374h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10194a)) {
            return false;
        }
        C10194a aVar = (C10194a) obj;
        return C19383o.m32792b(this.f22367a, aVar.f22367a) && C19383o.m32792b(this.f22368b, aVar.f22368b) && C19383o.m32792b(this.f22369c, aVar.f22369c) && C19383o.m32792b(this.f22370d, aVar.f22370d) && C19383o.m32792b(this.f22371e, aVar.f22371e) && this.f22372f == aVar.f22372f && this.f22373g == aVar.f22373g && this.f22374h == aVar.f22374h;
    }

    public final int hashCode() {
        String str = this.f22367a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.f22368b;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        CharSequence charSequence = this.f22369c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Boolean bool = this.f22370d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f22371e;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        int hashCode5 = (this.f22372f.hashCode() + ((hashCode4 + i) * 31)) * 31;
        boolean z = this.f22373g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f22374h;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BottomSheetContentBuilder(title=");
        h.append(this.f22367a);
        h.append(", image=");
        h.append(this.f22368b);
        h.append(", body=");
        h.append(this.f22369c);
        h.append(", enableLinkNavigation=");
        h.append(this.f22370d);
        h.append(", enableTranslations=");
        h.append(this.f22371e);
        h.append(", machineTranslationViewState=");
        h.append(this.f22372f);
        h.append(", isShowingTranslatedContent=");
        h.append(this.f22373g);
        h.append(", prependWarningIcon=");
        return C0391c.m1058d(h, this.f22374h, ')');
    }
}
