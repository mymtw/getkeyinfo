package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.C1913a;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19285c;

/* renamed from: androidx.compose.ui.text.MultiParagraphIntrinsics */
public final class MultiParagraphIntrinsics implements C1977g {

    /* renamed from: a */
    public final C1913a f4271a;

    /* renamed from: b */
    public final List<C1913a.C1916b<C2008j>> f4272b;

    /* renamed from: c */
    public final C19285c f4273c;

    /* renamed from: d */
    public final C19285c f4274d;

    /* renamed from: e */
    public final ArrayList f4275e;

    /* JADX WARNING: type inference failed for: r5v30, types: [java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.n>>] */
    /* JADX WARNING: type inference failed for: r5v31, types: [kotlin.collections.EmptyList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0242  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiParagraphIntrinsics(androidx.compose.p015ui.text.C1913a r26, androidx.compose.p015ui.text.C2023s r27, java.util.List<androidx.compose.p015ui.text.C1913a.C1916b<androidx.compose.p015ui.text.C2008j>> r28, p174m0.C7282b r29, androidx.compose.p015ui.text.font.C1952g.C1953a r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "annotatedString"
            kotlin.jvm.internal.C19383o.m32797g(r1, r4)
            java.lang.String r4 = "placeholders"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            java.lang.String r4 = "density"
            r12 = r29
            kotlin.jvm.internal.C19383o.m32797g(r12, r4)
            java.lang.String r4 = "fontFamilyResolver"
            r13 = r30
            kotlin.jvm.internal.C19383o.m32797g(r13, r4)
            r25.<init>()
            r0.f4271a = r1
            r0.f4272b = r3
            kotlin.LazyThreadSafetyMode r3 = kotlin.LazyThreadSafetyMode.NONE
            androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2 r4 = new androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            r4.<init>(r0)
            kotlin.c r4 = kotlin.C19350d.m32676a(r3, r4)
            r0.f4273c = r4
            androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2 r4 = new androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            r4.<init>(r0)
            kotlin.c r3 = kotlin.C19350d.m32676a(r3, r4)
            r0.f4274d = r3
            androidx.compose.ui.text.h r3 = r2.f4600b
            androidx.compose.ui.text.a r4 = androidx.compose.p015ui.text.C1933b.f4359a
            java.lang.String r4 = "defaultParagraphStyle"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            java.lang.String r4 = r1.f4296b
            int r4 = r4.length()
            java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.h>> r5 = r1.f4298d
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r6 = r5.size()
            r7 = 0
            r8 = 0
        L_0x005b:
            if (r7 >= r6) goto L_0x0085
            java.lang.Object r9 = r5.get(r7)
            androidx.compose.ui.text.a$b r9 = (androidx.compose.p015ui.text.C1913a.C1916b) r9
            T r10 = r9.f4308a
            androidx.compose.ui.text.h r10 = (androidx.compose.p015ui.text.C1978h) r10
            int r11 = r9.f4309b
            int r9 = r9.f4310c
            if (r11 == r8) goto L_0x0075
            androidx.compose.ui.text.a$b r15 = new androidx.compose.ui.text.a$b
            r15.<init>(r3, r8, r11)
            r14.add(r15)
        L_0x0075:
            androidx.compose.ui.text.a$b r8 = new androidx.compose.ui.text.a$b
            androidx.compose.ui.text.h r10 = r3.mo7593a(r10)
            r8.<init>(r10, r11, r9)
            r14.add(r8)
            int r7 = r7 + 1
            r8 = r9
            goto L_0x005b
        L_0x0085:
            if (r8 == r4) goto L_0x008f
            androidx.compose.ui.text.a$b r5 = new androidx.compose.ui.text.a$b
            r5.<init>(r3, r8, r4)
            r14.add(r5)
        L_0x008f:
            boolean r4 = r14.isEmpty()
            if (r4 == 0) goto L_0x009f
            androidx.compose.ui.text.a$b r4 = new androidx.compose.ui.text.a$b
            r5 = 0
            r4.<init>(r3, r5, r5)
            r14.add(r4)
            goto L_0x00a0
        L_0x009f:
            r5 = 0
        L_0x00a0:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r14.size()
            r4.<init>(r6)
            int r15 = r14.size()
            r11 = r5
        L_0x00ae:
            if (r11 >= r15) goto L_0x02a2
            java.lang.Object r5 = r14.get(r11)
            r10 = r5
            androidx.compose.ui.text.a$b r10 = (androidx.compose.p015ui.text.C1913a.C1916b) r10
            int r5 = r10.f4309b
            int r6 = r10.f4310c
            if (r5 == r6) goto L_0x00c9
            java.lang.String r7 = r1.f4296b
            java.lang.String r7 = r7.substring(r5, r6)
            java.lang.String r8 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r7 = ""
        L_0x00cb:
            r9 = r7
            if (r5 != r6) goto L_0x00d1
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
            goto L_0x00dd
        L_0x00d1:
            if (r5 != 0) goto L_0x00e2
            java.lang.String r7 = r1.f4296b
            int r7 = r7.length()
            if (r6 < r7) goto L_0x00e2
            java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.n>> r5 = r1.f4297c
        L_0x00dd:
            r1 = r5
            r28 = r11
            goto L_0x0155
        L_0x00e2:
            java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.n>> r7 = r1.f4297c
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = r7.size()
            r8.<init>(r1)
            int r1 = r7.size()
            r16 = 0
            r28 = r11
            r11 = r16
        L_0x00f7:
            if (r11 >= r1) goto L_0x011a
            r16 = r1
            java.lang.Object r1 = r7.get(r11)
            r17 = r7
            r7 = r1
            androidx.compose.ui.text.a$b r7 = (androidx.compose.p015ui.text.C1913a.C1916b) r7
            int r12 = r7.f4309b
            int r7 = r7.f4310c
            boolean r7 = androidx.compose.p015ui.text.C1933b.m4232b(r5, r6, r12, r7)
            if (r7 == 0) goto L_0x0111
            r8.add(r1)
        L_0x0111:
            int r11 = r11 + 1
            r12 = r29
            r1 = r16
            r7 = r17
            goto L_0x00f7
        L_0x011a:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r7 = r8.size()
            r1.<init>(r7)
            int r7 = r8.size()
            r11 = 0
        L_0x0128:
            if (r11 >= r7) goto L_0x0155
            java.lang.Object r12 = r8.get(r11)
            androidx.compose.ui.text.a$b r12 = (androidx.compose.p015ui.text.C1913a.C1916b) r12
            r16 = r7
            androidx.compose.ui.text.a$b r7 = new androidx.compose.ui.text.a$b
            r17 = r8
            T r8 = r12.f4308a
            int r13 = r12.f4309b
            int r13 = kotlin.jvm.internal.C19388s.m32833M(r13, r5, r6)
            int r13 = r13 - r5
            int r12 = r12.f4310c
            int r12 = kotlin.jvm.internal.C19388s.m32833M(r12, r5, r6)
            int r12 = r12 - r5
            r7.<init>(r8, r13, r12)
            r1.add(r7)
            int r11 = r11 + 1
            r13 = r30
            r7 = r16
            r8 = r17
            goto L_0x0128
        L_0x0155:
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
            java.lang.String r6 = "spanStyles"
            kotlin.jvm.internal.C19383o.m32797g(r1, r6)
            java.lang.String r6 = "paragraphStyles"
            kotlin.jvm.internal.C19383o.m32797g(r5, r6)
            java.lang.String r6 = "annotations"
            kotlin.jvm.internal.C19383o.m32797g(r5, r6)
            int r6 = r5.size()
            r7 = -1
            r8 = 0
        L_0x016c:
            if (r8 >= r6) goto L_0x01bd
            java.lang.Object r11 = r5.get(r8)
            androidx.compose.ui.text.a$b r11 = (androidx.compose.p015ui.text.C1913a.C1916b) r11
            int r12 = r11.f4309b
            if (r12 < r7) goto L_0x017a
            r7 = 1
            goto L_0x017b
        L_0x017a:
            r7 = 0
        L_0x017b:
            if (r7 == 0) goto L_0x01b1
            int r7 = r11.f4310c
            int r12 = r9.length()
            if (r7 > r12) goto L_0x0187
            r7 = 1
            goto L_0x0188
        L_0x0187:
            r7 = 0
        L_0x0188:
            if (r7 == 0) goto L_0x018f
            int r7 = r11.f4310c
            int r8 = r8 + 1
            goto L_0x016c
        L_0x018f:
            java.lang.String r1 = "ParagraphStyle range ["
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            int r2 = r11.f4309b
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            int r2 = r11.f4310c
            java.lang.String r3 = ") is out of boundary"
            java.lang.String r1 = android.support.p013v4.media.C0071c.m191c(r1, r2, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x01b1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "ParagraphStyle should not overlap"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01bd:
            T r5 = r10.f4308a
            androidx.compose.ui.text.h r5 = (androidx.compose.p015ui.text.C1978h) r5
            androidx.compose.ui.text.style.f r6 = r5.f4440b
            if (r6 == 0) goto L_0x01c8
            r24 = r3
            goto L_0x01ea
        L_0x01c8:
            androidx.compose.ui.text.style.f r6 = r3.f4440b
            androidx.compose.ui.text.style.d r7 = r5.f4439a
            long r11 = r5.f4441c
            androidx.compose.ui.text.style.h r8 = r5.f4442d
            androidx.compose.ui.text.h r13 = new androidx.compose.ui.text.h
            r24 = r3
            androidx.compose.ui.text.k r3 = r5.f4443e
            androidx.compose.ui.text.style.c r5 = r5.f4444f
            r16 = r13
            r17 = r7
            r18 = r6
            r19 = r11
            r21 = r8
            r22 = r3
            r23 = r5
            r16.<init>(r17, r18, r19, r21, r22, r23)
            r5 = r13
        L_0x01ea:
            androidx.compose.ui.text.f r3 = new androidx.compose.ui.text.f
            androidx.compose.ui.text.s r6 = new androidx.compose.ui.text.s
            androidx.compose.ui.text.n r7 = r2.f4599a
            androidx.compose.ui.text.h r8 = r2.f4600b
            androidx.compose.ui.text.h r5 = r8.mo7593a(r5)
            r6.<init>(r7, r5)
            java.util.List<androidx.compose.ui.text.a$b<androidx.compose.ui.text.j>> r5 = r0.f4272b
            int r7 = r10.f4309b
            int r8 = r10.f4310c
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r5.size()
            r11.<init>(r12)
            int r12 = r5.size()
            r13 = 0
        L_0x020d:
            if (r13 >= r12) goto L_0x0230
            java.lang.Object r2 = r5.get(r13)
            r16 = r5
            r5 = r2
            androidx.compose.ui.text.a$b r5 = (androidx.compose.p015ui.text.C1913a.C1916b) r5
            r17 = r10
            int r10 = r5.f4309b
            int r5 = r5.f4310c
            boolean r5 = androidx.compose.p015ui.text.C1933b.m4232b(r7, r8, r10, r5)
            if (r5 == 0) goto L_0x0227
            r11.add(r2)
        L_0x0227:
            int r13 = r13 + 1
            r2 = r27
            r5 = r16
            r10 = r17
            goto L_0x020d
        L_0x0230:
            r17 = r10
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r11.size()
            r2.<init>(r5)
            int r5 = r11.size()
            r10 = 0
        L_0x0240:
            if (r10 >= r5) goto L_0x027a
            java.lang.Object r12 = r11.get(r10)
            androidx.compose.ui.text.a$b r12 = (androidx.compose.p015ui.text.C1913a.C1916b) r12
            int r13 = r12.f4309b
            r16 = r5
            if (r7 > r13) goto L_0x0254
            int r5 = r12.f4310c
            if (r5 > r8) goto L_0x0254
            r5 = 1
            goto L_0x0255
        L_0x0254:
            r5 = 0
        L_0x0255:
            if (r5 == 0) goto L_0x026e
            androidx.compose.ui.text.a$b r5 = new androidx.compose.ui.text.a$b
            r18 = r8
            T r8 = r12.f4308a
            int r13 = r13 - r7
            int r12 = r12.f4310c
            int r12 = r12 - r7
            r5.<init>(r8, r13, r12)
            r2.add(r5)
            int r10 = r10 + 1
            r5 = r16
            r8 = r18
            goto L_0x0240
        L_0x026e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "placeholder can not overlap with paragraph."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x027a:
            androidx.compose.ui.text.platform.a r12 = new androidx.compose.ui.text.platform.a
            r5 = r12
            r7 = r30
            r8 = r29
            r13 = r17
            r10 = r1
            r1 = r28
            r11 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r2 = r13.f4309b
            int r5 = r13.f4310c
            r3.<init>(r12, r2, r5)
            r4.add(r3)
            int r11 = r1 + 1
            r1 = r26
            r2 = r27
            r12 = r29
            r13 = r30
            r3 = r24
            goto L_0x00ae
        L_0x02a2:
            r0.f4275e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.MultiParagraphIntrinsics.<init>(androidx.compose.ui.text.a, androidx.compose.ui.text.s, java.util.List, m0.b, androidx.compose.ui.text.font.g$a):void");
    }

    /* renamed from: a */
    public final boolean mo7363a() {
        ArrayList arrayList = this.f4275e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C1937f) arrayList.get(i)).f4375a.mo7363a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final float mo7364b() {
        return ((Number) this.f4274d.getValue()).floatValue();
    }

    /* renamed from: c */
    public final float mo7365c() {
        return ((Number) this.f4273c.getValue()).floatValue();
    }
}
