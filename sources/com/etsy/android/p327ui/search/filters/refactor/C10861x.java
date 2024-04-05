package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p504ai.C13983i;

/* renamed from: com.etsy.android.ui.search.filters.refactor.x */
public final class C10861x {

    /* renamed from: a */
    public final List<C10849q> f24087a;

    /* renamed from: b */
    public final List<SearchFiltersUiGroupItem> f24088b;

    /* renamed from: c */
    public final Integer f24089c;

    /* renamed from: d */
    public final boolean f24090d;

    /* renamed from: e */
    public final boolean f24091e;

    public C10861x(List<? extends C10849q> list, List<? extends SearchFiltersUiGroupItem> list2, Integer num, boolean z, boolean z2) {
        C19383o.m32797g(list, "sideEffects");
        C19383o.m32797g(list2, "groupItems");
        this.f24087a = list;
        this.f24088b = list2;
        this.f24089c = num;
        this.f24090d = z;
        this.f24091e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10861x)) {
            return false;
        }
        C10861x xVar = (C10861x) obj;
        return C19383o.m32792b(this.f24087a, xVar.f24087a) && C19383o.m32792b(this.f24088b, xVar.f24088b) && C19383o.m32792b(this.f24089c, xVar.f24089c) && this.f24090d == xVar.f24090d && this.f24091e == xVar.f24091e;
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f24088b, this.f24087a.hashCode() * 31, 31);
        Integer num = this.f24089c;
        int hashCode = (g + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.f24090d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f24091e;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchFiltersUiState(sideEffects=");
        h.append(this.f24087a);
        h.append(", groupItems=");
        h.append(this.f24088b);
        h.append(", numberOfResults=");
        h.append(this.f24089c);
        h.append(", isLoading=");
        h.append(this.f24090d);
        h.append(", isResetEnabled=");
        return C0391c.m1058d(h, this.f24091e, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10861x() {
        /*
            r6 = this;
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.filters.refactor.C10861x.<init>():void");
    }
}
