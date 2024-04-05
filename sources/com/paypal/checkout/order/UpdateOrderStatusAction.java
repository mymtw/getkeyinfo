package com.paypal.checkout.order;

import com.google.gson.C16708i;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C20009t;
import okhttp3.C20011u;

public final class UpdateOrderStatusAction {
    /* access modifiers changed from: private */
    public final String TAG = "UpdateOrderStatusAction";
    /* access modifiers changed from: private */
    public final DebugConfigManager debugConfigManager;
    private final CoroutineDispatcher defaultDispatcher;
    /* access modifiers changed from: private */
    public final C16708i gson;
    private final CoroutineDispatcher ioDispatcher;
    /* access modifiers changed from: private */
    public final C20009t okHttpClient;
    private final UpdateOrderStatusRequestFactory updateOrderStatusRequestFactory;
    private final UpgradeLsatTokenAction upgradeLsatTokenAction;

    public UpdateOrderStatusAction(UpdateOrderStatusRequestFactory updateOrderStatusRequestFactory2, UpgradeLsatTokenAction upgradeLsatTokenAction2, DebugConfigManager debugConfigManager2, C20009t tVar, C16708i iVar, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        C19383o.m32797g(updateOrderStatusRequestFactory2, "updateOrderStatusRequestFactory");
        C19383o.m32797g(upgradeLsatTokenAction2, "upgradeLsatTokenAction");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        C19383o.m32797g(coroutineDispatcher2, "defaultDispatcher");
        this.updateOrderStatusRequestFactory = updateOrderStatusRequestFactory2;
        this.upgradeLsatTokenAction = upgradeLsatTokenAction2;
        this.debugConfigManager = debugConfigManager2;
        this.okHttpClient = tVar;
        this.gson = iVar;
        this.ioDispatcher = coroutineDispatcher;
        this.defaultDispatcher = coroutineDispatcher2;
    }

    /* access modifiers changed from: private */
    public final Object updateOrderStatus(C20011u uVar, C19340c<? super UpdateOrderStatusResult> cVar) {
        return C19697g.m33471i(cVar, this.ioDispatcher, new UpdateOrderStatusAction$updateOrderStatus$2(this, uVar, (C19340c<? super UpdateOrderStatusAction$updateOrderStatus$2>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007b A[SYNTHETIC, Splitter:B:27:0x007b] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object execute(kotlin.coroutines.C19340c<? super com.paypal.checkout.order.UpdateOrderStatusResult> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.paypal.checkout.order.UpdateOrderStatusAction$execute$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.paypal.checkout.order.UpdateOrderStatusAction$execute$1 r0 = (com.paypal.checkout.order.UpdateOrderStatusAction$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.checkout.order.UpdateOrderStatusAction$execute$1 r0 = new com.paypal.checkout.order.UpdateOrderStatusAction$execute$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            goto L_0x0094
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0036:
            java.lang.Object r2 = r0.L$1
            com.paypal.checkout.order.OrderContext r2 = (com.paypal.checkout.order.OrderContext) r2
            java.lang.Object r4 = r0.L$0
            com.paypal.checkout.order.UpdateOrderStatusAction r4 = (com.paypal.checkout.order.UpdateOrderStatusAction) r4
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0075
        L_0x0042:
            java.lang.Object r2 = r0.L$0
            com.paypal.checkout.order.UpdateOrderStatusAction r2 = (com.paypal.checkout.order.UpdateOrderStatusAction) r2
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            goto L_0x0060
        L_0x004a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r9)
            kotlinx.coroutines.CoroutineDispatcher r9 = r8.defaultDispatcher
            com.paypal.checkout.order.UpdateOrderStatusAction$execute$orderContext$1 r2 = new com.paypal.checkout.order.UpdateOrderStatusAction$execute$orderContext$1
            r2.<init>(r8, r6)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = kotlinx.coroutines.C19697g.m33471i(r0, r9, r2)
            if (r9 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r2 = r8
        L_0x0060:
            com.paypal.checkout.order.OrderContext r9 = (com.paypal.checkout.order.OrderContext) r9
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction r5 = r2.upgradeLsatTokenAction
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r4 = r5.execute(r0)
            if (r4 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r7 = r2
            r2 = r9
            r9 = r4
            r4 = r7
        L_0x0075:
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse r9 = (com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse) r9
            boolean r5 = r9 instanceof com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Success
            if (r5 == 0) goto L_0x009a
            com.paypal.checkout.order.UpdateOrderStatusRequestFactory r5 = r4.updateOrderStatusRequestFactory     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse$Success r9 = (com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Success) r9     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            java.lang.String r9 = r9.getUpgradedAccessToken()     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            okhttp3.u r9 = r5.create(r2, r9)     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            r0.L$0 = r6     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            r0.L$1 = r6     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            r0.label = r3     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            java.lang.Object r9 = r4.updateOrderStatus(r9, r0)     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            if (r9 != r1) goto L_0x0094
            return r1
        L_0x0094:
            com.paypal.checkout.order.UpdateOrderStatusResult r9 = (com.paypal.checkout.order.UpdateOrderStatusResult) r9     // Catch:{ NoValidUpdateOrderStatusUrlFound -> 0x0097 }
            goto L_0x00a4
        L_0x0097:
            com.paypal.checkout.order.UpdateOrderStatusResult$Error$InvalidUpdateOrderRequest r9 = com.paypal.checkout.order.UpdateOrderStatusResult.Error.InvalidUpdateOrderRequest.INSTANCE
            goto L_0x00a4
        L_0x009a:
            com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse$Failed r0 = com.paypal.checkout.merchanttoken.UpgradeLsatTokenResponse.Failed.INSTANCE
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r0)
            if (r9 == 0) goto L_0x00a5
            com.paypal.checkout.order.UpdateOrderStatusResult$Error$LsatTokenUpgradeError r9 = com.paypal.checkout.order.UpdateOrderStatusResult.Error.LsatTokenUpgradeError.INSTANCE
        L_0x00a4:
            return r9
        L_0x00a5:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.order.UpdateOrderStatusAction.execute(kotlin.coroutines.c):java.lang.Object");
    }
}
