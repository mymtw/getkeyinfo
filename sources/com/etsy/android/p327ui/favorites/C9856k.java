package com.etsy.android.p327ui.favorites;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.homescreen.HomeTab;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.favorites.k */
public abstract class C9856k {

    /* renamed from: com.etsy.android.ui.favorites.k$a */
    public static final class C9857a extends C9856k {

        /* renamed from: a */
        public final String f21759a;

        /* renamed from: b */
        public final int f21760b;

        /* renamed from: c */
        public final Throwable f21761c;

        public C9857a(String str, int i, Throwable th) {
            this.f21759a = str;
            this.f21760b = i;
            this.f21761c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9857a)) {
                return false;
            }
            C9857a aVar = (C9857a) obj;
            return C19383o.m32792b(this.f21759a, aVar.f21759a) && this.f21760b == aVar.f21760b && C19383o.m32792b(this.f21761c, aVar.f21761c);
        }

        public final int hashCode() {
            String str = this.f21759a;
            int i = 0;
            int a = C0069a.m170a(this.f21760b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f21761c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f21759a);
            h.append(", code=");
            h.append(this.f21760b);
            h.append(", error=");
            return C0070b.m185h(h, this.f21761c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.favorites.k$b */
    public static final class C9858b extends C9856k {

        /* renamed from: a */
        public final List<HomeTab> f21762a;

        public C9858b(List<? extends HomeTab> list) {
            C19383o.m32797g(list, "tabs");
            this.f21762a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9858b) && C19383o.m32792b(this.f21762a, ((C9858b) obj).f21762a);
        }

        public final int hashCode() {
            return this.f21762a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("Success(tabs="), this.f21762a, ')');
        }
    }
}
