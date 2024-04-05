package p685uh;

import android.support.p013v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p218q8.C7728a;
import p504ai.C13983i;
import p513bj.C14049b0;
import p513bj.C14068n;
import p513bj.C14075p;
import p513bj.C14077r;
import p644ph.C18346e;
import p644ph.C18349h;
import p644ph.C18350i;
import p644ph.C18351j;
import p644ph.C18368v;

/* renamed from: uh.d */
public final class C18577d implements C18349h {

    /* renamed from: b0 */
    public static final byte[] f40909b0 = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0 */
    public static final byte[] f40910c0 = C14049b0.m21652y("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0 */
    public static final byte[] f40911d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e0 */
    public static final UUID f40912e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0 */
    public static final Map<String, Integer> f40913f0;

    /* renamed from: A */
    public long f40914A = -1;

    /* renamed from: B */
    public long f40915B = -9223372036854775807L;

    /* renamed from: C */
    public C7728a f40916C;

    /* renamed from: D */
    public C7728a f40917D;

    /* renamed from: E */
    public boolean f40918E;

    /* renamed from: F */
    public boolean f40919F;

    /* renamed from: G */
    public int f40920G;

    /* renamed from: H */
    public long f40921H;

    /* renamed from: I */
    public long f40922I;

    /* renamed from: J */
    public int f40923J;

    /* renamed from: K */
    public int f40924K;

    /* renamed from: L */
    public int[] f40925L;

    /* renamed from: M */
    public int f40926M;

    /* renamed from: N */
    public int f40927N;

    /* renamed from: O */
    public int f40928O;

    /* renamed from: P */
    public int f40929P;

    /* renamed from: Q */
    public boolean f40930Q;

    /* renamed from: R */
    public int f40931R;

    /* renamed from: S */
    public int f40932S;

    /* renamed from: T */
    public int f40933T;

    /* renamed from: U */
    public boolean f40934U;

    /* renamed from: V */
    public boolean f40935V;

    /* renamed from: W */
    public boolean f40936W;

    /* renamed from: X */
    public int f40937X;

    /* renamed from: Y */
    public byte f40938Y;

    /* renamed from: Z */
    public boolean f40939Z;

    /* renamed from: a */
    public final C18576c f40940a;

    /* renamed from: a0 */
    public C18351j f40941a0;

    /* renamed from: b */
    public final C18582f f40942b;

    /* renamed from: c */
    public final SparseArray<C18579b> f40943c;

    /* renamed from: d */
    public final boolean f40944d;

    /* renamed from: e */
    public final C14077r f40945e;

    /* renamed from: f */
    public final C14077r f40946f;

    /* renamed from: g */
    public final C14077r f40947g;

    /* renamed from: h */
    public final C14077r f40948h;

    /* renamed from: i */
    public final C14077r f40949i;

    /* renamed from: j */
    public final C14077r f40950j;

    /* renamed from: k */
    public final C14077r f40951k;

    /* renamed from: l */
    public final C14077r f40952l;

    /* renamed from: m */
    public final C14077r f40953m;

    /* renamed from: n */
    public final C14077r f40954n;

    /* renamed from: o */
    public ByteBuffer f40955o;

    /* renamed from: p */
    public long f40956p;

    /* renamed from: q */
    public long f40957q = -1;

    /* renamed from: r */
    public long f40958r = -9223372036854775807L;

    /* renamed from: s */
    public long f40959s = -9223372036854775807L;

    /* renamed from: t */
    public long f40960t = -9223372036854775807L;

    /* renamed from: u */
    public C18579b f40961u;

    /* renamed from: v */
    public boolean f40962v;

    /* renamed from: w */
    public int f40963w;

    /* renamed from: x */
    public long f40964x;

    /* renamed from: y */
    public boolean f40965y;

    /* renamed from: z */
    public long f40966z = -1;

    /* renamed from: uh.d$a */
    public final class C18578a implements C18575b {
        public C18578a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f0, code lost:
            r9 = r27;
            r5 = r32;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0349, code lost:
            r9 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x0358, code lost:
            r9 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x035d, code lost:
            r27 = r9;
            r9 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03bb, code lost:
            r2 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03bc, code lost:
            switch(r2) {
                case 0: goto L_0x03c1;
                case 1: goto L_0x03c1;
                case 2: goto L_0x03c1;
                case 3: goto L_0x03c1;
                case 4: goto L_0x03c1;
                case 5: goto L_0x03c1;
                case 6: goto L_0x03c1;
                case 7: goto L_0x03c1;
                case 8: goto L_0x03c1;
                case 9: goto L_0x03c1;
                case 10: goto L_0x03c1;
                case 11: goto L_0x03c1;
                case 12: goto L_0x03c1;
                case 13: goto L_0x03c1;
                case 14: goto L_0x03c1;
                case 15: goto L_0x03c1;
                case 16: goto L_0x03c1;
                case 17: goto L_0x03c1;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03c1;
                case 20: goto L_0x03c1;
                case 21: goto L_0x03c1;
                case 22: goto L_0x03c1;
                case 23: goto L_0x03c1;
                case 24: goto L_0x03c1;
                case 25: goto L_0x03c1;
                case 26: goto L_0x03c1;
                case 27: goto L_0x03c1;
                case 28: goto L_0x03c1;
                case 29: goto L_0x03c1;
                case 30: goto L_0x03c1;
                case 31: goto L_0x03c1;
                default: goto L_0x03bf;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x03bf, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03c1, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x03c2, code lost:
            if (r2 == false) goto L_0x0b65;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03c4, code lost:
            r21 = r9;
            r2 = r19;
            r19 = r20.f40941a0;
            r34 = r2.f40995c;
            r9 = r2.f40994b;
            r9.getClass();
            r37 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e1, code lost:
            switch(r9.hashCode()) {
                case -2095576542: goto L_0x0566;
                case -2095575984: goto L_0x055b;
                case -1985379776: goto L_0x0550;
                case -1784763192: goto L_0x0545;
                case -1730367663: goto L_0x053a;
                case -1482641358: goto L_0x052f;
                case -1482641357: goto L_0x0524;
                case -1373388978: goto L_0x0519;
                case -933872740: goto L_0x050c;
                case -538363189: goto L_0x04fe;
                case -538363109: goto L_0x04f0;
                case -425012669: goto L_0x04e4;
                case -356037306: goto L_0x04d8;
                case 62923557: goto L_0x04cc;
                case 62923603: goto L_0x04c0;
                case 62927045: goto L_0x04b4;
                case 82318131: goto L_0x04a8;
                case 82338133: goto L_0x049c;
                case 82338134: goto L_0x0490;
                case 99146302: goto L_0x0484;
                case 444813526: goto L_0x0478;
                case 542569478: goto L_0x046c;
                case 635596514: goto L_0x0460;
                case 725948237: goto L_0x0454;
                case 725957860: goto L_0x0448;
                case 738597099: goto L_0x043a;
                case 855502857: goto L_0x042c;
                case 1422270023: goto L_0x041e;
                case 1809237540: goto L_0x0410;
                case 1950749482: goto L_0x0402;
                case 1950789798: goto L_0x03f4;
                case 1951062397: goto L_0x03e6;
                default: goto L_0x03e4;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x03ec, code lost:
            if (r9.equals("A_OPUS") != false) goto L_0x03f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f0, code lost:
            r0 = 31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03fa, code lost:
            if (r9.equals("A_FLAC") != false) goto L_0x03fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x03fe, code lost:
            r0 = 30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x0408, code lost:
            if (r9.equals("A_EAC3") != false) goto L_0x040c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x040c, code lost:
            r0 = 29;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0416, code lost:
            if (r9.equals("V_MPEG2") != false) goto L_0x041a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x041a, code lost:
            r0 = 28;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x0424, code lost:
            if (r9.equals("S_TEXT/UTF8") != false) goto L_0x0428;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x0428, code lost:
            r0 = 27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x0432, code lost:
            if (r9.equals("V_MPEGH/ISO/HEVC") != false) goto L_0x0436;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0436, code lost:
            r0 = 26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0440, code lost:
            if (r9.equals("S_TEXT/ASS") != false) goto L_0x0444;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0444, code lost:
            r0 = 25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x044c, code lost:
            if (r9.equals("A_PCM/INT/LIT") != false) goto L_0x0450;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x0450, code lost:
            r0 = 24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0458, code lost:
            if (r9.equals("A_PCM/INT/BIG") != false) goto L_0x045c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x045c, code lost:
            r0 = 23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x0464, code lost:
            if (r9.equals("A_PCM/FLOAT/IEEE") != false) goto L_0x0468;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x0468, code lost:
            r0 = 22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0470, code lost:
            if (r9.equals("A_DTS/EXPRESS") != false) goto L_0x0474;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x0474, code lost:
            r0 = 21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x047c, code lost:
            if (r9.equals("V_THEORA") != false) goto L_0x0480;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0480, code lost:
            r0 = 20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x0488, code lost:
            if (r9.equals("S_HDMV/PGS") != false) goto L_0x048c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x048c, code lost:
            r0 = 19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x0494, code lost:
            if (r9.equals("V_VP9") != false) goto L_0x0498;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x0498, code lost:
            r0 = 18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x04a0, code lost:
            if (r9.equals("V_VP8") != false) goto L_0x04a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x04a4, code lost:
            r0 = 17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x04ac, code lost:
            if (r9.equals("V_AV1") != false) goto L_0x04b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x04b0, code lost:
            r0 = 16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x04b8, code lost:
            if (r9.equals("A_DTS") != false) goto L_0x04bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:239:0x04bc, code lost:
            r0 = 15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x04c4, code lost:
            if (r9.equals("A_AC3") != false) goto L_0x04c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x04c8, code lost:
            r0 = 14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x04d0, code lost:
            if (r9.equals("A_AAC") != false) goto L_0x04d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x04d4, code lost:
            r0 = org.apache.commons.lang3.CharUtils.f44393CR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x04dc, code lost:
            if (r9.equals("A_DTS/LOSSLESS") != false) goto L_0x04e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:248:0x04e0, code lost:
            r0 = 12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:0x04e8, code lost:
            if (r9.equals(r5) != false) goto L_0x04ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x04ec, code lost:
            r0 = 11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x04f6, code lost:
            if (r9.equals(r31) != false) goto L_0x04fa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x04fa, code lost:
            r0 = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:256:0x0504, code lost:
            if (r9.equals(r30) != false) goto L_0x0508;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x0508, code lost:
            r0 = 9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:259:0x0512, code lost:
            if (r9.equals(r29) != false) goto L_0x0516;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:260:0x0516, code lost:
            r0 = 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:262:0x051f, code lost:
            if (r9.equals(r28) != false) goto L_0x0522;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x0522, code lost:
            r0 = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:0x052a, code lost:
            if (r9.equals(r27) != false) goto L_0x052d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x052d, code lost:
            r0 = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:268:0x0535, code lost:
            if (r9.equals(r26) != false) goto L_0x0538;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:269:0x0538, code lost:
            r0 = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:271:0x0540, code lost:
            if (r9.equals(r25) != false) goto L_0x0543;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:272:0x0543, code lost:
            r0 = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:274:0x054b, code lost:
            if (r9.equals(r24) != false) goto L_0x054e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:275:0x054e, code lost:
            r0 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:277:0x0556, code lost:
            if (r9.equals(r23) != false) goto L_0x0559;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:278:0x0559, code lost:
            r0 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:280:0x0561, code lost:
            if (r9.equals(r22) != false) goto L_0x0564;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:281:0x0564, code lost:
            r0 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:283:0x056c, code lost:
            if (r9.equals(r21) != false) goto L_0x056f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:284:0x056f, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:285:0x0571, code lost:
            r0 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:286:0x0572, code lost:
            r1 = "video/x-unknown";
            r4 = "audio/x-unknown";
            r6 = "audio/raw";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:287:0x057c, code lost:
            switch(r0) {
                case 0: goto L_0x0922;
                case 1: goto L_0x0922;
                case 2: goto L_0x08a4;
                case 3: goto L_0x0895;
                case 4: goto L_0x0811;
                case 5: goto L_0x0801;
                case 6: goto L_0x07fc;
                case 7: goto L_0x0744;
                case 8: goto L_0x0726;
                case 9: goto L_0x0922;
                case 10: goto L_0x0702;
                case 11: goto L_0x06f3;
                case 12: goto L_0x06eb;
                case 13: goto L_0x06c4;
                case 14: goto L_0x06bf;
                case 15: goto L_0x06ba;
                case 16: goto L_0x06b5;
                case 17: goto L_0x06b0;
                case 18: goto L_0x06ab;
                case 19: goto L_0x06a6;
                case 20: goto L_0x06a3;
                case 21: goto L_0x06ba;
                case 22: goto L_0x0674;
                case 23: goto L_0x0647;
                case 24: goto L_0x061d;
                case 25: goto L_0x060b;
                case 26: goto L_0x05ee;
                case 27: goto L_0x05e8;
                case 28: goto L_0x05e2;
                case 29: goto L_0x05dc;
                case 30: goto L_0x05cc;
                case 31: goto L_0x0587;
                default: goto L_0x057f;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:0x0586, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unrecognized codec identifier.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:290:0x0587, code lost:
            r0 = 5760;
            r1 = new java.util.ArrayList(3);
            r7 = r37;
            r1.add(r7.mo70084a(r7.f40994b));
            r3 = java.nio.ByteBuffer.allocate(8);
            r4 = java.nio.ByteOrder.LITTLE_ENDIAN;
            r1.add(r3.order(r4).putLong(r7.f40985R).array());
            r1.add(java.nio.ByteBuffer.allocate(8).order(r4).putLong(r7.f40986S).array());
            r6 = "audio/opus";
            r8 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:291:0x05cc, code lost:
            r7 = r37;
            r0 = java.util.Collections.singletonList(r7.mo70084a(r7.f40994b));
            r1 = "audio/flac";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:292:0x05dc, code lost:
            r7 = r37;
            r1 = "audio/eac3";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:293:0x05e2, code lost:
            r7 = r37;
            r1 = "video/mpeg2";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:294:0x05e8, code lost:
            r7 = r37;
            r1 = "application/x-subrip";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:295:0x05ee, code lost:
            r7 = r37;
            r0 = p520cj.C14148d.m21904a(new p513bj.C14077r(r7.mo70084a(r7.f40994b)));
            r1 = r0.f31179a;
            r7.f40992Y = r0.f31180b;
            r0 = r0.f31181c;
            r2 = "video/hevc";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:296:0x060b, code lost:
            r7 = r37;
            r0 = com.google.common.collect.ImmutableList.m25828of(p685uh.C18577d.f40910c0, r7.mo70084a(r7.f40994b));
            r1 = "text/x-ssa";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:297:0x061d, code lost:
            r7 = r37;
            r9 = p513bj.C14049b0.m21646s(r7.f40983P);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:298:0x0625, code lost:
            if (r9 != 0) goto L_0x067d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:299:0x0627, code lost:
            r0 = r7.f40983P;
            r2 = new java.lang.StringBuilder(89);
            r2.append("Unsupported little endian PCM bit depth: ");
            r2.append(r0);
            r2.append(". Setting mimeType to ");
            r2.append(r4);
            android.util.Log.w("MatroskaExtractor", r2.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:300:0x0647, code lost:
            r7 = r37;
            r0 = r7.f40983P;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:301:0x064b, code lost:
            if (r0 != 8) goto L_0x064f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:302:0x064d, code lost:
            r3 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:304:0x0651, code lost:
            if (r0 != 16) goto L_0x0656;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:305:0x0653, code lost:
            r9 = 268435456;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:306:0x0656, code lost:
            r2 = new java.lang.StringBuilder(86);
            r2.append("Unsupported big endian PCM bit depth: ");
            r2.append(r0);
            r2.append(". Setting mimeType to ");
            r2.append(r4);
            android.util.Log.w("MatroskaExtractor", r2.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:307:0x0674, code lost:
            r7 = r37;
            r0 = r7.f40983P;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:308:0x067a, code lost:
            if (r0 != 32) goto L_0x0686;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:309:0x067c, code lost:
            r9 = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:310:0x067d, code lost:
            r3 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:311:0x067e, code lost:
            r4 = r3;
            r0 = -1;
            r1 = null;
            r2 = 1;
            r3 = null;
            r8 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:312:0x0686, code lost:
            r2 = new java.lang.StringBuilder(90);
            r2.append("Unsupported floating point PCM bit depth: ");
            r2.append(r0);
            r2.append(". Setting mimeType to ");
            r2.append(r4);
            android.util.Log.w("MatroskaExtractor", r2.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:313:0x06a3, code lost:
            r7 = r37;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:314:0x06a6, code lost:
            r7 = r37;
            r1 = "application/pgs";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:315:0x06ab, code lost:
            r7 = r37;
            r1 = "video/x-vnd.on2.vp9";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:316:0x06b0, code lost:
            r7 = r37;
            r1 = "video/x-vnd.on2.vp8";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:317:0x06b5, code lost:
            r7 = r37;
            r1 = "video/av01";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:318:0x06ba, code lost:
            r7 = r37;
            r1 = "audio/vnd.dts";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:319:0x06bf, code lost:
            r7 = r37;
            r1 = "audio/ac3";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:320:0x06c4, code lost:
            r7 = r37;
            r0 = java.util.Collections.singletonList(r7.mo70084a(r7.f40994b));
            r1 = r7.f41003k;
            r2 = p611lh.C18162a.m30677c(new p513bj.C14076q(r1.length, r1), false);
            r7.f40984Q = r2.f39725a;
            r7.f40982O = r2.f39726b;
            r1 = r2.f39727c;
            r2 = "audio/mp4a-latm";
            r15 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:321:0x06eb, code lost:
            r7 = r37;
            r1 = "audio/vnd.dts.hd";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:322:0x06ef, code lost:
            r4 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:323:0x06f0, code lost:
            r2 = r4;
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:324:0x06f3, code lost:
            r7 = r37;
            r0 = com.google.common.collect.ImmutableList.m25827of(r7.mo70084a(r7.f40994b));
            r1 = "application/vobsub";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:325:0x0702, code lost:
            r7 = r37;
            r0 = p520cj.C14144a.m21898a(new p513bj.C14077r(r7.mo70084a(r7.f40994b)));
            r1 = r0.f31159a;
            r7.f40992Y = r0.f31160b;
            r0 = r0.f31164f;
            r2 = "video/avc";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:326:0x071d, code lost:
            r15 = r0;
            r0 = r1;
            r6 = r2;
            r3 = r15;
            r1 = -1;
            r2 = 1;
            r8 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:327:0x0726, code lost:
            r7 = r37;
            r1 = new byte[4];
            java.lang.System.arraycopy(r7.mo70084a(r7.f40994b), 0, r1, 0, 4);
            r0 = com.google.common.collect.ImmutableList.m25827of(r1);
            r1 = "application/dvbsubs";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:328:0x073b, code lost:
            r15 = r0;
            r2 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:329:0x073d, code lost:
            r0 = r15;
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:330:0x073f, code lost:
            r3 = r2;
            r2 = r15;
            r1 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:331:0x0744, code lost:
            r7 = r37;
            r0 = r7.mo70084a(r7.f40994b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:332:0x074f, code lost:
            if (16 > r0.length) goto L_0x0753;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:333:0x0751, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:334:0x0753, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:336:?, code lost:
            p513bj.C14075p.m21691c(r3);
            r2 = ((((((long) r0[17]) & 255) << 8) | (((long) r0[16]) & 255)) | ((((long) r0[18]) & 255) << 16)) | ((255 & ((long) r0[19])) << 24);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:337:0x077d, code lost:
            if (r2 != 1482049860) goto L_0x0788;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:338:0x077f, code lost:
            r0 = new android.util.Pair("video/divx", (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:340:0x078d, code lost:
            if (r2 != 859189832) goto L_0x0798;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:341:0x078f, code lost:
            r0 = new android.util.Pair("video/3gpp", (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:343:0x079d, code lost:
            if (r2 != 826496599) goto L_0x07de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:344:0x079f, code lost:
            r1 = 40;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:346:0x07a4, code lost:
            if (r1 >= (r0.length - 4)) goto L_0x07d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:348:0x07a8, code lost:
            if (r0[r1] != 0) goto L_0x07d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:350:0x07ae, code lost:
            if (r0[r1 + 1] != 0) goto L_0x07d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:352:0x07b5, code lost:
            if (r0[r1 + 2] != 1) goto L_0x07d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:354:0x07bd, code lost:
            if (r0[r1 + 3] != 15) goto L_0x07d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:355:0x07bf, code lost:
            r0 = new android.util.Pair("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r0, r1, r0.length)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:357:0x07d3, code lost:
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:359:0x07dd, code lost:
            throw new com.google.android.exoplayer2.ParserException("Failed to find FourCC VC1 initialization data");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:360:0x07de, code lost:
            android.util.Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
            r0 = new android.util.Pair(r1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:361:0x07e9, code lost:
            r0 = (java.util.List) r0.second;
            r2 = (java.lang.String) r0.first;
            r1 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:364:0x07fb, code lost:
            throw new com.google.android.exoplayer2.ParserException("Error parsing FourCC private data");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:365:0x07fc, code lost:
            r7 = r37;
            r0 = "audio/mpeg";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:366:0x0801, code lost:
            r7 = r37;
            r0 = "audio/mpeg-L2";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:367:0x0805, code lost:
            r1 = androidx.recyclerview.widget.RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT;
            r2 = r0;
            r0 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:368:0x0809, code lost:
            r3 = r2;
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:369:0x080b, code lost:
            r6 = r3;
            r8 = 3;
            r3 = r2;
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:370:0x0811, code lost:
            r7 = r37;
            r0 = 8192;
            r1 = r7.mo70084a(r7.f40994b);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:373:0x0821, code lost:
            if (r1[0] != 2) goto L_0x0889;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:374:0x0823, code lost:
            r3 = 1;
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:375:0x0825, code lost:
            r5 = r1[r3] & 255;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:376:0x082a, code lost:
            if (r5 != 255) goto L_0x0831;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:377:0x082c, code lost:
            r4 = r4 + 255;
            r3 = r3 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:378:0x0831, code lost:
            r3 = r3 + 1;
            r4 = r4 + r5;
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:379:0x0835, code lost:
            r8 = r1[r3] & 255;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:380:0x0838, code lost:
            if (r8 != 255) goto L_0x083f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:381:0x083a, code lost:
            r5 = r5 + 255;
            r3 = r3 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:382:0x083f, code lost:
            r3 = r3 + 1;
            r5 = r5 + r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:383:0x0844, code lost:
            if (r1[r3] != 1) goto L_0x0883;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:384:0x0846, code lost:
            r6 = new byte[r4];
            java.lang.System.arraycopy(r1, r3, r6, 0, r4);
            r3 = r3 + r4;
            r8 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:385:0x0850, code lost:
            if (r1[r3] != 3) goto L_0x087d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:386:0x0852, code lost:
            r3 = r3 + r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:387:0x0856, code lost:
            if (r1[r3] != 5) goto L_0x0877;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:388:0x0858, code lost:
            r4 = new byte[(r1.length - r3)];
            java.lang.System.arraycopy(r1, r3, r4, 0, r1.length - r3);
            r1 = new java.util.ArrayList(2);
            r1.add(r6);
            r1.add(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:389:0x086e, code lost:
            r6 = "audio/vorbis";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:390:0x0871, code lost:
            r3 = r1;
            r1 = null;
            r2 = 1;
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:393:0x087c, code lost:
            throw new com.google.android.exoplayer2.ParserException("Error parsing vorbis codec private");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:395:0x0882, code lost:
            throw new com.google.android.exoplayer2.ParserException("Error parsing vorbis codec private");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:397:0x0888, code lost:
            throw new com.google.android.exoplayer2.ParserException("Error parsing vorbis codec private");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:399:0x088e, code lost:
            throw new com.google.android.exoplayer2.ParserException("Error parsing vorbis codec private");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:402:0x0894, code lost:
            throw new com.google.android.exoplayer2.ParserException("Error parsing vorbis codec private");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:403:0x0895, code lost:
            r7 = r37;
            r8 = 3;
            r7.f40987T = new p685uh.C18577d.C18580c();
            r4 = "audio/true-hd";
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:404:0x08a4, code lost:
            r7 = r37;
            r8 = 3;
            r0 = new p513bj.C14077r(r7.mo70084a(r7.f40994b));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
            r1 = r0.mo46918i();
            r2 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:407:0x08b7, code lost:
            if (r1 != 1) goto L_0x08ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:410:0x08bd, code lost:
            if (r1 != 65534) goto L_0x08e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:411:0x08bf, code lost:
            r0.mo46935z(24);
            r9 = r0.mo46919j();
            r1 = p685uh.C18577d.f40912e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:412:0x08d0, code lost:
            if (r9 != r1.getMostSignificantBits()) goto L_0x08e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:415:0x08dc, code lost:
            if (r0.mo46919j() != r1.getLeastSignificantBits()) goto L_0x08e0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:416:0x08de, code lost:
            r1 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:417:0x08e0, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:418:0x08e1, code lost:
            if (r1 == false) goto L_0x090f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:419:0x08e3, code lost:
            r0 = p513bj.C14049b0.m21646s(r7.f40983P);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:420:0x08e9, code lost:
            if (r0 != 0) goto L_0x090a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:421:0x08eb, code lost:
            r0 = r7.f40983P;
            r6 = new java.lang.StringBuilder(75);
            r6.append("Unsupported PCM bit depth: ");
            r6.append(r0);
            r6.append(". Setting mimeType to ");
            r6.append(r4);
            android.util.Log.w("MatroskaExtractor", r6.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:422:0x090a, code lost:
            r4 = r0;
            r0 = -1;
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:423:0x090f, code lost:
            android.util.Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:424:0x0918, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:427:0x0921, code lost:
            throw new com.google.android.exoplayer2.ParserException("Error parsing MS/ACM codec private");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:428:0x0922, code lost:
            r7 = r37;
            r2 = 1;
            r8 = 3;
            r0 = r7.f41003k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:429:0x0928, code lost:
            if (r0 != null) goto L_0x092c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:430:0x092a, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:431:0x092c, code lost:
            r1 = java.util.Collections.singletonList(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:432:0x0930, code lost:
            r4 = "video/mp4v-es";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:433:0x0932, code lost:
            r0 = r1;
            r6 = r4;
            r1 = -1;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:434:0x0936, code lost:
            r4 = -1;
            r38 = r3;
            r3 = r0;
            r0 = r1;
            r1 = r38;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:435:0x093d, code lost:
            r5 = r7.f40981N;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:436:0x093f, code lost:
            if (r5 == null) goto L_0x0950;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:437:0x0941, code lost:
            r5 = p520cj.C14145b.m21899a(new p513bj.C14077r(r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:438:0x094a, code lost:
            if (r5 == null) goto L_0x0950;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:439:0x094c, code lost:
            r1 = r5.f31165a;
            r6 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:440:0x0950, code lost:
            r5 = r7.f40989V | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:441:0x0956, code lost:
            if (r7.f40988U == false) goto L_0x095a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:442:0x0958, code lost:
            r9 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:443:0x095a, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:444:0x095b, code lost:
            r5 = r5 | r9;
            r9 = new com.google.android.exoplayer2.Format.C14176b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:445:0x0965, code lost:
            if (p513bj.C14065m.m21679i(r6) == false) goto L_0x0973;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:446:0x0967, code lost:
            r9.f31316x = r7.f40982O;
            r9.f31317y = r7.f40984Q;
            r9.f31318z = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:448:0x0977, code lost:
            if (p513bj.C14065m.m21681k(r6) == false) goto L_0x0af1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:450:0x097b, code lost:
            if (r7.f41009q != 0) goto L_0x098f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:451:0x097d, code lost:
            r2 = r7.f41007o;
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:452:0x0980, code lost:
            if (r2 != -1) goto L_0x0984;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:453:0x0982, code lost:
            r2 = r7.f41005m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:454:0x0984, code lost:
            r7.f41007o = r2;
            r2 = r7.f41008p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:455:0x0988, code lost:
            if (r2 != -1) goto L_0x098c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:456:0x098a, code lost:
            r2 = r7.f41006n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:457:0x098c, code lost:
            r7.f41008p = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:458:0x098f, code lost:
            r4 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:459:0x0990, code lost:
            r2 = -1.0f;
            r8 = r7.f41007o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:460:0x0994, code lost:
            if (r8 == r4) goto L_0x09a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:461:0x0996, code lost:
            r10 = r7.f41008p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:462:0x0998, code lost:
            if (r10 == r4) goto L_0x09a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:463:0x099a, code lost:
            r2 = ((float) (r7.f41006n * r8)) / ((float) (r7.f41005m * r10));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:465:0x09a5, code lost:
            if (r7.f41016x == false) goto L_0x0a70;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:467:0x09ad, code lost:
            if (r7.f40971D == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:469:0x09b3, code lost:
            if (r7.f40972E == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:471:0x09b9, code lost:
            if (r7.f40973F == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:473:0x09bf, code lost:
            if (r7.f40974G == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:475:0x09c5, code lost:
            if (r7.f40975H == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:477:0x09cb, code lost:
            if (r7.f40976I == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:479:0x09d1, code lost:
            if (r7.f40977J == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:481:0x09d7, code lost:
            if (r7.f40978K == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:483:0x09dd, code lost:
            if (r7.f40979L == -1.0f) goto L_0x0a63;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:485:0x09e3, code lost:
            if (r7.f40980M != -1.0f) goto L_0x09e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:486:0x09e7, code lost:
            r8 = new byte[25];
            r10 = java.nio.ByteBuffer.wrap(r8).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            r10.put((byte) 0);
            r10.putShort((short) ((int) ((r7.f40971D * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r7.f40972E * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r7.f40973F * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r7.f40974G * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r7.f40975H * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r7.f40976I * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r7.f40977J * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) ((r7.f40978K * 50000.0f) + 0.5f)));
            r10.putShort((short) ((int) (r7.f40979L + 0.5f)));
            r10.putShort((short) ((int) (r7.f40980M + 0.5f)));
            r10.putShort((short) r7.f40969B);
            r10.putShort((short) r7.f40970C);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a63, code lost:
            r8 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a64, code lost:
            r10 = new com.google.android.exoplayer2.video.ColorInfo(r7.f41017y, r7.f40968A, r7.f41018z, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a70, code lost:
            r10 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a71, code lost:
            r8 = r7.f40993a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a73, code lost:
            if (r8 == null) goto L_0x0a89;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a75, code lost:
            r11 = p685uh.C18577d.f40913f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a7b, code lost:
            if (r11.containsKey(r8) == false) goto L_0x0a89;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a7d, code lost:
            r4 = r11.get(r7.f40993a).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a8b, code lost:
            if (r7.f41010r != 0) goto L_0x0ad9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a94, code lost:
            if (java.lang.Float.compare(r7.f41011s, 0.0f) != 0) goto L_0x0ad9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a9c, code lost:
            if (java.lang.Float.compare(r7.f41012t, 0.0f) != 0) goto L_0x0ad9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:502:0x0aa4, code lost:
            if (java.lang.Float.compare(r7.f41013u, 0.0f) != 0) goto L_0x0aa8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:503:0x0aa6, code lost:
            r4 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:505:0x0ab0, code lost:
            if (java.lang.Float.compare(r7.f41012t, 90.0f) != 0) goto L_0x0ab5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:506:0x0ab2, code lost:
            r4 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:508:0x0abd, code lost:
            if (java.lang.Float.compare(r7.f41012t, -180.0f) == 0) goto L_0x0ad7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:510:0x0ac7, code lost:
            if (java.lang.Float.compare(r7.f41012t, 180.0f) != 0) goto L_0x0aca;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:512:0x0ad2, code lost:
            if (java.lang.Float.compare(r7.f41012t, -90.0f) != 0) goto L_0x0ad9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:513:0x0ad4, code lost:
            r4 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:514:0x0ad7, code lost:
            r4 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:515:0x0ad9, code lost:
            r9.f31308p = r7.f41005m;
            r9.f31309q = r7.f41006n;
            r9.f31312t = r2;
            r9.f31311s = r4;
            r9.f31313u = r7.f41014v;
            r9.f31314v = r7.f41015w;
            r9.f31315w = r10;
            r2 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:517:0x0af7, code lost:
            if ("application/x-subrip".equals(r6) != false) goto L_0x0b22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:519:0x0aff, code lost:
            if ("text/x-ssa".equals(r6) != false) goto L_0x0b22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b07, code lost:
            if ("application/vobsub".equals(r6) != false) goto L_0x0b22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b0f, code lost:
            if ("application/pgs".equals(r6) != false) goto L_0x0b22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b17, code lost:
            if ("application/dvbsubs".equals(r6) == false) goto L_0x0b1a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b21, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b22, code lost:
            r2 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b23, code lost:
            r4 = r7.f40993a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b25, code lost:
            if (r4 == null) goto L_0x0b33;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b2d, code lost:
            if (p685uh.C18577d.f40913f0.containsKey(r4) != false) goto L_0x0b33;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b2f, code lost:
            r9.f31294b = r7.f40993a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b33, code lost:
            r9.mo47145b(r34);
            r9.f31303k = r6;
            r9.f31304l = r0;
            r9.f31295c = r7.f40990W;
            r9.f31296d = r5 ? 1 : 0;
            r9.f31305m = r3;
            r9.f31300h = r1;
            r9.f31306n = r7.f41004l;
            r0 = r9.mo47144a();
            r1 = r19.mo4164r(r7.f40995c, r2);
            r7.f40991X = r1;
            r1.mo47752a(r0);
            r0 = r20;
            r0.f40943c.put(r7.f40995c, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b65, code lost:
            r0 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b67, code lost:
            r0.f40961u = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:578:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01dd, code lost:
            r9 = r21;
            r5 = r32;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo70083a(int r40) throws com.google.android.exoplayer2.ParserException {
            /*
                r39 = this;
                r0 = r39
                r1 = r40
                uh.d r8 = p685uh.C18577d.this
                ph.j r2 = r8.f40941a0
                p513bj.C14075p.m21696h(r2)
                r2 = 160(0xa0, float:2.24E-43)
                r9 = 0
                if (r1 == r2) goto L_0x0b73
                r2 = 174(0xae, float:2.44E-43)
                r4 = -1
                if (r1 == r2) goto L_0x017d
                r2 = 19899(0x4dbb, float:2.7884E-41)
                r3 = 475249515(0x1c53bb6b, float:7.0056276E-22)
                if (r1 == r2) goto L_0x0163
                r2 = 25152(0x6240, float:3.5245E-41)
                if (r1 == r2) goto L_0x0135
                r2 = 28032(0x6d80, float:3.9281E-41)
                if (r1 == r2) goto L_0x011e
                r2 = 357149030(0x1549a966, float:4.072526E-26)
                r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r1 == r2) goto L_0x0105
                r2 = 374648427(0x1654ae6b, float:1.718026E-25)
                if (r1 == r2) goto L_0x00ee
                if (r1 == r3) goto L_0x0037
                goto L_0x0bc4
            L_0x0037:
                boolean r1 = r8.f40962v
                if (r1 != 0) goto L_0x00e7
                ph.j r1 = r8.f40941a0
                q8.a r2 = r8.f40916C
                q8.a r3 = r8.f40917D
                long r12 = r8.f40957q
                r14 = -1
                int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r7 == 0) goto L_0x00da
                long r12 = r8.f40960t
                int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r7 == 0) goto L_0x00da
                if (r2 == 0) goto L_0x00da
                int r7 = r2.f17139a
                if (r7 == 0) goto L_0x00da
                if (r3 == 0) goto L_0x00da
                int r10 = r3.f17139a
                if (r10 == r7) goto L_0x005d
                goto L_0x00da
            L_0x005d:
                int[] r10 = new int[r7]
                long[] r11 = new long[r7]
                long[] r12 = new long[r7]
                long[] r13 = new long[r7]
                r14 = r9
            L_0x0066:
                if (r14 >= r7) goto L_0x007b
                long r15 = r2.mo20205b(r14)
                r13[r14] = r15
                long r5 = r8.f40957q
                long r17 = r3.mo20205b(r14)
                long r17 = r17 + r5
                r11[r14] = r17
                int r14 = r14 + 1
                goto L_0x0066
            L_0x007b:
                int r2 = r7 + -1
                if (r9 >= r2) goto L_0x0094
                int r2 = r9 + 1
                r5 = r11[r2]
                r17 = r11[r9]
                long r5 = r5 - r17
                int r3 = (int) r5
                r10[r9] = r3
                r5 = r13[r2]
                r17 = r13[r9]
                long r5 = r5 - r17
                r12[r9] = r5
                r9 = r2
                goto L_0x007b
            L_0x0094:
                long r3 = r8.f40957q
                long r5 = r8.f40956p
                long r3 = r3 + r5
                r5 = r11[r2]
                long r3 = r3 - r5
                int r3 = (int) r3
                r10[r2] = r3
                long r3 = r8.f40960t
                r5 = r13[r2]
                long r3 = r3 - r5
                r12[r2] = r3
                r5 = 0
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 > 0) goto L_0x00d4
                r5 = 72
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r5)
                java.lang.String r5 = "Discarding last cue point with unexpected duration: "
                r6.append(r5)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                java.lang.String r4 = "MatroskaExtractor"
                android.util.Log.w(r4, r3)
                int[] r10 = java.util.Arrays.copyOf(r10, r2)
                long[] r11 = java.util.Arrays.copyOf(r11, r2)
                long[] r12 = java.util.Arrays.copyOf(r12, r2)
                long[] r13 = java.util.Arrays.copyOf(r13, r2)
            L_0x00d4:
                ph.c r2 = new ph.c
                r2.<init>(r10, r11, r12, r13)
                goto L_0x00e1
            L_0x00da:
                ph.t$b r2 = new ph.t$b
                long r3 = r8.f40960t
                r2.<init>(r3)
            L_0x00e1:
                r1.mo4162l(r2)
                r1 = 1
                r8.f40962v = r1
            L_0x00e7:
                r1 = 0
                r8.f40916C = r1
                r8.f40917D = r1
                goto L_0x0bc4
            L_0x00ee:
                android.util.SparseArray<uh.d$b> r1 = r8.f40943c
                int r1 = r1.size()
                if (r1 == 0) goto L_0x00fd
                ph.j r1 = r8.f40941a0
                r1.mo4163p()
                goto L_0x0bc4
            L_0x00fd:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "No valid tracks were found"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x0105:
                long r1 = r8.f40958r
                int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r1 != 0) goto L_0x0110
                r1 = 1000000(0xf4240, double:4.940656E-318)
                r8.f40958r = r1
            L_0x0110:
                long r1 = r8.f40959s
                int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r3 == 0) goto L_0x0bc4
                long r1 = r8.mo70080k(r1)
                r8.f40960t = r1
                goto L_0x0bc4
            L_0x011e:
                r8.mo70076e(r1)
                uh.d$b r1 = r8.f40961u
                boolean r2 = r1.f41000h
                if (r2 == 0) goto L_0x0bc4
                byte[] r1 = r1.f41001i
                if (r1 != 0) goto L_0x012d
                goto L_0x0bc4
            L_0x012d:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Combining encryption and compression is not supported"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x0135:
                r8.mo70076e(r1)
                uh.d$b r1 = r8.f40961u
                boolean r2 = r1.f41000h
                if (r2 == 0) goto L_0x0bc4
                ph.v$a r2 = r1.f41002j
                if (r2 == 0) goto L_0x015b
                com.google.android.exoplayer2.drm.DrmInitData r3 = new com.google.android.exoplayer2.drm.DrmInitData
                r4 = 1
                com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r4 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[r4]
                com.google.android.exoplayer2.drm.DrmInitData$SchemeData r5 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
                java.util.UUID r6 = p594jh.C17912g.f38897a
                byte[] r2 = r2.f40336b
                java.lang.String r7 = "video/webm"
                r5.<init>(r6, r7, r2)
                r4[r9] = r5
                r3.<init>((com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r4)
                r1.f41004l = r3
                goto L_0x0bc4
            L_0x015b:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x0163:
                int r1 = r8.f40963w
                if (r1 == r4) goto L_0x0175
                long r4 = r8.f40964x
                r6 = -1
                int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r2 == 0) goto L_0x0175
                if (r1 != r3) goto L_0x0bc4
                r8.f40966z = r4
                goto L_0x0bc4
            L_0x0175:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x017d:
                uh.d$b r1 = r8.f40961u
                p513bj.C14075p.m21696h(r1)
                java.lang.String r2 = r1.f40994b
                if (r2 == 0) goto L_0x0b6b
                int r5 = r2.hashCode()
                java.lang.String r6 = "A_VORBIS"
                java.lang.String r7 = "A_TRUEHD"
                java.lang.String r10 = "A_MS/ACM"
                java.lang.String r11 = "V_MPEG4/ISO/SP"
                java.lang.String r12 = "V_MPEG4/ISO/AP"
                java.lang.String r15 = "V_AV1"
                java.lang.String r4 = "A_DTS"
                java.lang.String r3 = "A_AC3"
                java.lang.String r13 = "A_AAC"
                java.lang.String r14 = "A_DTS/LOSSLESS"
                java.lang.String r9 = "S_VOBSUB"
                java.lang.String r0 = "V_MPEG4/ISO/AVC"
                r19 = r1
                java.lang.String r1 = "V_MPEG4/ISO/ASP"
                r20 = r8
                java.lang.String r8 = "S_DVBSUB"
                r21 = r12
                java.lang.String r12 = "V_MS/VFW/FOURCC"
                r22 = r11
                java.lang.String r11 = "A_MPEG/L3"
                r23 = r10
                java.lang.String r10 = "A_MPEG/L2"
                r24 = r7
                java.lang.String r7 = "A_PCM/INT/LIT"
                r25 = r6
                java.lang.String r6 = "A_PCM/INT/BIG"
                r26 = r10
                java.lang.String r10 = "A_PCM/FLOAT/IEEE"
                r27 = r11
                java.lang.String r11 = "A_DTS/EXPRESS"
                r28 = r12
                java.lang.String r12 = "V_THEORA"
                r29 = r8
                java.lang.String r8 = "S_HDMV/PGS"
                r30 = r1
                java.lang.String r1 = "V_VP9"
                r31 = r0
                java.lang.String r0 = "V_VP8"
                r32 = r9
                r33 = 19
                switch(r5) {
                    case -2095576542: goto L_0x03ae;
                    case -2095575984: goto L_0x039f;
                    case -1985379776: goto L_0x0390;
                    case -1784763192: goto L_0x0381;
                    case -1730367663: goto L_0x0372;
                    case -1482641358: goto L_0x0363;
                    case -1482641357: goto L_0x034c;
                    case -1373388978: goto L_0x0339;
                    case -933872740: goto L_0x0327;
                    case -538363189: goto L_0x0315;
                    case -538363109: goto L_0x0303;
                    case -425012669: goto L_0x02f6;
                    case -356037306: goto L_0x02e6;
                    case 62923557: goto L_0x02db;
                    case 62923603: goto L_0x02d0;
                    case 62927045: goto L_0x02c0;
                    case 82318131: goto L_0x02b0;
                    case 82338133: goto L_0x02a0;
                    case 82338134: goto L_0x0290;
                    case 99146302: goto L_0x0280;
                    case 444813526: goto L_0x0274;
                    case 542569478: goto L_0x0268;
                    case 635596514: goto L_0x025c;
                    case 725948237: goto L_0x0251;
                    case 725957860: goto L_0x0242;
                    case 738597099: goto L_0x0231;
                    case 855502857: goto L_0x0224;
                    case 1422270023: goto L_0x0217;
                    case 1809237540: goto L_0x020a;
                    case 1950749482: goto L_0x01fd;
                    case 1950789798: goto L_0x01f0;
                    case 1951062397: goto L_0x01e3;
                    default: goto L_0x01dd;
                }
            L_0x01dd:
                r9 = r21
                r5 = r32
                goto L_0x03bb
            L_0x01e3:
                java.lang.String r5 = "A_OPUS"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01ec
                goto L_0x01dd
            L_0x01ec:
                r2 = 31
                goto L_0x02f0
            L_0x01f0:
                java.lang.String r5 = "A_FLAC"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x01f9
                goto L_0x01dd
            L_0x01f9:
                r2 = 30
                goto L_0x02f0
            L_0x01fd:
                java.lang.String r5 = "A_EAC3"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0206
                goto L_0x01dd
            L_0x0206:
                r2 = 29
                goto L_0x02f0
            L_0x020a:
                java.lang.String r5 = "V_MPEG2"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0213
                goto L_0x01dd
            L_0x0213:
                r2 = 28
                goto L_0x02f0
            L_0x0217:
                java.lang.String r5 = "S_TEXT/UTF8"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0220
                goto L_0x01dd
            L_0x0220:
                r2 = 27
                goto L_0x02f0
            L_0x0224:
                java.lang.String r5 = "V_MPEGH/ISO/HEVC"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x022d
                goto L_0x01dd
            L_0x022d:
                r2 = 26
                goto L_0x02f0
            L_0x0231:
                java.lang.String r5 = "S_TEXT/ASS"
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x023a
                goto L_0x01dd
            L_0x023a:
                r9 = r21
                r5 = r32
                r2 = 25
                goto L_0x03bc
            L_0x0242:
                boolean r2 = r2.equals(r7)
                if (r2 != 0) goto L_0x0249
                goto L_0x01dd
            L_0x0249:
                r9 = r27
                r5 = r32
                r2 = 24
                goto L_0x035d
            L_0x0251:
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0258
                goto L_0x01dd
            L_0x0258:
                r2 = 23
                goto L_0x02f0
            L_0x025c:
                boolean r2 = r2.equals(r10)
                if (r2 != 0) goto L_0x0264
                goto L_0x01dd
            L_0x0264:
                r2 = 22
                goto L_0x02f0
            L_0x0268:
                boolean r2 = r2.equals(r11)
                if (r2 != 0) goto L_0x0270
                goto L_0x01dd
            L_0x0270:
                r2 = 21
                goto L_0x02f0
            L_0x0274:
                boolean r2 = r2.equals(r12)
                if (r2 != 0) goto L_0x027c
                goto L_0x01dd
            L_0x027c:
                r2 = 20
                goto L_0x02f0
            L_0x0280:
                boolean r2 = r2.equals(r8)
                if (r2 != 0) goto L_0x0288
                goto L_0x01dd
            L_0x0288:
                r9 = r21
                r5 = r32
                r2 = r33
                goto L_0x03bc
            L_0x0290:
                boolean r2 = r2.equals(r1)
                if (r2 != 0) goto L_0x0298
                goto L_0x01dd
            L_0x0298:
                r9 = r27
                r5 = r32
                r2 = 18
                goto L_0x035d
            L_0x02a0:
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x02a8
                goto L_0x01dd
            L_0x02a8:
                r9 = r27
                r5 = r32
                r2 = 17
                goto L_0x035d
            L_0x02b0:
                boolean r2 = r2.equals(r15)
                if (r2 != 0) goto L_0x02b8
                goto L_0x01dd
            L_0x02b8:
                r9 = r21
                r5 = r32
                r2 = 16
                goto L_0x03bc
            L_0x02c0:
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x02c8
                goto L_0x01dd
            L_0x02c8:
                r9 = r21
                r5 = r32
                r2 = 15
                goto L_0x03bc
            L_0x02d0:
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x02d8
                goto L_0x01dd
            L_0x02d8:
                r2 = 14
                goto L_0x02f0
            L_0x02db:
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x02e3
                goto L_0x01dd
            L_0x02e3:
                r2 = 13
                goto L_0x02f0
            L_0x02e6:
                boolean r2 = r2.equals(r14)
                if (r2 != 0) goto L_0x02ee
                goto L_0x01dd
            L_0x02ee:
                r2 = 12
            L_0x02f0:
                r9 = r27
                r5 = r32
                goto L_0x035d
            L_0x02f6:
                r5 = r32
                boolean r2 = r2.equals(r5)
                if (r2 != 0) goto L_0x0300
                goto L_0x0358
            L_0x0300:
                r2 = 11
                goto L_0x0349
            L_0x0303:
                r9 = r31
                r5 = r32
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x0310
                r31 = r9
                goto L_0x0358
            L_0x0310:
                r2 = 10
                r31 = r9
                goto L_0x0349
            L_0x0315:
                r9 = r30
                r5 = r32
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x0322
                r30 = r9
                goto L_0x0358
            L_0x0322:
                r2 = 9
                r30 = r9
                goto L_0x0349
            L_0x0327:
                r9 = r29
                r5 = r32
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x0334
                r29 = r9
                goto L_0x0358
            L_0x0334:
                r2 = 8
                r29 = r9
                goto L_0x0349
            L_0x0339:
                r9 = r28
                r5 = r32
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x0346
                r28 = r9
                goto L_0x0358
            L_0x0346:
                r2 = 7
                r28 = r9
            L_0x0349:
                r9 = r27
                goto L_0x035d
            L_0x034c:
                r9 = r27
                r5 = r32
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x035c
                r27 = r9
            L_0x0358:
                r9 = r21
                goto L_0x03bb
            L_0x035c:
                r2 = 6
            L_0x035d:
                r27 = r9
                r9 = r21
                goto L_0x03bc
            L_0x0363:
                r9 = r26
                r5 = r32
                boolean r2 = r2.equals(r9)
                r9 = r21
                if (r2 != 0) goto L_0x0370
                goto L_0x03bb
            L_0x0370:
                r2 = 5
                goto L_0x03bc
            L_0x0372:
                r9 = r25
                r5 = r32
                boolean r2 = r2.equals(r9)
                r9 = r21
                if (r2 != 0) goto L_0x037f
                goto L_0x03bb
            L_0x037f:
                r2 = 4
                goto L_0x03bc
            L_0x0381:
                r9 = r24
                r5 = r32
                boolean r2 = r2.equals(r9)
                r9 = r21
                if (r2 != 0) goto L_0x038e
                goto L_0x03bb
            L_0x038e:
                r2 = 3
                goto L_0x03bc
            L_0x0390:
                r9 = r23
                r5 = r32
                boolean r2 = r2.equals(r9)
                r9 = r21
                if (r2 != 0) goto L_0x039d
                goto L_0x03bb
            L_0x039d:
                r2 = 2
                goto L_0x03bc
            L_0x039f:
                r9 = r22
                r5 = r32
                boolean r2 = r2.equals(r9)
                r9 = r21
                if (r2 != 0) goto L_0x03ac
                goto L_0x03bb
            L_0x03ac:
                r2 = 1
                goto L_0x03bc
            L_0x03ae:
                r9 = r21
                r5 = r32
                boolean r2 = r2.equals(r9)
                if (r2 != 0) goto L_0x03b9
                goto L_0x03bb
            L_0x03b9:
                r2 = 0
                goto L_0x03bc
            L_0x03bb:
                r2 = -1
            L_0x03bc:
                switch(r2) {
                    case 0: goto L_0x03c1;
                    case 1: goto L_0x03c1;
                    case 2: goto L_0x03c1;
                    case 3: goto L_0x03c1;
                    case 4: goto L_0x03c1;
                    case 5: goto L_0x03c1;
                    case 6: goto L_0x03c1;
                    case 7: goto L_0x03c1;
                    case 8: goto L_0x03c1;
                    case 9: goto L_0x03c1;
                    case 10: goto L_0x03c1;
                    case 11: goto L_0x03c1;
                    case 12: goto L_0x03c1;
                    case 13: goto L_0x03c1;
                    case 14: goto L_0x03c1;
                    case 15: goto L_0x03c1;
                    case 16: goto L_0x03c1;
                    case 17: goto L_0x03c1;
                    case 18: goto L_0x03c1;
                    case 19: goto L_0x03c1;
                    case 20: goto L_0x03c1;
                    case 21: goto L_0x03c1;
                    case 22: goto L_0x03c1;
                    case 23: goto L_0x03c1;
                    case 24: goto L_0x03c1;
                    case 25: goto L_0x03c1;
                    case 26: goto L_0x03c1;
                    case 27: goto L_0x03c1;
                    case 28: goto L_0x03c1;
                    case 29: goto L_0x03c1;
                    case 30: goto L_0x03c1;
                    case 31: goto L_0x03c1;
                    default: goto L_0x03bf;
                }
            L_0x03bf:
                r2 = 0
                goto L_0x03c2
            L_0x03c1:
                r2 = 1
            L_0x03c2:
                if (r2 == 0) goto L_0x0b65
                r21 = r9
                r2 = r20
                ph.j r9 = r2.f40941a0
                r2 = r19
                r19 = r9
                int r9 = r2.f40995c
                r34 = r9
                java.lang.String r9 = r2.f40994b
                r9.getClass()
                int r35 = r9.hashCode()
                r36 = 20
                r37 = r2
                r2 = 8
                switch(r35) {
                    case -2095576542: goto L_0x0566;
                    case -2095575984: goto L_0x055b;
                    case -1985379776: goto L_0x0550;
                    case -1784763192: goto L_0x0545;
                    case -1730367663: goto L_0x053a;
                    case -1482641358: goto L_0x052f;
                    case -1482641357: goto L_0x0524;
                    case -1373388978: goto L_0x0519;
                    case -933872740: goto L_0x050c;
                    case -538363189: goto L_0x04fe;
                    case -538363109: goto L_0x04f0;
                    case -425012669: goto L_0x04e4;
                    case -356037306: goto L_0x04d8;
                    case 62923557: goto L_0x04cc;
                    case 62923603: goto L_0x04c0;
                    case 62927045: goto L_0x04b4;
                    case 82318131: goto L_0x04a8;
                    case 82338133: goto L_0x049c;
                    case 82338134: goto L_0x0490;
                    case 99146302: goto L_0x0484;
                    case 444813526: goto L_0x0478;
                    case 542569478: goto L_0x046c;
                    case 635596514: goto L_0x0460;
                    case 725948237: goto L_0x0454;
                    case 725957860: goto L_0x0448;
                    case 738597099: goto L_0x043a;
                    case 855502857: goto L_0x042c;
                    case 1422270023: goto L_0x041e;
                    case 1809237540: goto L_0x0410;
                    case 1950749482: goto L_0x0402;
                    case 1950789798: goto L_0x03f4;
                    case 1951062397: goto L_0x03e6;
                    default: goto L_0x03e4;
                }
            L_0x03e4:
                goto L_0x0571
            L_0x03e6:
                java.lang.String r0 = "A_OPUS"
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x03f0
                goto L_0x0571
            L_0x03f0:
                r0 = 31
                goto L_0x0572
            L_0x03f4:
                java.lang.String r0 = "A_FLAC"
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x03fe
                goto L_0x0571
            L_0x03fe:
                r0 = 30
                goto L_0x0572
            L_0x0402:
                java.lang.String r0 = "A_EAC3"
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x040c
                goto L_0x0571
            L_0x040c:
                r0 = 29
                goto L_0x0572
            L_0x0410:
                java.lang.String r0 = "V_MPEG2"
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x041a
                goto L_0x0571
            L_0x041a:
                r0 = 28
                goto L_0x0572
            L_0x041e:
                java.lang.String r0 = "S_TEXT/UTF8"
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0428
                goto L_0x0571
            L_0x0428:
                r0 = 27
                goto L_0x0572
            L_0x042c:
                java.lang.String r0 = "V_MPEGH/ISO/HEVC"
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0436
                goto L_0x0571
            L_0x0436:
                r0 = 26
                goto L_0x0572
            L_0x043a:
                java.lang.String r0 = "S_TEXT/ASS"
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0444
                goto L_0x0571
            L_0x0444:
                r0 = 25
                goto L_0x0572
            L_0x0448:
                boolean r0 = r9.equals(r7)
                if (r0 != 0) goto L_0x0450
                goto L_0x0571
            L_0x0450:
                r0 = 24
                goto L_0x0572
            L_0x0454:
                boolean r0 = r9.equals(r6)
                if (r0 != 0) goto L_0x045c
                goto L_0x0571
            L_0x045c:
                r0 = 23
                goto L_0x0572
            L_0x0460:
                boolean r0 = r9.equals(r10)
                if (r0 != 0) goto L_0x0468
                goto L_0x0571
            L_0x0468:
                r0 = 22
                goto L_0x0572
            L_0x046c:
                boolean r0 = r9.equals(r11)
                if (r0 != 0) goto L_0x0474
                goto L_0x0571
            L_0x0474:
                r0 = 21
                goto L_0x0572
            L_0x0478:
                boolean r0 = r9.equals(r12)
                if (r0 != 0) goto L_0x0480
                goto L_0x0571
            L_0x0480:
                r0 = r36
                goto L_0x0572
            L_0x0484:
                boolean r0 = r9.equals(r8)
                if (r0 != 0) goto L_0x048c
                goto L_0x0571
            L_0x048c:
                r0 = r33
                goto L_0x0572
            L_0x0490:
                boolean r0 = r9.equals(r1)
                if (r0 != 0) goto L_0x0498
                goto L_0x0571
            L_0x0498:
                r0 = 18
                goto L_0x0572
            L_0x049c:
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x04a4
                goto L_0x0571
            L_0x04a4:
                r0 = 17
                goto L_0x0572
            L_0x04a8:
                boolean r0 = r9.equals(r15)
                if (r0 != 0) goto L_0x04b0
                goto L_0x0571
            L_0x04b0:
                r0 = 16
                goto L_0x0572
            L_0x04b4:
                boolean r0 = r9.equals(r4)
                if (r0 != 0) goto L_0x04bc
                goto L_0x0571
            L_0x04bc:
                r0 = 15
                goto L_0x0572
            L_0x04c0:
                boolean r0 = r9.equals(r3)
                if (r0 != 0) goto L_0x04c8
                goto L_0x0571
            L_0x04c8:
                r0 = 14
                goto L_0x0572
            L_0x04cc:
                boolean r0 = r9.equals(r13)
                if (r0 != 0) goto L_0x04d4
                goto L_0x0571
            L_0x04d4:
                r0 = 13
                goto L_0x0572
            L_0x04d8:
                boolean r0 = r9.equals(r14)
                if (r0 != 0) goto L_0x04e0
                goto L_0x0571
            L_0x04e0:
                r0 = 12
                goto L_0x0572
            L_0x04e4:
                boolean r0 = r9.equals(r5)
                if (r0 != 0) goto L_0x04ec
                goto L_0x0571
            L_0x04ec:
                r0 = 11
                goto L_0x0572
            L_0x04f0:
                r0 = r31
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x04fa
                goto L_0x0571
            L_0x04fa:
                r0 = 10
                goto L_0x0572
            L_0x04fe:
                r0 = r30
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0508
                goto L_0x0571
            L_0x0508:
                r0 = 9
                goto L_0x0572
            L_0x050c:
                r0 = r29
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0516
                goto L_0x0571
            L_0x0516:
                r0 = r2
                goto L_0x0572
            L_0x0519:
                r0 = r28
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0522
                goto L_0x0571
            L_0x0522:
                r0 = 7
                goto L_0x0572
            L_0x0524:
                r0 = r27
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x052d
                goto L_0x0571
            L_0x052d:
                r0 = 6
                goto L_0x0572
            L_0x052f:
                r0 = r26
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0538
                goto L_0x0571
            L_0x0538:
                r0 = 5
                goto L_0x0572
            L_0x053a:
                r0 = r25
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0543
                goto L_0x0571
            L_0x0543:
                r0 = 4
                goto L_0x0572
            L_0x0545:
                r0 = r24
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x054e
                goto L_0x0571
            L_0x054e:
                r0 = 3
                goto L_0x0572
            L_0x0550:
                r0 = r23
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0559
                goto L_0x0571
            L_0x0559:
                r0 = 2
                goto L_0x0572
            L_0x055b:
                r0 = r22
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x0564
                goto L_0x0571
            L_0x0564:
                r0 = 1
                goto L_0x0572
            L_0x0566:
                r0 = r21
                boolean r0 = r9.equals(r0)
                if (r0 != 0) goto L_0x056f
                goto L_0x0571
            L_0x056f:
                r0 = 0
                goto L_0x0572
            L_0x0571:
                r0 = -1
            L_0x0572:
                java.lang.String r1 = "video/x-unknown"
                java.lang.String r3 = ". Setting mimeType to "
                java.lang.String r4 = "audio/x-unknown"
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r6 = "audio/raw"
                switch(r0) {
                    case 0: goto L_0x0922;
                    case 1: goto L_0x0922;
                    case 2: goto L_0x08a4;
                    case 3: goto L_0x0895;
                    case 4: goto L_0x0811;
                    case 5: goto L_0x0801;
                    case 6: goto L_0x07fc;
                    case 7: goto L_0x0744;
                    case 8: goto L_0x0726;
                    case 9: goto L_0x0922;
                    case 10: goto L_0x0702;
                    case 11: goto L_0x06f3;
                    case 12: goto L_0x06eb;
                    case 13: goto L_0x06c4;
                    case 14: goto L_0x06bf;
                    case 15: goto L_0x06ba;
                    case 16: goto L_0x06b5;
                    case 17: goto L_0x06b0;
                    case 18: goto L_0x06ab;
                    case 19: goto L_0x06a6;
                    case 20: goto L_0x06a3;
                    case 21: goto L_0x06ba;
                    case 22: goto L_0x0674;
                    case 23: goto L_0x0647;
                    case 24: goto L_0x061d;
                    case 25: goto L_0x060b;
                    case 26: goto L_0x05ee;
                    case 27: goto L_0x05e8;
                    case 28: goto L_0x05e2;
                    case 29: goto L_0x05dc;
                    case 30: goto L_0x05cc;
                    case 31: goto L_0x0587;
                    default: goto L_0x057f;
                }
            L_0x057f:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Unrecognized codec identifier."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0587:
                r0 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 3
                r1.<init>(r3)
                r7 = r37
                java.lang.String r3 = r7.f40994b
                byte[] r3 = r7.mo70084a(r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r5 = r7.f40985R
                java.nio.ByteBuffer r3 = r3.putLong(r5)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteBuffer r2 = r2.order(r4)
                long r3 = r7.f40986S
                java.nio.ByteBuffer r2 = r2.putLong(r3)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r2 = "audio/opus"
                r6 = r2
                r8 = 3
                goto L_0x0871
            L_0x05cc:
                r7 = r37
                java.lang.String r0 = r7.f40994b
                byte[] r0 = r7.mo70084a(r0)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                java.lang.String r1 = "audio/flac"
                goto L_0x073b
            L_0x05dc:
                r7 = r37
                java.lang.String r1 = "audio/eac3"
                goto L_0x06ef
            L_0x05e2:
                r7 = r37
                java.lang.String r1 = "video/mpeg2"
                goto L_0x06ef
            L_0x05e8:
                r7 = r37
                java.lang.String r1 = "application/x-subrip"
                goto L_0x06ef
            L_0x05ee:
                r7 = r37
                bj.r r0 = new bj.r
                java.lang.String r1 = r7.f40994b
                byte[] r1 = r7.mo70084a(r1)
                r0.<init>((byte[]) r1)
                cj.d r0 = p520cj.C14148d.m21904a(r0)
                java.util.List<byte[]> r1 = r0.f31179a
                int r2 = r0.f31180b
                r7.f40992Y = r2
                java.lang.String r0 = r0.f31181c
                java.lang.String r2 = "video/hevc"
                goto L_0x071d
            L_0x060b:
                r7 = r37
                byte[] r0 = p685uh.C18577d.f40910c0
                java.lang.String r1 = r7.f40994b
                byte[] r1 = r7.mo70084a(r1)
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m25828of(r0, r1)
                java.lang.String r1 = "text/x-ssa"
                goto L_0x073b
            L_0x061d:
                r7 = r37
                int r0 = r7.f40983P
                int r9 = p513bj.C14049b0.m21646s(r0)
                if (r9 != 0) goto L_0x067d
                int r0 = r7.f40983P
                r1 = 89
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Unsupported little endian PCM bit depth: "
                r2.append(r1)
                r2.append(r0)
                r2.append(r3)
                r2.append(r4)
                java.lang.String r0 = r2.toString()
                android.util.Log.w(r5, r0)
                goto L_0x06f0
            L_0x0647:
                r7 = r37
                int r0 = r7.f40983P
                if (r0 != r2) goto L_0x064f
                r3 = 3
                goto L_0x067e
            L_0x064f:
                r1 = 16
                if (r0 != r1) goto L_0x0656
                r9 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x067d
            L_0x0656:
                r1 = 86
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Unsupported big endian PCM bit depth: "
                r2.append(r1)
                r2.append(r0)
                r2.append(r3)
                r2.append(r4)
                java.lang.String r0 = r2.toString()
                android.util.Log.w(r5, r0)
                goto L_0x06f0
            L_0x0674:
                r7 = r37
                int r0 = r7.f40983P
                r1 = 32
                if (r0 != r1) goto L_0x0686
                r9 = 4
            L_0x067d:
                r3 = r9
            L_0x067e:
                r4 = r3
                r0 = -1
                r1 = 0
                r2 = 1
                r3 = 0
                r8 = 3
                goto L_0x093d
            L_0x0686:
                r1 = 90
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Unsupported floating point PCM bit depth: "
                r2.append(r1)
                r2.append(r0)
                r2.append(r3)
                r2.append(r4)
                java.lang.String r0 = r2.toString()
                android.util.Log.w(r5, r0)
                goto L_0x06f0
            L_0x06a3:
                r7 = r37
                goto L_0x06ef
            L_0x06a6:
                r7 = r37
                java.lang.String r1 = "application/pgs"
                goto L_0x06ef
            L_0x06ab:
                r7 = r37
                java.lang.String r1 = "video/x-vnd.on2.vp9"
                goto L_0x06ef
            L_0x06b0:
                r7 = r37
                java.lang.String r1 = "video/x-vnd.on2.vp8"
                goto L_0x06ef
            L_0x06b5:
                r7 = r37
                java.lang.String r1 = "video/av01"
                goto L_0x06ef
            L_0x06ba:
                r7 = r37
                java.lang.String r1 = "audio/vnd.dts"
                goto L_0x06ef
            L_0x06bf:
                r7 = r37
                java.lang.String r1 = "audio/ac3"
                goto L_0x06ef
            L_0x06c4:
                r7 = r37
                java.lang.String r0 = r7.f40994b
                byte[] r0 = r7.mo70084a(r0)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                byte[] r1 = r7.f41003k
                bj.q r2 = new bj.q
                int r3 = r1.length
                r2.<init>((int) r3, (byte[]) r1)
                r1 = 0
                lh.a$a r2 = p611lh.C18162a.m30677c(r2, r1)
                int r1 = r2.f39725a
                r7.f40984Q = r1
                int r1 = r2.f39726b
                r7.f40982O = r1
                java.lang.String r1 = r2.f39727c
                java.lang.String r2 = "audio/mp4a-latm"
                r15 = r1
                goto L_0x073f
            L_0x06eb:
                r7 = r37
                java.lang.String r1 = "audio/vnd.dts.hd"
            L_0x06ef:
                r4 = r1
            L_0x06f0:
                r2 = r4
                r15 = 0
                goto L_0x073d
            L_0x06f3:
                r7 = r37
                java.lang.String r0 = r7.f40994b
                byte[] r0 = r7.mo70084a(r0)
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m25827of(r0)
                java.lang.String r1 = "application/vobsub"
                goto L_0x073b
            L_0x0702:
                r7 = r37
                bj.r r0 = new bj.r
                java.lang.String r1 = r7.f40994b
                byte[] r1 = r7.mo70084a(r1)
                r0.<init>((byte[]) r1)
                cj.a r0 = p520cj.C14144a.m21898a(r0)
                java.util.List<byte[]> r1 = r0.f31159a
                int r2 = r0.f31160b
                r7.f40992Y = r2
                java.lang.String r0 = r0.f31164f
                java.lang.String r2 = "video/avc"
            L_0x071d:
                r15 = r0
                r0 = r1
                r6 = r2
                r3 = r15
                r1 = -1
                r2 = 1
                r8 = 3
                goto L_0x0936
            L_0x0726:
                r7 = r37
                r0 = 4
                byte[] r1 = new byte[r0]
                java.lang.String r2 = r7.f40994b
                byte[] r2 = r7.mo70084a(r2)
                r3 = 0
                java.lang.System.arraycopy(r2, r3, r1, r3, r0)
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.m25827of(r1)
                java.lang.String r1 = "application/dvbsubs"
            L_0x073b:
                r15 = r0
                r2 = r1
            L_0x073d:
                r0 = r15
                r15 = 0
            L_0x073f:
                r3 = r2
                r2 = r15
                r1 = -1
                goto L_0x080b
            L_0x0744:
                r7 = r37
                java.lang.String r0 = r7.f40994b
                byte[] r0 = r7.mo70084a(r0)
                int r3 = r0.length
                r4 = 16
                if (r4 > r3) goto L_0x0753
                r3 = 1
                goto L_0x0754
            L_0x0753:
                r3 = 0
            L_0x0754:
                p513bj.C14075p.m21691c(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                byte r3 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                long r3 = (long) r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                r8 = 255(0xff, double:1.26E-321)
                long r3 = r3 & r8
                r6 = 17
                byte r6 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                long r10 = (long) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                long r10 = r10 & r8
                long r10 = r10 << r2
                long r2 = r10 | r3
                r4 = 18
                byte r4 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                long r10 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                long r10 = r10 & r8
                r4 = 16
                long r10 = r10 << r4
                long r2 = r2 | r10
                byte r4 = r0[r33]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                long r10 = (long) r4     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                long r8 = r8 & r10
                r4 = 24
                long r8 = r8 << r4
                long r2 = r2 | r8
                r8 = 1482049860(0x58564944, double:7.322299212E-315)
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 != 0) goto L_0x0788
                android.util.Pair r0 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                java.lang.String r1 = "video/divx"
                r2 = 0
                r0.<init>(r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                goto L_0x07e9
            L_0x0788:
                r8 = 859189832(0x33363248, double:4.244961792E-315)
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 != 0) goto L_0x0798
                android.util.Pair r0 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                java.lang.String r1 = "video/3gpp"
                r2 = 0
                r0.<init>(r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                goto L_0x07e9
            L_0x0798:
                r8 = 826496599(0x31435657, double:4.08343576E-315)
                int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r2 != 0) goto L_0x07de
                r1 = 40
            L_0x07a1:
                int r2 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                int r2 = r2 + -4
                if (r1 >= r2) goto L_0x07d6
                byte r2 = r0[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                if (r2 != 0) goto L_0x07d1
                int r2 = r1 + 1
                byte r2 = r0[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                if (r2 != 0) goto L_0x07d1
                int r2 = r1 + 2
                byte r2 = r0[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                r3 = 1
                if (r2 != r3) goto L_0x07d1
                int r2 = r1 + 3
                byte r2 = r0[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                r3 = 15
                if (r2 != r3) goto L_0x07d3
                int r2 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                android.util.Pair r1 = new android.util.Pair     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                java.lang.String r2 = "video/wvc1"
                java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                r1.<init>(r2, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                r0 = r1
                goto L_0x07e9
            L_0x07d1:
                r3 = 15
            L_0x07d3:
                int r1 = r1 + 1
                goto L_0x07a1
            L_0x07d6:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                java.lang.String r1 = "Failed to find FourCC VC1 initialization data"
                r0.<init>((java.lang.String) r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x07f4 }
            L_0x07de:
                java.lang.String r0 = "Unknown FourCC. Setting mimeType to video/x-unknown"
                android.util.Log.w(r5, r0)
                android.util.Pair r0 = new android.util.Pair
                r2 = 0
                r0.<init>(r1, r2)
            L_0x07e9:
                java.lang.Object r1 = r0.first
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r0 = r0.second
                java.util.List r0 = (java.util.List) r0
                r2 = r1
                r1 = -1
                goto L_0x0809
            L_0x07f4:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Error parsing FourCC private data"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x07fc:
                r7 = r37
                java.lang.String r0 = "audio/mpeg"
                goto L_0x0805
            L_0x0801:
                r7 = r37
                java.lang.String r0 = "audio/mpeg-L2"
            L_0x0805:
                r1 = 4096(0x1000, float:5.74E-42)
                r2 = r0
                r0 = 0
            L_0x0809:
                r3 = r2
                r2 = 0
            L_0x080b:
                r6 = r3
                r8 = 3
                r3 = r2
                r2 = 1
                goto L_0x0936
            L_0x0811:
                r7 = r37
                r0 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r7.f40994b
                byte[] r1 = r7.mo70084a(r1)
                java.lang.String r2 = "Error parsing vorbis codec private"
                r3 = 0
                byte r4 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r3 = 2
                if (r4 != r3) goto L_0x0889
                r3 = 1
                r4 = 0
            L_0x0825:
                byte r5 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r6 = 255(0xff, float:3.57E-43)
                r5 = r5 & r6
                if (r5 != r6) goto L_0x0831
                int r4 = r4 + 255
                int r3 = r3 + 1
                goto L_0x0825
            L_0x0831:
                r8 = 1
                int r3 = r3 + r8
                int r4 = r4 + r5
                r5 = 0
            L_0x0835:
                byte r8 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r8 = r8 & r6
                if (r8 != r6) goto L_0x083f
                int r5 = r5 + 255
                int r3 = r3 + 1
                goto L_0x0835
            L_0x083f:
                r9 = 1
                int r3 = r3 + r9
                int r5 = r5 + r8
                byte r6 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                if (r6 != r9) goto L_0x0883
                byte[] r6 = new byte[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r8 = 0
                java.lang.System.arraycopy(r1, r3, r6, r8, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                int r3 = r3 + r4
                byte r4 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r8 = 3
                if (r4 != r8) goto L_0x087d
                int r3 = r3 + r5
                byte r4 = r1[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r5 = 5
                if (r4 != r5) goto L_0x0877
                int r4 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                int r4 = r4 - r3
                byte[] r4 = new byte[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                int r5 = r1.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                int r5 = r5 - r3
                r9 = 0
                java.lang.System.arraycopy(r1, r3, r4, r9, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r3 = 2
                r1.<init>(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r1.add(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r1.add(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                java.lang.String r2 = "audio/vorbis"
                r6 = r2
            L_0x0871:
                r3 = r1
                r1 = 0
                r2 = 1
                r4 = -1
                goto L_0x093d
            L_0x0877:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
            L_0x087d:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
            L_0x0883:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
            L_0x0889:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                r0.<init>((java.lang.String) r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
                throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x088f }
            L_0x088f:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                r0.<init>((java.lang.String) r2)
                throw r0
            L_0x0895:
                r7 = r37
                r8 = 3
                uh.d$c r0 = new uh.d$c
                r0.<init>()
                r7.f40987T = r0
                java.lang.String r4 = "audio/true-hd"
                r2 = 1
                goto L_0x0918
            L_0x08a4:
                r7 = r37
                r8 = 3
                bj.r r0 = new bj.r
                java.lang.String r1 = r7.f40994b
                byte[] r1 = r7.mo70084a(r1)
                r0.<init>((byte[]) r1)
                int r1 = r0.mo46918i()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091a }
                r2 = 1
                if (r1 != r2) goto L_0x08ba
                goto L_0x08de
            L_0x08ba:
                r9 = 65534(0xfffe, float:9.1833E-41)
                if (r1 != r9) goto L_0x08e0
                r1 = 24
                r0.mo46935z(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091a }
                long r9 = r0.mo46919j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091a }
                java.util.UUID r1 = p685uh.C18577d.f40912e0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091a }
                long r11 = r1.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091a }
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 != 0) goto L_0x08e0
                long r9 = r0.mo46919j()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091a }
                long r0 = r1.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x091a }
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r0 != 0) goto L_0x08e0
            L_0x08de:
                r1 = r2
                goto L_0x08e1
            L_0x08e0:
                r1 = 0
            L_0x08e1:
                if (r1 == 0) goto L_0x090f
                int r0 = r7.f40983P
                int r0 = p513bj.C14049b0.m21646s(r0)
                if (r0 != 0) goto L_0x090a
                int r0 = r7.f40983P
                r1 = 75
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>(r1)
                java.lang.String r1 = "Unsupported PCM bit depth: "
                r6.append(r1)
                r6.append(r0)
                r6.append(r3)
                r6.append(r4)
                java.lang.String r0 = r6.toString()
                android.util.Log.w(r5, r0)
                goto L_0x0918
            L_0x090a:
                r4 = r0
                r0 = -1
                r1 = 0
                r3 = 0
                goto L_0x093d
            L_0x090f:
                java.lang.String r0 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                java.lang.String r0 = r0.concat(r4)
                android.util.Log.w(r5, r0)
            L_0x0918:
                r1 = 0
                goto L_0x0932
            L_0x091a:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Error parsing MS/ACM codec private"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0922:
                r7 = r37
                r2 = 1
                r8 = 3
                byte[] r0 = r7.f41003k
                if (r0 != 0) goto L_0x092c
                r1 = 0
                goto L_0x0930
            L_0x092c:
                java.util.List r1 = java.util.Collections.singletonList(r0)
            L_0x0930:
                java.lang.String r4 = "video/mp4v-es"
            L_0x0932:
                r0 = r1
                r6 = r4
                r1 = -1
                r3 = 0
            L_0x0936:
                r4 = -1
                r38 = r3
                r3 = r0
                r0 = r1
                r1 = r38
            L_0x093d:
                byte[] r5 = r7.f40981N
                if (r5 == 0) goto L_0x0950
                bj.r r9 = new bj.r
                r9.<init>((byte[]) r5)
                cj.b r5 = p520cj.C14145b.m21899a(r9)
                if (r5 == 0) goto L_0x0950
                java.lang.String r1 = r5.f31165a
                java.lang.String r6 = "video/dolby-vision"
            L_0x0950:
                boolean r5 = r7.f40989V
                r9 = 0
                r5 = r5 | r9
                boolean r9 = r7.f40988U
                if (r9 == 0) goto L_0x095a
                r9 = 2
                goto L_0x095b
            L_0x095a:
                r9 = 0
            L_0x095b:
                r5 = r5 | r9
                com.google.android.exoplayer2.Format$b r9 = new com.google.android.exoplayer2.Format$b
                r9.<init>()
                boolean r10 = p513bj.C14065m.m21679i(r6)
                if (r10 == 0) goto L_0x0973
                int r8 = r7.f40982O
                r9.f31316x = r8
                int r8 = r7.f40984Q
                r9.f31317y = r8
                r9.f31318z = r4
                goto L_0x0b23
            L_0x0973:
                boolean r2 = p513bj.C14065m.m21681k(r6)
                if (r2 == 0) goto L_0x0af1
                int r2 = r7.f41009q
                if (r2 != 0) goto L_0x098f
                int r2 = r7.f41007o
                r4 = -1
                if (r2 != r4) goto L_0x0984
                int r2 = r7.f41005m
            L_0x0984:
                r7.f41007o = r2
                int r2 = r7.f41008p
                if (r2 != r4) goto L_0x098c
                int r2 = r7.f41006n
            L_0x098c:
                r7.f41008p = r2
                goto L_0x0990
            L_0x098f:
                r4 = -1
            L_0x0990:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = r7.f41007o
                if (r8 == r4) goto L_0x09a3
                int r10 = r7.f41008p
                if (r10 == r4) goto L_0x09a3
                int r2 = r7.f41006n
                int r2 = r2 * r8
                float r2 = (float) r2
                int r8 = r7.f41005m
                int r8 = r8 * r10
                float r8 = (float) r8
                float r2 = r2 / r8
            L_0x09a3:
                boolean r8 = r7.f41016x
                if (r8 == 0) goto L_0x0a70
                float r8 = r7.f40971D
                r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40972E
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40973F
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40974G
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40975H
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40976I
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40977J
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40978K
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40979L
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 == 0) goto L_0x0a63
                float r8 = r7.f40980M
                int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r8 != 0) goto L_0x09e7
                goto L_0x0a63
            L_0x09e7:
                r8 = 25
                byte[] r8 = new byte[r8]
                java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r8)
                java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r10 = r10.order(r11)
                r11 = 0
                r10.put(r11)
                float r11 = r7.f40971D
                r12 = 1195593728(0x47435000, float:50000.0)
                float r11 = r11 * r12
                r13 = 1056964608(0x3f000000, float:0.5)
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40972E
                float r11 = r11 * r12
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40973F
                float r11 = r11 * r12
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40974G
                float r11 = r11 * r12
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40975H
                float r11 = r11 * r12
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40976I
                float r11 = r11 * r12
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40977J
                float r11 = r11 * r12
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40978K
                float r11 = r11 * r12
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40979L
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                float r11 = r7.f40980M
                float r11 = r11 + r13
                int r11 = (int) r11
                short r11 = (short) r11
                r10.putShort(r11)
                int r11 = r7.f40969B
                short r11 = (short) r11
                r10.putShort(r11)
                int r11 = r7.f40970C
                short r11 = (short) r11
                r10.putShort(r11)
                goto L_0x0a64
            L_0x0a63:
                r8 = 0
            L_0x0a64:
                com.google.android.exoplayer2.video.ColorInfo r10 = new com.google.android.exoplayer2.video.ColorInfo
                int r11 = r7.f41017y
                int r12 = r7.f40968A
                int r13 = r7.f41018z
                r10.<init>(r11, r12, r13, r8)
                goto L_0x0a71
            L_0x0a70:
                r10 = 0
            L_0x0a71:
                java.lang.String r8 = r7.f40993a
                if (r8 == 0) goto L_0x0a89
                java.util.Map<java.lang.String, java.lang.Integer> r11 = p685uh.C18577d.f40913f0
                boolean r8 = r11.containsKey(r8)
                if (r8 == 0) goto L_0x0a89
                java.lang.String r4 = r7.f40993a
                java.lang.Object r4 = r11.get(r4)
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
            L_0x0a89:
                int r8 = r7.f41010r
                if (r8 != 0) goto L_0x0ad9
                float r8 = r7.f41011s
                r11 = 0
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0ad9
                float r8 = r7.f41012t
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0ad9
                float r8 = r7.f41013u
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0aa8
                r4 = 0
                goto L_0x0ad9
            L_0x0aa8:
                float r8 = r7.f41012t
                r11 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0ab5
                r4 = 90
                goto L_0x0ad9
            L_0x0ab5:
                float r8 = r7.f41012t
                r11 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 == 0) goto L_0x0ad7
                float r8 = r7.f41012t
                r11 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0aca
                goto L_0x0ad7
            L_0x0aca:
                float r8 = r7.f41012t
                r11 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x0ad9
                r4 = 270(0x10e, float:3.78E-43)
                goto L_0x0ad9
            L_0x0ad7:
                r4 = 180(0xb4, float:2.52E-43)
            L_0x0ad9:
                int r8 = r7.f41005m
                r9.f31308p = r8
                int r8 = r7.f41006n
                r9.f31309q = r8
                r9.f31312t = r2
                r9.f31311s = r4
                byte[] r2 = r7.f41014v
                r9.f31313u = r2
                int r2 = r7.f41015w
                r9.f31314v = r2
                r9.f31315w = r10
                r2 = 2
                goto L_0x0b23
            L_0x0af1:
                java.lang.String r2 = "application/x-subrip"
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0b22
                java.lang.String r2 = "text/x-ssa"
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0b22
                java.lang.String r2 = "application/vobsub"
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0b22
                java.lang.String r2 = "application/pgs"
                boolean r2 = r2.equals(r6)
                if (r2 != 0) goto L_0x0b22
                java.lang.String r2 = "application/dvbsubs"
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0b1a
                goto L_0x0b22
            L_0x0b1a:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "Unexpected MIME type."
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0b22:
                r2 = r8
            L_0x0b23:
                java.lang.String r4 = r7.f40993a
                if (r4 == 0) goto L_0x0b33
                java.util.Map<java.lang.String, java.lang.Integer> r8 = p685uh.C18577d.f40913f0
                boolean r4 = r8.containsKey(r4)
                if (r4 != 0) goto L_0x0b33
                java.lang.String r4 = r7.f40993a
                r9.f31294b = r4
            L_0x0b33:
                r4 = r34
                r9.mo47145b(r4)
                r9.f31303k = r6
                r9.f31304l = r0
                java.lang.String r0 = r7.f40990W
                r9.f31295c = r0
                r9.f31296d = r5
                r9.f31305m = r3
                r9.f31300h = r1
                com.google.android.exoplayer2.drm.DrmInitData r0 = r7.f41004l
                r9.f31306n = r0
                com.google.android.exoplayer2.Format r0 = r9.mo47144a()
                int r1 = r7.f40995c
                r3 = r19
                ph.v r1 = r3.mo4164r(r1, r2)
                r7.f40991X = r1
                r1.mo47752a(r0)
                r0 = r20
                android.util.SparseArray<uh.d$b> r1 = r0.f40943c
                int r2 = r7.f40995c
                r1.put(r2, r7)
                goto L_0x0b67
            L_0x0b65:
                r0 = r20
            L_0x0b67:
                r1 = 0
                r0.f40961u = r1
                goto L_0x0bc4
            L_0x0b6b:
                com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
                java.lang.String r1 = "CodecId is missing in TrackEntry element"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0b73:
                r0 = r8
                int r1 = r0.f40920G
                r2 = 2
                if (r1 == r2) goto L_0x0b7a
                goto L_0x0bc4
            L_0x0b7a:
                r1 = 0
                r2 = 0
            L_0x0b7c:
                int r3 = r0.f40924K
                if (r1 >= r3) goto L_0x0b88
                int[] r3 = r0.f40925L
                r3 = r3[r1]
                int r2 = r2 + r3
                int r1 = r1 + 1
                goto L_0x0b7c
            L_0x0b88:
                android.util.SparseArray<uh.d$b> r1 = r0.f40943c
                int r3 = r0.f40926M
                java.lang.Object r1 = r1.get(r3)
                r8 = r1
                uh.d$b r8 = (p685uh.C18577d.C18579b) r8
                ph.v r1 = r8.f40991X
                r1.getClass()
                r9 = 0
            L_0x0b99:
                int r1 = r0.f40924K
                if (r9 >= r1) goto L_0x0bc1
                long r3 = r0.f40921H
                int r1 = r8.f40997e
                int r1 = r1 * r9
                int r1 = r1 / 1000
                long r5 = (long) r1
                long r3 = r3 + r5
                int r1 = r0.f40928O
                if (r9 != 0) goto L_0x0bb0
                boolean r5 = r0.f40930Q
                if (r5 != 0) goto L_0x0bb0
                r1 = r1 | 1
            L_0x0bb0:
                r5 = r1
                int[] r1 = r0.f40925L
                r6 = r1[r9]
                int r10 = r2 - r6
                r1 = r0
                r2 = r8
                r7 = r10
                r1.mo70077g(r2, r3, r5, r6, r7)
                int r9 = r9 + 1
                r2 = r10
                goto L_0x0b99
            L_0x0bc1:
                r1 = 0
                r0.f40920G = r1
            L_0x0bc4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p685uh.C18577d.C18578a.mo70083a(int):void");
        }
    }

    /* renamed from: uh.d$b */
    public static final class C18579b {

        /* renamed from: A */
        public int f40968A = -1;

        /* renamed from: B */
        public int f40969B = 1000;

        /* renamed from: C */
        public int f40970C = 200;

        /* renamed from: D */
        public float f40971D = -1.0f;

        /* renamed from: E */
        public float f40972E = -1.0f;

        /* renamed from: F */
        public float f40973F = -1.0f;

        /* renamed from: G */
        public float f40974G = -1.0f;

        /* renamed from: H */
        public float f40975H = -1.0f;

        /* renamed from: I */
        public float f40976I = -1.0f;

        /* renamed from: J */
        public float f40977J = -1.0f;

        /* renamed from: K */
        public float f40978K = -1.0f;

        /* renamed from: L */
        public float f40979L = -1.0f;

        /* renamed from: M */
        public float f40980M = -1.0f;

        /* renamed from: N */
        public byte[] f40981N;

        /* renamed from: O */
        public int f40982O = 1;

        /* renamed from: P */
        public int f40983P = -1;

        /* renamed from: Q */
        public int f40984Q = 8000;

        /* renamed from: R */
        public long f40985R = 0;

        /* renamed from: S */
        public long f40986S = 0;

        /* renamed from: T */
        public C18580c f40987T;

        /* renamed from: U */
        public boolean f40988U;

        /* renamed from: V */
        public boolean f40989V = true;

        /* renamed from: W */
        public String f40990W = "eng";

        /* renamed from: X */
        public C18368v f40991X;

        /* renamed from: Y */
        public int f40992Y;

        /* renamed from: a */
        public String f40993a;

        /* renamed from: b */
        public String f40994b;

        /* renamed from: c */
        public int f40995c;

        /* renamed from: d */
        public int f40996d;

        /* renamed from: e */
        public int f40997e;

        /* renamed from: f */
        public int f40998f;

        /* renamed from: g */
        public int f40999g;

        /* renamed from: h */
        public boolean f41000h;

        /* renamed from: i */
        public byte[] f41001i;

        /* renamed from: j */
        public C18368v.C18369a f41002j;

        /* renamed from: k */
        public byte[] f41003k;

        /* renamed from: l */
        public DrmInitData f41004l;

        /* renamed from: m */
        public int f41005m = -1;

        /* renamed from: n */
        public int f41006n = -1;

        /* renamed from: o */
        public int f41007o = -1;

        /* renamed from: p */
        public int f41008p = -1;

        /* renamed from: q */
        public int f41009q = 0;

        /* renamed from: r */
        public int f41010r = -1;

        /* renamed from: s */
        public float f41011s = 0.0f;

        /* renamed from: t */
        public float f41012t = 0.0f;

        /* renamed from: u */
        public float f41013u = 0.0f;

        /* renamed from: v */
        public byte[] f41014v = null;

        /* renamed from: w */
        public int f41015w = -1;

        /* renamed from: x */
        public boolean f41016x = false;

        /* renamed from: y */
        public int f41017y = -1;

        /* renamed from: z */
        public int f41018z = -1;

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: a */
        public final byte[] mo70084a(String str) throws ParserException {
            byte[] bArr = this.f41003k;
            if (bArr != null) {
                return bArr;
            }
            String valueOf = String.valueOf(str);
            throw new ParserException(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "));
        }
    }

    /* renamed from: uh.d$c */
    public static final class C18580c {

        /* renamed from: a */
        public final byte[] f41019a = new byte[10];

        /* renamed from: b */
        public boolean f41020b;

        /* renamed from: c */
        public int f41021c;

        /* renamed from: d */
        public long f41022d;

        /* renamed from: e */
        public int f41023e;

        /* renamed from: f */
        public int f41024f;

        /* renamed from: g */
        public int f41025g;
    }

    static {
        HashMap hashMap = new HashMap();
        C13983i.m21498q(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f40913f0 = Collections.unmodifiableMap(hashMap);
    }

    public C18577d() {
        C18573a aVar = new C18573a();
        this.f40940a = aVar;
        aVar.f40903d = new C18578a();
        this.f40944d = true;
        this.f40942b = new C18582f();
        this.f40943c = new SparseArray<>();
        this.f40947g = new C14077r(4);
        this.f40948h = new C14077r(ByteBuffer.allocate(4).putInt(-1).array());
        this.f40949i = new C14077r(4);
        this.f40945e = new C14077r(C14068n.f30955a);
        this.f40946f = new C14077r(4);
        this.f40950j = new C14077r();
        this.f40951k = new C14077r();
        this.f40952l = new C14077r(8);
        this.f40953m = new C14077r();
        this.f40954n = new C14077r();
        this.f40925L = new int[1];
    }

    /* renamed from: h */
    public static byte[] m31325h(long j, long j2, String str) {
        C14075p.m21691c(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return C14049b0.m21652y(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))}));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v135, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v51, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte, boolean, int] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r2v169 */
    /* JADX WARNING: type inference failed for: r2v173 */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04b5, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0896, code lost:
        if (r5 != 7) goto L_0x08e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v1, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0a13 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x0a15 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo47757a(p644ph.C18350i r28, p644ph.C18363s r29) throws java.io.IOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r29
            r2 = 0
            r0.f40919F = r2
            r3 = 1
            r4 = r3
        L_0x0009:
            r5 = -1
            if (r3 == 0) goto L_0x0a29
            boolean r6 = r0.f40919F
            if (r6 != 0) goto L_0x0a29
            uh.c r3 = r0.f40940a
            r6 = r3
            uh.a r6 = (p685uh.C18573a) r6
            uh.b r3 = r6.f40903d
            p513bj.C14075p.m21696h(r3)
        L_0x001a:
            java.util.ArrayDeque<uh.a$a> r3 = r6.f40901b
            java.lang.Object r3 = r3.peek()
            uh.a$a r3 = (p685uh.C18573a.C18574a) r3
            if (r3 == 0) goto L_0x0043
            r7 = r28
            ph.e r7 = (p644ph.C18346e) r7
            long r7 = r7.f40294d
            long r9 = r3.f40908b
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 < 0) goto L_0x0043
            uh.b r2 = r6.f40903d
            java.util.ArrayDeque<uh.a$a> r3 = r6.f40901b
            java.lang.Object r3 = r3.pop()
            uh.a$a r3 = (p685uh.C18573a.C18574a) r3
            int r3 = r3.f40907a
            uh.d$a r2 = (p685uh.C18577d.C18578a) r2
            r2.mo70083a(r3)
            goto L_0x0205
        L_0x0043:
            int r3 = r6.f40904e
            r7 = 0
            r9 = 8
            r10 = 4
            if (r3 != 0) goto L_0x00c5
            uh.f r3 = r6.f40902c
            r11 = r28
            ph.e r11 = (p644ph.C18346e) r11
            long r12 = r3.mo70086b(r11, r4, r2, r10)
            r14 = -2
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x00b7
            r11.f40296f = r2
        L_0x005e:
            byte[] r3 = r6.f40900a
            r11.mo69872c(r3, r2, r10, r2)
            byte[] r3 = r6.f40900a
            byte r3 = r3[r2]
            r12 = r2
        L_0x0068:
            long[] r13 = p685uh.C18582f.f41028d
            if (r12 >= r9) goto L_0x007b
            r14 = r13[r12]
            long r9 = (long) r3
            long r9 = r9 & r14
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            int r12 = r12 + 1
            if (r9 == 0) goto L_0x0077
            goto L_0x007c
        L_0x0077:
            r9 = 8
            r10 = 4
            goto L_0x0068
        L_0x007b:
            r12 = r5
        L_0x007c:
            if (r12 == r5) goto L_0x00b0
            r3 = 4
            if (r12 > r3) goto L_0x00b0
            byte[] r3 = r6.f40900a
            long r9 = p685uh.C18582f.m31341a(r12, r2, r3)
            int r3 = (int) r9
            uh.b r9 = r6.f40903d
            uh.d$a r9 = (p685uh.C18577d.C18578a) r9
            uh.d r9 = p685uh.C18577d.this
            r9.getClass()
            r9 = 357149030(0x1549a966, float:4.072526E-26)
            if (r3 == r9) goto L_0x00a8
            r9 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r3 == r9) goto L_0x00a8
            r9 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r3 == r9) goto L_0x00a8
            r9 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r3 != r9) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r9 = r2
            goto L_0x00a9
        L_0x00a8:
            r9 = r4
        L_0x00a9:
            if (r9 == 0) goto L_0x00b0
            r11.mo69879j(r12)
            long r12 = (long) r3
            goto L_0x00b7
        L_0x00b0:
            r11.mo69879j(r4)
            r9 = 8
            r10 = 4
            goto L_0x005e
        L_0x00b7:
            r7 = -1
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x00c0
        L_0x00bd:
            r3 = r2
            goto L_0x09e8
        L_0x00c0:
            int r3 = (int) r12
            r6.f40905f = r3
            r6.f40904e = r4
        L_0x00c5:
            int r3 = r6.f40904e
            r5 = 2
            if (r3 != r4) goto L_0x00db
            uh.f r3 = r6.f40902c
            r7 = r28
            ph.e r7 = (p644ph.C18346e) r7
            r8 = 8
            long r9 = r3.mo70086b(r7, r2, r4, r8)
            r6.f40906g = r9
            r6.f40904e = r5
            goto L_0x00dd
        L_0x00db:
            r8 = 8
        L_0x00dd:
            uh.b r3 = r6.f40903d
            int r7 = r6.f40905f
            uh.d$a r3 = (p685uh.C18577d.C18578a) r3
            uh.d r3 = p685uh.C18577d.this
            r3.getClass()
            r3 = 5
            r9 = 3
            switch(r7) {
                case 131: goto L_0x00f7;
                case 134: goto L_0x00f5;
                case 136: goto L_0x00f7;
                case 155: goto L_0x00f7;
                case 159: goto L_0x00f7;
                case 160: goto L_0x00f3;
                case 161: goto L_0x00f1;
                case 163: goto L_0x00f1;
                case 165: goto L_0x00f1;
                case 166: goto L_0x00f3;
                case 174: goto L_0x00f3;
                case 176: goto L_0x00f7;
                case 179: goto L_0x00f7;
                case 181: goto L_0x00ef;
                case 183: goto L_0x00f3;
                case 186: goto L_0x00f7;
                case 187: goto L_0x00f3;
                case 215: goto L_0x00f7;
                case 224: goto L_0x00f3;
                case 225: goto L_0x00f3;
                case 231: goto L_0x00f7;
                case 238: goto L_0x00f7;
                case 241: goto L_0x00f7;
                case 251: goto L_0x00f7;
                case 16868: goto L_0x00f3;
                case 16871: goto L_0x00f7;
                case 16877: goto L_0x00f1;
                case 16980: goto L_0x00f7;
                case 16981: goto L_0x00f1;
                case 17026: goto L_0x00f5;
                case 17029: goto L_0x00f7;
                case 17143: goto L_0x00f7;
                case 17545: goto L_0x00ef;
                case 18401: goto L_0x00f7;
                case 18402: goto L_0x00f1;
                case 18407: goto L_0x00f3;
                case 18408: goto L_0x00f7;
                case 19899: goto L_0x00f3;
                case 20529: goto L_0x00f7;
                case 20530: goto L_0x00f7;
                case 20532: goto L_0x00f3;
                case 20533: goto L_0x00f3;
                case 21358: goto L_0x00f5;
                case 21419: goto L_0x00f1;
                case 21420: goto L_0x00f7;
                case 21432: goto L_0x00f7;
                case 21680: goto L_0x00f7;
                case 21682: goto L_0x00f7;
                case 21690: goto L_0x00f7;
                case 21930: goto L_0x00f7;
                case 21936: goto L_0x00f3;
                case 21945: goto L_0x00f7;
                case 21946: goto L_0x00f7;
                case 21947: goto L_0x00f7;
                case 21948: goto L_0x00f7;
                case 21949: goto L_0x00f7;
                case 21968: goto L_0x00f3;
                case 21969: goto L_0x00ef;
                case 21970: goto L_0x00ef;
                case 21971: goto L_0x00ef;
                case 21972: goto L_0x00ef;
                case 21973: goto L_0x00ef;
                case 21974: goto L_0x00ef;
                case 21975: goto L_0x00ef;
                case 21976: goto L_0x00ef;
                case 21977: goto L_0x00ef;
                case 21978: goto L_0x00ef;
                case 21998: goto L_0x00f7;
                case 22186: goto L_0x00f7;
                case 22203: goto L_0x00f7;
                case 25152: goto L_0x00f3;
                case 25188: goto L_0x00f7;
                case 25506: goto L_0x00f1;
                case 28032: goto L_0x00f3;
                case 30113: goto L_0x00f3;
                case 30320: goto L_0x00f3;
                case 30321: goto L_0x00f7;
                case 30322: goto L_0x00f1;
                case 30323: goto L_0x00ef;
                case 30324: goto L_0x00ef;
                case 30325: goto L_0x00ef;
                case 2274716: goto L_0x00f5;
                case 2352003: goto L_0x00f7;
                case 2807729: goto L_0x00f7;
                case 290298740: goto L_0x00f3;
                case 357149030: goto L_0x00f3;
                case 374648427: goto L_0x00f3;
                case 408125543: goto L_0x00f3;
                case 440786851: goto L_0x00f3;
                case 475249515: goto L_0x00f3;
                case 524531317: goto L_0x00f3;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            r7 = r2
            goto L_0x00f8
        L_0x00ef:
            r7 = r3
            goto L_0x00f8
        L_0x00f1:
            r7 = 4
            goto L_0x00f8
        L_0x00f3:
            r7 = r4
            goto L_0x00f8
        L_0x00f5:
            r7 = r9
            goto L_0x00f8
        L_0x00f7:
            r7 = r5
        L_0x00f8:
            if (r7 == 0) goto L_0x0a19
            if (r7 == r4) goto L_0x091f
            java.lang.String r10 = " not supported"
            r11 = 8
            r15 = 255(0xff, float:3.57E-43)
            if (r7 == r5) goto L_0x0607
            r18 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r7 == r9) goto L_0x0569
            r8 = 4
            if (r7 == r8) goto L_0x0216
            if (r7 != r3) goto L_0x0208
            long r7 = r6.f40906g
            r9 = 4
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0136
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x011b
            goto L_0x0136
        L_0x011b:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            long r2 = r6.f40906g
            r4 = 40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Invalid float size: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0136:
            uh.b r3 = r6.f40903d
            int r5 = r6.f40905f
            int r7 = (int) r7
            r8 = r28
            ph.e r8 = (p644ph.C18346e) r8
            byte[] r9 = r6.f40900a
            r8.mo69874g(r9, r2, r7, r2)
            r8 = 0
            r10 = r2
        L_0x0147:
            r16 = 8
            if (r10 >= r7) goto L_0x0159
            long r8 = r8 << r16
            byte[] r11 = r6.f40900a
            byte r11 = r11[r10]
            r11 = r11 & r15
            long r11 = (long) r11
            long r8 = r8 | r11
            int r10 = r10 + 1
            r15 = 255(0xff, float:3.57E-43)
            goto L_0x0147
        L_0x0159:
            r10 = 4
            if (r7 != r10) goto L_0x0163
            int r7 = (int) r8
            float r7 = java.lang.Float.intBitsToFloat(r7)
            double r7 = (double) r7
            goto L_0x0167
        L_0x0163:
            double r7 = java.lang.Double.longBitsToDouble(r8)
        L_0x0167:
            uh.d$a r3 = (p685uh.C18577d.C18578a) r3
            uh.d r3 = p685uh.C18577d.this
            r9 = 181(0xb5, float:2.54E-43)
            if (r5 == r9) goto L_0x01fb
            r9 = 17545(0x4489, float:2.4586E-41)
            if (r5 == r9) goto L_0x01f7
            switch(r5) {
                case 21969: goto L_0x01cf;
                case 21970: goto L_0x01c6;
                case 21971: goto L_0x01bd;
                case 21972: goto L_0x01b4;
                case 21973: goto L_0x01ab;
                case 21974: goto L_0x01a2;
                case 21975: goto L_0x0199;
                case 21976: goto L_0x018f;
                case 21977: goto L_0x0185;
                case 21978: goto L_0x017b;
                default: goto L_0x0176;
            }
        L_0x0176:
            switch(r5) {
                case 30323: goto L_0x01ea;
                case 30324: goto L_0x01e1;
                case 30325: goto L_0x01d8;
                default: goto L_0x0179;
            }
        L_0x0179:
            goto L_0x01f3
        L_0x017b:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40980M = r5
            goto L_0x0203
        L_0x0185:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40979L = r5
            goto L_0x0203
        L_0x018f:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40978K = r5
            goto L_0x0203
        L_0x0199:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40977J = r5
            goto L_0x0203
        L_0x01a2:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40976I = r5
            goto L_0x0203
        L_0x01ab:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40975H = r5
            goto L_0x0203
        L_0x01b4:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40974G = r5
            goto L_0x0203
        L_0x01bd:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40973F = r5
            goto L_0x0203
        L_0x01c6:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40972E = r5
            goto L_0x0203
        L_0x01cf:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f40971D = r5
            goto L_0x0203
        L_0x01d8:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f41013u = r5
            goto L_0x0203
        L_0x01e1:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f41012t = r5
            goto L_0x0203
        L_0x01ea:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            float r5 = (float) r7
            r3.f41011s = r5
            goto L_0x0203
        L_0x01f3:
            r3.getClass()
            goto L_0x0203
        L_0x01f7:
            long r7 = (long) r7
            r3.f40959s = r7
            goto L_0x0203
        L_0x01fb:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            int r5 = (int) r7
            r3.f40984Q = r5
        L_0x0203:
            r6.f40904e = r2
        L_0x0205:
            r3 = r4
            goto L_0x09e8
        L_0x0208:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 32
            java.lang.String r3 = "Invalid element type "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r2, r3, r7)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0216:
            uh.b r3 = r6.f40903d
            int r7 = r6.f40905f
            long r10 = r6.f40906g
            int r8 = (int) r10
            uh.d$a r3 = (p685uh.C18577d.C18578a) r3
            uh.d r3 = p685uh.C18577d.this
            r3.getClass()
            r10 = 161(0xa1, float:2.26E-43)
            r11 = 163(0xa3, float:2.28E-43)
            if (r7 == r10) goto L_0x0329
            if (r7 == r11) goto L_0x0329
            r9 = 165(0xa5, float:2.31E-43)
            if (r7 == r9) goto L_0x02ef
            r5 = 16877(0x41ed, float:2.365E-41)
            if (r7 == r5) goto L_0x02c7
            r5 = 16981(0x4255, float:2.3795E-41)
            if (r7 == r5) goto L_0x02b5
            r5 = 18402(0x47e2, float:2.5787E-41)
            if (r7 == r5) goto L_0x029e
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r7 == r4) goto L_0x027a
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r7 == r4) goto L_0x0268
            r4 = 30322(0x7672, float:4.249E-41)
            if (r7 != r4) goto L_0x025a
            r3.mo70076e(r7)
            uh.d$b r3 = r3.f40961u
            byte[] r4 = new byte[r8]
            r3.f41014v = r4
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            r3.mo69874g(r4, r2, r8, r2)
            goto L_0x0565
        L_0x025a:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 26
            java.lang.String r3 = "Unexpected id: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r2, r3, r7)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0268:
            r3.mo70076e(r7)
            uh.d$b r3 = r3.f40961u
            byte[] r4 = new byte[r8]
            r3.f41003k = r4
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            r3.mo69874g(r4, r2, r8, r2)
            goto L_0x0565
        L_0x027a:
            bj.r r4 = r3.f40949i
            byte[] r4 = r4.f30986a
            java.util.Arrays.fill(r4, r2)
            bj.r r4 = r3.f40949i
            byte[] r4 = r4.f30986a
            int r5 = 4 - r8
            r7 = r28
            ph.e r7 = (p644ph.C18346e) r7
            r7.mo69874g(r4, r5, r8, r2)
            bj.r r4 = r3.f40949i
            r4.mo46935z(r2)
            bj.r r4 = r3.f40949i
            long r4 = r4.mo46926q()
            int r4 = (int) r4
            r3.f40963w = r4
            goto L_0x0565
        L_0x029e:
            byte[] r5 = new byte[r8]
            r9 = r28
            ph.e r9 = (p644ph.C18346e) r9
            r9.mo69874g(r5, r2, r8, r2)
            r3.mo70076e(r7)
            uh.d$b r3 = r3.f40961u
            ph.v$a r7 = new ph.v$a
            r7.<init>(r4, r2, r2, r5)
            r3.f41002j = r7
            goto L_0x0565
        L_0x02b5:
            r3.mo70076e(r7)
            uh.d$b r3 = r3.f40961u
            byte[] r4 = new byte[r8]
            r3.f41001i = r4
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            r3.mo69874g(r4, r2, r8, r2)
            goto L_0x0565
        L_0x02c7:
            r3.mo70076e(r7)
            uh.d$b r3 = r3.f40961u
            int r4 = r3.f40999g
            r5 = 1685485123(0x64767643, float:1.8185683E22)
            if (r4 == r5) goto L_0x02e2
            r5 = 1685480259(0x64766343, float:1.8180206E22)
            if (r4 != r5) goto L_0x02d9
            goto L_0x02e2
        L_0x02d9:
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            r3.mo69879j(r8)
            goto L_0x0565
        L_0x02e2:
            byte[] r4 = new byte[r8]
            r3.f40981N = r4
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            r3.mo69874g(r4, r2, r8, r2)
            goto L_0x0565
        L_0x02ef:
            int r4 = r3.f40920G
            if (r4 == r5) goto L_0x02f5
            goto L_0x0565
        L_0x02f5:
            android.util.SparseArray<uh.d$b> r4 = r3.f40943c
            int r5 = r3.f40926M
            java.lang.Object r4 = r4.get(r5)
            uh.d$b r4 = (p685uh.C18577d.C18579b) r4
            int r5 = r3.f40929P
            r7 = 4
            if (r5 != r7) goto L_0x0320
            java.lang.String r4 = r4.f40994b
            java.lang.String r5 = "V_VP9"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0320
            bj.r r4 = r3.f40954n
            r4.mo46932w(r8)
            bj.r r3 = r3.f40954n
            byte[] r3 = r3.f30986a
            r4 = r28
            ph.e r4 = (p644ph.C18346e) r4
            r4.mo69874g(r3, r2, r8, r2)
            goto L_0x0565
        L_0x0320:
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            r3.mo69879j(r8)
            goto L_0x0565
        L_0x0329:
            int r10 = r3.f40920G
            if (r10 != 0) goto L_0x0350
            uh.f r10 = r3.f40942b
            r11 = r28
            ph.e r11 = (p644ph.C18346e) r11
            r12 = 8
            long r10 = r10.mo70086b(r11, r2, r4, r12)
            int r10 = (int) r10
            r3.f40926M = r10
            uh.f r10 = r3.f40942b
            int r10 = r10.f41031c
            r3.f40927N = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f40922I = r10
            r3.f40920G = r4
            bj.r r10 = r3.f40947g
            r10.mo46932w(r2)
        L_0x0350:
            android.util.SparseArray<uh.d$b> r10 = r3.f40943c
            int r11 = r3.f40926M
            java.lang.Object r10 = r10.get(r11)
            uh.d$b r10 = (p685uh.C18577d.C18579b) r10
            if (r10 != 0) goto L_0x036a
            int r4 = r3.f40927N
            int r8 = r8 - r4
            r4 = r28
            ph.e r4 = (p644ph.C18346e) r4
            r4.mo69879j(r8)
            r3.f40920G = r2
            goto L_0x0565
        L_0x036a:
            ph.v r11 = r10.f40991X
            r11.getClass()
            int r11 = r3.f40920G
            if (r11 != r4) goto L_0x050f
            r11 = r28
            ph.e r11 = (p644ph.C18346e) r11
            r3.mo70078i(r11, r9)
            bj.r r12 = r3.f40947g
            byte[] r12 = r12.f30986a
            byte r12 = r12[r5]
            r12 = r12 & 6
            int r12 = r12 >> r4
            if (r12 != 0) goto L_0x03a4
            r3.f40924K = r4
            int[] r11 = r3.f40925L
            if (r11 != 0) goto L_0x038e
            int[] r11 = new int[r4]
            goto L_0x039a
        L_0x038e:
            int r12 = r11.length
            if (r12 < r4) goto L_0x0392
            goto L_0x039a
        L_0x0392:
            int r11 = r11.length
            int r11 = r11 * r5
            int r4 = java.lang.Math.max(r11, r4)
            int[] r11 = new int[r4]
        L_0x039a:
            r3.f40925L = r11
            int r4 = r3.f40927N
            int r8 = r8 - r4
            int r8 = r8 - r9
            r11[r2] = r8
            goto L_0x04c8
        L_0x03a4:
            r15 = 4
            r3.mo70078i(r11, r15)
            bj.r r15 = r3.f40947g
            byte[] r15 = r15.f30986a
            byte r15 = r15[r9]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r4
            r3.f40924K = r15
            int[] r13 = r3.f40925L
            if (r13 != 0) goto L_0x03ba
            int[] r13 = new int[r15]
            goto L_0x03c6
        L_0x03ba:
            int r14 = r13.length
            if (r14 < r15) goto L_0x03be
            goto L_0x03c6
        L_0x03be:
            int r13 = r13.length
            int r13 = r13 * r5
            int r13 = java.lang.Math.max(r13, r15)
            int[] r13 = new int[r13]
        L_0x03c6:
            r3.f40925L = r13
            if (r12 != r5) goto L_0x03d7
            int r4 = r3.f40927N
            int r8 = r8 - r4
            r4 = 4
            int r8 = r8 - r4
            int r4 = r3.f40924K
            int r8 = r8 / r4
            java.util.Arrays.fill(r13, r2, r4, r8)
            goto L_0x04c8
        L_0x03d7:
            if (r12 != r4) goto L_0x0417
            r5 = r2
            r9 = r5
            r17 = 4
        L_0x03dd:
            int r12 = r3.f40924K
            int r12 = r12 + -1
            if (r5 >= r12) goto L_0x040b
            int[] r12 = r3.f40925L
            r12[r5] = r2
        L_0x03e7:
            int r12 = r17 + r4
            r3.mo70078i(r11, r12)
            bj.r r13 = r3.f40947g
            byte[] r13 = r13.f30986a
            int r14 = r12 + -1
            byte r13 = r13[r14]
            r14 = 255(0xff, float:3.57E-43)
            r13 = r13 & r14
            int[] r15 = r3.f40925L
            r16 = r15[r5]
            int r16 = r16 + r13
            r15[r5] = r16
            if (r13 == r14) goto L_0x0408
            int r9 = r9 + r16
            int r5 = r5 + 1
            r17 = r12
            goto L_0x03dd
        L_0x0408:
            r17 = r12
            goto L_0x03e7
        L_0x040b:
            int[] r2 = r3.f40925L
            int r4 = r3.f40927N
            int r8 = r8 - r4
            int r8 = r8 - r17
            int r8 = r8 - r9
            r2[r12] = r8
            goto L_0x04c8
        L_0x0417:
            if (r12 != r9) goto L_0x0501
            r5 = r2
            r9 = r4
            r17 = 4
            r4 = r5
        L_0x041e:
            int r12 = r3.f40924K
            int r12 = r12 + -1
            if (r2 >= r12) goto L_0x04be
            int[] r12 = r3.f40925L
            r12[r2] = r5
            int r12 = r17 + 1
            r3.mo70078i(r11, r12)
            bj.r r13 = r3.f40947g
            byte[] r13 = r13.f30986a
            int r14 = r12 + -1
            byte r13 = r13[r14]
            if (r13 == 0) goto L_0x04b6
        L_0x0437:
            r13 = 8
            if (r5 >= r13) goto L_0x0489
            int r13 = 7 - r5
            int r9 = r9 << r13
            bj.r r13 = r3.f40947g
            byte[] r13 = r13.f30986a
            byte r13 = r13[r14]
            r13 = r13 & r9
            if (r13 == 0) goto L_0x0484
            int r12 = r12 + r5
            r3.mo70078i(r11, r12)
            bj.r r13 = r3.f40947g
            byte[] r13 = r13.f30986a
            int r15 = r14 + 1
            byte r13 = r13[r14]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r9 = ~r9
            r9 = r9 & r13
            long r13 = (long) r9
        L_0x0458:
            if (r15 >= r12) goto L_0x0472
            r9 = 8
            long r13 = r13 << r9
            bj.r r9 = r3.f40947g
            byte[] r9 = r9.f30986a
            int r16 = r15 + 1
            byte r9 = r9[r15]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r15 = r11
            r17 = r12
            long r11 = (long) r9
            long r13 = r13 | r11
            r11 = r15
            r15 = r16
            r12 = r17
            goto L_0x0458
        L_0x0472:
            r15 = r11
            r17 = r12
            if (r2 <= 0) goto L_0x048e
            int r5 = r5 * 7
            int r5 = r5 + 6
            r11 = 1
            long r20 = r11 << r5
            long r22 = r20 - r11
            long r13 = r13 - r22
            goto L_0x048e
        L_0x0484:
            r15 = r11
            int r5 = r5 + 1
            r9 = 1
            goto L_0x0437
        L_0x0489:
            r15 = r11
            r13 = 0
            r17 = r12
        L_0x048e:
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x04ae
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 > 0) goto L_0x04ae
            int r5 = (int) r13
            int[] r9 = r3.f40925L
            if (r2 != 0) goto L_0x049f
            goto L_0x04a4
        L_0x049f:
            int r11 = r2 + -1
            r11 = r9[r11]
            int r5 = r5 + r11
        L_0x04a4:
            r9[r2] = r5
            int r4 = r4 + r5
            int r2 = r2 + 1
            r5 = 0
            r9 = 1
            r11 = r15
            goto L_0x041e
        L_0x04ae:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x04b6:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x04be:
            int[] r2 = r3.f40925L
            int r5 = r3.f40927N
            int r8 = r8 - r5
            int r8 = r8 - r17
            int r8 = r8 - r4
            r2[r12] = r8
        L_0x04c8:
            bj.r r2 = r3.f40947g
            byte[] r2 = r2.f30986a
            r4 = 0
            byte r4 = r2[r4]
            int r4 = r4 << 8
            r5 = 1
            byte r2 = r2[r5]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r4
            long r4 = r3.f40915B
            long r8 = (long) r2
            long r8 = r3.mo70080k(r8)
            long r8 = r8 + r4
            r3.f40921H = r8
            int r2 = r10.f40996d
            r4 = 2
            if (r2 == r4) goto L_0x04f8
            r2 = 163(0xa3, float:2.28E-43)
            if (r7 != r2) goto L_0x04f6
            bj.r r2 = r3.f40947g
            byte[] r2 = r2.f30986a
            byte r2 = r2[r4]
            r5 = 128(0x80, float:1.794E-43)
            r2 = r2 & r5
            if (r2 != r5) goto L_0x04f6
            goto L_0x04f8
        L_0x04f6:
            r2 = 0
            goto L_0x04f9
        L_0x04f8:
            r2 = 1
        L_0x04f9:
            r3.f40928O = r2
            r3.f40920G = r4
            r2 = 0
            r3.f40923J = r2
            goto L_0x050f
        L_0x0501:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 36
            java.lang.String r3 = "Unexpected lacing value: "
            java.lang.String r2 = android.support.p013v4.media.C0072d.m200g(r2, r3, r12)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x050f:
            r2 = 163(0xa3, float:2.28E-43)
            if (r7 != r2) goto L_0x0549
        L_0x0513:
            int r2 = r3.f40923J
            int r4 = r3.f40924K
            if (r2 >= r4) goto L_0x0545
            int[] r4 = r3.f40925L
            r2 = r4[r2]
            r4 = r28
            ph.e r4 = (p644ph.C18346e) r4
            int r25 = r3.mo70081l(r2, r4, r10)
            long r4 = r3.f40921H
            int r2 = r3.f40923J
            int r7 = r10.f40997e
            int r2 = r2 * r7
            int r2 = r2 / 1000
            long r7 = (long) r2
            long r22 = r7 + r4
            int r2 = r3.f40928O
            r26 = 0
            r20 = r3
            r21 = r10
            r24 = r2
            r20.mo70077g(r21, r22, r24, r25, r26)
            int r2 = r3.f40923J
            int r2 = r2 + 1
            r3.f40923J = r2
            goto L_0x0513
        L_0x0545:
            r2 = 0
            r3.f40920G = r2
            goto L_0x0564
        L_0x0549:
            int r2 = r3.f40923J
            int r4 = r3.f40924K
            if (r2 >= r4) goto L_0x0564
            int[] r4 = r3.f40925L
            r5 = r4[r2]
            r7 = r28
            ph.e r7 = (p644ph.C18346e) r7
            int r5 = r3.mo70081l(r5, r7, r10)
            r4[r2] = r5
            int r2 = r3.f40923J
            int r2 = r2 + 1
            r3.f40923J = r2
            goto L_0x0549
        L_0x0564:
            r2 = 0
        L_0x0565:
            r6.f40904e = r2
            goto L_0x09e5
        L_0x0569:
            long r2 = r6.f40906g
            int r4 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r4 > 0) goto L_0x05ec
            uh.b r4 = r6.f40903d
            int r5 = r6.f40905f
            int r2 = (int) r2
            if (r2 != 0) goto L_0x0579
            java.lang.String r2 = ""
            goto L_0x0594
        L_0x0579:
            byte[] r3 = new byte[r2]
            r7 = r28
            ph.e r7 = (p644ph.C18346e) r7
            r8 = 0
            r7.mo69874g(r3, r8, r2, r8)
        L_0x0583:
            if (r2 <= 0) goto L_0x058d
            int r7 = r2 + -1
            byte r8 = r3[r7]
            if (r8 != 0) goto L_0x058d
            r2 = r7
            goto L_0x0583
        L_0x058d:
            java.lang.String r7 = new java.lang.String
            r8 = 0
            r7.<init>(r3, r8, r2)
            r2 = r7
        L_0x0594:
            uh.d$a r4 = (p685uh.C18577d.C18578a) r4
            uh.d r3 = p685uh.C18577d.this
            r3.getClass()
            r4 = 134(0x86, float:1.88E-43)
            if (r5 == r4) goto L_0x05e0
            r4 = 17026(0x4282, float:2.3859E-41)
            if (r5 == r4) goto L_0x05bd
            r4 = 21358(0x536e, float:2.9929E-41)
            if (r5 == r4) goto L_0x05b5
            r4 = 2274716(0x22b59c, float:3.187556E-39)
            if (r5 == r4) goto L_0x05ad
            goto L_0x05e7
        L_0x05ad:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            r3.f40990W = r2
            goto L_0x05e7
        L_0x05b5:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            r3.f40993a = r2
            goto L_0x05e7
        L_0x05bd:
            java.lang.String r3 = "webm"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x05e7
            java.lang.String r3 = "matroska"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x05ce
            goto L_0x05e7
        L_0x05ce:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            int r3 = r2.length()
            int r3 = r3 + 22
            java.lang.String r4 = "DocType "
            java.lang.String r2 = p504ai.C13983i.m21492k(r3, r4, r2, r10)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05e0:
            r3.mo70076e(r5)
            uh.d$b r3 = r3.f40961u
            r3.f40994b = r2
        L_0x05e7:
            r2 = 0
            r6.f40904e = r2
            goto L_0x09e5
        L_0x05ec:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            long r2 = r6.f40906g
            r4 = 41
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "String element size: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0607:
            long r2 = r6.f40906g
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0904
            uh.b r4 = r6.f40903d
            int r5 = r6.f40905f
            int r2 = (int) r2
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            byte[] r7 = r6.f40900a
            r8 = 0
            r3.mo69874g(r7, r8, r2, r8)
            r3 = 0
            r7 = 0
        L_0x061f:
            if (r3 >= r2) goto L_0x062f
            r11 = 8
            long r7 = r7 << r11
            byte[] r11 = r6.f40900a
            byte r11 = r11[r3]
            r11 = r11 & 255(0xff, float:3.57E-43)
            long r11 = (long) r11
            long r7 = r7 | r11
            int r3 = r3 + 1
            goto L_0x061f
        L_0x062f:
            uh.d$a r4 = (p685uh.C18577d.C18578a) r4
            uh.d r2 = p685uh.C18577d.this
            r2.getClass()
            r3 = 20529(0x5031, float:2.8767E-41)
            r4 = 55
            if (r5 == r3) goto L_0x08df
            r3 = 20530(0x5032, float:2.8769E-41)
            if (r5 == r3) goto L_0x08be
            r3 = 50
            switch(r5) {
                case 131: goto L_0x083d;
                case 136: goto L_0x082b;
                case 155: goto L_0x0823;
                case 159: goto L_0x0819;
                case 176: goto L_0x080f;
                case 179: goto L_0x0801;
                case 186: goto L_0x07f7;
                case 215: goto L_0x07ed;
                case 231: goto L_0x07e5;
                case 238: goto L_0x07e0;
                case 241: goto L_0x07cf;
                case 251: goto L_0x07ca;
                case 16871: goto L_0x07c0;
                case 16980: goto L_0x079e;
                case 17029: goto L_0x0774;
                case 17143: goto L_0x0752;
                case 18401: goto L_0x072e;
                case 18408: goto L_0x070a;
                case 21420: goto L_0x0703;
                case 21432: goto L_0x06d8;
                case 21680: goto L_0x06ce;
                case 21682: goto L_0x06c4;
                case 21690: goto L_0x06ba;
                case 21930: goto L_0x06a8;
                case 21998: goto L_0x069e;
                case 22186: goto L_0x0695;
                case 22203: goto L_0x068c;
                case 25188: goto L_0x0682;
                case 30321: goto L_0x0659;
                case 2352003: goto L_0x064f;
                case 2807729: goto L_0x064b;
                default: goto L_0x0645;
            }
        L_0x0645:
            r3 = 7
            switch(r5) {
                case 21945: goto L_0x08a8;
                case 21946: goto L_0x0884;
                case 21947: goto L_0x085b;
                case 21948: goto L_0x0851;
                case 21949: goto L_0x0847;
                default: goto L_0x0649;
            }
        L_0x0649:
            goto L_0x08e5
        L_0x064b:
            r2.f40958r = r7
            goto L_0x08e5
        L_0x064f:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40997e = r3
            goto L_0x08e5
        L_0x0659:
            r2.mo70076e(r5)
            int r3 = (int) r7
            if (r3 == 0) goto L_0x067b
            r4 = 1
            if (r3 == r4) goto L_0x0675
            r4 = 2
            if (r3 == r4) goto L_0x066f
            if (r3 == r9) goto L_0x0669
            goto L_0x08e5
        L_0x0669:
            uh.d$b r2 = r2.f40961u
            r2.f41010r = r9
            goto L_0x08e5
        L_0x066f:
            uh.d$b r2 = r2.f40961u
            r2.f41010r = r4
            goto L_0x08e5
        L_0x0675:
            uh.d$b r2 = r2.f40961u
            r2.f41010r = r4
            goto L_0x08e5
        L_0x067b:
            uh.d$b r2 = r2.f40961u
            r3 = 0
            r2.f41010r = r3
            goto L_0x08e5
        L_0x0682:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40983P = r3
            goto L_0x08e5
        L_0x068c:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            r2.f40986S = r7
            goto L_0x08e5
        L_0x0695:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            r2.f40985R = r7
            goto L_0x08e5
        L_0x069e:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40998f = r3
            goto L_0x08e5
        L_0x06a8:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            r3 = 1
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x06b5
            r3 = 1
            goto L_0x06b6
        L_0x06b5:
            r3 = 0
        L_0x06b6:
            r2.f40988U = r3
            goto L_0x08e5
        L_0x06ba:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f41008p = r3
            goto L_0x08e5
        L_0x06c4:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f41009q = r3
            goto L_0x08e5
        L_0x06ce:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f41007o = r3
            goto L_0x08e5
        L_0x06d8:
            int r3 = (int) r7
            r2.mo70076e(r5)
            if (r3 == 0) goto L_0x06fc
            r4 = 1
            if (r3 == r4) goto L_0x06f5
            if (r3 == r9) goto L_0x06ef
            r4 = 15
            if (r3 == r4) goto L_0x06e9
            goto L_0x08e5
        L_0x06e9:
            uh.d$b r2 = r2.f40961u
            r2.f41015w = r9
            goto L_0x08e5
        L_0x06ef:
            uh.d$b r2 = r2.f40961u
            r2.f41015w = r4
            goto L_0x08e5
        L_0x06f5:
            uh.d$b r2 = r2.f40961u
            r3 = 2
            r2.f41015w = r3
            goto L_0x08e5
        L_0x06fc:
            uh.d$b r2 = r2.f40961u
            r3 = 0
            r2.f41015w = r3
            goto L_0x08e5
        L_0x0703:
            long r3 = r2.f40957q
            long r7 = r7 + r3
            r2.f40964x = r7
            goto L_0x08e5
        L_0x070a:
            r2 = 1
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0712
            goto L_0x08e5
        L_0x0712:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 56
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "AESSettingsCipherMode "
            r3.append(r2)
            r3.append(r7)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x072e:
            r2 = 5
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0736
            goto L_0x08e5
        L_0x0736:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "ContentEncAlgo "
            r3.append(r2)
            r3.append(r7)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0752:
            r4 = 1
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x075a
            goto L_0x08e5
        L_0x075a:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "EBMLReadVersion "
            r2.append(r3)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0774:
            r2 = 1
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0782
            r2 = 2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0782
            goto L_0x08e5
        L_0x0782:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            r2 = 53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "DocTypeReadVersion "
            r3.append(r2)
            r3.append(r7)
            r3.append(r10)
            java.lang.String r2 = r3.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x079e:
            r4 = 3
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x07a6
            goto L_0x08e5
        L_0x07a6:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "ContentCompAlgo "
            r2.append(r3)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x07c0:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40999g = r3
            goto L_0x08e5
        L_0x07ca:
            r3 = 1
            r2.f40930Q = r3
            goto L_0x08e5
        L_0x07cf:
            r3 = 1
            boolean r4 = r2.f40918E
            if (r4 != 0) goto L_0x08e5
            r2.mo70075d(r5)
            q8.a r4 = r2.f40917D
            r4.mo20204a(r7)
            r2.f40918E = r3
            goto L_0x08e5
        L_0x07e0:
            int r3 = (int) r7
            r2.f40929P = r3
            goto L_0x08e5
        L_0x07e5:
            long r3 = r2.mo70080k(r7)
            r2.f40915B = r3
            goto L_0x08e5
        L_0x07ed:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40995c = r3
            goto L_0x08e5
        L_0x07f7:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f41006n = r3
            goto L_0x08e5
        L_0x0801:
            r2.mo70075d(r5)
            q8.a r3 = r2.f40916C
            long r4 = r2.mo70080k(r7)
            r3.mo20204a(r4)
            goto L_0x08e5
        L_0x080f:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f41005m = r3
            goto L_0x08e5
        L_0x0819:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40982O = r3
            goto L_0x08e5
        L_0x0823:
            long r3 = r2.mo70080k(r7)
            r2.f40922I = r3
            goto L_0x08e5
        L_0x082b:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            r3 = 1
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0838
            r3 = 1
            goto L_0x0839
        L_0x0838:
            r3 = 0
        L_0x0839:
            r2.f40989V = r3
            goto L_0x08e5
        L_0x083d:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40996d = r3
            goto L_0x08e5
        L_0x0847:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40970C = r3
            goto L_0x08e5
        L_0x0851:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            int r3 = (int) r7
            r2.f40969B = r3
            goto L_0x08e5
        L_0x085b:
            r2.mo70076e(r5)
            uh.d$b r2 = r2.f40961u
            r4 = 1
            r2.f41016x = r4
            int r5 = (int) r7
            if (r5 == r4) goto L_0x0881
            r4 = 9
            if (r5 == r4) goto L_0x087c
            r4 = 4
            if (r5 == r4) goto L_0x0877
            r4 = 5
            if (r5 == r4) goto L_0x0877
            r4 = 6
            if (r5 == r4) goto L_0x0877
            if (r5 == r3) goto L_0x0877
            goto L_0x08e5
        L_0x0877:
            r3 = 2
            r2.f41017y = r3
            goto L_0x08e5
        L_0x087c:
            r3 = 6
            r2.f41017y = r3
            goto L_0x08e5
        L_0x0881:
            r2.f41017y = r4
            goto L_0x08e5
        L_0x0884:
            r4 = 6
            r10 = 1
            r2.mo70076e(r5)
            int r5 = (int) r7
            if (r5 == r10) goto L_0x08a3
            r7 = 16
            if (r5 == r7) goto L_0x089e
            r7 = 18
            if (r5 == r7) goto L_0x0899
            if (r5 == r4) goto L_0x08a3
            if (r5 == r3) goto L_0x08a3
            goto L_0x08e5
        L_0x0899:
            uh.d$b r2 = r2.f40961u
            r2.f41018z = r3
            goto L_0x08e5
        L_0x089e:
            uh.d$b r2 = r2.f40961u
            r2.f41018z = r4
            goto L_0x08e5
        L_0x08a3:
            uh.d$b r2 = r2.f40961u
            r2.f41018z = r9
            goto L_0x08e5
        L_0x08a8:
            r2.mo70076e(r5)
            int r3 = (int) r7
            r4 = 1
            if (r3 == r4) goto L_0x08b8
            r5 = 2
            if (r3 == r5) goto L_0x08b3
            goto L_0x08e5
        L_0x08b3:
            uh.d$b r2 = r2.f40961u
            r2.f40968A = r4
            goto L_0x08e5
        L_0x08b8:
            r3 = 2
            uh.d$b r2 = r2.f40961u
            r2.f40968A = r3
            goto L_0x08e5
        L_0x08be:
            r2 = 1
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x08c5
            goto L_0x08e5
        L_0x08c5:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            java.lang.String r3 = "ContentEncodingScope "
            r2.append(r3)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x08df:
            r2 = 0
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x08ea
        L_0x08e5:
            r2 = 0
            r6.f40904e = r2
            goto L_0x09e5
        L_0x08ea:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r4)
            java.lang.String r3 = "ContentEncodingOrder "
            r2.append(r3)
            r2.append(r7)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0904:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            long r2 = r6.f40906g
            r4 = 42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Invalid integer size: "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x091f:
            r2 = r28
            ph.e r2 = (p644ph.C18346e) r2
            long r2 = r2.f40294d
            long r4 = r6.f40906g
            long r4 = r4 + r2
            java.util.ArrayDeque<uh.a$a> r7 = r6.f40901b
            uh.a$a r8 = new uh.a$a
            int r9 = r6.f40905f
            r8.<init>(r9, r4)
            r7.push(r8)
            uh.b r4 = r6.f40903d
            int r5 = r6.f40905f
            long r7 = r6.f40906g
            uh.d$a r4 = (p685uh.C18577d.C18578a) r4
            uh.d r4 = p685uh.C18577d.this
            ph.j r9 = r4.f40941a0
            p513bj.C14075p.m21696h(r9)
            r9 = 160(0xa0, float:2.24E-43)
            if (r5 == r9) goto L_0x09e0
            r9 = 174(0xae, float:2.44E-43)
            if (r5 == r9) goto L_0x09d7
            r9 = 187(0xbb, float:2.62E-43)
            if (r5 == r9) goto L_0x09d3
            r9 = 19899(0x4dbb, float:2.7884E-41)
            if (r5 == r9) goto L_0x09ca
            r9 = 20533(0x5035, float:2.8773E-41)
            if (r5 == r9) goto L_0x09c1
            r9 = 21968(0x55d0, float:3.0784E-41)
            if (r5 == r9) goto L_0x09b8
            r9 = 408125543(0x18538067, float:2.7335937E-24)
            if (r5 == r9) goto L_0x099e
            r2 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r5 == r2) goto L_0x098f
            r2 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r5 == r2) goto L_0x096b
            goto L_0x09d1
        L_0x096b:
            boolean r2 = r4.f40962v
            if (r2 != 0) goto L_0x09d1
            boolean r2 = r4.f40944d
            if (r2 == 0) goto L_0x097f
            long r2 = r4.f40966z
            r7 = -1
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x097f
            r2 = 1
            r4.f40965y = r2
            goto L_0x09d1
        L_0x097f:
            r2 = 1
            ph.j r3 = r4.f40941a0
            ph.t$b r5 = new ph.t$b
            long r7 = r4.f40960t
            r5.<init>(r7)
            r3.mo4162l(r5)
            r4.f40962v = r2
            goto L_0x09d1
        L_0x098f:
            q8.a r2 = new q8.a
            r2.<init>()
            r4.f40916C = r2
            q8.a r2 = new q8.a
            r2.<init>()
            r4.f40917D = r2
            goto L_0x09d1
        L_0x099e:
            long r9 = r4.f40957q
            r11 = -1
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x09b3
            int r5 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x09ab
            goto L_0x09b3
        L_0x09ab:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Multiple Segment elements not supported"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x09b3:
            r4.f40957q = r2
            r4.f40956p = r7
            goto L_0x09d1
        L_0x09b8:
            r4.mo70076e(r5)
            uh.d$b r2 = r4.f40961u
            r3 = 1
            r2.f41016x = r3
            goto L_0x09d1
        L_0x09c1:
            r2 = 1
            r4.mo70076e(r5)
            uh.d$b r3 = r4.f40961u
            r3.f41000h = r2
            goto L_0x09d1
        L_0x09ca:
            r2 = -1
            r4.f40963w = r2
            r2 = -1
            r4.f40964x = r2
        L_0x09d1:
            r2 = 0
            goto L_0x09e3
        L_0x09d3:
            r2 = 0
            r4.f40918E = r2
            goto L_0x09e3
        L_0x09d7:
            r2 = 0
            uh.d$b r3 = new uh.d$b
            r3.<init>()
            r4.f40961u = r3
            goto L_0x09e3
        L_0x09e0:
            r2 = 0
            r4.f40930Q = r2
        L_0x09e3:
            r6.f40904e = r2
        L_0x09e5:
            r2 = 1
            goto L_0x00bd
        L_0x09e8:
            if (r3 == 0) goto L_0x0a15
            r2 = r28
            ph.e r2 = (p644ph.C18346e) r2
            long r4 = r2.f40294d
            boolean r2 = r0.f40965y
            if (r2 == 0) goto L_0x09fe
            r0.f40914A = r4
            long r4 = r0.f40966z
            r1.f40327a = r4
            r2 = 0
            r0.f40965y = r2
            goto L_0x0a0e
        L_0x09fe:
            boolean r2 = r0.f40962v
            if (r2 == 0) goto L_0x0a10
            long r4 = r0.f40914A
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0a10
            r1.f40327a = r4
            r0.f40914A = r6
        L_0x0a0e:
            r2 = 1
            goto L_0x0a11
        L_0x0a10:
            r2 = 0
        L_0x0a11:
            if (r2 == 0) goto L_0x0a15
            r1 = 1
            return r1
        L_0x0a15:
            r4 = 1
            r2 = 0
            goto L_0x0009
        L_0x0a19:
            long r2 = r6.f40906g
            int r2 = (int) r2
            r3 = r28
            ph.e r3 = (p644ph.C18346e) r3
            r3.mo69879j(r2)
            r2 = 0
            r6.f40904e = r2
            r5 = -1
            goto L_0x001a
        L_0x0a29:
            if (r3 != 0) goto L_0x0a60
            r1 = 0
        L_0x0a2c:
            android.util.SparseArray<uh.d$b> r2 = r0.f40943c
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x0a5e
            android.util.SparseArray<uh.d$b> r2 = r0.f40943c
            java.lang.Object r2 = r2.valueAt(r1)
            uh.d$b r2 = (p685uh.C18577d.C18579b) r2
            ph.v r3 = r2.f40991X
            r3.getClass()
            uh.d$c r3 = r2.f40987T
            if (r3 == 0) goto L_0x0a5b
            int r4 = r3.f41021c
            if (r4 <= 0) goto L_0x0a5b
            ph.v r5 = r2.f40991X
            long r6 = r3.f41022d
            int r8 = r3.f41023e
            int r9 = r3.f41024f
            int r10 = r3.f41025g
            ph.v$a r11 = r2.f41002j
            r5.mo47754c(r6, r8, r9, r10, r11)
            r2 = 0
            r3.f41021c = r2
        L_0x0a5b:
            int r1 = r1 + 1
            goto L_0x0a2c
        L_0x0a5e:
            r1 = -1
            return r1
        L_0x0a60:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p685uh.C18577d.mo47757a(ph.i, ph.s):int");
    }

    /* renamed from: b */
    public final void mo47758b(C18351j jVar) {
        this.f40941a0 = jVar;
    }

    /* renamed from: c */
    public final void mo47759c(long j, long j2) {
        this.f40915B = -9223372036854775807L;
        this.f40920G = 0;
        C18573a aVar = (C18573a) this.f40940a;
        aVar.f40904e = 0;
        aVar.f40901b.clear();
        C18582f fVar = aVar.f40902c;
        fVar.f41030b = 0;
        fVar.f41031c = 0;
        C18582f fVar2 = this.f40942b;
        fVar2.f41030b = 0;
        fVar2.f41031c = 0;
        mo70079j();
        for (int i = 0; i < this.f40943c.size(); i++) {
            C18580c cVar = this.f40943c.valueAt(i).f40987T;
            if (cVar != null) {
                cVar.f41020b = false;
                cVar.f41021c = 0;
            }
        }
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: d */
    public final void mo70075d(int i) throws ParserException {
        if (this.f40916C == null || this.f40917D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a Cues");
            throw new ParserException(sb.toString());
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: e */
    public final void mo70076e(int i) throws ParserException {
        if (this.f40961u == null) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Element ");
            sb.append(i);
            sb.append(" must be in a TrackEntry");
            throw new ParserException(sb.toString());
        }
    }

    /* renamed from: f */
    public final boolean mo47761f(C18350i iVar) throws IOException {
        long a;
        int i;
        C18581e eVar = new C18581e();
        C18346e eVar2 = (C18346e) iVar;
        long j = eVar2.f40293c;
        int i2 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (i2 != 0 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i3 = (int) j2;
        eVar2.mo69872c(eVar.f41026a.f30986a, 0, 4, false);
        eVar.f41027b = 4;
        for (long q = eVar.f41026a.mo46926q(); q != 440786851; q = ((long) (eVar.f41026a.f30986a[0] & 255)) | ((q << 8) & -256)) {
            int i4 = eVar.f41027b + 1;
            eVar.f41027b = i4;
            if (i4 == i3) {
                return false;
            }
            eVar2.mo69872c(eVar.f41026a.f30986a, 0, 1, false);
        }
        long a2 = eVar.mo70085a(eVar2);
        long j3 = (long) eVar.f41027b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j3 + a2 >= j) {
            return false;
        }
        while (true) {
            int i5 = (((long) eVar.f41027b) > (j3 + a2) ? 1 : (((long) eVar.f41027b) == (j3 + a2) ? 0 : -1));
            if (i5 >= 0) {
                return i5 == 0;
            }
            if (eVar.mo70085a(eVar2) == Long.MIN_VALUE || a < 0 || a > ParserMinimalBase.MAX_INT_L) {
                return false;
            }
            if (i != 0) {
                int a3 = (int) (a = eVar.mo70085a(eVar2));
                eVar2.mo69880k(a3, false);
                eVar.f41027b += a3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70077g(p685uh.C18577d.C18579b r17, long r18, int r20, int r21, int r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            uh.d$c r3 = r1.f40987T
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0043
            boolean r6 = r3.f41020b
            if (r6 != 0) goto L_0x0012
            goto L_0x00f9
        L_0x0012:
            int r6 = r3.f41021c
            int r7 = r6 + 1
            r3.f41021c = r7
            if (r6 != 0) goto L_0x0022
            r9 = r18
            r3.f41022d = r9
            r3.f41023e = r2
            r3.f41024f = r4
        L_0x0022:
            int r2 = r3.f41024f
            int r12 = r2 + r21
            r3.f41024f = r12
            r6 = r22
            r3.f41025g = r6
            r2 = 16
            if (r7 < r2) goto L_0x00f9
            if (r7 <= 0) goto L_0x00f9
            ph.v r8 = r1.f40991X
            long r9 = r3.f41022d
            int r11 = r3.f41023e
            ph.v$a r14 = r1.f41002j
            r13 = r22
            r8.mo47754c(r9, r11, r12, r13, r14)
            r3.f41021c = r4
            goto L_0x00f9
        L_0x0043:
            r9 = r18
            r6 = r22
            java.lang.String r3 = r1.f40994b
            java.lang.String r7 = "S_TEXT/UTF8"
            boolean r3 = r7.equals(r3)
            java.lang.String r8 = "S_TEXT/ASS"
            if (r3 != 0) goto L_0x005b
            java.lang.String r3 = r1.f40994b
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0077
        L_0x005b:
            int r3 = r0.f40924K
            java.lang.String r11 = "MatroskaExtractor"
            if (r3 <= r5) goto L_0x0067
            java.lang.String r3 = "Skipping subtitle sample in laced block."
            android.util.Log.w(r11, r3)
            goto L_0x0077
        L_0x0067:
            long r12 = r0.f40922I
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 != 0) goto L_0x007a
            java.lang.String r3 = "Skipping subtitle sample with no duration."
            android.util.Log.w(r11, r3)
        L_0x0077:
            r3 = r21
            goto L_0x00d4
        L_0x007a:
            java.lang.String r3 = r1.f40994b
            bj.r r11 = r0.f40951k
            byte[] r11 = r11.f30986a
            r3.getClass()
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L_0x00a0
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x009a
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "%02d:%02d:%02d,%03d"
            byte[] r3 = m31325h(r12, r7, r3)
            r7 = 19
            goto L_0x00aa
        L_0x009a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>()
            throw r1
        L_0x00a0:
            r7 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r3 = "%01d:%02d:%02d:%02d"
            byte[] r3 = m31325h(r12, r7, r3)
            r7 = 21
        L_0x00aa:
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r4, r11, r7, r8)
            bj.r r3 = r0.f40951k
            int r3 = r3.f30987b
        L_0x00b2:
            bj.r r4 = r0.f40951k
            int r7 = r4.f30988c
            if (r3 >= r7) goto L_0x00c5
            byte[] r7 = r4.f30986a
            byte r7 = r7[r3]
            if (r7 != 0) goto L_0x00c2
            r4.mo46934y(r3)
            goto L_0x00c5
        L_0x00c2:
            int r3 = r3 + 1
            goto L_0x00b2
        L_0x00c5:
            ph.v r3 = r1.f40991X
            bj.r r4 = r0.f40951k
            int r7 = r4.f30988c
            r3.mo69899d(r7, r4)
            bj.r r3 = r0.f40951k
            int r3 = r3.f30988c
            int r3 = r21 + r3
        L_0x00d4:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r4 = r4 & r2
            if (r4 == 0) goto L_0x00ec
            int r4 = r0.f40924K
            if (r4 <= r5) goto L_0x00e2
            r4 = -268435457(0xffffffffefffffff, float:-1.5845632E29)
            r2 = r2 & r4
            goto L_0x00ec
        L_0x00e2:
            bj.r r4 = r0.f40954n
            int r7 = r4.f30988c
            ph.v r8 = r1.f40991X
            r8.mo47755f(r4, r7)
            int r3 = r3 + r7
        L_0x00ec:
            r11 = r2
            r12 = r3
            ph.v r8 = r1.f40991X
            ph.v$a r14 = r1.f41002j
            r9 = r18
            r13 = r22
            r8.mo47754c(r9, r11, r12, r13, r14)
        L_0x00f9:
            r0.f40919F = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p685uh.C18577d.mo70077g(uh.d$b, long, int, int, int):void");
    }

    /* renamed from: i */
    public final void mo70078i(C18346e eVar, int i) throws IOException {
        C14077r rVar = this.f40947g;
        if (rVar.f30988c < i) {
            byte[] bArr = rVar.f30986a;
            if (bArr.length < i) {
                rVar.mo46910a(Math.max(bArr.length * 2, i));
            }
            C14077r rVar2 = this.f40947g;
            byte[] bArr2 = rVar2.f30986a;
            int i2 = rVar2.f30988c;
            eVar.mo69874g(bArr2, i2, i - i2, false);
            this.f40947g.mo46934y(i);
        }
    }

    /* renamed from: j */
    public final void mo70079j() {
        this.f40931R = 0;
        this.f40932S = 0;
        this.f40933T = 0;
        this.f40934U = false;
        this.f40935V = false;
        this.f40936W = false;
        this.f40937X = 0;
        this.f40938Y = 0;
        this.f40939Z = false;
        this.f40950j.mo46932w(0);
    }

    /* renamed from: k */
    public final long mo70080k(long j) throws ParserException {
        long j2 = this.f40958r;
        if (j2 != -9223372036854775807L) {
            return C14049b0.m21625F(j, j2, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:93:0x0223  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo70081l(int r12, p644ph.C18346e r13, p685uh.C18577d.C18579b r14) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = r14.f40994b
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            byte[] r14 = f40909b0
            r11.mo70082m(r13, r14, r12)
            int r12 = r11.f40932S
            r11.mo70079j()
            return r12
        L_0x0015:
            java.lang.String r0 = r14.f40994b
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002a
            byte[] r14 = f40911d0
            r11.mo70082m(r13, r14, r12)
            int r12 = r11.f40932S
            r11.mo70079j()
            return r12
        L_0x002a:
            ph.v r0 = r14.f40991X
            boolean r1 = r11.f40934U
            r2 = 4
            r3 = 2
            r4 = 8
            r5 = 1
            r6 = 0
            if (r1 != 0) goto L_0x01af
            boolean r1 = r14.f41000h
            if (r1 == 0) goto L_0x0167
            int r1 = r11.f40928O
            r7 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r7
            r11.f40928O = r1
            boolean r1 = r11.f40935V
            r7 = 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x006b
            bj.r r1 = r11.f40947g
            byte[] r1 = r1.f30986a
            r13.mo69874g(r1, r6, r5, r6)
            int r1 = r11.f40931R
            int r1 = r1 + r5
            r11.f40931R = r1
            bj.r r1 = r11.f40947g
            byte[] r1 = r1.f30986a
            byte r1 = r1[r6]
            r8 = r1 & 128(0x80, float:1.794E-43)
            if (r8 == r7) goto L_0x0063
            r11.f40938Y = r1
            r11.f40935V = r5
            goto L_0x006b
        L_0x0063:
            com.google.android.exoplayer2.ParserException r12 = new com.google.android.exoplayer2.ParserException
            java.lang.String r13 = "Extension bit is set in signal byte"
            r12.<init>((java.lang.String) r13)
            throw r12
        L_0x006b:
            byte r1 = r11.f40938Y
            r8 = r1 & 1
            if (r8 != r5) goto L_0x0073
            r8 = r5
            goto L_0x0074
        L_0x0073:
            r8 = r6
        L_0x0074:
            if (r8 == 0) goto L_0x0171
            r1 = r1 & r3
            if (r1 != r3) goto L_0x007b
            r1 = r5
            goto L_0x007c
        L_0x007b:
            r1 = r6
        L_0x007c:
            int r8 = r11.f40928O
            r9 = 1073741824(0x40000000, float:2.0)
            r8 = r8 | r9
            r11.f40928O = r8
            boolean r8 = r11.f40939Z
            if (r8 != 0) goto L_0x00bd
            bj.r r8 = r11.f40952l
            byte[] r8 = r8.f30986a
            r13.mo69874g(r8, r6, r4, r6)
            int r8 = r11.f40931R
            int r8 = r8 + r4
            r11.f40931R = r8
            r11.f40939Z = r5
            bj.r r8 = r11.f40947g
            byte[] r9 = r8.f30986a
            if (r1 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r7 = r6
        L_0x009d:
            r7 = r7 | r4
            byte r7 = (byte) r7
            r9[r6] = r7
            r8.mo46935z(r6)
            bj.r r7 = r11.f40947g
            r0.mo47755f(r7, r5)
            int r7 = r11.f40932S
            int r7 = r7 + r5
            r11.f40932S = r7
            bj.r r7 = r11.f40952l
            r7.mo46935z(r6)
            bj.r r7 = r11.f40952l
            r0.mo47755f(r7, r4)
            int r7 = r11.f40932S
            int r7 = r7 + r4
            r11.f40932S = r7
        L_0x00bd:
            if (r1 == 0) goto L_0x0171
            boolean r1 = r11.f40936W
            if (r1 != 0) goto L_0x00de
            bj.r r1 = r11.f40947g
            byte[] r1 = r1.f30986a
            r13.mo69874g(r1, r6, r5, r6)
            int r1 = r11.f40931R
            int r1 = r1 + r5
            r11.f40931R = r1
            bj.r r1 = r11.f40947g
            r1.mo46935z(r6)
            bj.r r1 = r11.f40947g
            int r1 = r1.mo46925p()
            r11.f40937X = r1
            r11.f40936W = r5
        L_0x00de:
            int r1 = r11.f40937X
            int r1 = r1 * r2
            bj.r r7 = r11.f40947g
            r7.mo46932w(r1)
            bj.r r7 = r11.f40947g
            byte[] r7 = r7.f30986a
            r13.mo69874g(r7, r6, r1, r6)
            int r7 = r11.f40931R
            int r7 = r7 + r1
            r11.f40931R = r7
            int r1 = r11.f40937X
            int r1 = r1 / r3
            int r1 = r1 + r5
            short r1 = (short) r1
            int r7 = r1 * 6
            int r7 = r7 + r3
            java.nio.ByteBuffer r8 = r11.f40955o
            if (r8 == 0) goto L_0x0104
            int r8 = r8.capacity()
            if (r8 >= r7) goto L_0x010a
        L_0x0104:
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r7)
            r11.f40955o = r8
        L_0x010a:
            java.nio.ByteBuffer r8 = r11.f40955o
            r8.position(r6)
            java.nio.ByteBuffer r8 = r11.f40955o
            r8.putShort(r1)
            r1 = r6
            r8 = r1
        L_0x0116:
            int r9 = r11.f40937X
            if (r1 >= r9) goto L_0x0138
            bj.r r9 = r11.f40947g
            int r9 = r9.mo46928s()
            int r10 = r1 % 2
            if (r10 != 0) goto L_0x012d
            java.nio.ByteBuffer r10 = r11.f40955o
            int r8 = r9 - r8
            short r8 = (short) r8
            r10.putShort(r8)
            goto L_0x0134
        L_0x012d:
            java.nio.ByteBuffer r10 = r11.f40955o
            int r8 = r9 - r8
            r10.putInt(r8)
        L_0x0134:
            int r1 = r1 + 1
            r8 = r9
            goto L_0x0116
        L_0x0138:
            int r1 = r11.f40931R
            int r1 = r12 - r1
            int r1 = r1 - r8
            int r9 = r9 % r3
            if (r9 != r5) goto L_0x0146
            java.nio.ByteBuffer r8 = r11.f40955o
            r8.putInt(r1)
            goto L_0x0151
        L_0x0146:
            java.nio.ByteBuffer r8 = r11.f40955o
            short r1 = (short) r1
            r8.putShort(r1)
            java.nio.ByteBuffer r1 = r11.f40955o
            r1.putInt(r6)
        L_0x0151:
            bj.r r1 = r11.f40953m
            java.nio.ByteBuffer r8 = r11.f40955o
            byte[] r8 = r8.array()
            r1.mo46933x(r7, r8)
            bj.r r1 = r11.f40953m
            r0.mo47755f(r1, r7)
            int r1 = r11.f40932S
            int r1 = r1 + r7
            r11.f40932S = r1
            goto L_0x0171
        L_0x0167:
            byte[] r1 = r14.f41001i
            if (r1 == 0) goto L_0x0171
            bj.r r7 = r11.f40950j
            int r8 = r1.length
            r7.mo46933x(r8, r1)
        L_0x0171:
            int r1 = r14.f40998f
            if (r1 <= 0) goto L_0x01ad
            int r1 = r11.f40928O
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 | r7
            r11.f40928O = r1
            bj.r r1 = r11.f40954n
            r1.mo46932w(r6)
            bj.r r1 = r11.f40947g
            r1.mo46932w(r2)
            bj.r r1 = r11.f40947g
            byte[] r7 = r1.f30986a
            int r8 = r12 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r7[r6] = r8
            int r8 = r12 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r7[r5] = r8
            int r8 = r12 >> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r7[r3] = r8
            r8 = 3
            r9 = r12 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r7[r8] = r9
            r0.mo47755f(r1, r2)
            int r1 = r11.f40932S
            int r1 = r1 + r2
            r11.f40932S = r1
        L_0x01ad:
            r11.f40934U = r5
        L_0x01af:
            bj.r r1 = r11.f40950j
            int r1 = r1.f30988c
            int r12 = r12 + r1
            java.lang.String r1 = r14.f40994b
            java.lang.String r7 = "V_MPEG4/ISO/AVC"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x024d
            java.lang.String r1 = r14.f40994b
            java.lang.String r7 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x01ca
            goto L_0x024d
        L_0x01ca:
            uh.d$c r1 = r14.f40987T
            if (r1 == 0) goto L_0x0225
            bj.r r1 = r11.f40950j
            int r1 = r1.f30988c
            if (r1 != 0) goto L_0x01d6
            r1 = r5
            goto L_0x01d7
        L_0x01d6:
            r1 = r6
        L_0x01d7:
            p513bj.C14075p.m21694f(r1)
            uh.d$c r1 = r14.f40987T
            boolean r3 = r1.f41020b
            if (r3 == 0) goto L_0x01e1
            goto L_0x0225
        L_0x01e1:
            byte[] r3 = r1.f41019a
            r7 = 10
            r13.mo69872c(r3, r6, r7, r6)
            r13.f40296f = r6
            byte[] r3 = r1.f41019a
            byte r7 = r3[r2]
            r8 = -8
            if (r7 != r8) goto L_0x021f
            r7 = 5
            byte r7 = r3[r7]
            r8 = 114(0x72, float:1.6E-43)
            if (r7 != r8) goto L_0x021f
            r7 = 6
            byte r7 = r3[r7]
            r8 = 111(0x6f, float:1.56E-43)
            if (r7 != r8) goto L_0x021f
            r7 = 7
            byte r8 = r3[r7]
            r9 = r8 & 254(0xfe, float:3.56E-43)
            r10 = 186(0xba, float:2.6E-43)
            if (r9 == r10) goto L_0x0209
            goto L_0x021f
        L_0x0209:
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 187(0xbb, float:2.62E-43)
            if (r8 != r9) goto L_0x0211
            r8 = r5
            goto L_0x0212
        L_0x0211:
            r8 = r6
        L_0x0212:
            r9 = 40
            if (r8 == 0) goto L_0x0218
            r4 = 9
        L_0x0218:
            byte r3 = r3[r4]
            int r3 = r3 >> r2
            r3 = r3 & r7
            int r3 = r9 << r3
            goto L_0x0220
        L_0x021f:
            r3 = r6
        L_0x0220:
            if (r3 != 0) goto L_0x0223
            goto L_0x0225
        L_0x0223:
            r1.f41020b = r5
        L_0x0225:
            int r1 = r11.f40931R
            if (r1 >= r12) goto L_0x02c5
            int r1 = r12 - r1
            bj.r r3 = r11.f40950j
            int r4 = r3.f30988c
            int r3 = r3.f30987b
            int r4 = r4 - r3
            if (r4 <= 0) goto L_0x023e
            int r1 = java.lang.Math.min(r1, r4)
            bj.r r3 = r11.f40950j
            r0.mo69899d(r1, r3)
            goto L_0x0242
        L_0x023e:
            int r1 = r0.mo69900e(r13, r1, r6)
        L_0x0242:
            int r3 = r11.f40931R
            int r3 = r3 + r1
            r11.f40931R = r3
            int r3 = r11.f40932S
            int r3 = r3 + r1
            r11.f40932S = r3
            goto L_0x0225
        L_0x024d:
            bj.r r1 = r11.f40946f
            byte[] r1 = r1.f30986a
            r1[r6] = r6
            r1[r5] = r6
            r1[r3] = r6
            int r3 = r14.f40992Y
            int r4 = 4 - r3
        L_0x025b:
            int r5 = r11.f40931R
            if (r5 >= r12) goto L_0x02c5
            int r5 = r11.f40933T
            if (r5 != 0) goto L_0x029e
            bj.r r5 = r11.f40950j
            int r7 = r5.f30988c
            int r5 = r5.f30987b
            int r7 = r7 - r5
            int r5 = java.lang.Math.min(r3, r7)
            int r7 = r4 + r5
            int r8 = r3 - r5
            r13.mo69874g(r1, r7, r8, r6)
            if (r5 <= 0) goto L_0x027c
            bj.r r7 = r11.f40950j
            r7.mo46911b(r4, r5, r1)
        L_0x027c:
            int r5 = r11.f40931R
            int r5 = r5 + r3
            r11.f40931R = r5
            bj.r r5 = r11.f40946f
            r5.mo46935z(r6)
            bj.r r5 = r11.f40946f
            int r5 = r5.mo46928s()
            r11.f40933T = r5
            bj.r r5 = r11.f40945e
            r5.mo46935z(r6)
            bj.r r5 = r11.f40945e
            r0.mo69899d(r2, r5)
            int r5 = r11.f40932S
            int r5 = r5 + r2
            r11.f40932S = r5
            goto L_0x025b
        L_0x029e:
            bj.r r7 = r11.f40950j
            int r8 = r7.f30988c
            int r7 = r7.f30987b
            int r8 = r8 - r7
            if (r8 <= 0) goto L_0x02b1
            int r5 = java.lang.Math.min(r5, r8)
            bj.r r7 = r11.f40950j
            r0.mo69899d(r5, r7)
            goto L_0x02b5
        L_0x02b1:
            int r5 = r0.mo69900e(r13, r5, r6)
        L_0x02b5:
            int r7 = r11.f40931R
            int r7 = r7 + r5
            r11.f40931R = r7
            int r7 = r11.f40932S
            int r7 = r7 + r5
            r11.f40932S = r7
            int r7 = r11.f40933T
            int r7 = r7 - r5
            r11.f40933T = r7
            goto L_0x025b
        L_0x02c5:
            java.lang.String r12 = r14.f40994b
            java.lang.String r13 = "A_VORBIS"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x02de
            bj.r r12 = r11.f40948h
            r12.mo46935z(r6)
            bj.r r12 = r11.f40948h
            r0.mo69899d(r2, r12)
            int r12 = r11.f40932S
            int r12 = r12 + r2
            r11.f40932S = r12
        L_0x02de:
            int r12 = r11.f40932S
            r11.mo70079j()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p685uh.C18577d.mo70081l(int, ph.e, uh.d$b):int");
    }

    /* renamed from: m */
    public final void mo70082m(C18346e eVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        C14077r rVar = this.f40951k;
        byte[] bArr2 = rVar.f30986a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            rVar.mo46933x(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        eVar.mo69874g(this.f40951k.f30986a, bArr.length, i, false);
        this.f40951k.mo46935z(0);
        this.f40951k.mo46934y(length);
    }

    public final void release() {
    }
}
