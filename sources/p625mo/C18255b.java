package p625mo;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import com.linkedin.android.litr.exception.TrackTranscoderException;
import java.nio.ByteBuffer;
import p577go.C17803a;
import p577go.C17804b;
import p600jo.C18042c;
import p600jo.C18043d;
import p617lo.C18213d;

/* renamed from: mo.b */
public final class C18255b extends C18256c {

    /* renamed from: m */
    public ByteBuffer f40013m;

    /* renamed from: n */
    public MediaCodec.BufferInfo f40014n;

    /* renamed from: o */
    public int f40015o;

    public C18255b(C18042c cVar, int i, C18043d dVar, int i2) {
        super(i, i2, (MediaFormat) null, (C17803a) null, (C17804b) null, cVar, dVar, (C18213d) null);
    }

    /* renamed from: b */
    public final void mo69801b() {
    }

    /* renamed from: c */
    public final void mo69802c() {
    }

    /* renamed from: d */
    public final int mo69798d() {
        int i = this.f40015o;
        if (i == 3) {
            return i;
        }
        if (!this.f40024i) {
            MediaFormat h = this.f40016a.mo69606h(this.f40022g);
            this.f40025j = h;
            long j = this.f40026k;
            if (j > 0) {
                h.setLong("durationUs", j);
            }
            this.f40023h = this.f40017b.mo69611b(this.f40023h, this.f40025j);
            this.f40024i = true;
            this.f40013m = ByteBuffer.allocate(this.f40025j.containsKey("max-input-size") ? this.f40025j.getInteger("max-input-size") : 1048576);
            this.f40015o = 1;
            return 1;
        }
        int c = this.f40016a.mo69600c();
        if (c == -1 || c == this.f40022g) {
            this.f40015o = 2;
            int g = this.f40016a.mo69604g(this.f40013m);
            long d = this.f40016a.mo69601d();
            int j2 = this.f40016a.mo69608j();
            if (g < 0 || (j2 & 4) != 0) {
                this.f40013m.clear();
                this.f40027l = 1.0f;
                this.f40015o = 3;
                Log.d("b", "Reach EoS on input stream");
            } else {
                this.f40021f.getClass();
                if (d >= Long.MAX_VALUE) {
                    this.f40013m.clear();
                    this.f40027l = 1.0f;
                    MediaCodec.BufferInfo bufferInfo = this.f40014n;
                    this.f40021f.getClass();
                    bufferInfo.set(0, 0, d - 0, this.f40014n.flags | 4);
                    this.f40017b.mo69612c(this.f40023h, this.f40013m, this.f40014n);
                    mo69803a();
                    this.f40015o = 3;
                    Log.d("b", "Reach selection end on input stream");
                } else {
                    this.f40021f.getClass();
                    if (d >= 0) {
                        int i2 = (j2 & 1) != 0 ? 1 : 0;
                        this.f40021f.getClass();
                        long j3 = d - 0;
                        long j4 = this.f40026k;
                        if (j4 > 0) {
                            this.f40027l = ((float) j3) / ((float) j4);
                        }
                        this.f40014n.set(0, g, j3, i2);
                        this.f40017b.mo69612c(this.f40023h, this.f40013m, this.f40014n);
                    }
                    this.f40016a.mo69599b();
                }
            }
            return this.f40015o;
        }
        this.f40015o = 2;
        return 2;
    }

    /* renamed from: e */
    public final void mo69799e() throws TrackTranscoderException {
        this.f40016a.mo69607i(this.f40022g);
        this.f40014n = new MediaCodec.BufferInfo();
    }

    /* renamed from: f */
    public final void mo69800f() {
        ByteBuffer byteBuffer = this.f40013m;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.f40013m = null;
        }
    }
}
