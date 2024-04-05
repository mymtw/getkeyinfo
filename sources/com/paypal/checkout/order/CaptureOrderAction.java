package com.paypal.checkout.order;

import androidx.recyclerview.widget.RecyclerView;
import com.paypal.checkout.order.CaptureOrderResult;
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

public final class CaptureOrderAction {
    private final CoroutineDispatcher defaultDispatcher;
    /* access modifiers changed from: private */
    public final UpdateOrderStatusAction updateOrderStatusAction;

    public CaptureOrderAction(UpdateOrderStatusAction updateOrderStatusAction2, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(updateOrderStatusAction2, "updateOrderStatusAction");
        C19383o.m32797g(coroutineDispatcher, "defaultDispatcher");
        this.updateOrderStatusAction = updateOrderStatusAction2;
        this.defaultDispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final CaptureOrderResult.Error mapError(UpdateOrderStatusResult.Error error) {
        CaptureOrderResult.Error error2;
        if (C19383o.m32792b(error, UpdateOrderStatusResult.Error.LsatTokenUpgradeError.INSTANCE)) {
            error2 = new CaptureOrderResult.Error((String) null, CaptureOrderResult.Error.ERROR_REASON_LSAT_UPGRADE_FAILED, 1, (DefaultConstructorMarker) null);
        } else if (C19383o.m32792b(error, UpdateOrderStatusResult.Error.InvalidUpdateOrderRequest.INSTANCE)) {
            error2 = new CaptureOrderResult.Error((String) null, CaptureOrderResult.Error.ERROR_REASON_NO_CAPTURE_URL, 1, (DefaultConstructorMarker) null);
        } else if (error instanceof UpdateOrderStatusResult.Error.UpdateOrderStatusError) {
            error2 = new CaptureOrderResult.Error((String) null, C0015b.m88g("Capture order response was not successful. Response status code: ", ((UpdateOrderStatusResult.Error.UpdateOrderStatusError) error).getResponseCode()), 1, (DefaultConstructorMarker) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E570, error2.getMessage(), error2.getReason(), (Throwable) null, PEnums.TransitionName.ORDER_CAPTURE_EXECUTED, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.MAX_SCROLL_DURATION, (Object) null);
        return error2;
    }

    public final Object execute(C19340c<? super CaptureOrderResult> cVar) {
        return C19697g.m33471i(cVar, this.defaultDispatcher, new CaptureOrderAction$execute$2(this, (C19340c<? super CaptureOrderAction$execute$2>) null));
    }
}
