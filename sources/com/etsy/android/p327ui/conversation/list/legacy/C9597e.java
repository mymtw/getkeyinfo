package com.etsy.android.p327ui.conversation.list.legacy;

import p287xp.C8339g;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.e */
public final /* synthetic */ class C9597e implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ C9599g f21283b;

    /* renamed from: c */
    public final /* synthetic */ C9593a f21284c;

    public /* synthetic */ C9597e(C9599g gVar, C9593a aVar) {
        this.f21283b = gVar;
        this.f21284c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r4 = p001a0.C0005b.m46k0(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r29) {
        /*
            r28 = this;
            r0 = r28
            com.etsy.android.ui.conversation.list.legacy.g r1 = r0.f21283b
            com.etsy.android.ui.conversation.list.legacy.a r2 = r0.f21284c
            r3 = r29
            pr.d r3 = (p765pr.C20064d) r3
            java.lang.String r4 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r4 = "$spec"
            kotlin.jvm.internal.C19383o.m32797g(r2, r4)
            java.lang.String r4 = "result"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            retrofit2.v<T> r4 = r3.f44433a
            r5 = 0
            if (r4 == 0) goto L_0x0029
            java.lang.Integer r4 = p001a0.C0005b.m46k0(r4)
            if (r4 == 0) goto L_0x0029
            int r4 = r4.intValue()
            goto L_0x002a
        L_0x0029:
            r4 = r5
        L_0x002a:
            retrofit2.v<T> r6 = r3.f44433a
            if (r6 == 0) goto L_0x0033
            T r6 = r6.f44615b
            java.util.List r6 = (java.util.List) r6
            goto L_0x0034
        L_0x0033:
            r6 = 0
        L_0x0034:
            if (r6 != 0) goto L_0x0038
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.INSTANCE
        L_0x0038:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.collections.C19322o.m32624F0(r6)
            r7.<init>(r8)
            java.util.Iterator r8 = r6.iterator()
        L_0x0045:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00df
            java.lang.Object r9 = r8.next()
            com.etsy.android.lib.models.Conversation3 r9 = (com.etsy.android.lib.models.Conversation3) r9
            r27 = 0
            java.lang.String r10 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r9, r10)
            long r11 = r9.getConversationId()
            int r13 = r9.getMessageCount()
            boolean r14 = r9.getRead()
            boolean r15 = r9.getHasAttachments()
            boolean r26 = r9.isCustomShop()
            java.lang.String r17 = r9.getLastMessage()
            com.etsy.android.lib.models.ConversationUser r10 = r9.getOtherUser()
            java.lang.String r16 = ""
            if (r10 == 0) goto L_0x0082
            java.lang.String r10 = r10.getAvatarUrl()
            if (r10 != 0) goto L_0x007f
            goto L_0x0082
        L_0x007f:
            r24 = r10
            goto L_0x0084
        L_0x0082:
            r24 = r16
        L_0x0084:
            com.etsy.android.lib.models.ConversationUser r10 = r9.getOtherUser()
            if (r10 == 0) goto L_0x0095
            com.etsy.android.lib.models.datatypes.EtsyId r10 = r10.getUserId()
            if (r10 == 0) goto L_0x0095
            long r18 = r10.getIdAsLongDeprecated()
            goto L_0x0097
        L_0x0095:
            r18 = 0
        L_0x0097:
            r20 = r18
            com.etsy.android.lib.models.ConversationUser r10 = r9.getOtherUser()
            if (r10 == 0) goto L_0x00a6
            boolean r10 = r10.isGuest()
            r25 = r10
            goto L_0x00a8
        L_0x00a6:
            r25 = r5
        L_0x00a8:
            com.etsy.android.lib.models.ConversationUser r10 = r9.getOtherUser()
            if (r10 == 0) goto L_0x00b8
            java.lang.String r10 = r10.getDisplayName()
            if (r10 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            r23 = r10
            goto L_0x00ba
        L_0x00b8:
            r23 = r16
        L_0x00ba:
            com.etsy.android.lib.models.ConversationUser r10 = r9.getOtherUser()
            if (r10 == 0) goto L_0x00ca
            java.lang.String r10 = r10.getUsername()
            if (r10 != 0) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            r22 = r10
            goto L_0x00cc
        L_0x00ca:
            r22 = r16
        L_0x00cc:
            java.lang.String r16 = r9.getTitle()
            long r18 = r9.getLastUpdateDateInMillis()
            fc.a r9 = new fc.a
            r10 = r9
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r20, r22, r23, r24, r25, r26, r27)
            r7.add(r9)
            goto L_0x0045
        L_0x00df:
            com.etsy.android.ui.conversation.details.c r8 = r1.f21285a
            r8.mo31979k(r7)
            com.etsy.android.ui.user.UserBadgeCountManager r7 = r1.f21287c
            io.reactivex.subjects.PublishSubject<kotlin.m> r7 = r7.f25045i
            kotlin.m r8 = kotlin.C19394m.f43287a
            r7.onNext(r8)
            java.lang.Throwable r3 = r3.f44434b
            if (r3 == 0) goto L_0x00f3
            r3 = 1
            goto L_0x00f4
        L_0x00f3:
            r3 = r5
        L_0x00f4:
            if (r3 == 0) goto L_0x0130
            com.etsy.android.ui.conversation.details.c r1 = r1.f21285a
            java.util.ArrayList r1 = r1.mo31976h(r5)
            com.etsy.android.ui.conversation.list.legacy.f r3 = new com.etsy.android.ui.conversation.list.legacy.f
            r3.<init>()
            java.util.List r1 = kotlin.collections.C19327t.m32656l1(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.collections.C19322o.m32624F0(r1)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0112:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0126
            java.lang.Object r4 = r1.next()
            fc.a r4 = (p348fc.C12715a) r4
            gc.b r4 = r4.mo45484a()
            r3.add(r4)
            goto L_0x0112
        L_0x0126:
            com.etsy.android.ui.conversation.list.legacy.h$a r1 = new com.etsy.android.ui.conversation.list.legacy.h$a
            int r4 = r3.size()
            r1.<init>(r3, r4, r2)
            goto L_0x0157
        L_0x0130:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.C19322o.m32624F0(r6)
            r1.<init>(r3)
            java.util.Iterator r3 = r6.iterator()
        L_0x013d:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0151
            java.lang.Object r5 = r3.next()
            com.etsy.android.lib.models.Conversation3 r5 = (com.etsy.android.lib.models.Conversation3) r5
            gc.b r5 = p354gc.C12764c.m20413d(r5)
            r1.add(r5)
            goto L_0x013d
        L_0x0151:
            com.etsy.android.ui.conversation.list.legacy.h$b r3 = new com.etsy.android.ui.conversation.list.legacy.h$b
            r3.<init>(r1, r4, r2)
            r1 = r3
        L_0x0157:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.list.legacy.C9597e.apply(java.lang.Object):java.lang.Object");
    }
}
