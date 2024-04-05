package p520cj;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import androidx.profileinstaller.C3067i;
import com.braze.p044ui.inappmessage.views.C5699e;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.cart.clicklisteners.C9272c;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import com.facebook.login.LoginStatusClient;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.C14242b;
import com.google.android.exoplayer2.mediacodec.C14246c;
import com.google.android.exoplayer2.mediacodec.C14247d;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DummySurface;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.google.android.play.core.assetpacks.C15588c1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p003a2.C0023f;
import p030bo.app.C3673f7;
import p114g4.C6868h;
import p427qb.C13281a;
import p504ai.C13988n;
import p513bj.C14049b0;
import p513bj.C14065m;
import p513bj.C14075p;
import p520cj.C14155i;
import p520cj.C14164p;
import p594jh.C17921i1;
import p594jh.C17948m0;
import p619mh.C18223d;
import p619mh.C18224e;
import p635oh.C18292b;
import p635oh.C18293c;

/* renamed from: cj.e */
public final class C14149e extends MediaCodecRenderer {

    /* renamed from: p2 */
    public static final int[] f31182p2 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: q2 */
    public static boolean f31183q2;

    /* renamed from: r2 */
    public static boolean f31184r2;

    /* renamed from: G1 */
    public final Context f31185G1;

    /* renamed from: H1 */
    public final C14155i f31186H1;

    /* renamed from: I1 */
    public final C14164p.C14165a f31187I1;

    /* renamed from: J1 */
    public final long f31188J1 = LoginStatusClient.DEFAULT_TOAST_DURATION_MS;

    /* renamed from: K1 */
    public final int f31189K1 = 50;

    /* renamed from: L1 */
    public final boolean f31190L1;

    /* renamed from: M1 */
    public C14150a f31191M1;

    /* renamed from: N1 */
    public boolean f31192N1;

    /* renamed from: O1 */
    public boolean f31193O1;

    /* renamed from: P1 */
    public Surface f31194P1;

    /* renamed from: Q1 */
    public DummySurface f31195Q1;

    /* renamed from: R1 */
    public boolean f31196R1;

    /* renamed from: S1 */
    public int f31197S1;

    /* renamed from: T1 */
    public boolean f31198T1;

    /* renamed from: U1 */
    public boolean f31199U1;

    /* renamed from: V1 */
    public boolean f31200V1;

    /* renamed from: W1 */
    public long f31201W1;

    /* renamed from: X1 */
    public long f31202X1;

    /* renamed from: Y1 */
    public long f31203Y1;

    /* renamed from: Z1 */
    public int f31204Z1;

    /* renamed from: a2 */
    public int f31205a2;

    /* renamed from: b2 */
    public int f31206b2;

    /* renamed from: c2 */
    public long f31207c2;

    /* renamed from: d2 */
    public long f31208d2;

    /* renamed from: e2 */
    public long f31209e2;

    /* renamed from: f2 */
    public int f31210f2;

    /* renamed from: g2 */
    public int f31211g2;

    /* renamed from: h2 */
    public int f31212h2;

    /* renamed from: i2 */
    public int f31213i2;

    /* renamed from: j2 */
    public float f31214j2;

    /* renamed from: k2 */
    public C14166q f31215k2;

    /* renamed from: l2 */
    public boolean f31216l2;

    /* renamed from: m2 */
    public int f31217m2;

    /* renamed from: n2 */
    public C14151b f31218n2;

    /* renamed from: o2 */
    public C14154h f31219o2;

    /* renamed from: cj.e$a */
    public static final class C14150a {

        /* renamed from: a */
        public final int f31220a;

        /* renamed from: b */
        public final int f31221b;

        /* renamed from: c */
        public final int f31222c;

        public C14150a(int i, int i2, int i3) {
            this.f31220a = i;
            this.f31221b = i2;
            this.f31222c = i3;
        }
    }

    /* renamed from: cj.e$b */
    public final class C14151b implements C14242b.C14245c, Handler.Callback {

        /* renamed from: b */
        public final Handler f31223b;

        public C14151b(C14242b bVar) {
            Handler l = C14049b0.m21639l(this);
            this.f31223b = l;
            bVar.mo47382b(this, l);
        }

        /* renamed from: a */
        public final void mo47082a(long j) {
            C14149e eVar = C14149e.this;
            if (this == eVar.f31218n2) {
                if (j == Long.MAX_VALUE) {
                    eVar.f31662w1 = true;
                    return;
                }
                try {
                    eVar.mo47360Q(j);
                    eVar.mo47053Y();
                    eVar.f31599B1.getClass();
                    eVar.mo47052X();
                    eVar.mo47043A(j);
                } catch (ExoPlaybackException e) {
                    C14149e.this.f31597A1 = e;
                }
            }
        }

        /* renamed from: b */
        public final void mo47083b(long j) {
            if (C14049b0.f30913a < 30) {
                this.f31223b.sendMessageAtFrontOfQueue(Message.obtain(this.f31223b, 0, (int) (j >> 32), (int) j));
                return;
            }
            mo47082a(j);
        }

        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            int i3 = C14049b0.f30913a;
            mo47082a(((((long) i) & UnsignedInteger.INT_MASK) << 32) | (UnsignedInteger.INT_MASK & ((long) i2)));
            return true;
        }
    }

    public C14149e(Context context, Handler handler, C17921i1.C17923b bVar) {
        super(2, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f31185G1 = applicationContext;
        this.f31186H1 = new C14155i(applicationContext);
        this.f31187I1 = new C14164p.C14165a(handler, bVar);
        this.f31190L1 = "NVIDIA".equals(C14049b0.f30915c);
        this.f31202X1 = -9223372036854775807L;
        this.f31211g2 = -1;
        this.f31212h2 = -1;
        this.f31214j2 = -1.0f;
        this.f31197S1 = 1;
        this.f31217m2 = 0;
        this.f31215k2 = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x07dc, code lost:
        if (r1.equals("NX573J") == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x083e, code lost:
        if (r1.equals("AFTN") == false) goto L_0x0836;
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m21905S(java.lang.String r13) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r13 = r13.startsWith(r0)
            r0 = 0
            if (r13 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<cj.e> r13 = p520cj.C14149e.class
            monitor-enter(r13)
            boolean r1 = f31183q2     // Catch:{ all -> 0x0863 }
            if (r1 != 0) goto L_0x085f
            int r1 = p513bj.C14049b0.f30913a     // Catch:{ all -> 0x0863 }
            r2 = 6
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 28
            r7 = 2
            r8 = -1
            r9 = 1
            if (r1 > r6) goto L_0x007b
            java.lang.String r10 = p513bj.C14049b0.f30914b     // Catch:{ all -> 0x0863 }
            r10.getClass()     // Catch:{ all -> 0x0863 }
            int r11 = r10.hashCode()
            switch(r11) {
                case -1339091551: goto L_0x006e;
                case -1220081023: goto L_0x0063;
                case -1220066608: goto L_0x0058;
                case -1012436106: goto L_0x004d;
                case -64886864: goto L_0x0042;
                case 3415681: goto L_0x0037;
                case 825323514: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r10 = r8
            goto L_0x0078
        L_0x002c:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0035
            goto L_0x002a
        L_0x0035:
            r10 = r2
            goto L_0x0078
        L_0x0037:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0040
            goto L_0x002a
        L_0x0040:
            r10 = r3
            goto L_0x0078
        L_0x0042:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x004b
            goto L_0x002a
        L_0x004b:
            r10 = r4
            goto L_0x0078
        L_0x004d:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0056
            goto L_0x002a
        L_0x0056:
            r10 = r5
            goto L_0x0078
        L_0x0058:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0061
            goto L_0x002a
        L_0x0061:
            r10 = r7
            goto L_0x0078
        L_0x0063:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x006c
            goto L_0x002a
        L_0x006c:
            r10 = r9
            goto L_0x0078
        L_0x006e:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0077
            goto L_0x002a
        L_0x0077:
            r10 = r0
        L_0x0078:
            switch(r10) {
                case 0: goto L_0x085a;
                case 1: goto L_0x085a;
                case 2: goto L_0x085a;
                case 3: goto L_0x085a;
                case 4: goto L_0x085a;
                case 5: goto L_0x085a;
                case 6: goto L_0x085a;
                default: goto L_0x007b;
            }
        L_0x007b:
            r10 = 27
            if (r1 > r10) goto L_0x008b
            java.lang.String r11 = p513bj.C14049b0.f30914b     // Catch:{ all -> 0x0863 }
            java.lang.String r12 = "HWEML"
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0863 }
            if (r11 == 0) goto L_0x008b
            goto L_0x085a
        L_0x008b:
            r11 = 26
            if (r1 > r11) goto L_0x085b
            java.lang.String r1 = p513bj.C14049b0.f30914b     // Catch:{ all -> 0x0863 }
            r1.getClass()     // Catch:{ all -> 0x0863 }
            int r12 = r1.hashCode()
            switch(r12) {
                case -2144781245: goto L_0x081c;
                case -2144781185: goto L_0x0810;
                case -2144781160: goto L_0x0804;
                case -2097309513: goto L_0x07f8;
                case -2022874474: goto L_0x07ec;
                case -1978993182: goto L_0x07e0;
                case -1978990237: goto L_0x07d6;
                case -1936688988: goto L_0x07ca;
                case -1936688066: goto L_0x07bc;
                case -1936688065: goto L_0x07ae;
                case -1931988508: goto L_0x07a0;
                case -1885099851: goto L_0x0792;
                case -1696512866: goto L_0x0784;
                case -1680025915: goto L_0x0776;
                case -1615810839: goto L_0x0768;
                case -1600724499: goto L_0x075a;
                case -1554255044: goto L_0x074c;
                case -1481772737: goto L_0x073e;
                case -1481772730: goto L_0x0730;
                case -1481772729: goto L_0x0722;
                case -1320080169: goto L_0x0714;
                case -1217592143: goto L_0x0706;
                case -1180384755: goto L_0x06f8;
                case -1139198265: goto L_0x06ea;
                case -1052835013: goto L_0x06dc;
                case -993250464: goto L_0x06ce;
                case -993250458: goto L_0x06c1;
                case -965403638: goto L_0x06b4;
                case -958336948: goto L_0x06a7;
                case -879245230: goto L_0x0699;
                case -842500323: goto L_0x068b;
                case -821392978: goto L_0x067d;
                case -797483286: goto L_0x066f;
                case -794946968: goto L_0x0661;
                case -788334647: goto L_0x0653;
                case -782144577: goto L_0x0645;
                case -575125681: goto L_0x0637;
                case -521118391: goto L_0x0629;
                case -430914369: goto L_0x061b;
                case -290434366: goto L_0x060d;
                case -282781963: goto L_0x05ff;
                case -277133239: goto L_0x05f1;
                case -173639913: goto L_0x05e3;
                case -56598463: goto L_0x05d5;
                case 2126: goto L_0x05c7;
                case 2564: goto L_0x05b9;
                case 2715: goto L_0x05ab;
                case 2719: goto L_0x059d;
                case 3091: goto L_0x058f;
                case 3483: goto L_0x0581;
                case 73405: goto L_0x0573;
                case 75537: goto L_0x0565;
                case 75739: goto L_0x0557;
                case 76779: goto L_0x0549;
                case 78669: goto L_0x053b;
                case 79305: goto L_0x052d;
                case 80618: goto L_0x051f;
                case 88274: goto L_0x0511;
                case 98846: goto L_0x0503;
                case 98848: goto L_0x04f5;
                case 99329: goto L_0x04e7;
                case 101481: goto L_0x04d9;
                case 1513190: goto L_0x04cb;
                case 1514184: goto L_0x04bd;
                case 1514185: goto L_0x04af;
                case 2133089: goto L_0x04a1;
                case 2133091: goto L_0x0493;
                case 2133120: goto L_0x0485;
                case 2133151: goto L_0x0477;
                case 2133182: goto L_0x0469;
                case 2133184: goto L_0x045b;
                case 2436959: goto L_0x044d;
                case 2463773: goto L_0x043f;
                case 2464648: goto L_0x0431;
                case 2689555: goto L_0x0423;
                case 3154429: goto L_0x0415;
                case 3284551: goto L_0x0407;
                case 3351335: goto L_0x03f9;
                case 3386211: goto L_0x03eb;
                case 41325051: goto L_0x03dd;
                case 51349633: goto L_0x03cf;
                case 51350594: goto L_0x03c1;
                case 55178625: goto L_0x03b3;
                case 61542055: goto L_0x03a5;
                case 65355429: goto L_0x0397;
                case 66214468: goto L_0x0389;
                case 66214470: goto L_0x037b;
                case 66214473: goto L_0x036d;
                case 66215429: goto L_0x035f;
                case 66215431: goto L_0x0351;
                case 66215433: goto L_0x0343;
                case 66216390: goto L_0x0335;
                case 76402249: goto L_0x0327;
                case 76404105: goto L_0x0319;
                case 76404911: goto L_0x030b;
                case 80963634: goto L_0x02fd;
                case 82882791: goto L_0x02ef;
                case 98715550: goto L_0x02e1;
                case 101370885: goto L_0x02d3;
                case 102844228: goto L_0x02c5;
                case 165221241: goto L_0x02b7;
                case 182191441: goto L_0x02a9;
                case 245388979: goto L_0x029b;
                case 287431619: goto L_0x028d;
                case 307593612: goto L_0x027f;
                case 308517133: goto L_0x0271;
                case 316215098: goto L_0x0263;
                case 316215116: goto L_0x0255;
                case 316246811: goto L_0x0247;
                case 316246818: goto L_0x0239;
                case 407160593: goto L_0x022b;
                case 507412548: goto L_0x021d;
                case 793982701: goto L_0x020f;
                case 794038622: goto L_0x0201;
                case 794040393: goto L_0x01f3;
                case 835649806: goto L_0x01e5;
                case 917340916: goto L_0x01d7;
                case 958008161: goto L_0x01c9;
                case 1060579533: goto L_0x01bb;
                case 1150207623: goto L_0x01ad;
                case 1176899427: goto L_0x019f;
                case 1280332038: goto L_0x0191;
                case 1306947716: goto L_0x0183;
                case 1349174697: goto L_0x0175;
                case 1522194893: goto L_0x0167;
                case 1691543273: goto L_0x0159;
                case 1691544261: goto L_0x014b;
                case 1709443163: goto L_0x013d;
                case 1865889110: goto L_0x012f;
                case 1906253259: goto L_0x0121;
                case 1977196784: goto L_0x0113;
                case 2006372676: goto L_0x0106;
                case 2019281702: goto L_0x00f9;
                case 2029784656: goto L_0x00ec;
                case 2030379515: goto L_0x00df;
                case 2033393791: goto L_0x00d2;
                case 2047190025: goto L_0x00c5;
                case 2047252157: goto L_0x00b8;
                case 2048319463: goto L_0x00ab;
                case 2048855701: goto L_0x009e;
                default: goto L_0x009b;
            }
        L_0x009b:
            r2 = r8
            goto L_0x0827
        L_0x009e:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a7
            goto L_0x009b
        L_0x00a7:
            r2 = 139(0x8b, float:1.95E-43)
            goto L_0x0827
        L_0x00ab:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00b4
            goto L_0x009b
        L_0x00b4:
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x0827
        L_0x00b8:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00c1
            goto L_0x009b
        L_0x00c1:
            r2 = 137(0x89, float:1.92E-43)
            goto L_0x0827
        L_0x00c5:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ce
            goto L_0x009b
        L_0x00ce:
            r2 = 136(0x88, float:1.9E-43)
            goto L_0x0827
        L_0x00d2:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00db
            goto L_0x009b
        L_0x00db:
            r2 = 135(0x87, float:1.89E-43)
            goto L_0x0827
        L_0x00df:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00e8
            goto L_0x009b
        L_0x00e8:
            r2 = 134(0x86, float:1.88E-43)
            goto L_0x0827
        L_0x00ec:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f5
            goto L_0x009b
        L_0x00f5:
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x0827
        L_0x00f9:
            java.lang.String r2 = "DM-01K"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0102
            goto L_0x009b
        L_0x0102:
            r2 = 132(0x84, float:1.85E-43)
            goto L_0x0827
        L_0x0106:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010f
            goto L_0x009b
        L_0x010f:
            r2 = 131(0x83, float:1.84E-43)
            goto L_0x0827
        L_0x0113:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x011d
            goto L_0x009b
        L_0x011d:
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0827
        L_0x0121:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012b
            goto L_0x009b
        L_0x012b:
            r2 = 129(0x81, float:1.81E-43)
            goto L_0x0827
        L_0x012f:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0139
            goto L_0x009b
        L_0x0139:
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x0827
        L_0x013d:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0147
            goto L_0x009b
        L_0x0147:
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x0827
        L_0x014b:
            java.lang.String r2 = "CPH1715"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0155
            goto L_0x009b
        L_0x0155:
            r2 = 126(0x7e, float:1.77E-43)
            goto L_0x0827
        L_0x0159:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0163
            goto L_0x009b
        L_0x0163:
            r2 = 125(0x7d, float:1.75E-43)
            goto L_0x0827
        L_0x0167:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0171
            goto L_0x009b
        L_0x0171:
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x0827
        L_0x0175:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x017f
            goto L_0x009b
        L_0x017f:
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0827
        L_0x0183:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x018d
            goto L_0x009b
        L_0x018d:
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0827
        L_0x0191:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x019b
            goto L_0x009b
        L_0x019b:
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0827
        L_0x019f:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01a9
            goto L_0x009b
        L_0x01a9:
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0827
        L_0x01ad:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01b7
            goto L_0x009b
        L_0x01b7:
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0827
        L_0x01bb:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01c5
            goto L_0x009b
        L_0x01c5:
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0827
        L_0x01c9:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01d3
            goto L_0x009b
        L_0x01d3:
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0827
        L_0x01d7:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01e1
            goto L_0x009b
        L_0x01e1:
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0827
        L_0x01e5:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01ef
            goto L_0x009b
        L_0x01ef:
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0827
        L_0x01f3:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01fd
            goto L_0x009b
        L_0x01fd:
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0827
        L_0x0201:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x020b
            goto L_0x009b
        L_0x020b:
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0827
        L_0x020f:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0219
            goto L_0x009b
        L_0x0219:
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0827
        L_0x021d:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0227
            goto L_0x009b
        L_0x0227:
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0827
        L_0x022b:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0235
            goto L_0x009b
        L_0x0235:
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0827
        L_0x0239:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0243
            goto L_0x009b
        L_0x0243:
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0827
        L_0x0247:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0251
            goto L_0x009b
        L_0x0251:
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0827
        L_0x0255:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x025f
            goto L_0x009b
        L_0x025f:
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0827
        L_0x0263:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x026d
            goto L_0x009b
        L_0x026d:
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0827
        L_0x0271:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x027b
            goto L_0x009b
        L_0x027b:
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0827
        L_0x027f:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0289
            goto L_0x009b
        L_0x0289:
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0827
        L_0x028d:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0297
            goto L_0x009b
        L_0x0297:
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0827
        L_0x029b:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02a5
            goto L_0x009b
        L_0x02a5:
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0827
        L_0x02a9:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02b3
            goto L_0x009b
        L_0x02b3:
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0827
        L_0x02b7:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02c1
            goto L_0x009b
        L_0x02c1:
            r2 = 100
            goto L_0x0827
        L_0x02c5:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02cf
            goto L_0x009b
        L_0x02cf:
            r2 = 99
            goto L_0x0827
        L_0x02d3:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02dd
            goto L_0x009b
        L_0x02dd:
            r2 = 98
            goto L_0x0827
        L_0x02e1:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02eb
            goto L_0x009b
        L_0x02eb:
            r2 = 97
            goto L_0x0827
        L_0x02ef:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02f9
            goto L_0x009b
        L_0x02f9:
            r2 = 96
            goto L_0x0827
        L_0x02fd:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0307
            goto L_0x009b
        L_0x0307:
            r2 = 95
            goto L_0x0827
        L_0x030b:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0315
            goto L_0x009b
        L_0x0315:
            r2 = 94
            goto L_0x0827
        L_0x0319:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0323
            goto L_0x009b
        L_0x0323:
            r2 = 93
            goto L_0x0827
        L_0x0327:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0331
            goto L_0x009b
        L_0x0331:
            r2 = 92
            goto L_0x0827
        L_0x0335:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x033f
            goto L_0x009b
        L_0x033f:
            r2 = 91
            goto L_0x0827
        L_0x0343:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x034d
            goto L_0x009b
        L_0x034d:
            r2 = 90
            goto L_0x0827
        L_0x0351:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x035b
            goto L_0x009b
        L_0x035b:
            r2 = 89
            goto L_0x0827
        L_0x035f:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0369
            goto L_0x009b
        L_0x0369:
            r2 = 88
            goto L_0x0827
        L_0x036d:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0377
            goto L_0x009b
        L_0x0377:
            r2 = 87
            goto L_0x0827
        L_0x037b:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0385
            goto L_0x009b
        L_0x0385:
            r2 = 86
            goto L_0x0827
        L_0x0389:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0393
            goto L_0x009b
        L_0x0393:
            r2 = 85
            goto L_0x0827
        L_0x0397:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03a1
            goto L_0x009b
        L_0x03a1:
            r2 = 84
            goto L_0x0827
        L_0x03a5:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03af
            goto L_0x009b
        L_0x03af:
            r2 = 83
            goto L_0x0827
        L_0x03b3:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03bd
            goto L_0x009b
        L_0x03bd:
            r2 = 82
            goto L_0x0827
        L_0x03c1:
            java.lang.String r2 = "602LV"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03cb
            goto L_0x009b
        L_0x03cb:
            r2 = 81
            goto L_0x0827
        L_0x03cf:
            java.lang.String r2 = "601LV"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03d9
            goto L_0x009b
        L_0x03d9:
            r2 = 80
            goto L_0x0827
        L_0x03dd:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03e7
            goto L_0x009b
        L_0x03e7:
            r2 = 79
            goto L_0x0827
        L_0x03eb:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x03f5
            goto L_0x009b
        L_0x03f5:
            r2 = 78
            goto L_0x0827
        L_0x03f9:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0403
            goto L_0x009b
        L_0x0403:
            r2 = 77
            goto L_0x0827
        L_0x0407:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0411
            goto L_0x009b
        L_0x0411:
            r2 = 76
            goto L_0x0827
        L_0x0415:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x041f
            goto L_0x009b
        L_0x041f:
            r2 = 75
            goto L_0x0827
        L_0x0423:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x042d
            goto L_0x009b
        L_0x042d:
            r2 = 74
            goto L_0x0827
        L_0x0431:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x043b
            goto L_0x009b
        L_0x043b:
            r2 = 73
            goto L_0x0827
        L_0x043f:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0449
            goto L_0x009b
        L_0x0449:
            r2 = 72
            goto L_0x0827
        L_0x044d:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0457
            goto L_0x009b
        L_0x0457:
            r2 = 71
            goto L_0x0827
        L_0x045b:
            java.lang.String r2 = "F04J"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0465
            goto L_0x009b
        L_0x0465:
            r2 = 70
            goto L_0x0827
        L_0x0469:
            java.lang.String r2 = "F04H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0473
            goto L_0x009b
        L_0x0473:
            r2 = 69
            goto L_0x0827
        L_0x0477:
            java.lang.String r2 = "F03H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0481
            goto L_0x009b
        L_0x0481:
            r2 = 68
            goto L_0x0827
        L_0x0485:
            java.lang.String r2 = "F02H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x048f
            goto L_0x009b
        L_0x048f:
            r2 = 67
            goto L_0x0827
        L_0x0493:
            java.lang.String r2 = "F01J"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x049d
            goto L_0x009b
        L_0x049d:
            r2 = 66
            goto L_0x0827
        L_0x04a1:
            java.lang.String r2 = "F01H"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04ab
            goto L_0x009b
        L_0x04ab:
            r2 = 65
            goto L_0x0827
        L_0x04af:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04b9
            goto L_0x009b
        L_0x04b9:
            r2 = 64
            goto L_0x0827
        L_0x04bd:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04c7
            goto L_0x009b
        L_0x04c7:
            r2 = 63
            goto L_0x0827
        L_0x04cb:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04d5
            goto L_0x009b
        L_0x04d5:
            r2 = 62
            goto L_0x0827
        L_0x04d9:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04e3
            goto L_0x009b
        L_0x04e3:
            r2 = 61
            goto L_0x0827
        L_0x04e7:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04f1
            goto L_0x009b
        L_0x04f1:
            r2 = 60
            goto L_0x0827
        L_0x04f5:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x04ff
            goto L_0x009b
        L_0x04ff:
            r2 = 59
            goto L_0x0827
        L_0x0503:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x050d
            goto L_0x009b
        L_0x050d:
            r2 = 58
            goto L_0x0827
        L_0x0511:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x051b
            goto L_0x009b
        L_0x051b:
            r2 = 57
            goto L_0x0827
        L_0x051f:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0529
            goto L_0x009b
        L_0x0529:
            r2 = 56
            goto L_0x0827
        L_0x052d:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0537
            goto L_0x009b
        L_0x0537:
            r2 = 55
            goto L_0x0827
        L_0x053b:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0545
            goto L_0x009b
        L_0x0545:
            r2 = 54
            goto L_0x0827
        L_0x0549:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0553
            goto L_0x009b
        L_0x0553:
            r2 = 53
            goto L_0x0827
        L_0x0557:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0561
            goto L_0x009b
        L_0x0561:
            r2 = 52
            goto L_0x0827
        L_0x0565:
            java.lang.String r2 = "M04"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x056f
            goto L_0x009b
        L_0x056f:
            r2 = 51
            goto L_0x0827
        L_0x0573:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x057d
            goto L_0x009b
        L_0x057d:
            r2 = 50
            goto L_0x0827
        L_0x0581:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x058b
            goto L_0x009b
        L_0x058b:
            r2 = 49
            goto L_0x0827
        L_0x058f:
            java.lang.String r2 = "b5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0599
            goto L_0x009b
        L_0x0599:
            r2 = 48
            goto L_0x0827
        L_0x059d:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x05a7
            goto L_0x009b
        L_0x05a7:
            r2 = 47
            goto L_0x0827
        L_0x05ab:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x05b5
            goto L_0x009b
        L_0x05b5:
            r2 = 46
            goto L_0x0827
        L_0x05b9:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x05c3
            goto L_0x009b
        L_0x05c3:
            r2 = 45
            goto L_0x0827
        L_0x05c7:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x05d1
            goto L_0x009b
        L_0x05d1:
            r2 = 44
            goto L_0x0827
        L_0x05d5:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x05df
            goto L_0x009b
        L_0x05df:
            r2 = 43
            goto L_0x0827
        L_0x05e3:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x05ed
            goto L_0x009b
        L_0x05ed:
            r2 = 42
            goto L_0x0827
        L_0x05f1:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x05fb
            goto L_0x009b
        L_0x05fb:
            r2 = 41
            goto L_0x0827
        L_0x05ff:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0609
            goto L_0x009b
        L_0x0609:
            r2 = 40
            goto L_0x0827
        L_0x060d:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0617
            goto L_0x009b
        L_0x0617:
            r2 = 39
            goto L_0x0827
        L_0x061b:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0625
            goto L_0x009b
        L_0x0625:
            r2 = 38
            goto L_0x0827
        L_0x0629:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0633
            goto L_0x009b
        L_0x0633:
            r2 = 37
            goto L_0x0827
        L_0x0637:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0641
            goto L_0x009b
        L_0x0641:
            r2 = 36
            goto L_0x0827
        L_0x0645:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x064f
            goto L_0x009b
        L_0x064f:
            r2 = 35
            goto L_0x0827
        L_0x0653:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x065d
            goto L_0x009b
        L_0x065d:
            r2 = 34
            goto L_0x0827
        L_0x0661:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x066b
            goto L_0x009b
        L_0x066b:
            r2 = 33
            goto L_0x0827
        L_0x066f:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0679
            goto L_0x009b
        L_0x0679:
            r2 = 32
            goto L_0x0827
        L_0x067d:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0687
            goto L_0x009b
        L_0x0687:
            r2 = 31
            goto L_0x0827
        L_0x068b:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0695
            goto L_0x009b
        L_0x0695:
            r2 = 30
            goto L_0x0827
        L_0x0699:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06a3
            goto L_0x009b
        L_0x06a3:
            r2 = 29
            goto L_0x0827
        L_0x06a7:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06b1
            goto L_0x009b
        L_0x06b1:
            r2 = r6
            goto L_0x0827
        L_0x06b4:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06be
            goto L_0x009b
        L_0x06be:
            r2 = r10
            goto L_0x0827
        L_0x06c1:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06cb
            goto L_0x009b
        L_0x06cb:
            r2 = r11
            goto L_0x0827
        L_0x06ce:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06d8
            goto L_0x009b
        L_0x06d8:
            r2 = 25
            goto L_0x0827
        L_0x06dc:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06e6
            goto L_0x009b
        L_0x06e6:
            r2 = 24
            goto L_0x0827
        L_0x06ea:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x06f4
            goto L_0x009b
        L_0x06f4:
            r2 = 23
            goto L_0x0827
        L_0x06f8:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0702
            goto L_0x009b
        L_0x0702:
            r2 = 22
            goto L_0x0827
        L_0x0706:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0710
            goto L_0x009b
        L_0x0710:
            r2 = 21
            goto L_0x0827
        L_0x0714:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x071e
            goto L_0x009b
        L_0x071e:
            r2 = 20
            goto L_0x0827
        L_0x0722:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x072c
            goto L_0x009b
        L_0x072c:
            r2 = 19
            goto L_0x0827
        L_0x0730:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x073a
            goto L_0x009b
        L_0x073a:
            r2 = 18
            goto L_0x0827
        L_0x073e:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0748
            goto L_0x009b
        L_0x0748:
            r2 = 17
            goto L_0x0827
        L_0x074c:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0756
            goto L_0x009b
        L_0x0756:
            r2 = 16
            goto L_0x0827
        L_0x075a:
            java.lang.String r2 = "pacificrim"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0764
            goto L_0x009b
        L_0x0764:
            r2 = 15
            goto L_0x0827
        L_0x0768:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0772
            goto L_0x009b
        L_0x0772:
            r2 = 14
            goto L_0x0827
        L_0x0776:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0780
            goto L_0x009b
        L_0x0780:
            r2 = 13
            goto L_0x0827
        L_0x0784:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x078e
            goto L_0x009b
        L_0x078e:
            r2 = 12
            goto L_0x0827
        L_0x0792:
            java.lang.String r2 = "RAIJIN"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x079c
            goto L_0x009b
        L_0x079c:
            r2 = 11
            goto L_0x0827
        L_0x07a0:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07aa
            goto L_0x009b
        L_0x07aa:
            r2 = 10
            goto L_0x0827
        L_0x07ae:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07b8
            goto L_0x009b
        L_0x07b8:
            r2 = 9
            goto L_0x0827
        L_0x07bc:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07c6
            goto L_0x009b
        L_0x07c6:
            r2 = 8
            goto L_0x0827
        L_0x07ca:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07d4
            goto L_0x009b
        L_0x07d4:
            r2 = 7
            goto L_0x0827
        L_0x07d6:
            java.lang.String r3 = "NX573J"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0827
            goto L_0x009b
        L_0x07e0:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07ea
            goto L_0x009b
        L_0x07ea:
            r2 = r3
            goto L_0x0827
        L_0x07ec:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x07f6
            goto L_0x009b
        L_0x07f6:
            r2 = r4
            goto L_0x0827
        L_0x07f8:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0802
            goto L_0x009b
        L_0x0802:
            r2 = r5
            goto L_0x0827
        L_0x0804:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x080e
            goto L_0x009b
        L_0x080e:
            r2 = r7
            goto L_0x0827
        L_0x0810:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x081a
            goto L_0x009b
        L_0x081a:
            r2 = r9
            goto L_0x0827
        L_0x081c:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0826
            goto L_0x009b
        L_0x0826:
            r2 = r0
        L_0x0827:
            switch(r2) {
                case 0: goto L_0x085a;
                case 1: goto L_0x085a;
                case 2: goto L_0x085a;
                case 3: goto L_0x085a;
                case 4: goto L_0x085a;
                case 5: goto L_0x085a;
                case 6: goto L_0x085a;
                case 7: goto L_0x085a;
                case 8: goto L_0x085a;
                case 9: goto L_0x085a;
                case 10: goto L_0x085a;
                case 11: goto L_0x085a;
                case 12: goto L_0x085a;
                case 13: goto L_0x085a;
                case 14: goto L_0x085a;
                case 15: goto L_0x085a;
                case 16: goto L_0x085a;
                case 17: goto L_0x085a;
                case 18: goto L_0x085a;
                case 19: goto L_0x085a;
                case 20: goto L_0x085a;
                case 21: goto L_0x085a;
                case 22: goto L_0x085a;
                case 23: goto L_0x085a;
                case 24: goto L_0x085a;
                case 25: goto L_0x085a;
                case 26: goto L_0x085a;
                case 27: goto L_0x085a;
                case 28: goto L_0x085a;
                case 29: goto L_0x085a;
                case 30: goto L_0x085a;
                case 31: goto L_0x085a;
                case 32: goto L_0x085a;
                case 33: goto L_0x085a;
                case 34: goto L_0x085a;
                case 35: goto L_0x085a;
                case 36: goto L_0x085a;
                case 37: goto L_0x085a;
                case 38: goto L_0x085a;
                case 39: goto L_0x085a;
                case 40: goto L_0x085a;
                case 41: goto L_0x085a;
                case 42: goto L_0x085a;
                case 43: goto L_0x085a;
                case 44: goto L_0x085a;
                case 45: goto L_0x085a;
                case 46: goto L_0x085a;
                case 47: goto L_0x085a;
                case 48: goto L_0x085a;
                case 49: goto L_0x085a;
                case 50: goto L_0x085a;
                case 51: goto L_0x085a;
                case 52: goto L_0x085a;
                case 53: goto L_0x085a;
                case 54: goto L_0x085a;
                case 55: goto L_0x085a;
                case 56: goto L_0x085a;
                case 57: goto L_0x085a;
                case 58: goto L_0x085a;
                case 59: goto L_0x085a;
                case 60: goto L_0x085a;
                case 61: goto L_0x085a;
                case 62: goto L_0x085a;
                case 63: goto L_0x085a;
                case 64: goto L_0x085a;
                case 65: goto L_0x085a;
                case 66: goto L_0x085a;
                case 67: goto L_0x085a;
                case 68: goto L_0x085a;
                case 69: goto L_0x085a;
                case 70: goto L_0x085a;
                case 71: goto L_0x085a;
                case 72: goto L_0x085a;
                case 73: goto L_0x085a;
                case 74: goto L_0x085a;
                case 75: goto L_0x085a;
                case 76: goto L_0x085a;
                case 77: goto L_0x085a;
                case 78: goto L_0x085a;
                case 79: goto L_0x085a;
                case 80: goto L_0x085a;
                case 81: goto L_0x085a;
                case 82: goto L_0x085a;
                case 83: goto L_0x085a;
                case 84: goto L_0x085a;
                case 85: goto L_0x085a;
                case 86: goto L_0x085a;
                case 87: goto L_0x085a;
                case 88: goto L_0x085a;
                case 89: goto L_0x085a;
                case 90: goto L_0x085a;
                case 91: goto L_0x085a;
                case 92: goto L_0x085a;
                case 93: goto L_0x085a;
                case 94: goto L_0x085a;
                case 95: goto L_0x085a;
                case 96: goto L_0x085a;
                case 97: goto L_0x085a;
                case 98: goto L_0x085a;
                case 99: goto L_0x085a;
                case 100: goto L_0x085a;
                case 101: goto L_0x085a;
                case 102: goto L_0x085a;
                case 103: goto L_0x085a;
                case 104: goto L_0x085a;
                case 105: goto L_0x085a;
                case 106: goto L_0x085a;
                case 107: goto L_0x085a;
                case 108: goto L_0x085a;
                case 109: goto L_0x085a;
                case 110: goto L_0x085a;
                case 111: goto L_0x085a;
                case 112: goto L_0x085a;
                case 113: goto L_0x085a;
                case 114: goto L_0x085a;
                case 115: goto L_0x085a;
                case 116: goto L_0x085a;
                case 117: goto L_0x085a;
                case 118: goto L_0x085a;
                case 119: goto L_0x085a;
                case 120: goto L_0x085a;
                case 121: goto L_0x085a;
                case 122: goto L_0x085a;
                case 123: goto L_0x085a;
                case 124: goto L_0x085a;
                case 125: goto L_0x085a;
                case 126: goto L_0x085a;
                case 127: goto L_0x085a;
                case 128: goto L_0x085a;
                case 129: goto L_0x085a;
                case 130: goto L_0x085a;
                case 131: goto L_0x085a;
                case 132: goto L_0x085a;
                case 133: goto L_0x085a;
                case 134: goto L_0x085a;
                case 135: goto L_0x085a;
                case 136: goto L_0x085a;
                case 137: goto L_0x085a;
                case 138: goto L_0x085a;
                case 139: goto L_0x085a;
                default: goto L_0x082a;
            }
        L_0x082a:
            java.lang.String r1 = p513bj.C14049b0.f30916d     // Catch:{ all -> 0x0863 }
            r1.getClass()     // Catch:{ all -> 0x0863 }
            int r2 = r1.hashCode()
            switch(r2) {
                case -594534941: goto L_0x084c;
                case 2006354: goto L_0x0841;
                case 2006367: goto L_0x0838;
                default: goto L_0x0836;
            }
        L_0x0836:
            r7 = r8
            goto L_0x0856
        L_0x0838:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0856
            goto L_0x0836
        L_0x0841:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x084a
            goto L_0x0836
        L_0x084a:
            r7 = r9
            goto L_0x0856
        L_0x084c:
            java.lang.String r2 = "JSN-L21"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0855
            goto L_0x0836
        L_0x0855:
            r7 = r0
        L_0x0856:
            switch(r7) {
                case 0: goto L_0x085a;
                case 1: goto L_0x085a;
                case 2: goto L_0x085a;
                default: goto L_0x0859;
            }
        L_0x0859:
            goto L_0x085b
        L_0x085a:
            r0 = r9
        L_0x085b:
            f31184r2 = r0     // Catch:{ all -> 0x0863 }
            f31183q2 = r9     // Catch:{ all -> 0x0863 }
        L_0x085f:
            monitor-exit(r13)     // Catch:{ all -> 0x0863 }
            boolean r13 = f31184r2
            return r13
        L_0x0863:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0863 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p520cj.C14149e.m21905S(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        return (r7 * 3) / (r2 * 2);
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m21906T(com.google.android.exoplayer2.mediacodec.C14246c r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L_0x00a8
            if (r8 != r0) goto L_0x0007
            goto L_0x00a8
        L_0x0007:
            r6.getClass()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1851077871: goto L_0x0058;
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = r0
            goto L_0x0062
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r6 = 6
            goto L_0x0062
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r6 = 5
            goto L_0x0062
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r6 = r2
            goto L_0x0062
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r6 = r3
            goto L_0x0062
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r6 = r4
            goto L_0x0062
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r6 = 1
            goto L_0x0062
        L_0x0058:
            java.lang.String r1 = "video/dolby-vision"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0061
            goto L_0x0014
        L_0x0061:
            r6 = 0
        L_0x0062:
            switch(r6) {
                case 0: goto L_0x006b;
                case 1: goto L_0x0068;
                case 2: goto L_0x0066;
                case 3: goto L_0x0068;
                case 4: goto L_0x006b;
                case 5: goto L_0x0068;
                case 6: goto L_0x0066;
                default: goto L_0x0065;
            }
        L_0x0065:
            return r0
        L_0x0066:
            int r7 = r7 * r8
            goto L_0x00a4
        L_0x0068:
            int r7 = r7 * r8
        L_0x0069:
            r2 = r4
            goto L_0x00a4
        L_0x006b:
            java.lang.String r6 = p513bj.C14049b0.f30916d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = p513bj.C14049b0.f30915c
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0094
            boolean r5 = r5.f31697f
            if (r5 == 0) goto L_0x0094
            goto L_0x00a8
        L_0x0094:
            int r7 = r7 + 16
            int r7 = r7 + r0
            int r7 = r7 / 16
            int r8 = r8 + 16
            int r8 = r8 + r0
            int r8 = r8 / 16
            int r8 = r8 * r7
            int r8 = r8 * 16
            int r7 = r8 * 16
            goto L_0x0069
        L_0x00a4:
            int r7 = r7 * r3
            int r2 = r2 * r4
            int r7 = r7 / r2
            return r7
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p520cj.C14149e.m21906T(com.google.android.exoplayer2.mediacodec.c, java.lang.String, int, int):int");
    }

    /* renamed from: U */
    public static List<C14246c> m21907U(C14247d dVar, Format format, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> c;
        String str = format.sampleMimeType;
        if (str == null) {
            return Collections.emptyList();
        }
        List<C14246c> b = dVar.mo46797b(str, z, z2);
        Pattern pattern = MediaCodecUtil.f31669a;
        ArrayList arrayList = new ArrayList(b);
        Collections.sort(arrayList, new C13988n(new C3673f7(format, 3)));
        if ("video/dolby-vision".equals(str) && (c = MediaCodecUtil.m22258c(format)) != null) {
            int intValue = ((Integer) c.first).intValue();
            if (intValue == 16 || intValue == 256) {
                arrayList.addAll(dVar.mo46797b("video/hevc", z, z2));
            } else if (intValue == 512) {
                arrayList.addAll(dVar.mo46797b("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: V */
    public static int m21908V(Format format, C14246c cVar) {
        if (format.maxInputSize == -1) {
            return m21906T(cVar, format.sampleMimeType, format.width, format.height);
        }
        int size = format.initializationData.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += format.initializationData.get(i2).length;
        }
        return format.maxInputSize + i;
    }

    /* renamed from: A */
    public final void mo47043A(long j) {
        super.mo47043A(j);
        if (!this.f31216l2) {
            this.f31206b2--;
        }
    }

    /* renamed from: B */
    public final void mo47044B() {
        mo47050R();
    }

    /* renamed from: C */
    public final void mo47045C(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        boolean z = this.f31216l2;
        if (!z) {
            this.f31206b2++;
        }
        if (C14049b0.f30913a < 23 && z) {
            long j = decoderInputBuffer.f31495f;
            mo47360Q(j);
            mo47053Y();
            this.f31599B1.getClass();
            mo47052X();
            mo47043A(j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if ((r9 == 0 ? false : r1.f31177g[(int) ((r9 - 1) % 15)]) != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0133, code lost:
        if ((((r5 > -30000 ? 1 : (r5 == -30000 ? 0 : -1)) < 0) && r11 > 100000) != false) goto L_0x0135;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0161  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo47046E(long r27, long r29, com.google.android.exoplayer2.mediacodec.C14242b r31, java.nio.ByteBuffer r32, int r33, int r34, int r35, long r36, boolean r38, boolean r39, com.google.android.exoplayer2.Format r40) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r3 = r31
            r4 = r33
            r5 = r36
            r31.getClass()
            long r7 = r0.f31201W1
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x001a
            r0.f31201W1 = r1
        L_0x001a:
            long r7 = r0.f31207c2
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r13 = -1
            r15 = 1000(0x3e8, double:4.94E-321)
            r8 = 0
            if (r7 == 0) goto L_0x00b3
            cj.i r7 = r0.f31186H1
            long r11 = r7.f31238n
            int r17 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r17 == 0) goto L_0x0033
            r7.f31240p = r11
            long r11 = r7.f31239o
            r7.f31241q = r11
        L_0x0033:
            long r11 = r7.f31237m
            r17 = 1
            long r11 = r11 + r17
            r7.f31237m = r11
            cj.c r11 = r7.f31225a
            long r13 = r5 * r15
            cj.c$a r12 = r11.f31166a
            r12.mo47041b(r13)
            cj.c$a r12 = r11.f31166a
            boolean r12 = r12.mo47040a()
            if (r12 == 0) goto L_0x004f
            r11.f31168c = r8
            goto L_0x0086
        L_0x004f:
            long r1 = r11.f31169d
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0086
            boolean r1 = r11.f31168c
            if (r1 == 0) goto L_0x0072
            cj.c$a r1 = r11.f31167b
            long r9 = r1.f31174d
            r19 = 0
            int r2 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r2 != 0) goto L_0x0065
            r1 = r8
            goto L_0x0070
        L_0x0065:
            boolean[] r1 = r1.f31177g
            long r9 = r9 - r17
            r17 = 15
            long r9 = r9 % r17
            int r2 = (int) r9
            boolean r1 = r1[r2]
        L_0x0070:
            if (r1 == 0) goto L_0x007e
        L_0x0072:
            cj.c$a r1 = r11.f31167b
            r1.mo47042c()
            cj.c$a r1 = r11.f31167b
            long r9 = r11.f31169d
            r1.mo47041b(r9)
        L_0x007e:
            r1 = 1
            r11.f31168c = r1
            cj.c$a r1 = r11.f31167b
            r1.mo47041b(r13)
        L_0x0086:
            boolean r1 = r11.f31168c
            if (r1 == 0) goto L_0x009c
            cj.c$a r1 = r11.f31167b
            boolean r1 = r1.mo47040a()
            if (r1 == 0) goto L_0x009c
            cj.c$a r1 = r11.f31166a
            cj.c$a r2 = r11.f31167b
            r11.f31166a = r2
            r11.f31167b = r1
            r11.f31168c = r8
        L_0x009c:
            r11.f31169d = r13
            cj.c$a r1 = r11.f31166a
            boolean r1 = r1.mo47040a()
            if (r1 == 0) goto L_0x00a8
            r1 = r8
            goto L_0x00ac
        L_0x00a8:
            int r1 = r11.f31170e
            r2 = 1
            int r1 = r1 + r2
        L_0x00ac:
            r11.f31170e = r1
            r7.mo47088b()
            r0.f31207c2 = r5
        L_0x00b3:
            long r1 = r0.f31603D1
            long r20 = r5 - r1
            if (r38 == 0) goto L_0x00c0
            if (r39 != 0) goto L_0x00c0
            r0.mo47057c0(r3, r4)
            r1 = 1
            return r1
        L_0x00c0:
            float r7 = r0.f31661w
            double r9 = (double) r7
            int r7 = r26.getState()
            r11 = 2
            if (r7 != r11) goto L_0x00cc
            r7 = 1
            goto L_0x00cd
        L_0x00cc:
            r7 = r8
        L_0x00cd:
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 * r15
            long r5 = r5 - r27
            double r5 = (double) r5
            double r5 = r5 / r9
            long r5 = (long) r5
            if (r7 == 0) goto L_0x00dc
            long r9 = r11 - r29
            long r5 = r5 - r9
        L_0x00dc:
            android.view.Surface r9 = r0.f31194P1
            com.google.android.exoplayer2.video.DummySurface r10 = r0.f31195Q1
            r13 = -30000(0xffffffffffff8ad0, double:NaN)
            if (r9 != r10) goto L_0x00f6
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ea
            r1 = 1
            goto L_0x00eb
        L_0x00ea:
            r1 = r8
        L_0x00eb:
            if (r1 == 0) goto L_0x00f5
            r0.mo47057c0(r3, r4)
            r0.mo47060e0(r5)
            r1 = 1
            return r1
        L_0x00f5:
            return r8
        L_0x00f6:
            long r9 = r0.f31208d2
            long r11 = r11 - r9
            boolean r9 = r0.f31200V1
            if (r9 != 0) goto L_0x0104
            if (r7 != 0) goto L_0x0108
            boolean r9 = r0.f31199U1
            if (r9 == 0) goto L_0x010a
            goto L_0x0108
        L_0x0104:
            boolean r9 = r0.f31198T1
            if (r9 != 0) goto L_0x010a
        L_0x0108:
            r9 = 1
            goto L_0x010b
        L_0x010a:
            r9 = r8
        L_0x010b:
            long r13 = r0.f31202X1
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r10 != 0) goto L_0x0137
            int r1 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0137
            if (r9 != 0) goto L_0x0135
            if (r7 == 0) goto L_0x0137
            r1 = -30000(0xffffffffffff8ad0, double:NaN)
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0126
            r1 = 1
            goto L_0x0127
        L_0x0126:
            r1 = r8
        L_0x0127:
            if (r1 == 0) goto L_0x0132
            r1 = 100000(0x186a0, double:4.94066E-319)
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0132
            r1 = 1
            goto L_0x0133
        L_0x0132:
            r1 = r8
        L_0x0133:
            if (r1 == 0) goto L_0x0137
        L_0x0135:
            r1 = 1
            goto L_0x0138
        L_0x0137:
            r1 = r8
        L_0x0138:
            r2 = 21
            if (r1 == 0) goto L_0x0161
            long r7 = java.lang.System.nanoTime()
            cj.h r1 = r0.f31219o2
            if (r1 == 0) goto L_0x0151
            android.media.MediaFormat r9 = r0.f31596A
            r19 = r1
            r22 = r7
            r24 = r40
            r25 = r9
            r19.mo47086a(r20, r22, r24, r25)
        L_0x0151:
            int r1 = p513bj.C14049b0.f30913a
            if (r1 < r2) goto L_0x0159
            r0.mo47055a0(r3, r4, r7)
            goto L_0x015c
        L_0x0159:
            r0.mo47054Z(r3, r4)
        L_0x015c:
            r0.mo47060e0(r5)
            r1 = 1
            return r1
        L_0x0161:
            if (r7 == 0) goto L_0x02ec
            long r9 = r0.f31201W1
            int r1 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x016b
            goto L_0x02ec
        L_0x016b:
            long r9 = java.lang.System.nanoTime()
            long r5 = r5 * r15
            long r5 = r5 + r9
            cj.i r1 = r0.f31186H1
            long r11 = r1.f31240p
            r13 = -1
            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x01d0
            cj.c r7 = r1.f31225a
            boolean r7 = r7.mo47039a()
            if (r7 == 0) goto L_0x01d0
            cj.c r7 = r1.f31225a
            boolean r11 = r7.mo47039a()
            if (r11 == 0) goto L_0x019c
            cj.c$a r7 = r7.f31166a
            long r11 = r7.f31175e
            r13 = 0
            int r17 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r17 != 0) goto L_0x0198
            r13 = 0
            goto L_0x01a1
        L_0x0198:
            long r13 = r7.f31176f
            long r13 = r13 / r11
            goto L_0x01a1
        L_0x019c:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01a1:
            long r11 = r1.f31241q
            long r2 = r1.f31237m
            r37 = r9
            long r8 = r1.f31240p
            long r2 = r2 - r8
            long r2 = r2 * r13
            float r2 = (float) r2
            float r3 = r1.f31234j
            float r2 = r2 / r3
            long r2 = (long) r2
            long r11 = r11 + r2
            long r2 = r5 - r11
            long r2 = java.lang.Math.abs(r2)
            r8 = 20000000(0x1312d00, double:9.881313E-317)
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x01c0
            r2 = 1
            goto L_0x01c1
        L_0x01c0:
            r2 = 0
        L_0x01c1:
            if (r2 == 0) goto L_0x01c5
            r5 = r11
            goto L_0x01d2
        L_0x01c5:
            r2 = 0
            r1.f31237m = r2
            r2 = -1
            r1.f31240p = r2
            r1.f31238n = r2
            goto L_0x01d2
        L_0x01d0:
            r37 = r9
        L_0x01d2:
            long r2 = r1.f31237m
            r1.f31238n = r2
            r1.f31239o = r5
            cj.i$b r2 = r1.f31227c
            if (r2 == 0) goto L_0x0210
            long r8 = r1.f31235k
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x01e8
            goto L_0x0210
        L_0x01e8:
            long r2 = r2.f31245b
            int r8 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x01ef
            goto L_0x0210
        L_0x01ef:
            long r8 = r1.f31235k
            long r10 = r5 - r2
            long r10 = r10 / r8
            long r10 = r10 * r8
            long r10 = r10 + r2
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 > 0) goto L_0x01fd
            long r2 = r10 - r8
            goto L_0x0200
        L_0x01fd:
            long r8 = r8 + r10
            r2 = r10
            r10 = r8
        L_0x0200:
            long r8 = r10 - r5
            long r5 = r5 - r2
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r10 = r2
        L_0x0209:
            long r1 = r1.f31236l
            long r10 = r10 - r1
            r1 = r37
            r5 = r10
            goto L_0x0212
        L_0x0210:
            r1 = r37
        L_0x0212:
            long r1 = r5 - r1
            long r1 = r1 / r15
            long r8 = r0.f31202X1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0222
            r3 = 1
            goto L_0x0223
        L_0x0222:
            r3 = 0
        L_0x0223:
            r8 = -500000(0xfffffffffff85ee0, double:NaN)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x022c
            r8 = 1
            goto L_0x022d
        L_0x022c:
            r8 = 0
        L_0x022d:
            if (r8 == 0) goto L_0x0233
            if (r39 != 0) goto L_0x0233
            r8 = 1
            goto L_0x0234
        L_0x0233:
            r8 = 0
        L_0x0234:
            if (r8 == 0) goto L_0x025a
            int r8 = r26.skipSource(r27)
            if (r8 != 0) goto L_0x023e
            r8 = 0
            goto L_0x0256
        L_0x023e:
            mh.d r9 = r0.f31599B1
            r9.getClass()
            int r9 = r0.f31206b2
            int r9 = r9 + r8
            if (r3 == 0) goto L_0x0249
            goto L_0x024c
        L_0x0249:
            r0.mo47058d0(r9)
        L_0x024c:
            boolean r8 = r26.mo47366k()
            if (r8 == 0) goto L_0x0255
            r26.mo47372t()
        L_0x0255:
            r8 = 1
        L_0x0256:
            if (r8 == 0) goto L_0x025a
            r7 = 0
            return r7
        L_0x025a:
            r8 = -30000(0xffffffffffff8ad0, double:NaN)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0262
            r8 = 1
            goto L_0x0263
        L_0x0262:
            r8 = 0
        L_0x0263:
            if (r8 == 0) goto L_0x0269
            if (r39 != 0) goto L_0x0269
            r8 = 1
            goto L_0x026a
        L_0x0269:
            r8 = 0
        L_0x026a:
            if (r8 == 0) goto L_0x028b
            if (r3 == 0) goto L_0x0275
            r3 = r31
            r0.mo47057c0(r3, r4)
            r3 = 1
            goto L_0x0287
        L_0x0275:
            r3 = r31
            java.lang.String r5 = "dropVideoBuffer"
            p513bj.C14075p.m21690b(r5)
            r5 = 0
            r3.mo47393l(r4, r5)
            p513bj.C14075p.m21699k()
            r3 = 1
            r0.mo47058d0(r3)
        L_0x0287:
            r0.mo47060e0(r1)
            return r3
        L_0x028b:
            r3 = r31
            int r8 = p513bj.C14049b0.f30913a
            r9 = 21
            if (r8 < r9) goto L_0x02b3
            r8 = 50000(0xc350, double:2.47033E-319)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x02ea
            cj.h r7 = r0.f31219o2
            if (r7 == 0) goto L_0x02ab
            android.media.MediaFormat r8 = r0.f31596A
            r19 = r7
            r22 = r5
            r24 = r40
            r25 = r8
            r19.mo47086a(r20, r22, r24, r25)
        L_0x02ab:
            r0.mo47055a0(r3, r4, r5)
            r0.mo47060e0(r1)
            r1 = 1
            return r1
        L_0x02b3:
            r8 = 30000(0x7530, double:1.4822E-319)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x02ea
            r8 = 11000(0x2af8, double:5.4347E-320)
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x02d1
            r8 = 10000(0x2710, double:4.9407E-320)
            long r8 = r1 - r8
            long r8 = r8 / r15
            java.lang.Thread.sleep(r8)     // Catch:{ InterruptedException -> 0x02c8 }
            goto L_0x02d1
        L_0x02c8:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            r1 = 0
            return r1
        L_0x02d1:
            cj.h r7 = r0.f31219o2
            if (r7 == 0) goto L_0x02e2
            android.media.MediaFormat r8 = r0.f31596A
            r19 = r7
            r22 = r5
            r24 = r40
            r25 = r8
            r19.mo47086a(r20, r22, r24, r25)
        L_0x02e2:
            r0.mo47054Z(r3, r4)
            r0.mo47060e0(r1)
            r1 = 1
            return r1
        L_0x02ea:
            r1 = 0
            return r1
        L_0x02ec:
            r1 = r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p520cj.C14149e.mo47046E(long, long, com.google.android.exoplayer2.mediacodec.b, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    /* renamed from: I */
    public final void mo47047I() {
        super.mo47047I();
        this.f31206b2 = 0;
    }

    /* renamed from: L */
    public final boolean mo47048L(C14246c cVar) {
        return this.f31194P1 != null || mo47056b0(cVar);
    }

    /* renamed from: N */
    public final int mo47049N(C14247d dVar, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i = 0;
        if (!C14065m.m21681k(format.sampleMimeType)) {
            return 0;
        }
        boolean z = format.drmInitData != null;
        List<C14246c> U = m21907U(dVar, format, z, false);
        if (z && U.isEmpty()) {
            U = m21907U(dVar, format, false, false);
        }
        if (U.isEmpty()) {
            return 1;
        }
        Class<? extends C18292b> cls = format.exoMediaCryptoType;
        if (!(cls == null || C18293c.class.equals(cls))) {
            return 2;
        }
        C14246c cVar = U.get(0);
        boolean c = cVar.mo47400c(format);
        int i2 = cVar.mo47401d(format) ? 16 : 8;
        if (c) {
            List<C14246c> U2 = m21907U(dVar, format, z, true);
            if (!U2.isEmpty()) {
                C14246c cVar2 = U2.get(0);
                if (cVar2.mo47400c(format) && cVar2.mo47401d(format)) {
                    i = 32;
                }
            }
        }
        return (c ? 4 : 3) | i2 | i;
    }

    /* renamed from: R */
    public final void mo47050R() {
        C14242b bVar;
        this.f31198T1 = false;
        if (C14049b0.f30913a >= 23 && this.f31216l2 && (bVar = this.f31665y) != null) {
            this.f31218n2 = new C14151b(bVar);
        }
    }

    /* renamed from: W */
    public final void mo47051W() {
        if (this.f31204Z1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f31203Y1;
            C14164p.C14165a aVar = this.f31187I1;
            int i = this.f31204Z1;
            Handler handler = aVar.f31266a;
            if (handler != null) {
                handler.post(new C14161m(i, j, aVar));
            }
            this.f31204Z1 = 0;
            this.f31203Y1 = elapsedRealtime;
        }
    }

    /* renamed from: X */
    public final void mo47052X() {
        this.f31200V1 = true;
        if (!this.f31198T1) {
            this.f31198T1 = true;
            C14164p.C14165a aVar = this.f31187I1;
            Surface surface = this.f31194P1;
            if (aVar.f31266a != null) {
                aVar.f31266a.post(new C14160l(aVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f31196R1 = true;
        }
    }

    /* renamed from: Y */
    public final void mo47053Y() {
        int i = this.f31211g2;
        if (i != -1 || this.f31212h2 != -1) {
            C14166q qVar = this.f31215k2;
            if (qVar == null || qVar.f31268a != i || qVar.f31269b != this.f31212h2 || qVar.f31270c != this.f31213i2 || qVar.f31271d != this.f31214j2) {
                C14166q qVar2 = new C14166q(i, this.f31214j2, this.f31212h2, this.f31213i2);
                this.f31215k2 = qVar2;
                C14164p.C14165a aVar = this.f31187I1;
                Handler handler = aVar.f31266a;
                if (handler != null) {
                    handler.post(new C3067i(5, aVar, qVar2));
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo47054Z(C14242b bVar, int i) {
        mo47053Y();
        C14075p.m21690b("releaseOutputBuffer");
        bVar.mo47393l(i, true);
        C14075p.m21699k();
        this.f31208d2 = SystemClock.elapsedRealtime() * 1000;
        this.f31599B1.getClass();
        this.f31205a2 = 0;
        mo47052X();
    }

    /* renamed from: a0 */
    public final void mo47055a0(C14242b bVar, int i, long j) {
        mo47053Y();
        C14075p.m21690b("releaseOutputBuffer");
        bVar.mo47389h(i, j);
        C14075p.m21699k();
        this.f31208d2 = SystemClock.elapsedRealtime() * 1000;
        this.f31599B1.getClass();
        this.f31205a2 = 0;
        mo47052X();
    }

    /* renamed from: b0 */
    public final boolean mo47056b0(C14246c cVar) {
        return C14049b0.f30913a >= 23 && !this.f31216l2 && !m21905S(cVar.f31692a) && (!cVar.f31697f || DummySurface.isSecureSupported(this.f31185G1));
    }

    /* renamed from: c0 */
    public final void mo47057c0(C14242b bVar, int i) {
        C14075p.m21690b("skipVideoBuffer");
        bVar.mo47393l(i, false);
        C14075p.m21699k();
        this.f31599B1.getClass();
    }

    /* renamed from: d0 */
    public final void mo47058d0(int i) {
        C18223d dVar = this.f31599B1;
        dVar.getClass();
        this.f31204Z1 += i;
        int i2 = this.f31205a2 + i;
        this.f31205a2 = i2;
        dVar.f39950a = Math.max(i2, dVar.f39950a);
        int i3 = this.f31189K1;
        if (i3 > 0 && this.f31204Z1 >= i3) {
            mo47051W();
        }
    }

    /* renamed from: e */
    public final C18224e mo47059e(C14246c cVar, Format format, Format format2) {
        C18224e b = cVar.mo47399b(format, format2);
        int i = b.f39955e;
        int i2 = format2.width;
        C14150a aVar = this.f31191M1;
        if (i2 > aVar.f31220a || format2.height > aVar.f31221b) {
            i |= 256;
        }
        if (m21908V(format2, cVar) > this.f31191M1.f31222c) {
            i |= 64;
        }
        int i3 = i;
        return new C18224e(cVar.f31692a, format, format2, i3 != 0 ? 0 : b.f39954d, i3);
    }

    /* renamed from: e0 */
    public final void mo47060e0(long j) {
        this.f31599B1.getClass();
        this.f31209e2 += j;
        this.f31210f2++;
    }

    /* renamed from: f */
    public final MediaCodecDecoderException mo47061f(IllegalStateException illegalStateException, C14246c cVar) {
        return new MediaCodecVideoDecoderException(illegalStateException, cVar, this.f31194P1);
    }

    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(int r9, java.lang.Object r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r8 = this;
            r0 = 1
            if (r9 == r0) goto L_0x003e
            r0 = 4
            if (r9 == r0) goto L_0x002d
            r0 = 6
            if (r9 == r0) goto L_0x0027
            r0 = 102(0x66, float:1.43E-43)
            if (r9 == r0) goto L_0x0012
            super.handleMessage(r9, r10)
            goto L_0x012d
        L_0x0012:
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            int r10 = r8.f31217m2
            if (r10 == r9) goto L_0x012d
            r8.f31217m2 = r9
            boolean r9 = r8.f31216l2
            if (r9 == 0) goto L_0x012d
            r8.mo47355G()
            goto L_0x012d
        L_0x0027:
            cj.h r10 = (p520cj.C14154h) r10
            r8.f31219o2 = r10
            goto L_0x012d
        L_0x002d:
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r8.f31197S1 = r9
            com.google.android.exoplayer2.mediacodec.b r10 = r8.f31665y
            if (r10 == 0) goto L_0x012d
            r10.mo47384d(r9)
            goto L_0x012d
        L_0x003e:
            boolean r9 = r10 instanceof android.view.Surface
            r1 = 0
            if (r9 == 0) goto L_0x0046
            android.view.Surface r10 = (android.view.Surface) r10
            goto L_0x0047
        L_0x0046:
            r10 = r1
        L_0x0047:
            if (r10 != 0) goto L_0x0063
            com.google.android.exoplayer2.video.DummySurface r9 = r8.f31195Q1
            if (r9 == 0) goto L_0x004f
            r10 = r9
            goto L_0x0063
        L_0x004f:
            com.google.android.exoplayer2.mediacodec.c r9 = r8.f31606F
            if (r9 == 0) goto L_0x0063
            boolean r2 = r8.mo47056b0(r9)
            if (r2 == 0) goto L_0x0063
            android.content.Context r10 = r8.f31185G1
            boolean r9 = r9.f31697f
            com.google.android.exoplayer2.video.DummySurface r10 = com.google.android.exoplayer2.video.DummySurface.newInstanceV17(r10, r9)
            r8.f31195Q1 = r10
        L_0x0063:
            android.view.Surface r9 = r8.f31194P1
            r2 = 5
            if (r9 == r10) goto L_0x00fb
            r8.f31194P1 = r10
            cj.i r9 = r8.f31186H1
            r9.getClass()
            boolean r3 = r10 instanceof com.google.android.exoplayer2.video.DummySurface
            if (r3 == 0) goto L_0x0075
            r3 = r1
            goto L_0x0076
        L_0x0075:
            r3 = r10
        L_0x0076:
            android.view.Surface r4 = r9.f31230f
            r5 = 0
            if (r4 != r3) goto L_0x007c
            goto L_0x009f
        L_0x007c:
            int r6 = p513bj.C14049b0.f30913a
            r7 = 30
            if (r6 < r7) goto L_0x009a
            if (r4 == 0) goto L_0x009a
            float r6 = r9.f31233i
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x008c
            goto L_0x009a
        L_0x008c:
            r9.f31233i = r7
            r4.setFrameRate(r7, r5)     // Catch:{ IllegalStateException -> 0x0092 }
            goto L_0x009a
        L_0x0092:
            r4 = move-exception
            java.lang.String r6 = "VideoFrameReleaseHelper"
            java.lang.String r7 = "Failed to call Surface.setFrameRate"
            p513bj.C14075p.m21698j(r6, r7, r4)
        L_0x009a:
            r9.f31230f = r3
            r9.mo47089c(r0)
        L_0x009f:
            r8.f31196R1 = r5
            int r9 = r8.getState()
            com.google.android.exoplayer2.mediacodec.b r0 = r8.f31665y
            if (r0 == 0) goto L_0x00bf
            int r3 = p513bj.C14049b0.f30913a
            r4 = 23
            if (r3 < r4) goto L_0x00b9
            if (r10 == 0) goto L_0x00b9
            boolean r3 = r8.f31192N1
            if (r3 != 0) goto L_0x00b9
            r0.mo47386f(r10)
            goto L_0x00bf
        L_0x00b9:
            r8.mo47355G()
            r8.mo47372t()
        L_0x00bf:
            if (r10 == 0) goto L_0x00f5
            com.google.android.exoplayer2.video.DummySurface r0 = r8.f31195Q1
            if (r10 == r0) goto L_0x00f5
            cj.q r10 = r8.f31215k2
            if (r10 == 0) goto L_0x00d7
            cj.p$a r0 = r8.f31187I1
            android.os.Handler r1 = r0.f31266a
            if (r1 == 0) goto L_0x00d7
            androidx.profileinstaller.i r3 = new androidx.profileinstaller.i
            r3.<init>(r2, r0, r10)
            r1.post(r3)
        L_0x00d7:
            r8.mo47050R()
            r10 = 2
            if (r9 != r10) goto L_0x012d
            long r9 = r8.f31188J1
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ed
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r0 = r8.f31188J1
            long r9 = r9 + r0
            goto L_0x00f2
        L_0x00ed:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00f2:
            r8.f31202X1 = r9
            goto L_0x012d
        L_0x00f5:
            r8.f31215k2 = r1
            r8.mo47050R()
            goto L_0x012d
        L_0x00fb:
            if (r10 == 0) goto L_0x012d
            com.google.android.exoplayer2.video.DummySurface r9 = r8.f31195Q1
            if (r10 == r9) goto L_0x012d
            cj.q r9 = r8.f31215k2
            if (r9 == 0) goto L_0x0113
            cj.p$a r10 = r8.f31187I1
            android.os.Handler r0 = r10.f31266a
            if (r0 == 0) goto L_0x0113
            androidx.profileinstaller.i r1 = new androidx.profileinstaller.i
            r1.<init>(r2, r10, r9)
            r0.post(r1)
        L_0x0113:
            boolean r9 = r8.f31196R1
            if (r9 == 0) goto L_0x012d
            cj.p$a r9 = r8.f31187I1
            android.view.Surface r10 = r8.f31194P1
            android.os.Handler r0 = r9.f31266a
            if (r0 == 0) goto L_0x012d
            long r0 = android.os.SystemClock.elapsedRealtime()
            android.os.Handler r2 = r9.f31266a
            cj.l r3 = new cj.l
            r3.<init>(r9, r10, r0)
            r2.post(r3)
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p520cj.C14149e.handleMessage(int, java.lang.Object):void");
    }

    public final boolean isReady() {
        DummySurface dummySurface;
        if (super.isReady() && (this.f31198T1 || (((dummySurface = this.f31195Q1) != null && this.f31194P1 == dummySurface) || this.f31665y == null || this.f31216l2))) {
            this.f31202X1 = -9223372036854775807L;
            return true;
        } else if (this.f31202X1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f31202X1) {
                return true;
            }
            this.f31202X1 = -9223372036854775807L;
            return false;
        }
    }

    /* renamed from: m */
    public final boolean mo47065m() {
        return this.f31216l2 && C14049b0.f30913a < 23;
    }

    /* renamed from: n */
    public final float mo47066n(float f, Format[] formatArr) {
        float f2 = -1.0f;
        for (Format format : formatArr) {
            float f3 = format.frameRate;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* renamed from: o */
    public final List<C14246c> mo47067o(C14247d dVar, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return m21907U(dVar, format, z, this.f31216l2);
    }

    public final void onDisabled() {
        this.f31215k2 = null;
        mo47050R();
        this.f31196R1 = false;
        C14155i iVar = this.f31186H1;
        if (iVar.f31226b != null) {
            C14155i.C14156a aVar = iVar.f31228d;
            if (aVar != null) {
                aVar.f31242a.unregisterDisplayListener(aVar);
            }
            C14155i.C14157b bVar = iVar.f31227c;
            bVar.getClass();
            bVar.f31246c.sendEmptyMessage(2);
        }
        this.f31218n2 = null;
        try {
            super.onDisabled();
            C14164p.C14165a aVar2 = this.f31187I1;
            C18223d dVar = this.f31599B1;
            aVar2.getClass();
            synchronized (dVar) {
            }
            Handler handler = aVar2.f31266a;
            if (handler != null) {
                handler.post(new C9272c(3, aVar2, dVar));
            }
        } catch (Throwable th) {
            C14164p.C14165a aVar3 = this.f31187I1;
            C18223d dVar2 = this.f31599B1;
            aVar3.getClass();
            synchronized (dVar2) {
                Handler handler2 = aVar3.f31266a;
                if (handler2 != null) {
                    handler2.post(new C9272c(3, aVar3, dVar2));
                }
                throw th;
            }
        }
    }

    public final void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().f38896a;
        C14075p.m21694f(!z3 || this.f31217m2 != 0);
        if (this.f31216l2 != z3) {
            this.f31216l2 = z3;
            mo47355G();
        }
        C14164p.C14165a aVar = this.f31187I1;
        C18223d dVar = this.f31599B1;
        Handler handler = aVar.f31266a;
        if (handler != null) {
            handler.post(new C13281a(3, aVar, dVar));
        }
        C14155i iVar = this.f31186H1;
        if (iVar.f31226b != null) {
            C14155i.C14157b bVar = iVar.f31227c;
            bVar.getClass();
            bVar.f31246c.sendEmptyMessage(1);
            C14155i.C14156a aVar2 = iVar.f31228d;
            if (aVar2 != null) {
                aVar2.f31242a.registerDisplayListener(aVar2, C14049b0.m21639l((Handler.Callback) null));
            }
            iVar.mo47087a();
        }
        this.f31199U1 = z2;
        this.f31200V1 = false;
    }

    public final void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        super.onPositionReset(j, z);
        mo47050R();
        C14155i iVar = this.f31186H1;
        iVar.f31237m = 0;
        iVar.f31240p = -1;
        iVar.f31238n = -1;
        long j2 = -9223372036854775807L;
        this.f31207c2 = -9223372036854775807L;
        this.f31201W1 = -9223372036854775807L;
        this.f31205a2 = 0;
        if (z) {
            if (this.f31188J1 > 0) {
                j2 = SystemClock.elapsedRealtime() + this.f31188J1;
            }
            this.f31202X1 = j2;
            return;
        }
        this.f31202X1 = -9223372036854775807L;
    }

    @TargetApi(17)
    public final void onReset() {
        try {
            super.onReset();
            DummySurface dummySurface = this.f31195Q1;
            if (dummySurface != null) {
                if (this.f31194P1 == dummySurface) {
                    this.f31194P1 = null;
                }
                dummySurface.release();
                this.f31195Q1 = null;
            }
        } catch (Throwable th) {
            if (this.f31195Q1 != null) {
                Surface surface = this.f31194P1;
                DummySurface dummySurface2 = this.f31195Q1;
                if (surface == dummySurface2) {
                    this.f31194P1 = null;
                }
                dummySurface2.release();
                this.f31195Q1 = null;
            }
            throw th;
        }
    }

    public final void onStarted() {
        this.f31204Z1 = 0;
        this.f31203Y1 = SystemClock.elapsedRealtime();
        this.f31208d2 = SystemClock.elapsedRealtime() * 1000;
        this.f31209e2 = 0;
        this.f31210f2 = 0;
        C14155i iVar = this.f31186H1;
        iVar.f31229e = true;
        iVar.f31237m = 0;
        iVar.f31240p = -1;
        iVar.f31238n = -1;
        iVar.mo47089c(false);
    }

    public final void onStopped() {
        Surface surface;
        this.f31202X1 = -9223372036854775807L;
        mo47051W();
        int i = this.f31210f2;
        if (i != 0) {
            C14164p.C14165a aVar = this.f31187I1;
            long j = this.f31209e2;
            Handler handler = aVar.f31266a;
            if (handler != null) {
                handler.post(new C14159k(i, j, aVar));
            }
            this.f31209e2 = 0;
            this.f31210f2 = 0;
        }
        C14155i iVar = this.f31186H1;
        iVar.f31229e = false;
        if (C14049b0.f30913a >= 30 && (surface = iVar.f31230f) != null && iVar.f31233i != 0.0f) {
            iVar.f31233i = 0.0f;
            try {
                surface.setFrameRate(0.0f, 0);
            } catch (IllegalStateException e) {
                C14075p.m21698j("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    @TargetApi(17)
    /* renamed from: q */
    public final C14242b.C14243a mo47074q(C14246c cVar, Format format, MediaCrypto mediaCrypto, float f) {
        String str;
        C14150a aVar;
        boolean z;
        Pair<Integer, Integer> c;
        Point point;
        int i;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int T;
        C14246c cVar2 = cVar;
        Format format2 = format;
        float f2 = f;
        DummySurface dummySurface = this.f31195Q1;
        if (!(dummySurface == null || dummySurface.secure == cVar2.f31697f)) {
            dummySurface.release();
            this.f31195Q1 = null;
        }
        String str2 = cVar2.f31694c;
        Format[] streamFormats = getStreamFormats();
        int i2 = format2.width;
        int i3 = format2.height;
        int V = m21908V(format2, cVar2);
        if (streamFormats.length == 1) {
            if (!(V == -1 || (T = m21906T(cVar2, format2.sampleMimeType, format2.width, format2.height)) == -1)) {
                V = Math.min((int) (((float) V) * 1.5f), T);
            }
            aVar = new C14150a(i2, i3, V);
            str = str2;
        } else {
            int length = streamFormats.length;
            boolean z2 = false;
            for (int i4 = 0; i4 < length; i4++) {
                Format format3 = streamFormats[i4];
                if (format2.colorInfo != null && format3.colorInfo == null) {
                    Format.C14176b buildUpon = format3.buildUpon();
                    buildUpon.f31315w = format2.colorInfo;
                    format3 = buildUpon.mo47144a();
                }
                if (cVar2.mo47399b(format2, format3).f39954d != 0) {
                    int i5 = format3.width;
                    z2 |= i5 == -1 || format3.height == -1;
                    i2 = Math.max(i2, i5);
                    i3 = Math.max(i3, format3.height);
                    V = Math.max(V, m21908V(format3, cVar2));
                }
            }
            if (z2) {
                Log.w("MediaCodecVideoRenderer", C0023f.m107h(66, "Resolutions unknown. Codec max resolution: ", i2, EtsyDialogFragment.OPT_X_BUTTON, i3));
                int i6 = format2.height;
                int i7 = format2.width;
                boolean z3 = i6 > i7;
                int i8 = z3 ? i6 : i7;
                if (z3) {
                    i6 = i7;
                }
                float f3 = ((float) i6) / ((float) i8);
                int[] iArr = f31182p2;
                int i9 = 0;
                while (i9 < 9) {
                    int i10 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i11 = (int) (((float) i10) * f3);
                    if (i10 <= i8 || i11 <= i6) {
                        break;
                    }
                    int i12 = i6;
                    float f4 = f3;
                    if (C14049b0.f30913a >= 21) {
                        int i13 = z3 ? i11 : i10;
                        if (!z3) {
                            i10 = i11;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = cVar2.f31695d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                            i = i8;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            i = i8;
                            point2 = new Point((((i13 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i10 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        str = str2;
                        if (cVar2.mo47402e((double) format2.frameRate, point2.x, point2.y)) {
                            point = point3;
                            break;
                        }
                    } else {
                        str = str2;
                        i = i8;
                        try {
                            int i14 = (((i10 + 16) - 1) / 16) * 16;
                            int i15 = (((i11 + 16) - 1) / 16) * 16;
                            if (i14 * i15 <= MediaCodecUtil.m22263h()) {
                                int i16 = z3 ? i15 : i14;
                                if (!z3) {
                                    i14 = i15;
                                }
                                point = new Point(i16, i14);
                            }
                        } catch (MediaCodecUtil.DecoderQueryException unused) {
                        }
                    }
                    i9++;
                    iArr = iArr2;
                    i6 = i12;
                    f3 = f4;
                    i8 = i;
                    str2 = str;
                }
                str = str2;
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    V = Math.max(V, m21906T(cVar2, format2.sampleMimeType, i2, i3));
                    Log.w("MediaCodecVideoRenderer", C0023f.m107h(57, "Codec max resolution adjusted to: ", i2, EtsyDialogFragment.OPT_X_BUTTON, i3));
                }
            } else {
                str = str2;
            }
            aVar = new C14150a(i2, i3, V);
        }
        this.f31191M1 = aVar;
        boolean z4 = this.f31190L1;
        int i17 = this.f31216l2 ? this.f31217m2 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ResponseConstants.WIDTH, format2.width);
        mediaFormat.setInteger(ResponseConstants.HEIGHT, format2.height);
        C15588c1.m25299P0(mediaFormat, format2.initializationData);
        float f5 = format2.frameRate;
        if (f5 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f5);
        }
        C15588c1.m25360z0(mediaFormat, "rotation-degrees", format2.rotationDegrees);
        ColorInfo colorInfo = format2.colorInfo;
        if (colorInfo != null) {
            C15588c1.m25360z0(mediaFormat, "color-transfer", colorInfo.colorTransfer);
            C15588c1.m25360z0(mediaFormat, "color-standard", colorInfo.colorSpace);
            C15588c1.m25360z0(mediaFormat, "color-range", colorInfo.colorRange);
            byte[] bArr = colorInfo.hdrStaticInfo;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(format2.sampleMimeType) && (c = MediaCodecUtil.m22258c(format)) != null) {
            C15588c1.m25360z0(mediaFormat, Scopes.PROFILE, ((Integer) c.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f31220a);
        mediaFormat.setInteger("max-height", aVar.f31221b);
        C15588c1.m25360z0(mediaFormat, "max-input-size", aVar.f31222c);
        if (C14049b0.f30913a >= 23) {
            mediaFormat.setInteger("priority", 0);
            float f6 = f;
            if (f6 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f6);
            }
        }
        if (z4) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i17 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i17);
        }
        if (this.f31194P1 == null) {
            if (mo47056b0(cVar)) {
                if (this.f31195Q1 == null) {
                    this.f31195Q1 = DummySurface.newInstanceV17(this.f31185G1, cVar2.f31697f);
                }
                this.f31194P1 = this.f31195Q1;
            } else {
                throw new IllegalStateException();
            }
        }
        return new C14242b.C14243a(cVar2, mediaFormat, this.f31194P1, mediaCrypto);
    }

    @TargetApi(29)
    /* renamed from: r */
    public final void mo47075r(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f31193O1) {
            ByteBuffer byteBuffer = decoderInputBuffer.f31496g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    C14242b bVar = this.f31665y;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    bVar.mo47388g(bundle);
                }
            }
        }
    }

    public final void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
        super.setPlaybackSpeed(f, f2);
        C14155i iVar = this.f31186H1;
        iVar.f31234j = f;
        iVar.f31237m = 0;
        iVar.f31240p = -1;
        iVar.f31238n = -1;
        iVar.mo47089c(false);
    }

    /* renamed from: v */
    public final void mo47077v(IllegalStateException illegalStateException) {
        C14075p.m21698j("MediaCodecVideoRenderer", "Video codec error", illegalStateException);
        C14164p.C14165a aVar = this.f31187I1;
        Handler handler = aVar.f31266a;
        if (handler != null) {
            handler.post(new C6868h(2, aVar, illegalStateException));
        }
    }

    /* renamed from: w */
    public final void mo47078w(long j, long j2, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C14164p.C14165a aVar = this.f31187I1;
        Handler handler = aVar.f31266a;
        if (handler != null) {
            handler.post(new C14162n(aVar, str, j, j2));
        }
        this.f31192N1 = m21905S(str);
        C14246c cVar = this.f31606F;
        cVar.getClass();
        boolean z = false;
        if (C14049b0.f30913a >= 29 && "video/x-vnd.on2.vp9".equals(cVar.f31693b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.f31695d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f31193O1 = z;
        if (C14049b0.f30913a >= 23 && this.f31216l2) {
            C14242b bVar = this.f31665y;
            bVar.getClass();
            this.f31218n2 = new C14151b(bVar);
        }
    }

    /* renamed from: x */
    public final void mo47079x(String str) {
        C14164p.C14165a aVar = this.f31187I1;
        Handler handler = aVar.f31266a;
        if (handler != null) {
            handler.post(new C5699e(2, aVar, str));
        }
    }

    /* renamed from: y */
    public final C18224e mo47080y(C17948m0 m0Var) throws ExoPlaybackException {
        C18224e y = super.mo47080y(m0Var);
        C14164p.C14165a aVar = this.f31187I1;
        Format format = m0Var.f39134b;
        Handler handler = aVar.f31266a;
        if (handler != null) {
            handler.post(new C14163o(aVar, 0, format, y));
        }
        return y;
    }

    /* renamed from: z */
    public final void mo47081z(Format format, MediaFormat mediaFormat) {
        C14242b bVar = this.f31665y;
        if (bVar != null) {
            bVar.mo47384d(this.f31197S1);
        }
        if (this.f31216l2) {
            this.f31211g2 = format.width;
            this.f31212h2 = format.height;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f31211g2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(ResponseConstants.WIDTH);
            this.f31212h2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(ResponseConstants.HEIGHT);
        }
        float f = format.pixelWidthHeightRatio;
        this.f31214j2 = f;
        if (C14049b0.f30913a >= 21) {
            int i = format.rotationDegrees;
            if (i == 90 || i == 270) {
                int i2 = this.f31211g2;
                this.f31211g2 = this.f31212h2;
                this.f31212h2 = i2;
                this.f31214j2 = 1.0f / f;
            }
        } else {
            this.f31213i2 = format.rotationDegrees;
        }
        C14155i iVar = this.f31186H1;
        iVar.f31231g = format.frameRate;
        C14146c cVar = iVar.f31225a;
        cVar.f31166a.mo47042c();
        cVar.f31167b.mo47042c();
        cVar.f31168c = false;
        cVar.f31169d = -9223372036854775807L;
        cVar.f31170e = 0;
        iVar.mo47088b();
    }
}
