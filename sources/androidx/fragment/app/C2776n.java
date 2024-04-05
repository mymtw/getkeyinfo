package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.core.view.OneShotPreDrawListener;

/* renamed from: androidx.fragment.app.n */
public final class C2776n {
    /* renamed from: a */
    public static int m6658a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: androidx.fragment.app.n$a */
    public static class C2777a {

        /* renamed from: a */
        public final Animation f6324a;

        /* renamed from: b */
        public final Animator f6325b;

        public C2777a(Animation animation) {
            this.f6324a = animation;
            this.f6325b = null;
        }

        public C2777a(Animator animator) {
            this.f6324a = null;
            this.f6325b = animator;
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    public static class C2778b extends AnimationSet implements Runnable {

        /* renamed from: b */
        public final ViewGroup f6326b;

        /* renamed from: c */
        public final View f6327c;

        /* renamed from: d */
        public boolean f6328d;

        /* renamed from: e */
        public boolean f6329e;

        /* renamed from: f */
        public boolean f6330f = true;

        public C2778b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f6326b = viewGroup;
            this.f6327c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation) {
            this.f6330f = true;
            if (this.f6328d) {
                return !this.f6329e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f6328d = true;
                OneShotPreDrawListener.add(this.f6326b, this);
            }
            return true;
        }

        public final void run() {
            if (this.f6328d || !this.f6330f) {
                this.f6326b.endViewTransition(this.f6327c);
                this.f6329e = true;
                return;
            }
            this.f6330f = false;
            this.f6326b.post(this);
        }

        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f6330f = true;
            if (this.f6328d) {
                return !this.f6329e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f6328d = true;
                OneShotPreDrawListener.add(this.f6326b, this);
            }
            return true;
        }
    }
}
