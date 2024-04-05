package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.C15323c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.material.floatingactionbutton.a */
public final class C15321a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public boolean f34323a;

    /* renamed from: b */
    public final /* synthetic */ boolean f34324b;

    /* renamed from: c */
    public final /* synthetic */ C15323c.C15330g f34325c;

    /* renamed from: d */
    public final /* synthetic */ C15323c f34326d;

    public C15321a(C15323c cVar, boolean z, C15323c.C15330g gVar) {
        this.f34326d = cVar;
        this.f34324b = z;
        this.f34325c = gVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f34323a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C15323c cVar = this.f34326d;
        cVar.f34356r = 0;
        cVar.f34350l = null;
        if (!this.f34323a) {
            FloatingActionButton floatingActionButton = cVar.f34360v;
            boolean z = this.f34324b;
            floatingActionButton.internalSetVisibility(z ? 8 : 4, z);
            C15323c.C15330g gVar = this.f34325c;
            if (gVar != null) {
                FloatingActionButton.C15317a aVar = (FloatingActionButton.C15317a) gVar;
                aVar.f34318a.mo53149a(FloatingActionButton.this);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f34326d.f34360v.internalSetVisibility(0, this.f34324b);
        C15323c cVar = this.f34326d;
        cVar.f34356r = 1;
        cVar.f34350l = animator;
        this.f34323a = false;
    }
}
