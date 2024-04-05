package com.braze.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.Braze;
import com.braze.C5382c;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.p044ui.BrazeDeeplinkHandler;
import com.braze.p044ui.actions.UriAction;
import com.braze.p044ui.support.UriUtils;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p250u0.C8100m;
import p301z3.C8431a;

public final class BrazeNotificationUtils {

    /* renamed from: a */
    public static final BrazeNotificationUtils f11857a = new BrazeNotificationUtils();

    /* renamed from: b */
    public static final String f11858b = BrazeLogger.m11287i(BrazeNotificationUtils.class);

    /* renamed from: c */
    public static final String f11859c = ".intent.APPBOY_NOTIFICATION_OPENED";

    /* renamed from: d */
    public static final String f11860d = ".intent.APPBOY_PUSH_RECEIVED";

    /* renamed from: e */
    public static final String f11861e = ".intent.APPBOY_PUSH_DELETED";

    public enum BrazeNotificationBroadcastType {
        OPENED(BrazePushEventType.NOTIFICATION_OPENED),
        RECEIVED(BrazePushEventType.NOTIFICATION_RECEIVED),
        DELETED(BrazePushEventType.NOTIFICATION_DELETED);
        
        private final BrazePushEventType brazePushEventType;

        private BrazeNotificationBroadcastType(BrazePushEventType brazePushEventType2) {
            this.brazePushEventType = brazePushEventType2;
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    /* renamed from: com.braze.push.BrazeNotificationUtils$a */
    public /* synthetic */ class C5514a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11862a;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            f11862a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m11199a(Context context, int i) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        try {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$cancelNotification$1(i), 7);
            Intent intent = new Intent(Constants.APPBOY_CANCEL_NOTIFICATION_ACTION).setClass(context, m11200b());
            C19383o.m32796f(intent, "Intent(Constants.BRAZE_C…otificationReceiverClass)");
            intent.setPackage(context.getPackageName());
            intent.putExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID, i);
            IntentUtils.m11306a(context, intent);
        } catch (Exception e) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, BrazeLogger.Priority.E, e, BrazeNotificationUtils$cancelNotification$2.INSTANCE, 4);
        }
    }

    /* renamed from: b */
    public static final Class<?> m11200b() {
        return C5382c.f11528a ? BrazeAmazonDeviceMessagingReceiver.class : BrazePushReceiver.class;
    }

    /* renamed from: c */
    public static final String m11201c(BrazeNotificationPayload brazeNotificationPayload) {
        C19383o.m32797g(brazeNotificationPayload, "payload");
        String notificationChannelId = brazeNotificationPayload.getNotificationChannelId();
        Context context = brazeNotificationPayload.getContext();
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        String str = null;
        Object systemService = context == null ? null : context.getSystemService("notification");
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationChannelId != null) {
                if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getOrCreateNotificationChannelId$1(notificationChannelId), 7);
                    return notificationChannelId;
                }
                BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getOrCreateNotificationChannelId$2(notificationChannelId), 7);
            }
            if (notificationManager.getNotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID) == null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$getOrCreateNotificationChannelId$3.INSTANCE, 7);
                NotificationChannel notificationChannel = new NotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID, configurationProvider == null ? null : configurationProvider.getDefaultNotificationChannelName(), 3);
                if (configurationProvider != null) {
                    str = configurationProvider.getDefaultNotificationChannelDescription();
                }
                notificationChannel.setDescription(str);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            return Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    /* renamed from: d */
    public static final void m11202d(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(Constants.APPBOY_PUSH_EXTRAS_KEY);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY));
        bundleExtra.putString("source", Constants.APPBOY);
        String stringExtra = intent.getStringExtra(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        if (!(stringExtra == null || C19457k.m33020X0(stringExtra))) {
            boolean W0 = C19457k.m33019W0("true", intent.getStringExtra(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY), true);
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$1(stringExtra, W0), 7);
            bundleExtra.putString(Constants.APPBOY_PUSH_DEEP_LINK_KEY, stringExtra);
            bundleExtra.putBoolean(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY, W0);
            UriAction a = BrazeDeeplinkHandler.f12011a.mo16169a(stringExtra, bundleExtra, W0, Channel.PUSH);
            if (a != null) {
                a.mo16178a(context);
                return;
            }
            return;
        }
        Intent a2 = UriUtils.m11472a(context, bundleExtra);
        BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$3(a2), 7);
        context.startActivity(a2);
    }

    /* renamed from: e */
    public static final void m11203e(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeNotificationUtils brazeNotificationUtils = f11857a;
        BrazeLogger.m11282d(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$sendNotificationOpenedBroadcast$1.INSTANCE, 7);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            brazeNotificationUtils.mo16053f(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, (Bundle) null, context, (BrazeConfigurationProvider) null, 10, (DefaultConstructorMarker) null));
            return;
        }
        brazeNotificationUtils.mo16053f(context, BrazeNotificationBroadcastType.OPENED, extras, (BrazeNotificationPayload) null);
    }

    /* renamed from: g */
    public static final void m11204g(Context context, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeNotificationUtils brazeNotificationUtils = f11857a;
        BrazeLogger.m11282d(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$sendPushMessageReceivedBroadcast$1.INSTANCE, 7);
        brazeNotificationUtils.mo16053f(context, BrazeNotificationBroadcastType.RECEIVED, bundle, brazeNotificationPayload);
    }

    /* renamed from: h */
    public static final void m11205h(C8100m mVar, BrazeNotificationPayload brazeNotificationPayload) {
        C19383o.m32797g(brazeNotificationPayload, "payload");
        Integer accentColor = brazeNotificationPayload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setAccentColorIfPresentAndSupported$1.INSTANCE, 7);
            mVar.f17677u = accentColor.intValue();
            return;
        }
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setAccentColorIfPresentAndSupported$2$1.INSTANCE, 7);
            mVar.f17677u = configurationProvider.getDefaultNotificationAccentColor();
        }
    }

    /* renamed from: i */
    public static final void m11206i(C8100m mVar, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        C19383o.m32797g(brazeNotificationPayload, "payload");
        BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setContentIfPresent$1.INSTANCE, 7);
        String contentText = brazeNotificationPayload.getContentText();
        if (contentText != null && (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) != null) {
            mVar.mo20690d(HtmlUtils.m11217a(contentText, configurationProvider));
        }
    }

    /* renamed from: j */
    public static final void m11207j(BrazeConfigurationProvider brazeConfigurationProvider, C8100m mVar) {
        int smallNotificationIconResourceId = brazeConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSmallIcon$1.INSTANCE, 7);
            smallNotificationIconResourceId = brazeConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSmallIcon$2.INSTANCE, 7);
        }
        mVar.f17655C.icon = smallNotificationIconResourceId;
    }

    /* renamed from: k */
    public static final void m11208k(C8100m mVar, BrazeNotificationPayload brazeNotificationPayload) {
        C19383o.m32797g(brazeNotificationPayload, "payload");
        String summaryText = brazeNotificationPayload.getSummaryText();
        if (summaryText != null) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$1.INSTANCE, 7);
            mVar.f17669m = C8100m.m16287c(summaryText);
            return;
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$2.INSTANCE, 7);
    }

    /* renamed from: l */
    public static final void m11209l(C8100m mVar, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        C19383o.m32797g(brazeNotificationPayload, "payload");
        BrazeLogger.m11282d(BrazeLogger.f11932a, f11857a, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setTitleIfPresent$1.INSTANCE, 7);
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText != null && (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) != null) {
            mVar.mo20691e(HtmlUtils.m11217a(titleText, configurationProvider));
        }
    }

    /* renamed from: f */
    public final void mo16053f(Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        Intent intent;
        Intent intent2;
        Context context2 = context;
        BrazeNotificationBroadcastType brazeNotificationBroadcastType2 = brazeNotificationBroadcastType;
        Bundle bundle2 = bundle;
        BrazeNotificationPayload brazeNotificationPayload2 = brazeNotificationPayload;
        int i = C5514a.f11862a[brazeNotificationBroadcastType.ordinal()];
        if (i == 1) {
            intent2 = new Intent(C19383o.m32802l(f11859c, context.getPackageName()));
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED).setPackage(context.getPackageName());
            C19383o.m32796f(intent, "Intent(Constants.BRAZE_P…kage(context.packageName)");
        } else if (i == 2) {
            intent2 = new Intent(C19383o.m32802l(f11860d, context.getPackageName()));
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED).setPackage(context.getPackageName());
            C19383o.m32796f(intent, "Intent(Constants.BRAZE_P…kage(context.packageName)");
        } else if (i == 3) {
            intent2 = new Intent(C19383o.m32802l(f11861e, context.getPackageName()));
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_DELETED).setPackage(context.getPackageName());
            C19383o.m32796f(intent, "Intent(Constants.BRAZE_P…kage(context.packageName)");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new BrazeNotificationUtils$sendPushActionIntent$1(brazeNotificationBroadcastType2), 6);
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new BrazeNotificationUtils$sendPushActionIntent$3(intent2), 6);
        if (bundle2 != null) {
            intent2.putExtras(bundle2);
        }
        IntentUtils.m11306a(context2, intent2);
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new BrazeNotificationUtils$sendPushActionIntent$2(brazeNotificationBroadcastType2), 6);
        BrazeLogger.m11282d(brazeLogger, this, priority, (Throwable) null, new BrazeNotificationUtils$sendPushActionIntent$3(intent), 6);
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        IntentUtils.m11306a(context2, intent);
        if (brazeNotificationPayload2 != null) {
            BrazePushEventType brazePushEventType = brazeNotificationBroadcastType.getBrazePushEventType();
            C19383o.m32797g(brazePushEventType, "pushActionType");
            Braze.f11170m.mo15515f(context2).f11190i.mo13286a(new C8431a(brazePushEventType, brazeNotificationPayload2), C8431a.class);
        }
    }
}
