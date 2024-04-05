package com.etsy.android.p327ui.user.inappnotifications;

import android.support.p013v4.media.C0072d;
import android.view.View;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.cart.C9296f;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p464va.C13547b;

/* renamed from: com.etsy.android.ui.user.inappnotifications.q */
public abstract class C11564q {

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$a */
    public static final class C11565a extends C11564q {

        /* renamed from: a */
        public final int f25623a;

        /* renamed from: b */
        public final C13547b f25624b;

        public C11565a(int i, C13547b bVar) {
            this.f25623a = i;
            this.f25624b = bVar;
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$b */
    public static final class C11566b extends C11564q {
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$c */
    public static final class C11567c extends C11564q {

        /* renamed from: a */
        public final C9296f.C9301e f25625a;

        public C11567c(C9296f.C9301e eVar) {
            this.f25625a = eVar;
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$d */
    public static final class C11568d extends C11564q {

        /* renamed from: a */
        public final IANListingCard f25626a;

        /* renamed from: b */
        public final View f25627b;

        /* renamed from: c */
        public final String f25628c;

        /* renamed from: d */
        public final Long f25629d;

        public C11568d(IANListingCard iANListingCard, View view, String str, Long l) {
            C19383o.m32797g(iANListingCard, ResponseConstants.LISTING);
            C19383o.m32797g(view, "favIcon");
            C19383o.m32797g(str, "feedId");
            this.f25626a = iANListingCard;
            this.f25627b = view;
            this.f25628c = str;
            this.f25629d = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11568d)) {
                return false;
            }
            C11568d dVar = (C11568d) obj;
            return C19383o.m32792b(this.f25626a, dVar.f25626a) && C19383o.m32792b(this.f25627b, dVar.f25627b) && C19383o.m32792b(this.f25628c, dVar.f25628c) && C19383o.m32792b(this.f25629d, dVar.f25629d);
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f25628c, (this.f25627b.hashCode() + (this.f25626a.hashCode() * 31)) * 31, 31);
            Long l = this.f25629d;
            return e + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FavoriteListing(listing=");
            h.append(this.f25626a);
            h.append(", favIcon=");
            h.append(this.f25627b);
            h.append(", feedId=");
            h.append(this.f25628c);
            h.append(", feedIndex=");
            h.append(this.f25629d);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$e */
    public static final class C11569e extends C11564q {

        /* renamed from: a */
        public final long f25630a;

        /* renamed from: b */
        public final String f25631b;

        /* renamed from: c */
        public final boolean f25632c;

        public C11569e(long j, String str, boolean z) {
            C19383o.m32797g(str, "shopName");
            this.f25630a = j;
            this.f25631b = str;
            this.f25632c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11569e)) {
                return false;
            }
            C11569e eVar = (C11569e) obj;
            return this.f25630a == eVar.f25630a && C19383o.m32792b(this.f25631b, eVar.f25631b) && this.f25632c == eVar.f25632c;
        }

        public final int hashCode() {
            int e = C0023f.m105e(this.f25631b, Long.hashCode(this.f25630a) * 31, 31);
            boolean z = this.f25632c;
            if (z) {
                z = true;
            }
            return e + (z ? 1 : 0);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("FavoriteShop(shopUserId=");
            h.append(this.f25630a);
            h.append(", shopName=");
            h.append(this.f25631b);
            h.append(", isFavorite=");
            return C0391c.m1058d(h, this.f25632c, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$f */
    public static final class C11570f extends C11564q {

        /* renamed from: a */
        public final LandingPageLink f25633a;

        public C11570f(LandingPageLink landingPageLink) {
            C19383o.m32797g(landingPageLink, "landingPageLink");
            this.f25633a = landingPageLink;
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$g */
    public static final class C11571g extends C11564q {

        /* renamed from: a */
        public final ListingLike f25634a;

        public C11571g(ListingLike listingLike) {
            C19383o.m32797g(listingLike, ResponseConstants.LISTING);
            this.f25634a = listingLike;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11571g) && C19383o.m32792b(this.f25634a, ((C11571g) obj).f25634a);
        }

        public final int hashCode() {
            return this.f25634a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ListingClick(listing=");
            h.append(this.f25634a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.user.inappnotifications.q$h */
    public static final class C11572h extends C11564q {

        /* renamed from: a */
        public final long f25635a;

        /* renamed from: b */
        public final String f25636b;

        public C11572h(long j, String str) {
            this.f25635a = j;
            this.f25636b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11572h)) {
                return false;
            }
            C11572h hVar = (C11572h) obj;
            return this.f25635a == hVar.f25635a && C19383o.m32792b(this.f25636b, hVar.f25636b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.f25635a) * 31;
            String str = this.f25636b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopClick(shopId=");
            h.append(this.f25635a);
            h.append(", shopCoupon=");
            return C0391c.m1057c(h, this.f25636b, ')');
        }
    }
}
