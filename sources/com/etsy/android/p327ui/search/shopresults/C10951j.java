package com.etsy.android.p327ui.search.shopresults;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ShopCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.shopresults.j */
public abstract class C10951j {

    /* renamed from: com.etsy.android.ui.search.shopresults.j$a */
    public static final class C10952a extends C10951j {

        /* renamed from: a */
        public static final C10952a f24301a = new C10952a();
    }

    /* renamed from: com.etsy.android.ui.search.shopresults.j$b */
    public static final class C10953b extends C10951j {

        /* renamed from: a */
        public final List<ShopCard> f24302a;

        /* renamed from: b */
        public final int f24303b;

        public C10953b(int i, List list) {
            C19383o.m32797g(list, ResponseConstants.RESULTS);
            this.f24302a = list;
            this.f24303b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10953b)) {
                return false;
            }
            C10953b bVar = (C10953b) obj;
            return C19383o.m32792b(this.f24302a, bVar.f24302a) && this.f24303b == bVar.f24303b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24303b) + (this.f24302a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(results=");
            h.append(this.f24302a);
            h.append(", maxCount=");
            return C0073e.m208h(h, this.f24303b, ')');
        }
    }
}
