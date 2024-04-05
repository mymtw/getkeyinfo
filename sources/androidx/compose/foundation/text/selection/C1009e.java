package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import kotlin.jvm.internal.C19388s;
import kotlin.reflect.C19421p;
import p001a0.C0005b;
import p288y.C8343c;
import p288y.C8345d;
import p753kq.C19846a;

/* renamed from: androidx.compose.foundation.text.selection.e */
public final class C1009e implements C1010f {

    /* renamed from: a */
    public final long f2118a;

    /* renamed from: b */
    public final C19846a<C1689j> f2119b;

    /* renamed from: c */
    public final C19846a<C2021q> f2120c;

    public C1009e(long j, C19846a<? extends C1689j> aVar, C19846a<C2021q> aVar2) {
        this.f2118a = j;
        this.f2119b = aVar;
        this.f2120c = aVar2;
    }

    /* renamed from: a */
    public final C8345d mo4695a(int i) {
        C2021q invoke = this.f2120c.invoke();
        if (invoke == null) {
            return C8345d.f18300e;
        }
        int length = invoke.f4589a.f4556a.length();
        return length < 1 ? C8345d.f18300e : invoke.mo7739b(C19388s.m32833M(i, 0, length - 1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.Pair<androidx.compose.foundation.text.selection.C1011g, java.lang.Boolean> mo4696b(long r23, long r25, p288y.C8343c r27, boolean r28, androidx.compose.p015ui.layout.C1689j r29, androidx.compose.foundation.text.selection.SelectionAdjustment r30, androidx.compose.foundation.text.selection.C1011g r31) {
        /*
            r22 = this;
            r0 = r22
            r1 = r27
            r2 = r31
            java.lang.String r3 = "adjustment"
            r4 = r30
            kotlin.jvm.internal.C19383o.m32797g(r4, r3)
            r11 = 0
            if (r2 == 0) goto L_0x0025
            long r5 = r0.f2118a
            androidx.compose.foundation.text.selection.g$a r7 = r2.f2121a
            long r7 = r7.f2126c
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
            androidx.compose.foundation.text.selection.g$a r7 = r2.f2122b
            long r7 = r7.f2126c
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = r11
            goto L_0x0026
        L_0x0025:
            r5 = 1
        L_0x0026:
            if (r5 == 0) goto L_0x0108
            androidx.compose.ui.layout.j r5 = r22.mo4697c()
            r6 = 0
            if (r5 != 0) goto L_0x0037
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r6, r2)
            return r1
        L_0x0037:
            kq.a<androidx.compose.ui.text.q> r7 = r0.f2120c
            java.lang.Object r7 = r7.invoke()
            r15 = r7
            androidx.compose.ui.text.q r15 = (androidx.compose.p015ui.text.C2021q) r15
            if (r15 != 0) goto L_0x004a
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r6, r2)
            return r1
        L_0x004a:
            long r7 = p288y.C8343c.f18295b
            r9 = r29
            long r7 = r9.mo6686m(r5, r7)
            r9 = r23
            long r9 = p288y.C8343c.m16644e(r9, r7)
            r12 = r25
            long r12 = p288y.C8343c.m16644e(r12, r7)
            if (r1 == 0) goto L_0x006c
            long r3 = r1.f18299a
            long r3 = p288y.C8343c.m16644e(r3, r7)
            y.c r1 = new y.c
            r1.<init>(r3)
            goto L_0x006d
        L_0x006c:
            r1 = r6
        L_0x006d:
            long r7 = r0.f2118a
            y.d r3 = new y.d
            long r4 = r15.f4591c
            r14 = 32
            r23 = r7
            long r6 = r4 >> r14
            int r6 = (int) r6
            float r6 = (float) r6
            int r4 = p174m0.C7290i.m13995b(r4)
            float r4 = (float) r4
            r5 = 0
            r3.<init>(r5, r5, r6, r4)
            androidx.compose.foundation.text.selection.SelectionMode r16 = androidx.compose.foundation.text.selection.SelectionMode.Vertical
            r17 = r3
            r18 = r9
            r20 = r12
            boolean r4 = r16.m34732isSelected2x9bVx0$foundation_release(r17, r18, r20)
            if (r4 != 0) goto L_0x009c
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r4 = 0
            r1.<init>(r4, r2)
            goto L_0x0107
        L_0x009c:
            r4 = 0
            int r14 = com.google.android.play.core.assetpacks.C15588c1.m25331j0(r15, r3, r9)
            int r12 = com.google.android.play.core.assetpacks.C15588c1.m25331j0(r15, r3, r12)
            if (r1 == 0) goto L_0x00ae
            long r5 = r1.f18299a
            int r1 = com.google.android.play.core.assetpacks.C15588c1.m25331j0(r15, r3, r5)
            goto L_0x00af
        L_0x00ae:
            r1 = -1
        L_0x00af:
            long r6 = p001a0.C0005b.m47l(r14, r12)
            if (r2 == 0) goto L_0x00c8
            androidx.compose.foundation.text.selection.g$a r3 = r2.f2121a
            int r3 = r3.f2125b
            androidx.compose.foundation.text.selection.g$a r4 = r2.f2122b
            int r4 = r4.f2125b
            long r3 = p001a0.C0005b.m47l(r3, r4)
            androidx.compose.ui.text.r r5 = new androidx.compose.ui.text.r
            r5.<init>(r3)
            r10 = r5
            goto L_0x00c9
        L_0x00c8:
            r10 = r4
        L_0x00c9:
            r4 = r30
            r5 = r15
            r16 = r23
            r8 = r1
            r9 = r28
            long r3 = r4.mo4590a(r5, r6, r8, r9, r10)
            boolean r5 = androidx.compose.p015ui.text.C2022r.m4467f(r3)
            r6 = r12
            r12 = r3
            r3 = r14
            r14 = r5
            r7 = r15
            r15 = r16
            r17 = r7
            androidx.compose.foundation.text.selection.g r4 = com.google.android.play.core.assetpacks.C15588c1.m25326g0(r12, r14, r15, r17)
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r4, r2)
            r5 = 1
            r2 = r2 ^ r5
            if (r28 == 0) goto L_0x00f1
            if (r3 == r1) goto L_0x00f5
            goto L_0x00f3
        L_0x00f1:
            if (r6 == r1) goto L_0x00f5
        L_0x00f3:
            r1 = r5
            goto L_0x00f6
        L_0x00f5:
            r1 = r11
        L_0x00f6:
            if (r1 != 0) goto L_0x00fd
            if (r2 == 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r3 = r11
            goto L_0x00fe
        L_0x00fd:
            r3 = r5
        L_0x00fe:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r1.<init>(r4, r2)
        L_0x0107:
            return r1
        L_0x0108:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The given previousSelection doesn't belong to this selectable."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C1009e.mo4696b(long, long, y.c, boolean, androidx.compose.ui.layout.j, androidx.compose.foundation.text.selection.SelectionAdjustment, androidx.compose.foundation.text.selection.g):kotlin.Pair");
    }

    /* renamed from: c */
    public final C1689j mo4697c() {
        C1689j invoke = this.f2119b.invoke();
        if (invoke == null || !invoke.mo6685c()) {
            return null;
        }
        return invoke;
    }

    /* renamed from: d */
    public final long mo4698d(C1011g gVar, boolean z) {
        if ((z && gVar.f2121a.f2126c != this.f2118a) || (!z && gVar.f2122b.f2126c != this.f2118a)) {
            return C8343c.f18295b;
        }
        if (mo4697c() == null) {
            return C8343c.f18295b;
        }
        C2021q invoke = this.f2120c.invoke();
        if (invoke == null) {
            return C8343c.f18295b;
        }
        int i = (z ? gVar.f2121a : gVar.f2122b).f2125b;
        return C19421p.m32952q(C19421p.m32921K(invoke, i, z, gVar.f2123c), invoke.mo7741d(invoke.mo7744f(i)));
    }

    /* renamed from: e */
    public final long mo4699e() {
        return this.f2118a;
    }

    /* renamed from: f */
    public final C1011g mo4700f() {
        C2021q invoke = this.f2120c.invoke();
        if (invoke == null) {
            return null;
        }
        return C15588c1.m25326g0(C0005b.m47l(0, invoke.f4589a.f4556a.length()), false, this.f2118a, invoke);
    }

    /* renamed from: g */
    public final long mo4701g(int i) {
        C2021q invoke = this.f2120c.invoke();
        if (invoke == null) {
            int i2 = C2022r.f4596c;
            return C2022r.f4595b;
        }
        int length = invoke.f4589a.f4556a.length();
        if (length < 1) {
            int i3 = C2022r.f4596c;
            return C2022r.f4595b;
        }
        int f = invoke.mo7744f(C19388s.m32833M(i, 0, length - 1));
        return C0005b.m47l(invoke.mo7749j(f), invoke.mo7742e(f, true));
    }

    public final C1913a getText() {
        C2021q invoke = this.f2120c.invoke();
        return invoke == null ? new C1913a("", (List) null, 6) : invoke.f4589a.f4556a;
    }
}
