package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new C12380a();
    private final String description;
    private final String name;
    private AppGroupPrivacy privacy;

    public enum AppGroupPrivacy {
        Open,
        Closed
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    public static class C12380a implements Parcelable.Creator<AppGroupCreationContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$b */
    public static class C12381b {
    }

    public /* synthetic */ AppGroupCreationContent(C12381b bVar, C12380a aVar) {
        this(bVar);
    }

    public int describeContents() {
        return 0;
    }

    public AppGroupPrivacy getAppGroupPrivacy() {
        return this.privacy;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeSerializable(this.privacy);
    }

    private AppGroupCreationContent(C12381b bVar) {
        throw null;
    }

    public AppGroupCreationContent(Parcel parcel) {
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.privacy = (AppGroupPrivacy) parcel.readSerializable();
    }
}
