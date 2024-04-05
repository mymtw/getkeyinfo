package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.animation.C0391c;
import com.google.android.exoplayer2.metadata.Metadata;
import p003a2.C0015b;
import p513bj.C14049b0;
import p513bj.C14075p;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C14255a();
    public static final String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final String RESPONSE_HEADER_NAME = "icy-name";
    private static final String RESPONSE_HEADER_PUB = "icy-pub";
    private static final String RESPONSE_HEADER_URL = "icy-url";
    private static final String TAG = "IcyHeaders";
    public final int bitrate;
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;
    public final String name;
    public final String url;

    /* renamed from: com.google.android.exoplayer2.metadata.icy.IcyHeaders$a */
    public class C14255a implements Parcelable.Creator<IcyHeaders> {
        public final Object createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        public final Object[] newArray(int i) {
            return new IcyHeaders[i];
        }
    }

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        C14075p.m21691c(i2 == -1 || i2 > 0);
        this.bitrate = i;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z;
        this.metadataInterval = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders parse(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x003f }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = r4
            goto L_0x003d
        L_0x0021:
            java.lang.String r7 = "Invalid bitrate: "
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0040 }
            int r9 = r8.length()     // Catch:{ NumberFormatException -> 0x0040 }
            if (r9 == 0) goto L_0x0032
            java.lang.String r7 = r7.concat(r8)     // Catch:{ NumberFormatException -> 0x0040 }
            goto L_0x0038
        L_0x0032:
            java.lang.String r8 = new java.lang.String     // Catch:{ NumberFormatException -> 0x0040 }
            r8.<init>(r7)     // Catch:{ NumberFormatException -> 0x0040 }
            r7 = r8
        L_0x0038:
            android.util.Log.w(r2, r7)     // Catch:{ NumberFormatException -> 0x0040 }
            r6 = r3
            goto L_0x0059
        L_0x003d:
            r7 = r6
            goto L_0x005d
        L_0x003f:
            r6 = r3
        L_0x0040:
            java.lang.String r7 = "Invalid bitrate header: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r8 = r1.length()
            if (r8 == 0) goto L_0x0051
            java.lang.String r1 = r7.concat(r1)
            goto L_0x0056
        L_0x0051:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
        L_0x0056:
            android.util.Log.w(r2, r1)
        L_0x0059:
            r1 = r5
            goto L_0x003d
        L_0x005b:
            r7 = r3
            r1 = r5
        L_0x005d:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0071
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r4
            goto L_0x0072
        L_0x0071:
            r9 = r8
        L_0x0072:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0085
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L_0x0086
        L_0x0085:
            r10 = r8
        L_0x0086:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0099
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L_0x009a
        L_0x0099:
            r11 = r8
        L_0x009a:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00b3
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = r4
            goto L_0x00b4
        L_0x00b3:
            r12 = r5
        L_0x00b4:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00fe
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00e7 }
            if (r5 <= 0) goto L_0x00cc
            r3 = r5
            goto L_0x00e4
        L_0x00cc:
            java.lang.String r4 = java.lang.String.valueOf(r13)     // Catch:{ NumberFormatException -> 0x00e6 }
            int r6 = r4.length()     // Catch:{ NumberFormatException -> 0x00e6 }
            if (r6 == 0) goto L_0x00db
            java.lang.String r4 = r0.concat(r4)     // Catch:{ NumberFormatException -> 0x00e6 }
            goto L_0x00e0
        L_0x00db:
            java.lang.String r4 = new java.lang.String     // Catch:{ NumberFormatException -> 0x00e6 }
            r4.<init>(r0)     // Catch:{ NumberFormatException -> 0x00e6 }
        L_0x00e0:
            android.util.Log.w(r2, r4)     // Catch:{ NumberFormatException -> 0x00e6 }
            r4 = r1
        L_0x00e4:
            r1 = r4
            goto L_0x00fe
        L_0x00e6:
            r3 = r5
        L_0x00e7:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r4 = r13.length()
            if (r4 == 0) goto L_0x00f6
            java.lang.String r13 = r0.concat(r13)
            goto L_0x00fb
        L_0x00f6:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
        L_0x00fb:
            android.util.Log.w(r2, r13)
        L_0x00fe:
            if (r1 == 0) goto L_0x010c
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r13 = new com.google.android.exoplayer2.metadata.icy.IcyHeaders
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x010c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.parse(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.bitrate == icyHeaders.bitrate && C14049b0.m21628a(this.genre, icyHeaders.genre) && C14049b0.m21628a(this.name, icyHeaders.name) && C14049b0.m21628a(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval;
    }

    public int hashCode() {
        int i = (527 + this.bitrate) * 31;
        String str = this.genre;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.genre;
        int i = this.bitrate;
        int i2 = this.metadataInterval;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str2, C0391c.m1055a(str, 80)), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        k.append("\", bitrate=");
        k.append(i);
        k.append(", metadataInterval=");
        k.append(i2);
        return k.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        boolean z = this.isPublic;
        int i2 = C14049b0.f30913a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.metadataInterval);
    }

    public IcyHeaders(Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        int i = C14049b0.f30913a;
        this.isPublic = parcel.readInt() != 0;
        this.metadataInterval = parcel.readInt();
    }
}
