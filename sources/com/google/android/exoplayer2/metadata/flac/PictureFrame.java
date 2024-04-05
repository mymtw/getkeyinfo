package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p003a2.C0023f;
import p513bj.C14049b0;

public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C14253a();
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    /* renamed from: com.google.android.exoplayer2.metadata.flac.PictureFrame$a */
    public class C14253a implements Parcelable.Creator<PictureFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.pictureType = i;
        this.mimeType = str;
        this.description = str2;
        this.width = i2;
        this.height = i3;
        this.depth = i4;
        this.colors = i5;
        this.pictureData = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData);
    }

    public int hashCode() {
        int e = C0023f.m105e(this.mimeType, (this.pictureType + 527) * 31, 31);
        return Arrays.hashCode(this.pictureData) + ((((((((C0023f.m105e(this.description, e, 31) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    public String toString() {
        String str = this.mimeType;
        String str2 = this.description;
        StringBuilder sb = new StringBuilder(C0391c.m1055a(str2, C0391c.m1055a(str, 32)));
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.pictureType);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.depth);
        parcel.writeInt(this.colors);
        parcel.writeByteArray(this.pictureData);
    }

    public PictureFrame(Parcel parcel) {
        this.pictureType = parcel.readInt();
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.mimeType = readString;
        this.description = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }
}
