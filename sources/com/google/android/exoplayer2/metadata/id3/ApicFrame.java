package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import java.util.Arrays;
import p003a2.C0015b;
import p513bj.C14049b0;
import p594jh.C17963p0;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C14257a();

    /* renamed from: ID */
    public static final String f31704ID = "APIC";
    public final String description;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ApicFrame$a */
    public class C14257a implements Parcelable.Creator<ApicFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(f31704ID);
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i;
        this.pictureData = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.pictureType == apicFrame.pictureType && C14049b0.m21628a(this.mimeType, apicFrame.mimeType) && C14049b0.m21628a(this.description, apicFrame.description) && Arrays.equals(this.pictureData, apicFrame.pictureData);
    }

    public int hashCode() {
        int i = (527 + this.pictureType) * 31;
        String str = this.mimeType;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.pictureData) + ((hashCode + i2) * 31);
    }

    public void populateMediaMetadata(C17963p0.C17964a aVar) {
        byte[] bArr;
        byte[] bArr2 = this.pictureData;
        if (bArr2 == null) {
            bArr = null;
        } else {
            aVar.getClass();
            bArr = (byte[]) bArr2.clone();
        }
        aVar.f39223i = bArr;
    }

    public String toString() {
        String str = this.f31709id;
        String str2 = this.mimeType;
        String str3 = this.description;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 25))), str, ": mimeType=", str2, ", description=");
        k.append(str3);
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.pictureType);
        parcel.writeByteArray(this.pictureData);
    }

    public ApicFrame(Parcel parcel) {
        super(f31704ID);
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.mimeType = readString;
        this.description = parcel.readString();
        this.pictureType = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }
}
