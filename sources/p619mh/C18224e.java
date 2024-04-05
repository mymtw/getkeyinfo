package p619mh;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import p003a2.C0023f;
import p513bj.C14075p;

/* renamed from: mh.e */
public final class C18224e {

    /* renamed from: a */
    public final String f39951a;

    /* renamed from: b */
    public final Format f39952b;

    /* renamed from: c */
    public final Format f39953c;

    /* renamed from: d */
    public final int f39954d;

    /* renamed from: e */
    public final int f39955e;

    public C18224e(String str, Format format, Format format2, int i, int i2) {
        C14075p.m21691c(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.f39951a = str;
            format.getClass();
            this.f39952b = format;
            format2.getClass();
            this.f39953c = format2;
            this.f39954d = i;
            this.f39955e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18224e.class != obj.getClass()) {
            return false;
        }
        C18224e eVar = (C18224e) obj;
        return this.f39954d == eVar.f39954d && this.f39955e == eVar.f39955e && this.f39951a.equals(eVar.f39951a) && this.f39952b.equals(eVar.f39952b) && this.f39953c.equals(eVar.f39953c);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f39951a, (((this.f39954d + 527) * 31) + this.f39955e) * 31, 31);
        return this.f39953c.hashCode() + ((this.f39952b.hashCode() + e) * 31);
    }
}
