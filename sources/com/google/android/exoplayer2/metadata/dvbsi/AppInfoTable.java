package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.metadata.Metadata;

public final class AppInfoTable implements Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new C14251a();
    public final int controlCode;
    public final String url;

    /* renamed from: com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable$a */
    public class C14251a implements Parcelable.Creator<AppInfoTable> {
        public final Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new AppInfoTable(parcel.readInt(), readString);
        }

        public final Object[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.controlCode = i;
        this.url = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i = this.controlCode;
        String str = this.url;
        StringBuilder sb = new StringBuilder(C0391c.m1055a(str, 33));
        sb.append("Ait(controlCode=");
        sb.append(i);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.controlCode);
    }
}
