package com.etsy.android.lib.push.settings;

import p287xp.C8339g;

/* renamed from: com.etsy.android.lib.push.settings.c */
public final /* synthetic */ class C8848c implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19466b;

    /* renamed from: c */
    public final /* synthetic */ Object f19467c;

    public /* synthetic */ C8848c(Object obj, int i) {
        this.f19466b = i;
        this.f19467c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f19466b
            r1 = 1
            r2 = 0
            java.lang.String r3 = "it"
            java.lang.String r4 = "response"
            r5 = 0
            java.lang.String r6 = "this$0"
            switch(r0) {
                case 0: goto L_0x019f;
                case 1: goto L_0x0179;
                case 2: goto L_0x011c;
                case 3: goto L_0x00f4;
                case 4: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x02d2
        L_0x0010:
            java.lang.Object r0 = r13.f19467c
            com.etsy.android.ui.user.UserBadgeCountManager r0 = (com.etsy.android.p327ui.user.UserBadgeCountManager) r0
            retrofit2.v r14 = (retrofit2.C20145v) r14
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)
            kotlin.jvm.internal.C19383o.m32797g(r14, r4)
            boolean r1 = r14.mo74384a()
            if (r1 == 0) goto L_0x00cc
            T r1 = r14.f44615b
            if (r1 == 0) goto L_0x00cc
            com.etsy.android.lib.models.apiv3.MenuCount r1 = (com.etsy.android.lib.models.apiv3.MenuCount) r1
            java.lang.Integer r1 = r1.getNotificationCount()
            if (r1 == 0) goto L_0x0033
            int r1 = r1.intValue()
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            T r3 = r14.f44615b
            com.etsy.android.lib.models.apiv3.MenuCount r3 = (com.etsy.android.lib.models.apiv3.MenuCount) r3
            if (r3 == 0) goto L_0x0045
            java.lang.Integer r3 = r3.getOpenReviewCount()
            if (r3 == 0) goto L_0x0045
            int r3 = r3.intValue()
            goto L_0x0046
        L_0x0045:
            r3 = r2
        L_0x0046:
            T r4 = r14.f44615b
            com.etsy.android.lib.models.apiv3.MenuCount r4 = (com.etsy.android.lib.models.apiv3.MenuCount) r4
            if (r4 == 0) goto L_0x0057
            java.lang.Integer r4 = r4.getUnreadConversationCount()
            if (r4 == 0) goto L_0x0057
            int r4 = r4.intValue()
            goto L_0x0058
        L_0x0057:
            r4 = r2
        L_0x0058:
            ye.e r6 = r0.f25039c
            T r7 = r14.f44615b
            com.etsy.android.lib.models.apiv3.MenuCount r7 = (com.etsy.android.lib.models.apiv3.MenuCount) r7
            if (r7 == 0) goto L_0x006b
            com.etsy.android.lib.models.apiv3.NotificationTooltip r7 = r7.getNotificationsTooltip()
            if (r7 == 0) goto L_0x006b
            int r7 = r7.getDisplayIntervalDays()
            goto L_0x006c
        L_0x006b:
            r7 = r2
        L_0x006c:
            if (r7 <= 0) goto L_0x0082
            za.a r6 = r6.f30588a
            android.content.SharedPreferences r6 = r6.mo46761a()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r8 = "tooltip_min_interval_days"
            android.content.SharedPreferences$Editor r6 = r6.putInt(r8, r7)
            r6.apply()
            goto L_0x0085
        L_0x0082:
            r6.getClass()
        L_0x0085:
            io.reactivex.subjects.a<java.lang.Integer> r6 = r0.f25040d
            T r7 = r14.f44615b
            com.etsy.android.lib.models.apiv3.MenuCount r7 = (com.etsy.android.lib.models.apiv3.MenuCount) r7
            if (r7 == 0) goto L_0x0097
            com.etsy.android.lib.models.apiv3.NotificationTooltip r7 = r7.getNotificationsTooltip()
            if (r7 == 0) goto L_0x0097
            int r2 = r7.getRequestInMillis()
        L_0x0097:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.onNext(r2)
            io.reactivex.subjects.a<java.lang.Integer> r2 = r0.f25042f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r2.onNext(r6)
            io.reactivex.subjects.a<java.lang.Integer> r2 = r0.f25041e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r2.onNext(r6)
            io.reactivex.subjects.a<java.lang.Integer> r2 = r0.f25043g
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r2.onNext(r6)
            T r14 = r14.f44615b
            com.etsy.android.lib.models.apiv3.MenuCount r14 = (com.etsy.android.lib.models.apiv3.MenuCount) r14
            if (r14 == 0) goto L_0x00c3
            java.util.Map r5 = r14.getGiftCardBalances()
        L_0x00c3:
            r0.mo37123a(r5)
            com.etsy.android.ui.navigation.bottom.c r14 = new com.etsy.android.ui.navigation.bottom.c
            r14.<init>(r1, r3, r4)
            goto L_0x00f3
        L_0x00cc:
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            java.lang.String r1 = "error fetching menu counts from api code: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            okhttp3.z r3 = r14.f44614a
            int r3 = r3.f44365f
            r1.append(r3)
            java.lang.String r3 = " body: "
            r1.append(r3)
            T r14 = r14.f44615b
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.mo21306a(r14)
            com.etsy.android.ui.navigation.bottom.c r14 = new com.etsy.android.ui.navigation.bottom.c
            r14.<init>(r2, r2, r2)
        L_0x00f3:
            return r14
        L_0x00f4:
            java.lang.Object r0 = r13.f19467c
            com.etsy.android.ui.search.v2.i r0 = (com.etsy.android.p327ui.search.p330v2.C11028i) r0
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)
            kotlin.jvm.internal.C19383o.m32797g(r14, r3)
            boolean r1 = r14 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x0107
            retrofit2.HttpException r14 = (retrofit2.HttpException) r14
            goto L_0x0108
        L_0x0107:
            r14 = r5
        L_0x0108:
            com.etsy.android.ui.search.v2.f$a r1 = new com.etsy.android.ui.search.v2.f$a
            if (r14 == 0) goto L_0x0112
            com.squareup.moshi.y r0 = r0.f24448b
            java.lang.String r5 = androidx.compose.foundation.layout.C0761x.m1690R0(r14, r0)
        L_0x0112:
            if (r14 == 0) goto L_0x0118
            int r2 = r14.code()
        L_0x0118:
            r1.<init>((java.lang.String) r5, (int) r2, (java.lang.Throwable) r14)
            return r1
        L_0x011c:
            java.lang.Object r0 = r13.f19467c
            com.etsy.android.ui.favorites.add.y r0 = (com.etsy.android.p327ui.favorites.add.C9790y) r0
            retrofit2.v r14 = (retrofit2.C20145v) r14
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)
            kotlin.jvm.internal.C19383o.m32797g(r14, r4)
            boolean r3 = r14.mo74384a()
            if (r3 == 0) goto L_0x013a
            T r3 = r14.f44615b
            if (r3 == 0) goto L_0x013a
            com.etsy.android.ui.favorites.add.a0$b r14 = new com.etsy.android.ui.favorites.add.a0$b
            com.etsy.android.lib.models.apiv3.CollectionV3 r3 = (com.etsy.android.lib.models.apiv3.CollectionV3) r3
            r14.<init>(r3)
            goto L_0x0178
        L_0x013a:
            com.etsy.android.ui.favorites.add.a0$a r3 = new com.etsy.android.ui.favorites.add.a0$a
            okhttp3.a0 r14 = r14.f44616c
            com.squareup.moshi.y r0 = r0.f21645a     // Catch:{ Exception -> 0x015d }
            java.lang.Class<com.etsy.android.ui.favorites.add.NameAListError> r4 = com.etsy.android.p327ui.favorites.add.NameAListError.class
            com.squareup.moshi.JsonAdapter r0 = r0.mo68556a(r4)     // Catch:{ Exception -> 0x015d }
            if (r14 == 0) goto L_0x014d
            java.lang.String r14 = r14.mo72844g()     // Catch:{ Exception -> 0x015d }
            goto L_0x014e
        L_0x014d:
            r14 = r5
        L_0x014e:
            if (r14 != 0) goto L_0x0152
            java.lang.String r14 = ""
        L_0x0152:
            java.lang.Object r14 = r0.fromJson((java.lang.String) r14)     // Catch:{ Exception -> 0x015d }
            com.etsy.android.ui.favorites.add.NameAListError r14 = (com.etsy.android.p327ui.favorites.add.NameAListError) r14     // Catch:{ Exception -> 0x015d }
            if (r14 == 0) goto L_0x0165
            java.lang.String r14 = r14.f21567a     // Catch:{ Exception -> 0x015d }
            goto L_0x0166
        L_0x015d:
            r14 = move-exception
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            r0.mo21314h(r14)
        L_0x0165:
            r14 = r5
        L_0x0166:
            if (r14 == 0) goto L_0x0170
            boolean r0 = kotlin.text.C19457k.m33020X0(r14)
            if (r0 == 0) goto L_0x016f
            goto L_0x0170
        L_0x016f:
            r1 = r2
        L_0x0170:
            if (r1 == 0) goto L_0x0173
            goto L_0x0174
        L_0x0173:
            r5 = r14
        L_0x0174:
            r3.<init>(r5)
            r14 = r3
        L_0x0178:
            return r14
        L_0x0179:
            java.lang.Object r0 = r13.f19467c
            com.etsy.android.ui.conversation.compose.a r0 = (com.etsy.android.p327ui.conversation.compose.C9452a) r0
            retrofit2.v r14 = (retrofit2.C20145v) r14
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)
            kotlin.jvm.internal.C19383o.m32797g(r14, r4)
            boolean r1 = r14.mo74384a()
            if (r1 == 0) goto L_0x018e
            com.etsy.android.ui.conversation.compose.b$b r14 = com.etsy.android.p327ui.conversation.compose.C9456b.C9458b.f20962a
            goto L_0x019e
        L_0x018e:
            com.etsy.android.ui.conversation.compose.b$a r1 = new com.etsy.android.ui.conversation.compose.b$a
            com.squareup.moshi.y r0 = r0.f20956c
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1692S0(r14, r0)
            okhttp3.z r14 = r14.f44614a
            int r14 = r14.f44365f
            r1.<init>(r0, r14, r5)
            r14 = r1
        L_0x019e:
            return r14
        L_0x019f:
            java.lang.Object r0 = r13.f19467c
            com.etsy.android.lib.push.settings.NotificationSettings r0 = (com.etsy.android.lib.push.settings.NotificationSettings) r0
            pr.d r14 = (p765pr.C20064d) r14
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)
            kotlin.jvm.internal.C19383o.m32797g(r14, r3)
            retrofit2.v<T> r3 = r14.f44433a
            if (r3 == 0) goto L_0x01b4
            T r3 = r3.f44615b
            java.util.List r3 = (java.util.List) r3
            goto L_0x01b5
        L_0x01b4:
            r3 = r5
        L_0x01b5:
            if (r3 != 0) goto L_0x01b9
            kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
        L_0x01b9:
            if (r3 != 0) goto L_0x01bd
            goto L_0x0287
        L_0x01bd:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = com.etsy.android.lib.push.settings.NotificationSettings.f19453l
            r4.clear()
            java.util.Iterator r4 = r3.iterator()
        L_0x01c6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0285
            java.lang.Object r6 = r4.next()
            com.etsy.android.lib.models.apiv3.PushNotificationSetting r6 = (com.etsy.android.lib.models.apiv3.PushNotificationSetting) r6
            java.lang.String r7 = r6.getKey()
            java.util.ArrayList r8 = r0.mo30230b()
            if (r8 == 0) goto L_0x0207
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = kotlin.collections.C19322o.m32624F0(r8)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x01e9:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0202
            java.lang.Object r10 = r8.next()
            android.app.NotificationChannel r10 = (android.app.NotificationChannel) r10
            java.lang.String r11 = r10.getId()
            kotlin.Pair r12 = new kotlin.Pair
            r12.<init>(r11, r10)
            r9.add(r12)
            goto L_0x01e9
        L_0x0202:
            java.util.Map r8 = kotlin.collections.C19294b0.m32567x0(r9)
            goto L_0x0208
        L_0x0207:
            r8 = r5
        L_0x0208:
            if (r8 == 0) goto L_0x0212
            boolean r9 = r8.containsKey(r7)
            if (r9 != r1) goto L_0x0212
            r9 = r1
            goto L_0x0213
        L_0x0212:
            r9 = r2
        L_0x0213:
            if (r9 == 0) goto L_0x026b
            java.util.LinkedHashMap<java.lang.String, android.app.NotificationChannel> r9 = r0.f19464k
            java.lang.Object r10 = kotlin.collections.C19294b0.m32560q0(r7, r8)
            r9.put(r7, r10)
            java.lang.Object r9 = r8.get(r7)
            android.app.NotificationChannel r9 = (android.app.NotificationChannel) r9
            if (r9 == 0) goto L_0x022b
            java.lang.CharSequence r9 = r9.getName()
            goto L_0x022c
        L_0x022b:
            r9 = r5
        L_0x022c:
            java.lang.String r10 = r6.getTitle()
            boolean r9 = kotlin.jvm.internal.C19383o.m32792b(r9, r10)
            r9 = r9 ^ r1
            java.lang.Object r8 = r8.get(r7)
            android.app.NotificationChannel r8 = (android.app.NotificationChannel) r8
            if (r8 == 0) goto L_0x0242
            java.lang.String r8 = r8.getDescription()
            goto L_0x0243
        L_0x0242:
            r8 = r5
        L_0x0243:
            java.lang.String r10 = r6.getDescription()
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r10)
            r8 = r8 ^ r1
            if (r9 != 0) goto L_0x0250
            if (r8 == 0) goto L_0x026b
        L_0x0250:
            android.app.NotificationChannel r8 = new android.app.NotificationChannel
            java.lang.String r9 = r6.getTitle()
            r10 = 3
            r8.<init>(r7, r9, r10)
            java.lang.String r9 = r6.getDescription()
            r8.setDescription(r9)
            java.util.LinkedHashMap<java.lang.String, android.app.NotificationChannel> r9 = r0.f19464k
            r9.put(r7, r8)
            android.app.NotificationManager r9 = r0.f19456c
            r9.createNotificationChannel(r8)
        L_0x026b:
            java.util.List r6 = r6.getNotificationTypes()
            java.util.Iterator r6 = r6.iterator()
        L_0x0273:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01c6
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.HashMap<java.lang.String, java.lang.String> r9 = com.etsy.android.lib.push.settings.NotificationSettings.f19453l
            r9.put(r8, r7)
            goto L_0x0273
        L_0x0285:
            r0.f19463j = r3
        L_0x0287:
            java.lang.Throwable r4 = r14.f44434b
            if (r4 == 0) goto L_0x028d
            r4 = r1
            goto L_0x028e
        L_0x028d:
            r4 = r2
        L_0x028e:
            if (r4 != 0) goto L_0x02a5
            retrofit2.v<T> r4 = r14.f44433a
            if (r4 == 0) goto L_0x029b
            boolean r4 = r4.mo74384a()
            if (r4 != 0) goto L_0x029b
            goto L_0x029c
        L_0x029b:
            r1 = r2
        L_0x029c:
            if (r1 == 0) goto L_0x029f
            goto L_0x02a5
        L_0x029f:
            com.etsy.android.lib.push.settings.b$b r14 = new com.etsy.android.lib.push.settings.b$b
            r14.<init>(r3)
            goto L_0x02d1
        L_0x02a5:
            com.etsy.android.lib.logger.h r0 = r0.f19454a
            java.lang.String r1 = "Error requesting notification settings :(, error code: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            retrofit2.v<T> r2 = r14.f44433a
            if (r2 == 0) goto L_0x02b9
            okhttp3.z r2 = r2.f44614a
            int r2 = r2.f44365f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
        L_0x02b9:
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.mo21306a(r1)
            com.etsy.android.lib.push.settings.b$a r0 = new com.etsy.android.lib.push.settings.b$a
            retrofit2.v<T> r14 = r14.f44433a
            if (r14 == 0) goto L_0x02cd
            okhttp3.z r14 = r14.f44614a
            int r14 = r14.f44365f
        L_0x02cd:
            r0.<init>()
            r14 = r0
        L_0x02d1:
            return r14
        L_0x02d2:
            java.lang.Object r0 = r13.f19467c
            com.etsy.android.util.f r0 = (com.etsy.android.util.C12043f) r0
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            kotlin.jvm.internal.C19383o.m32797g(r0, r6)
            java.lang.String r1 = "enabled"
            kotlin.jvm.internal.C19383o.m32797g(r14, r1)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f26853k
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x0310
            boolean r1 = r14.booleanValue()
            if (r1 == 0) goto L_0x0310
            be.a r1 = new be.a
            r1.<init>(r0)
            io.reactivex.internal.operators.completable.CompletableCreate r2 = new io.reactivex.internal.operators.completable.CompletableCreate
            r2.<init>(r1)
            ua.f r0 = r0.f26849g
            r0.getClass()
            tp.r r0 = p456ua.C13461f.m21234a()
            io.reactivex.internal.operators.completable.CompletableSubscribeOn r1 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn
            r1.<init>(r2, r0)
            io.reactivex.internal.operators.single.i r14 = p248tp.C8071s.m16251e(r14)
            io.reactivex.internal.operators.single.SingleDelayWithCompletable r0 = new io.reactivex.internal.operators.single.SingleDelayWithCompletable
            r0.<init>(r14, r1)
            goto L_0x0314
        L_0x0310:
            io.reactivex.internal.operators.single.i r0 = p248tp.C8071s.m16251e(r14)
        L_0x0314:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.push.settings.C8848c.apply(java.lang.Object):java.lang.Object");
    }
}
