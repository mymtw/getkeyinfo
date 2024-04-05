package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: androidx.appcompat.widget.f */
public final class C0310f {

    /* renamed from: a */
    public final CompoundButton f763a;

    /* renamed from: b */
    public ColorStateList f764b = null;

    /* renamed from: c */
    public PorterDuff.Mode f765c = null;

    /* renamed from: d */
    public boolean f766d = false;

    /* renamed from: e */
    public boolean f767e = false;

    /* renamed from: f */
    public boolean f768f;

    public C0310f(CompoundButton compoundButton) {
        this.f763a = compoundButton;
    }

    /* renamed from: a */
    public final void mo3035a() {
        Drawable buttonDrawable = this.f763a.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.f766d || this.f767e) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.f766d) {
                mutate.setTintList(this.f764b);
            }
            if (this.f767e) {
                mutate.setTintMode(this.f765c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f763a.getDrawableState());
            }
            this.f763a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038 A[SYNTHETIC, Splitter:B:11:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ all -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[Catch:{ all -> 0x007b }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3036b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.widget.CompoundButton r0 = r7.f763a
            android.content.Context r0 = r0.getContext()
            int[] r3 = p628nj.C18263b.f40083t
            androidx.appcompat.widget.p0 r0 = androidx.appcompat.widget.C0340p0.m891m(r0, r8, r3, r9)
            android.widget.CompoundButton r1 = r7.f763a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f876b
            r4 = r8
            r6 = r9
            androidx.core.view.C2364y.m5200o(r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r9 = r0.mo3108l(r8)     // Catch:{ all -> 0x007b }
            r1 = 0
            if (r9 == 0) goto L_0x0035
            int r9 = r0.mo3105i(r8, r1)     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0035
            android.widget.CompoundButton r2 = r7.f763a     // Catch:{ NotFoundException -> 0x0035 }
            android.content.Context r3 = r2.getContext()     // Catch:{ NotFoundException -> 0x0035 }
            android.graphics.drawable.Drawable r9 = p075d.C6614a.m12981a(r3, r9)     // Catch:{ NotFoundException -> 0x0035 }
            r2.setButtonDrawable(r9)     // Catch:{ NotFoundException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r8 = r1
        L_0x0036:
            if (r8 != 0) goto L_0x0051
            boolean r8 = r0.mo3108l(r1)     // Catch:{ all -> 0x007b }
            if (r8 == 0) goto L_0x0051
            int r8 = r0.mo3105i(r1, r1)     // Catch:{ all -> 0x007b }
            if (r8 == 0) goto L_0x0051
            android.widget.CompoundButton r9 = r7.f763a     // Catch:{ all -> 0x007b }
            android.content.Context r1 = r9.getContext()     // Catch:{ all -> 0x007b }
            android.graphics.drawable.Drawable r8 = p075d.C6614a.m12981a(r1, r8)     // Catch:{ all -> 0x007b }
            r9.setButtonDrawable(r8)     // Catch:{ all -> 0x007b }
        L_0x0051:
            r8 = 2
            boolean r9 = r0.mo3108l(r8)     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0061
            android.widget.CompoundButton r9 = r7.f763a     // Catch:{ all -> 0x007b }
            android.content.res.ColorStateList r8 = r0.mo3098b(r8)     // Catch:{ all -> 0x007b }
            r9.setButtonTintList(r8)     // Catch:{ all -> 0x007b }
        L_0x0061:
            r8 = 3
            boolean r9 = r0.mo3108l(r8)     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0077
            android.widget.CompoundButton r9 = r7.f763a     // Catch:{ all -> 0x007b }
            r1 = -1
            int r8 = r0.mo3104h(r8, r1)     // Catch:{ all -> 0x007b }
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.C0359y.m997d(r8, r1)     // Catch:{ all -> 0x007b }
            r9.setButtonTintMode(r8)     // Catch:{ all -> 0x007b }
        L_0x0077:
            r0.mo3109n()
            return
        L_0x007b:
            r8 = move-exception
            r0.mo3109n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0310f.mo3036b(android.util.AttributeSet, int):void");
    }
}
