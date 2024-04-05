package com.etsy.android.p327ui.navigation.bottom;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.navigation.bottom.g */
public final class C10690g {

    /* renamed from: a */
    public final int f23571a;

    /* renamed from: b */
    public final int f23572b;

    /* renamed from: c */
    public final List<C10684f> f23573c;

    /* renamed from: d */
    public final boolean f23574d;

    /* renamed from: e */
    public final boolean f23575e;

    public C10690g(int i, int i2, List<? extends C10684f> list, boolean z, boolean z2) {
        C19383o.m32797g(list, ResponseConstants.ITEMS);
        this.f23571a = i;
        this.f23572b = i2;
        this.f23573c = list;
        this.f23574d = z;
        this.f23575e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10690g)) {
            return false;
        }
        C10690g gVar = (C10690g) obj;
        return this.f23571a == gVar.f23571a && this.f23572b == gVar.f23572b && C19383o.m32792b(this.f23573c, gVar.f23573c) && this.f23574d == gVar.f23574d && this.f23575e == gVar.f23575e;
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f23573c, C0069a.m170a(this.f23572b, Integer.hashCode(this.f23571a) * 31, 31), 31);
        boolean z = this.f23574d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (g + (z ? 1 : 0)) * 31;
        boolean z3 = this.f23575e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BottomNavState(selected=");
        h.append(this.f23571a);
        h.append(", menu=");
        h.append(this.f23572b);
        h.append(", items=");
        h.append(this.f23573c);
        h.append(", reselected=");
        h.append(this.f23574d);
        h.append(", isBackNavigation=");
        return C0391c.m1058d(h, this.f23575e, ')');
    }

    public /* synthetic */ C10690g(int i, List list) {
        this(-1, i, list, false, false);
    }
}
