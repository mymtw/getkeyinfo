package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.h */
public final class C17442h implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final C17461t f38106b;

    /* renamed from: c */
    public final WeakReference<ImageView> f38107c;

    /* renamed from: d */
    public C17439e f38108d;

    public C17442h(C17461t tVar, ImageView imageView, C17439e eVar) {
        this.f38106b = tVar;
        this.f38107c = new WeakReference<>(imageView);
        this.f38108d = eVar;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            imageView.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    public final boolean onPreDraw() {
        ImageView imageView = this.f38107c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f38107c.clear();
            C17461t tVar = this.f38106b;
            tVar.f38175c = false;
            tVar.f38174b.mo68634a(width, height);
            tVar.mo68635a(imageView, this.f38108d);
        }
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
