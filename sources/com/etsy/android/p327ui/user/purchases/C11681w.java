package com.etsy.android.p327ui.user.purchases;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseListing;
import com.etsy.android.lib.models.pastpurchase.PastPurchaseTransaction;
import com.etsy.android.lib.models.pastpurchase.extensions.PastPurchasesReceiptListingStateExtensionsKt;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.ui.user.purchases.w */
public final class C11681w {

    /* renamed from: a */
    public final C11628a f25883a;

    /* renamed from: b */
    public final long f25884b;

    /* renamed from: c */
    public final long f25885c;

    /* renamed from: d */
    public final long f25886d;

    /* renamed from: e */
    public final int f25887e;

    /* renamed from: f */
    public final String f25888f;

    /* renamed from: g */
    public final String f25889g;

    /* renamed from: h */
    public final String f25890h;

    /* renamed from: i */
    public final String f25891i;

    /* renamed from: j */
    public final int f25892j;

    /* renamed from: k */
    public final Spanned f25893k;

    /* renamed from: l */
    public final int f25894l;

    /* renamed from: m */
    public final int f25895m;

    /* renamed from: n */
    public final int f25896n;

    /* renamed from: o */
    public final int f25897o;

    /* renamed from: p */
    public final boolean f25898p;

    /* renamed from: q */
    public final boolean f25899q;

    /* renamed from: r */
    public final String f25900r;

    /* renamed from: com.etsy.android.ui.user.purchases.w$a */
    public static final class C11682a {
        /* renamed from: a */
        public static boolean m19387a(PastPurchaseTransaction pastPurchaseTransaction) {
            PastPurchaseListing listing = pastPurchaseTransaction.getListing();
            return listing != null && PastPurchasesReceiptListingStateExtensionsKt.isActive(listing) && !listing.isDigital() && !listing.isVintage() && !pastPurchaseTransaction.isGiftCard();
        }
    }

    public C11681w(C11628a aVar, long j, long j2, long j3, int i, String str, String str2, String str3, String str4, int i2, Spanned spanned, int i3, int i4, int i5, int i6, boolean z, boolean z2, String str5) {
        String str6 = str4;
        C19383o.m32797g(str6, ResponseConstants.QUANTITY);
        this.f25883a = aVar;
        this.f25884b = j;
        this.f25885c = j2;
        this.f25886d = j3;
        this.f25887e = i;
        this.f25888f = str;
        this.f25889g = str2;
        this.f25890h = str3;
        this.f25891i = str6;
        this.f25892j = i2;
        this.f25893k = spanned;
        this.f25894l = i3;
        this.f25895m = i4;
        this.f25896n = i5;
        this.f25897o = i6;
        this.f25898p = z;
        this.f25899q = z2;
        this.f25900r = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11681w)) {
            return false;
        }
        C11681w wVar = (C11681w) obj;
        return C19383o.m32792b(this.f25883a, wVar.f25883a) && this.f25884b == wVar.f25884b && this.f25885c == wVar.f25885c && this.f25886d == wVar.f25886d && this.f25887e == wVar.f25887e && C19383o.m32792b(this.f25888f, wVar.f25888f) && C19383o.m32792b(this.f25889g, wVar.f25889g) && C19383o.m32792b(this.f25890h, wVar.f25890h) && C19383o.m32792b(this.f25891i, wVar.f25891i) && this.f25892j == wVar.f25892j && C19383o.m32792b(this.f25893k, wVar.f25893k) && this.f25894l == wVar.f25894l && this.f25895m == wVar.f25895m && this.f25896n == wVar.f25896n && this.f25897o == wVar.f25897o && this.f25898p == wVar.f25898p && this.f25899q == wVar.f25899q && C19383o.m32792b(this.f25900r, wVar.f25900r);
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f25887e, C0071c.m190b(this.f25886d, C0071c.m190b(this.f25885c, C0071c.m190b(this.f25884b, this.f25883a.hashCode() * 31, 31), 31), 31), 31);
        String str = this.f25888f;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25889g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25890h;
        int a2 = C0069a.m170a(this.f25892j, C0023f.m105e(this.f25891i, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        Spanned spanned = this.f25893k;
        int a3 = C0069a.m170a(this.f25897o, C0069a.m170a(this.f25896n, C0069a.m170a(this.f25895m, C0069a.m170a(this.f25894l, (a2 + (spanned == null ? 0 : spanned.hashCode())) * 31, 31), 31), 31), 31);
        boolean z = this.f25898p;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (a3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f25899q;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        String str4 = this.f25900r;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TransactionViewState(dispatcher=");
        h.append(this.f25883a);
        h.append(", receiptId=");
        h.append(this.f25884b);
        h.append(", transactionId=");
        h.append(this.f25885c);
        h.append(", listingId=");
        h.append(this.f25886d);
        h.append(", helpLinkVisibility=");
        h.append(this.f25887e);
        h.append(", title=");
        h.append(this.f25888f);
        h.append(", titleContentDescription=");
        h.append(this.f25889g);
        h.append(", price=");
        h.append(this.f25890h);
        h.append(", quantity=");
        h.append(this.f25891i);
        h.append(", transparentPricingVisibility=");
        h.append(this.f25892j);
        h.append(", transparentPricingMessage=");
        h.append(this.f25893k);
        h.append(", reviewVisibility=");
        h.append(this.f25894l);
        h.append(", reviewRating=");
        h.append(this.f25895m);
        h.append(", reviewCalloutVisibility=");
        h.append(this.f25896n);
        h.append(", buyAgainVisibility=");
        h.append(this.f25897o);
        h.append(", canBuyThisAgain=");
        h.append(this.f25898p);
        h.append(", canGoToCart=");
        h.append(this.f25899q);
        h.append(", listingImageUrl=");
        return C0391c.m1057c(h, this.f25900r, ')');
    }
}
