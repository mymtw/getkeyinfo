package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.C5417e;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.C19383o;
import p250u0.C8100m;

public class BrazeNotificationFactory implements C5417e {
    public static final Companion Companion = new Companion();
    /* access modifiers changed from: private */
    public static volatile BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    public static final class Companion {
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0411  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x0420  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x0435  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x0448  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x045b  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0491  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x04d0  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0276  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0283  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p250u0.C8100m mo16051a(com.appboy.models.push.BrazeNotificationPayload r34) {
            /*
                r33 = this;
                r1 = r34
                java.lang.Class<com.braze.push.NotificationTrampolineActivity> r2 = com.braze.push.NotificationTrampolineActivity.class
                java.lang.String r0 = "payload"
                kotlin.jvm.internal.C19383o.m32797g(r1, r0)
                com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.V
                com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$1 r7 = new com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$1
                r7.<init>(r1)
                r6 = 0
                r8 = 6
                r3 = r0
                r4 = r33
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                android.content.Context r3 = r34.getContext()
                r9 = 0
                if (r3 != 0) goto L_0x002d
                r5 = 0
                r6 = 0
                com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$2 r7 = com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$2.INSTANCE
                r8 = 7
                r3 = r0
                r4 = r33
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                return r9
            L_0x002d:
                com.braze.configuration.BrazeConfigurationProvider r4 = r34.getConfigurationProvider()
                if (r4 != 0) goto L_0x003f
                r5 = 0
                r6 = 0
                com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$3 r7 = com.braze.push.BrazeNotificationFactory$Companion$populateNotificationBuilder$3.INSTANCE
                r8 = 7
                r3 = r0
                r4 = r33
                com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
                return r9
            L_0x003f:
                android.os.Bundle r5 = r34.getNotificationExtras()
                com.braze.push.BrazeNotificationUtils r0 = com.braze.push.BrazeNotificationUtils.f11857a
                android.content.Context r0 = r34.getContext()
                r6 = 0
                if (r0 != 0) goto L_0x004d
                goto L_0x00b6
            L_0x004d:
                boolean r7 = r34.isPushStory()
                if (r7 == 0) goto L_0x00b6
                boolean r7 = r34.isNewlyReceivedPushStory()
                if (r7 != 0) goto L_0x005a
                goto L_0x00b6
            L_0x005a:
                java.util.List r7 = r34.getPushStoryPages()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x0067:
                boolean r10 = r7.hasNext()
                if (r10 == 0) goto L_0x007e
                java.lang.Object r10 = r7.next()
                com.appboy.models.push.BrazeNotificationPayload$PushStoryPage r10 = (com.appboy.models.push.BrazeNotificationPayload.PushStoryPage) r10
                java.lang.String r10 = r10.getBitmapUrl()
                if (r10 != 0) goto L_0x007a
                goto L_0x0067
            L_0x007a:
                r8.add(r10)
                goto L_0x0067
            L_0x007e:
                java.util.Iterator r7 = r8.iterator()
            L_0x0082:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00b3
                java.lang.Object r8 = r7.next()
                java.lang.String r8 = (java.lang.String) r8
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r12 = com.braze.support.BrazeLogger.Priority.V
                r13 = 0
                com.braze.push.BrazeNotificationUtils$prefetchBitmapsIfNewlyReceivedStoryPush$2$1 r14 = new com.braze.push.BrazeNotificationUtils$prefetchBitmapsIfNewlyReceivedStoryPush$2$1
                r14.<init>(r8)
                r15 = 6
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                com.braze.Braze$Companion r10 = com.braze.Braze.f11170m
                com.braze.Braze r10 = r10.mo15515f(r0)
                com.braze.images.a r10 = r10.mo15499n()
                r34.getBrazeExtras()
                com.braze.enums.BrazeViewBounds r11 = com.braze.enums.BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY
                com.braze.images.DefaultBrazeImageLoader r10 = (com.braze.images.DefaultBrazeImageLoader) r10
                r10.mo15922c(r0, r8, r11)
                goto L_0x0082
            L_0x00b3:
                r1.setNewlyReceivedPushStory(r6)
            L_0x00b6:
                java.lang.String r0 = com.braze.push.BrazeNotificationUtils.m11201c(r34)
                u0.m r7 = new u0.m
                r7.<init>(r3, r0)
                r0 = 16
                r8 = 1
                r7.mo20693g(r0, r8)
                com.braze.push.BrazeNotificationUtils.m11209l(r7, r1)
                com.braze.push.BrazeNotificationUtils.m11206i(r7, r1)
                com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r16 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.push.BrazeNotificationUtils$setTickerIfPresent$1 r14 = com.braze.push.BrazeNotificationUtils$setTickerIfPresent$1.INSTANCE
                r12 = 0
                r13 = 0
                r15 = 7
                r10 = r0
                r11 = r16
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                java.lang.String r10 = r34.getTitleText()
                if (r10 != 0) goto L_0x00e1
                goto L_0x00e9
            L_0x00e1:
                android.app.Notification r11 = r7.f17655C
                java.lang.CharSequence r10 = p250u0.C8100m.m16287c(r10)
                r11.tickerText = r10
            L_0x00e9:
                boolean r10 = r34.isPushStory()
                if (r10 == 0) goto L_0x00fc
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setSetShowWhen$1 r14 = com.braze.push.BrazeNotificationUtils$setSetShowWhen$1.INSTANCE
                r15 = 7
                r10 = r0
                r11 = r16
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                r7.f17667k = r6
            L_0x00fc:
                r10 = 1140850688(0x44000000, float:512.0)
                java.lang.String r0 = "com.appboy.action.APPBOY_PUSH_CLICKED"
                android.content.Intent r11 = new android.content.Intent     // Catch:{ Exception -> 0x0123 }
                r11.<init>(r0)     // Catch:{ Exception -> 0x0123 }
                android.content.Intent r0 = r11.setClass(r3, r2)     // Catch:{ Exception -> 0x0123 }
                java.lang.String r11 = "Intent(action).setClass(…lineActivity::class.java)"
                kotlin.jvm.internal.C19383o.m32796f(r0, r11)     // Catch:{ Exception -> 0x0123 }
                if (r5 == 0) goto L_0x0113
                r0.putExtras(r5)     // Catch:{ Exception -> 0x0123 }
            L_0x0113:
                int r11 = com.braze.support.IntentUtils.m11307b()     // Catch:{ Exception -> 0x0123 }
                android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r3, r11, r0, r10)     // Catch:{ Exception -> 0x0123 }
                java.lang.String r11 = "getActivity(context, get… pushActionIntent, flags)"
                kotlin.jvm.internal.C19383o.m32796f(r0, r11)     // Catch:{ Exception -> 0x0123 }
                r7.f17663g = r0     // Catch:{ Exception -> 0x0123 }
                goto L_0x0132
            L_0x0123:
                r0 = move-exception
                r15 = r0
                com.braze.support.BrazeLogger r12 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r13 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r14 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$setContentIntentIfPresent$1 r16 = com.braze.push.BrazeNotificationUtils$setContentIntentIfPresent$1.INSTANCE
                r17 = 4
                com.braze.support.BrazeLogger.m11282d(r12, r13, r14, r15, r16, r17)
            L_0x0132:
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0158 }
                java.lang.String r11 = "com.appboy.action.APPBOY_PUSH_DELETED"
                r0.<init>(r11)     // Catch:{ Exception -> 0x0158 }
                java.lang.Class r11 = com.braze.push.BrazeNotificationUtils.m11200b()     // Catch:{ Exception -> 0x0158 }
                android.content.Intent r0 = r0.setClass(r3, r11)     // Catch:{ Exception -> 0x0158 }
                java.lang.String r11 = "Intent(Constants.BRAZE_P…otificationReceiverClass)"
                kotlin.jvm.internal.C19383o.m32796f(r0, r11)     // Catch:{ Exception -> 0x0158 }
                if (r5 == 0) goto L_0x014b
                r0.putExtras(r5)     // Catch:{ Exception -> 0x0158 }
            L_0x014b:
                int r5 = com.braze.support.IntentUtils.m11307b()     // Catch:{ Exception -> 0x0158 }
                android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r3, r5, r0, r10)     // Catch:{ Exception -> 0x0158 }
                android.app.Notification r3 = r7.f17655C     // Catch:{ Exception -> 0x0158 }
                r3.deleteIntent = r0     // Catch:{ Exception -> 0x0158 }
                goto L_0x0166
            L_0x0158:
                r0 = move-exception
                r13 = r0
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r12 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$setDeleteIntent$1 r14 = com.braze.push.BrazeNotificationUtils$setDeleteIntent$1.INSTANCE
                r15 = 4
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
            L_0x0166:
                com.braze.push.BrazeNotificationUtils.m11207j(r4, r7)
                boolean r0 = r34.isPushStory()
                if (r0 == 0) goto L_0x017d
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$1 r14 = com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$1.INSTANCE
                r15 = 7
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                goto L_0x01fb
            L_0x017d:
                android.content.Context r0 = r34.getContext()
                if (r0 != 0) goto L_0x0185
                goto L_0x01fb
            L_0x0185:
                com.braze.configuration.BrazeConfigurationProvider r3 = r34.getConfigurationProvider()
                if (r3 != 0) goto L_0x018d
                goto L_0x01fb
            L_0x018d:
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x01de }
                com.braze.push.BrazeNotificationUtils r5 = com.braze.push.BrazeNotificationUtils.f11857a     // Catch:{ Exception -> 0x01de }
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$2 r14 = com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$2.INSTANCE     // Catch:{ Exception -> 0x01de }
                r15 = 7
                r10 = r4
                r11 = r5
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01de }
                java.lang.String r10 = r34.getLargeIcon()     // Catch:{ Exception -> 0x01de }
                if (r10 != 0) goto L_0x01c8
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4 r14 = com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4.INSTANCE     // Catch:{ Exception -> 0x01de }
                r15 = 7
                r10 = r4
                r11 = r5
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01de }
                int r3 = r3.getLargeNotificationIconResourceId()     // Catch:{ Exception -> 0x01de }
                if (r3 == 0) goto L_0x01bd
                android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x01de }
                android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r3)     // Catch:{ Exception -> 0x01de }
                r7.mo20694h(r0)     // Catch:{ Exception -> 0x01de }
                goto L_0x01fb
            L_0x01bd:
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$5 r14 = com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$5.INSTANCE     // Catch:{ Exception -> 0x01de }
                r15 = 7
                r10 = r4
                r11 = r5
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01de }
                goto L_0x01ec
            L_0x01c8:
                com.braze.Braze$Companion r3 = com.braze.Braze.f11170m     // Catch:{ Exception -> 0x01de }
                com.braze.Braze r3 = r3.mo15515f(r0)     // Catch:{ Exception -> 0x01de }
                com.braze.images.a r3 = r3.mo15499n()     // Catch:{ Exception -> 0x01de }
                com.braze.enums.BrazeViewBounds r4 = com.braze.enums.BrazeViewBounds.NOTIFICATION_LARGE_ICON     // Catch:{ Exception -> 0x01de }
                com.braze.images.DefaultBrazeImageLoader r3 = (com.braze.images.DefaultBrazeImageLoader) r3     // Catch:{ Exception -> 0x01de }
                android.graphics.Bitmap r0 = r3.mo15921b(r0, r10, r4)     // Catch:{ Exception -> 0x01de }
                r7.mo20694h(r0)     // Catch:{ Exception -> 0x01de }
                goto L_0x01fb
            L_0x01de:
                r0 = move-exception
                r13 = r0
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r12 = com.braze.support.BrazeLogger.Priority.E
                com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$6 r14 = com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$6.INSTANCE
                r15 = 4
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
            L_0x01ec:
                com.braze.support.BrazeLogger r16 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r17 = com.braze.push.BrazeNotificationUtils.f11857a
                r18 = 0
                r19 = 0
                com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$7 r20 = com.braze.push.BrazeNotificationUtils$setLargeIconIfPresentAndSupported$7.INSTANCE
                r21 = 7
                com.braze.support.BrazeLogger.m11282d(r16, r17, r18, r19, r20, r21)
            L_0x01fb:
                java.lang.String r0 = r34.getNotificationSound()
                if (r0 != 0) goto L_0x0202
                goto L_0x022e
            L_0x0202:
                java.lang.String r3 = "d"
                boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r0, r3)
                if (r3 == 0) goto L_0x021b
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$1 r14 = com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$1.INSTANCE
                r15 = 7
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                android.app.Notification r0 = r7.f17655C
                r0.defaults = r8
                goto L_0x022e
            L_0x021b:
                com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r11 = com.braze.push.BrazeNotificationUtils.f11857a
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$2 r14 = com.braze.push.BrazeNotificationUtils$setSoundIfPresentAndSupported$2.INSTANCE
                r15 = 7
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                android.net.Uri r0 = android.net.Uri.parse(r0)
                r7.mo20695i(r0)
            L_0x022e:
                com.braze.push.BrazeNotificationUtils.m11208k(r7, r1)
                com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r3 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.push.BrazeNotificationUtils$setPriorityIfPresentAndSupported$1 r14 = com.braze.push.BrazeNotificationUtils$setPriorityIfPresentAndSupported$1.INSTANCE
                r12 = 0
                r13 = 0
                r15 = 7
                r10 = r0
                r11 = r3
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                java.lang.Integer r4 = r34.getNotificationPriorityInt()
                java.lang.Integer r5 = r34.getNotificationPriorityInt()
                if (r5 != 0) goto L_0x024a
                goto L_0x0268
            L_0x024a:
                int r5 = r5.intValue()
                r10 = -2
                if (r10 > r5) goto L_0x0256
                r10 = 3
                if (r5 >= r10) goto L_0x0256
                r10 = r8
                goto L_0x0257
            L_0x0256:
                r10 = r6
            L_0x0257:
                if (r10 == 0) goto L_0x025a
                goto L_0x0269
            L_0x025a:
                com.braze.support.BrazeLogger$Priority r12 = com.braze.support.BrazeLogger.Priority.W
                r13 = 0
                com.braze.push.BrazeNotificationUtils$getNotificationPriority$1$1 r14 = new com.braze.push.BrazeNotificationUtils$getNotificationPriority$1$1
                r14.<init>(r4)
                r15 = 6
                r10 = r0
                r11 = r3
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
            L_0x0268:
                r5 = r6
            L_0x0269:
                r7.f17666j = r5
                com.braze.push.BrazeNotificationStyleFactory$Companion r3 = com.braze.push.BrazeNotificationStyleFactory.Companion
                r3.mo16052c(r7, r1)
                android.content.Context r3 = r34.getContext()
                if (r3 != 0) goto L_0x0283
                com.google.android.play.core.appupdate.d r11 = com.google.android.play.core.appupdate.C15562d.f35019d
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationActionUtils$addNotificationActions$1 r14 = com.braze.push.BrazeNotificationActionUtils$addNotificationActions$1.INSTANCE
                r15 = 7
                r10 = r0
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                goto L_0x0408
            L_0x0283:
                java.util.List r3 = r34.getActionButtons()
                boolean r4 = r3.isEmpty()
                if (r4 == 0) goto L_0x029a
                com.google.android.play.core.appupdate.d r11 = com.google.android.play.core.appupdate.C15562d.f35019d
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationActionUtils$addNotificationActions$2 r14 = com.braze.push.BrazeNotificationActionUtils$addNotificationActions$2.INSTANCE
                r15 = 7
                r10 = r0
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                goto L_0x0408
            L_0x029a:
                java.util.Iterator r0 = r3.iterator()
            L_0x029e:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0408
                java.lang.Object r3 = r0.next()
                com.appboy.models.push.BrazeNotificationPayload$ActionButton r3 = (com.appboy.models.push.BrazeNotificationPayload.ActionButton) r3
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.f11932a
                com.google.android.play.core.appupdate.d r5 = com.google.android.play.core.appupdate.C15562d.f35019d
                com.braze.support.BrazeLogger$Priority r16 = com.braze.support.BrazeLogger.Priority.V
                r13 = 0
                com.braze.push.BrazeNotificationActionUtils$addNotificationActions$3 r14 = new com.braze.push.BrazeNotificationActionUtils$addNotificationActions$3
                r14.<init>(r3)
                r15 = 6
                r10 = r4
                r11 = r5
                r12 = r16
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                java.lang.String r10 = "actionButton"
                kotlin.jvm.internal.C19383o.m32797g(r3, r10)
                android.content.Context r15 = r34.getContext()
                if (r15 != 0) goto L_0x02d5
                r12 = 0
                r13 = 0
                com.braze.push.BrazeNotificationActionUtils$addNotificationAction$1 r14 = com.braze.push.BrazeNotificationActionUtils$addNotificationAction$1.INSTANCE
                r15 = 7
                r10 = r4
                r11 = r5
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                goto L_0x0403
            L_0x02d5:
                android.os.Bundle r14 = new android.os.Bundle
                android.os.Bundle r10 = r34.getNotificationExtras()
                r14.<init>(r10)
                r3.putIntoBundle(r14)
                java.lang.String r10 = r3.getType()
                com.braze.support.IntentUtils r11 = com.braze.support.IntentUtils.f11948a
                java.lang.String r11 = "ab_none"
                boolean r11 = kotlin.jvm.internal.C19383o.m32792b(r11, r10)
                java.lang.String r13 = "com.appboy.action.APPBOY_ACTION_CLICKED"
                r12 = 201326592(0xc000000, float:9.8607613E-32)
                if (r11 == 0) goto L_0x0336
                r17 = 0
                com.braze.push.BrazeNotificationActionUtils$addNotificationAction$2 r11 = new com.braze.push.BrazeNotificationActionUtils$addNotificationAction$2
                r11.<init>(r10)
                r18 = 6
                r10 = r4
                r19 = r11
                r11 = r5
                r6 = r12
                r12 = r16
                r9 = r13
                r13 = r17
                r8 = r14
                r14 = r19
                r6 = r15
                r15 = r18
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                android.content.Intent r10 = new android.content.Intent
                r10.<init>(r9)
                java.lang.Class r9 = com.braze.push.BrazeNotificationUtils.m11200b()
                android.content.Intent r9 = r10.setClass(r6, r9)
                java.lang.String r10 = "Intent(Constants.BRAZE_A…ceiverClass\n            )"
                kotlin.jvm.internal.C19383o.m32796f(r9, r10)
                r9.putExtras(r8)
                int r10 = com.braze.support.IntentUtils.m11307b()
                r11 = 201326592(0xc000000, float:9.8607613E-32)
                android.app.PendingIntent r6 = android.app.PendingIntent.getBroadcast(r6, r10, r9, r11)
                java.lang.String r9 = "getBroadcast(\n          …IntentFlags\n            )"
                kotlin.jvm.internal.C19383o.m32796f(r6, r9)
            L_0x0333:
                r25 = r6
                goto L_0x0390
            L_0x0336:
                r9 = r13
                r8 = r14
                r6 = r15
                r13 = 0
                com.braze.push.BrazeNotificationActionUtils$addNotificationAction$3 r14 = new com.braze.push.BrazeNotificationActionUtils$addNotificationAction$3
                r14.<init>(r10)
                r15 = 6
                r10 = r4
                r11 = r5
                r12 = r16
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
                android.content.Intent r10 = new android.content.Intent
                r10.<init>(r9)
                android.content.Intent r9 = r10.setClass(r6, r2)
                java.lang.String r10 = "Intent(Constants.BRAZE_A…lineActivity::class.java)"
                kotlin.jvm.internal.C19383o.m32796f(r9, r10)
                int r10 = r9.getFlags()
                com.braze.IBrazeDeeplinkHandler$IntentFlagPurpose r11 = com.braze.IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK
                java.lang.String r12 = "intentFlagPurpose"
                kotlin.jvm.internal.C19383o.m32797g(r11, r12)
                int[] r12 = com.braze.p044ui.BrazeDeeplinkHandler.C5622a.f12012a
                int r11 = r11.ordinal()
                r11 = r12[r11]
                switch(r11) {
                    case 1: goto L_0x0377;
                    case 2: goto L_0x0377;
                    case 3: goto L_0x0374;
                    case 4: goto L_0x0374;
                    case 5: goto L_0x0374;
                    case 6: goto L_0x0371;
                    case 7: goto L_0x0371;
                    default: goto L_0x036b;
                }
            L_0x036b:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L_0x0371:
                r11 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x0379
            L_0x0374:
                r11 = 872415232(0x34000000, float:1.1920929E-7)
                goto L_0x0379
            L_0x0377:
                r11 = 1073741824(0x40000000, float:2.0)
            L_0x0379:
                r10 = r10 | r11
                r9.setFlags(r10)
                r9.putExtras(r8)
                int r10 = com.braze.support.IntentUtils.m11307b()
                r11 = 201326592(0xc000000, float:9.8607613E-32)
                android.app.PendingIntent r6 = android.app.PendingIntent.getActivity(r6, r10, r9, r11)
                java.lang.String r9 = "getActivity(\n           …IntentFlags\n            )"
                kotlin.jvm.internal.C19383o.m32796f(r6, r9)
                goto L_0x0333
            L_0x0390:
                java.lang.String r3 = r3.getText()
                r23 = 0
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
                r31 = 1
                java.lang.CharSequence r24 = p250u0.C8100m.m16287c(r3)
                r32 = 0
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>(r8)
                r6.putAll(r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                boolean r10 = r3.isEmpty()
                if (r10 == 0) goto L_0x03be
                r28 = 0
                goto L_0x03cc
            L_0x03be:
                int r10 = r3.size()
                u0.v[] r10 = new p250u0.C8111v[r10]
                java.lang.Object[] r3 = r3.toArray(r10)
                u0.v[] r3 = (p250u0.C8111v[]) r3
                r28 = r3
            L_0x03cc:
                boolean r3 = r9.isEmpty()
                if (r3 == 0) goto L_0x03d5
                r27 = 0
                goto L_0x03e3
            L_0x03d5:
                int r3 = r9.size()
                u0.v[] r3 = new p250u0.C8111v[r3]
                java.lang.Object[] r3 = r9.toArray(r3)
                u0.v[] r3 = (p250u0.C8111v[]) r3
                r27 = r3
            L_0x03e3:
                u0.j r3 = new u0.j
                r22 = r3
                r26 = r6
                r29 = r31
                r30 = r32
                r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                java.util.ArrayList<u0.j> r6 = r7.f17658b
                r6.add(r3)
                r13 = 0
                com.braze.push.BrazeNotificationActionUtils$addNotificationAction$4 r14 = new com.braze.push.BrazeNotificationActionUtils$addNotificationAction$4
                r14.<init>(r8)
                r15 = 6
                r10 = r4
                r11 = r5
                r12 = r16
                com.braze.support.BrazeLogger.m11282d(r10, r11, r12, r13, r14, r15)
            L_0x0403:
                r6 = 0
                r8 = 1
                r9 = 0
                goto L_0x029e
            L_0x0408:
                com.braze.push.BrazeNotificationUtils.m11205h(r7, r1)
                java.lang.String r0 = r34.getNotificationCategory()
                if (r0 == 0) goto L_0x0420
                com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r9 = com.braze.push.BrazeNotificationUtils.f11857a
                r10 = 0
                r11 = 0
                com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$2 r12 = com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$2.INSTANCE
                r13 = 7
                com.braze.support.BrazeLogger.m11282d(r8, r9, r10, r11, r12, r13)
                r7.f17675s = r0
                goto L_0x042f
            L_0x0420:
                com.braze.support.BrazeLogger r21 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r22 = com.braze.push.BrazeNotificationUtils.f11857a
                r23 = 0
                r24 = 0
                com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$3 r25 = com.braze.push.BrazeNotificationUtils$setCategoryIfPresentAndSupported$3.INSTANCE
                r26 = 7
                com.braze.support.BrazeLogger.m11282d(r21, r22, r23, r24, r25, r26)
            L_0x042f:
                java.lang.Integer r0 = r34.getNotificationVisibility()
                if (r0 == 0) goto L_0x046b
                int r2 = r0.intValue()
                r3 = -1
                if (r2 == r3) goto L_0x0444
                if (r2 == 0) goto L_0x0444
                r3 = 1
                if (r2 != r3) goto L_0x0442
                goto L_0x0445
            L_0x0442:
                r6 = 0
                goto L_0x0446
            L_0x0444:
                r3 = 1
            L_0x0445:
                r6 = r3
            L_0x0446:
                if (r6 == 0) goto L_0x045b
                com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r9 = com.braze.push.BrazeNotificationUtils.f11857a
                r10 = 0
                r11 = 0
                com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$2 r12 = com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$2.INSTANCE
                r13 = 7
                com.braze.support.BrazeLogger.m11282d(r8, r9, r10, r11, r12, r13)
                int r0 = r0.intValue()
                r7.f17678v = r0
                goto L_0x046b
            L_0x045b:
                com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r9 = com.braze.push.BrazeNotificationUtils.f11857a
                com.braze.support.BrazeLogger$Priority r10 = com.braze.support.BrazeLogger.Priority.W
                r11 = 0
                com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$3 r12 = new com.braze.push.BrazeNotificationUtils$setVisibilityIfPresentAndSupported$3
                r12.<init>(r0)
                r13 = 6
                com.braze.support.BrazeLogger.m11282d(r8, r9, r10, r11, r12, r13)
            L_0x046b:
                android.content.Context r0 = r34.getContext()
                com.braze.configuration.BrazeConfigurationProvider r2 = r34.getConfigurationProvider()
                if (r0 == 0) goto L_0x04ca
                java.lang.String r3 = r34.getPublicNotificationExtras()
                if (r3 == 0) goto L_0x04ca
                if (r2 != 0) goto L_0x047e
                goto L_0x04ca
            L_0x047e:
                java.lang.String r3 = com.braze.push.BrazeNotificationUtils.m11201c(r34)
                java.lang.String r4 = r34.getPublicNotificationExtras()
                android.os.Bundle r15 = com.braze.support.JsonUtils.m11318i(r4)
                boolean r4 = r15.isEmpty()
                if (r4 == 0) goto L_0x0491
                goto L_0x04ca
            L_0x0491:
                com.appboy.models.push.BrazeNotificationPayload r4 = new com.appboy.models.push.BrazeNotificationPayload
                r16 = 0
                r19 = 2
                r20 = 0
                r14 = r4
                r17 = r0
                r18 = r2
                r14.<init>(r15, r16, r17, r18, r19, r20)
                u0.m r5 = new u0.m
                r5.<init>(r0, r3)
                com.braze.support.BrazeLogger r8 = com.braze.support.BrazeLogger.f11932a
                com.braze.push.BrazeNotificationUtils r9 = com.braze.push.BrazeNotificationUtils.f11857a
                r10 = 0
                r11 = 0
                com.braze.push.BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$2 r12 = new com.braze.push.BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$2
                r12.<init>(r4)
                r13 = 7
                com.braze.support.BrazeLogger.m11282d(r8, r9, r10, r11, r12, r13)
                com.braze.push.BrazeNotificationUtils.m11206i(r5, r4)
                com.braze.push.BrazeNotificationUtils.m11209l(r5, r4)
                com.braze.push.BrazeNotificationUtils.m11208k(r5, r4)
                com.braze.push.BrazeNotificationUtils.m11207j(r2, r5)
                com.braze.push.BrazeNotificationUtils.m11205h(r5, r4)
                android.app.Notification r0 = r5.mo20689b()
                r7.f17679w = r0
            L_0x04ca:
                java.lang.Integer r0 = r34.getNotificationBadgeNumber()
                if (r0 == 0) goto L_0x04d6
                int r0 = r0.intValue()
                r7.f17665i = r0
            L_0x04d6:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazeNotificationFactory.Companion.mo16051a(com.appboy.models.push.BrazeNotificationPayload):u0.m");
        }
    }

    public static final BrazeNotificationFactory getInstance() {
        Companion.getClass();
        return internalInstance;
    }

    public static final C8100m populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
        return Companion.mo16051a(brazeNotificationPayload);
    }

    public Notification createNotification(BrazeNotificationPayload brazeNotificationPayload) {
        C19383o.m32797g(brazeNotificationPayload, "payload");
        C8100m a = Companion.mo16051a(brazeNotificationPayload);
        if (a != null) {
            return a.mo20689b();
        }
        BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, BrazeNotificationFactory$createNotification$1.INSTANCE, 6);
        return null;
    }

    public final C8100m populateNotificationBuilder(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return Companion.mo16051a(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }

    public final Notification createNotification(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Bundle bundle, Bundle bundle2) {
        return createNotification(new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider));
    }
}
