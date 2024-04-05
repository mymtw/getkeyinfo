package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.n */
public abstract class C11007n {

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.n$a */
    public static final class C11008a extends C11007n {

        /* renamed from: a */
        public final String f24411a;

        public C11008a(String str) {
            this.f24411a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11008a) && C19383o.m32792b(this.f24411a, ((C11008a) obj).f24411a);
        }

        public final int hashCode() {
            return this.f24411a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Hex(hexCode="), this.f24411a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.n$b */
    public static final class C11009b extends C11007n {

        /* renamed from: a */
        public final int f24412a;

        public C11009b(int i) {
            this.f24412a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11009b) && this.f24412a == ((C11009b) obj).f24412a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24412a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("ResId(id="), this.f24412a, ')');
        }
    }
}
