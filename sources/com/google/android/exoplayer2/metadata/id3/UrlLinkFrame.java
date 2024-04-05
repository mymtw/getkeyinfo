package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import p003a2.C0023f;
import p504ai.C13983i;
import p513bj.C14049b0;

public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C14267a();
    public final String description;
    public final String url;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame$a */
    public class C14267a implements Parcelable.Creator<UrlLinkFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f31709id.equals(urlLinkFrame.f31709id) && C14049b0.m21628a(this.description, urlLinkFrame.description) && C14049b0.m21628a(this.url, urlLinkFrame.url);
    }

    public int hashCode() {
        int e = C0023f.m105e(this.f31709id, 527, 31);
        String str = this.description;
        int i = 0;
        int hashCode = (e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f31709id;
        String str2 = this.url;
        return C13983i.m21492k(C0391c.m1055a(str2, C0391c.m1055a(str, 6)), str, ": url=", str2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31709id);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UrlLinkFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p513bj.C14049b0.f30913a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.description = r0
            java.lang.String r3 = r3.readString()
            r2.url = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.<init>(android.os.Parcel):void");
    }
}
