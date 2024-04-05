package p548dj;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.google.android.play.core.assetpacks.C15588c1;
import java.nio.IntBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import p513bj.C14085x;
import p520cj.C14154h;

/* renamed from: dj.h */
public final class C17570h implements C14154h, C17560a {

    /* renamed from: b */
    public final AtomicBoolean f38429b = new AtomicBoolean();

    /* renamed from: c */
    public final AtomicBoolean f38430c = new AtomicBoolean(true);

    /* renamed from: d */
    public final C17567f f38431d = new C17567f();

    /* renamed from: e */
    public final C17562c f38432e = new C17562c();

    /* renamed from: f */
    public final C14085x<Long> f38433f = new C14085x<>();

    /* renamed from: g */
    public final C14085x<C17563d> f38434g = new C14085x<>();

    /* renamed from: h */
    public final float[] f38435h = new float[16];

    /* renamed from: i */
    public final float[] f38436i = new float[16];

    /* renamed from: j */
    public int f38437j;

    /* renamed from: k */
    public SurfaceTexture f38438k;

    /* renamed from: l */
    public volatile int f38439l = 0;

    /* renamed from: m */
    public int f38440m = -1;

    /* renamed from: n */
    public byte[] f38441n;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47086a(long r33, long r35, com.google.android.exoplayer2.Format r37, android.media.MediaFormat r38) {
        /*
            r32 = this;
            r0 = r32
            r1 = r35
            r3 = r37
            bj.x<java.lang.Long> r4 = r0.f38433f
            java.lang.Long r5 = java.lang.Long.valueOf(r33)
            r4.mo46952a(r1, r5)
            byte[] r4 = r3.projectionData
            int r3 = r3.stereoMode
            byte[] r5 = r0.f38441n
            int r6 = r0.f38440m
            r0.f38441n = r4
            r4 = -1
            if (r3 != r4) goto L_0x001e
            int r3 = r0.f38439l
        L_0x001e:
            r0.f38440m = r3
            if (r6 != r3) goto L_0x002c
            byte[] r3 = r0.f38441n
            boolean r3 = java.util.Arrays.equals(r5, r3)
            if (r3 == 0) goto L_0x002c
            goto L_0x01ee
        L_0x002c:
            byte[] r3 = r0.f38441n
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x00b0
            int r8 = r0.f38440m
            bj.r r9 = new bj.r
            r9.<init>((byte[]) r3)
            r3 = 4
            r9.mo46909A(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r3 = r9.mo46912c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r9.mo46935z(r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r10 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r3 != r10) goto L_0x004d
            r3 = r7
            goto L_0x004e
        L_0x004d:
            r3 = r6
        L_0x004e:
            if (r3 == 0) goto L_0x0081
            r3 = 8
            r9.mo46909A(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r3 = r9.f30987b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r10 = r9.f30988c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
        L_0x0059:
            if (r3 >= r10) goto L_0x0086
            int r11 = r9.mo46912c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            int r11 = r11 + r3
            if (r11 <= r3) goto L_0x0086
            if (r11 <= r10) goto L_0x0065
            goto L_0x0086
        L_0x0065:
            int r3 = r9.mo46912c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r12 = 2037673328(0x79746d70, float:7.9321256E34)
            if (r3 == r12) goto L_0x0079
            r12 = 1836279920(0x6d736870, float:4.7081947E27)
            if (r3 != r12) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r9.mo46935z(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            r3 = r11
            goto L_0x0059
        L_0x0079:
            r9.mo46934y(r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            java.util.ArrayList r3 = p548dj.C17566e.m29436a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            goto L_0x0087
        L_0x0081:
            java.util.ArrayList r3 = p548dj.C17566e.m29436a(r9)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r3 = r4
        L_0x0087:
            if (r3 != 0) goto L_0x008a
            goto L_0x00b0
        L_0x008a:
            int r9 = r3.size()
            if (r9 == r7) goto L_0x00a5
            if (r9 == r5) goto L_0x0093
            goto L_0x00b0
        L_0x0093:
            dj.d r4 = new dj.d
            java.lang.Object r9 = r3.get(r6)
            dj.d$a r9 = (p548dj.C17563d.C17564a) r9
            java.lang.Object r3 = r3.get(r7)
            dj.d$a r3 = (p548dj.C17563d.C17564a) r3
            r4.<init>(r9, r3, r8)
            goto L_0x00b0
        L_0x00a5:
            dj.d r4 = new dj.d
            java.lang.Object r3 = r3.get(r6)
            dj.d$a r3 = (p548dj.C17563d.C17564a) r3
            r4.<init>(r3, r3, r8)
        L_0x00b0:
            if (r4 == 0) goto L_0x00ba
            boolean r3 = p548dj.C17567f.m29437a(r4)
            if (r3 == 0) goto L_0x00ba
            goto L_0x01e7
        L_0x00ba:
            int r3 = r0.f38440m
            r4 = 1127481344(0x43340000, float:180.0)
            double r8 = (double) r4
            double r8 = java.lang.Math.toRadians(r8)
            float r4 = (float) r8
            r8 = 1135869952(0x43b40000, float:360.0)
            double r8 = (double) r8
            double r8 = java.lang.Math.toRadians(r8)
            float r8 = (float) r8
            r9 = 36
            float r10 = (float) r9
            float r10 = r4 / r10
            r11 = 72
            float r12 = (float) r11
            float r12 = r8 / r12
            r13 = 15984(0x3e70, float:2.2398E-41)
            float[] r13 = new float[r13]
            r14 = 10656(0x29a0, float:1.4932E-41)
            float[] r14 = new float[r14]
            r15 = r6
            r16 = r15
            r17 = r16
        L_0x00e3:
            if (r15 >= r9) goto L_0x01ce
            float r9 = (float) r15
            float r9 = r9 * r10
            r18 = 1073741824(0x40000000, float:2.0)
            float r19 = r4 / r18
            float r9 = r9 - r19
            int r6 = r15 + 1
            float r7 = (float) r6
            float r7 = r7 * r10
            float r7 = r7 - r19
            r11 = 0
        L_0x00f4:
            r5 = 73
            if (r11 >= r5) goto L_0x01bd
            r20 = r6
            r5 = 0
            r6 = 2
        L_0x00fc:
            if (r5 >= r6) goto L_0x01a1
            if (r5 != 0) goto L_0x0104
            r21 = r7
            r6 = r9
            goto L_0x0107
        L_0x0104:
            r6 = r7
            r21 = r6
        L_0x0107:
            float r7 = (float) r11
            float r7 = r7 * r12
            r22 = 1078530011(0x40490fdb, float:3.1415927)
            float r22 = r7 + r22
            float r23 = r8 / r18
            r24 = r9
            float r9 = r22 - r23
            int r22 = r16 + 1
            r23 = r12
            r12 = 1112014848(0x42480000, float:50.0)
            double r1 = (double) r12
            r25 = r11
            double r11 = (double) r9
            double r26 = java.lang.Math.sin(r11)
            double r26 = r26 * r1
            r9 = r3
            r28 = r4
            double r3 = (double) r6
            double r29 = java.lang.Math.cos(r3)
            r31 = r9
            r6 = r10
            double r9 = r29 * r26
            float r9 = (float) r9
            float r9 = -r9
            r13[r16] = r9
            int r9 = r22 + 1
            double r26 = java.lang.Math.sin(r3)
            r10 = r5
            r29 = r6
            double r5 = r26 * r1
            float r5 = (float) r5
            r13[r22] = r5
            int r5 = r9 + 1
            double r11 = java.lang.Math.cos(r11)
            double r11 = r11 * r1
            double r1 = java.lang.Math.cos(r3)
            double r1 = r1 * r11
            float r1 = (float) r1
            r13[r9] = r1
            int r1 = r17 + 1
            float r7 = r7 / r8
            r14[r17] = r7
            int r2 = r1 + 1
            int r3 = r15 + r10
            float r3 = (float) r3
            float r3 = r3 * r29
            float r3 = r3 / r28
            r14[r1] = r3
            if (r25 != 0) goto L_0x016d
            if (r10 == 0) goto L_0x0167
            goto L_0x016d
        L_0x0167:
            r4 = r10
            r1 = r25
            r3 = 72
            goto L_0x0177
        L_0x016d:
            r1 = r25
            r3 = 72
            r4 = r10
            if (r1 != r3) goto L_0x0188
            r6 = 1
            if (r4 != r6) goto L_0x0188
        L_0x0177:
            int r6 = r5 + -3
            r7 = 3
            java.lang.System.arraycopy(r13, r6, r13, r5, r7)
            int r5 = r5 + 3
            int r6 = r2 + -2
            r7 = 2
            java.lang.System.arraycopy(r14, r6, r14, r2, r7)
            int r2 = r2 + 2
            goto L_0x0189
        L_0x0188:
            r7 = 2
        L_0x0189:
            r17 = r2
            r16 = r5
            int r5 = r4 + 1
            r11 = r1
            r6 = r7
            r7 = r21
            r12 = r23
            r9 = r24
            r4 = r28
            r10 = r29
            r3 = r31
            r1 = r35
            goto L_0x00fc
        L_0x01a1:
            r31 = r3
            r28 = r4
            r21 = r7
            r24 = r9
            r29 = r10
            r1 = r11
            r23 = r12
            r3 = 72
            r7 = r6
            int r11 = r1 + 1
            r1 = r35
            r6 = r20
            r7 = r21
            r3 = r31
            goto L_0x00f4
        L_0x01bd:
            r31 = r3
            r20 = r6
            r1 = r35
            r15 = r20
            r5 = 2
            r6 = 0
            r7 = 1
            r9 = 36
            r11 = 72
            goto L_0x00e3
        L_0x01ce:
            r31 = r3
            dj.d$b r1 = new dj.d$b
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3, r13, r14)
            dj.d r4 = new dj.d
            dj.d$a r5 = new dj.d$a
            dj.d$b[] r3 = new p548dj.C17563d.C17565b[r3]
            r3[r2] = r1
            r5.<init>(r3)
            r1 = r31
            r4.<init>(r5, r5, r1)
        L_0x01e7:
            bj.x<dj.d> r1 = r0.f38434g
            r2 = r35
            r1.mo46952a(r2, r4)
        L_0x01ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p548dj.C17570h.mo47086a(long, long, com.google.android.exoplayer2.Format, android.media.MediaFormat):void");
    }

    /* renamed from: b */
    public final void mo68897b(long j, float[] fArr) {
        this.f38432e.f38400c.mo46952a(j, fArr);
    }

    /* renamed from: c */
    public final void mo68898c() {
        this.f38433f.mo46953b();
        C17562c cVar = this.f38432e;
        cVar.f38400c.mo46953b();
        cVar.f38401d = false;
        this.f38430c.set(true);
    }

    /* renamed from: d */
    public final SurfaceTexture mo68900d() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        C15588c1.m25292M();
        C17567f fVar = this.f38431d;
        fVar.getClass();
        int P = C15588c1.m25298P(TextUtils.join("\n", C17567f.f38411i), TextUtils.join("\n", C17567f.f38412j));
        fVar.f38418c = P;
        fVar.f38419d = GLES20.glGetUniformLocation(P, "uMvpMatrix");
        fVar.f38420e = GLES20.glGetUniformLocation(fVar.f38418c, "uTexMatrix");
        fVar.f38421f = GLES20.glGetAttribLocation(fVar.f38418c, "aPosition");
        fVar.f38422g = GLES20.glGetAttribLocation(fVar.f38418c, "aTexCoords");
        fVar.f38423h = GLES20.glGetUniformLocation(fVar.f38418c, "uTexture");
        C15588c1.m25292M();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        C15588c1.m25292M();
        this.f38437j = iArr[0];
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f38437j);
        this.f38438k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new C17569g(this));
        return this.f38438k;
    }
}
