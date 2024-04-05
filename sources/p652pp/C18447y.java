package p652pp;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.compose.foundation.layout.C0761x;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import p337de.tavendo.autobahn.WebSocketException;

/* renamed from: pp.y */
public final class C18447y extends Thread {

    /* renamed from: m */
    public static final String f40562m = C18447y.class.getName();

    /* renamed from: b */
    public final Handler f40563b;

    /* renamed from: c */
    public final SocketChannel f40564c;

    /* renamed from: d */
    public final C18446x f40565d;

    /* renamed from: e */
    public final ByteBuffer f40566e;

    /* renamed from: f */
    public C18429h f40567f;

    /* renamed from: g */
    public boolean f40568g = false;

    /* renamed from: h */
    public int f40569h;

    /* renamed from: i */
    public boolean f40570i = false;

    /* renamed from: j */
    public int f40571j;

    /* renamed from: k */
    public C18448a f40572k;

    /* renamed from: l */
    public C18430i f40573l = new C18430i();

    /* renamed from: pp.y$a */
    public static class C18448a {

        /* renamed from: a */
        public int f40574a;

        /* renamed from: b */
        public boolean f40575b;

        /* renamed from: c */
        public int f40576c;

        /* renamed from: d */
        public int f40577d;

        /* renamed from: e */
        public int f40578e;

        /* renamed from: f */
        public byte[] f40579f;
    }

    public C18447y(C18431j jVar, SocketChannel socketChannel, C18446x xVar) {
        super("WebSocketReader");
        this.f40563b = jVar;
        this.f40564c = socketChannel;
        this.f40565d = xVar;
        this.f40566e = ByteBuffer.allocateDirect(xVar.f40554a + 14);
        this.f40567f = new C18429h(xVar.f40555b);
        this.f40572k = null;
        this.f40569h = 1;
        Log.d(f40562m, "created");
    }

    /* JADX WARNING: Removed duplicated region for block: B:220:0x0424  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo69968a() throws java.lang.Exception {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f40569h
            r2 = 3
            r3 = 2
            r4 = 4
            r5 = 1
            r6 = 0
            r7 = 10
            if (r1 == r2) goto L_0x0077
            if (r1 != r3) goto L_0x0010
            goto L_0x0077
        L_0x0010:
            if (r1 != r5) goto L_0x0076
            java.nio.ByteBuffer r1 = r0.f40566e
            int r1 = r1.position()
            int r1 = r1 + -4
        L_0x001a:
            if (r1 >= 0) goto L_0x001d
            goto L_0x0072
        L_0x001d:
            java.nio.ByteBuffer r3 = r0.f40566e
            int r8 = r1 + 0
            byte r3 = r3.get(r8)
            r8 = 13
            if (r3 != r8) goto L_0x0073
            java.nio.ByteBuffer r3 = r0.f40566e
            int r9 = r1 + 1
            byte r3 = r3.get(r9)
            if (r3 != r7) goto L_0x0073
            java.nio.ByteBuffer r3 = r0.f40566e
            int r9 = r1 + 2
            byte r3 = r3.get(r9)
            if (r3 != r8) goto L_0x0073
            java.nio.ByteBuffer r3 = r0.f40566e
            int r8 = r1 + 3
            byte r3 = r3.get(r8)
            if (r3 != r7) goto L_0x0073
            pp.v r3 = new pp.v
            r3.<init>()
            r0.mo69969b(r3)
            java.nio.ByteBuffer r3 = r0.f40566e
            int r3 = r3.position()
            java.nio.ByteBuffer r7 = r0.f40566e
            int r1 = r1 + r4
            r7.position(r1)
            java.nio.ByteBuffer r1 = r0.f40566e
            r1.limit(r3)
            java.nio.ByteBuffer r1 = r0.f40566e
            r1.compact()
            java.nio.ByteBuffer r1 = r0.f40566e
            int r1 = r1.position()
            if (r1 <= 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r5 = r6
        L_0x006f:
            r0.f40569h = r2
            r6 = r5
        L_0x0072:
            return r6
        L_0x0073:
            int r1 = r1 + -1
            goto L_0x001a
        L_0x0076:
            return r6
        L_0x0077:
            pp.y$a r1 = r0.f40572k
            java.lang.String r8 = "logic error"
            r9 = 9
            r10 = 7
            r11 = 8
            if (r1 != 0) goto L_0x025a
            java.nio.ByteBuffer r1 = r0.f40566e
            int r1 = r1.position()
            if (r1 < r3) goto L_0x0257
            java.nio.ByteBuffer r1 = r0.f40566e
            byte r1 = r1.get(r6)
            r13 = r1 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0096
            r13 = r5
            goto L_0x0097
        L_0x0096:
            r13 = r6
        L_0x0097:
            r14 = r1 & 112(0x70, float:1.57E-43)
            int r14 = r14 >> r4
            r1 = r1 & 15
            java.nio.ByteBuffer r15 = r0.f40566e
            byte r15 = r15.get(r5)
            r6 = r15 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x00a8
            r6 = r5
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            r12 = 127(0x7f, float:1.78E-43)
            r15 = r15 & r12
            if (r14 != 0) goto L_0x024f
            if (r6 != 0) goto L_0x0247
            if (r1 <= r10) goto L_0x00f0
            if (r13 == 0) goto L_0x00e8
            r14 = 125(0x7d, float:1.75E-43)
            if (r15 > r14) goto L_0x00e0
            if (r1 == r11) goto L_0x00d3
            if (r1 == r9) goto L_0x00d3
            if (r1 != r7) goto L_0x00bf
            goto L_0x00d3
        L_0x00bf:
            de.tavendo.autobahn.WebSocketException r2 = new de.tavendo.autobahn.WebSocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "control frame using reserved opcode "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00d3:
            if (r1 != r11) goto L_0x0127
            if (r15 == r5) goto L_0x00d8
            goto L_0x0127
        L_0x00d8:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "received close control frame with payload len 1"
            r1.<init>(r2)
            throw r1
        L_0x00e0:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "control frame with payload length > 125 octets"
            r1.<init>(r2)
            throw r1
        L_0x00e8:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "fragmented control frame"
            r1.<init>(r2)
            throw r1
        L_0x00f0:
            if (r1 == 0) goto L_0x010b
            if (r1 == r5) goto L_0x010b
            if (r1 != r3) goto L_0x00f7
            goto L_0x010b
        L_0x00f7:
            de.tavendo.autobahn.WebSocketException r2 = new de.tavendo.autobahn.WebSocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "data frame using reserved opcode "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x010b:
            boolean r14 = r0.f40570i
            if (r14 != 0) goto L_0x011a
            if (r1 == 0) goto L_0x0112
            goto L_0x011a
        L_0x0112:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "received continuation data frame outside fragmented message"
            r1.<init>(r2)
            throw r1
        L_0x011a:
            if (r14 == 0) goto L_0x0127
            if (r1 != 0) goto L_0x011f
            goto L_0x0127
        L_0x011f:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "received non-continuation data frame while inside fragmented message"
            r1.<init>(r2)
            throw r1
        L_0x0127:
            if (r6 == 0) goto L_0x012b
            r14 = r4
            goto L_0x012c
        L_0x012b:
            r14 = 0
        L_0x012c:
            r5 = 126(0x7e, float:1.77E-43)
            if (r15 >= r5) goto L_0x0132
            int r14 = r14 + r3
            goto L_0x0139
        L_0x0132:
            if (r15 != r5) goto L_0x0136
            int r14 = r14 + r4
            goto L_0x0139
        L_0x0136:
            if (r15 != r12) goto L_0x0241
            int r14 = r14 + r7
        L_0x0139:
            java.nio.ByteBuffer r8 = r0.f40566e
            int r8 = r8.position()
            if (r8 < r14) goto L_0x0257
            java.lang.String r8 = "invalid data frame length (not using minimal length encoding)"
            if (r15 != r5) goto L_0x0167
            java.nio.ByteBuffer r5 = r0.f40566e
            byte r3 = r5.get(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r11
            java.nio.ByteBuffer r5 = r0.f40566e
            byte r2 = r5.get(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            long r2 = (long) r2
            r9 = 126(0x7e, double:6.23E-322)
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0161
            r7 = r4
            goto L_0x01e6
        L_0x0161:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            r1.<init>(r8)
            throw r1
        L_0x0167:
            if (r15 != r12) goto L_0x01e0
            java.nio.ByteBuffer r5 = r0.f40566e
            byte r5 = r5.get(r3)
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x01d8
            java.nio.ByteBuffer r5 = r0.f40566e
            byte r3 = r5.get(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 56
            java.nio.ByteBuffer r5 = r0.f40566e
            byte r2 = r5.get(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 48
            r2 = r2 | r3
            java.nio.ByteBuffer r3 = r0.f40566e
            byte r3 = r3.get(r4)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 40
            r2 = r2 | r3
            java.nio.ByteBuffer r3 = r0.f40566e
            r5 = 5
            byte r3 = r3.get(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 32
            r2 = r2 | r3
            java.nio.ByteBuffer r3 = r0.f40566e
            r5 = 6
            byte r3 = r3.get(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 24
            r2 = r2 | r3
            java.nio.ByteBuffer r3 = r0.f40566e
            byte r3 = r3.get(r10)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            java.nio.ByteBuffer r3 = r0.f40566e
            byte r3 = r3.get(r11)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r11
            r2 = r2 | r3
            java.nio.ByteBuffer r3 = r0.f40566e
            byte r3 = r3.get(r9)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            long r2 = (long) r2
            r9 = 65536(0x10000, double:3.2379E-319)
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x01d2
            goto L_0x01e6
        L_0x01d2:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            r1.<init>(r8)
            throw r1
        L_0x01d8:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "invalid data frame length (> 2^63)"
            r1.<init>(r2)
            throw r1
        L_0x01e0:
            long r7 = (long) r15
            r16 = r7
            r7 = r3
            r2 = r16
        L_0x01e6:
            pp.x r5 = r0.f40565d
            int r5 = r5.f40554a
            long r8 = (long) r5
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0239
            pp.y$a r5 = new pp.y$a
            r5.<init>()
            r0.f40572k = r5
            r5.f40574a = r1
            r5.f40575b = r13
            int r1 = (int) r2
            r5.f40577d = r1
            r5.f40576c = r14
            int r14 = r14 + r1
            r5.f40578e = r14
            if (r6 == 0) goto L_0x0220
            byte[] r1 = new byte[r4]
            r5.f40579f = r1
            r1 = 0
        L_0x0209:
            if (r1 < r4) goto L_0x020c
            goto L_0x0223
        L_0x020c:
            pp.y$a r2 = r0.f40572k
            byte[] r2 = r2.f40579f
            java.nio.ByteBuffer r3 = r0.f40566e
            int r5 = r7 + r1
            byte r3 = r3.get(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2[r7] = r3
            int r1 = r1 + 1
            goto L_0x0209
        L_0x0220:
            r1 = 0
            r5.f40579f = r1
        L_0x0223:
            pp.y$a r1 = r0.f40572k
            int r1 = r1.f40577d
            if (r1 == 0) goto L_0x0236
            java.nio.ByteBuffer r1 = r0.f40566e
            int r1 = r1.position()
            pp.y$a r2 = r0.f40572k
            int r2 = r2.f40578e
            if (r1 >= r2) goto L_0x0236
            goto L_0x0257
        L_0x0236:
            r5 = 1
            goto L_0x0428
        L_0x0239:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "frame payload too large"
            r1.<init>(r2)
            throw r1
        L_0x0241:
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r8)
            throw r1
        L_0x0247:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "masked server frame"
            r1.<init>(r2)
            throw r1
        L_0x024f:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "RSV != 0 and no extension negotiated"
            r1.<init>(r2)
            throw r1
        L_0x0257:
            r5 = 0
            goto L_0x0428
        L_0x025a:
            java.nio.ByteBuffer r1 = r0.f40566e
            int r1 = r1.position()
            pp.y$a r2 = r0.f40572k
            int r2 = r2.f40578e
            if (r1 < r2) goto L_0x0426
            java.nio.ByteBuffer r1 = r0.f40566e
            int r1 = r1.position()
            pp.y$a r2 = r0.f40572k
            int r4 = r2.f40577d
            if (r4 <= 0) goto L_0x0286
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r5 = r0.f40566e
            int r2 = r2.f40576c
            r5.position(r2)
            java.nio.ByteBuffer r2 = r0.f40566e
            pp.y$a r5 = r0.f40572k
            int r5 = r5.f40577d
            r6 = 0
            r2.get(r4, r6, r5)
            goto L_0x0287
        L_0x0286:
            r4 = 0
        L_0x0287:
            java.nio.ByteBuffer r2 = r0.f40566e
            pp.y$a r5 = r0.f40572k
            int r5 = r5.f40578e
            r2.position(r5)
            java.nio.ByteBuffer r2 = r0.f40566e
            r2.limit(r1)
            java.nio.ByteBuffer r1 = r0.f40566e
            r1.compact()
            pp.y$a r1 = r0.f40572k
            int r2 = r1.f40574a
            java.lang.String r5 = "UTF-8"
            if (r2 <= r10) goto L_0x035e
            if (r2 != r11) goto L_0x0340
            r2 = 1005(0x3ed, float:1.408E-42)
            int r1 = r1.f40577d
            if (r1 < r3) goto L_0x0335
            r6 = 0
            byte r2 = r4[r6]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 * 256
            r6 = 1
            byte r7 = r4[r6]
            r6 = r7 & 255(0xff, float:3.57E-43)
            int r2 = r2 + r6
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r2 < r6) goto L_0x0321
            if (r2 < r6) goto L_0x02df
            r7 = 2999(0xbb7, float:4.202E-42)
            if (r2 > r7) goto L_0x02df
            if (r2 == r6) goto L_0x02df
            r6 = 1001(0x3e9, float:1.403E-42)
            if (r2 == r6) goto L_0x02df
            r6 = 1002(0x3ea, float:1.404E-42)
            if (r2 == r6) goto L_0x02df
            r6 = 1003(0x3eb, float:1.406E-42)
            if (r2 == r6) goto L_0x02df
            r6 = 1007(0x3ef, float:1.411E-42)
            if (r2 == r6) goto L_0x02df
            r6 = 1008(0x3f0, float:1.413E-42)
            if (r2 == r6) goto L_0x02df
            r6 = 1009(0x3f1, float:1.414E-42)
            if (r2 == r6) goto L_0x02df
            r6 = 1010(0x3f2, float:1.415E-42)
            if (r2 != r6) goto L_0x0321
        L_0x02df:
            r6 = 5000(0x1388, float:7.006E-42)
            if (r2 >= r6) goto L_0x0321
            if (r1 <= r3) goto L_0x0335
            int r6 = r1 + -2
            byte[] r6 = new byte[r6]
            int r1 = r1 - r3
            r7 = 0
            java.lang.System.arraycopy(r4, r3, r6, r7, r1)
            int r1 = r6.length
            r3 = r7
            r4 = r3
        L_0x02f1:
            int r8 = r7 + r1
            if (r3 < r8) goto L_0x02f6
            goto L_0x0308
        L_0x02f6:
            int[] r7 = p652pp.C18430i.f40523b
            int r4 = r4 << 4
            int r4 = r4 + 256
            byte r8 = r6[r3]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r7[r8]
            int r4 = r4 + r8
            r4 = r7[r4]
            r7 = 1
            if (r4 != r7) goto L_0x031d
        L_0x0308:
            if (r4 != 0) goto L_0x030c
            r1 = 1
            goto L_0x030d
        L_0x030c:
            r1 = 0
        L_0x030d:
            if (r1 == 0) goto L_0x0315
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6, r5)
            goto L_0x0336
        L_0x0315:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "invalid close reasons (not UTF-8)"
            r1.<init>(r2)
            throw r1
        L_0x031d:
            int r3 = r3 + 1
            r7 = 0
            goto L_0x02f1
        L_0x0321:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "invalid close code "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x0335:
            r1 = 0
        L_0x0336:
            pp.n r3 = new pp.n
            r3.<init>(r2, r1)
            r0.mo69969b(r3)
            goto L_0x0417
        L_0x0340:
            if (r2 != r9) goto L_0x034c
            pp.q r1 = new pp.q
            r1.<init>(r4)
            r0.mo69969b(r1)
            goto L_0x0417
        L_0x034c:
            if (r2 != r7) goto L_0x0358
            pp.r r1 = new pp.r
            r1.<init>(r4)
            r0.mo69969b(r1)
            goto L_0x0417
        L_0x0358:
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r8)
            throw r1
        L_0x035e:
            boolean r1 = r0.f40570i
            if (r1 != 0) goto L_0x0374
            r1 = 1
            r0.f40570i = r1
            r0.f40571j = r2
            if (r2 != r1) goto L_0x0374
            pp.x r1 = r0.f40565d
            boolean r1 = r1.f40560g
            if (r1 == 0) goto L_0x0374
            pp.i r1 = r0.f40573l
            r2 = 0
            r1.f40524a = r2
        L_0x0374:
            if (r4 == 0) goto L_0x03ac
            pp.h r1 = r0.f40567f
            int r1 = r1.size()
            int r2 = r4.length
            int r1 = r1 + r2
            pp.x r2 = r0.f40565d
            int r6 = r2.f40555b
            if (r1 > r6) goto L_0x03a4
            int r1 = r0.f40571j
            r6 = 1
            if (r1 != r6) goto L_0x039e
            boolean r1 = r2.f40560g
            if (r1 == 0) goto L_0x039e
            pp.i r1 = r0.f40573l
            boolean r1 = r1.mo69962a(r4)
            if (r1 == 0) goto L_0x0396
            goto L_0x039e
        L_0x0396:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "invalid UTF-8 in text message payload"
            r1.<init>(r2)
            throw r1
        L_0x039e:
            pp.h r1 = r0.f40567f
            r1.write(r4)
            goto L_0x03ac
        L_0x03a4:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "message payload too large"
            r1.<init>(r2)
            throw r1
        L_0x03ac:
            pp.y$a r1 = r0.f40572k
            boolean r1 = r1.f40575b
            if (r1 == 0) goto L_0x0417
            int r1 = r0.f40571j
            r6 = 1
            if (r1 != r6) goto L_0x03f8
            pp.x r1 = r0.f40565d
            boolean r2 = r1.f40560g
            if (r2 == 0) goto L_0x03d1
            pp.i r2 = r0.f40573l
            int r2 = r2.f40524a
            if (r2 != 0) goto L_0x03c5
            r2 = r6
            goto L_0x03c6
        L_0x03c5:
            r2 = 0
        L_0x03c6:
            if (r2 == 0) goto L_0x03c9
            goto L_0x03d1
        L_0x03c9:
            de.tavendo.autobahn.WebSocketException r1 = new de.tavendo.autobahn.WebSocketException
            java.lang.String r2 = "UTF-8 text message payload ended within Unicode code point"
            r1.<init>(r2)
            throw r1
        L_0x03d1:
            boolean r1 = r1.f40556c
            if (r1 == 0) goto L_0x03e4
            pp.h r1 = r0.f40567f
            byte[] r1 = r1.toByteArray()
            pp.u r2 = new pp.u
            r2.<init>(r1)
            r0.mo69969b(r2)
            goto L_0x0408
        L_0x03e4:
            java.lang.String r1 = new java.lang.String
            pp.h r2 = r0.f40567f
            byte[] r2 = r2.toByteArray()
            r1.<init>(r2, r5)
            pp.w r2 = new pp.w
            r2.<init>(r1)
            r0.mo69969b(r2)
            goto L_0x0408
        L_0x03f8:
            if (r1 != r3) goto L_0x0411
            pp.h r1 = r0.f40567f
            byte[] r1 = r1.toByteArray()
            pp.l r2 = new pp.l
            r2.<init>(r1)
            r0.mo69969b(r2)
        L_0x0408:
            r1 = 0
            r0.f40570i = r1
            pp.h r2 = r0.f40567f
            r2.reset()
            goto L_0x0419
        L_0x0411:
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>(r8)
            throw r1
        L_0x0417:
            r1 = 0
            r6 = 1
        L_0x0419:
            r2 = 0
            r0.f40572k = r2
            java.nio.ByteBuffer r2 = r0.f40566e
            int r2 = r2.position()
            if (r2 <= 0) goto L_0x0427
            r5 = r6
            goto L_0x0428
        L_0x0426:
            r1 = 0
        L_0x0427:
            r5 = r1
        L_0x0428:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p652pp.C18447y.mo69968a():boolean");
    }

    /* renamed from: b */
    public final void mo69969b(C0761x xVar) {
        Message obtainMessage = this.f40563b.obtainMessage();
        obtainMessage.obj = xVar;
        this.f40563b.sendMessage(obtainMessage);
    }

    public final void run() {
        Log.d(f40562m, "running");
        try {
            this.f40566e.clear();
            do {
                int read = this.f40564c.read(this.f40566e);
                if (read > 0) {
                    do {
                    } while (mo69968a());
                } else if (read < 0) {
                    Log.d(f40562m, "run() : ConnectionLost");
                    mo69969b(new C18437o());
                    this.f40568g = true;
                }
            } while (!this.f40568g);
        } catch (WebSocketException e) {
            String str = f40562m;
            Log.d(str, "run() : WebSocketException (" + e.toString() + ")");
            mo69969b(new C18441s());
        } catch (Exception e2) {
            String str2 = f40562m;
            Log.d(str2, "run() : Exception (" + e2.toString() + ")");
            mo69969b(new C18438p(e2));
        } catch (Throwable th) {
            this.f40568g = true;
            throw th;
        }
        this.f40568g = true;
        Log.d(f40562m, "ended");
    }
}
