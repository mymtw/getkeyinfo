package com.etsy.android.p327ui.core.review;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.logger.C8672b;
import com.etsy.android.lib.models.ReviewImage;
import com.etsy.android.uikit.nav.transactions.TransactionDataRepository;
import com.etsy.android.util.C12059p;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p346fa.C12703a;

/* renamed from: com.etsy.android.ui.core.review.b */
public final class C9711b {

    /* renamed from: a */
    public final TransactionDataRepository f21490a;

    /* renamed from: b */
    public final C8672b f21491b;

    /* renamed from: c */
    public final C12703a f21492c;

    /* renamed from: d */
    public final C2895z<C9712a> f21493d = new C2895z<>();

    /* renamed from: e */
    public final C2895z<C12059p<C19394m>> f21494e = new C2895z<>();

    /* renamed from: f */
    public int f21495f;

    /* renamed from: com.etsy.android.ui.core.review.b$a */
    public static final class C9712a {

        /* renamed from: a */
        public final int f21496a;

        /* renamed from: b */
        public final int f21497b;

        /* renamed from: c */
        public final List<ReviewImage> f21498c;

        public C9712a(List list, int i, int i2) {
            this.f21496a = i;
            this.f21497b = i2;
            this.f21498c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9712a)) {
                return false;
            }
            C9712a aVar = (C9712a) obj;
            return this.f21496a == aVar.f21496a && this.f21497b == aVar.f21497b && C19383o.m32792b(this.f21498c, aVar.f21498c);
        }

        public final int hashCode() {
            return this.f21498c.hashCode() + C0069a.m170a(this.f21497b, Integer.hashCode(this.f21496a) * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ViewState(toolbarTitle=");
            h.append(this.f21496a);
            h.append(", initialPagerPosition=");
            h.append(this.f21497b);
            h.append(", reviews=");
            return C0070b.m186i(h, this.f21498c, ')');
        }
    }

    public C9711b(TransactionDataRepository transactionDataRepository, C8672b bVar, C12703a aVar) {
        C19383o.m32797g(bVar, "analyticsTracker");
        C19383o.m32797g(aVar, "grafana");
        this.f21490a = transactionDataRepository;
        this.f21491b = bVar;
        this.f21492c = aVar;
    }
}
