package com.paypal.checkout.order;

import com.paypal.checkout.createorder.OrderIntent;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.services.api.BaseApiKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20015x;
import okhttp3.C20016y;

public final class UpdateOrderStatusRequestFactory {
    private final String TAG = "UpdateOrderStatusRequestFactory";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderIntent.values().length];
            iArr[OrderIntent.CAPTURE.ordinal()] = 1;
            iArr[OrderIntent.AUTHORIZE.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final C20011u create(OrderContext orderContext, String str) {
        String str2;
        C19383o.m32797g(orderContext, "orderContext");
        C19383o.m32797g(str, "merchantAccessToken");
        OrderIntent orderIntent = orderContext.getOrderIntent();
        int i = orderIntent == null ? -1 : WhenMappings.$EnumSwitchMapping$0[orderIntent.ordinal()];
        if (i != -1) {
            if (i == 1) {
                str2 = orderContext.getCaptureUrl();
                C19383o.m32794d(str2);
            } else if (i == 2) {
                str2 = orderContext.getAuthorizeUrl();
                C19383o.m32794d(str2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String str3 = this.TAG;
            C19383o.m32796f(str3, "TAG");
            PLog.d$default(str3, "Creating update order status request with url: " + str2, 0, 4, (Object) null);
            C20016y.f44360a.getClass();
            C20015x b = C20016y.C20017a.m34281b("", (C20002r) null);
            C20011u.C20012a addMerchantRestHeaders = BaseApiKt.addMerchantRestHeaders(new C20011u.C20012a(), str);
            addMerchantRestHeaders.mo73003f(str2);
            addMerchantRestHeaders.mo73001d("POST", b);
            return addMerchantRestHeaders.mo72999b();
        }
        throw new NoValidUpdateOrderStatusUrlFound(orderContext);
    }
}
