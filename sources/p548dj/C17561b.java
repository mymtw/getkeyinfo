package p548dj;

import com.google.android.exoplayer2.C14177a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;
import p513bj.C14049b0;
import p513bj.C14077r;

/* renamed from: dj.b */
public final class C17561b extends C14177a {

    /* renamed from: b */
    public final DecoderInputBuffer f38393b = new DecoderInputBuffer(1);

    /* renamed from: c */
    public final C14077r f38394c = new C14077r();

    /* renamed from: d */
    public long f38395d;

    /* renamed from: e */
    public C17560a f38396e;

    /* renamed from: f */
    public long f38397f;

    public C17561b() {
        super(6);
    }

    public final String getName() {
        return "CameraMotionRenderer";
    }

    public final void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i == 7) {
            this.f38396e = (C17560a) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    public final boolean isEnded() {
        return hasReadStreamToEnd();
    }

    public final boolean isReady() {
        return true;
    }

    public final void onDisabled() {
        C17560a aVar = this.f38396e;
        if (aVar != null) {
            aVar.mo68898c();
        }
    }

    public final void onPositionReset(long j, boolean z) {
        this.f38397f = Long.MIN_VALUE;
        C17560a aVar = this.f38396e;
        if (aVar != null) {
            aVar.mo68898c();
        }
    }

    public final void onStreamChanged(Format[] formatArr, long j, long j2) {
        this.f38395d = j2;
    }

    public final void render(long j, long j2) {
        float[] fArr;
        while (!hasReadStreamToEnd() && this.f38397f < 100000 + j) {
            this.f38393b.mo46795j();
            if (readSource(getFormatHolder(), this.f38393b, 0) == -4 && !this.f38393b.mo69761h(4)) {
                DecoderInputBuffer decoderInputBuffer = this.f38393b;
                this.f38397f = decoderInputBuffer.f31495f;
                if (this.f38396e != null && !decoderInputBuffer.mo69762i()) {
                    this.f38393b.mo47272m();
                    ByteBuffer byteBuffer = this.f38393b.f31493d;
                    int i = C14049b0.f30913a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        this.f38394c.mo46933x(byteBuffer.limit(), byteBuffer.array());
                        this.f38394c.mo46935z(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(this.f38394c.mo46914e());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f38396e.mo68897b(this.f38397f - this.f38395d, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final int supportsFormat(Format format) {
        return "application/x-camera-motion".equals(format.sampleMimeType) ? 4 : 0;
    }
}
