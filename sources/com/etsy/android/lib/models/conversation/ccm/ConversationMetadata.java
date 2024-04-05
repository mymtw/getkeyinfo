package com.etsy.android.lib.models.conversation.ccm;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ConversationUser;
import com.etsy.android.lib.models.apiv3.Alert;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class ConversationMetadata {
    public static final int $stable = 8;
    private final long _lastUpdateDate;
    private final Alert alert;
    private final long conversationId;
    private final boolean hasAttachments;
    private final String lastMessage;
    private final transient long lastUpdateDateInMillis;
    private final int messageCount;
    private final ConversationUser otherUser;
    private boolean read;

    public ConversationMetadata() {
        this(0, 0, false, (ConversationUser) null, 0, (String) null, false, (Alert) null, 255, (DefaultConstructorMarker) null);
    }

    public ConversationMetadata(@C17402n(name = "messenger_conversation_id") long j, @C17402n(name = "message_count") int i, @C17402n(name = "is_read") boolean z, @C17402n(name = "other_user") ConversationUser conversationUser, @C17402n(name = "last_message_date") long j2, @C17402n(name = "last_message_excerpt") String str, @C17402n(name = "has_attachments") boolean z2, @C17402n(name = "alert") Alert alert2) {
        C19383o.m32797g(str, "lastMessage");
        this.conversationId = j;
        this.messageCount = i;
        this.read = z;
        this.otherUser = conversationUser;
        this._lastUpdateDate = j2;
        this.lastMessage = str;
        this.hasAttachments = z2;
        this.alert = alert2;
        this.lastUpdateDateInMillis = j2 * ((long) 1000);
    }

    public static /* synthetic */ ConversationMetadata copy$default(ConversationMetadata conversationMetadata, long j, int i, boolean z, ConversationUser conversationUser, long j2, String str, boolean z2, Alert alert2, int i2, Object obj) {
        ConversationMetadata conversationMetadata2 = conversationMetadata;
        int i3 = i2;
        return conversationMetadata.copy((i3 & 1) != 0 ? conversationMetadata2.conversationId : j, (i3 & 2) != 0 ? conversationMetadata2.messageCount : i, (i3 & 4) != 0 ? conversationMetadata2.read : z, (i3 & 8) != 0 ? conversationMetadata2.otherUser : conversationUser, (i3 & 16) != 0 ? conversationMetadata2._lastUpdateDate : j2, (i3 & 32) != 0 ? conversationMetadata2.lastMessage : str, (i3 & 64) != 0 ? conversationMetadata2.hasAttachments : z2, (i3 & 128) != 0 ? conversationMetadata2.alert : alert2);
    }

    public final long component1() {
        return this.conversationId;
    }

    public final int component2() {
        return this.messageCount;
    }

    public final boolean component3() {
        return this.read;
    }

    public final ConversationUser component4() {
        return this.otherUser;
    }

    public final long component5() {
        return this._lastUpdateDate;
    }

    public final String component6() {
        return this.lastMessage;
    }

    public final boolean component7() {
        return this.hasAttachments;
    }

    public final Alert component8() {
        return this.alert;
    }

    public final ConversationMetadata copy(@C17402n(name = "messenger_conversation_id") long j, @C17402n(name = "message_count") int i, @C17402n(name = "is_read") boolean z, @C17402n(name = "other_user") ConversationUser conversationUser, @C17402n(name = "last_message_date") long j2, @C17402n(name = "last_message_excerpt") String str, @C17402n(name = "has_attachments") boolean z2, @C17402n(name = "alert") Alert alert2) {
        String str2 = str;
        C19383o.m32797g(str2, "lastMessage");
        return new ConversationMetadata(j, i, z, conversationUser, j2, str2, z2, alert2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationMetadata)) {
            return false;
        }
        ConversationMetadata conversationMetadata = (ConversationMetadata) obj;
        return this.conversationId == conversationMetadata.conversationId && this.messageCount == conversationMetadata.messageCount && this.read == conversationMetadata.read && C19383o.m32792b(this.otherUser, conversationMetadata.otherUser) && this._lastUpdateDate == conversationMetadata._lastUpdateDate && C19383o.m32792b(this.lastMessage, conversationMetadata.lastMessage) && this.hasAttachments == conversationMetadata.hasAttachments && C19383o.m32792b(this.alert, conversationMetadata.alert);
    }

    public final Alert getAlert() {
        return this.alert;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    public final boolean getHasAttachments() {
        return this.hasAttachments;
    }

    public final String getLastMessage() {
        return this.lastMessage;
    }

    public final long getLastUpdateDateInMillis() {
        return this.lastUpdateDateInMillis;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final ConversationUser getOtherUser() {
        return this.otherUser;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final long get_lastUpdateDate() {
        return this._lastUpdateDate;
    }

    public int hashCode() {
        int a = C0069a.m170a(this.messageCount, Long.hashCode(this.conversationId) * 31, 31);
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        ConversationUser conversationUser = this.otherUser;
        int i2 = 0;
        int e = C0023f.m105e(this.lastMessage, C0071c.m190b(this._lastUpdateDate, (i + (conversationUser == null ? 0 : conversationUser.hashCode())) * 31, 31), 31);
        boolean z3 = this.hasAttachments;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (e + (z2 ? 1 : 0)) * 31;
        Alert alert2 = this.alert;
        if (alert2 != null) {
            i2 = alert2.hashCode();
        }
        return i3 + i2;
    }

    public final void setRead(boolean z) {
        this.read = z;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ConversationMetadata(conversationId=");
        h.append(this.conversationId);
        h.append(", messageCount=");
        h.append(this.messageCount);
        h.append(", read=");
        h.append(this.read);
        h.append(", otherUser=");
        h.append(this.otherUser);
        h.append(", _lastUpdateDate=");
        h.append(this._lastUpdateDate);
        h.append(", lastMessage=");
        h.append(this.lastMessage);
        h.append(", hasAttachments=");
        h.append(this.hasAttachments);
        h.append(", alert=");
        h.append(this.alert);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConversationMetadata(long r13, int r15, boolean r16, com.etsy.android.lib.models.ConversationUser r17, long r18, java.lang.String r20, boolean r21, com.etsy.android.lib.models.apiv3.Alert r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r12 = this;
            r0 = r23
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000b
        L_0x000a:
            r4 = r13
        L_0x000b:
            r1 = r0 & 2
            r6 = 0
            if (r1 == 0) goto L_0x0012
            r1 = r6
            goto L_0x0013
        L_0x0012:
            r1 = r15
        L_0x0013:
            r7 = r0 & 4
            if (r7 == 0) goto L_0x0019
            r7 = r6
            goto L_0x001b
        L_0x0019:
            r7 = r16
        L_0x001b:
            r8 = r0 & 8
            r9 = 0
            if (r8 == 0) goto L_0x0022
            r8 = r9
            goto L_0x0024
        L_0x0022:
            r8 = r17
        L_0x0024:
            r10 = r0 & 16
            if (r10 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r2 = r18
        L_0x002b:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0032
            java.lang.String r10 = ""
            goto L_0x0034
        L_0x0032:
            r10 = r20
        L_0x0034:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r6 = r21
        L_0x003b:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r13 = r12
            r14 = r4
            r16 = r1
            r17 = r7
            r18 = r8
            r19 = r2
            r21 = r10
            r22 = r6
            r23 = r9
            r13.<init>(r14, r16, r17, r18, r19, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.conversation.ccm.ConversationMetadata.<init>(long, int, boolean, com.etsy.android.lib.models.ConversationUser, long, java.lang.String, boolean, com.etsy.android.lib.models.apiv3.Alert, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
