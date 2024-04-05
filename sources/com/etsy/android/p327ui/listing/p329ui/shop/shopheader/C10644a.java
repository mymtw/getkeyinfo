package com.etsy.android.p327ui.listing.p329ui.shop.shopheader;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.uikit.p331ui.core.NumericRatingView;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.listing.ui.shop.shopheader.a */
public final class C10644a extends C10423j {

    /* renamed from: a */
    public final String f23390a;

    /* renamed from: b */
    public final C10646b f23391b;

    /* renamed from: c */
    public final float f23392c;

    /* renamed from: d */
    public final int f23393d;

    /* renamed from: e */
    public final NumericRatingView.ReviewCountDisplayType f23394e;

    /* renamed from: f */
    public final NumericRatingView.ReviewCountColor f23395f;

    /* renamed from: g */
    public final String f23396g;

    /* renamed from: h */
    public final C10645a f23397h;

    /* renamed from: com.etsy.android.ui.listing.ui.shop.shopheader.a$a */
    public static final class C10645a {

        /* renamed from: a */
        public final boolean f23398a;

        /* renamed from: b */
        public final String f23399b;

        /* renamed from: c */
        public final String f23400c;

        /* renamed from: d */
        public final String f23401d;

        /* renamed from: e */
        public final String f23402e;

        /* renamed from: f */
        public final String f23403f;

        /* renamed from: g */
        public final boolean f23404g;

        public C10645a() {
            this(false, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C10645a(boolean z, String str, String str2, String str3, String str4, String str5, int i) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10645a)) {
                return false;
            }
            C10645a aVar = (C10645a) obj;
            return this.f23398a == aVar.f23398a && C19383o.m32792b(this.f23399b, aVar.f23399b) && C19383o.m32792b(this.f23400c, aVar.f23400c) && C19383o.m32792b(this.f23401d, aVar.f23401d) && C19383o.m32792b(this.f23402e, aVar.f23402e) && C19383o.m32792b(this.f23403f, aVar.f23403f) && this.f23404g == aVar.f23404g;
        }

        public final int hashCode() {
            boolean z = this.f23398a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            String str = this.f23399b;
            int i2 = 0;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f23400c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f23401d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f23402e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f23403f;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            int i3 = (hashCode4 + i2) * 31;
            boolean z3 = this.f23404g;
            if (!z3) {
                z2 = z3;
            }
            return i3 + (z2 ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StarSeller(isStarSellerBadgeShown=");
            h.append(this.f23398a);
            h.append(", label=");
            h.append(this.f23399b);
            h.append(", modalTitle=");
            h.append(this.f23400c);
            h.append(", modalBody=");
            h.append(this.f23401d);
            h.append(", clickedEventName=");
            h.append(this.f23402e);
            h.append(", viewedEventName=");
            h.append(this.f23403f);
            h.append(", isViewedEventLogged=");
            return C0391c.m1058d(h, this.f23404g, ')');
        }

        public C10645a(boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
            this.f23398a = z;
            this.f23399b = str;
            this.f23400c = str2;
            this.f23401d = str3;
            this.f23402e = str4;
            this.f23403f = str5;
            this.f23404g = z2;
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.shop.shopheader.a$b */
    public static abstract class C10646b {

        /* renamed from: com.etsy.android.ui.listing.ui.shop.shopheader.a$b$a */
        public static final class C10647a extends C10646b {

            /* renamed from: a */
            public final String f23405a;

            public C10647a(String str) {
                this.f23405a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C10647a) && C19383o.m32792b(this.f23405a, ((C10647a) obj).f23405a);
            }

            public final int hashCode() {
                return this.f23405a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("Location(location="), this.f23405a, ')');
            }
        }

        /* renamed from: com.etsy.android.ui.listing.ui.shop.shopheader.a$b$b */
        public static final class C10648b extends C10646b {

            /* renamed from: a */
            public final String f23406a;

            /* renamed from: b */
            public final int f23407b;

            public C10648b(String str, int i) {
                this.f23406a = str;
                this.f23407b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C10648b)) {
                    return false;
                }
                C10648b bVar = (C10648b) obj;
                return C19383o.m32792b(this.f23406a, bVar.f23406a) && this.f23407b == bVar.f23407b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f23407b) + (this.f23406a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Sales(formattedSalesCount=");
                h.append(this.f23406a);
                h.append(", salesCount=");
                return C0073e.m208h(h, this.f23407b, ')');
            }
        }
    }

    public C10644a(String str, C10646b bVar, float f, int i, NumericRatingView.ReviewCountDisplayType reviewCountDisplayType, NumericRatingView.ReviewCountColor reviewCountColor, String str2, C10645a aVar) {
        C19383o.m32797g(reviewCountDisplayType, "reviewCountDisplayType");
        C19383o.m32797g(reviewCountColor, "reviewCountColor");
        this.f23390a = str;
        this.f23391b = bVar;
        this.f23392c = f;
        this.f23393d = i;
        this.f23394e = reviewCountDisplayType;
        this.f23395f = reviewCountColor;
        this.f23396g = str2;
        this.f23397h = aVar;
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.SHOP_HEADER_WITH_NUMERIC_RATING;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10644a)) {
            return false;
        }
        C10644a aVar = (C10644a) obj;
        return C19383o.m32792b(this.f23390a, aVar.f23390a) && C19383o.m32792b(this.f23391b, aVar.f23391b) && C19383o.m32792b(Float.valueOf(this.f23392c), Float.valueOf(aVar.f23392c)) && this.f23393d == aVar.f23393d && this.f23394e == aVar.f23394e && this.f23395f == aVar.f23395f && C19383o.m32792b(this.f23396g, aVar.f23396g) && C19383o.m32792b(this.f23397h, aVar.f23397h);
    }

    public final int hashCode() {
        int hashCode = (this.f23395f.hashCode() + ((this.f23394e.hashCode() + C0069a.m170a(this.f23393d, C0023f.m104c(this.f23392c, (this.f23391b.hashCode() + (this.f23390a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31;
        String str = this.f23396g;
        return this.f23397h.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShopHeaderWithNumericRating(shopName=");
        h.append(this.f23390a);
        h.append(", subHeader=");
        h.append(this.f23391b);
        h.append(", averageRating=");
        h.append(this.f23392c);
        h.append(", numberOfReviews=");
        h.append(this.f23393d);
        h.append(", reviewCountDisplayType=");
        h.append(this.f23394e);
        h.append(", reviewCountColor=");
        h.append(this.f23395f);
        h.append(", shopImageUrl=");
        h.append(this.f23396g);
        h.append(", starSeller=");
        h.append(this.f23397h);
        h.append(')');
        return h.toString();
    }
}
