package p701wh;

import p513bj.C14049b0;
import p513bj.C14075p;

/* renamed from: wh.o */
public final class C18695o {

    /* renamed from: a */
    public final C18692l f41435a;

    /* renamed from: b */
    public final int f41436b;

    /* renamed from: c */
    public final long[] f41437c;

    /* renamed from: d */
    public final int[] f41438d;

    /* renamed from: e */
    public final int f41439e;

    /* renamed from: f */
    public final long[] f41440f;

    /* renamed from: g */
    public final int[] f41441g;

    /* renamed from: h */
    public final long f41442h;

    public C18695o(C18692l lVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C14075p.m21691c(iArr.length == jArr2.length);
        C14075p.m21691c(jArr.length == jArr2.length);
        C14075p.m21691c(iArr2.length == jArr2.length ? true : z);
        this.f41435a = lVar;
        this.f41437c = jArr;
        this.f41438d = iArr;
        this.f41439e = i;
        this.f41440f = jArr2;
        this.f41441g = iArr2;
        this.f41442h = j;
        this.f41436b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo70195a(long j) {
        for (int b = C14049b0.m21629b(this.f41440f, j, true); b < this.f41440f.length; b++) {
            if ((this.f41441g[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
