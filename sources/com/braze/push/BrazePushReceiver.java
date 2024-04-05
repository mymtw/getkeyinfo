package com.braze.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.Braze;
import com.braze.C5382c;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;

public class BrazePushReceiver extends BroadcastReceiver {
    private static final String ADM_ERROR_DESCRIPTION_KEY = "error_description";
    private static final String ADM_ERROR_KEY = "error";
    private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
    private static final String ADM_REGISTRATION_ID_KEY = "registration_id";
    private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";
    private static final String ADM_UNREGISTERED_KEY = "unregistered";
    public static final Companion Companion = new Companion();
    private static final String DELETED_MESSAGES_KEY = "deleted_messages";
    public static final String FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION = "firebase_messaging_service_routing_action";
    public static final String HMS_PUSH_SERVICE_ROUTING_ACTION = "hms_push_service_routing_action";
    private static final String MESSAGE_TYPE_KEY = "message_type";
    private static final String NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";

    public static final class Companion {
        /* renamed from: a */
        public static BrazeNotificationPayload m11211a(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(brazeConfigurationProvider, "appConfigurationProvider");
            C19383o.m32797g(bundle, "notificationExtras");
            C19383o.m32797g(bundle2, "brazeExtras");
            return C5382c.f11528a ? new BrazeNotificationPayload(bundle, BrazeNotificationPayload.Companion.getAttachedBrazeExtras(bundle), context, brazeConfigurationProvider) : new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0248, code lost:
            if (r2.equals(com.appboy.Constants.APPBOY_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L_0x02fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x02f7, code lost:
            if (r2.equals(com.braze.push.BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION) == false) goto L_0x02fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x02fa, code lost:
            r10.mo16058e(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x02fe, code lost:
            com.braze.support.BrazeLogger.m11282d(r9, r10, com.braze.support.BrazeLogger.Priority.W, (java.lang.Throwable) null, com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3.INSTANCE, 6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e7, code lost:
            if (r2.equals(com.braze.push.BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION) == false) goto L_0x02fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
            if (r2.equals(com.braze.push.BrazePushReceiver.ADM_RECEIVE_INTENT_ACTION) == false) goto L_0x02fe;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0090 A[Catch:{ Exception -> 0x00d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00aa A[Catch:{ Exception -> 0x00d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb A[Catch:{ Exception -> 0x00d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0 A[Catch:{ Exception -> 0x00d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0116 A[Catch:{ Exception -> 0x01e1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0124 A[Catch:{ Exception -> 0x01e1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0193 A[Catch:{ Exception -> 0x01e1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01c3 A[Catch:{ Exception -> 0x01e1 }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01c8 A[Catch:{ Exception -> 0x01e1 }] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final void m11212d(android.content.Context r18, android.content.Intent r19, java.lang.String r20) {
            /*
                r0 = r18
                r1 = r19
                r2 = r20
                com.braze.support.BrazeLogger r9 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazePushReceiver$Companion r10 = com.braze.push.BrazePushReceiver.Companion
                com.braze.support.BrazeLogger$Priority r11 = com.braze.support.BrazeLogger.Priority.I
                com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$1 r7 = new com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$1
                r7.<init>(r1)
                r6 = 0
                r8 = 6
                r3 = r9
                r4 = r10
                r5 = r11
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0026
                int r5 = r20.length()
                if (r5 != 0) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r5 = r3
                goto L_0x0027
            L_0x0026:
                r5 = r4
            L_0x0027:
                if (r5 == 0) goto L_0x0038
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W
                r3 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$2 r4 = new com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$2
                r4.<init>(r1)
                r5 = 6
                r0 = r9
                r1 = r10
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
                return
            L_0x0038:
                java.lang.String r5 = "context"
                kotlin.jvm.internal.C19383o.m32797g(r0, r5)
                com.braze.Braze r5 = com.braze.C5381b.m10962b(r18)
                r5.mo15495j()
                int r5 = r20.hashCode()
                java.lang.String r6 = "ab_use_webview"
                java.lang.String r7 = "appboy_action_use_webview"
                java.lang.String r8 = "appboy_action_uri"
                java.lang.String r12 = "uri"
                r13 = -1
                java.lang.String r14 = "nid"
                java.lang.String r15 = "intent"
                switch(r5) {
                    case -1584985748: goto L_0x02f1;
                    case -1189411212: goto L_0x02ac;
                    case -743092218: goto L_0x029a;
                    case -499472794: goto L_0x024c;
                    case -478038018: goto L_0x0242;
                    case 431884654: goto L_0x01f2;
                    case 465410320: goto L_0x00f5;
                    case 1060266838: goto L_0x00eb;
                    case 1740454061: goto L_0x00e1;
                    case 1908841035: goto L_0x005a;
                    default: goto L_0x0058;
                }
            L_0x0058:
                goto L_0x02fe
            L_0x005a:
                java.lang.String r5 = "com.appboy.action.APPBOY_STORY_CLICKED"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0064
                goto L_0x02fe
            L_0x0064:
                com.braze.push.BrazeNotificationUtils r2 = com.braze.push.BrazeNotificationUtils.f11857a
                kotlin.jvm.internal.C19383o.m32797g(r1, r15)
                com.braze.Braze$Companion r2 = com.braze.Braze.f11170m     // Catch:{ Exception -> 0x00d0 }
                com.braze.Braze r2 = r2.mo15515f(r0)     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r5 = "appboy_campaign_id"
                java.lang.String r5 = r1.getStringExtra(r5)     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r10 = "appboy_story_page_id"
                java.lang.String r10 = r1.getStringExtra(r10)     // Catch:{ Exception -> 0x00d0 }
                r2.mo15506v(r5, r10)     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r2 = r1.getStringExtra(r8)     // Catch:{ Exception -> 0x00d0 }
                if (r2 == 0) goto L_0x008d
                boolean r5 = kotlin.text.C19457k.m33020X0(r2)     // Catch:{ Exception -> 0x00d0 }
                if (r5 == 0) goto L_0x008b
                goto L_0x008d
            L_0x008b:
                r5 = r3
                goto L_0x008e
            L_0x008d:
                r5 = r4
            L_0x008e:
                if (r5 != 0) goto L_0x00aa
                java.lang.String r5 = r1.getStringExtra(r8)     // Catch:{ Exception -> 0x00d0 }
                r1.putExtra(r12, r5)     // Catch:{ Exception -> 0x00d0 }
                java.lang.String r5 = r1.getStringExtra(r7)     // Catch:{ Exception -> 0x00d0 }
                if (r5 == 0) goto L_0x00a3
                boolean r7 = kotlin.text.C19457k.m33020X0(r5)     // Catch:{ Exception -> 0x00d0 }
                if (r7 == 0) goto L_0x00a4
            L_0x00a3:
                r3 = r4
            L_0x00a4:
                if (r3 != 0) goto L_0x00ad
                r1.putExtra(r6, r5)     // Catch:{ Exception -> 0x00d0 }
                goto L_0x00ad
            L_0x00aa:
                r1.removeExtra(r12)     // Catch:{ Exception -> 0x00d0 }
            L_0x00ad:
                com.braze.push.BrazeNotificationUtils.m11203e(r18, r19)     // Catch:{ Exception -> 0x00d0 }
                com.braze.configuration.BrazeConfigurationProvider r3 = new com.braze.configuration.BrazeConfigurationProvider     // Catch:{ Exception -> 0x00d0 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x00d0 }
                boolean r3 = r3.getDoesHandlePushDeepLinksAutomatically()     // Catch:{ Exception -> 0x00d0 }
                if (r3 == 0) goto L_0x00c0
                com.braze.push.BrazeNotificationUtils.m11202d(r18, r19)     // Catch:{ Exception -> 0x00d0 }
                goto L_0x0309
            L_0x00c0:
                com.braze.push.BrazeNotificationUtils r1 = com.braze.push.BrazeNotificationUtils.f11857a     // Catch:{ Exception -> 0x00d0 }
                r3 = 0
                com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$1 r4 = new com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$1     // Catch:{ Exception -> 0x00d0 }
                r4.<init>(r2)     // Catch:{ Exception -> 0x00d0 }
                r5 = 6
                r0 = r9
                r2 = r11
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x00d0 }
                goto L_0x0309
            L_0x00d0:
                r0 = move-exception
                r15 = r0
                com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r13 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$2 r16 = com.braze.push.BrazeNotificationUtils$handlePushStoryPageClicked$2.INSTANCE
                r17 = 4
                com.braze.support.BrazeLogger.m11282d(r12, r13, r14, r15, r16, r17)
                goto L_0x0309
            L_0x00e1:
                java.lang.String r3 = "hms_push_service_routing_action"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02fa
                goto L_0x02fe
            L_0x00eb:
                java.lang.String r3 = "com.amazon.device.messaging.intent.RECEIVE"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02fa
                goto L_0x02fe
            L_0x00f5:
                java.lang.String r5 = "com.appboy.action.APPBOY_ACTION_CLICKED"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x00ff
                goto L_0x02fe
            L_0x00ff:
                kotlin.jvm.internal.C19383o.m32797g(r1, r15)
                java.lang.String r2 = "appboy_action_type"
                java.lang.String r2 = r1.getStringExtra(r2)     // Catch:{ Exception -> 0x01e1 }
                if (r2 == 0) goto L_0x0113
                boolean r5 = kotlin.text.C19457k.m33020X0(r2)     // Catch:{ Exception -> 0x01e1 }
                if (r5 == 0) goto L_0x0111
                goto L_0x0113
            L_0x0111:
                r5 = r3
                goto L_0x0114
            L_0x0113:
                r5 = r4
            L_0x0114:
                if (r5 == 0) goto L_0x0124
                com.google.android.play.core.appupdate.d r1 = com.google.android.play.core.appupdate.C15562d.f35019d     // Catch:{ Exception -> 0x01e1 }
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x01e1 }
                r3 = 0
                com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$1 r4 = com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$1.INSTANCE     // Catch:{ Exception -> 0x01e1 }
                r5 = 6
                r0 = r9
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x01e1 }
                goto L_0x0309
            L_0x0124:
                int r5 = r1.getIntExtra(r14, r13)     // Catch:{ Exception -> 0x01e1 }
                com.google.android.play.core.appupdate.d r10 = com.google.android.play.core.appupdate.C15562d.f35019d     // Catch:{ Exception -> 0x01e1 }
                java.lang.String r13 = "cid"
                java.lang.String r13 = r1.getStringExtra(r13)     // Catch:{ Exception -> 0x01e1 }
                java.lang.String r14 = "appboy_action_id"
                java.lang.String r14 = r1.getStringExtra(r14)     // Catch:{ Exception -> 0x01e1 }
                com.braze.Braze$Companion r15 = com.braze.Braze.f11170m     // Catch:{ Exception -> 0x01e1 }
                com.braze.Braze r15 = r15.mo15515f(r0)     // Catch:{ Exception -> 0x01e1 }
                r15.mo15504t(r13, r14, r2)     // Catch:{ Exception -> 0x01e1 }
                if (r2 == 0) goto L_0x01d4
                int r13 = r2.hashCode()     // Catch:{ Exception -> 0x01e1 }
                r14 = -1424488370(0xffffffffab18084e, float:-5.4012773E-13)
                java.lang.String r15 = "ab_uri"
                if (r13 == r14) goto L_0x0171
                r14 = -1209677674(0xffffffffb7e5c896, float:-2.7392332E-5)
                if (r13 == r14) goto L_0x0162
                r14 = -1209647192(0xffffffffb7e63fa8, float:-2.7447779E-5)
                if (r13 == r14) goto L_0x0158
                goto L_0x01d4
            L_0x0158:
                java.lang.String r13 = "ab_open"
                boolean r13 = r2.equals(r13)     // Catch:{ Exception -> 0x01e1 }
                if (r13 != 0) goto L_0x0178
                goto L_0x01d4
            L_0x0162:
                java.lang.String r1 = "ab_none"
                boolean r1 = r2.equals(r1)     // Catch:{ Exception -> 0x01e1 }
                if (r1 != 0) goto L_0x016c
                goto L_0x01d4
            L_0x016c:
                com.braze.push.BrazeNotificationUtils.m11199a(r0, r5)     // Catch:{ Exception -> 0x01e1 }
                goto L_0x0309
            L_0x0171:
                boolean r13 = r2.equals(r15)     // Catch:{ Exception -> 0x01e1 }
                if (r13 != 0) goto L_0x0178
                goto L_0x01d4
            L_0x0178:
                com.braze.push.BrazeNotificationUtils.m11199a(r0, r5)     // Catch:{ Exception -> 0x01e1 }
                boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r15)     // Catch:{ Exception -> 0x01e1 }
                if (r2 == 0) goto L_0x01b2
                android.os.Bundle r2 = r19.getExtras()     // Catch:{ Exception -> 0x01e1 }
                if (r2 != 0) goto L_0x0188
                goto L_0x0190
            L_0x0188:
                boolean r2 = r2.containsKey(r8)     // Catch:{ Exception -> 0x01e1 }
                if (r2 != r4) goto L_0x0190
                r2 = r4
                goto L_0x0191
            L_0x0190:
                r2 = r3
            L_0x0191:
                if (r2 == 0) goto L_0x01b2
                java.lang.String r2 = r1.getStringExtra(r8)     // Catch:{ Exception -> 0x01e1 }
                r1.putExtra(r12, r2)     // Catch:{ Exception -> 0x01e1 }
                android.os.Bundle r2 = r19.getExtras()     // Catch:{ Exception -> 0x01e1 }
                if (r2 != 0) goto L_0x01a1
                goto L_0x01a8
            L_0x01a1:
                boolean r2 = r2.containsKey(r7)     // Catch:{ Exception -> 0x01e1 }
                if (r2 != r4) goto L_0x01a8
                r3 = r4
            L_0x01a8:
                if (r3 == 0) goto L_0x01b5
                java.lang.String r2 = r1.getStringExtra(r7)     // Catch:{ Exception -> 0x01e1 }
                r1.putExtra(r6, r2)     // Catch:{ Exception -> 0x01e1 }
                goto L_0x01b5
            L_0x01b2:
                r1.removeExtra(r12)     // Catch:{ Exception -> 0x01e1 }
            L_0x01b5:
                com.braze.push.BrazeNotificationUtils.m11203e(r18, r19)     // Catch:{ Exception -> 0x01e1 }
                com.braze.configuration.BrazeConfigurationProvider r2 = new com.braze.configuration.BrazeConfigurationProvider     // Catch:{ Exception -> 0x01e1 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x01e1 }
                boolean r2 = r2.getDoesHandlePushDeepLinksAutomatically()     // Catch:{ Exception -> 0x01e1 }
                if (r2 == 0) goto L_0x01c8
                com.braze.push.BrazeNotificationUtils.m11202d(r18, r19)     // Catch:{ Exception -> 0x01e1 }
                goto L_0x0309
            L_0x01c8:
                r3 = 0
                com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$2 r4 = com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$2.INSTANCE     // Catch:{ Exception -> 0x01e1 }
                r5 = 6
                r0 = r9
                r1 = r10
                r2 = r11
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x01e1 }
                goto L_0x0309
            L_0x01d4:
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W     // Catch:{ Exception -> 0x01e1 }
                r3 = 0
                com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$3 r4 = com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$3.INSTANCE     // Catch:{ Exception -> 0x01e1 }
                r5 = 6
                r0 = r9
                r1 = r10
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x01e1 }
                goto L_0x0309
            L_0x01e1:
                r0 = move-exception
                r14 = r0
                com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
                com.google.android.play.core.appupdate.d r12 = com.google.android.play.core.appupdate.C15562d.f35019d
                com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$4 r15 = com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$4.INSTANCE
                r16 = 4
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                goto L_0x0309
            L_0x01f2:
                java.lang.String r3 = "com.appboy.action.CANCEL_NOTIFICATION"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x01fc
                goto L_0x02fe
            L_0x01fc:
                com.braze.push.BrazeNotificationUtils r2 = com.braze.push.BrazeNotificationUtils.f11857a
                kotlin.jvm.internal.C19383o.m32797g(r1, r15)
                boolean r2 = r1.hasExtra(r14)     // Catch:{ Exception -> 0x0232 }
                if (r2 == 0) goto L_0x0309
                int r7 = r1.getIntExtra(r14, r13)     // Catch:{ Exception -> 0x0232 }
                com.braze.push.BrazeNotificationUtils r2 = com.braze.push.BrazeNotificationUtils.f11857a     // Catch:{ Exception -> 0x0232 }
                r3 = 0
                r4 = 0
                com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$1 r5 = new com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$1     // Catch:{ Exception -> 0x0232 }
                r5.<init>(r7)     // Catch:{ Exception -> 0x0232 }
                r6 = 7
                r1 = r9
                com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0232 }
                java.lang.String r1 = "notification"
                java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x0232 }
                if (r0 == 0) goto L_0x022a
                android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch:{ Exception -> 0x0232 }
                java.lang.String r1 = "appboy_notification"
                r0.cancel(r1, r7)     // Catch:{ Exception -> 0x0232 }
                goto L_0x0309
            L_0x022a:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0232 }
                java.lang.String r1 = "null cannot be cast to non-null type android.app.NotificationManager"
                r0.<init>(r1)     // Catch:{ Exception -> 0x0232 }
                throw r0     // Catch:{ Exception -> 0x0232 }
            L_0x0232:
                r0 = move-exception
                r5 = r0
                com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r3 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$2 r6 = com.braze.push.BrazeNotificationUtils$handleCancelNotificationAction$2.INSTANCE
                r7 = 4
                com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
                goto L_0x0309
            L_0x0242:
                java.lang.String r3 = "com.appboy.action.STORY_TRAVERSE"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02fa
                goto L_0x02fe
            L_0x024c:
                java.lang.String r3 = "com.appboy.action.APPBOY_PUSH_DELETED"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0256
                goto L_0x02fe
            L_0x0256:
                com.braze.push.BrazeNotificationUtils r2 = com.braze.push.BrazeNotificationUtils.f11857a
                kotlin.jvm.internal.C19383o.m32797g(r1, r15)
                com.braze.push.BrazeNotificationUtils r8 = com.braze.push.BrazeNotificationUtils.f11857a     // Catch:{ Exception -> 0x028a }
                r4 = 0
                r5 = 0
                com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$1 r6 = com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$1.INSTANCE     // Catch:{ Exception -> 0x028a }
                r7 = 7
                r2 = r9
                r3 = r8
                com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x028a }
                android.os.Bundle r9 = r19.getExtras()     // Catch:{ Exception -> 0x028a }
                if (r9 == 0) goto L_0x0282
                com.appboy.models.push.BrazeNotificationPayload r10 = new com.appboy.models.push.BrazeNotificationPayload     // Catch:{ Exception -> 0x028a }
                r3 = 0
                r5 = 0
                r6 = 10
                r7 = 0
                r1 = r10
                r2 = r9
                r4 = r18
                r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x028a }
                com.braze.push.BrazeNotificationUtils$BrazeNotificationBroadcastType r1 = com.braze.push.BrazeNotificationUtils.BrazeNotificationBroadcastType.DELETED     // Catch:{ Exception -> 0x028a }
                r8.mo16053f(r0, r1, r9, r10)     // Catch:{ Exception -> 0x028a }
                goto L_0x0309
            L_0x0282:
                com.braze.push.BrazeNotificationUtils$BrazeNotificationBroadcastType r1 = com.braze.push.BrazeNotificationUtils.BrazeNotificationBroadcastType.DELETED     // Catch:{ Exception -> 0x028a }
                r2 = 0
                r8.mo16053f(r0, r1, r9, r2)     // Catch:{ Exception -> 0x028a }
                goto L_0x0309
            L_0x028a:
                r0 = move-exception
                r13 = r0
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r12 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$2 r14 = com.braze.push.BrazeNotificationUtils$handleNotificationDeleted$2.INSTANCE
                r15 = 4
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                goto L_0x0309
            L_0x029a:
                java.lang.String r3 = "com.amazon.device.messaging.intent.REGISTRATION"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02a3
                goto L_0x02fe
            L_0x02a3:
                com.braze.configuration.BrazeConfigurationProvider r2 = new com.braze.configuration.BrazeConfigurationProvider
                r2.<init>(r0)
                r10.mo16056b(r2, r0, r1)
                goto L_0x0309
            L_0x02ac:
                java.lang.String r3 = "com.appboy.action.APPBOY_PUSH_CLICKED"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02b5
                goto L_0x02fe
            L_0x02b5:
                com.braze.push.BrazeNotificationUtils r2 = com.braze.push.BrazeNotificationUtils.f11857a
                kotlin.jvm.internal.C19383o.m32797g(r1, r15)
                com.braze.Braze$Companion r2 = com.braze.Braze.f11170m     // Catch:{ Exception -> 0x02e1 }
                com.braze.Braze r2 = r2.mo15515f(r0)     // Catch:{ Exception -> 0x02e1 }
                r2.mo15505u(r1)     // Catch:{ Exception -> 0x02e1 }
                com.braze.push.BrazeNotificationUtils.m11203e(r18, r19)     // Catch:{ Exception -> 0x02e1 }
                com.braze.configuration.BrazeConfigurationProvider r2 = new com.braze.configuration.BrazeConfigurationProvider     // Catch:{ Exception -> 0x02e1 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x02e1 }
                boolean r2 = r2.getDoesHandlePushDeepLinksAutomatically()     // Catch:{ Exception -> 0x02e1 }
                if (r2 == 0) goto L_0x02d5
                com.braze.push.BrazeNotificationUtils.m11202d(r18, r19)     // Catch:{ Exception -> 0x02e1 }
                goto L_0x0309
            L_0x02d5:
                com.braze.push.BrazeNotificationUtils r1 = com.braze.push.BrazeNotificationUtils.f11857a     // Catch:{ Exception -> 0x02e1 }
                r3 = 0
                com.braze.push.BrazeNotificationUtils$handleNotificationOpened$1 r4 = com.braze.push.BrazeNotificationUtils$handleNotificationOpened$1.INSTANCE     // Catch:{ Exception -> 0x02e1 }
                r5 = 6
                r0 = r9
                r2 = r11
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x02e1 }
                goto L_0x0309
            L_0x02e1:
                r0 = move-exception
                r15 = r0
                com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r13 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$handleNotificationOpened$2 r16 = com.braze.push.BrazeNotificationUtils$handleNotificationOpened$2.INSTANCE
                r17 = 4
                com.braze.support.BrazeLogger.m11282d(r12, r13, r14, r15, r16, r17)
                goto L_0x0309
            L_0x02f1:
                java.lang.String r3 = "firebase_messaging_service_routing_action"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02fa
                goto L_0x02fe
            L_0x02fa:
                r10.mo16058e(r0, r1)
                goto L_0x0309
            L_0x02fe:
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W
                r3 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3 r4 = com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3.INSTANCE
                r5 = 6
                r0 = r9
                r1 = r10
                com.braze.support.BrazeLogger.m11282d(r0, r1, r2, r3, r4, r5)
            L_0x0309:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.m11212d(android.content.Context, android.content.Intent, java.lang.String):void");
        }

        /* renamed from: b */
        public final boolean mo16056b(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
            C19383o.m32797g(brazeConfigurationProvider, "appConfigurationProvider");
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(intent, "intent");
            BrazeLogger brazeLogger = BrazeLogger.f11932a;
            BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new C5517x5d7a691b(intent), 6);
            if (!C5382c.f11528a || !brazeConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.m11282d(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, C5519x5d7a691d.INSTANCE, 6);
                return false;
            }
            BrazeLogger.m11282d(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, C5518x5d7a691c.INSTANCE, 7);
            mo16057c(context, intent);
            return true;
        }

        /* renamed from: c */
        public final boolean mo16057c(Context context, Intent intent) {
            Context context2 = context;
            Intent intent2 = intent;
            C19383o.m32797g(context2, ResponseConstants.CONTEXT);
            C19383o.m32797g(intent2, "intent");
            String stringExtra = intent2.getStringExtra("error");
            String stringExtra2 = intent2.getStringExtra("error_description");
            String stringExtra3 = intent2.getStringExtra(BrazePushReceiver.ADM_REGISTRATION_ID_KEY);
            String stringExtra4 = intent2.getStringExtra(BrazePushReceiver.ADM_UNREGISTERED_KEY);
            if (stringExtra != null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new BrazePushReceiver$Companion$handleAdmRegistrationIntent$1(stringExtra, stringExtra2), 6);
                return true;
            } else if (stringExtra3 != null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new BrazePushReceiver$Companion$handleAdmRegistrationIntent$2(stringExtra3), 6);
                Braze.f11170m.mo15515f(context2).mo15490c(stringExtra3);
                return true;
            } else if (stringExtra4 != null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new BrazePushReceiver$Companion$handleAdmRegistrationIntent$3(stringExtra4), 6);
                return true;
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, BrazePushReceiver$Companion$handleAdmRegistrationIntent$4.INSTANCE, 6);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:125:0x0336  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x0345  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0274  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo16058e(android.content.Context r24, android.content.Intent r25) {
            /*
                r23 = this;
                r8 = r24
                r0 = r25
                java.lang.String r1 = "context"
                kotlin.jvm.internal.C19383o.m32797g(r8, r1)
                java.lang.String r1 = "intent"
                kotlin.jvm.internal.C19383o.m32797g(r0, r1)
                com.braze.push.BrazeNotificationUtils r1 = com.braze.push.BrazeNotificationUtils.f11857a
                android.os.Bundle r1 = r25.getExtras()
                r9 = 1
                r10 = 0
                if (r1 != 0) goto L_0x001a
                r1 = r10
                goto L_0x0026
            L_0x001a:
                java.lang.String r2 = "_ab"
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "true"
                boolean r1 = kotlin.text.C19457k.m33019W0(r2, r1, r9)
            L_0x0026:
                if (r1 != 0) goto L_0x0035
                com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.f11932a
                r4 = 0
                r5 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$1 r6 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$1.INSTANCE
                r7 = 7
                r3 = r23
                com.braze.support.BrazeLogger.m11282d(r2, r3, r4, r5, r6, r7)
                return r10
            L_0x0035:
                java.lang.String r1 = "message_type"
                java.lang.String r1 = r0.getStringExtra(r1)
                java.lang.String r2 = "deleted_messages"
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r2, r1)
                if (r1 == 0) goto L_0x005b
                r1 = -1
                java.lang.String r2 = "total_deleted"
                int r0 = r0.getIntExtra(r2, r1)
                com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r3 = com.braze.support.BrazeLogger.Priority.I
                r4 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$2 r5 = new com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$2
                r5.<init>(r0)
                r6 = 6
                r2 = r23
                com.braze.support.BrazeLogger.m11282d(r1, r2, r3, r4, r5, r6)
                return r10
            L_0x005b:
                android.os.Bundle r2 = r25.getExtras()
                if (r2 != 0) goto L_0x0062
                return r10
            L_0x0062:
                com.braze.support.BrazeLogger r17 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.I
                r14 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$3 r15 = new com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$3
                r15.<init>(r2)
                r16 = 6
                r11 = r17
                r12 = r23
                r13 = r5
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                com.appboy.models.push.BrazeNotificationPayload$Companion r1 = com.appboy.models.push.BrazeNotificationPayload.Companion
                android.os.Bundle r1 = r1.getAttachedBrazeExtras(r2)
                java.lang.String r3 = "extra"
                r2.putBundle(r3, r1)
                java.lang.String r3 = "appboy_push_received_timestamp"
                boolean r4 = r2.containsKey(r3)
                if (r4 != 0) goto L_0x0090
                long r6 = java.lang.System.currentTimeMillis()
                r2.putLong(r3, r6)
            L_0x0090:
                com.braze.configuration.BrazeConfigurationProvider r6 = new com.braze.configuration.BrazeConfigurationProvider
                r6.<init>(r8)
                com.appboy.models.push.BrazeNotificationPayload r7 = m11211a(r8, r6, r2, r1)
                boolean r1 = r7.isUninstallTrackingPush()
                if (r1 == 0) goto L_0x00ab
                r6 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$4 r7 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$4.INSTANCE
                r8 = 6
                r3 = r17
                r4 = r23
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                return r10
            L_0x00ab:
                java.lang.String r1 = r7.getContentCardSyncData()
                java.lang.String r3 = r7.getContentCardSyncUserId()
                android.content.Context r4 = r7.getContext()
                if (r1 == 0) goto L_0x00ce
                if (r4 == 0) goto L_0x00ce
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$handleContentCardsSerializedCardIfPresent$1 r15 = new com.braze.push.BrazeNotificationUtils$handleContentCardsSerializedCardIfPresent$1
                r15.<init>(r3, r1)
                r16 = 7
                r11 = r17
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                com.braze.C5381b.m10961a(r4, r1, r3)
            L_0x00ce:
                boolean r1 = r7.getShouldFetchTestTriggers()
                if (r1 == 0) goto L_0x00f3
                boolean r1 = r6.isInAppMessageTestPushEagerDisplayEnabled()
                if (r1 == 0) goto L_0x00f3
                g4.b r1 = p114g4.C6861b.m13319e()
                android.app.Activity r1 = r1.f15220b
                if (r1 == 0) goto L_0x00f3
                r13 = 0
                r14 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$5 r15 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$5.INSTANCE
                r16 = 7
                r11 = r17
                r12 = r23
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                com.braze.C5381b.m10963c(r24, r25)
                return r10
            L_0x00f3:
                android.os.Bundle r0 = r25.getExtras()
                if (r0 != 0) goto L_0x00fa
                goto L_0x010c
            L_0x00fa:
                java.lang.String r1 = "t"
                boolean r1 = r0.containsKey(r1)
                if (r1 == 0) goto L_0x010c
                java.lang.String r1 = "a"
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L_0x010c
                r0 = r9
                goto L_0x010d
            L_0x010c:
                r0 = r10
            L_0x010d:
                if (r0 == 0) goto L_0x0390
                r13 = 0
                r14 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$6 r15 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$6.INSTANCE
                r16 = 7
                r11 = r17
                r12 = r23
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                java.lang.Integer r0 = r7.getCustomNotificationId()
                if (r0 == 0) goto L_0x0138
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$getNotificationId$1 r15 = new com.braze.push.BrazeNotificationUtils$getNotificationId$1
                r15.<init>(r0)
                r16 = 7
                r11 = r17
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                int r0 = r0.intValue()
            L_0x0136:
                r5 = r0
                goto L_0x0169
            L_0x0138:
                java.lang.String r0 = ""
                java.lang.String r1 = r7.getTitleText()
                if (r1 != 0) goto L_0x0141
                goto L_0x0145
            L_0x0141:
                java.lang.String r0 = kotlin.jvm.internal.C19383o.m32802l(r1, r0)
            L_0x0145:
                java.lang.String r1 = r7.getContentText()
                if (r1 != 0) goto L_0x014c
                goto L_0x0150
            L_0x014c:
                java.lang.String r0 = kotlin.jvm.internal.C19383o.m32802l(r1, r0)
            L_0x0150:
                if (r0 != 0) goto L_0x0154
                r0 = r10
                goto L_0x0158
            L_0x0154:
                int r0 = r0.hashCode()
            L_0x0158:
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$getNotificationId$4 r15 = new com.braze.push.BrazeNotificationUtils$getNotificationId$4
                r15.<init>(r0)
                r16 = 7
                r11 = r17
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                goto L_0x0136
            L_0x0169:
                java.lang.String r4 = "nid"
                r2.putInt(r4, r5)
                boolean r0 = r7.isPushStory()
                if (r0 == 0) goto L_0x019d
                boolean r0 = com.braze.C5382c.f11528a
                if (r0 == 0) goto L_0x0185
                r5 = 0
                r6 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$7 r7 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$7.INSTANCE
                r8 = 7
                r3 = r17
                r4 = r23
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                return r10
            L_0x0185:
                java.lang.String r0 = "appboy_story_newly_received"
                boolean r1 = r2.containsKey(r0)
                if (r1 != 0) goto L_0x019d
                r13 = 0
                r14 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$8 r15 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$8.INSTANCE
                r16 = 7
                r11 = r17
                r12 = r23
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                r2.putBoolean(r0, r9)
            L_0x019d:
                com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.V
                r14 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$9 r15 = new com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$9
                r15.<init>(r7)
                r16 = 6
                r11 = r17
                r12 = r23
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                com.braze.Braze$Companion r0 = com.braze.Braze.f11170m
                com.braze.push.BrazeNotificationFactory$Companion r0 = com.braze.push.BrazeNotificationFactory.Companion
                r0.getClass()
                com.braze.push.BrazeNotificationFactory r0 = com.braze.push.BrazeNotificationFactory.internalInstance
                android.app.Notification r0 = r0.createNotification(r7)
                if (r0 != 0) goto L_0x01cc
                r5 = 0
                r6 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$10 r7 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$10.INSTANCE
                r8 = 7
                r3 = r17
                r4 = r23
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                return r10
            L_0x01cc:
                androidx.core.app.NotificationManagerCompat r1 = androidx.core.app.NotificationManagerCompat.from(r24)
                java.lang.String r3 = "from(context)"
                kotlin.jvm.internal.C19383o.m32796f(r1, r3)
                r13 = 0
                r14 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$11 r15 = new com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$11
                r15.<init>(r1)
                r16 = 7
                r11 = r17
                r12 = r23
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                java.lang.String r3 = "appboy_notification"
                r1.notify(r3, r5, r0)
                com.braze.push.BrazeNotificationUtils.m11204g(r8, r2, r7)
                com.appboy.models.push.BrazeNotificationPayload r0 = new com.appboy.models.push.BrazeNotificationPayload
                r3 = 0
                r11 = 2
                r12 = 0
                r1 = r0
                r15 = r4
                r4 = r24
                r14 = r5
                r5 = r6
                r6 = r11
                r13 = r7
                r7 = r12
                r1.<init>(r2, r3, r4, r5, r6, r7)
                android.content.Context r1 = r0.getContext()
                if (r1 != 0) goto L_0x0209
            L_0x0204:
                r5 = r13
                r6 = r14
                r2 = r15
                goto L_0x033e
            L_0x0209:
                com.braze.configuration.BrazeConfigurationProvider r2 = r0.getConfigurationProvider()
                if (r2 != 0) goto L_0x0210
                goto L_0x0204
            L_0x0210:
                android.os.Bundle r3 = r0.getNotificationExtras()
                java.lang.String r0 = "android.permission.WAKE_LOCK"
                boolean r0 = com.braze.support.PermissionUtils.m11331a(r1, r0)
                if (r0 == 0) goto L_0x0204
                boolean r0 = r2.isPushWakeScreenForNotificationEnabled()
                if (r0 != 0) goto L_0x0223
                goto L_0x0204
            L_0x0223:
                java.lang.String r0 = "uimode"
                java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ Exception -> 0x025a }
                if (r0 == 0) goto L_0x024d
                android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch:{ Exception -> 0x025a }
                int r0 = r0.getCurrentModeType()     // Catch:{ Exception -> 0x025a }
                r2 = 4
                if (r0 != r2) goto L_0x0249
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a     // Catch:{ Exception -> 0x025a }
                r0 = 0
                r2 = 0
                com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$1 r4 = com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$1.INSTANCE     // Catch:{ Exception -> 0x025a }
                r16 = 7
                r11 = r17
                r5 = r13
                r13 = r0
                r6 = r14
                r14 = r2
                r2 = r15
                r15 = r4
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0258 }
                goto L_0x033e
            L_0x0249:
                r5 = r13
                r6 = r14
                r2 = r15
                goto L_0x026c
            L_0x024d:
                r5 = r13
                r6 = r14
                r2 = r15
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0258 }
                java.lang.String r4 = "null cannot be cast to non-null type android.app.UiModeManager"
                r0.<init>(r4)     // Catch:{ Exception -> 0x0258 }
                throw r0     // Catch:{ Exception -> 0x0258 }
            L_0x0258:
                r0 = move-exception
                goto L_0x025e
            L_0x025a:
                r0 = move-exception
                r5 = r13
                r6 = r14
                r2 = r15
            L_0x025e:
                r14 = r0
                com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r13 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$2 r15 = com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$2.INSTANCE
                r16 = 4
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
            L_0x026c:
                java.lang.String r0 = "notification"
                java.lang.Object r0 = r1.getSystemService(r0)
                if (r0 == 0) goto L_0x0336
                android.app.NotificationManager r0 = (android.app.NotificationManager) r0
                r4 = 0
                if (r3 != 0) goto L_0x0287
                com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$1 r15 = com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$1.INSTANCE
                r16 = 7
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                goto L_0x02de
            L_0x0287:
                java.lang.String r7 = "ab_nc"
                java.lang.String r3 = r3.getString(r7, r4)
                if (r3 == 0) goto L_0x0298
                boolean r7 = kotlin.text.C19457k.m33020X0(r3)
                if (r7 == 0) goto L_0x0296
                goto L_0x0298
            L_0x0296:
                r7 = r10
                goto L_0x0299
            L_0x0298:
                r7 = r9
            L_0x0299:
                if (r7 != 0) goto L_0x02c7
                android.app.NotificationChannel r7 = r0.getNotificationChannel(r3)
                if (r7 == 0) goto L_0x02b3
                com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$2 r15 = new com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$2
                r15.<init>(r3)
                r16 = 7
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                r4 = r7
                goto L_0x02de
            L_0x02b3:
                com.braze.support.BrazeLogger r17 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r18 = com.braze.push.BrazeNotificationUtils.f11857a
                r19 = 0
                r20 = 0
                com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$3 r7 = new com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$3
                r7.<init>(r3)
                r22 = 7
                r21 = r7
                com.braze.support.BrazeLogger.m11282d(r17, r18, r19, r20, r21, r22)
            L_0x02c7:
                java.lang.String r3 = "com_appboy_default_notification_channel"
                android.app.NotificationChannel r0 = r0.getNotificationChannel(r3)
                if (r0 == 0) goto L_0x02d1
                r4 = r0
                goto L_0x02de
            L_0x02d1:
                com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$4 r15 = com.braze.push.BrazeNotificationUtils$getValidNotificationChannel$4.INSTANCE
                r16 = 7
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
            L_0x02de:
                if (r4 != 0) goto L_0x02ee
                com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$3 r15 = com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$3.INSTANCE
                r16 = 7
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                goto L_0x033e
            L_0x02ee:
                int r0 = r4.getImportance()
                if (r0 != r9) goto L_0x0305
                com.braze.support.BrazeLogger r11 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r12 = com.braze.push.BrazeNotificationUtils.f11857a
                r13 = 0
                r14 = 0
                com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$4 r15 = new com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$4
                r15.<init>(r4)
                r16 = 7
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                goto L_0x033e
            L_0x0305:
                com.braze.support.BrazeLogger r17 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r18 = com.braze.push.BrazeNotificationUtils.f11857a
                r19 = 0
                r20 = 0
                com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$5 r21 = com.braze.push.BrazeNotificationUtils$wakeScreenIfAppropriate$5.INSTANCE
                r22 = 7
                com.braze.support.BrazeLogger.m11282d(r17, r18, r19, r20, r21, r22)
                java.lang.String r0 = "power"
                java.lang.Object r0 = r1.getSystemService(r0)
                if (r0 == 0) goto L_0x032e
                android.os.PowerManager r0 = (android.os.PowerManager) r0
                r1 = 268435482(0x1000001a, float:2.5243627E-29)
                java.lang.String r3 = com.braze.push.BrazeNotificationUtils.f11858b
                android.os.PowerManager$WakeLock r0 = r0.newWakeLock(r1, r3)
                r0.acquire()
                r0.release()
                goto L_0x033e
            L_0x032e:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type android.os.PowerManager"
                r0.<init>(r1)
                throw r0
            L_0x0336:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.NotificationManager"
                r0.<init>(r1)
                throw r0
            L_0x033e:
                java.lang.Integer r0 = r5.getPushDuration()
                if (r0 != 0) goto L_0x0345
                goto L_0x0387
            L_0x0345:
                int r0 = r0.intValue()
                java.lang.Class<com.braze.push.BrazePushReceiver> r1 = com.braze.push.BrazePushReceiver.class
                android.content.Intent r3 = new android.content.Intent
                r3.<init>(r8, r1)
                java.lang.String r1 = "com.appboy.action.CANCEL_NOTIFICATION"
                r3.setAction(r1)
                r3.putExtra(r2, r6)
                com.braze.support.IntentUtils r1 = com.braze.support.IntentUtils.f11948a
                r1 = 201326592(0xc000000, float:9.8607613E-32)
                android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r8, r10, r3, r1)
                java.lang.String r2 = "alarm"
                java.lang.Object r2 = r8.getSystemService(r2)
                if (r2 == 0) goto L_0x0388
                android.app.AlarmManager r2 = (android.app.AlarmManager) r2
                r3 = 1000(0x3e8, float:1.401E-42)
                if (r0 < r3) goto L_0x0387
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setNotificationDurationAlarm$1 r14 = new com.braze.push.BrazeNotificationUtils$setNotificationDurationAlarm$1
                r14.<init>(r0)
                r15 = 7
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                r3 = 3
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = (long) r0
                long r4 = r4 + r6
                r2.set(r3, r4, r1)
            L_0x0387:
                return r9
            L_0x0388:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type android.app.AlarmManager"
                r0.<init>(r1)
                throw r0
            L_0x0390:
                r5 = r7
                r13 = 0
                r14 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$13 r15 = com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$13.INSTANCE
                r16 = 7
                r11 = r17
                r12 = r23
                com.braze.support.BrazeLogger.m11282d(r11, r12, r13, r14, r15, r16)
                com.braze.push.BrazeNotificationUtils.m11204g(r8, r2, r5)
                android.content.Context r0 = r5.getContext()
                boolean r1 = r5.getShouldSyncGeofences()
                if (r1 == 0) goto L_0x03bd
                if (r0 == 0) goto L_0x03bd
                com.braze.push.BrazeNotificationUtils r4 = com.braze.push.BrazeNotificationUtils.f11857a
                r5 = 0
                r6 = 0
                com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$1 r7 = com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$1.INSTANCE
                r8 = 7
                r3 = r17
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                com.braze.C5381b.m10967g(r0, r9)
                goto L_0x03c9
            L_0x03bd:
                com.braze.push.BrazeNotificationUtils r4 = com.braze.push.BrazeNotificationUtils.f11857a
                r5 = 0
                r6 = 0
                com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2 r7 = com.braze.push.BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2.INSTANCE
                r8 = 7
                r3 = r17
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
            L_0x03c9:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.mo16058e(android.content.Context, android.content.Intent):boolean");
        }

        /* renamed from: f */
        public final void mo16059f(Context context, Intent intent, boolean z) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            C19383o.m32797g(intent, "intent");
            if (z) {
                C19697g.m33468f(BrazeCoroutineScope.f11696b, (CoroutineContext) null, (CoroutineStart) null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, (C19340c<? super BrazePushReceiver$Companion$handleReceivedIntent$1>) null), 3);
                return;
            }
            String action = intent.getAction();
            try {
                m11212d(context, intent, action);
            } catch (Exception e) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, new BrazePushReceiver$Companion$handlePush$1(action, intent), 4);
            }
        }
    }

    public static final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
        Companion.getClass();
        return Companion.m11211a(context, brazeConfigurationProvider, bundle, bundle2);
    }

    public static final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
        return Companion.mo16056b(brazeConfigurationProvider, context, intent);
    }

    public static final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
        return Companion.mo16057c(context, intent);
    }

    public static final boolean handlePushNotificationPayload(Context context, Intent intent) {
        return Companion.mo16058e(context, intent);
    }

    public static final void handleReceivedIntent(Context context, Intent intent) {
        Companion companion = Companion;
        companion.getClass();
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        companion.mo16059f(context, intent, true);
    }

    public static final void handleReceivedIntent(Context context, Intent intent, boolean z) {
        Companion.mo16059f(context, intent, z);
    }

    public void onReceive(Context context, Intent intent) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(intent, "intent");
        Companion.mo16059f(context, intent, true);
    }
}
