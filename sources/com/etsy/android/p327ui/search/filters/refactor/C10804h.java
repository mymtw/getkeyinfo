package com.etsy.android.p327ui.search.filters.refactor;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.search.filters.refactor.h */
public abstract class C10804h {

    /* renamed from: com.etsy.android.ui.search.filters.refactor.h$a */
    public static final class C10805a extends C10804h {

        /* renamed from: a */
        public final String f23943a;

        public C10805a(String str) {
            this.f23943a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10805a) && C19383o.m32792b(this.f23943a, ((C10805a) obj).f23943a);
        }

        public final int hashCode() {
            return this.f23943a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Hex(hexCode="), this.f23943a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.h$b */
    public static final class C10806b extends C10804h {

        /* renamed from: a */
        public final int f23944a;

        public C10806b(int i) {
            this.f23944a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10806b) && this.f23944a == ((C10806b) obj).f23944a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f23944a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("ResId(id="), this.f23944a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.search.filters.refactor.h$c */
    public static final class C10807c extends C10804h {

        /* renamed from: a */
        public final String f23945a;

        public C10807c(String str) {
            this.f23945a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10807c) && C19383o.m32792b(this.f23945a, ((C10807c) obj).f23945a);
        }

        public final int hashCode() {
            return this.f23945a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("Url(url="), this.f23945a, ')');
        }
    }
}
