package com.etsy.android.p327ui.search.p330v2;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.SearchSimplifiedQueries;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.f */
public interface C10975f {

    /* renamed from: com.etsy.android.ui.search.v2.f$a */
    public static final class C10976a implements C10975f {

        /* renamed from: a */
        public final String f24338a;

        /* renamed from: b */
        public final int f24339b;

        /* renamed from: c */
        public final Throwable f24340c;

        public C10976a() {
            this((String) null, 0, 7);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10976a(String str, int i, int i2) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (Throwable) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10976a)) {
                return false;
            }
            C10976a aVar = (C10976a) obj;
            return C19383o.m32792b(this.f24338a, aVar.f24338a) && this.f24339b == aVar.f24339b && C19383o.m32792b(this.f24340c, aVar.f24340c);
        }

        public final int hashCode() {
            String str = this.f24338a;
            int i = 0;
            int a = C0069a.m170a(this.f24339b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f24340c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f24338a);
            h.append(", code=");
            h.append(this.f24339b);
            h.append(", error=");
            return C0070b.m185h(h, this.f24340c, ')');
        }

        public C10976a(String str, int i, Throwable th) {
            this.f24338a = str;
            this.f24339b = i;
            this.f24340c = th;
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.f$b */
    public static final class C10977b implements C10975f {

        /* renamed from: a */
        public final SearchSimplifiedQueries f24341a;

        public C10977b(SearchSimplifiedQueries searchSimplifiedQueries) {
            this.f24341a = searchSimplifiedQueries;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10977b) && C19383o.m32792b(this.f24341a, ((C10977b) obj).f24341a);
        }

        public final int hashCode() {
            return this.f24341a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(simplifiedQueries=");
            h.append(this.f24341a);
            h.append(')');
            return h.toString();
        }
    }
}
