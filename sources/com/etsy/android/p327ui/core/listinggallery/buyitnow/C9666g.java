package com.etsy.android.p327ui.core.listinggallery.buyitnow;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption;
import com.etsy.android.lib.models.apiv3.listing.ListingFetch;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.listing.ListingPersonalization;
import com.etsy.android.lib.models.apiv3.listing.Variation;
import com.etsy.android.lib.models.apiv3.listing.VariationValue;
import com.etsy.android.p327ui.core.listinggallery.C9680e;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b;
import com.etsy.android.util.C12059p;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p145io.reactivex.disposables.C7091a;

/* renamed from: com.etsy.android.ui.core.listinggallery.buyitnow.g */
public final class C9666g extends C2866i0 {

    /* renamed from: b */
    public final C0005b f21409b;

    /* renamed from: c */
    public final C9647a f21410c;

    /* renamed from: d */
    public final C2895z<C9649b> f21411d;

    /* renamed from: e */
    public final C2895z f21412e;

    /* renamed from: f */
    public final C2895z<C12059p<C9655c>> f21413f;

    /* renamed from: g */
    public final C2895z f21414g;

    /* renamed from: h */
    public final C7091a f21415h = new C7091a();

    /* renamed from: i */
    public C9680e f21416i;

    /* renamed from: j */
    public Map<Long, ListingImage> f21417j = C19294b0.m32559p0();

    /* renamed from: k */
    public List<AppsInventoryUiOption> f21418k;

    /* renamed from: l */
    public List<Pair<Variation, VariationValue>> f21419l;

    /* renamed from: m */
    public String f21420m;

    public C9666g(C0005b bVar, C9647a aVar) {
        this.f21409b = bVar;
        this.f21410c = aVar;
        C2895z<C9649b> zVar = new C2895z<>();
        zVar.setValue(C9649b.C9653d.f21372a);
        this.f21411d = zVar;
        this.f21412e = zVar;
        C2895z<C12059p<C9655c>> zVar2 = new C2895z<>();
        this.f21413f = zVar2;
        this.f21414g = zVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32383b() {
        /*
            r8 = this;
            androidx.lifecycle.z<com.etsy.android.ui.core.listinggallery.buyitnow.b> r0 = r8.f21411d
            com.etsy.android.ui.core.listinggallery.buyitnow.b$b r1 = com.etsy.android.p327ui.core.listinggallery.buyitnow.C9649b.C9651b.f21370a
            r0.setValue(r1)
            androidx.lifecycle.z<com.etsy.android.util.p<com.etsy.android.ui.core.listinggallery.buyitnow.c>> r0 = r8.f21413f
            com.etsy.android.util.p r1 = new com.etsy.android.util.p
            com.etsy.android.ui.core.listinggallery.buyitnow.c$a r2 = com.etsy.android.p327ui.core.listinggallery.buyitnow.C9655c.C9656a.f21374a
            r1.<init>(r2)
            r0.setValue(r1)
            com.etsy.android.ui.core.listinggallery.buyitnow.a r0 = r8.f21410c
            com.etsy.android.ui.core.listinggallery.e r1 = r8.f21416i
            kotlin.jvm.internal.C19383o.m32794d(r1)
            java.util.List<com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption> r2 = r8.f21418k
            r0.getClass()
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r3 = r1.f21442c
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x003e
            if (r2 == 0) goto L_0x0030
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r3 = 0
            goto L_0x0031
        L_0x0030:
            r3 = r5
        L_0x0031:
            if (r3 == 0) goto L_0x003e
            com.etsy.android.ui.core.listinggallery.buyitnow.a$a r0 = new com.etsy.android.ui.core.listinggallery.buyitnow.a$a
            r0.<init>(r4)
            io.reactivex.internal.operators.single.i r0 = p248tp.C8071s.m16251e(r0)
            goto L_0x00ba
        L_0x003e:
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r3 = r1.f21442c
            if (r3 == 0) goto L_0x0051
            com.etsy.android.lib.models.apiv3.listing.InventoryProductOffering r3 = r3.getOffering()
            if (r3 == 0) goto L_0x0051
            long r6 = r3.getOfferingId()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            goto L_0x0052
        L_0x0051:
            r3 = r4
        L_0x0052:
            boolean r3 = com.google.android.play.core.assetpacks.C15588c1.m25348t0(r3)
            if (r3 == 0) goto L_0x0064
            com.etsy.android.ui.core.listinggallery.buyitnow.a$a r0 = new com.etsy.android.ui.core.listinggallery.buyitnow.a$a
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r1 = r1.f21442c
            r0.<init>(r1)
            io.reactivex.internal.operators.single.i r0 = p248tp.C8071s.m16251e(r0)
            goto L_0x00ba
        L_0x0064:
            if (r2 == 0) goto L_0x008e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x008d
            java.lang.Object r6 = r2.next()
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r6 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) r6
            java.lang.Long r6 = r6.getValue()
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = r6.toString()
            goto L_0x0087
        L_0x0086:
            r6 = r4
        L_0x0087:
            if (r6 == 0) goto L_0x006f
            r3.add(r6)
            goto L_0x006f
        L_0x008d:
            r4 = r3
        L_0x008e:
            if (r4 != 0) goto L_0x0092
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
        L_0x0092:
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r1 = r1.f21440a
            if (r1 == 0) goto L_0x00ca
            cc.c r2 = r0.f21366a
            com.etsy.android.lib.models.apiv3.listing.Listing r1 = r1.getListing()
            long r6 = r1.getListingId()
            io.reactivex.internal.operators.single.l r1 = r2.mo21085a(r6, r4, r5)
            com.etsy.android.lib.useraction.c r2 = new com.etsy.android.lib.useraction.c
            r2.<init>(r5)
            io.reactivex.internal.operators.single.j r3 = new io.reactivex.internal.operators.single.j
            r3.<init>(r1, r2)
            ua.f r1 = r0.f21367b
            io.reactivex.internal.operators.single.SingleSubscribeOn r1 = androidx.appcompat.widget.C0326j.m860e(r1, r3)
            ua.f r0 = r0.f21367b
            io.reactivex.internal.operators.single.SingleObserveOn r0 = androidx.compose.animation.C0391c.m1056b(r0, r1)
        L_0x00ba:
            com.etsy.android.ui.m r1 = new com.etsy.android.ui.m
            r2 = 3
            r1.<init>(r8, r2)
            q9.n r2 = new q9.n
            r3 = 2
            r2.<init>(r8, r3)
            r0.mo20658g(r1, r2)
            return
        L_0x00ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ListingFetch must not be null in listingState when calling BuyItNowAPIUseCase.resolveAppsInventoryAddToCartContext()"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.listinggallery.buyitnow.C9666g.mo32383b():void");
    }

    /* renamed from: c */
    public final boolean mo32384c() {
        ListingFetch listingFetch;
        ListingPersonalization personalization;
        C9680e eVar = this.f21416i;
        if (eVar == null || (listingFetch = eVar.f21440a) == null || (personalization = listingFetch.getPersonalization()) == null) {
            return false;
        }
        Boolean isPersonalizable = personalization.isPersonalizable();
        Boolean bool = Boolean.TRUE;
        return C19383o.m32792b(isPersonalizable, bool) && C19383o.m32792b(personalization.isRequired(), bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.f21440a;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32385d() {
        /*
            r11 = this;
            r0 = 0
            r11.f21420m = r0
            com.etsy.android.ui.core.listinggallery.e r1 = r11.f21416i
            if (r1 == 0) goto L_0x0010
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r1 = r1.f21440a
            if (r1 == 0) goto L_0x0010
            com.etsy.android.lib.models.apiv3.listing.ListingPersonalization r1 = r1.getPersonalization()
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0024
            java.lang.String r3 = r1.getPersonalizationInstructions()
            if (r3 == 0) goto L_0x0024
            java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
            if (r3 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r3
            goto L_0x0025
        L_0x0024:
            r5 = r2
        L_0x0025:
            r3 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.Boolean r4 = r1.isPersonalizable()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r6)
            r7 = r4
            goto L_0x0035
        L_0x0034:
            r7 = r3
        L_0x0035:
            if (r1 == 0) goto L_0x0041
            java.lang.Boolean r3 = r1.isRequired()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r4)
        L_0x0041:
            r9 = r3
            if (r1 == 0) goto L_0x004f
            java.lang.Integer r1 = r1.getBuyerPersonalizationCharCountMax()
            if (r1 == 0) goto L_0x004f
            int r1 = r1.intValue()
            goto L_0x0051
        L_0x004f:
            r1 = 256(0x100, float:3.59E-43)
        L_0x0051:
            r8 = r1
            androidx.lifecycle.z<com.etsy.android.util.p<com.etsy.android.ui.core.listinggallery.buyitnow.c>> r1 = r11.f21413f
            com.etsy.android.util.p r3 = new com.etsy.android.util.p
            com.etsy.android.ui.core.listinggallery.buyitnow.c$g r10 = new com.etsy.android.ui.core.listinggallery.buyitnow.c$g
            com.etsy.android.ui.core.listinggallery.e r4 = r11.f21416i
            if (r4 == 0) goto L_0x005e
            java.lang.String r0 = r4.f21443d
        L_0x005e:
            if (r0 != 0) goto L_0x0062
            r6 = r2
            goto L_0x0063
        L_0x0062:
            r6 = r0
        L_0x0063:
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r3.<init>(r10)
            r1.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.core.listinggallery.buyitnow.C9666g.mo32385d():void");
    }

    public final void onCleared() {
        super.onCleared();
        this.f21415h.mo19405d();
    }
}
