package com.etsy.android.lib.models.conversation;

import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Conversation;
import com.etsy.android.lib.models.ConversationMessage;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.List;

public class ConversationThread extends BaseFieldModel {
    private static final long serialVersionUID = -5525766615581334362L;
    public Conversation mConversation;
    public List<ConversationMessage> mMessages;

    public static class InteractionState {
        public boolean mDraftInProgress;
        public boolean mPhotoLoading;
        public boolean mSending;

        public boolean isDraftInProgress() {
            return this.mDraftInProgress;
        }

        public boolean isPhotoLoading() {
            return this.mPhotoLoading;
        }

        public boolean isSending() {
            return this.mSending;
        }

        public void setDraftInProgress(boolean z) {
            this.mDraftInProgress = z;
        }

        public void setSending(boolean z) {
            this.mSending = z;
        }
    }

    public Conversation getConversation() {
        return this.mConversation;
    }

    public List<ConversationMessage> getMessages() {
        return this.mMessages;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        if (str.equals(ResponseConstants.MESSAGES)) {
            this.mMessages = BaseModel.parseArray(jsonParser, ConversationMessage.class);
            return true;
        } else if (!str.equals(ResponseConstants.CONVO)) {
            return false;
        } else {
            this.mConversation = (Conversation) BaseModel.parseObject(jsonParser, Conversation.class);
            return true;
        }
    }
}
