package com.paypal.pyplcheckout.services.api;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.push.CartRefreshDelegate;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.BuildConfig;
import com.paypal.pyplcheckout.model.CheckoutEnvironment;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import com.paypal.pyplcheckout.utils.VersionUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20011u;
import okhttp3.C20016y;
import okio.ByteString;

public final class BaseApiKt {
    public static final void addBaseHeaders(C20011u.C20012a aVar) {
        C19383o.m32797g(aVar, "<this>");
        aVar.mo73000c("Content-type", "application/json");
        aVar.mo73000c("Accept", "application/json");
        aVar.mo73000c("x-app-name", BuildConfig.APP_NAME);
        aVar.mo73000c("x-app-version", VersionUtils.INSTANCE.getSdkVersion());
        aVar.mo73000c(CartRefreshDelegate.ARG_ORIGIN, DebugConfigManager.getInstance().getCheckoutEnvironment().getHost());
    }

    public static final void addBaseHeadersWithAuthToken(C20011u.C20012a aVar, String str) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        addBaseHeadersWithPayToken(aVar);
        aVar.mo73000c("x-paypal-internal-euat", str);
    }

    public static final void addBaseHeadersWithPayToken(C20011u.C20012a aVar) {
        C19383o.m32797g(aVar, "<this>");
        addBaseHeaders(aVar);
        aVar.mo73000c("paypal-client-context", SdkComponent.Companion.getInstance().getRepository().getPaymentToken());
    }

    public static final C20011u.C20012a addBasicRestHeaders(C20011u.C20012a aVar, String str, String str2) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(str, ResponseConstants.USERNAME);
        C19383o.m32797g(str2, "password");
        aVar.mo73000c("Accept", "application/json");
        Charset charset = StandardCharsets.ISO_8859_1;
        C19383o.m32796f(charset, "ISO_8859_1");
        String str3 = str + ':' + str2;
        ByteString.Companion.getClass();
        C19383o.m32797g(str3, "$this$encode");
        byte[] bytes = str3.getBytes(charset);
        C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
        aVar.mo73000c("Authorization", "Basic " + new ByteString(bytes).base64());
        return aVar;
    }

    public static /* synthetic */ C20011u.C20012a addBasicRestHeaders$default(C20011u.C20012a aVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return addBasicRestHeaders(aVar, str, str2);
    }

    public static final C20011u.C20012a addMerchantRestHeaders(C20011u.C20012a aVar, String str) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        aVar.mo73000c("Content-type", "application/json");
        aVar.mo73000c("Authorization", "Bearer " + str);
        return aVar;
    }

    public static final void addPostBody(C20011u.C20012a aVar, String str) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(str, "bodyStr");
        C20016y.C20017a aVar2 = C20016y.f44360a;
        C20002r.f44260f.getClass();
        C20002r b = C20002r.C20003a.m34244b("application/json; charset=utf-8");
        aVar2.getClass();
        aVar.mo73001d("POST", C20016y.C20017a.m34281b(str, b));
    }

    public static final C20011u.C20012a addRequestedByHeader(C20011u.C20012a aVar) {
        C19383o.m32797g(aVar, "<this>");
        aVar.mo73000c("x-requested-by", "native-checkout-sdk");
        return aVar;
    }

    public static final void addRestHeaders(C20011u.C20012a aVar, String str) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        aVar.mo73000c("Content-type", "application/json");
        aVar.mo73000c("Authorization", "Bearer " + str);
    }

    public static final C20011u.C20012a allowRetry(C20011u.C20012a aVar, int i, long j, long j2) {
        C19383o.m32797g(aVar, "<this>");
        aVar.mo73000c(NetworkRetryInterceptor.RETRY_MAX_COUNT_HEADER, String.valueOf(i));
        aVar.mo73000c(NetworkRetryInterceptor.RETRY_TIMEOUT_HEADER, String.valueOf(j));
        aVar.mo73000c(NetworkRetryInterceptor.RETRY_DELAY_HEADER, String.valueOf(j2));
        return aVar;
    }

    public static /* synthetic */ C20011u.C20012a allowRetry$default(C20011u.C20012a aVar, int i, long j, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 3;
        }
        if ((i2 & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        long j3 = j;
        if ((i2 & 4) != 0) {
            j2 = NetworkRetryInterceptor.DEFAULT_RETRY_DELAY;
        }
        return allowRetry(aVar, i, j3, j2);
    }

    private static final CheckoutEnvironment getCheckoutEnvironment() {
        CheckoutEnvironment checkoutEnvironment = getDebugConfigManager().getCheckoutEnvironment();
        C19383o.m32796f(checkoutEnvironment, "debugConfigManager.checkoutEnvironment");
        return checkoutEnvironment;
    }

    private static final DebugConfigManager getDebugConfigManager() {
        DebugConfigManager instance = DebugConfigManager.getInstance();
        C19383o.m32796f(instance, "getInstance()");
        return instance;
    }

    private static final String getOrdersApi() {
        return C0326j.m864i(getCheckoutEnvironment().getRestUrl(), "/v2/checkout/orders");
    }

    public static final void patch(C20011u.C20012a aVar, String str) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(str, "bodyStr");
        C20016y.C20017a aVar2 = C20016y.f44360a;
        C20002r.f44260f.getClass();
        C20002r b = C20002r.C20003a.m34244b("application/json; charset=utf-8");
        aVar2.getClass();
        aVar.mo73001d("PATCH", C20016y.C20017a.m34281b(str, b));
    }

    public static final void setGraphQlUrl(C20011u.C20012a aVar) {
        C19383o.m32797g(aVar, "<this>");
        aVar.mo73003f(DebugConfigManager.getInstance().getCheckoutEnvironment().getGraphQlEndpoint());
    }

    public static final void setOrdersUrl(C20011u.C20012a aVar) {
        C19383o.m32797g(aVar, "<this>");
        aVar.mo73003f(getOrdersApi());
    }

    public static final void setUpdateOrdersUrl(C20011u.C20012a aVar, String str) {
        C19383o.m32797g(aVar, "<this>");
        C19383o.m32797g(str, "checkoutToken");
        String ordersApi = getOrdersApi();
        aVar.mo73003f(ordersApi + "/" + str);
    }
}
