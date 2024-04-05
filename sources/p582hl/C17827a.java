package p582hl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* renamed from: hl.a */
public final class C17827a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ExpandableTransformationBehavior f38731a;

    public C17827a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f38731a = expandableTransformationBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f38731a.f34925b = null;
    }
}
