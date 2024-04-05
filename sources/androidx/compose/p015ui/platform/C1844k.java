package androidx.compose.p015ui.platform;

import android.content.ClipboardManager;
import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.k */
public final class C1844k implements C1827e0 {

    /* renamed from: a */
    public final ClipboardManager f4101a;

    public C1844k(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        Object systemService = context.getSystemService("clipboard");
        if (systemService != null) {
            this.f4101a = (ClipboardManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e4, code lost:
        if ((r7 == 3) != false) goto L_0x00e8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7207a(androidx.compose.p015ui.text.C1913a r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            android.content.ClipboardManager r2 = r0.f4101a
            java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.n>> r3 = r1.f4297c
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0012
            java.lang.String r1 = r1.f4296b
            goto L_0x01a5
        L_0x0012:
            android.text.SpannableString r3 = new android.text.SpannableString
            java.lang.String r4 = r1.f4296b
            r3.<init>(r4)
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c r4 = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c
            r5 = 2
            r4.<init>((int) r5)
            java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.n>> r1 = r1.f4297c
            int r6 = r1.size()
            r8 = 0
        L_0x0026:
            if (r8 >= r6) goto L_0x01a4
            java.lang.Object r9 = r1.get(r8)
            androidx.compose.ui.text.a$b r9 = (androidx.compose.p015ui.text.C1913a.C1916b) r9
            T r10 = r9.f4308a
            androidx.compose.ui.text.n r10 = (androidx.compose.p015ui.text.C2012n) r10
            int r11 = r9.f4309b
            int r9 = r9.f4310c
            java.lang.Object r12 = r4.f2868b
            android.os.Parcel r12 = (android.os.Parcel) r12
            r12.recycle()
            android.os.Parcel r12 = android.os.Parcel.obtain()
            java.lang.String r13 = "obtain()"
            kotlin.jvm.internal.C19383o.m32796f(r12, r13)
            r4.f2868b = r12
            java.lang.String r12 = "spanStyle"
            kotlin.jvm.internal.C19383o.m32797g(r10, r12)
            long r12 = r10.mo7712a()
            long r14 = androidx.compose.p015ui.graphics.C1545s.f3364i
            boolean r12 = androidx.compose.p015ui.graphics.C1545s.m3357c(r12, r14)
            r13 = 1
            if (r12 != 0) goto L_0x006a
            r4.mo5756d(r13)
            r12 = r8
            long r7 = r10.mo7712a()
            java.lang.Object r13 = r4.f2868b
            android.os.Parcel r13 = (android.os.Parcel) r13
            r13.writeLong(r7)
            goto L_0x006b
        L_0x006a:
            r12 = r8
        L_0x006b:
            long r7 = r10.f4537b
            r17 = r6
            long r5 = p174m0.C7292j.f16173c
            boolean r7 = p174m0.C7292j.m13997a(r7, r5)
            if (r7 != 0) goto L_0x0080
            r7 = 2
            r4.mo5756d(r7)
            long r7 = r10.f4537b
            r4.mo5758f(r7)
        L_0x0080:
            androidx.compose.ui.text.font.m r7 = r10.f4538c
            r8 = 3
            if (r7 == 0) goto L_0x0091
            r4.mo5756d(r8)
            int r7 = r7.f4417b
            java.lang.Object r13 = r4.f2868b
            android.os.Parcel r13 = (android.os.Parcel) r13
            r13.writeInt(r7)
        L_0x0091:
            androidx.compose.ui.text.font.k r7 = r10.f4539d
            if (r7 == 0) goto L_0x00b1
            int r7 = r7.f4407a
            r13 = 4
            r4.mo5756d(r13)
            if (r7 != 0) goto L_0x009f
            r13 = 1
            goto L_0x00a0
        L_0x009f:
            r13 = 0
        L_0x00a0:
            if (r13 == 0) goto L_0x00a3
            goto L_0x00ad
        L_0x00a3:
            r13 = 1
            if (r7 != r13) goto L_0x00a8
            r13 = 1
            goto L_0x00a9
        L_0x00a8:
            r13 = 0
        L_0x00a9:
            if (r13 == 0) goto L_0x00ad
            r13 = 1
            goto L_0x00ae
        L_0x00ad:
            r13 = 0
        L_0x00ae:
            r4.mo5756d(r13)
        L_0x00b1:
            androidx.compose.ui.text.font.l r7 = r10.f4540e
            if (r7 == 0) goto L_0x00ec
            int r7 = r7.f4408a
            r13 = 5
            r4.mo5756d(r13)
            if (r7 != 0) goto L_0x00bf
            r13 = 1
            goto L_0x00c0
        L_0x00bf:
            r13 = 0
        L_0x00c0:
            if (r13 == 0) goto L_0x00c4
            r13 = 2
            goto L_0x00e7
        L_0x00c4:
            r13 = 1
            if (r7 != r13) goto L_0x00ca
            r16 = r13
            goto L_0x00cc
        L_0x00ca:
            r16 = 0
        L_0x00cc:
            if (r16 == 0) goto L_0x00d1
            r8 = r13
            r13 = 2
            goto L_0x00e8
        L_0x00d1:
            r13 = 2
            if (r7 != r13) goto L_0x00d7
            r18 = 1
            goto L_0x00d9
        L_0x00d7:
            r18 = 0
        L_0x00d9:
            if (r18 == 0) goto L_0x00dd
            r8 = r13
            goto L_0x00e8
        L_0x00dd:
            if (r7 != r8) goto L_0x00e2
            r16 = 1
            goto L_0x00e4
        L_0x00e2:
            r16 = 0
        L_0x00e4:
            if (r16 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r8 = 0
        L_0x00e8:
            r4.mo5756d(r8)
            goto L_0x00ed
        L_0x00ec:
            r13 = 2
        L_0x00ed:
            java.lang.String r7 = r10.f4542g
            if (r7 == 0) goto L_0x00fc
            r8 = 6
            r4.mo5756d(r8)
            java.lang.Object r8 = r4.f2868b
            android.os.Parcel r8 = (android.os.Parcel) r8
            r8.writeString(r7)
        L_0x00fc:
            long r7 = r10.f4543h
            boolean r5 = p174m0.C7292j.m13997a(r7, r5)
            if (r5 != 0) goto L_0x010d
            r5 = 7
            r4.mo5756d(r5)
            long r5 = r10.f4543h
            r4.mo5758f(r5)
        L_0x010d:
            androidx.compose.ui.text.style.a r5 = r10.f4544i
            if (r5 == 0) goto L_0x011b
            float r5 = r5.f4603a
            r6 = 8
            r4.mo5756d(r6)
            r4.mo5757e(r5)
        L_0x011b:
            androidx.compose.ui.text.style.g r5 = r10.f4545j
            if (r5 == 0) goto L_0x012e
            r6 = 9
            r4.mo5756d(r6)
            float r6 = r5.f4618a
            r4.mo5757e(r6)
            float r5 = r5.f4619b
            r4.mo5757e(r5)
        L_0x012e:
            long r5 = r10.f4547l
            boolean r5 = androidx.compose.p015ui.graphics.C1545s.m3357c(r5, r14)
            if (r5 != 0) goto L_0x0144
            r5 = 10
            r4.mo5756d(r5)
            long r5 = r10.f4547l
            java.lang.Object r7 = r4.f2868b
            android.os.Parcel r7 = (android.os.Parcel) r7
            r7.writeLong(r5)
        L_0x0144:
            androidx.compose.ui.text.style.e r5 = r10.f4548m
            if (r5 == 0) goto L_0x0156
            r6 = 11
            r4.mo5756d(r6)
            int r5 = r5.f4615a
            java.lang.Object r6 = r4.f2868b
            android.os.Parcel r6 = (android.os.Parcel) r6
            r6.writeInt(r5)
        L_0x0156:
            androidx.compose.ui.graphics.j0 r5 = r10.f4549n
            if (r5 == 0) goto L_0x017f
            r6 = 12
            r4.mo5756d(r6)
            long r6 = r5.f3323a
            java.lang.Object r8 = r4.f2868b
            android.os.Parcel r8 = (android.os.Parcel) r8
            r8.writeLong(r6)
            long r6 = r5.f3324b
            float r6 = p288y.C8343c.m16642c(r6)
            r4.mo5757e(r6)
            long r6 = r5.f3324b
            float r6 = p288y.C8343c.m16643d(r6)
            r4.mo5757e(r6)
            float r5 = r5.f3325c
            r4.mo5757e(r5)
        L_0x017f:
            android.text.Annotation r5 = new android.text.Annotation
            java.lang.Object r6 = r4.f2868b
            android.os.Parcel r6 = (android.os.Parcel) r6
            byte[] r6 = r6.marshall()
            r7 = 0
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
            java.lang.String r8 = "encodeToString(bytes, Base64.DEFAULT)"
            kotlin.jvm.internal.C19383o.m32796f(r6, r8)
            java.lang.String r8 = "androidx.compose.text.SpanStyle"
            r5.<init>(r8, r6)
            r6 = 33
            r3.setSpan(r5, r11, r9, r6)
            int r8 = r12 + 1
            r5 = r13
            r6 = r17
            goto L_0x0026
        L_0x01a4:
            r1 = r3
        L_0x01a5:
            java.lang.String r3 = "plain text"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r3, r1)
            r2.setPrimaryClip(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1844k.mo7207a(androidx.compose.ui.text.a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: androidx.compose.ui.text.font.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: androidx.compose.ui.text.font.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: androidx.compose.ui.text.style.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: androidx.compose.ui.text.style.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v0, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: androidx.compose.ui.graphics.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v1, resolved type: androidx.compose.ui.graphics.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v1, resolved type: androidx.compose.ui.text.style.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: androidx.compose.ui.text.style.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: androidx.compose.ui.text.font.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: androidx.compose.ui.text.font.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: androidx.compose.ui.text.style.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: androidx.compose.ui.text.font.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: androidx.compose.ui.text.style.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: androidx.compose.ui.text.font.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v4, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v5, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v6, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: androidx.compose.ui.text.style.e[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v7, resolved type: androidx.compose.ui.text.style.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: androidx.compose.ui.text.style.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: androidx.compose.ui.text.font.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: androidx.compose.ui.text.style.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: androidx.compose.ui.text.font.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: androidx.compose.ui.text.font.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v6, resolved type: androidx.compose.ui.text.style.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v11, resolved type: androidx.compose.ui.graphics.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v22, resolved type: androidx.compose.ui.text.style.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v22, resolved type: androidx.compose.ui.text.font.k} */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0249, code lost:
        r17 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p015ui.text.C1913a getText() {
        /*
            r44 = this;
            r0 = r44
            android.content.ClipboardManager r1 = r0.f4101a
            android.content.ClipData r1 = r1.getPrimaryClip()
            r2 = 0
            if (r1 == 0) goto L_0x026e
            int r3 = r1.getItemCount()
            if (r3 <= 0) goto L_0x026e
            r3 = 0
            android.content.ClipData$Item r1 = r1.getItemAt(r3)
            if (r1 == 0) goto L_0x001d
            java.lang.CharSequence r1 = r1.getText()
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            if (r1 != 0) goto L_0x0022
            goto L_0x026e
        L_0x0022:
            boolean r4 = r1 instanceof android.text.Spanned
            r5 = 6
            if (r4 != 0) goto L_0x0033
            androidx.compose.ui.text.a r3 = new androidx.compose.ui.text.a
            java.lang.String r1 = r1.toString()
            r3.<init>(r1, r2, r5)
            r2 = r3
            goto L_0x026f
        L_0x0033:
            r4 = r1
            android.text.Spanned r4 = (android.text.Spanned) r4
            int r6 = r1.length()
            java.lang.Class<android.text.Annotation> r7 = android.text.Annotation.class
            java.lang.Object[] r6 = r4.getSpans(r3, r6, r7)
            android.text.Annotation[] r6 = (android.text.Annotation[]) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r8 = "annotations"
            kotlin.jvm.internal.C19383o.m32796f(r6, r8)
            int r8 = r6.length
            int r8 = r8 + -1
            r9 = 4
            if (r8 < 0) goto L_0x0264
            r10 = r3
        L_0x0053:
            r11 = r6[r10]
            java.lang.String r12 = r11.getKey()
            java.lang.String r13 = "androidx.compose.text.SpanStyle"
            boolean r12 = kotlin.jvm.internal.C19383o.m32792b(r12, r13)
            if (r12 != 0) goto L_0x0065
            r17 = r3
            goto L_0x025a
        L_0x0065:
            int r12 = r4.getSpanStart(r11)
            int r13 = r4.getSpanEnd(r11)
            androidx.compose.ui.platform.f0 r14 = new androidx.compose.ui.platform.f0
            java.lang.String r11 = r11.getValue()
            java.lang.String r15 = "span.value"
            kotlin.jvm.internal.C19383o.m32796f(r11, r15)
            r14.<init>((java.lang.String) r11)
            long r15 = androidx.compose.p015ui.graphics.C1545s.f3364i
            long r17 = p174m0.C7292j.f16173c
            r27 = 0
            r33 = 0
            r24 = r2
            r25 = r24
            r26 = r25
            r28 = r26
            r31 = r28
            r32 = r31
            r36 = r32
            r37 = r36
            r20 = r15
            r34 = r20
            r22 = r17
            r29 = r22
        L_0x009b:
            java.lang.Object r11 = r14.f4088a
            android.os.Parcel r11 = (android.os.Parcel) r11
            int r11 = r11.dataAvail()
            r15 = 1
            if (r11 <= r15) goto L_0x0249
            java.lang.Object r11 = r14.f4088a
            android.os.Parcel r11 = (android.os.Parcel) r11
            byte r11 = r11.readByte()
            r2 = 8
            if (r11 != r15) goto L_0x00c4
            int r11 = r14.mo7212d()
            if (r11 < r2) goto L_0x0249
            java.lang.Object r2 = r14.f4088a
            android.os.Parcel r2 = (android.os.Parcel) r2
            long r20 = r2.readLong()
            int r2 = androidx.compose.p015ui.graphics.C1545s.f3365j
            r2 = 0
            goto L_0x009b
        L_0x00c4:
            r3 = 5
            r2 = 2
            if (r11 != r2) goto L_0x00dc
            int r2 = r14.mo7212d()
            if (r2 < r3) goto L_0x00d8
            long r2 = r14.mo7214f()
            r22 = r2
        L_0x00d4:
            r17 = 0
            goto L_0x0243
        L_0x00d8:
            r17 = 0
            goto L_0x024b
        L_0x00dc:
            r5 = 3
            if (r11 != r5) goto L_0x00f5
            int r2 = r14.mo7212d()
            if (r2 < r9) goto L_0x00d8
            androidx.compose.ui.text.font.m r2 = new androidx.compose.ui.text.font.m
            java.lang.Object r3 = r14.f4088a
            android.os.Parcel r3 = (android.os.Parcel) r3
            int r3 = r3.readInt()
            r2.<init>(r3)
            r24 = r2
            goto L_0x00d4
        L_0x00f5:
            if (r11 != r9) goto L_0x0114
            int r2 = r14.mo7212d()
            if (r2 < r15) goto L_0x00d8
            java.lang.Object r2 = r14.f4088a
            android.os.Parcel r2 = (android.os.Parcel) r2
            byte r2 = r2.readByte()
            if (r2 != 0) goto L_0x0108
            goto L_0x010b
        L_0x0108:
            if (r2 != r15) goto L_0x010b
            goto L_0x010c
        L_0x010b:
            r15 = 0
        L_0x010c:
            androidx.compose.ui.text.font.k r2 = new androidx.compose.ui.text.font.k
            r2.<init>(r15)
            r25 = r2
            goto L_0x00d4
        L_0x0114:
            if (r11 != r3) goto L_0x013b
            int r3 = r14.mo7212d()
            if (r3 < r15) goto L_0x00d8
            java.lang.Object r3 = r14.f4088a
            android.os.Parcel r3 = (android.os.Parcel) r3
            byte r3 = r3.readByte()
            if (r3 != 0) goto L_0x0127
            goto L_0x0132
        L_0x0127:
            if (r3 != r15) goto L_0x012a
            goto L_0x0133
        L_0x012a:
            if (r3 != r5) goto L_0x012e
            r15 = r5
            goto L_0x0133
        L_0x012e:
            if (r3 != r2) goto L_0x0132
            r15 = r2
            goto L_0x0133
        L_0x0132:
            r15 = 0
        L_0x0133:
            androidx.compose.ui.text.font.l r2 = new androidx.compose.ui.text.font.l
            r2.<init>(r15)
            r26 = r2
            goto L_0x00d4
        L_0x013b:
            r5 = 6
            if (r11 != r5) goto L_0x0147
            java.lang.Object r2 = r14.f4088a
            android.os.Parcel r2 = (android.os.Parcel) r2
            java.lang.String r28 = r2.readString()
            goto L_0x00d4
        L_0x0147:
            r5 = 7
            if (r11 != r5) goto L_0x0158
            int r2 = r14.mo7212d()
            if (r2 < r3) goto L_0x00d8
            long r2 = r14.mo7214f()
            r29 = r2
            goto L_0x00d4
        L_0x0158:
            r3 = 8
            if (r11 != r3) goto L_0x016f
            int r2 = r14.mo7212d()
            if (r2 < r9) goto L_0x00d8
            float r2 = r14.mo7213e()
            androidx.compose.ui.text.style.a r3 = new androidx.compose.ui.text.style.a
            r3.<init>(r2)
            r31 = r3
            goto L_0x00d4
        L_0x016f:
            r5 = 9
            if (r11 != r5) goto L_0x018a
            int r2 = r14.mo7212d()
            if (r2 < r3) goto L_0x00d8
            androidx.compose.ui.text.style.g r2 = new androidx.compose.ui.text.style.g
            float r3 = r14.mo7213e()
            float r5 = r14.mo7213e()
            r2.<init>(r3, r5)
            r32 = r2
            goto L_0x00d4
        L_0x018a:
            r5 = 10
            if (r11 != r5) goto L_0x01a2
            int r2 = r14.mo7212d()
            if (r2 < r3) goto L_0x00d8
            java.lang.Object r2 = r14.f4088a
            android.os.Parcel r2 = (android.os.Parcel) r2
            long r2 = r2.readLong()
            int r5 = androidx.compose.p015ui.graphics.C1545s.f3365j
            r34 = r2
            goto L_0x00d4
        L_0x01a2:
            r3 = 11
            if (r11 != r3) goto L_0x0214
            int r3 = r14.mo7212d()
            if (r3 < r9) goto L_0x00d8
            java.lang.Object r3 = r14.f4088a
            android.os.Parcel r3 = (android.os.Parcel) r3
            int r3 = r3.readInt()
            androidx.compose.ui.text.style.e r36 = androidx.compose.p015ui.text.style.C2030e.f4614d
            r5 = r3 & 2
            if (r5 == 0) goto L_0x01bc
            r5 = r15
            goto L_0x01bd
        L_0x01bc:
            r5 = 0
        L_0x01bd:
            androidx.compose.ui.text.style.e r11 = androidx.compose.p015ui.text.style.C2030e.f4613c
            r3 = r3 & 1
            if (r3 == 0) goto L_0x01c5
            r3 = r15
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            if (r5 == 0) goto L_0x0207
            if (r3 == 0) goto L_0x0207
            androidx.compose.ui.text.style.e[] r2 = new androidx.compose.p015ui.text.style.C2030e[r2]
            r17 = 0
            r2[r17] = r36
            r2[r15] = r11
            java.util.List r2 = p568fn.C17782b.m29865e0(r2)
            java.lang.String r3 = "decorations"
            kotlin.jvm.internal.C19383o.m32797g(r2, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            int r5 = r2.size()
            r11 = r17
        L_0x01e5:
            if (r11 >= r5) goto L_0x01fb
            java.lang.Object r15 = r2.get(r11)
            androidx.compose.ui.text.style.e r15 = (androidx.compose.p015ui.text.style.C2030e) r15
            int r3 = r3.intValue()
            int r15 = r15.f4615a
            r3 = r3 | r15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r11 = r11 + 1
            goto L_0x01e5
        L_0x01fb:
            int r2 = r3.intValue()
            androidx.compose.ui.text.style.e r3 = new androidx.compose.ui.text.style.e
            r3.<init>(r2)
            r36 = r3
            goto L_0x0243
        L_0x0207:
            r17 = 0
            if (r5 == 0) goto L_0x020c
            goto L_0x0243
        L_0x020c:
            if (r3 == 0) goto L_0x0211
            r36 = r11
            goto L_0x0243
        L_0x0211:
            androidx.compose.ui.text.style.e r36 = androidx.compose.p015ui.text.style.C2030e.f4612b
            goto L_0x0243
        L_0x0214:
            r17 = 0
            r2 = 12
            if (r11 != r2) goto L_0x0243
            int r2 = r14.mo7212d()
            r3 = 20
            if (r2 < r3) goto L_0x024b
            androidx.compose.ui.graphics.j0 r37 = new androidx.compose.ui.graphics.j0
            java.lang.Object r2 = r14.f4088a
            android.os.Parcel r2 = (android.os.Parcel) r2
            long r39 = r2.readLong()
            int r2 = androidx.compose.p015ui.graphics.C1545s.f3365j
            float r2 = r14.mo7213e()
            float r3 = r14.mo7213e()
            long r41 = kotlin.reflect.C19421p.m32952q(r2, r3)
            float r43 = r14.mo7213e()
            r38 = r37
            r38.<init>(r39, r41, r43)
        L_0x0243:
            r3 = r17
            r2 = 0
            r5 = 6
            goto L_0x009b
        L_0x0249:
            r17 = r3
        L_0x024b:
            androidx.compose.ui.text.n r2 = new androidx.compose.ui.text.n
            r19 = r2
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37)
            androidx.compose.ui.text.a$b r3 = new androidx.compose.ui.text.a$b
            r3.<init>(r2, r12, r13)
            r7.add(r3)
        L_0x025a:
            if (r10 == r8) goto L_0x0264
            int r10 = r10 + 1
            r3 = r17
            r2 = 0
            r5 = 6
            goto L_0x0053
        L_0x0264:
            androidx.compose.ui.text.a r2 = new androidx.compose.ui.text.a
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r7, r9)
            goto L_0x026f
        L_0x026e:
            r2 = 0
        L_0x026f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.C1844k.getText():androidx.compose.ui.text.a");
    }
}
