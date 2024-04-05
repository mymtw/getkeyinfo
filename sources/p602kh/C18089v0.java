package p602kh;

import com.google.android.exoplayer2.source.C14344i;
import com.google.common.base.C15791j;
import java.util.Arrays;
import p594jh.C17939k1;

/* renamed from: kh.v0 */
public interface C18089v0 {

    /* renamed from: kh.v0$a */
    public static final class C18090a {

        /* renamed from: a */
        public final long f39494a;

        /* renamed from: b */
        public final C17939k1 f39495b;

        /* renamed from: c */
        public final int f39496c;

        /* renamed from: d */
        public final C14344i.C14345a f39497d;

        /* renamed from: e */
        public final long f39498e;

        /* renamed from: f */
        public final C17939k1 f39499f;

        /* renamed from: g */
        public final int f39500g;

        /* renamed from: h */
        public final C14344i.C14345a f39501h;

        /* renamed from: i */
        public final long f39502i;

        /* renamed from: j */
        public final long f39503j;

        public C18090a(long j, C17939k1 k1Var, int i, C14344i.C14345a aVar, long j2, C17939k1 k1Var2, int i2, C14344i.C14345a aVar2, long j3, long j4) {
            this.f39494a = j;
            this.f39495b = k1Var;
            this.f39496c = i;
            this.f39497d = aVar;
            this.f39498e = j2;
            this.f39499f = k1Var2;
            this.f39500g = i2;
            this.f39501h = aVar2;
            this.f39502i = j3;
            this.f39503j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C18090a.class != obj.getClass()) {
                return false;
            }
            C18090a aVar = (C18090a) obj;
            return this.f39494a == aVar.f39494a && this.f39496c == aVar.f39496c && this.f39498e == aVar.f39498e && this.f39500g == aVar.f39500g && this.f39502i == aVar.f39502i && this.f39503j == aVar.f39503j && C15791j.m25606a(this.f39495b, aVar.f39495b) && C15791j.m25606a(this.f39497d, aVar.f39497d) && C15791j.m25606a(this.f39499f, aVar.f39499f) && C15791j.m25606a(this.f39501h, aVar.f39501h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f39494a), this.f39495b, Integer.valueOf(this.f39496c), this.f39497d, Long.valueOf(this.f39498e), this.f39499f, Integer.valueOf(this.f39500g), this.f39501h, Long.valueOf(this.f39502i), Long.valueOf(this.f39503j)});
        }
    }
}
