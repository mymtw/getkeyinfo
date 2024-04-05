package com.etsy.android.p327ui.cart.saveforlater;

import kotlin.jvm.internal.C19383o;
import p488yb.C13898a;

/* renamed from: com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository */
public final class SaveForLaterRepository {

    /* renamed from: a */
    public final C9354b f20633a;

    /* renamed from: b */
    public final C13898a f20634b;

    public SaveForLaterRepository(C9354b bVar, C13898a aVar) {
        C19383o.m32797g(bVar, "endpoint");
        C19383o.m32797g(aVar, "networkMapper");
        this.f20633a = bVar;
        this.f20634b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057 A[Catch:{ Exception -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo31768a(kotlin.coroutines.C19340c<? super com.etsy.android.p327ui.cart.saveforlater.C9355c> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.etsy.android.p327ui.cart.saveforlater.SaveForLaterRepository$getSaveForLater$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository$getSaveForLater$1 r0 = (com.etsy.android.p327ui.cart.saveforlater.SaveForLaterRepository$getSaveForLater$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository$getSaveForLater$1 r0 = new com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository$getSaveForLater$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.L$0
            com.etsy.android.ui.cart.saveforlater.SaveForLaterRepository r0 = (com.etsy.android.p327ui.cart.saveforlater.SaveForLaterRepository) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)     // Catch:{ Exception -> 0x007d }
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            com.etsy.android.ui.cart.saveforlater.b r5 = r4.f20633a     // Catch:{ Exception -> 0x007d }
            r0.L$0 = r4     // Catch:{ Exception -> 0x007d }
            r0.label = r3     // Catch:{ Exception -> 0x007d }
            java.lang.Object r5 = r5.mo31770a(r3, r0)     // Catch:{ Exception -> 0x007d }
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r4
        L_0x0044:
            retrofit2.v r5 = (retrofit2.C20145v) r5     // Catch:{ Exception -> 0x007d }
            boolean r1 = r5.mo74384a()     // Catch:{ Exception -> 0x007d }
            if (r1 != 0) goto L_0x0057
            com.etsy.android.ui.cart.saveforlater.c$a r0 = new com.etsy.android.ui.cart.saveforlater.c$a     // Catch:{ Exception -> 0x007d }
            retrofit2.HttpException r1 = new retrofit2.HttpException     // Catch:{ Exception -> 0x007d }
            r1.<init>(r5)     // Catch:{ Exception -> 0x007d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x007d }
            return r0
        L_0x0057:
            T r5 = r5.f44615b     // Catch:{ Exception -> 0x007d }
            okhttp3.a0 r5 = (okhttp3.C19928a0) r5     // Catch:{ Exception -> 0x007d }
            if (r5 == 0) goto L_0x0068
            byte[] r5 = r5.mo72841a()     // Catch:{ Exception -> 0x007d }
            java.lang.Class<com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterCartResponse> r1 = com.etsy.android.p327ui.cart.saveforlater.models.network.SaveForLaterCartResponse.class
            java.lang.Object r5 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r5, r1)     // Catch:{ Exception -> 0x007d }
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            kotlin.jvm.internal.C19383o.m32794d(r5)     // Catch:{ Exception -> 0x007d }
            com.etsy.android.ui.cart.saveforlater.models.network.SaveForLaterCartResponse r5 = (com.etsy.android.p327ui.cart.saveforlater.models.network.SaveForLaterCartResponse) r5     // Catch:{ Exception -> 0x007d }
            yb.a r0 = r0.f20634b     // Catch:{ Exception -> 0x007d }
            r0.getClass()     // Catch:{ Exception -> 0x007d }
            zb.a r5 = p488yb.C13898a.m21421a(r5)     // Catch:{ Exception -> 0x007d }
            com.etsy.android.ui.cart.saveforlater.c$b r0 = new com.etsy.android.ui.cart.saveforlater.c$b     // Catch:{ Exception -> 0x007d }
            r0.<init>(r5)     // Catch:{ Exception -> 0x007d }
            return r0
        L_0x007d:
            r5 = move-exception
            com.etsy.android.ui.cart.saveforlater.c$a r0 = new com.etsy.android.ui.cart.saveforlater.c$a
            r0.<init>(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.saveforlater.SaveForLaterRepository.mo31768a(kotlin.coroutines.c):java.lang.Object");
    }
}
