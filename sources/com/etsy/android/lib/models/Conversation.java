package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.conversation.context.ConversationContext;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.TreeNode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

public class Conversation extends BaseFieldModel {
    public static final String TAG_SPAM = "system_tag.spam";
    public static final String TAG_TRASH = "system_tag.trash";
    public static final String TAG_UNREAD = "system_tag.unread";
    private static final int UNINITIALIZED_SENTINEL = -1;
    private static final long serialVersionUID = -4061701905045847446L;
    public EtsyId mContextId = new EtsyId();
    public int mContextTypeId = -1;
    public ConversationContext mConversationContext;
    public long mConversationId;
    public boolean mHasAttachments;
    public boolean mIsCustomShop;
    public boolean mIsRead;
    public String mLastMessage = "";
    public long mLastMessageDate;
    public String mLastMessageMe = "";
    public long mLastMessageMeDate;
    public String mLastMessageOther = "";
    public long mLastMessageOtherDate;
    public long mLastUpdateDate;
    public int mMessageCount;
    public ConversationUserModel mOtherUser;
    private TreeNode mRawConversationContext;
    public String mTitle = "";

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConversationTag {
    }

    public int getContextTypeId() {
        return this.mContextTypeId;
    }

    public ConversationContext getConversationContext() {
        return this.mConversationContext;
    }

    public long getConversationId() {
        return this.mConversationId;
    }

    public String getLastMessage() {
        return this.mLastMessage;
    }

    public long getLastUpdateDate() {
        return this.mLastUpdateDate;
    }

    public int getMessageCount() {
        return this.mMessageCount;
    }

    public ConversationUserModel getOtherUser() {
        return this.mOtherUser;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean hasAttachments() {
        return this.mHasAttachments;
    }

    public boolean isCustomShop() {
        return this.mIsCustomShop;
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean parseField(com.fasterxml.jackson.core.JsonParser r7, java.lang.String r8) throws java.io.IOException {
        /*
            r6 = this;
            r8.getClass()
            int r0 = r8.hashCode()
            r1 = 1
            r2 = -1
            r3 = 0
            switch(r0) {
                case -1229303081: goto L_0x00d9;
                case -642213653: goto L_0x00cd;
                case -419323305: goto L_0x00c1;
                case -370629237: goto L_0x00b5;
                case -182186086: goto L_0x00a9;
                case 110371416: goto L_0x009d;
                case 273787307: goto L_0x0091;
                case 630982164: goto L_0x0085;
                case 764684593: goto L_0x0078;
                case 938016510: goto L_0x006b;
                case 951530927: goto L_0x005e;
                case 969704303: goto L_0x0051;
                case 1528054622: goto L_0x0044;
                case 1810812911: goto L_0x0037;
                case 1899011504: goto L_0x002a;
                case 2024324142: goto L_0x001d;
                case 2082189195: goto L_0x0010;
                default: goto L_0x000d;
            }
        L_0x000d:
            r8 = r2
            goto L_0x00e4
        L_0x0010:
            java.lang.String r0 = "is_read"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0019
            goto L_0x000d
        L_0x0019:
            r8 = 16
            goto L_0x00e4
        L_0x001d:
            java.lang.String r0 = "last_updated_tsz"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0026
            goto L_0x000d
        L_0x0026:
            r8 = 15
            goto L_0x00e4
        L_0x002a:
            java.lang.String r0 = "context_type_id"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0033
            goto L_0x000d
        L_0x0033:
            r8 = 14
            goto L_0x00e4
        L_0x0037:
            java.lang.String r0 = "last_message_date"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0040
            goto L_0x000d
        L_0x0040:
            r8 = 13
            goto L_0x00e4
        L_0x0044:
            java.lang.String r0 = "last_message"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x004d
            goto L_0x000d
        L_0x004d:
            r8 = 12
            goto L_0x00e4
        L_0x0051:
            java.lang.String r0 = "is_custom_shop"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005a
            goto L_0x000d
        L_0x005a:
            r8 = 11
            goto L_0x00e4
        L_0x005e:
            java.lang.String r0 = "context"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0067
            goto L_0x000d
        L_0x0067:
            r8 = 10
            goto L_0x00e4
        L_0x006b:
            java.lang.String r0 = "last_message_other_date"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0074
            goto L_0x000d
        L_0x0074:
            r8 = 9
            goto L_0x00e4
        L_0x0078:
            java.lang.String r0 = "last_other_message_excerpt"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0081
            goto L_0x000d
        L_0x0081:
            r8 = 8
            goto L_0x00e4
        L_0x0085:
            java.lang.String r0 = "last_message_me_date"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x008f
            goto L_0x000d
        L_0x008f:
            r8 = 7
            goto L_0x00e4
        L_0x0091:
            java.lang.String r0 = "context_id"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x009b
            goto L_0x000d
        L_0x009b:
            r8 = 6
            goto L_0x00e4
        L_0x009d:
            java.lang.String r0 = "title"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00a7
            goto L_0x000d
        L_0x00a7:
            r8 = 5
            goto L_0x00e4
        L_0x00a9:
            java.lang.String r0 = "other_user"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00b3
            goto L_0x000d
        L_0x00b3:
            r8 = 4
            goto L_0x00e4
        L_0x00b5:
            java.lang.String r0 = "has_attachments"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00bf
            goto L_0x000d
        L_0x00bf:
            r8 = 3
            goto L_0x00e4
        L_0x00c1:
            java.lang.String r0 = "conversation_id"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00cb
            goto L_0x000d
        L_0x00cb:
            r8 = 2
            goto L_0x00e4
        L_0x00cd:
            java.lang.String r0 = "last_me_message_excerpt"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00d7
            goto L_0x000d
        L_0x00d7:
            r8 = r1
            goto L_0x00e4
        L_0x00d9:
            java.lang.String r0 = "message_count"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x00e3
            goto L_0x000d
        L_0x00e3:
            r8 = r3
        L_0x00e4:
            r4 = 1000(0x3e8, double:4.94E-321)
            switch(r8) {
                case 0: goto L_0x01b9;
                case 1: goto L_0x01b2;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01a4;
                case 4: goto L_0x0199;
                case 5: goto L_0x0192;
                case 6: goto L_0x0188;
                case 7: goto L_0x0180;
                case 8: goto L_0x0179;
                case 9: goto L_0x0171;
                case 10: goto L_0x0145;
                case 11: goto L_0x013d;
                case 12: goto L_0x0135;
                case 13: goto L_0x012c;
                case 14: goto L_0x00fb;
                case 15: goto L_0x00f2;
                case 16: goto L_0x00ea;
                default: goto L_0x00e9;
            }
        L_0x00e9:
            return r3
        L_0x00ea:
            boolean r7 = r7.getValueAsBoolean()
            r6.mIsRead = r7
            goto L_0x01bf
        L_0x00f2:
            long r7 = r7.getValueAsLong()
            long r7 = r7 * r4
            r6.mLastUpdateDate = r7
            goto L_0x01bf
        L_0x00fb:
            int r7 = r7.getValueAsInt()
            r6.mContextTypeId = r7
            com.fasterxml.jackson.core.TreeNode r8 = r6.mRawConversationContext
            if (r8 == 0) goto L_0x012b
            boolean r7 = com.etsy.android.lib.models.conversation.context.ConversationContext.isSupportedContextTypeId(r7)
            if (r7 == 0) goto L_0x012b
            com.fasterxml.jackson.core.TreeNode r7 = r6.mRawConversationContext
            com.fasterxml.jackson.core.JsonParser r7 = r7.traverse()
            com.fasterxml.jackson.core.JsonToken r8 = r7.nextToken()
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r8 != r0) goto L_0x012b
            int r8 = r6.mContextTypeId
            java.lang.Class r8 = com.etsy.android.lib.models.conversation.context.ConversationContext.getClassForContextTypeId(r8)
            if (r8 == 0) goto L_0x012b
            java.lang.Object r7 = com.etsy.android.lib.models.BaseModel.parseObject(r7, r8)
            com.etsy.android.lib.models.conversation.context.ConversationContext r7 = (com.etsy.android.lib.models.conversation.context.ConversationContext) r7
            r6.mConversationContext = r7
            goto L_0x01bf
        L_0x012b:
            return r3
        L_0x012c:
            long r7 = r7.getValueAsLong()
            long r7 = r7 * r4
            r6.mLastMessageDate = r7
            goto L_0x01bf
        L_0x0135:
            java.lang.String r7 = com.etsy.android.lib.models.BaseModel.parseString(r7)
            r6.mLastMessage = r7
            goto L_0x01bf
        L_0x013d:
            boolean r7 = r7.getValueAsBoolean()
            r6.mIsCustomShop = r7
            goto L_0x01bf
        L_0x0145:
            int r8 = r6.mContextTypeId
            if (r8 == r2) goto L_0x0161
            boolean r8 = com.etsy.android.lib.models.conversation.context.ConversationContext.isSupportedContextTypeId(r8)
            if (r8 == 0) goto L_0x0161
            int r8 = r6.mContextTypeId
            java.lang.Class r8 = com.etsy.android.lib.models.conversation.context.ConversationContext.getClassForContextTypeId(r8)
            if (r8 == 0) goto L_0x0160
            java.lang.Object r7 = com.etsy.android.lib.models.BaseModel.parseObject(r7, r8)
            com.etsy.android.lib.models.conversation.context.ConversationContext r7 = (com.etsy.android.lib.models.conversation.context.ConversationContext) r7
            r6.mConversationContext = r7
            goto L_0x01bf
        L_0x0160:
            return r3
        L_0x0161:
            int r8 = r6.mContextTypeId
            if (r8 != r2) goto L_0x0170
            com.fasterxml.jackson.core.ObjectCodec r8 = r7.getCodec()
            com.fasterxml.jackson.core.TreeNode r7 = r8.readTree(r7)
            r6.mRawConversationContext = r7
            goto L_0x01bf
        L_0x0170:
            return r3
        L_0x0171:
            long r7 = r7.getValueAsLong()
            long r7 = r7 * r4
            r6.mLastMessageOtherDate = r7
            goto L_0x01bf
        L_0x0179:
            java.lang.String r7 = com.etsy.android.lib.models.BaseModel.parseString(r7)
            r6.mLastMessageOther = r7
            goto L_0x01bf
        L_0x0180:
            long r7 = r7.getValueAsLong()
            long r7 = r7 * r4
            r6.mLastMessageMeDate = r7
            goto L_0x01bf
        L_0x0188:
            com.etsy.android.lib.models.datatypes.EtsyId r8 = r6.mContextId
            java.lang.String r7 = com.etsy.android.lib.models.BaseModel.parseStringIdOrNumericValue(r7)
            r8.setId(r7)
            goto L_0x01bf
        L_0x0192:
            java.lang.String r7 = com.etsy.android.lib.models.BaseModel.parseString(r7)
            r6.mTitle = r7
            goto L_0x01bf
        L_0x0199:
            java.lang.Class<com.etsy.android.lib.models.ConversationUserModel> r8 = com.etsy.android.lib.models.ConversationUserModel.class
            java.lang.Object r7 = com.etsy.android.lib.models.BaseModel.parseObject(r7, r8)
            com.etsy.android.lib.models.ConversationUserModel r7 = (com.etsy.android.lib.models.ConversationUserModel) r7
            r6.mOtherUser = r7
            goto L_0x01bf
        L_0x01a4:
            boolean r7 = r7.getValueAsBoolean()
            r6.mHasAttachments = r7
            goto L_0x01bf
        L_0x01ab:
            long r7 = r7.getValueAsLong()
            r6.mConversationId = r7
            goto L_0x01bf
        L_0x01b2:
            java.lang.String r7 = com.etsy.android.lib.models.BaseModel.parseString(r7)
            r6.mLastMessageMe = r7
            goto L_0x01bf
        L_0x01b9:
            int r7 = r7.getValueAsInt()
            r6.mMessageCount = r7
        L_0x01bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.Conversation.parseField(com.fasterxml.jackson.core.JsonParser, java.lang.String):boolean");
    }

    public void setContextTypeId(int i) {
        this.mContextTypeId = i;
    }

    public void setConversationContext(ConversationContext conversationContext) {
        this.mConversationContext = conversationContext;
    }

    public void setConversationId(long j) {
        this.mConversationId = j;
    }

    public void setIsRead(Boolean bool) {
        this.mIsRead = bool.booleanValue();
    }

    public void setLastMessage(String str) {
        this.mLastMessage = str;
    }

    public void setLastUpdateDate(long j) {
        this.mLastUpdateDate = j;
    }

    public void setMessageCount(int i) {
        this.mMessageCount = i;
    }

    public void setOtherUser(ConversationUserModel conversationUserModel) {
        this.mOtherUser = conversationUserModel;
    }

    public void setRead(boolean z) {
        this.mIsRead = z;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.CONVERSATION_ID, Long.valueOf(this.mConversationId));
        return hashMap;
    }
}
