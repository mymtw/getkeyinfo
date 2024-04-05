package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new C12386a();
    private final ActionType actionType;
    private final String cta;
    private final String data;
    private final Filters filters;
    private final String message;
    private final String objectId;
    private final List<String> recipients;
    private final List<String> suggestions;
    private final String title;

    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$a */
    public static class C12386a implements Parcelable.Creator<GameRequestContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new GameRequestContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.GameRequestContent$b */
    public static class C12387b {
    }

    public /* synthetic */ GameRequestContent(C12387b bVar, C12386a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public ActionType getActionType() {
        return this.actionType;
    }

    public String getCta() {
        return this.cta;
    }

    public String getData() {
        return this.data;
    }

    public Filters getFilters() {
        return this.filters;
    }

    public String getMessage() {
        return this.message;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public List<String> getRecipients() {
        return this.recipients;
    }

    public List<String> getSuggestions() {
        return this.suggestions;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTo() {
        if (getRecipients() != null) {
            return TextUtils.join(",", getRecipients());
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.message);
        parcel.writeString(this.cta);
        parcel.writeStringList(this.recipients);
        parcel.writeString(this.title);
        parcel.writeString(this.data);
        parcel.writeSerializable(this.actionType);
        parcel.writeString(this.objectId);
        parcel.writeSerializable(this.filters);
        parcel.writeStringList(this.suggestions);
    }

    private GameRequestContent(C12387b bVar) {
        throw null;
    }

    public GameRequestContent(Parcel parcel) {
        this.message = parcel.readString();
        this.cta = parcel.readString();
        this.recipients = parcel.createStringArrayList();
        this.title = parcel.readString();
        this.data = parcel.readString();
        this.actionType = (ActionType) parcel.readSerializable();
        this.objectId = parcel.readString();
        this.filters = (Filters) parcel.readSerializable();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.suggestions = createStringArrayList;
        parcel.readStringList(createStringArrayList);
    }
}
