package com.etsy.android.p327ui.listing.p329ui.morefromshop.handlers;

import com.etsy.android.p327ui.core.C9623k;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.morefromshop.handlers.TrackMoreFromShopAnalyticsHandler */
public final class TrackMoreFromShopAnalyticsHandler {

    /* renamed from: a */
    public final C13573c f22929a;

    /* renamed from: b */
    public final C9623k f22930b;

    public TrackMoreFromShopAnalyticsHandler(C13573c cVar, C9623k kVar) {
        C19383o.m32797g(cVar, "listingEventDispatcher");
        C19383o.m32797g(kVar, "moreFromShopTracking");
        this.f22929a = cVar;
        this.f22930b = kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.f22840a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p466vc.C13574d mo33991a(com.etsy.android.p327ui.listing.ListingViewState.C10092d r12) {
        /*
            r11 = this;
            com.etsy.android.ui.listing.ui.f r0 = r12.f22238f
            com.etsy.android.ui.listing.ui.f$b r0 = r0.f22807j
            r1 = 1
            if (r0 == 0) goto L_0x000e
            sd.a r0 = r0.f22840a
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.f29299a
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            if (r0 != 0) goto L_0x0102
            vc.c r0 = r11.f22929a
            com.etsy.android.ui.core.k r2 = r11.f22930b
            long r3 = r12.mo33477f()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            com.etsy.android.ui.listing.ui.f r4 = r12.f22238f
            com.etsy.android.ui.listing.ui.f$b r4 = r4.f22807j
            r5 = 0
            if (r4 == 0) goto L_0x005c
            java.util.List<com.etsy.android.ui.listing.ui.morefromshop.row.c> r4 = r4.f22841b
            if (r4 == 0) goto L_0x005c
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0031:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x005d
            java.lang.Object r7 = r4.next()
            com.etsy.android.ui.listing.ui.morefromshop.row.c r7 = (com.etsy.android.p327ui.listing.p329ui.morefromshop.row.C10455c) r7
            r8 = 2
            java.lang.Long[] r8 = new java.lang.Long[r8]
            com.etsy.android.ui.listing.ui.morefromshop.row.a r9 = r7.f22954a
            long r9 = r9.f22939a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r5] = r9
            com.etsy.android.ui.listing.ui.morefromshop.row.a r7 = r7.f22955b
            long r9 = r7.f22939a
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r8[r1] = r7
            java.util.List r7 = p568fn.C17782b.m29865e0(r8)
            kotlin.collections.C19324q.m32628J0(r7, r6)
            goto L_0x0031
        L_0x005c:
            r6 = 0
        L_0x005d:
            com.etsy.android.lib.models.apiv3.listing.ListingFetch r4 = r12.f22239g
            java.util.Map r4 = r4.getMmxRequestUuidMap()
            r2.getClass()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r7 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.MODULE_PLACEMENT
            java.lang.String r8 = "boe_related_listings"
            r2.put(r7, r8)
            if (r3 == 0) goto L_0x0081
            long r7 = r3.longValue()
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r3 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.TARGET_LISTING_ID
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r2.put(r3, r7)
        L_0x0081:
            if (r6 == 0) goto L_0x0088
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r3 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.LISTING_IDS
            r2.put(r3, r6)
        L_0x0088:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r6 == 0) goto L_0x0094
            int r6 = r6.size()
            goto L_0x0095
        L_0x0094:
            r6 = r5
        L_0x0095:
            if (r4 == 0) goto L_0x00e5
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x009f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x00e5
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r9 = r7.getValue()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x00ba:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d6
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r5 >= r6) goto L_0x00ba
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r8.add(r10)
            int r5 = r5 + 1
            goto L_0x00ba
        L_0x00d6:
            boolean r9 = r8.isEmpty()
            r9 = r9 ^ r1
            if (r9 == 0) goto L_0x009f
            java.lang.Object r7 = r7.getKey()
            r3.put(r7, r8)
            goto L_0x009f
        L_0x00e5:
            boolean r4 = r3.isEmpty()
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x00f1
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r1 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.MMX_REQUEST_UUID_MAP
            r2.put(r1, r3)
        L_0x00f1:
            vc.g$f r1 = new vc.g$f
            java.lang.String r3 = "recommendations_module_seen"
            r1.<init>(r3, r2)
            r0.mo38043a(r1)
            com.etsy.android.ui.listing.ui.morefromshop.handlers.TrackMoreFromShopAnalyticsHandler$handle$2 r0 = com.etsy.android.p327ui.listing.p329ui.morefromshop.handlers.TrackMoreFromShopAnalyticsHandler$handle$2.INSTANCE
            vc.d$c r12 = androidx.compose.foundation.layout.C0761x.m1709a1(r12, r0)
            return r12
        L_0x0102:
            vc.d$a r12 = p466vc.C13574d.C13575a.f29662a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.morefromshop.handlers.TrackMoreFromShopAnalyticsHandler.mo33991a(com.etsy.android.ui.listing.ListingViewState$d):vc.d");
    }
}
