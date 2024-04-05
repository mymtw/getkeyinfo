package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p696vk.C18656a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.C2245c<View> {

    /* renamed from: a */
    public int f34920a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C15541a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ View f34921b;

        /* renamed from: c */
        public final /* synthetic */ int f34922c;

        /* renamed from: d */
        public final /* synthetic */ C18656a f34923d;

        public C15541a(View view, int i, C18656a aVar) {
            this.f34921b = view;
            this.f34922c = i;
            this.f34923d = aVar;
        }

        public final boolean onPreDraw() {
            this.f34921b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f34920a == this.f34922c) {
                C18656a aVar = this.f34923d;
                expandableBehavior.mo55227a((View) aVar, this.f34921b, aVar.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: a */
    public abstract void mo55227a(View view, View view2, boolean z, boolean z2);

    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r4 = r3.f34920a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.View r6) {
        /*
            r3 = this;
            vk.a r6 = (p696vk.C18656a) r6
            boolean r4 = r6.isExpanded()
            r0 = 2
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L_0x0016
            int r4 = r3.f34920a
            if (r4 == 0) goto L_0x0014
            if (r4 != r0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r4 = r1
            goto L_0x001b
        L_0x0014:
            r4 = r2
            goto L_0x001b
        L_0x0016:
            int r4 = r3.f34920a
            if (r4 != r2) goto L_0x0012
            goto L_0x0014
        L_0x001b:
            if (r4 == 0) goto L_0x0031
            boolean r4 = r6.isExpanded()
            if (r4 == 0) goto L_0x0024
            r0 = r2
        L_0x0024:
            r3.f34920a = r0
            r4 = r6
            android.view.View r4 = (android.view.View) r4
            boolean r6 = r6.isExpanded()
            r3.mo55227a(r4, r5, r6, r2)
            return r2
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r6 = r5.f34920a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, int r8) {
        /*
            r5 = this;
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r8 = androidx.core.view.C2364y.f5646a
            boolean r8 = androidx.core.view.C2364y.C2371g.m5246c(r7)
            r0 = 0
            if (r8 != 0) goto L_0x0058
            java.util.List r8 = r6.getDependencies(r7)
            int r1 = r8.size()
            r2 = r0
        L_0x0012:
            if (r2 >= r1) goto L_0x0026
            java.lang.Object r3 = r8.get(r2)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r5.layoutDependsOn(r6, r7, r3)
            if (r4 == 0) goto L_0x0023
            vk.a r3 = (p696vk.C18656a) r3
            goto L_0x0027
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x0058
            boolean r6 = r3.isExpanded()
            r8 = 2
            r1 = 1
            if (r6 == 0) goto L_0x003c
            int r6 = r5.f34920a
            if (r6 == 0) goto L_0x003a
            if (r6 != r8) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r6 = r0
            goto L_0x0041
        L_0x003a:
            r6 = r1
            goto L_0x0041
        L_0x003c:
            int r6 = r5.f34920a
            if (r6 != r1) goto L_0x0038
            goto L_0x003a
        L_0x0041:
            if (r6 == 0) goto L_0x0058
            boolean r6 = r3.isExpanded()
            if (r6 == 0) goto L_0x004a
            r8 = r1
        L_0x004a:
            r5.f34920a = r8
            android.view.ViewTreeObserver r6 = r7.getViewTreeObserver()
            com.google.android.material.transformation.ExpandableBehavior$a r1 = new com.google.android.material.transformation.ExpandableBehavior$a
            r1.<init>(r7, r8, r3)
            r6.addOnPreDrawListener(r1)
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.ExpandableBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
