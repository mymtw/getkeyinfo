package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.bottombuybuttoms.C10196a;
import com.etsy.android.p327ui.listing.p329ui.buybox.cartbutton.C10225a;
import com.etsy.android.p327ui.listing.p329ui.buybox.freeshipping.C10258a;
import com.etsy.android.p327ui.listing.p329ui.buybox.klarna.C10260a;
import com.etsy.android.p327ui.listing.p329ui.buybox.lottienudge.C10266c;
import com.etsy.android.p327ui.listing.p329ui.buybox.quantity.C10299a;
import com.etsy.android.p327ui.listing.p329ui.buybox.shopname.C10304a;
import com.etsy.android.p327ui.listing.p329ui.buybox.signal.ListingSignalColumns;
import com.etsy.android.p327ui.listing.p329ui.buybox.stockindicator.StockIndicator;
import com.etsy.android.p327ui.listing.p329ui.buybox.termsandconditions.C10307a;
import com.etsy.android.p327ui.listing.p329ui.buybox.title.C10313d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p362hd.C12812a;
import p382kd.C12992a;
import p398md.C13048a;
import p406nd.C13111a;
import p421pd.C13217a;
import p467vd.C13782c;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.b */
public final class C10195b {

    /* renamed from: a */
    public C10313d f22375a;

    /* renamed from: b */
    public C10304a f22376b;

    /* renamed from: c */
    public StockIndicator f22377c;

    /* renamed from: d */
    public C10423j f22378d;

    /* renamed from: e */
    public C12992a f22379e;

    /* renamed from: f */
    public C13111a f22380f;

    /* renamed from: g */
    public C13217a f22381g;

    /* renamed from: h */
    public C13048a f22382h;

    /* renamed from: i */
    public C10423j f22383i;

    /* renamed from: j */
    public C10423j f22384j;

    /* renamed from: k */
    public C10260a f22385k;

    /* renamed from: l */
    public C10258a f22386l;

    /* renamed from: m */
    public C10299a f22387m;

    /* renamed from: n */
    public C10423j f22388n;

    /* renamed from: o */
    public C10423j f22389o;

    /* renamed from: p */
    public C10225a f22390p;

    /* renamed from: q */
    public C10307a f22391q;

    /* renamed from: r */
    public C12812a f22392r;

    /* renamed from: s */
    public C10266c f22393s;

    /* renamed from: t */
    public final C13782c f22394t;

    /* renamed from: u */
    public ListingSignalColumns f22395u;

    /* renamed from: v */
    public C10196a f22396v;

    public C10195b(C10409f.C10410a aVar) {
        C10409f.C10410a aVar2 = aVar;
        C19383o.m32797g(aVar2, "buyBox");
        C10313d dVar = aVar2.f22816a;
        C10304a aVar3 = aVar2.f22836u;
        StockIndicator stockIndicator = aVar2.f22817b;
        C10423j jVar = aVar2.f22818c;
        C12992a aVar4 = aVar2.f22819d;
        C13111a aVar5 = aVar2.f22820e;
        C13217a aVar6 = aVar2.f22821f;
        C13048a aVar7 = aVar2.f22822g;
        C10423j jVar2 = aVar2.f22823h;
        C10423j jVar3 = aVar2.f22824i;
        C10260a aVar8 = aVar2.f22825j;
        C10258a aVar9 = aVar2.f22826k;
        C10299a aVar10 = aVar2.f22828m;
        C10423j jVar4 = aVar2.f22829n;
        C10423j jVar5 = aVar2.f22830o;
        C10225a aVar11 = aVar2.f22831p;
        C10307a aVar12 = aVar2.f22832q;
        C12812a aVar13 = aVar2.f22833r;
        C10266c cVar = aVar2.f22834s;
        C13782c cVar2 = aVar2.f22835t;
        C10299a aVar14 = aVar10;
        ListingSignalColumns listingSignalColumns = aVar2.f22837v;
        C10196a aVar15 = aVar2.f22838w;
        C19383o.m32797g(dVar, "title");
        C19383o.m32797g(aVar3, "shopName");
        C19383o.m32797g(cVar2, "spaces");
        C19383o.m32797g(listingSignalColumns, "listingSignalColumns");
        this.f22375a = dVar;
        this.f22376b = aVar3;
        this.f22377c = stockIndicator;
        this.f22378d = jVar;
        this.f22379e = aVar4;
        this.f22380f = aVar5;
        this.f22381g = aVar6;
        this.f22382h = aVar7;
        this.f22383i = jVar2;
        this.f22384j = jVar3;
        this.f22385k = aVar8;
        this.f22386l = aVar9;
        this.f22387m = aVar14;
        this.f22388n = jVar4;
        this.f22389o = jVar5;
        this.f22390p = aVar11;
        this.f22391q = aVar12;
        this.f22392r = aVar13;
        this.f22393s = cVar;
        this.f22394t = cVar2;
        this.f22395u = listingSignalColumns;
        this.f22396v = aVar15;
    }

    /* renamed from: a */
    public final void mo33565a(C19857l<? super C10665x, C19394m> lVar) {
        C10665x xVar = new C10665x(this.f22375a);
        lVar.invoke(xVar);
        this.f22375a = new C10313d(xVar.f23483a, xVar.f23484b, xVar.f23485c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10195b)) {
            return false;
        }
        C10195b bVar = (C10195b) obj;
        return C19383o.m32792b(this.f22375a, bVar.f22375a) && C19383o.m32792b(this.f22376b, bVar.f22376b) && C19383o.m32792b(this.f22377c, bVar.f22377c) && C19383o.m32792b(this.f22378d, bVar.f22378d) && C19383o.m32792b(this.f22379e, bVar.f22379e) && C19383o.m32792b(this.f22380f, bVar.f22380f) && C19383o.m32792b(this.f22381g, bVar.f22381g) && C19383o.m32792b(this.f22382h, bVar.f22382h) && C19383o.m32792b(this.f22383i, bVar.f22383i) && C19383o.m32792b(this.f22384j, bVar.f22384j) && C19383o.m32792b(this.f22385k, bVar.f22385k) && C19383o.m32792b(this.f22386l, bVar.f22386l) && C19383o.m32792b(this.f22387m, bVar.f22387m) && C19383o.m32792b(this.f22388n, bVar.f22388n) && C19383o.m32792b(this.f22389o, bVar.f22389o) && C19383o.m32792b(this.f22390p, bVar.f22390p) && C19383o.m32792b(this.f22391q, bVar.f22391q) && C19383o.m32792b(this.f22392r, bVar.f22392r) && C19383o.m32792b(this.f22393s, bVar.f22393s) && C19383o.m32792b(this.f22394t, bVar.f22394t) && C19383o.m32792b(this.f22395u, bVar.f22395u) && C19383o.m32792b(this.f22396v, bVar.f22396v);
    }

    public final int hashCode() {
        int hashCode = (this.f22376b.hashCode() + (this.f22375a.hashCode() * 31)) * 31;
        StockIndicator stockIndicator = this.f22377c;
        int i = 0;
        int hashCode2 = (hashCode + (stockIndicator == null ? 0 : stockIndicator.hashCode())) * 31;
        C10423j jVar = this.f22378d;
        int hashCode3 = (hashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        C12992a aVar = this.f22379e;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C13111a aVar2 = this.f22380f;
        int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C13217a aVar3 = this.f22381g;
        int hashCode6 = (hashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        C13048a aVar4 = this.f22382h;
        int hashCode7 = (hashCode6 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        C10423j jVar2 = this.f22383i;
        int hashCode8 = (hashCode7 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
        C10423j jVar3 = this.f22384j;
        int hashCode9 = (hashCode8 + (jVar3 == null ? 0 : jVar3.hashCode())) * 31;
        C10260a aVar5 = this.f22385k;
        int hashCode10 = (hashCode9 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        C10258a aVar6 = this.f22386l;
        int hashCode11 = (hashCode10 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        C10299a aVar7 = this.f22387m;
        int hashCode12 = (hashCode11 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        C10423j jVar4 = this.f22388n;
        int hashCode13 = (hashCode12 + (jVar4 == null ? 0 : jVar4.hashCode())) * 31;
        C10423j jVar5 = this.f22389o;
        int hashCode14 = (hashCode13 + (jVar5 == null ? 0 : jVar5.hashCode())) * 31;
        C10225a aVar8 = this.f22390p;
        int hashCode15 = (hashCode14 + (aVar8 == null ? 0 : aVar8.hashCode())) * 31;
        C10307a aVar9 = this.f22391q;
        int hashCode16 = (hashCode15 + (aVar9 == null ? 0 : aVar9.hashCode())) * 31;
        C12812a aVar10 = this.f22392r;
        int hashCode17 = (hashCode16 + (aVar10 == null ? 0 : aVar10.hashCode())) * 31;
        C10266c cVar = this.f22393s;
        int hashCode18 = (this.f22395u.hashCode() + ((this.f22394t.hashCode() + ((hashCode17 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31)) * 31;
        C10196a aVar11 = this.f22396v;
        if (aVar11 != null) {
            i = aVar11.hashCode();
        }
        return hashCode18 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BuyBoxBuilder(title=");
        h.append(this.f22375a);
        h.append(", shopName=");
        h.append(this.f22376b);
        h.append(", stockIndicator=");
        h.append(this.f22377c);
        h.append(", price=");
        h.append(this.f22378d);
        h.append(", saleEndingSoonBadge=");
        h.append(this.f22379e);
        h.append(", unitPricing=");
        h.append(this.f22380f);
        h.append(", vatTaxDescription=");
        h.append(this.f22381g);
        h.append(", transparentPricing=");
        h.append(this.f22382h);
        h.append(", firstVariation=");
        h.append(this.f22383i);
        h.append(", secondVariation=");
        h.append(this.f22384j);
        h.append(", klarnaInfo=");
        h.append(this.f22385k);
        h.append(", freeShipping=");
        h.append(this.f22386l);
        h.append(", quantity=");
        h.append(this.f22387m);
        h.append(", personalization=");
        h.append(this.f22388n);
        h.append(", expressCheckout=");
        h.append(this.f22389o);
        h.append(", cartButton=");
        h.append(this.f22390p);
        h.append(", termsAndConditions=");
        h.append(this.f22391q);
        h.append(", ineligibleShipping=");
        h.append(this.f22392r);
        h.append(", lottieNudge=");
        h.append(this.f22393s);
        h.append(", spaces=");
        h.append(this.f22394t);
        h.append(", listingSignalColumns=");
        h.append(this.f22395u);
        h.append(", horizontalBuyButtons=");
        h.append(this.f22396v);
        h.append(')');
        return h.toString();
    }
}
