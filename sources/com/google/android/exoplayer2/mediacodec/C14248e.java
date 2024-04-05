package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.C14242b;
import java.io.IOException;
import java.nio.ByteBuffer;
import p504ai.C13989o;
import p513bj.C14049b0;
import p513bj.C14075p;
import p619mh.C18220b;

/* renamed from: com.google.android.exoplayer2.mediacodec.e */
public final class C14248e implements C14242b {

    /* renamed from: a */
    public final MediaCodec f31700a;

    /* renamed from: b */
    public ByteBuffer[] f31701b;

    /* renamed from: c */
    public ByteBuffer[] f31702c;

    /* renamed from: com.google.android.exoplayer2.mediacodec.e$a */
    public static class C14249a implements C14242b.C14244b {
        /* renamed from: b */
        public static MediaCodec m22333b(C14242b.C14243a aVar) throws IOException {
            aVar.f31687a.getClass();
            String str = aVar.f31687a.f31692a;
            String valueOf = String.valueOf(str);
            C14075p.m21690b(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            C14075p.m21699k();
            return createByCodecName;
        }

        /* renamed from: a */
        public final C14242b mo47397a(C14242b.C14243a aVar) throws IOException {
            MediaCodec mediaCodec = null;
            try {
                mediaCodec = m22333b(aVar);
                C14075p.m21690b("configureCodec");
                mediaCodec.configure(aVar.f31688b, aVar.f31689c, aVar.f31690d, 0);
                C14075p.m21699k();
                C14075p.m21690b("startCodec");
                mediaCodec.start();
                C14075p.m21699k();
                return new C14248e(mediaCodec);
            } catch (IOException | RuntimeException e) {
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        }
    }

    public C14248e(MediaCodec mediaCodec) {
        this.f31700a = mediaCodec;
        if (C14049b0.f30913a < 21) {
            this.f31701b = mediaCodec.getInputBuffers();
            this.f31702c = mediaCodec.getOutputBuffers();
        }
    }

    /* renamed from: a */
    public final MediaFormat mo47381a() {
        return this.f31700a.getOutputFormat();
    }

    /* renamed from: b */
    public final void mo47382b(C14242b.C14245c cVar, Handler handler) {
        this.f31700a.setOnFrameRenderedListener(new C13989o(this, cVar), handler);
    }

    /* renamed from: c */
    public final void mo47383c(int i, C18220b bVar, long j) {
        this.f31700a.queueSecureInputBuffer(i, 0, bVar.f39946i, j, 0);
    }

    /* renamed from: d */
    public final void mo47384d(int i) {
        this.f31700a.setVideoScalingMode(i);
    }

    /* renamed from: e */
    public final ByteBuffer mo47385e(int i) {
        return C14049b0.f30913a >= 21 ? this.f31700a.getInputBuffer(i) : this.f31701b[i];
    }

    /* renamed from: f */
    public final void mo47386f(Surface surface) {
        this.f31700a.setOutputSurface(surface);
    }

    public final void flush() {
        this.f31700a.flush();
    }

    /* renamed from: g */
    public final void mo47388g(Bundle bundle) {
        this.f31700a.setParameters(bundle);
    }

    /* renamed from: h */
    public final void mo47389h(int i, long j) {
        this.f31700a.releaseOutputBuffer(i, j);
    }

    /* renamed from: i */
    public final int mo47390i() {
        return this.f31700a.dequeueInputBuffer(0);
    }

    /* renamed from: j */
    public final int mo47391j(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f31700a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && C14049b0.f30913a < 21) {
                this.f31702c = this.f31700a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    /* renamed from: k */
    public final void mo47392k(int i, int i2, int i3, long j) {
        this.f31700a.queueInputBuffer(i, 0, i2, j, i3);
    }

    /* renamed from: l */
    public final void mo47393l(int i, boolean z) {
        this.f31700a.releaseOutputBuffer(i, z);
    }

    /* renamed from: m */
    public final ByteBuffer mo47394m(int i) {
        return C14049b0.f30913a >= 21 ? this.f31700a.getOutputBuffer(i) : this.f31702c[i];
    }

    public final void release() {
        this.f31701b = null;
        this.f31702c = null;
        this.f31700a.release();
    }
}
