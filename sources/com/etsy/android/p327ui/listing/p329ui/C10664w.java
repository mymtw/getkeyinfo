package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import android.text.Spanned;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.models.apiv3.listing.ListingLevelReturnPolicies;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10563f;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.C10564g;
import com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.listing.ui.w */
public final class C10664w {

    /* renamed from: a */
    public boolean f23463a;

    /* renamed from: b */
    public String f23464b;

    /* renamed from: c */
    public boolean f23465c;

    /* renamed from: d */
    public boolean f23466d;

    /* renamed from: e */
    public boolean f23467e;

    /* renamed from: f */
    public boolean f23468f;

    /* renamed from: g */
    public CharSequence f23469g;

    /* renamed from: h */
    public String f23470h;

    /* renamed from: i */
    public CharSequence f23471i;

    /* renamed from: j */
    public CharSequence f23472j;

    /* renamed from: k */
    public C10564g f23473k;

    /* renamed from: l */
    public String f23474l;

    /* renamed from: m */
    public String f23475m;

    /* renamed from: n */
    public C10563f f23476n;

    /* renamed from: o */
    public Map<AnalyticsProperty, ? extends Object> f23477o;

    /* renamed from: p */
    public final Spanned f23478p;

    /* renamed from: q */
    public final Spanned f23479q;

    /* renamed from: r */
    public final boolean f23480r;

    /* renamed from: s */
    public final ListingLevelReturnPolicies f23481s;

    /* renamed from: t */
    public final boolean f23482t;

    public C10664w() {
        this(0);
    }

    public C10664w(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, CharSequence charSequence, String str2, CharSequence charSequence2, CharSequence charSequence3, C10564g gVar, String str3, String str4, C10563f fVar, Map<AnalyticsProperty, ? extends Object> map, Spanned spanned, Spanned spanned2, boolean z6, ListingLevelReturnPolicies listingLevelReturnPolicies, boolean z7) {
        C10564g gVar2 = gVar;
        C10563f fVar2 = fVar;
        Map<AnalyticsProperty, ? extends Object> map2 = map;
        C19383o.m32797g(gVar2, "giftInfo");
        C19383o.m32797g(fVar2, "calculatedShipping");
        C19383o.m32797g(map2, "listingFetchAnalyticsLogAttribute");
        this.f23463a = z;
        this.f23464b = str;
        this.f23465c = z2;
        this.f23466d = z3;
        this.f23467e = z4;
        this.f23468f = z5;
        this.f23469g = charSequence;
        this.f23470h = str2;
        this.f23471i = charSequence2;
        this.f23472j = charSequence3;
        this.f23473k = gVar2;
        this.f23474l = str3;
        this.f23475m = str4;
        this.f23476n = fVar2;
        this.f23477o = map2;
        this.f23478p = spanned;
        this.f23479q = spanned2;
        this.f23480r = z6;
        this.f23481s = listingLevelReturnPolicies;
        this.f23482t = z7;
    }

    /* renamed from: a */
    public final C10615a mo34345a() {
        return new C10615a(this.f23463a, this.f23464b, this.f23465c, this.f23466d, this.f23467e, this.f23468f, this.f23469g, this.f23470h, this.f23471i, this.f23472j, this.f23473k, this.f23474l, this.f23475m, this.f23476n, this.f23477o, this.f23478p, this.f23479q, this.f23480r, this.f23481s, this.f23482t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10664w)) {
            return false;
        }
        C10664w wVar = (C10664w) obj;
        return this.f23463a == wVar.f23463a && C19383o.m32792b(this.f23464b, wVar.f23464b) && this.f23465c == wVar.f23465c && this.f23466d == wVar.f23466d && this.f23467e == wVar.f23467e && this.f23468f == wVar.f23468f && C19383o.m32792b(this.f23469g, wVar.f23469g) && C19383o.m32792b(this.f23470h, wVar.f23470h) && C19383o.m32792b(this.f23471i, wVar.f23471i) && C19383o.m32792b(this.f23472j, wVar.f23472j) && C19383o.m32792b(this.f23473k, wVar.f23473k) && C19383o.m32792b(this.f23474l, wVar.f23474l) && C19383o.m32792b(this.f23475m, wVar.f23475m) && C19383o.m32792b(this.f23476n, wVar.f23476n) && C19383o.m32792b(this.f23477o, wVar.f23477o) && C19383o.m32792b(this.f23478p, wVar.f23478p) && C19383o.m32792b(this.f23479q, wVar.f23479q) && this.f23480r == wVar.f23480r && C19383o.m32792b(this.f23481s, wVar.f23481s) && this.f23482t == wVar.f23482t;
    }

    public final int hashCode() {
        boolean z = this.f23463a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.f23464b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f23465c;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f23466d;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f23467e;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f23468f;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        CharSequence charSequence = this.f23469g;
        int hashCode2 = (i6 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.f23470h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence2 = this.f23471i;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.f23472j;
        int hashCode5 = (this.f23473k.hashCode() + ((hashCode4 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31)) * 31;
        String str3 = this.f23474l;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23475m;
        int hashCode7 = (this.f23477o.hashCode() + ((this.f23476n.hashCode() + ((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31;
        Spanned spanned = this.f23478p;
        int hashCode8 = (hashCode7 + (spanned == null ? 0 : spanned.hashCode())) * 31;
        Spanned spanned2 = this.f23479q;
        int hashCode9 = (hashCode8 + (spanned2 == null ? 0 : spanned2.hashCode())) * 31;
        boolean z7 = this.f23480r;
        if (z7) {
            z7 = true;
        }
        int i7 = (hashCode9 + (z7 ? 1 : 0)) * 31;
        ListingLevelReturnPolicies listingLevelReturnPolicies = this.f23481s;
        if (listingLevelReturnPolicies != null) {
            i2 = listingLevelReturnPolicies.hashCode();
        }
        int i8 = (i7 + i2) * 31;
        boolean z8 = this.f23482t;
        if (!z8) {
            z2 = z8;
        }
        return i8 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ShippingUnstructuredPoliciesPanelBuilder(isExpanded=");
        h.append(this.f23463a);
        h.append(", panelTitle=");
        h.append(this.f23464b);
        h.append(", isDigitalDownload=");
        h.append(this.f23465c);
        h.append(", isSoldOut=");
        h.append(this.f23466d);
        h.append(", isShowingCreditCardsPayments=");
        h.append(this.f23467e);
        h.append(", isShowingPayPalPayment=");
        h.append(this.f23468f);
        h.append(", otherPaymentOptions=");
        h.append(this.f23469g);
        h.append(", panelDescription=");
        h.append(this.f23470h);
        h.append(", estimatedDeliveryDatePrimaryText=");
        h.append(this.f23471i);
        h.append(", estimatedDeliveryDateSubtext=");
        h.append(this.f23472j);
        h.append(", giftInfo=");
        h.append(this.f23473k);
        h.append(", shippingOrigin=");
        h.append(this.f23474l);
        h.append(", shippingTime=");
        h.append(this.f23475m);
        h.append(", calculatedShipping=");
        h.append(this.f23476n);
        h.append(", listingFetchAnalyticsLogAttribute=");
        h.append(this.f23477o);
        h.append(", traderDistinction=");
        h.append(this.f23478p);
        h.append(", sellerContactDetails=");
        h.append(this.f23479q);
        h.append(", shouldUseListingLevelReturnPolicies=");
        h.append(this.f23480r);
        h.append(", listingLevelReturnPolicies=");
        h.append(this.f23481s);
        h.append(", showReturnDeadline=");
        return C0391c.m1058d(h, this.f23482t, ')');
    }

    public /* synthetic */ C10664w(int i) {
        this(false, (String) null, false, false, false, false, (CharSequence) null, (String) null, (CharSequence) null, (CharSequence) null, new C10564g(0), (String) null, (String) null, new C10563f(0), C19294b0.m32559p0(), (Spanned) null, (Spanned) null, false, (ListingLevelReturnPolicies) null, false);
    }
}
