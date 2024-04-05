package com.etsy.android.p327ui.navigation.bottom;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.navigation.bottom.d */
public final class C10682d {

    /* renamed from: a */
    public final C10680b f23554a;

    /* renamed from: b */
    public final C10680b f23555b;

    /* renamed from: c */
    public final C10680b f23556c;

    public C10682d(C10680b bVar, C10680b bVar2, C10680b bVar3) {
        C19383o.m32797g(bVar, "updatesBadge");
        C19383o.m32797g(bVar2, "cartBadge");
        C19383o.m32797g(bVar3, "youBadge");
        this.f23554a = bVar;
        this.f23555b = bVar2;
        this.f23556c = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10682d)) {
            return false;
        }
        C10682d dVar = (C10682d) obj;
        return C19383o.m32792b(this.f23554a, dVar.f23554a) && C19383o.m32792b(this.f23555b, dVar.f23555b) && C19383o.m32792b(this.f23556c, dVar.f23556c);
    }

    public final int hashCode() {
        int hashCode = this.f23555b.hashCode();
        return this.f23556c.hashCode() + ((hashCode + (this.f23554a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BadgeState(updatesBadge=");
        h.append(this.f23554a);
        h.append(", cartBadge=");
        h.append(this.f23555b);
        h.append(", youBadge=");
        h.append(this.f23556c);
        h.append(')');
        return h.toString();
    }
}
