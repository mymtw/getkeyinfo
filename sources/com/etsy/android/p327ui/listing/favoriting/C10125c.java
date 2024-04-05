package com.etsy.android.p327ui.listing.favoriting;

import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.favoriting.c */
public final class C10125c {

    /* renamed from: a */
    public final C13573c f22287a;

    public C10125c(C13573c cVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        this.f22287a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x006b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d.C13575a mo33525a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r10, p466vc.C13597g.C13654i r11) {
        /*
            r9 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r11 = r11.f30146a
            r0 = 0
            if (r11 == 0) goto L_0x000f
            java.lang.Long r11 = kotlin.text.C19456j.m33017U0(r11)
            goto L_0x0010
        L_0x000f:
            r11 = r0
        L_0x0010:
            long r1 = r10.mo33477f()
            r3 = 0
            if (r11 != 0) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            long r4 = r11.longValue()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x002c
            vc.c r10 = r9.f22287a
            vc.g$j r11 = new vc.g$j
            r11.<init>(r3)
            r10.mo38043a(r11)
            goto L_0x00c9
        L_0x002c:
            com.etsy.android.ui.listing.ui.f r10 = r10.f22238f
            com.etsy.android.ui.listing.ui.f$b r10 = r10.f22807j
            if (r10 == 0) goto L_0x00c9
            java.util.List<com.etsy.android.ui.listing.ui.morefromshop.row.c> r10 = r10.f22841b
            if (r10 == 0) goto L_0x00c9
            java.util.Iterator r10 = r10.iterator()
        L_0x003a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r10.next()
            r2 = r1
            com.etsy.android.ui.listing.ui.morefromshop.row.c r2 = (com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c) r2
            com.etsy.android.ui.listing.ui.morefromshop.row.a r4 = r2.f22954a
            long r4 = r4.f22939a
            if (r11 != 0) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            long r6 = r11.longValue()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0068
        L_0x0056:
            com.etsy.android.ui.listing.ui.morefromshop.row.a r2 = r2.f22955b
            long r4 = r2.f22939a
            if (r11 != 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            long r6 = r11.longValue()
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r2 = r3
            goto L_0x0069
        L_0x0068:
            r2 = 1
        L_0x0069:
            if (r2 == 0) goto L_0x003a
            r0 = r1
        L_0x006c:
            com.etsy.android.ui.listing.ui.morefromshop.row.c r0 = (com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c) r0
            if (r0 == 0) goto L_0x00c9
            com.etsy.android.ui.listing.ui.morefromshop.row.a r10 = r0.f22954a
            long r1 = r10.f22939a
            if (r11 != 0) goto L_0x0077
            goto L_0x009d
        L_0x0077:
            long r3 = r11.longValue()
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x009d
            vc.c r10 = r9.f22287a
            vc.g$h r8 = new vc.g$h
            long r2 = r11.longValue()
            com.etsy.android.ui.listing.ui.morefromshop.row.a r11 = r0.f22954a
            boolean r6 = r11.mo33999b()
            com.etsy.android.ui.listing.ui.morefromshop.row.a r11 = r0.f22954a
            com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike r4 = r11.mo33998a()
            r5 = 0
            r7 = 0
            r1 = r8
            r1.<init>(r2, r4, r5, r6, r7)
            r10.mo38043a(r8)
            goto L_0x00c9
        L_0x009d:
            com.etsy.android.ui.listing.ui.morefromshop.row.a r10 = r0.f22955b
            long r1 = r10.f22939a
            if (r11 != 0) goto L_0x00a4
            goto L_0x00c9
        L_0x00a4:
            long r3 = r11.longValue()
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x00c9
            vc.c r10 = r9.f22287a
            vc.g$h r8 = new vc.g$h
            long r2 = r11.longValue()
            com.etsy.android.ui.listing.ui.morefromshop.row.a r11 = r0.f22955b
            boolean r6 = r11.mo33999b()
            com.etsy.android.ui.listing.ui.morefromshop.row.a r11 = r0.f22955b
            com.etsy.android.lib.models.apiv3.listing.LightWeightListingLike r4 = r11.mo33998a()
            r5 = 0
            r7 = 0
            r1 = r8
            r1.<init>(r2, r4, r5, r6, r7)
            r10.mo38043a(r8)
        L_0x00c9:
            vc.d$a r10 = p466vc.C13574d.C13575a.f29662a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.favoriting.C10125c.mo33525a(com.etsy.android.ui.listing.ListingViewState$d, vc.g$i):vc.d$a");
    }
}
