package com.etsy.android.p327ui.user.purchases.module;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.module.h */
public final class C11667h {

    /* renamed from: a */
    public final String f25830a;

    /* renamed from: b */
    public final C11664e f25831b;

    /* renamed from: c */
    public final List<C11666g> f25832c;

    public C11667h(String str, C11664e eVar, ArrayList arrayList) {
        C19383o.m32797g(str, "title");
        this.f25830a = str;
        this.f25831b = eVar;
        this.f25832c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11667h)) {
            return false;
        }
        C11667h hVar = (C11667h) obj;
        return C19383o.m32792b(this.f25830a, hVar.f25830a) && C19383o.m32792b(this.f25831b, hVar.f25831b) && C19383o.m32792b(this.f25832c, hVar.f25832c);
    }

    public final int hashCode() {
        int hashCode = this.f25831b.hashCode();
        return this.f25832c.hashCode() + ((hashCode + (this.f25830a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ModuleUiModel(title=");
        h.append(this.f25830a);
        h.append(", landingPage=");
        h.append(this.f25831b);
        h.append(", listings=");
        return C0070b.m186i(h, this.f25832c, ')');
    }
}
