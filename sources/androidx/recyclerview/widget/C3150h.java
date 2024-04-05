package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.h */
public class C3150h extends C3144f0 {

    /* renamed from: s */
    public static TimeInterpolator f7239s;

    /* renamed from: h */
    public ArrayList<RecyclerView.C3084b0> f7240h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<RecyclerView.C3084b0> f7241i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C3155e> f7242j = new ArrayList<>();

    /* renamed from: k */
    public ArrayList<C3154d> f7243k = new ArrayList<>();

    /* renamed from: l */
    public ArrayList<ArrayList<RecyclerView.C3084b0>> f7244l = new ArrayList<>();

    /* renamed from: m */
    public ArrayList<ArrayList<C3155e>> f7245m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<ArrayList<C3154d>> f7246n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<RecyclerView.C3084b0> f7247o = new ArrayList<>();

    /* renamed from: p */
    public ArrayList<RecyclerView.C3084b0> f7248p = new ArrayList<>();

    /* renamed from: q */
    public ArrayList<RecyclerView.C3084b0> f7249q = new ArrayList<>();

    /* renamed from: r */
    public ArrayList<RecyclerView.C3084b0> f7250r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.h$a */
    public class C3151a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f7251b;

        public C3151a(ArrayList arrayList) {
            this.f7251b = arrayList;
        }

        public final void run() {
            Iterator it = this.f7251b.iterator();
            while (it.hasNext()) {
                C3155e eVar = (C3155e) it.next();
                C3150h hVar = C3150h.this;
                RecyclerView.C3084b0 b0Var = eVar.f7263a;
                int i = eVar.f7264b;
                int i2 = eVar.f7265c;
                int i3 = eVar.f7266d;
                int i4 = eVar.f7267e;
                hVar.getClass();
                View view = b0Var.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator animate = view.animate();
                hVar.f7248p.add(b0Var);
                animate.setDuration(hVar.f7066e).setListener(new C3164k(hVar, b0Var, i5, view, i6, animate)).start();
            }
            this.f7251b.clear();
            C3150h.this.f7245m.remove(this.f7251b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$b */
    public class C3152b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f7253b;

        public C3152b(ArrayList arrayList) {
            this.f7253b = arrayList;
        }

        public final void run() {
            Iterator it = this.f7253b.iterator();
            while (it.hasNext()) {
                C3154d dVar = (C3154d) it.next();
                C3150h hVar = C3150h.this;
                hVar.getClass();
                RecyclerView.C3084b0 b0Var = dVar.f7257a;
                View view = null;
                View view2 = b0Var == null ? null : b0Var.itemView;
                RecyclerView.C3084b0 b0Var2 = dVar.f7258b;
                if (b0Var2 != null) {
                    view = b0Var2.itemView;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration = view2.animate().setDuration(hVar.f7067f);
                    hVar.f7250r.add(dVar.f7257a);
                    duration.translationX((float) (dVar.f7261e - dVar.f7259c));
                    duration.translationY((float) (dVar.f7262f - dVar.f7260d));
                    duration.alpha(0.0f).setListener(new C3165l(hVar, dVar, duration, view2)).start();
                }
                if (view != null) {
                    ViewPropertyAnimator animate = view.animate();
                    hVar.f7250r.add(dVar.f7258b);
                    animate.translationX(0.0f).translationY(0.0f).setDuration(hVar.f7067f).alpha(1.0f).setListener(new C3166m(hVar, dVar, animate, view)).start();
                }
            }
            this.f7253b.clear();
            C3150h.this.f7246n.remove(this.f7253b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    public class C3153c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f7255b;

        public C3153c(ArrayList arrayList) {
            this.f7255b = arrayList;
        }

        public final void run() {
            Iterator it = this.f7255b.iterator();
            while (it.hasNext()) {
                RecyclerView.C3084b0 b0Var = (RecyclerView.C3084b0) it.next();
                C3150h hVar = C3150h.this;
                hVar.getClass();
                View view = b0Var.itemView;
                ViewPropertyAnimator animate = view.animate();
                hVar.f7247o.add(b0Var);
                animate.alpha(1.0f).setDuration(hVar.f7064c).setListener(new C3163j(view, animate, hVar, b0Var)).start();
            }
            this.f7255b.clear();
            C3150h.this.f7244l.remove(this.f7255b);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$d */
    public static class C3154d {

        /* renamed from: a */
        public RecyclerView.C3084b0 f7257a;

        /* renamed from: b */
        public RecyclerView.C3084b0 f7258b;

        /* renamed from: c */
        public int f7259c;

        /* renamed from: d */
        public int f7260d;

        /* renamed from: e */
        public int f7261e;

        /* renamed from: f */
        public int f7262f;

        public C3154d(RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2, int i, int i2, int i3, int i4) {
            this.f7257a = b0Var;
            this.f7258b = b0Var2;
            this.f7259c = i;
            this.f7260d = i2;
            this.f7261e = i3;
            this.f7262f = i4;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ChangeInfo{oldHolder=");
            h.append(this.f7257a);
            h.append(", newHolder=");
            h.append(this.f7258b);
            h.append(", fromX=");
            h.append(this.f7259c);
            h.append(", fromY=");
            h.append(this.f7260d);
            h.append(", toX=");
            h.append(this.f7261e);
            h.append(", toY=");
            return C0073e.m208h(h, this.f7262f, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$e */
    public static class C3155e {

        /* renamed from: a */
        public RecyclerView.C3084b0 f7263a;

        /* renamed from: b */
        public int f7264b;

        /* renamed from: c */
        public int f7265c;

        /* renamed from: d */
        public int f7266d;

        /* renamed from: e */
        public int f7267e;

        public C3155e(RecyclerView.C3084b0 b0Var, int i, int i2, int i3, int i4) {
            this.f7263a = b0Var;
            this.f7264b = i;
            this.f7265c = i2;
            this.f7266d = i3;
            this.f7267e = i4;
        }
    }

    /* renamed from: r */
    public static void m7732r(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.C3084b0) arrayList.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final boolean mo11630g(RecyclerView.C3084b0 b0Var, List<Object> list) {
        return !list.isEmpty() || mo11629f(b0Var);
    }

    /* renamed from: j */
    public final void mo11633j(RecyclerView.C3084b0 b0Var) {
        View view = b0Var.itemView;
        view.animate().cancel();
        int size = this.f7242j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f7242j.get(size).f7263a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo11631h(b0Var);
                this.f7242j.remove(size);
            }
        }
        mo11871t(b0Var, this.f7243k);
        if (this.f7240h.remove(b0Var)) {
            view.setAlpha(1.0f);
            mo11631h(b0Var);
        }
        if (this.f7241i.remove(b0Var)) {
            view.setAlpha(1.0f);
            mo11631h(b0Var);
        }
        int size2 = this.f7246n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f7246n.get(size2);
            mo11871t(b0Var, arrayList);
            if (arrayList.isEmpty()) {
                this.f7246n.remove(size2);
            }
        }
        int size3 = this.f7245m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f7245m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C3155e) arrayList2.get(size4)).f7263a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo11631h(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f7245m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f7244l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f7244l.get(size5);
                if (arrayList3.remove(b0Var)) {
                    view.setAlpha(1.0f);
                    mo11631h(b0Var);
                    if (arrayList3.isEmpty()) {
                        this.f7244l.remove(size5);
                    }
                }
            } else {
                this.f7249q.remove(b0Var);
                this.f7247o.remove(b0Var);
                this.f7250r.remove(b0Var);
                this.f7248p.remove(b0Var);
                mo11870s();
                return;
            }
        }
    }

    /* renamed from: k */
    public final void mo11634k() {
        int size = this.f7242j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C3155e eVar = this.f7242j.get(size);
            View view = eVar.f7263a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo11631h(eVar.f7263a);
            this.f7242j.remove(size);
        }
        int size2 = this.f7240h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            mo11631h(this.f7240h.get(size2));
            this.f7240h.remove(size2);
        }
        int size3 = this.f7241i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C3084b0 b0Var = this.f7241i.get(size3);
            b0Var.itemView.setAlpha(1.0f);
            mo11631h(b0Var);
            this.f7241i.remove(size3);
        }
        int size4 = this.f7243k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C3154d dVar = this.f7243k.get(size4);
            RecyclerView.C3084b0 b0Var2 = dVar.f7257a;
            if (b0Var2 != null) {
                mo11872u(dVar, b0Var2);
            }
            RecyclerView.C3084b0 b0Var3 = dVar.f7258b;
            if (b0Var3 != null) {
                mo11872u(dVar, b0Var3);
            }
        }
        this.f7243k.clear();
        if (mo11635l()) {
            int size5 = this.f7245m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f7245m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C3155e eVar2 = (C3155e) arrayList.get(size6);
                        View view2 = eVar2.f7263a.itemView;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        mo11631h(eVar2.f7263a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f7245m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f7244l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f7244l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.C3084b0 b0Var4 = (RecyclerView.C3084b0) arrayList2.get(size8);
                        b0Var4.itemView.setAlpha(1.0f);
                        mo11631h(b0Var4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f7244l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f7246n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f7246n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C3154d dVar2 = (C3154d) arrayList3.get(size10);
                            RecyclerView.C3084b0 b0Var5 = dVar2.f7257a;
                            if (b0Var5 != null) {
                                mo11872u(dVar2, b0Var5);
                            }
                            RecyclerView.C3084b0 b0Var6 = dVar2.f7258b;
                            if (b0Var6 != null) {
                                mo11872u(dVar2, b0Var6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f7246n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    m7732r(this.f7249q);
                    m7732r(this.f7248p);
                    m7732r(this.f7247o);
                    m7732r(this.f7250r);
                    mo11632i();
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean mo11635l() {
        return !this.f7241i.isEmpty() || !this.f7243k.isEmpty() || !this.f7242j.isEmpty() || !this.f7240h.isEmpty() || !this.f7248p.isEmpty() || !this.f7249q.isEmpty() || !this.f7247o.isEmpty() || !this.f7250r.isEmpty() || !this.f7245m.isEmpty() || !this.f7244l.isEmpty() || !this.f7246n.isEmpty();
    }

    /* renamed from: m */
    public final void mo11636m() {
        boolean z = !this.f7240h.isEmpty();
        boolean z2 = !this.f7242j.isEmpty();
        boolean z3 = !this.f7243k.isEmpty();
        boolean z4 = !this.f7241i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C3084b0> it = this.f7240h.iterator();
            while (it.hasNext()) {
                RecyclerView.C3084b0 next = it.next();
                View view = next.itemView;
                ViewPropertyAnimator animate = view.animate();
                this.f7249q.add(next);
                animate.setDuration(this.f7065d).alpha(0.0f).setListener(new C3159i(view, animate, this, next)).start();
            }
            this.f7240h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f7242j);
                this.f7245m.add(arrayList);
                this.f7242j.clear();
                C3151a aVar = new C3151a(arrayList);
                if (z) {
                    View view2 = ((C3155e) arrayList.get(0)).f7263a.itemView;
                    long j = this.f7065d;
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5224n(view2, aVar, j);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f7243k);
                this.f7246n.add(arrayList2);
                this.f7243k.clear();
                C3152b bVar = new C3152b(arrayList2);
                if (z) {
                    View view3 = ((C3154d) arrayList2.get(0)).f7257a.itemView;
                    long j2 = this.f7065d;
                    WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                    C2364y.C2368d.m5224n(view3, bVar, j2);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f7241i);
                this.f7244l.add(arrayList3);
                this.f7241i.clear();
                C3153c cVar = new C3153c(arrayList3);
                if (z || z2 || z3) {
                    long j3 = 0;
                    long j4 = z ? this.f7065d : 0;
                    long j5 = z2 ? this.f7066e : 0;
                    if (z3) {
                        j3 = this.f7067f;
                    }
                    View view4 = ((RecyclerView.C3084b0) arrayList3.get(0)).itemView;
                    WeakHashMap<View, C2330s0> weakHashMap3 = C2364y.f5646a;
                    C2364y.C2368d.m5224n(view4, cVar, Math.max(j5, j3) + j4);
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: n */
    public final void mo11841n(RecyclerView.C3084b0 b0Var) {
        mo11873v(b0Var);
        b0Var.itemView.setAlpha(0.0f);
        this.f7241i.add(b0Var);
    }

    /* renamed from: o */
    public final boolean mo11842o(RecyclerView.C3084b0 b0Var, RecyclerView.C3084b0 b0Var2, int i, int i2, int i3, int i4) {
        if (b0Var == b0Var2) {
            return mo11843p(b0Var, i, i2, i3, i4);
        }
        float translationX = b0Var.itemView.getTranslationX();
        float translationY = b0Var.itemView.getTranslationY();
        float alpha = b0Var.itemView.getAlpha();
        mo11873v(b0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        b0Var.itemView.setTranslationX(translationX);
        b0Var.itemView.setTranslationY(translationY);
        b0Var.itemView.setAlpha(alpha);
        if (b0Var2 != null) {
            mo11873v(b0Var2);
            b0Var2.itemView.setTranslationX((float) (-i5));
            b0Var2.itemView.setTranslationY((float) (-i6));
            b0Var2.itemView.setAlpha(0.0f);
        }
        this.f7243k.add(new C3154d(b0Var, b0Var2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: p */
    public final boolean mo11843p(RecyclerView.C3084b0 b0Var, int i, int i2, int i3, int i4) {
        View view = b0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) b0Var.itemView.getTranslationY());
        mo11873v(b0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo11631h(b0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f7242j.add(new C3155e(b0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: q */
    public final void mo11844q(RecyclerView.C3084b0 b0Var) {
        mo11873v(b0Var);
        this.f7240h.add(b0Var);
    }

    /* renamed from: s */
    public final void mo11870s() {
        if (!mo11635l()) {
            mo11632i();
        }
    }

    /* renamed from: t */
    public final void mo11871t(RecyclerView.C3084b0 b0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C3154d dVar = (C3154d) arrayList.get(size);
                if (mo11872u(dVar, b0Var) && dVar.f7257a == null && dVar.f7258b == null) {
                    arrayList.remove(dVar);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: u */
    public final boolean mo11872u(C3154d dVar, RecyclerView.C3084b0 b0Var) {
        if (dVar.f7258b == b0Var) {
            dVar.f7258b = null;
        } else if (dVar.f7257a != b0Var) {
            return false;
        } else {
            dVar.f7257a = null;
        }
        b0Var.itemView.setAlpha(1.0f);
        b0Var.itemView.setTranslationX(0.0f);
        b0Var.itemView.setTranslationY(0.0f);
        mo11631h(b0Var);
        return true;
    }

    /* renamed from: v */
    public final void mo11873v(RecyclerView.C3084b0 b0Var) {
        if (f7239s == null) {
            f7239s = new ValueAnimator().getInterpolator();
        }
        b0Var.itemView.animate().setInterpolator(f7239s);
        mo11633j(b0Var);
    }
}
