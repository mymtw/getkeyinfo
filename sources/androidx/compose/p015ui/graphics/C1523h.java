package androidx.compose.p015ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.graphics.h */
public final class C1523h implements C1515d0 {

    /* renamed from: a */
    public final PathMeasure f3301a;

    public C1523h(PathMeasure pathMeasure) {
        this.f3301a = pathMeasure;
    }

    /* renamed from: a */
    public final boolean mo6323a(float f, float f2, C1492b0 b0Var) {
        C19383o.m32797g(b0Var, "destination");
        PathMeasure pathMeasure = this.f3301a;
        if (b0Var instanceof C1521g) {
            return pathMeasure.getSegment(f, f2, ((C1521g) b0Var).f3296a, true);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: b */
    public final void mo6324b(C1492b0 b0Var) {
        Path path;
        PathMeasure pathMeasure = this.f3301a;
        if (b0Var == null) {
            path = null;
        } else if (b0Var instanceof C1521g) {
            path = ((C1521g) b0Var).f3296a;
        } else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure.setPath(path, false);
    }

    public final float getLength() {
        return this.f3301a.getLength();
    }
}
