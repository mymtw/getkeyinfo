package com.google.android.play.core.assetpacks;

import android.support.p013v4.media.C0073e;

/* renamed from: com.google.android.play.core.assetpacks.g0 */
public final class C15603g0 extends AssetPackState {

    /* renamed from: a */
    public final String f35147a;

    /* renamed from: b */
    public final int f35148b;

    /* renamed from: c */
    public final int f35149c;

    /* renamed from: d */
    public final long f35150d;

    /* renamed from: e */
    public final long f35151e;

    /* renamed from: f */
    public final int f35152f;

    /* renamed from: g */
    public final int f35153g;

    /* renamed from: h */
    public final String f35154h;

    /* renamed from: i */
    public final String f35155i;

    public C15603g0(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        if (str != null) {
            this.f35147a = str;
            this.f35148b = i;
            this.f35149c = i2;
            this.f35150d = j;
            this.f35151e = j2;
            this.f35152f = i3;
            this.f35153g = i4;
            if (str2 != null) {
                this.f35154h = str2;
                if (str3 != null) {
                    this.f35155i = str3;
                    return;
                }
                throw new NullPointerException("Null installedVersionTag");
            }
            throw new NullPointerException("Null availableVersionTag");
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final long mo55357a() {
        return this.f35150d;
    }

    /* renamed from: b */
    public final int mo55358b() {
        return this.f35149c;
    }

    /* renamed from: c */
    public final String mo55359c() {
        return this.f35147a;
    }

    /* renamed from: d */
    public final int mo55360d() {
        return this.f35148b;
    }

    /* renamed from: e */
    public final long mo55361e() {
        return this.f35151e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f35147a.equals(assetPackState.mo55359c()) && this.f35148b == assetPackState.mo55360d() && this.f35149c == assetPackState.mo55358b() && this.f35150d == assetPackState.mo55357a() && this.f35151e == assetPackState.mo55361e() && this.f35152f == assetPackState.mo55362f() && this.f35153g == assetPackState.mo55363g() && this.f35154h.equals(assetPackState.mo55364j()) && this.f35155i.equals(assetPackState.mo55365k());
        }
    }

    /* renamed from: f */
    public final int mo55362f() {
        return this.f35152f;
    }

    /* renamed from: g */
    public final int mo55363g() {
        return this.f35153g;
    }

    public final int hashCode() {
        int hashCode = this.f35147a.hashCode();
        int i = this.f35148b;
        int i2 = this.f35149c;
        long j = this.f35150d;
        long j2 = this.f35151e;
        return ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f35152f) * 1000003) ^ this.f35153g) * 1000003) ^ this.f35154h.hashCode()) * 1000003) ^ this.f35155i.hashCode();
    }

    /* renamed from: j */
    public final String mo55364j() {
        return this.f35154h;
    }

    /* renamed from: k */
    public final String mo55365k() {
        return this.f35155i;
    }

    public final String toString() {
        String str = this.f35147a;
        int i = this.f35148b;
        int i2 = this.f35149c;
        long j = this.f35150d;
        long j2 = this.f35151e;
        int i3 = this.f35152f;
        int i4 = this.f35153g;
        String str2 = this.f35154h;
        String str3 = this.f35155i;
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + str.length() + 261);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", availableVersionTag=");
        return C0073e.m210j(sb, str2, ", installedVersionTag=", str3, "}");
    }
}
