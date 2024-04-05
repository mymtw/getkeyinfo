package com.google.android.exoplayer2.extractor.flv;

import android.support.p013v4.media.C0072d;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.Collections;
import p513bj.C14076q;
import p513bj.C14077r;
import p611lh.C18162a;
import p644ph.C18368v;

/* renamed from: com.google.android.exoplayer2.extractor.flv.a */
public final class C14232a extends TagPayloadReader {

    /* renamed from: e */
    public static final int[] f31585e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f31586b;

    /* renamed from: c */
    public boolean f31587c;

    /* renamed from: d */
    public int f31588d;

    public C14232a(C18368v vVar) {
        super(vVar);
    }

    /* renamed from: a */
    public final boolean mo47349a(C14077r rVar) throws TagPayloadReader.UnsupportedFormatException {
        if (!this.f31586b) {
            int p = rVar.mo46925p();
            int i = (p >> 4) & 15;
            this.f31588d = i;
            if (i == 2) {
                int i2 = f31585e[(p >> 2) & 3];
                Format.C14176b bVar = new Format.C14176b();
                bVar.f31303k = "audio/mpeg";
                bVar.f31316x = 1;
                bVar.f31317y = i2;
                this.f31584a.mo47752a(bVar.mo47144a());
                this.f31587c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                Format.C14176b bVar2 = new Format.C14176b();
                bVar2.f31303k = str;
                bVar2.f31316x = 1;
                bVar2.f31317y = 8000;
                this.f31584a.mo47752a(bVar2.mo47144a());
                this.f31587c = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException(C0072d.m200g(39, "Audio format not supported: ", this.f31588d));
            }
            this.f31586b = true;
        } else {
            rVar.mo46909A(1);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo47350b(C14077r rVar, long j) throws ParserException {
        if (this.f31588d == 2) {
            int i = rVar.f30988c - rVar.f30987b;
            this.f31584a.mo69899d(i, rVar);
            this.f31584a.mo47754c(j, 1, i, 0, (C18368v.C18369a) null);
            return true;
        }
        int p = rVar.mo46925p();
        if (p == 0 && !this.f31587c) {
            int i2 = rVar.f30988c - rVar.f30987b;
            byte[] bArr = new byte[i2];
            rVar.mo46911b(0, i2, bArr);
            C18162a.C18163a c = C18162a.m30677c(new C14076q(i2, bArr), false);
            Format.C14176b bVar = new Format.C14176b();
            bVar.f31303k = "audio/mp4a-latm";
            bVar.f31300h = c.f39727c;
            bVar.f31316x = c.f39726b;
            bVar.f31317y = c.f39725a;
            bVar.f31305m = Collections.singletonList(bArr);
            this.f31584a.mo47752a(bVar.mo47144a());
            this.f31587c = true;
            return false;
        } else if (this.f31588d == 10 && p != 1) {
            return false;
        } else {
            int i3 = rVar.f30988c - rVar.f30987b;
            this.f31584a.mo69899d(i3, rVar);
            this.f31584a.mo47754c(j, 1, i3, 0, (C18368v.C18369a) null);
            return true;
        }
    }
}
