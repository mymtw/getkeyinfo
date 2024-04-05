package com.etsy.android.p327ui.listing.p329ui;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.listing.p329ui.C10409f;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10207g;
import com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10208h;
import com.etsy.android.p327ui.listing.p329ui.buybox.estimateddelivery.C10253a;
import com.etsy.android.p327ui.listing.p329ui.footer.C10417a;
import com.etsy.android.p327ui.listing.p329ui.listingpromotion.C10447a;
import com.etsy.android.p327ui.listing.p329ui.productwarninginfo.C10621a;
import com.etsy.android.p327ui.listing.p329ui.sellerinfo.C10635b;
import com.etsy.android.p327ui.listing.p329ui.shop.shopheader.C10644a;
import com.etsy.android.p327ui.listing.p329ui.toppanel.C10658e;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p413od.C13154a;
import p437rd.C13354a;
import p459ud.C13473a;
import p467vd.C13782c;
import p467vd.C13783d;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.g */
public final class C10419g {

    /* renamed from: a */
    public C13783d f22860a;

    /* renamed from: b */
    public C10658e f22861b;

    /* renamed from: c */
    public C10409f.C10415d f22862c;

    /* renamed from: d */
    public C13354a f22863d;

    /* renamed from: e */
    public C10409f.C10410a f22864e;

    /* renamed from: f */
    public C10409f.C10413c f22865f;

    /* renamed from: g */
    public C10253a f22866g;

    /* renamed from: h */
    public C10635b f22867h;

    /* renamed from: i */
    public C10447a f22868i;

    /* renamed from: j */
    public C10409f.C10412b f22869j;

    /* renamed from: k */
    public C13473a f22870k;

    /* renamed from: l */
    public C10621a f22871l;

    /* renamed from: m */
    public C10417a f22872m;

    /* renamed from: n */
    public final C13782c f22873n;

    /* renamed from: o */
    public C10208h f22874o;

    /* renamed from: p */
    public C13154a f22875p;

    /* renamed from: q */
    public C10207g f22876q;

    /* renamed from: com.etsy.android.ui.listing.ui.g$a */
    public static final class C10420a {

        /* renamed from: a */
        public C10644a f22877a;

        public C10420a() {
            this((C10644a) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C10420a) && C19383o.m32792b(this.f22877a, ((C10420a) obj).f22877a);
        }

        public final int hashCode() {
            C10644a aVar = this.f22877a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ShopBuilder(shopHeader=");
            h.append(this.f22877a);
            h.append(')');
            return h.toString();
        }

        public C10420a(C10644a aVar) {
            this.f22877a = aVar;
        }
    }

    public C10419g(C10409f fVar) {
        C10409f fVar2 = fVar;
        C13783d dVar = fVar2.f22798a;
        C10658e eVar = fVar2.f22800c;
        C10409f.C10415d dVar2 = fVar2.f22799b;
        C13354a aVar = fVar2.f22801d;
        C10409f.C10410a aVar2 = fVar2.f22802e;
        C10409f.C10413c cVar = fVar2.f22803f;
        C10253a aVar3 = fVar2.f22804g;
        C10635b bVar = fVar2.f22805h;
        C10447a aVar4 = fVar2.f22806i;
        C13473a aVar5 = fVar2.f22808k;
        C10409f.C10412b bVar2 = fVar2.f22807j;
        C10621a aVar6 = fVar2.f22809l;
        C10417a aVar7 = fVar2.f22810m;
        C13782c cVar2 = fVar2.f22811n;
        C10417a aVar8 = aVar7;
        C10208h hVar = fVar2.f22813p;
        C13154a aVar9 = fVar2.f22814q;
        C10207g gVar = fVar2.f22815r;
        C19383o.m32797g(eVar, "topPanel");
        C19383o.m32797g(dVar2, ResponseConstants.SHOP);
        C19383o.m32797g(aVar2, "buyBox");
        C19383o.m32797g(cVar, "panels");
        C19383o.m32797g(aVar5, "recommendations");
        C19383o.m32797g(cVar2, "spaces");
        this.f22860a = dVar;
        this.f22861b = eVar;
        this.f22862c = dVar2;
        this.f22863d = aVar;
        this.f22864e = aVar2;
        this.f22865f = cVar;
        this.f22866g = aVar3;
        this.f22867h = bVar;
        this.f22868i = aVar4;
        this.f22869j = bVar2;
        this.f22870k = aVar5;
        this.f22871l = aVar6;
        this.f22872m = aVar8;
        this.f22873n = cVar2;
        this.f22874o = hVar;
        this.f22875p = aVar9;
        this.f22876q = gVar;
    }

    /* renamed from: a */
    public final void mo33961a(C19857l<? super C10194a, C19394m> lVar) {
        C10208h hVar;
        C19383o.m32797g(lVar, "lambda");
        C10208h hVar2 = this.f22874o;
        if (hVar2 != null) {
            C10194a aVar = new C10194a(hVar2);
            lVar.invoke(aVar);
            hVar = new C10208h(aVar.f22367a, aVar.f22368b, aVar.f22369c, aVar.f22370d, aVar.f22371e, aVar.f22372f, aVar.f22373g, aVar.f22374h);
        } else {
            C10194a aVar2 = new C10194a(new C10208h(0));
            lVar.invoke(aVar2);
            hVar = new C10208h(aVar2.f22367a, aVar2.f22368b, aVar2.f22369c, aVar2.f22370d, aVar2.f22371e, aVar2.f22372f, aVar2.f22373g, aVar2.f22374h);
        }
        this.f22874o = hVar;
    }

    /* renamed from: b */
    public final void mo33962b(C19857l<? super C10195b, C19394m> lVar) {
        C19857l<? super C10195b, C19394m> lVar2 = lVar;
        C19383o.m32797g(lVar2, "lambda");
        C10195b bVar = new C10195b(this.f22864e);
        lVar2.invoke(bVar);
        this.f22864e = new C10409f.C10410a(bVar.f22375a, bVar.f22377c, bVar.f22378d, bVar.f22379e, bVar.f22380f, bVar.f22381g, bVar.f22382h, bVar.f22383i, bVar.f22384j, bVar.f22385k, bVar.f22386l, bVar.f22387m, bVar.f22388n, bVar.f22389o, bVar.f22390p, bVar.f22391q, bVar.f22392r, bVar.f22393s, bVar.f22394t, bVar.f22376b, bVar.f22395u, bVar.f22396v);
    }

    /* renamed from: c */
    public final void mo33963c(C19857l<? super C10448m, C19394m> lVar) {
        C10409f.C10412b bVar;
        C19383o.m32797g(lVar, "lambda");
        C10409f.C10412b bVar2 = this.f22869j;
        if (bVar2 != null) {
            C10448m mVar = new C10448m(bVar2.f22840a, bVar2.f22841b, bVar2.f22842c);
            lVar.invoke(mVar);
            bVar = new C10409f.C10412b(mVar.f22922a, mVar.f22923b, mVar.f22924c);
        } else {
            bVar = null;
        }
        this.f22869j = bVar;
    }

    /* renamed from: d */
    public final void mo33964d(C19857l<? super C10625r, C19394m> lVar) {
        C19383o.m32797g(lVar, "lambda");
        C10625r rVar = new C10625r(this.f22865f);
        lVar.invoke(rVar);
        this.f22865f = new C10409f.C10413c(rVar.f23317a, rVar.f23318b, rVar.f23319c, rVar.f23320d, rVar.f23321e, rVar.f23322f);
    }

    /* renamed from: e */
    public final void mo33965e(C19857l<? super C10666y, C19394m> lVar) {
        C10666y yVar = new C10666y(this.f22861b);
        lVar.invoke(yVar);
        this.f22861b = new C10658e(yVar.f23486a, yVar.f23487b, yVar.f23488c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10419g)) {
            return false;
        }
        C10419g gVar = (C10419g) obj;
        return C19383o.m32792b(this.f22860a, gVar.f22860a) && C19383o.m32792b(this.f22861b, gVar.f22861b) && C19383o.m32792b(this.f22862c, gVar.f22862c) && C19383o.m32792b(this.f22863d, gVar.f22863d) && C19383o.m32792b(this.f22864e, gVar.f22864e) && C19383o.m32792b(this.f22865f, gVar.f22865f) && C19383o.m32792b(this.f22866g, gVar.f22866g) && C19383o.m32792b(this.f22867h, gVar.f22867h) && C19383o.m32792b(this.f22868i, gVar.f22868i) && C19383o.m32792b(this.f22869j, gVar.f22869j) && C19383o.m32792b(this.f22870k, gVar.f22870k) && C19383o.m32792b(this.f22871l, gVar.f22871l) && C19383o.m32792b(this.f22872m, gVar.f22872m) && C19383o.m32792b(this.f22873n, gVar.f22873n) && C19383o.m32792b(this.f22874o, gVar.f22874o) && C19383o.m32792b(this.f22875p, gVar.f22875p) && C19383o.m32792b(this.f22876q, gVar.f22876q);
    }

    public final int hashCode() {
        C13783d dVar = this.f22860a;
        int i = 0;
        int hashCode = (this.f22862c.hashCode() + ((this.f22861b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31)) * 31;
        C13354a aVar = this.f22863d;
        int hashCode2 = (this.f22865f.hashCode() + ((this.f22864e.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31;
        C10253a aVar2 = this.f22866g;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C10635b bVar = this.f22867h;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C10447a aVar3 = this.f22868i;
        int hashCode5 = (hashCode4 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        C10409f.C10412b bVar2 = this.f22869j;
        int hashCode6 = (this.f22870k.hashCode() + ((hashCode5 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31)) * 31;
        C10621a aVar4 = this.f22871l;
        int hashCode7 = (hashCode6 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        C10417a aVar5 = this.f22872m;
        int hashCode8 = (this.f22873n.hashCode() + ((hashCode7 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31)) * 31;
        C10208h hVar = this.f22874o;
        int hashCode9 = (hashCode8 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        C13154a aVar6 = this.f22875p;
        int hashCode10 = (hashCode9 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        C10207g gVar = this.f22876q;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ListingUiBuilder(topSpace=");
        h.append(this.f22860a);
        h.append(", topPanel=");
        h.append(this.f22861b);
        h.append(", shop=");
        h.append(this.f22862c);
        h.append(", images=");
        h.append(this.f22863d);
        h.append(", buyBox=");
        h.append(this.f22864e);
        h.append(", panels=");
        h.append(this.f22865f);
        h.append(", estimatedDelivery=");
        h.append(this.f22866g);
        h.append(", sellerInfo=");
        h.append(this.f22867h);
        h.append(", listingPromotion=");
        h.append(this.f22868i);
        h.append(", moreFromShop=");
        h.append(this.f22869j);
        h.append(", recommendations=");
        h.append(this.f22870k);
        h.append(", productWarningInfo=");
        h.append(this.f22871l);
        h.append(", footer=");
        h.append(this.f22872m);
        h.append(", spaces=");
        h.append(this.f22873n);
        h.append(", bottomSheetContent=");
        h.append(this.f22874o);
        h.append(", variationSelectionBottomSheet=");
        h.append(this.f22875p);
        h.append(", addToCartInterstitial=");
        h.append(this.f22876q);
        h.append(')');
        return h.toString();
    }
}
