package androidx.work;

/* renamed from: androidx.work.c */
public final class C3376c {

    /* renamed from: i */
    public static final C3376c f7881i = new C3376c(new C3377a());

    /* renamed from: a */
    public NetworkType f7882a;

    /* renamed from: b */
    public boolean f7883b;

    /* renamed from: c */
    public boolean f7884c;

    /* renamed from: d */
    public boolean f7885d;

    /* renamed from: e */
    public boolean f7886e;

    /* renamed from: f */
    public long f7887f;

    /* renamed from: g */
    public long f7888g;

    /* renamed from: h */
    public C3378d f7889h;

    /* renamed from: androidx.work.c$a */
    public static final class C3377a {

        /* renamed from: a */
        public NetworkType f7890a = NetworkType.NOT_REQUIRED;

        /* renamed from: b */
        public long f7891b = -1;

        /* renamed from: c */
        public long f7892c = -1;

        /* renamed from: d */
        public C3378d f7893d = new C3378d();
    }

    public C3376c() {
        this.f7882a = NetworkType.NOT_REQUIRED;
        this.f7887f = -1;
        this.f7888g = -1;
        this.f7889h = new C3378d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3376c.class != obj.getClass()) {
            return false;
        }
        C3376c cVar = (C3376c) obj;
        if (this.f7883b == cVar.f7883b && this.f7884c == cVar.f7884c && this.f7885d == cVar.f7885d && this.f7886e == cVar.f7886e && this.f7887f == cVar.f7887f && this.f7888g == cVar.f7888g && this.f7882a == cVar.f7882a) {
            return this.f7889h.equals(cVar.f7889h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f7887f;
        long j2 = this.f7888g;
        return this.f7889h.hashCode() + (((((((((((((this.f7882a.hashCode() * 31) + (this.f7883b ? 1 : 0)) * 31) + (this.f7884c ? 1 : 0)) * 31) + (this.f7885d ? 1 : 0)) * 31) + (this.f7886e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public C3376c(C3377a aVar) {
        this.f7882a = NetworkType.NOT_REQUIRED;
        this.f7887f = -1;
        this.f7888g = -1;
        new C3378d();
        this.f7883b = false;
        this.f7884c = false;
        this.f7882a = aVar.f7890a;
        this.f7885d = false;
        this.f7886e = false;
        this.f7889h = aVar.f7893d;
        this.f7887f = aVar.f7891b;
        this.f7888g = aVar.f7892c;
    }

    public C3376c(C3376c cVar) {
        this.f7882a = NetworkType.NOT_REQUIRED;
        this.f7887f = -1;
        this.f7888g = -1;
        this.f7889h = new C3378d();
        this.f7883b = cVar.f7883b;
        this.f7884c = cVar.f7884c;
        this.f7882a = cVar.f7882a;
        this.f7885d = cVar.f7885d;
        this.f7886e = cVar.f7886e;
        this.f7889h = cVar.f7889h;
    }
}
