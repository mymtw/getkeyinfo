package com.etsy.android.p327ui.giftcards;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.giftcards.GiftCardRequestJsonAdapter */
public final class GiftCardRequestJsonAdapter extends JsonAdapter<GiftCardRequest> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.AMOUNT, "recipient_name", "sender_name", "is_email", "design_id", "recipient_email", "message", ResponseConstants.CURRENCY_CODE);
    private final JsonAdapter<String> stringAdapter;

    public GiftCardRequestJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.AMOUNT);
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "recipientName");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isEmail");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "designId");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0100, code lost:
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0102, code lost:
        r11 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0104, code lost:
        r10 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0106, code lost:
        r9 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r2 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010a, code lost:
        r6 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        r5 = r22;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object fromJson(com.squareup.moshi.JsonReader r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r25.mo68410b()
            r2 = 0
            r3 = r2
            r5 = r3
            r6 = r5
            r8 = r6
            r9 = r8
            r10 = r9
            r11 = r10
        L_0x0014:
            boolean r4 = r25.mo68414f()
            java.lang.String r7 = "currency_code"
            java.lang.String r12 = "currencyCode"
            java.lang.String r13 = "recipient_email"
            java.lang.String r14 = "recipientEmail"
            java.lang.String r15 = "is_email"
            r16 = r8
            java.lang.String r8 = "isEmail"
            r17 = r11
            java.lang.String r11 = "sender_name"
            r18 = r10
            java.lang.String r10 = "senderName"
            r19 = r9
            java.lang.String r9 = "recipient_name"
            r20 = r2
            java.lang.String r2 = "recipientName"
            r21 = r6
            java.lang.String r6 = "message"
            r22 = r5
            java.lang.String r5 = "amount"
            if (r4 == 0) goto L_0x0110
            com.squareup.moshi.JsonReader$b r4 = r0.options
            int r4 = r1.mo68406Q(r4)
            switch(r4) {
                case -1: goto L_0x00fa;
                case 0: goto L_0x00e9;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00b0;
                case 3: goto L_0x0098;
                case 4: goto L_0x008d;
                case 5: goto L_0x0075;
                case 6: goto L_0x005f;
                case 7: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0100
        L_0x004b:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x005a
            r8 = r16
            goto L_0x0104
        L_0x005a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r7, r1)
            throw r1
        L_0x005f:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0070
            r8 = r16
            r11 = r17
            goto L_0x0106
        L_0x0070:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r6, r6, r1)
            throw r1
        L_0x0075:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0088
            r9 = r2
            r8 = r16
            r11 = r17
            r10 = r18
            goto L_0x0108
        L_0x0088:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r13, r1)
            throw r1
        L_0x008d:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.nullableIntAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.Integer r8 = (java.lang.Integer) r8
            goto L_0x0102
        L_0x0098:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x00ab
            r8 = r16
            r11 = r17
            r10 = r18
            r9 = r19
            goto L_0x010a
        L_0x00ab:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r8, r15, r1)
            throw r1
        L_0x00b0:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00c6
            r6 = r2
            r8 = r16
            r11 = r17
            r10 = r18
            r9 = r19
            r2 = r20
            goto L_0x010c
        L_0x00c6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r11, r1)
            throw r1
        L_0x00cb:
            com.squareup.moshi.JsonAdapter<java.lang.String> r4 = r0.stringAdapter
            java.lang.Object r4 = r4.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x00e4
            r8 = r16
            r11 = r17
            r10 = r18
            r9 = r19
            r2 = r20
            r6 = r21
            goto L_0x0014
        L_0x00e4:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r9, r1)
            throw r1
        L_0x00e9:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x00f5
            goto L_0x0100
        L_0x00f5:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r5, r1)
            throw r1
        L_0x00fa:
            r25.mo68408S()
            r25.mo68411c0()
        L_0x0100:
            r8 = r16
        L_0x0102:
            r11 = r17
        L_0x0104:
            r10 = r18
        L_0x0106:
            r9 = r19
        L_0x0108:
            r2 = r20
        L_0x010a:
            r6 = r21
        L_0x010c:
            r5 = r22
            goto L_0x0014
        L_0x0110:
            r25.mo68413e()
            com.etsy.android.ui.giftcards.GiftCardRequest r23 = new com.etsy.android.ui.giftcards.GiftCardRequest
            if (r3 == 0) goto L_0x015c
            int r4 = r3.intValue()
            if (r22 == 0) goto L_0x0157
            if (r21 == 0) goto L_0x0152
            if (r20 == 0) goto L_0x014d
            boolean r2 = r20.booleanValue()
            if (r19 == 0) goto L_0x0148
            if (r18 == 0) goto L_0x0143
            if (r17 == 0) goto L_0x013e
            r3 = r23
            r5 = r22
            r6 = r21
            r7 = r2
            r8 = r16
            r9 = r19
            r10 = r18
            r11 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return r23
        L_0x013e:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r7, r1)
            throw r1
        L_0x0143:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r6, r6, r1)
            throw r1
        L_0x0148:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r13, r1)
            throw r1
        L_0x014d:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r8, r15, r1)
            throw r1
        L_0x0152:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r10, r11, r1)
            throw r1
        L_0x0157:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r2, r9, r1)
            throw r1
        L_0x015c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r5, r5, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.giftcards.GiftCardRequestJsonAdapter.fromJson(com.squareup.moshi.JsonReader):java.lang.Object");
    }

    public final void toJson(C17412w wVar, Object obj) {
        GiftCardRequest giftCardRequest = (GiftCardRequest) obj;
        C19383o.m32797g(wVar, "writer");
        if (giftCardRequest != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.AMOUNT);
            this.intAdapter.toJson(wVar, Integer.valueOf(giftCardRequest.f21857a));
            wVar.mo68529h("recipient_name");
            this.stringAdapter.toJson(wVar, giftCardRequest.f21858b);
            wVar.mo68529h("sender_name");
            this.stringAdapter.toJson(wVar, giftCardRequest.f21859c);
            wVar.mo68529h("is_email");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(giftCardRequest.f21860d));
            wVar.mo68529h("design_id");
            this.nullableIntAdapter.toJson(wVar, giftCardRequest.f21861e);
            wVar.mo68529h("recipient_email");
            this.stringAdapter.toJson(wVar, giftCardRequest.f21862f);
            wVar.mo68529h("message");
            this.stringAdapter.toJson(wVar, giftCardRequest.f21863g);
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.stringAdapter.toJson(wVar, giftCardRequest.f21864h);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GiftCardRequest)";
    }
}
