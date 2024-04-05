package com.etsy.android.lib.push.handler;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.AnalyticsLogDatabaseHelper;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.push.registration.C8837j;
import com.etsy.android.lib.push.settings.NotificationSettings;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p346fa.C12703a;
import p350fe.C12724a;
import p350fe.C12726c;
import p350fe.C12739m;
import p426qa.C13275a;
import p426qa.C13276b;
import p426qa.C13278d;
import p434ra.C13338f;
import p434ra.C13341h;
import p434ra.C13346l;
import p440s9.C13366a;

public final class FirebasePushService extends FirebaseMessagingService implements C13366a {
    public static final int $stable = 8;
    public C12724a deepLinkEligibility;
    public C12726c deepLinkErrorLogger;
    public C12703a grafana;
    public C8694h log;
    public C13275a messageHandler;
    public C13341h notificationActionProvider;
    public C13338f notificationBuilder;
    public C13278d notificationRepo;
    public NotificationSettings notificationSettings;
    public C8837j pushRegistration;
    public C13276b pushServiceCallbacks;
    public C12739m routeGenerator;
    public C13346l styleInstanceProvider;

    public FirebasePushService() {
    }

    public final C12724a getDeepLinkEligibility() {
        C12724a aVar = this.deepLinkEligibility;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("deepLinkEligibility");
        throw null;
    }

    public final C12726c getDeepLinkErrorLogger() {
        C12726c cVar = this.deepLinkErrorLogger;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("deepLinkErrorLogger");
        throw null;
    }

    public final C12703a getGrafana() {
        C12703a aVar = this.grafana;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("grafana");
        throw null;
    }

    public final C8694h getLog() {
        C8694h hVar = this.log;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o(AnalyticsLogDatabaseHelper.LOG);
        throw null;
    }

    public final C13275a getMessageHandler() {
        C13275a aVar = this.messageHandler;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("messageHandler");
        throw null;
    }

    public final C13341h getNotificationActionProvider() {
        C13341h hVar = this.notificationActionProvider;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("notificationActionProvider");
        throw null;
    }

    public final C13338f getNotificationBuilder() {
        C13338f fVar = this.notificationBuilder;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("notificationBuilder");
        throw null;
    }

    public final C13278d getNotificationRepo() {
        C13278d dVar = this.notificationRepo;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("notificationRepo");
        throw null;
    }

    public final NotificationSettings getNotificationSettings() {
        NotificationSettings notificationSettings2 = this.notificationSettings;
        if (notificationSettings2 != null) {
            return notificationSettings2;
        }
        C19383o.m32805o("notificationSettings");
        throw null;
    }

    public final C8837j getPushRegistration() {
        C8837j jVar = this.pushRegistration;
        if (jVar != null) {
            return jVar;
        }
        C19383o.m32805o("pushRegistration");
        throw null;
    }

    public final C13276b getPushServiceCallbacks() {
        C13276b bVar = this.pushServiceCallbacks;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("pushServiceCallbacks");
        throw null;
    }

    public final C12739m getRouteGenerator() {
        C12739m mVar = this.routeGenerator;
        if (mVar != null) {
            return mVar;
        }
        C19383o.m32805o("routeGenerator");
        throw null;
    }

    public final C13346l getStyleInstanceProvider() {
        C13346l lVar = this.styleInstanceProvider;
        if (lVar != null) {
            return lVar;
        }
        C19383o.m32805o("styleInstanceProvider");
        throw null;
    }

    public void onCreate() {
        C0761x.m1732l0(this);
        super.onCreate();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMessageReceived(com.google.firebase.messaging.RemoteMessage r26) {
        /*
            r25 = this;
            r7 = r25
            r0 = r26
            java.lang.String r1 = "message"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            super.onMessageReceived(r26)
            qa.a r1 = r25.getMessageHandler()
            boolean r1 = r1.mo45824b(r0)
            if (r1 == 0) goto L_0x001f
            qa.a r1 = r25.getMessageHandler()
            r1.mo45825c(r0)
            goto L_0x046a
        L_0x001f:
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.util.Map r1 = r26.getData()
            java.lang.String r2 = "this.data"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0035:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r15.putString(r3, r2)
            goto L_0x0035
        L_0x0051:
            java.lang.String r0 = r26.getFrom()
            java.lang.String r1 = "etsynotify/delete"
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r1, r0)
            java.lang.String r6 = "o"
            java.lang.String r5 = "t"
            if (r0 == 0) goto L_0x0081
            ra.f r0 = r25.getNotificationBuilder()
            r0.getClass()
            java.lang.String r0 = r15.getString(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x007d
            com.etsy.android.lib.util.NotificationType r0 = com.etsy.android.lib.util.NotificationType.fromString(r0)
            ra.e r0 = p434ra.C13343j.m20997a(r0)
            r0.mo46034h()
        L_0x007d:
            r9 = r5
            r8 = r6
            goto L_0x043f
        L_0x0081:
            java.lang.String r0 = "alert"
            java.lang.String r1 = r15.getString(r0)
            java.lang.String r2 = "utm_campaign"
            java.lang.String r3 = "utm_source"
            java.lang.String r4 = "utm_medium"
            if (r1 == 0) goto L_0x040d
            ra.f r1 = r25.getNotificationBuilder()
            java.lang.String r0 = r15.getString(r0)
            java.lang.String r8 = "p"
            java.lang.String r8 = r15.getString(r8)
            java.lang.String r14 = r15.getString(r6)
            com.etsy.android.lib.push.settings.NotificationSettings r13 = r25.getNotificationSettings()
            ra.h r12 = r25.getNotificationActionProvider()
            u0.m r11 = new u0.m
            r9 = 0
            r11.<init>(r7, r9)
            ra.l r9 = r25.getStyleInstanceProvider()
            fa.a r10 = r25.getGrafana()
            r26 = r2
            fe.m r2 = r25.getRouteGenerator()
            r16 = r4
            fe.a r4 = r25.getDeepLinkEligibility()
            r17 = r3
            fe.c r3 = r25.getDeepLinkErrorLogger()
            r1.getClass()
            java.lang.String r1 = "notificationSettings"
            kotlin.jvm.internal.C19383o.m32797g(r13, r1)
            java.lang.String r1 = "notificationManagerProvider"
            kotlin.jvm.internal.C19383o.m32797g(r12, r1)
            java.lang.String r1 = "styleInstanceProvider"
            kotlin.jvm.internal.C19383o.m32797g(r9, r1)
            java.lang.String r1 = "grafana"
            kotlin.jvm.internal.C19383o.m32797g(r10, r1)
            java.lang.String r1 = "routeGenerator"
            kotlin.jvm.internal.C19383o.m32797g(r2, r1)
            java.lang.String r1 = "deepLinkEligibility"
            kotlin.jvm.internal.C19383o.m32797g(r4, r1)
            java.lang.String r1 = "deepLinkErrorLogger"
            kotlin.jvm.internal.C19383o.m32797g(r3, r1)
            java.lang.String r1 = "branch_force_new_session"
            r18 = r12
            r12 = 1
            r15.putBoolean(r1, r12)
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.fromPushNotificationId(r8)
            java.lang.String r8 = r15.getString(r5)
            com.etsy.android.lib.util.NotificationType r8 = com.etsy.android.lib.util.NotificationType.fromString(r8)
            ra.e r12 = p434ra.C13343j.m20997a(r8)
            r12.getClass()
            java.lang.String r8 = "large_icon"
            java.lang.String r8 = r15.getString(r8)
            r19 = r6
            java.lang.String r6 = r15.getString(r5)
            r20 = r13
            com.etsy.android.lib.util.NotificationType r13 = com.etsy.android.lib.util.NotificationType.fromString(r6)
            r12.f29264a = r13
            java.lang.String r13 = "n"
            r21 = r5
            java.lang.String r5 = r15.getString(r13)
            r12.f29265b = r5
            com.etsy.android.lib.util.NotificationType r5 = r12.f29264a
            r22 = r13
            com.etsy.android.lib.util.NotificationType r13 = com.etsy.android.lib.util.NotificationType.UNKNOWN
            if (r5 != r13) goto L_0x014f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "notifications.unknown."
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r10.mo45474a(r0)
            r11 = 0
            r14 = r11
            r13 = r12
            r11 = r18
            r8 = r19
            r9 = r21
            goto L_0x0401
        L_0x014f:
            u0.q r5 = r12.mo46033g(r9, r7, r15, r0)
            r11.mo20696j(r5)
            int r5 = r12.mo46032f(r15)
            if (r5 <= 0) goto L_0x0162
            int r5 = r12.mo46032f(r15)
            r11.f17665i = r5
        L_0x0162:
            r5 = 2131231761(0x7f080411, float:1.8079612E38)
            android.app.Notification r9 = r11.f17655C
            r9.icon = r5
            java.lang.CharSequence r5 = p250u0.C8100m.m16287c(r0)
            r9.tickerText = r5
            long r9 = java.lang.System.currentTimeMillis()
            android.app.Notification r5 = r11.f17655C
            r5.when = r9
            java.lang.CharSequence r0 = r12.mo46030b(r7, r0)
            r11.mo20690d(r0)
            java.lang.CharSequence r0 = r12.mo46031c(r7, r15)
            r11.mo20691e(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0206
            java.lang.String r0 = "window"
            java.lang.Object r0 = r7.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r5)
            float r0 = com.etsy.android.lib.util.C8914m.f19669c
            r9 = 0
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x01a9
            com.etsy.android.lib.util.C8914m.m17348f(r25)
        L_0x01a9:
            int r0 = r5.densityDpi
            float r0 = (float) r0
            r5 = 1126170624(0x43200000, float:160.0)
            float r0 = r0 / r5
            r5 = 1115684864(0x42800000, float:64.0)
            float r0 = r0 * r5
            int r0 = (int) r0
            com.etsy.android.lib.core.img.GlideRequests r5 = androidx.activity.C0114h.m270B0(r25)     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            u9.b r5 = r5.asBitmap()     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            com.bumptech.glide.e r5 = r5.mo16828Z(r8)     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            u9.b r5 = (p455u9.C13448b) r5     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            r5.getClass()     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            com.bumptech.glide.request.e r9 = new com.bumptech.glide.request.e     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            r9.<init>()     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            c5.e$b r10 = p036c5.C4416e.f9695b     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            r5.mo16817N(r9, r9, r5, r10)     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            java.lang.Object r5 = r9.get()     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            if (r5 == 0) goto L_0x0201
            int r9 = r5.getWidth()     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            if (r9 >= r0) goto L_0x0201
            int r9 = r5.getHeight()     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            if (r9 >= r0) goto L_0x0201
            android.graphics.Bitmap r5 = p455u9.C13452f.m21229f(r5, r0, r0)     // Catch:{ ExecutionException -> 0x01e9, InterruptedException -> 0x01e7 }
            goto L_0x0201
        L_0x01e7:
            r0 = move-exception
            goto L_0x01ea
        L_0x01e9:
            r0 = move-exception
        L_0x01ea:
            com.etsy.android.lib.logger.h r5 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Error downloading image from: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r5.mo21309d(r8, r0)
            r5 = 0
        L_0x0201:
            if (r5 == 0) goto L_0x0206
            r11.mo20694h(r5)
        L_0x0206:
            r0 = 2131099980(0x7f06014c, float:1.7812329E38)
            java.lang.Object r5 = p260v0.C8184a.f17966a
            int r0 = p260v0.C8184a.C8188d.m16468a(r7, r0)
            r11.f17677u = r0
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.etsy.android.ui.nav.NotificationActivity> r5 = com.etsy.android.p327ui.nav.NotificationActivity.class
            r0.<init>(r7, r5)
            java.lang.String r5 = "com.etsy.android.action.NOTIFICATION"
            r0.setAction(r5)
            r8 = r12
            r9 = r2
            r10 = r1
            r5 = r11
            r11 = r14
            r13 = r12
            r1 = r18
            r12 = r15
            r18 = r6
            r6 = r13
            r23 = r20
            r20 = r1
            r1 = r22
            r13 = r3
            r3 = r14
            r14 = r4
            android.net.Uri r4 = r8.mo46028e(r9, r10, r11, r12, r13, r14)
            r0.setData(r4)
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0241:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x025b
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r15.get(r8)
            if (r9 == 0) goto L_0x0241
            java.lang.String r9 = r9.toString()
            r0.putExtra(r8, r9)
            goto L_0x0241
        L_0x025b:
            r8 = r19
            r0.putExtra(r8, r3)
            com.etsy.android.lib.util.NotificationType r4 = r6.f29264a
            java.lang.String r4 = r4.getType()
            r9 = r21
            r0.putExtra(r9, r4)
            java.lang.String r4 = r6.f29265b
            r0.putExtra(r1, r4)
            r1 = r17
            java.lang.String r4 = r15.getString(r1)
            r10 = r16
            java.lang.String r11 = r15.getString(r10)
            r12 = r26
            java.lang.String r13 = r15.getString(r12)
            r0.putExtra(r1, r4)
            r0.putExtra(r10, r11)
            r0.putExtra(r12, r13)
            com.etsy.android.lib.util.NotificationType r1 = r6.f29264a
            int r1 = r1.getId()
            r4 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r7, r1, r0, r4)
            r10 = 1
            r11 = r20
            r1 = r6
            r12 = r2
            r2 = r5
            r13 = r3
            r3 = r25
            r4 = r15
            r14 = r5
            r5 = r13
            r13 = r6
            r24 = r18
            r6 = r12
            r1.mo46029a(r2, r3, r4, r5, r6)
            r1 = 16
            r14.mo20693g(r1, r10)
            r14.f17663g = r0
            java.lang.String r0 = "rawNotificationType"
            r1 = r24
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r2 = "US"
            java.lang.String r3 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r0 = android.support.p013v4.media.session.C0087d.m237g(r0, r2, r1, r0, r3)
            int r2 = r0.hashCode()
            switch(r2) {
                case -1855574366: goto L_0x03bf;
                case -1723706021: goto L_0x03af;
                case -1345902933: goto L_0x039f;
                case -1014508326: goto L_0x038f;
                case -713777919: goto L_0x037e;
                case -516235858: goto L_0x036d;
                case 94844859: goto L_0x035b;
                case 104745550: goto L_0x0349;
                case 126041073: goto L_0x0337;
                case 258760915: goto L_0x0325;
                case 735091457: goto L_0x0313;
                case 765915793: goto L_0x0301;
                case 1123293520: goto L_0x02ef;
                case 1233481129: goto L_0x02dd;
                case 1752974445: goto L_0x02cb;
                default: goto L_0x02c9;
            }
        L_0x02c9:
            goto L_0x03cf
        L_0x02cb:
            java.lang.String r2 = "reserved_listing"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x02d5
            goto L_0x03cf
        L_0x02d5:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.CONVERSATION
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x02dd:
            java.lang.String r2 = "updates_unseen"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x02e7
            goto L_0x03cf
        L_0x02e7:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.UNSEEN
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x02ef:
            java.lang.String r2 = "nearby_local_market"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x02f9
            goto L_0x03cf
        L_0x02f9:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.RECOMMENDATIONS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x0301:
            java.lang.String r2 = "following"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x030b
            goto L_0x03cf
        L_0x030b:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.MY_ACTIVITY
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x0313:
            java.lang.String r2 = "promoted_offer"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x031d
            goto L_0x03cf
        L_0x031d:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.MY_ACTIVITY
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x0325:
            java.lang.String r2 = "recommendations_for_me"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x032f
            goto L_0x03cf
        L_0x032f:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.RECOMMENDATIONS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x0337:
            java.lang.String r2 = "recently_favorited"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0341
            goto L_0x03cf
        L_0x0341:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.MY_ACTIVITY
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x0349:
            java.lang.String r2 = "nfyfs"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0353
            goto L_0x03cf
        L_0x0353:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.RECOMMENDATIONS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x035b:
            java.lang.String r2 = "convo"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0365
            goto L_0x03cf
        L_0x0365:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.CONVERSATION
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x036d:
            java.lang.String r2 = "shipping"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0376
            goto L_0x03cf
        L_0x0376:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.ORDERS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x037e:
            java.lang.String r2 = "editors_finds"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0387
            goto L_0x03cf
        L_0x0387:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.ETSY_NEWS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x038f:
            java.lang.String r2 = "new_app_features"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0398
            goto L_0x03cf
        L_0x0398:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.ETSY_NEWS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x039f:
            java.lang.String r2 = "abandoned_cart"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03a8
            goto L_0x03cf
        L_0x03a8:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.MY_ACTIVITY
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x03af:
            java.lang.String r2 = "bought_in_person"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03b8
            goto L_0x03cf
        L_0x03b8:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.ORDERS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x03bf:
            java.lang.String r2 = "review_available"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x03c8
            goto L_0x03cf
        L_0x03c8:
            com.etsy.android.lib.push.settings.NotificationSettings$NotificationGroup r0 = com.etsy.android.lib.push.settings.NotificationSettings.NotificationGroup.ORDERS
            java.lang.String r0 = r0.getGroupName()
            goto L_0x03ff
        L_0x03cf:
            r2 = r23
            ea.n r0 = r2.f19455b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "There are no channels associated with notification type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.mo45449a(r3)
            fa.a r0 = r2.f19460g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notification_settings.default_channel."
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.mo45474a(r1)
            java.lang.String r0 = "DEFAULT_ETSY_CHANNEL_ID"
        L_0x03ff:
            r14.f17682z = r0
        L_0x0401:
            if (r14 == 0) goto L_0x043f
            com.etsy.android.lib.util.NotificationType r0 = r13.f29264a
            int r0 = r0.getId()
            r11.mo46037b(r0, r14)
            goto L_0x043f
        L_0x040d:
            r12 = r2
            r1 = r3
            r10 = r4
            r9 = r5
            r8 = r6
            com.etsy.android.lib.logger.h r0 = r25.getLog()
            java.lang.String r2 = "Push didn't have alert message data"
            r0.mo21306a(r2)
            java.lang.String r0 = r15.getString(r10)
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r2 = r15.getString(r12)
            fa.a r3 = r25.getGrafana()
            java.lang.String r4 = "push_message.message_received.no_alert_data.medium:"
            java.lang.String r5 = ".source:"
            java.lang.String r6 = ".campaign:"
            java.lang.StringBuilder r0 = androidx.compose.animation.C0388a.m1050f(r4, r0, r5, r1, r6)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.mo45474a(r0)
        L_0x043f:
            qa.d r0 = r25.getNotificationRepo()
            r0.getClass()
            qa.c r1 = new qa.c
            java.lang.String r2 = r15.getString(r9)
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0451
            r2 = r3
        L_0x0451:
            java.lang.String r4 = "username"
            java.lang.String r4 = r15.getString(r4)
            if (r4 != 0) goto L_0x045a
            r4 = r3
        L_0x045a:
            java.lang.String r5 = r15.getString(r8)
            if (r5 != 0) goto L_0x0461
            goto L_0x0462
        L_0x0461:
            r3 = r5
        L_0x0462:
            r1.<init>(r2, r4, r3)
            io.reactivex.subjects.PublishSubject<qa.c> r0 = r0.f29184a
            r0.onNext(r1)
        L_0x046a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.push.handler.FirebasePushService.onMessageReceived(com.google.firebase.messaging.RemoteMessage):void");
    }

    public void onNewToken(String str) {
        C19383o.m32797g(str, UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN);
        super.onNewToken(str);
        if (!C19457k.m33020X0(str)) {
            getPushRegistration().mo30208b(str);
            getPushServiceCallbacks().mo38928a(str);
            return;
        }
        getLog().mo21306a("Attempted to register for push notifications with empty ID");
        getGrafana().mo45474a("notification_token.attempted_empty_token_upload");
    }

    public void onSendError(String str, Exception exc) {
        C19383o.m32797g(str, "message");
        C19383o.m32797g(exc, "e");
        super.onSendError(str, exc);
        C8694h log2 = getLog();
        log2.mo21306a("push_message.send_error." + str);
        C12703a grafana2 = getGrafana();
        grafana2.mo45474a("push_message.send_error." + str);
    }

    public final void setDeepLinkEligibility(C12724a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.deepLinkEligibility = aVar;
    }

    public final void setDeepLinkErrorLogger(C12726c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.deepLinkErrorLogger = cVar;
    }

    public final void setGrafana(C12703a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.grafana = aVar;
    }

    public final void setLog(C8694h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.log = hVar;
    }

    public final void setMessageHandler(C13275a aVar) {
        C19383o.m32797g(aVar, "<set-?>");
        this.messageHandler = aVar;
    }

    public final void setNotificationActionProvider(C13341h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.notificationActionProvider = hVar;
    }

    public final void setNotificationBuilder(C13338f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.notificationBuilder = fVar;
    }

    public final void setNotificationRepo(C13278d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.notificationRepo = dVar;
    }

    public final void setNotificationSettings(NotificationSettings notificationSettings2) {
        C19383o.m32797g(notificationSettings2, "<set-?>");
        this.notificationSettings = notificationSettings2;
    }

    public final void setPushRegistration(C8837j jVar) {
        C19383o.m32797g(jVar, "<set-?>");
        this.pushRegistration = jVar;
    }

    public final void setPushServiceCallbacks(C13276b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.pushServiceCallbacks = bVar;
    }

    public final void setRouteGenerator(C12739m mVar) {
        C19383o.m32797g(mVar, "<set-?>");
        this.routeGenerator = mVar;
    }

    public final void setStyleInstanceProvider(C13346l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.styleInstanceProvider = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FirebasePushService(C8837j jVar, C8694h hVar, C12703a aVar, C13278d dVar, NotificationSettings notificationSettings2, C13338f fVar, C13341h hVar2, C13346l lVar, C13276b bVar, C13275a aVar2, C12739m mVar, C12724a aVar3, C12726c cVar) {
        this();
        C19383o.m32797g(jVar, "pushRegistration");
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(aVar, "grafanaMetrics");
        C19383o.m32797g(dVar, "notificationRepo");
        C19383o.m32797g(notificationSettings2, "notificationSettings");
        C19383o.m32797g(fVar, "notificationBuilder");
        C19383o.m32797g(hVar2, "notificationActionProvider");
        C19383o.m32797g(lVar, "styleInstanceProvider");
        C19383o.m32797g(bVar, "pushServiceCallbacks");
        C19383o.m32797g(aVar2, "messageHandler");
        C19383o.m32797g(mVar, "routeGenerator");
        C19383o.m32797g(aVar3, "deepLinkEligibility");
        C19383o.m32797g(cVar, "deepLinkErrorLogger");
        setPushRegistration(jVar);
        setLog(hVar);
        setGrafana(aVar);
        setNotificationRepo(dVar);
        setNotificationSettings(notificationSettings2);
        setNotificationBuilder(fVar);
        setNotificationActionProvider(hVar2);
        setStyleInstanceProvider(lVar);
        setPushServiceCallbacks(bVar);
        setMessageHandler(aVar2);
        setRouteGenerator(mVar);
        setDeepLinkEligibility(aVar3);
        setDeepLinkErrorLogger(cVar);
    }
}
