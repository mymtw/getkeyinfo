package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;

@Deprecated
public class LikeContent implements ShareModel {
    @Deprecated
    public static final Parcelable.Creator<LikeContent> CREATOR = new C12343a();
    private final String objectId;
    private final String objectType;

    /* renamed from: com.facebook.share.internal.LikeContent$a */
    public static class C12343a implements Parcelable.Creator<LikeContent> {
        public final Object createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new LikeContent[i];
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.LikeContent$b */
    public static class C12344b {
    }

    public /* synthetic */ LikeContent(C12344b bVar, C12343a aVar) {
        this(bVar);
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public String getObjectId() {
        return this.objectId;
    }

    @Deprecated
    public String getObjectType() {
        return this.objectType;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.objectId);
        parcel.writeString(this.objectType);
    }

    private LikeContent(C12344b bVar) {
        throw null;
    }

    @Deprecated
    public LikeContent(Parcel parcel) {
        this.objectId = parcel.readString();
        this.objectType = parcel.readString();
    }
}
