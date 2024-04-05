package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.d */
public final class C0306d {

    /* renamed from: a */
    public final View f750a;

    /* renamed from: b */
    public final C0317g f751b;

    /* renamed from: c */
    public int f752c = -1;

    /* renamed from: d */
    public C0336n0 f753d;

    /* renamed from: e */
    public C0336n0 f754e;

    /* renamed from: f */
    public C0336n0 f755f;

    public C0306d(View view) {
        this.f750a = view;
        this.f751b = C0317g.m820a();
    }

    /* renamed from: a */
    public final void mo3023a() {
        Drawable background = this.f750a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f753d != null) {
                if (this.f755f == null) {
                    this.f755f = new C0336n0();
                }
                C0336n0 n0Var = this.f755f;
                n0Var.f862a = null;
                n0Var.f865d = false;
                n0Var.f863b = null;
                n0Var.f864c = false;
                View view = this.f750a;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                ColorStateList g = C2364y.C2373i.m5260g(view);
                if (g != null) {
                    n0Var.f865d = true;
                    n0Var.f862a = g;
                }
                PorterDuff.Mode h = C2364y.C2373i.m5261h(this.f750a);
                if (h != null) {
                    n0Var.f864c = true;
                    n0Var.f863b = h;
                }
                if (n0Var.f865d || n0Var.f864c) {
                    C0317g.m823e(background, n0Var, this.f750a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            C0336n0 n0Var2 = this.f754e;
            if (n0Var2 != null) {
                C0317g.m823e(background, n0Var2, this.f750a.getDrawableState());
                return;
            }
            C0336n0 n0Var3 = this.f753d;
            if (n0Var3 != null) {
                C0317g.m823e(background, n0Var3, this.f750a.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList mo3024b() {
        C0336n0 n0Var = this.f754e;
        if (n0Var != null) {
            return n0Var.f862a;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode mo3025c() {
        C0336n0 n0Var = this.f754e;
        if (n0Var != null) {
            return n0Var.f863b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        r0.mo3109n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        throw r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3026d(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.view.View r0 = r7.f750a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p628nj.C18263b.f40045I
            androidx.appcompat.widget.p0 r0 = androidx.appcompat.widget.C0340p0.m891m(r0, r8, r3, r9)
            android.view.View r1 = r7.f750a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f876b
            r4 = r8
            r6 = r9
            androidx.core.view.C2364y.m5200o(r1, r2, r3, r4, r5, r6)
            r8 = 0
            boolean r9 = r0.mo3108l(r8)     // Catch:{ all -> 0x006b }
            r1 = -1
            if (r9 == 0) goto L_0x0042
            int r8 = r0.mo3105i(r8, r1)     // Catch:{ all -> 0x006b }
            r7.f752c = r8     // Catch:{ all -> 0x006b }
            androidx.appcompat.widget.g r8 = r7.f751b     // Catch:{ all -> 0x006b }
            android.view.View r9 = r7.f750a     // Catch:{ all -> 0x006b }
            android.content.Context r9 = r9.getContext()     // Catch:{ all -> 0x006b }
            int r2 = r7.f752c     // Catch:{ all -> 0x006b }
            monitor-enter(r8)     // Catch:{ all -> 0x006b }
            androidx.appcompat.widget.i0 r3 = r8.f803a     // Catch:{ all -> 0x003f }
            android.content.res.ColorStateList r9 = r3.mo3067h(r9, r2)     // Catch:{ all -> 0x003f }
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0042
            r7.mo3029g(r9)     // Catch:{ all -> 0x006b }
            goto L_0x0042
        L_0x003f:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            throw r9     // Catch:{ all -> 0x006b }
        L_0x0042:
            r8 = 1
            boolean r9 = r0.mo3108l(r8)     // Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0052
            android.view.View r9 = r7.f750a     // Catch:{ all -> 0x006b }
            android.content.res.ColorStateList r8 = r0.mo3098b(r8)     // Catch:{ all -> 0x006b }
            androidx.core.view.C2364y.C2373i.m5270q(r9, r8)     // Catch:{ all -> 0x006b }
        L_0x0052:
            r8 = 2
            boolean r9 = r0.mo3108l(r8)     // Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x0067
            android.view.View r9 = r7.f750a     // Catch:{ all -> 0x006b }
            int r8 = r0.mo3104h(r8, r1)     // Catch:{ all -> 0x006b }
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.C0359y.m997d(r8, r1)     // Catch:{ all -> 0x006b }
            androidx.core.view.C2364y.C2373i.m5271r(r9, r8)     // Catch:{ all -> 0x006b }
        L_0x0067:
            r0.mo3109n()
            return
        L_0x006b:
            r8 = move-exception
            r0.mo3109n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0306d.mo3026d(android.util.AttributeSet, int):void");
    }

    /* renamed from: e */
    public final void mo3027e() {
        this.f752c = -1;
        mo3029g((ColorStateList) null);
        mo3023a();
    }

    /* renamed from: f */
    public final void mo3028f(int i) {
        ColorStateList colorStateList;
        this.f752c = i;
        C0317g gVar = this.f751b;
        if (gVar != null) {
            Context context = this.f750a.getContext();
            synchronized (gVar) {
                colorStateList = gVar.f803a.mo3067h(context, i);
            }
        } else {
            colorStateList = null;
        }
        mo3029g(colorStateList);
        mo3023a();
    }

    /* renamed from: g */
    public final void mo3029g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f753d == null) {
                this.f753d = new C0336n0();
            }
            C0336n0 n0Var = this.f753d;
            n0Var.f862a = colorStateList;
            n0Var.f865d = true;
        } else {
            this.f753d = null;
        }
        mo3023a();
    }

    /* renamed from: h */
    public final void mo3030h(ColorStateList colorStateList) {
        if (this.f754e == null) {
            this.f754e = new C0336n0();
        }
        C0336n0 n0Var = this.f754e;
        n0Var.f862a = colorStateList;
        n0Var.f865d = true;
        mo3023a();
    }

    /* renamed from: i */
    public final void mo3031i(PorterDuff.Mode mode) {
        if (this.f754e == null) {
            this.f754e = new C0336n0();
        }
        C0336n0 n0Var = this.f754e;
        n0Var.f863b = mode;
        n0Var.f864c = true;
        mo3023a();
    }
}
