package p138i4;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.C5996b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p138i4.C6987a;
import p254u4.C8160b;

/* renamed from: i4.e */
public final class C6992e implements C6987a {

    /* renamed from: a */
    public int[] f15511a;

    /* renamed from: b */
    public final int[] f15512b = new int[256];

    /* renamed from: c */
    public final C6987a.C6988a f15513c;

    /* renamed from: d */
    public ByteBuffer f15514d;

    /* renamed from: e */
    public byte[] f15515e;

    /* renamed from: f */
    public short[] f15516f;

    /* renamed from: g */
    public byte[] f15517g;

    /* renamed from: h */
    public byte[] f15518h;

    /* renamed from: i */
    public byte[] f15519i;

    /* renamed from: j */
    public int[] f15520j;

    /* renamed from: k */
    public int f15521k;

    /* renamed from: l */
    public C6990c f15522l;

    /* renamed from: m */
    public Bitmap f15523m;

    /* renamed from: n */
    public boolean f15524n;

    /* renamed from: o */
    public int f15525o;

    /* renamed from: p */
    public int f15526p;

    /* renamed from: q */
    public int f15527q;

    /* renamed from: r */
    public int f15528r;

    /* renamed from: s */
    public Boolean f15529s;

    /* renamed from: t */
    public Bitmap.Config f15530t = Bitmap.Config.ARGB_8888;

    public C6992e(C8160b bVar, C6990c cVar, ByteBuffer byteBuffer, int i) {
        this.f15513c = bVar;
        this.f15522l = new C6990c();
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.f15525o = 0;
                this.f15522l = cVar;
                this.f15521k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f15514d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f15514d.order(ByteOrder.LITTLE_ENDIAN);
                this.f15524n = false;
                Iterator it = cVar.f15499e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C6989b) it.next()).f15490g == 3) {
                            this.f15524n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f15526p = highestOneBit;
                int i2 = cVar.f15500f;
                this.f15528r = i2 / highestOneBit;
                int i3 = cVar.f15501g;
                this.f15527q = i3 / highestOneBit;
                int i4 = i2 * i3;
                C5996b bVar2 = ((C8160b) this.f15513c).f17915b;
                this.f15519i = bVar2 == null ? new byte[i4] : (byte[]) bVar2.mo16914c(i4, byte[].class);
                C6987a.C6988a aVar = this.f15513c;
                int i5 = this.f15528r * this.f15527q;
                C5996b bVar3 = ((C8160b) aVar).f17915b;
                this.f15520j = bVar3 == null ? new int[i5] : (int[]) bVar3.mo16914c(i5, int[].class);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        }
    }

    /* renamed from: a */
    public final Bitmap mo19172a() {
        Boolean bool = this.f15529s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f15530t;
        Bitmap d = ((C8160b) this.f15513c).f17914a.mo16923d(this.f15528r, this.f15527q, config);
        d.setHasAlpha(true);
        return d;
    }

    /* renamed from: b */
    public final void mo19155b() {
        this.f15521k = (this.f15521k + 1) % this.f15522l.f15497c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f6, code lost:
        return null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo19156c() {
        /*
            r8 = this;
            monitor-enter(r8)
            i4.c r0 = r8.f15522l     // Catch:{ all -> 0x00f7 }
            int r0 = r0.f15497c     // Catch:{ all -> 0x00f7 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r8.f15521k     // Catch:{ all -> 0x00f7 }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "e"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r3.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            i4.c r4 = r8.f15522l     // Catch:{ all -> 0x00f7 }
            int r4 = r4.f15497c     // Catch:{ all -> 0x00f7 }
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            int r4 = r8.f15521k     // Catch:{ all -> 0x00f7 }
            r3.append(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f7 }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00f7 }
        L_0x0039:
            r8.f15525o = r2     // Catch:{ all -> 0x00f7 }
        L_0x003b:
            int r0 = r8.f15525o     // Catch:{ all -> 0x00f7 }
            r3 = 0
            if (r0 == r2) goto L_0x00d5
            r4 = 2
            if (r0 != r4) goto L_0x0045
            goto L_0x00d5
        L_0x0045:
            r0 = 0
            r8.f15525o = r0     // Catch:{ all -> 0x00f7 }
            byte[] r5 = r8.f15515e     // Catch:{ all -> 0x00f7 }
            if (r5 != 0) goto L_0x0063
            i4.a$a r5 = r8.f15513c     // Catch:{ all -> 0x00f7 }
            r6 = 255(0xff, float:3.57E-43)
            u4.b r5 = (p254u4.C8160b) r5     // Catch:{ all -> 0x00f7 }
            com.bumptech.glide.load.engine.bitmap_recycle.b r5 = r5.f17915b     // Catch:{ all -> 0x00f7 }
            if (r5 != 0) goto L_0x0059
            byte[] r5 = new byte[r6]     // Catch:{ all -> 0x00f7 }
            goto L_0x0061
        L_0x0059:
            java.lang.Class<byte[]> r7 = byte[].class
            java.lang.Object r5 = r5.mo16914c(r6, r7)     // Catch:{ all -> 0x00f7 }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x00f7 }
        L_0x0061:
            r8.f15515e = r5     // Catch:{ all -> 0x00f7 }
        L_0x0063:
            i4.c r5 = r8.f15522l     // Catch:{ all -> 0x00f7 }
            java.util.ArrayList r5 = r5.f15499e     // Catch:{ all -> 0x00f7 }
            int r6 = r8.f15521k     // Catch:{ all -> 0x00f7 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x00f7 }
            i4.b r5 = (p138i4.C6989b) r5     // Catch:{ all -> 0x00f7 }
            int r6 = r8.f15521k     // Catch:{ all -> 0x00f7 }
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x007f
            i4.c r7 = r8.f15522l     // Catch:{ all -> 0x00f7 }
            java.util.ArrayList r7 = r7.f15499e     // Catch:{ all -> 0x00f7 }
            java.lang.Object r6 = r7.get(r6)     // Catch:{ all -> 0x00f7 }
            i4.b r6 = (p138i4.C6989b) r6     // Catch:{ all -> 0x00f7 }
            goto L_0x0080
        L_0x007f:
            r6 = r3
        L_0x0080:
            int[] r7 = r5.f15494k     // Catch:{ all -> 0x00f7 }
            if (r7 == 0) goto L_0x0085
            goto L_0x0089
        L_0x0085:
            i4.c r7 = r8.f15522l     // Catch:{ all -> 0x00f7 }
            int[] r7 = r7.f15495a     // Catch:{ all -> 0x00f7 }
        L_0x0089:
            r8.f15511a = r7     // Catch:{ all -> 0x00f7 }
            if (r7 != 0) goto L_0x00b1
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r1.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00f7 }
            int r4 = r8.f15521k     // Catch:{ all -> 0x00f7 }
            r1.append(r4)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f7 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f7 }
        L_0x00ad:
            r8.f15525o = r2     // Catch:{ all -> 0x00f7 }
            monitor-exit(r8)
            return r3
        L_0x00b1:
            boolean r1 = r5.f15489f     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x00cf
            int[] r1 = r8.f15512b     // Catch:{ all -> 0x00f7 }
            int r2 = r7.length     // Catch:{ all -> 0x00f7 }
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)     // Catch:{ all -> 0x00f7 }
            int[] r1 = r8.f15512b     // Catch:{ all -> 0x00f7 }
            r8.f15511a = r1     // Catch:{ all -> 0x00f7 }
            int r2 = r5.f15491h     // Catch:{ all -> 0x00f7 }
            r1[r2] = r0     // Catch:{ all -> 0x00f7 }
            int r0 = r5.f15490g     // Catch:{ all -> 0x00f7 }
            if (r0 != r4) goto L_0x00cf
            int r0 = r8.f15521k     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x00cf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00f7 }
            r8.f15529s = r0     // Catch:{ all -> 0x00f7 }
        L_0x00cf:
            android.graphics.Bitmap r0 = r8.mo19174k(r5, r6)     // Catch:{ all -> 0x00f7 }
            monitor-exit(r8)
            return r0
        L_0x00d5:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "e"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f7 }
            r1.<init>()     // Catch:{ all -> 0x00f7 }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00f7 }
            int r2 = r8.f15525o     // Catch:{ all -> 0x00f7 }
            r1.append(r2)     // Catch:{ all -> 0x00f7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f7 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00f7 }
        L_0x00f5:
            monitor-exit(r8)
            return r3
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p138i4.C6992e.mo19156c():android.graphics.Bitmap");
    }

    public final void clear() {
        C5996b bVar;
        C5996b bVar2;
        C5996b bVar3;
        this.f15522l = null;
        byte[] bArr = this.f15519i;
        if (!(bArr == null || (bVar3 = ((C8160b) this.f15513c).f17915b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f15520j;
        if (!(iArr == null || (bVar2 = ((C8160b) this.f15513c).f17915b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f15523m;
        if (bitmap != null) {
            ((C8160b) this.f15513c).f17914a.mo16924e(bitmap);
        }
        this.f15523m = null;
        this.f15514d = null;
        this.f15529s = null;
        byte[] bArr2 = this.f15515e;
        if (bArr2 != null && (bVar = ((C8160b) this.f15513c).f17915b) != null) {
            bVar.put(bArr2);
        }
    }

    /* renamed from: d */
    public final int mo19158d() {
        return this.f15522l.f15497c;
    }

    /* renamed from: e */
    public final int mo19159e() {
        int i = this.f15522l.f15506l;
        if (i == -1) {
            return 1;
        }
        if (i == 0) {
            return 0;
        }
        return i + 1;
    }

    /* renamed from: f */
    public final int mo19160f() {
        int i;
        C6990c cVar = this.f15522l;
        int i2 = cVar.f15497c;
        if (i2 <= 0 || (i = this.f15521k) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return ((C6989b) cVar.f15499e.get(i)).f15492i;
    }

    /* renamed from: g */
    public final void mo19161g() {
        this.f15521k = -1;
    }

    public final ByteBuffer getData() {
        return this.f15514d;
    }

    /* renamed from: h */
    public final int mo19163h() {
        return this.f15521k;
    }

    /* renamed from: i */
    public final int mo19164i() {
        return (this.f15520j.length * 4) + this.f15514d.limit() + this.f15519i.length;
    }

    /* renamed from: j */
    public final void mo19173j(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f15530t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f15504j == r1.f15491h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r0v25, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo19174k(p138i4.C6989b r34, p138i4.C6989b r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            int[] r10 = r0.f15520j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f15523m
            if (r3 == 0) goto L_0x0018
            i4.a$a r4 = r0.f15513c
            u4.b r4 = (p254u4.C8160b) r4
            com.bumptech.glide.load.engine.bitmap_recycle.d r4 = r4.f17914a
            r4.mo16924e(r3)
        L_0x0018:
            r3 = 0
            r0.f15523m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r3 = 3
            if (r2 == 0) goto L_0x002c
            int r4 = r2.f15490g
            if (r4 != r3) goto L_0x002c
            android.graphics.Bitmap r4 = r0.f15523m
            if (r4 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r4 = 2
            if (r2 == 0) goto L_0x007e
            int r5 = r2.f15490g
            if (r5 <= 0) goto L_0x007e
            if (r5 != r4) goto L_0x006c
            boolean r3 = r1.f15489f
            if (r3 != 0) goto L_0x0047
            i4.c r3 = r0.f15522l
            int r4 = r3.f15505k
            int[] r5 = r1.f15494k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f15504j
            int r5 = r1.f15491h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = r11
        L_0x0048:
            int r3 = r2.f15487d
            int r5 = r0.f15526p
            int r3 = r3 / r5
            int r6 = r2.f15485b
            int r6 = r6 / r5
            int r7 = r2.f15486c
            int r7 = r7 / r5
            int r2 = r2.f15484a
            int r2 = r2 / r5
            int r5 = r0.f15528r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005c:
            if (r6 >= r3) goto L_0x007e
            int r2 = r6 + r7
            r5 = r6
        L_0x0061:
            if (r5 >= r2) goto L_0x0068
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0068:
            int r2 = r0.f15528r
            int r6 = r6 + r2
            goto L_0x005c
        L_0x006c:
            if (r5 != r3) goto L_0x007e
            android.graphics.Bitmap r2 = r0.f15523m
            if (r2 == 0) goto L_0x007e
            r4 = 0
            int r8 = r0.f15528r
            r6 = 0
            r7 = 0
            int r9 = r0.f15527q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x007e:
            java.nio.ByteBuffer r2 = r0.f15514d
            int r3 = r1.f15493j
            r2.position(r3)
            int r2 = r1.f15486c
            int r3 = r1.f15487d
            int r2 = r2 * r3
            byte[] r3 = r0.f15519i
            if (r3 == 0) goto L_0x0091
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a6
        L_0x0091:
            i4.a$a r3 = r0.f15513c
            u4.b r3 = (p254u4.C8160b) r3
            com.bumptech.glide.load.engine.bitmap_recycle.b r3 = r3.f17915b
            if (r3 != 0) goto L_0x009c
            byte[] r3 = new byte[r2]
            goto L_0x00a4
        L_0x009c:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.mo16914c(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a4:
            r0.f15519i = r3
        L_0x00a6:
            byte[] r3 = r0.f15519i
            short[] r4 = r0.f15516f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b2
            short[] r4 = new short[r5]
            r0.f15516f = r4
        L_0x00b2:
            short[] r4 = r0.f15516f
            byte[] r6 = r0.f15517g
            if (r6 != 0) goto L_0x00bc
            byte[] r5 = new byte[r5]
            r0.f15517g = r5
        L_0x00bc:
            byte[] r5 = r0.f15517g
            byte[] r6 = r0.f15518h
            if (r6 != 0) goto L_0x00c8
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f15518h = r6
        L_0x00c8:
            byte[] r6 = r0.f15518h
            java.nio.ByteBuffer r7 = r0.f15514d
            byte r7 = r7.get()
            r7 = r7 & 255(0xff, float:3.57E-43)
            r8 = 1
            int r9 = r8 << r7
            int r12 = r9 + 1
            int r13 = r9 + 2
            int r7 = r7 + r8
            int r8 = r8 << r7
            int r8 = r8 + -1
            r14 = r11
        L_0x00de:
            if (r14 >= r9) goto L_0x00e8
            r4[r14] = r11
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x00de
        L_0x00e8:
            byte[] r14 = r0.f15515e
            r15 = -1
            r35 = r7
            r25 = r35
            r23 = r8
            r26 = r23
            r7 = r11
            r16 = r7
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r24 = r13
            r22 = r15
            r8 = r0
            r15 = r21
        L_0x0107:
            r27 = 8
            if (r11 >= r2) goto L_0x020b
            if (r16 != 0) goto L_0x0141
            java.nio.ByteBuffer r15 = r0.f15514d
            byte r15 = r15.get()
            r15 = r15 & 255(0xff, float:3.57E-43)
            if (r15 > 0) goto L_0x011e
            r30 = r10
            r28 = r11
            r29 = r13
            goto L_0x0134
        L_0x011e:
            r28 = r11
            java.nio.ByteBuffer r11 = r8.f15514d
            r29 = r13
            byte[] r13 = r8.f15515e
            r30 = r10
            int r10 = r11.remaining()
            int r10 = java.lang.Math.min(r15, r10)
            r0 = 0
            r11.get(r13, r0, r10)
        L_0x0134:
            if (r15 > 0) goto L_0x013c
            r0 = 3
            r8.f15525o = r0
            r15 = 0
            goto L_0x020d
        L_0x013c:
            r17 = 0
            r16 = r15
            goto L_0x0147
        L_0x0141:
            r30 = r10
            r28 = r11
            r29 = r13
        L_0x0147:
            byte r0 = r14[r17]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << r18
            int r19 = r19 + r0
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r0 = r18
            r10 = r20
            r13 = r22
            r15 = r24
            r11 = r28
            r18 = r8
            r8 = r25
        L_0x0163:
            if (r0 < r8) goto L_0x01eb
            r20 = r14
            r14 = r19 & r26
            int r19 = r19 >> r8
            int r0 = r0 - r8
            if (r14 != r9) goto L_0x0180
            r8 = -1
            r22 = r6
            r13 = r8
            r26 = r23
            r15 = r29
            r8 = r35
            r32 = r18
            r18 = r0
            r0 = r32
            goto L_0x01df
        L_0x0180:
            if (r14 != r12) goto L_0x0186
            r22 = r6
            goto L_0x01f1
        L_0x0186:
            r18 = r0
            r0 = -1
            if (r13 != r0) goto L_0x019c
            byte r0 = r5[r14]
            r3[r7] = r0
            int r7 = r7 + 1
            int r11 = r11 + 1
            r10 = r14
            r13 = r10
            r0 = r18
            r14 = r20
            r18 = r33
            goto L_0x0163
        L_0x019c:
            if (r14 < r15) goto L_0x01a5
            byte r0 = (byte) r10
            r6[r21] = r0
            int r21 = r21 + 1
            r0 = r13
            goto L_0x01a6
        L_0x01a5:
            r0 = r14
        L_0x01a6:
            if (r0 < r9) goto L_0x01b1
            byte r10 = r5[r0]
            r6[r21] = r10
            int r21 = r21 + 1
            short r0 = r4[r0]
            goto L_0x01a6
        L_0x01b1:
            byte r0 = r5[r0]
            r10 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r10
            r3[r7] = r0
        L_0x01b8:
            int r7 = r7 + 1
            int r11 = r11 + 1
            if (r21 <= 0) goto L_0x01c5
            int r21 = r21 + -1
            byte r22 = r6[r21]
            r3[r7] = r22
            goto L_0x01b8
        L_0x01c5:
            r22 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r15 >= r6) goto L_0x01dc
            short r13 = (short) r13
            r4[r15] = r13
            r5[r15] = r0
            int r15 = r15 + 1
            r0 = r15 & r26
            if (r0 != 0) goto L_0x01dc
            if (r15 >= r6) goto L_0x01dc
            int r8 = r8 + 1
            int r26 = r26 + r15
        L_0x01dc:
            r0 = r33
            r13 = r14
        L_0x01df:
            r14 = r20
            r6 = r22
            r32 = r18
            r18 = r0
            r0 = r32
            goto L_0x0163
        L_0x01eb:
            r22 = r6
            r20 = r14
            r18 = r33
        L_0x01f1:
            r6 = 0
            r25 = r8
            r24 = r15
            r8 = r18
            r14 = r20
            r18 = r0
            r15 = r6
            r20 = r10
            r6 = r22
            r10 = r30
            r0 = r33
            r22 = r13
            r13 = r29
            goto L_0x0107
        L_0x020b:
            r30 = r10
        L_0x020d:
            java.util.Arrays.fill(r3, r7, r2, r15)
            boolean r0 = r1.f15488e
            if (r0 != 0) goto L_0x0287
            r0 = r33
            int r2 = r0.f15526p
            r3 = 1
            if (r2 == r3) goto L_0x021d
            goto L_0x0289
        L_0x021d:
            int[] r2 = r0.f15520j
            int r3 = r1.f15487d
            int r4 = r1.f15485b
            int r5 = r1.f15486c
            int r6 = r1.f15484a
            int r7 = r0.f15521k
            if (r7 != 0) goto L_0x022d
            r7 = 1
            goto L_0x022e
        L_0x022d:
            r7 = r15
        L_0x022e:
            int r8 = r0.f15528r
            byte[] r9 = r0.f15519i
            int[] r10 = r0.f15511a
            r11 = -1
        L_0x0235:
            if (r15 >= r3) goto L_0x0269
            int r12 = r15 + r4
            int r12 = r12 * r8
            int r13 = r12 + r6
            int r14 = r13 + r5
            int r12 = r12 + r8
            if (r12 >= r14) goto L_0x0242
            r14 = r12
        L_0x0242:
            int r12 = r1.f15486c
            int r12 = r12 * r15
        L_0x0245:
            if (r13 >= r14) goto L_0x0262
            r16 = r3
            byte r3 = r9[r12]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r11) goto L_0x0259
            r4 = r10[r4]
            if (r4 == 0) goto L_0x0258
            r2[r13] = r4
            goto L_0x0259
        L_0x0258:
            r11 = r3
        L_0x0259:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r3 = r16
            r4 = r17
            goto L_0x0245
        L_0x0262:
            r16 = r3
            r17 = r4
            int r15 = r15 + 1
            goto L_0x0235
        L_0x0269:
            java.lang.Boolean r2 = r0.f15529s
            if (r2 == 0) goto L_0x0273
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x027c
        L_0x0273:
            java.lang.Boolean r2 = r0.f15529s
            if (r2 != 0) goto L_0x027e
            if (r7 == 0) goto L_0x027e
            r2 = -1
            if (r11 == r2) goto L_0x027e
        L_0x027c:
            r2 = 1
            goto L_0x027f
        L_0x027e:
            r2 = 0
        L_0x027f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f15529s = r2
            goto L_0x040b
        L_0x0287:
            r0 = r33
        L_0x0289:
            int[] r2 = r0.f15520j
            int r3 = r1.f15487d
            int r4 = r0.f15526p
            int r3 = r3 / r4
            int r5 = r1.f15485b
            int r5 = r5 / r4
            int r6 = r1.f15486c
            int r6 = r6 / r4
            int r7 = r1.f15484a
            int r7 = r7 / r4
            int r8 = r0.f15521k
            if (r8 != 0) goto L_0x029f
            r8 = 1
            goto L_0x02a0
        L_0x029f:
            r8 = 0
        L_0x02a0:
            int r9 = r0.f15528r
            int r10 = r0.f15527q
            byte[] r11 = r0.f15519i
            int[] r12 = r0.f15511a
            java.lang.Boolean r13 = r0.f15529s
            r14 = 0
            r15 = 0
            r16 = 1
        L_0x02ae:
            if (r14 >= r3) goto L_0x03f7
            r35 = r13
            boolean r13 = r1.f15488e
            if (r13 == 0) goto L_0x02d7
            if (r15 < r3) goto L_0x02d2
            int r13 = r16 + 1
            r17 = r3
            r3 = 2
            if (r13 == r3) goto L_0x02ce
            r3 = 3
            if (r13 == r3) goto L_0x02ca
            r3 = 4
            if (r13 == r3) goto L_0x02c6
            goto L_0x02cf
        L_0x02c6:
            r15 = 1
            r27 = 2
            goto L_0x02cf
        L_0x02ca:
            r27 = 4
            r15 = 2
            goto L_0x02cf
        L_0x02ce:
            r15 = 4
        L_0x02cf:
            r16 = r13
            goto L_0x02d4
        L_0x02d2:
            r17 = r3
        L_0x02d4:
            int r3 = r15 + r27
            goto L_0x02db
        L_0x02d7:
            r17 = r3
            r3 = r15
            r15 = r14
        L_0x02db:
            int r15 = r15 + r5
            r13 = 1
            if (r4 != r13) goto L_0x02e1
            r13 = 1
            goto L_0x02e2
        L_0x02e1:
            r13 = 0
        L_0x02e2:
            if (r15 >= r10) goto L_0x03d7
            int r15 = r15 * r9
            int r18 = r15 + r7
            r19 = r3
            int r3 = r18 + r6
            int r15 = r15 + r9
            if (r15 >= r3) goto L_0x02ef
            r3 = r15
        L_0x02ef:
            int r15 = r14 * r4
            r20 = r5
            int r5 = r1.f15486c
            int r15 = r15 * r5
            if (r13 == 0) goto L_0x0318
            r13 = r35
            r5 = r18
        L_0x02fc:
            r21 = r6
            if (r5 >= r3) goto L_0x03d0
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x030b
            r2[r5] = r6
            goto L_0x0312
        L_0x030b:
            if (r8 == 0) goto L_0x0312
            if (r13 != 0) goto L_0x0312
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r13 = r6
        L_0x0312:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r21
            goto L_0x02fc
        L_0x0318:
            r21 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r13 = r35
            r6 = r18
        L_0x0322:
            if (r6 >= r3) goto L_0x03d0
            r18 = r3
            int r3 = r1.f15486c
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = r7
            r29 = r9
            r7 = r15
        L_0x0337:
            int r9 = r0.f15526p
            int r9 = r9 + r15
            if (r7 >= r9) goto L_0x036c
            byte[] r9 = r0.f15519i
            r31 = r10
            int r10 = r9.length
            if (r7 >= r10) goto L_0x036e
            if (r7 >= r5) goto L_0x036e
            byte r9 = r9[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int[] r10 = r0.f15511a
            r9 = r10[r9]
            if (r9 == 0) goto L_0x0367
            int r10 = r9 >> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r10
            int r10 = r9 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r10
            int r10 = r9 >> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r10
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r26 = r26 + 1
        L_0x0367:
            int r7 = r7 + 1
            r10 = r31
            goto L_0x0337
        L_0x036c:
            r31 = r10
        L_0x036e:
            int r3 = r3 + r15
            r7 = r3
        L_0x0370:
            int r9 = r0.f15526p
            int r9 = r9 + r3
            if (r7 >= r9) goto L_0x03a1
            byte[] r9 = r0.f15519i
            int r10 = r9.length
            if (r7 >= r10) goto L_0x03a1
            if (r7 >= r5) goto L_0x03a1
            byte r9 = r9[r7]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int[] r10 = r0.f15511a
            r9 = r10[r9]
            if (r9 == 0) goto L_0x039e
            int r10 = r9 >> 24
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r22 = r22 + r10
            int r10 = r9 >> 16
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r23 = r23 + r10
            int r10 = r9 >> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r10
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r26 = r26 + 1
        L_0x039e:
            int r7 = r7 + 1
            goto L_0x0370
        L_0x03a1:
            if (r26 != 0) goto L_0x03a5
            r3 = 0
            goto L_0x03b7
        L_0x03a5:
            int r22 = r22 / r26
            int r3 = r22 << 24
            int r23 = r23 / r26
            int r7 = r23 << 16
            r3 = r3 | r7
            int r24 = r24 / r26
            int r7 = r24 << 8
            r3 = r3 | r7
            int r25 = r25 / r26
            r3 = r3 | r25
        L_0x03b7:
            if (r3 == 0) goto L_0x03bc
            r2[r6] = r3
            goto L_0x03c3
        L_0x03bc:
            if (r8 == 0) goto L_0x03c3
            if (r13 != 0) goto L_0x03c3
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r13 = r3
        L_0x03c3:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r28
            r9 = r29
            r10 = r31
            goto L_0x0322
        L_0x03d0:
            r28 = r7
            r29 = r9
            r31 = r10
            goto L_0x03e5
        L_0x03d7:
            r19 = r3
            r20 = r5
            r21 = r6
            r28 = r7
            r29 = r9
            r31 = r10
            r13 = r35
        L_0x03e5:
            int r14 = r14 + 1
            r3 = r17
            r15 = r19
            r5 = r20
            r6 = r21
            r7 = r28
            r9 = r29
            r10 = r31
            goto L_0x02ae
        L_0x03f7:
            r35 = r13
            java.lang.Boolean r2 = r0.f15529s
            if (r2 != 0) goto L_0x040b
            if (r35 != 0) goto L_0x0401
            r2 = 0
            goto L_0x0405
        L_0x0401:
            boolean r2 = r35.booleanValue()
        L_0x0405:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.f15529s = r2
        L_0x040b:
            boolean r2 = r0.f15524n
            if (r2 == 0) goto L_0x042f
            int r1 = r1.f15490g
            if (r1 == 0) goto L_0x0416
            r2 = 1
            if (r1 != r2) goto L_0x042f
        L_0x0416:
            android.graphics.Bitmap r1 = r0.f15523m
            if (r1 != 0) goto L_0x0420
            android.graphics.Bitmap r1 = r33.mo19172a()
            r0.f15523m = r1
        L_0x0420:
            android.graphics.Bitmap r1 = r0.f15523m
            r3 = 0
            int r7 = r0.f15528r
            r5 = 0
            r6 = 0
            int r8 = r0.f15527q
            r2 = r30
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x042f:
            android.graphics.Bitmap r9 = r33.mo19172a()
            r3 = 0
            int r7 = r0.f15528r
            r5 = 0
            r6 = 0
            int r8 = r0.f15527q
            r1 = r9
            r2 = r30
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p138i4.C6992e.mo19174k(i4.b, i4.b):android.graphics.Bitmap");
    }
}
