package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.metadata.Metadata;
import p003a2.C0023f;
import p513bj.C14049b0;

public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C14254a();
    public final String key;
    public final String value;

    /* renamed from: com.google.android.exoplayer2.metadata.flac.VorbisComment$a */
    public class C14254a implements Parcelable.Creator<VorbisComment> {
        public final Object createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        public final Object[] newArray(int i) {
            return new VorbisComment[i];
        }
    }

    public VorbisComment(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VorbisComment.class != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value);
    }

    public int hashCode() {
        return this.value.hashCode() + C0023f.m105e(this.key, 527, 31);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        StringBuilder sb = new StringBuilder(C0391c.m1055a(str2, C0391c.m1055a(str, 5)));
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.key = readString;
        this.value = parcel.readString();
    }
}
