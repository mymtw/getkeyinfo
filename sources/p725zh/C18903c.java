package p725zh;

import android.util.Log;
import java.io.IOException;
import p513bj.C14049b0;
import p513bj.C14075p;
import p513bj.C14077r;
import p644ph.C18346e;

/* renamed from: zh.c */
public final class C18903c {

    /* renamed from: zh.c$a */
    public static final class C18904a {

        /* renamed from: a */
        public final int f42110a;

        /* renamed from: b */
        public final long f42111b;

        public C18904a(int i, long j) {
            this.f42110a = i;
            this.f42111b = j;
        }

        /* renamed from: a */
        public static C18904a m32001a(C18346e eVar, C14077r rVar) throws IOException {
            eVar.mo69872c(rVar.f30986a, 0, 8, false);
            rVar.mo46935z(0);
            return new C18904a(rVar.mo46912c(), rVar.mo46916g());
        }
    }

    /* renamed from: a */
    public static C18902b m32000a(C18346e eVar) throws IOException {
        byte[] bArr;
        C14077r rVar = new C14077r(16);
        if (C18904a.m32001a(eVar, rVar).f42110a != 1380533830) {
            return null;
        }
        eVar.mo69872c(rVar.f30986a, 0, 4, false);
        rVar.mo46935z(0);
        int c = rVar.mo46912c();
        if (c != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(c);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        C18904a a = C18904a.m32001a(eVar, rVar);
        while (a.f42110a != 1718449184) {
            eVar.mo69880k((int) a.f42111b, false);
            a = C18904a.m32001a(eVar, rVar);
        }
        C14075p.m21694f(a.f42111b >= 16);
        eVar.mo69872c(rVar.f30986a, 0, 16, false);
        rVar.mo46935z(0);
        int i = rVar.mo46918i();
        int i2 = rVar.mo46918i();
        int h = rVar.mo46917h();
        rVar.mo46917h();
        int i3 = rVar.mo46918i();
        int i4 = rVar.mo46918i();
        int i5 = ((int) a.f42111b) - 16;
        if (i5 > 0) {
            byte[] bArr2 = new byte[i5];
            eVar.mo69872c(bArr2, 0, i5, false);
            bArr = bArr2;
        } else {
            bArr = C14049b0.f30918f;
        }
        return new C18902b(i, i2, h, i3, i4, bArr);
    }
}
