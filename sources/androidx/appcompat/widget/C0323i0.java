package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0317g;
import com.etsy.android.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p193o.C7498f;
import p193o.C7499g;
import p193o.C7507j;

/* renamed from: androidx.appcompat.widget.i0 */
public final class C0323i0 {

    /* renamed from: f */
    public static final PorterDuff.Mode f814f = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    public static C0323i0 f815g;

    /* renamed from: h */
    public static final C0324a f816h = new C0324a();

    /* renamed from: a */
    public WeakHashMap<Context, C7507j<ColorStateList>> f817a;

    /* renamed from: b */
    public final WeakHashMap<Context, C7498f<WeakReference<Drawable.ConstantState>>> f818b = new WeakHashMap<>(0);

    /* renamed from: c */
    public TypedValue f819c;

    /* renamed from: d */
    public boolean f820d;

    /* renamed from: e */
    public C0325b f821e;

    /* renamed from: androidx.appcompat.widget.i0$a */
    public static class C0324a extends C7499g<Integer, PorterDuffColorFilter> {
        public C0324a() {
            super(6);
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$b */
    public interface C0325b {
    }

    /* renamed from: c */
    public static synchronized C0323i0 m848c() {
        C0323i0 i0Var;
        synchronized (C0323i0.class) {
            if (f815g == null) {
                f815g = new C0323i0();
            }
            i0Var = f815g;
        }
        return i0Var;
    }

    /* renamed from: g */
    public static synchronized PorterDuffColorFilter m849g(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0323i0.class) {
            C0324a aVar = f816h;
            aVar.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) aVar.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                aVar.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) aVar.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    public final synchronized void mo3062a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C7498f fVar = this.f818b.get(context);
            if (fVar == null) {
                fVar = new C7498f();
                this.f818b.put(context, fVar);
            }
            fVar.mo19890h(j, new WeakReference(constantState));
        }
    }

    /* renamed from: b */
    public final Drawable mo3063b(Context context, int i) {
        if (this.f819c == null) {
            this.f819c = new TypedValue();
        }
        TypedValue typedValue = this.f819c;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d = mo3064d(context, j);
        if (d != null) {
            return d;
        }
        LayerDrawable layerDrawable = null;
        if (this.f821e != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{mo3065e(context, R.drawable.abc_cab_background_internal_bg), mo3065e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawable = C0317g.C0318a.m827c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = C0317g.C0318a.m827c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = C0317g.C0318a.m827c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            mo3062a(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f16722d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo3064d(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f818b     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            o.f r0 = (p193o.C7498f) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo19889f(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f16721c     // Catch:{ all -> 0x0041 }
            int r2 = r0.f16723e     // Catch:{ all -> 0x0041 }
            int r4 = p173m.C7279a.m13947e(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f16722d     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = p193o.C7498f.f16719f     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f16720b = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0323i0.mo3064d(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    public final synchronized Drawable mo3065e(Context context, int i) {
        return mo3066f(context, i, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo3066f(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f820d     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f820d = r0     // Catch:{ all -> 0x004a }
            r1 = 2131230929(0x7f0800d1, float:1.8077925E38)
            android.graphics.drawable.Drawable r1 = r4.mo3065e(r5, r1)     // Catch:{ all -> 0x004a }
            r2 = 0
            if (r1 == 0) goto L_0x004c
            boolean r3 = r1 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x004a }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r2
        L_0x0029:
            if (r0 == 0) goto L_0x004c
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.mo3068i(r5, r6)     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.mo3063b(r5, r6)     // Catch:{ all -> 0x004a }
        L_0x0035:
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = p260v0.C8184a.f17966a     // Catch:{ all -> 0x004a }
            android.graphics.drawable.Drawable r0 = p260v0.C8184a.C8187c.m16466b(r5, r6)     // Catch:{ all -> 0x004a }
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r0 = r4.mo3069j(r5, r6, r7, r0)     // Catch:{ all -> 0x004a }
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            androidx.appcompat.widget.C0359y.m995b(r0)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return r0
        L_0x004a:
            r5 = move-exception
            goto L_0x0056
        L_0x004c:
            r4.f820d = r2     // Catch:{ all -> 0x004a }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ all -> 0x004a }
        L_0x0056:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0323i0.mo3066f(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList mo3067h(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, o.j<android.content.res.ColorStateList>> r0 = r3.f817a     // Catch:{ all -> 0x0015 }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            o.j r0 = (p193o.C7507j) r0     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.mo19993f(r5, r1)     // Catch:{ all -> 0x0015 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r4 = move-exception
            goto L_0x004c
        L_0x0017:
            r0 = r1
        L_0x0018:
            if (r0 != 0) goto L_0x004a
            androidx.appcompat.widget.i0$b r0 = r3.f821e     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0025
        L_0x001f:
            androidx.appcompat.widget.g$a r0 = (androidx.appcompat.widget.C0317g.C0318a) r0     // Catch:{ all -> 0x0015 }
            android.content.res.ColorStateList r1 = r0.mo3052d(r4, r5)     // Catch:{ all -> 0x0015 }
        L_0x0025:
            if (r1 == 0) goto L_0x0049
            java.util.WeakHashMap<android.content.Context, o.j<android.content.res.ColorStateList>> r0 = r3.f817a     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0032
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            r3.f817a = r0     // Catch:{ all -> 0x0015 }
        L_0x0032:
            java.util.WeakHashMap<android.content.Context, o.j<android.content.res.ColorStateList>> r0 = r3.f817a     // Catch:{ all -> 0x0015 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0015 }
            o.j r0 = (p193o.C7507j) r0     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0046
            o.j r0 = new o.j     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            java.util.WeakHashMap<android.content.Context, o.j<android.content.res.ColorStateList>> r2 = r3.f817a     // Catch:{ all -> 0x0015 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0015 }
        L_0x0046:
            r0.mo19988a(r5, r1)     // Catch:{ all -> 0x0015 }
        L_0x0049:
            r0 = r1
        L_0x004a:
            monitor-exit(r3)
            return r0
        L_0x004c:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0323i0.mo3067h(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: i */
    public final Drawable mo3068i(Context context, int i) {
        return null;
    }

    /* renamed from: j */
    public final Drawable mo3069j(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList h = mo3067h(context, i);
        PorterDuff.Mode mode = null;
        if (h != null) {
            if (C0359y.m994a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(h);
            if (this.f821e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        if (this.f821e != null) {
            boolean z2 = true;
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c = C0334m0.m884c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0317g.f801b;
                C0317g.C0318a.m828e(findDrawableByLayerId, c, mode2);
                C0317g.C0318a.m828e(layerDrawable.findDrawableByLayerId(16908303), C0334m0.m884c(context, R.attr.colorControlNormal), mode2);
                C0317g.C0318a.m828e(layerDrawable.findDrawableByLayerId(16908301), C0334m0.m884c(context, R.attr.colorControlActivated), mode2);
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b = C0334m0.m883b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0317g.f801b;
                C0317g.C0318a.m828e(findDrawableByLayerId2, b, mode3);
                C0317g.C0318a.m828e(layerDrawable2.findDrawableByLayerId(16908303), C0334m0.m884c(context, R.attr.colorControlActivated), mode3);
                C0317g.C0318a.m828e(layerDrawable2.findDrawableByLayerId(16908301), C0334m0.m884c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (mo3070k(i, context, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3070k(int r8, android.content.Context r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.i0$b r0 = r7.f821e
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006f
            androidx.appcompat.widget.g$a r0 = (androidx.appcompat.widget.C0317g.C0318a) r0
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.C0317g.f801b
            int[] r4 = r0.f804a
            boolean r4 = androidx.appcompat.widget.C0317g.C0318a.m825a(r8, r4)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001a
            r5 = 2130969045(0x7f0401d5, float:1.754676E38)
            goto L_0x0046
        L_0x001a:
            int[] r4 = r0.f806c
            boolean r4 = androidx.appcompat.widget.C0317g.C0318a.m825a(r8, r4)
            if (r4 == 0) goto L_0x0026
            r5 = 2130969043(0x7f0401d3, float:1.7546757E38)
            goto L_0x0046
        L_0x0026:
            int[] r0 = r0.f807d
            boolean r0 = androidx.appcompat.widget.C0317g.C0318a.m825a(r8, r0)
            if (r0 == 0) goto L_0x0031
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0046
        L_0x0031:
            r0 = 2131230888(0x7f0800a8, float:1.8077841E38)
            if (r8 != r0) goto L_0x0041
            r8 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x0048
        L_0x0041:
            r0 = 2131230868(0x7f080094, float:1.80778E38)
            if (r8 != r0) goto L_0x004a
        L_0x0046:
            r8 = r5
            r0 = r6
        L_0x0048:
            r4 = r1
            goto L_0x004d
        L_0x004a:
            r8 = r2
            r4 = r8
            r0 = r6
        L_0x004d:
            if (r4 == 0) goto L_0x006b
            boolean r4 = androidx.appcompat.widget.C0359y.m994a(r10)
            if (r4 == 0) goto L_0x0059
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x0059:
            int r8 = androidx.appcompat.widget.C0334m0.m884c(r9, r8)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.C0317g.m821c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x0069
            r10.setAlpha(r0)
        L_0x0069:
            r8 = r1
            goto L_0x006c
        L_0x006b:
            r8 = r2
        L_0x006c:
            if (r8 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r1 = r2
        L_0x0070:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0323i0.mo3070k(int, android.content.Context, android.graphics.drawable.Drawable):boolean");
    }
}
