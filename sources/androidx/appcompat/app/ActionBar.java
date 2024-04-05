package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.C0194a;
import p628nj.C18263b;

public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface C0127a {
        /* renamed from: a */
        void mo1198a();
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public static abstract class C0128b {
        /* renamed from: a */
        public abstract CharSequence mo1199a();

        /* renamed from: b */
        public abstract View mo1200b();

        /* renamed from: c */
        public abstract Drawable mo1201c();

        /* renamed from: d */
        public abstract CharSequence mo1202d();

        /* renamed from: e */
        public abstract void mo1203e();
    }

    /* renamed from: A */
    public abstract void mo1164A(boolean z);

    /* renamed from: B */
    public abstract void mo1165B();

    /* renamed from: C */
    public abstract void mo1166C(boolean z);

    /* renamed from: D */
    public abstract void mo1167D(CharSequence charSequence);

    /* renamed from: E */
    public abstract void mo1168E(CharSequence charSequence);

    /* renamed from: F */
    public abstract void mo1169F(CharSequence charSequence);

    /* renamed from: G */
    public abstract void mo1170G();

    /* renamed from: H */
    public C0194a mo1171H(AppCompatDelegateImpl.C0141e eVar) {
        return null;
    }

    /* renamed from: a */
    public boolean mo1172a() {
        return false;
    }

    /* renamed from: b */
    public abstract boolean mo1173b();

    /* renamed from: c */
    public abstract void mo1174c(boolean z);

    /* renamed from: d */
    public abstract View mo1175d();

    /* renamed from: e */
    public abstract int mo1176e();

    @Deprecated
    /* renamed from: f */
    public abstract int mo1177f();

    /* renamed from: g */
    public abstract Context mo1178g();

    /* renamed from: h */
    public abstract void mo1179h();

    /* renamed from: i */
    public boolean mo1180i() {
        return false;
    }

    /* renamed from: j */
    public abstract void mo1181j();

    /* renamed from: k */
    public void mo1182k() {
    }

    /* renamed from: l */
    public abstract boolean mo1183l(int i, KeyEvent keyEvent);

    /* renamed from: m */
    public boolean mo1184m(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: n */
    public boolean mo1185n() {
        return false;
    }

    /* renamed from: o */
    public abstract void mo1186o(ColorDrawable colorDrawable);

    /* renamed from: p */
    public abstract void mo1187p(View view);

    /* renamed from: q */
    public abstract void mo1188q(View view, LayoutParams layoutParams);

    /* renamed from: r */
    public abstract void mo1189r(boolean z);

    /* renamed from: s */
    public abstract void mo1190s(boolean z);

    /* renamed from: t */
    public abstract void mo1191t(boolean z);

    /* renamed from: u */
    public abstract void mo1192u(boolean z);

    /* renamed from: v */
    public abstract void mo1193v(boolean z);

    /* renamed from: w */
    public abstract void mo1194w();

    /* renamed from: x */
    public abstract void mo1195x(CharSequence charSequence);

    /* renamed from: y */
    public abstract void mo1196y(int i);

    /* renamed from: z */
    public abstract void mo1197z(Drawable drawable);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18263b.f40068h);
            this.gravity = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.gravity = i3;
        }

        public LayoutParams(int i) {
            this(-2, -1, i);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
