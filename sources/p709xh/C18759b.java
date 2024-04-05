package p709xh;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p513bj.C14049b0;
import p513bj.C14075p;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18354l;
import p644ph.C18356m;
import p644ph.C18357n;
import p644ph.C18358o;
import p644ph.C18364t;
import p709xh.C18766h;

/* renamed from: xh.b */
public final class C18759b extends C18766h {

    /* renamed from: n */
    public C18358o f41553n;

    /* renamed from: o */
    public C18760a f41554o;

    /* renamed from: xh.b$a */
    public static final class C18760a implements C18764f {

        /* renamed from: a */
        public C18358o f41555a;

        /* renamed from: b */
        public C18358o.C18359a f41556b;

        /* renamed from: c */
        public long f41557c = -1;

        /* renamed from: d */
        public long f41558d = -1;

        public C18760a(C18358o oVar, C18358o.C18359a aVar) {
            this.f41555a = oVar;
            this.f41556b = aVar;
        }

        /* renamed from: a */
        public final C18364t mo70246a() {
            C14075p.m21694f(this.f41557c != -1);
            return new C18357n(this.f41555a, this.f41557c);
        }

        /* renamed from: b */
        public final long mo70247b(C18346e eVar) {
            long j = this.f41558d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f41558d = -1;
            return j2;
        }

        /* renamed from: c */
        public final void mo70248c(long j) {
            long[] jArr = this.f41556b.f40317a;
            this.f41558d = jArr[C14049b0.m21633f(jArr, j, true)];
        }
    }

    /* renamed from: b */
    public final long mo70249b(C14077r rVar) {
        byte[] bArr = rVar.f30986a;
        if (!(bArr[0] == -1)) {
            return -1;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            rVar.mo46909A(4);
            rVar.mo46931v();
        }
        int b = C18354l.m31024b(i, rVar);
        rVar.mo46935z(0);
        return (long) b;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo70250c(C14077r rVar, long j, C18766h.C18767a aVar) {
        C14077r rVar2 = rVar;
        C18766h.C18767a aVar2 = aVar;
        byte[] bArr = rVar2.f30986a;
        C18358o oVar = this.f41553n;
        if (oVar == null) {
            C18358o oVar2 = new C18358o(17, bArr);
            this.f41553n = oVar2;
            aVar2.f41589a = oVar2.mo69889d(Arrays.copyOfRange(bArr, 9, rVar2.f30988c), (Metadata) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            C18358o.C18359a a = C18356m.m31025a(rVar);
            C18358o oVar3 = new C18358o(oVar.f40305a, oVar.f40306b, oVar.f40307c, oVar.f40308d, oVar.f40309e, oVar.f40311g, oVar.f40312h, oVar.f40314j, a, oVar.f40316l);
            this.f41553n = oVar3;
            this.f41554o = new C18760a(oVar3, a);
            return true;
        }
        if (!(b == -1)) {
            return true;
        }
        C18760a aVar3 = this.f41554o;
        if (aVar3 != null) {
            aVar3.f41557c = j;
            aVar2.f41590b = aVar3;
        }
        aVar2.f41589a.getClass();
        return false;
    }

    /* renamed from: d */
    public final void mo70251d(boolean z) {
        super.mo70251d(z);
        if (z) {
            this.f41553n = null;
            this.f41554o = null;
        }
    }
}
