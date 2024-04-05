package p116g6;

import com.google.android.play.core.appupdate.C15567i;
import org.apache.commons.codec.net.URLCodec;
import p244t5.C7959a;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7984h1;
import p244t5.C8005o1;
import p244t5.C8008p1;
import p244t5.C8018s1;
import p244t5.C8021t1;
import p267v7.C8212a;

/* renamed from: g6.d */
public final class C6886d extends C8005o1 {

    /* renamed from: e */
    public static final byte[] f15245e = {-87, -42, -21, 69, -15, 60, 112, -126, Byte.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, URLCodec.ESCAPE_CHAR, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, Framer.STDIN_REQUEST_FRAME_PREFIX, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};

    /* renamed from: b */
    public C7959a f15246b;

    /* renamed from: c */
    public C6884b f15247c;

    /* renamed from: d */
    public byte[] f15248d = f15245e;

    public C6886d(C6884b bVar) {
        this.f15247c = bVar;
    }

    public C6886d(C7959a aVar) {
        this.f15246b = aVar;
    }

    /* renamed from: e */
    public static C6886d m13340e(C8021t1 t1Var) {
        C6886d dVar;
        if (t1Var instanceof C6886d) {
            return (C6886d) t1Var;
        }
        C8021t1 s = C8021t1.m16151s(t1Var);
        if (s.mo20523q(0) instanceof C7959a) {
            dVar = new C6886d(C7959a.m15938q(s.mo20523q(0)));
        } else {
            C7984h1 q = s.mo20523q(0);
            dVar = new C6886d(q instanceof C6884b ? (C6884b) q : q != null ? new C6884b(C8021t1.m16151s(q)) : null);
        }
        if (s.mo20525y() == 2) {
            byte[] v = C8008p1.m16103q(s.mo20523q(1)).mo20541v();
            dVar.f15248d = v;
            if (v.length != 64) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return dVar;
    }

    /* renamed from: g */
    public final boolean mo19009g() {
        return this.f15246b != null;
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        C7984h1 h1Var = this.f15246b;
        if (h1Var == null) {
            h1Var = this.f15247c;
        }
        iVar.mo55343b(h1Var);
        if (!C8212a.m16500g(this.f15248d, f15245e)) {
            iVar.mo55343b(new C7964b0(this.f15248d));
        }
        return new C7976f0(iVar);
    }
}
