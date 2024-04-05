package com.paypal.checkout.createorder;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.checkout.createorder.OrderCreateResult;
import com.paypal.checkout.createorder.p536ba.BaTokenToEcTokenAction;
import com.paypal.checkout.order.Order;
import com.paypal.pyplcheckout.common.cache.Cache;
import com.paypal.pyplcheckout.exception.PYPLException;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p753kq.C19857l;

public final class CreateOrderActions {
    /* access modifiers changed from: private */
    public final BaTokenToEcTokenAction baTokenToEcTokenAction;
    private final CoroutineContext coroutineContext;
    /* access modifiers changed from: private */
    public final CreateOrderAction createOrderAction;
    public C19857l<? super OrderCreateResult, C19394m> internalOnOrderCreated;
    /* access modifiers changed from: private */
    public final Repository repo;

    public interface OnOrderCreated {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final OnOrderCreated invoke(C19857l<? super String, C19394m> lVar) {
                C19383o.m32797g(lVar, "orderCreated");
                return new CreateOrderActions$OnOrderCreated$Companion$invoke$1(lVar);
            }
        }

        void onCreated(String str);
    }

    public CreateOrderActions(CoroutineContext coroutineContext2, CreateOrderAction createOrderAction2, BaTokenToEcTokenAction baTokenToEcTokenAction2, Repository repository) {
        C19383o.m32797g(coroutineContext2, "coroutineContext");
        C19383o.m32797g(createOrderAction2, "createOrderAction");
        C19383o.m32797g(baTokenToEcTokenAction2, "baTokenToEcTokenAction");
        C19383o.m32797g(repository, "repo");
        this.coroutineContext = coroutineContext2;
        this.createOrderAction = createOrderAction2;
        this.baTokenToEcTokenAction = baTokenToEcTokenAction2;
        this.repo = repository;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object attemptBATokenConversion(java.lang.String r5, kotlin.coroutines.C19340c<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.paypal.checkout.createorder.CreateOrderActions$attemptBATokenConversion$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.paypal.checkout.createorder.CreateOrderActions$attemptBATokenConversion$1 r0 = (com.paypal.checkout.createorder.CreateOrderActions$attemptBATokenConversion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.paypal.checkout.createorder.CreateOrderActions$attemptBATokenConversion$1 r0 = new com.paypal.checkout.createorder.CreateOrderActions$attemptBATokenConversion$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0045
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            java.lang.String r6 = "BA"
            boolean r6 = kotlin.text.C19457k.m33025c1(r5, r6, r3)
            if (r6 == 0) goto L_0x0048
            com.paypal.checkout.createorder.ba.BaTokenToEcTokenAction r6 = r4.baTokenToEcTokenAction
            r0.label = r3
            java.lang.Object r6 = r6.execute(r5, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
        L_0x0048:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.checkout.createorder.CreateOrderActions.attemptBATokenConversion(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ void create$default(CreateOrderActions createOrderActions, Order order, OnOrderCreated onOrderCreated, int i, Object obj) {
        if ((i & 2) != 0) {
            onOrderCreated = null;
        }
        createOrderActions.create(order, onOrderCreated);
    }

    private final void createOrder(Order order, OnOrderCreated onOrderCreated) {
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new CreateOrderActions$createOrder$1(this, order, onOrderCreated, (C19340c<? super CreateOrderActions$createOrder$1>) null), 3);
    }

    public final void cancel() {
        PYPLCheckoutUtils.Companion.getInstance().cancelCheckoutFlow("CreateOrderAction-merchant canceled checkout", "merchant canceled checkout");
    }

    public final void create(Order order, C19857l<? super String, C19394m> lVar) {
        C19383o.m32797g(order, ResponseConstants.ORDER);
        C19383o.m32797g(lVar, "onOrderCreated");
        createOrder(order, OnOrderCreated.Companion.invoke(new CreateOrderActions$create$1(lVar)));
    }

    public final C19857l<OrderCreateResult, C19394m> getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease() {
        C19857l<? super OrderCreateResult, C19394m> lVar = this.internalOnOrderCreated;
        if (lVar != null) {
            return lVar;
        }
        C19383o.m32805o("internalOnOrderCreated");
        throw null;
    }

    public final void set(String str) {
        C19383o.m32797g(str, "orderId");
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new CreateOrderActions$set$1(this, str, (C19340c<? super CreateOrderActions$set$1>) null), 3);
    }

    public final void setAccessToken$pyplcheckout_externalThreedsRelease(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.createOrderAction.setAccessToken$pyplcheckout_externalThreedsRelease(str);
    }

    public final void setBillingAgreementId(String str) {
        C19383o.m32797g(str, "billingAgreementId");
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new CreateOrderActions$setBillingAgreementId$1(this, str, (C19340c<? super CreateOrderActions$setBillingAgreementId$1>) null), 3);
    }

    public final void setInternalOnOrderCreated$pyplcheckout_externalThreedsRelease(C19857l<? super OrderCreateResult, C19394m> lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.internalOnOrderCreated = lVar;
    }

    public final void setVaultApprovalSessionId(String str) {
        C19383o.m32797g(str, "approvalSessionId");
        if (!C19457k.m33020X0(str)) {
            DebugConfigManager instance = DebugConfigManager.getInstance();
            instance.setCheckoutToken(str);
            this.repo.setVaultFlow(true);
            Context applicationContext = instance.getApplicationContext();
            if (applicationContext != null) {
                Cache.cacheIsVaultFlow(applicationContext, this.repo.isVaultFlow());
            }
            getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease().invoke(new OrderCreateResult.Success(str));
            return;
        }
        getInternalOnOrderCreated$pyplcheckout_externalThreedsRelease().invoke(new OrderCreateResult.Error(new PYPLException("This approvalSessionId is not valid, it should not contain whitespaces")));
    }

    public final void create(Order order, OnOrderCreated onOrderCreated) {
        C19383o.m32797g(order, ResponseConstants.ORDER);
        createOrder(order, onOrderCreated);
    }
}
