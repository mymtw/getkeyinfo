package com.etsy.android.p327ui.user.purchases.reviewcarousel;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.purchases.reviewcarousel.c */
public final class C11675c {

    /* renamed from: a */
    public final long f25857a;

    /* renamed from: b */
    public final List<Long> f25858b;

    /* renamed from: c */
    public final C11676d f25859c;

    /* renamed from: d */
    public final String f25860d;

    /* renamed from: e */
    public final String f25861e;

    public C11675c(long j, List<Long> list, C11676d dVar, String str, String str2) {
        C19383o.m32797g(str, "title");
        C19383o.m32797g(str2, "listingTitle");
        this.f25857a = j;
        this.f25858b = list;
        this.f25859c = dVar;
        this.f25860d = str;
        this.f25861e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11675c)) {
            return false;
        }
        C11675c cVar = (C11675c) obj;
        return this.f25857a == cVar.f25857a && C19383o.m32792b(this.f25858b, cVar.f25858b) && C19383o.m32792b(this.f25859c, cVar.f25859c) && C19383o.m32792b(this.f25860d, cVar.f25860d) && C19383o.m32792b(this.f25861e, cVar.f25861e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f25857a) * 31;
        List<Long> list = this.f25858b;
        int hashCode2 = list == null ? 0 : list.hashCode();
        return this.f25861e.hashCode() + C0023f.m105e(this.f25860d, (this.f25859c.hashCode() + ((hashCode + hashCode2) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ReviewCarouselItemUiModel(transactionId=");
        h.append(this.f25857a);
        h.append(", transactionIds=");
        h.append(this.f25858b);
        h.append(", image=");
        h.append(this.f25859c);
        h.append(", title=");
        h.append(this.f25860d);
        h.append(", listingTitle=");
        return C0391c.m1057c(h, this.f25861e, ')');
    }
}
