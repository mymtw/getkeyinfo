package com.paypal.checkout.order;

import androidx.recyclerview.widget.RecyclerView;
import com.paypal.checkout.order.AuthorizeOrderResult;
import com.paypal.checkout.order.UpdateOrderStatusResult;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import p003a2.C0015b;

public final class AuthorizeOrderAction {
    private final CoroutineDispatcher defaultDispatcher;
    /* access modifiers changed from: private */
    public final UpdateOrderStatusAction updateOrderStatusAction;

    public AuthorizeOrderAction(UpdateOrderStatusAction updateOrderStatusAction2, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(updateOrderStatusAction2, "updateOrderStatusAction");
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        this.updateOrderStatusAction = updateOrderStatusAction2;
        this.defaultDispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final AuthorizeOrderResult.Error mapError(UpdateOrderStatusResult.Error error) {
        AuthorizeOrderResult.Error error2;
        if (C19383o.m32792b(error, UpdateOrderStatusResult.Error.LsatTokenUpgradeError.INSTANCE)) {
            error2 = new AuthorizeOrderResult.Error((String) null, AuthorizeOrderResult.Error.ERROR_REASON_LSAT_UPGRADE_FAILED, 1, (DefaultConstructorMarker) null);
        } else if (error instanceof UpdateOrderStatusResult.Error.UpdateOrderStatusError) {
            error2 = new AuthorizeOrderResult.Error((String) null, C0015b.m88g("Authorize order response was not successful. Response status code: ", ((UpdateOrderStatusResult.Error.UpdateOrderStatusError) error).getResponseCode()), 1, (DefaultConstructorMarker) null);
        } else if (C19383o.m32792b(error, UpdateOrderStatusResult.Error.InvalidUpdateOrderRequest.INSTANCE)) {
            error2 = new AuthorizeOrderResult.Error((String) null, AuthorizeOrderResult.Error.ERROR_REASON_NO_AUTHORIZE_URL, 1, (DefaultConstructorMarker) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E570, error2.getMessage(), error2.getReason(), (Throwable) null, PEnums.TransitionName.ORDER_CAPTURE_EXECUTED, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.MAX_SCROLL_DURATION, (Object) null);
        return error2;
    }

    public final Object execute(C19340c<? super AuthorizeOrderResult> cVar) {
        return C19697g.m33471i(cVar, this.defaultDispatcher, new AuthorizeOrderAction$execute$2(this, (C19340c<? super AuthorizeOrderAction$execute$2>) null));
    }
}
