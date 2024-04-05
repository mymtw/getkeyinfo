package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C15323c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.material.floatingactionbutton.b */
public final class C15322b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ boolean f34327a;

    /* renamed from: b */
    public final /* synthetic */ C15323c.C15330g f34328b;

    /* renamed from: c */
    public final /* synthetic */ C15323c f34329c;

    public C15322b(C15323c cVar, boolean z, C15323c.C15330g gVar) {
        this.f34329c = cVar;
        this.f34327a = z;
        this.f34328b = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C15323c cVar = this.f34329c;
        cVar.f34356r = 0;
        cVar.f34350l = null;
        C15323c.C15330g gVar = this.f34328b;
        if (gVar != null) {
            ((FloatingActionButton.C15317a) gVar).f34318a.mo53150b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f34329c.f34360v.internalSetVisibility(0, this.f34327a);
        C15323c cVar = this.f34329c;
        cVar.f34356r = 2;
        cVar.f34350l = animator;
    }
}
