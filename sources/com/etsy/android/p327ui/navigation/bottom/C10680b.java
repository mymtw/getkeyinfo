package com.etsy.android.p327ui.navigation.bottom;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.you.C11800a;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.navigation.bottom.b */
public final class C10680b {

    /* renamed from: a */
    public final int f23548a;

    /* renamed from: b */
    public final C11800a f23549b;

    /* renamed from: c */
    public final String f23550c;

    public C10680b(int i, C11800a aVar, String str) {
        C19383o.m32797g(aVar, ResponseConstants.COUNT);
        this.f23548a = i;
        this.f23549b = aVar;
        this.f23550c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10680b)) {
            return false;
        }
        C10680b bVar = (C10680b) obj;
        return this.f23548a == bVar.f23548a && C19383o.m32792b(this.f23549b, bVar.f23549b) && C19383o.m32792b(this.f23550c, bVar.f23550c);
    }

    public final int hashCode() {
        int hashCode = this.f23549b.hashCode();
        return this.f23550c.hashCode() + ((hashCode + (Integer.hashCode(this.f23548a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BadgeData(id=");
        h.append(this.f23548a);
        h.append(", count=");
        h.append(this.f23549b);
        h.append(", name=");
        return C0391c.m1057c(h, this.f23550c, ')');
    }
}
