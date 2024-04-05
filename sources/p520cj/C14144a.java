package p520cj;

import com.google.android.exoplayer2.ParserException;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import java.util.List;
import p513bj.C14068n;
import p513bj.C14077r;

/* renamed from: cj.a */
public final class C14144a {

    /* renamed from: a */
    public final List<byte[]> f31159a;

    /* renamed from: b */
    public final int f31160b;

    /* renamed from: c */
    public final int f31161c;

    /* renamed from: d */
    public final int f31162d;

    /* renamed from: e */
    public final float f31163e;

    /* renamed from: f */
    public final String f31164f;

    public C14144a(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.f31159a = arrayList;
        this.f31160b = i;
        this.f31161c = i2;
        this.f31162d = i3;
        this.f31163e = f;
        this.f31164f = str;
    }

    /* renamed from: a */
    public static C14144a m21898a(C14077r rVar) throws ParserException {
        String str;
        float f;
        int i;
        int i2;
        try {
            rVar.mo46909A(4);
            int p = (rVar.mo46925p() & 3) + 1;
            if (p != 3) {
                ArrayList arrayList = new ArrayList();
                int p2 = rVar.mo46925p() & 31;
                for (int i3 = 0; i3 < p2; i3++) {
                    int u = rVar.mo46930u();
                    int i4 = rVar.f30987b;
                    rVar.mo46909A(u);
                    byte[] bArr = rVar.f30986a;
                    byte[] bArr2 = new byte[(u + 4)];
                    System.arraycopy(C15588c1.f35077c, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i4, bArr2, 4, u);
                    arrayList.add(bArr2);
                }
                int p3 = rVar.mo46925p();
                for (int i5 = 0; i5 < p3; i5++) {
                    int u2 = rVar.mo46930u();
                    int i6 = rVar.f30987b;
                    rVar.mo46909A(u2);
                    byte[] bArr3 = rVar.f30986a;
                    byte[] bArr4 = new byte[(u2 + 4)];
                    System.arraycopy(C15588c1.f35077c, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i6, bArr4, 4, u2);
                    arrayList.add(bArr4);
                }
                if (p2 > 0) {
                    C14068n.C14070b d = C14068n.m21685d(p, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i7 = d.f30966e;
                    int i8 = d.f30967f;
                    float f2 = d.f30968g;
                    str = C15588c1.m25274D(d.f30962a, d.f30963b, d.f30964c);
                    i2 = i7;
                    i = i8;
                    f = f2;
                } else {
                    f = 1.0f;
                    str = null;
                    i2 = -1;
                    i = -1;
                }
                return new C14144a(arrayList, p, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }
}
