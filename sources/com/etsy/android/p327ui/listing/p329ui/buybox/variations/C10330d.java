package com.etsy.android.p327ui.listing.p329ui.buybox.variations;

import kotlin.jvm.internal.C19383o;
import p369id.C12932a;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.d */
public final class C10330d {

    /* renamed from: a */
    public final C13573c f22670a;

    /* renamed from: b */
    public final C12932a f22671b;

    /* renamed from: c */
    public final C10331e f22672c;

    public C10330d(C13573c cVar, C12932a aVar, C10331e eVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(aVar, "personalizationInputValidator");
        C19383o.m32797g(eVar, "variationSelectionValidator");
        this.f22670a = cVar;
        this.f22671b = aVar;
        this.f22672c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r1.length() > r8.f22587c) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001d, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (r1.length() > r8.f22601c) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d7 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d.C13575a mo33706a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r8, p466vc.C13597g.C13688m5 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            com.etsy.android.ui.listing.ui.buybox.variations.e r0 = r7.f22672c
            java.lang.Long r1 = r8.mo33479h()
            com.etsy.android.ui.listing.ui.f r2 = r8.f22238f
            com.etsy.android.ui.listing.ui.f$a r2 = r2.f22802e
            com.etsy.android.ui.listing.ui.j r3 = r2.f22823h
            com.etsy.android.ui.listing.ui.j r2 = r2.f22824i
            r0.getClass()
            boolean r0 = r3 instanceof com.etsy.android.p327ui.listing.p329ui.buybox.variations.inventoryui.C10334a
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0020
            if (r1 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0020:
            boolean r0 = r3 instanceof com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10349a
            if (r0 == 0) goto L_0x0044
            com.etsy.android.ui.listing.ui.buybox.variations.listing.a r3 = (com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10349a) r3
            boolean r0 = r2 instanceof com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10350b
            if (r0 == 0) goto L_0x002d
            com.etsy.android.ui.listing.ui.buybox.variations.listing.b r2 = (com.etsy.android.p327ui.listing.p329ui.buybox.variations.listing.C10350b) r2
            goto L_0x002e
        L_0x002d:
            r2 = r4
        L_0x002e:
            if (r3 == 0) goto L_0x003b
            if (r2 == 0) goto L_0x003b
            com.etsy.android.lib.models.apiv3.listing.VariationValue r0 = r3.f22710b
            if (r0 == 0) goto L_0x0042
            com.etsy.android.lib.models.apiv3.listing.VariationValue r0 = r2.f22713b
            if (r0 == 0) goto L_0x0042
            goto L_0x0044
        L_0x003b:
            if (r3 == 0) goto L_0x0044
            com.etsy.android.lib.models.apiv3.listing.VariationValue r0 = r3.f22710b
            if (r0 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = r6
            goto L_0x0045
        L_0x0044:
            r0 = r5
        L_0x0045:
            if (r0 != 0) goto L_0x0052
            boolean r1 = r9.f30190c
            if (r1 == 0) goto L_0x0052
            vc.c r1 = r7.f22670a
            vc.g$c4 r2 = p466vc.C13597g.C13617c4.f30091a
            r1.mo38043a(r2)
        L_0x0052:
            id.a r1 = r7.f22671b
            com.etsy.android.ui.listing.ui.f r8 = r8.f22238f
            com.etsy.android.ui.listing.ui.f$a r8 = r8.f22802e
            com.etsy.android.ui.listing.ui.j r8 = r8.f22829n
            r1.getClass()
            boolean r1 = r8 instanceof com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a
            r2 = 2131952457(0x7f130349, float:1.9541357E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x0077
            com.etsy.android.ui.listing.ui.buybox.personalization.optional.a r8 = (com.etsy.android.p327ui.listing.p329ui.buybox.personalization.optional.C10279a) r8
            java.lang.String r1 = r8.f22589e
            if (r1 == 0) goto L_0x009e
            int r1 = r1.length()
            int r8 = r8.f22587c
            if (r1 <= r8) goto L_0x009e
            goto L_0x009d
        L_0x0077:
            boolean r1 = r8 instanceof com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a
            if (r1 == 0) goto L_0x009e
            com.etsy.android.ui.listing.ui.buybox.personalization.required.a r8 = (com.etsy.android.p327ui.listing.p329ui.buybox.personalization.required.C10285a) r8
            java.lang.String r1 = r8.f22603e
            if (r1 == 0) goto L_0x008a
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r3 = r6
            goto L_0x008b
        L_0x008a:
            r3 = r5
        L_0x008b:
            if (r3 == 0) goto L_0x0095
            r8 = 2131952459(0x7f13034b, float:1.9541361E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            goto L_0x009e
        L_0x0095:
            int r1 = r1.length()
            int r8 = r8.f22601c
            if (r1 <= r8) goto L_0x009e
        L_0x009d:
            r4 = r2
        L_0x009e:
            if (r4 == 0) goto L_0x00b2
            boolean r8 = r9.f30190c
            if (r8 == 0) goto L_0x00b2
            vc.c r8 = r7.f22670a
            vc.g$z3 r1 = new vc.g$z3
            int r2 = r4.intValue()
            r1.<init>(r2)
            r8.mo38043a(r1)
        L_0x00b2:
            if (r0 == 0) goto L_0x00b7
            if (r4 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r5 = r6
        L_0x00b8:
            if (r5 == 0) goto L_0x00c2
            vc.c r8 = r7.f22670a
            vc.b r1 = r9.f30188a
            r8.mo38043a(r1)
            goto L_0x00c9
        L_0x00c2:
            vc.c r8 = r7.f22670a
            vc.g$c0 r1 = p466vc.C13597g.C13613c0.f30086a
            r8.mo38043a(r1)
        L_0x00c9:
            if (r0 != 0) goto L_0x00d7
            boolean r8 = r9.f30190c
            if (r8 == 0) goto L_0x00d7
            vc.c r8 = r7.f22670a
            vc.g$m3 r9 = p466vc.C13597g.C13686m3.f30186a
            r8.mo38043a(r9)
            goto L_0x00e4
        L_0x00d7:
            if (r4 == 0) goto L_0x00e4
            boolean r8 = r9.f30190c
            if (r8 == 0) goto L_0x00e4
            vc.c r8 = r7.f22670a
            vc.g$k3 r9 = p466vc.C13597g.C13672k3.f30166a
            r8.mo38043a(r9)
        L_0x00e4:
            vc.d$a r8 = p466vc.C13574d.C13575a.f29662a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.variations.C10330d.mo33706a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$m5):vc.d$a");
    }
}
