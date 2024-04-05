package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.d */
public abstract class C10987d {

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$a */
    public static final class C10988a extends C10987d {

        /* renamed from: a */
        public final String f24377a;

        public C10988a(String str) {
            this.f24377a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10988a) && C19383o.m32792b(this.f24377a, ((C10988a) obj).f24377a);
        }

        public final int hashCode() {
            return this.f24377a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Id(id="), this.f24377a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.d$b */
    public static final class C10989b extends C10987d {

        /* renamed from: a */
        public final Integer f24378a;

        public C10989b(Integer num) {
            this.f24378a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10989b) && C19383o.m32792b(this.f24378a, ((C10989b) obj).f24378a);
        }

        public final int hashCode() {
            Integer num = this.f24378a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return C0023f.m109j(C0072d.m201h("ResId(resId="), this.f24378a, ')');
        }
    }
}
