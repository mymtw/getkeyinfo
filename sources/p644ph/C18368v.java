package p644ph;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import p505aj.C13997e;
import p513bj.C14077r;

/* renamed from: ph.v */
public interface C18368v {

    /* renamed from: ph.v$a */
    public static final class C18369a {

        /* renamed from: a */
        public final int f40335a;

        /* renamed from: b */
        public final byte[] f40336b;

        /* renamed from: c */
        public final int f40337c;

        /* renamed from: d */
        public final int f40338d;

        public C18369a(int i, int i2, int i3, byte[] bArr) {
            this.f40335a = i;
            this.f40336b = bArr;
            this.f40337c = i2;
            this.f40338d = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C18369a.class != obj.getClass()) {
                return false;
            }
            C18369a aVar = (C18369a) obj;
            return this.f40335a == aVar.f40335a && this.f40337c == aVar.f40337c && this.f40338d == aVar.f40338d && Arrays.equals(this.f40336b, aVar.f40336b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f40336b) + (this.f40335a * 31)) * 31) + this.f40337c) * 31) + this.f40338d;
        }
    }

    /* renamed from: a */
    void mo47752a(Format format);

    /* renamed from: b */
    int mo47753b(C13997e eVar, int i, boolean z) throws IOException;

    /* renamed from: c */
    void mo47754c(long j, int i, int i2, int i3, C18369a aVar);

    /* renamed from: d */
    void mo69899d(int i, C14077r rVar) {
        mo47755f(rVar, i);
    }

    /* renamed from: e */
    int mo69900e(C13997e eVar, int i, boolean z) throws IOException {
        return mo47753b(eVar, i, z);
    }

    /* renamed from: f */
    void mo47755f(C14077r rVar, int i);
}
