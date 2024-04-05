package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.b */
public final class C15480b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C15473a f34752a;

    public C15480b(C15473a aVar) {
        this.f34752a = aVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f34752a.f34787a.setEndIconVisible(true);
    }
}
