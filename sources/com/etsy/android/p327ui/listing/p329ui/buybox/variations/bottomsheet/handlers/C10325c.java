package com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers;

import com.etsy.android.p327ui.listing.p329ui.VariationType;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.bottomsheet.handlers.c */
public final class C10325c {

    /* renamed from: a */
    public final C13573c f22666a;

    /* renamed from: com.etsy.android.ui.listing.ui.buybox.variations.bottomsheet.handlers.c$a */
    public /* synthetic */ class C10326a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22667a;

        static {
            int[] iArr = new int[VariationType.values().length];
            iArr[VariationType.VARIATION_FIRST.ordinal()] = 1;
            iArr[VariationType.VARIATION_SECOND.ordinal()] = 2;
            f22667a = iArr;
        }
    }

    public C10325c(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22666a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d.C13575a mo33704a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r7, p466vc.C13597g.C13709p5 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            od.a r0 = r8.f30222a
            od.a$a r1 = r0.f28932c
            boolean r2 = r1 instanceof p413od.C13154a.C13155a.C13156a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004d
            com.etsy.android.ui.listing.ui.VariationType r0 = r0.f28931b
            int[] r2 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers.C10325c.C10326a.f22667a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r5) goto L_0x0036
            if (r0 == r4) goto L_0x001f
            goto L_0x005f
        L_0x001f:
            vc.g$n5 r0 = new vc.g$n5
            vc.g$i5 r2 = new vc.g$i5
            od.a$a$a r1 = (p413od.C13154a.C13155a.C13156a) r1
            java.util.List<com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption> r1 = r1.f28933a
            int r4 = r8.f30223b
            java.lang.Object r1 = r1.get(r4)
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r1 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) r1
            r2.<init>(r1)
            r0.<init>(r2)
            goto L_0x00a3
        L_0x0036:
            vc.g$n5 r0 = new vc.g$n5
            vc.g$d5 r2 = new vc.g$d5
            od.a$a$a r1 = (p413od.C13154a.C13155a.C13156a) r1
            java.util.List<com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption> r1 = r1.f28933a
            int r4 = r8.f30223b
            java.lang.Object r1 = r1.get(r4)
            com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption r1 = (com.etsy.android.lib.models.apiv3.listing.AppsInventoryUiOption) r1
            r2.<init>(r1)
            r0.<init>(r2)
            goto L_0x00a3
        L_0x004d:
            boolean r2 = r1 instanceof p413od.C13154a.C13155a.C13157b
            if (r2 == 0) goto L_0x00c7
            com.etsy.android.ui.listing.ui.VariationType r0 = r0.f28931b
            int[] r2 = com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers.C10325c.C10326a.f22667a
            int r0 = r0.ordinal()
            r0 = r2[r0]
            if (r0 == r5) goto L_0x0082
            if (r0 == r4) goto L_0x0061
        L_0x005f:
            r0 = r3
            goto L_0x00a3
        L_0x0061:
            od.a$a$b r1 = (p413od.C13154a.C13155a.C13157b) r1
            java.util.List<com.etsy.android.lib.models.apiv3.listing.VariationValue> r0 = r1.f28935a
            int r2 = r8.f30223b
            java.lang.Object r0 = r0.get(r2)
            com.etsy.android.lib.models.apiv3.listing.VariationValue r0 = (com.etsy.android.lib.models.apiv3.listing.VariationValue) r0
            vc.g$j5 r2 = new vc.g$j5
            java.util.List<com.etsy.android.lib.models.apiv3.listing.VariationValue> r1 = r1.f28935a
            int r4 = r8.f30223b
            java.lang.Object r1 = r1.get(r4)
            com.etsy.android.lib.models.apiv3.listing.VariationValue r1 = (com.etsy.android.lib.models.apiv3.listing.VariationValue) r1
            r2.<init>(r1)
            vc.g$o5 r1 = new vc.g$o5
            r1.<init>(r2, r0)
            goto L_0x00a2
        L_0x0082:
            od.a$a$b r1 = (p413od.C13154a.C13155a.C13157b) r1
            java.util.List<com.etsy.android.lib.models.apiv3.listing.VariationValue> r0 = r1.f28935a
            int r2 = r8.f30223b
            java.lang.Object r0 = r0.get(r2)
            com.etsy.android.lib.models.apiv3.listing.VariationValue r0 = (com.etsy.android.lib.models.apiv3.listing.VariationValue) r0
            vc.g$e5 r2 = new vc.g$e5
            java.util.List<com.etsy.android.lib.models.apiv3.listing.VariationValue> r1 = r1.f28935a
            int r4 = r8.f30223b
            java.lang.Object r1 = r1.get(r4)
            com.etsy.android.lib.models.apiv3.listing.VariationValue r1 = (com.etsy.android.lib.models.apiv3.listing.VariationValue) r1
            r2.<init>(r1)
            vc.g$o5 r1 = new vc.g$o5
            r1.<init>(r2, r0)
        L_0x00a2:
            r0 = r1
        L_0x00a3:
            if (r0 == 0) goto L_0x00aa
            vc.c r1 = r6.f22666a
            r1.mo38043a(r0)
        L_0x00aa:
            vc.c r0 = r6.f22666a
            vc.g$q5 r1 = new vc.g$q5
            od.a r8 = r8.f30222a
            r1.<init>(r8)
            r0.mo38043a(r1)
            vc.c r8 = r6.f22666a
            vc.g$v0 r0 = new vc.g$v0
            long r1 = r7.mo33477f()
            r0.<init>(r1, r3, r3)
            r8.mo38043a(r0)
            vc.d$a r7 = p466vc.C13574d.C13575a.f29662a
            return r7
        L_0x00c7:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buybox.variations.bottomsheet.handlers.C10325c.mo33704a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$p5):vc.d$a");
    }
}
