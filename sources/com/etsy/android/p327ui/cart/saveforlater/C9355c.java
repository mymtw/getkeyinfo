package com.etsy.android.p327ui.cart.saveforlater;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;
import p497zb.C13944a;

/* renamed from: com.etsy.android.ui.cart.saveforlater.c */
public interface C9355c {

    /* renamed from: com.etsy.android.ui.cart.saveforlater.c$a */
    public static final class C9356a implements C9355c {

        /* renamed from: a */
        public final Throwable f20641a;

        public C9356a(Exception exc) {
            this.f20641a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9356a) && C19383o.m32792b(this.f20641a, ((C9356a) obj).f20641a);
        }

        public final int hashCode() {
            return this.f20641a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(throwable="), this.f20641a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.cart.saveforlater.c$b */
    public static final class C9357b implements C9355c {

        /* renamed from: a */
        public final C13944a f20642a;

        public C9357b(C13944a aVar) {
            this.f20642a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9357b) && C19383o.m32792b(this.f20642a, ((C9357b) obj).f20642a);
        }

        public final int hashCode() {
            return this.f20642a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(saveForLater=");
            h.append(this.f20642a);
            h.append(')');
            return h.toString();
        }
    }
}
