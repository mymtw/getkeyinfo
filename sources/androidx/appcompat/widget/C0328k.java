package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C2364y;
import p075d.C6614a;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.k */
public final class C0328k {

    /* renamed from: a */
    public final ImageView f822a;

    /* renamed from: b */
    public C0336n0 f823b;

    /* renamed from: c */
    public int f824c = 0;

    public C0328k(ImageView imageView) {
        this.f822a = imageView;
    }

    /* renamed from: a */
    public final void mo3072a() {
        C0336n0 n0Var;
        Drawable drawable = this.f822a.getDrawable();
        if (drawable != null) {
            C0359y.m995b(drawable);
        }
        if (drawable != null && (n0Var = this.f823b) != null) {
            C0317g.m823e(drawable, n0Var, this.f822a.getDrawableState());
        }
    }

    /* renamed from: b */
    public final void mo3073b(AttributeSet attributeSet, int i) {
        int i2;
        Context context = this.f822a.getContext();
        int[] iArr = C18263b.f40076m;
        C0340p0 m = C0340p0.m891m(context, attributeSet, iArr, i);
        ImageView imageView = this.f822a;
        C2364y.m5200o(imageView, imageView.getContext(), iArr, attributeSet, m.f876b, i);
        try {
            Drawable drawable = this.f822a.getDrawable();
            if (!(drawable != null || (i2 = m.mo3105i(1, -1)) == -1 || (drawable = C6614a.m12981a(this.f822a.getContext(), i2)) == null)) {
                this.f822a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0359y.m995b(drawable);
            }
            if (m.mo3108l(2)) {
                this.f822a.setImageTintList(m.mo3098b(2));
            }
            if (m.mo3108l(3)) {
                this.f822a.setImageTintMode(C0359y.m997d(m.mo3104h(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            m.mo3109n();
        }
    }

    /* renamed from: c */
    public final void mo3074c(int i) {
        if (i != 0) {
            Drawable a = C6614a.m12981a(this.f822a.getContext(), i);
            if (a != null) {
                C0359y.m995b(a);
            }
            this.f822a.setImageDrawable(a);
        } else {
            this.f822a.setImageDrawable((Drawable) null);
        }
        mo3072a();
    }
}
