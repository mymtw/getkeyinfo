package androidx.compose.p015ui.node;

import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1533m;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.graphics.C1604x;
import androidx.compose.p015ui.unit.LayoutDirection;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import p297z.C8406a;
import p297z.C8410c;
import p297z.C8412e;
import p297z.C8413f;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.node.h */
public final class C1741h implements C8412e, C8410c {

    /* renamed from: b */
    public final C8406a f3917b = new C8406a();

    /* renamed from: c */
    public DrawEntity f3918c;

    /* renamed from: A */
    public final long mo3788A(long j) {
        return this.f3917b.mo3788A(j);
    }

    /* renamed from: B0 */
    public final float mo3789B0(float f) {
        return this.f3917b.getDensity() * f;
    }

    /* renamed from: C0 */
    public final C8406a.C8408b mo6900C0() {
        return this.f3917b.f18423c;
    }

    /* renamed from: D0 */
    public final void mo6901D0(long j, float f, long j2, float f2, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6901D0(j, f, j2, f2, fVar2, tVar, i);
    }

    /* renamed from: E0 */
    public final int mo3790E0(long j) {
        return this.f3917b.mo3790E0(j);
    }

    /* renamed from: F */
    public final void mo6902F(C1604x xVar, long j, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(xVar, ResponseConstants.IMAGE);
        C19383o.m32797g(fVar, "style");
        this.f3917b.mo6902F(xVar, j, f, fVar, tVar, i);
    }

    /* renamed from: F0 */
    public final void mo6903F0(long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6903F0(j, j2, j3, f, fVar2, tVar, i);
    }

    /* renamed from: H */
    public final void mo6904H(long j, long j2, long j3, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2) {
        this.f3917b.mo6904H(j, j2, j3, f, i, bVar, f2, tVar, i2);
    }

    /* renamed from: I */
    public final void mo6905I(long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6905I(j, j2, j3, f, fVar2, tVar, i);
    }

    /* renamed from: I0 */
    public final void mo6906I0(C1533m mVar, long j, long j2, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(mVar, "brush");
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6906I0(mVar, j, j2, f, fVar2, tVar, i);
    }

    /* renamed from: K0 */
    public final long mo6907K0() {
        return this.f3917b.mo6907K0();
    }

    /* renamed from: L */
    public final void mo6908L(long j, long j2, long j3, long j4, C8413f fVar, float f, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6908L(j, j2, j3, j4, fVar2, f, tVar, i);
    }

    /* renamed from: L0 */
    public final void mo6909L0(C1604x xVar, long j, long j2, long j3, long j4, float f, C8413f fVar, C1546t tVar, int i, int i2) {
        C1604x xVar2 = xVar;
        C19383o.m32797g(xVar2, ResponseConstants.IMAGE);
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6909L0(xVar2, j, j2, j3, j4, f, fVar2, tVar, i, i2);
    }

    /* renamed from: M0 */
    public final void mo6910M0(C1533m mVar, long j, long j2, long j3, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(mVar, "brush");
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6910M0(mVar, j, j2, j3, f, fVar2, tVar, i);
    }

    /* renamed from: O0 */
    public final void mo6911O0() {
        C1537o a = this.f3917b.f18423c.mo20991a();
        DrawEntity drawEntity = this.f3918c;
        C19383o.m32794d(drawEntity);
        DrawEntity drawEntity2 = (DrawEntity) drawEntity.f3921d;
        if (drawEntity2 != null) {
            drawEntity2.mo6736c(a);
        } else {
            drawEntity.f3919b.mo6803n1(a);
        }
    }

    /* renamed from: Q0 */
    public final void mo6912Q0(C1533m mVar, long j, long j2, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2) {
        C19383o.m32797g(mVar, "brush");
        this.f3917b.mo6912Q0(mVar, j, j2, f, i, bVar, f2, tVar, i2);
    }

    /* renamed from: V */
    public final int mo3791V(float f) {
        return this.f3917b.mo3791V(f);
    }

    /* renamed from: b */
    public final long mo6913b() {
        return this.f3917b.mo6913b();
    }

    /* renamed from: b0 */
    public final float mo3793b0(long j) {
        return this.f3917b.mo3793b0(j);
    }

    /* renamed from: c0 */
    public final void mo6914c0(C1492b0 b0Var, C1533m mVar, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(b0Var, ResponseConstants.PATH);
        C19383o.m32797g(mVar, "brush");
        C19383o.m32797g(fVar, "style");
        this.f3917b.mo6914c0(b0Var, mVar, f, fVar, tVar, i);
    }

    /* renamed from: e */
    public final float mo3794e(long j) {
        return this.f3917b.mo3794e(j);
    }

    public final float getDensity() {
        return this.f3917b.getDensity();
    }

    public final LayoutDirection getLayoutDirection() {
        return this.f3917b.f18422b.f18427b;
    }

    /* renamed from: h0 */
    public final void mo6916h0(ArrayList arrayList, long j, float f, int i, C18263b bVar, float f2, C1546t tVar, int i2) {
        this.f3917b.mo6916h0(arrayList, j, f, i, bVar, f2, tVar, i2);
    }

    /* renamed from: k0 */
    public final void mo6917k0(long j, float f, float f2, long j2, long j3, float f3, C8413f fVar, C1546t tVar, int i) {
        C8413f fVar2 = fVar;
        C19383o.m32797g(fVar2, "style");
        this.f3917b.mo6917k0(j, f, f2, j2, j3, f3, fVar2, tVar, i);
    }

    /* renamed from: p */
    public final float mo3797p(int i) {
        return this.f3917b.mo3797p(i);
    }

    /* renamed from: q */
    public final float mo3798q(float f) {
        return f / this.f3917b.getDensity();
    }

    /* renamed from: w */
    public final long mo3799w(long j) {
        return this.f3917b.mo3799w(j);
    }

    /* renamed from: w0 */
    public final float mo3800w0() {
        return this.f3917b.mo3800w0();
    }

    /* renamed from: z0 */
    public final void mo6918z0(C1492b0 b0Var, long j, float f, C8413f fVar, C1546t tVar, int i) {
        C19383o.m32797g(b0Var, ResponseConstants.PATH);
        C19383o.m32797g(fVar, "style");
        this.f3917b.mo6918z0(b0Var, j, f, fVar, tVar, i);
    }
}
