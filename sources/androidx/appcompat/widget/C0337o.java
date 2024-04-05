package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.view.C2364y;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.o */
public final class C0337o extends C0333m {

    /* renamed from: d */
    public final SeekBar f866d;

    /* renamed from: e */
    public Drawable f867e;

    /* renamed from: f */
    public ColorStateList f868f = null;

    /* renamed from: g */
    public PorterDuff.Mode f869g = null;

    /* renamed from: h */
    public boolean f870h = false;

    /* renamed from: i */
    public boolean f871i = false;

    public C0337o(SeekBar seekBar) {
        super(seekBar);
        this.f866d = seekBar;
    }

    /* renamed from: a */
    public final void mo3093a(AttributeSet attributeSet, int i) {
        super.mo3093a(attributeSet, i);
        Context context = this.f866d.getContext();
        int[] iArr = C18263b.f40077n;
        C0340p0 m = C0340p0.m891m(context, attributeSet, iArr, i);
        SeekBar seekBar = this.f866d;
        C2364y.m5200o(seekBar, seekBar.getContext(), iArr, attributeSet, m.f876b, i);
        Drawable f = m.mo3102f(0);
        if (f != null) {
            this.f866d.setThumb(f);
        }
        Drawable e = m.mo3101e(1);
        Drawable drawable = this.f867e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f867e = e;
        if (e != null) {
            e.setCallback(this.f866d);
            e.setLayoutDirection(C2364y.C2369e.m5233d(this.f866d));
            if (e.isStateful()) {
                e.setState(this.f866d.getDrawableState());
            }
            mo3095c();
        }
        this.f866d.invalidate();
        if (m.mo3108l(3)) {
            this.f869g = C0359y.m997d(m.mo3104h(3, -1), this.f869g);
            this.f871i = true;
        }
        if (m.mo3108l(2)) {
            this.f868f = m.mo3098b(2);
            this.f870h = true;
        }
        m.mo3109n();
        mo3095c();
    }

    /* renamed from: c */
    public final void mo3095c() {
        Drawable drawable = this.f867e;
        if (drawable == null) {
            return;
        }
        if (this.f870h || this.f871i) {
            Drawable mutate = drawable.mutate();
            this.f867e = mutate;
            if (this.f870h) {
                mutate.setTintList(this.f868f);
            }
            if (this.f871i) {
                this.f867e.setTintMode(this.f869g);
            }
            if (this.f867e.isStateful()) {
                this.f867e.setState(this.f866d.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public final void mo3096d(Canvas canvas) {
        if (this.f867e != null) {
            int max = this.f866d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f867e.getIntrinsicWidth();
                int intrinsicHeight = this.f867e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f867e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f866d.getWidth() - this.f866d.getPaddingLeft()) - this.f866d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f866d.getPaddingLeft(), (float) (this.f866d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f867e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
