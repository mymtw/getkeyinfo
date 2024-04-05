package com.etsy.android.p327ui.user.purchases.module;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p338df.C12654e;

/* renamed from: com.etsy.android.ui.user.purchases.module.a */
public abstract class C11656a {

    /* renamed from: com.etsy.android.ui.user.purchases.module.a$a */
    public static final class C11657a extends C11656a {

        /* renamed from: a */
        public final C12654e f25798a;

        public C11657a(C12654e eVar) {
            this.f25798a = eVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11657a) && C19383o.m32792b(this.f25798a, ((C11657a) obj).f25798a);
        }

        public final int hashCode() {
            return this.f25798a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ActionsMenuClick(listingCardActionUiModel=");
            h.append(this.f25798a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.module.a$b */
    public static final class C11658b extends C11656a {

        /* renamed from: a */
        public final long f25799a;

        /* renamed from: b */
        public final String f25800b;

        /* renamed from: c */
        public final boolean f25801c;

        /* renamed from: d */
        public final boolean f25802d;

        public C11658b(long j, String str, boolean z, boolean z2) {
            this.f25799a = j;
            this.f25800b = str;
            this.f25801c = z;
            this.f25802d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11658b)) {
                return false;
            }
            C11658b bVar = (C11658b) obj;
            return this.f25799a == bVar.f25799a && C19383o.m32792b(this.f25800b, bVar.f25800b) && this.f25801c == bVar.f25801c && this.f25802d == bVar.f25802d;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f25799a) * 31;
            String str = this.f25800b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            boolean z = this.f25801c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode2 + (z ? 1 : 0)) * 31;
            boolean z3 = this.f25802d;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FavoriteClick(listingId=");
            h.append(this.f25799a);
            h.append(", contentSource=");
            h.append(this.f25800b);
            h.append(", isFav=");
            h.append(this.f25801c);
            h.append(", isInCollections=");
            return C0391c.m1058d(h, this.f25802d, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.module.a$c */
    public static final class C11659c extends C11656a {

        /* renamed from: a */
        public final String f25803a;

        /* renamed from: b */
        public final String f25804b;

        /* renamed from: c */
        public final String f25805c;

        public C11659c(String str, String str2, String str3) {
            C0048b.m167f(str, "landingPageTitle", str2, "apiPath", str3, "eventName");
            this.f25803a = str;
            this.f25804b = str2;
            this.f25805c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11659c)) {
                return false;
            }
            C11659c cVar = (C11659c) obj;
            return C19383o.m32792b(this.f25803a, cVar.f25803a) && C19383o.m32792b(this.f25804b, cVar.f25804b) && C19383o.m32792b(this.f25805c, cVar.f25805c);
        }

        public final int hashCode() {
            return this.f25805c.hashCode() + C0023f.m105e(this.f25804b, this.f25803a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LandingPageClick(landingPageTitle=");
            h.append(this.f25803a);
            h.append(", apiPath=");
            h.append(this.f25804b);
            h.append(", eventName=");
            return C0391c.m1057c(h, this.f25805c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.purchases.module.a$d */
    public static final class C11660d extends C11656a {

        /* renamed from: a */
        public final long f25806a;

        /* renamed from: b */
        public final String f25807b;

        public C11660d(long j, String str) {
            this.f25806a = j;
            this.f25807b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11660d)) {
                return false;
            }
            C11660d dVar = (C11660d) obj;
            return this.f25806a == dVar.f25806a && C19383o.m32792b(this.f25807b, dVar.f25807b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f25806a) * 31;
            String str = this.f25807b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingClick(listingId=");
            h.append(this.f25806a);
            h.append(", contentSource=");
            return C0391c.m1057c(h, this.f25807b, ')');
        }
    }
}
