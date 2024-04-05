package p686ui;

import p513bj.C14049b0;
import p513bj.C14075p;
import p636oi.C18296a;
import p636oi.C18300d;

/* renamed from: ui.b */
public final class C18584b implements C18300d {

    /* renamed from: b */
    public final C18296a[] f41036b;

    /* renamed from: c */
    public final long[] f41037c;

    public C18584b(C18296a[] aVarArr, long[] jArr) {
        this.f41036b = aVarArr;
        this.f41037c = jArr;
    }

    /* renamed from: a */
    public final int mo69841a(long j) {
        int b = C14049b0.m21629b(this.f41037c, j, false);
        if (b < this.f41037c.length) {
            return b;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r3 = r2.f41036b[r3];
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p636oi.C18296a> mo69842c(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f41037c
            r1 = 0
            int r3 = p513bj.C14049b0.m21633f(r0, r3, r1)
            r4 = -1
            if (r3 == r4) goto L_0x0018
            oi.a[] r4 = r2.f41036b
            r3 = r4[r3]
            oi.a r4 = p636oi.C18296a.f40146r
            if (r3 != r4) goto L_0x0013
            goto L_0x0018
        L_0x0013:
            java.util.List r3 = java.util.Collections.singletonList(r3)
            return r3
        L_0x0018:
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p686ui.C18584b.mo69842c(long):java.util.List");
    }

    /* renamed from: e */
    public final long mo69843e(int i) {
        boolean z = true;
        C14075p.m21691c(i >= 0);
        if (i >= this.f41037c.length) {
            z = false;
        }
        C14075p.m21691c(z);
        return this.f41037c[i];
    }

    /* renamed from: f */
    public final int mo69844f() {
        return this.f41037c.length;
    }
}
