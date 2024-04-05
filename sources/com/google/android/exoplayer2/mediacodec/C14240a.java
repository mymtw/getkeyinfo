package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.room.C3251q;
import androidx.room.C3253s;
import com.google.android.exoplayer2.mediacodec.C14242b;
import com.google.common.base.C15804s;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import p504ai.C13974a;
import p504ai.C13975b;
import p504ai.C13976c;
import p504ai.C13977d;
import p504ai.C13978e;
import p504ai.C13980f;
import p513bj.C14049b0;
import p513bj.C14075p;
import p619mh.C18220b;

/* renamed from: com.google.android.exoplayer2.mediacodec.a */
public final class C14240a implements C14242b {

    /* renamed from: a */
    public final MediaCodec f31677a;

    /* renamed from: b */
    public final C13980f f31678b;

    /* renamed from: c */
    public final C13978e f31679c;

    /* renamed from: d */
    public final boolean f31680d;

    /* renamed from: e */
    public boolean f31681e;

    /* renamed from: f */
    public int f31682f = 0;

    /* renamed from: com.google.android.exoplayer2.mediacodec.a$a */
    public static final class C14241a implements C14242b.C14244b {

        /* renamed from: b */
        public final C15804s<HandlerThread> f31683b;

        /* renamed from: c */
        public final C15804s<HandlerThread> f31684c;

        /* renamed from: d */
        public final boolean f31685d;

        /* renamed from: e */
        public final boolean f31686e;

        public C14241a(int i, boolean z, boolean z2) {
            C13975b bVar = new C13975b(i);
            C13976c cVar = new C13976c(i);
            this.f31683b = bVar;
            this.f31684c = cVar;
            this.f31685d = z;
            this.f31686e = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.android.exoplayer2.mediacodec.C14240a mo47397a(com.google.android.exoplayer2.mediacodec.C14242b.C14243a r10) throws java.io.IOException {
            /*
                r9 = this;
                com.google.android.exoplayer2.mediacodec.c r0 = r10.f31687a
                java.lang.String r0 = r0.f31692a
                r1 = 0
                java.lang.String r2 = "createCodec:"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0083 }
                int r4 = r3.length()     // Catch:{ Exception -> 0x0083 }
                if (r4 == 0) goto L_0x0016
                java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0083 }
                goto L_0x001c
            L_0x0016:
                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0083 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x0083 }
                r2 = r3
            L_0x001c:
                p513bj.C14075p.m21690b(r2)     // Catch:{ Exception -> 0x0083 }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0083 }
                com.google.android.exoplayer2.mediacodec.a r2 = new com.google.android.exoplayer2.mediacodec.a     // Catch:{ Exception -> 0x0081 }
                com.google.common.base.s<android.os.HandlerThread> r3 = r9.f31683b     // Catch:{ Exception -> 0x0081 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0081 }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0081 }
                com.google.common.base.s<android.os.HandlerThread> r3 = r9.f31684c     // Catch:{ Exception -> 0x0081 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0081 }
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0081 }
                boolean r7 = r9.f31685d     // Catch:{ Exception -> 0x0081 }
                boolean r8 = r9.f31686e     // Catch:{ Exception -> 0x0081 }
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0081 }
                p513bj.C14075p.m21699k()     // Catch:{ Exception -> 0x007e }
                java.lang.String r1 = "configureCodec"
                p513bj.C14075p.m21690b(r1)     // Catch:{ Exception -> 0x007e }
                android.media.MediaFormat r1 = r10.f31688b     // Catch:{ Exception -> 0x007e }
                android.view.Surface r3 = r10.f31689c     // Catch:{ Exception -> 0x007e }
                android.media.MediaCrypto r10 = r10.f31690d     // Catch:{ Exception -> 0x007e }
                com.google.android.exoplayer2.mediacodec.C14240a.m22280n(r2, r1, r3, r10)     // Catch:{ Exception -> 0x007e }
                p513bj.C14075p.m21699k()     // Catch:{ Exception -> 0x007e }
                java.lang.String r10 = "startCodec"
                p513bj.C14075p.m21690b(r10)     // Catch:{ Exception -> 0x007e }
                ai.e r10 = r2.f31679c     // Catch:{ Exception -> 0x007e }
                boolean r1 = r10.f30722g     // Catch:{ Exception -> 0x007e }
                if (r1 != 0) goto L_0x0074
                android.os.HandlerThread r1 = r10.f30717b     // Catch:{ Exception -> 0x007e }
                r1.start()     // Catch:{ Exception -> 0x007e }
                ai.d r1 = new ai.d     // Catch:{ Exception -> 0x007e }
                android.os.HandlerThread r3 = r10.f30717b     // Catch:{ Exception -> 0x007e }
                android.os.Looper r3 = r3.getLooper()     // Catch:{ Exception -> 0x007e }
                r1.<init>(r10, r3)     // Catch:{ Exception -> 0x007e }
                r10.f30718c = r1     // Catch:{ Exception -> 0x007e }
                r1 = 1
                r10.f30722g = r1     // Catch:{ Exception -> 0x007e }
            L_0x0074:
                r0.start()     // Catch:{ Exception -> 0x007e }
                r10 = 2
                r2.f31682f = r10     // Catch:{ Exception -> 0x007e }
                p513bj.C14075p.m21699k()     // Catch:{ Exception -> 0x007e }
                return r2
            L_0x007e:
                r10 = move-exception
                r1 = r2
                goto L_0x0085
            L_0x0081:
                r10 = move-exception
                goto L_0x0085
            L_0x0083:
                r10 = move-exception
                r0 = r1
            L_0x0085:
                if (r1 != 0) goto L_0x008d
                if (r0 == 0) goto L_0x0090
                r0.release()
                goto L_0x0090
            L_0x008d:
                r1.release()
            L_0x0090:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C14240a.C14241a.mo47397a(com.google.android.exoplayer2.mediacodec.b$a):com.google.android.exoplayer2.mediacodec.a");
        }
    }

    public C14240a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f31677a = mediaCodec;
        this.f31678b = new C13980f(handlerThread);
        this.f31679c = new C13978e(mediaCodec, handlerThread2, z);
        this.f31680d = z2;
    }

    /* renamed from: n */
    public static void m22280n(C14240a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        C13980f fVar = aVar.f31678b;
        MediaCodec mediaCodec = aVar.f31677a;
        C14075p.m21694f(fVar.f30731c == null);
        fVar.f30730b.start();
        Handler handler = new Handler(fVar.f30730b.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f30731c = handler;
        aVar.f31677a.configure(mediaFormat, surface, mediaCrypto, 0);
        aVar.f31682f = 1;
    }

    /* renamed from: o */
    public static String m22281o(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final MediaFormat mo47381a() {
        MediaFormat mediaFormat;
        C13980f fVar = this.f31678b;
        synchronized (fVar.f30729a) {
            mediaFormat = fVar.f30736h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: b */
    public final void mo47382b(C14242b.C14245c cVar, Handler handler) {
        mo47395p();
        this.f31677a.setOnFrameRenderedListener(new C13974a(this, cVar), handler);
    }

    /* renamed from: c */
    public final void mo47383c(int i, C18220b bVar, long j) {
        C13978e.C13979a aVar;
        C13978e eVar = this.f31679c;
        RuntimeException andSet = eVar.f30719d.getAndSet((Object) null);
        if (andSet == null) {
            ArrayDeque<C13978e.C13979a> arrayDeque = C13978e.f30714h;
            synchronized (arrayDeque) {
                aVar = arrayDeque.isEmpty() ? new C13978e.C13979a() : arrayDeque.removeFirst();
            }
            aVar.f30723a = i;
            aVar.f30724b = 0;
            aVar.f30725c = 0;
            aVar.f30727e = j;
            aVar.f30728f = 0;
            MediaCodec.CryptoInfo cryptoInfo = aVar.f30726d;
            cryptoInfo.numSubSamples = bVar.f39943f;
            int[] iArr = bVar.f39941d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 == null || iArr2.length < iArr.length) {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                } else {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = bVar.f39942e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 == null || iArr4.length < iArr3.length) {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                } else {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = bVar.f39939b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 == null || bArr2.length < bArr.length) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = bVar.f39938a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 == null || bArr4.length < bArr3.length) {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = bVar.f39940c;
            if (C14049b0.f30913a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f39944g, bVar.f39945h));
            }
            eVar.f30718c.obtainMessage(1, aVar).sendToTarget();
            return;
        }
        throw andSet;
    }

    /* renamed from: d */
    public final void mo47384d(int i) {
        mo47395p();
        this.f31677a.setVideoScalingMode(i);
    }

    /* renamed from: e */
    public final ByteBuffer mo47385e(int i) {
        return this.f31677a.getInputBuffer(i);
    }

    /* renamed from: f */
    public final void mo47386f(Surface surface) {
        mo47395p();
        this.f31677a.setOutputSurface(surface);
    }

    public final void flush() {
        this.f31679c.mo46789a();
        this.f31677a.flush();
        C13980f fVar = this.f31678b;
        MediaCodec mediaCodec = this.f31677a;
        Objects.requireNonNull(mediaCodec);
        C3251q qVar = new C3251q(mediaCodec, 1);
        synchronized (fVar.f30729a) {
            fVar.f30739k++;
            Handler handler = fVar.f30731c;
            int i = C14049b0.f30913a;
            handler.post(new C3253s(1, fVar, qVar));
        }
    }

    /* renamed from: g */
    public final void mo47388g(Bundle bundle) {
        mo47395p();
        this.f31677a.setParameters(bundle);
    }

    /* renamed from: h */
    public final void mo47389h(int i, long j) {
        this.f31677a.releaseOutputBuffer(i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47390i() {
        /*
            r7 = this;
            ai.f r0 = r7.f31678b
            java.lang.Object r1 = r0.f30729a
            monitor-enter(r1)
            long r2 = r0.f30739k     // Catch:{ all -> 0x0051 }
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L_0x0016
            boolean r2 = r0.f30740l     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = r4
        L_0x0017:
            r5 = -1
            if (r2 == 0) goto L_0x001c
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0042
        L_0x001c:
            java.lang.IllegalStateException r2 = r0.f30741m     // Catch:{ all -> 0x0051 }
            r6 = 0
            if (r2 != 0) goto L_0x004c
            android.media.MediaCodec$CodecException r2 = r0.f30738j     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0049
            bj.i r0 = r0.f30732d     // Catch:{ all -> 0x0051 }
            int r2 = r0.f30936c     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x002c
            r3 = r4
        L_0x002c:
            if (r3 == 0) goto L_0x002f
            goto L_0x0041
        L_0x002f:
            if (r2 == 0) goto L_0x0043
            int[] r3 = r0.f30937d     // Catch:{ all -> 0x0051 }
            int r6 = r0.f30934a     // Catch:{ all -> 0x0051 }
            r3 = r3[r6]     // Catch:{ all -> 0x0051 }
            int r6 = r6 + r4
            int r4 = r0.f30938e     // Catch:{ all -> 0x0051 }
            r4 = r4 & r6
            r0.f30934a = r4     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r5
            r0.f30936c = r2     // Catch:{ all -> 0x0051 }
            r5 = r3
        L_0x0041:
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
        L_0x0042:
            return r5
        L_0x0043:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0051 }
            r0.<init>()     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0049:
            r0.f30738j = r6     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x004c:
            r0.f30741m = r6     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            throw r0
        L_0x0051:
            r0 = move-exception
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C14240a.mo47390i():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47391j(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            ai.f r0 = r10.f31678b
            java.lang.Object r1 = r0.f30729a
            monitor-enter(r1)
            long r2 = r0.f30739k     // Catch:{ all -> 0x007b }
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L_0x0016
            boolean r2 = r0.f30740l     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = r3
            goto L_0x0017
        L_0x0016:
            r2 = r4
        L_0x0017:
            r5 = -1
            if (r2 == 0) goto L_0x001c
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x006c
        L_0x001c:
            java.lang.IllegalStateException r2 = r0.f30741m     // Catch:{ all -> 0x007b }
            r6 = 0
            if (r2 != 0) goto L_0x0076
            android.media.MediaCodec$CodecException r2 = r0.f30738j     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0073
            bj.i r2 = r0.f30733e     // Catch:{ all -> 0x007b }
            int r6 = r2.f30936c     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x002c
            r3 = r4
        L_0x002c:
            if (r3 == 0) goto L_0x0030
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x006c
        L_0x0030:
            if (r6 == 0) goto L_0x006d
            int[] r3 = r2.f30937d     // Catch:{ all -> 0x007b }
            int r7 = r2.f30934a     // Catch:{ all -> 0x007b }
            r3 = r3[r7]     // Catch:{ all -> 0x007b }
            int r7 = r7 + r4
            int r4 = r2.f30938e     // Catch:{ all -> 0x007b }
            r4 = r4 & r7
            r2.f30934a = r4     // Catch:{ all -> 0x007b }
            int r6 = r6 + r5
            r2.f30936c = r6     // Catch:{ all -> 0x007b }
            if (r3 < 0) goto L_0x005d
            android.media.MediaFormat r2 = r0.f30736h     // Catch:{ all -> 0x007b }
            p513bj.C14075p.m21696h(r2)     // Catch:{ all -> 0x007b }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f30734f     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x007b }
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch:{ all -> 0x007b }
            int r5 = r0.offset     // Catch:{ all -> 0x007b }
            int r6 = r0.size     // Catch:{ all -> 0x007b }
            long r7 = r0.presentationTimeUs     // Catch:{ all -> 0x007b }
            int r9 = r0.flags     // Catch:{ all -> 0x007b }
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch:{ all -> 0x007b }
            goto L_0x006a
        L_0x005d:
            r11 = -2
            if (r3 != r11) goto L_0x006a
            java.util.ArrayDeque<android.media.MediaFormat> r11 = r0.f30735g     // Catch:{ all -> 0x007b }
            java.lang.Object r11 = r11.remove()     // Catch:{ all -> 0x007b }
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch:{ all -> 0x007b }
            r0.f30736h = r11     // Catch:{ all -> 0x007b }
        L_0x006a:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r5 = r3
        L_0x006c:
            return r5
        L_0x006d:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException     // Catch:{ all -> 0x007b }
            r11.<init>()     // Catch:{ all -> 0x007b }
            throw r11     // Catch:{ all -> 0x007b }
        L_0x0073:
            r0.f30738j = r6     // Catch:{ all -> 0x007b }
            throw r2     // Catch:{ all -> 0x007b }
        L_0x0076:
            r0.f30741m = r6     // Catch:{ all -> 0x007b }
            throw r2     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r11
        L_0x007b:
            r11 = move-exception
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C14240a.mo47391j(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: k */
    public final void mo47392k(int i, int i2, int i3, long j) {
        C13978e.C13979a aVar;
        C13978e eVar = this.f31679c;
        RuntimeException andSet = eVar.f30719d.getAndSet((Object) null);
        if (andSet == null) {
            ArrayDeque<C13978e.C13979a> arrayDeque = C13978e.f30714h;
            synchronized (arrayDeque) {
                aVar = arrayDeque.isEmpty() ? new C13978e.C13979a() : arrayDeque.removeFirst();
            }
            aVar.f30723a = i;
            aVar.f30724b = 0;
            aVar.f30725c = i2;
            aVar.f30727e = j;
            aVar.f30728f = i3;
            C13977d dVar = eVar.f30718c;
            int i4 = C14049b0.f30913a;
            dVar.obtainMessage(0, aVar).sendToTarget();
            return;
        }
        throw andSet;
    }

    /* renamed from: l */
    public final void mo47393l(int i, boolean z) {
        this.f31677a.releaseOutputBuffer(i, z);
    }

    /* renamed from: m */
    public final ByteBuffer mo47394m(int i) {
        return this.f31677a.getOutputBuffer(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002d, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47395p() {
        /*
            r3 = this;
            boolean r0 = r3.f31680d
            if (r0 == 0) goto L_0x003a
            ai.e r0 = r3.f31679c     // Catch:{ InterruptedException -> 0x002c }
            bj.c r1 = r0.f30720e     // Catch:{ InterruptedException -> 0x002c }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x002c }
            r2 = 0
            r1.f30926a = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x002c }
            ai.d r1 = r0.f30718c     // Catch:{ InterruptedException -> 0x002c }
            int r2 = p513bj.C14049b0.f30913a     // Catch:{ InterruptedException -> 0x002c }
            r2 = 2
            android.os.Message r1 = r1.obtainMessage(r2)     // Catch:{ InterruptedException -> 0x002c }
            r1.sendToTarget()     // Catch:{ InterruptedException -> 0x002c }
            bj.c r0 = r0.f30720e     // Catch:{ InterruptedException -> 0x002c }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x002c }
        L_0x001c:
            boolean r1 = r0.f30926a     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0024
            r0.wait()     // Catch:{ all -> 0x0026 }
            goto L_0x001c
        L_0x0024:
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x002c }
            goto L_0x003a
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x002c }
            throw r1     // Catch:{ InterruptedException -> 0x002c }
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x002c }
            throw r0     // Catch:{ InterruptedException -> 0x002c }
        L_0x002c:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C14240a.mo47395p():void");
    }

    public final void release() {
        try {
            if (this.f31682f == 2) {
                C13978e eVar = this.f31679c;
                if (eVar.f30722g) {
                    eVar.mo46789a();
                    eVar.f30717b.quit();
                }
                eVar.f30722g = false;
            }
            int i = this.f31682f;
            if (i == 1 || i == 2) {
                C13980f fVar = this.f31678b;
                synchronized (fVar.f30729a) {
                    fVar.f30740l = true;
                    fVar.f30730b.quit();
                    fVar.mo46790a();
                }
            }
            this.f31682f = 3;
            if (!this.f31681e) {
                this.f31677a.release();
                this.f31681e = true;
            }
        } catch (Throwable th) {
            if (!this.f31681e) {
                this.f31677a.release();
                this.f31681e = true;
            }
            throw th;
        }
    }
}
