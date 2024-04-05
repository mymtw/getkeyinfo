package com.airbnb.paris.typed_array_wrappers;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.C19383o;
import p280x0.C8292f;

/* renamed from: com.airbnb.paris.typed_array_wrappers.b */
public final class C4869b extends C4870c {

    /* renamed from: b */
    public final Context f11073b;

    /* renamed from: c */
    public final TypedArray f11074c;

    public C4869b(Context context, TypedArray typedArray) {
        this.f11073b = context;
        this.f11074c = typedArray;
    }

    /* renamed from: a */
    public final boolean mo14758a(int i) {
        return this.f11074c.getBoolean(i, false);
    }

    /* renamed from: b */
    public final ColorStateList mo14759b(int i) {
        if (mo14791q(i)) {
            return null;
        }
        return this.f11074c.getColorStateList(i);
    }

    /* renamed from: c */
    public final int mo14760c(int i) {
        return this.f11074c.getDimensionPixelSize(i, -1);
    }

    /* renamed from: d */
    public final Drawable mo14761d(int i) {
        if (mo14791q(i)) {
            return null;
        }
        return this.f11074c.getDrawable(i);
    }

    /* renamed from: e */
    public final float mo14762e(int i) {
        return this.f11074c.getFloat(i, -1.0f);
    }

    /* renamed from: f */
    public final Typeface mo14763f() {
        if (mo14791q(24)) {
            return null;
        }
        int resourceId = this.f11074c.getResourceId(24, 0);
        if (resourceId == 0) {
            return Typeface.create(this.f11074c.getString(24), 0);
        }
        Context context = this.f11073b;
        C19383o.m32798h(context, "$this$getFont");
        return C8292f.m16582a(context, resourceId);
    }

    /* renamed from: g */
    public final int mo14764g(int i) {
        return this.f11074c.getIndex(i);
    }

    /* renamed from: h */
    public final int mo14765h() {
        return this.f11074c.getIndexCount();
    }

    /* renamed from: i */
    public final int mo14766i(int i) {
        return this.f11074c.getInt(i, -1);
    }

    /* renamed from: j */
    public final int mo14767j(int i) {
        return this.f11074c.getLayoutDimension(i, -1);
    }

    /* renamed from: k */
    public final int mo14768k(int i) {
        if (mo14791q(i)) {
            return 0;
        }
        return this.f11074c.getResourceId(i, 0);
    }

    /* renamed from: l */
    public final String mo14769l(int i) {
        if (mo14791q(i)) {
            return null;
        }
        return this.f11074c.getString(i);
    }

    /* renamed from: m */
    public final CharSequence mo14770m(int i) {
        if (mo14791q(i)) {
            return null;
        }
        return this.f11074c.getText(i);
    }

    /* renamed from: n */
    public final boolean mo14771n(int i) {
        return this.f11074c.hasValue(i);
    }

    /* renamed from: p */
    public final void mo14772p() {
        this.f11074c.recycle();
    }

    /* renamed from: q */
    public final boolean mo14791q(int i) {
        return C4870c.m10570o(this.f11074c.getResourceId(i, 0));
    }
}
