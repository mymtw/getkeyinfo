package p444se;

import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12741o;

/* renamed from: se.c */
public final class C13377c implements C12729e {

    /* renamed from: a */
    public final C12741o f29302a;

    /* renamed from: b */
    public final C13375a f29303b;

    public C13377c(C12741o oVar, C13375a aVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(aVar, "shopDeepLinkInspector");
        this.f29302a = oVar;
        this.f29303b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0061  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p350fe.C12731g mo30554a(p350fe.C12730f r15) {
        /*
            r14 = this;
            android.net.Uri r0 = r15.f28049b
            java.lang.String r2 = r15.f28050c
            android.os.Bundle r11 = r15.f28051d
            java.lang.String r15 = "source_type"
            java.lang.String r15 = r11.getString(r15)
            se.a r1 = r14.f29303b
            boolean r15 = r1.mo46057a(r0, r15)
            r1 = 0
            if (r15 == 0) goto L_0x006d
            fe.o r15 = r14.f29302a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP
            java.lang.String r3 = r3.getEntityName()
            java.lang.String r7 = r15.mo45510e(r0, r3)
            fe.o r15 = r14.f29302a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_ABOUT
            java.lang.String r3 = r3.getEntityName()
            boolean r15 = r15.mo45509b(r0, r3)
            if (r15 == 0) goto L_0x0032
            com.etsy.android.ui.shop.ShopHomeConfig r15 = com.etsy.android.p327ui.shop.ShopHomeConfig.ABOUT
            goto L_0x0042
        L_0x0032:
            fe.o r15 = r14.f29302a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_POLICY
            java.lang.String r3 = r3.getEntityName()
            boolean r15 = r15.mo45509b(r0, r3)
            if (r15 == 0) goto L_0x0044
            com.etsy.android.ui.shop.ShopHomeConfig r15 = com.etsy.android.p327ui.shop.ShopHomeConfig.POLICIES
        L_0x0042:
            r4 = r15
            goto L_0x0045
        L_0x0044:
            r4 = r1
        L_0x0045:
            boolean r15 = p628nj.C18263b.m30839d0(r7)
            if (r15 == 0) goto L_0x0061
            com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey r15 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 474(0x1da, float:6.64E-43)
            r13 = 0
            r1 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r15)
            goto L_0x00d4
        L_0x0061:
            fe.g$a r15 = new fe.g$a
            java.lang.String r1 = "Invalid shop name "
            java.lang.String r0 = android.support.p013v4.media.C0073e.m206f(r1, r0)
            r15.<init>(r0)
            goto L_0x00d3
        L_0x006d:
            fe.o r15 = r14.f29302a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP
            java.lang.String r3 = r3.getEntityName()
            java.lang.String r15 = r15.mo45510e(r0, r3)
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r3 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            r3.<init>()
            fe.o r4 = r14.f29302a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r5 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_ABOUT
            java.lang.String r5 = r5.getEntityName()
            boolean r4 = r4.mo45509b(r0, r5)
            if (r4 == 0) goto L_0x008f
            com.etsy.android.ui.shop.ShopHomeConfig r1 = com.etsy.android.p327ui.shop.ShopHomeConfig.ABOUT
            goto L_0x009f
        L_0x008f:
            fe.o r4 = r14.f29302a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r5 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_POLICY
            java.lang.String r5 = r5.getEntityName()
            boolean r4 = r4.mo45509b(r0, r5)
            if (r4 == 0) goto L_0x009f
            com.etsy.android.ui.shop.ShopHomeConfig r1 = com.etsy.android.p327ui.shop.ShopHomeConfig.POLICIES
        L_0x009f:
            r4 = r1
            boolean r1 = p628nj.C18263b.m30839d0(r15)
            if (r1 == 0) goto L_0x00c8
            r3.checkIdTypeAndSet(r15)
            com.etsy.android.lib.models.datatypes.EtsyId r15 = new com.etsy.android.lib.models.datatypes.EtsyId
            java.lang.String r0 = r3.getId()
            r15.<init>((java.lang.String) r0)
            com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey r0 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ShopHomeKey
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 504(0x1f8, float:7.06E-43)
            r13 = 0
            r1 = r0
            r3 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            fe.g$b r15 = new fe.g$b
            r15.<init>(r0)
            goto L_0x00d3
        L_0x00c8:
            fe.g$a r15 = new fe.g$a
            java.lang.String r1 = "Invalid shop id "
            java.lang.String r0 = android.support.p013v4.media.C0073e.m206f(r1, r0)
            r15.<init>(r0)
        L_0x00d3:
            r0 = r15
        L_0x00d4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p444se.C13377c.mo30554a(fe.f):fe.g");
    }
}
