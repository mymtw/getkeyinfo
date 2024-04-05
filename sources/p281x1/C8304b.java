package p281x1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p193o.C7494b;
import p289y0.C8351c;

/* renamed from: x1.b */
public final class C8304b {

    /* renamed from: f */
    public static final C8305a f18213f = new C8305a();

    /* renamed from: a */
    public final List<C8309e> f18214a;

    /* renamed from: b */
    public final List<C8311d> f18215b;

    /* renamed from: c */
    public final C7494b f18216c = new C7494b();

    /* renamed from: d */
    public final SparseBooleanArray f18217d = new SparseBooleanArray();

    /* renamed from: e */
    public final C8309e f18218e;

    /* renamed from: x1.b$a */
    public static class C8305a implements C8307c {
        /* renamed from: a */
        public final boolean mo20899a(float[] fArr) {
            float f = fArr[2];
            if (!(f >= 0.95f)) {
                if (!(f <= 0.05f)) {
                    float f2 = fArr[0];
                    if (!(f2 >= 10.0f && f2 <= 37.0f && fArr[1] <= 0.82f)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: x1.b$b */
    public static final class C8306b {

        /* renamed from: a */
        public final Bitmap f18219a;

        /* renamed from: b */
        public final ArrayList f18220b;

        /* renamed from: c */
        public int f18221c = 16;

        /* renamed from: d */
        public int f18222d = 12544;

        /* renamed from: e */
        public int f18223e = -1;

        /* renamed from: f */
        public final ArrayList f18224f;

        /* renamed from: g */
        public Rect f18225g;

        public C8306b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f18220b = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f18224f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C8304b.f18213f);
            this.f18219a = bitmap;
            arrayList.add(C8311d.f18237e);
            arrayList.add(C8311d.f18238f);
            arrayList.add(C8311d.f18239g);
            arrayList.add(C8311d.f18240h);
            arrayList.add(C8311d.f18241i);
            arrayList.add(C8311d.f18242j);
        }

        /* JADX WARNING: Removed duplicated region for block: B:108:0x01ff A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x019e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p281x1.C8304b mo20900a() {
            /*
                r20 = this;
                r0 = r20
                android.graphics.Bitmap r1 = r0.f18219a
                if (r1 == 0) goto L_0x0220
                int r2 = r0.f18222d
                r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                if (r2 <= 0) goto L_0x0021
                int r2 = r1.getWidth()
                int r5 = r1.getHeight()
                int r5 = r5 * r2
                int r2 = r0.f18222d
                if (r5 <= r2) goto L_0x0038
                double r2 = (double) r2
                double r4 = (double) r5
                double r2 = r2 / r4
                double r3 = java.lang.Math.sqrt(r2)
                goto L_0x0038
            L_0x0021:
                int r2 = r0.f18223e
                if (r2 <= 0) goto L_0x0038
                int r2 = r1.getWidth()
                int r5 = r1.getHeight()
                int r2 = java.lang.Math.max(r2, r5)
                int r5 = r0.f18223e
                if (r2 <= r5) goto L_0x0038
                double r3 = (double) r5
                double r5 = (double) r2
                double r3 = r3 / r5
            L_0x0038:
                r5 = 0
                int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r5 = 0
                if (r2 > 0) goto L_0x0040
                goto L_0x005a
            L_0x0040:
                int r2 = r1.getWidth()
                double r6 = (double) r2
                double r6 = r6 * r3
                double r6 = java.lang.Math.ceil(r6)
                int r2 = (int) r6
                int r6 = r1.getHeight()
                double r6 = (double) r6
                double r6 = r6 * r3
                double r3 = java.lang.Math.ceil(r6)
                int r3 = (int) r3
                android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r2, r3, r5)
            L_0x005a:
                android.graphics.Rect r2 = r0.f18225g
                android.graphics.Bitmap r3 = r0.f18219a
                if (r1 == r3) goto L_0x00ab
                if (r2 == 0) goto L_0x00ab
                int r3 = r1.getWidth()
                double r3 = (double) r3
                android.graphics.Bitmap r6 = r0.f18219a
                int r6 = r6.getWidth()
                double r6 = (double) r6
                double r3 = r3 / r6
                int r6 = r2.left
                double r6 = (double) r6
                double r6 = r6 * r3
                double r6 = java.lang.Math.floor(r6)
                int r6 = (int) r6
                r2.left = r6
                int r6 = r2.top
                double r6 = (double) r6
                double r6 = r6 * r3
                double r6 = java.lang.Math.floor(r6)
                int r6 = (int) r6
                r2.top = r6
                int r6 = r2.right
                double r6 = (double) r6
                double r6 = r6 * r3
                double r6 = java.lang.Math.ceil(r6)
                int r6 = (int) r6
                int r7 = r1.getWidth()
                int r6 = java.lang.Math.min(r6, r7)
                r2.right = r6
                int r6 = r2.bottom
                double r6 = (double) r6
                double r6 = r6 * r3
                double r3 = java.lang.Math.ceil(r6)
                int r3 = (int) r3
                int r4 = r1.getHeight()
                int r3 = java.lang.Math.min(r3, r4)
                r2.bottom = r3
            L_0x00ab:
                x1.a r2 = new x1.a
                int r3 = r1.getWidth()
                int r13 = r1.getHeight()
                int r4 = r3 * r13
                int[] r4 = new int[r4]
                r8 = 0
                r10 = 0
                r11 = 0
                r6 = r1
                r7 = r4
                r9 = r3
                r12 = r3
                r6.getPixels(r7, r8, r9, r10, r11, r12, r13)
                android.graphics.Rect r6 = r0.f18225g
                if (r6 != 0) goto L_0x00c8
                goto L_0x00eb
            L_0x00c8:
                int r6 = r6.width()
                android.graphics.Rect r7 = r0.f18225g
                int r7 = r7.height()
                int r8 = r6 * r7
                int[] r8 = new int[r8]
                r9 = r5
            L_0x00d7:
                if (r9 >= r7) goto L_0x00ea
                android.graphics.Rect r10 = r0.f18225g
                int r11 = r10.top
                int r11 = r11 + r9
                int r11 = r11 * r3
                int r10 = r10.left
                int r11 = r11 + r10
                int r10 = r9 * r6
                java.lang.System.arraycopy(r4, r11, r8, r10, r6)
                int r9 = r9 + 1
                goto L_0x00d7
            L_0x00ea:
                r4 = r8
            L_0x00eb:
                int r3 = r0.f18221c
                java.util.ArrayList r6 = r0.f18224f
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L_0x00f7
                r6 = 0
                goto L_0x0105
            L_0x00f7:
                java.util.ArrayList r6 = r0.f18224f
                int r8 = r6.size()
                x1.b$c[] r8 = new p281x1.C8304b.C8307c[r8]
                java.lang.Object[] r6 = r6.toArray(r8)
                x1.b$c[] r6 = (p281x1.C8304b.C8307c[]) r6
            L_0x0105:
                r2.<init>(r4, r3, r6)
                android.graphics.Bitmap r3 = r0.f18219a
                if (r1 == r3) goto L_0x010f
                r1.recycle()
            L_0x010f:
                java.util.ArrayList r1 = r2.f18200c
                x1.b r2 = new x1.b
                java.util.ArrayList r3 = r0.f18220b
                r2.<init>(r1, r3)
                int r1 = r3.size()
                r3 = r5
            L_0x011d:
                if (r3 >= r1) goto L_0x021a
                java.util.List<x1.d> r4 = r2.f18215b
                java.lang.Object r4 = r4.get(r3)
                x1.d r4 = (p281x1.C8311d) r4
                float[] r6 = r4.f18245c
                int r6 = r6.length
                r8 = 0
                r9 = r5
                r10 = r8
            L_0x012d:
                if (r9 >= r6) goto L_0x013b
                float[] r11 = r4.f18245c
                r11 = r11[r9]
                int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r12 <= 0) goto L_0x0138
                float r10 = r10 + r11
            L_0x0138:
                int r9 = r9 + 1
                goto L_0x012d
            L_0x013b:
                int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r6 == 0) goto L_0x0153
                float[] r6 = r4.f18245c
                int r6 = r6.length
                r9 = r5
            L_0x0143:
                if (r9 >= r6) goto L_0x0153
                float[] r11 = r4.f18245c
                r12 = r11[r9]
                int r13 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r13 <= 0) goto L_0x0150
                float r12 = r12 / r10
                r11[r9] = r12
            L_0x0150:
                int r9 = r9 + 1
                goto L_0x0143
            L_0x0153:
                o.b r6 = r2.f18216c
                java.util.List<x1.b$e> r9 = r2.f18214a
                int r9 = r9.size()
                r10 = r5
                r12 = r8
                r11 = 0
            L_0x015e:
                r13 = 1
                if (r10 >= r9) goto L_0x0204
                java.util.List<x1.b$e> r14 = r2.f18214a
                java.lang.Object r14 = r14.get(r10)
                x1.b$e r14 = (p281x1.C8304b.C8309e) r14
                float[] r15 = r14.mo20902b()
                r16 = r15[r13]
                float[] r7 = r4.f18243a
                r17 = r7[r5]
                int r17 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
                r18 = 2
                if (r17 < 0) goto L_0x019b
                r7 = r7[r18]
                int r7 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
                if (r7 > 0) goto L_0x019b
                r7 = r15[r18]
                float[] r15 = r4.f18244b
                r16 = r15[r5]
                int r16 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r16 < 0) goto L_0x019b
                r15 = r15[r18]
                int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
                if (r7 > 0) goto L_0x019b
                android.util.SparseBooleanArray r7 = r2.f18217d
                int r15 = r14.f18229d
                boolean r7 = r7.get(r15)
                if (r7 != 0) goto L_0x019b
                r7 = r13
                goto L_0x019c
            L_0x019b:
                r7 = r5
            L_0x019c:
                if (r7 == 0) goto L_0x01ff
                float[] r7 = r14.mo20902b()
                x1.b$e r15 = r2.f18218e
                if (r15 == 0) goto L_0x01a9
                int r15 = r15.f18230e
                goto L_0x01aa
            L_0x01a9:
                r15 = r13
            L_0x01aa:
                float[] r13 = r4.f18245c
                r13 = r13[r5]
                int r17 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                r19 = 1065353216(0x3f800000, float:1.0)
                if (r17 <= 0) goto L_0x01c6
                r16 = 1
                r17 = r7[r16]
                float[] r5 = r4.f18243a
                r5 = r5[r16]
                float r17 = r17 - r5
                float r5 = java.lang.Math.abs(r17)
                float r5 = r19 - r5
                float r5 = r5 * r13
                goto L_0x01c9
            L_0x01c6:
                r16 = 1
                r5 = r8
            L_0x01c9:
                float[] r13 = r4.f18245c
                r13 = r13[r16]
                int r17 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r17 <= 0) goto L_0x01e1
                r7 = r7[r18]
                float[] r8 = r4.f18244b
                r8 = r8[r16]
                float r7 = r7 - r8
                float r7 = java.lang.Math.abs(r7)
                float r19 = r19 - r7
                float r19 = r19 * r13
                goto L_0x01e3
            L_0x01e1:
                r19 = 0
            L_0x01e3:
                float[] r7 = r4.f18245c
                r7 = r7[r18]
                r8 = 0
                int r13 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r13 <= 0) goto L_0x01f3
                int r13 = r14.f18230e
                float r13 = (float) r13
                float r15 = (float) r15
                float r13 = r13 / r15
                float r13 = r13 * r7
                goto L_0x01f4
            L_0x01f3:
                r13 = r8
            L_0x01f4:
                float r5 = r5 + r19
                float r5 = r5 + r13
                if (r11 == 0) goto L_0x01fd
                int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
                if (r7 <= 0) goto L_0x01ff
            L_0x01fd:
                r12 = r5
                r11 = r14
            L_0x01ff:
                int r10 = r10 + 1
                r5 = 0
                goto L_0x015e
            L_0x0204:
                if (r11 == 0) goto L_0x0212
                boolean r5 = r4.f18246d
                if (r5 == 0) goto L_0x0212
                android.util.SparseBooleanArray r5 = r2.f18217d
                int r7 = r11.f18229d
                r8 = 1
                r5.append(r7, r8)
            L_0x0212:
                r6.put(r4, r11)
                int r3 = r3 + 1
                r5 = 0
                goto L_0x011d
            L_0x021a:
                android.util.SparseBooleanArray r1 = r2.f18217d
                r1.clear()
                return r2
            L_0x0220:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p281x1.C8304b.C8306b.mo20900a():x1.b");
        }
    }

    /* renamed from: x1.b$c */
    public interface C8307c {
        /* renamed from: a */
        boolean mo20899a(float[] fArr);
    }

    /* renamed from: x1.b$d */
    public interface C8308d {
    }

    /* renamed from: x1.b$e */
    public static final class C8309e {

        /* renamed from: a */
        public final int f18226a;

        /* renamed from: b */
        public final int f18227b;

        /* renamed from: c */
        public final int f18228c;

        /* renamed from: d */
        public final int f18229d;

        /* renamed from: e */
        public final int f18230e;

        /* renamed from: f */
        public boolean f18231f;

        /* renamed from: g */
        public int f18232g;

        /* renamed from: h */
        public int f18233h;

        /* renamed from: i */
        public float[] f18234i;

        public C8309e(int i, int i2) {
            this.f18226a = Color.red(i);
            this.f18227b = Color.green(i);
            this.f18228c = Color.blue(i);
            this.f18229d = i;
            this.f18230e = i2;
        }

        /* renamed from: a */
        public final void mo20901a() {
            if (!this.f18231f) {
                int e = C8351c.m16663e(4.5f, -1, this.f18229d);
                int e2 = C8351c.m16663e(3.0f, -1, this.f18229d);
                if (e == -1 || e2 == -1) {
                    int e3 = C8351c.m16663e(4.5f, -16777216, this.f18229d);
                    int e4 = C8351c.m16663e(3.0f, -16777216, this.f18229d);
                    if (e3 == -1 || e4 == -1) {
                        this.f18233h = e != -1 ? C8351c.m16666h(-1, e) : C8351c.m16666h(-16777216, e3);
                        this.f18232g = e2 != -1 ? C8351c.m16666h(-1, e2) : C8351c.m16666h(-16777216, e4);
                        this.f18231f = true;
                        return;
                    }
                    this.f18233h = C8351c.m16666h(-16777216, e3);
                    this.f18232g = C8351c.m16666h(-16777216, e4);
                    this.f18231f = true;
                    return;
                }
                this.f18233h = C8351c.m16666h(-1, e);
                this.f18232g = C8351c.m16666h(-1, e2);
                this.f18231f = true;
            }
        }

        /* renamed from: b */
        public final float[] mo20902b() {
            if (this.f18234i == null) {
                this.f18234i = new float[3];
            }
            C8351c.m16659a(this.f18226a, this.f18227b, this.f18228c, this.f18234i);
            return this.f18234i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8309e.class != obj.getClass()) {
                return false;
            }
            C8309e eVar = (C8309e) obj;
            return this.f18230e == eVar.f18230e && this.f18229d == eVar.f18229d;
        }

        public final int hashCode() {
            return (this.f18229d * 31) + this.f18230e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(C8309e.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.f18229d));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(mo20902b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.f18230e);
            sb.append(']');
            sb.append(" [Title Text: #");
            mo20901a();
            sb.append(Integer.toHexString(this.f18232g));
            sb.append(']');
            sb.append(" [Body Text: #");
            mo20901a();
            sb.append(Integer.toHexString(this.f18233h));
            sb.append(']');
            return sb.toString();
        }
    }

    public C8304b(ArrayList arrayList, ArrayList arrayList2) {
        this.f18214a = arrayList;
        this.f18215b = arrayList2;
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        C8309e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C8309e eVar2 = this.f18214a.get(i2);
            int i3 = eVar2.f18230e;
            if (i3 > i) {
                eVar = eVar2;
                i = i3;
            }
        }
        this.f18218e = eVar;
    }
}
