package p520cj;

import com.google.android.exoplayer2.ParserException;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Collections;
import java.util.List;
import p513bj.C14068n;
import p513bj.C14077r;
import p513bj.C14078s;

/* renamed from: cj.d */
public final class C14148d {

    /* renamed from: a */
    public final List<byte[]> f31179a;

    /* renamed from: b */
    public final int f31180b;

    /* renamed from: c */
    public final String f31181c;

    public C14148d(List<byte[]> list, int i, String str) {
        this.f31179a = list;
        this.f31180b = i;
        this.f31181c = str;
    }

    /* renamed from: a */
    public static C14148d m21904a(C14077r rVar) throws ParserException {
        C14077r rVar2 = rVar;
        try {
            rVar2.mo46909A(21);
            int p = rVar.mo46925p() & 3;
            int p2 = rVar.mo46925p();
            int i = rVar2.f30987b;
            int i2 = 0;
            for (int i3 = 0; i3 < p2; i3++) {
                rVar2.mo46909A(1);
                int u = rVar.mo46930u();
                for (int i4 = 0; i4 < u; i4++) {
                    int u2 = rVar.mo46930u();
                    i2 += u2 + 4;
                    rVar2.mo46909A(u2);
                }
            }
            rVar2.mo46935z(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            String str = null;
            for (int i6 = 0; i6 < p2; i6++) {
                int p3 = rVar.mo46925p() & 127;
                int u3 = rVar.mo46930u();
                for (int i7 = 0; i7 < u3; i7++) {
                    int u4 = rVar.mo46930u();
                    System.arraycopy(C14068n.f30955a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(rVar2.f30986a, rVar2.f30987b, bArr, i8, u4);
                    if (p3 == 33 && i7 == 0) {
                        str = C15588c1.m25276E(new C14078s(bArr, i8, i8 + u4));
                    }
                    i5 = i8 + u4;
                    rVar2.mo46909A(u4);
                }
            }
            return new C14148d(i2 == 0 ? null : Collections.singletonList(bArr), p + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
