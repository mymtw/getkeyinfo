package com.etsy.android.p327ui.conversation.details;

import androidx.room.C3226d0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p348fc.C12715a;
import p348fc.C12716b;

/* renamed from: com.etsy.android.ui.conversation.details.d */
public final class C9513d implements Callable<Map<C12715a, List<C12716b>>> {

    /* renamed from: b */
    public final /* synthetic */ C3226d0 f21089b;

    /* renamed from: c */
    public final /* synthetic */ C9514e f21090c;

    public C9513d(C9514e eVar, C3226d0 d0Var) {
        this.f21090c = eVar;
        this.f21089b = d0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ce A[Catch:{ all -> 0x03b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02da A[Catch:{ all -> 0x03b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02dd A[Catch:{ all -> 0x03b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02e9 A[Catch:{ all -> 0x03b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ec A[Catch:{ all -> 0x03b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02f8 A[Catch:{ all -> 0x03b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02fb A[Catch:{ all -> 0x03b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0316 A[Catch:{ all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x031b A[Catch:{ all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0332 A[Catch:{ all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0335 A[Catch:{ all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0345 A[Catch:{ all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0348 A[Catch:{ all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0357 A[Catch:{ all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02cb A[Catch:{ all -> 0x03b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r75 = this;
            r1 = r75
            java.lang.String r0 = "conversationId"
            com.etsy.android.ui.conversation.details.e r2 = r1.f21090c
            androidx.room.RoomDatabase r2 = r2.f21091a
            androidx.room.d0 r3 = r1.f21089b
            android.database.Cursor r2 = r2.mo11983l(r3)
            int r3 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03a8 }
            java.lang.String r4 = "messageCount"
            int r4 = p003a2.C0016c.m97a(r2, r4)     // Catch:{ all -> 0x03a8 }
            java.lang.String r5 = "isRead"
            int r5 = p003a2.C0016c.m97a(r2, r5)     // Catch:{ all -> 0x03a8 }
            java.lang.String r6 = "hasAttachment"
            int r6 = p003a2.C0016c.m97a(r2, r6)     // Catch:{ all -> 0x03a8 }
            java.lang.String r7 = "title"
            int r7 = p003a2.C0016c.m97a(r2, r7)     // Catch:{ all -> 0x03a8 }
            java.lang.String r8 = "lastMessage"
            int r8 = p003a2.C0016c.m97a(r2, r8)     // Catch:{ all -> 0x03a8 }
            java.lang.String r9 = "lastUpdated"
            int r9 = p003a2.C0016c.m97a(r2, r9)     // Catch:{ all -> 0x03a8 }
            java.lang.String r10 = "otherUserId"
            int r10 = p003a2.C0016c.m97a(r2, r10)     // Catch:{ all -> 0x03a8 }
            java.lang.String r11 = "otherUserUsername"
            int r11 = p003a2.C0016c.m97a(r2, r11)     // Catch:{ all -> 0x03a8 }
            java.lang.String r12 = "otherUserNameFull"
            int r12 = p003a2.C0016c.m97a(r2, r12)     // Catch:{ all -> 0x03a8 }
            java.lang.String r13 = "otherUserAvatarUrl"
            int r13 = p003a2.C0016c.m97a(r2, r13)     // Catch:{ all -> 0x03a8 }
            java.lang.String r14 = "otherUserIsGuest"
            int r14 = p003a2.C0016c.m97a(r2, r14)     // Catch:{ all -> 0x03a8 }
            java.lang.String r15 = "isCustomShop"
            int r15 = p003a2.C0016c.m97a(r2, r15)     // Catch:{ all -> 0x03a8 }
            java.lang.String r1 = "isCcm"
            int r1 = p003a2.C0016c.m97a(r2, r1)     // Catch:{ all -> 0x03b2 }
            r16 = r1
            int r1 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r17 = r1
            int r1 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r18 = r1
            java.lang.String r1 = "messageId"
            int r1 = p003a2.C0016c.m97a(r2, r1)     // Catch:{ all -> 0x03b2 }
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r19 = r0
            java.lang.String r0 = "createDate"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r20 = r0
            java.lang.String r0 = "sortKey"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r21 = r0
            java.lang.String r0 = "text"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r22 = r0
            java.lang.String r0 = "translatedText"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r23 = r0
            java.lang.String r0 = "hasTranslationError"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r24 = r0
            java.lang.String r0 = "senderUserId"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r25 = r0
            java.lang.String r0 = "listings"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r26 = r0
            java.lang.String r0 = "images"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r27 = r0
            java.lang.String r0 = "language"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r28 = r0
            java.lang.String r0 = "messageType"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r29 = r0
            java.lang.String r0 = "messageSource"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r30 = r0
            java.lang.String r0 = "helpWithOrderRequestUrl"
            int r0 = p003a2.C0016c.m97a(r2, r0)     // Catch:{ all -> 0x03b2 }
            r31 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x03b2 }
            r0.<init>()     // Catch:{ all -> 0x03b2 }
        L_0x00df:
            boolean r32 = r2.moveToNext()     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x03aa
            long r34 = r2.getLong(r3)     // Catch:{ all -> 0x03b2 }
            int r36 = r2.getInt(r4)     // Catch:{ all -> 0x03b2 }
            int r32 = r2.getInt(r5)     // Catch:{ all -> 0x03b2 }
            r51 = 1
            r52 = 0
            if (r32 == 0) goto L_0x00fa
            r37 = r51
            goto L_0x00fc
        L_0x00fa:
            r37 = r52
        L_0x00fc:
            int r32 = r2.getInt(r6)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0105
            r38 = r51
            goto L_0x0107
        L_0x0105:
            r38 = r52
        L_0x0107:
            boolean r32 = r2.isNull(r7)     // Catch:{ all -> 0x03b2 }
            r53 = 0
            if (r32 == 0) goto L_0x0112
            r39 = r53
            goto L_0x0118
        L_0x0112:
            java.lang.String r32 = r2.getString(r7)     // Catch:{ all -> 0x03b2 }
            r39 = r32
        L_0x0118:
            boolean r32 = r2.isNull(r8)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0121
            r40 = r53
            goto L_0x0127
        L_0x0121:
            java.lang.String r32 = r2.getString(r8)     // Catch:{ all -> 0x03b2 }
            r40 = r32
        L_0x0127:
            long r41 = r2.getLong(r9)     // Catch:{ all -> 0x03b2 }
            long r43 = r2.getLong(r10)     // Catch:{ all -> 0x03b2 }
            boolean r32 = r2.isNull(r11)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0138
            r45 = r53
            goto L_0x013e
        L_0x0138:
            java.lang.String r32 = r2.getString(r11)     // Catch:{ all -> 0x03b2 }
            r45 = r32
        L_0x013e:
            boolean r32 = r2.isNull(r12)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0147
            r46 = r53
            goto L_0x014d
        L_0x0147:
            java.lang.String r32 = r2.getString(r12)     // Catch:{ all -> 0x03b2 }
            r46 = r32
        L_0x014d:
            boolean r32 = r2.isNull(r13)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0156
            r47 = r53
            goto L_0x015c
        L_0x0156:
            java.lang.String r32 = r2.getString(r13)     // Catch:{ all -> 0x03b2 }
            r47 = r32
        L_0x015c:
            int r32 = r2.getInt(r14)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0165
            r48 = r51
            goto L_0x0167
        L_0x0165:
            r48 = r52
        L_0x0167:
            int r32 = r2.getInt(r15)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0170
            r49 = r51
            goto L_0x0172
        L_0x0170:
            r49 = r52
        L_0x0172:
            r74 = r16
            r16 = r3
            r3 = r74
            int r32 = r2.getInt(r3)     // Catch:{ all -> 0x03b2 }
            if (r32 == 0) goto L_0x0181
            r50 = r51
            goto L_0x0183
        L_0x0181:
            r50 = r52
        L_0x0183:
            r74 = r17
            r17 = r3
            r3 = r74
            r2.getLong(r3)     // Catch:{ all -> 0x03b2 }
            r32 = r3
            fc.a r3 = new fc.a     // Catch:{ all -> 0x03b2 }
            r33 = r3
            r33.<init>(r34, r36, r37, r38, r39, r40, r41, r43, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x03b2 }
            boolean r33 = r0.containsKey(r3)     // Catch:{ all -> 0x03b2 }
            if (r33 == 0) goto L_0x01a6
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x03b2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x03b2 }
            r33 = r4
        L_0x01a3:
            r4 = r18
            goto L_0x01b2
        L_0x01a6:
            r33 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x03b2 }
            r4.<init>()     // Catch:{ all -> 0x03b2 }
            r0.put(r3, r4)     // Catch:{ all -> 0x03b2 }
            r3 = r4
            goto L_0x01a3
        L_0x01b2:
            boolean r18 = r2.isNull(r4)     // Catch:{ all -> 0x03b2 }
            if (r18 == 0) goto L_0x027e
            boolean r18 = r2.isNull(r1)     // Catch:{ all -> 0x03b2 }
            if (r18 == 0) goto L_0x027e
            r18 = r5
            r5 = r19
            boolean r19 = r2.isNull(r5)     // Catch:{ all -> 0x03b2 }
            if (r19 == 0) goto L_0x0282
            r19 = r6
            r6 = r20
            boolean r20 = r2.isNull(r6)     // Catch:{ all -> 0x03b2 }
            if (r20 == 0) goto L_0x0286
            r20 = r7
            r7 = r21
            boolean r21 = r2.isNull(r7)     // Catch:{ all -> 0x03b2 }
            if (r21 == 0) goto L_0x028a
            r21 = r8
            r8 = r22
            boolean r22 = r2.isNull(r8)     // Catch:{ all -> 0x03b2 }
            if (r22 == 0) goto L_0x028e
            r22 = r9
            r9 = r23
            boolean r23 = r2.isNull(r9)     // Catch:{ all -> 0x03b2 }
            if (r23 == 0) goto L_0x0292
            r23 = r10
            r10 = r24
            boolean r24 = r2.isNull(r10)     // Catch:{ all -> 0x03b2 }
            if (r24 == 0) goto L_0x0296
            r24 = r11
            r11 = r25
            boolean r25 = r2.isNull(r11)     // Catch:{ all -> 0x03b2 }
            if (r25 == 0) goto L_0x029a
            r25 = r12
            r12 = r26
            boolean r26 = r2.isNull(r12)     // Catch:{ all -> 0x03b2 }
            if (r26 == 0) goto L_0x029e
            r26 = r13
            r13 = r27
            boolean r27 = r2.isNull(r13)     // Catch:{ all -> 0x03b2 }
            if (r27 == 0) goto L_0x02a2
            r27 = r14
            r14 = r28
            boolean r28 = r2.isNull(r14)     // Catch:{ all -> 0x03b2 }
            if (r28 == 0) goto L_0x02a6
            r28 = r15
            r15 = r29
            boolean r29 = r2.isNull(r15)     // Catch:{ all -> 0x03b2 }
            if (r29 == 0) goto L_0x02aa
            r29 = r0
            r0 = r30
            boolean r30 = r2.isNull(r0)     // Catch:{ all -> 0x03b2 }
            if (r30 == 0) goto L_0x02ae
            r30 = r3
            r3 = r31
            boolean r31 = r2.isNull(r3)     // Catch:{ all -> 0x03b2 }
            if (r31 == 0) goto L_0x02b2
            r30 = r0
            r31 = r3
            r3 = r16
            r16 = r17
            r0 = r29
            r17 = r32
            r29 = r15
            r15 = r28
            r28 = r14
            r14 = r27
            r27 = r13
            r13 = r26
            r26 = r12
            r12 = r25
            r25 = r11
            r11 = r24
            r24 = r10
            r10 = r23
            r23 = r9
            r9 = r22
            r22 = r8
            r8 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r19
            r19 = r5
            r5 = r18
            r18 = r4
            r4 = r33
            goto L_0x00df
        L_0x027e:
            r18 = r5
            r5 = r19
        L_0x0282:
            r19 = r6
            r6 = r20
        L_0x0286:
            r20 = r7
            r7 = r21
        L_0x028a:
            r21 = r8
            r8 = r22
        L_0x028e:
            r22 = r9
            r9 = r23
        L_0x0292:
            r23 = r10
            r10 = r24
        L_0x0296:
            r24 = r11
            r11 = r25
        L_0x029a:
            r25 = r12
            r12 = r26
        L_0x029e:
            r26 = r13
            r13 = r27
        L_0x02a2:
            r27 = r14
            r14 = r28
        L_0x02a6:
            r28 = r15
            r15 = r29
        L_0x02aa:
            r29 = r0
            r0 = r30
        L_0x02ae:
            r30 = r3
            r3 = r31
        L_0x02b2:
            long r57 = r2.getLong(r4)     // Catch:{ all -> 0x03b2 }
            long r55 = r2.getLong(r1)     // Catch:{ all -> 0x03b2 }
            r2.getLong(r5)     // Catch:{ all -> 0x03b2 }
            long r59 = r2.getLong(r6)     // Catch:{ all -> 0x03b2 }
            long r61 = r2.getLong(r7)     // Catch:{ all -> 0x03b2 }
            boolean r31 = r2.isNull(r8)     // Catch:{ all -> 0x03b2 }
            if (r31 == 0) goto L_0x02ce
            r63 = r53
            goto L_0x02d4
        L_0x02ce:
            java.lang.String r31 = r2.getString(r8)     // Catch:{ all -> 0x03b2 }
            r63 = r31
        L_0x02d4:
            boolean r31 = r2.isNull(r9)     // Catch:{ all -> 0x03b2 }
            if (r31 == 0) goto L_0x02dd
            r64 = r53
            goto L_0x02e3
        L_0x02dd:
            java.lang.String r31 = r2.getString(r9)     // Catch:{ all -> 0x03b2 }
            r64 = r31
        L_0x02e3:
            int r31 = r2.getInt(r10)     // Catch:{ all -> 0x03b2 }
            if (r31 == 0) goto L_0x02ec
            r65 = r51
            goto L_0x02ee
        L_0x02ec:
            r65 = r52
        L_0x02ee:
            long r66 = r2.getLong(r11)     // Catch:{ all -> 0x03b2 }
            boolean r31 = r2.isNull(r12)     // Catch:{ all -> 0x03b2 }
            if (r31 == 0) goto L_0x02fb
            r31 = r53
            goto L_0x02ff
        L_0x02fb:
            java.lang.String r31 = r2.getString(r12)     // Catch:{ all -> 0x03b2 }
        L_0x02ff:
            r34 = r1
            r35 = r4
            r1 = r75
            com.etsy.android.ui.conversation.details.e r4 = r1.f21090c     // Catch:{ all -> 0x03a8 }
            com.etsy.android.ui.conversation.details.ConversationDatabase$k r4 = r4.f21094d     // Catch:{ all -> 0x03a8 }
            r4.getClass()     // Catch:{ all -> 0x03a8 }
            java.util.List r68 = com.etsy.android.p327ui.conversation.details.ConversationDatabase.C9470k.m17814b(r31)     // Catch:{ all -> 0x03a8 }
            boolean r4 = r2.isNull(r13)     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x031b
            r31 = r5
            r4 = r53
            goto L_0x0321
        L_0x031b:
            java.lang.String r4 = r2.getString(r13)     // Catch:{ all -> 0x03a8 }
            r31 = r5
        L_0x0321:
            com.etsy.android.ui.conversation.details.e r5 = r1.f21090c     // Catch:{ all -> 0x03a8 }
            com.etsy.android.ui.conversation.details.ConversationDatabase$k r5 = r5.f21094d     // Catch:{ all -> 0x03a8 }
            r5.getClass()     // Catch:{ all -> 0x03a8 }
            java.util.List r69 = com.etsy.android.p327ui.conversation.details.ConversationDatabase.C9470k.m17813a(r4)     // Catch:{ all -> 0x03a8 }
            boolean r4 = r2.isNull(r14)     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x0335
            r70 = r53
            goto L_0x033b
        L_0x0335:
            java.lang.String r4 = r2.getString(r14)     // Catch:{ all -> 0x03a8 }
            r70 = r4
        L_0x033b:
            int r71 = r2.getInt(r15)     // Catch:{ all -> 0x03a8 }
            boolean r4 = r2.isNull(r0)     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x0348
            r72 = r53
            goto L_0x034e
        L_0x0348:
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x03a8 }
            r72 = r4
        L_0x034e:
            boolean r4 = r2.isNull(r3)     // Catch:{ all -> 0x03a8 }
            if (r4 == 0) goto L_0x0357
        L_0x0354:
            r73 = r53
            goto L_0x035c
        L_0x0357:
            java.lang.String r53 = r2.getString(r3)     // Catch:{ all -> 0x03a8 }
            goto L_0x0354
        L_0x035c:
            fc.b r4 = new fc.b     // Catch:{ all -> 0x03a8 }
            r54 = r4
            r54.<init>(r55, r57, r59, r61, r63, r64, r65, r66, r68, r69, r70, r71, r72, r73)     // Catch:{ all -> 0x03a8 }
            r5 = r30
            r5.add(r4)     // Catch:{ all -> 0x03a8 }
            r30 = r0
            r5 = r18
            r0 = r29
            r4 = r33
            r1 = r34
            r18 = r35
            r29 = r15
            r15 = r28
            r28 = r14
            r14 = r27
            r27 = r13
            r13 = r26
            r26 = r12
            r12 = r25
            r25 = r11
            r11 = r24
            r24 = r10
            r10 = r23
            r23 = r9
            r9 = r22
            r22 = r8
            r8 = r21
            r21 = r7
            r7 = r20
            r20 = r6
            r6 = r19
            r19 = r31
            r31 = r3
            r3 = r16
            r16 = r17
            r17 = r32
            goto L_0x00df
        L_0x03a8:
            r0 = move-exception
            goto L_0x03b5
        L_0x03aa:
            r1 = r75
            r29 = r0
            r2.close()
            return r29
        L_0x03b2:
            r0 = move-exception
            r1 = r75
        L_0x03b5:
            r2.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.details.C9513d.call():java.lang.Object");
    }

    public final void finalize() {
        this.f21089b.release();
    }
}
