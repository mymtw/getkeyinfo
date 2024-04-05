package androidx.constraintlayout.solver.widgets.analyzer;

import com.etsy.android.lib.conversation.MessageDraft;
import java.util.ArrayList;
import java.util.Iterator;

public class DependencyNode implements C2204d {

    /* renamed from: a */
    public WidgetRun f5183a = null;

    /* renamed from: b */
    public boolean f5184b = false;

    /* renamed from: c */
    public boolean f5185c = false;

    /* renamed from: d */
    public WidgetRun f5186d;

    /* renamed from: e */
    public Type f5187e = Type.UNKNOWN;

    /* renamed from: f */
    public int f5188f;

    /* renamed from: g */
    public int f5189g;

    /* renamed from: h */
    public int f5190h = 1;

    /* renamed from: i */
    public C2206f f5191i = null;

    /* renamed from: j */
    public boolean f5192j = false;

    /* renamed from: k */
    public ArrayList f5193k = new ArrayList();

    /* renamed from: l */
    public ArrayList f5194l = new ArrayList();

    public enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f5186d = widgetRun;
    }

    /* renamed from: a */
    public final void mo8301a(C2204d dVar) {
        Iterator it = this.f5194l.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).f5192j) {
                return;
            }
        }
        this.f5185c = true;
        WidgetRun widgetRun = this.f5183a;
        if (widgetRun != null) {
            widgetRun.mo8301a(this);
        }
        if (this.f5184b) {
            this.f5186d.mo8301a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i = 0;
        Iterator it2 = this.f5194l.iterator();
        while (it2.hasNext()) {
            DependencyNode dependencyNode2 = (DependencyNode) it2.next();
            if (!(dependencyNode2 instanceof C2206f)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.f5192j) {
            C2206f fVar = this.f5191i;
            if (fVar != null) {
                if (fVar.f5192j) {
                    this.f5188f = this.f5190h * fVar.f5189g;
                } else {
                    return;
                }
            }
            mo8304d(dependencyNode.f5189g + this.f5188f);
        }
        WidgetRun widgetRun2 = this.f5183a;
        if (widgetRun2 != null) {
            widgetRun2.mo8301a(this);
        }
    }

    /* renamed from: b */
    public final void mo8302b(C2204d dVar) {
        this.f5193k.add(dVar);
        if (this.f5192j) {
            dVar.mo8301a(dVar);
        }
    }

    /* renamed from: c */
    public final void mo8303c() {
        this.f5194l.clear();
        this.f5193k.clear();
        this.f5192j = false;
        this.f5189g = 0;
        this.f5185c = false;
        this.f5184b = false;
    }

    /* renamed from: d */
    public void mo8304d(int i) {
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

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5186d.f5196b.f5145e0);
        sb.append(MessageDraft.IMAGE_DELIMITER);
        sb.append(this.f5187e);
        sb.append("(");
        sb.append(this.f5192j ? Integer.valueOf(this.f5189g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f5194l.size());
        sb.append(":d=");
        sb.append(this.f5193k.size());
        sb.append(">");
        return sb.toString();
    }
}
