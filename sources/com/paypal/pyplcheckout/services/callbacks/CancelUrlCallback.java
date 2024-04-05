package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.google.gson.C16708i;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.CancelUrlResponse;
import com.paypal.pyplcheckout.pojo.Cart;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.CheckoutSessionData;
import com.paypal.pyplcheckout.pojo.Url;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.io.StringReader;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CancelUrlCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "CancelUrlCallback";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CancelUrlCallback get() {
            return new CancelUrlCallback();
        }
    }

    public CancelUrlCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
    }

    private final void cancelUrlFailProtocol(String str, Exception exc) {
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.eR$default(str2, "GET cancelUrl failed because " + str, (Exception) null, 4, (Object) null);
        PYPLCheckoutUtils.fallBack$default(PYPLCheckoutUtils.Companion.getInstance(), "getCancelUrl API", PEnums.FallbackReason.CANCEL_URL, PEnums.FallbackCategory.DATA_PARSING_ERROR, str, (PEnums.TransitionName) null, ErrorReason.CANCEL_URL_ERROR, exc, 16, (Object) null);
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E114, "GET CANCEL URL SERVICE, ERROR GETTING URL", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_XO_POST_AUTH_ELIGIBILITY_CHECK, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
    }

    public static final CancelUrlCallback get() {
        return Companion.get();
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String message = exc.getMessage();
        if (message == null) {
            message = "failed to get error response from cancelUrl";
        }
        cancelUrlFailProtocol(message, exc);
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
        try {
            CancelUrlResponse cancelUrlResponse = (CancelUrlResponse) new C16708i().mo59457d(new StringReader(str), CancelUrlResponse.class);
            String str2 = null;
            if (cancelUrlResponse != null) {
                CheckoutSessionData data = cancelUrlResponse.getData();
                if (data != null) {
                    CheckoutSession checkoutSession = data.getCheckoutSession();
                    if (checkoutSession != null) {
                        Cart cart = checkoutSession.getCart();
                        if (cart != null) {
                            Url cancelUrl = cart.getCancelUrl();
                            if (cancelUrl != null) {
                                str2 = cancelUrl.getHref();
                            }
                        }
                    }
                }
            }
            Repository repository = SdkComponent.Companion.getInstance().getRepository();
            if (str2 == null) {
                str2 = "";
            }
            repository.setCancelUrl(str2);
        } catch (Exception e) {
            cancelUrlFailProtocol(C0326j.m864i("successful response but parse error: ", e.getMessage()), e);
        }
    }
}
