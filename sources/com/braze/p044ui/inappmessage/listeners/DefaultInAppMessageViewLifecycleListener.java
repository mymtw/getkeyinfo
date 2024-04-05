package com.braze.p044ui.inappmessage.listeners;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.appboy.enums.Channel;
import com.appsflyer.AppsFlyerProperties;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.C5483a;
import com.braze.models.inappmessage.C5484b;
import com.braze.models.inappmessage.C5485c;
import com.braze.models.inappmessage.MessageButton;
import com.braze.p044ui.actions.NewsfeedAction;
import com.braze.p044ui.actions.UriAction;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p114g4.C6861b;
import p114g4.C6878p;
import p628nj.C18263b;

/* renamed from: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener */
public final class DefaultInAppMessageViewLifecycleListener implements C5672b {

    /* renamed from: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$a */
    public /* synthetic */ class C5665a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12077a;

        static {
            int[] iArr = new int[ClickAction.values().length];
            iArr[ClickAction.NEWS_FEED.ordinal()] = 1;
            iArr[ClickAction.URI.ordinal()] = 2;
            iArr[ClickAction.NONE.ordinal()] = 3;
            f12077a = iArr;
        }
    }

    /* renamed from: e */
    public static C6861b m11449e() {
        C6861b e = C6861b.m13319e();
        C19383o.m32796f(e, "getInstance()");
        return e;
    }

    /* renamed from: a */
    public final void mo16318a(C5483a aVar) {
        C19383o.m32797g(aVar, "inAppMessage");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$afterClosed$1.INSTANCE, 7);
        m11449e().mo18987h();
        if (aVar instanceof C5484b) {
            C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new C5666x480878f2((C19340c<? super C5666x480878f2>) null), 3);
        }
        aVar.mo15968Z();
        m11449e().f15229k.getClass();
    }

    /* renamed from: b */
    public final void mo16319b(View view, C5483a aVar) {
        C19383o.m32797g(view, "inAppMessageView");
        C19383o.m32797g(aVar, "inAppMessage");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$afterOpened$1.INSTANCE, 7);
        m11449e().f15229k.getClass();
    }

    /* renamed from: c */
    public final void mo16320c(View view, C5483a aVar) {
        C19383o.m32797g(view, "inAppMessageView");
        C19383o.m32797g(aVar, "inAppMessage");
        m11449e().f15229k.getClass();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$beforeClosed$1.INSTANCE, 7);
    }

    /* renamed from: d */
    public final void mo16321d(View view, C5483a aVar) {
        C19383o.m32797g(view, "inAppMessageView");
        C19383o.m32797g(aVar, "inAppMessage");
        m11449e().f15229k.getClass();
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$beforeOpened$1.INSTANCE, 7);
        aVar.logImpression();
    }

    /* renamed from: f */
    public final void mo16322f(C6878p pVar, MessageButton messageButton, C5485c cVar) {
        C19383o.m32797g(pVar, "inAppMessageCloser");
        C19383o.m32797g(messageButton, "messageButton");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onButtonClicked$1.INSTANCE, 7);
        cVar.mo16016H(messageButton);
        try {
            m11449e().f15229k.getClass();
            throw BrazeFunctionNotImplemented.INSTANCE;
        } catch (BrazeFunctionNotImplemented unused) {
            m11449e().f15229k.getClass();
            mo16325i(messageButton.f11832e, cVar, pVar, messageButton.f11833f, messageButton.f11835h);
        }
    }

    /* renamed from: g */
    public final void mo16323g(C6878p pVar, View view, C5483a aVar) {
        C19383o.m32797g(pVar, "inAppMessageCloser");
        C19383o.m32797g(view, "inAppMessageView");
        C19383o.m32797g(aVar, "inAppMessage");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onClicked$1.INSTANCE, 7);
        aVar.logClick();
        try {
            m11449e().f15229k.getClass();
            throw BrazeFunctionNotImplemented.INSTANCE;
        } catch (BrazeFunctionNotImplemented unused) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$2.INSTANCE, 7);
            m11449e().f15229k.getClass();
            mo16325i(aVar.mo15970b0(), aVar, pVar, aVar.getUri(), aVar.getOpenUriInWebView());
        }
    }

    /* renamed from: h */
    public final void mo16324h(View view, C5483a aVar) {
        C19383o.m32797g(view, "inAppMessageView");
        C19383o.m32797g(aVar, "inAppMessage");
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onDismissed$1.INSTANCE, 7);
        m11449e().f15229k.getClass();
    }

    /* renamed from: i */
    public final void mo16325i(ClickAction clickAction, C5483a aVar, C6878p pVar, Uri uri, boolean z) {
        Activity activity = m11449e().f15220b;
        if (activity == null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageViewLifecycleListener$performClickAction$1.INSTANCE, 6);
            return;
        }
        int i = C5665a.f12077a[clickAction.ordinal()];
        if (i == 1) {
            pVar.mo19007a(false);
            new NewsfeedAction(C18263b.m30865r0(aVar.getExtras()), Channel.INAPP_MESSAGE).mo16178a(activity);
        } else if (i == 2) {
            pVar.mo19007a(false);
            if (uri == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$performClickAction$2.INSTANCE, 7);
                return;
            }
            Bundle r0 = C18263b.m30865r0(aVar.getExtras());
            Channel channel = Channel.INAPP_MESSAGE;
            C19383o.m32797g(channel, AppsFlyerProperties.CHANNEL);
            UriAction uriAction = new UriAction(uri, r0, z, channel);
            Context context = m11449e().f15221c;
            if (context == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$performClickAction$3.INSTANCE, 7);
                return;
            }
            uriAction.mo16178a(context);
        } else if (i != 3) {
            pVar.mo19007a(false);
        } else {
            pVar.mo19007a(aVar.mo15965U());
        }
    }
}
