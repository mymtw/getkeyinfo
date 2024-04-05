package com.etsy.android.shophome;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.shophome.n */
public abstract class C9006n {

    /* renamed from: com.etsy.android.shophome.n$a */
    public static final class C9007a extends C9006n {

        /* renamed from: a */
        public final String f19875a;

        /* renamed from: b */
        public final int f19876b;

        /* renamed from: c */
        public final Throwable f19877c;

        public C9007a(String str, int i, Throwable th) {
            this.f19875a = str;
            this.f19876b = i;
            this.f19877c = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9007a)) {
                return false;
            }
            C9007a aVar = (C9007a) obj;
            return C19383o.m32792b(this.f19875a, aVar.f19875a) && this.f19876b == aVar.f19876b && C19383o.m32792b(this.f19877c, aVar.f19877c);
        }

        public final int hashCode() {
            String str = this.f19875a;
            int i = 0;
            int a = C0069a.m170a(this.f19876b, (str == null ? 0 : str.hashCode()) * 31, 31);
            Throwable th = this.f19877c;
            if (th != null) {
                i = th.hashCode();
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Error(errorMessage=");
            h.append(this.f19875a);
            h.append(", code=");
            h.append(this.f19876b);
            h.append(", exception=");
            return C0070b.m185h(h, this.f19877c, ')');
        }
    }

    /* renamed from: com.etsy.android.shophome.n$b */
    public static final class C9008b extends C9006n {

        /* renamed from: a */
        public static final C9008b f19878a = new C9008b();
    }
}
