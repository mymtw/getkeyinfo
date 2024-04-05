package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p582hl.C17827a;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f34925b;

    public ExpandableTransformationBehavior() {
    }

    /* renamed from: a */
    public void mo55227a(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f34925b;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet b = mo55229b(view, view2, z, z3);
        this.f34925b = b;
        b.addListener(new C17827a(this));
        this.f34925b.start();
        if (!z2) {
            this.f34925b.end();
        }
    }

    /* renamed from: b */
    public abstract AnimatorSet mo55229b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
