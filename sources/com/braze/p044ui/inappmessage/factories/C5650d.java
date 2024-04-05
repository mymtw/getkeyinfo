package com.braze.p044ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.p043ui.C4940R;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5490h;
import com.braze.p044ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.p044ui.inappmessage.listeners.C5671a;
import com.braze.p044ui.inappmessage.listeners.C5673c;
import com.braze.p044ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.p044ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.p044ui.inappmessage.views.InAppMessageHtmlView;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p114g4.C6876n;

/* renamed from: com.braze.ui.inappmessage.factories.d */
public final class C5650d implements C6876n {

    /* renamed from: b */
    public final C5673c f12069b;

    public C5650d(C5671a aVar) {
        this.f12069b = aVar;
    }

    /* renamed from: a */
    public final View mo1126a(Activity activity, C5483a aVar) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(aVar, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        View inflate = activity.getLayoutInflater().inflate(C4940R.C4943layout.com_braze_inappmessage_html, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) inflate;
            C19383o.m32796f(applicationContext, ResponseConstants.CONTEXT);
            if (new BrazeConfigurationProvider(applicationContext).isTouchModeRequiredForHtmlInAppMessages()) {
                String str = ViewUtils.f12100a;
                if (!inAppMessageHtmlView.isInTouchMode()) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1.INSTANCE, 6);
                    return null;
                }
            }
            C5490h hVar = (C5490h) aVar;
            InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(applicationContext, hVar);
            inAppMessageHtmlView.setWebViewContent(hVar.f11753d);
            Context applicationContext2 = activity.getApplicationContext();
            C19383o.m32796f(applicationContext2, "activity.applicationContext");
            inAppMessageHtmlView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext2, hVar, this.f12069b));
            inAppMessageHtmlView.getMessageWebView().addJavascriptInterface(inAppMessageJavascriptInterface, InAppMessageHtmlBaseView.BRAZE_BRIDGE_PREFIX);
            return inAppMessageHtmlView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlView");
    }
}
