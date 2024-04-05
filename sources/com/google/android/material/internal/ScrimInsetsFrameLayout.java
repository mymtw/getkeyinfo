package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;
import p289y0.C8352d;
import p610kp.C18161c;

public class ScrimInsetsFrameLayout extends FrameLayout {
    private boolean drawBottomInsetForeground;
    private boolean drawTopInsetForeground;
    public Drawable insetForeground;
    public Rect insets;
    private Rect tempRect;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    public class C15341a implements C2325q {
        public C15341a() {
        }

        /* renamed from: b */
        public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.insets == null) {
                scrimInsetsFrameLayout.insets = new Rect();
            }
            ScrimInsetsFrameLayout.this.insets.set(w0Var.mo8945e(), w0Var.mo8948g(), w0Var.mo8947f(), w0Var.mo8944d());
            ScrimInsetsFrameLayout.this.onInsetsChanged(w0Var);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            boolean z = true;
            if ((!w0Var.f5615a.mo8964k().equals(C8352d.f18319e)) && ScrimInsetsFrameLayout.this.insetForeground != null) {
                z = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout3 = ScrimInsetsFrameLayout.this;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(scrimInsetsFrameLayout3);
            return w0Var.f5615a.mo8974c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.insets != null && this.insetForeground != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.drawTopInsetForeground) {
                this.tempRect.set(0, 0, width, this.insets.top);
                this.insetForeground.setBounds(this.tempRect);
                this.insetForeground.draw(canvas);
            }
            if (this.drawBottomInsetForeground) {
                this.tempRect.set(0, height - this.insets.bottom, width, height);
                this.insetForeground.setBounds(this.tempRect);
                this.insetForeground.draw(canvas);
            }
            Rect rect = this.tempRect;
            Rect rect2 = this.insets;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
            Rect rect3 = this.tempRect;
            Rect rect4 = this.insets;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.insetForeground.setBounds(this.tempRect);
            this.insetForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.insetForeground;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void onInsetsChanged(C2348w0 w0Var) {
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.drawBottomInsetForeground = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.drawTopInsetForeground = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.insetForeground = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tempRect = new Rect();
        this.drawTopInsetForeground = true;
        this.drawBottomInsetForeground = true;
        TypedArray d = C15367g.m24957d(context, attributeSet, C18161c.f39678V, i, 2132018409, new int[0]);
        this.insetForeground = d.getDrawable(0);
        d.recycle();
        setWillNotDraw(true);
        C15341a aVar = new C15341a();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2373i.m5274u(this, aVar);
    }
}
