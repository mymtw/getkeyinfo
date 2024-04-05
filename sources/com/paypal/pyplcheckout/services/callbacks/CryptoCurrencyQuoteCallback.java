package com.paypal.pyplcheckout.services.callbacks;

import android.os.Handler;
import androidx.room.C3251q;
import com.appboy.p043ui.C4950e;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Error;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.pojo.CryptoQuoteResponse;
import java.io.StringReader;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p726zi.C18911f;

public final class CryptoCurrencyQuoteCallback extends BaseCallback {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "CryptoCurrencyQuoteCallback";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CryptoCurrencyQuoteCallback get() {
            return new CryptoCurrencyQuoteCallback();
        }
    }

    public CryptoCurrencyQuoteCallback() {
        super((Handler) null, 1, (DefaultConstructorMarker) null);
    }

    public static final CryptoCurrencyQuoteCallback get() {
        return Companion.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiError$lambda-0  reason: not valid java name */
    public static final void m35426onApiError$lambda0(Exception exc) {
        C19383o.m32797g(exc, "$exception");
        Events.Companion.getInstance().fire(PayPalEventTypes.FINISHED_CRYPTO_QUOTE_RESPONSE, new Error(exc.getMessage()));
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiSuccess$lambda-1  reason: not valid java name */
    public static final void m35427onApiSuccess$lambda1(CryptoQuoteResponse cryptoQuoteResponse) {
        Events.Companion.getInstance().fire(PayPalEventTypes.FINISHED_CRYPTO_QUOTE_RESPONSE, new Success(cryptoQuoteResponse));
    }

    /* access modifiers changed from: private */
    /* renamed from: onApiSuccess$lambda-2  reason: not valid java name */
    public static final void m35428onApiSuccess$lambda2(Exception exc) {
        C19383o.m32797g(exc, "$exception");
        Events.Companion.getInstance().fire(PayPalEventTypes.FINISHED_CRYPTO_QUOTE_RESPONSE, new Error(exc.getMessage()));
    }

    public void onApiError(Exception exc) {
        C19383o.m32797g(exc, "exception");
        String str = TAG;
        C19383o.m32796f(str, "TAG");
        PLog.e$default(str, exc.getMessage(), (Throwable) null, 0, 12, (Object) null);
        runOnUiThread(new C4950e(exc, 8));
    }

    public void onApiSuccess(String str) {
        C19383o.m32797g(str, "result");
        String str2 = TAG;
        C19383o.m32796f(str2, "TAG");
        PLog.d$default(str2, str, 0, 4, (Object) null);
        try {
            runOnUiThread(new C18911f((CryptoQuoteResponse) new C16708i().mo59457d(new StringReader(str), CryptoQuoteResponse.class), 2));
        } catch (Exception e) {
            String str3 = TAG;
            C19383o.m32796f(str3, "TAG");
            PLog.e$default(str3, e.getMessage(), (Throwable) null, 0, 12, (Object) null);
            runOnUiThread(new C3251q(e, 5));
        }
    }
}
