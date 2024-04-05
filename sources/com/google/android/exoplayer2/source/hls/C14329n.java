package com.google.android.exoplayer2.source.hls;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p513bj.C14077r;
import p513bj.C14086y;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18363s;
import p644ph.C18364t;
import p644ph.C18368v;
import p710xi.C18777g;
import p710xi.C18783i;

/* renamed from: com.google.android.exoplayer2.source.hls.n */
public final class C14329n implements C18349h {

    /* renamed from: g */
    public static final Pattern f32010g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f32011h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    public final String f32012a;

    /* renamed from: b */
    public final C14086y f32013b;

    /* renamed from: c */
    public final C14077r f32014c = new C14077r();

    /* renamed from: d */
    public C18351j f32015d;

    /* renamed from: e */
    public byte[] f32016e = new byte[RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE];

    /* renamed from: f */
    public int f32017f;

    public C14329n(String str, C14086y yVar) {
        this.f32012a = str;
        this.f32013b = yVar;
    }

    /* renamed from: a */
    public final int mo47757a(C18350i iVar, C18363s sVar) throws IOException {
        Matcher matcher;
        String d;
        this.f32015d.getClass();
        C18346e eVar = (C18346e) iVar;
        int i = (int) eVar.f40293c;
        int i2 = this.f32017f;
        byte[] bArr = this.f32016e;
        if (i2 == bArr.length) {
            this.f32016e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f32016e;
        int i3 = this.f32017f;
        int read = eVar.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.f32017f + read;
            this.f32017f = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        C14077r rVar = new C14077r(this.f32016e);
        C18783i.m31694d(rVar);
        long j = 0;
        long j2 = 0;
        for (String d2 = rVar.mo46913d(); !TextUtils.isEmpty(d2); d2 = rVar.mo46913d()) {
            if (d2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher2 = f32010g.matcher(d2);
                if (!matcher2.find()) {
                    throw new ParserException(d2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(d2) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher3 = f32011h.matcher(d2);
                if (!matcher3.find()) {
                    throw new ParserException(d2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(d2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                String group = matcher2.group(1);
                group.getClass();
                j2 = C18783i.m31693c(group);
                String group2 = matcher3.group(1);
                group2.getClass();
                j = (Long.parseLong(group2) * 1000000) / 90000;
            }
        }
        while (true) {
            String d3 = rVar.mo46913d();
            if (d3 == null) {
                matcher = null;
                break;
            } else if (C18783i.f41650a.matcher(d3).matches()) {
                do {
                    d = rVar.mo46913d();
                    if (d == null) {
                        break;
                    }
                } while (d.isEmpty());
            } else {
                matcher = C18777g.f41624a.matcher(d3);
                if (matcher.matches()) {
                    break;
                }
            }
        }
        if (matcher == null) {
            mo47760d(0);
        } else {
            String group3 = matcher.group(1);
            group3.getClass();
            long c = C18783i.m31693c(group3);
            long b = this.f32013b.mo46958b(((((j + c) - j2) * 90000) / 1000000) % 8589934592L);
            C18368v d4 = mo47760d(b - c);
            this.f32014c.mo46933x(this.f32017f, this.f32016e);
            d4.mo69899d(this.f32017f, this.f32014c);
            d4.mo47754c(b, 1, this.f32017f, 0, (C18368v.C18369a) null);
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f32015d = jVar;
        jVar.mo4162l(new C18364t.C18366b(-9223372036854775807L));
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        throw new IllegalStateException();
    }

    @RequiresNonNull({"output"})
    /* renamed from: d */
    public final C18368v mo47760d(long j) {
        C18368v r = this.f32015d.mo4164r(0, 3);
        Format.C14176b bVar = new Format.C14176b();
        bVar.f31303k = "text/vtt";
        bVar.f31295c = this.f32012a;
        bVar.f31307o = j;
        r.mo47752a(bVar.mo47144a());
        this.f32015d.mo4163p();
        return r;
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        C18346e eVar = (C18346e) iVar;
        eVar.mo69872c(this.f32016e, 0, 6, false);
        this.f32014c.mo46933x(6, this.f32016e);
        if (C18783i.m31691a(this.f32014c)) {
            return true;
        }
        eVar.mo69872c(this.f32016e, 6, 3, false);
        this.f32014c.mo46933x(9, this.f32016e);
        return C18783i.m31691a(this.f32014c);
    }

    public final void release() {
    }
}
