package com.etsy.android.lib.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import org.apache.commons.lang3.StringEscapeUtils;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ConversationMessage2 implements ITrackedObject {
    public static final int $stable = 8;
    private final long _creationDate;
    private final String _message;
    private final long conversationId;
    private final boolean hasImages;
    private transient boolean hasTranslationError;
    private final List<ImageInfo> images;
    private final String language;
    private final int messageOrder;
    private final String translatedMessage;
    private final long userId;

    public ConversationMessage2(@C17402n(name = "sender_id") long j, @C17402n(name = "conversation_id") long j2, @C17402n(name = "message_order") int i, @C17402n(name = "message") String str, @C17402n(name = "language") String str2, @C17402n(name = "translated_message") String str3, @C17402n(name = "has_images") boolean z, @C17402n(name = "create_date") long j3, @C17402n(name = "images") List<ImageInfo> list) {
        C19383o.m32797g(str, "_message");
        C19383o.m32797g(str3, "translatedMessage");
        C19383o.m32797g(list, "images");
        this.userId = j;
        this.conversationId = j2;
        this.messageOrder = i;
        this._message = str;
        this.language = str2;
        this.translatedMessage = str3;
        this.hasImages = z;
        this._creationDate = j3;
        this.images = list;
    }

    public static /* synthetic */ ConversationMessage2 copy$default(ConversationMessage2 conversationMessage2, long j, long j2, int i, String str, String str2, String str3, boolean z, long j3, List list, int i2, Object obj) {
        ConversationMessage2 conversationMessage22 = conversationMessage2;
        int i3 = i2;
        return conversationMessage2.copy((i3 & 1) != 0 ? conversationMessage22.userId : j, (i3 & 2) != 0 ? conversationMessage22.conversationId : j2, (i3 & 4) != 0 ? conversationMessage22.messageOrder : i, (i3 & 8) != 0 ? conversationMessage22._message : str, (i3 & 16) != 0 ? conversationMessage22.language : str2, (i3 & 32) != 0 ? conversationMessage22.translatedMessage : str3, (i3 & 64) != 0 ? conversationMessage22.hasImages : z, (i3 & 128) != 0 ? conversationMessage22._creationDate : j3, (i3 & 256) != 0 ? conversationMessage22.images : list);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getHasTranslationError$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    public final long component1() {
        return this.userId;
    }

    public final long component2() {
        return this.conversationId;
    }

    public final int component3() {
        return this.messageOrder;
    }

    public final String component4() {
        return this._message;
    }

    public final String component5() {
        return this.language;
    }

    public final String component6() {
        return this.translatedMessage;
    }

    public final boolean component7() {
        return this.hasImages;
    }

    public final long component8() {
        return this._creationDate;
    }

    public final List<ImageInfo> component9() {
        return this.images;
    }

    public final ConversationMessage2 copy(@C17402n(name = "sender_id") long j, @C17402n(name = "conversation_id") long j2, @C17402n(name = "message_order") int i, @C17402n(name = "message") String str, @C17402n(name = "language") String str2, @C17402n(name = "translated_message") String str3, @C17402n(name = "has_images") boolean z, @C17402n(name = "create_date") long j3, @C17402n(name = "images") List<ImageInfo> list) {
        String str4 = str;
        C19383o.m32797g(str4, "_message");
        String str5 = str3;
        C19383o.m32797g(str5, "translatedMessage");
        List<ImageInfo> list2 = list;
        C19383o.m32797g(list2, "images");
        return new ConversationMessage2(j, j2, i, str4, str2, str5, z, j3, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationMessage2)) {
            return false;
        }
        ConversationMessage2 conversationMessage2 = (ConversationMessage2) obj;
        return this.userId == conversationMessage2.userId && this.conversationId == conversationMessage2.conversationId && this.messageOrder == conversationMessage2.messageOrder && C19383o.m32792b(this._message, conversationMessage2._message) && C19383o.m32792b(this.language, conversationMessage2.language) && C19383o.m32792b(this.translatedMessage, conversationMessage2.translatedMessage) && this.hasImages == conversationMessage2.hasImages && this._creationDate == conversationMessage2._creationDate && C19383o.m32792b(this.images, conversationMessage2.images);
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    public final long getCreationDateInMillis() {
        return this._creationDate * ((long) 1000);
    }

    public final boolean getHasImages() {
        return this.hasImages;
    }

    public final boolean getHasTranslationError() {
        return this.hasTranslationError;
    }

    public final List<ImageInfo> getImages() {
        return this.images;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getMessage() {
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(this._message);
        C19383o.m32796f(unescapeHtml4, "unescapeHtml4(_message)");
        return unescapeHtml4;
    }

    public final int getMessageOrder() {
        return this.messageOrder;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    @JsonIgnore
    public String getTrackingName() {
        return "";
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.TARGET_USER_ID, Long.valueOf(this.userId)));
    }

    public final String getTranslatedMessage() {
        return this.translatedMessage;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long get_creationDate() {
        return this._creationDate;
    }

    public final String get_message() {
        return this._message;
    }

    public int hashCode() {
        int e = C0023f.m105e(this._message, C0069a.m170a(this.messageOrder, C0071c.m190b(this.conversationId, Long.hashCode(this.userId) * 31, 31), 31), 31);
        String str = this.language;
        int e2 = C0023f.m105e(this.translatedMessage, (e + (str == null ? 0 : str.hashCode())) * 31, 31);
        boolean z = this.hasImages;
        if (z) {
            z = true;
        }
        return this.images.hashCode() + C0071c.m190b(this._creationDate, (e2 + (z ? 1 : 0)) * 31, 31);
    }

    public final void setHasTranslationError(boolean z) {
        this.hasTranslationError = z;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "onSeenTrackingEvents");
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    @JsonIgnore
    public void setTrackingName(String str) {
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConversationMessage2(userId=");
        h.append(this.userId);
        h.append(", conversationId=");
        h.append(this.conversationId);
        h.append(", messageOrder=");
        h.append(this.messageOrder);
        h.append(", _message=");
        h.append(this._message);
        h.append(", language=");
        h.append(this.language);
        h.append(", translatedMessage=");
        h.append(this.translatedMessage);
        h.append(", hasImages=");
        h.append(this.hasImages);
        h.append(", _creationDate=");
        h.append(this._creationDate);
        h.append(", images=");
        return C0070b.m186i(h, this.images, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConversationMessage2(long r17, long r19, int r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, long r26, java.util.List r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r21
        L_0x000b:
            r1 = r0 & 8
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0013
            r9 = r3
            goto L_0x0015
        L_0x0013:
            r9 = r22
        L_0x0015:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001b
            r10 = r3
            goto L_0x001d
        L_0x001b:
            r10 = r23
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0023
            r11 = r3
            goto L_0x0025
        L_0x0023:
            r11 = r24
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r12 = r2
            goto L_0x002d
        L_0x002b:
            r12 = r25
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0035
            r1 = 0
            r13 = r1
            goto L_0x0037
        L_0x0035:
            r13 = r26
        L_0x0037:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0042
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15 = r0
            goto L_0x0044
        L_0x0042:
            r15 = r28
        L_0x0044:
            r3 = r16
            r4 = r17
            r6 = r19
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ConversationMessage2.<init>(long, long, int, java.lang.String, java.lang.String, java.lang.String, boolean, long, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
