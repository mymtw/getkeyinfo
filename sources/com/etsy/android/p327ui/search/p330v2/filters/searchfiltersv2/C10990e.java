package com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.e */
public abstract class C10990e {

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$a */
    public static final class C10991a extends C10990e {

        /* renamed from: a */
        public final Integer f24379a;

        public C10991a(Integer num) {
            this.f24379a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10991a) && C19383o.m32792b(this.f24379a, ((C10991a) obj).f24379a);
        }

        public final int hashCode() {
            Integer num = this.f24379a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return C0023f.m109j(C0072d.m201h("Id(resId="), this.f24379a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.v2.filters.searchfiltersv2.e$b */
    public static final class C10992b extends C10990e {

        /* renamed from: a */
        public final String f24380a;

        public C10992b(String str) {
            this.f24380a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10992b) && C19383o.m32792b(this.f24380a, ((C10992b) obj).f24380a);
        }

        public final int hashCode() {
            String str = this.f24380a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Text(text="), this.f24380a, ')');
        }
    }
}
