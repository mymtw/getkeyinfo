package p466vc;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import androidx.viewpager.widget.ViewPager;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.Country;
import com.etsy.android.lib.models.apiv3.cart.GooglePayData;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.p327ui.listing.ListingViewState;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p003a2.C0015b;
import p363he.C12822e;
import p370ie.C12948h;

/* renamed from: vc.d */
public abstract class C13574d {

    /* renamed from: vc.d$a */
    public static final class C13575a extends C13574d {

        /* renamed from: a */
        public static final C13575a f29662a = new C13575a();
    }

    /* renamed from: vc.d$c */
    public static final class C13594c extends C13574d {

        /* renamed from: a */
        public final ListingViewState f29683a;

        public C13594c(ListingViewState listingViewState) {
            this.f29683a = listingViewState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C13594c) && C19383o.m32792b(this.f29683a, ((C13594c) obj).f29683a);
        }

        public final int hashCode() {
            return this.f29683a.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("StateChange(state=");
            h.append(this.f29683a);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: vc.d$b */
    public static abstract class C13576b extends C13574d {

        /* renamed from: vc.d$b$b */
        public static final class C13578b extends C13576b {

            /* renamed from: a */
            public final ListingLike f29665a;

            /* renamed from: b */
            public final String f29666b;

            public C13578b(ListingLike listingLike, String str) {
                C19383o.m32797g(listingLike, "listingLike");
                this.f29665a = listingLike;
                this.f29666b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13578b)) {
                    return false;
                }
                C13578b bVar = (C13578b) obj;
                return C19383o.m32792b(this.f29665a, bVar.f29665a) && C19383o.m32792b(this.f29666b, bVar.f29666b);
            }

            public final int hashCode() {
                int hashCode = this.f29665a.hashCode() * 31;
                String str = this.f29666b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("ChangeFavorite(listingLike=");
                h.append(this.f29665a);
                h.append(", contentSource=");
                return C0391c.m1057c(h, this.f29666b, ')');
            }
        }

        /* renamed from: vc.d$b$c */
        public static final class C13579c extends C13576b {

            /* renamed from: a */
            public static final C13579c f29667a = new C13579c();
        }

        /* renamed from: vc.d$b$d */
        public static final class C13580d extends C13576b {

            /* renamed from: a */
            public static final C13580d f29668a = new C13580d();
        }

        /* renamed from: vc.d$b$e */
        public static final class C13581e extends C13576b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13581e)) {
                    return false;
                }
                ((C13581e) obj).getClass();
                return C19383o.m32792b((Object) null, (Object) null);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "DebugToast(message=null)";
            }
        }

        /* renamed from: vc.d$b$f */
        public static final class C13582f extends C13576b {

            /* renamed from: a */
            public static final C13582f f29669a = new C13582f();
        }

        /* renamed from: vc.d$b$g */
        public static final class C13583g extends C13576b {

            /* renamed from: a */
            public final GooglePayData f29670a;

            public C13583g(GooglePayData googlePayData) {
                C19383o.m32797g(googlePayData, "googlePayData");
                this.f29670a = googlePayData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13583g) && C19383o.m32792b(this.f29670a, ((C13583g) obj).f29670a);
            }

            public final int hashCode() {
                return this.f29670a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("GooglePayRequestPayment(googlePayData=");
                h.append(this.f29670a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: vc.d$b$h */
        public static final class C13584h extends C13576b {

            /* renamed from: a */
            public final long f29671a;

            public C13584h(long j) {
                this.f29671a = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13584h) && this.f29671a == ((C13584h) obj).f29671a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f29671a);
            }

            public final String toString() {
                return C0015b.m91j(C0072d.m201h("MarkAsViewed(listingId="), this.f29671a, ')');
            }
        }

        /* renamed from: vc.d$b$i */
        public static final class C13585i extends C13576b {

            /* renamed from: a */
            public final C12822e f29672a;

            public C13585i(C12822e eVar) {
                this.f29672a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13585i) && C19383o.m32792b(this.f29672a, ((C13585i) obj).f29672a);
            }

            public final int hashCode() {
                return this.f29672a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Navigation(navigationKey=");
                h.append(this.f29672a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: vc.d$b$j */
        public static final class C13586j extends C13576b {

            /* renamed from: a */
            public final String f29673a;

            public C13586j(String str) {
                C19383o.m32797g(str, "shopId");
                this.f29673a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13586j) && C19383o.m32792b(this.f29673a, ((C13586j) obj).f29673a);
            }

            public final int hashCode() {
                return this.f29673a.hashCode();
            }

            public final String toString() {
                return C0391c.m1057c(C0072d.m201h("PopulateShopId(shopId="), this.f29673a, ')');
            }
        }

        /* renamed from: vc.d$b$k */
        public static final class C13587k extends C13576b {

            /* renamed from: a */
            public final int f29674a;

            public C13587k(int i) {
                this.f29674a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13587k) && this.f29674a == ((C13587k) obj).f29674a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f29674a);
            }

            public final String toString() {
                return C0073e.m208h(C0072d.m201h("ScrollToPosition(position="), this.f29674a, ')');
            }
        }

        /* renamed from: vc.d$b$l */
        public static final class C13588l extends C13576b {

            /* renamed from: a */
            public final ViewPager f29675a;

            public C13588l(ViewPager viewPager) {
                C19383o.m32797g(viewPager, "viewPager");
                this.f29675a = viewPager;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13588l) && C19383o.m32792b(this.f29675a, ((C13588l) obj).f29675a);
            }

            public final int hashCode() {
                return this.f29675a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SetupTopPanelMissingAccessibility(viewPager=");
                h.append(this.f29675a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: vc.d$b$m */
        public static final class C13589m extends C13576b {

            /* renamed from: a */
            public final String f29676a;

            /* renamed from: b */
            public final String f29677b;

            public C13589m(String str, String str2) {
                C19383o.m32797g(str, "url");
                this.f29676a = str;
                this.f29677b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13589m)) {
                    return false;
                }
                C13589m mVar = (C13589m) obj;
                return C19383o.m32792b(this.f29676a, mVar.f29676a) && C19383o.m32792b(this.f29677b, mVar.f29677b);
            }

            public final int hashCode() {
                int hashCode = this.f29676a.hashCode() * 31;
                String str = this.f29677b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("Share(url=");
                h.append(this.f29676a);
                h.append(", imageUrl=");
                return C0391c.m1057c(h, this.f29677b, ')');
            }
        }

        /* renamed from: vc.d$b$n */
        public static final class C13590n extends C13576b {

            /* renamed from: a */
            public final String f29678a;

            /* renamed from: b */
            public final String f29679b;

            public C13590n(String str, String str2) {
                this.f29678a = str;
                this.f29679b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13590n)) {
                    return false;
                }
                C13590n nVar = (C13590n) obj;
                return C19383o.m32792b(this.f29678a, nVar.f29678a) && C19383o.m32792b(this.f29679b, nVar.f29679b);
            }

            public final int hashCode() {
                int hashCode = this.f29678a.hashCode() * 31;
                String str = this.f29679b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("ShowShareScreenShotBanner(url=");
                h.append(this.f29678a);
                h.append(", imageUrl=");
                return C0391c.m1057c(h, this.f29679b, ')');
            }
        }

        /* renamed from: vc.d$b$o */
        public static final class C13591o extends C13576b {

            /* renamed from: a */
            public final C12948h f29680a;

            public C13591o(C12948h hVar) {
                this.f29680a = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13591o) && C19383o.m32792b(this.f29680a, ((C13591o) obj).f29680a);
            }

            public final int hashCode() {
                return this.f29680a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("SignInForAction(key=");
                h.append(this.f29680a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: vc.d$b$p */
        public static final class C13592p extends C13576b {

            /* renamed from: a */
            public final ListingLike f29681a;

            public C13592p(ListingLike listingLike) {
                C19383o.m32797g(listingLike, "listingLike");
                this.f29681a = listingLike;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13592p) && C19383o.m32792b(this.f29681a, ((C13592p) obj).f29681a);
            }

            public final int hashCode() {
                return this.f29681a.hashCode();
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("UpdateFavorite(listingLike=");
                h.append(this.f29681a);
                h.append(')');
                return h.toString();
            }
        }

        /* renamed from: vc.d$b$q */
        public static final class C13593q extends C13576b {

            /* renamed from: a */
            public final List<Country> f29682a;

            public C13593q(List<Country> list) {
                C19383o.m32797g(list, "availableCountries");
                this.f29682a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C13593q) && C19383o.m32792b(this.f29682a, ((C13593q) obj).f29682a);
            }

            public final int hashCode() {
                return this.f29682a.hashCode();
            }

            public final String toString() {
                return C0070b.m186i(C0072d.m201h("UpdateShippingDestination(availableCountries="), this.f29682a, ')');
            }
        }

        /* renamed from: vc.d$b$a */
        public static final class C13577a extends C13576b {

            /* renamed from: a */
            public final String f29663a;

            /* renamed from: b */
            public final Map<AnalyticsProperty, Object> f29664b;

            public C13577a(String str, Map<AnalyticsProperty, ? extends Object> map) {
                C19383o.m32797g(str, "eventName");
                C19383o.m32797g(map, "parameters");
                this.f29663a = str;
                this.f29664b = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C13577a)) {
                    return false;
                }
                C13577a aVar = (C13577a) obj;
                return C19383o.m32792b(this.f29663a, aVar.f29663a) && C19383o.m32792b(this.f29664b, aVar.f29664b);
            }

            public final int hashCode() {
                return this.f29664b.hashCode() + (this.f29663a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("AnalyticsAdHocEvent(eventName=");
                h.append(this.f29663a);
                h.append(", parameters=");
                h.append(this.f29664b);
                h.append(')');
                return h.toString();
            }

            public /* synthetic */ C13577a(String str) {
                this(str, C19294b0.m32559p0());
            }
        }
    }
}
