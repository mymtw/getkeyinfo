package p612li;

import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.hls.C14313f;
import java.io.IOException;
import java.util.Arrays;
import p505aj.C13999g;
import p505aj.C14002i;
import p513bj.C14049b0;

/* renamed from: li.c */
public abstract class C18187c extends C18186b {

    /* renamed from: j */
    public byte[] f39834j;

    /* renamed from: k */
    public volatile boolean f39835k;

    public C18187c(C13999g gVar, C14002i iVar, Format format, int i, Object obj, byte[] bArr) {
        super(gVar, iVar, 3, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        C18187c cVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C14049b0.f30918f;
            cVar = this;
        } else {
            cVar = this;
            bArr2 = bArr;
        }
        cVar.f39834j = bArr2;
    }

    /* renamed from: a */
    public final void mo47727a() throws IOException {
        try {
            this.f39833i.mo46812b(this.f39826b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f39835k) {
                byte[] bArr = this.f39834j;
                if (bArr.length < i2 + PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) {
                    this.f39834j = Arrays.copyOf(bArr, bArr.length + PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
                }
                i = this.f39833i.read(this.f39834j, i2, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f39835k) {
                ((C14313f.C14314a) this).f31885l = Arrays.copyOf(this.f39834j, i2);
            }
        } finally {
            C14049b0.m21634g(this.f39833i);
        }
    }

    /* renamed from: b */
    public final void mo47728b() {
        this.f39835k = true;
    }
}
