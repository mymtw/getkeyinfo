package com.braze.p044ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.models.inappmessage.C5484b;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import java.math.BigDecimal;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;
import p114g4.C6861b;

/* renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface */
public final class InAppMessageJavascriptInterface {

    /* renamed from: a */
    public final Context f12072a;

    /* renamed from: b */
    public final C5484b f12073b;

    /* renamed from: c */
    public final InAppMessageUserJavascriptInterface f12074c;

    public InAppMessageJavascriptInterface(Context context, C5484b bVar) {
        C19383o.m32797g(bVar, "inAppMessage");
        this.f12072a = context;
        this.f12073b = bVar;
        this.f12074c = new InAppMessageUserJavascriptInterface(context);
    }

    /* renamed from: a */
    public final BrazeProperties mo16270a(String str) {
        if (str == null) {
            return null;
        }
        try {
            if (C19383o.m32792b(str, "undefined") || C19383o.m32792b(str, "null")) {
                return null;
            }
            return new BrazeProperties(new JSONObject(str));
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new InAppMessageJavascriptInterface$parseProperties$1(str), 4);
            return null;
        }
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.f12074c;
    }

    @JavascriptInterface
    public final void logButtonClick(String str) {
        if (str != null) {
            this.f12073b.mo16009J(str);
        }
    }

    @JavascriptInterface
    public final void logClick() {
        this.f12073b.logClick();
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String str, String str2) {
        Braze.f11170m.mo15515f(this.f12072a).mo15501q(str, mo16270a(str2));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String str, double d, String str2, int i, String str3) {
        String str4 = str;
        String str5 = str2;
        Braze.f11170m.mo15515f(this.f12072a).mo15503s(str4, str5, new BigDecimal(String.valueOf(d)), i, mo16270a(str3));
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.f11170m.mo15515f(this.f12072a).mo15510z();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        PermissionUtils.m11332b(C6861b.m13319e().f15220b);
    }
}
