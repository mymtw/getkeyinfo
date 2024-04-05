package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p003a2.C0023f;
import p513bj.C14049b0;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C14268a();
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    /* renamed from: com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry$a */
    public class C14268a implements Parcelable.Creator<MdtaMetadataEntry> {
        public final Object createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, (C14268a) null);
        }

        public final Object[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, C14268a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.value) + C0023f.m105e(this.key, 527, 31)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    public String toString() {
        String valueOf = String.valueOf(this.key);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeByteArray(this.value);
        parcel.writeInt(this.localeIndicator);
        parcel.writeInt(this.typeIndicator);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.key = readString;
        this.value = parcel.createByteArray();
        this.localeIndicator = parcel.readInt();
        this.typeIndicator = parcel.readInt();
    }
}
