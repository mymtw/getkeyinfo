package com.etsy.android.uikit.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

/* renamed from: com.etsy.android.uikit.util.b */
public final class C11896b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ImageView f26456a;

    /* renamed from: b */
    public final /* synthetic */ int f26457b;

    public C11896b(ImageView imageView, int i) {
        this.f26456a = imageView;
        this.f26457b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.f26456a.setImageResource(this.f26457b);
    }
}
