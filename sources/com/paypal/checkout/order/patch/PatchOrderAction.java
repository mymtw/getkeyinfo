package com.paypal.checkout.order.patch;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C19928a0;
import okhttp3.C20009t;

public final class PatchOrderAction {
    private final C16708i gson;
    private final CoroutineDispatcher ioDispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    private final PatchOrderRequestFactory patchOrderRequestFactory;
    private final UpgradeLsatTokenAction upgradeLsatTokenAction;

    public PatchOrderAction(PatchOrderRequestFactory patchOrderRequestFactory2, UpgradeLsatTokenAction upgradeLsatTokenAction2, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(patchOrderRequestFactory2, "patchOrderRequestFactory");
        C19383o.m32797g(upgradeLsatTokenAction2, "upgradeLsatTokenAction");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        this.patchOrderRequestFactory = patchOrderRequestFactory2;
        this.upgradeLsatTokenAction = upgradeLsatTokenAction2;
        this.okHttpClient = tVar;
        this.gson = iVar;
        this.ioDispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final PatchErrorResponse getErrorResponse(C19928a0 a0Var) {
        Object e = this.gson.mo59458e(PatchErrorResponse.class, a0Var.mo72844g());
        C19383o.m32796f(e, "gson.fromJson(string(), …rrorResponse::class.java)");
        return (PatchErrorResponse) e;
    }

    /* access modifiers changed from: private */
    public final Object patchOrder(String str, PatchOrderRequest patchOrderRequest, C19340c<? super C19394m> cVar) {
        Object i = C19697g.m33471i(cVar, this.ioDispatcher, new PatchOrderAction$patchOrder$2(this, this.patchOrderRequestFactory.createRequest(str, patchOrderRequest), (C19340c<? super PatchOrderAction$patchOrder$2>) null));
        return i == CoroutineSingletons.COROUTINE_SUSPENDED ? i : C19394m.f43287a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object execute(com.paypal.checkout.order.patch.PatchOrderRequest r6, kotlin.coroutines.C19340c<? super kotlin.C19394m> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.paypal.checkout.order.patch.PatchOrderAction$execute$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.paypal.checkout.order.patch.PatchOrderAction$execute$1 r0 = (com.paypal.checkout.order.patch.PatchOrderAction$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.checkout.order.patch.PatchOrderAction$execute$1 r0 = new com.paypal.checkout.order.patch.PatchOrderAction$execute$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x006b
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.L$1
            com.paypal.checkout.order.patch.PatchOrderRequest r6 = (com.paypal.checkout.order.patch.PatchOrderRequest) r6
            java.lang.Object r2 = r0.L$0
            com.paypal.checkout.order.patch.PatchOrderAction r2 = (com.paypal.checkout.order.patch.PatchOrderAction) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0051
        L_0x003e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction r7 = r5.upgradeLsatTokenAction
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.execute(r0)
            if (r7 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r2 = r5
        L_0x0051:
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse r7 = (com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse) r7
            boolean r4 = r7 instanceof com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Success
            if (r4 == 0) goto L_0x006e
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse$Success r7 = (com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Success) r7
            java.lang.String r7 = r7.getUpgradedAccessToken()
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = r2.patchOrder(r7, r6, r0)
            if (r6 != r1) goto L_0x006b
            return r1
        L_0x006b:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        L_0x006e:
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse$Failed r6 = com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Failed.INSTANCE
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r7, r6)
            if (r6 == 0) goto L_0x007e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "LSAT upgrade failed while authorizing order."
            r6.<init>(r7)
            throw r6
        L_0x007e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.patch.PatchOrderAction.execute(com.paypal.checkout.order.patch.PatchOrderRequest, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PatchOrderAction(PatchOrderRequestFactory patchOrderRequestFactory2, UpgradeLsatTokenAction upgradeLsatTokenAction2, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(patchOrderRequestFactory2, upgradeLsatTokenAction2, tVar, iVar, (i & 16) != 0 ? C19760n0.f43720b : coroutineDispatcher);
    }
}
