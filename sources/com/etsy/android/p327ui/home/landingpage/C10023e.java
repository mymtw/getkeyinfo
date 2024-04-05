package com.etsy.android.p327ui.home.landingpage;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ShopCard;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.landingpage.e */
public interface C10023e {

    /* renamed from: com.etsy.android.ui.home.landingpage.e$a */
    public static final class C10024a implements C10023e {

        /* renamed from: a */
        public static final C10024a f22071a = new C10024a();
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.e$b */
    public static final class C10025b implements C10023e {

        /* renamed from: a */
        public final String f22072a;

        /* renamed from: b */
        public final int f22073b;

        /* renamed from: c */
        public final Throwable f22074c;

        public C10025b(String str, int i, Throwable th) {
            this.f22072a = str;
            this.f22073b = i;
            this.f22074c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10025b)) {
                return false;
            }
            C10025b bVar = (C10025b) obj;
            return C19383o.m32792b(this.f22072a, bVar.f22072a) && this.f22073b == bVar.f22073b && C19383o.m32792b(this.f22074c, bVar.f22074c);
        }

        public final int hashCode() {
            String str = this.f22072a;
            int i = 0;
            int a = C0069a.m170a(this.f22073b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f22074c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f22072a);
            h.append(", code=");
            h.append(this.f22073b);
            h.append(", error=");
            return C0070b.m185h(h, this.f22074c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.landingpage.e$c */
    public static final class C10026c implements C10023e {

        /* renamed from: a */
        public final List<ShopCard> f22075a;

        /* renamed from: b */
        public final Integer f22076b;

        /* renamed from: c */
        public final String f22077c;

        public C10026c(String str, List list, Integer num) {
            C19383o.m32797g(list, "shopCards");
            this.f22075a = list;
            this.f22076b = num;
            this.f22077c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10026c)) {
                return false;
            }
            C10026c cVar = (C10026c) obj;
            return C19383o.m32792b(this.f22075a, cVar.f22075a) && C19383o.m32792b(this.f22076b, cVar.f22076b) && C19383o.m32792b(this.f22077c, cVar.f22077c);
        }

        public final int hashCode() {
            int hashCode = this.f22075a.hashCode() * 31;
            Integer num = this.f22076b;
            int i = 0;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f22077c;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopCardContent(shopCards=");
            h.append(this.f22075a);
            h.append(", maxCount=");
            h.append(this.f22076b);
            h.append(", nextPageUrl=");
            return C0391c.m1057c(h, this.f22077c, ')');
        }
    }
}
