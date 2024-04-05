package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p003a2.C0023f;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C14258a();
    public final byte[] data;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.BinaryFrame$a */
    public class C14258a implements Parcelable.Creator<BinaryFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f31709id.equals(binaryFrame.f31709id) && Arrays.equals(this.data, binaryFrame.data);
    }

    public int hashCode() {
        return Arrays.hashCode(this.data) + C0023f.m105e(this.f31709id, 527, 31);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31709id);
        parcel.writeByteArray(this.data);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BinaryFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p513bj.C14049b0.f30913a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.data = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.BinaryFrame.<init>(android.os.Parcel):void");
    }
}
