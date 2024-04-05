package com.google.android.exoplayer2.extractor.flv;

import android.support.p013v4.media.C0072d;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import p513bj.C14068n;
import p513bj.C14077r;
import p520cj.C14144a;
import p644ph.C18368v;

/* renamed from: com.google.android.exoplayer2.extractor.flv.b */
public final class C14233b extends TagPayloadReader {

    /* renamed from: b */
    public final C14077r f31589b = new C14077r(C14068n.f30955a);

    /* renamed from: c */
    public final C14077r f31590c = new C14077r(4);

    /* renamed from: d */
    public int f31591d;

    /* renamed from: e */
    public boolean f31592e;

    /* renamed from: f */
    public boolean f31593f;

    /* renamed from: g */
    public int f31594g;

    public C14233b(C18368v vVar) {
        super(vVar);
    }

    /* renamed from: a */
    public final boolean mo47351a(C14077r rVar) throws TagPayloadReader.UnsupportedFormatException {
        int p = rVar.mo46925p();
        int i = (p >> 4) & 15;
        int i2 = p & 15;
        if (i2 == 7) {
            this.f31594g = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException(C0072d.m200g(39, "Video format not supported: ", i2));
    }

    /* renamed from: b */
    public final boolean mo47352b(C14077r rVar, long j) throws ParserException {
        int p = rVar.mo46925p();
        byte[] bArr = rVar.f30986a;
        int i = rVar.f30987b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        rVar.f30987b = i4;
        long j2 = (((long) ((bArr[i3] & 255) | b)) * 1000) + j;
        if (p == 0 && !this.f31592e) {
            C14077r rVar2 = new C14077r(new byte[(rVar.f30988c - i4)]);
            rVar.mo46911b(0, rVar.f30988c - rVar.f30987b, rVar2.f30986a);
            C14144a a = C14144a.m21898a(rVar2);
            this.f31591d = a.f31160b;
            Format.C14176b bVar = new Format.C14176b();
            bVar.f31303k = "video/avc";
            bVar.f31300h = a.f31164f;
            bVar.f31308p = a.f31161c;
            bVar.f31309q = a.f31162d;
            bVar.f31312t = a.f31163e;
            bVar.f31305m = a.f31159a;
            this.f31584a.mo47752a(bVar.mo47144a());
            this.f31592e = true;
            return false;
        } else if (p != 1 || !this.f31592e) {
            return false;
        } else {
            int i5 = this.f31594g == 1 ? 1 : 0;
            if (!this.f31593f && i5 == 0) {
                return false;
            }
            byte[] bArr2 = this.f31590c.f30986a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i6 = 4 - this.f31591d;
            int i7 = 0;
            while (rVar.f30988c - rVar.f30987b > 0) {
                rVar.mo46911b(i6, this.f31591d, this.f31590c.f30986a);
                this.f31590c.mo46935z(0);
                int s = this.f31590c.mo46928s();
                this.f31589b.mo46935z(0);
                this.f31584a.mo69899d(4, this.f31589b);
                this.f31584a.mo69899d(s, rVar);
                i7 = i7 + 4 + s;
            }
            this.f31584a.mo47754c(j2, i5, i7, 0, (C18368v.C18369a) null);
            this.f31593f = true;
            return true;
        }
    }
}
