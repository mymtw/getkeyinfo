package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.material.textfield.l */
public final class C15498l extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C15486h f34786a;

    public C15498l(C15486h hVar) {
        this.f34786a = hVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C15486h hVar = this.f34786a;
        hVar.f34789c.setChecked(hVar.f34765k);
        this.f34786a.f34771q.start();
    }
}
