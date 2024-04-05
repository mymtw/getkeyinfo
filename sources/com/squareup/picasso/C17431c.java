package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.Listing;
import com.squareup.picasso.C17443i;
import com.squareup.picasso.C17462u;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.c */
public final class C17431c implements Runnable {

    /* renamed from: u */
    public static final Object f38075u = new Object();

    /* renamed from: v */
    public static final C17432a f38076v = new C17432a();

    /* renamed from: w */
    public static final AtomicInteger f38077w = new AtomicInteger();

    /* renamed from: x */
    public static final C17433b f38078x = new C17433b();

    /* renamed from: b */
    public final int f38079b = f38077w.incrementAndGet();

    /* renamed from: c */
    public final Picasso f38080c;

    /* renamed from: d */
    public final C17443i f38081d;

    /* renamed from: e */
    public final C17438d f38082e;

    /* renamed from: f */
    public final C17465w f38083f;

    /* renamed from: g */
    public final String f38084g;

    /* renamed from: h */
    public final C17459s f38085h;

    /* renamed from: i */
    public final int f38086i;

    /* renamed from: j */
    public int f38087j;

    /* renamed from: k */
    public final C17462u f38088k;

    /* renamed from: l */
    public C17425a f38089l;

    /* renamed from: m */
    public ArrayList f38090m;

    /* renamed from: n */
    public Bitmap f38091n;

    /* renamed from: o */
    public Future<?> f38092o;

    /* renamed from: p */
    public Picasso.LoadedFrom f38093p;

    /* renamed from: q */
    public Exception f38094q;

    /* renamed from: r */
    public int f38095r;

    /* renamed from: s */
    public int f38096s;

    /* renamed from: t */
    public Picasso.Priority f38097t;

    /* renamed from: com.squareup.picasso.c$a */
    public static class C17432a extends ThreadLocal<StringBuilder> {
        public final Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    public static class C17433b extends C17462u {
        /* renamed from: b */
        public final boolean mo68565b(C17459s sVar) {
            return true;
        }

        /* renamed from: e */
        public final C17462u.C17463a mo68566e(C17459s sVar, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + sVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    public static class C17434c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C17469y f38098b;

        /* renamed from: c */
        public final /* synthetic */ RuntimeException f38099c;

        public C17434c(C17469y yVar, RuntimeException runtimeException) {
            this.f38098b = yVar;
            this.f38099c = runtimeException;
        }

        public final void run() {
            StringBuilder h = C0072d.m201h("Transformation ");
            h.append(this.f38098b.key());
            h.append(" crashed with exception.");
            throw new RuntimeException(h.toString(), this.f38099c);
        }
    }

    /* renamed from: com.squareup.picasso.c$d */
    public static class C17435d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ StringBuilder f38100b;

        public C17435d(StringBuilder sb) {
            this.f38100b = sb;
        }

        public final void run() {
            throw new NullPointerException(this.f38100b.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$e */
    public static class C17436e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C17469y f38101b;

        public C17436e(C17469y yVar) {
            this.f38101b = yVar;
        }

        public final void run() {
            StringBuilder h = C0072d.m201h("Transformation ");
            h.append(this.f38101b.key());
            h.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(h.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$f */
    public static class C17437f implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C17469y f38102b;

        public C17437f(C17469y yVar) {
            this.f38102b = yVar;
        }

        public final void run() {
            StringBuilder h = C0072d.m201h("Transformation ");
            h.append(this.f38102b.key());
            h.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(h.toString());
        }
    }

    public C17431c(Picasso picasso, C17443i iVar, C17438d dVar, C17465w wVar, C17425a aVar, C17462u uVar) {
        this.f38080c = picasso;
        this.f38081d = iVar;
        this.f38082e = dVar;
        this.f38083f = wVar;
        this.f38089l = aVar;
        this.f38084g = aVar.f38064i;
        C17459s sVar = aVar.f38057b;
        this.f38085h = sVar;
        this.f38097t = sVar.f38164r;
        this.f38086i = aVar.f38060e;
        this.f38087j = aVar.f38061f;
        this.f38088k = uVar;
        this.f38096s = uVar.mo68567d();
    }

    /* renamed from: a */
    public static Bitmap m29285a(List<C17469y> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            C17469y yVar = list.get(i);
            try {
                Bitmap transform = yVar.transform(bitmap);
                if (transform == null) {
                    StringBuilder h = C0072d.m201h("Transformation ");
                    h.append(yVar.key());
                    h.append(" returned null after ");
                    h.append(i);
                    h.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C17469y key : list) {
                        h.append(key.key());
                        h.append(10);
                    }
                    Picasso.f38038m.post(new C17435d(h));
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.f38038m.post(new C17436e(yVar));
                    return null;
                } else if (transform == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = transform;
                } else {
                    Picasso.f38038m.post(new C17437f(yVar));
                    return null;
                }
            } catch (RuntimeException e) {
                Picasso.f38038m.post(new C17434c(yVar, e));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: lr.x$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: lr.x$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: com.squareup.picasso.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: lr.x$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m29286c(p756lr.C19888c0 r11, com.squareup.picasso.C17459s r12) throws java.io.IOException {
        /*
            lr.x r11 = p756lr.C19906r.m33998b(r11)
            okio.ByteString r0 = com.squareup.picasso.C17427a0.f38070b
            r1 = 0
            boolean r0 = r11.mo72718I(r1, r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001c
            r3 = 8
            okio.ByteString r0 = com.squareup.picasso.C17427a0.f38071c
            boolean r0 = r11.mo72718I(r3, r0)
            if (r0 == 0) goto L_0x001c
            r0 = r2
            goto L_0x001d
        L_0x001c:
            r0 = r1
        L_0x001d:
            boolean r3 = r12.f38162p
            android.graphics.BitmapFactory$Options r3 = com.squareup.picasso.C17462u.m29321c(r12)
            if (r3 == 0) goto L_0x002b
            boolean r4 = r3.inJustDecodeBounds
            if (r4 == 0) goto L_0x002b
            r4 = r2
            goto L_0x002c
        L_0x002b:
            r4 = r1
        L_0x002c:
            if (r0 != 0) goto L_0x0073
            lr.x$a r0 = new lr.x$a
            r0.<init>(r11)
            r11 = 0
            if (r4 == 0) goto L_0x0064
            com.squareup.picasso.o r10 = new com.squareup.picasso.o
            r10.<init>(r0)
            r10.f38134g = r1
            r0 = 1024(0x400, float:1.435E-42)
            long r4 = r10.f38130c
            long r0 = (long) r0
            long r4 = r4 + r0
            long r0 = r10.f38132e
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            r10.mo68612b(r4)
        L_0x004c:
            long r0 = r10.f38130c
            android.graphics.BitmapFactory.decodeStream(r10, r11, r3)
            int r4 = r12.f38152f
            int r5 = r12.f38153g
            int r6 = r3.outWidth
            int r7 = r3.outHeight
            r8 = r3
            r9 = r12
            com.squareup.picasso.C17462u.m29320a(r4, r5, r6, r7, r8, r9)
            r10.mo68610a(r0)
            r10.f38134g = r2
            r0 = r10
        L_0x0064:
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r0, r11, r3)
            if (r11 == 0) goto L_0x006b
            return r11
        L_0x006b:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Failed to decode stream."
            r11.<init>(r12)
            throw r11
        L_0x0073:
            byte[] r11 = r11.mo72732d0()
            if (r4 == 0) goto L_0x008a
            int r0 = r11.length
            android.graphics.BitmapFactory.decodeByteArray(r11, r1, r0, r3)
            int r4 = r12.f38152f
            int r5 = r12.f38153g
            int r6 = r3.outWidth
            int r7 = r3.outHeight
            r8 = r3
            r9 = r12
            com.squareup.picasso.C17462u.m29320a(r4, r5, r6, r7, r8, r9)
        L_0x008a:
            int r12 = r11.length
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeByteArray(r11, r1, r12, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C17431c.m29286c(lr.c0, com.squareup.picasso.s):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ee  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m29287f(com.squareup.picasso.C17459s r25, android.graphics.Bitmap r26, int r27) {
        /*
            r0 = r25
            r1 = r27
            int r2 = r26.getWidth()
            int r3 = r26.getHeight()
            boolean r4 = r0.f38157k
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r25.mo68631c()
            if (r5 != 0) goto L_0x0020
            if (r1 == 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r6 = r2
            r8 = r3
            goto L_0x0250
        L_0x0020:
            int r5 = r0.f38152f
            int r7 = r0.f38153g
            float r8 = r0.f38158l
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0120
            double r11 = (double) r8
            double r13 = java.lang.Math.toRadians(r11)
            double r13 = java.lang.Math.cos(r13)
            double r11 = java.lang.Math.toRadians(r11)
            double r11 = java.lang.Math.sin(r11)
            boolean r5 = r0.f38161o
            if (r5 == 0) goto L_0x00be
            float r5 = r0.f38159m
            float r7 = r0.f38160n
            r10.setRotate(r8, r5, r7)
            float r5 = r0.f38159m
            double r7 = (double) r5
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 - r13
            double r17 = r7 * r15
            float r5 = r0.f38160n
            r19 = r7
            double r6 = (double) r5
            double r21 = r6 * r11
            r23 = r10
            double r9 = r21 + r17
            double r6 = r6 * r15
            double r15 = r19 * r11
            double r6 = r6 - r15
            int r5 = r0.f38152f
            r15 = r4
            double r4 = (double) r5
            double r16 = r4 * r13
            r18 = r2
            r19 = r3
            double r2 = r16 + r9
            double r4 = r4 * r11
            double r4 = r4 + r6
            int r8 = r0.f38153g
            double r0 = (double) r8
            double r11 = r11 * r0
            r16 = r6
            double r6 = r2 - r11
            double r0 = r0 * r13
            double r13 = r0 + r4
            double r11 = r9 - r11
            double r0 = r0 + r16
            r20 = r0
            double r0 = java.lang.Math.max(r9, r2)
            double r0 = java.lang.Math.max(r6, r0)
            double r0 = java.lang.Math.max(r11, r0)
            double r2 = java.lang.Math.min(r9, r2)
            double r2 = java.lang.Math.min(r6, r2)
            double r2 = java.lang.Math.min(r11, r2)
            r6 = r16
            double r8 = java.lang.Math.max(r6, r4)
            double r8 = java.lang.Math.max(r13, r8)
            r10 = r20
            double r8 = java.lang.Math.max(r10, r8)
            double r4 = java.lang.Math.min(r6, r4)
            double r4 = java.lang.Math.min(r13, r4)
            double r4 = java.lang.Math.min(r10, r4)
            double r0 = r0 - r2
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            double r8 = r8 - r4
            double r1 = java.lang.Math.floor(r8)
            r5 = r0
            goto L_0x011e
        L_0x00be:
            r18 = r2
            r19 = r3
            r15 = r4
            r0 = r10
            r0.setRotate(r8)
            r1 = r25
            int r2 = r1.f38152f
            double r2 = (double) r2
            double r4 = r2 * r13
            double r2 = r2 * r11
            int r6 = r1.f38153g
            double r6 = (double) r6
            double r11 = r11 * r6
            double r8 = r4 - r11
            double r6 = r6 * r13
            double r13 = r6 + r2
            double r10 = -r11
            r23 = r0
            r0 = 0
            r16 = r6
            double r6 = java.lang.Math.max(r0, r4)
            double r6 = java.lang.Math.max(r8, r6)
            double r6 = java.lang.Math.max(r10, r6)
            double r4 = java.lang.Math.min(r0, r4)
            double r4 = java.lang.Math.min(r8, r4)
            double r4 = java.lang.Math.min(r10, r4)
            double r8 = java.lang.Math.max(r0, r2)
            double r8 = java.lang.Math.max(r13, r8)
            r10 = r16
            double r8 = java.lang.Math.max(r10, r8)
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r13, r0)
            double r0 = java.lang.Math.min(r10, r0)
            double r6 = r6 - r4
            double r2 = java.lang.Math.floor(r6)
            int r2 = (int) r2
            double r8 = r8 - r0
            double r0 = java.lang.Math.floor(r8)
            r5 = r2
            r1 = r0
        L_0x011e:
            int r7 = (int) r1
            goto L_0x0127
        L_0x0120:
            r18 = r2
            r19 = r3
            r15 = r4
            r23 = r10
        L_0x0127:
            r0 = 5
            r1 = 2
            r2 = 1
            r3 = r27
            if (r3 == 0) goto L_0x0167
            r4 = 270(0x10e, float:3.78E-43)
            r6 = 90
            switch(r3) {
                case 3: goto L_0x013b;
                case 4: goto L_0x013b;
                case 5: goto L_0x0139;
                case 6: goto L_0x0139;
                case 7: goto L_0x0137;
                case 8: goto L_0x0137;
                default: goto L_0x0135;
            }
        L_0x0135:
            r8 = 0
            goto L_0x013d
        L_0x0137:
            r8 = r4
            goto L_0x013d
        L_0x0139:
            r8 = r6
            goto L_0x013d
        L_0x013b:
            r8 = 180(0xb4, float:2.52E-43)
        L_0x013d:
            if (r3 == r1) goto L_0x0149
            r9 = 7
            if (r3 == r9) goto L_0x0149
            r9 = 4
            if (r3 == r9) goto L_0x0149
            if (r3 == r0) goto L_0x0149
            r3 = r2
            goto L_0x014a
        L_0x0149:
            r3 = -1
        L_0x014a:
            if (r8 == 0) goto L_0x015c
            float r9 = (float) r8
            r10 = r23
            r10.preRotate(r9)
            if (r8 == r6) goto L_0x0156
            if (r8 != r4) goto L_0x015e
        L_0x0156:
            r24 = r7
            r7 = r5
            r5 = r24
            goto L_0x015e
        L_0x015c:
            r10 = r23
        L_0x015e:
            if (r3 == r2) goto L_0x0169
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            r10.postScale(r3, r4)
            goto L_0x0169
        L_0x0167:
            r10 = r23
        L_0x0169:
            r3 = r25
            boolean r4 = r3.f38154h
            if (r4 == 0) goto L_0x01f7
            if (r5 == 0) goto L_0x0179
            float r4 = (float) r5
            r6 = r18
            float r8 = (float) r6
            float r4 = r4 / r8
            r8 = r19
            goto L_0x0180
        L_0x0179:
            r6 = r18
            float r4 = (float) r7
            r8 = r19
            float r9 = (float) r8
            float r4 = r4 / r9
        L_0x0180:
            if (r7 == 0) goto L_0x0185
            float r9 = (float) r7
            float r11 = (float) r8
            goto L_0x0187
        L_0x0185:
            float r9 = (float) r5
            float r11 = (float) r6
        L_0x0187:
            float r9 = r9 / r11
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01af
            float r0 = (float) r8
            float r9 = r9 / r4
            float r9 = r9 * r0
            double r11 = (double) r9
            double r11 = java.lang.Math.ceil(r11)
            int r0 = (int) r11
            int r3 = r3.f38155i
            r9 = r3 & 48
            r11 = 48
            if (r9 != r11) goto L_0x019f
            r3 = 0
            goto L_0x01aa
        L_0x019f:
            r9 = 80
            r3 = r3 & r9
            if (r3 != r9) goto L_0x01a7
            int r3 = r8 - r0
            goto L_0x01aa
        L_0x01a7:
            int r3 = r8 - r0
            int r3 = r3 / r1
        L_0x01aa:
            float r1 = (float) r7
            float r9 = (float) r0
            float r9 = r1 / r9
            goto L_0x01db
        L_0x01af:
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x01d8
            float r11 = (float) r6
            float r4 = r4 / r9
            float r4 = r4 * r11
            double r11 = (double) r4
            double r11 = java.lang.Math.ceil(r11)
            int r4 = (int) r11
            int r3 = r3.f38155i
            r11 = r3 & 3
            r12 = 3
            if (r11 != r12) goto L_0x01c5
            r0 = 0
            goto L_0x01ce
        L_0x01c5:
            r3 = r3 & r0
            if (r3 != r0) goto L_0x01cb
            int r0 = r6 - r4
            goto L_0x01ce
        L_0x01cb:
            int r0 = r6 - r4
            int r0 = r0 / r1
        L_0x01ce:
            float r1 = (float) r5
            float r3 = (float) r4
            float r1 = r1 / r3
            r11 = r9
            r3 = 0
            r9 = r4
            r4 = r1
            r1 = r0
            r0 = r8
            goto L_0x01de
        L_0x01d8:
            r0 = r8
            r4 = r9
            r3 = 0
        L_0x01db:
            r11 = r9
            r1 = 0
            r9 = r6
        L_0x01de:
            if (r15 == 0) goto L_0x01eb
            if (r5 == 0) goto L_0x01e4
            if (r6 > r5) goto L_0x01eb
        L_0x01e4:
            if (r7 == 0) goto L_0x01e9
            if (r8 <= r7) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r6 = 0
            goto L_0x01ec
        L_0x01eb:
            r6 = r2
        L_0x01ec:
            if (r6 == 0) goto L_0x01f1
            r10.preScale(r4, r11)
        L_0x01f1:
            r6 = r1
            r7 = r3
            r8 = r9
            r9 = r0
            goto L_0x0254
        L_0x01f7:
            r6 = r18
            r8 = r19
            boolean r0 = r3.f38156j
            if (r0 == 0) goto L_0x0227
            if (r5 == 0) goto L_0x0204
            float r0 = (float) r5
            float r1 = (float) r6
            goto L_0x0206
        L_0x0204:
            float r0 = (float) r7
            float r1 = (float) r8
        L_0x0206:
            float r0 = r0 / r1
            if (r7 == 0) goto L_0x020c
            float r1 = (float) r7
            float r3 = (float) r8
            goto L_0x020e
        L_0x020c:
            float r1 = (float) r5
            float r3 = (float) r6
        L_0x020e:
            float r1 = r1 / r3
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0214
            goto L_0x0215
        L_0x0214:
            r0 = r1
        L_0x0215:
            if (r15 == 0) goto L_0x0221
            if (r5 == 0) goto L_0x021b
            if (r6 > r5) goto L_0x0221
        L_0x021b:
            if (r7 == 0) goto L_0x0220
            if (r8 <= r7) goto L_0x0220
            goto L_0x0221
        L_0x0220:
            r2 = 0
        L_0x0221:
            if (r2 == 0) goto L_0x0250
            r10.preScale(r0, r0)
            goto L_0x0250
        L_0x0227:
            if (r5 != 0) goto L_0x022b
            if (r7 == 0) goto L_0x0250
        L_0x022b:
            if (r5 != r6) goto L_0x022f
            if (r7 == r8) goto L_0x0250
        L_0x022f:
            if (r5 == 0) goto L_0x0234
            float r0 = (float) r5
            float r1 = (float) r6
            goto L_0x0236
        L_0x0234:
            float r0 = (float) r7
            float r1 = (float) r8
        L_0x0236:
            float r0 = r0 / r1
            if (r7 == 0) goto L_0x023c
            float r1 = (float) r7
            float r3 = (float) r8
            goto L_0x023e
        L_0x023c:
            float r1 = (float) r5
            float r3 = (float) r6
        L_0x023e:
            float r1 = r1 / r3
            if (r15 == 0) goto L_0x024b
            if (r5 == 0) goto L_0x0245
            if (r6 > r5) goto L_0x024b
        L_0x0245:
            if (r7 == 0) goto L_0x024a
            if (r8 <= r7) goto L_0x024a
            goto L_0x024b
        L_0x024a:
            r2 = 0
        L_0x024b:
            if (r2 == 0) goto L_0x0250
            r10.preScale(r0, r1)
        L_0x0250:
            r9 = r8
            r7 = 0
            r8 = r6
            r6 = 0
        L_0x0254:
            r11 = 1
            r5 = r26
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r26
            if (r0 == r1) goto L_0x0263
            r26.recycle()
            goto L_0x0264
        L_0x0263:
            r0 = r1
        L_0x0264:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C17431c.m29287f(com.squareup.picasso.s, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: g */
    public static void m29288g(C17459s sVar) {
        Uri uri = sVar.f38149c;
        String valueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(sVar.f38150d);
        StringBuilder sb = (StringBuilder) f38076v.get();
        sb.ensureCapacity(valueOf.length() + 8);
        sb.replace(8, sb.length(), valueOf);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f38092o;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo68589b() {
        /*
            r2 = this;
            com.squareup.picasso.a r0 = r2.f38089l
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.ArrayList r0 = r2.f38090m
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future<?> r0 = r2.f38092o
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C17431c.mo68589b():boolean");
    }

    /* renamed from: d */
    public final void mo68590d(C17425a aVar) {
        boolean z;
        boolean z2 = true;
        if (this.f38089l == aVar) {
            this.f38089l = null;
            z = true;
        } else {
            ArrayList arrayList = this.f38090m;
            z = arrayList != null ? arrayList.remove(aVar) : false;
        }
        if (z && aVar.f38057b.f38164r == this.f38097t) {
            Picasso.Priority priority = Picasso.Priority.LOW;
            ArrayList arrayList2 = this.f38090m;
            boolean z3 = arrayList2 != null && !arrayList2.isEmpty();
            C17425a aVar2 = this.f38089l;
            if (aVar2 == null && !z3) {
                z2 = false;
            }
            if (z2) {
                if (aVar2 != null) {
                    priority = aVar2.f38057b.f38164r;
                }
                if (z3) {
                    int size = this.f38090m.size();
                    for (int i = 0; i < size; i++) {
                        Picasso.Priority priority2 = ((C17425a) this.f38090m.get(i)).f38057b.f38164r;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.f38097t = priority;
        }
        if (this.f38080c.f38051l) {
            C17427a0.m29282e("Hunter", Listing.REMOVED_STATE, aVar.f38057b.mo68630b(), C17427a0.m29280c(this, "from "));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public final android.graphics.Bitmap mo68591e() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.f38086i
            boolean r0 = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0040
            com.squareup.picasso.d r0 = r7.f38082e
            java.lang.String r3 = r7.f38084g
            com.squareup.picasso.n r0 = (com.squareup.picasso.C17452n) r0
            com.squareup.picasso.m r0 = r0.f38126a
            java.lang.Object r0 = r0.get(r3)
            com.squareup.picasso.n$a r0 = (com.squareup.picasso.C17452n.C17453a) r0
            if (r0 == 0) goto L_0x001d
            android.graphics.Bitmap r0 = r0.f38127a
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0040
            com.squareup.picasso.w r0 = r7.f38083f
            com.squareup.picasso.w$a r0 = r0.f38183b
            r0.sendEmptyMessage(r2)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r7.f38093p = r0
            com.squareup.picasso.Picasso r0 = r7.f38080c
            boolean r0 = r0.f38051l
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "Hunter"
            java.lang.String r2 = "decoded"
            com.squareup.picasso.s r3 = r7.f38085h
            java.lang.String r3 = r3.mo68630b()
            java.lang.String r4 = "from cache"
            com.squareup.picasso.C17427a0.m29282e(r0, r2, r3, r4)
        L_0x003f:
            return r1
        L_0x0040:
            int r0 = r7.f38096s
            if (r0 != 0) goto L_0x0049
            com.squareup.picasso.NetworkPolicy r0 = com.squareup.picasso.NetworkPolicy.OFFLINE
            int r0 = r0.index
            goto L_0x004b
        L_0x0049:
            int r0 = r7.f38087j
        L_0x004b:
            r7.f38087j = r0
            com.squareup.picasso.u r3 = r7.f38088k
            com.squareup.picasso.s r4 = r7.f38085h
            com.squareup.picasso.u$a r0 = r3.mo68566e(r4, r0)
            if (r0 == 0) goto L_0x0074
            com.squareup.picasso.Picasso$LoadedFrom r1 = r0.f38177a
            r7.f38093p = r1
            int r1 = r0.f38180d
            r7.f38095r = r1
            android.graphics.Bitmap r1 = r0.f38178b
            if (r1 != 0) goto L_0x0074
            lr.c0 r0 = r0.f38179c
            com.squareup.picasso.s r1 = r7.f38085h     // Catch:{ all -> 0x006f }
            android.graphics.Bitmap r1 = m29286c(r0, r1)     // Catch:{ all -> 0x006f }
            r0.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0074
        L_0x006f:
            r1 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            throw r1
        L_0x0074:
            if (r1 == 0) goto L_0x011f
            com.squareup.picasso.Picasso r0 = r7.f38080c
            boolean r0 = r0.f38051l
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "Hunter"
            java.lang.String r3 = "decoded"
            com.squareup.picasso.s r4 = r7.f38085h
            java.lang.String r4 = r4.mo68630b()
            com.squareup.picasso.C17427a0.m29281d(r0, r3, r4)
        L_0x0089:
            com.squareup.picasso.w r0 = r7.f38083f
            r3 = 2
            r0.getClass()
            int r4 = com.squareup.picasso.C17427a0.m29278a(r1)
            com.squareup.picasso.w$a r0 = r0.f38183b
            android.os.Message r3 = r0.obtainMessage(r3, r4, r2)
            r0.sendMessage(r3)
            com.squareup.picasso.s r0 = r7.f38085h
            boolean r3 = r0.mo68631c()
            r4 = 1
            if (r3 != 0) goto L_0x00b1
            java.util.List<com.squareup.picasso.y> r0 = r0.f38151e
            if (r0 == 0) goto L_0x00ab
            r0 = r4
            goto L_0x00ac
        L_0x00ab:
            r0 = r2
        L_0x00ac:
            if (r0 == 0) goto L_0x00af
            goto L_0x00b1
        L_0x00af:
            r0 = r2
            goto L_0x00b2
        L_0x00b1:
            r0 = r4
        L_0x00b2:
            if (r0 != 0) goto L_0x00b8
            int r0 = r7.f38095r
            if (r0 == 0) goto L_0x011f
        L_0x00b8:
            java.lang.Object r0 = f38075u
            monitor-enter(r0)
            com.squareup.picasso.s r3 = r7.f38085h     // Catch:{ all -> 0x011c }
            boolean r3 = r3.mo68631c()     // Catch:{ all -> 0x011c }
            if (r3 != 0) goto L_0x00c7
            int r3 = r7.f38095r     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x00e2
        L_0x00c7:
            com.squareup.picasso.s r3 = r7.f38085h     // Catch:{ all -> 0x011c }
            int r5 = r7.f38095r     // Catch:{ all -> 0x011c }
            android.graphics.Bitmap r1 = m29287f(r3, r1, r5)     // Catch:{ all -> 0x011c }
            com.squareup.picasso.Picasso r3 = r7.f38080c     // Catch:{ all -> 0x011c }
            boolean r3 = r3.f38051l     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x00e2
            java.lang.String r3 = "Hunter"
            java.lang.String r5 = "transformed"
            com.squareup.picasso.s r6 = r7.f38085h     // Catch:{ all -> 0x011c }
            java.lang.String r6 = r6.mo68630b()     // Catch:{ all -> 0x011c }
            com.squareup.picasso.C17427a0.m29281d(r3, r5, r6)     // Catch:{ all -> 0x011c }
        L_0x00e2:
            com.squareup.picasso.s r3 = r7.f38085h     // Catch:{ all -> 0x011c }
            java.util.List<com.squareup.picasso.y> r3 = r3.f38151e     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r4 = r2
        L_0x00ea:
            if (r4 == 0) goto L_0x0105
            android.graphics.Bitmap r1 = m29285a(r3, r1)     // Catch:{ all -> 0x011c }
            com.squareup.picasso.Picasso r3 = r7.f38080c     // Catch:{ all -> 0x011c }
            boolean r3 = r3.f38051l     // Catch:{ all -> 0x011c }
            if (r3 == 0) goto L_0x0105
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "transformed"
            com.squareup.picasso.s r5 = r7.f38085h     // Catch:{ all -> 0x011c }
            java.lang.String r5 = r5.mo68630b()     // Catch:{ all -> 0x011c }
            java.lang.String r6 = "from custom transformations"
            com.squareup.picasso.C17427a0.m29282e(r3, r4, r5, r6)     // Catch:{ all -> 0x011c }
        L_0x0105:
            monitor-exit(r0)     // Catch:{ all -> 0x011c }
            if (r1 == 0) goto L_0x011f
            com.squareup.picasso.w r0 = r7.f38083f
            r3 = 3
            r0.getClass()
            int r4 = com.squareup.picasso.C17427a0.m29278a(r1)
            com.squareup.picasso.w$a r0 = r0.f38183b
            android.os.Message r2 = r0.obtainMessage(r3, r4, r2)
            r0.sendMessage(r2)
            goto L_0x011f
        L_0x011c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011c }
            throw r1
        L_0x011f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C17431c.mo68591e():android.graphics.Bitmap");
    }

    public final void run() {
        try {
            m29288g(this.f38085h);
            if (this.f38080c.f38051l) {
                C17427a0.m29281d("Hunter", "executing", C17427a0.m29279b(this));
            }
            Bitmap e = mo68591e();
            this.f38091n = e;
            if (e == null) {
                C17443i.C17444a aVar = this.f38081d.f38116h;
                aVar.sendMessage(aVar.obtainMessage(6, this));
            } else {
                this.f38081d.mo68603b(this);
            }
        } catch (NetworkRequestHandler.ResponseException e2) {
            if (!NetworkPolicy.isOfflineOnly(e2.networkPolicy) || e2.code != 504) {
                this.f38094q = e2;
            }
            C17443i.C17444a aVar2 = this.f38081d.f38116h;
            aVar2.sendMessage(aVar2.obtainMessage(6, this));
        } catch (IOException e3) {
            this.f38094q = e3;
            C17443i.C17444a aVar3 = this.f38081d.f38116h;
            aVar3.sendMessageDelayed(aVar3.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f38083f.mo68636a().mo68639a(new PrintWriter(stringWriter));
            this.f38094q = new RuntimeException(stringWriter.toString(), e4);
            C17443i.C17444a aVar4 = this.f38081d.f38116h;
            aVar4.sendMessage(aVar4.obtainMessage(6, this));
        } catch (Exception e5) {
            this.f38094q = e5;
            C17443i.C17444a aVar5 = this.f38081d.f38116h;
            aVar5.sendMessage(aVar5.obtainMessage(6, this));
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }
}
