package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import p003a2.C0015b;
import p513bj.C14049b0;

public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C14263a();

    /* renamed from: ID */
    public static final String f31710ID = "----";
    public final String description;
    public final String domain;
    public final String text;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.InternalFrame$a */
    public class C14263a implements Parcelable.Creator<InternalFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super(f31710ID);
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return C14049b0.m21628a(this.description, internalFrame.description) && C14049b0.m21628a(this.domain, internalFrame.domain) && C14049b0.m21628a(this.text, internalFrame.text);
    }

    public int hashCode() {
        String str = this.domain;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f31709id;
        String str2 = this.domain;
        String str3 = this.description;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 23))), str, ": domain=", str2, ", description=");
        k.append(str3);
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31709id);
        parcel.writeString(this.domain);
        parcel.writeString(this.text);
    }

    public InternalFrame(Parcel parcel) {
        super(f31710ID);
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.domain = readString;
        this.description = parcel.readString();
        this.text = parcel.readString();
    }
}
