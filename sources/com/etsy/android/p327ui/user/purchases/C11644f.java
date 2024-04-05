package com.etsy.android.p327ui.user.purchases;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.purchases.f */
public abstract class C11644f {

    /* renamed from: com.etsy.android.ui.user.purchases.f$a */
    public static final class C11645a extends C11644f {

        /* renamed from: a */
        public static final C11645a f25768a = new C11645a();
    }

    /* renamed from: com.etsy.android.ui.user.purchases.f$b */
    public static final class C11646b extends C11644f {

        /* renamed from: a */
        public static final C11646b f25769a = new C11646b();
    }

    /* renamed from: com.etsy.android.ui.user.purchases.f$c */
    public static final class C11647c extends C11644f {

        /* renamed from: a */
        public final int f25770a;

        /* renamed from: b */
        public final List<C11639e> f25771b;

        public C11647c(int i, ArrayList arrayList) {
            this.f25770a = i;
            this.f25771b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11647c)) {
                return false;
            }
            C11647c cVar = (C11647c) obj;
            return this.f25770a == cVar.f25770a && C19383o.m32792b(this.f25771b, cVar.f25771b);
        }

        public final int hashCode() {
            return this.f25771b.hashCode() + (Integer.hashCode(this.f25770a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Loaded(maxCount=");
            h.append(this.f25770a);
            h.append(", listItems=");
            return C0070b.m186i(h, this.f25771b, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.f$d */
    public static final class C11648d extends C11644f {

        /* renamed from: a */
        public static final C11648d f25772a = new C11648d();
    }
}
