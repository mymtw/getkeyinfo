package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import java.util.Arrays;
import p504ai.C13983i;
import p513bj.C14049b0;

public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C14265a();

    /* renamed from: ID */
    public static final String f31712ID = "PRIV";
    public final String owner;
    public final byte[] privateData;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.PrivFrame$a */
    public class C14265a implements Parcelable.Creator<PrivFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super(f31712ID);
        this.owner = str;
        this.privateData = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return C14049b0.m21628a(this.owner, privFrame.owner) && Arrays.equals(this.privateData, privFrame.privateData);
    }

    public int hashCode() {
        String str = this.owner;
        return Arrays.hashCode(this.privateData) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.f31709id;
        String str2 = this.owner;
        return C13983i.m21492k(C0391c.m1055a(str2, C0391c.m1055a(str, 8)), str, ": owner=", str2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.owner);
        parcel.writeByteArray(this.privateData);
    }

    public PrivFrame(Parcel parcel) {
        super(f31712ID);
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.owner = readString;
        this.privateData = parcel.createByteArray();
    }
}
