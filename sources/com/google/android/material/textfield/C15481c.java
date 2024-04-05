package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.c */
public final class C15481c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C15473a f34753a;

    public C15481c(C15473a aVar) {
        this.f34753a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f34753a.f34787a.setEndIconVisible(false);
    }
}
