package com.etsy.android.lib.models.apiv3.inappnotifications;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class InAppNotificationFavoriteShopsPromoJsonAdapter extends JsonAdapter<InAppNotificationFavoriteShopsPromo> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<InAppNotificationFavoriteShopsPromo> constructorRef;
    private final JsonAdapter<DismissAction> dismissActionAdapter;
    private final JsonAdapter<LandingPageLink> nullableLandingPageLinkAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("notification_feed_id", "notification_feed_index", "notification_text", "notification_subtext", "read", ResponseConstants.LANDING_PAGE, ServerDrivenAction.TYPE_DISMISS);
    private final JsonAdapter<String> stringAdapter;

    public InAppNotificationFavoriteShopsPromoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "feedId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "feedIndex");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isRead");
        this.nullableLandingPageLinkAdapter = yVar.mo68558c(LandingPageLink.class, emptySet, "landingPageLink");
        this.dismissActionAdapter = yVar.mo68558c(DismissAction.class, emptySet, "dismissAction");
    }

    public String toString() {
        return "GeneratedJsonAdapter(InAppNotificationFavoriteShopsPromo)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        r2 = r16;
        r11 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00dd, code lost:
        r7 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e1, code lost:
        r5 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r9 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo fromJson(com.squareup.moshi.JsonReader r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r3 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r3)
            r34.mo68410b()
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
        L_0x0016:
            boolean r10 = r34.mo68414f()
            java.lang.String r13 = "dismiss"
            java.lang.String r14 = "dismissAction"
            java.lang.String r15 = "read"
            java.lang.String r3 = "isRead"
            r16 = r2
            java.lang.String r2 = "notification_subtext"
            r17 = r11
            java.lang.String r11 = "subText"
            r18 = r7
            java.lang.String r7 = "notification_text"
            r19 = r12
            java.lang.String r12 = "text"
            r20 = r5
            java.lang.String r5 = "notification_feed_id"
            r21 = r9
            java.lang.String r9 = "feedId"
            if (r10 == 0) goto L_0x00e7
            com.squareup.moshi.JsonReader$b r10 = r0.options
            int r10 = r1.mo68406Q(r10)
            switch(r10) {
                case -1: goto L_0x00d3;
                case 0: goto L_0x00c2;
                case 1: goto L_0x00b2;
                case 2: goto L_0x00a1;
                case 3: goto L_0x0085;
                case 4: goto L_0x006c;
                case 5: goto L_0x005f;
                case 6: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x00d9
        L_0x0047:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.DismissAction> r2 = r0.dismissActionAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.DismissAction r12 = (com.etsy.android.lib.models.apiv3.inappnotifications.DismissAction) r12
            if (r12 == 0) goto L_0x005a
            r2 = r16
            r11 = r17
            r7 = r18
            goto L_0x00e1
        L_0x005a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r13, r1)
            throw r1
        L_0x005f:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink> r2 = r0.nullableLandingPageLinkAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink r11 = (com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink) r11
            r2 = r16
            goto L_0x00dd
        L_0x006c:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x0080
            r2 = r16
            r11 = r17
            r7 = r18
            r12 = r19
            goto L_0x00e3
        L_0x0080:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r15, r1)
            throw r1
        L_0x0085:
            com.squareup.moshi.JsonAdapter<java.lang.String> r3 = r0.stringAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x009c
            r2 = r16
            r11 = r17
            r7 = r18
            r12 = r19
            r5 = r20
            goto L_0x0016
        L_0x009c:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r11, r2, r1)
            throw r1
        L_0x00a1:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00ad
            goto L_0x00d9
        L_0x00ad:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r7, r1)
            throw r1
        L_0x00b2:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Long r7 = (java.lang.Long) r7
            r4 = r4 & -3
            r2 = r16
            r11 = r17
            goto L_0x00df
        L_0x00c2:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00ce
            goto L_0x00d9
        L_0x00ce:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r9, r5, r1)
            throw r1
        L_0x00d3:
            r34.mo68408S()
            r34.mo68411c0()
        L_0x00d9:
            r2 = r16
            r11 = r17
        L_0x00dd:
            r7 = r18
        L_0x00df:
            r12 = r19
        L_0x00e1:
            r5 = r20
        L_0x00e3:
            r9 = r21
            goto L_0x0016
        L_0x00e7:
            r34.mo68413e()
            r10 = -3
            if (r4 != r10) goto L_0x0123
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo r4 = new com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo
            if (r6 == 0) goto L_0x011e
            if (r8 == 0) goto L_0x0119
            if (r21 == 0) goto L_0x0114
            if (r20 == 0) goto L_0x010f
            boolean r10 = r20.booleanValue()
            if (r19 == 0) goto L_0x010a
            r5 = r4
            r7 = r18
            r9 = r21
            r11 = r17
            r12 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x010a:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r13, r1)
            throw r1
        L_0x010f:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r15, r1)
            throw r1
        L_0x0114:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r11, r2, r1)
            throw r1
        L_0x0119:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r7, r1)
            throw r1
        L_0x011e:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r9, r5, r1)
            throw r1
        L_0x0123:
            java.lang.reflect.Constructor<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo> r10 = r0.constructorRef
            r22 = 7
            r23 = 6
            r24 = 5
            r25 = 4
            r26 = 3
            r27 = 2
            r28 = 1
            r29 = 0
            r30 = r5
            r5 = 9
            if (r10 != 0) goto L_0x016d
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo> r10 = com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo.class
            r31 = r9
            java.lang.Class[] r9 = new java.lang.Class[r5]
            r9[r29] = r16
            java.lang.Class<java.lang.Long> r32 = java.lang.Long.class
            r9[r28] = r32
            r9[r27] = r16
            r9[r26] = r16
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r9[r25] = r16
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink> r16 = com.etsy.android.lib.models.apiv3.inappnotifications.LandingPageLink.class
            r9[r24] = r16
            java.lang.Class<com.etsy.android.lib.models.apiv3.inappnotifications.DismissAction> r16 = com.etsy.android.lib.models.apiv3.inappnotifications.DismissAction.class
            r9[r23] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r9[r22] = r16
            r16 = 8
            java.lang.Class<?> r32 = p618lp.C18215a.f39928c
            r9[r16] = r32
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r9)
            r0.constructorRef = r10
            java.lang.String r9 = "InAppNotificationFavorit…his.constructorRef = it }"
            kotlin.jvm.internal.C19383o.m32796f(r10, r9)
            goto L_0x016f
        L_0x016d:
            r31 = r9
        L_0x016f:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            if (r6 == 0) goto L_0x01bc
            r5[r29] = r6
            r5[r28] = r18
            if (r8 == 0) goto L_0x01b7
            r5[r27] = r8
            if (r21 == 0) goto L_0x01b2
            r5[r26] = r21
            if (r20 == 0) goto L_0x01ad
            boolean r2 = r20.booleanValue()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5[r25] = r2
            r5[r24] = r17
            if (r19 == 0) goto L_0x01a8
            r5[r23] = r19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r5[r22] = r1
            r1 = 8
            r2 = 0
            r5[r1] = r2
            java.lang.Object r1 = r10.newInstance(r5)
            java.lang.String r2 = "localConstructor.newInst…torMarker */ null\n      )"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo r1 = (com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo) r1
            return r1
        L_0x01a8:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r14, r13, r1)
            throw r1
        L_0x01ad:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r15, r1)
            throw r1
        L_0x01b2:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r11, r2, r1)
            throw r1
        L_0x01b7:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r12, r7, r1)
            throw r1
        L_0x01bc:
            r2 = r30
            r3 = r31
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30728g(r3, r2, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromoJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFavoriteShopsPromo");
    }

    public void toJson(C17412w wVar, InAppNotificationFavoriteShopsPromo inAppNotificationFavoriteShopsPromo) {
        C19383o.m32797g(wVar, "writer");
        if (inAppNotificationFavoriteShopsPromo != null) {
            wVar.mo68522b();
            wVar.mo68529h("notification_feed_id");
            this.stringAdapter.toJson(wVar, inAppNotificationFavoriteShopsPromo.getFeedId());
            wVar.mo68529h("notification_feed_index");
            this.nullableLongAdapter.toJson(wVar, inAppNotificationFavoriteShopsPromo.getFeedIndex());
            wVar.mo68529h("notification_text");
            this.stringAdapter.toJson(wVar, inAppNotificationFavoriteShopsPromo.getText());
            wVar.mo68529h("notification_subtext");
            this.stringAdapter.toJson(wVar, inAppNotificationFavoriteShopsPromo.getSubText());
            wVar.mo68529h("read");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(inAppNotificationFavoriteShopsPromo.isRead()));
            wVar.mo68529h(ResponseConstants.LANDING_PAGE);
            this.nullableLandingPageLinkAdapter.toJson(wVar, inAppNotificationFavoriteShopsPromo.getLandingPageLink());
            wVar.mo68529h(ServerDrivenAction.TYPE_DISMISS);
            this.dismissActionAdapter.toJson(wVar, inAppNotificationFavoriteShopsPromo.getDismissAction());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
