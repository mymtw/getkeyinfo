package com.etsy.android.p327ui.shop;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.Shop;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.z0 */
public abstract class C11311z0 {

    /* renamed from: com.etsy.android.ui.shop.z0$a */
    public static final class C11312a extends C11311z0 {

        /* renamed from: a */
        public final Throwable f24962a;

        public C11312a(Throwable th) {
            C19383o.m32797g(th, "error");
            this.f24962a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11312a) && C19383o.m32792b(this.f24962a, ((C11312a) obj).f24962a);
        }

        public final int hashCode() {
            return this.f24962a.hashCode();
        }

        public final String toString() {
            return C0070b.m185h(C0072d.m201h("Error(error="), this.f24962a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.shop.z0$b */
    public static final class C11313b extends C11311z0 {

        /* renamed from: a */
        public final Shop f24963a;

        public C11313b(Shop shop) {
            this.f24963a = shop;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11313b) && C19383o.m32792b(this.f24963a, ((C11313b) obj).f24963a);
        }

        public final int hashCode() {
            return this.f24963a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Success(shop=");
            h.append(this.f24963a);
            h.append(')');
            return h.toString();
        }
    }
}
