package com.etsy.android.lib.conversation;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.datatypes.UntrackedObject;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MessageDraft extends UntrackedObject implements Parcelable {
    public static Parcelable.Creator<MessageDraft> CREATOR = new C8624a();
    public static final String IMAGE_DELIMITER = ":";
    public long mConversationId = 0;
    public int mCursorEndPosition = 0;
    public int mCursorStartPosition = 0;
    public EtsyId mGuestUserId;
    public List<File> mImages = new ArrayList(3);
    public String mMessage = "";
    public Status mStatus = Status.IN_DRAFT;
    public String mSubject = "";
    public String mUserName = "";

    public enum Status {
        IN_DRAFT(R.string.convo_status_draft),
        SENDING(R.string.convo_status_sending),
        FAILED(R.string.convo_status_failed);
        
        public int mResId;

        private Status(int i) {
            this.mResId = i;
        }

        public int getResId() {
            return this.mResId;
        }
    }

    /* renamed from: com.etsy.android.lib.conversation.MessageDraft$a */
    public class C8624a implements Parcelable.Creator<MessageDraft> {
        public final Object createFromParcel(Parcel parcel) {
            return new MessageDraft(parcel);
        }

        public final Object[] newArray(int i) {
            return new MessageDraft[i];
        }
    }

    public MessageDraft() {
    }

    private String[] writeImagesToStringArray() {
        List<File> list = this.mImages;
        if (list == null) {
            return null;
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = this.mImages.get(i).getAbsolutePath();
        }
        return strArr;
    }

    public MessageDraft conversationId(long j) {
        this.mConversationId = j;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public long getConversationId() {
        return this.mConversationId;
    }

    public int getCursorEndPosition() {
        return this.mCursorEndPosition;
    }

    public int getCursorStartPosition() {
        return this.mCursorStartPosition;
    }

    public EtsyId getGuestUserId() {
        return this.mGuestUserId;
    }

    public List<File> getImages() {
        return this.mImages;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public String getSubject() {
        return this.mSubject;
    }

    public String getUserName() {
        return this.mUserName;
    }

    public MessageDraft guestUserId(EtsyId etsyId) {
        this.mGuestUserId = etsyId;
        return this;
    }

    public String imagePathsAsString() {
        StringBuilder sb = new StringBuilder();
        if (this.mImages != null) {
            for (int i = 0; i < this.mImages.size(); i++) {
                if (i != 0) {
                    sb.append(IMAGE_DELIMITER);
                }
                sb.append(this.mImages.get(i).getAbsolutePath());
            }
        }
        return sb.toString();
    }

    public MessageDraft images(List<File> list) {
        this.mImages = list;
        return this;
    }

    public void imagesFromStrings(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    this.mImages.add(new File(str));
                }
            }
        }
    }

    public boolean isFailed() {
        return this.mStatus == Status.FAILED;
    }

    public boolean isInDraft() {
        return this.mStatus == Status.IN_DRAFT;
    }

    public boolean isSending() {
        return this.mStatus == Status.SENDING;
    }

    public MessageDraft message(String str) {
        this.mMessage = str;
        return this;
    }

    public void parseImageString(String str) {
        imagesFromStrings(str.split(IMAGE_DELIMITER, 3));
    }

    public MessageDraft saveCursorPosition(int i, int i2) {
        this.mCursorStartPosition = i;
        this.mCursorEndPosition = i2;
        return this;
    }

    public void setStatus(Status status) {
        this.mStatus = status;
    }

    public MessageDraft subject(String str) {
        this.mSubject = str;
        return this;
    }

    public MessageDraft userName(String str) {
        this.mUserName = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mConversationId);
        parcel.writeString(this.mMessage);
        parcel.writeString(this.mSubject);
        parcel.writeString(this.mUserName);
        parcel.writeInt(this.mCursorStartPosition);
        parcel.writeInt(this.mCursorEndPosition);
        parcel.writeString(this.mGuestUserId.getId());
        parcel.writeStringArray(writeImagesToStringArray());
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.CONVERSATION_ID, Long.valueOf(this.mConversationId));
        return hashMap;
    }

    public MessageDraft(Parcel parcel) {
        this.mConversationId = parcel.readLong();
        this.mMessage = parcel.readString();
        this.mSubject = parcel.readString();
        this.mUserName = parcel.readString();
        this.mCursorStartPosition = parcel.readInt();
        this.mCursorEndPosition = parcel.readInt();
        EtsyId etsyId = new EtsyId();
        this.mGuestUserId = etsyId;
        etsyId.setId(parcel.readString());
        imagesFromStrings(parcel.createStringArray());
    }
}
