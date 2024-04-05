package com.etsy.android.p327ui.search.shopresults;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.apiv3.ShopCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.shopresults.e */
public interface C10939e {

    /* renamed from: com.etsy.android.ui.search.shopresults.e$a */
    public static final class C10940a implements C10939e {

        /* renamed from: a */
        public final List<ShopCard> f24285a;

        /* renamed from: b */
        public final int f24286b;

        public C10940a(int i, List list) {
            C19383o.m32797g(list, "shopsList");
            this.f24285a = list;
            this.f24286b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10940a)) {
                return false;
            }
            C10940a aVar = (C10940a) obj;
            return C19383o.m32792b(this.f24285a, aVar.f24285a) && this.f24286b == aVar.f24286b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24286b) + (this.f24285a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("SearchShopsLoaded(shopsList=");
            h.append(this.f24285a);
            h.append(", maxCount=");
            return C0073e.m208h(h, this.f24286b, ')');
        }
    }
}
