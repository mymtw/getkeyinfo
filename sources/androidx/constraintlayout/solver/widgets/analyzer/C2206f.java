package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.analyzer.DependencyNode;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.f */
public class C2206f extends DependencyNode {

    /* renamed from: m */
    public int f5229m;

    public C2206f(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof C2211k) {
            this.f5187e = DependencyNode.Type.HORIZONTAL_DIMENSION;
        } else {
            this.f5187e = DependencyNode.Type.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: d */
    public final void mo8304d(int i) {
        if (!this.f5192j) {
            this.f5192j = true;
            this.f5189g = i;
            Iterator it = this.f5193k.iterator();
            while (it.hasNext()) {
                C2204d dVar = (C2204d) it.next();
                dVar.mo8301a(dVar);
            }
        }
    }
}
