package com.braze.p044ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.braze.Braze;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5484b;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.p044ui.BrazeDeeplinkHandler;
import com.braze.p044ui.actions.NewsfeedAction;
import com.braze.p044ui.actions.UriAction;
import com.braze.p044ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p114g4.C6861b;
import p628nj.C18263b;

/* renamed from: com.braze.ui.inappmessage.listeners.a */
public class C5671a implements C5673c {
    private static final String HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY = "name";
    private static final String TAG = BrazeLogger.m11287i(C5671a.class);

    private C6861b getInAppMessageManager() {
        return C6861b.m13319e();
    }

    public static void logHtmlInAppMessageClick(C5483a aVar, Bundle bundle) {
        if (bundle != null && bundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID)) {
            ((C5484b) aVar).mo16009J(bundle.getString(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID));
        } else if (aVar.mo16002R() == MessageType.HTML_FULL) {
            aVar.logClick();
        }
    }

    public static String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return bundle.getString("name");
    }

    public static BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
        BrazeProperties brazeProperties = new BrazeProperties();
        for (String next : bundle.keySet()) {
            if (!next.equals("name")) {
                String string = bundle.getString(next, (String) null);
                if (!StringUtils.m11343d(string)) {
                    brazeProperties.mo16038a(string, next);
                }
            }
        }
        return brazeProperties;
    }

    public static boolean parseUseWebViewFromQueryBundle(C5483a aVar, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (bundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK)) {
            z2 = Boolean.parseBoolean(bundle.getString(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK));
            z = true;
        } else {
            z2 = false;
            z = false;
        }
        if (bundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN)) {
            z3 = Boolean.parseBoolean(bundle.getString(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN));
            z = true;
        } else {
            z3 = false;
        }
        boolean openUriInWebView = aVar.getOpenUriInWebView();
        if (!z) {
            return openUriInWebView;
        }
        if (z2 || z3) {
            z4 = false;
        }
        return z4;
    }

    public void onCloseAction(C5483a aVar, String str, Bundle bundle) {
        BrazeLogger.m11285g(TAG, "IInAppMessageWebViewClientListener.onCloseAction called.");
        logHtmlInAppMessageClick(aVar, bundle);
        getInAppMessageManager().mo18985f(true);
        getInAppMessageManager().f15222d.getClass();
        C19383o.m32797g(aVar, "inAppMessage");
        C19383o.m32797g(str, "url");
        C19383o.m32797g(bundle, "queryBundle");
    }

    public void onCustomEventAction(C5483a aVar, String str, Bundle bundle) {
        String str2 = TAG;
        BrazeLogger.m11285g(str2, "IInAppMessageWebViewClientListener.onCustomEventAction called.");
        if (getInAppMessageManager().f15220b == null) {
            BrazeLogger.m11292n(str2, "Can't perform custom event action because the activity is null.");
            return;
        }
        getInAppMessageManager().f15222d.getClass();
        C19383o.m32797g(aVar, "inAppMessage");
        C19383o.m32797g(str, "url");
        C19383o.m32797g(bundle, "queryBundle");
        String parseCustomEventNameFromQueryBundle = parseCustomEventNameFromQueryBundle(bundle);
        if (!StringUtils.m11343d(parseCustomEventNameFromQueryBundle)) {
            Braze.m10643o(getInAppMessageManager().f15220b).mo15501q(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle(bundle));
        }
    }

    public void onNewsfeedAction(C5483a aVar, String str, Bundle bundle) {
        String str2 = TAG;
        BrazeLogger.m11285g(str2, "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
        if (getInAppMessageManager().f15220b == null) {
            BrazeLogger.m11292n(str2, "Can't perform news feed action because the cached activity is null.");
            return;
        }
        logHtmlInAppMessageClick(aVar, bundle);
        getInAppMessageManager().f15222d.getClass();
        C19383o.m32797g(aVar, "inAppMessage");
        C19383o.m32797g(str, "url");
        C19383o.m32797g(bundle, "queryBundle");
        aVar.mo15963S(false);
        getInAppMessageManager().mo18985f(false);
        NewsfeedAction newsfeedAction = new NewsfeedAction(C18263b.m30865r0(aVar.getExtras()), Channel.INAPP_MESSAGE);
        Activity activity = getInAppMessageManager().f15220b;
        C19383o.m32797g(activity, ResponseConstants.CONTEXT);
        newsfeedAction.mo16178a(activity);
    }

    public void onOtherUrlAction(C5483a aVar, String str, Bundle bundle) {
        String str2 = TAG;
        BrazeLogger.m11285g(str2, "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
        if (getInAppMessageManager().f15220b == null) {
            BrazeLogger.m11292n(str2, "Can't perform other url action because the cached activity is null. Url: " + str);
            return;
        }
        logHtmlInAppMessageClick(aVar, bundle);
        getInAppMessageManager().f15222d.getClass();
        C19383o.m32797g(aVar, "inAppMessage");
        C19383o.m32797g(str, "url");
        C19383o.m32797g(bundle, "queryBundle");
        boolean parseUseWebViewFromQueryBundle = parseUseWebViewFromQueryBundle(aVar, bundle);
        Bundle r0 = C18263b.m30865r0(aVar.getExtras());
        r0.putAll(bundle);
        BrazeDeeplinkHandler brazeDeeplinkHandler = BrazeDeeplinkHandler.f12011a;
        UriAction a = brazeDeeplinkHandler.mo16169a(str, r0, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (a == null) {
            BrazeLogger.m11292n(str2, "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str);
            return;
        }
        Uri uri = a.f12016c;
        if (BrazeFileUtils.m11240d(uri)) {
            BrazeLogger.m11292n(str2, "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str);
            return;
        }
        aVar.mo15963S(false);
        getInAppMessageManager().mo18985f(false);
        brazeDeeplinkHandler.mo16170b(getInAppMessageManager().f15220b, a);
    }
}
