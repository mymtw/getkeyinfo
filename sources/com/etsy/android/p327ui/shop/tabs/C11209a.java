package com.etsy.android.p327ui.shop.tabs;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.ShopHomePage;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.shop.tabs.a */
public interface C11209a extends C11215b {

    /* renamed from: com.etsy.android.ui.shop.tabs.a$a */
    public static final class C11210a implements C11209a {

        /* renamed from: a */
        public final Throwable f24782a;

        /* renamed from: b */
        public final String f24783b;

        public C11210a() {
            this((String) null, (Throwable) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11210a)) {
                return false;
            }
            C11210a aVar = (C11210a) obj;
            return C19383o.m32792b(this.f24782a, aVar.f24782a) && C19383o.m32792b(this.f24783b, aVar.f24783b);
        }

        public final int hashCode() {
            Throwable th = this.f24782a;
            int i = 0;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            String str = this.f24783b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LoadShopError(error=");
            h.append(this.f24782a);
            h.append(", message=");
            return C0391c.m1057c(h, this.f24783b, ')');
        }

        public C11210a(String str, Throwable th) {
            this.f24782a = th;
            this.f24783b = str;
        }
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.a$b */
    public static final class C11211b implements C11209a {

        /* renamed from: a */
        public final long f24784a;

        /* renamed from: b */
        public final String f24785b;

        /* renamed from: c */
        public final String f24786c;

        public C11211b(long j, String str, String str2) {
            this.f24784a = j;
            this.f24785b = str;
            this.f24786c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11211b)) {
                return false;
            }
            C11211b bVar = (C11211b) obj;
            return this.f24784a == bVar.f24784a && C19383o.m32792b(this.f24785b, bVar.f24785b) && C19383o.m32792b(this.f24786c, bVar.f24786c);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f24784a) * 31;
            String str = this.f24785b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24786c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LoadShopFromId(shopId=");
            h.append(this.f24784a);
            h.append(", referrerListingId=");
            h.append(this.f24785b);
            h.append(", coupon=");
            return C0391c.m1057c(h, this.f24786c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.a$c */
    public static final class C11212c implements C11209a {

        /* renamed from: a */
        public final String f24787a;

        public C11212c(String str) {
            this.f24787a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11212c) && C19383o.m32792b(this.f24787a, ((C11212c) obj).f24787a);
        }

        public final int hashCode() {
            return this.f24787a.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("LoadShopFromName(shopName="), this.f24787a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.a$d */
    public static final class C11213d implements C11209a {

        /* renamed from: a */
        public final ShopHomePage f24788a;

        public C11213d(ShopHomePage shopHomePage) {
            C19383o.m32797g(shopHomePage, "page");
            this.f24788a = shopHomePage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11213d) && C19383o.m32792b(this.f24788a, ((C11213d) obj).f24788a);
        }

        public final int hashCode() {
            return this.f24788a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("LoadShopSuccess(page=");
            h.append(this.f24788a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.shop.tabs.a$e */
    public static final class C11214e implements C11209a {

        /* renamed from: a */
        public static final C11214e f24789a = new C11214e();
    }
}
