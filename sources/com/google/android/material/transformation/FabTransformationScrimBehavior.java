package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.ArrayList;
import p629nk.C18270c;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final C18270c f34937c = new C18270c(75);

    /* renamed from: d */
    public final C18270c f34938d = new C18270c(0);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C15544a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f34939a;

        /* renamed from: b */
        public final /* synthetic */ View f34940b;

        public C15544a(boolean z, View view) {
            this.f34939a = z;
            this.f34940b = view;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f34939a) {
                this.f34940b.setVisibility(4);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f34939a) {
                this.f34940b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: b */
    public final AnimatorSet mo55229b(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C18270c cVar = z ? this.f34937c : this.f34938d;
        if (z) {
            if (!z2) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        cVar.mo69817a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        C15588c1.m25289K0(animatorSet, arrayList);
        animatorSet.addListener(new C15544a(z, view2));
        return animatorSet;
    }

    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
