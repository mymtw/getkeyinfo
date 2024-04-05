package com.etsy.android.p327ui.home.editorspicks;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.editorspicks.b */
public final class C9925b {

    /* renamed from: a */
    public final String f21880a;

    /* renamed from: b */
    public final Boolean f21881b;

    /* renamed from: c */
    public final String f21882c;

    public C9925b(String str, Boolean bool, String str2) {
        this.f21880a = str;
        this.f21881b = bool;
        this.f21882c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9925b)) {
            return false;
        }
        C9925b bVar = (C9925b) obj;
        return C19383o.m32792b(this.f21880a, bVar.f21880a) && C19383o.m32792b(this.f21881b, bVar.f21881b) && C19383o.m32792b(this.f21882c, bVar.f21882c);
    }

    public final int hashCode() {
        int hashCode = this.f21880a.hashCode() * 31;
        Boolean bool = this.f21881b;
        int i = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f21882c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("EditorPicksModulesSpec(slug=");
        h.append(this.f21880a);
        h.append(", isDraft=");
        h.append(this.f21881b);
        h.append(", anchorListing=");
        return C0391c.m1057c(h, this.f21882c, ')');
    }
}
