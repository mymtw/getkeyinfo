package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.appcompat.widget.C0326j;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.p543di.SdkComponentKt;
import com.paypal.pyplcheckout.pojo.AddShippingAddressResponse;
import com.paypal.pyplcheckout.pojo.CheckoutSession;
import com.paypal.pyplcheckout.pojo.EmbeddedCheckoutSession;
import com.paypal.pyplcheckout.pojo.Error;
import com.paypal.pyplcheckout.pojo.ErrorData;
import com.paypal.pyplcheckout.pojo.ShippingAddress;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;

public final class AddShippingAddressCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "AddShippingAddressCallback";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AddShippingAddressCallback get() {
            return new AddShippingAddressCallback();
        }
    }

    public AddShippingAddressCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
        SdkComponentKt.inject((BaseCallback) this);
    }

    private final void addressFailProtocol(String str, List<Error> list) {
        getEvents().fire(PayPalEventTypes.NEW_SHIPPING_ADDRESS_RESULT, new com.paypal.pyplcheckout.events.Error(list));
        PLog.decision$default(PEnums.TransitionName.ADD_SHIPPING_ADDRESS_API, PEnums.Outcome.FAILED, PEnums.EventCode.E531, PEnums.StateName.SHIPPING, (String) null, (String) null, str, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1968, (Object) null);
    }

    public static /* synthetic */ void addressFailProtocol$default(AddShippingAddressCallback addShippingAddressCallback, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        addShippingAddressCallback.addressFailProtocol(str, list);
    }

    public static final AddShippingAddressCallback get() {
        return Companion.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiSuccess$lambda-0  reason: not valid java name */
    public static final void m35424onApiSuccess$lambda0(AddShippingAddressCallback addShippingAddressCallback, AddShippingAddressResponse addShippingAddressResponse) {
        EmbeddedCheckoutSession data;
        CheckoutSession checkoutSession;
        C19383o.m32797g(addShippingAddressCallback, "this$0");
        Events events = addShippingAddressCallback.getEvents();
        PayPalEventTypes payPalEventTypes = PayPalEventTypes.NEW_SHIPPING_ADDRESS_RESULT;
        List<ShippingAddress> list = null;
        if (!(addShippingAddressResponse == null || (data = addShippingAddressResponse.getData()) == null || (checkoutSession = data.getCheckoutSession()) == null)) {
            list = checkoutSession.getShippingAddresses();
        }
        events.fire(payPalEventTypes, new Success(list));
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        Error error = new Error(C0326j.m864i("error adding address response: ", exc.getMessage()), (List) null, (Integer) null, (Boolean) null, (ErrorData) null, 30, (DefaultConstructorMarker) null);
        addressFailProtocol(error.getMessage(), C17782b.m29864d0(error));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.paypal.pyplcheckout.pojo.CheckoutSession} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onApiSuccess(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "result"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            com.google.gson.i r2 = new com.google.gson.i
            r2.<init>()
            java.io.StringReader r3 = new java.io.StringReader
            r3.<init>(r1)
            java.lang.Class<com.paypal.pyplcheckout.pojo.AddShippingAddressResponse> r1 = com.paypal.pyplcheckout.pojo.AddShippingAddressResponse.class
            java.lang.Object r1 = r2.mo59457d(r3, r1)
            com.paypal.pyplcheckout.pojo.AddShippingAddressResponse r1 = (com.paypal.pyplcheckout.pojo.AddShippingAddressResponse) r1
            r2 = 0
            if (r1 != 0) goto L_0x0020
            r3 = r2
            goto L_0x0024
        L_0x0020:
            java.util.List r3 = r1.getErrors()
        L_0x0024:
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = r5
            goto L_0x0032
        L_0x0031:
            r3 = r4
        L_0x0032:
            if (r3 == 0) goto L_0x006f
            com.paypal.pyplcheckout.di.SdkComponent$Companion r3 = com.paypal.pyplcheckout.p543di.SdkComponent.Companion
            com.paypal.pyplcheckout.di.SdkComponent r3 = r3.getInstance()
            com.paypal.pyplcheckout.services.Repository r3 = r3.getRepository()
            if (r1 != 0) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            com.paypal.pyplcheckout.pojo.EmbeddedCheckoutSession r4 = r1.getData()
            if (r4 != 0) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            com.paypal.pyplcheckout.pojo.CheckoutSession r2 = r4.getCheckoutSession()
        L_0x004c:
            r3.setCheckoutSession(r2)
            kn.a r2 = new kn.a
            r3 = 2
            r2.<init>(r3, r0, r1)
            r0.runOnUiThread(r2)
            com.paypal.pyplcheckout.common.instrumentation.PEnums$TransitionName r4 = com.paypal.pyplcheckout.common.instrumentation.PEnums.TransitionName.ADD_SHIPPING_ADDRESS_API
            com.paypal.pyplcheckout.common.instrumentation.PEnums$Outcome r5 = com.paypal.pyplcheckout.common.instrumentation.PEnums.Outcome.SUCCEEDED
            com.paypal.pyplcheckout.common.instrumentation.PEnums$EventCode r6 = com.paypal.pyplcheckout.common.instrumentation.PEnums.EventCode.E210
            com.paypal.pyplcheckout.common.instrumentation.PEnums$StateName r7 = com.paypal.pyplcheckout.common.instrumentation.PEnums.StateName.SHIPPING
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2032(0x7f0, float:2.847E-42)
            r16 = 0
            com.paypal.pyplcheckout.common.instrumentation.PLog.decision$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00ba
        L_0x006f:
            if (r1 != 0) goto L_0x0072
            goto L_0x0088
        L_0x0072:
            java.util.List r3 = r1.getErrors()
            if (r3 != 0) goto L_0x0079
            goto L_0x0088
        L_0x0079:
            java.lang.Object r3 = kotlin.collections.C19327t.m32640V0(r3)
            com.paypal.pyplcheckout.pojo.Error r3 = (com.paypal.pyplcheckout.pojo.Error) r3
            if (r3 != 0) goto L_0x0082
            goto L_0x0088
        L_0x0082:
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L_0x008a
        L_0x0088:
            java.lang.String r3 = "errors with submitted address"
        L_0x008a:
            if (r1 != 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            java.util.List r2 = r1.getErrors()
        L_0x0091:
            r0.addressFailProtocol(r3, r2)
            if (r1 != 0) goto L_0x0097
            goto L_0x00a5
        L_0x0097:
            java.util.List r2 = r1.getErrors()
            if (r2 != 0) goto L_0x009e
            goto L_0x00a5
        L_0x009e:
            boolean r2 = com.paypal.pyplcheckout.pojo.ErrorKt.containsContingencies(r2)
            if (r2 != r4) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r4 = r5
        L_0x00a6:
            if (r4 == 0) goto L_0x00ba
            com.paypal.pyplcheckout.events.Events r2 = r17.getEvents()
            com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes r3 = com.paypal.pyplcheckout.events.ExtendedPayPalEventTypes.CONTINGENCY_ERROR
            com.paypal.pyplcheckout.events.Error r4 = new com.paypal.pyplcheckout.events.Error
            java.util.List r1 = r1.getErrors()
            r4.<init>(r1)
            r2.fire(r3, r4)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.pyplcheckout.services.callbacks.AddShippingAddressCallback.onApiSuccess(java.lang.String):void");
    }
}
