package com.etsy.android.p327ui.user.purchases;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;

/* renamed from: com.etsy.android.ui.user.purchases.d */
public abstract class C11633d {

    /* renamed from: com.etsy.android.ui.user.purchases.d$a */
    public static final class C11634a extends C11633d {

        /* renamed from: a */
        public final long f25756a;

        /* renamed from: b */
        public final boolean f25757b;

        /* renamed from: c */
        public final boolean f25758c;

        public C11634a(long j, boolean z, boolean z2) {
            this.f25756a = j;
            this.f25757b = z;
            this.f25758c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11634a)) {
                return false;
            }
            C11634a aVar = (C11634a) obj;
            return this.f25756a == aVar.f25756a && this.f25757b == aVar.f25757b && this.f25758c == aVar.f25758c;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f25756a) * 31;
            boolean z = this.f25757b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f25758c;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("BuyThisAgain(listingId=");
            h.append(this.f25756a);
            h.append(", canBuyAgain=");
            h.append(this.f25757b);
            h.append(", canGoToCart=");
            return C0391c.m1058d(h, this.f25758c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.d$b */
    public static final class C11635b extends C11633d {

        /* renamed from: a */
        public final long f25759a;

        public C11635b(long j) {
            this.f25759a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11635b) && this.f25759a == ((C11635b) obj).f25759a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f25759a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("HelpWithOrder(receiptId="), this.f25759a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.d$c */
    public static final class C11636c extends C11633d {

        /* renamed from: a */
        public final long f25760a;

        public C11636c(long j) {
            this.f25760a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11636c) && this.f25760a == ((C11636c) obj).f25760a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f25760a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("LeaveReview(transactionId="), this.f25760a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.d$d */
    public static final class C11637d extends C11633d {

        /* renamed from: a */
        public final long f25761a;

        public C11637d(long j) {
            this.f25761a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11637d) && this.f25761a == ((C11637d) obj).f25761a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f25761a);
        }

        public final String toString() {
            return C0015b.m91j(C0072d.m201h("ViewReceipt(receiptId="), this.f25761a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.d$e */
    public static final class C11638e extends C11633d {

        /* renamed from: a */
        public final String f25762a;

        public C11638e(String str) {
            C19383o.m32797g(str, "shopName");
            this.f25762a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11638e) && C19383o.m32792b(this.f25762a, ((C11638e) obj).f25762a);
        }

        public final int hashCode() {
            return this.f25762a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("ViewShop(shopName="), this.f25762a, ')');
        }
    }
}
