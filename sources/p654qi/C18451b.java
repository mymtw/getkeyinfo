package p654qi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import p513bj.C14049b0;
import p513bj.C14076q;

/* renamed from: qi.b */
public final class C18451b {

    /* renamed from: h */
    public static final byte[] f40598h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f40599i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f40600j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f40601a;

    /* renamed from: b */
    public final Paint f40602b;

    /* renamed from: c */
    public final Canvas f40603c = new Canvas();

    /* renamed from: d */
    public final C18453b f40604d = new C18453b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    public final C18452a f40605e = new C18452a(0, new int[]{0, -1, -16777216, -8421505}, m31142a(), m31143b());

    /* renamed from: f */
    public final C18459h f40606f;

    /* renamed from: g */
    public Bitmap f40607g;

    /* renamed from: qi.b$a */
    public static final class C18452a {

        /* renamed from: a */
        public final int f40608a;

        /* renamed from: b */
        public final int[] f40609b;

        /* renamed from: c */
        public final int[] f40610c;

        /* renamed from: d */
        public final int[] f40611d;

        public C18452a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f40608a = i;
            this.f40609b = iArr;
            this.f40610c = iArr2;
            this.f40611d = iArr3;
        }
    }

    /* renamed from: qi.b$b */
    public static final class C18453b {

        /* renamed from: a */
        public final int f40612a;

        /* renamed from: b */
        public final int f40613b;

        /* renamed from: c */
        public final int f40614c;

        /* renamed from: d */
        public final int f40615d;

        /* renamed from: e */
        public final int f40616e;

        /* renamed from: f */
        public final int f40617f;

        public C18453b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f40612a = i;
            this.f40613b = i2;
            this.f40614c = i3;
            this.f40615d = i4;
            this.f40616e = i5;
            this.f40617f = i6;
        }
    }

    /* renamed from: qi.b$c */
    public static final class C18454c {

        /* renamed from: a */
        public final int f40618a;

        /* renamed from: b */
        public final boolean f40619b;

        /* renamed from: c */
        public final byte[] f40620c;

        /* renamed from: d */
        public final byte[] f40621d;

        public C18454c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f40618a = i;
            this.f40619b = z;
            this.f40620c = bArr;
            this.f40621d = bArr2;
        }
    }

    /* renamed from: qi.b$d */
    public static final class C18455d {

        /* renamed from: a */
        public final int f40622a;

        /* renamed from: b */
        public final int f40623b;

        /* renamed from: c */
        public final SparseArray<C18456e> f40624c;

        public C18455d(int i, int i2, SparseArray sparseArray) {
            this.f40622a = i;
            this.f40623b = i2;
            this.f40624c = sparseArray;
        }
    }

    /* renamed from: qi.b$e */
    public static final class C18456e {

        /* renamed from: a */
        public final int f40625a;

        /* renamed from: b */
        public final int f40626b;

        public C18456e(int i, int i2) {
            this.f40625a = i;
            this.f40626b = i2;
        }
    }

    /* renamed from: qi.b$f */
    public static final class C18457f {

        /* renamed from: a */
        public final int f40627a;

        /* renamed from: b */
        public final boolean f40628b;

        /* renamed from: c */
        public final int f40629c;

        /* renamed from: d */
        public final int f40630d;

        /* renamed from: e */
        public final int f40631e;

        /* renamed from: f */
        public final int f40632f;

        /* renamed from: g */
        public final int f40633g;

        /* renamed from: h */
        public final int f40634h;

        /* renamed from: i */
        public final int f40635i;

        /* renamed from: j */
        public final SparseArray<C18458g> f40636j;

        public C18457f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.f40627a = i;
            this.f40628b = z;
            this.f40629c = i2;
            this.f40630d = i3;
            this.f40631e = i4;
            this.f40632f = i5;
            this.f40633g = i6;
            this.f40634h = i7;
            this.f40635i = i8;
            this.f40636j = sparseArray;
        }
    }

    /* renamed from: qi.b$g */
    public static final class C18458g {

        /* renamed from: a */
        public final int f40637a;

        /* renamed from: b */
        public final int f40638b;

        public C18458g(int i, int i2) {
            this.f40637a = i;
            this.f40638b = i2;
        }
    }

    /* renamed from: qi.b$h */
    public static final class C18459h {

        /* renamed from: a */
        public final int f40639a;

        /* renamed from: b */
        public final int f40640b;

        /* renamed from: c */
        public final SparseArray<C18457f> f40641c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C18452a> f40642d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C18454c> f40643e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C18452a> f40644f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C18454c> f40645g = new SparseArray<>();

        /* renamed from: h */
        public C18453b f40646h;

        /* renamed from: i */
        public C18455d f40647i;

        public C18459h(int i, int i2) {
            this.f40639a = i;
            this.f40640b = i2;
        }
    }

    public C18451b(int i, int i2) {
        Paint paint = new Paint();
        this.f40601a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f40602b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f40606f = new C18459h(i, i2);
    }

    /* renamed from: a */
    public static int[] m31142a() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m31144c(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m31144c(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: b */
    public static int[] m31143b() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m31144c(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m31144c(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m31144c(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m31144c(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m31144c(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: c */
    public static int m31144c(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v14, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v19, types: [byte] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01f3 A[LOOP:3: B:83:0x0158->B:115:0x01f3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x012f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01ed A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0106 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0135 A[LOOP:2: B:36:0x009f->B:70:0x0135, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0165  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m31145d(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            bj.q r9 = new bj.q
            int r2 = r0.length
            r9.<init>((int) r2, (byte[]) r0)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            int r3 = r9.mo46895b()
            if (r3 == 0) goto L_0x0234
            r14 = 8
            int r3 = r9.mo46901h(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x022e
            r15 = 3
            r7 = 4
            r6 = 2
            r5 = 1
            r16 = 0
            switch(r3) {
                case 16: goto L_0x013d;
                case 17: goto L_0x008e;
                case 18: goto L_0x0031;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = r7
            switch(r3) {
                case 32: goto L_0x021e;
                case 33: goto L_0x020c;
                case 34: goto L_0x01f8;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0013
        L_0x0031:
            r15 = r2
            r2 = r16
        L_0x0034:
            int r3 = r9.mo46901h(r14)
            if (r3 == 0) goto L_0x003f
            r17 = r2
            r18 = r5
            goto L_0x0067
        L_0x003f:
            boolean r3 = r9.mo46900g()
            r4 = 7
            if (r3 != 0) goto L_0x005a
            int r3 = r9.mo46901h(r4)
            if (r3 == 0) goto L_0x0053
            r17 = r2
            r18 = r3
            r3 = r16
            goto L_0x0067
        L_0x0053:
            r17 = r5
            r3 = r16
            r18 = r3
            goto L_0x0067
        L_0x005a:
            int r3 = r9.mo46901h(r4)
            int r4 = r9.mo46901h(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0067:
            if (r18 == 0) goto L_0x0083
            if (r8 == 0) goto L_0x0083
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r6 = (float) r2
            int r2 = r10 + 1
            float r7 = (float) r2
            r2 = r29
            r0 = r5
            r5 = r6
            r6 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0084
        L_0x0083:
            r0 = r5
        L_0x0084:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x008a
            r2 = r15
            goto L_0x0013
        L_0x008a:
            r5 = r0
            r2 = r17
            goto L_0x0034
        L_0x008e:
            r0 = r5
            if (r1 != r15) goto L_0x009a
            if (r12 != 0) goto L_0x0096
            byte[] r3 = f40600j
            goto L_0x0097
        L_0x0096:
            r3 = r12
        L_0x0097:
            r17 = r3
            goto L_0x009c
        L_0x009a:
            r17 = 0
        L_0x009c:
            r5 = r2
            r2 = r16
        L_0x009f:
            int r3 = r9.mo46901h(r7)
            if (r3 == 0) goto L_0x00a7
            r4 = r0
            goto L_0x00f6
        L_0x00a7:
            boolean r3 = r9.mo46900g()
            if (r3 != 0) goto L_0x00b8
            int r3 = r9.mo46901h(r15)
            if (r3 == 0) goto L_0x00b6
            int r3 = r3 + 2
            goto L_0x00fe
        L_0x00b6:
            r2 = r0
            goto L_0x00d9
        L_0x00b8:
            boolean r3 = r9.mo46900g()
            if (r3 != 0) goto L_0x00cd
            int r3 = r9.mo46901h(r6)
            int r3 = r3 + r7
            int r4 = r9.mo46901h(r7)
        L_0x00c7:
            r22 = r4
            r4 = r3
            r3 = r22
            goto L_0x00f6
        L_0x00cd:
            int r3 = r9.mo46901h(r6)
            if (r3 == 0) goto L_0x00fd
            if (r3 == r0) goto L_0x00fb
            if (r3 == r6) goto L_0x00eb
            if (r3 == r15) goto L_0x00e0
        L_0x00d9:
            r18 = r2
            r3 = r16
            r19 = r3
            goto L_0x0104
        L_0x00e0:
            int r3 = r9.mo46901h(r14)
            int r3 = r3 + 25
            int r4 = r9.mo46901h(r7)
            goto L_0x00c7
        L_0x00eb:
            int r3 = r9.mo46901h(r7)
            int r3 = r3 + 9
            int r4 = r9.mo46901h(r7)
            goto L_0x00c7
        L_0x00f6:
            r18 = r2
            r19 = r4
            goto L_0x0104
        L_0x00fb:
            r3 = r6
            goto L_0x00fe
        L_0x00fd:
            r3 = r0
        L_0x00fe:
            r18 = r2
            r19 = r3
            r3 = r16
        L_0x0104:
            if (r19 == 0) goto L_0x0128
            if (r8 == 0) goto L_0x0128
            if (r17 == 0) goto L_0x010c
            byte r3 = r17[r3]
        L_0x010c:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r5
            float r4 = (float) r10
            int r2 = r5 + r19
            float r2 = (float) r2
            int r6 = r10 + 1
            float r6 = (float) r6
            r20 = r2
            r2 = r29
            r21 = r5
            r5 = r20
            r14 = 2
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x012b
        L_0x0128:
            r21 = r5
            r14 = r6
        L_0x012b:
            int r5 = r21 + r19
            if (r18 == 0) goto L_0x0135
            r9.mo46896c()
            r2 = r5
            goto L_0x0013
        L_0x0135:
            r6 = r14
            r2 = r18
            r7 = 4
            r14 = 8
            goto L_0x009f
        L_0x013d:
            r0 = r5
            r14 = r6
            if (r1 != r15) goto L_0x0148
            if (r11 != 0) goto L_0x0146
            byte[] r3 = f40599i
            goto L_0x0150
        L_0x0146:
            r3 = r11
            goto L_0x0150
        L_0x0148:
            if (r1 != r14) goto L_0x0153
            if (r13 != 0) goto L_0x014f
            byte[] r3 = f40598h
            goto L_0x0150
        L_0x014f:
            r3 = r13
        L_0x0150:
            r17 = r3
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            r7 = r2
            r5 = r16
        L_0x0158:
            int r2 = r9.mo46901h(r14)
            if (r2 == 0) goto L_0x0165
            r18 = r0
            r19 = r5
            r6 = 4
            goto L_0x01c2
        L_0x0165:
            boolean r2 = r9.mo46900g()
            if (r2 == 0) goto L_0x017b
            int r2 = r9.mo46901h(r15)
            int r2 = r2 + r15
            int r3 = r9.mo46901h(r14)
            r6 = 4
        L_0x0175:
            r22 = r3
            r3 = r2
            r2 = r22
            goto L_0x01ac
        L_0x017b:
            boolean r2 = r9.mo46900g()
            if (r2 == 0) goto L_0x0184
            r2 = r0
            r6 = 4
            goto L_0x01b3
        L_0x0184:
            int r2 = r9.mo46901h(r14)
            if (r2 == 0) goto L_0x01ba
            if (r2 == r0) goto L_0x01b1
            if (r2 == r14) goto L_0x01a0
            if (r2 == r15) goto L_0x0192
            r6 = 4
            goto L_0x01bc
        L_0x0192:
            r2 = 8
            int r3 = r9.mo46901h(r2)
            int r3 = r3 + 29
            int r2 = r9.mo46901h(r14)
            r6 = 4
            goto L_0x01ac
        L_0x01a0:
            r6 = 4
            int r2 = r9.mo46901h(r6)
            int r2 = r2 + 12
            int r3 = r9.mo46901h(r14)
            goto L_0x0175
        L_0x01ac:
            r18 = r3
            r19 = r5
            goto L_0x01c2
        L_0x01b1:
            r6 = 4
            r2 = r14
        L_0x01b3:
            r18 = r2
            r19 = r5
            r2 = r16
            goto L_0x01c2
        L_0x01ba:
            r6 = 4
            r5 = r0
        L_0x01bc:
            r19 = r5
            r2 = r16
            r18 = r2
        L_0x01c2:
            if (r18 == 0) goto L_0x01e6
            if (r8 == 0) goto L_0x01e6
            if (r17 == 0) goto L_0x01ca
            byte r2 = r17[r2]
        L_0x01ca:
            r2 = r24[r2]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r2 = (float) r2
            r21 = r2
            r2 = r29
            r0 = r6
            r6 = r21
            r21 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x01e9
        L_0x01e6:
            r0 = r6
            r21 = r7
        L_0x01e9:
            int r7 = r21 + r18
            if (r19 == 0) goto L_0x01f3
            r9.mo46896c()
            r2 = r7
            goto L_0x0013
        L_0x01f3:
            r5 = r19
            r0 = 1
            goto L_0x0158
        L_0x01f8:
            r0 = 16
            byte[] r12 = new byte[r0]
            r3 = r16
        L_0x01fe:
            if (r3 >= r0) goto L_0x0013
            r4 = 8
            int r5 = r9.mo46901h(r4)
            byte r4 = (byte) r5
            r12[r3] = r4
            int r3 = r3 + 1
            goto L_0x01fe
        L_0x020c:
            byte[] r11 = new byte[r0]
            r3 = r16
        L_0x0210:
            if (r3 >= r0) goto L_0x0013
            r4 = 8
            int r5 = r9.mo46901h(r4)
            byte r5 = (byte) r5
            r11[r3] = r5
            int r3 = r3 + 1
            goto L_0x0210
        L_0x021e:
            byte[] r13 = new byte[r0]
            r3 = r16
        L_0x0222:
            if (r3 >= r0) goto L_0x0013
            int r4 = r9.mo46901h(r0)
            byte r4 = (byte) r4
            r13[r3] = r4
            int r3 = r3 + 1
            goto L_0x0222
        L_0x022e:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0013
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p654qi.C18451b.m31145d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: e */
    public static C18452a m31146e(C14076q qVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C14076q qVar2 = qVar;
        int i6 = 8;
        int h = qVar2.mo46901h(8);
        qVar2.mo46907n(8);
        int i7 = i - 2;
        int i8 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] a = m31142a();
        int[] b = m31143b();
        while (i7 > 0) {
            int h2 = qVar2.mo46901h(i6);
            int h3 = qVar2.mo46901h(i6);
            int i9 = i7 - 2;
            int[] iArr2 = (h3 & 128) != 0 ? iArr : (h3 & 64) != 0 ? a : b;
            if ((h3 & 1) != 0) {
                i5 = qVar2.mo46901h(i6);
                i4 = qVar2.mo46901h(i6);
                i3 = qVar2.mo46901h(i6);
                i2 = qVar2.mo46901h(i6);
                i7 = i9 - 4;
            } else {
                i7 = i9 - 2;
                i4 = qVar2.mo46901h(i8) << i8;
                i2 = qVar2.mo46901h(2) << 6;
                i5 = qVar2.mo46901h(6) << 2;
                i3 = qVar2.mo46901h(i8) << i8;
            }
            if (i5 == 0) {
                i2 = 255;
                i4 = 0;
                i3 = 0;
            }
            double d = (double) i5;
            double d2 = (double) (i4 - 128);
            double d3 = (double) (i3 - 128);
            iArr2[h2] = m31144c((byte) (255 - (i2 & 255)), C14049b0.m21636i((int) ((1.402d * d2) + d), 0, 255), C14049b0.m21636i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C14049b0.m21636i((int) ((d3 * 1.772d) + d), 0, 255));
            iArr = iArr;
            h = h;
            i6 = 8;
            i8 = 4;
        }
        return new C18452a(h, iArr, a, b);
    }

    /* renamed from: f */
    public static C18454c m31147f(C14076q qVar) {
        byte[] bArr;
        int h = qVar.mo46901h(16);
        qVar.mo46907n(4);
        int h2 = qVar.mo46901h(2);
        boolean g = qVar.mo46900g();
        qVar.mo46907n(1);
        byte[] bArr2 = C14049b0.f30918f;
        if (h2 == 1) {
            qVar.mo46907n(qVar.mo46901h(8) * 16);
        } else if (h2 == 0) {
            int h3 = qVar.mo46901h(16);
            int h4 = qVar.mo46901h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                qVar.mo46903j(h3, bArr2);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                qVar.mo46903j(h4, bArr);
                return new C18454c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C18454c(h, g, bArr2, bArr);
    }
}
