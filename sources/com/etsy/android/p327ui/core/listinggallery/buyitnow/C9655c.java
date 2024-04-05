package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.R;
import com.etsy.android.lib.models.PaymentOption;
import com.etsy.android.lib.models.apiv3.cart.SingleListingCart;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.listing.ListingExpressCheckout;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c */
public abstract class C9655c {

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c$a */
    public static final class C9656a extends C9655c {

        /* renamed from: a */
        public static final C9656a f21374a = new C9656a();
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c$b */
    public static final class C9657b extends C9655c {

        /* renamed from: a */
        public final String f21375a;

        /* renamed from: b */
        public final int f21376b = 1;

        /* renamed from: c */
        public final PaymentOption f21377c;

        /* renamed from: d */
        public final String f21378d;

        /* renamed from: e */
        public final String f21379e;

        /* renamed from: f */
        public final String f21380f;

        public C9657b(String str, PaymentOption paymentOption, String str2, String str3, String str4) {
            C19383o.m32797g(str, "listingId");
            this.f21375a = str;
            this.f21377c = paymentOption;
            this.f21378d = str2;
            this.f21379e = str3;
            this.f21380f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9657b)) {
                return false;
            }
            C9657b bVar = (C9657b) obj;
            return C19383o.m32792b(this.f21375a, bVar.f21375a) && this.f21376b == bVar.f21376b && C19383o.m32792b(this.f21377c, bVar.f21377c) && C19383o.m32792b(this.f21378d, bVar.f21378d) && C19383o.m32792b(this.f21379e, bVar.f21379e) && C19383o.m32792b(this.f21380f, bVar.f21380f);
        }

        public final int hashCode() {
            int hashCode = (this.f21377c.hashCode() + C0069a.m170a(this.f21376b, this.f21375a.hashCode() * 31, 31)) * 31;
            String str = this.f21378d;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f21379e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21380f;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("NavigateToSingleListingCheckout(listingId=");
            h.append(this.f21375a);
            h.append(", quantity=");
            h.append(this.f21376b);
            h.append(", paymentOption=");
            h.append(this.f21377c);
            h.append(", offeringId=");
            h.append(this.f21378d);
            h.append(", personalization=");
            h.append(this.f21379e);
            h.append(", selectedVariationsJson=");
            return C0391c.m1057c(h, this.f21380f, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c$c */
    public static final class C9658c extends C9655c {

        /* renamed from: a */
        public final int f21381a = R.string.cart_error;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9658c) && this.f21381a == ((C9658c) obj).f21381a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f21381a);
        }

        public final String toString() {
            return C0073e.m208h(C0072d.m201h("ShortToast(stringResId="), this.f21381a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c$d */
    public static final class C9659d extends C9655c {

        /* renamed from: a */
        public final String f21382a;

        /* renamed from: b */
        public final int f21383b = 1;

        /* renamed from: c */
        public final String f21384c;

        /* renamed from: d */
        public final String f21385d;

        /* renamed from: e */
        public final String f21386e;

        /* renamed from: f */
        public final ListingExpressCheckout f21387f;

        /* renamed from: g */
        public final SingleListingCart f21388g;

        public C9659d(String str, String str2, String str3, String str4, ListingExpressCheckout listingExpressCheckout) {
            C19383o.m32797g(str, "listingId");
            this.f21382a = str;
            this.f21384c = str2;
            this.f21385d = str3;
            this.f21386e = str4;
            this.f21387f = listingExpressCheckout;
            this.f21388g = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9659d)) {
                return false;
            }
            C9659d dVar = (C9659d) obj;
            return C19383o.m32792b(this.f21382a, dVar.f21382a) && this.f21383b == dVar.f21383b && C19383o.m32792b(this.f21384c, dVar.f21384c) && C19383o.m32792b(this.f21385d, dVar.f21385d) && C19383o.m32792b(this.f21386e, dVar.f21386e) && C19383o.m32792b(this.f21387f, dVar.f21387f) && C19383o.m32792b(this.f21388g, dVar.f21388g);
        }

        public final int hashCode() {
            int a = C0069a.m170a(this.f21383b, this.f21382a.hashCode() * 31, 31);
            String str = this.f21384c;
            int i = 0;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f21385d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f21386e;
            int hashCode3 = (this.f21387f.hashCode() + ((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            SingleListingCart singleListingCart = this.f21388g;
            if (singleListingCart != null) {
                i = singleListingCart.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowBuyItNowDialog(listingId=");
            h.append(this.f21382a);
            h.append(", quantity=");
            h.append(this.f21383b);
            h.append(", offeringId=");
            h.append(this.f21384c);
            h.append(", personalization=");
            h.append(this.f21385d);
            h.append(", selectedVariationsJson=");
            h.append(this.f21386e);
            h.append(", listingExpressCheckout=");
            h.append(this.f21387f);
            h.append(", singleListingCart=");
            h.append(this.f21388g);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c$e */
    public static final class C9660e extends C9655c {

        /* renamed from: a */
        public final AppsInventoryAddToCartContext f21389a;

        /* renamed from: b */
        public final Map<Long, ListingImage> f21390b;

        public C9660e(AppsInventoryAddToCartContext appsInventoryAddToCartContext, Map<Long, ListingImage> map) {
            C19383o.m32797g(map, "imagesByVariation");
            this.f21389a = appsInventoryAddToCartContext;
            this.f21390b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9660e)) {
                return false;
            }
            C9660e eVar = (C9660e) obj;
            return C19383o.m32792b(this.f21389a, eVar.f21389a) && C19383o.m32792b(this.f21390b, eVar.f21390b);
        }

        public final int hashCode() {
            return this.f21390b.hashCode() + (this.f21389a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowNewStyleVariationBottomSheets(inventoryContext=");
            h.append(this.f21389a);
            h.append(", imagesByVariation=");
            h.append(this.f21390b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c$f */
    public static final class C9661f extends C9655c {

        /* renamed from: a */
        public final List<Variation> f21391a;

        public C9661f(List<Variation> list) {
            this.f21391a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9661f) && C19383o.m32792b(this.f21391a, ((C9661f) obj).f21391a);
        }

        public final int hashCode() {
            return this.f21391a.hashCode();
        }

        public final String toString() {
            return C0070b.m186i(C0072d.m201h("ShowOldStyleVariationBottomSheets(variations="), this.f21391a, ')');
        }
    }

    /* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.c$g */
    public static final class C9662g extends C9655c {

        /* renamed from: a */
        public final boolean f21392a;

        /* renamed from: b */
        public final boolean f21393b;

        /* renamed from: c */
        public final int f21394c;

        /* renamed from: d */
        public final String f21395d;

        /* renamed from: e */
        public final String f21396e;

        public C9662g(String str, String str2, boolean z, int i, boolean z2) {
            this.f21392a = z;
            this.f21393b = z2;
            this.f21394c = i;
            this.f21395d = str;
            this.f21396e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9662g)) {
                return false;
            }
            C9662g gVar = (C9662g) obj;
            return this.f21392a == gVar.f21392a && this.f21393b == gVar.f21393b && this.f21394c == gVar.f21394c && C19383o.m32792b(this.f21395d, gVar.f21395d) && C19383o.m32792b(this.f21396e, gVar.f21396e);
        }

        public final int hashCode() {
            boolean z = this.f21392a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f21393b;
            if (!z3) {
                z2 = z3;
            }
            return this.f21396e.hashCode() + C0023f.m105e(this.f21395d, C0069a.m170a(this.f21394c, (i + (z2 ? 1 : 0)) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShowPersonalizationBottomSheet(isPersonalizable=");
            h.append(this.f21392a);
            h.append(", isRequired=");
            h.append(this.f21393b);
            h.append(", maxLength=");
            h.append(this.f21394c);
            h.append(", personalizationInstructions=");
            h.append(this.f21395d);
            h.append(", originalPersonalization=");
            return C0391c.m1057c(h, this.f21396e, ')');
        }
    }
}
