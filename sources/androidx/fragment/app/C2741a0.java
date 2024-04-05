package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.R;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: androidx.fragment.app.a0 */
public final class C2741a0 {

    /* renamed from: a */
    public final C2794u f6221a;

    /* renamed from: b */
    public final C2749b0 f6222b;

    /* renamed from: c */
    public final Fragment f6223c;

    /* renamed from: d */
    public boolean f6224d = false;

    /* renamed from: e */
    public int f6225e = -1;

    /* renamed from: androidx.fragment.app.a0$a */
    public class C2742a implements View.OnAttachStateChangeListener {

        /* renamed from: b */
        public final /* synthetic */ View f6226b;

        public C2742a(View view) {
            this.f6226b = view;
        }

        public final void onViewAttachedToWindow(View view) {
            this.f6226b.removeOnAttachStateChangeListener(this);
            View view2 = this.f6226b;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2372h.m5253c(view2);
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.a0$b */
    public static /* synthetic */ class C2743b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6227a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6227a = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6227a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6227a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6227a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2741a0.C2743b.<clinit>():void");
        }
    }

    public C2741a0(C2794u uVar, C2749b0 b0Var, Fragment fragment) {
        this.f6221a = uVar;
        this.f6222b = b0Var;
        this.f6223c = fragment;
    }

    /* renamed from: a */
    public final void mo10494a() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("moveto ACTIVITY_CREATED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        Fragment fragment = this.f6223c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C2794u uVar = this.f6221a;
        Fragment fragment2 = this.f6223c;
        uVar.mo10602a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public final void mo10495b() {
        View view;
        View view2;
        C2749b0 b0Var = this.f6222b;
        Fragment fragment = this.f6223c;
        b0Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = b0Var.f6237a.indexOf(fragment);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= b0Var.f6237a.size()) {
                            break;
                        }
                        Fragment fragment2 = b0Var.f6237a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = b0Var.f6237a.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        Fragment fragment4 = this.f6223c;
        fragment4.mContainer.addView(fragment4.mView, i);
    }

    /* renamed from: c */
    public final void mo10496c() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("moveto ATTACHED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        Fragment fragment = this.f6223c;
        Fragment fragment2 = fragment.mTarget;
        C2741a0 a0Var = null;
        if (fragment2 != null) {
            C2749b0 b0Var = this.f6222b;
            C2741a0 a0Var2 = b0Var.f6238b.get(fragment2.mWho);
            if (a0Var2 != null) {
                Fragment fragment3 = this.f6223c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                a0Var = a0Var2;
            } else {
                StringBuilder h2 = C0072d.m201h("Fragment ");
                h2.append(this.f6223c);
                h2.append(" declared target fragment ");
                h2.append(this.f6223c.mTarget);
                h2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(h2.toString());
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (a0Var = this.f6222b.f6238b.get(str)) == null) {
                StringBuilder h3 = C0072d.m201h("Fragment ");
                h3.append(this.f6223c);
                h3.append(" declared target fragment ");
                throw new IllegalStateException(C0023f.m110k(h3, this.f6223c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (a0Var != null) {
            a0Var.mo10504k();
        }
        Fragment fragment4 = this.f6223c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.f6147q;
        fragment4.mParentFragment = fragmentManager.f6149s;
        this.f6221a.mo10608g(fragment4, false);
        this.f6223c.performAttach();
        this.f6221a.mo10603b(this.f6223c, false);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
    /* JADX WARNING: type inference failed for: r8v6, types: [androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10497d() {
        /*
            r13 = this;
            androidx.fragment.app.Fragment r0 = r13.f6223c
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            if (r1 != 0) goto L_0x0009
            int r0 = r0.mState
            return r0
        L_0x0009:
            int r1 = r13.f6225e
            int[] r2 = androidx.fragment.app.C2741a0.C2743b.f6227a
            androidx.lifecycle.Lifecycle$State r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r0 = r2[r0]
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L_0x0037
            if (r0 == r6) goto L_0x0033
            if (r0 == r4) goto L_0x002e
            if (r0 == r5) goto L_0x0028
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0037
        L_0x0028:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0037
        L_0x002e:
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x0037
        L_0x0033:
            int r1 = java.lang.Math.min(r1, r3)
        L_0x0037:
            androidx.fragment.app.Fragment r0 = r13.f6223c
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L_0x0067
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L_0x0058
            int r0 = r13.f6225e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r13.f6223c
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x0067
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0067
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0067
        L_0x0058:
            int r8 = r13.f6225e
            if (r8 >= r5) goto L_0x0063
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0067
        L_0x0063:
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0067:
            androidx.fragment.app.Fragment r0 = r13.f6223c
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L_0x0071
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0071:
            androidx.fragment.app.Fragment r0 = r13.f6223c
            android.view.ViewGroup r8 = r0.mContainer
            r9 = 0
            if (r8 == 0) goto L_0x00bd
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.m6548f(r8, r0)
            r0.getClass()
            androidx.fragment.app.Fragment r8 = r13.f6223c
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r0.mo10471d(r8)
            if (r8 == 0) goto L_0x008e
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = r8.f6204b
            goto L_0x008f
        L_0x008e:
            r8 = r9
        L_0x008f:
            androidx.fragment.app.Fragment r10 = r13.f6223c
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r0.f6200c
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00b0
            java.lang.Object r11 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r11 = (androidx.fragment.app.SpecialEffectsController.Operation) r11
            androidx.fragment.app.Fragment r12 = r11.f6205c
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x0097
            boolean r12 = r11.f6208f
            if (r12 != 0) goto L_0x0097
            r9 = r11
        L_0x00b0:
            if (r9 == 0) goto L_0x00bc
            if (r8 == 0) goto L_0x00b8
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            if (r8 != r0) goto L_0x00bc
        L_0x00b8:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = r9.f6204b
            r9 = r0
            goto L_0x00bd
        L_0x00bc:
            r9 = r8
        L_0x00bd:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r9 != r0) goto L_0x00c7
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x00e5
        L_0x00c7:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r9 != r0) goto L_0x00d0
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00e5
        L_0x00d0:
            androidx.fragment.app.Fragment r0 = r13.f6223c
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto L_0x00e5
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto L_0x00e1
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x00e5
        L_0x00e1:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x00e5:
            androidx.fragment.app.Fragment r0 = r13.f6223c
            boolean r2 = r0.mDeferStart
            if (r2 == 0) goto L_0x00f3
            int r0 = r0.mState
            if (r0 >= r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00f3:
            boolean r0 = androidx.fragment.app.FragmentManager.m6465J(r6)
            if (r0 == 0) goto L_0x00fe
            androidx.fragment.app.Fragment r0 = r13.f6223c
            java.util.Objects.toString(r0)
        L_0x00fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2741a0.mo10497d():int");
    }

    /* renamed from: e */
    public final void mo10498e() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("moveto CREATED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        Fragment fragment = this.f6223c;
        if (!fragment.mIsCreated) {
            this.f6221a.mo10609h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f6223c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C2794u uVar = this.f6221a;
            Fragment fragment3 = this.f6223c;
            uVar.mo10604c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f6223c.mState = 1;
    }

    /* renamed from: f */
    public final void mo10499f() {
        String str;
        if (!this.f6223c.mFromLayout) {
            if (FragmentManager.m6465J(3)) {
                StringBuilder h = C0072d.m201h("moveto CREATE_VIEW: ");
                h.append(this.f6223c);
                Log.d("FragmentManager", h.toString());
            }
            Fragment fragment = this.f6223c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f6223c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.f6148r.mo10129b(i);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f6223c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f6223c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder h2 = C0072d.m201h("No view found for id 0x");
                                h2.append(Integer.toHexString(this.f6223c.mContainerId));
                                h2.append(" (");
                                h2.append(str);
                                h2.append(") for fragment ");
                                h2.append(this.f6223c);
                                throw new IllegalArgumentException(h2.toString());
                            }
                        } else if (!(viewGroup instanceof FragmentContainerView)) {
                            Fragment fragment4 = this.f6223c;
                            FragmentStrictMode.C2785b bVar = FragmentStrictMode.f6339a;
                            C19383o.m32797g(fragment4, "fragment");
                            WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment4, viewGroup);
                            FragmentStrictMode.m6674c(wrongFragmentContainerViolation);
                            FragmentStrictMode.C2785b a = FragmentStrictMode.m6672a(fragment4);
                            if (a.f6341a.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.m6677f(a, fragment4.getClass(), WrongFragmentContainerViolation.class)) {
                                FragmentStrictMode.m6673b(a, wrongFragmentContainerViolation);
                            }
                        }
                    } else {
                        StringBuilder h3 = C0072d.m201h("Cannot create fragment ");
                        h3.append(this.f6223c);
                        h3.append(" for a container view with no id");
                        throw new IllegalArgumentException(h3.toString());
                    }
                }
            }
            Fragment fragment5 = this.f6223c;
            fragment5.mContainer = viewGroup;
            fragment5.performCreateView(performGetLayoutInflater, viewGroup, fragment5.mSavedFragmentState);
            View view = this.f6223c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment6 = this.f6223c;
                fragment6.mView.setTag(R.id.fragment_container_view_tag, fragment6);
                if (viewGroup != null) {
                    mo10495b();
                }
                Fragment fragment7 = this.f6223c;
                if (fragment7.mHidden) {
                    fragment7.mView.setVisibility(8);
                }
                View view2 = this.f6223c.mView;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2371g.m5245b(view2)) {
                    C2364y.C2372h.m5253c(this.f6223c.mView);
                } else {
                    View view3 = this.f6223c.mView;
                    view3.addOnAttachStateChangeListener(new C2742a(view3));
                }
                this.f6223c.performViewCreated();
                C2794u uVar = this.f6221a;
                Fragment fragment8 = this.f6223c;
                uVar.mo10614m(fragment8, fragment8.mView, fragment8.mSavedFragmentState, false);
                int visibility = this.f6223c.mView.getVisibility();
                this.f6223c.setPostOnViewCreatedAlpha(this.f6223c.mView.getAlpha());
                Fragment fragment9 = this.f6223c;
                if (fragment9.mContainer != null && visibility == 0) {
                    View findFocus = fragment9.mView.findFocus();
                    if (findFocus != null) {
                        this.f6223c.setFocusedView(findFocus);
                        if (FragmentManager.m6465J(2)) {
                            findFocus.toString();
                            Objects.toString(this.f6223c);
                        }
                    }
                    this.f6223c.mView.setAlpha(0.0f);
                }
            }
            this.f6223c.mState = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10500g() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.m6465J(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "movefrom CREATED: "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            androidx.fragment.app.Fragment r1 = r7.f6223c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L_0x001b:
            androidx.fragment.app.Fragment r0 = r7.f6223c
            boolean r1 = r0.mRemoving
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002b
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L_0x002b
            r0 = r3
            goto L_0x002c
        L_0x002b:
            r0 = r2
        L_0x002c:
            r1 = 0
            if (r0 == 0) goto L_0x003c
            androidx.fragment.app.Fragment r4 = r7.f6223c
            boolean r5 = r4.mBeingSaved
            if (r5 != 0) goto L_0x003c
            androidx.fragment.app.b0 r5 = r7.f6222b
            java.lang.String r4 = r4.mWho
            r5.mo10526i(r4, r1)
        L_0x003c:
            if (r0 != 0) goto L_0x005c
            androidx.fragment.app.b0 r4 = r7.f6222b
            androidx.fragment.app.w r4 = r4.f6240d
            androidx.fragment.app.Fragment r5 = r7.f6223c
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r6 = r4.f6352b
            java.lang.String r5 = r5.mWho
            boolean r5 = r6.containsKey(r5)
            if (r5 != 0) goto L_0x004f
            goto L_0x0056
        L_0x004f:
            boolean r5 = r4.f6355e
            if (r5 == 0) goto L_0x0056
            boolean r4 = r4.f6356f
            goto L_0x0057
        L_0x0056:
            r4 = r3
        L_0x0057:
            if (r4 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r4 = r2
            goto L_0x005d
        L_0x005c:
            r4 = r3
        L_0x005d:
            if (r4 == 0) goto L_0x00db
            androidx.fragment.app.Fragment r4 = r7.f6223c
            androidx.fragment.app.r<?> r4 = r4.mHost
            boolean r5 = r4 instanceof androidx.lifecycle.C2880m0
            if (r5 == 0) goto L_0x006e
            androidx.fragment.app.b0 r3 = r7.f6222b
            androidx.fragment.app.w r3 = r3.f6240d
            boolean r3 = r3.f6356f
            goto L_0x007b
        L_0x006e:
            android.content.Context r4 = r4.f6334c
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x007b
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isChangingConfigurations()
            r3 = r3 ^ r4
        L_0x007b:
            if (r0 == 0) goto L_0x0083
            androidx.fragment.app.Fragment r0 = r7.f6223c
            boolean r0 = r0.mBeingSaved
            if (r0 == 0) goto L_0x0085
        L_0x0083:
            if (r3 == 0) goto L_0x008e
        L_0x0085:
            androidx.fragment.app.b0 r0 = r7.f6222b
            androidx.fragment.app.w r0 = r0.f6240d
            androidx.fragment.app.Fragment r3 = r7.f6223c
            r0.mo10617c(r3)
        L_0x008e:
            androidx.fragment.app.Fragment r0 = r7.f6223c
            r0.performDestroy()
            androidx.fragment.app.u r0 = r7.f6221a
            androidx.fragment.app.Fragment r3 = r7.f6223c
            r0.mo10605d(r3, r2)
            androidx.fragment.app.b0 r0 = r7.f6222b
            java.util.ArrayList r0 = r0.mo10521d()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.a0 r2 = (androidx.fragment.app.C2741a0) r2
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.Fragment r2 = r2.f6223c
            androidx.fragment.app.Fragment r3 = r7.f6223c
            java.lang.String r3 = r3.mWho
            java.lang.String r4 = r2.mTargetWho
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00a4
            androidx.fragment.app.Fragment r3 = r7.f6223c
            r2.mTarget = r3
            r2.mTargetWho = r1
            goto L_0x00a4
        L_0x00c7:
            androidx.fragment.app.Fragment r0 = r7.f6223c
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto L_0x00d5
            androidx.fragment.app.b0 r2 = r7.f6222b
            androidx.fragment.app.Fragment r1 = r2.mo10519b(r1)
            r0.mTarget = r1
        L_0x00d5:
            androidx.fragment.app.b0 r0 = r7.f6222b
            r0.mo10525h(r7)
            goto L_0x00f5
        L_0x00db:
            androidx.fragment.app.Fragment r0 = r7.f6223c
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L_0x00f1
            androidx.fragment.app.b0 r1 = r7.f6222b
            androidx.fragment.app.Fragment r0 = r1.mo10519b(r0)
            if (r0 == 0) goto L_0x00f1
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L_0x00f1
            androidx.fragment.app.Fragment r1 = r7.f6223c
            r1.mTarget = r0
        L_0x00f1:
            androidx.fragment.app.Fragment r0 = r7.f6223c
            r0.mState = r2
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2741a0.mo10500g():void");
    }

    /* renamed from: h */
    public final void mo10501h() {
        View view;
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("movefrom CREATE_VIEW: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        Fragment fragment = this.f6223c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f6223c.performDestroyView();
        this.f6221a.mo10615n(this.f6223c, false);
        Fragment fragment2 = this.f6223c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f6223c.mInLayout = false;
    }

    /* renamed from: i */
    public final void mo10502i() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("movefrom ATTACHED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        this.f6223c.performDetach();
        boolean z = false;
        this.f6221a.mo10606e(this.f6223c, false);
        Fragment fragment = this.f6223c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            C2797w wVar = this.f6222b.f6240d;
            if (wVar.f6352b.containsKey(this.f6223c.mWho) && wVar.f6355e) {
                z2 = wVar.f6356f;
            }
            if (!z2) {
                return;
            }
        }
        if (FragmentManager.m6465J(3)) {
            StringBuilder h2 = C0072d.m201h("initState called for fragment: ");
            h2.append(this.f6223c);
            Log.d("FragmentManager", h2.toString());
        }
        this.f6223c.initState();
    }

    /* renamed from: j */
    public final void mo10503j() {
        Fragment fragment = this.f6223c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m6465J(3)) {
                StringBuilder h = C0072d.m201h("moveto CREATE_VIEW: ");
                h.append(this.f6223c);
                Log.d("FragmentManager", h.toString());
            }
            Fragment fragment2 = this.f6223c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f6223c.mSavedFragmentState);
            View view = this.f6223c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f6223c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f6223c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f6223c.performViewCreated();
                C2794u uVar = this.f6221a;
                Fragment fragment5 = this.f6223c;
                uVar.mo10614m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f6223c.mState = 2;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: k */
    public final void mo10504k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f6224d) {
            try {
                this.f6224d = true;
                boolean z = false;
                while (true) {
                    int d = mo10497d();
                    Fragment fragment = this.f6223c;
                    int i = fragment.mState;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo10502i();
                                    break;
                                case 0:
                                    if (fragment.mBeingSaved) {
                                        if (this.f6222b.f6239c.get(fragment.mWho) == null) {
                                            mo10508o();
                                        }
                                    }
                                    mo10500g();
                                    break;
                                case 1:
                                    mo10501h();
                                    this.f6223c.mState = 1;
                                    break;
                                case 2:
                                    fragment.mInLayout = false;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.m6465J(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f6223c);
                                    }
                                    Fragment fragment2 = this.f6223c;
                                    if (fragment2.mBeingSaved) {
                                        mo10508o();
                                    } else if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        mo10509p();
                                    }
                                    Fragment fragment3 = this.f6223c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController f = SpecialEffectsController.m6548f(viewGroup2, fragment3.getParentFragmentManager());
                                        f.getClass();
                                        if (FragmentManager.m6465J(2)) {
                                            Objects.toString(this.f6223c);
                                        }
                                        f.mo10468a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                                    }
                                    this.f6223c.mState = 3;
                                    break;
                                case 4:
                                    mo10511r();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    mo10505l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo10496c();
                                    break;
                                case 1:
                                    mo10498e();
                                    break;
                                case 2:
                                    mo10503j();
                                    mo10499f();
                                    break;
                                case 3:
                                    mo10494a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController f2 = SpecialEffectsController.m6548f(viewGroup3, fragment.getParentFragmentManager());
                                        SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.f6223c.mView.getVisibility());
                                        f2.getClass();
                                        if (FragmentManager.m6465J(2)) {
                                            Objects.toString(this.f6223c);
                                        }
                                        f2.mo10468a(from, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                                    }
                                    this.f6223c.mState = 4;
                                    break;
                                case 5:
                                    mo10510q();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    mo10507n();
                                    break;
                            }
                        }
                        z = true;
                    } else {
                        if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f6223c.mBeingSaved) {
                            if (FragmentManager.m6465J(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f6223c);
                            }
                            this.f6222b.f6240d.mo10617c(this.f6223c);
                            this.f6222b.mo10525h(this);
                            if (FragmentManager.m6465J(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.f6223c);
                            }
                            this.f6223c.initState();
                        }
                        Fragment fragment4 = this.f6223c;
                        if (fragment4.mHiddenChanged) {
                            if (!(fragment4.mView == null || (viewGroup = fragment4.mContainer) == null)) {
                                SpecialEffectsController f3 = SpecialEffectsController.m6548f(viewGroup, fragment4.getParentFragmentManager());
                                if (this.f6223c.mHidden) {
                                    f3.getClass();
                                    if (FragmentManager.m6465J(2)) {
                                        Objects.toString(this.f6223c);
                                    }
                                    f3.mo10468a(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                                } else {
                                    f3.getClass();
                                    if (FragmentManager.m6465J(2)) {
                                        Objects.toString(this.f6223c);
                                    }
                                    f3.mo10468a(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                                }
                            }
                            Fragment fragment5 = this.f6223c;
                            FragmentManager fragmentManager = fragment5.mFragmentManager;
                            if (fragmentManager != null && fragment5.mAdded && FragmentManager.m6466K(fragment5)) {
                                fragmentManager.f6121B = true;
                            }
                            Fragment fragment6 = this.f6223c;
                            fragment6.mHiddenChanged = false;
                            fragment6.onHiddenChanged(fragment6.mHidden);
                            this.f6223c.mChildFragmentManager.mo10393n();
                        }
                        this.f6224d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.f6224d = false;
                throw th;
            }
        } else if (FragmentManager.m6465J(2)) {
            Objects.toString(this.f6223c);
        }
    }

    /* renamed from: l */
    public final void mo10505l() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("movefrom RESUMED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        this.f6223c.performPause();
        this.f6221a.mo10607f(this.f6223c, false);
    }

    /* renamed from: m */
    public final void mo10506m(ClassLoader classLoader) {
        Bundle bundle = this.f6223c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f6223c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f6223c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f6223c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f6223c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f6223c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f6223c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f6223c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* renamed from: n */
    public final void mo10507n() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("moveto RESUMED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        View focusedView = this.f6223c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.f6223c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f6223c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                focusedView.requestFocus();
                if (FragmentManager.m6465J(2)) {
                    focusedView.toString();
                    Objects.toString(this.f6223c);
                    Objects.toString(this.f6223c.mView.findFocus());
                }
            }
        }
        this.f6223c.setFocusedView((View) null);
        this.f6223c.performResume();
        this.f6221a.mo10610i(this.f6223c, false);
        Fragment fragment = this.f6223c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: o */
    public final void mo10508o() {
        FragmentState fragmentState = new FragmentState(this.f6223c);
        Fragment fragment = this.f6223c;
        if (fragment.mState <= -1 || fragmentState.f6189n != null) {
            fragmentState.f6189n = fragment.mSavedFragmentState;
        } else {
            Bundle bundle = new Bundle();
            this.f6223c.performSaveInstanceState(bundle);
            this.f6221a.mo10611j(this.f6223c, bundle, false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (this.f6223c.mView != null) {
                mo10509p();
            }
            if (this.f6223c.mSavedViewState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", this.f6223c.mSavedViewState);
            }
            if (this.f6223c.mSavedViewRegistryState != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", this.f6223c.mSavedViewRegistryState);
            }
            if (!this.f6223c.mUserVisibleHint) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", this.f6223c.mUserVisibleHint);
            }
            fragmentState.f6189n = bundle;
            if (this.f6223c.mTargetWho != null) {
                if (bundle == null) {
                    fragmentState.f6189n = new Bundle();
                }
                fragmentState.f6189n.putString("android:target_state", this.f6223c.mTargetWho);
                int i = this.f6223c.mTargetRequestCode;
                if (i != 0) {
                    fragmentState.f6189n.putInt("android:target_req_state", i);
                }
            }
        }
        this.f6222b.mo10526i(this.f6223c.mWho, fragmentState);
    }

    /* renamed from: p */
    public final void mo10509p() {
        if (this.f6223c.mView != null) {
            if (FragmentManager.m6465J(2)) {
                Objects.toString(this.f6223c);
                Objects.toString(this.f6223c.mView);
            }
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f6223c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f6223c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f6223c.mViewLifecycleOwner.f6319f.mo12064b(bundle);
            if (!bundle.isEmpty()) {
                this.f6223c.mSavedViewRegistryState = bundle;
            }
        }
    }

    /* renamed from: q */
    public final void mo10510q() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("moveto STARTED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        this.f6223c.performStart();
        this.f6221a.mo10612k(this.f6223c, false);
    }

    /* renamed from: r */
    public final void mo10511r() {
        if (FragmentManager.m6465J(3)) {
            StringBuilder h = C0072d.m201h("movefrom STARTED: ");
            h.append(this.f6223c);
            Log.d("FragmentManager", h.toString());
        }
        this.f6223c.performStop();
        this.f6221a.mo10613l(this.f6223c, false);
    }

    public C2741a0(C2794u uVar, C2749b0 b0Var, ClassLoader classLoader, C2781q qVar, FragmentState fragmentState) {
        this.f6221a = uVar;
        this.f6222b = b0Var;
        Fragment a = qVar.mo10411a(classLoader, fragmentState.f6177b);
        Bundle bundle = fragmentState.f6186k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(fragmentState.f6186k);
        a.mWho = fragmentState.f6178c;
        a.mFromLayout = fragmentState.f6179d;
        a.mRestored = true;
        a.mFragmentId = fragmentState.f6180e;
        a.mContainerId = fragmentState.f6181f;
        a.mTag = fragmentState.f6182g;
        a.mRetainInstance = fragmentState.f6183h;
        a.mRemoving = fragmentState.f6184i;
        a.mDetached = fragmentState.f6185j;
        a.mHidden = fragmentState.f6187l;
        a.mMaxState = Lifecycle.State.values()[fragmentState.f6188m];
        Bundle bundle2 = fragmentState.f6189n;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        this.f6223c = a;
        if (FragmentManager.m6465J(2)) {
            Objects.toString(a);
        }
    }

    public C2741a0(C2794u uVar, C2749b0 b0Var, Fragment fragment, FragmentState fragmentState) {
        this.f6221a = uVar;
        this.f6222b = b0Var;
        this.f6223c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f6189n;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
