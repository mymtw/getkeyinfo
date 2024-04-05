package com.google.android.exoplayer2.audio;

import android.app.UiModeManager;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.etsy.android.lib.util.C8912k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.C14242b;
import com.google.android.exoplayer2.mediacodec.C14246c;
import com.google.android.exoplayer2.mediacodec.C14247d;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p030bo.app.C3673f7;
import p427qb.C13281a;
import p504ai.C13988n;
import p513bj.C14049b0;
import p513bj.C14064l;
import p513bj.C14075p;
import p594jh.C17904d1;
import p594jh.C17921i1;
import p594jh.C17948m0;
import p594jh.C17986y0;
import p611lh.C18167d;
import p611lh.C18171h;
import p611lh.C18172i;
import p611lh.C18173j;
import p611lh.C18174k;
import p611lh.C18179o;
import p619mh.C18223d;
import p619mh.C18224e;

/* renamed from: com.google.android.exoplayer2.audio.f */
public final class C14196f extends MediaCodecRenderer implements C14064l {

    /* renamed from: G1 */
    public final Context f31446G1;

    /* renamed from: H1 */
    public final C14189a.C14190a f31447H1;

    /* renamed from: I1 */
    public final AudioSink f31448I1;

    /* renamed from: J1 */
    public int f31449J1;

    /* renamed from: K1 */
    public boolean f31450K1;

    /* renamed from: L1 */
    public Format f31451L1;

    /* renamed from: M1 */
    public long f31452M1;

    /* renamed from: N1 */
    public boolean f31453N1;

    /* renamed from: O1 */
    public boolean f31454O1;

    /* renamed from: P1 */
    public boolean f31455P1;

    /* renamed from: Q1 */
    public C17904d1.C17905a f31456Q1;

    /* renamed from: com.google.android.exoplayer2.audio.f$a */
    public final class C14197a implements AudioSink.C14179a {
        public C14197a() {
        }

        /* renamed from: a */
        public final void mo47263a(Exception exc) {
            C14075p.m21698j("MediaCodecAudioRenderer", "Audio sink error", exc);
            C14189a.C14190a aVar = C14196f.this.f31447H1;
            Handler handler = aVar.f31402a;
            if (handler != null) {
                handler.post(new C18173j(aVar, exc));
            }
        }
    }

    public C14196f(Context context, Handler handler, C17921i1.C17923b bVar, DefaultAudioSink defaultAudioSink) {
        super(1, 44100.0f);
        this.f31446G1 = context.getApplicationContext();
        this.f31448I1 = defaultAudioSink;
        this.f31447H1 = new C14189a.C14190a(handler, bVar);
        defaultAudioSink.f31366p = new C14197a();
    }

    /* renamed from: B */
    public final void mo47044B() {
        this.f31448I1.mo47200n();
    }

    /* renamed from: C */
    public final void mo47045C(DecoderInputBuffer decoderInputBuffer) {
        if (this.f31453N1 && !decoderInputBuffer.mo69762i()) {
            if (Math.abs(decoderInputBuffer.f31495f - this.f31452M1) > 500000) {
                this.f31452M1 = decoderInputBuffer.f31495f;
            }
            this.f31453N1 = false;
        }
    }

    /* renamed from: E */
    public final boolean mo47046E(long j, long j2, C14242b bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f31451L1 != null && (i2 & 2) != 0) {
            bVar.getClass();
            bVar.mo47393l(i, false);
            return true;
        } else if (z) {
            if (bVar != null) {
                bVar.mo47393l(i, false);
            }
            this.f31599B1.getClass();
            this.f31448I1.mo47200n();
            return true;
        } else {
            try {
                if (!this.f31448I1.mo47196j(byteBuffer, j3, i3)) {
                    return false;
                }
                if (bVar != null) {
                    bVar.mo47393l(i, false);
                }
                this.f31599B1.getClass();
                return true;
            } catch (AudioSink.InitializationException e) {
                throw createRendererException(e, e.format, e.isRecoverable);
            } catch (AudioSink.WriteException e2) {
                throw createRendererException(e2, format, e2.isRecoverable);
            }
        }
    }

    /* renamed from: H */
    public final void mo47258H() throws ExoPlaybackException {
        try {
            this.f31448I1.mo47198l();
        } catch (AudioSink.WriteException e) {
            throw createRendererException(e, e.format, e.isRecoverable);
        }
    }

    /* renamed from: M */
    public final boolean mo47259M(Format format) {
        return this.f31448I1.supportsFormat(format);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        if ((r4.isEmpty() ? null : r4.get(0)) != null) goto L_0x004c;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47049N(com.google.android.exoplayer2.mediacodec.C14247d r11, com.google.android.exoplayer2.Format r12) throws com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException {
        /*
            r10 = this;
            java.lang.String r0 = r12.sampleMimeType
            boolean r0 = p513bj.C14065m.m21679i(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            int r0 = p513bj.C14049b0.f30913a
            r2 = 21
            if (r0 < r2) goto L_0x0013
            r0 = 32
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            java.lang.Class<? extends oh.b> r2 = r12.exoMediaCryptoType
            r3 = 1
            if (r2 == 0) goto L_0x001b
            r4 = r3
            goto L_0x001c
        L_0x001b:
            r4 = r1
        L_0x001c:
            if (r2 == 0) goto L_0x0029
            java.lang.Class<oh.c> r5 = p635oh.C18293c.class
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = r1
            goto L_0x002a
        L_0x0029:
            r2 = r3
        L_0x002a:
            java.lang.String r5 = "audio/raw"
            if (r2 == 0) goto L_0x004f
            com.google.android.exoplayer2.audio.AudioSink r6 = r10.f31448I1
            boolean r6 = r6.supportsFormat(r12)
            if (r6 == 0) goto L_0x004f
            if (r4 == 0) goto L_0x004c
            java.util.List r4 = com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m22259d(r5, r1, r1)
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0044
            r4 = 0
            goto L_0x004a
        L_0x0044:
            java.lang.Object r4 = r4.get(r1)
            com.google.android.exoplayer2.mediacodec.c r4 = (com.google.android.exoplayer2.mediacodec.C14246c) r4
        L_0x004a:
            if (r4 == 0) goto L_0x004f
        L_0x004c:
            r11 = r0 | 12
            return r11
        L_0x004f:
            java.lang.String r4 = r12.sampleMimeType
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0060
            com.google.android.exoplayer2.audio.AudioSink r4 = r10.f31448I1
            boolean r4 = r4.supportsFormat(r12)
            if (r4 != 0) goto L_0x0060
            return r3
        L_0x0060:
            com.google.android.exoplayer2.audio.AudioSink r4 = r10.f31448I1
            int r6 = r12.channelCount
            int r7 = r12.sampleRate
            r8 = 2
            com.google.android.exoplayer2.Format$b r9 = new com.google.android.exoplayer2.Format$b
            r9.<init>()
            r9.f31303k = r5
            r9.f31316x = r6
            r9.f31317y = r7
            r9.f31318z = r8
            com.google.android.exoplayer2.Format r5 = r9.mo47144a()
            boolean r4 = r4.supportsFormat(r5)
            if (r4 != 0) goto L_0x007f
            return r3
        L_0x007f:
            java.util.List r11 = r10.mo47067o(r11, r12, r1)
            boolean r4 = r11.isEmpty()
            if (r4 == 0) goto L_0x008a
            return r3
        L_0x008a:
            if (r2 != 0) goto L_0x008d
            return r8
        L_0x008d:
            java.lang.Object r11 = r11.get(r1)
            com.google.android.exoplayer2.mediacodec.c r11 = (com.google.android.exoplayer2.mediacodec.C14246c) r11
            boolean r1 = r11.mo47400c(r12)
            if (r1 == 0) goto L_0x00a2
            boolean r11 = r11.mo47401d(r12)
            if (r11 == 0) goto L_0x00a2
            r11 = 16
            goto L_0x00a4
        L_0x00a2:
            r11 = 8
        L_0x00a4:
            if (r1 == 0) goto L_0x00a8
            r12 = 4
            goto L_0x00a9
        L_0x00a8:
            r12 = 3
        L_0x00a9:
            r11 = r11 | r12
            r11 = r11 | r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C14196f.mo47049N(com.google.android.exoplayer2.mediacodec.d, com.google.android.exoplayer2.Format):int");
    }

    /* renamed from: R */
    public final int mo47260R(Format format, C14246c cVar) {
        int i;
        if ("OMX.google.raw.decoder".equals(cVar.f31692a) && (i = C14049b0.f30913a) < 24) {
            if (i != 23) {
                return -1;
            }
            UiModeManager uiModeManager = (UiModeManager) this.f31446G1.getApplicationContext().getSystemService("uimode");
            if (!(uiModeManager != null && uiModeManager.getCurrentModeType() == 4)) {
                return -1;
            }
        }
        return format.maxInputSize;
    }

    /* renamed from: S */
    public final void mo47261S() {
        long m = this.f31448I1.mo47199m(isEnded());
        if (m != Long.MIN_VALUE) {
            if (!this.f31454O1) {
                m = Math.max(this.f31452M1, m);
            }
            this.f31452M1 = m;
            this.f31454O1 = false;
        }
    }

    /* renamed from: a */
    public final C17986y0 mo46888a() {
        return this.f31448I1.mo47185a();
    }

    /* renamed from: b */
    public final void mo46889b(C17986y0 y0Var) {
        this.f31448I1.mo47186b(y0Var);
    }

    /* renamed from: c */
    public final long mo46890c() {
        if (getState() == 2) {
            mo47261S();
        }
        return this.f31452M1;
    }

    /* renamed from: e */
    public final C18224e mo47059e(C14246c cVar, Format format, Format format2) {
        C18224e b = cVar.mo47399b(format, format2);
        int i = b.f39955e;
        if (mo47260R(format2, cVar) > this.f31449J1) {
            i |= 64;
        }
        int i2 = i;
        return new C18224e(cVar.f31692a, format, format2, i2 != 0 ? 0 : b.f39954d, i2);
    }

    public final C14064l getMediaClock() {
        return this;
    }

    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    public final void handleMessage(int i, Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.f31448I1.mo47187c(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f31448I1.mo47190f((C18167d) obj);
        } else if (i != 5) {
            switch (i) {
                case 101:
                    this.f31448I1.mo47202p(((Boolean) obj).booleanValue());
                    return;
                case 102:
                    this.f31448I1.mo47189e(((Integer) obj).intValue());
                    return;
                case 103:
                    this.f31456Q1 = (C17904d1.C17905a) obj;
                    return;
                default:
                    super.handleMessage(i, obj);
                    return;
            }
        } else {
            this.f31448I1.mo47194i((C18179o) obj);
        }
    }

    public final boolean isEnded() {
        return this.f31658u1 && this.f31448I1.isEnded();
    }

    public final boolean isReady() {
        return this.f31448I1.mo47188d() || super.isReady();
    }

    /* renamed from: n */
    public final float mo47066n(float f, Format[] formatArr) {
        int i = -1;
        for (Format format : formatArr) {
            int i2 = format.sampleRate;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* renamed from: o */
    public final List<C14246c> mo47067o(C14247d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        String str = format.sampleMimeType;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f31448I1.supportsFormat(format)) {
            List<C14246c> d = MediaCodecUtil.m22259d("audio/raw", false, false);
            C14246c cVar = d.isEmpty() ? null : d.get(0);
            if (cVar != null) {
                return Collections.singletonList(cVar);
            }
        }
        List<C14246c> b = dVar.mo46797b(str, z, false);
        Pattern pattern = MediaCodecUtil.f31669a;
        ArrayList arrayList = new ArrayList(b);
        Collections.sort(arrayList, new C13988n(new C3673f7(format, 3)));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(dVar.mo46797b("audio/eac3", z, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final void onDisabled() {
        this.f31455P1 = true;
        try {
            this.f31448I1.flush();
            try {
                super.onDisabled();
            } finally {
                this.f31447H1.mo47249a(this.f31599B1);
            }
        } catch (Throwable th) {
            super.onDisabled();
            throw th;
        } finally {
            this.f31447H1.mo47249a(this.f31599B1);
        }
    }

    public final void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
        super.onEnabled(z, z2);
        C14189a.C14190a aVar = this.f31447H1;
        C18223d dVar = this.f31599B1;
        Handler handler = aVar.f31402a;
        if (handler != null) {
            handler.post(new C8912k(1, aVar, dVar));
        }
        if (getConfiguration().f38896a) {
            this.f31448I1.mo47201o();
        } else {
            this.f31448I1.mo47193h();
        }
    }

    public final void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        super.onPositionReset(j, z);
        this.f31448I1.flush();
        this.f31452M1 = j;
        this.f31453N1 = true;
        this.f31454O1 = true;
    }

    public final void onReset() {
        try {
            super.onReset();
        } finally {
            if (this.f31455P1) {
                this.f31455P1 = false;
                this.f31448I1.reset();
            }
        }
    }

    public final void onStarted() {
        this.f31448I1.play();
    }

    public final void onStopped() {
        mo47261S();
        this.f31448I1.pause();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0106  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.mediacodec.C14242b.C14243a mo47074q(com.google.android.exoplayer2.mediacodec.C14246c r9, com.google.android.exoplayer2.Format r10, android.media.MediaCrypto r11, float r12) {
        /*
            r8 = this;
            com.google.android.exoplayer2.Format[] r0 = r8.getStreamFormats()
            int r1 = r8.mo47260R(r10, r9)
            int r2 = r0.length
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L_0x000e
            goto L_0x0027
        L_0x000e:
            int r2 = r0.length
            r5 = r4
        L_0x0010:
            if (r5 >= r2) goto L_0x0027
            r6 = r0[r5]
            mh.e r7 = r9.mo47399b(r10, r6)
            int r7 = r7.f39954d
            if (r7 == 0) goto L_0x0024
            int r6 = r8.mo47260R(r6, r9)
            int r1 = java.lang.Math.max(r1, r6)
        L_0x0024:
            int r5 = r5 + 1
            goto L_0x0010
        L_0x0027:
            r8.f31449J1 = r1
            java.lang.String r0 = r9.f31692a
            int r1 = p513bj.C14049b0.f30913a
            r2 = 24
            if (r1 >= r2) goto L_0x005f
            java.lang.String r5 = "OMX.SEC.aac.dec"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p513bj.C14049b0.f30915c
            java.lang.String r5 = "samsung"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = p513bj.C14049b0.f30914b
            java.lang.String r5 = "zeroflte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005d
            java.lang.String r5 = "herolte"
            boolean r5 = r0.startsWith(r5)
            if (r5 != 0) goto L_0x005d
            java.lang.String r5 = "heroqlte"
            boolean r0 = r0.startsWith(r5)
            if (r0 == 0) goto L_0x005f
        L_0x005d:
            r0 = r3
            goto L_0x0060
        L_0x005f:
            r0 = r4
        L_0x0060:
            r8.f31450K1 = r0
            java.lang.String r0 = r9.f31694c
            int r5 = r8.f31449J1
            android.media.MediaFormat r6 = new android.media.MediaFormat
            r6.<init>()
            java.lang.String r7 = "mime"
            r6.setString(r7, r0)
            int r0 = r10.channelCount
            java.lang.String r7 = "channel-count"
            r6.setInteger(r7, r0)
            int r0 = r10.sampleRate
            java.lang.String r7 = "sample-rate"
            r6.setInteger(r7, r0)
            java.util.List<byte[]> r0 = r10.initializationData
            com.google.android.play.core.assetpacks.C15588c1.m25299P0(r6, r0)
            java.lang.String r0 = "max-input-size"
            com.google.android.play.core.assetpacks.C15588c1.m25360z0(r6, r0, r5)
            r0 = 23
            if (r1 < r0) goto L_0x00b5
            java.lang.String r5 = "priority"
            r6.setInteger(r5, r4)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x00b5
            if (r1 != r0) goto L_0x00ad
            java.lang.String r0 = p513bj.C14049b0.f30916d
            java.lang.String r5 = "ZTE B2017G"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00ab
            java.lang.String r5 = "AXON 7 mini"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00ad
        L_0x00ab:
            r0 = r3
            goto L_0x00ae
        L_0x00ad:
            r0 = r4
        L_0x00ae:
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "operating-rate"
            r6.setFloat(r0, r12)
        L_0x00b5:
            r12 = 28
            if (r1 > r12) goto L_0x00c8
            java.lang.String r12 = r10.sampleMimeType
            java.lang.String r0 = "audio/ac4"
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L_0x00c8
            java.lang.String r12 = "ac4-is-sync"
            r6.setInteger(r12, r3)
        L_0x00c8:
            java.lang.String r12 = "audio/raw"
            if (r1 < r2) goto L_0x00f0
            com.google.android.exoplayer2.audio.AudioSink r0 = r8.f31448I1
            int r1 = r10.channelCount
            int r2 = r10.sampleRate
            r5 = 4
            com.google.android.exoplayer2.Format$b r7 = new com.google.android.exoplayer2.Format$b
            r7.<init>()
            r7.f31303k = r12
            r7.f31316x = r1
            r7.f31317y = r2
            r7.f31318z = r5
            com.google.android.exoplayer2.Format r1 = r7.mo47144a()
            int r0 = r0.mo47197k(r1)
            r1 = 2
            if (r0 != r1) goto L_0x00f0
            java.lang.String r0 = "pcm-encoding"
            r6.setInteger(r0, r5)
        L_0x00f0:
            java.lang.String r0 = r9.f31693b
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = r10.sampleMimeType
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r3 = r4
        L_0x0102:
            r12 = 0
            if (r3 == 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r10 = r12
        L_0x0107:
            r8.f31451L1 = r10
            com.google.android.exoplayer2.mediacodec.b$a r10 = new com.google.android.exoplayer2.mediacodec.b$a
            r10.<init>(r9, r6, r12, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C14196f.mo47074q(com.google.android.exoplayer2.mediacodec.c, com.google.android.exoplayer2.Format, android.media.MediaCrypto, float):com.google.android.exoplayer2.mediacodec.b$a");
    }

    /* renamed from: v */
    public final void mo47077v(IllegalStateException illegalStateException) {
        C14075p.m21698j("MediaCodecAudioRenderer", "Audio codec error", illegalStateException);
        C14189a.C14190a aVar = this.f31447H1;
        Handler handler = aVar.f31402a;
        if (handler != null) {
            handler.post(new C18174k(0, aVar, illegalStateException));
        }
    }

    /* renamed from: w */
    public final void mo47078w(long j, long j2, String str) {
        C14189a.C14190a aVar = this.f31447H1;
        Handler handler = aVar.f31402a;
        if (handler != null) {
            handler.post(new C18171h(aVar, str, j, j2));
        }
    }

    /* renamed from: x */
    public final void mo47079x(String str) {
        C14189a.C14190a aVar = this.f31447H1;
        Handler handler = aVar.f31402a;
        if (handler != null) {
            handler.post(new C13281a(1, aVar, str));
        }
    }

    /* renamed from: y */
    public final C18224e mo47080y(C17948m0 m0Var) throws ExoPlaybackException {
        C18224e y = super.mo47080y(m0Var);
        C14189a.C14190a aVar = this.f31447H1;
        Format format = m0Var.f39134b;
        Handler handler = aVar.f31402a;
        if (handler != null) {
            handler.post(new C18172i(aVar, 0, format, y));
        }
        return y;
    }

    /* renamed from: z */
    public final void mo47081z(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i;
        Format format2 = this.f31451L1;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (this.f31665y != null) {
            int s = "audio/raw".equals(format.sampleMimeType) ? format.pcmEncoding : (C14049b0.f30913a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? C14049b0.m21646s(mediaFormat.getInteger("v-bits-per-sample")) : "audio/raw".equals(format.sampleMimeType) ? format.pcmEncoding : 2 : mediaFormat.getInteger("pcm-encoding");
            Format.C14176b bVar = new Format.C14176b();
            bVar.f31303k = "audio/raw";
            bVar.f31318z = s;
            bVar.f31289A = format.encoderDelay;
            bVar.f31290B = format.encoderPadding;
            bVar.f31316x = mediaFormat.getInteger("channel-count");
            bVar.f31317y = mediaFormat.getInteger("sample-rate");
            Format a = bVar.mo47144a();
            if (this.f31450K1 && a.channelCount == 6 && (i = format.channelCount) < 6) {
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < format.channelCount; i2++) {
                    iArr2[i2] = i2;
                }
                iArr = iArr2;
            }
            format = a;
        }
        try {
            this.f31448I1.mo47192g(format, iArr);
        } catch (AudioSink.ConfigurationException e) {
            throw createRendererException(e, e.format);
        }
    }
}
