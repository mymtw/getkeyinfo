package androidx.compose.p015ui.graphics.colorspace;

import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import p568fn.C17782b;

/* renamed from: androidx.compose.ui.graphics.colorspace.e */
public class C1507e {

    /* renamed from: a */
    public final C1505c f3268a;

    /* renamed from: b */
    public final C1505c f3269b;

    /* renamed from: c */
    public final float[] f3270c;

    /* renamed from: androidx.compose.ui.graphics.colorspace.e$a */
    public static final class C1508a extends C1507e {

        /* renamed from: d */
        public final Rgb f3271d;

        /* renamed from: e */
        public final Rgb f3272e;

        /* renamed from: f */
        public final float[] f3273f;

        public C1508a(Rgb rgb, Rgb rgb2, int i) {
            super((C1505c) rgb, (C1505c) rgb2, (float[]) null);
            float[] fArr;
            this.f3271d = rgb;
            this.f3272e = rgb2;
            if (C19543e0.m33290F(rgb.f3246d, rgb2.f3246d)) {
                fArr = C19543e0.m33310c0(rgb2.f3252j, rgb.f3251i);
            } else {
                float[] fArr2 = rgb.f3251i;
                float[] fArr3 = rgb2.f3252j;
                float[] a = rgb.f3246d.mo6315a();
                float[] a2 = rgb2.f3246d.mo6315a();
                C1512i iVar = rgb.f3246d;
                C1512i iVar2 = C17782b.f38633d;
                if (!C19543e0.m33290F(iVar, iVar2)) {
                    float[] fArr4 = C1502a.f3258b.f3259a;
                    float[] copyOf = Arrays.copyOf(C17782b.f38636g, 3);
                    C19383o.m32796f(copyOf, "copyOf(this, size)");
                    fArr2 = C19543e0.m33310c0(C19543e0.m33345z(fArr4, a, copyOf), rgb.f3251i);
                }
                if (!C19543e0.m33290F(rgb2.f3246d, iVar2)) {
                    float[] fArr5 = C1502a.f3258b.f3259a;
                    float[] copyOf2 = Arrays.copyOf(C17782b.f38636g, 3);
                    C19383o.m32796f(copyOf2, "copyOf(this, size)");
                    fArr3 = C19543e0.m33305X(C19543e0.m33310c0(C19543e0.m33345z(fArr5, a2, copyOf2), rgb2.f3251i));
                }
                fArr = C19543e0.m33310c0(fArr3, i == 3 ? C19543e0.m33311d0(new float[]{a[0] / a2[0], a[1] / a2[1], a[2] / a2[2]}, fArr2) : fArr2);
            }
            this.f3273f = fArr;
        }

        /* renamed from: a */
        public final void mo6311a(float[] fArr) {
            fArr[0] = (float) this.f3271d.f3256n.invoke(Double.valueOf((double) fArr[0])).doubleValue();
            fArr[1] = (float) this.f3271d.f3256n.invoke(Double.valueOf((double) fArr[1])).doubleValue();
            fArr[2] = (float) this.f3271d.f3256n.invoke(Double.valueOf((double) fArr[2])).doubleValue();
            C19543e0.m33312e0(this.f3273f, fArr);
            fArr[0] = (float) this.f3272e.f3254l.invoke(Double.valueOf((double) fArr[0])).doubleValue();
            fArr[1] = (float) this.f3272e.f3254l.invoke(Double.valueOf((double) fArr[1])).doubleValue();
            fArr[2] = (float) this.f3272e.f3254l.invoke(Double.valueOf((double) fArr[2])).doubleValue();
        }
    }

    public C1507e(C1505c cVar, C1505c cVar2, float[] fArr) {
        this.f3268a = cVar;
        this.f3269b = cVar2;
        this.f3270c = fArr;
    }

    /* renamed from: a */
    public void mo6311a(float[] fArr) {
        float[] e = this.f3268a.mo6297e(fArr);
        float[] fArr2 = this.f3270c;
        if (fArr2 != null) {
            e[0] = e[0] * fArr2[0];
            e[1] = e[1] * fArr2[1];
            e[2] = e[2] * fArr2[2];
        }
        this.f3269b.mo6293a(e);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1507e(androidx.compose.p015ui.graphics.colorspace.C1505c r10, androidx.compose.p015ui.graphics.colorspace.C1505c r11, int r12) {
        /*
            r9 = this;
            long r0 = r10.f3266b
            long r2 = androidx.compose.p015ui.graphics.colorspace.C1504b.f3260a
            boolean r0 = androidx.compose.p015ui.graphics.colorspace.C1504b.m3215a(r0, r2)
            if (r0 == 0) goto L_0x000f
            androidx.compose.ui.graphics.colorspace.c r0 = kotlinx.coroutines.C19543e0.m33336u(r10)
            goto L_0x0010
        L_0x000f:
            r0 = r10
        L_0x0010:
            long r4 = r11.f3266b
            boolean r1 = androidx.compose.p015ui.graphics.colorspace.C1504b.m3215a(r4, r2)
            if (r1 == 0) goto L_0x001d
            androidx.compose.ui.graphics.colorspace.c r1 = kotlinx.coroutines.C19543e0.m33336u(r11)
            goto L_0x001e
        L_0x001d:
            r1 = r11
        L_0x001e:
            r4 = 3
            r5 = 1
            r6 = 0
            if (r12 != r4) goto L_0x0025
            r12 = r5
            goto L_0x0026
        L_0x0025:
            r12 = r6
        L_0x0026:
            if (r12 != 0) goto L_0x0029
            goto L_0x003f
        L_0x0029:
            long r7 = r10.f3266b
            boolean r12 = androidx.compose.p015ui.graphics.colorspace.C1504b.m3215a(r7, r2)
            long r7 = r11.f3266b
            boolean r2 = androidx.compose.p015ui.graphics.colorspace.C1504b.m3215a(r7, r2)
            if (r12 == 0) goto L_0x003a
            if (r2 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            if (r12 != 0) goto L_0x0041
            if (r2 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r10 = 0
            goto L_0x0076
        L_0x0041:
            if (r12 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r10 = r11
        L_0x0045:
            androidx.compose.ui.graphics.colorspace.Rgb r10 = (androidx.compose.p015ui.graphics.colorspace.Rgb) r10
            if (r12 == 0) goto L_0x0050
            androidx.compose.ui.graphics.colorspace.i r11 = r10.f3246d
            float[] r11 = r11.mo6315a()
            goto L_0x0052
        L_0x0050:
            float[] r11 = p568fn.C17782b.f38636g
        L_0x0052:
            if (r2 == 0) goto L_0x005b
            androidx.compose.ui.graphics.colorspace.i r10 = r10.f3246d
            float[] r10 = r10.mo6315a()
            goto L_0x005d
        L_0x005b:
            float[] r10 = p568fn.C17782b.f38636g
        L_0x005d:
            float[] r12 = new float[r4]
            r2 = r11[r6]
            r3 = r10[r6]
            float r2 = r2 / r3
            r12[r6] = r2
            r2 = r11[r5]
            r3 = r10[r5]
            float r2 = r2 / r3
            r12[r5] = r2
            r2 = 2
            r11 = r11[r2]
            r10 = r10[r2]
            float r11 = r11 / r10
            r12[r2] = r11
            r10 = r12
        L_0x0076:
            r9.<init>((androidx.compose.p015ui.graphics.colorspace.C1505c) r0, (androidx.compose.p015ui.graphics.colorspace.C1505c) r1, (float[]) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.graphics.colorspace.C1507e.<init>(androidx.compose.ui.graphics.colorspace.c, androidx.compose.ui.graphics.colorspace.c, int):void");
    }
}
