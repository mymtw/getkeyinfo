package com.etsy.android.p327ui.home.recentlyviewedpage;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.recentlyviewedpage.g */
public abstract class C10046g {

    /* renamed from: com.etsy.android.ui.home.recentlyviewedpage.g$a */
    public static final class C10047a extends C10046g {

        /* renamed from: a */
        public final String f22108a;

        /* renamed from: b */
        public final int f22109b;

        /* renamed from: c */
        public final Throwable f22110c;

        public C10047a(String str, int i, Throwable th) {
            this.f22108a = str;
            this.f22109b = i;
            this.f22110c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10047a)) {
                return false;
            }
            C10047a aVar = (C10047a) obj;
            return C19383o.m32792b(this.f22108a, aVar.f22108a) && this.f22109b == aVar.f22109b && C19383o.m32792b(this.f22110c, aVar.f22110c);
        }

        public final int hashCode() {
            String str = this.f22108a;
            int i = 0;
            int a = C0069a.m170a(this.f22109b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f22110c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f22108a);
            h.append(", code=");
            h.append(this.f22109b);
            h.append(", error=");
            return C0070b.m185h(h, this.f22110c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.home.recentlyviewedpage.g$b */
    public static final class C10048b extends C10046g {

        /* renamed from: a */
        public static final C10048b f22111a = new C10048b();
    }
}
