package p520cj;

import java.util.Arrays;

/* renamed from: cj.c */
public final class C14146c {

    /* renamed from: a */
    public C14147a f31166a = new C14147a();

    /* renamed from: b */
    public C14147a f31167b = new C14147a();

    /* renamed from: c */
    public boolean f31168c;

    /* renamed from: d */
    public long f31169d = -9223372036854775807L;

    /* renamed from: e */
    public int f31170e;

    /* renamed from: cj.c$a */
    public static final class C14147a {

        /* renamed from: a */
        public long f31171a;

        /* renamed from: b */
        public long f31172b;

        /* renamed from: c */
        public long f31173c;

        /* renamed from: d */
        public long f31174d;

        /* renamed from: e */
        public long f31175e;

        /* renamed from: f */
        public long f31176f;

        /* renamed from: g */
        public final boolean[] f31177g = new boolean[15];

        /* renamed from: h */
        public int f31178h;

        /* renamed from: a */
        public final boolean mo47040a() {
            return this.f31174d > 15 && this.f31178h == 0;
        }

        /* renamed from: b */
        public final void mo47041b(long j) {
            long j2 = this.f31174d;
            if (j2 == 0) {
                this.f31171a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f31171a;
                this.f31172b = j3;
                this.f31176f = j3;
                this.f31175e = 1;
            } else {
                long j4 = j - this.f31173c;
                int i = (int) (j2 % 15);
                if (Math.abs(j4 - this.f31172b) <= 1000000) {
                    this.f31175e++;
                    this.f31176f += j4;
                    boolean[] zArr = this.f31177g;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f31178h--;
                    }
                } else {
                    boolean[] zArr2 = this.f31177g;
                    if (!zArr2[i]) {
                        zArr2[i] = true;
                        this.f31178h++;
                    }
                }
            }
            this.f31174d++;
            this.f31173c = j;
        }

        /* renamed from: c */
        public final void mo47042c() {
            this.f31174d = 0;
            this.f31175e = 0;
            this.f31176f = 0;
            this.f31178h = 0;
            Arrays.fill(this.f31177g, false);
        }
    }

    /* renamed from: a */
    public final boolean mo47039a() {
        return this.f31166a.mo47040a();
    }
}
