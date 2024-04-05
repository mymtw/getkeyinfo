package com.braze.p044ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.p043ui.C4940R;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5491i;
import com.braze.p044ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.p044ui.inappmessage.listeners.C5671a;
import com.braze.p044ui.inappmessage.listeners.C5673c;
import com.braze.p044ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.p044ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.p044ui.inappmessage.views.InAppMessageHtmlFullView;
import com.braze.p044ui.support.ViewUtils;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p114g4.C6876n;

/* renamed from: com.braze.ui.inappmessage.factories.c */
public final class C5649c implements C6876n {

    /* renamed from: b */
    public final C5673c f12068b;

    public C5649c(C5671a aVar) {
        this.f12068b = aVar;
    }

    /* renamed from: a */
    public final View mo1126a(Activity activity, C5483a aVar) {
        C19383o.m32797g(activity, "activity");
        C19383o.m32797g(aVar, "inAppMessage");
        View inflate = activity.getLayoutInflater().inflate(C4940R.C4943layout.com_braze_inappmessage_html_full, (ViewGroup) null);
        if (inflate != null) {
            InAppMessageHtmlFullView inAppMessageHtmlFullView = (InAppMessageHtmlFullView) inflate;
            Context applicationContext = activity.getApplicationContext();
            C19383o.m32796f(applicationContext, "activity.applicationContext");
            if (new BrazeConfigurationProvider(applicationContext).isTouchModeRequiredForHtmlInAppMessages()) {
                String str = ViewUtils.f12100a;
                if (!inAppMessageHtmlFullView.isInTouchMode()) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageHtmlFullViewFactory$createInAppMessageView$1.INSTANCE, 6);
                    return null;
                }
            }
            Context applicationContext2 = activity.getApplicationContext();
            C5491i iVar = (C5491i) aVar;
            C19383o.m32796f(applicationContext2, ResponseConstants.CONTEXT);
            InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(applicationContext2, iVar);
            inAppMessageHtmlFullView.setWebViewContent(aVar.getMessage(), iVar.f11802z);
            inAppMessageHtmlFullView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext2, aVar, this.f12068b));
            inAppMessageHtmlFullView.getMessageWebView().addJavascriptInterface(inAppMessageJavascriptInterface, InAppMessageHtmlBaseView.BRAZE_BRIDGE_PREFIX);
            return inAppMessageHtmlFullView;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlFullView");
    }
}
