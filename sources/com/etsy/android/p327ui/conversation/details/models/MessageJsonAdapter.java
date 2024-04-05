package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.ImageInfo;
import com.etsy.android.lib.models.ListingPartial;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.conversation.details.models.MessageJsonAdapter */
public final class MessageJsonAdapter extends JsonAdapter<Message> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ImageInfo>> listOfImageInfoAdapter;
    private final JsonAdapter<List<ListingPartial>> listOfListingPartialAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<Receipt>> nullableListOfReceiptAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("messenger_conversation_id", "messenger_conversation_message_id", ResponseConstants.CREATE_DATE, "sort_key_send_date_ms", "message", "sender_user_id", "is_sender", "message_date", "message_display_day", "is_system_message", "message_type", "listings", "images", "language", "message_source", "receipt");
    private final JsonAdapter<String> stringAdapter;

    public MessageJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar2.mo68558c(cls2, emptySet, "conversationId");
        this.stringAdapter = yVar2.mo68558c(cls, emptySet, "text");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "isSender");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, "messageType");
        this.listOfListingPartialAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ListingPartial.class), emptySet, "listings");
        this.listOfImageInfoAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ImageInfo.class), emptySet, "images");
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "messageSource");
        this.nullableListOfReceiptAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Receipt.class), emptySet, "receipt");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020c, code lost:
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020e, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0210, code lost:
        r4 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0212, code lost:
        r5 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0214, code lost:
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0216, code lost:
        r6 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0218, code lost:
        r7 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x021a, code lost:
        r8 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x021c, code lost:
        r9 = r31;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fromJson(com.squareup.moshi.JsonReader r55) {
        /*
            r54 = this;
            r0 = r54
            r1 = r55
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r55.mo68410b()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r15 = r9
            r19 = r15
            r20 = r19
            r23 = r20
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
        L_0x0023:
            boolean r10 = r55.mo68414f()
            java.lang.String r11 = "message_display_day"
            java.lang.String r12 = "messageDisplayDate"
            java.lang.String r13 = "message_date"
            java.lang.String r14 = "messageDate"
            r16 = r2
            java.lang.String r2 = "is_sender"
            r17 = r3
            java.lang.String r3 = "isSender"
            r18 = r4
            java.lang.String r4 = "sender_user_id"
            r21 = r5
            java.lang.String r5 = "senderUserId"
            r22 = r15
            java.lang.String r15 = "message"
            r28 = r6
            java.lang.String r6 = "text"
            r29 = r7
            java.lang.String r7 = "sort_key_send_date_ms"
            r30 = r8
            java.lang.String r8 = "sortKey"
            r31 = r9
            java.lang.String r9 = "create_date"
            r32 = r9
            java.lang.String r9 = "createDate"
            r33 = r9
            java.lang.String r9 = "messenger_conversation_message_id"
            r34 = r9
            java.lang.String r9 = "messageId"
            r35 = r9
            java.lang.String r9 = "messenger_conversation_id"
            r36 = r9
            java.lang.String r9 = "conversationId"
            r37 = r9
            java.lang.String r9 = "language"
            r38 = r7
            java.lang.String r7 = "images"
            r39 = r8
            java.lang.String r8 = "listings"
            r40 = r6
            java.lang.String r6 = "message_type"
            r41 = r15
            java.lang.String r15 = "messageType"
            r42 = r4
            java.lang.String r4 = "is_system_message"
            r43 = r5
            java.lang.String r5 = "isSystemMessage"
            if (r10 == 0) goto L_0x0220
            com.squareup.moshi.JsonReader$b r10 = r0.options
            int r10 = r1.mo68406Q(r10)
            switch(r10) {
                case -1: goto L_0x0206;
                case 0: goto L_0x01e0;
                case 1: goto L_0x01bd;
                case 2: goto L_0x019b;
                case 3: goto L_0x017b;
                case 4: goto L_0x015d;
                case 5: goto L_0x0141;
                case 6: goto L_0x012c;
                case 7: goto L_0x0119;
                case 8: goto L_0x0106;
                case 9: goto L_0x00f2;
                case 10: goto L_0x00e1;
                case 11: goto L_0x00ce;
                case 12: goto L_0x00bb;
                case 13: goto L_0x00a8;
                case 14: goto L_0x009c;
                case 15: goto L_0x0090;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x020c
        L_0x0090:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.ui.conversation.details.models.Receipt>> r2 = r0.nullableListOfReceiptAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r27 = r2
            java.util.List r27 = (java.util.List) r27
            goto L_0x020c
        L_0x009c:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r26 = r2
            java.lang.String r26 = (java.lang.String) r26
            goto L_0x020c
        L_0x00a8:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            if (r25 == 0) goto L_0x00b6
            goto L_0x020c
        L_0x00b6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r9, r1)
            throw r1
        L_0x00bb:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.ImageInfo>> r2 = r0.listOfImageInfoAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r24 = r2
            java.util.List r24 = (java.util.List) r24
            if (r24 == 0) goto L_0x00c9
            goto L_0x020c
        L_0x00c9:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r7, r1)
            throw r1
        L_0x00ce:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.ListingPartial>> r2 = r0.listOfListingPartialAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r23 = r2
            java.util.List r23 = (java.util.List) r23
            if (r23 == 0) goto L_0x00dc
            goto L_0x020c
        L_0x00dc:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r8, r8, r1)
            throw r1
        L_0x00e1:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L_0x00ed
            goto L_0x020e
        L_0x00ed:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r6, r1)
            throw r1
        L_0x00f2:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x0101
            r2 = r16
            goto L_0x0210
        L_0x0101:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r4, r1)
            throw r1
        L_0x0106:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r20 = r2
            java.lang.String r20 = (java.lang.String) r20
            if (r20 == 0) goto L_0x0114
            goto L_0x020c
        L_0x0114:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r11, r1)
            throw r1
        L_0x0119:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            if (r19 == 0) goto L_0x0127
            goto L_0x020c
        L_0x0127:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r13, r1)
            throw r1
        L_0x012c:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r4 = r0.booleanAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x013c
            r2 = r16
            r3 = r17
            goto L_0x0212
        L_0x013c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x0141:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0154
            r5 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            goto L_0x0214
        L_0x0154:
            r10 = r42
            r2 = r43
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r10, r1)
            throw r1
        L_0x015d:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x0172
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            goto L_0x0216
        L_0x0172:
            r3 = r40
            r2 = r41
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x017b:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0192
            r6 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r15 = r22
            goto L_0x0218
        L_0x0192:
            r2 = r38
            r3 = r39
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x019b:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L_0x01b4
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r15 = r22
            r6 = r28
            goto L_0x021a
        L_0x01b4:
            r2 = r32
            r3 = r33
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x01bd:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x01d7
            r8 = r2
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r15 = r22
            r6 = r28
            r7 = r29
            goto L_0x021c
        L_0x01d7:
            r2 = r34
            r3 = r35
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x01e0:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 == 0) goto L_0x01fd
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r21
            r15 = r22
            r6 = r28
            r7 = r29
            r8 = r30
            goto L_0x0023
        L_0x01fd:
            r2 = r36
            r3 = r37
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x0206:
            r55.mo68408S()
            r55.mo68411c0()
        L_0x020c:
            r2 = r16
        L_0x020e:
            r3 = r17
        L_0x0210:
            r4 = r18
        L_0x0212:
            r5 = r21
        L_0x0214:
            r15 = r22
        L_0x0216:
            r6 = r28
        L_0x0218:
            r7 = r29
        L_0x021a:
            r8 = r30
        L_0x021c:
            r9 = r31
            goto L_0x0023
        L_0x0220:
            r48 = r32
            r49 = r33
            r50 = r34
            r51 = r35
            r52 = r36
            r53 = r37
            r46 = r38
            r47 = r39
            r45 = r40
            r44 = r41
            r10 = r42
            r0 = r43
            r55.mo68413e()
            com.etsy.android.ui.conversation.details.models.Message r32 = new com.etsy.android.ui.conversation.details.models.Message
            if (r31 == 0) goto L_0x02de
            long r33 = r31.longValue()
            if (r30 == 0) goto L_0x02d5
            long r30 = r30.longValue()
            if (r29 == 0) goto L_0x02cc
            long r35 = r29.longValue()
            if (r28 == 0) goto L_0x02c3
            long r28 = r28.longValue()
            if (r22 == 0) goto L_0x02ba
            if (r21 == 0) goto L_0x02b5
            long r37 = r21.longValue()
            if (r18 == 0) goto L_0x02b0
            boolean r18 = r18.booleanValue()
            if (r19 == 0) goto L_0x02ab
            if (r20 == 0) goto L_0x02a6
            if (r17 == 0) goto L_0x02a1
            boolean r21 = r17.booleanValue()
            if (r16 == 0) goto L_0x029c
            int r0 = r16.intValue()
            if (r23 == 0) goto L_0x0297
            if (r24 == 0) goto L_0x0292
            if (r25 == 0) goto L_0x028d
            r6 = r32
            r7 = r33
            r9 = r30
            r11 = r35
            r13 = r28
            r15 = r22
            r16 = r37
            r22 = r0
            r6.<init>(r7, r9, r11, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r32
        L_0x028d:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r9, r9, r1)
            throw r0
        L_0x0292:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r7, r7, r1)
            throw r0
        L_0x0297:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r8, r8, r1)
            throw r0
        L_0x029c:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r15, r6, r1)
            throw r0
        L_0x02a1:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r5, r4, r1)
            throw r0
        L_0x02a6:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r12, r11, r1)
            throw r0
        L_0x02ab:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r14, r13, r1)
            throw r0
        L_0x02b0:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r0
        L_0x02b5:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r10, r1)
            throw r0
        L_0x02ba:
            r0 = r44
            r2 = r45
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x02c3:
            r0 = r46
            r2 = r47
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x02cc:
            r0 = r48
            r2 = r49
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x02d5:
            r0 = r50
            r2 = r51
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x02de:
            r0 = r52
            r2 = r53
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.details.models.MessageJsonAdapter.fromJson(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    public final void toJson(C17412w wVar, Object obj) {
        Message message = (Message) obj;
        C19383o.m32797g(wVar, "writer");
        if (message != null) {
            wVar.mo68522b();
            wVar.mo68529h("messenger_conversation_id");
            this.longAdapter.toJson(wVar, Long.valueOf(message.f21194a));
            wVar.mo68529h("messenger_conversation_message_id");
            this.longAdapter.toJson(wVar, Long.valueOf(message.f21195b));
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.longAdapter.toJson(wVar, Long.valueOf(message.f21196c));
            wVar.mo68529h("sort_key_send_date_ms");
            this.longAdapter.toJson(wVar, Long.valueOf(message.f21197d));
            wVar.mo68529h("message");
            this.stringAdapter.toJson(wVar, message.f21198e);
            wVar.mo68529h("sender_user_id");
            this.longAdapter.toJson(wVar, Long.valueOf(message.f21199f));
            wVar.mo68529h("is_sender");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(message.f21200g));
            wVar.mo68529h("message_date");
            this.stringAdapter.toJson(wVar, message.f21201h);
            wVar.mo68529h("message_display_day");
            this.stringAdapter.toJson(wVar, message.f21202i);
            wVar.mo68529h("is_system_message");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(message.f21203j));
            wVar.mo68529h("message_type");
            this.intAdapter.toJson(wVar, Integer.valueOf(message.f21204k));
            wVar.mo68529h("listings");
            this.listOfListingPartialAdapter.toJson(wVar, message.f21205l);
            wVar.mo68529h("images");
            this.listOfImageInfoAdapter.toJson(wVar, message.f21206m);
            wVar.mo68529h("language");
            this.stringAdapter.toJson(wVar, message.f21207n);
            wVar.mo68529h("message_source");
            this.nullableStringAdapter.toJson(wVar, message.f21208o);
            wVar.mo68529h("receipt");
            this.nullableListOfReceiptAdapter.toJson(wVar, message.f21209p);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(Message)";
    }
}
