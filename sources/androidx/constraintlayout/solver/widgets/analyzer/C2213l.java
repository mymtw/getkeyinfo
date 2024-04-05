package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.l */
public final class C2213l {

    /* renamed from: a */
    public WidgetRun f5233a = null;

    /* renamed from: b */
    public ArrayList<WidgetRun> f5234b = new ArrayList<>();

    public C2213l(WidgetRun widgetRun) {
        this.f5233a = widgetRun;
    }

    /* renamed from: a */
    public static long m4863a(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f5186d;
        if (widgetRun instanceof C2210j) {
            return j;
        }
        int size = dependencyNode.f5193k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C2204d dVar = (C2204d) dependencyNode.f5193k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f5186d != widgetRun) {
                    j2 = Math.min(j2, m4863a(dependencyNode2, ((long) dependencyNode2.f5188f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f5203i) {
            return j2;
        }
        long j3 = j - widgetRun.mo8311j();
        return Math.min(Math.min(j2, m4863a(widgetRun.f5202h, j3)), j3 - ((long) widgetRun.f5202h.f5188f));
    }

    /* renamed from: b */
    public static long m4864b(DependencyNode dependencyNode, long j) {
        WidgetRun widgetRun = dependencyNode.f5186d;
        if (widgetRun instanceof C2210j) {
            return j;
        }
        int size = dependencyNode.f5193k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            C2204d dVar = (C2204d) dependencyNode.f5193k.get(i);
            if (dVar instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dVar;
                if (dependencyNode2.f5186d != widgetRun) {
                    j2 = Math.max(j2, m4864b(dependencyNode2, ((long) dependencyNode2.f5188f) + j));
                }
            }
        }
        if (dependencyNode != widgetRun.f5202h) {
            return j2;
        }
        long j3 = j + widgetRun.mo8311j();
        return Math.max(Math.max(j2, m4864b(widgetRun.f5203i, j3)), j3 - ((long) widgetRun.f5203i.f5188f));
    }
}
