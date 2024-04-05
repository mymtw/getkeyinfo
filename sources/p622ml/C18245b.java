package p622ml;

import com.google.android.play.core.install.InstallState;

/* renamed from: ml.b */
public final class C18245b extends InstallState {

    /* renamed from: a */
    public final int f39995a;

    /* renamed from: b */
    public final long f39996b;

    /* renamed from: c */
    public final long f39997c;

    /* renamed from: d */
    public final int f39998d;

    /* renamed from: e */
    public final String f39999e;

    public C18245b(int i, int i2, long j, long j2, String str) {
        this.f39995a = i;
        this.f39996b = j;
        this.f39997c = j2;
        this.f39998d = i2;
        if (str != null) {
            this.f39999e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public final long mo55511a() {
        return this.f39996b;
    }

    /* renamed from: b */
    public final int mo55512b() {
        return this.f39998d;
    }

    /* renamed from: c */
    public final int mo55513c() {
        return this.f39995a;
    }

    /* renamed from: d */
    public final String mo55514d() {
        return this.f39999e;
    }

    /* renamed from: e */
    public final long mo55515e() {
        return this.f39997c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f39995a == installState.mo55513c() && this.f39996b == installState.mo55511a() && this.f39997c == installState.mo55515e() && this.f39998d == installState.mo55512b() && this.f39999e.equals(installState.mo55514d());
        }
    }

    public final int hashCode() {
        int i = this.f39995a;
        long j = this.f39996b;
        long j2 = this.f39997c;
        return ((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f39998d) * 1000003) ^ this.f39999e.hashCode();
    }

    public final String toString() {
        int i = this.f39995a;
        long j = this.f39996b;
        long j2 = this.f39997c;
        int i2 = this.f39998d;
        String str = this.f39999e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
