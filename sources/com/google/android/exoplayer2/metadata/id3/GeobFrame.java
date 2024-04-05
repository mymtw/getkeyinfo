package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0070b;
import androidx.compose.animation.C0391c;
import java.util.Arrays;
import p003a2.C0015b;
import p513bj.C14049b0;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C14262a();

    /* renamed from: ID */
    public static final String f31708ID = "GEOB";
    public final byte[] data;
    public final String description;
    public final String filename;
    public final String mimeType;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.GeobFrame$a */
    public class C14262a implements Parcelable.Creator<GeobFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(f31708ID);
        this.mimeType = str;
        this.filename = str2;
        this.description = str3;
        this.data = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return C14049b0.m21628a(this.mimeType, geobFrame.mimeType) && C14049b0.m21628a(this.filename, geobFrame.filename) && C14049b0.m21628a(this.description, geobFrame.description) && Arrays.equals(this.data, geobFrame.data);
    }

    public int hashCode() {
        String str = this.mimeType;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.filename;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Arrays.hashCode(this.data) + ((hashCode2 + i) * 31);
    }

    public String toString() {
        String str = this.f31709id;
        String str2 = this.mimeType;
        String str3 = this.filename;
        String str4 = this.description;
        return C0070b.m184f(C0015b.m92k(C0391c.m1055a(str4, C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 36)))), str, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.filename);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.data);
    }

    public GeobFrame(Parcel parcel) {
        super(f31708ID);
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.mimeType = readString;
        this.filename = parcel.readString();
        this.description = parcel.readString();
        this.data = parcel.createByteArray();
    }
}
