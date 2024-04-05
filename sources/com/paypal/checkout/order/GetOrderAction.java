package com.paypal.checkout.order;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.GetLsatTokenAction;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import com.paypal.pyplcheckout.services.ApiErrorException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C19928a0;
import okhttp3.C20009t;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p003a2.C0015b;

public final class GetOrderAction {
    private final CoroutineDispatcher defaultDispatcher;
    private final GetLsatTokenAction getLsatTokenAction;
    private final GetOrderRequestFactory getOrderRequestFactory;
    private final C16708i gson;
    private final C20009t okHttpClient;
    private final UpgradeLsatTokenAction upgradeLsatTokenAction;

    public GetOrderAction(CoroutineDispatcher coroutineDispatcher, GetLsatTokenAction getLsatTokenAction2, UpgradeLsatTokenAction upgradeLsatTokenAction2, GetOrderRequestFactory getOrderRequestFactory2, C20009t tVar, C16708i iVar) {
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        C19383o.m32797g(getLsatTokenAction2, "getLsatTokenAction");
        C19383o.m32797g(upgradeLsatTokenAction2, "upgradeLsatTokenAction");
        C19383o.m32797g(getOrderRequestFactory2, "getOrderRequestFactory");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(iVar, "gson");
        this.defaultDispatcher = coroutineDispatcher;
        this.getLsatTokenAction = getLsatTokenAction2;
        this.upgradeLsatTokenAction = upgradeLsatTokenAction2;
        this.getOrderRequestFactory = getOrderRequestFactory2;
        this.okHttpClient = tVar;
        this.gson = iVar;
    }

    /* access modifiers changed from: private */
    public final Object fetchOrder(OrderContext orderContext, String str, C19340c<? super OrderResponse> cVar) throws Exception {
        C20018z e = ((C19971e) this.okHttpClient.mo20743a(this.getOrderRequestFactory.create(orderContext, str))).mo72859e();
        if (e.mo73006d()) {
            C16708i iVar = this.gson;
            C19928a0 a0Var = e.f44368i;
            String g = a0Var == null ? null : a0Var.mo72844g();
            if (g == null) {
                g = "";
            }
            Object e2 = iVar.mo59458e(OrderResponse.class, g);
            C19383o.m32796f(e2, "{\n            gson.fromJ…se::class.java)\n        }");
            return (OrderResponse) e2;
        }
        throw new ApiErrorException(C0015b.m88g("Get order action failed ", e.f44365f));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getUpgradedAccessToken(kotlin.coroutines.C19340c<? super java.lang.String> r7) throws com.paypal.pyplcheckout.services.ApiErrorException {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.paypal.checkout.order.GetOrderAction$getUpgradedAccessToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.paypal.checkout.order.GetOrderAction$getUpgradedAccessToken$1 r0 = (com.paypal.checkout.order.GetOrderAction$getUpgradedAccessToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.checkout.order.GetOrderAction$getUpgradedAccessToken$1 r0 = new com.paypal.checkout.order.GetOrderAction$getUpgradedAccessToken$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x0059
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0033:
            java.lang.Object r2 = r0.L$0
            com.paypal.checkout.order.GetOrderAction r2 = (com.paypal.checkout.order.GetOrderAction) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            goto L_0x004c
        L_0x003b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r7)
            com.paypal.checkout.merchanttoken.GetLsatTokenAction r7 = r6.getLsatTokenAction
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.execute(r0)
            if (r7 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r2 = r6
        L_0x004c:
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction r7 = r2.upgradeLsatTokenAction
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r7.execute(r0)
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            boolean r0 = r7 instanceof com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Success
            if (r0 == 0) goto L_0x0060
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse$Success r7 = (com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Success) r7
            goto L_0x0061
        L_0x0060:
            r7 = r5
        L_0x0061:
            if (r7 != 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            java.lang.String r5 = r7.getUpgradedAccessToken()
        L_0x0068:
            if (r5 == 0) goto L_0x006b
            return r5
        L_0x006b:
            com.paypal.pyplcheckout.services.ApiErrorException r7 = new com.paypal.pyplcheckout.services.ApiErrorException
            java.lang.String r0 = "Error upgrading access token."
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.GetOrderAction.getUpgradedAccessToken(kotlin.coroutines.c):java.lang.Object");
    }

    public final Object execute(C19340c<? super GetOrderResult> cVar) {
        return C19697g.m33471i(cVar, this.defaultDispatcher, new GetOrderAction$execute$2(this, (C19340c<? super GetOrderAction$execute$2>) null));
    }
}
