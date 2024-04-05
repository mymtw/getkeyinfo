package p504ai;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p513bj.C14058i;

/* renamed from: ai.f */
public final class C13980f extends MediaCodec.Callback {

    /* renamed from: a */
    public final Object f30729a = new Object();

    /* renamed from: b */
    public final HandlerThread f30730b;

    /* renamed from: c */
    public Handler f30731c;

    /* renamed from: d */
    public final C14058i f30732d;

    /* renamed from: e */
    public final C14058i f30733e;

    /* renamed from: f */
    public final ArrayDeque<MediaCodec.BufferInfo> f30734f;

    /* renamed from: g */
    public final ArrayDeque<MediaFormat> f30735g;

    /* renamed from: h */
    public MediaFormat f30736h;

    /* renamed from: i */
    public MediaFormat f30737i;

    /* renamed from: j */
    public MediaCodec.CodecException f30738j;

    /* renamed from: k */
    public long f30739k;

    /* renamed from: l */
    public boolean f30740l;

    /* renamed from: m */
    public IllegalStateException f30741m;

    public C13980f(HandlerThread handlerThread) {
        this.f30730b = handlerThread;
        this.f30732d = new C14058i();
        this.f30733e = new C14058i();
        this.f30734f = new ArrayDeque<>();
        this.f30735g = new ArrayDeque<>();
    }

    /* renamed from: a */
    public final void mo46790a() {
        if (!this.f30735g.isEmpty()) {
            this.f30737i = this.f30735g.getLast();
        }
        C14058i iVar = this.f30732d;
        iVar.f30934a = 0;
        iVar.f30935b = -1;
        iVar.f30936c = 0;
        C14058i iVar2 = this.f30733e;
        iVar2.f30934a = 0;
        iVar2.f30935b = -1;
        iVar2.f30936c = 0;
        this.f30734f.clear();
        this.f30735g.clear();
        this.f30738j = null;
    }

    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f30729a) {
            this.f30738j = codecException;
        }
    }

    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f30729a) {
            this.f30732d.mo46880a(i);
        }
    }

    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f30729a) {
            MediaFormat mediaFormat = this.f30737i;
            if (mediaFormat != null) {
                this.f30733e.mo46880a(-2);
                this.f30735g.add(mediaFormat);
                this.f30737i = null;
            }
            this.f30733e.mo46880a(i);
            this.f30734f.add(bufferInfo);
        }
    }

    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f30729a) {
            this.f30733e.mo46880a(-2);
            this.f30735g.add(mediaFormat);
            this.f30737i = null;
        }
    }
}
