package p505aj;

import android.net.Uri;
import androidx.compose.animation.C0391c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p003a2.C0015b;
import p513bj.C14075p;

/* renamed from: aj.i */
public final class C14002i {

    /* renamed from: a */
    public final Uri f30774a;

    /* renamed from: b */
    public final long f30775b;

    /* renamed from: c */
    public final int f30776c;

    /* renamed from: d */
    public final byte[] f30777d;

    /* renamed from: e */
    public final Map<String, String> f30778e;

    /* renamed from: f */
    public final long f30779f;

    /* renamed from: g */
    public final long f30780g;

    /* renamed from: h */
    public final String f30781h;

    /* renamed from: i */
    public final int f30782i;

    /* renamed from: j */
    public final Object f30783j;

    public C14002i(Uri uri, long j, long j2) {
        this(uri, 0, 1, (byte[]) null, Collections.emptyMap(), j, j2, (String) null, 0, (Object) null);
    }

    public final String toString() {
        String str;
        int i = this.f30776c;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        String valueOf = String.valueOf(this.f30774a);
        long j = this.f30779f;
        long j2 = this.f30780g;
        String str2 = this.f30781h;
        int i2 = this.f30782i;
        StringBuilder k = C0015b.m92k(C0391c.m1055a(str2, valueOf.length() + str.length() + 70), "DataSpec[", str, " ", valueOf);
        k.append(", ");
        k.append(j);
        k.append(", ");
        k.append(j2);
        k.append(", ");
        k.append(str2);
        k.append(", ");
        k.append(i2);
        k.append("]");
        return k.toString();
    }

    public C14002i(Uri uri, long j, int i, byte[] bArr, Map<String, String> map, long j2, long j3, String str, int i2, Object obj) {
        long j4 = j;
        byte[] bArr2 = bArr;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        C14075p.m21691c(j4 + j5 >= 0);
        C14075p.m21691c(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C14075p.m21691c(z);
        this.f30774a = uri;
        this.f30775b = j4;
        this.f30776c = i;
        this.f30777d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f30778e = Collections.unmodifiableMap(new HashMap(map));
        this.f30779f = j5;
        this.f30780g = j6;
        this.f30781h = str;
        this.f30782i = i2;
        this.f30783j = obj;
    }
}
