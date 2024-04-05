package com.paypal.checkout.order;

import com.paypal.checkout.order.AuthorizeOrderResult;
import com.paypal.checkout.order.CaptureOrderResult;
import com.paypal.checkout.order.GetOrderResult;
import com.paypal.checkout.order.actions.OnPatchComplete;
import com.paypal.checkout.order.actions.PatchAction;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementAction;
import com.paypal.checkout.order.billingagreements.ExecuteBillingAgreementResult;
import com.paypal.checkout.order.patch.PatchOrderRequest;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p010a9.C0048b;
import p753kq.C19846a;
import p753kq.C19857l;

public final class OrderActions {
    /* access modifiers changed from: private */
    public final AuthorizeOrderAction authorizeOrderAction;
    /* access modifiers changed from: private */
    public final CaptureOrderAction captureOrderAction;
    private final CoroutineContext coroutineContext;
    /* access modifiers changed from: private */
    public final ExecuteBillingAgreementAction executeBillingAgreementAction;
    /* access modifiers changed from: private */
    public final GetOrderAction getOrderAction;
    private final PatchAction patchAction;

    public OrderActions(CaptureOrderAction captureOrderAction2, AuthorizeOrderAction authorizeOrderAction2, PatchAction patchAction2, ExecuteBillingAgreementAction executeBillingAgreementAction2, GetOrderAction getOrderAction2, CoroutineContext coroutineContext2) {
        C19383o.m32797g(captureOrderAction2, "captureOrderAction");
        C19383o.m32797g(authorizeOrderAction2, "authorizeOrderAction");
        C19383o.m32797g(patchAction2, "patchAction");
        C19383o.m32797g(executeBillingAgreementAction2, "executeBillingAgreementAction");
        C19383o.m32797g(getOrderAction2, "getOrderAction");
        C19383o.m32797g(coroutineContext2, "coroutineContext");
        this.captureOrderAction = captureOrderAction2;
        this.authorizeOrderAction = authorizeOrderAction2;
        this.patchAction = patchAction2;
        this.executeBillingAgreementAction = executeBillingAgreementAction2;
        this.getOrderAction = getOrderAction2;
        this.coroutineContext = coroutineContext2;
    }

    /* access modifiers changed from: private */
    public final PEnums.Outcome asOutcome(AuthorizeOrderResult authorizeOrderResult) {
        return authorizeOrderResult instanceof AuthorizeOrderResult.Success ? PEnums.Outcome.SUCCESS : PEnums.Outcome.FAILED;
    }

    /* access modifiers changed from: private */
    public final String infoMessage(GetOrderResult getOrderResult) {
        if (!(getOrderResult instanceof GetOrderResult.Error)) {
            return null;
        }
        GetOrderResult.Error error = (GetOrderResult.Error) getOrderResult;
        return C0048b.m163a(error.getReason(), " ", error.getMessage());
    }

    /* access modifiers changed from: private */
    public final String intDesc(ExecuteBillingAgreementResult executeBillingAgreementResult) {
        if (!(executeBillingAgreementResult instanceof ExecuteBillingAgreementResult.Error)) {
            return null;
        }
        ExecuteBillingAgreementResult.Error error = (ExecuteBillingAgreementResult.Error) executeBillingAgreementResult;
        return C0048b.m163a(error.getReason(), " ", error.getErrorMessage());
    }

    public final void authorize(C19857l<? super AuthorizeOrderResult, C19394m> lVar) {
        C19383o.m32797g(lVar, "onComplete");
        authorize((OnAuthorizeComplete) new OrderActions$authorize$1(lVar));
    }

    public final void capture(C19857l<? super CaptureOrderResult, C19394m> lVar) {
        C19383o.m32797g(lVar, "onComplete");
        capture((OnCaptureComplete) new OrderActions$capture$1(lVar));
    }

    public final void executeBillingAgreement(OnExecuteBillingAgreementComplete onExecuteBillingAgreementComplete) {
        C19383o.m32797g(onExecuteBillingAgreementComplete, "onComplete");
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new OrderActions$executeBillingAgreement$1(this, onExecuteBillingAgreementComplete, (C19340c<? super OrderActions$executeBillingAgreement$1>) null), 3);
    }

    public final void getOrderDetails(OnGetOrderDetailsComplete onGetOrderDetailsComplete) {
        C19383o.m32797g(onGetOrderDetailsComplete, "onComplete");
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new OrderActions$getOrderDetails$1(this, onGetOrderDetailsComplete, (C19340c<? super OrderActions$getOrderDetails$1>) null), 3);
    }

    public final void patchOrder(PatchOrderRequest patchOrderRequest, C19846a<C19394m> aVar) {
        C19383o.m32797g(patchOrderRequest, "patchOrderRequest");
        C19383o.m32797g(aVar, "onComplete");
        this.patchAction.patchOrder(patchOrderRequest, new OrderActions$patchOrder$1(aVar));
    }

    /* access modifiers changed from: private */
    public final PEnums.Outcome asOutcome(CaptureOrderResult captureOrderResult) {
        return captureOrderResult instanceof CaptureOrderResult.Success ? PEnums.Outcome.SUCCESS : PEnums.Outcome.FAILED;
    }

    public final void authorize(OnAuthorizeComplete onAuthorizeComplete) {
        C19383o.m32797g(onAuthorizeComplete, "onComplete");
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new OrderActions$authorize$2(this, onAuthorizeComplete, (C19340c<? super OrderActions$authorize$2>) null), 3);
    }

    public final void capture(OnCaptureComplete onCaptureComplete) {
        C19383o.m32797g(onCaptureComplete, "onComplete");
        C19697g.m33468f(C19697g.m33463a(this.coroutineContext), (CoroutineContext) null, (CoroutineStart) null, new OrderActions$capture$2(this, onCaptureComplete, (C19340c<? super OrderActions$capture$2>) null), 3);
    }

    public final void executeBillingAgreement(C19857l<? super ExecuteBillingAgreementResult, C19394m> lVar) {
        C19383o.m32797g(lVar, "onComplete");
        executeBillingAgreement(OnExecuteBillingAgreementComplete.Companion.invoke(new OrderActions$executeBillingAgreement$2(lVar)));
    }

    public final void getOrderDetails(C19857l<? super GetOrderResult, C19394m> lVar) {
        C19383o.m32797g(lVar, "onComplete");
        getOrderDetails(OnGetOrderDetailsComplete.Companion.invoke(new OrderActions$getOrderDetails$2(lVar)));
    }

    /* access modifiers changed from: private */
    public final PEnums.Outcome asOutcome(ExecuteBillingAgreementResult executeBillingAgreementResult) {
        return executeBillingAgreementResult instanceof ExecuteBillingAgreementResult.Success ? PEnums.Outcome.SUCCESS : PEnums.Outcome.FAILED;
    }

    /* access modifiers changed from: private */
    public final PEnums.Outcome asOutcome(GetOrderResult getOrderResult) {
        if (getOrderResult instanceof GetOrderResult.Success) {
            return PEnums.Outcome.SUCCESS;
        }
        return PEnums.Outcome.FAILED;
    }

    public final void patchOrder(PatchOrderRequest patchOrderRequest, OnPatchComplete onPatchComplete) {
        C19383o.m32797g(patchOrderRequest, "patchOrderRequest");
        C19383o.m32797g(onPatchComplete, "onComplete");
        this.patchAction.patchOrder(patchOrderRequest, onPatchComplete);
    }
}
