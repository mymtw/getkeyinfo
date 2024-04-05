package com.etsy.android.p327ui.cardview.clickhandlers;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.vespa.UserAction;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.vespa.VespaBottomSheetDialog;
import p415of.C13171a;

/* renamed from: com.etsy.android.ui.cardview.clickhandlers.i */
public final class C9124i extends C13171a<UserAction> {

    /* renamed from: d */
    public final /* synthetic */ ListingLike f20053d;

    /* renamed from: e */
    public final /* synthetic */ VespaBottomSheetDialog f20054e;

    /* renamed from: f */
    public final /* synthetic */ C9125j f20055f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9124i(C9125j jVar, Fragment fragment, C8703p pVar, ListingCard listingCard, VespaBottomSheetDialog vespaBottomSheetDialog) {
        super(fragment, pVar);
        this.f20055f = jVar;
        this.f20053d = listingCard;
        this.f20054e = vespaBottomSheetDialog;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31328c(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.etsy.android.lib.models.apiv3.vespa.UserAction r1 = (com.etsy.android.lib.models.apiv3.vespa.UserAction) r1
            java.lang.String r1 = r1.getType()
            r1.getClass()
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -871352833: goto L_0x0046;
                case 109400031: goto L_0x003b;
                case 164437572: goto L_0x0030;
                case 712393337: goto L_0x0025;
                case 1834514514: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0051
        L_0x001a:
            java.lang.String r2 = "goto_shop"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0023
            goto L_0x0051
        L_0x0023:
            r1 = r4
            goto L_0x0052
        L_0x0025:
            java.lang.String r2 = "report_listing"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002e
            goto L_0x0051
        L_0x002e:
            r1 = r5
            goto L_0x0052
        L_0x0030:
            java.lang.String r2 = "add_to_list"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0039
            goto L_0x0051
        L_0x0039:
            r1 = r6
            goto L_0x0052
        L_0x003b:
            java.lang.String r2 = "share"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            r1 = r7
            goto L_0x0052
        L_0x0046:
            java.lang.String r2 = "see_similar"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r1 = r3
            goto L_0x0052
        L_0x0051:
            r1 = -1
        L_0x0052:
            r2 = 300(0x12c, float:4.2E-43)
            java.lang.String r8 = "signInAction"
            java.lang.String r9 = "listingId"
            r10 = 0
            if (r1 == 0) goto L_0x01a2
            if (r1 == r7) goto L_0x0186
            if (r1 == r6) goto L_0x0115
            if (r1 == r5) goto L_0x009f
            if (r1 == r4) goto L_0x0065
            goto L_0x01e3
        L_0x0065:
            com.etsy.android.ui.cardview.clickhandlers.j r1 = r0.f20055f
            com.etsy.android.lib.models.interfaces.ListingLike r2 = r0.f20053d
            java.lang.String r3 = "listing_card_action_goto_shop"
            r1.mo31351h(r2, r3)
            com.etsy.android.ui.cardview.clickhandlers.j r1 = r0.f20055f
            com.etsy.android.lib.models.interfaces.ListingLike r2 = r0.f20053d
            if (r2 == 0) goto L_0x009a
            r10 = 0
            r8 = 0
            androidx.fragment.app.Fragment r3 = r1.mo45889a()
            java.lang.String r4 = p356ge.C12790b.m20432d(r3)
            com.etsy.android.lib.models.datatypes.EtsyId r5 = r2.getShopId()
            com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey r2 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 256(0x100, float:3.59E-43)
            r15 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.Fragment r1 = r1.mo45889a()
            p356ge.C12790b.m20430b(r1, r2)
            goto L_0x01e3
        L_0x009a:
            r1.getClass()
            goto L_0x01e3
        L_0x009f:
            com.etsy.android.ui.cardview.clickhandlers.j r1 = r0.f20055f
            com.etsy.android.lib.models.interfaces.ListingLike r3 = r0.f20053d
            java.lang.String r4 = "context_menu_report_listing_tapped"
            r1.mo31351h(r3, r4)
            androidx.fragment.app.Fragment r1 = r1.mo45889a()
            q9.p r4 = p628nj.C18263b.f40057V
            boolean r4 = r4.mo45960e()
            if (r4 == 0) goto L_0x00d6
            java.lang.String r2 = p356ge.C12790b.m20432d(r1)
            java.lang.String r4 = r3.getUrl()
            java.lang.String r5 = "listingUrl"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            com.etsy.android.lib.models.datatypes.EtsyId r3 = r3.getListingId()
            java.lang.String r3 = r3.getId()
            kotlin.jvm.internal.C19383o.m32797g(r3, r9)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ReportListingKey r5 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ReportListingKey
            r5.<init>(r2, r3, r4)
            p356ge.C12790b.m20430b(r1, r5)
            goto L_0x01e3
        L_0x00d6:
            if (r1 == 0) goto L_0x01e3
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            com.etsy.android.lib.models.datatypes.EtsyId r4 = r3.getListingId()
            java.lang.String r4 = r4.getId()
            java.lang.String r5 = "listing_id"
            r14.putString(r5, r4)
            java.lang.String r3 = r3.getUrl()
            java.lang.String r4 = "url"
            r14.putString(r4, r3)
            r15 = 0
            com.etsy.android.lib.deeplinks.EtsyAction$a r3 = com.etsy.android.lib.deeplinks.EtsyAction.Companion
            java.lang.String r12 = p356ge.C12790b.m20432d(r1)
            com.etsy.android.lib.deeplinks.EtsyAction r13 = com.etsy.android.lib.deeplinks.EtsyAction.REPORT_LISTING
            kotlin.jvm.internal.C19383o.m32797g(r13, r8)
            ie.h r3 = new ie.h
            r16 = 0
            r17 = 0
            r18 = 32
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            ie.i r4 = new ie.i
            r4.<init>((p370ie.C12948h) r3, (androidx.fragment.app.Fragment) r10, (int) r2)
            p356ge.C12790b.m20430b(r1, r4)
            goto L_0x01e3
        L_0x0115:
            com.etsy.android.ui.cardview.clickhandlers.j r1 = r0.f20055f
            com.etsy.android.lib.models.interfaces.ListingLike r4 = r0.f20053d
            androidx.fragment.app.Fragment r5 = r1.mo45889a()
            if (r4 == 0) goto L_0x01e3
            if (r5 != 0) goto L_0x0123
            goto L_0x01e3
        L_0x0123:
            java.lang.String r6 = "listing_card_action_add_to_list"
            r1.mo31351h(r4, r6)
            q9.p r1 = p628nj.C18263b.f40057V
            boolean r1 = r1.mo45960e()
            if (r1 != 0) goto L_0x0179
            com.etsy.android.uikit.nav.transactions.a r1 = new com.etsy.android.uikit.nav.transactions.a
            r1.<init>()
            java.lang.String r3 = "listing"
            r1.mo38349f(r3, r4)
            kotlin.c<com.etsy.android.uikit.nav.transactions.TransactionDataRepository> r3 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.f26402b
            com.etsy.android.uikit.nav.transactions.TransactionDataRepository r3 = com.etsy.android.uikit.nav.transactions.TransactionDataRepository.C11867a.m19552a()
            int r1 = r3.mo38343b(r1)
            r15 = 0
            com.etsy.android.lib.deeplinks.EtsyAction$a r3 = com.etsy.android.lib.deeplinks.EtsyAction.Companion
            java.lang.String r12 = p356ge.C12790b.m20432d(r5)
            com.etsy.android.lib.deeplinks.EtsyAction r13 = com.etsy.android.lib.deeplinks.EtsyAction.MANAGE_ITEM_COLLECTIONS
            kotlin.jvm.internal.C19383o.m32797g(r13, r8)
            he.f r3 = new he.f
            r3.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.LinkedHashMap r4 = r3.f28304a
            java.lang.String r6 = "transaction-data"
            r4.put(r6, r1)
            android.os.Bundle r14 = r3.mo45608a()
            ie.h r1 = new ie.h
            r16 = 0
            r17 = 0
            r18 = 32
            r11 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            ie.i r3 = new ie.i
            r3.<init>((p370ie.C12948h) r1, (androidx.fragment.app.Fragment) r10, (int) r2)
            p356ge.C12790b.m20430b(r5, r3)
            goto L_0x01e3
        L_0x0179:
            java.lang.String r1 = p356ge.C12790b.m20432d(r5)
            com.etsy.android.ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey r2 = new com.etsy.android.ui.navigation.keys.bottomsheetkeys.AddToListBottomSheetKey
            r2.<init>(r1, r4, r3)
            p356ge.C12790b.m20430b(r5, r2)
            goto L_0x01e3
        L_0x0186:
            com.etsy.android.ui.cardview.clickhandlers.j r1 = r0.f20055f
            com.etsy.android.lib.models.interfaces.ListingLike r2 = r0.f20053d
            androidx.fragment.app.Fragment r3 = r1.mo45889a()
            if (r3 != 0) goto L_0x0191
            goto L_0x01e3
        L_0x0191:
            java.lang.String r4 = "listing_card_action_share"
            r1.mo31351h(r2, r4)
            android.content.Context r1 = r3.requireContext()
            java.lang.String r2 = r2.getUrl()
            androidx.compose.p015ui.text.input.C1993m.m4365Z(r1, r2)
            goto L_0x01e3
        L_0x01a2:
            com.etsy.android.ui.cardview.clickhandlers.j r1 = r0.f20055f
            com.etsy.android.lib.models.interfaces.ListingLike r2 = r0.f20053d
            java.lang.String r3 = "listing_card_action_see_similar"
            r1.mo31351h(r2, r3)
            com.etsy.android.ui.cardview.clickhandlers.j r1 = r0.f20055f
            com.etsy.android.lib.models.interfaces.ListingLike r2 = r0.f20053d
            androidx.fragment.app.Fragment r1 = r1.mo45889a()
            if (r1 != 0) goto L_0x01b6
            goto L_0x01e3
        L_0x01b6:
            wb.g r3 = new wb.g
            r3.<init>()
            android.content.res.Resources r4 = r1.getResources()
            com.etsy.android.lib.models.datatypes.EtsyId r2 = r2.getListingId()
            java.lang.String r2 = r2.getId()
            kotlin.jvm.internal.C19383o.m32797g(r2, r9)
            r5 = 10
            com.etsy.android.lib.models.homescreen.LandingPageLink r13 = p472wb.C13810g.m21365a(r3, r4, r10, r2, r5)
            java.lang.String r12 = p356ge.C12790b.m20432d(r1)
            com.etsy.android.ui.navigation.keys.fragmentkeys.SimilarListingsKey r2 = new com.etsy.android.ui.navigation.keys.fragmentkeys.SimilarListingsKey
            r14 = 0
            r15 = 0
            r16 = 8
            r17 = 0
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            p356ge.C12790b.m20430b(r1, r2)
        L_0x01e3:
            com.etsy.android.vespa.VespaBottomSheetDialog r1 = r0.f20054e
            r1.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cardview.clickhandlers.C9124i.mo31328c(java.lang.Object):void");
    }
}
