package com.etsy.android.p327ui.cart;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.cart.k */
public abstract class C9315k {

    /* renamed from: com.etsy.android.ui.cart.k$a */
    public static final class C9316a extends C9315k {

        /* renamed from: a */
        public final String f20588a;

        public C9316a(String str) {
            this.f20588a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9316a) && C19383o.m32792b(this.f20588a, ((C9316a) obj).f20588a);
        }

        public final int hashCode() {
            return this.f20588a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ApplyEtsyCoupon(couponCode="), this.f20588a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.cart.k$b */
    public static final class C9317b extends C9315k {

        /* renamed from: a */
        public static final C9317b f20589a = new C9317b();
    }

    /* renamed from: com.etsy.android.ui.cart.k$c */
    public static final class C9318c extends C9315k {

        /* renamed from: a */
        public final EtsyId f20590a;

        public C9318c(EtsyId etsyId) {
            this.f20590a = etsyId;
        }
    }

    /* renamed from: com.etsy.android.ui.cart.k$d */
    public static final class C9319d extends C9315k {

        /* renamed from: a */
        public static final C9319d f20591a = new C9319d();
    }

    /* renamed from: com.etsy.android.ui.cart.k$e */
    public static final class C9320e extends C9315k {

        /* renamed from: a */
        public static final C9320e f20592a = new C9320e();
    }

    /* renamed from: com.etsy.android.ui.cart.k$f */
    public static final class C9321f extends C9315k {

        /* renamed from: a */
        public static final C9321f f20593a = new C9321f();
    }

    /* renamed from: com.etsy.android.ui.cart.k$g */
    public static final class C9322g extends C9315k {

        /* renamed from: a */
        public static final C9322g f20594a = new C9322g();
    }
}
