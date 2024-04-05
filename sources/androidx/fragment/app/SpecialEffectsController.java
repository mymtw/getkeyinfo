package androidx.fragment.app;

import android.support.p013v4.media.C0073e;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p002a1.C0007b;
import p003a2.C0015b;

public abstract class SpecialEffectsController {

    /* renamed from: a */
    public final ViewGroup f6198a;

    /* renamed from: b */
    public final ArrayList<Operation> f6199b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<Operation> f6200c = new ArrayList<>();

    /* renamed from: d */
    public boolean f6201d = false;

    /* renamed from: e */
    public boolean f6202e = false;

    /* renamed from: androidx.fragment.app.SpecialEffectsController$a */
    public class C2736a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C2739d f6211b;

        public C2736a(C2739d dVar) {
            this.f6211b = dVar;
        }

        public final void run() {
            if (SpecialEffectsController.this.f6199b.contains(this.f6211b)) {
                C2739d dVar = this.f6211b;
                dVar.f6203a.applyState(dVar.f6205c.mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$b */
    public class C2737b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C2739d f6213b;

        public C2737b(C2739d dVar) {
            this.f6213b = dVar;
        }

        public final void run() {
            SpecialEffectsController.this.f6199b.remove(this.f6213b);
            SpecialEffectsController.this.f6200c.remove(this.f6213b);
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$c */
    public static /* synthetic */ class C2738c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6215a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6216b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6216b = r0
                r1 = 1
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r2 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f6216b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r3 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f6216b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r4 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f6215a = r3
                androidx.fragment.app.SpecialEffectsController$Operation$State r4 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f6215a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f6215a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f6215a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.SpecialEffectsController.C2738c.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.SpecialEffectsController$d */
    public static class C2739d extends Operation {

        /* renamed from: h */
        public final C2741a0 f6217h;

        public C2739d(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C2741a0 a0Var, C0007b bVar) {
            super(state, lifecycleImpact, a0Var.f6223c, bVar);
            this.f6217h = a0Var;
        }

        /* renamed from: b */
        public final void mo10476b() {
            super.mo10476b();
            this.f6217h.mo10504k();
        }

        /* renamed from: d */
        public final void mo10478d() {
            Operation.LifecycleImpact lifecycleImpact = this.f6204b;
            if (lifecycleImpact == Operation.LifecycleImpact.ADDING) {
                Fragment fragment = this.f6217h.f6223c;
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.m6465J(2)) {
                        findFocus.toString();
                        fragment.toString();
                    }
                }
                View requireView = this.f6205c.requireView();
                if (requireView.getParent() == null) {
                    this.f6217h.mo10495b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
            } else if (lifecycleImpact == Operation.LifecycleImpact.REMOVING) {
                Fragment fragment2 = this.f6217h.f6223c;
                View requireView2 = fragment2.requireView();
                if (FragmentManager.m6465J(2)) {
                    Objects.toString(requireView2.findFocus());
                    requireView2.toString();
                    fragment2.toString();
                }
                requireView2.clearFocus();
            }
        }
    }

    public SpecialEffectsController(ViewGroup viewGroup) {
        this.f6198a = viewGroup;
    }

    /* renamed from: f */
    public static SpecialEffectsController m6548f(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m6549g(viewGroup, fragmentManager.mo10359I());
    }

    /* renamed from: g */
    public static SpecialEffectsController m6549g(ViewGroup viewGroup, C2775m0 m0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        ((FragmentManager.C2715c) m0Var).getClass();
        C2744b bVar = new C2744b(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, bVar);
        return bVar;
    }

    /* renamed from: a */
    public final void mo10468a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, C2741a0 a0Var) {
        synchronized (this.f6199b) {
            C0007b bVar = new C0007b();
            Operation d = mo10471d(a0Var.f6223c);
            if (d != null) {
                d.mo10477c(state, lifecycleImpact);
                return;
            }
            C2739d dVar = new C2739d(state, lifecycleImpact, a0Var, bVar);
            this.f6199b.add(dVar);
            dVar.f6206d.add(new C2736a(dVar));
            dVar.f6206d.add(new C2737b(dVar));
        }
    }

    /* renamed from: b */
    public abstract void mo10469b(ArrayList arrayList, boolean z);

    /* renamed from: c */
    public final void mo10470c() {
        if (!this.f6202e) {
            ViewGroup viewGroup = this.f6198a;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (!C2364y.C2371g.m5245b(viewGroup)) {
                mo10472e();
                this.f6201d = false;
                return;
            }
            synchronized (this.f6199b) {
                if (!this.f6199b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f6200c);
                    this.f6200c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (FragmentManager.m6465J(2)) {
                            Objects.toString(operation);
                        }
                        operation.mo10475a();
                        if (!operation.f6209g) {
                            this.f6200c.add(operation);
                        }
                    }
                    mo10474i();
                    ArrayList arrayList2 = new ArrayList(this.f6199b);
                    this.f6199b.clear();
                    this.f6200c.addAll(arrayList2);
                    FragmentManager.m6465J(2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).mo10478d();
                    }
                    mo10469b(arrayList2, this.f6201d);
                    this.f6201d = false;
                    FragmentManager.m6465J(2);
                }
            }
        }
    }

    /* renamed from: d */
    public final Operation mo10471d(Fragment fragment) {
        Iterator<Operation> it = this.f6199b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f6205c.equals(fragment) && !next.f6208f) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo10472e() {
        FragmentManager.m6465J(2);
        ViewGroup viewGroup = this.f6198a;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        boolean b = C2364y.C2371g.m5245b(viewGroup);
        synchronized (this.f6199b) {
            mo10474i();
            Iterator<Operation> it = this.f6199b.iterator();
            while (it.hasNext()) {
                it.next().mo10478d();
            }
            Iterator it2 = new ArrayList(this.f6200c).iterator();
            while (it2.hasNext()) {
                Operation operation = (Operation) it2.next();
                if (FragmentManager.m6465J(2)) {
                    if (!b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f6198a);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(operation);
                }
                operation.mo10475a();
            }
            Iterator it3 = new ArrayList(this.f6199b).iterator();
            while (it3.hasNext()) {
                Operation operation2 = (Operation) it3.next();
                if (FragmentManager.m6465J(2)) {
                    if (!b) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f6198a);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(operation2);
                }
                operation2.mo10475a();
            }
        }
    }

    /* renamed from: h */
    public final void mo10473h() {
        synchronized (this.f6199b) {
            mo10474i();
            this.f6202e = false;
            int size = this.f6199b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Operation operation = this.f6199b.get(size);
                Operation.State from = Operation.State.from(operation.f6205c.mView);
                Operation.State state = operation.f6203a;
                Operation.State state2 = Operation.State.VISIBLE;
                if (state == state2 && from != state2) {
                    this.f6202e = operation.f6205c.isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: i */
    public final void mo10474i() {
        Iterator<Operation> it = this.f6199b.iterator();
        while (it.hasNext()) {
            Operation next = it.next();
            if (next.f6204b == Operation.LifecycleImpact.ADDING) {
                next.mo10477c(Operation.State.from(next.f6205c.requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    public static class Operation {

        /* renamed from: a */
        public State f6203a;

        /* renamed from: b */
        public LifecycleImpact f6204b;

        /* renamed from: c */
        public final Fragment f6205c;

        /* renamed from: d */
        public final ArrayList f6206d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C0007b> f6207e = new HashSet<>();

        /* renamed from: f */
        public boolean f6208f = false;

        /* renamed from: g */
        public boolean f6209g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.SpecialEffectsController$Operation$a */
        public class C2735a implements C0007b.C0008a {
            public C2735a() {
            }

            public final void onCancel() {
                Operation.this.mo10475a();
            }
        }

        public Operation(State state, LifecycleImpact lifecycleImpact, Fragment fragment, C0007b bVar) {
            this.f6203a = state;
            this.f6204b = lifecycleImpact;
            this.f6205c = fragment;
            bVar.mo23b(new C2735a());
        }

        /* renamed from: a */
        public final void mo10475a() {
            if (!this.f6208f) {
                this.f6208f = true;
                if (this.f6207e.isEmpty()) {
                    mo10476b();
                    return;
                }
                Iterator it = new ArrayList(this.f6207e).iterator();
                while (it.hasNext()) {
                    ((C0007b) it.next()).mo22a();
                }
            }
        }

        /* renamed from: b */
        public void mo10476b() {
            if (!this.f6209g) {
                if (FragmentManager.m6465J(2)) {
                    toString();
                }
                this.f6209g = true;
                Iterator it = this.f6206d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }

        /* renamed from: c */
        public final void mo10477c(State state, LifecycleImpact lifecycleImpact) {
            int i = C2738c.f6216b[lifecycleImpact.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (FragmentManager.m6465J(2)) {
                        Objects.toString(this.f6205c);
                        Objects.toString(this.f6203a);
                        Objects.toString(this.f6204b);
                    }
                    this.f6203a = State.REMOVED;
                    this.f6204b = LifecycleImpact.REMOVING;
                } else if (i == 3 && this.f6203a != State.REMOVED) {
                    if (FragmentManager.m6465J(2)) {
                        Objects.toString(this.f6205c);
                        Objects.toString(this.f6203a);
                        Objects.toString(state);
                    }
                    this.f6203a = state;
                }
            } else if (this.f6203a == State.REMOVED) {
                if (FragmentManager.m6465J(2)) {
                    Objects.toString(this.f6205c);
                    Objects.toString(this.f6204b);
                }
                this.f6203a = State.VISIBLE;
                this.f6204b = LifecycleImpact.ADDING;
            }
        }

        /* renamed from: d */
        public void mo10478d() {
        }

        public final String toString() {
            StringBuilder k = C0073e.m211k("Operation ", "{");
            k.append(Integer.toHexString(System.identityHashCode(this)));
            k.append("} ");
            k.append("{");
            k.append("mFinalState = ");
            k.append(this.f6203a);
            k.append("} ");
            k.append("{");
            k.append("mLifecycleImpact = ");
            k.append(this.f6204b);
            k.append("} ");
            k.append("{");
            k.append("mFragment = ");
            k.append(this.f6205c);
            k.append("}");
            return k.toString();
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static State from(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return from(view.getVisibility());
            }

            public void applyState(View view) {
                int i = C2738c.f6215a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m6465J(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                    }
                } else if (i == 2) {
                    if (FragmentManager.m6465J(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m6465J(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else if (i == 4) {
                    if (FragmentManager.m6465J(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }

            public static State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(C0015b.m88g("Unknown visibility ", i));
            }
        }
    }
}
