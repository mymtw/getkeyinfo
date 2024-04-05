package androidx.compose.p015ui.graphics.painter;

import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.graphics.C1546t;
import androidx.compose.p015ui.unit.LayoutDirection;
import p297z.C8412e;

/* renamed from: androidx.compose.ui.graphics.painter.Painter */
public abstract class Painter {

    /* renamed from: a */
    public C1516e f3340a;

    /* renamed from: b */
    public boolean f3341b;

    /* renamed from: c */
    public C1546t f3342c;

    /* renamed from: d */
    public float f3343d = 1.0f;

    /* renamed from: e */
    public LayoutDirection f3344e = LayoutDirection.Ltr;

    public Painter() {
        new Painter$drawLambda$1(this);
    }

    /* renamed from: a */
    public abstract boolean mo6388a(float f);

    /* renamed from: b */
    public abstract boolean mo6389b(C1546t tVar);

    /* renamed from: c */
    public abstract long mo6390c();

    /* renamed from: d */
    public abstract void mo6391d(C8412e eVar);
}
