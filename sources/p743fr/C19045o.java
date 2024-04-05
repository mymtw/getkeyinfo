package p743fr;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.C19318k;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19736t;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import p735br.C18980c;
import p743fr.C19023b;
import p756lr.C19888c0;
import p756lr.C19890d0;
import p756lr.C19893f;
import p756lr.C19897i;

/* renamed from: fr.o */
public final class C19045o implements Closeable {

    /* renamed from: f */
    public static final Logger f42503f;

    /* renamed from: b */
    public final C19047b f42504b;

    /* renamed from: c */
    public final C19023b.C19024a f42505c;

    /* renamed from: d */
    public final C19897i f42506d;

    /* renamed from: e */
    public final boolean f42507e;

    /* renamed from: fr.o$a */
    public static final class C19046a {
        /* renamed from: a */
        public static int m32245a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException(C0087d.m235e("PROTOCOL_ERROR padding ", i3, " > remaining length ", i));
        }
    }

    /* renamed from: fr.o$b */
    public static final class C19047b implements C19888c0 {

        /* renamed from: b */
        public int f42508b;

        /* renamed from: c */
        public int f42509c;

        /* renamed from: d */
        public int f42510d;

        /* renamed from: e */
        public int f42511e;

        /* renamed from: f */
        public int f42512f;

        /* renamed from: g */
        public final C19897i f42513g;

        public C19047b(C19897i iVar) {
            this.f42513g = iVar;
        }

        /* renamed from: J */
        public final long mo68544J(C19893f fVar, long j) throws IOException {
            int i;
            int readInt;
            C19383o.m32797g(fVar, "sink");
            do {
                int i2 = this.f42511e;
                if (i2 == 0) {
                    this.f42513g.skip((long) this.f42512f);
                    this.f42512f = 0;
                    if ((this.f42509c & 4) != 0) {
                        return -1;
                    }
                    i = this.f42510d;
                    int r = C18980c.m32114r(this.f42513g);
                    this.f42511e = r;
                    this.f42508b = r;
                    byte readByte = this.f42513g.readByte() & 255;
                    this.f42509c = this.f42513g.readByte() & 255;
                    Logger logger = C19045o.f42503f;
                    if (logger.isLoggable(Level.FINE)) {
                        C19026c cVar = C19026c.f42421e;
                        int i3 = this.f42510d;
                        int i4 = this.f42508b;
                        int i5 = this.f42509c;
                        cVar.getClass();
                        logger.fine(C19026c.m32198a(i3, i4, readByte, i5, true));
                    }
                    readInt = this.f42513g.readInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    this.f42510d = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                } else {
                    long J = this.f42513g.mo68544J(fVar, Math.min(j, (long) i2));
                    if (J == -1) {
                        return -1;
                    }
                    this.f42511e -= (int) J;
                    return J;
                }
            } while (readInt == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        public final void close() throws IOException {
        }

        /* renamed from: m */
        public final C19890d0 mo68547m() {
            return this.f42513g.mo68547m();
        }
    }

    /* renamed from: fr.o$c */
    public interface C19048c {
        /* renamed from: a */
        void mo70496a(int i, long j);

        /* renamed from: b */
        void mo70497b(C19057t tVar);

        /* renamed from: c */
        void mo70498c();

        /* renamed from: d */
        void mo70499d();

        /* renamed from: e */
        void mo70500e(List list, int i) throws IOException;

        /* renamed from: f */
        void mo70501f(int i, int i2, C19897i iVar, boolean z) throws IOException;

        /* renamed from: g */
        void mo70502g(int i, int i2, boolean z);

        /* renamed from: h */
        void mo70503h(int i, ErrorCode errorCode);

        /* renamed from: i */
        void mo70504i(int i, List list, boolean z);

        /* renamed from: j */
        void mo70505j(int i, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(C19026c.class.getName());
        C19383o.m32796f(logger, "Logger.getLogger(Http2::class.java.name)");
        f42503f = logger;
    }

    public C19045o(C19897i iVar, boolean z) {
        this.f42506d = iVar;
        this.f42507e = z;
        C19047b bVar = new C19047b(iVar);
        this.f42504b = bVar;
        this.f42505c = new C19023b.C19024a(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d7, code lost:
        throw new java.io.IOException(p003a2.C0015b.m88g("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", r6));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo70506a(boolean r12, p743fr.C19045o.C19048c r13) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            r0 = 0
            lr.i r1 = r11.f42506d     // Catch:{ EOFException -> 0x0301 }
            r2 = 9
            r1.mo72723U(r2)     // Catch:{ EOFException -> 0x0301 }
            lr.i r1 = r11.f42506d
            int r1 = p735br.C18980c.m32114r(r1)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r2) goto L_0x02f5
            lr.i r3 = r11.f42506d
            byte r3 = r3.readByte()
            r3 = r3 & 255(0xff, float:3.57E-43)
            lr.i r4 = r11.f42506d
            byte r4 = r4.readByte()
            r4 = r4 & 255(0xff, float:3.57E-43)
            lr.i r5 = r11.f42506d
            int r5 = r5.readInt()
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = r5 & r6
            java.util.logging.Logger r7 = f42503f
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r8 = r7.isLoggable(r8)
            r9 = 1
            if (r8 == 0) goto L_0x0048
            fr.c r8 = p743fr.C19026c.f42421e
            r8.getClass()
            java.lang.String r8 = p743fr.C19026c.m32198a(r5, r1, r3, r4, r9)
            r7.fine(r8)
        L_0x0048:
            r7 = 4
            if (r12 == 0) goto L_0x007c
            if (r3 != r7) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "Expected a SETTINGS frame but was "
            java.lang.StringBuilder r13 = android.support.p013v4.media.C0072d.m201h(r13)
            fr.c r1 = p743fr.C19026c.f42421e
            r1.getClass()
            java.lang.String[] r1 = p743fr.C19026c.f42418b
            int r2 = r1.length
            if (r3 >= r2) goto L_0x0063
            r0 = r1[r3]
            goto L_0x0071
        L_0x0063:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r1[r0] = r2
            java.lang.String r0 = "0x%02x"
            java.lang.String r0 = p735br.C18980c.m32104h(r0, r1)
        L_0x0071:
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x007c:
            r12 = 5
            r8 = 0
            r10 = 8
            switch(r3) {
                case 0: goto L_0x02b6;
                case 1: goto L_0x0284;
                case 2: goto L_0x0265;
                case 3: goto L_0x0213;
                case 4: goto L_0x0173;
                case 5: goto L_0x0147;
                case 6: goto L_0x0119;
                case 7: goto L_0x00b7;
                case 8: goto L_0x008b;
                default: goto L_0x0083;
            }
        L_0x0083:
            lr.i r12 = r11.f42506d
            long r0 = (long) r1
            r12.skip(r0)
            goto L_0x02f4
        L_0x008b:
            if (r1 != r7) goto L_0x00ab
            lr.i r12 = r11.f42506d
            int r12 = r12.readInt()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = (long) r12
            long r0 = r0 & r2
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x00a3
            r13.mo70496a(r5, r0)
            goto L_0x02f4
        L_0x00a3:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "windowSizeIncrement was 0"
            r12.<init>(r13)
            throw r12
        L_0x00ab:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_WINDOW_UPDATE length !=4: "
            java.lang.String r13 = p003a2.C0015b.m88g(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x00b7:
            if (r1 < r10) goto L_0x010d
            if (r5 != 0) goto L_0x0105
            lr.i r12 = r11.f42506d
            int r12 = r12.readInt()
            lr.i r2 = r11.f42506d
            int r2 = r2.readInt()
            int r1 = r1 - r10
            okhttp3.internal.http2.ErrorCode$a r3 = okhttp3.internal.http2.ErrorCode.Companion
            r3.getClass()
            okhttp3.internal.http2.ErrorCode[] r3 = okhttp3.internal.http2.ErrorCode.values()
            int r4 = r3.length
            r5 = r0
        L_0x00d3:
            if (r5 >= r4) goto L_0x00e7
            r6 = r3[r5]
            int r7 = r6.getHttpCode()
            if (r7 != r2) goto L_0x00df
            r7 = r9
            goto L_0x00e0
        L_0x00df:
            r7 = r0
        L_0x00e0:
            if (r7 == 0) goto L_0x00e4
            r8 = r6
            goto L_0x00e7
        L_0x00e4:
            int r5 = r5 + 1
            goto L_0x00d3
        L_0x00e7:
            if (r8 == 0) goto L_0x00f9
            okio.ByteString r0 = okio.ByteString.EMPTY
            if (r1 <= 0) goto L_0x00f4
            lr.i r0 = r11.f42506d
            long r1 = (long) r1
            okio.ByteString r0 = r0.mo72725X(r1)
        L_0x00f4:
            r13.mo70505j(r12, r8, r0)
            goto L_0x02f4
        L_0x00f9:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_GOAWAY unexpected error code: "
            java.lang.String r13 = p003a2.C0015b.m88g(r13, r2)
            r12.<init>(r13)
            throw r12
        L_0x0105:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_GOAWAY streamId != 0"
            r12.<init>(r13)
            throw r12
        L_0x010d:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_GOAWAY length < 8: "
            java.lang.String r13 = p003a2.C0015b.m88g(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x0119:
            if (r1 != r10) goto L_0x013b
            if (r5 != 0) goto L_0x0133
            lr.i r12 = r11.f42506d
            int r12 = r12.readInt()
            lr.i r1 = r11.f42506d
            int r1 = r1.readInt()
            r2 = r4 & 1
            if (r2 == 0) goto L_0x012e
            r0 = r9
        L_0x012e:
            r13.mo70502g(r12, r1, r0)
            goto L_0x02f4
        L_0x0133:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PING streamId != 0"
            r12.<init>(r13)
            throw r12
        L_0x013b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PING length != 8: "
            java.lang.String r13 = p003a2.C0015b.m88g(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x0147:
            if (r5 == 0) goto L_0x016b
            r12 = r4 & 8
            if (r12 == 0) goto L_0x0155
            lr.i r12 = r11.f42506d
            byte r12 = r12.readByte()
            r0 = r12 & 255(0xff, float:3.57E-43)
        L_0x0155:
            lr.i r12 = r11.f42506d
            int r12 = r12.readInt()
            r12 = r12 & r6
            int r1 = r1 + -4
            int r1 = p743fr.C19045o.C19046a.m32245a(r1, r4, r0)
            java.util.List r0 = r11.mo70509d(r1, r0, r4, r5)
            r13.mo70500e(r0, r12)
            goto L_0x02f4
        L_0x016b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x0173:
            if (r5 != 0) goto L_0x020b
            r3 = r4 & 1
            if (r3 == 0) goto L_0x0188
            if (r1 != 0) goto L_0x0180
            r13.mo70499d()
            goto L_0x02f4
        L_0x0180:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "FRAME_SIZE_ERROR ack frame should be empty!"
            r12.<init>(r13)
            throw r12
        L_0x0188:
            int r3 = r1 % 6
            if (r3 != 0) goto L_0x01ff
            fr.t r3 = new fr.t
            r3.<init>()
            pq.i r0 = kotlin.jvm.internal.C19388s.m32816D0(r0, r1)
            r1 = 6
            pq.g r0 = kotlin.jvm.internal.C19388s.m32812B0(r0, r1)
            int r1 = r0.f44414b
            int r4 = r0.f44415c
            int r0 = r0.f44416d
            if (r0 < 0) goto L_0x01a5
            if (r1 > r4) goto L_0x01fa
            goto L_0x01a7
        L_0x01a5:
            if (r1 < r4) goto L_0x01fa
        L_0x01a7:
            lr.i r5 = r11.f42506d
            short r5 = r5.readShort()
            r6 = 65535(0xffff, float:9.1834E-41)
            byte[] r8 = p735br.C18980c.f42301a
            r5 = r5 & r6
            lr.i r6 = r11.f42506d
            int r6 = r6.readInt()
            r8 = 2
            if (r5 == r8) goto L_0x01e6
            r8 = 3
            if (r5 == r8) goto L_0x01e4
            if (r5 == r7) goto L_0x01d8
            if (r5 == r12) goto L_0x01c4
            goto L_0x01f3
        L_0x01c4:
            if (r6 < r2) goto L_0x01cc
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            if (r6 > r8) goto L_0x01cc
            goto L_0x01f3
        L_0x01cc:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "
            java.lang.String r13 = p003a2.C0015b.m88g(r13, r6)
            r12.<init>(r13)
            throw r12
        L_0x01d8:
            r5 = 7
            if (r6 < 0) goto L_0x01dc
            goto L_0x01f3
        L_0x01dc:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            r12.<init>(r13)
            throw r12
        L_0x01e4:
            r5 = r7
            goto L_0x01f3
        L_0x01e6:
            if (r6 == 0) goto L_0x01f3
            if (r6 != r9) goto L_0x01eb
            goto L_0x01f3
        L_0x01eb:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            r12.<init>(r13)
            throw r12
        L_0x01f3:
            r3.mo70536b(r5, r6)
            if (r1 == r4) goto L_0x01fa
            int r1 = r1 + r0
            goto L_0x01a7
        L_0x01fa:
            r13.mo70497b(r3)
            goto L_0x02f4
        L_0x01ff:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_SETTINGS length % 6 != 0: "
            java.lang.String r13 = p003a2.C0015b.m88g(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x020b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_SETTINGS streamId != 0"
            r12.<init>(r13)
            throw r12
        L_0x0213:
            if (r1 != r7) goto L_0x0257
            if (r5 == 0) goto L_0x024f
            lr.i r12 = r11.f42506d
            int r12 = r12.readInt()
            okhttp3.internal.http2.ErrorCode$a r1 = okhttp3.internal.http2.ErrorCode.Companion
            r1.getClass()
            okhttp3.internal.http2.ErrorCode[] r1 = okhttp3.internal.http2.ErrorCode.values()
            int r2 = r1.length
            r3 = r0
        L_0x0228:
            if (r3 >= r2) goto L_0x023c
            r4 = r1[r3]
            int r6 = r4.getHttpCode()
            if (r6 != r12) goto L_0x0234
            r6 = r9
            goto L_0x0235
        L_0x0234:
            r6 = r0
        L_0x0235:
            if (r6 == 0) goto L_0x0239
            r8 = r4
            goto L_0x023c
        L_0x0239:
            int r3 = r3 + 1
            goto L_0x0228
        L_0x023c:
            if (r8 == 0) goto L_0x0243
            r13.mo70503h(r5, r8)
            goto L_0x02f4
        L_0x0243:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "TYPE_RST_STREAM unexpected error code: "
            java.lang.String r12 = p003a2.C0015b.m88g(r0, r12)
            r13.<init>(r12)
            throw r13
        L_0x024f:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_RST_STREAM streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x0257:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_RST_STREAM length: "
            java.lang.String r0 = " != 4"
            java.lang.String r13 = android.support.p013v4.media.C0069a.m175f(r13, r1, r0)
            r12.<init>(r13)
            throw r12
        L_0x0265:
            if (r1 != r12) goto L_0x0276
            if (r5 == 0) goto L_0x026e
            r11.mo70510e(r13, r5)
            goto L_0x02f4
        L_0x026e:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PRIORITY streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x0276:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "TYPE_PRIORITY length: "
            java.lang.String r0 = " != 5"
            java.lang.String r13 = android.support.p013v4.media.C0069a.m175f(r13, r1, r0)
            r12.<init>(r13)
            throw r12
        L_0x0284:
            if (r5 == 0) goto L_0x02ae
            r12 = r4 & 1
            if (r12 == 0) goto L_0x028c
            r12 = r9
            goto L_0x028d
        L_0x028c:
            r12 = r0
        L_0x028d:
            r2 = r4 & 8
            if (r2 == 0) goto L_0x0299
            lr.i r0 = r11.f42506d
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x0299:
            r2 = r4 & 32
            if (r2 == 0) goto L_0x02a2
            r11.mo70510e(r13, r5)
            int r1 = r1 + -5
        L_0x02a2:
            int r1 = p743fr.C19045o.C19046a.m32245a(r1, r4, r0)
            java.util.List r0 = r11.mo70509d(r1, r0, r4, r5)
            r13.mo70504i(r5, r0, r12)
            goto L_0x02f4
        L_0x02ae:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x02b6:
            if (r5 == 0) goto L_0x02ec
            r12 = r4 & 1
            if (r12 == 0) goto L_0x02be
            r12 = r9
            goto L_0x02bf
        L_0x02be:
            r12 = r0
        L_0x02bf:
            r2 = r4 & 32
            if (r2 == 0) goto L_0x02c5
            r2 = r9
            goto L_0x02c6
        L_0x02c5:
            r2 = r0
        L_0x02c6:
            if (r2 != 0) goto L_0x02e4
            r2 = r4 & 8
            if (r2 == 0) goto L_0x02d4
            lr.i r0 = r11.f42506d
            byte r0 = r0.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
        L_0x02d4:
            int r1 = p743fr.C19045o.C19046a.m32245a(r1, r4, r0)
            lr.i r2 = r11.f42506d
            r13.mo70501f(r5, r1, r2, r12)
            lr.i r12 = r11.f42506d
            long r0 = (long) r0
            r12.skip(r0)
            goto L_0x02f4
        L_0x02e4:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            r12.<init>(r13)
            throw r12
        L_0x02ec:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            r12.<init>(r13)
            throw r12
        L_0x02f4:
            return r9
        L_0x02f5:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r13 = "FRAME_SIZE_ERROR: "
            java.lang.String r13 = p003a2.C0015b.m88g(r13, r1)
            r12.<init>(r13)
            throw r12
        L_0x0301:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p743fr.C19045o.mo70506a(boolean, fr.o$c):boolean");
    }

    /* renamed from: b */
    public final void mo70507b(C19048c cVar) throws IOException {
        C19383o.m32797g(cVar, "handler");
        if (!this.f42507e) {
            C19897i iVar = this.f42506d;
            ByteString byteString = C19026c.f42417a;
            ByteString X = iVar.mo72725X((long) byteString.size());
            Logger logger = f42503f;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder h = C0072d.m201h("<< CONNECTION ");
                h.append(X.hex());
                logger.fine(C18980c.m32104h(h.toString(), new Object[0]));
            }
            if (!C19383o.m32792b(byteString, X)) {
                StringBuilder h2 = C0072d.m201h("Expected a connection header but was ");
                h2.append(X.utf8());
                throw new IOException(h2.toString());
            }
        } else if (!mo70506a(true, cVar)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    public final void close() throws IOException {
        this.f42506d.close();
    }

    /* renamed from: d */
    public final List<C19022a> mo70509d(int i, int i2, int i3, int i4) throws IOException {
        C19047b bVar = this.f42504b;
        bVar.f42511e = i;
        bVar.f42508b = i;
        bVar.f42512f = i2;
        bVar.f42509c = i3;
        bVar.f42510d = i4;
        C19023b.C19024a aVar = this.f42505c;
        while (!aVar.f42401b.mo72733e0()) {
            byte readByte = aVar.f42401b.readByte();
            byte[] bArr = C18980c.f42301a;
            byte b = readByte & 255;
            if (b != 128) {
                boolean z = false;
                if ((b & 128) == 128) {
                    int e = aVar.mo70477e(b, 127) - 1;
                    if (e >= 0 && e <= C19023b.f42398a.length - 1) {
                        z = true;
                    }
                    if (z) {
                        aVar.f42400a.add(C19023b.f42398a[e]);
                    } else {
                        int length = aVar.f42403d + 1 + (e - C19023b.f42398a.length);
                        if (length >= 0) {
                            C19022a[] aVarArr = aVar.f42402c;
                            if (length < aVarArr.length) {
                                ArrayList arrayList = aVar.f42400a;
                                C19022a aVar2 = aVarArr[length];
                                C19383o.m32794d(aVar2);
                                arrayList.add(aVar2);
                            }
                        }
                        StringBuilder h = C0072d.m201h("Header index too large ");
                        h.append(e + 1);
                        throw new IOException(h.toString());
                    }
                } else if (b == 64) {
                    C19022a[] aVarArr2 = C19023b.f42398a;
                    ByteString d = aVar.mo70476d();
                    C19023b.m32187a(d);
                    aVar.mo70475c(new C19022a(d, aVar.mo70476d()));
                } else if ((b & 64) == 64) {
                    aVar.mo70475c(new C19022a(aVar.mo70474b(aVar.mo70477e(b, 63) - 1), aVar.mo70476d()));
                } else if ((b & 32) == 32) {
                    int e2 = aVar.mo70477e(b, 31);
                    aVar.f42407h = e2;
                    if (e2 < 0 || e2 > aVar.f42406g) {
                        StringBuilder h2 = C0072d.m201h("Invalid dynamic table size update ");
                        h2.append(aVar.f42407h);
                        throw new IOException(h2.toString());
                    }
                    int i5 = aVar.f42405f;
                    if (e2 < i5) {
                        if (e2 == 0) {
                            C19318k.m32610b1(aVar.f42402c, (C19736t) null);
                            aVar.f42403d = aVar.f42402c.length - 1;
                            aVar.f42404e = 0;
                            aVar.f42405f = 0;
                        } else {
                            aVar.mo70473a(i5 - e2);
                        }
                    }
                } else if (b == 16 || b == 0) {
                    C19022a[] aVarArr3 = C19023b.f42398a;
                    ByteString d2 = aVar.mo70476d();
                    C19023b.m32187a(d2);
                    aVar.f42400a.add(new C19022a(d2, aVar.mo70476d()));
                } else {
                    aVar.f42400a.add(new C19022a(aVar.mo70474b(aVar.mo70477e(b, 15) - 1), aVar.mo70476d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        C19023b.C19024a aVar3 = this.f42505c;
        List<C19022a> p1 = C19327t.m32660p1(aVar3.f42400a);
        aVar3.f42400a.clear();
        return p1;
    }

    /* renamed from: e */
    public final void mo70510e(C19048c cVar, int i) throws IOException {
        this.f42506d.readInt();
        this.f42506d.readByte();
        byte[] bArr = C18980c.f42301a;
        cVar.mo70498c();
    }
}
