package com.etsy.android.p327ui.shop.tabs;

import android.support.p013v4.media.C0072d;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.h */
public interface C11222h extends C11215b {

    /* renamed from: com.etsy.android.ui.shop.tabs.h$a */
    public static final class C11223a implements C11222h {

        /* renamed from: a */
        public final Tab f24804a;

        public C11223a(Tab tab) {
            C19383o.m32797g(tab, "tab");
            this.f24804a = tab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11223a) && C19383o.m32792b(this.f24804a, ((C11223a) obj).f24804a);
        }

        public final int hashCode() {
            return this.f24804a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("TabSelected(tab=");
            h.append(this.f24804a);
            h.append(')');
            return h.toString();
        }
    }
}
