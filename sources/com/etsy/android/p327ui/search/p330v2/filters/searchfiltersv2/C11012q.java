package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.SearchWithAds;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.q */
public abstract class C11012q {

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$a */
    public static final class C11013a extends C11012q {

        /* renamed from: a */
        public final Throwable f24414a;

        public C11013a(Throwable th) {
            C19383o.m32797g(th, "throwable");
            this.f24414a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11013a) && C19383o.m32792b(this.f24414a, ((C11013a) obj).f24414a);
        }

        public final int hashCode() {
            return this.f24414a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(throwable="), this.f24414a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.q$b */
    public static final class C11014b extends C11012q {

        /* renamed from: a */
        public final SearchWithAds f24415a;

        /* renamed from: b */
        public final String f24416b;

        public C11014b(SearchWithAds searchWithAds, String str) {
            this.f24415a = searchWithAds;
            this.f24416b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11014b)) {
                return false;
            }
            C11014b bVar = (C11014b) obj;
            return C19383o.m32792b(this.f24415a, bVar.f24415a) && C19383o.m32792b(this.f24416b, bVar.f24416b);
        }

        public final int hashCode() {
            int hashCode = this.f24415a.hashCode() * 31;
            String str = this.f24416b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(data=");
            h.append(this.f24415a);
            h.append(", nextPageUrl=");
            return C0391c.m1057c(h, this.f24416b, ')');
        }
    }
}
