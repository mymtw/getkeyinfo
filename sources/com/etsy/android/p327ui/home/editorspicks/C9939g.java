package com.etsy.android.p327ui.home.editorspicks;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.p327ui.cardview.clickhandlers.C9119d;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.cardview.clickhandlers.C9126k;
import com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.viewholder.C12008t;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p415of.C13172b;
import p415of.C13179h;
import p415of.C13180i;
import p425q9.C13265p;
import p442sc.C13371a;
import p442sc.C13372b;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.home.editorspicks.g */
public final class C9939g extends C13172b {

    /* renamed from: j */
    public final C12724a f21896j;

    /* renamed from: k */
    public final C12741o f21897k;

    /* renamed from: l */
    public final C12008t f21898l;

    /* renamed from: m */
    public final ListingCardViewHolderOptions.C11968b f21899m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9939g(C13179h hVar, C11780h hVar2, C13461f fVar, C13265p pVar, C8267e eVar, C12796e eVar2, C12724a aVar, C12741o oVar) {
        super(hVar);
        C19383o.m32797g(hVar2, "favoriteRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(eVar, "adImpressionRepository");
        C19383o.m32797g(eVar2, "listingImagesFetcher");
        C19383o.m32797g(aVar, "deepLinkEligibility");
        C19383o.m32797g(oVar, "routeInspector");
        this.f21896j = aVar;
        this.f21897k = oVar;
        FragmentActivity requireActivity = hVar.f29013a.requireActivity();
        C19383o.m32796f(requireActivity, "dependencies.fragment.requireActivity()");
        C8703p pVar2 = hVar.f29014b;
        C8623e eVar3 = pVar2.f19116n;
        C19383o.m32796f(eVar3, "dependencies.analyticsContext.configMap");
        this.f21898l = new C12008t(requireActivity, pVar2, eVar3, pVar, eVar2);
        int dimensionPixelSize = hVar.f29013a.getResources().getDimensionPixelSize(R.dimen.clg_space_4);
        C8623e eVar4 = hVar.f29014b.f19116n;
        C19383o.m32796f(eVar4, "dependencies.analyticsContext.configMap");
        this.f21899m = new ListingCardViewHolderOptions.C11968b(dimensionPixelSize, eVar4);
        Fragment d = mo45892d();
        C8703p pVar3 = this.f28983b;
        C19383o.m32796f(pVar3, "mViewTracker");
        C13372b bVar = new C13372b(d, pVar3);
        this.f28982a.mo19994h(R.id.view_type_finds_category, bVar);
        this.f28982a.mo19994h(R.id.view_type_finds_two_titled_footer, bVar);
        C9125j jVar = new C9125j(mo45892d(), this.f28987f, this.f28983b, (C9126k.C9128b) null, eVar);
        this.f28982a.mo19994h(R.id.view_type_listing_card, jVar);
        this.f28982a.mo19994h(R.id.view_type_finds_two_titled_listing, jVar);
        this.f28982a.mo19994h(R.id.view_type_finds_hero_listing, jVar);
        Fragment d2 = mo45892d();
        C8703p pVar4 = this.f28983b;
        C19383o.m32796f(pVar4, "mViewTracker");
        this.f28982a.mo19994h(R.id.view_type_shop_card, new ShopCardClickHandler(d2, pVar4, hVar2, fVar));
        C9119d dVar = new C9119d(mo45892d(), this.f28983b);
        this.f28982a.mo19994h(R.id.view_type_finds_card, dVar);
        this.f28982a.mo19994h(R.id.view_type_finds_card_small, dVar);
        this.f28982a.mo19994h(R.id.view_type_finds_hero_banner, dVar);
        Fragment d3 = mo45892d();
        C8703p pVar5 = this.f28983b;
        C19383o.m32796f(pVar5, "mViewTracker");
        this.f28982a.mo19994h(R.id.view_type_finds_hero_carousel, new C13371a(d3, pVar5));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.etsy.android.ui.cardview.clickhandlers.ShopCardClickHandler} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.etsy.android.ui.cardview.clickhandlers.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.etsy.android.ui.cardview.clickhandlers.d} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.etsy.android.ui.cardview.viewholders.l1] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.etsy.android.ui.cardview.viewholders.s] */
    /* JADX WARNING: type inference failed for: r0v9, types: [com.etsy.android.ui.cardview.viewholders.u] */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.etsy.android.ui.home.editorspicks.viewholder.g] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r12 = new com.etsy.android.p327ui.home.editorspicks.viewholder.C9943b(r11);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.etsy.android.vespa.viewholders.C12086e<?> mo31854b(android.view.ViewGroup r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            r0 = 2131430429(0x7f0b0c1d, float:1.8482559E38)
            if (r12 == r0) goto L_0x00eb
            r0 = 2131430481(0x7f0b0c51, float:1.8482664E38)
            r1 = 0
            if (r12 == r0) goto L_0x00ca
            r0 = 2131430553(0x7f0b0c99, float:1.848281E38)
            r2 = 0
            if (r12 == r0) goto L_0x00b7
            java.lang.String r0 = "null cannot be cast to non-null type com.etsy.android.ui.home.editorspicks.handler.EditorsPicksUrlClickHandler"
            switch(r12) {
                case 2131430441: goto L_0x0066;
                case 2131430442: goto L_0x0052;
                case 2131430443: goto L_0x0040;
                case 2131430444: goto L_0x002e;
                case 2131430445: goto L_0x0027;
                case 2131430446: goto L_0x007a;
                default: goto L_0x001b;
            }
        L_0x001b:
            switch(r12) {
                case 2131430448: goto L_0x00a5;
                case 2131430449: goto L_0x0092;
                case 2131430450: goto L_0x00ca;
                case 2131430451: goto L_0x0081;
                case 2131430452: goto L_0x007a;
                case 2131430453: goto L_0x00ca;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r12) {
                case 2131430549: goto L_0x00b1;
                case 2131430550: goto L_0x00ab;
                default: goto L_0x0021;
            }
        L_0x0021:
            com.etsy.android.vespa.viewholders.e r2 = super.mo31854b(r11, r12)
            goto L_0x00f1
        L_0x0027:
            com.etsy.android.ui.cardview.viewholders.b0 r12 = new com.etsy.android.ui.cardview.viewholders.b0
            r12.<init>(r11)
            goto L_0x00f0
        L_0x002e:
            com.etsy.android.ui.cardview.viewholders.k r12 = new com.etsy.android.ui.cardview.viewholders.k
            com.etsy.android.lib.logger.p r0 = r10.f28983b
            java.lang.String r1 = "mViewTracker"
            kotlin.jvm.internal.C19383o.m32796f(r0, r1)
            fe.o r1 = r10.f21897k
            fe.a r2 = r10.f21896j
            r12.<init>(r11, r0, r1, r2)
            goto L_0x00f0
        L_0x0040:
            com.etsy.android.ui.home.editorspicks.viewholder.a r2 = new com.etsy.android.ui.home.editorspicks.viewholder.a
            o.j<of.a> r3 = r10.f28982a
            java.lang.Object r12 = r3.mo19993f(r12, r1)
            kotlin.jvm.internal.C19383o.m32795e(r12, r0)
            sc.b r12 = (p442sc.C13372b) r12
            r2.<init>(r11, r12)
            goto L_0x00f1
        L_0x0052:
            com.etsy.android.ui.cardview.viewholders.u r0 = new com.etsy.android.ui.cardview.viewholders.u
            o.j<of.a> r2 = r10.f28982a
            java.lang.Object r12 = r2.mo19993f(r12, r1)
            boolean r2 = r12 instanceof com.etsy.android.p327ui.cardview.clickhandlers.C9119d
            if (r2 == 0) goto L_0x0061
            r1 = r12
            com.etsy.android.ui.cardview.clickhandlers.d r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9119d) r1
        L_0x0061:
            r0.<init>(r11, r1)
            goto L_0x00e9
        L_0x0066:
            com.etsy.android.ui.cardview.viewholders.s r0 = new com.etsy.android.ui.cardview.viewholders.s
            o.j<of.a> r3 = r10.f28982a
            java.lang.Object r12 = r3.mo19993f(r12, r1)
            boolean r3 = r12 instanceof com.etsy.android.p327ui.cardview.clickhandlers.C9119d
            if (r3 == 0) goto L_0x0075
            r1 = r12
            com.etsy.android.ui.cardview.clickhandlers.d r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9119d) r1
        L_0x0075:
            r0.<init>(r11, r1, r2)
            goto L_0x00e9
        L_0x007a:
            com.etsy.android.ui.home.editorspicks.viewholder.b r12 = new com.etsy.android.ui.home.editorspicks.viewholder.b
            r12.<init>(r11)
            goto L_0x00f0
        L_0x0081:
            com.etsy.android.ui.home.editorspicks.viewholder.h r2 = new com.etsy.android.ui.home.editorspicks.viewholder.h
            o.j<of.a> r3 = r10.f28982a
            java.lang.Object r12 = r3.mo19993f(r12, r1)
            kotlin.jvm.internal.C19383o.m32795e(r12, r0)
            sc.b r12 = (p442sc.C13372b) r12
            r2.<init>(r11, r12)
            goto L_0x00f1
        L_0x0092:
            com.etsy.android.ui.home.editorspicks.viewholder.g r0 = new com.etsy.android.ui.home.editorspicks.viewholder.g
            o.j<of.a> r2 = r10.f28982a
            java.lang.Object r12 = r2.mo19993f(r12, r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.etsy.android.ui.home.editorspicks.handler.EditorsPicksHeroEventHandler"
            kotlin.jvm.internal.C19383o.m32795e(r12, r1)
            sc.a r12 = (p442sc.C13371a) r12
            r0.<init>(r11, r12)
            goto L_0x00e9
        L_0x00a5:
            com.etsy.android.ui.home.editorspicks.viewholder.c r12 = new com.etsy.android.ui.home.editorspicks.viewholder.c
            r12.<init>(r11)
            goto L_0x00f0
        L_0x00ab:
            com.etsy.android.ui.cardview.viewholders.c0 r12 = new com.etsy.android.ui.cardview.viewholders.c0
            r12.<init>(r11)
            goto L_0x00f0
        L_0x00b1:
            com.etsy.android.vespa.viewholders.u r12 = new com.etsy.android.vespa.viewholders.u
            r12.<init>(r11)
            goto L_0x00f0
        L_0x00b7:
            com.etsy.android.ui.cardview.viewholders.l1 r0 = new com.etsy.android.ui.cardview.viewholders.l1
            o.j<of.a> r3 = r10.f28982a
            java.lang.Object r12 = r3.mo19993f(r12, r1)
            boolean r3 = r12 instanceof com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler
            if (r3 == 0) goto L_0x00c6
            r1 = r12
            com.etsy.android.ui.cardview.clickhandlers.ShopCardClickHandler r1 = (com.etsy.android.p327ui.cardview.clickhandlers.ShopCardClickHandler) r1
        L_0x00c6:
            r0.<init>(r11, r1, r2)
            goto L_0x00e9
        L_0x00ca:
            com.etsy.android.uikit.viewholder.ListingCardViewHolder r0 = new com.etsy.android.uikit.viewholder.ListingCardViewHolder
            o.j<of.a> r2 = r10.f28982a
            java.lang.Object r12 = r2.mo19993f(r12, r1)
            boolean r2 = r12 instanceof com.etsy.android.p327ui.cardview.clickhandlers.C9125j
            if (r2 == 0) goto L_0x00d9
            r1 = r12
            com.etsy.android.ui.cardview.clickhandlers.j r1 = (com.etsy.android.p327ui.cardview.clickhandlers.C9125j) r1
        L_0x00d9:
            r4 = r1
            r5 = 0
            r6 = 0
            com.etsy.android.uikit.viewholder.t r7 = r10.f21898l
            com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$b r8 = r10.f21899m
            com.etsy.android.uikit.viewholder.s r9 = new com.etsy.android.uikit.viewholder.s
            r9.<init>((android.view.ViewGroup) r11)
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x00e9:
            r2 = r0
            goto L_0x00f1
        L_0x00eb:
            com.etsy.android.vespa.viewholders.t r12 = new com.etsy.android.vespa.viewholders.t
            r12.<init>(r11)
        L_0x00f0:
            r2 = r12
        L_0x00f1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.home.editorspicks.C9939g.mo31854b(android.view.ViewGroup, int):com.etsy.android.vespa.viewholders.e");
    }

    /* renamed from: g */
    public final int mo33127g(int i, int i2) {
        Fragment d = mo45892d();
        int i3 = 0;
        if (d == null) {
            return 0;
        }
        Resources resources = d.requireActivity().getResources();
        int i4 = this.f28990i;
        C13180i iVar = this.f28987f;
        C19383o.m32795e(iVar, "null cannot be cast to non-null type com.etsy.android.ui.home.editorspicks.EditorsPicksAdapter");
        Integer num = (Integer) C19327t.m32641W0(i2, ((C9929d) iVar).f21885i);
        if (num != null) {
            i3 = num.intValue();
        }
        if (i == R.id.view_type_listing_card) {
            int integer = resources.getInteger(R.integer.finds_listing_minimum_in_row);
            return integer != 2 ? integer != 3 ? i4 : i3 % 3 == 0 ? resources.getInteger(R.integer.vespa_grid_item_third_span) : resources.getInteger(R.integer.vespa_grid_item_quarter_span) : i3 % 3 == 0 ? resources.getInteger(R.integer.vespa_grid_item_third_span) : resources.getInteger(R.integer.vespa_grid_item_half_span);
        } else if (i == R.id.view_type_shop_card) {
            return resources.getInteger(R.integer.finds_shop_span);
        } else {
            switch (i) {
                case R.id.view_type_finds_card:
                    return resources.getInteger(R.integer.finds_crosslink_span);
                case R.id.view_type_finds_card_small:
                    return resources.getInteger(R.integer.finds_small_crosslink_span);
                case R.id.view_type_finds_category:
                    return i3 % 3 == 0 ? resources.getInteger(R.integer.finds_large_category_card_span) : resources.getInteger(R.integer.finds_category_card_span);
                default:
                    switch (i) {
                        case R.id.view_type_finds_hero_listing:
                            return resources.getInteger(R.integer.finds_hero_listing_span);
                        case R.id.view_type_finds_two_titled_footer:
                            return resources.getInteger(R.integer.finds_two_titled_heading_span);
                        case R.id.view_type_finds_two_titled_heading:
                            return resources.getInteger(R.integer.finds_two_titled_heading_span);
                        case R.id.view_type_finds_two_titled_listing:
                            return resources.getInteger(R.integer.finds_two_titled_listing_span);
                        default:
                            return i4;
                    }
            }
        }
    }
}
