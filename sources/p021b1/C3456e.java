package p021b1;

import android.support.p013v4.media.C0072d;
import android.util.Base64;
import java.util.List;
import org.apache.commons.cli.HelpFormatter;
import p003a2.C0023f;

/* renamed from: b1.e */
public final class C3456e {

    /* renamed from: a */
    public final String f8056a;

    /* renamed from: b */
    public final String f8057b;

    /* renamed from: c */
    public final String f8058c;

    /* renamed from: d */
    public final List<List<byte[]>> f8059d;

    /* renamed from: e */
    public final String f8060e;

    public C3456e(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f8056a = str;
        str2.getClass();
        this.f8057b = str2;
        this.f8058c = str3;
        list.getClass();
        this.f8059d = list;
        this.f8060e = str + HelpFormatter.DEFAULT_OPT_PREFIX + str2 + HelpFormatter.DEFAULT_OPT_PREFIX + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder h = C0072d.m201h("FontRequest {mProviderAuthority: ");
        h.append(this.f8056a);
        h.append(", mProviderPackage: ");
        h.append(this.f8057b);
        h.append(", mQuery: ");
        h.append(this.f8058c);
        h.append(", mCertificates:");
        sb.append(h.toString());
        for (int i = 0; i < this.f8059d.size(); i++) {
            sb.append(" [");
            List list = this.f8059d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return C0023f.m110k(sb, "}", "mCertificatesArray: 0");
    }
}
