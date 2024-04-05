package com.etsy.android.p327ui.search.redirect;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.redirect.c */
public interface C10927c {

    /* renamed from: com.etsy.android.ui.search.redirect.c$a */
    public static final class C10928a implements C10927c {

        /* renamed from: a */
        public final String f24258a;

        /* renamed from: b */
        public final int f24259b;

        /* renamed from: c */
        public final Throwable f24260c;

        public C10928a(String str, int i, Throwable th) {
            this.f24258a = str;
            this.f24259b = i;
            this.f24260c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10928a)) {
                return false;
            }
            C10928a aVar = (C10928a) obj;
            return C19383o.m32792b(this.f24258a, aVar.f24258a) && this.f24259b == aVar.f24259b && C19383o.m32792b(this.f24260c, aVar.f24260c);
        }

        public final int hashCode() {
            String str = this.f24258a;
            int i = 0;
            int a = C0069a.m170a(this.f24259b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f24260c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f24258a);
            h.append(", code=");
            h.append(this.f24259b);
            h.append(", error=");
            return C0070b.m185h(h, this.f24260c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.redirect.c$b */
    public static final class C10929b implements C10927c {

        /* renamed from: a */
        public final SearchCategoryRedirectPage f24261a;

        /* renamed from: b */
        public final String f24262b;

        public C10929b(SearchCategoryRedirectPage searchCategoryRedirectPage, String str) {
            this.f24261a = searchCategoryRedirectPage;
            this.f24262b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10929b)) {
                return false;
            }
            C10929b bVar = (C10929b) obj;
            return C19383o.m32792b(this.f24261a, bVar.f24261a) && C19383o.m32792b(this.f24262b, bVar.f24262b);
        }

        public final int hashCode() {
            return this.f24262b.hashCode() + (this.f24261a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(redirectPage=");
            h.append(this.f24261a);
            h.append(", nextLink=");
            return C0391c.m1057c(h, this.f24262b, ')');
        }
    }
}
