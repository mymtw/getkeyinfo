package p297z;

import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1604x;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p174m0.C7287g;
import p288y.C8341a;
import p288y.C8343c;
import p288y.C8347f;
import p297z.C8406a;
import p628nj.C18263b;

/* renamed from: z.e */
public interface C8412e extends C7282b {
    /* renamed from: A0 */
    static void m16780A0(C8412e eVar, C1533m mVar, long j, long j2, float f, C8413f fVar, int i) {
        long j3 = (i & 2) != 0 ? C8343c.f18295b : j;
        eVar.mo6906I0(mVar, j3, (i & 4) != 0 ? m16790r0(eVar.mo6913b(), j3) : j2, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? C8415h.f18433a : fVar, (C1546t) null, (i & 64) != 0 ? 3 : 0);
    }

    /* renamed from: C */
    static void m16781C(C8412e eVar, long j, float f, float f2, long j2, long j3, C8413f fVar) {
        eVar.mo6917k0(j, f, f2, j2, j3, 1.0f, fVar, (C1546t) null, 3);
    }

    /* JADX WARNING: type inference failed for: r13v6, types: [z.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m16782E(p297z.C8412e r9, androidx.compose.p015ui.graphics.C1492b0 r10, long r11, p297z.C8416i r13, int r14) {
        /*
            r0 = r14 & 4
            if (r0 == 0) goto L_0x0007
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r5 = r0
            r0 = r14 & 8
            if (r0 == 0) goto L_0x000f
            z.h r13 = p297z.C8415h.f18433a
        L_0x000f:
            r6 = r13
            r7 = 0
            r13 = r14 & 32
            if (r13 == 0) goto L_0x0017
            r13 = 3
            goto L_0x0018
        L_0x0017:
            r13 = 0
        L_0x0018:
            r8 = r13
            r1 = r9
            r2 = r10
            r3 = r11
            r1.mo6918z0(r2, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p297z.C8412e.m16782E(z.e, androidx.compose.ui.graphics.b0, long, z.i, int):void");
    }

    /* renamed from: H0 */
    static void m16783H0(C8412e eVar, C1533m mVar, long j, long j2, long j3, C8416i iVar, int i) {
        int i2 = i;
        long j4 = (i2 & 2) != 0 ? C8343c.f18295b : j;
        eVar.mo6910M0(mVar, j4, (i2 & 4) != 0 ? m16790r0(eVar.mo6913b(), j4) : j2, (i2 & 8) != 0 ? C8341a.f18289a : j3, (i2 & 16) != 0 ? 1.0f : 0.0f, (i2 & 32) != 0 ? C8415h.f18433a : iVar, (C1546t) null, (i2 & 128) != 0 ? 3 : 0);
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [z.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m16784J0(p297z.C8412e r7, androidx.compose.p015ui.graphics.C1492b0 r8, androidx.compose.p015ui.graphics.C1533m r9, float r10, p297z.C8416i r11, int r12) {
        /*
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0006
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x0006:
            r3 = r10
            r10 = r12 & 8
            if (r10 == 0) goto L_0x000d
            z.h r11 = p297z.C8415h.f18433a
        L_0x000d:
            r4 = r11
            r5 = 0
            r10 = r12 & 32
            if (r10 == 0) goto L_0x0015
            r10 = 3
            goto L_0x0016
        L_0x0015:
            r10 = 0
        L_0x0016:
            r6 = r10
            r0 = r7
            r1 = r8
            r2 = r9
            r0.mo6914c0(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p297z.C8412e.m16784J0(z.e, androidx.compose.ui.graphics.b0, androidx.compose.ui.graphics.m, float, z.i, int):void");
    }

    /* renamed from: N */
    static void m16785N(C8412e eVar, long j, long j2, long j3, float f, int i) {
        long j4 = (i & 2) != 0 ? C8343c.f18295b : j2;
        eVar.mo6903F0(j, j4, (i & 4) != 0 ? m16790r0(eVar.mo6913b(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? C8415h.f18433a : null, (C1546t) null, (i & 64) != 0 ? 3 : 0);
    }

    /* renamed from: S */
    static void m16786S(C8412e eVar, C1604x xVar, long j, long j2, long j3, long j4, float f, C8413f fVar, C1546t tVar, int i, int i2, int i3) {
        int i4 = i3;
        long j5 = (i4 & 2) != 0 ? C7287g.f16164b : j;
        long a = (i4 & 4) != 0 ? C0761x.m1707a(xVar.getWidth(), xVar.getHeight()) : j2;
        eVar.mo6909L0(xVar, j5, a, (i4 & 8) != 0 ? C7287g.f16164b : j3, (i4 & 16) != 0 ? a : j4, (i4 & 32) != 0 ? 1.0f : f, (i4 & 64) != 0 ? C8415h.f18433a : fVar, (i4 & 128) != 0 ? null : tVar, (i4 & 256) != 0 ? 3 : i, (i4 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? 1 : i2);
    }

    /* renamed from: d0 */
    static /* synthetic */ void m16787d0(C8412e eVar, long j, long j2, long j3, float f, int i, int i2) {
        int i3 = i2;
        float f2 = 0.0f;
        float f3 = (i3 & 8) != 0 ? 0.0f : f;
        int i4 = (i3 & 16) != 0 ? 0 : i;
        if ((i3 & 64) != 0) {
            f2 = 1.0f;
        }
        eVar.mo6904H(j, j2, j3, f3, i4, (C18263b) null, f2, (C1546t) null, (i3 & 256) != 0 ? 3 : 0);
    }

    /* renamed from: j0 */
    static void m16788j0(C8412e eVar, long j, long j2, long j3, C8416i iVar) {
        eVar.mo6905I(j, j2, j3, 1.0f, iVar, (C1546t) null, 3);
    }

    /* renamed from: n0 */
    static void m16789n0(C8412e eVar, C1604x xVar, C1546t tVar) {
        eVar.mo6902F(xVar, C8343c.f18295b, 1.0f, C8415h.f18433a, tVar, 3);
    }

    /* renamed from: r0 */
    private static long m16790r0(long j, long j2) {
        return C0114h.m319t(C8347f.m16656d(j) - C8343c.m16642c(j2), C8347f.m16654b(j) - C8343c.m16643d(j2));
    }

    /* renamed from: u0 */
    static void m16791u0(C8412e eVar, long j, long j2, long j3, long j4, C8413f fVar, int i) {
        int i2 = i;
        long j5 = (i2 & 2) != 0 ? C8343c.f18295b : j2;
        eVar.mo6908L(j, j5, (i2 & 4) != 0 ? m16790r0(eVar.mo6913b(), j5) : j3, (i2 & 8) != 0 ? C8341a.f18289a : j4, (i2 & 16) != 0 ? C8415h.f18433a : fVar, (i2 & 32) != 0 ? 1.0f : 0.0f, (C1546t) null, (i2 & 128) != 0 ? 3 : 0);
    }

    /* renamed from: x */
    static /* synthetic */ void m16792x(C8412e eVar, C1533m mVar, long j, long j2, float f, float f2, int i) {
        int i2 = i;
        eVar.mo6912Q0(mVar, j, j2, (i2 & 8) != 0 ? 0.0f : f, 0, (C18263b) null, (i2 & 64) != 0 ? 1.0f : f2, (C1546t) null, (i2 & 256) != 0 ? 3 : 0);
    }

    /* renamed from: y */
    static /* synthetic */ void m16793y(C8412e eVar, long j, float f, long j2, C8413f fVar, int i) {
        eVar.mo6901D0(j, (i & 2) != 0 ? C8347f.m16655c(eVar.mo6913b()) / 2.0f : f, (i & 4) != 0 ? eVar.mo6907K0() : j2, (i & 8) != 0 ? 1.0f : 0.0f, (i & 16) != 0 ? C8415h.f18433a : fVar, (C1546t) null, (i & 64) != 0 ? 3 : 0);
    }

    /* renamed from: C0 */
    C8406a.C8408b mo6900C0();

    /* renamed from: D0 */
    void mo6901D0(long j, float f, long j2, float f2, C8413f fVar, C1546t tVar, int i);

    /* renamed from: F */
    void mo6902F(C1604x xVar, long j, float f, C8413f fVar, C1546t tVar, int i);

    /* renamed from: F0 */
    void mo6903F0(long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i);

    /* renamed from: H */
    void mo6904H(long j, long j2, long j3, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2);

    /* renamed from: I */
    void mo6905I(long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i);

    /* renamed from: I0 */
    void mo6906I0(C1533m mVar, long j, long j2, float f, C8413f fVar, C1546t tVar, int i);

    /* renamed from: K0 */
    long mo6907K0() {
        return C0114h.m298c0(mo6900C0().mo20992b());
    }

    /* renamed from: L */
    void mo6908L(long j, long j2, long j3, long j4, C8413f fVar, float f, C1546t tVar, int i);

    /* renamed from: L0 */
    void mo6909L0(C1604x xVar, long j, long j2, long j3, long j4, float f, C8413f fVar, C1546t tVar, int i, int i2) {
        C1604x xVar2 = xVar;
        C19383o.m32797g(xVar2, ResponseConstants.IMAGE);
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        m16786S(this, xVar2, j, j2, j3, j4, f, fVar2, tVar, i, 0, RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    /* renamed from: M0 */
    void mo6910M0(C1533m mVar, long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i);

    /* renamed from: Q0 */
    void mo6912Q0(C1533m mVar, long j, long j2, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2);

    /* renamed from: b */
    long mo6913b() {
        return mo6900C0().mo20992b();
    }

    /* renamed from: c0 */
    void mo6914c0(C1492b0 b0Var, C1533m mVar, float f, C8413f fVar, C1546t tVar, int i);

    LayoutDirection getLayoutDirection();

    /* renamed from: h0 */
    void mo6916h0(ArrayList arrayList, long j, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2);

    /* renamed from: k0 */
    void mo6917k0(long j, float f, float f2, long j2, long j3, float f3, C8413f fVar, C1546t tVar, int i);

    /* renamed from: z0 */
    void mo6918z0(C1492b0 b0Var, long j, float f, C8413f fVar, C1546t tVar, int i);
}
