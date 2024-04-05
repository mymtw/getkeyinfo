package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.material.tabs.c */
public final class C15458c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f34716a;

    /* renamed from: b */
    public final /* synthetic */ TabLayout.C15452f f34717b;

    public C15458c(TabLayout.C15452f fVar, int i) {
        this.f34717b = fVar;
        this.f34716a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f34717b.f34696c = this.f34716a;
    }

    public final void onAnimationStart(Animator animator) {
        this.f34717b.f34696c = this.f34716a;
    }
}
