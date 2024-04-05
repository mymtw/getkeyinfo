package com.braze.p044ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import com.appsflyer.AppsFlyerProperties;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.p044ui.actions.UriAction;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;

/* renamed from: com.braze.ui.BrazeDeeplinkHandler */
public final class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {

    /* renamed from: a */
    public static final BrazeDeeplinkHandler f12011a = new BrazeDeeplinkHandler();

    /* renamed from: com.braze.ui.BrazeDeeplinkHandler$a */
    public /* synthetic */ class C5622a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12012a;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            f12012a = iArr;
        }
    }

    /* renamed from: a */
    public final UriAction mo16169a(String str, Bundle bundle, boolean z, Channel channel) {
        C19383o.m32797g(str, "url");
        C19383o.m32797g(channel, AppsFlyerProperties.CHANNEL);
        try {
            if (!C19457k.m33020X0(str)) {
                Uri parse = Uri.parse(str);
                C19383o.m32796f(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                return new UriAction(parse, bundle, z, channel);
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, (Throwable) null, BrazeDeeplinkHandler$createUriActionFromUrlString$1.INSTANCE, 6);
            return null;
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, BrazeDeeplinkHandler$createUriActionFromUrlString$2.INSTANCE, 4);
        }
    }

    /* renamed from: b */
    public final void mo16170b(Context context, UriAction uriAction) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        uriAction.mo16178a(context);
    }
}
