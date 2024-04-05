package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import androidx.room.C3253s;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.exception.PYPLException;
import com.paypal.pyplcheckout.interfaces.UpdateOrderFinishListener;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p608kn.C18155g;

public final class UpdateOrderCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "UpdateOrderCallback";
    private final UpdateOrderFinishListener listener;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UpdateOrderCallback get(UpdateOrderFinishListener updateOrderFinishListener) {
            C19383o.m32797g(updateOrderFinishListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            return new UpdateOrderCallback(updateOrderFinishListener);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateOrderCallback(UpdateOrderFinishListener updateOrderFinishListener) {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        C19383o.m32797g(updateOrderFinishListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = updateOrderFinishListener;
    }

    public static final UpdateOrderCallback get(UpdateOrderFinishListener updateOrderFinishListener) {
        return Companion.get(updateOrderFinishListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiSuccess$lambda-0  reason: not valid java name */
    public static final void m35430onApiSuccess$lambda0(UpdateOrderCallback updateOrderCallback, String str) {
        C19383o.m32797g(updateOrderCallback, "this$0");
        C19383o.m32797g(str, "$result");
        updateOrderCallback.listener.onSuccess(str);
    }

    private final void updateOrderFailProtocol(PYPLException pYPLException) {
        BaseCallback.handleCallbackFailure$default(this, (String) null, pYPLException, 1, (Object) null);
        runOnUiThread(new C3253s(3, this, pYPLException));
    }

    /* access modifiers changed from: private */
    /* renamed from: updateOrderFailProtocol$lambda-1  reason: not valid java name */
    public static final void m35431updateOrderFailProtocol$lambda1(UpdateOrderCallback updateOrderCallback, PYPLException pYPLException) {
        C19383o.m32797g(updateOrderCallback, "this$0");
        C19383o.m32797g(pYPLException, "$exception");
        updateOrderCallback.listener.onFailure(pYPLException);
    }

    public final UpdateOrderFinishListener getListener() {
        return this.listener;
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        String message = exc.getMessage();
        PLog.m28733eR(str, "exception when updating order " + message, exc);
        updateOrderFailProtocol(new PYPLException(C0326j.m864i("exception when updating order: ", exc.getMessage())));
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
        try {
            runOnUiThread(new C18155g(1, this, str));
        } catch (Exception e) {
            String str2 = TAG;
            C19383o.m32796f(str2, "TAG");
            String message = e.getMessage();
            PLog.m28733eR(str2, "exception in parsing update order response " + message, e);
            updateOrderFailProtocol(new PYPLException(C0326j.m864i("exception in parsing update order response: ", e.getMessage())));
        }
    }
}
