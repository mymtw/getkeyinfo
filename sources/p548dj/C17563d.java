package p548dj;

import p513bj.C14075p;

/* renamed from: dj.d */
public final class C17563d {

    /* renamed from: a */
    public final C17564a f38402a;

    /* renamed from: b */
    public final C17564a f38403b;

    /* renamed from: c */
    public final int f38404c;

    /* renamed from: d */
    public final boolean f38405d;

    /* renamed from: dj.d$a */
    public static final class C17564a {

        /* renamed from: a */
        public final C17565b[] f38406a;

        public C17564a(C17565b... bVarArr) {
            this.f38406a = bVarArr;
        }
    }

    /* renamed from: dj.d$b */
    public static final class C17565b {

        /* renamed from: a */
        public final int f38407a;

        /* renamed from: b */
        public final int f38408b;

        /* renamed from: c */
        public final float[] f38409c;

        /* renamed from: d */
        public final float[] f38410d;

        public C17565b(int i, int i2, float[] fArr, float[] fArr2) {
            this.f38407a = i;
            C14075p.m21691c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f38409c = fArr;
            this.f38410d = fArr2;
            this.f38408b = i2;
        }
    }

    public C17563d() {
        throw null;
    }

    public C17563d(C17564a aVar, C17564a aVar2, int i) {
        this.f38402a = aVar;
        this.f38403b = aVar2;
        this.f38404c = i;
        this.f38405d = aVar == aVar2;
    }
}
