package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p594jh.C17963p0;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C14256a();
    public final byte[] rawMetadata;
    public final String title;
    public final String url;

    /* renamed from: com.google.android.exoplayer2.metadata.icy.IcyInfo$a */
    public class C14256a implements Parcelable.Creator<IcyInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.rawMetadata, ((IcyInfo) obj).rawMetadata);
    }

    public int hashCode() {
        return Arrays.hashCode(this.rawMetadata);
    }

    public void populateMediaMetadata(C17963p0.C17964a aVar) {
        String str = this.title;
        if (str != null) {
            aVar.f39215a = str;
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", new Object[]{this.title, this.url, Integer.valueOf(this.rawMetadata.length)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.rawMetadata);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }

    public IcyInfo(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.rawMetadata = createByteArray;
        this.title = parcel.readString();
        this.url = parcel.readString();
    }
}
