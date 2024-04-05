package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import p003a2.C0015b;
import p513bj.C14049b0;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C14261a();

    /* renamed from: ID */
    public static final String f31707ID = "COMM";
    public final String description;
    public final String language;
    public final String text;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$a */
    public class C14261a implements Parcelable.Creator<CommentFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super(f31707ID);
        this.language = str;
        this.description = str2;
        this.text = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return C14049b0.m21628a(this.description, commentFrame.description) && C14049b0.m21628a(this.language, commentFrame.language) && C14049b0.m21628a(this.text, commentFrame.text);
    }

    public int hashCode() {
        String str = this.language;
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
        String str2 = this.language;
        String str3 = this.description;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 25))), str, ": language=", str2, ", description=");
        k.append(str3);
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31709id);
        parcel.writeString(this.language);
        parcel.writeString(this.text);
    }

    public CommentFrame(Parcel parcel) {
        super(f31707ID);
        String readString = parcel.readString();
        int i = C14049b0.f30913a;
        this.language = readString;
        this.description = parcel.readString();
        this.text = parcel.readString();
    }
}
