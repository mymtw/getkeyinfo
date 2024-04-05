package com.paypal.checkout.createorder;

import android.support.p013v4.media.C0069a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.C16708i;
import com.google.gson.JsonIOException;
import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.checkout.merchanttoken.CreateLsatTokenAction;
import com.paypal.checkout.merchanttoken.UpgradeLsatTokenAction;
import com.paypal.checkout.order.Order;
import com.paypal.checkout.order.OrderContext;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.exception.PYPLException;
import com.paypal.pyplcheckout.merchantIntegration.RunTimeEnvironment;
import com.paypal.pyplcheckout.model.CheckoutEnvironment;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.pojo.CreateOrderErrorDetails;
import com.paypal.pyplcheckout.pojo.CreateOrderErrorResponse;
import com.paypal.pyplcheckout.pojo.CreateOrderLinks;
import com.paypal.pyplcheckout.pojo.CreateOrderResponse;
import com.paypal.pyplcheckout.services.Repository;
import java.io.StringReader;
import java.util.Iterator;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.C19928a0;
import okhttp3.C20009t;
import okhttp3.C20018z;
import okhttp3.internal.connection.C19971e;
import p003a2.C0015b;
import p010a9.C0048b;

public final class CreateOrderAction {
    private final String TAG = "CreateOrderAction";
    private String accessToken;
    /* access modifiers changed from: private */
    public final CreateLsatTokenAction createLsatTokenAction;
    private final CreateOrderRequestFactory createOrderRequestFactory;
    private final C16708i gson;
    private final CoroutineDispatcher ioDispatcher;
    private final C20009t okHttpClient;
    /* access modifiers changed from: private */
    public final Repository repository;

    public CreateOrderAction(CreateOrderRequestFactory createOrderRequestFactory2, C20009t tVar, C16708i iVar, CreateLsatTokenAction createLsatTokenAction2, Repository repository2, CoroutineDispatcher coroutineDispatcher) {
        C19383o.m32797g(createOrderRequestFactory2, "createOrderRequestFactory");
        C19383o.m32797g(tVar, "okHttpClient");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(createLsatTokenAction2, "createLsatTokenAction");
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(coroutineDispatcher, "ioDispatcher");
        this.createOrderRequestFactory = createOrderRequestFactory2;
        this.okHttpClient = tVar;
        this.gson = iVar;
        this.createLsatTokenAction = createLsatTokenAction2;
        this.repository = repository2;
        this.ioDispatcher = coroutineDispatcher;
    }

    /* access modifiers changed from: private */
    public final String createOrderWithLsat(Order order, String str) {
        C20018z e = ((C19971e) this.okHttpClient.mo20743a(this.createOrderRequestFactory.create$pyplcheckout_externalThreedsRelease(order, str))).mo72859e();
        String str2 = null;
        if (e.mo73006d()) {
            try {
                C16708i iVar = this.gson;
                C19928a0 a0Var = e.f44368i;
                if (a0Var != null) {
                    str2 = a0Var.mo72844g();
                }
                CreateOrderResponse createOrderResponse = (CreateOrderResponse) iVar.mo59457d(new StringReader(str2), CreateOrderResponse.class);
                C19383o.m32796f(createOrderResponse, "createOrderResponse");
                saveResponseValues(createOrderResponse);
                return createOrderResponse.getId();
            } catch (JsonIOException e2) {
                logSerializationException(e2);
                throw e2;
            }
        } else {
            try {
                C16708i iVar2 = this.gson;
                C19928a0 a0Var2 = e.f44368i;
                if (a0Var2 != null) {
                    str2 = a0Var2.mo72844g();
                }
                CreateOrderErrorResponse createOrderErrorResponse = (CreateOrderErrorResponse) iVar2.mo59457d(new StringReader(str2), CreateOrderErrorResponse.class);
                String f = C0069a.m175f("exception when creating order: ", e.f44365f, ".");
                for (CreateOrderErrorDetails next : createOrderErrorResponse.getDetails()) {
                    f = C0048b.m164c(f, "\nError description: ", next.getDescription(), ".\nField: ", next.getField());
                }
                PYPLException pYPLException = new PYPLException(f);
                String str3 = this.TAG;
                C19383o.m32796f(str3, "TAG");
                String message = pYPLException.getMessage();
                PLog.m28733eR(str3, "exception when creating order " + message, pYPLException);
                throw pYPLException;
            } catch (JsonIOException e3) {
                logSerializationException(e3);
                throw e3;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void logError(String str) {
        PLog.error$default(PEnums.ErrorType.WARNING, PEnums.EventCode.E505, UpgradeLsatTokenAction.ERROR_LSAT_UPGRADE_FAILED, str, (Throwable) null, PEnums.TransitionName.NATIVE_XO_POST_LSAT_UPGRADE_TOKEN, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, RecyclerView.MAX_SCROLL_DURATION, (Object) null);
    }

    private final void logSerializationException(JsonIOException jsonIOException) {
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E563, "error with serializing merchant info", jsonIOException.getMessage(), jsonIOException, PEnums.TransitionName.NATIVE_XO_ORDER_RESPONSE, PEnums.StateName.REVIEW, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1920, (Object) null);
        String str = this.TAG;
        C19383o.m32796f(str, "TAG");
        PLog.m28733eR(str, "Orders serialization exception", jsonIOException);
    }

    private final void saveResponseValues(CreateOrderResponse createOrderResponse) {
        String str;
        T t;
        T t2;
        T t3;
        String id = createOrderResponse.getId();
        DebugConfigManager.getInstance().setCheckoutToken(id);
        Iterator<T> it = createOrderResponse.getLinks().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C19383o.m32792b(((CreateOrderLinks) t).getRel(), "capture")) {
                break;
            }
        }
        CreateOrderLinks createOrderLinks = (CreateOrderLinks) t;
        String href = createOrderLinks == null ? null : createOrderLinks.getHref();
        DebugConfigManager.getInstance().setOrderCaptureUrl(href);
        Iterator<T> it2 = createOrderResponse.getLinks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (C19383o.m32792b(((CreateOrderLinks) t2).getRel(), "authorize")) {
                break;
            }
        }
        CreateOrderLinks createOrderLinks2 = (CreateOrderLinks) t2;
        String href2 = createOrderLinks2 == null ? null : createOrderLinks2.getHref();
        DebugConfigManager.getInstance().setOrderAuthorizeUrl(href2);
        Iterator<T> it3 = createOrderResponse.getLinks().iterator();
        while (true) {
            if (!it3.hasNext()) {
                t3 = null;
                break;
            }
            t3 = it3.next();
            if (C19383o.m32792b(((CreateOrderLinks) t3).getRel(), "update")) {
                break;
            }
        }
        CreateOrderLinks createOrderLinks3 = (CreateOrderLinks) t3;
        String href3 = createOrderLinks3 == null ? null : createOrderLinks3.getHref();
        CheckoutEnvironment checkoutEnvironment = DebugConfigManager.getInstance().getCheckoutEnvironment();
        if (C19383o.m32792b(checkoutEnvironment.getEnvironment(), RunTimeEnvironment.STAGE.toString())) {
            href = href == null ? null : C0015b.m90i(checkoutEnvironment.getRestUrl(), "/v2/checkout/orders/", id, "/capture");
            if (href2 != null) {
                str = C0015b.m90i(checkoutEnvironment.getRestUrl(), "/v2/checkout/orders/", id, "/authorize");
            }
            href2 = str;
        }
        OrderContext.Companion.create(id, href, href2, href3);
    }

    public final Object execute(Order order, C19340c<? super String> cVar) {
        return C19697g.m33471i(cVar, this.ioDispatcher, new CreateOrderAction$execute$2(this, order, (C19340c<? super CreateOrderAction$execute$2>) null));
    }

    public final void setAccessToken$pyplcheckout_externalThreedsRelease(String str) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        this.accessToken = str;
    }
}
