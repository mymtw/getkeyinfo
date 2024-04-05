package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p513bj.C14049b0;

public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new C14437a();
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;

    /* renamed from: com.google.android.exoplayer2.video.ColorInfo$a */
    public class C14437a implements Parcelable.Creator<ColorInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new ColorInfo[i];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.colorSpace = i;
        this.colorRange = i2;
        this.colorTransfer = i3;
        this.hdrStaticInfo = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.hdrStaticInfo) + ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31);
        }
        return this.hashCode;
    }

    public String toString() {
        int i = this.colorSpace;
        int i2 = this.colorRange;
        int i3 = this.colorTransfer;
        boolean z = this.hdrStaticInfo != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorRange);
        parcel.writeInt(this.colorTransfer);
        int i2 = this.hdrStaticInfo != null ? 1 : 0;
        int i3 = C14049b0.f30913a;
        parcel.writeInt(i2);
        byte[] bArr = this.hdrStaticInfo;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorRange = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        int i = C14049b0.f30913a;
        this.hdrStaticInfo = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
