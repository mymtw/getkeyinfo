package com.etsy.android.shophome;

import p287xp.C8339g;

/* renamed from: com.etsy.android.shophome.i */
public final /* synthetic */ class C8998i implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19854b;

    /* renamed from: c */
    public final /* synthetic */ Object f19855c;

    public /* synthetic */ C8998i(Object obj, int i) {
        this.f19854b = i;
        this.f19855c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.etsy.android.lib.models.conversation.ccm.ConversationMetadataListResult} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12 */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            int r0 = r1.f19854b
            r2 = 0
            java.lang.String r3 = "<this>"
            java.lang.String r4 = "it"
            java.lang.String r5 = "result"
            r6 = 0
            java.lang.String r7 = "this$0"
            switch(r0) {
                case 0: goto L_0x01ce;
                case 1: goto L_0x01a4;
                case 2: goto L_0x00b7;
                case 3: goto L_0x0055;
                case 4: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x023e
        L_0x0013:
            java.lang.Object r0 = r1.f19855c
            ze.b r0 = (p500ze.C13961b) r0
            r2 = r24
            retrofit2.v r2 = (retrofit2.C20145v) r2
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            java.lang.String r3 = "response"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            boolean r3 = r2.mo74384a()
            if (r3 == 0) goto L_0x0044
            com.etsy.android.ui.user.profile.a$b r0 = new com.etsy.android.ui.user.profile.a$b
            T r2 = r2.f44615b
            okhttp3.a0 r2 = (okhttp3.C19928a0) r2
            if (r2 == 0) goto L_0x003b
            byte[] r2 = r2.mo72841a()
            java.lang.Class<com.etsy.android.lib.models.apiv3.UserProfilePage> r3 = com.etsy.android.lib.models.apiv3.UserProfilePage.class
            java.lang.Object r6 = com.etsy.android.lib.models.MoshiModelFactory.createFromByteArray(r2, r3)
        L_0x003b:
            kotlin.jvm.internal.C19383o.m32794d(r6)
            com.etsy.android.lib.models.apiv3.UserProfilePage r6 = (com.etsy.android.lib.models.apiv3.UserProfilePage) r6
            r0.<init>(r6)
            goto L_0x0054
        L_0x0044:
            com.etsy.android.ui.user.profile.a$a r3 = new com.etsy.android.ui.user.profile.a$a
            com.squareup.moshi.y r0 = r0.f30704b
            java.lang.String r0 = androidx.compose.foundation.layout.C0761x.m1692S0(r2, r0)
            okhttp3.z r2 = r2.f44614a
            int r2 = r2.f44365f
            r3.<init>(r0, r2, r6)
            r0 = r3
        L_0x0054:
            return r0
        L_0x0055:
            java.lang.Object r0 = r1.f19855c
            r5 = r0
            com.etsy.android.ui.navigation.bottom.BottomNavStateRepo r5 = (com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo) r5
            r6 = r24
            com.etsy.android.ui.navigation.bottom.d r6 = (com.etsy.android.p327ui.navigation.bottom.C10682d) r6
            kotlin.jvm.internal.C19383o.m32797g(r5, r7)
            kotlin.jvm.internal.C19383o.m32797g(r6, r4)
            io.reactivex.subjects.a<com.etsy.android.ui.navigation.bottom.d> r0 = r5.f23545l
            r0.onNext(r6)
            com.etsy.android.ui.navigation.bottom.b r0 = r6.f23556c
            com.etsy.android.ui.you.a r0 = r0.f23549b
            com.etsy.android.ui.navigation.bottom.b r4 = r6.f23554a
            com.etsy.android.ui.you.a r4 = r4.f23549b
            kotlin.jvm.internal.C19383o.m32797g(r0, r3)
            boolean r3 = r0 instanceof com.etsy.android.p327ui.you.C11800a.C11801a
            if (r3 == 0) goto L_0x007d
            com.etsy.android.ui.you.a$a r0 = (com.etsy.android.p327ui.you.C11800a.C11801a) r0
            int r0 = r0.f26278a
            goto L_0x007e
        L_0x007d:
            r0 = r2
        L_0x007e:
            boolean r3 = r4 instanceof com.etsy.android.p327ui.you.C11800a.C11801a
            if (r3 == 0) goto L_0x0087
            r2 = r4
            com.etsy.android.ui.you.a$a r2 = (com.etsy.android.p327ui.you.C11800a.C11801a) r2
            int r2 = r2.f26278a
        L_0x0087:
            int r2 = r2 + r0
            android.content.Context r0 = r5.f23538e     // Catch:{ Exception -> 0x009f }
            p776xq.C20220b.m34591a(r0, r2)     // Catch:{ ShortcutBadgeException -> 0x008e }
            goto L_0x00a7
        L_0x008e:
            r0 = move-exception
            r2 = r0
            r0 = 3
            java.lang.String r3 = "ShortcutBadger"
            boolean r0 = android.util.Log.isLoggable(r3, r0)     // Catch:{ Exception -> 0x009f }
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = "Unable to execute badge"
            android.util.Log.d(r3, r0, r2)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a7
        L_0x009f:
            r0 = move-exception
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.LogCatKt.m17045a()
            r2.error(r0)
        L_0x00a7:
            boolean r0 = r4 instanceof com.etsy.android.p327ui.you.C11800a.C11804d
            if (r0 == 0) goto L_0x00b6
            com.etsy.android.lib.util.NotificationType r0 = com.etsy.android.lib.util.NotificationType.UNSEEN_UPDATES
            ra.h r2 = r5.f23540g
            int r0 = r0.getId()
            r2.mo46038c(r0)
        L_0x00b6:
            return r6
        L_0x00b7:
            java.lang.Object r0 = r1.f19855c
            com.etsy.android.ui.conversation.list.ccm.f r0 = (com.etsy.android.p327ui.conversation.list.ccm.C9582f) r0
            r4 = r24
            pr.d r4 = (p765pr.C20064d) r4
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            retrofit2.v<T> r5 = r4.f44433a
            if (r5 == 0) goto L_0x00ce
            T r5 = r5.f44615b
            r6 = r5
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadataListResult r6 = (com.etsy.android.lib.models.conversation.ccm.ConversationMetadataListResult) r6
        L_0x00ce:
            if (r6 == 0) goto L_0x00d6
            java.util.List r5 = r6.getConversationMetaData()
            if (r5 != 0) goto L_0x00d8
        L_0x00d6:
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
        L_0x00d8:
            com.etsy.android.ui.conversation.details.c r7 = r0.f21249a
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.C19322o.m32624F0(r5)
            r8.<init>(r9)
            java.util.Iterator r9 = r5.iterator()
        L_0x00e7:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00fb
            java.lang.Object r10 = r9.next()
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r10 = (com.etsy.android.lib.models.conversation.ccm.ConversationMetadata) r10
            fc.a r10 = p354gc.C12764c.m20410a(r10)
            r8.add(r10)
            goto L_0x00e7
        L_0x00fb:
            r7.mo31979k(r8)
            com.etsy.android.ui.user.UserBadgeCountManager r0 = r0.f21251c
            io.reactivex.subjects.PublishSubject<kotlin.m> r0 = r0.f25045i
            kotlin.m r7 = kotlin.C19394m.f43287a
            r0.onNext(r7)
            java.lang.Throwable r0 = r4.f44434b
            if (r0 == 0) goto L_0x010d
            r0 = 1
            goto L_0x010e
        L_0x010d:
            r0 = r2
        L_0x010e:
            if (r0 == 0) goto L_0x0114
            com.etsy.android.ui.conversation.list.ccm.g$b r0 = com.etsy.android.p327ui.conversation.list.ccm.C9583g.C9585b.f21253a
            goto L_0x01a3
        L_0x0114:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = kotlin.collections.C19322o.m32624F0(r5)
            r0.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L_0x0121:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0183
            java.lang.Object r5 = r4.next()
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r5 = (com.etsy.android.lib.models.conversation.ccm.ConversationMetadata) r5
            kotlin.jvm.internal.C19383o.m32797g(r5, r3)
            gc.b r15 = new gc.b
            long r8 = r5.getConversationId()
            com.etsy.android.lib.models.ConversationUser r7 = r5.getOtherUser()
            if (r7 == 0) goto L_0x0141
            gc.m r7 = p354gc.C12764c.m20414e(r7)
            goto L_0x0152
        L_0x0141:
            gc.m r7 = new gc.m
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 31
            r16 = r7
            r16.<init>((java.lang.String) r17, (java.lang.String) r18, (long) r19, (boolean) r21, (int) r22)
        L_0x0152:
            r10 = r7
            long r11 = r5.getLastUpdateDateInMillis()
            long r13 = r5.getLastUpdateDateInMillis()
            java.lang.CharSequence r13 = p001a0.C0005b.m39g0(r13)
            java.lang.String r7 = r5.getLastMessage()
            java.lang.String r14 = "\n\n"
            r18 = r3
            java.lang.String r3 = "\n"
            java.lang.String r14 = kotlin.text.C19457k.m33023a1(r7, r14, r3, r2)
            boolean r3 = r5.getRead()
            com.etsy.android.lib.models.apiv3.Alert r16 = r5.getAlert()
            r17 = 128(0x80, float:1.794E-43)
            r7 = r15
            r5 = r15
            r15 = r3
            r7.<init>((long) r8, (p354gc.C12784m) r10, (long) r11, (java.lang.CharSequence) r13, (java.lang.String) r14, (boolean) r15, (com.etsy.android.lib.models.apiv3.Alert) r16, (int) r17)
            r0.add(r5)
            r3 = r18
            goto L_0x0121
        L_0x0183:
            if (r6 == 0) goto L_0x0190
            com.etsy.android.lib.models.conversation.ccm.PageState r3 = r6.getPageState()
            if (r3 == 0) goto L_0x0190
            int r3 = r3.getPageCount()
            goto L_0x0191
        L_0x0190:
            r3 = r2
        L_0x0191:
            if (r6 == 0) goto L_0x019d
            com.etsy.android.lib.models.conversation.ccm.PageState r4 = r6.getPageState()
            if (r4 == 0) goto L_0x019d
            int r2 = r4.getCurrentPage()
        L_0x019d:
            com.etsy.android.ui.conversation.list.ccm.g$c r4 = new com.etsy.android.ui.conversation.list.ccm.g$c
            r4.<init>(r0, r3, r2)
            r0 = r4
        L_0x01a3:
            return r0
        L_0x01a4:
            java.lang.Object r0 = r1.f19855c
            com.etsy.android.ui.conversation.compose.a r0 = (com.etsy.android.p327ui.conversation.compose.C9452a) r0
            r3 = r24
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            boolean r4 = r3 instanceof retrofit2.HttpException
            if (r4 == 0) goto L_0x01b9
            retrofit2.HttpException r3 = (retrofit2.HttpException) r3
            goto L_0x01ba
        L_0x01b9:
            r3 = r6
        L_0x01ba:
            com.etsy.android.ui.conversation.compose.b$a r4 = new com.etsy.android.ui.conversation.compose.b$a
            if (r3 == 0) goto L_0x01c4
            com.squareup.moshi.y r0 = r0.f20956c
            java.lang.String r6 = androidx.compose.foundation.layout.C0761x.m1690R0(r3, r0)
        L_0x01c4:
            if (r3 == 0) goto L_0x01ca
            int r2 = r3.code()
        L_0x01ca:
            r4.<init>(r6, r2, r3)
            return r4
        L_0x01ce:
            java.lang.Object r0 = r1.f19855c
            com.etsy.android.shophome.j r0 = (com.etsy.android.shophome.C8999j) r0
            r2 = r24
            com.etsy.android.shophome.h$a r2 = (com.etsy.android.shophome.C8994h.C8995a) r2
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            kotlin.jvm.internal.C19383o.m32797g(r2, r5)
            boolean r3 = r2 instanceof com.etsy.android.shophome.C8994h.C8995a.C8997b
            if (r3 == 0) goto L_0x0202
            r3 = r2
            com.etsy.android.shophome.h$a$b r3 = (com.etsy.android.shophome.C8994h.C8995a.C8997b) r3
            com.etsy.android.lib.models.apiv3.shophome.ShopListingsSearchResult r4 = r3.f19853a
            java.util.List r4 = r4.getListings()
            if (r4 == 0) goto L_0x0202
            io.reactivex.subjects.PublishSubject<com.etsy.android.shophome.j$a> r0 = r0.f19861g
            com.etsy.android.shophome.j$a$b r2 = new com.etsy.android.shophome.j$a$b
            com.etsy.android.lib.models.apiv3.shophome.ShopListingsSearchResult r4 = r3.f19853a
            java.util.List r4 = r4.getListings()
            com.etsy.android.lib.models.apiv3.shophome.ShopListingsSearchResult r3 = r3.f19853a
            java.lang.String r3 = r3.getSortOrder()
            r2.<init>(r4, r3)
            r0.onNext(r2)
            goto L_0x023b
        L_0x0202:
            boolean r3 = r2 instanceof com.etsy.android.shophome.C8994h.C8995a.C8996a
            if (r3 == 0) goto L_0x0234
            ea.n r3 = r0.f19860f
            java.lang.String r4 = "Error loading shop section listings: "
            java.lang.StringBuilder r4 = android.support.p013v4.media.C0072d.m201h(r4)
            com.etsy.android.shophome.h$a$a r2 = (com.etsy.android.shophome.C8994h.C8995a.C8996a) r2
            java.lang.Throwable r2 = r2.f19852a
            java.lang.String r2 = r2.getMessage()
            r4.append(r2)
            java.lang.String r2 = " : Shop id - "
            r4.append(r2)
            java.lang.String r2 = r0.f19856b
            r4.append(r2)
            java.lang.String r2 = ", Section id - "
            r4.append(r2)
            java.lang.String r2 = r0.f19857c
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.mo45449a(r2)
        L_0x0234:
            io.reactivex.subjects.PublishSubject<com.etsy.android.shophome.j$a> r0 = r0.f19861g
            com.etsy.android.shophome.j$a$a r2 = com.etsy.android.shophome.C8999j.C9000a.C9001a.f19864a
            r0.onNext(r2)
        L_0x023b:
            kotlin.m r0 = kotlin.C19394m.f43287a
            return r0
        L_0x023e:
            java.lang.Object r0 = r1.f19855c
            com.etsy.android.util.f r0 = (com.etsy.android.util.C12043f) r0
            r2 = r24
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            kotlin.jvm.internal.C19383o.m32797g(r0, r7)
            java.lang.String r3 = "enabled"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            boolean r3 = r0.mo38932f()
            if (r3 == 0) goto L_0x02a2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x027e
            bo.app.f7 r2 = new bo.app.f7
            r3 = 4
            r2.<init>(r0, r3)
            io.reactivex.internal.operators.completable.CompletableCreate r3 = new io.reactivex.internal.operators.completable.CompletableCreate
            r3.<init>(r2)
            ua.f r0 = r0.f26849g
            r0.getClass()
            tp.r r0 = p456ua.C13461f.m21234a()
            io.reactivex.internal.operators.completable.CompletableSubscribeOn r2 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn
            r2.<init>(r3, r0)
            com.etsy.android.util.a r0 = new com.etsy.android.util.a
            r0.<init>()
            io.reactivex.internal.operators.completable.CompletableAndThenCompletable r3 = new io.reactivex.internal.operators.completable.CompletableAndThenCompletable
            r3.<init>(r2, r0)
            goto L_0x02a4
        L_0x027e:
            androidx.fragment.app.s r2 = new androidx.fragment.app.s
            r3 = 2
            r2.<init>(r0, r3)
            io.reactivex.internal.operators.completable.CompletableCreate r3 = new io.reactivex.internal.operators.completable.CompletableCreate
            r3.<init>(r2)
            ua.f r0 = r0.f26849g
            r0.getClass()
            tp.r r0 = p456ua.C13461f.m21234a()
            io.reactivex.internal.operators.completable.CompletableSubscribeOn r2 = new io.reactivex.internal.operators.completable.CompletableSubscribeOn
            r2.<init>(r3, r0)
            com.etsy.android.util.b r0 = new com.etsy.android.util.b
            r0.<init>()
            io.reactivex.internal.operators.completable.CompletableAndThenCompletable r3 = new io.reactivex.internal.operators.completable.CompletableAndThenCompletable
            r3.<init>(r2, r0)
            goto L_0x02a4
        L_0x02a2:
            io.reactivex.internal.operators.completable.a r3 = p145io.reactivex.internal.operators.completable.C19087a.f42607b
        L_0x02a4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.shophome.C8998i.apply(java.lang.Object):java.lang.Object");
    }
}
