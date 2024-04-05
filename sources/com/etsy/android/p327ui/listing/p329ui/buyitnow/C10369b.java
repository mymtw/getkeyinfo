package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b */
public abstract class C10369b {

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$a */
    public static final class C10370a extends C10369b {

        /* renamed from: a */
        public static final C10370a f22724a = new C10370a();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$b */
    public static final class C10371b extends C10369b {

        /* renamed from: a */
        public static final C10371b f22725a = new C10371b();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$c */
    public static final class C10372c extends C10369b {

        /* renamed from: a */
        public static final C10372c f22726a = new C10372c();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$d */
    public static final class C10373d extends C10369b {

        /* renamed from: a */
        public static final C10373d f22727a = new C10373d();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$e */
    public static final class C10374e extends C10369b {

        /* renamed from: a */
        public static final C10374e f22728a = new C10374e();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$f */
    public static final class C10375f extends C10369b {

        /* renamed from: a */
        public static final C10375f f22729a = new C10375f();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$g */
    public static final class C10376g extends C10369b {

        /* renamed from: a */
        public final PaymentMethod f22730a;

        public C10376g(PaymentMethod paymentMethod) {
            C19383o.m32797g(paymentMethod, "paymentMethod");
            this.f22730a = paymentMethod;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10376g) && C19383o.m32792b(this.f22730a, ((C10376g) obj).f22730a);
        }

        public final int hashCode() {
            return this.f22730a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("EditPaymentMethod(paymentMethod=");
            h.append(this.f22730a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$h */
    public static final class C10377h extends C10369b {

        /* renamed from: a */
        public static final C10377h f22731a = new C10377h();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$i */
    public static final class C10378i extends C10369b {

        /* renamed from: a */
        public final PaymentMethod f22732a;

        public C10378i(PaymentMethod paymentMethod) {
            C19383o.m32797g(paymentMethod, "paymentMethod");
            this.f22732a = paymentMethod;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10378i) && C19383o.m32792b(this.f22732a, ((C10378i) obj).f22732a);
        }

        public final int hashCode() {
            return this.f22732a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PaymentMethodSelected(paymentMethod=");
            h.append(this.f22732a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$j */
    public static final class C10379j extends C10369b {

        /* renamed from: a */
        public final ShippingAddress f22733a;

        public C10379j(ShippingAddress shippingAddress) {
            C19383o.m32797g(shippingAddress, "shippingAddress");
            this.f22733a = shippingAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10379j) && C19383o.m32792b(this.f22733a, ((C10379j) obj).f22733a);
        }

        public final int hashCode() {
            return this.f22733a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShippingAddressSelected(shippingAddress=");
            h.append(this.f22733a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$k */
    public static final class C10380k extends C10369b {

        /* renamed from: a */
        public final ShippingMethod f22734a;

        public C10380k(ShippingMethod shippingMethod) {
            C19383o.m32797g(shippingMethod, "shippingMethod");
            this.f22734a = shippingMethod;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10380k) && C19383o.m32792b(this.f22734a, ((C10380k) obj).f22734a);
        }

        public final int hashCode() {
            return this.f22734a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShippingMethodSelected(shippingMethod=");
            h.append(this.f22734a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$l */
    public static final class C10381l extends C10369b {

        /* renamed from: a */
        public static final C10381l f22735a = new C10381l();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.b$m */
    public static final class C10382m extends C10369b {

        /* renamed from: a */
        public final String f22736a;

        public C10382m(String str) {
            this.f22736a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10382m) && C19383o.m32792b(this.f22736a, ((C10382m) obj).f22736a);
        }

        public final int hashCode() {
            String str = this.f22736a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("UrlClicked(url="), this.f22736a, ')');
        }
    }
}
