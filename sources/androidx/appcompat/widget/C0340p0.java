package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0343r;
import p280x0.C8292f;

/* renamed from: androidx.appcompat.widget.p0 */
public final class C0340p0 {

    /* renamed from: a */
    public final Context f875a;

    /* renamed from: b */
    public final TypedArray f876b;

    /* renamed from: c */
    public TypedValue f877c;

    public C0340p0(Context context, TypedArray typedArray) {
        this.f875a = context;
        this.f876b = typedArray;
    }

    /* renamed from: m */
    public static C0340p0 m891m(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0340p0(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: a */
    public final boolean mo3097a(int i, boolean z) {
        return this.f876b.getBoolean(i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = p260v0.C8184a.m16459b(r2.f875a, (r0 = r2.f876b.getResourceId(r3, 0)));
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.ColorStateList mo3098b(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f876b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f876b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f875a
            android.content.res.ColorStateList r0 = p260v0.C8184a.m16459b(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f876b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0340p0.mo3098b(int):android.content.res.ColorStateList");
    }

    /* renamed from: c */
    public final int mo3099c(int i, int i2) {
        return this.f876b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public final int mo3100d(int i, int i2) {
        return this.f876b.getDimensionPixelSize(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f876b.getResourceId(r3, 0);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo3101e(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f876b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f876b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f875a
            android.graphics.drawable.Drawable r3 = p075d.C6614a.m12981a(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f876b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0340p0.mo3101e(int):android.graphics.drawable.Drawable");
    }

    /* renamed from: f */
    public final Drawable mo3102f(int i) {
        int resourceId;
        Drawable f;
        if (!this.f876b.hasValue(i) || (resourceId = this.f876b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0317g a = C0317g.m820a();
        Context context = this.f875a;
        synchronized (a) {
            f = a.f803a.mo3066f(context, resourceId, true);
        }
        return f;
    }

    /* renamed from: g */
    public final Typeface mo3103g(int i, int i2, C0343r.C0344a aVar) {
        int resourceId = this.f876b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f877c == null) {
            this.f877c = new TypedValue();
        }
        Context context = this.f875a;
        TypedValue typedValue = this.f877c;
        ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
        if (context.isRestricted()) {
            return null;
        }
        return C8292f.m16583b(context, resourceId, typedValue, i2, aVar, true, false);
    }

    /* renamed from: h */
    public final int mo3104h(int i, int i2) {
        return this.f876b.getInt(i, i2);
    }

    /* renamed from: i */
    public final int mo3105i(int i, int i2) {
        return this.f876b.getResourceId(i, i2);
    }

    /* renamed from: j */
    public final String mo3106j(int i) {
        return this.f876b.getString(i);
    }

    /* renamed from: k */
    public final CharSequence mo3107k(int i) {
        return this.f876b.getText(i);
    }

    /* renamed from: l */
    public final boolean mo3108l(int i) {
        return this.f876b.hasValue(i);
    }

    /* renamed from: n */
    public final void mo3109n() {
        this.f876b.recycle();
    }
}
