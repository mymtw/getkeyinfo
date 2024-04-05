package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.C2776n;
import androidx.fragment.app.SpecialEffectsController;
import com.etsy.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import p002a1.C0007b;
import p193o.C7494b;
import p193o.C7500h;

/* renamed from: androidx.fragment.app.b */
public final class C2744b extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.b$a */
    public static /* synthetic */ class C2745a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6228a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.SpecialEffectsController$Operation$State[] r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6228a = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6228a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6228a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6228a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2744b.C2745a.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    public static class C2746b extends C2747c {

        /* renamed from: c */
        public boolean f6229c;

        /* renamed from: d */
        public boolean f6230d = false;

        /* renamed from: e */
        public C2776n.C2777a f6231e;

        public C2746b(SpecialEffectsController.Operation operation, C0007b bVar, boolean z) {
            super(operation, bVar);
            this.f6229c = z;
        }

        /* renamed from: c */
        public final C2776n.C2777a mo10514c(Context context) {
            if (this.f6230d) {
                return this.f6231e;
            }
            SpecialEffectsController.Operation operation = this.f6232a;
            Fragment fragment = operation.f6205c;
            boolean z = false;
            boolean z2 = operation.f6203a == SpecialEffectsController.Operation.State.VISIBLE;
            boolean z3 = this.f6229c;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = z3 ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            C2776n.C2777a aVar = null;
            if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
                fragment.mContainer.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, popEnterAnim);
                if (onCreateAnimation != null) {
                    aVar = new C2776n.C2777a(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, popEnterAnim);
                    if (onCreateAnimator != null) {
                        aVar = new C2776n.C2777a(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z2 ? C2776n.m6658a(context, 16842936) : C2776n.m6658a(context, 16842937) : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? C2776n.m6658a(context, 16842938) : C2776n.m6658a(context, 16842939) : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (equals) {
                                try {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (loadAnimation != null) {
                                        aVar = new C2776n.C2777a(loadAnimation);
                                    } else {
                                        z = true;
                                    }
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                            }
                            if (!z) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                    if (loadAnimator != null) {
                                        aVar = new C2776n.C2777a(loadAnimator);
                                    }
                                } catch (RuntimeException e2) {
                                    if (!equals) {
                                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                        if (loadAnimation2 != null) {
                                            aVar = new C2776n.C2777a(loadAnimation2);
                                        }
                                    } else {
                                        throw e2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f6231e = aVar;
            this.f6230d = true;
            return aVar;
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    public static class C2747c {

        /* renamed from: a */
        public final SpecialEffectsController.Operation f6232a;

        /* renamed from: b */
        public final C0007b f6233b;

        public C2747c(SpecialEffectsController.Operation operation, C0007b bVar) {
            this.f6232a = operation;
            this.f6233b = bVar;
        }

        /* renamed from: a */
        public final void mo10515a() {
            SpecialEffectsController.Operation operation = this.f6232a;
            if (operation.f6207e.remove(this.f6233b) && operation.f6207e.isEmpty()) {
                operation.mo10476b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo10516b() {
            /*
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.f6232a
                androidx.fragment.app.Fragment r0 = r0.f6205c
                android.view.View r0 = r0.mView
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = androidx.fragment.app.SpecialEffectsController.Operation.State.from((android.view.View) r0)
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.f6232a
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.f6203a
                if (r0 == r1) goto L_0x0019
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2744b.C2747c.mo10516b():boolean");
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    public static class C2748d extends C2747c {

        /* renamed from: c */
        public final Object f6234c;

        /* renamed from: d */
        public final boolean f6235d;

        /* renamed from: e */
        public final Object f6236e;

        public C2748d(SpecialEffectsController.Operation operation, C0007b bVar, boolean z, boolean z2) {
            super(operation, bVar);
            if (operation.f6203a == SpecialEffectsController.Operation.State.VISIBLE) {
                this.f6234c = z ? operation.f6205c.getReenterTransition() : operation.f6205c.getEnterTransition();
                this.f6235d = z ? operation.f6205c.getAllowReturnTransitionOverlap() : operation.f6205c.getAllowEnterTransitionOverlap();
            } else {
                this.f6234c = z ? operation.f6205c.getReturnTransition() : operation.f6205c.getExitTransition();
                this.f6235d = true;
            }
            if (!z2) {
                this.f6236e = null;
            } else if (z) {
                this.f6236e = operation.f6205c.getSharedElementReturnTransition();
            } else {
                this.f6236e = operation.f6205c.getSharedElementEnterTransition();
            }
        }

        /* renamed from: c */
        public final C2769j0 mo10517c(Object obj) {
            if (obj == null) {
                return null;
            }
            C2759f0 f0Var = C2754d0.f6276a;
            if (f0Var != null && (obj instanceof Transition)) {
                return f0Var;
            }
            C2769j0 j0Var = C2754d0.f6277b;
            if (j0Var != null && j0Var.mo10542e(obj)) {
                return j0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f6232a.f6205c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public C2744b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: j */
    public static void m6592j(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        m6592j(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: k */
    public static void m6593k(C7494b bVar, View view) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        String k = C2364y.C2373i.m5264k(view);
        if (k != null) {
            bVar.put(k, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m6593k(bVar, childAt);
                }
            }
        }
    }

    /* renamed from: l */
    public static void m6594l(C7494b bVar, Collection collection) {
        Iterator it = ((C7500h.C7502b) bVar.entrySet()).iterator();
        while (true) {
            C7500h.C7504d dVar = (C7500h.C7504d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (!collection.contains(C2364y.C2373i.m5264k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:212:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x077a A[LOOP:19: B:260:0x0774->B:262:0x077a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0794  */
    /* JADX WARNING: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10469b(java.util.ArrayList r34, boolean r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r35
            java.util.Iterator r2 = r34.iterator()
            r3 = 0
            r4 = 0
        L_0x000a:
            boolean r5 = r2.hasNext()
            r6 = 4
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x0043
            java.lang.Object r5 = r2.next()
            androidx.fragment.app.SpecialEffectsController$Operation r5 = (androidx.fragment.app.SpecialEffectsController.Operation) r5
            androidx.fragment.app.Fragment r9 = r5.f6205c
            android.view.View r9 = r9.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r9 = androidx.fragment.app.SpecialEffectsController.Operation.State.from((android.view.View) r9)
            int[] r10 = androidx.fragment.app.C2744b.C2745a.f6228a
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = r5.f6203a
            int r11 = r11.ordinal()
            r10 = r10[r11]
            if (r10 == r8) goto L_0x003b
            if (r10 == r7) goto L_0x003b
            r7 = 3
            if (r10 == r7) goto L_0x003b
            if (r10 == r6) goto L_0x0035
            goto L_0x000a
        L_0x0035:
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r9 == r6) goto L_0x000a
            r4 = r5
            goto L_0x000a
        L_0x003b:
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r9 != r6) goto L_0x000a
            if (r3 != 0) goto L_0x000a
            r3 = r5
            goto L_0x000a
        L_0x0043:
            boolean r2 = androidx.fragment.app.FragmentManager.m6465J(r7)
            if (r2 == 0) goto L_0x004f
            java.util.Objects.toString(r3)
            java.util.Objects.toString(r4)
        L_0x004f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = r34
            r6.<init>(r7)
            java.util.Iterator r7 = r34.iterator()
        L_0x0064:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x00af
            java.lang.Object r9 = r7.next()
            androidx.fragment.app.SpecialEffectsController$Operation r9 = (androidx.fragment.app.SpecialEffectsController.Operation) r9
            a1.b r10 = new a1.b
            r10.<init>()
            r9.mo10478d()
            java.util.HashSet<a1.b> r11 = r9.f6207e
            r11.add(r10)
            androidx.fragment.app.b$b r11 = new androidx.fragment.app.b$b
            r11.<init>(r9, r10, r1)
            r2.add(r11)
            a1.b r10 = new a1.b
            r10.<init>()
            r9.mo10478d()
            java.util.HashSet<a1.b> r11 = r9.f6207e
            r11.add(r10)
            androidx.fragment.app.b$d r11 = new androidx.fragment.app.b$d
            if (r1 == 0) goto L_0x0099
            if (r9 != r3) goto L_0x009d
            goto L_0x009b
        L_0x0099:
            if (r9 != r4) goto L_0x009d
        L_0x009b:
            r12 = r8
            goto L_0x009e
        L_0x009d:
            r12 = 0
        L_0x009e:
            r11.<init>(r9, r10, r1, r12)
            r5.add(r11)
            androidx.fragment.app.c r10 = new androidx.fragment.app.c
            r10.<init>(r0, r6, r9)
            java.util.ArrayList r9 = r9.f6206d
            r9.add(r10)
            goto L_0x0064
        L_0x00af:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r8 = r5.iterator()
            r9 = 0
        L_0x00b9:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0133
            java.lang.Object r10 = r8.next()
            androidx.fragment.app.b$d r10 = (androidx.fragment.app.C2744b.C2748d) r10
            boolean r11 = r10.mo10516b()
            if (r11 == 0) goto L_0x00cc
            goto L_0x00b9
        L_0x00cc:
            java.lang.Object r11 = r10.f6234c
            androidx.fragment.app.j0 r11 = r10.mo10517c(r11)
            java.lang.Object r12 = r10.f6236e
            androidx.fragment.app.j0 r12 = r10.mo10517c(r12)
            java.lang.String r13 = " returned Transition "
            java.lang.String r14 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            if (r11 == 0) goto L_0x010a
            if (r12 == 0) goto L_0x010a
            if (r11 != r12) goto L_0x00e3
            goto L_0x010a
        L_0x00e3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r14)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r10.f6232a
            androidx.fragment.app.Fragment r3 = r3.f6205c
            r2.append(r3)
            r2.append(r13)
            java.lang.Object r3 = r10.f6234c
            r2.append(r3)
            java.lang.String r3 = " which uses a different Transition  type than its shared element transition "
            r2.append(r3)
            java.lang.Object r3 = r10.f6236e
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x010a:
            if (r11 == 0) goto L_0x010d
            goto L_0x010e
        L_0x010d:
            r11 = r12
        L_0x010e:
            if (r9 != 0) goto L_0x0112
            r9 = r11
            goto L_0x00b9
        L_0x0112:
            if (r11 == 0) goto L_0x00b9
            if (r9 != r11) goto L_0x0117
            goto L_0x00b9
        L_0x0117:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r14)
            androidx.fragment.app.SpecialEffectsController$Operation r3 = r10.f6232a
            androidx.fragment.app.Fragment r3 = r3.f6205c
            r2.append(r3)
            r2.append(r13)
            java.lang.Object r3 = r10.f6234c
            java.lang.String r4 = " which uses a different Transition  type than other Fragments."
            java.lang.String r2 = android.support.p013v4.media.C0071c.m192d(r2, r3, r4)
            r1.<init>(r2)
            throw r1
        L_0x0133:
            if (r9 != 0) goto L_0x0159
            java.util.Iterator r1 = r5.iterator()
        L_0x0139:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0150
            java.lang.Object r5 = r1.next()
            androidx.fragment.app.b$d r5 = (androidx.fragment.app.C2744b.C2748d) r5
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r5.f6232a
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r7.put(r8, r9)
            r5.mo10515a()
            goto L_0x0139
        L_0x0150:
            r22 = r2
            r31 = r3
            r12 = r4
            r11 = r6
            r8 = r7
            goto L_0x0562
        L_0x0159:
            android.view.View r8 = new android.view.View
            android.view.ViewGroup r10 = r0.f6198a
            android.content.Context r10 = r10.getContext()
            r8.<init>(r10)
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            o.b r12 = new o.b
            r12.<init>()
            java.util.Iterator r16 = r5.iterator()
            r10 = 0
            r11 = 0
            r17 = 0
            r22 = r2
            r2 = r3
            r34 = r11
            r11 = r10
            r10 = r4
        L_0x0187:
            boolean r18 = r16.hasNext()
            if (r18 == 0) goto L_0x0368
            java.lang.Object r18 = r16.next()
            r23 = r6
            r6 = r18
            androidx.fragment.app.b$d r6 = (androidx.fragment.app.C2744b.C2748d) r6
            java.lang.Object r6 = r6.f6236e
            if (r6 == 0) goto L_0x019e
            r18 = 1
            goto L_0x01a0
        L_0x019e:
            r18 = 0
        L_0x01a0:
            if (r18 == 0) goto L_0x0348
            if (r2 == 0) goto L_0x0348
            if (r10 == 0) goto L_0x0348
            java.lang.Object r6 = r9.mo10543f(r6)
            java.lang.Object r6 = r9.mo10553r(r6)
            androidx.fragment.app.Fragment r11 = r10.f6205c
            java.util.ArrayList r11 = r11.getSharedElementSourceNames()
            r18 = r5
            androidx.fragment.app.Fragment r5 = r2.f6205c
            java.util.ArrayList r5 = r5.getSharedElementSourceNames()
            r24 = r7
            androidx.fragment.app.Fragment r7 = r2.f6205c
            java.util.ArrayList r7 = r7.getSharedElementTargetNames()
            r19 = 0
            r20 = r8
            r8 = r19
            r19 = r15
        L_0x01cc:
            int r15 = r7.size()
            r21 = r6
            r6 = -1
            if (r8 >= r15) goto L_0x01ed
            java.lang.Object r15 = r7.get(r8)
            int r15 = r11.indexOf(r15)
            if (r15 == r6) goto L_0x01e8
            java.lang.Object r6 = r5.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            r11.set(r15, r6)
        L_0x01e8:
            int r8 = r8 + 1
            r6 = r21
            goto L_0x01cc
        L_0x01ed:
            androidx.fragment.app.Fragment r5 = r10.f6205c
            java.util.ArrayList r5 = r5.getSharedElementTargetNames()
            if (r1 != 0) goto L_0x0200
            androidx.fragment.app.Fragment r6 = r2.f6205c
            r6.getExitTransitionCallback()
            androidx.fragment.app.Fragment r6 = r10.f6205c
            r6.getEnterTransitionCallback()
            goto L_0x020a
        L_0x0200:
            androidx.fragment.app.Fragment r6 = r2.f6205c
            r6.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r6 = r10.f6205c
            r6.getExitTransitionCallback()
        L_0x020a:
            int r6 = r11.size()
            r7 = 0
        L_0x020f:
            if (r7 >= r6) goto L_0x0223
            java.lang.Object r8 = r11.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r15 = r5.get(r7)
            java.lang.String r15 = (java.lang.String) r15
            r12.put(r8, r15)
            int r7 = r7 + 1
            goto L_0x020f
        L_0x0223:
            r6 = 2
            boolean r6 = androidx.fragment.app.FragmentManager.m6465J(r6)
            if (r6 == 0) goto L_0x024c
            java.util.Iterator r6 = r5.iterator()
        L_0x022e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x023b
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x022e
        L_0x023b:
            java.util.Iterator r6 = r11.iterator()
        L_0x023f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x024c
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x023f
        L_0x024c:
            o.b r6 = new o.b
            r6.<init>()
            androidx.fragment.app.Fragment r7 = r2.f6205c
            android.view.View r7 = r7.mView
            m6593k(r6, r7)
            p193o.C7500h.m14468k(r11, r6)
            java.util.Set r7 = r6.keySet()
            p193o.C7500h.m14468k(r7, r12)
            o.b r7 = new o.b
            r7.<init>()
            androidx.fragment.app.Fragment r8 = r10.f6205c
            android.view.View r8 = r8.mView
            m6593k(r7, r8)
            p193o.C7500h.m14468k(r5, r7)
            java.util.Collection r8 = r12.values()
            p193o.C7500h.m14468k(r8, r7)
            androidx.fragment.app.f0 r8 = androidx.fragment.app.C2754d0.f6276a
            int r8 = r12.f16745d
        L_0x027c:
            int r8 = r8 + -1
            if (r8 < 0) goto L_0x0290
            java.lang.Object r15 = r12.mo19980n(r8)
            java.lang.String r15 = (java.lang.String) r15
            boolean r15 = r7.containsKey(r15)
            if (r15 != 0) goto L_0x027c
            r12.mo14353j(r8)
            goto L_0x027c
        L_0x0290:
            java.util.Set r8 = r12.keySet()
            m6594l(r6, r8)
            java.util.Collection r8 = r12.values()
            m6594l(r7, r8)
            boolean r8 = r12.isEmpty()
            if (r8 == 0) goto L_0x02b9
            r14.clear()
            r13.clear()
            r5 = 0
            r11 = r10
            r1 = r12
            r8 = r13
            r7 = r14
            r6 = r19
            r15 = r24
            r10 = r2
            r12 = r5
            r5 = r20
            goto L_0x0353
        L_0x02b9:
            androidx.fragment.app.Fragment r8 = r10.f6205c
            androidx.fragment.app.Fragment r2 = r2.f6205c
            if (r1 == 0) goto L_0x02c3
            r2.getEnterTransitionCallback()
            goto L_0x02c6
        L_0x02c3:
            r8.getEnterTransitionCallback()
        L_0x02c6:
            android.view.ViewGroup r2 = r0.f6198a
            androidx.fragment.app.h r8 = new androidx.fragment.app.h
            r8.<init>(r4, r3, r1, r7)
            androidx.core.view.OneShotPreDrawListener.add(r2, r8)
            java.util.Collection r2 = r6.values()
            r14.addAll(r2)
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x02f1
            r2 = 0
            java.lang.Object r8 = r11.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            r10 = 0
            java.lang.Object r6 = r6.getOrDefault(r8, r10)
            android.view.View r6 = (android.view.View) r6
            r8 = r21
            r9.mo10548m(r6, r8)
            goto L_0x02f7
        L_0x02f1:
            r8 = r21
            r2 = 0
            r10 = 0
            r6 = r34
        L_0x02f7:
            java.util.Collection r11 = r7.values()
            r13.addAll(r11)
            boolean r11 = r5.isEmpty()
            if (r11 != 0) goto L_0x0321
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r7.getOrDefault(r2, r10)
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0321
            android.view.ViewGroup r5 = r0.f6198a
            androidx.fragment.app.i r7 = new androidx.fragment.app.i
            r15 = r19
            r7.<init>(r9, r2, r15)
            androidx.core.view.OneShotPreDrawListener.add(r5, r7)
            r17 = 1
            goto L_0x0323
        L_0x0321:
            r15 = r19
        L_0x0323:
            r5 = r20
            r9.mo10551p(r8, r5, r14)
            r2 = 0
            r7 = 0
            r10 = r9
            r11 = r8
            r1 = r12
            r12 = r2
            r2 = r13
            r13 = r7
            r7 = r14
            r14 = r8
            r34 = r6
            r6 = r15
            r15 = r2
            r10.mo10547l(r11, r12, r13, r14, r15)
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r15 = r24
            r15.put(r3, r10)
            r15.put(r4, r10)
            r10 = r3
            r11 = r4
            r12 = r8
            r8 = r2
            goto L_0x0353
        L_0x0348:
            r18 = r5
            r5 = r8
            r1 = r12
            r8 = r13
            r6 = r15
            r15 = r7
            r7 = r14
            r12 = r11
            r11 = r10
            r10 = r2
        L_0x0353:
            r2 = r34
            r34 = r2
            r14 = r7
            r13 = r8
            r2 = r10
            r10 = r11
            r11 = r12
            r7 = r15
            r12 = r1
            r8 = r5
            r15 = r6
            r5 = r18
            r6 = r23
            r1 = r35
            goto L_0x0187
        L_0x0368:
            r18 = r5
            r23 = r6
            r5 = r8
            r1 = r12
            r8 = r13
            r6 = r15
            r15 = r7
            r7 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r16 = r18.iterator()
            r12 = 0
            r13 = 0
            r32 = r13
            r13 = r12
            r12 = r32
        L_0x0382:
            boolean r19 = r16.hasNext()
            if (r19 == 0) goto L_0x04e4
            java.lang.Object r19 = r16.next()
            r35 = r14
            r14 = r19
            androidx.fragment.app.b$d r14 = (androidx.fragment.app.C2744b.C2748d) r14
            boolean r19 = r14.mo10516b()
            if (r19 == 0) goto L_0x03c1
            r19 = r12
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r14.f6232a
            r20 = r13
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r15.put(r12, r13)
            r14.mo10515a()
            r31 = r3
            r24 = r4
            r25 = r8
            r27 = r11
            r8 = r15
            r12 = r19
            r13 = r20
            r11 = r23
            r4 = r34
            r20 = r1
            r19 = r5
            r34 = r7
            r1 = r35
            goto L_0x04ce
        L_0x03c1:
            r19 = r12
            r20 = r13
            java.lang.Object r12 = r14.f6234c
            java.lang.Object r13 = r9.mo10543f(r12)
            androidx.fragment.app.SpecialEffectsController$Operation r12 = r14.f6232a
            if (r11 == 0) goto L_0x03d5
            if (r12 == r2) goto L_0x03d3
            if (r12 != r10) goto L_0x03d5
        L_0x03d3:
            r10 = 1
            goto L_0x03d6
        L_0x03d5:
            r10 = 0
        L_0x03d6:
            if (r13 != 0) goto L_0x03fd
            if (r10 != 0) goto L_0x03e2
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r15.put(r12, r10)
            r14.mo10515a()
        L_0x03e2:
            r31 = r3
            r24 = r4
            r25 = r8
            r27 = r11
            r8 = r15
            r12 = r19
            r13 = r20
            r11 = r23
            r4 = r34
            r20 = r1
            r19 = r5
            r34 = r7
            r1 = r35
            goto L_0x04cc
        L_0x03fd:
            r24 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r21 = r11
            androidx.fragment.app.Fragment r11 = r12.f6205c
            android.view.View r11 = r11.mView
            m6592j(r15, r11)
            if (r10 == 0) goto L_0x0418
            if (r12 != r2) goto L_0x0415
            r15.removeAll(r7)
            goto L_0x0418
        L_0x0415:
            r15.removeAll(r8)
        L_0x0418:
            boolean r10 = r15.isEmpty()
            if (r10 == 0) goto L_0x0441
            r9.mo10539a(r5, r13)
            r28 = r34
            r31 = r3
            r34 = r7
            r25 = r8
            r10 = r12
            r3 = r13
            r7 = r14
            r29 = r19
            r27 = r21
            r11 = r23
            r8 = r24
            r24 = r4
            r19 = r5
            r4 = r15
            r5 = r20
            r20 = r1
            r1 = r35
            goto L_0x049f
        L_0x0441:
            r9.mo10540b(r15, r13)
            r25 = 0
            r26 = 0
            r11 = r34
            r10 = r9
            r28 = r11
            r27 = r21
            r11 = r13
            r30 = r12
            r29 = r19
            r12 = r13
            r31 = r3
            r19 = r5
            r3 = r13
            r5 = r20
            r13 = r15
            r20 = r1
            r34 = r7
            r7 = r14
            r1 = r35
            r14 = r25
            r25 = r8
            r8 = r24
            r24 = r4
            r4 = r15
            r15 = r26
            r10.mo10547l(r11, r12, r13, r14, r15)
            r10 = r30
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = r10.f6203a
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r11 != r12) goto L_0x049d
            r11 = r23
            r11.remove(r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r4)
            androidx.fragment.app.Fragment r13 = r10.f6205c
            android.view.View r13 = r13.mView
            r12.remove(r13)
            androidx.fragment.app.Fragment r13 = r10.f6205c
            android.view.View r13 = r13.mView
            r9.mo10546k(r3, r13, r12)
            android.view.ViewGroup r12 = r0.f6198a
            androidx.fragment.app.j r13 = new androidx.fragment.app.j
            r13.<init>(r4)
            androidx.core.view.OneShotPreDrawListener.add(r12, r13)
            goto L_0x049f
        L_0x049d:
            r11 = r23
        L_0x049f:
            androidx.fragment.app.SpecialEffectsController$Operation$State r12 = r10.f6203a
            androidx.fragment.app.SpecialEffectsController$Operation$State r13 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r12 != r13) goto L_0x04b0
            r1.addAll(r4)
            if (r17 == 0) goto L_0x04ad
            r9.mo10549n(r3, r6)
        L_0x04ad:
            r4 = r28
            goto L_0x04b5
        L_0x04b0:
            r4 = r28
            r9.mo10548m(r4, r3)
        L_0x04b5:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r8.put(r10, r12)
            boolean r7 = r7.f6235d
            if (r7 == 0) goto L_0x04c5
            java.lang.Object r13 = r9.mo10545j(r5, r3)
            r12 = r29
            goto L_0x04cc
        L_0x04c5:
            r13 = r29
            java.lang.Object r12 = r9.mo10545j(r13, r3)
            r13 = r5
        L_0x04cc:
            r10 = r24
        L_0x04ce:
            r7 = r34
            r14 = r1
            r34 = r4
            r15 = r8
            r23 = r11
            r5 = r19
            r1 = r20
            r4 = r24
            r8 = r25
            r11 = r27
            r3 = r31
            goto L_0x0382
        L_0x04e4:
            r20 = r1
            r31 = r3
            r24 = r4
            r34 = r7
            r25 = r8
            r10 = r11
            r5 = r13
            r1 = r14
            r8 = r15
            r11 = r23
            r13 = r12
            java.lang.Object r3 = r9.mo10544i(r5, r13, r10)
            if (r3 != 0) goto L_0x04fe
            r12 = r24
            goto L_0x0562
        L_0x04fe:
            java.util.Iterator r4 = r18.iterator()
        L_0x0502:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0556
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.b$d r5 = (androidx.fragment.app.C2744b.C2748d) r5
            boolean r6 = r5.mo10516b()
            if (r6 == 0) goto L_0x0515
            goto L_0x0502
        L_0x0515:
            java.lang.Object r6 = r5.f6234c
            androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.f6232a
            r12 = r24
            if (r10 == 0) goto L_0x0523
            if (r7 == r2) goto L_0x0521
            if (r7 != r12) goto L_0x0523
        L_0x0521:
            r13 = 1
            goto L_0x0524
        L_0x0523:
            r13 = 0
        L_0x0524:
            if (r6 != 0) goto L_0x0528
            if (r13 == 0) goto L_0x0553
        L_0x0528:
            android.view.ViewGroup r6 = r0.f6198a
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r13 = androidx.core.view.C2364y.f5646a
            boolean r6 = androidx.core.view.C2364y.C2371g.m5246c(r6)
            if (r6 != 0) goto L_0x0545
            r6 = 2
            boolean r6 = androidx.fragment.app.FragmentManager.m6465J(r6)
            if (r6 == 0) goto L_0x0541
            android.view.ViewGroup r6 = r0.f6198a
            java.util.Objects.toString(r6)
            java.util.Objects.toString(r7)
        L_0x0541:
            r5.mo10515a()
            goto L_0x0553
        L_0x0545:
            androidx.fragment.app.SpecialEffectsController$Operation r6 = r5.f6232a
            androidx.fragment.app.Fragment r6 = r6.f6205c
            a1.b r6 = r5.f6233b
            androidx.fragment.app.k r13 = new androidx.fragment.app.k
            r13.<init>(r5, r7)
            r9.mo10550o(r3, r6, r13)
        L_0x0553:
            r24 = r12
            goto L_0x0502
        L_0x0556:
            r12 = r24
            android.view.ViewGroup r2 = r0.f6198a
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r4 = androidx.core.view.C2364y.f5646a
            boolean r2 = androidx.core.view.C2364y.C2371g.m5246c(r2)
            if (r2 != 0) goto L_0x0569
        L_0x0562:
            r1 = 0
            r23 = r11
            r24 = r12
            goto L_0x064d
        L_0x0569:
            r2 = 4
            androidx.fragment.app.C2754d0.m6617a(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r25.size()
            r5 = 0
        L_0x0577:
            if (r5 >= r4) goto L_0x0591
            r6 = r25
            java.lang.Object r7 = r6.get(r5)
            android.view.View r7 = (android.view.View) r7
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r13 = androidx.core.view.C2364y.f5646a
            java.lang.String r13 = androidx.core.view.C2364y.C2373i.m5264k(r7)
            r2.add(r13)
            r13 = 0
            androidx.core.view.C2364y.C2373i.m5275v(r7, r13)
            int r5 = r5 + 1
            goto L_0x0577
        L_0x0591:
            r6 = r25
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.m6465J(r4)
            if (r4 == 0) goto L_0x05c8
            java.util.Iterator r4 = r34.iterator()
        L_0x059e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05b1
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.util.Objects.toString(r5)
            androidx.core.view.C2364y.C2373i.m5264k(r5)
            goto L_0x059e
        L_0x05b1:
            java.util.Iterator r4 = r6.iterator()
        L_0x05b5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x05c8
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.util.Objects.toString(r5)
            androidx.core.view.C2364y.C2373i.m5264k(r5)
            goto L_0x05b5
        L_0x05c8:
            android.view.ViewGroup r4 = r0.f6198a
            r9.mo10541c(r4, r3)
            android.view.ViewGroup r3 = r0.f6198a
            int r4 = r6.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r7 = 0
        L_0x05d9:
            if (r7 >= r4) goto L_0x062b
            r13 = r34
            java.lang.Object r14 = r13.get(r7)
            android.view.View r14 = (android.view.View) r14
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r15 = androidx.core.view.C2364y.f5646a
            java.lang.String r15 = androidx.core.view.C2364y.C2373i.m5264k(r14)
            r5.add(r15)
            if (r15 != 0) goto L_0x05f3
            r23 = r11
            r24 = r12
            goto L_0x0622
        L_0x05f3:
            r24 = r12
            r12 = 0
            androidx.core.view.C2364y.C2373i.m5275v(r14, r12)
            r14 = r20
            java.lang.Object r12 = r14.getOrDefault(r15, r12)
            java.lang.String r12 = (java.lang.String) r12
            r16 = 0
            r14 = r16
        L_0x0605:
            r23 = r11
            if (r14 >= r4) goto L_0x0622
            java.lang.Object r11 = r2.get(r14)
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x061d
            java.lang.Object r11 = r6.get(r14)
            android.view.View r11 = (android.view.View) r11
            androidx.core.view.C2364y.C2373i.m5275v(r11, r15)
            goto L_0x0622
        L_0x061d:
            int r14 = r14 + 1
            r11 = r23
            goto L_0x0605
        L_0x0622:
            int r7 = r7 + 1
            r34 = r13
            r11 = r23
            r12 = r24
            goto L_0x05d9
        L_0x062b:
            r13 = r34
            r23 = r11
            r24 = r12
            androidx.fragment.app.i0 r7 = new androidx.fragment.app.i0
            r16 = r7
            r17 = r4
            r18 = r6
            r19 = r2
            r20 = r13
            r21 = r5
            r16.<init>(r17, r18, r19, r20, r21)
            androidx.core.view.OneShotPreDrawListener.add(r3, r7)
            r2 = 0
            androidx.fragment.app.C2754d0.m6617a(r1, r2)
            r9.mo10552q(r10, r13, r6)
            r1 = r2
        L_0x064d:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r2 = r8.containsValue(r2)
            android.view.ViewGroup r3 = r0.f6198a
            android.content.Context r4 = r3.getContext()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r22.iterator()
            r7 = r1
        L_0x0663:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x06f7
            java.lang.Object r9 = r6.next()
            r15 = r9
            androidx.fragment.app.b$b r15 = (androidx.fragment.app.C2744b.C2746b) r15
            boolean r9 = r15.mo10516b()
            if (r9 == 0) goto L_0x067a
            r15.mo10515a()
            goto L_0x0663
        L_0x067a:
            androidx.fragment.app.n$a r9 = r15.mo10514c(r4)
            if (r9 != 0) goto L_0x0684
            r15.mo10515a()
            goto L_0x0663
        L_0x0684:
            android.animation.Animator r14 = r9.f6325b
            if (r14 != 0) goto L_0x068c
            r5.add(r15)
            goto L_0x0663
        L_0x068c:
            androidx.fragment.app.SpecialEffectsController$Operation r13 = r15.f6232a
            androidx.fragment.app.Fragment r9 = r13.f6205c
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Object r11 = r8.get(r13)
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x06aa
            r10 = 2
            boolean r10 = androidx.fragment.app.FragmentManager.m6465J(r10)
            if (r10 == 0) goto L_0x06a6
            java.util.Objects.toString(r9)
        L_0x06a6:
            r15.mo10515a()
            goto L_0x0663
        L_0x06aa:
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = r13.f6203a
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            if (r7 != r10) goto L_0x06b1
            r1 = 1
        L_0x06b1:
            r12 = r1
            r1 = r23
            if (r12 == 0) goto L_0x06b9
            r1.remove(r13)
        L_0x06b9:
            android.view.View r7 = r9.mView
            r3.startViewTransition(r7)
            androidx.fragment.app.d r11 = new androidx.fragment.app.d
            r9 = r11
            r10 = r3
            r0 = r11
            r11 = r7
            r34 = r13
            r35 = r6
            r6 = r14
            r14 = r15
            r9.<init>(r10, r11, r12, r13, r14)
            r6.addListener(r0)
            r6.setTarget(r7)
            r6.start()
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m6465J(r0)
            if (r0 == 0) goto L_0x06e0
            r34.toString()
        L_0x06e0:
            a1.b r0 = r15.f6233b
            androidx.fragment.app.e r7 = new androidx.fragment.app.e
            r9 = r34
            r7.<init>(r6, r9)
            r0.mo23b(r7)
            r7 = 1
            r0 = 0
            r6 = r35
            r23 = r1
            r1 = r0
            r0 = r33
            goto L_0x0663
        L_0x06f7:
            r1 = r23
            java.util.Iterator r0 = r5.iterator()
        L_0x06fd:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0770
            java.lang.Object r5 = r0.next()
            androidx.fragment.app.b$b r5 = (androidx.fragment.app.C2744b.C2746b) r5
            androidx.fragment.app.SpecialEffectsController$Operation r6 = r5.f6232a
            androidx.fragment.app.Fragment r8 = r6.f6205c
            if (r2 == 0) goto L_0x071d
            r6 = 2
            boolean r6 = androidx.fragment.app.FragmentManager.m6465J(r6)
            if (r6 == 0) goto L_0x0719
            java.util.Objects.toString(r8)
        L_0x0719:
            r5.mo10515a()
            goto L_0x06fd
        L_0x071d:
            r9 = 2
            if (r7 == 0) goto L_0x072d
            boolean r6 = androidx.fragment.app.FragmentManager.m6465J(r9)
            if (r6 == 0) goto L_0x0729
            java.util.Objects.toString(r8)
        L_0x0729:
            r5.mo10515a()
            goto L_0x06fd
        L_0x072d:
            android.view.View r8 = r8.mView
            androidx.fragment.app.n$a r9 = r5.mo10514c(r4)
            r9.getClass()
            android.view.animation.Animation r9 = r9.f6324a
            r9.getClass()
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = r6.f6203a
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
            if (r10 == r11) goto L_0x0748
            r8.startAnimation(r9)
            r5.mo10515a()
            goto L_0x0765
        L_0x0748:
            r3.startViewTransition(r8)
            androidx.fragment.app.n$b r10 = new androidx.fragment.app.n$b
            r10.<init>(r9, r3, r8)
            androidx.fragment.app.f r9 = new androidx.fragment.app.f
            r9.<init>(r8, r3, r5, r6)
            r10.setAnimationListener(r9)
            r8.startAnimation(r10)
            r9 = 2
            boolean r9 = androidx.fragment.app.FragmentManager.m6465J(r9)
            if (r9 == 0) goto L_0x0765
            r6.toString()
        L_0x0765:
            a1.b r9 = r5.f6233b
            androidx.fragment.app.g r10 = new androidx.fragment.app.g
            r10.<init>(r8, r3, r5, r6)
            r9.mo23b(r10)
            goto L_0x06fd
        L_0x0770:
            java.util.Iterator r0 = r1.iterator()
        L_0x0774:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x078a
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.fragment.app.Fragment r3 = r2.f6205c
            android.view.View r3 = r3.mView
            androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r2.f6203a
            r2.applyState(r3)
            goto L_0x0774
        L_0x078a:
            r1.clear()
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.m6465J(r0)
            if (r0 == 0) goto L_0x079a
            java.util.Objects.toString(r31)
            java.util.Objects.toString(r24)
        L_0x079a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2744b.mo10469b(java.util.ArrayList, boolean):void");
    }
}
