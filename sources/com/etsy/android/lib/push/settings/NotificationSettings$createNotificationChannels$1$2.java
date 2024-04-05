package com.etsy.android.lib.push.settings;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p248tp.C8072t;
import p753kq.C19857l;

final class NotificationSettings$createNotificationChannels$1$2 extends Lambda implements C19857l<C8845b, C19394m> {
    public final /* synthetic */ C8072t<Boolean> $it;
    public final /* synthetic */ NotificationSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationSettings$createNotificationChannels$1$2(NotificationSettings notificationSettings, C8072t<Boolean> tVar) {
        super(1);
        this.this$0 = notificationSettings;
        this.$it = tVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8845b) obj);
        return C19394m.f43287a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.containsAll(r1) == true) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(com.etsy.android.lib.push.settings.C8845b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.etsy.android.lib.push.settings.C8845b.C8847b
            if (r0 == 0) goto L_0x0101
            com.etsy.android.lib.push.settings.NotificationSettings r0 = r7.this$0
            com.etsy.android.lib.push.settings.b$b r8 = (com.etsy.android.lib.push.settings.C8845b.C8847b) r8
            java.util.List<com.etsy.android.lib.models.apiv3.PushNotificationSetting> r8 = r8.f19465a
            java.util.HashMap<java.lang.String, java.lang.String> r1 = com.etsy.android.lib.push.settings.NotificationSettings.f19453l
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r8)
            r1.<init>(r2)
            java.util.Iterator r2 = r8.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r2.next()
            com.etsy.android.lib.models.apiv3.PushNotificationSetting r3 = (com.etsy.android.lib.models.apiv3.PushNotificationSetting) r3
            java.lang.String r3 = r3.getKey()
            r1.add(r3)
            goto L_0x001c
        L_0x0030:
            java.util.ArrayList r2 = r0.mo30230b()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0060
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.C19322o.m32624F0(r2)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r2.next()
            android.app.NotificationChannel r6 = (android.app.NotificationChannel) r6
            java.lang.String r6 = r6.getId()
            r5.add(r6)
            goto L_0x0045
        L_0x0059:
            boolean r1 = r5.containsAll(r1)
            if (r1 != r3) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r3 = r4
        L_0x0061:
            if (r3 == 0) goto L_0x009e
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r8)
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L_0x0070:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00f9
            java.lang.Object r2 = r8.next()
            com.etsy.android.lib.models.apiv3.PushNotificationSetting r2 = (com.etsy.android.lib.models.apiv3.PushNotificationSetting) r2
            android.app.NotificationManager r3 = r0.f19456c
            java.lang.String r2 = r2.getKey()
            android.app.NotificationChannel r2 = r3.getNotificationChannel(r2)
            if (r2 == 0) goto L_0x0099
            java.util.LinkedHashMap<java.lang.String, android.app.NotificationChannel> r3 = r0.f19464k
            java.lang.String r4 = r2.getId()
            java.lang.String r5 = "it.id"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r3.put(r4, r2)
            kotlin.m r2 = kotlin.C19394m.f43287a
            goto L_0x009a
        L_0x0099:
            r2 = 0
        L_0x009a:
            r1.add(r2)
            goto L_0x0070
        L_0x009e:
            android.app.NotificationChannel r1 = new android.app.NotificationChannel
            r2 = 3
            java.lang.String r3 = "DEFAULT_ETSY_CHANNEL_ID"
            java.lang.String r4 = "Etsy"
            r1.<init>(r3, r4, r2)
            android.app.NotificationManager r2 = r0.f19456c
            r2.createNotificationChannel(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.C19322o.m32624F0(r8)
            r1.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L_0x00ba:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00f4
            java.lang.Object r2 = r8.next()
            com.etsy.android.lib.models.apiv3.PushNotificationSetting r2 = (com.etsy.android.lib.models.apiv3.PushNotificationSetting) r2
            android.app.NotificationChannel r3 = new android.app.NotificationChannel
            java.lang.String r4 = r2.getKey()
            java.lang.String r5 = r2.getTitle()
            com.etsy.android.lib.models.apiv3.NotificationImportance r6 = r2.getImportance()
            int r6 = r6.getValue()
            r3.<init>(r4, r5, r6)
            java.lang.String r2 = r2.getDescription()
            r3.setDescription(r2)
            java.util.LinkedHashMap<java.lang.String, android.app.NotificationChannel> r2 = r0.f19464k
            java.lang.String r4 = r3.getId()
            java.lang.String r5 = "notificationChannel.id"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r2.put(r4, r3)
            r1.add(r3)
            goto L_0x00ba
        L_0x00f4:
            android.app.NotificationManager r8 = r0.f19456c
            r8.createNotificationChannels(r1)
        L_0x00f9:
            tp.t<java.lang.Boolean> r8 = r7.$it
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.onSuccess(r0)
            goto L_0x010c
        L_0x0101:
            boolean r8 = r8 instanceof com.etsy.android.lib.push.settings.C8845b.C8846a
            if (r8 == 0) goto L_0x010c
            tp.t<java.lang.Boolean> r8 = r7.$it
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.onSuccess(r0)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.push.settings.NotificationSettings$createNotificationChannels$1$2.invoke(com.etsy.android.lib.push.settings.b):void");
    }
}
