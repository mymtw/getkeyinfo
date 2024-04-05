package com.etsy.android.p327ui.user.language;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.user.language.C11606h;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.language.i */
public final class C11609i {

    /* renamed from: a */
    public final String f25704a;

    /* renamed from: b */
    public final String f25705b;

    /* renamed from: c */
    public final String f25706c;

    /* renamed from: d */
    public final String f25707d;

    /* renamed from: e */
    public final C11606h f25708e;

    /* renamed from: f */
    public boolean f25709f;

    /* renamed from: g */
    public final boolean f25710g;

    public C11609i() {
        this((String) null, (String) null, (String) null, (String) null, (C11606h) null, false, 127);
    }

    public C11609i(String str, String str2, String str3, String str4, C11606h hVar, boolean z, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        str4 = (i & 8) != 0 ? null : str4;
        hVar = (i & 16) != 0 ? C11606h.C11608b.f25703a : hVar;
        z = (i & 64) != 0 ? false : z;
        C19383o.m32797g(hVar, "languageType");
        this.f25704a = str;
        this.f25705b = str2;
        this.f25706c = str3;
        this.f25707d = str4;
        this.f25708e = hVar;
        this.f25709f = false;
        this.f25710g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11609i)) {
            return false;
        }
        C11609i iVar = (C11609i) obj;
        return C19383o.m32792b(this.f25704a, iVar.f25704a) && C19383o.m32792b(this.f25705b, iVar.f25705b) && C19383o.m32792b(this.f25706c, iVar.f25706c) && C19383o.m32792b(this.f25707d, iVar.f25707d) && C19383o.m32792b(this.f25708e, iVar.f25708e) && this.f25709f == iVar.f25709f && this.f25710g == iVar.f25710g;
    }

    public final int hashCode() {
        String str = this.f25704a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25705b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25706c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25707d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int hashCode4 = (this.f25708e.hashCode() + ((hashCode3 + i) * 31)) * 31;
        boolean z = this.f25709f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25710g;
        if (!z3) {
            z2 = z3;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("UserLanguage(id=");
        h.append(this.f25704a);
        h.append(", languageTag=");
        h.append(this.f25705b);
        h.append(", regionCode=");
        h.append(this.f25706c);
        h.append(", name=");
        h.append(this.f25707d);
        h.append(", languageType=");
        h.append(this.f25708e);
        h.append(", isPreferredLanguage=");
        h.append(this.f25709f);
        h.append(", isSupportedLanguage=");
        return C0391c.m1058d(h, this.f25710g, ')');
    }
}
