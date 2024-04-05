package com.etsy.android.lib.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.conversation.context.ConversationContextAdapterFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.lang3.StringEscapeUtils;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class Conversation3 implements ITrackedObject {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String _lastMessage;
    private final long _lastUpdateDate;
    private final String _title;
    private final Alert alert;
    private final long contextId;
    private final int contextTypeId;
    private final ConversationContextAdapterFactory conversationContextAdapterFactory;
    private final long conversationId;
    private final boolean hasAttachments;
    private final boolean isCustomShop;
    private transient String lastMessage;
    private final long lastMessageDate;
    private final String lastMessageMe;
    private final long lastMessageMeDate;
    private final String lastMessageOther;
    private final long lastMessageOtherDate;
    private transient long lastUpdateDateInMillis;
    private final int messageCount;
    private final ConversationUser otherUser;
    private boolean read;
    private transient String title;
    private transient Map<AnalyticsProperty, Object> trackingParameters;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Conversation3() {
        this(0, 0, (String) null, false, (ConversationUser) null, 0, (String) null, (String) null, (String) null, 0, 0, 0, false, false, 0, 0, (ConversationContextAdapterFactory) null, (Alert) null, 262143, (DefaultConstructorMarker) null);
    }

    public Conversation3(@C17402n(name = "conversation_id") long j, @C17402n(name = "message_count") int i, @C17402n(name = "title") String str, @C17402n(name = "is_read") boolean z, @C17402n(name = "other_user") ConversationUser conversationUser, @C17402n(name = "last_updated_tsz") long j2, @C17402n(name = "last_message") String str2, @C17402n(name = "last_message_me") String str3, @C17402n(name = "last_message_other") String str4, @C17402n(name = "last_message_date") long j3, @C17402n(name = "last_message_me_date") long j4, @C17402n(name = "last_message_other_date") long j5, @C17402n(name = "has_attachments") boolean z2, @C17402n(name = "is_custom_shop") boolean z3, @C17402n(name = "context_type_id") int i2, @C17402n(name = "context_id") long j6, @C17402n(name = "context") ConversationContextAdapterFactory conversationContextAdapterFactory2, @C17402n(name = "alert") Alert alert2) {
        C0391c.m1060g(str, "_title", str2, "_lastMessage", str3, "lastMessageMe", str4, "lastMessageOther");
        this.conversationId = j;
        this.messageCount = i;
        this._title = str;
        this.read = z;
        this.otherUser = conversationUser;
        this._lastUpdateDate = j2;
        this._lastMessage = str2;
        this.lastMessageMe = str3;
        this.lastMessageOther = str4;
        this.lastMessageDate = j3;
        this.lastMessageMeDate = j4;
        this.lastMessageOtherDate = j5;
        this.hasAttachments = z2;
        this.isCustomShop = z3;
        this.contextTypeId = i2;
        this.contextId = j6;
        this.conversationContextAdapterFactory = conversationContextAdapterFactory2;
        this.alert = alert2;
        this.trackingParameters = C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.CONVERSATION_ID, Long.valueOf(j)));
        this.lastMessage = "";
        this.title = "";
    }

    public static /* synthetic */ Conversation3 copy$default(Conversation3 conversation3, long j, int i, String str, boolean z, ConversationUser conversationUser, long j2, String str2, String str3, String str4, long j3, long j4, long j5, boolean z2, boolean z3, int i2, long j6, ConversationContextAdapterFactory conversationContextAdapterFactory2, Alert alert2, int i3, Object obj) {
        Conversation3 conversation32 = conversation3;
        int i4 = i3;
        return conversation3.copy((i4 & 1) != 0 ? conversation32.conversationId : j, (i4 & 2) != 0 ? conversation32.messageCount : i, (i4 & 4) != 0 ? conversation32._title : str, (i4 & 8) != 0 ? conversation32.read : z, (i4 & 16) != 0 ? conversation32.otherUser : conversationUser, (i4 & 32) != 0 ? conversation32._lastUpdateDate : j2, (i4 & 64) != 0 ? conversation32._lastMessage : str2, (i4 & 128) != 0 ? conversation32.lastMessageMe : str3, (i4 & 256) != 0 ? conversation32.lastMessageOther : str4, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? conversation32.lastMessageDate : j3, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? conversation32.lastMessageMeDate : j4, (i4 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? conversation32.lastMessageOtherDate : j5, (i4 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? conversation32.hasAttachments : z2, (i4 & 8192) != 0 ? conversation32.isCustomShop : z3, (i4 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? conversation32.contextTypeId : i2, (i4 & 32768) != 0 ? conversation32.contextId : j6, (i4 & 65536) != 0 ? conversation32.conversationContextAdapterFactory : conversationContextAdapterFactory2, (i4 & 131072) != 0 ? conversation32.alert : alert2);
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getLastMessage$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getLastUpdateDateInMillis$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingParameters$annotations() {
    }

    public final long component1() {
        return this.conversationId;
    }

    public final long component10() {
        return this.lastMessageDate;
    }

    public final long component11() {
        return this.lastMessageMeDate;
    }

    public final long component12() {
        return this.lastMessageOtherDate;
    }

    public final boolean component13() {
        return this.hasAttachments;
    }

    public final boolean component14() {
        return this.isCustomShop;
    }

    public final int component15() {
        return this.contextTypeId;
    }

    public final long component16() {
        return this.contextId;
    }

    public final ConversationContextAdapterFactory component17() {
        return this.conversationContextAdapterFactory;
    }

    public final Alert component18() {
        return this.alert;
    }

    public final int component2() {
        return this.messageCount;
    }

    public final String component3() {
        return this._title;
    }

    public final boolean component4() {
        return this.read;
    }

    public final ConversationUser component5() {
        return this.otherUser;
    }

    public final long component6() {
        return this._lastUpdateDate;
    }

    public final String component7() {
        return this._lastMessage;
    }

    public final String component8() {
        return this.lastMessageMe;
    }

    public final String component9() {
        return this.lastMessageOther;
    }

    public final Conversation3 copy(@C17402n(name = "conversation_id") long j, @C17402n(name = "message_count") int i, @C17402n(name = "title") String str, @C17402n(name = "is_read") boolean z, @C17402n(name = "other_user") ConversationUser conversationUser, @C17402n(name = "last_updated_tsz") long j2, @C17402n(name = "last_message") String str2, @C17402n(name = "last_message_me") String str3, @C17402n(name = "last_message_other") String str4, @C17402n(name = "last_message_date") long j3, @C17402n(name = "last_message_me_date") long j4, @C17402n(name = "last_message_other_date") long j5, @C17402n(name = "has_attachments") boolean z2, @C17402n(name = "is_custom_shop") boolean z3, @C17402n(name = "context_type_id") int i2, @C17402n(name = "context_id") long j6, @C17402n(name = "context") ConversationContextAdapterFactory conversationContextAdapterFactory2, @C17402n(name = "alert") Alert alert2) {
        long j7 = j;
        C19383o.m32797g(str, "_title");
        C19383o.m32797g(str2, "_lastMessage");
        C19383o.m32797g(str3, "lastMessageMe");
        C19383o.m32797g(str4, "lastMessageOther");
        return new Conversation3(j, i, str, z, conversationUser, j2, str2, str3, str4, j3, j4, j5, z2, z3, i2, j6, conversationContextAdapterFactory2, alert2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation3)) {
            return false;
        }
        Conversation3 conversation3 = (Conversation3) obj;
        return this.conversationId == conversation3.conversationId && this.messageCount == conversation3.messageCount && C19383o.m32792b(this._title, conversation3._title) && this.read == conversation3.read && C19383o.m32792b(this.otherUser, conversation3.otherUser) && this._lastUpdateDate == conversation3._lastUpdateDate && C19383o.m32792b(this._lastMessage, conversation3._lastMessage) && C19383o.m32792b(this.lastMessageMe, conversation3.lastMessageMe) && C19383o.m32792b(this.lastMessageOther, conversation3.lastMessageOther) && this.lastMessageDate == conversation3.lastMessageDate && this.lastMessageMeDate == conversation3.lastMessageMeDate && this.lastMessageOtherDate == conversation3.lastMessageOtherDate && this.hasAttachments == conversation3.hasAttachments && this.isCustomShop == conversation3.isCustomShop && this.contextTypeId == conversation3.contextTypeId && this.contextId == conversation3.contextId && C19383o.m32792b(this.conversationContextAdapterFactory, conversation3.conversationContextAdapterFactory) && C19383o.m32792b(this.alert, conversation3.alert);
    }

    public final Alert getAlert() {
        return this.alert;
    }

    public final long getContextId() {
        return this.contextId;
    }

    public final int getContextTypeId() {
        return this.contextTypeId;
    }

    public final ConversationContextAdapterFactory getConversationContextAdapterFactory() {
        return this.conversationContextAdapterFactory;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    public final boolean getHasAttachments() {
        return this.hasAttachments;
    }

    public final String getLastMessage() {
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(this._lastMessage);
        C19383o.m32796f(unescapeHtml4, "unescapeHtml4(_lastMessage)");
        return unescapeHtml4;
    }

    public final long getLastMessageDate() {
        return this.lastMessageDate;
    }

    public final String getLastMessageMe() {
        return this.lastMessageMe;
    }

    public final long getLastMessageMeDate() {
        return this.lastMessageMeDate;
    }

    public final String getLastMessageOther() {
        return this.lastMessageOther;
    }

    public final long getLastMessageOtherDate() {
        return this.lastMessageOtherDate;
    }

    public final long getLastUpdateDateInMillis() {
        return this._lastUpdateDate * ((long) 1000);
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    @JsonIgnore
    public List<C8696j> getOnSeenTrackingEvents() {
        return new ArrayList();
    }

    public final ConversationUser getOtherUser() {
        return this.otherUser;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final String getTitle() {
        String unescapeHtml4 = StringEscapeUtils.unescapeHtml4(this._title);
        C19383o.m32796f(unescapeHtml4, "unescapeHtml4(_title)");
        return unescapeHtml4;
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
        return this.trackingParameters;
    }

    public final String get_lastMessage() {
        return this._lastMessage;
    }

    public final long get_lastUpdateDate() {
        return this._lastUpdateDate;
    }

    public final String get_title() {
        return this._title;
    }

    public int hashCode() {
        int e = C0023f.m105e(this._title, C0069a.m170a(this.messageCount, Long.hashCode(this.conversationId) * 31, 31), 31);
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        ConversationUser conversationUser = this.otherUser;
        int i2 = 0;
        int b = C0071c.m190b(this.lastMessageOtherDate, C0071c.m190b(this.lastMessageMeDate, C0071c.m190b(this.lastMessageDate, C0023f.m105e(this.lastMessageOther, C0023f.m105e(this.lastMessageMe, C0023f.m105e(this._lastMessage, C0071c.m190b(this._lastUpdateDate, (i + (conversationUser == null ? 0 : conversationUser.hashCode())) * 31, 31), 31), 31), 31), 31), 31), 31);
        boolean z3 = this.hasAttachments;
        if (z3) {
            z3 = true;
        }
        int i3 = (b + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isCustomShop;
        if (!z4) {
            z2 = z4;
        }
        int b2 = C0071c.m190b(this.contextId, C0069a.m170a(this.contextTypeId, (i3 + (z2 ? 1 : 0)) * 31, 31), 31);
        ConversationContextAdapterFactory conversationContextAdapterFactory2 = this.conversationContextAdapterFactory;
        int hashCode = (b2 + (conversationContextAdapterFactory2 == null ? 0 : conversationContextAdapterFactory2.hashCode())) * 31;
        Alert alert2 = this.alert;
        if (alert2 != null) {
            i2 = alert2.hashCode();
        }
        return hashCode + i2;
    }

    public final boolean isCustomShop() {
        return this.isCustomShop;
    }

    public final void setLastMessage(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.lastMessage = str;
    }

    public final void setLastUpdateDateInMillis(long j) {
        this.lastUpdateDateInMillis = j;
    }

    @JsonIgnore
    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "onSeenTrackingEvents");
    }

    public final void setRead(boolean z) {
        this.read = z;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    @JsonIgnore
    public void setTrackingName(String str) {
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
        this.trackingParameters = map;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Conversation3(conversationId=");
        h.append(this.conversationId);
        h.append(", messageCount=");
        h.append(this.messageCount);
        h.append(", _title=");
        h.append(this._title);
        h.append(", read=");
        h.append(this.read);
        h.append(", otherUser=");
        h.append(this.otherUser);
        h.append(", _lastUpdateDate=");
        h.append(this._lastUpdateDate);
        h.append(", _lastMessage=");
        h.append(this._lastMessage);
        h.append(", lastMessageMe=");
        h.append(this.lastMessageMe);
        h.append(", lastMessageOther=");
        h.append(this.lastMessageOther);
        h.append(", lastMessageDate=");
        h.append(this.lastMessageDate);
        h.append(", lastMessageMeDate=");
        h.append(this.lastMessageMeDate);
        h.append(", lastMessageOtherDate=");
        h.append(this.lastMessageOtherDate);
        h.append(", hasAttachments=");
        h.append(this.hasAttachments);
        h.append(", isCustomShop=");
        h.append(this.isCustomShop);
        h.append(", contextTypeId=");
        h.append(this.contextTypeId);
        h.append(", contextId=");
        h.append(this.contextId);
        h.append(", conversationContextAdapterFactory=");
        h.append(this.conversationContextAdapterFactory);
        h.append(", alert=");
        h.append(this.alert);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Conversation3(long r25, int r27, java.lang.String r28, boolean r29, com.etsy.android.lib.models.ConversationUser r30, long r31, java.lang.String r33, java.lang.String r34, java.lang.String r35, long r36, long r38, long r40, boolean r42, boolean r43, int r44, long r45, com.etsy.android.lib.models.conversation.context.ConversationContextAdapterFactory r47, com.etsy.android.lib.models.apiv3.Alert r48, int r49, kotlin.jvm.internal.DefaultConstructorMarker r50) {
        /*
            r24 = this;
            r0 = r49
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r4 = 0
            goto L_0x000b
        L_0x0009:
            r4 = r25
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r1 = 0
            goto L_0x0013
        L_0x0011:
            r1 = r27
        L_0x0013:
            r7 = r0 & 4
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x001b
            r7 = r8
            goto L_0x001d
        L_0x001b:
            r7 = r28
        L_0x001d:
            r9 = r0 & 8
            if (r9 == 0) goto L_0x0023
            r9 = 0
            goto L_0x0025
        L_0x0023:
            r9 = r29
        L_0x0025:
            r10 = r0 & 16
            if (r10 == 0) goto L_0x002b
            r10 = 0
            goto L_0x002d
        L_0x002b:
            r10 = r30
        L_0x002d:
            r12 = r0 & 32
            if (r12 == 0) goto L_0x0034
            r12 = 0
            goto L_0x0036
        L_0x0034:
            r12 = r31
        L_0x0036:
            r14 = r0 & 64
            if (r14 == 0) goto L_0x003c
            r14 = r8
            goto L_0x003e
        L_0x003c:
            r14 = r33
        L_0x003e:
            r15 = r0 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x0044
            r15 = r8
            goto L_0x0046
        L_0x0044:
            r15 = r34
        L_0x0046:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r8 = r35
        L_0x004d:
            r2 = r0 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0054
            r2 = 0
            goto L_0x0056
        L_0x0054:
            r2 = r36
        L_0x0056:
            r6 = r0 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L_0x005d
            r18 = 0
            goto L_0x005f
        L_0x005d:
            r18 = r38
        L_0x005f:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0066
            r20 = 0
            goto L_0x0068
        L_0x0066:
            r20 = r40
        L_0x0068:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L_0x006e
            r6 = 0
            goto L_0x0070
        L_0x006e:
            r6 = r42
        L_0x0070:
            r11 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x0076
            r11 = 0
            goto L_0x0078
        L_0x0076:
            r11 = r43
        L_0x0078:
            r50 = r11
            r11 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r11 == 0) goto L_0x0080
            r11 = -1
            goto L_0x0082
        L_0x0080:
            r11 = r44
        L_0x0082:
            r22 = 32768(0x8000, float:4.5918E-41)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x008c
            r16 = 0
            goto L_0x008e
        L_0x008c:
            r16 = r45
        L_0x008e:
            r22 = 65536(0x10000, float:9.18355E-41)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x0097
            r22 = 0
            goto L_0x0099
        L_0x0097:
            r22 = r47
        L_0x0099:
            r23 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r23
            if (r0 == 0) goto L_0x00a1
            r0 = 0
            goto L_0x00a3
        L_0x00a1:
            r0 = r48
        L_0x00a3:
            r25 = r24
            r26 = r4
            r28 = r1
            r29 = r7
            r30 = r9
            r31 = r10
            r32 = r12
            r34 = r14
            r35 = r15
            r36 = r8
            r37 = r2
            r39 = r18
            r41 = r20
            r43 = r6
            r44 = r50
            r45 = r11
            r46 = r16
            r48 = r22
            r49 = r0
            r25.<init>(r26, r28, r29, r30, r31, r32, r34, r35, r36, r37, r39, r41, r43, r44, r45, r46, r48, r49)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.Conversation3.<init>(long, int, java.lang.String, boolean, com.etsy.android.lib.models.ConversationUser, long, java.lang.String, java.lang.String, java.lang.String, long, long, long, boolean, boolean, int, long, com.etsy.android.lib.models.conversation.context.ConversationContextAdapterFactory, com.etsy.android.lib.models.apiv3.Alert, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
