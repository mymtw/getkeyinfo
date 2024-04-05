package com.paypal.checkout.merchanttoken;

import com.paypal.pyplcheckout.services.Repository;
import kotlin.jvm.internal.C19383o;

public final class GetLsatTokenAction {
    private final CreateLsatTokenAction createLsatTokenAction;
    private final Repository repository;

    public GetLsatTokenAction(Repository repository2, CreateLsatTokenAction createLsatTokenAction2) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(createLsatTokenAction2, "createLsatTokenAction");
        this.repository = repository2;
        this.createLsatTokenAction = createLsatTokenAction2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object execute(kotlin.coroutines.C19340c<? super java.lang.String> r5) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.paypal.checkout.merchanttoken.GetLsatTokenAction$execute$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.paypal.checkout.merchanttoken.GetLsatTokenAction$execute$1 r0 = (com.paypal.checkout.merchanttoken.GetLsatTokenAction$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.checkout.merchanttoken.GetLsatTokenAction$execute$1 r0 = new com.paypal.checkout.merchanttoken.GetLsatTokenAction$execute$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r0 = r0.L$0
            com.paypal.checkout.merchanttoken.GetLsatTokenAction r0 = (com.paypal.checkout.merchanttoken.GetLsatTokenAction) r0
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            goto L_0x004c
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            com.paypal.pyplcheckout.services.Repository r5 = r4.repository
            java.lang.String r5 = r5.getLsatToken()
            if (r5 != 0) goto L_0x0053
            com.paypal.checkout.merchanttoken.CreateLsatTokenAction r5 = r4.createLsatTokenAction
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.execute(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            java.lang.String r5 = (java.lang.String) r5
            com.paypal.pyplcheckout.services.Repository r0 = r0.repository
            r0.setLsatToken(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.merchanttoken.GetLsatTokenAction.execute(kotlin.coroutines.c):java.lang.Object");
    }
}
