package androidx.constraintlayout.solver.widgets.analyzer;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.widgets.C2218b;
import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.n */
public final class C2216n {

    /* renamed from: f */
    public static int f5238f;

    /* renamed from: a */
    public ArrayList<ConstraintWidget> f5239a = new ArrayList<>();

    /* renamed from: b */
    public int f5240b;

    /* renamed from: c */
    public int f5241c;

    /* renamed from: d */
    public ArrayList<C2217a> f5242d = null;

    /* renamed from: e */
    public int f5243e = -1;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.n$a */
    public class C2217a {
        public C2217a(ConstraintWidget constraintWidget, C2190c cVar) {
            new WeakReference(constraintWidget);
            ConstraintAnchor constraintAnchor = constraintWidget.f5114E;
            cVar.getClass();
            C2190c.m4718n(constraintAnchor);
            C2190c.m4718n(constraintWidget.f5115F);
            C2190c.m4718n(constraintWidget.f5116G);
            C2190c.m4718n(constraintWidget.f5117H);
            C2190c.m4718n(constraintWidget.f5118I);
        }
    }

    public C2216n(int i) {
        int i2 = f5238f;
        f5238f = i2 + 1;
        this.f5240b = i2;
        this.f5241c = i;
    }

    /* renamed from: a */
    public final boolean mo8333a(ConstraintWidget constraintWidget) {
        if (this.f5239a.contains(constraintWidget)) {
            return false;
        }
        this.f5239a.add(constraintWidget);
        return true;
    }

    /* renamed from: b */
    public final void mo8334b(ArrayList<C2216n> arrayList) {
        int size = this.f5239a.size();
        if (this.f5243e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2216n nVar = arrayList.get(i);
                if (this.f5243e == nVar.f5240b) {
                    mo8336d(this.f5241c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: c */
    public final int mo8335c(C2190c cVar, int i) {
        int i2;
        int i3;
        if (this.f5239a.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.f5239a;
        C2220d dVar = (C2220d) arrayList.get(0).f5126Q;
        cVar.mo8240s();
        dVar.mo8276e(cVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).mo8276e(cVar, false);
        }
        if (i == 0 && dVar.f5277x0 > 0) {
            C2218b.m4875a(dVar, cVar, arrayList, 0);
        }
        if (i == 1 && dVar.f5278y0 > 0) {
            C2218b.m4875a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.mo8237p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f5242d = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.f5242d.add(new C2217a(arrayList.get(i5), cVar));
        }
        if (i == 0) {
            i2 = C2190c.m4718n(dVar.f5114E);
            i3 = C2190c.m4718n(dVar.f5116G);
            cVar.mo8240s();
        } else {
            i2 = C2190c.m4718n(dVar.f5115F);
            i3 = C2190c.m4718n(dVar.f5117H);
            cVar.mo8240s();
        }
        return i3 - i2;
    }

    /* renamed from: d */
    public final void mo8336d(int i, C2216n nVar) {
        Iterator<ConstraintWidget> it = this.f5239a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            nVar.mo8333a(next);
            if (i == 0) {
                next.f5163n0 = nVar.f5240b;
            } else {
                next.f5165o0 = nVar.f5240b;
            }
        }
        this.f5243e = nVar.f5240b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f5241c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String c = C0071c.m191c(sb, this.f5240b, "] <");
        Iterator<ConstraintWidget> it = this.f5239a.iterator();
        while (it.hasNext()) {
            StringBuilder k = C0073e.m211k(c, " ");
            k.append(it.next().f5145e0);
            c = k.toString();
        }
        return C0326j.m864i(c, " >");
    }
}
