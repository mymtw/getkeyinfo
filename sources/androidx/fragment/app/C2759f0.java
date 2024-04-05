package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p002a1.C0007b;

/* renamed from: androidx.fragment.app.f0 */
public final class C2759f0 extends C2769j0 {

    /* renamed from: androidx.fragment.app.f0$a */
    public class C2760a implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f6286a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f6287b;

        public C2760a(View view, ArrayList arrayList) {
            this.f6286a = view;
            this.f6287b = arrayList;
        }

        public final void onTransitionCancel(Transition transition) {
        }

        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f6286a.setVisibility(8);
            int size = this.f6287b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f6287b.get(i)).setVisibility(0);
            }
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.f0$b */
    public class C2761b extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f6288a;

        public C2761b(Rect rect) {
            this.f6288a = rect;
        }

        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f6288a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f6288a;
        }
    }

    /* renamed from: s */
    public static boolean m6618s(Transition transition) {
        return !C2769j0.m6637h(transition.getTargetIds()) || !C2769j0.m6637h(transition.getTargetNames()) || !C2769j0.m6637h(transition.getTargetTypes());
    }

    /* renamed from: a */
    public final void mo10539a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    /* renamed from: b */
    public final void mo10540b(ArrayList arrayList, Object obj) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo10540b(arrayList, transitionSet.getTransitionAt(i));
                    i++;
                }
            } else if (!m6618s(transition) && C2769j0.m6637h(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo10541c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: e */
    public final boolean mo10542e(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: f */
    public final Object mo10543f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: i */
    public final Object mo10544i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: j */
    public final Object mo10545j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    /* renamed from: k */
    public final void mo10546k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C2760a(view, arrayList));
    }

    /* renamed from: l */
    public final void mo10547l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C2763g0(this, obj2, arrayList, obj3, arrayList2));
    }

    /* renamed from: m */
    public final void mo10548m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            C2769j0.m6636g(view, rect);
            ((Transition) obj).setEpicenterCallback(new C2756e0(rect));
        }
    }

    /* renamed from: n */
    public final void mo10549n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C2761b(rect));
    }

    /* renamed from: o */
    public final void mo10550o(Object obj, C0007b bVar, C2770k kVar) {
        ((Transition) obj).addListener(new C2765h0(kVar));
    }

    /* renamed from: p */
    public final void mo10551p(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2769j0.m6635d(arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo10540b(arrayList, transitionSet);
    }

    /* renamed from: q */
    public final void mo10552q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo10554t(transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: r */
    public final Object mo10553r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: t */
    public final void mo10554t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo10554t(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m6618s(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget(arrayList.get(size2));
                } else {
                    return;
                }
            }
        }
    }
}
