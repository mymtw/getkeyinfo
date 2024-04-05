package p517bn;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: bn.c */
public final class C14106c {

    /* renamed from: a */
    public final Executor f31063a;

    /* renamed from: b */
    public final Context f31064b;

    /* renamed from: c */
    public final C14130u f31065c;

    public C14106c(Context context, C14130u uVar, ExecutorService executorService) {
        this.f31063a = executorService;
        this.f31064b = context;
        this.f31065c = uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        if (r0 != null) goto L_0x00cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x037b A[SYNTHETIC, Splitter:B:151:0x037b] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03af A[SYNTHETIC, Splitter:B:157:0x03af] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0438  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04a9  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x053d A[SYNTHETIC, Splitter:B:224:0x053d] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0595  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc A[Catch:{ NameNotFoundException -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46979a() {
        /*
            r16 = this;
            r1 = r16
            bn.u r0 = r1.f31065c
            java.lang.String r2 = "gcm.n.noui"
            boolean r0 = r0.mo47014a(r2)
            r2 = 1
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.Context r0 = r1.f31064b
            java.lang.String r3 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r3 = 0
            if (r0 == 0) goto L_0x0020
            goto L_0x005b
        L_0x0020:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r0 != 0) goto L_0x002b
            r4 = 10
            android.os.SystemClock.sleep(r4)
        L_0x002b:
            int r0 = android.os.Process.myPid()
            android.content.Context r4 = r1.f31064b
            java.lang.String r5 = "activity"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            java.util.List r4 = r4.getRunningAppProcesses()
            if (r4 == 0) goto L_0x005b
            java.util.Iterator r4 = r4.iterator()
        L_0x0043:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005b
            java.lang.Object r5 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5
            int r6 = r5.pid
            if (r6 != r0) goto L_0x0043
            int r0 = r5.importance
            r4 = 100
            if (r0 != r4) goto L_0x005b
            r0 = r2
            goto L_0x005c
        L_0x005b:
            r0 = r3
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            return r3
        L_0x005f:
            bn.u r0 = r1.f31065c
            java.lang.String r4 = "gcm.n.image"
            java.lang.String r0 = r0.mo47022i(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "FirebaseMessaging"
            if (r4 == 0) goto L_0x0070
            goto L_0x0094
        L_0x0070:
            bn.r r4 = new bn.r     // Catch:{ MalformedURLException -> 0x007b }
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x007b }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x007b }
            r4.<init>(r7)     // Catch:{ MalformedURLException -> 0x007b }
            goto L_0x0095
        L_0x007b:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "Not downloading image, bad URL: "
            int r7 = r0.length()
            if (r7 == 0) goto L_0x008c
            java.lang.String r0 = r4.concat(r0)
            goto L_0x0091
        L_0x008c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
        L_0x0091:
            android.util.Log.w(r5, r0)
        L_0x0094:
            r4 = 0
        L_0x0095:
            if (r4 == 0) goto L_0x00a4
            java.util.concurrent.Executor r0 = r1.f31063a
            bn.q r7 = new bn.q
            r7.<init>(r4)
            kk.a0 r0 = p605kk.C18126j.m30615c(r0, r7)
            r4.f31120c = r0
        L_0x00a4:
            android.content.Context r7 = r1.f31064b
            bn.u r8 = r1.f31065c
            java.util.concurrent.atomic.AtomicInteger r0 = p517bn.C14102a.f31055a
            java.lang.String r9 = "Couldn't get own application info: "
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.lang.String r10 = r7.getPackageName()
            r11 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r10, r11)     // Catch:{ NameNotFoundException -> 0x00c1 }
            if (r0 == 0) goto L_0x00cd
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x00c1 }
            if (r0 == 0) goto L_0x00cd
            goto L_0x00cf
        L_0x00c1:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r9.concat(r0)
            android.util.Log.w(r5, r0)
        L_0x00cd:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
        L_0x00cf:
            r10 = r0
            java.lang.String r11 = r7.getPackageName()
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r0 = r8.mo47022i(r0)
            r12 = 3
            android.content.pm.PackageManager r13 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0173 }
            java.lang.String r14 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0173 }
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo(r14, r3)     // Catch:{ NameNotFoundException -> 0x0173 }
            int r13 = r13.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x0173 }
            r14 = 26
            if (r13 < r14) goto L_0x0173
            java.lang.Class<android.app.NotificationManager> r13 = android.app.NotificationManager.class
            java.lang.Object r13 = r7.getSystemService(r13)
            android.app.NotificationManager r13 = (android.app.NotificationManager) r13
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x0126
            android.app.NotificationChannel r14 = r13.getNotificationChannel(r0)
            if (r14 == 0) goto L_0x0103
            goto L_0x0174
        L_0x0103:
            java.lang.String r14 = java.lang.String.valueOf(r0)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 122
            r15.<init>(r14)
            java.lang.String r14 = "Notification Channel requested ("
            r15.append(r14)
            r15.append(r0)
            java.lang.String r0 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.util.Log.w(r5, r0)
        L_0x0126:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r0 = r10.getString(r0)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x013f
            android.app.NotificationChannel r14 = r13.getNotificationChannel(r0)
            if (r14 == 0) goto L_0x0139
            goto L_0x0174
        L_0x0139:
            java.lang.String r0 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r5, r0)
            goto L_0x0144
        L_0x013f:
            java.lang.String r0 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r5, r0)
        L_0x0144:
            java.lang.String r0 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r14 = r13.getNotificationChannel(r0)
            if (r14 != 0) goto L_0x0174
            android.content.res.Resources r14 = r7.getResources()
            java.lang.String r15 = r7.getPackageName()
            java.lang.String r6 = "fcm_fallback_notification_channel_label"
            java.lang.String r2 = "string"
            int r2 = r14.getIdentifier(r6, r2, r15)
            if (r2 != 0) goto L_0x0166
            java.lang.String r2 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r5, r2)
            java.lang.String r2 = "Misc"
            goto L_0x016a
        L_0x0166:
            java.lang.String r2 = r7.getString(r2)
        L_0x016a:
            android.app.NotificationChannel r6 = new android.app.NotificationChannel
            r6.<init>(r0, r2, r12)
            r13.createNotificationChannel(r6)
            goto L_0x0174
        L_0x0173:
            r0 = 0
        L_0x0174:
            android.content.res.Resources r2 = r7.getResources()
            android.content.pm.PackageManager r6 = r7.getPackageManager()
            u0.m r13 = new u0.m
            r13.<init>(r7, r0)
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r0 = r8.mo47021h(r2, r11, r0)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x0190
            r13.mo20691e(r0)
        L_0x0190:
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r0 = r8.mo47021h(r2, r11, r0)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x01aa
            r13.mo20690d(r0)
            u0.l r14 = new u0.l
            r14.<init>()
            r14.mo20687h(r0)
            r13.mo20696j(r14)
        L_0x01aa:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = r8.mo47022i(r0)
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto L_0x01f5
            java.lang.String r14 = "drawable"
            int r14 = r2.getIdentifier(r0, r14, r11)
            if (r14 == 0) goto L_0x01c4
            boolean r15 = p517bn.C14102a.m21837a(r2, r14)
            if (r15 != 0) goto L_0x0223
        L_0x01c4:
            java.lang.String r14 = "mipmap"
            int r14 = r2.getIdentifier(r0, r14, r11)
            if (r14 == 0) goto L_0x01d2
            boolean r15 = p517bn.C14102a.m21837a(r2, r14)
            if (r15 != 0) goto L_0x0223
        L_0x01d2:
            java.lang.String r14 = java.lang.String.valueOf(r0)
            int r14 = r14.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r14 = r14 + 61
            r15.<init>(r14)
            java.lang.String r14 = "Icon resource "
            r15.append(r14)
            r15.append(r0)
            java.lang.String r0 = " not found. Notification will use default icon."
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.util.Log.w(r5, r0)
        L_0x01f5:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r14 = r10.getInt(r0, r3)
            if (r14 == 0) goto L_0x0203
            boolean r0 = p517bn.C14102a.m21837a(r2, r14)
            if (r0 != 0) goto L_0x0217
        L_0x0203:
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r11, r3)     // Catch:{ NameNotFoundException -> 0x020b }
            int r0 = r0.icon     // Catch:{ NameNotFoundException -> 0x020b }
            r14 = r0
            goto L_0x0217
        L_0x020b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r9.concat(r0)
            android.util.Log.w(r5, r0)
        L_0x0217:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
            if (r14 == 0) goto L_0x0222
            boolean r9 = p517bn.C14102a.m21837a(r2, r14)
            if (r9 != 0) goto L_0x0223
        L_0x0222:
            r14 = r0
        L_0x0223:
            android.app.Notification r0 = r13.f17655C
            r0.icon = r14
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r8.mo47022i(r0)
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 == 0) goto L_0x0239
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r8.mo47022i(r0)
        L_0x0239:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            r14 = 2
            if (r9 == 0) goto L_0x0242
            r0 = 0
            goto L_0x0287
        L_0x0242:
            java.lang.String r9 = "default"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0283
            java.lang.String r9 = "raw"
            int r2 = r2.getIdentifier(r0, r9, r11)
            if (r2 == 0) goto L_0x0283
            java.lang.String r2 = java.lang.String.valueOf(r11)
            int r2 = r2.length()
            java.lang.String r9 = java.lang.String.valueOf(r0)
            int r9 = r9.length()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            int r2 = r2 + 24
            int r2 = r2 + r9
            r15.<init>(r2)
            java.lang.String r2 = "android.resource://"
            r15.append(r2)
            r15.append(r11)
            java.lang.String r2 = "/raw/"
            r15.append(r2)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x0287
        L_0x0283:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r14)
        L_0x0287:
            if (r0 == 0) goto L_0x028c
            r13.mo20695i(r0)
        L_0x028c:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r8.mo47022i(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x02a6
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r0)
            r2.setPackage(r11)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.setFlags(r0)
            goto L_0x02c5
        L_0x02a6:
            android.net.Uri r0 = r8.mo47018e()
            if (r0 == 0) goto L_0x02ba
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r2.<init>(r6)
            r2.setPackage(r11)
            r2.setData(r0)
            goto L_0x02c5
        L_0x02ba:
            android.content.Intent r2 = r6.getLaunchIntentForPackage(r11)
            if (r2 != 0) goto L_0x02c5
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r5, r0)
        L_0x02c5:
            r0 = 1140850688(0x44000000, float:512.0)
            java.lang.String r6 = "google.c.a.e"
            if (r2 != 0) goto L_0x02cd
            r2 = 0
            goto L_0x032e
        L_0x02cd:
            r9 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r9)
            android.os.Bundle r9 = new android.os.Bundle
            android.os.Bundle r11 = r8.f31127a
            r9.<init>(r11)
            android.os.Bundle r11 = r8.f31127a
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x02e3:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0312
            java.lang.Object r15 = r11.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r12 = "google.c."
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x030a
            java.lang.String r12 = "gcm.n."
            boolean r12 = r15.startsWith(r12)
            if (r12 != 0) goto L_0x030a
            java.lang.String r12 = "gcm.notification."
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x0308
            goto L_0x030a
        L_0x0308:
            r12 = r3
            goto L_0x030b
        L_0x030a:
            r12 = 1
        L_0x030b:
            if (r12 == 0) goto L_0x0310
            r9.remove(r15)
        L_0x0310:
            r12 = 3
            goto L_0x02e3
        L_0x0312:
            r2.putExtras(r9)
            boolean r9 = r8.mo47014a(r6)
            if (r9 == 0) goto L_0x0324
            android.os.Bundle r9 = r8.mo47024l()
            java.lang.String r11 = "gcm.n.analytics_data"
            r2.putExtra(r11, r9)
        L_0x0324:
            java.util.concurrent.atomic.AtomicInteger r9 = p517bn.C14102a.f31055a
            int r9 = r9.incrementAndGet()
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r7, r9, r2, r0)
        L_0x032e:
            r13.f17663g = r2
            boolean r2 = r8.mo47014a(r6)
            if (r2 != 0) goto L_0x0338
            r0 = 0
            goto L_0x0369
        L_0x0338:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r6 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r2.<init>(r6)
            android.os.Bundle r6 = r8.mo47024l()
            android.content.Intent r2 = r2.putExtras(r6)
            java.util.concurrent.atomic.AtomicInteger r6 = p517bn.C14102a.f31055a
            int r6 = r6.incrementAndGet()
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r11 = "com.google.firebase.MESSAGING_EVENT"
            r9.<init>(r11)
            android.content.ComponentName r11 = new android.content.ComponentName
            java.lang.String r12 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r11.<init>(r7, r12)
            android.content.Intent r9 = r9.setComponent(r11)
            java.lang.String r11 = "wrapped_intent"
            android.content.Intent r2 = r9.putExtra(r11, r2)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r7, r6, r2, r0)
        L_0x0369:
            if (r0 == 0) goto L_0x036f
            android.app.Notification r2 = r13.f17655C
            r2.deleteIntent = r0
        L_0x036f:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r8.mo47022i(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x03a7
            int r2 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x0384 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0384 }
            goto L_0x03c0
        L_0x0384:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r2 = r2 + 56
            r6.<init>(r2)
            java.lang.String r2 = "Color is invalid: "
            r6.append(r2)
            r6.append(r0)
            java.lang.String r0 = ". Notification will use default color."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r5, r0)
        L_0x03a7:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r10.getInt(r0, r3)
            if (r0 == 0) goto L_0x03bf
            java.lang.Object r2 = p260v0.C8184a.f17966a     // Catch:{ NotFoundException -> 0x03ba }
            int r0 = p260v0.C8184a.C8188d.m16468a(r7, r0)     // Catch:{ NotFoundException -> 0x03ba }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x03ba }
            goto L_0x03c0
        L_0x03ba:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r5, r0)
        L_0x03bf:
            r0 = 0
        L_0x03c0:
            if (r0 == 0) goto L_0x03c8
            int r0 = r0.intValue()
            r13.f17677u = r0
        L_0x03c8:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r8.mo47014a(r0)
            r2 = 1
            r0 = r0 ^ r2
            r2 = 16
            r13.mo20693g(r2, r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r8.mo47014a(r0)
            r13.f17674r = r0
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r8.mo47022i(r0)
            if (r0 == 0) goto L_0x03ed
            android.app.Notification r2 = r13.f17655C
            java.lang.CharSequence r0 = p250u0.C8100m.m16287c(r0)
            r2.tickerText = r0
        L_0x03ed:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r8.mo47015b(r0)
            r2 = -2
            if (r0 != 0) goto L_0x03f7
            goto L_0x0426
        L_0x03f7:
            int r6 = r0.intValue()
            if (r6 < r2) goto L_0x0403
            int r6 = r0.intValue()
            if (r6 <= r14) goto L_0x0427
        L_0x0403:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r7 = r0.length()
            int r7 = r7 + 72
            r6.<init>(r7)
            java.lang.String r7 = "notificationPriority is invalid "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = ". Skipping setting notificationPriority."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r5, r0)
        L_0x0426:
            r0 = 0
        L_0x0427:
            if (r0 == 0) goto L_0x042f
            int r0 = r0.intValue()
            r13.f17666j = r0
        L_0x042f:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r8.mo47015b(r0)
            if (r0 != 0) goto L_0x0438
            goto L_0x046b
        L_0x0438:
            int r6 = r0.intValue()
            r7 = -1
            if (r6 < r7) goto L_0x0446
            int r6 = r0.intValue()
            r7 = 1
            if (r6 <= r7) goto L_0x046c
        L_0x0446:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r7 = r0.length()
            int r7 = r7 + 53
            r6.<init>(r7)
            java.lang.String r7 = "visibility is invalid: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = ". Skipping setting visibility."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "NotificationParams"
            android.util.Log.w(r6, r0)
        L_0x046b:
            r0 = 0
        L_0x046c:
            if (r0 == 0) goto L_0x0474
            int r0 = r0.intValue()
            r13.f17678v = r0
        L_0x0474:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r8.mo47015b(r0)
            if (r0 != 0) goto L_0x047d
            goto L_0x04a6
        L_0x047d:
            int r6 = r0.intValue()
            if (r6 >= 0) goto L_0x04a7
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r7 = r0.length()
            int r7 = r7 + 67
            r6.<init>(r7)
            java.lang.String r7 = "notificationCount is invalid: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = ". Skipping setting notificationCount."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r5, r0)
        L_0x04a6:
            r0 = 0
        L_0x04a7:
            if (r0 == 0) goto L_0x04af
            int r0 = r0.intValue()
            r13.f17665i = r0
        L_0x04af:
            java.lang.Long r0 = r8.mo47020g()
            if (r0 == 0) goto L_0x04c0
            r6 = 1
            r13.f17667k = r6
            long r6 = r0.longValue()
            android.app.Notification r0 = r13.f17655C
            r0.when = r6
        L_0x04c0:
            long[] r0 = r8.mo47023j()
            if (r0 == 0) goto L_0x04ca
            android.app.Notification r6 = r13.f17655C
            r6.vibrate = r0
        L_0x04ca:
            int[] r0 = r8.mo47017d()
            if (r0 == 0) goto L_0x04ec
            r6 = r0[r3]
            r7 = 1
            r9 = r0[r7]
            r0 = r0[r14]
            android.app.Notification r7 = r13.f17655C
            r7.ledARGB = r6
            r7.ledOnMS = r9
            r7.ledOffMS = r0
            if (r9 == 0) goto L_0x04e5
            if (r0 == 0) goto L_0x04e5
            r0 = 1
            goto L_0x04e6
        L_0x04e5:
            r0 = r3
        L_0x04e6:
            int r6 = r7.flags
            r2 = r2 & r6
            r0 = r0 | r2
            r7.flags = r0
        L_0x04ec:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r8.mo47014a(r0)
            java.lang.String r2 = "gcm.n.default_vibrate_timings"
            boolean r2 = r8.mo47014a(r2)
            if (r2 == 0) goto L_0x04fc
            r0 = r0 | 2
        L_0x04fc:
            java.lang.String r2 = "gcm.n.default_light_settings"
            boolean r2 = r8.mo47014a(r2)
            if (r2 == 0) goto L_0x0506
            r0 = r0 | 4
        L_0x0506:
            android.app.Notification r2 = r13.f17655C
            r2.defaults = r0
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0514
            int r0 = r2.flags
            r6 = 1
            r0 = r0 | r6
            r2.flags = r0
        L_0x0514:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r8.mo47022i(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0521
            goto L_0x0538
        L_0x0521:
            long r6 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 37
            r0.<init>(r2)
            java.lang.String r2 = "FCM-Notification:"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
        L_0x0538:
            r2 = r0
            if (r4 != 0) goto L_0x053d
        L_0x053b:
            r4 = 3
            goto L_0x058f
        L_0x053d:
            kk.a0 r0 = r4.f31120c     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            kk.g r0 = (p605kk.C18123g) r0     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            r6 = 5
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            java.lang.Object r0 = p605kk.C18126j.m30614b(r0, r6, r8)     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            r13.mo20694h(r0)     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            u0.k r6 = new u0.k     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            r6.<init>()     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            r6.f17649e = r0     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            r7 = 0
            r6.f17650f = r7     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            r7 = 1
            r6.f17651g = r7     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            r13.mo20696j(r6)     // Catch:{ ExecutionException -> 0x057c, InterruptedException -> 0x056c, TimeoutException -> 0x0563 }
            goto L_0x053b
        L_0x0563:
            java.lang.String r0 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r5, r0)
            r4.close()
            goto L_0x053b
        L_0x056c:
            java.lang.String r0 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r5, r0)
            r4.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x053b
        L_0x057c:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "Failed to download image: "
            java.lang.String r0 = r4.concat(r0)
            android.util.Log.w(r5, r0)
            goto L_0x053b
        L_0x058f:
            boolean r0 = android.util.Log.isLoggable(r5, r4)
            if (r0 == 0) goto L_0x059a
            java.lang.String r0 = "Showing notification"
            android.util.Log.d(r5, r0)
        L_0x059a:
            android.content.Context r0 = r1.f31064b
            java.lang.String r4 = "notification"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.app.Notification r4 = r13.mo20689b()
            r0.notify(r2, r3, r4)
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p517bn.C14106c.mo46979a():boolean");
    }
}
