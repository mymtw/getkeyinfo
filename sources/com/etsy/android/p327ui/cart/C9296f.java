package com.etsy.android.p327ui.cart;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.cart.f */
public abstract class C9296f {

    /* renamed from: a */
    public final boolean f20510a;

    /* renamed from: com.etsy.android.ui.cart.f$a */
    public interface C9297a {
        /* renamed from: c */
        String mo31626c();

        long getShopId();
    }

    /* renamed from: com.etsy.android.ui.cart.f$b */
    public interface C9298b {
        /* renamed from: a */
        long mo31628a();

        /* renamed from: b */
        String mo31629b();
    }

    /* renamed from: com.etsy.android.ui.cart.f$c */
    public static final class C9299c extends C9296f implements C9298b, C9297a {

        /* renamed from: b */
        public final long f20511b;

        /* renamed from: c */
        public final String f20512c;

        /* renamed from: d */
        public final long f20513d;

        /* renamed from: e */
        public final String f20514e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9299c(long j, long j2, String str, String str2) {
            super(true);
            C19383o.m32797g(str, "couponCode");
            this.f20511b = j;
            this.f20512c = str;
            this.f20513d = j2;
            this.f20514e = str2;
        }

        /* renamed from: a */
        public final long mo31628a() {
            return this.f20513d;
        }

        /* renamed from: b */
        public final String mo31629b() {
            return this.f20514e;
        }

        /* renamed from: c */
        public final String mo31626c() {
            return this.f20512c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9299c)) {
                return false;
            }
            C9299c cVar = (C9299c) obj;
            return this.f20511b == cVar.f20511b && C19383o.m32792b(this.f20512c, cVar.f20512c) && this.f20513d == cVar.f20513d && C19383o.m32792b(this.f20514e, cVar.f20514e);
        }

        public final long getShopId() {
            return this.f20511b;
        }

        public final int hashCode() {
            int b = C0071c.m190b(this.f20513d, C0023f.m105e(this.f20512c, Long.hashCode(this.f20511b) * 31, 31), 31);
            String str = this.f20514e;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("PromotedOfferDeeplinkCoupon(shopId=");
            h.append(this.f20511b);
            h.append(", couponCode=");
            h.append(this.f20512c);
            h.append(", promotedOfferId=");
            h.append(this.f20513d);
            h.append(", promotedOfferToken=");
            return C0391c.m1057c(h, this.f20514e, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.cart.f$d */
    public static final class C9300d extends C9296f implements C9297a {

        /* renamed from: b */
        public final long f20515b;

        /* renamed from: c */
        public final String f20516c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9300d(long j, String str) {
            super(false);
            C19383o.m32797g(str, "couponCode");
            this.f20515b = j;
            this.f20516c = str;
        }

        /* renamed from: c */
        public final String mo31626c() {
            return this.f20516c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9300d)) {
                return false;
            }
            C9300d dVar = (C9300d) obj;
            return this.f20515b == dVar.f20515b && C19383o.m32792b(this.f20516c, dVar.f20516c);
        }

        public final long getShopId() {
            return this.f20515b;
        }

        public final int hashCode() {
            return this.f20516c.hashCode() + (Long.hashCode(this.f20515b) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopCoupon(shopId=");
            h.append(this.f20515b);
            h.append(", couponCode=");
            return C0391c.m1057c(h, this.f20516c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.cart.f$e */
    public static final class C9301e extends C9296f implements C9297a, C9298b {

        /* renamed from: b */
        public final long f20517b;

        /* renamed from: c */
        public final String f20518c;

        /* renamed from: d */
        public final long f20519d;

        /* renamed from: e */
        public final String f20520e;

        public C9301e(long j, long j2, String str, String str2) {
            super(true);
            this.f20517b = j;
            this.f20518c = str;
            this.f20519d = j2;
            this.f20520e = str2;
        }

        /* renamed from: a */
        public final long mo31628a() {
            return this.f20519d;
        }

        /* renamed from: b */
        public final String mo31629b() {
            return this.f20520e;
        }

        /* renamed from: c */
        public final String mo31626c() {
            return this.f20518c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9301e)) {
                return false;
            }
            C9301e eVar = (C9301e) obj;
            return this.f20517b == eVar.f20517b && C19383o.m32792b(this.f20518c, eVar.f20518c) && this.f20519d == eVar.f20519d && C19383o.m32792b(this.f20520e, eVar.f20520e);
        }

        public final long getShopId() {
            return this.f20517b;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f20517b) * 31;
            String str = this.f20518c;
            int i = 0;
            int b = C0071c.m190b(this.f20519d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.f20520e;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return b + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("UpdatesCartCoupon(shopId=");
            h.append(this.f20517b);
            h.append(", couponCode=");
            h.append(this.f20518c);
            h.append(", promotedOfferId=");
            h.append(this.f20519d);
            h.append(", promotedOfferToken=");
            return C0391c.m1057c(h, this.f20520e, ')');
        }
    }

    public C9296f(boolean z) {
        this.f20510a = z;
    }
}
