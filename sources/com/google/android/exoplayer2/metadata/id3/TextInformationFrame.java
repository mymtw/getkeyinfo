package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import p003a2.C0015b;
import p003a2.C0023f;
import p513bj.C14049b0;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C14266a();
    public final String description;
    public final String value;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$a */
    public class C14266a implements Parcelable.Creator<TextInformationFrame> {
        public final Object createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        public final Object[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return C14049b0.m21628a(this.f31709id, textInformationFrame.f31709id) && C14049b0.m21628a(this.description, textInformationFrame.description) && C14049b0.m21628a(this.value, textInformationFrame.value);
    }

    public int hashCode() {
        int e = C0023f.m105e(this.f31709id, 527, 31);
        String str = this.description;
        int i = 0;
        int hashCode = (e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populateMediaMetadata(p594jh.C17963p0.C17964a r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f31709id
            r0.getClass()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = -1
            r4 = 1
            switch(r1) {
                case 82815: goto L_0x0094;
                case 83253: goto L_0x0088;
                case 83254: goto L_0x007d;
                case 83341: goto L_0x0072;
                case 83378: goto L_0x0067;
                case 83552: goto L_0x005c;
                case 2567331: goto L_0x0051;
                case 2575251: goto L_0x0046;
                case 2581512: goto L_0x0039;
                case 2581513: goto L_0x002c;
                case 2583398: goto L_0x001f;
                case 2590194: goto L_0x0012;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = r3
            goto L_0x009f
        L_0x0012:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001b
            goto L_0x000f
        L_0x001b:
            r0 = 11
            goto L_0x009f
        L_0x001f:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x000f
        L_0x0028:
            r0 = 10
            goto L_0x009f
        L_0x002c:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x000f
        L_0x0035:
            r0 = 9
            goto L_0x009f
        L_0x0039:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0042
            goto L_0x000f
        L_0x0042:
            r0 = 8
            goto L_0x009f
        L_0x0046:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004f
            goto L_0x000f
        L_0x004f:
            r0 = 7
            goto L_0x009f
        L_0x0051:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005a
            goto L_0x000f
        L_0x005a:
            r0 = 6
            goto L_0x009f
        L_0x005c:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0065
            goto L_0x000f
        L_0x0065:
            r0 = 5
            goto L_0x009f
        L_0x0067:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0070
            goto L_0x000f
        L_0x0070:
            r0 = 4
            goto L_0x009f
        L_0x0072:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007b
            goto L_0x000f
        L_0x007b:
            r0 = 3
            goto L_0x009f
        L_0x007d:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0086
            goto L_0x000f
        L_0x0086:
            r0 = 2
            goto L_0x009f
        L_0x0088:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0092
            goto L_0x000f
        L_0x0092:
            r0 = r4
            goto L_0x009f
        L_0x0094:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x009e
            goto L_0x000f
        L_0x009e:
            r0 = r2
        L_0x009f:
            switch(r0) {
                case 0: goto L_0x00e7;
                case 1: goto L_0x00e2;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00b5;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00a3;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00b0;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00b5;
                case 11: goto L_0x00a3;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            goto L_0x00eb
        L_0x00a3:
            java.lang.String r0 = r5.value     // Catch:{ NumberFormatException -> 0x00eb }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00eb }
            r6.f39229o = r0     // Catch:{ NumberFormatException -> 0x00eb }
            goto L_0x00eb
        L_0x00b0:
            java.lang.String r0 = r5.value
            r6.f39215a = r0
            goto L_0x00eb
        L_0x00b5:
            java.lang.String r0 = r5.value
            int r1 = p513bj.C14049b0.f30913a
            java.lang.String r1 = "/"
            java.lang.String[] r0 = r0.split(r1, r3)
            r1 = r0[r2]     // Catch:{ NumberFormatException -> 0x00eb }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00eb }
            int r2 = r0.length     // Catch:{ NumberFormatException -> 0x00eb }
            if (r2 <= r4) goto L_0x00d3
            r0 = r0[r4]     // Catch:{ NumberFormatException -> 0x00eb }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00eb }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00eb }
            goto L_0x00d4
        L_0x00d3:
            r0 = 0
        L_0x00d4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00eb }
            r6.f39225k = r1     // Catch:{ NumberFormatException -> 0x00eb }
            r6.f39226l = r0     // Catch:{ NumberFormatException -> 0x00eb }
            goto L_0x00eb
        L_0x00dd:
            java.lang.String r0 = r5.value
            r6.f39218d = r0
            goto L_0x00eb
        L_0x00e2:
            java.lang.String r0 = r5.value
            r6.f39216b = r0
            goto L_0x00eb
        L_0x00e7:
            java.lang.String r0 = r5.value
            r6.f39217c = r0
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.populateMediaMetadata(jh.p0$a):void");
    }

    public String toString() {
        String str = this.f31709id;
        String str2 = this.description;
        String str3 = this.value;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str3, C0391c.m1055a(str2, C0391c.m1055a(str, 22))), str, ": description=", str2, ": value=");
        k.append(str3);
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31709id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInformationFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p513bj.C14049b0.f30913a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.description = r0
            java.lang.String r3 = r3.readString()
            r2.value = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.<init>(android.os.Parcel):void");
    }
}
