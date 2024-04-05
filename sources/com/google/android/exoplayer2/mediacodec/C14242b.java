package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.C14248e;
import java.io.IOException;
import java.nio.ByteBuffer;
import p619mh.C18220b;

/* renamed from: com.google.android.exoplayer2.mediacodec.b */
public interface C14242b {

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$a */
    public static final class C14243a {

        /* renamed from: a */
        public final C14246c f31687a;

        /* renamed from: b */
        public final MediaFormat f31688b;

        /* renamed from: c */
        public final Surface f31689c;

        /* renamed from: d */
        public final MediaCrypto f31690d;

        public C14243a(C14246c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
            this.f31687a = cVar;
            this.f31688b = mediaFormat;
            this.f31689c = surface;
            this.f31690d = mediaCrypto;
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$b */
    public interface C14244b {

        /* renamed from: a */
        public static final C14248e.C14249a f31691a = new C14248e.C14249a();

        /* renamed from: a */
        C14242b mo47397a(C14243a aVar) throws IOException;
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$c */
    public interface C14245c {
    }

    /* renamed from: a */
    MediaFormat mo47381a();

    /* renamed from: b */
    void mo47382b(C14245c cVar, Handler handler);

    /* renamed from: c */
    void mo47383c(int i, C18220b bVar, long j);

    /* renamed from: d */
    void mo47384d(int i);

    /* renamed from: e */
    ByteBuffer mo47385e(int i);

    /* renamed from: f */
    void mo47386f(Surface surface);

    void flush();

    /* renamed from: g */
    void mo47388g(Bundle bundle);

    /* renamed from: h */
    void mo47389h(int i, long j);

    /* renamed from: i */
    int mo47390i();

    /* renamed from: j */
    int mo47391j(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: k */
    void mo47392k(int i, int i2, int i3, long j);

    /* renamed from: l */
    void mo47393l(int i, boolean z);

    /* renamed from: m */
    ByteBuffer mo47394m(int i);

    void release();
}
