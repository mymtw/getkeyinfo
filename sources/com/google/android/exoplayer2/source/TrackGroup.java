package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p003a2.C0015b;
import p513bj.C14075p;

public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C14287a();
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    public final int length;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroup$a */
    public class C14287a implements Parcelable.Creator<TrackGroup> {
        public final Object createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        public final Object[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        C14075p.m21694f(formatArr.length > 0);
        this.formats = formatArr;
        this.length = formatArr.length;
        verifyCorrectness();
    }

    private static void logErrorMessage(String str, String str2, String str3, int i) {
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 78))), "Different ", str, " combined in one TrackGroup: '", str2);
        k.append("' (track 0) and '");
        k.append(str3);
        k.append("' (track ");
        k.append(i);
        k.append(")");
        C14075p.m21698j(TAG, "", new IllegalStateException(k.toString()));
    }

    private static String normalizeLanguage(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int normalizeRoleFlags(int i) {
        return i | PrimitiveArrayBuilder.SMALL_CHUNK_SIZE;
    }

    private void verifyCorrectness() {
        String normalizeLanguage = normalizeLanguage(this.formats[0].language);
        int normalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return;
            }
            if (!normalizeLanguage.equals(normalizeLanguage(formatArr[i].language))) {
                Format[] formatArr2 = this.formats;
                logErrorMessage(ResponseConstants.LANGUAGES, formatArr2[0].language, formatArr2[i].language, i);
                return;
            } else if (normalizeRoleFlags != normalizeRoleFlags(this.formats[i].roleFlags)) {
                logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i].roleFlags), i);
                return;
            } else {
                i++;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.length == trackGroup.length && Arrays.equals(this.formats, trackGroup.formats);
    }

    public Format getFormat(int i) {
        return this.formats[i];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 527 + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public int indexOf(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.length);
        for (int i2 = 0; i2 < this.length; i2++) {
            parcel.writeParcelable(this.formats[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.length = readInt;
        this.formats = new Format[readInt];
        for (int i = 0; i < this.length; i++) {
            this.formats[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
