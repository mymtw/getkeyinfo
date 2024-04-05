package androidx.compose.p015ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p288y.C8341a;
import p288y.C8343c;
import p288y.C8345d;
import p288y.C8346e;

/* renamed from: androidx.compose.ui.graphics.g */
public final class C1521g implements C1492b0 {

    /* renamed from: a */
    public final Path f3296a;

    /* renamed from: b */
    public final RectF f3297b;

    /* renamed from: c */
    public final float[] f3298c;

    /* renamed from: d */
    public final Matrix f3299d;

    public C1521g() {
        this(0);
    }

    public C1521g(Path path) {
        C19383o.m32797g(path, "internalPath");
        this.f3296a = path;
        this.f3297b = new RectF();
        this.f3298c = new float[8];
        this.f3299d = new Matrix();
    }

    /* renamed from: a */
    public final boolean mo6273a() {
        return this.f3296a.isConvex();
    }

    /* renamed from: b */
    public final void mo6274b(float f, float f2) {
        this.f3296a.rMoveTo(f, f2);
    }

    /* renamed from: c */
    public final void mo6275c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3296a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    public final void close() {
        this.f3296a.close();
    }

    /* renamed from: d */
    public final void mo6277d(C8346e eVar) {
        C19383o.m32797g(eVar, "roundRect");
        this.f3297b.set(eVar.f18305a, eVar.f18306b, eVar.f18307c, eVar.f18308d);
        this.f3298c[0] = C8341a.m16635b(eVar.f18309e);
        this.f3298c[1] = C8341a.m16636c(eVar.f18309e);
        this.f3298c[2] = C8341a.m16635b(eVar.f18310f);
        this.f3298c[3] = C8341a.m16636c(eVar.f18310f);
        this.f3298c[4] = C8341a.m16635b(eVar.f18311g);
        this.f3298c[5] = C8341a.m16636c(eVar.f18311g);
        this.f3298c[6] = C8341a.m16635b(eVar.f18312h);
        this.f3298c[7] = C8341a.m16636c(eVar.f18312h);
        this.f3296a.addRoundRect(this.f3297b, this.f3298c, Path.Direction.CCW);
    }

    /* renamed from: e */
    public final void mo6278e(float f, float f2, float f3, float f4) {
        this.f3296a.quadTo(f, f2, f3, f4);
    }

    /* renamed from: f */
    public final void mo6279f(float f, float f2, float f3, float f4) {
        this.f3296a.rQuadTo(f, f2, f3, f4);
    }

    /* renamed from: g */
    public final void mo6280g(float f, float f2) {
        this.f3296a.moveTo(f, f2);
    }

    public final C8345d getBounds() {
        this.f3296a.computeBounds(this.f3297b, true);
        RectF rectF = this.f3297b;
        return new C8345d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: h */
    public final void mo6282h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f3296a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: j */
    public final boolean mo6283j(C1492b0 b0Var, C1492b0 b0Var2, int i) {
        Path.Op op;
        C19383o.m32797g(b0Var, "path1");
        C19383o.m32797g(b0Var2, "path2");
        boolean z = false;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i == 1) {
                op = Path.Op.INTERSECT;
            } else {
                if (i == 4) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    op = z ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        Path path = this.f3296a;
        if (b0Var instanceof C1521g) {
            Path path2 = ((C1521g) b0Var).f3296a;
            if (b0Var2 instanceof C1521g) {
                return path.op(path2, ((C1521g) b0Var2).f3296a, op);
            }
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: k */
    public final void mo6284k(C8345d dVar) {
        C19383o.m32797g(dVar, "rect");
        if (!(!Float.isNaN(dVar.f18301a))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        } else if (!(!Float.isNaN(dVar.f18302b))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        } else if (!(!Float.isNaN(dVar.f18303c))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        } else if (!Float.isNaN(dVar.f18304d)) {
            this.f3297b.set(new RectF(dVar.f18301a, dVar.f18302b, dVar.f18303c, dVar.f18304d));
            this.f3296a.addRect(this.f3297b, Path.Direction.CCW);
        } else {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
    }

    /* renamed from: l */
    public final void mo6285l(float f, float f2) {
        this.f3296a.rLineTo(f, f2);
    }

    /* renamed from: m */
    public final void mo6286m(float f, float f2) {
        this.f3296a.lineTo(f, f2);
    }

    /* renamed from: n */
    public final void mo6338n(C1492b0 b0Var, long j) {
        C19383o.m32797g(b0Var, ResponseConstants.PATH);
        Path path = this.f3296a;
        if (b0Var instanceof C1521g) {
            path.addPath(((C1521g) b0Var).f3296a, C8343c.m16642c(j), C8343c.m16643d(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: o */
    public final boolean mo6339o() {
        return this.f3296a.isEmpty();
    }

    /* renamed from: p */
    public final void mo6340p(long j) {
        this.f3299d.reset();
        this.f3299d.setTranslate(C8343c.m16642c(j), C8343c.m16643d(j));
        this.f3296a.transform(this.f3299d);
    }

    public final void reset() {
        this.f3296a.reset();
    }

    public /* synthetic */ C1521g(int i) {
        this(new Path());
    }
}
