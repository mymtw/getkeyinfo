package androidx.compose.p015ui.node;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.node.C1742i;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.node.i */
public class C1742i<T extends C1742i<T, M>, M extends C1436d> {

    /* renamed from: b */
    public final LayoutNodeWrapper f3919b;

    /* renamed from: c */
    public final M f3920c;

    /* renamed from: d */
    public T f3921d;

    /* renamed from: e */
    public boolean f3922e;

    public C1742i(LayoutNodeWrapper layoutNodeWrapper, M m) {
        C19383o.m32797g(layoutNodeWrapper, "layoutNodeWrapper");
        C19383o.m32797g(m, "modifier");
        this.f3919b = layoutNodeWrapper;
        this.f3920c = m;
    }

    /* renamed from: a */
    public void mo6735a() {
        this.f3922e = true;
    }

    /* renamed from: b */
    public void mo6919b() {
        this.f3922e = false;
    }
}
