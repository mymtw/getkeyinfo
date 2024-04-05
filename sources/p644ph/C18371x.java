package p644ph;

import android.support.p013v4.media.C0072d;
import com.google.android.exoplayer2.ParserException;
import p513bj.C14077r;

/* renamed from: ph.x */
public final class C18371x {

    /* renamed from: ph.x$a */
    public static final class C18372a {

        /* renamed from: a */
        public final String[] f40343a;

        public C18372a(String[] strArr) {
            this.f40343a = strArr;
        }
    }

    /* renamed from: ph.x$b */
    public static final class C18373b {

        /* renamed from: a */
        public final boolean f40344a;

        public C18373b(boolean z) {
            this.f40344a = z;
        }
    }

    /* renamed from: ph.x$c */
    public static final class C18374c {

        /* renamed from: a */
        public final int f40345a;

        /* renamed from: b */
        public final int f40346b;

        /* renamed from: c */
        public final int f40347c;

        /* renamed from: d */
        public final int f40348d;

        /* renamed from: e */
        public final int f40349e;

        /* renamed from: f */
        public final int f40350f;

        /* renamed from: g */
        public final byte[] f40351g;

        public C18374c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f40345a = i;
            this.f40346b = i2;
            this.f40347c = i3;
            this.f40348d = i4;
            this.f40349e = i5;
            this.f40350f = i6;
            this.f40351g = bArr;
        }
    }

    /* renamed from: a */
    public static C18372a m31055a(C14077r rVar, boolean z, boolean z2) throws ParserException {
        if (z) {
            m31056b(3, rVar, false);
        }
        rVar.mo46922m((int) rVar.mo46916g());
        long g = rVar.mo46916g();
        String[] strArr = new String[((int) g)];
        for (int i = 0; ((long) i) < g; i++) {
            strArr[i] = rVar.mo46922m((int) rVar.mo46916g());
        }
        if (!z2 || (rVar.mo46925p() & 1) != 0) {
            return new C18372a(strArr);
        }
        throw new ParserException("framing bit expected to be set");
    }

    /* renamed from: b */
    public static boolean m31056b(int i, C14077r rVar, boolean z) throws ParserException {
        if (rVar.f30988c - rVar.f30987b < 7) {
            if (z) {
                return false;
            }
            throw new ParserException(C0072d.m200g(29, "too short header: ", rVar.f30988c - rVar.f30987b));
        } else if (rVar.mo46925p() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new ParserException(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (rVar.mo46925p() == 118 && rVar.mo46925p() == 111 && rVar.mo46925p() == 114 && rVar.mo46925p() == 98 && rVar.mo46925p() == 105 && rVar.mo46925p() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new ParserException("expected characters 'vorbis'");
        }
    }
}
