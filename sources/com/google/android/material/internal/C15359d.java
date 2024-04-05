package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.d */
public final class C15359d {

    /* renamed from: a */
    public final ArrayList<C15361b> f34501a = new ArrayList<>();

    /* renamed from: b */
    public ValueAnimator f34502b = null;

    /* renamed from: c */
    public final C15360a f34503c = new C15360a();

    /* renamed from: com.google.android.material.internal.d$a */
    public class C15360a extends AnimatorListenerAdapter {
        public C15360a() {
        }

        public final void onAnimationEnd(Animator animator) {
            C15359d dVar = C15359d.this;
            if (dVar.f34502b == animator) {
                dVar.f34502b = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.d$b */
    public static class C15361b {
        public C15361b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: a */
    public final void mo54196a(int[] iArr, ValueAnimator valueAnimator) {
        C15361b bVar = new C15361b(iArr, valueAnimator);
        valueAnimator.addListener(this.f34503c);
        this.f34501a.add(bVar);
    }
}
