package com.etsy.android.p327ui.listing.p329ui.buybox.shopname;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.shopname.a */
public final class C10304a extends C10423j {

    /* renamed from: a */
    public final String f22621a;

    /* renamed from: b */
    public final C10305a f22622b;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.shopname.a$a */
    public static final class C10305a {

        /* renamed from: a */
        public final boolean f22623a;

        /* renamed from: b */
        public final String f22624b;

        /* renamed from: c */
        public final String f22625c;

        /* renamed from: d */
        public final String f22626d;

        /* renamed from: e */
        public final String f22627e;

        /* renamed from: f */
        public final String f22628f;

        /* renamed from: g */
        public final boolean f22629g;

        public C10305a() {
            this(false, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
        }

        public C10305a(boolean z, String str, String str2, String str3, String str4, String str5, int i) {
            z = (i & 1) != 0 ? false : z;
            str = (i & 2) != 0 ? null : str;
            str2 = (i & 4) != 0 ? null : str2;
            str3 = (i & 8) != 0 ? null : str3;
            str4 = (i & 16) != 0 ? null : str4;
            str5 = (i & 32) != 0 ? null : str5;
            this.f22623a = z;
            this.f22624b = str;
            this.f22625c = str2;
            this.f22626d = str3;
            this.f22627e = str4;
            this.f22628f = str5;
            this.f22629g = false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10305a)) {
                return false;
            }
            C10305a aVar = (C10305a) obj;
            return this.f22623a == aVar.f22623a && C19383o.m32792b(this.f22624b, aVar.f22624b) && C19383o.m32792b(this.f22625c, aVar.f22625c) && C19383o.m32792b(this.f22626d, aVar.f22626d) && C19383o.m32792b(this.f22627e, aVar.f22627e) && C19383o.m32792b(this.f22628f, aVar.f22628f) && this.f22629g == aVar.f22629g;
        }

        public final int hashCode() {
            boolean z = this.f22623a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.f22624b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f22625c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f22626d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f22627e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f22628f;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            int i3 = (hashCode4 + i2) * 31;
            boolean z3 = this.f22629g;
            if (!z3) {
                z2 = z3;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StarSeller(isStarSellerBadgeShown=");
            h.append(this.f22623a);
            h.append(", label=");
            h.append(this.f22624b);
            h.append(", modalTitle=");
            h.append(this.f22625c);
            h.append(", modalBody=");
            h.append(this.f22626d);
            h.append(", clickedEventName=");
            h.append(this.f22627e);
            h.append(", viewedEventName=");
            h.append(this.f22628f);
            h.append(", isViewedEventLogged=");
            return C0391c.m1058d(h, this.f22629g, ')');
        }
    }

    public C10304a(String str, C10305a aVar) {
        this.f22621a = str;
        this.f22622b = aVar;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SHOP_NAME;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10304a)) {
            return false;
        }
        C10304a aVar = (C10304a) obj;
        return C19383o.m32792b(this.f22621a, aVar.f22621a) && C19383o.m32792b(this.f22622b, aVar.f22622b);
    }

    public final int hashCode() {
        return this.f22622b.hashCode() + (this.f22621a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopName(shopName=");
        h.append(this.f22621a);
        h.append(", starSeller=");
        h.append(this.f22622b);
        h.append(')');
        return h.toString();
    }
}
