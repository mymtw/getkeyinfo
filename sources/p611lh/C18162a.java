package p611lh;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.google.android.exoplayer2.ParserException;
import p513bj.C14076q;

/* renamed from: lh.a */
public final class C18162a {

    /* renamed from: a */
    public static final int[] f39723a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, CharsToNameCanonicalizer.MAX_ENTRIES_FOR_REUSE, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f39724b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: lh.a$a */
    public static final class C18163a {

        /* renamed from: a */
        public final int f39725a;

        /* renamed from: b */
        public final int f39726b;

        /* renamed from: c */
        public final String f39727c;

        public C18163a(int i, int i2, String str) {
            this.f39725a = i;
            this.f39726b = i2;
            this.f39727c = str;
        }
    }

    /* renamed from: a */
    public static int m30675a(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m30676b(C14076q qVar) throws ParserException {
        int h = qVar.mo46901h(4);
        if (h == 15) {
            return qVar.mo46901h(24);
        }
        if (h < 13) {
            return f39723a[h];
        }
        throw new ParserException();
    }

    /* renamed from: c */
    public static C18163a m30677c(C14076q qVar, boolean z) throws ParserException {
        int h = qVar.mo46901h(5);
        if (h == 31) {
            h = qVar.mo46901h(6) + 32;
        }
        int b = m30676b(qVar);
        int h2 = qVar.mo46901h(4);
        String g = C0072d.m200g(19, "mp4a.40.", h);
        if (h == 5 || h == 29) {
            b = m30676b(qVar);
            int h3 = qVar.mo46901h(5);
            if (h3 == 31) {
                h3 = qVar.mo46901h(6) + 32;
            }
            h = h3;
            if (h == 22) {
                h2 = qVar.mo46901h(4);
            }
        }
        if (z) {
            if (!(h == 1 || h == 2 || h == 3 || h == 4 || h == 6 || h == 7 || h == 17)) {
                switch (h) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException(C0072d.m200g(42, "Unsupported audio object type: ", h));
                }
            }
            if (qVar.mo46900g()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (qVar.mo46900g()) {
                qVar.mo46907n(14);
            }
            boolean g2 = qVar.mo46900g();
            if (h2 != 0) {
                if (h == 6 || h == 20) {
                    qVar.mo46907n(3);
                }
                if (g2) {
                    if (h == 22) {
                        qVar.mo46907n(16);
                    }
                    if (h == 17 || h == 19 || h == 20 || h == 23) {
                        qVar.mo46907n(3);
                    }
                    qVar.mo46907n(1);
                }
                switch (h) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int h4 = qVar.mo46901h(2);
                        if (h4 == 2 || h4 == 3) {
                            throw new ParserException(C0072d.m200g(33, "Unsupported epConfig: ", h4));
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = f39724b[h2];
        if (i != -1) {
            return new C18163a(b, i, g);
        }
        throw new ParserException();
    }
}
