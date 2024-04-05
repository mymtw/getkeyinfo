package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: androidx.appcompat.widget.e */
public final class C0308e {

    /* renamed from: a */
    public final CheckedTextView f756a;

    /* renamed from: b */
    public ColorStateList f757b = null;

    /* renamed from: c */
    public PorterDuff.Mode f758c = null;

    /* renamed from: d */
    public boolean f759d = false;

    /* renamed from: e */
    public boolean f760e = false;

    /* renamed from: f */
    public boolean f761f;

    public C0308e(CheckedTextView checkedTextView) {
        this.f756a = checkedTextView;
    }

    /* renamed from: a */
    public final void mo3032a() {
        Drawable checkMarkDrawable = this.f756a.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f759d || this.f760e) {
            Drawable mutate = checkMarkDrawable.mutate();
            if (this.f759d) {
                mutate.setTintList(this.f757b);
            }
            if (this.f760e) {
                mutate.setTintMode(this.f758c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f756a.getDrawableState());
            }
            this.f756a.setCheckMarkDrawable(mutate);
        }
    }
}
