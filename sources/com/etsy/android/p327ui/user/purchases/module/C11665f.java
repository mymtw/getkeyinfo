package com.etsy.android.p327ui.user.purchases.module;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.purchases.module.f */
public final class C11665f {

    /* renamed from: a */
    public final String f25818a;

    /* renamed from: b */
    public final String f25819b;

    /* renamed from: c */
    public final String f25820c;

    /* renamed from: d */
    public final String f25821d;

    public C11665f(String str, String str2, String str3, String str4) {
        this.f25818a = str;
        this.f25819b = str2;
        this.f25820c = str3;
        this.f25821d = str4;
    }

    /* renamed from: a */
    public final String mo37768a(int i) {
        return (i > 170 || !C18263b.m30839d0(this.f25819b)) ? (i > 340 || !C18263b.m30839d0(this.f25820c)) ? (i > 680 || !C18263b.m30839d0(this.f25821d)) ? this.f25818a : this.f25821d : this.f25820c : this.f25819b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11665f)) {
            return false;
        }
        C11665f fVar = (C11665f) obj;
        return C19383o.m32792b(this.f25818a, fVar.f25818a) && C19383o.m32792b(this.f25819b, fVar.f25819b) && C19383o.m32792b(this.f25820c, fVar.f25820c) && C19383o.m32792b(this.f25821d, fVar.f25821d);
    }

    public final int hashCode() {
        String str = this.f25818a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f25819b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25820c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25821d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ModuleListingImageUiModel(url=");
        h.append(this.f25818a);
        h.append(", url170x135=");
        h.append(this.f25819b);
        h.append(", url340x270=");
        h.append(this.f25820c);
        h.append(", url680x540=");
        return C0391c.m1057c(h, this.f25821d, ')');
    }
}
