package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.compose.animation.C0391c;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.android.exoplayer2.C14177a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.C14242b;
import com.google.android.exoplayer2.mediacodec.C14248e;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.net.URLCodec;
import p003a2.C0015b;
import p504ai.C13981g;
import p504ai.C13982h;
import p504ai.C13983i;
import p513bj.C14049b0;
import p513bj.C14068n;
import p513bj.C14075p;
import p513bj.C14085x;
import p594jh.C17948m0;
import p611lh.C18182r;
import p619mh.C18220b;
import p619mh.C18223d;
import p619mh.C18224e;
import p635oh.C18292b;
import p635oh.C18293c;

public abstract class MediaCodecRenderer extends C14177a {

    /* renamed from: F1 */
    public static final byte[] f31595F1 = {0, 0, 1, 103, 66, -64, 11, -38, URLCodec.ESCAPE_CHAR, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, ByteSourceJsonBootstrapper.UTF8_BOM_3, 28, Framer.STDOUT_FRAME_PREFIX, -61, 39, 93, Framer.EXIT_FRAME_PREFIX};

    /* renamed from: A */
    public MediaFormat f31596A;

    /* renamed from: A1 */
    public ExoPlaybackException f31597A1;

    /* renamed from: B */
    public boolean f31598B;

    /* renamed from: B1 */
    public C18223d f31599B1;

    /* renamed from: C */
    public float f31600C;

    /* renamed from: C1 */
    public long f31601C1;

    /* renamed from: D */
    public ArrayDeque<C14246c> f31602D;

    /* renamed from: D1 */
    public long f31603D1;

    /* renamed from: E */
    public DecoderInitializationException f31604E;

    /* renamed from: E1 */
    public int f31605E1;

    /* renamed from: F */
    public C14246c f31606F;

    /* renamed from: G */
    public int f31607G;

    /* renamed from: H */
    public boolean f31608H;

    /* renamed from: I */
    public boolean f31609I;

    /* renamed from: J */
    public boolean f31610J;

    /* renamed from: K */
    public boolean f31611K;

    /* renamed from: L */
    public boolean f31612L;

    /* renamed from: M */
    public boolean f31613M;

    /* renamed from: N */
    public boolean f31614N;

    /* renamed from: O */
    public boolean f31615O;

    /* renamed from: P */
    public boolean f31616P;

    /* renamed from: Q */
    public boolean f31617Q;

    /* renamed from: R */
    public C13982h f31618R;

    /* renamed from: S */
    public long f31619S;

    /* renamed from: T */
    public int f31620T;

    /* renamed from: V */
    public int f31621V;

    /* renamed from: W */
    public ByteBuffer f31622W;

    /* renamed from: X */
    public boolean f31623X;

    /* renamed from: Y */
    public boolean f31624Y;

    /* renamed from: Z */
    public boolean f31625Z;

    /* renamed from: b */
    public final C14242b.C14244b f31626b;

    /* renamed from: c */
    public final C14247d f31627c;

    /* renamed from: d */
    public final boolean f31628d = false;

    /* renamed from: e */
    public final float f31629e;

    /* renamed from: f */
    public final DecoderInputBuffer f31630f;

    /* renamed from: g */
    public final DecoderInputBuffer f31631g;

    /* renamed from: h */
    public final DecoderInputBuffer f31632h;

    /* renamed from: i */
    public final C13981g f31633i;

    /* renamed from: j */
    public final C14085x<Format> f31634j;

    /* renamed from: j1 */
    public boolean f31635j1;

    /* renamed from: k */
    public final ArrayList<Long> f31636k;

    /* renamed from: k0 */
    public boolean f31637k0;

    /* renamed from: k1 */
    public boolean f31638k1;

    /* renamed from: l */
    public final MediaCodec.BufferInfo f31639l;

    /* renamed from: l1 */
    public int f31640l1;

    /* renamed from: m */
    public final long[] f31641m;

    /* renamed from: m1 */
    public int f31642m1;

    /* renamed from: n */
    public final long[] f31643n;

    /* renamed from: n1 */
    public int f31644n1;

    /* renamed from: o */
    public final long[] f31645o;

    /* renamed from: o1 */
    public boolean f31646o1;

    /* renamed from: p */
    public Format f31647p;

    /* renamed from: p1 */
    public boolean f31648p1;

    /* renamed from: q */
    public Format f31649q;

    /* renamed from: q1 */
    public boolean f31650q1;

    /* renamed from: r */
    public DrmSession f31651r;

    /* renamed from: r1 */
    public long f31652r1;

    /* renamed from: s */
    public DrmSession f31653s;

    /* renamed from: s1 */
    public long f31654s1;

    /* renamed from: t */
    public MediaCrypto f31655t;

    /* renamed from: t1 */
    public boolean f31656t1;

    /* renamed from: u */
    public boolean f31657u;

    /* renamed from: u1 */
    public boolean f31658u1;

    /* renamed from: v */
    public long f31659v;

    /* renamed from: v1 */
    public boolean f31660v1;

    /* renamed from: w */
    public float f31661w;

    /* renamed from: w1 */
    public boolean f31662w1;

    /* renamed from: x */
    public float f31663x;

    /* renamed from: x1 */
    public boolean f31664x1;

    /* renamed from: y */
    public C14242b f31665y;

    /* renamed from: y1 */
    public boolean f31666y1;

    /* renamed from: z */
    public Format f31667z;

    /* renamed from: z1 */
    public boolean f31668z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCodecRenderer(int i, float f) {
        super(i);
        C14248e.C14249a aVar = C14242b.C14244b.f31691a;
        C13983i iVar = C14247d.f31699f0;
        this.f31626b = aVar;
        this.f31627c = iVar;
        this.f31629e = f;
        this.f31630f = new DecoderInputBuffer(0);
        this.f31631g = new DecoderInputBuffer(0);
        this.f31632h = new DecoderInputBuffer(2);
        C13981g gVar = new C13981g();
        this.f31633i = gVar;
        this.f31634j = new C14085x<>();
        this.f31636k = new ArrayList<>();
        this.f31639l = new MediaCodec.BufferInfo();
        this.f31661w = 1.0f;
        this.f31663x = 1.0f;
        this.f31659v = -9223372036854775807L;
        this.f31641m = new long[10];
        this.f31643n = new long[10];
        this.f31645o = new long[10];
        this.f31601C1 = -9223372036854775807L;
        this.f31603D1 = -9223372036854775807L;
        gVar.mo47271l(0);
        gVar.f31493d.order(ByteOrder.nativeOrder());
        this.f31600C = -1.0f;
        this.f31607G = 0;
        this.f31640l1 = 0;
        this.f31620T = -1;
        this.f31621V = -1;
        this.f31619S = -9223372036854775807L;
        this.f31652r1 = -9223372036854775807L;
        this.f31654s1 = -9223372036854775807L;
        this.f31642m1 = 0;
        this.f31644n1 = 0;
    }

    /* renamed from: A */
    public void mo47043A(long j) {
        while (true) {
            int i = this.f31605E1;
            if (i != 0 && j >= this.f31645o[0]) {
                long[] jArr = this.f31641m;
                this.f31601C1 = jArr[0];
                this.f31603D1 = this.f31643n[0];
                int i2 = i - 1;
                this.f31605E1 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f31643n;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f31605E1);
                long[] jArr3 = this.f31645o;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f31605E1);
                mo47044B();
            } else {
                return;
            }
        }
    }

    /* renamed from: B */
    public abstract void mo47044B();

    /* renamed from: C */
    public abstract void mo47045C(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    /* JADX INFO: finally extract failed */
    @TargetApi(23)
    /* renamed from: D */
    public final void mo47353D() throws ExoPlaybackException {
        int i = this.f31644n1;
        if (i == 1) {
            try {
                this.f31665y.flush();
            } finally {
                mo47047I();
            }
        } else if (i == 2) {
            try {
                this.f31665y.flush();
                mo47047I();
                mo47359P();
            } catch (Throwable th) {
                mo47047I();
                throw th;
            }
        } else if (i != 3) {
            this.f31658u1 = true;
            mo47258H();
        } else {
            mo47355G();
            mo47372t();
        }
    }

    /* renamed from: E */
    public abstract boolean mo47046E(long j, long j2, C14242b bVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    /* renamed from: F */
    public final boolean mo47354F(int i) throws ExoPlaybackException {
        C17948m0 formatHolder = getFormatHolder();
        this.f31630f.mo46795j();
        int readSource = readSource(formatHolder, this.f31630f, i | 4);
        if (readSource == -5) {
            mo47080y(formatHolder);
            return true;
        } else if (readSource != -4 || !this.f31630f.mo69761h(4)) {
            return false;
        } else {
            this.f31656t1 = true;
            mo47353D();
            return false;
        }
    }

    /* renamed from: G */
    public final void mo47355G() {
        try {
            C14242b bVar = this.f31665y;
            if (bVar != null) {
                bVar.release();
                this.f31599B1.getClass();
                mo47079x(this.f31606F.f31692a);
            }
            this.f31665y = null;
            try {
                MediaCrypto mediaCrypto = this.f31655t;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f31655t = null;
                mo47357K((DrmSession) null);
                mo47356J();
            }
        } catch (Throwable th) {
            this.f31665y = null;
            MediaCrypto mediaCrypto2 = this.f31655t;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f31655t = null;
            mo47357K((DrmSession) null);
            mo47356J();
        }
    }

    /* renamed from: H */
    public void mo47258H() throws ExoPlaybackException {
    }

    /* renamed from: I */
    public void mo47047I() {
        this.f31620T = -1;
        this.f31631g.f31493d = null;
        this.f31621V = -1;
        this.f31622W = null;
        this.f31619S = -9223372036854775807L;
        this.f31648p1 = false;
        this.f31646o1 = false;
        this.f31615O = false;
        this.f31616P = false;
        this.f31623X = false;
        this.f31624Y = false;
        this.f31636k.clear();
        this.f31652r1 = -9223372036854775807L;
        this.f31654s1 = -9223372036854775807L;
        C13982h hVar = this.f31618R;
        if (hVar != null) {
            hVar.f30745a = 0;
            hVar.f30746b = 0;
            hVar.f30747c = false;
        }
        this.f31642m1 = 0;
        this.f31644n1 = 0;
        this.f31640l1 = this.f31638k1 ? 1 : 0;
    }

    /* renamed from: J */
    public final void mo47356J() {
        mo47047I();
        this.f31597A1 = null;
        this.f31618R = null;
        this.f31602D = null;
        this.f31606F = null;
        this.f31667z = null;
        this.f31596A = null;
        this.f31598B = false;
        this.f31650q1 = false;
        this.f31600C = -1.0f;
        this.f31607G = 0;
        this.f31608H = false;
        this.f31609I = false;
        this.f31610J = false;
        this.f31611K = false;
        this.f31612L = false;
        this.f31613M = false;
        this.f31614N = false;
        this.f31617Q = false;
        this.f31638k1 = false;
        this.f31640l1 = 0;
        this.f31657u = false;
    }

    /* renamed from: K */
    public final void mo47357K(DrmSession drmSession) {
        DrmSession.m22143g(this.f31651r, drmSession);
        this.f31651r = drmSession;
    }

    /* renamed from: L */
    public boolean mo47048L(C14246c cVar) {
        return true;
    }

    /* renamed from: M */
    public boolean mo47259M(Format format) {
        return false;
    }

    /* renamed from: N */
    public abstract int mo47049N(C14247d dVar, Format format) throws MediaCodecUtil.DecoderQueryException;

    /* renamed from: O */
    public final boolean mo47358O(Format format) throws ExoPlaybackException {
        if (!(C14049b0.f30913a < 23 || this.f31665y == null || this.f31644n1 == 3 || getState() == 0)) {
            float n = mo47066n(this.f31663x, getStreamFormats());
            float f = this.f31600C;
            if (f == n) {
                return true;
            }
            if (n == -1.0f) {
                if (this.f31646o1) {
                    this.f31642m1 = 1;
                    this.f31644n1 = 3;
                    return false;
                }
                mo47355G();
                mo47372t();
                return false;
            } else if (f == -1.0f && n <= this.f31629e) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", n);
                this.f31665y.mo47388g(bundle);
                this.f31600C = n;
            }
        }
        return true;
    }

    /* renamed from: P */
    public final void mo47359P() throws ExoPlaybackException {
        try {
            this.f31655t.setMediaDrmSession(mo47368p(this.f31653s).f40142b);
            mo47357K(this.f31653s);
            this.f31642m1 = 0;
            this.f31644n1 = 0;
        } catch (MediaCryptoException e) {
            throw createRendererException(e, this.f31647p);
        }
    }

    /* renamed from: Q */
    public final void mo47360Q(long j) throws ExoPlaybackException {
        boolean z;
        Format d;
        Format e;
        C14085x<Format> xVar = this.f31634j;
        synchronized (xVar) {
            z = true;
            d = xVar.mo46955d(j, true);
        }
        Format format = d;
        if (format == null && this.f31598B) {
            C14085x<Format> xVar2 = this.f31634j;
            synchronized (xVar2) {
                e = xVar2.f31016d == 0 ? null : xVar2.mo46956e();
            }
            format = e;
        }
        if (format != null) {
            this.f31649q = format;
        } else {
            z = false;
        }
        if (z || (this.f31598B && this.f31649q != null)) {
            mo47081z(this.f31649q, this.f31596A);
            this.f31598B = false;
        }
    }

    /* renamed from: d */
    public final boolean mo47361d(long j, long j2) throws ExoPlaybackException {
        boolean z;
        C14075p.m21694f(!this.f31658u1);
        C13981g gVar = this.f31633i;
        int i = gVar.f30743k;
        if (i > 0) {
            if (!mo47046E(j, j2, (C14242b) null, gVar.f31493d, this.f31621V, 0, i, gVar.f31495f, gVar.mo69762i(), this.f31633i.mo69761h(4), this.f31649q)) {
                return false;
            }
            mo47043A(this.f31633i.f30742j);
            this.f31633i.mo46795j();
            z = false;
        } else {
            z = false;
        }
        if (this.f31656t1) {
            this.f31658u1 = true;
            return z;
        }
        if (this.f31637k0) {
            C14075p.m21694f(this.f31633i.mo46796n(this.f31632h));
            this.f31637k0 = z;
        }
        if (this.f31635j1) {
            if (this.f31633i.f30743k > 0 ? true : z) {
                return true;
            }
            mo47362g();
            this.f31635j1 = z;
            mo47372t();
            if (!this.f31625Z) {
                return z;
            }
        }
        C14075p.m21694f(!this.f31656t1);
        C17948m0 formatHolder = getFormatHolder();
        this.f31632h.mo46795j();
        while (true) {
            this.f31632h.mo46795j();
            int readSource = readSource(formatHolder, this.f31632h, z ? 1 : 0);
            if (readSource != -5) {
                if (readSource == -4) {
                    if (!this.f31632h.mo69761h(4)) {
                        if (this.f31660v1) {
                            Format format = this.f31647p;
                            format.getClass();
                            this.f31649q = format;
                            mo47081z(format, (MediaFormat) null);
                            this.f31660v1 = z;
                        }
                        this.f31632h.mo47272m();
                        if (!this.f31633i.mo46796n(this.f31632h)) {
                            this.f31637k0 = true;
                            break;
                        }
                    } else {
                        this.f31656t1 = true;
                        break;
                    }
                } else if (readSource != -3) {
                    throw new IllegalStateException();
                }
            } else {
                mo47080y(formatHolder);
                break;
            }
        }
        C13981g gVar2 = this.f31633i;
        if (gVar2.f30743k > 0 ? true : z) {
            gVar2.mo47272m();
        }
        if ((this.f31633i.f30743k > 0 ? true : z) || this.f31656t1 || this.f31635j1) {
            return true;
        }
        return z;
    }

    /* renamed from: e */
    public abstract C18224e mo47059e(C14246c cVar, Format format, Format format2);

    /* renamed from: f */
    public MediaCodecDecoderException mo47061f(IllegalStateException illegalStateException, C14246c cVar) {
        return new MediaCodecDecoderException(illegalStateException, cVar);
    }

    /* renamed from: g */
    public final void mo47362g() {
        this.f31635j1 = false;
        this.f31633i.mo46795j();
        this.f31632h.mo46795j();
        this.f31637k0 = false;
        this.f31625Z = false;
    }

    @TargetApi(23)
    /* renamed from: h */
    public final boolean mo47363h() throws ExoPlaybackException {
        if (this.f31646o1) {
            this.f31642m1 = 1;
            if (this.f31609I || this.f31611K) {
                this.f31644n1 = 3;
                return false;
            }
            this.f31644n1 = 2;
        } else {
            mo47359P();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x0149  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47364i(long r20, long r22) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r19 = this;
            r15 = r19
            int r0 = r15.f31621V
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000a
            r0 = r13
            goto L_0x000b
        L_0x000a:
            r0 = r14
        L_0x000b:
            if (r0 != 0) goto L_0x010e
            boolean r0 = r15.f31612L
            if (r0 == 0) goto L_0x0029
            boolean r0 = r15.f31648p1
            if (r0 == 0) goto L_0x0029
            com.google.android.exoplayer2.mediacodec.b r0 = r15.f31665y     // Catch:{ IllegalStateException -> 0x001e }
            android.media.MediaCodec$BufferInfo r1 = r15.f31639l     // Catch:{ IllegalStateException -> 0x001e }
            int r0 = r0.mo47391j(r1)     // Catch:{ IllegalStateException -> 0x001e }
            goto L_0x0031
        L_0x001e:
            r19.mo47353D()
            boolean r0 = r15.f31658u1
            if (r0 == 0) goto L_0x0028
            r19.mo47355G()
        L_0x0028:
            return r14
        L_0x0029:
            com.google.android.exoplayer2.mediacodec.b r0 = r15.f31665y
            android.media.MediaCodec$BufferInfo r1 = r15.f31639l
            int r0 = r0.mo47391j(r1)
        L_0x0031:
            if (r0 >= 0) goto L_0x0076
            r1 = -2
            if (r0 != r1) goto L_0x0065
            r15.f31650q1 = r13
            com.google.android.exoplayer2.mediacodec.b r0 = r15.f31665y
            android.media.MediaFormat r0 = r0.mo47381a()
            int r1 = r15.f31607G
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0057
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0057
            r15.f31616P = r13
            goto L_0x0064
        L_0x0057:
            boolean r1 = r15.f31614N
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r13)
        L_0x0060:
            r15.f31596A = r0
            r15.f31598B = r13
        L_0x0064:
            return r13
        L_0x0065:
            boolean r0 = r15.f31617Q
            if (r0 == 0) goto L_0x0075
            boolean r0 = r15.f31656t1
            if (r0 != 0) goto L_0x0072
            int r0 = r15.f31642m1
            r1 = 2
            if (r0 != r1) goto L_0x0075
        L_0x0072:
            r19.mo47353D()
        L_0x0075:
            return r14
        L_0x0076:
            boolean r1 = r15.f31616P
            if (r1 == 0) goto L_0x0082
            r15.f31616P = r14
            com.google.android.exoplayer2.mediacodec.b r1 = r15.f31665y
            r1.mo47393l(r0, r14)
            return r13
        L_0x0082:
            android.media.MediaCodec$BufferInfo r1 = r15.f31639l
            int r2 = r1.size
            if (r2 != 0) goto L_0x0092
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0092
            r19.mo47353D()
            return r14
        L_0x0092:
            r15.f31621V = r0
            com.google.android.exoplayer2.mediacodec.b r1 = r15.f31665y
            java.nio.ByteBuffer r0 = r1.mo47394m(r0)
            r15.f31622W = r0
            if (r0 == 0) goto L_0x00b1
            android.media.MediaCodec$BufferInfo r1 = r15.f31639l
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f31622W
            android.media.MediaCodec$BufferInfo r1 = r15.f31639l
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00b1:
            boolean r0 = r15.f31613M
            if (r0 == 0) goto L_0x00d2
            android.media.MediaCodec$BufferInfo r0 = r15.f31639l
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00d2
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00d2
            long r1 = r15.f31652r1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00d2
            r0.presentationTimeUs = r1
        L_0x00d2:
            android.media.MediaCodec$BufferInfo r0 = r15.f31639l
            long r0 = r0.presentationTimeUs
            java.util.ArrayList<java.lang.Long> r2 = r15.f31636k
            int r2 = r2.size()
            r3 = r14
        L_0x00dd:
            if (r3 >= r2) goto L_0x00f9
            java.util.ArrayList<java.lang.Long> r4 = r15.f31636k
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00f6
            java.util.ArrayList<java.lang.Long> r0 = r15.f31636k
            r0.remove(r3)
            r0 = r13
            goto L_0x00fa
        L_0x00f6:
            int r3 = r3 + 1
            goto L_0x00dd
        L_0x00f9:
            r0 = r14
        L_0x00fa:
            r15.f31623X = r0
            long r0 = r15.f31654s1
            android.media.MediaCodec$BufferInfo r2 = r15.f31639l
            long r2 = r2.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0108
            r0 = r13
            goto L_0x0109
        L_0x0108:
            r0 = r14
        L_0x0109:
            r15.f31624Y = r0
            r15.mo47360Q(r2)
        L_0x010e:
            boolean r0 = r15.f31612L
            if (r0 == 0) goto L_0x014d
            boolean r0 = r15.f31648p1
            if (r0 == 0) goto L_0x014d
            com.google.android.exoplayer2.mediacodec.b r5 = r15.f31665y     // Catch:{ IllegalStateException -> 0x0140 }
            java.nio.ByteBuffer r6 = r15.f31622W     // Catch:{ IllegalStateException -> 0x0140 }
            int r7 = r15.f31621V     // Catch:{ IllegalStateException -> 0x0140 }
            android.media.MediaCodec$BufferInfo r0 = r15.f31639l     // Catch:{ IllegalStateException -> 0x0140 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0140 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0140 }
            boolean r12 = r15.f31623X     // Catch:{ IllegalStateException -> 0x0140 }
            boolean r3 = r15.f31624Y     // Catch:{ IllegalStateException -> 0x0140 }
            com.google.android.exoplayer2.Format r4 = r15.f31649q     // Catch:{ IllegalStateException -> 0x0140 }
            r0 = r19
            r1 = r20
            r16 = r3
            r17 = r4
            r3 = r22
            r18 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            boolean r0 = r0.mo47046E(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0142 }
            goto L_0x016e
        L_0x0140:
            r16 = r14
        L_0x0142:
            r19.mo47353D()
            boolean r0 = r15.f31658u1
            if (r0 == 0) goto L_0x014c
            r19.mo47355G()
        L_0x014c:
            return r16
        L_0x014d:
            r18 = r13
            r16 = r14
            com.google.android.exoplayer2.mediacodec.b r5 = r15.f31665y
            java.nio.ByteBuffer r6 = r15.f31622W
            int r7 = r15.f31621V
            android.media.MediaCodec$BufferInfo r0 = r15.f31639l
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f31623X
            boolean r13 = r15.f31624Y
            com.google.android.exoplayer2.Format r14 = r15.f31649q
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.mo47046E(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x016e:
            if (r0 == 0) goto L_0x0190
            android.media.MediaCodec$BufferInfo r0 = r15.f31639l
            long r0 = r0.presentationTimeUs
            r15.mo47043A(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f31639l
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0182
            r14 = r18
            goto L_0x0184
        L_0x0182:
            r14 = r16
        L_0x0184:
            r0 = -1
            r15.f31621V = r0
            r0 = 0
            r15.f31622W = r0
            if (r14 != 0) goto L_0x018d
            return r18
        L_0x018d:
            r19.mo47353D()
        L_0x0190:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo47364i(long, long):boolean");
    }

    public boolean isEnded() {
        return this.f31658u1;
    }

    public boolean isReady() {
        if (this.f31647p != null) {
            if (isSourceReady()) {
                return true;
            }
            if (this.f31621V >= 0) {
                return true;
            }
            if (this.f31619S != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f31619S) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo47365j() throws ExoPlaybackException {
        long j;
        C14242b bVar = this.f31665y;
        if (bVar == null || this.f31642m1 == 2 || this.f31656t1) {
            return false;
        }
        if (this.f31620T < 0) {
            int i = bVar.mo47390i();
            this.f31620T = i;
            if (i < 0) {
                return false;
            }
            this.f31631g.f31493d = this.f31665y.mo47385e(i);
            this.f31631g.mo46795j();
        }
        if (this.f31642m1 == 1) {
            if (!this.f31617Q) {
                this.f31648p1 = true;
                this.f31665y.mo47392k(this.f31620T, 0, 4, 0);
                this.f31620T = -1;
                this.f31631g.f31493d = null;
            }
            this.f31642m1 = 2;
            return false;
        } else if (this.f31615O) {
            this.f31615O = false;
            this.f31631g.f31493d.put(f31595F1);
            this.f31665y.mo47392k(this.f31620T, 38, 0, 0);
            this.f31620T = -1;
            this.f31631g.f31493d = null;
            this.f31646o1 = true;
            return true;
        } else {
            if (this.f31640l1 == 1) {
                for (int i2 = 0; i2 < this.f31667z.initializationData.size(); i2++) {
                    this.f31631g.f31493d.put(this.f31667z.initializationData.get(i2));
                }
                this.f31640l1 = 2;
            }
            int position = this.f31631g.f31493d.position();
            C17948m0 formatHolder = getFormatHolder();
            try {
                int readSource = readSource(formatHolder, this.f31631g, 0);
                if (hasReadStreamToEnd()) {
                    this.f31654s1 = this.f31652r1;
                }
                if (readSource == -3) {
                    return false;
                }
                if (readSource == -5) {
                    if (this.f31640l1 == 2) {
                        this.f31631g.mo46795j();
                        this.f31640l1 = 1;
                    }
                    mo47080y(formatHolder);
                    return true;
                } else if (this.f31631g.mo69761h(4)) {
                    if (this.f31640l1 == 2) {
                        this.f31631g.mo46795j();
                        this.f31640l1 = 1;
                    }
                    this.f31656t1 = true;
                    if (!this.f31646o1) {
                        mo47353D();
                        return false;
                    }
                    try {
                        if (!this.f31617Q) {
                            this.f31648p1 = true;
                            this.f31665y.mo47392k(this.f31620T, 0, 4, 0);
                            this.f31620T = -1;
                            this.f31631g.f31493d = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw createRendererException(e, this.f31647p);
                    }
                } else if (this.f31646o1 || this.f31631g.mo69761h(1)) {
                    boolean h = this.f31631g.mo69761h(1073741824);
                    if (h) {
                        C18220b bVar2 = this.f31631g.f31492c;
                        if (position == 0) {
                            bVar2.getClass();
                        } else {
                            if (bVar2.f39941d == null) {
                                int[] iArr = new int[1];
                                bVar2.f39941d = iArr;
                                bVar2.f39946i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = bVar2.f39941d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f31608H && !h) {
                        ByteBuffer byteBuffer = this.f31631g.f31493d;
                        byte[] bArr = C14068n.f30955a;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i3) & 255;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
                                    break;
                                }
                            } else if (b == 0) {
                                i4++;
                            }
                            if (b != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        }
                        if (this.f31631g.f31493d.position() == 0) {
                            return true;
                        }
                        this.f31608H = false;
                    }
                    DecoderInputBuffer decoderInputBuffer = this.f31631g;
                    long j2 = decoderInputBuffer.f31495f;
                    C13982h hVar = this.f31618R;
                    if (hVar != null) {
                        Format format = this.f31647p;
                        if (!hVar.f30747c) {
                            ByteBuffer byteBuffer2 = decoderInputBuffer.f31493d;
                            byteBuffer2.getClass();
                            byte b2 = 0;
                            for (int i6 = 0; i6 < 4; i6++) {
                                b2 = (b2 << 8) | (byteBuffer2.get(i6) & 255);
                            }
                            int b3 = C18182r.m30685b(b2);
                            if (b3 == -1) {
                                hVar.f30747c = true;
                                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                j = decoderInputBuffer.f31495f;
                            } else {
                                long j3 = hVar.f30745a;
                                if (j3 == 0) {
                                    j2 = decoderInputBuffer.f31495f;
                                    hVar.f30746b = j2;
                                    hVar.f30745a = ((long) b3) - 529;
                                } else {
                                    long j4 = (1000000 * j3) / ((long) format.sampleRate);
                                    hVar.f30745a = j3 + ((long) b3);
                                    j = hVar.f30746b + j4;
                                }
                            }
                            j2 = j;
                        }
                    }
                    if (this.f31631g.mo69762i()) {
                        this.f31636k.add(Long.valueOf(j2));
                    }
                    if (this.f31660v1) {
                        this.f31634j.mo46952a(j2, this.f31647p);
                        this.f31660v1 = false;
                    }
                    if (this.f31618R != null) {
                        this.f31652r1 = Math.max(this.f31652r1, this.f31631g.f31495f);
                    } else {
                        this.f31652r1 = Math.max(this.f31652r1, j2);
                    }
                    this.f31631g.mo47272m();
                    if (this.f31631g.mo69761h(268435456)) {
                        mo47075r(this.f31631g);
                    }
                    mo47045C(this.f31631g);
                    if (h) {
                        try {
                            this.f31665y.mo47383c(this.f31620T, this.f31631g.f31492c, j2);
                        } catch (MediaCodec.CryptoException e2) {
                            throw createRendererException(e2, this.f31647p);
                        }
                    } else {
                        this.f31665y.mo47392k(this.f31620T, this.f31631g.f31493d.limit(), 0, j2);
                    }
                    this.f31620T = -1;
                    this.f31631g.f31493d = null;
                    this.f31646o1 = true;
                    this.f31640l1 = 0;
                    this.f31599B1.getClass();
                    return true;
                } else {
                    this.f31631g.mo46795j();
                    if (this.f31640l1 == 2) {
                        this.f31640l1 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
                mo47077v(e3);
                throw createRendererException(mo47061f(e3, this.f31606F), this.f31647p, false);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo47366k() {
        C14242b bVar = this.f31665y;
        if (bVar == null) {
            return false;
        }
        if (this.f31644n1 == 3 || this.f31609I || ((this.f31610J && !this.f31650q1) || (this.f31611K && this.f31648p1))) {
            mo47355G();
            return true;
        }
        try {
            bVar.flush();
            return false;
        } finally {
            mo47047I();
        }
    }

    /* renamed from: l */
    public final List<C14246c> mo47367l(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<C14246c> o = mo47067o(this.f31627c, this.f31647p, z);
        if (o.isEmpty() && z) {
            o = mo47067o(this.f31627c, this.f31647p, false);
            if (!o.isEmpty()) {
                String str = this.f31647p.sampleMimeType;
                String valueOf = String.valueOf(o);
                StringBuilder k = C0015b.m92k(valueOf.length() + C0391c.m1055a(str, 99), "Drm session requires secure decoder for ", str, ", but no secure decoder available. Trying to proceed with ", valueOf);
                k.append(".");
                Log.w("MediaCodecRenderer", k.toString());
            }
        }
        return o;
    }

    /* renamed from: m */
    public boolean mo47065m() {
        return false;
    }

    /* renamed from: n */
    public abstract float mo47066n(float f, Format[] formatArr);

    /* renamed from: o */
    public abstract List<C14246c> mo47067o(C14247d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    public void onDisabled() {
        this.f31647p = null;
        this.f31601C1 = -9223372036854775807L;
        this.f31603D1 = -9223372036854775807L;
        this.f31605E1 = 0;
        mo47366k();
    }

    public void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
        this.f31599B1 = new C18223d();
    }

    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        int i;
        this.f31656t1 = false;
        this.f31658u1 = false;
        this.f31662w1 = false;
        if (this.f31625Z) {
            this.f31633i.mo46795j();
            this.f31632h.mo46795j();
            this.f31637k0 = false;
        } else if (mo47366k()) {
            mo47372t();
        }
        C14085x<Format> xVar = this.f31634j;
        synchronized (xVar) {
            i = xVar.f31016d;
        }
        if (i > 0) {
            this.f31660v1 = true;
        }
        this.f31634j.mo46953b();
        int i2 = this.f31605E1;
        if (i2 != 0) {
            this.f31603D1 = this.f31643n[i2 - 1];
            this.f31601C1 = this.f31641m[i2 - 1];
            this.f31605E1 = 0;
        }
    }

    public void onReset() {
        try {
            mo47362g();
            mo47355G();
        } finally {
            DrmSession.m22143g(this.f31653s, (DrmSession) null);
            this.f31653s = null;
        }
    }

    public final void onStreamChanged(Format[] formatArr, long j, long j2) throws ExoPlaybackException {
        boolean z = true;
        if (this.f31603D1 == -9223372036854775807L) {
            if (this.f31601C1 != -9223372036854775807L) {
                z = false;
            }
            C14075p.m21694f(z);
            this.f31601C1 = j;
            this.f31603D1 = j2;
            return;
        }
        int i = this.f31605E1;
        long[] jArr = this.f31643n;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecRenderer", sb.toString());
        } else {
            this.f31605E1 = i + 1;
        }
        long[] jArr2 = this.f31641m;
        int i2 = this.f31605E1;
        jArr2[i2 - 1] = j;
        this.f31643n[i2 - 1] = j2;
        this.f31645o[i2 - 1] = this.f31652r1;
    }

    /* renamed from: p */
    public final C18293c mo47368p(DrmSession drmSession) throws ExoPlaybackException {
        C18292b e = drmSession.mo47277e();
        if (e == null || (e instanceof C18293c)) {
            return (C18293c) e;
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 42);
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(valueOf);
        throw createRendererException(new IllegalArgumentException(sb.toString()), this.f31647p);
    }

    /* renamed from: q */
    public abstract C14242b.C14243a mo47074q(C14246c cVar, Format format, MediaCrypto mediaCrypto, float f);

    /* renamed from: r */
    public void mo47075r(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069 A[Catch:{ IllegalStateException -> 0x009c }, LOOP:1: B:26:0x0047->B:36:0x0069, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087 A[Catch:{ IllegalStateException -> 0x009c }, LOOP:2: B:37:0x006a->B:47:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x006a A[EDGE_INSN: B:83:0x006a->B:86:0x006a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0088 A[EDGE_INSN: B:84:0x0088->B:48:0x0088 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void render(long r12, long r14) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r11 = this;
            boolean r0 = r11.f31662w1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.f31662w1 = r1
            r11.mo47353D()
        L_0x000a:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.f31597A1
            if (r0 != 0) goto L_0x00ea
            r0 = 1
            boolean r2 = r11.f31658u1     // Catch:{ IllegalStateException -> 0x009c }
            if (r2 == 0) goto L_0x0017
            r11.mo47258H()     // Catch:{ IllegalStateException -> 0x009c }
            return
        L_0x0017:
            com.google.android.exoplayer2.Format r2 = r11.f31647p     // Catch:{ IllegalStateException -> 0x009c }
            if (r2 != 0) goto L_0x0023
            r2 = 2
            boolean r2 = r11.mo47354F(r2)     // Catch:{ IllegalStateException -> 0x009c }
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            r11.mo47372t()     // Catch:{ IllegalStateException -> 0x009c }
            boolean r2 = r11.f31625Z     // Catch:{ IllegalStateException -> 0x009c }
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = "bypassRender"
            p513bj.C14075p.m21690b(r2)     // Catch:{ IllegalStateException -> 0x009c }
        L_0x002f:
            boolean r2 = r11.mo47361d(r12, r14)     // Catch:{ IllegalStateException -> 0x009c }
            if (r2 == 0) goto L_0x0036
            goto L_0x002f
        L_0x0036:
            p513bj.C14075p.m21699k()     // Catch:{ IllegalStateException -> 0x009c }
            goto L_0x0097
        L_0x003a:
            com.google.android.exoplayer2.mediacodec.b r2 = r11.f31665y     // Catch:{ IllegalStateException -> 0x009c }
            if (r2 == 0) goto L_0x008c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x009c }
            java.lang.String r4 = "drainAndFeed"
            p513bj.C14075p.m21690b(r4)     // Catch:{ IllegalStateException -> 0x009c }
        L_0x0047:
            boolean r4 = r11.mo47364i(r12, r14)     // Catch:{ IllegalStateException -> 0x009c }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x006a
            long r7 = r11.f31659v     // Catch:{ IllegalStateException -> 0x009c }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0066
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x009c }
            long r7 = r7 - r2
            long r9 = r11.f31659v     // Catch:{ IllegalStateException -> 0x009c }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r4 = r1
            goto L_0x0067
        L_0x0066:
            r4 = r0
        L_0x0067:
            if (r4 == 0) goto L_0x006a
            goto L_0x0047
        L_0x006a:
            boolean r12 = r11.mo47365j()     // Catch:{ IllegalStateException -> 0x009c }
            if (r12 == 0) goto L_0x0088
            long r12 = r11.f31659v     // Catch:{ IllegalStateException -> 0x009c }
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x0084
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x009c }
            long r12 = r12 - r2
            long r14 = r11.f31659v     // Catch:{ IllegalStateException -> 0x009c }
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r12 = r1
            goto L_0x0085
        L_0x0084:
            r12 = r0
        L_0x0085:
            if (r12 == 0) goto L_0x0088
            goto L_0x006a
        L_0x0088:
            p513bj.C14075p.m21699k()     // Catch:{ IllegalStateException -> 0x009c }
            goto L_0x0097
        L_0x008c:
            mh.d r14 = r11.f31599B1     // Catch:{ IllegalStateException -> 0x009c }
            r14.getClass()     // Catch:{ IllegalStateException -> 0x009c }
            r11.skipSource(r12)     // Catch:{ IllegalStateException -> 0x009c }
            r11.mo47354F(r0)     // Catch:{ IllegalStateException -> 0x009c }
        L_0x0097:
            mh.d r12 = r11.f31599B1     // Catch:{ IllegalStateException -> 0x009c }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x009c }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x009c }
            return
        L_0x009c:
            r12 = move-exception
            int r13 = p513bj.C14049b0.f30913a
            r14 = 21
            if (r13 < r14) goto L_0x00a8
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00a8
            goto L_0x00bd
        L_0x00a8:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x00bf
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00bf
        L_0x00bd:
            r15 = r0
            goto L_0x00c0
        L_0x00bf:
            r15 = r1
        L_0x00c0:
            if (r15 == 0) goto L_0x00e9
            r11.mo47077v(r12)
            if (r13 < r14) goto L_0x00d7
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00d3
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00d4
        L_0x00d3:
            r13 = r1
        L_0x00d4:
            if (r13 == 0) goto L_0x00d7
            r1 = r0
        L_0x00d7:
            if (r1 == 0) goto L_0x00dc
            r11.mo47355G()
        L_0x00dc:
            com.google.android.exoplayer2.mediacodec.c r13 = r11.f31606F
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r12 = r11.mo47061f(r12, r13)
            com.google.android.exoplayer2.Format r13 = r11.f31647p
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.createRendererException(r12, r13, r1)
            throw r12
        L_0x00e9:
            throw r12
        L_0x00ea:
            r12 = 0
            r11.f31597A1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.render(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0160, code lost:
        if ("stvm8".equals(r3) == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0170, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r5) == false) goto L_0x0174;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0183  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47370s(com.google.android.exoplayer2.mediacodec.C14246c r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            java.lang.String r5 = r0.f31692a
            int r1 = p513bj.C14049b0.f30913a
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r1 >= r3) goto L_0x0010
            r4 = r2
            goto L_0x001a
        L_0x0010:
            float r4 = r6.f31663x
            com.google.android.exoplayer2.Format[] r7 = r16.getStreamFormats()
            float r4 = r6.mo47066n(r4, r7)
        L_0x001a:
            float r7 = r6.f31629e
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r2 = r4
        L_0x0022:
            long r7 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r4 = "createCodec:"
            java.lang.String r9 = java.lang.String.valueOf(r5)
            int r10 = r9.length()
            if (r10 == 0) goto L_0x0037
            java.lang.String r4 = r4.concat(r9)
            goto L_0x003d
        L_0x0037:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r4)
            r4 = r9
        L_0x003d:
            p513bj.C14075p.m21690b(r4)
            com.google.android.exoplayer2.Format r4 = r6.f31647p
            r9 = r18
            com.google.android.exoplayer2.mediacodec.b$a r4 = r6.mo47074q(r0, r4, r9, r2)
            boolean r9 = r6.f31664x1
            if (r9 == 0) goto L_0x0060
            if (r1 < r3) goto L_0x0060
            com.google.android.exoplayer2.mediacodec.a$a r9 = new com.google.android.exoplayer2.mediacodec.a$a
            int r10 = r16.getTrackType()
            boolean r11 = r6.f31666y1
            boolean r12 = r6.f31668z1
            r9.<init>(r10, r11, r12)
            com.google.android.exoplayer2.mediacodec.a r4 = r9.mo47397a(r4)
            goto L_0x0066
        L_0x0060:
            com.google.android.exoplayer2.mediacodec.b$b r9 = r6.f31626b
            com.google.android.exoplayer2.mediacodec.b r4 = r9.mo47397a(r4)
        L_0x0066:
            long r9 = android.os.SystemClock.elapsedRealtime()
            r6.f31665y = r4
            r6.f31606F = r0
            r6.f31600C = r2
            com.google.android.exoplayer2.Format r2 = r6.f31647p
            r6.f31667z = r2
            java.lang.String r2 = "OMX.Exynos.avc.dec.secure"
            r4 = 1
            r12 = 25
            if (r1 > r12) goto L_0x00a5
            boolean r14 = r2.equals(r5)
            if (r14 == 0) goto L_0x00a5
            java.lang.String r14 = p513bj.C14049b0.f30916d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x00a3
            java.lang.String r15 = "SM-A510"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x00a3
            java.lang.String r15 = "SM-A520"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x00a3
            java.lang.String r15 = "SM-J700"
            boolean r14 = r14.startsWith(r15)
            if (r14 == 0) goto L_0x00a5
        L_0x00a3:
            r14 = 2
            goto L_0x00de
        L_0x00a5:
            r14 = 24
            if (r1 >= r14) goto L_0x00dd
            java.lang.String r14 = "OMX.Nvidia.h264.decode"
            boolean r14 = r14.equals(r5)
            if (r14 != 0) goto L_0x00b9
            java.lang.String r14 = "OMX.Nvidia.h264.decode.secure"
            boolean r14 = r14.equals(r5)
            if (r14 == 0) goto L_0x00dd
        L_0x00b9:
            java.lang.String r14 = p513bj.C14049b0.f30914b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "tilapia"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x00dd
        L_0x00db:
            r14 = r4
            goto L_0x00de
        L_0x00dd:
            r14 = 0
        L_0x00de:
            r6.f31607G = r14
            com.google.android.exoplayer2.Format r14 = r6.f31667z
            r15 = 21
            if (r1 >= r15) goto L_0x00f8
            java.util.List<byte[]> r14 = r14.initializationData
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00f8
            java.lang.String r14 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r14 = r14.equals(r5)
            if (r14 == 0) goto L_0x00f8
            r14 = r4
            goto L_0x00f9
        L_0x00f8:
            r14 = 0
        L_0x00f9:
            r6.f31608H = r14
            r14 = 19
            r13 = 18
            if (r1 < r13) goto L_0x0130
            if (r1 != r13) goto L_0x0113
            java.lang.String r11 = "OMX.SEC.avc.dec"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x0130
            java.lang.String r11 = "OMX.SEC.avc.dec.secure"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x0130
        L_0x0113:
            if (r1 != r14) goto L_0x012e
            java.lang.String r11 = p513bj.C14049b0.f30916d
            java.lang.String r12 = "SM-G800"
            boolean r11 = r11.startsWith(r12)
            if (r11 == 0) goto L_0x012e
            java.lang.String r11 = "OMX.Exynos.avc.dec"
            boolean r11 = r11.equals(r5)
            if (r11 != 0) goto L_0x0130
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            r2 = 0
            goto L_0x0131
        L_0x0130:
            r2 = r4
        L_0x0131:
            r6.f31609I = r2
            r2 = 29
            if (r1 != r2) goto L_0x0141
            java.lang.String r11 = "c2.android.aac.decoder"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0141
            r11 = r4
            goto L_0x0142
        L_0x0141:
            r11 = 0
        L_0x0142:
            r6.f31610J = r11
            if (r1 > r3) goto L_0x014e
            java.lang.String r3 = "OMX.google.vorbis.decoder"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0172
        L_0x014e:
            if (r1 > r14) goto L_0x0174
            java.lang.String r3 = p513bj.C14049b0.f30914b
            java.lang.String r11 = "hb2000"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x0162
            java.lang.String r11 = "stvm8"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x0174
        L_0x0162:
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0172
            java.lang.String r3 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0174
        L_0x0172:
            r3 = r4
            goto L_0x0175
        L_0x0174:
            r3 = 0
        L_0x0175:
            r6.f31611K = r3
            if (r1 != r15) goto L_0x0183
            java.lang.String r3 = "OMX.google.aac.decoder"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0183
            r3 = r4
            goto L_0x0184
        L_0x0183:
            r3 = 0
        L_0x0184:
            r6.f31612L = r3
            if (r1 >= r15) goto L_0x01ce
            java.lang.String r3 = "OMX.SEC.mp3.dec"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x01ce
            java.lang.String r3 = p513bj.C14049b0.f30915c
            java.lang.String r11 = "samsung"
            boolean r3 = r11.equals(r3)
            if (r3 == 0) goto L_0x01ce
            java.lang.String r3 = p513bj.C14049b0.f30914b
            java.lang.String r11 = "baffin"
            boolean r11 = r3.startsWith(r11)
            if (r11 != 0) goto L_0x01cc
            java.lang.String r11 = "grand"
            boolean r11 = r3.startsWith(r11)
            if (r11 != 0) goto L_0x01cc
            java.lang.String r11 = "fortuna"
            boolean r11 = r3.startsWith(r11)
            if (r11 != 0) goto L_0x01cc
            java.lang.String r11 = "gprimelte"
            boolean r11 = r3.startsWith(r11)
            if (r11 != 0) goto L_0x01cc
            java.lang.String r11 = "j2y18lte"
            boolean r11 = r3.startsWith(r11)
            if (r11 != 0) goto L_0x01cc
            java.lang.String r11 = "ms01"
            boolean r3 = r3.startsWith(r11)
            if (r3 == 0) goto L_0x01ce
        L_0x01cc:
            r3 = r4
            goto L_0x01cf
        L_0x01ce:
            r3 = 0
        L_0x01cf:
            r6.f31613M = r3
            com.google.android.exoplayer2.Format r3 = r6.f31667z
            if (r1 > r13) goto L_0x01e3
            int r3 = r3.channelCount
            if (r3 != r4) goto L_0x01e3
            java.lang.String r3 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x01e3
            r3 = r4
            goto L_0x01e4
        L_0x01e3:
            r3 = 0
        L_0x01e4:
            r6.f31614N = r3
            java.lang.String r3 = r0.f31692a
            r11 = 25
            if (r1 > r11) goto L_0x01f4
            java.lang.String r11 = "OMX.rk.video_decoder.avc"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x022a
        L_0x01f4:
            r11 = 17
            if (r1 > r11) goto L_0x0200
            java.lang.String r11 = "OMX.allwinner.video.decoder.avc"
            boolean r11 = r11.equals(r3)
            if (r11 != 0) goto L_0x022a
        L_0x0200:
            if (r1 > r2) goto L_0x0212
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x022a
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x022a
        L_0x0212:
            java.lang.String r1 = p513bj.C14049b0.f30915c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x022c
            java.lang.String r1 = p513bj.C14049b0.f30916d
            java.lang.String r2 = "AFTS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x022c
            boolean r1 = r0.f31697f
            if (r1 == 0) goto L_0x022c
        L_0x022a:
            r1 = r4
            goto L_0x022d
        L_0x022c:
            r1 = 0
        L_0x022d:
            if (r1 != 0) goto L_0x0237
            boolean r1 = r16.mo47065m()
            if (r1 == 0) goto L_0x0236
            goto L_0x0237
        L_0x0236:
            r4 = 0
        L_0x0237:
            r6.f31617Q = r4
            java.lang.String r0 = r0.f31692a
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024a
            ai.h r0 = new ai.h
            r0.<init>()
            r6.f31618R = r0
        L_0x024a:
            int r0 = r16.getState()
            r1 = 2
            if (r0 != r1) goto L_0x025a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            r6.f31619S = r0
        L_0x025a:
            mh.d r0 = r6.f31599B1
            r0.getClass()
            long r3 = r9 - r7
            r0 = r16
            r1 = r9
            r0.mo47078w(r1, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo47370s(com.google.android.exoplayer2.mediacodec.c, android.media.MediaCrypto):void");
    }

    public void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
        this.f31661w = f;
        this.f31663x = f2;
        mo47358O(this.f31667z);
    }

    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return mo47049N(this.f31627c, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format);
        }
    }

    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    /* renamed from: t */
    public final void mo47372t() throws ExoPlaybackException {
        Format format;
        if (this.f31665y == null && !this.f31625Z && (format = this.f31647p) != null) {
            if (this.f31653s != null || !mo47259M(format)) {
                mo47357K(this.f31653s);
                String str = this.f31647p.sampleMimeType;
                DrmSession drmSession = this.f31651r;
                if (drmSession != null) {
                    if (this.f31655t == null) {
                        C18293c p = mo47368p(drmSession);
                        if (p != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(p.f40141a, p.f40142b);
                                this.f31655t = mediaCrypto;
                                this.f31657u = !p.f40143c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw createRendererException(e, this.f31647p);
                            }
                        } else if (this.f31651r.mo47278f() == null) {
                            return;
                        }
                    }
                    if (C18293c.f40140d) {
                        int state = this.f31651r.getState();
                        if (state == 1) {
                            throw createRendererException(this.f31651r.mo47278f(), this.f31647p);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    mo47373u(this.f31655t, this.f31657u);
                } catch (DecoderInitializationException e2) {
                    throw createRendererException(e2, this.f31647p);
                }
            } else {
                Format format2 = this.f31647p;
                mo47362g();
                String str2 = format2.sampleMimeType;
                if ("audio/mp4a-latm".equals(str2) || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    C13981g gVar = this.f31633i;
                    gVar.getClass();
                    gVar.f30744l = 32;
                } else {
                    C13981g gVar2 = this.f31633i;
                    gVar2.getClass();
                    gVar2.f30744l = 1;
                }
                this.f31625Z = true;
            }
        }
    }

    /* renamed from: u */
    public final void mo47373u(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        if (this.f31602D == null) {
            try {
                List<C14246c> l = mo47367l(z);
                ArrayDeque<C14246c> arrayDeque = new ArrayDeque<>();
                this.f31602D = arrayDeque;
                if (this.f31628d) {
                    arrayDeque.addAll(l);
                } else if (!l.isEmpty()) {
                    this.f31602D.add(l.get(0));
                }
                this.f31604E = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.f31647p, (Throwable) e, z, -49998);
            }
        }
        if (!this.f31602D.isEmpty()) {
            while (this.f31665y == null) {
                C14246c peekFirst = this.f31602D.peekFirst();
                if (mo47048L(peekFirst)) {
                    try {
                        mo47370s(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        String valueOf = String.valueOf(peekFirst);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 30);
                        sb.append("Failed to initialize decoder: ");
                        sb.append(valueOf);
                        C14075p.m21700l("MediaCodecRenderer", sb.toString(), e2);
                        this.f31602D.removeFirst();
                        DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.f31647p, (Throwable) e2, z, peekFirst);
                        if (this.f31604E == null) {
                            this.f31604E = decoderInitializationException;
                        } else {
                            this.f31604E = DecoderInitializationException.access$000(this.f31604E, decoderInitializationException);
                        }
                        if (this.f31602D.isEmpty()) {
                            throw this.f31604E;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f31602D = null;
            return;
        }
        throw new DecoderInitializationException(this.f31647p, (Throwable) null, z, -49999);
    }

    /* renamed from: v */
    public abstract void mo47077v(IllegalStateException illegalStateException);

    /* renamed from: w */
    public abstract void mo47078w(long j, long j2, String str);

    /* renamed from: x */
    public abstract void mo47079x(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x013a, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r12 == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00da, code lost:
        if (mo47363h() == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x010d, code lost:
        if (mo47363h() == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0120, code lost:
        if (mo47363h() == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0138, code lost:
        if (r0 == false) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a4  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p619mh.C18224e mo47080y(p594jh.C17948m0 r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r11 = this;
            r0 = 1
            r11.f31660v1 = r0
            com.google.android.exoplayer2.Format r4 = r12.f39134b
            r4.getClass()
            java.lang.String r1 = r4.sampleMimeType
            if (r1 == 0) goto L_0x0163
            com.google.android.exoplayer2.drm.DrmSession r12 = r12.f39133a
            com.google.android.exoplayer2.drm.DrmSession r1 = r11.f31653s
            com.google.android.exoplayer2.drm.DrmSession.m22143g(r1, r12)
            r11.f31653s = r12
            r11.f31647p = r4
            boolean r1 = r11.f31625Z
            r2 = 0
            if (r1 == 0) goto L_0x001f
            r11.f31635j1 = r0
            return r2
        L_0x001f:
            com.google.android.exoplayer2.mediacodec.b r1 = r11.f31665y
            if (r1 != 0) goto L_0x0029
            r11.f31602D = r2
            r11.mo47372t()
            return r2
        L_0x0029:
            com.google.android.exoplayer2.mediacodec.c r2 = r11.f31606F
            com.google.android.exoplayer2.Format r3 = r11.f31667z
            com.google.android.exoplayer2.drm.DrmSession r5 = r11.f31651r
            r6 = 23
            r7 = 0
            if (r5 != r12) goto L_0x0035
            goto L_0x0083
        L_0x0035:
            if (r12 == 0) goto L_0x0085
            if (r5 != 0) goto L_0x003a
            goto L_0x0085
        L_0x003a:
            int r8 = p513bj.C14049b0.f30913a
            if (r8 >= r6) goto L_0x003f
            goto L_0x0085
        L_0x003f:
            java.util.UUID r8 = p594jh.C17912g.f38901e
            java.util.UUID r5 = r5.mo47275c()
            boolean r5 = r8.equals(r5)
            if (r5 != 0) goto L_0x0085
            java.util.UUID r5 = r12.mo47275c()
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0056
            goto L_0x0085
        L_0x0056:
            oh.c r12 = r11.mo47368p(r12)
            if (r12 != 0) goto L_0x005d
            goto L_0x0085
        L_0x005d:
            boolean r5 = r2.f31697f
            if (r5 != 0) goto L_0x0083
            boolean r5 = r12.f40143c
            if (r5 == 0) goto L_0x0067
            r12 = r7
            goto L_0x0080
        L_0x0067:
            android.media.MediaCrypto r5 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x007f }
            java.util.UUID r8 = r12.f40141a     // Catch:{ MediaCryptoException -> 0x007f }
            byte[] r12 = r12.f40142b     // Catch:{ MediaCryptoException -> 0x007f }
            r5.<init>(r8, r12)     // Catch:{ MediaCryptoException -> 0x007f }
            java.lang.String r12 = r4.sampleMimeType     // Catch:{ all -> 0x007a }
            boolean r12 = r5.requiresSecureDecoderComponent(r12)     // Catch:{ all -> 0x007a }
            r5.release()
            goto L_0x0080
        L_0x007a:
            r12 = move-exception
            r5.release()
            throw r12
        L_0x007f:
            r12 = r0
        L_0x0080:
            if (r12 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r12 = r7
            goto L_0x0086
        L_0x0085:
            r12 = r0
        L_0x0086:
            r5 = 3
            if (r12 == 0) goto L_0x00a4
            boolean r12 = r11.f31646o1
            if (r12 == 0) goto L_0x0092
            r11.f31642m1 = r0
            r11.f31644n1 = r5
            goto L_0x0098
        L_0x0092:
            r11.mo47355G()
            r11.mo47372t()
        L_0x0098:
            mh.e r12 = new mh.e
            java.lang.String r2 = r2.f31692a
            r5 = 0
            r6 = 128(0x80, float:1.794E-43)
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x00a4:
            com.google.android.exoplayer2.drm.DrmSession r12 = r11.f31653s
            com.google.android.exoplayer2.drm.DrmSession r8 = r11.f31651r
            if (r12 == r8) goto L_0x00ac
            r12 = r0
            goto L_0x00ad
        L_0x00ac:
            r12 = r7
        L_0x00ad:
            if (r12 == 0) goto L_0x00b6
            int r8 = p513bj.C14049b0.f30913a
            if (r8 < r6) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r6 = r7
            goto L_0x00b7
        L_0x00b6:
            r6 = r0
        L_0x00b7:
            p513bj.C14075p.m21694f(r6)
            mh.e r6 = r11.mo47059e(r2, r3, r4)
            int r8 = r6.f39954d
            r9 = 16
            r10 = 2
            if (r8 == 0) goto L_0x013c
            if (r8 == r0) goto L_0x0110
            if (r8 == r10) goto L_0x00e4
            if (r8 != r5) goto L_0x00de
            boolean r0 = r11.mo47358O(r4)
            if (r0 != 0) goto L_0x00d2
            goto L_0x0116
        L_0x00d2:
            r11.f31667z = r4
            if (r12 == 0) goto L_0x014b
            boolean r12 = r11.mo47363h()
            if (r12 != 0) goto L_0x014b
            goto L_0x013a
        L_0x00de:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00e4:
            boolean r8 = r11.mo47358O(r4)
            if (r8 != 0) goto L_0x00eb
            goto L_0x0116
        L_0x00eb:
            r11.f31638k1 = r0
            r11.f31640l1 = r0
            int r8 = r11.f31607G
            if (r8 == r10) goto L_0x0103
            if (r8 != r0) goto L_0x0102
            int r8 = r4.width
            int r9 = r3.width
            if (r8 != r9) goto L_0x0102
            int r8 = r4.height
            int r9 = r3.height
            if (r8 != r9) goto L_0x0102
            goto L_0x0103
        L_0x0102:
            r0 = r7
        L_0x0103:
            r11.f31615O = r0
            r11.f31667z = r4
            if (r12 == 0) goto L_0x014b
            boolean r12 = r11.mo47363h()
            if (r12 != 0) goto L_0x014b
            goto L_0x013a
        L_0x0110:
            boolean r8 = r11.mo47358O(r4)
            if (r8 != 0) goto L_0x0118
        L_0x0116:
            r7 = r9
            goto L_0x014b
        L_0x0118:
            r11.f31667z = r4
            if (r12 == 0) goto L_0x0123
            boolean r12 = r11.mo47363h()
            if (r12 != 0) goto L_0x014b
            goto L_0x013a
        L_0x0123:
            boolean r12 = r11.f31646o1
            if (r12 == 0) goto L_0x0138
            r11.f31642m1 = r0
            boolean r12 = r11.f31609I
            if (r12 != 0) goto L_0x0135
            boolean r12 = r11.f31611K
            if (r12 == 0) goto L_0x0132
            goto L_0x0135
        L_0x0132:
            r11.f31644n1 = r0
            goto L_0x0138
        L_0x0135:
            r11.f31644n1 = r5
            r0 = r7
        L_0x0138:
            if (r0 != 0) goto L_0x014b
        L_0x013a:
            r7 = r10
            goto L_0x014b
        L_0x013c:
            boolean r12 = r11.f31646o1
            if (r12 == 0) goto L_0x0145
            r11.f31642m1 = r0
            r11.f31644n1 = r5
            goto L_0x014b
        L_0x0145:
            r11.mo47355G()
            r11.mo47372t()
        L_0x014b:
            int r12 = r6.f39954d
            if (r12 == 0) goto L_0x0162
            com.google.android.exoplayer2.mediacodec.b r12 = r11.f31665y
            if (r12 != r1) goto L_0x0157
            int r12 = r11.f31644n1
            if (r12 != r5) goto L_0x0162
        L_0x0157:
            mh.e r12 = new mh.e
            java.lang.String r2 = r2.f31692a
            r5 = 0
            r1 = r12
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r12
        L_0x0162:
            return r6
        L_0x0163:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.createRendererException(r12, r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.mo47080y(jh.m0):mh.e");
    }

    /* renamed from: z */
    public abstract void mo47081z(Format format, MediaFormat mediaFormat) throws ExoPlaybackException;

    public static class DecoderInitializationException extends Exception {
        public final C14246c codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(com.google.android.exoplayer2.Format r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                int r1 = r0.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.sampleMimeType
                if (r15 >= 0) goto L_0x002a
                java.lang.String r12 = "neg_"
                goto L_0x002c
            L_0x002a:
                java.lang.String r12 = ""
            L_0x002c:
                int r15 = java.lang.Math.abs(r15)
                int r0 = r12.length()
                int r0 = r0 + 71
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r1.append(r0)
                r1.append(r12)
                r1.append(r15)
                java.lang.String r9 = r1.toString()
                r10 = 0
                r8 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.Format, java.lang.Throwable, boolean, int):void");
        }

        public static DecoderInitializationException access$000(DecoderInitializationException decoderInitializationException, DecoderInitializationException decoderInitializationException2) {
            return new DecoderInitializationException(decoderInitializationException.getMessage(), decoderInitializationException.getCause(), decoderInitializationException.mimeType, decoderInitializationException.secureDecoderRequired, decoderInitializationException.codecInfo, decoderInitializationException.diagnosticInfo, decoderInitializationException2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(com.google.android.exoplayer2.Format r12, java.lang.Throwable r13, boolean r14, com.google.android.exoplayer2.mediacodec.C14246c r15) {
            /*
                r11 = this;
                java.lang.String r0 = r15.f31692a
                java.lang.String r1 = java.lang.String.valueOf(r12)
                r2 = 23
                int r2 = androidx.compose.animation.C0391c.m1055a(r0, r2)
                int r3 = r1.length()
                int r3 = r3 + r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r3)
                java.lang.String r3 = "Decoder init failed: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = ", "
                r2.append(r0)
                r2.append(r1)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.sampleMimeType
                int r12 = p513bj.C14049b0.f30913a
                r0 = 0
                r1 = 21
                if (r12 < r1) goto L_0x0040
                boolean r12 = r13 instanceof android.media.MediaCodec.CodecException
                if (r12 == 0) goto L_0x0040
                r12 = r13
                android.media.MediaCodec$CodecException r12 = (android.media.MediaCodec.CodecException) r12
                java.lang.String r12 = r12.getDiagnosticInfo()
                r9 = r12
                goto L_0x0041
            L_0x0040:
                r9 = r0
            L_0x0041:
                r10 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r8 = r15
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.Format, java.lang.Throwable, boolean, com.google.android.exoplayer2.mediacodec.c):void");
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, C14246c cVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = cVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
