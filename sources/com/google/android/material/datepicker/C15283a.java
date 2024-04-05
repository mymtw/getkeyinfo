package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p001a0.C0005b;
import p507al.C14025c;
import p550dl.C17575a;
import p610kp.C18161c;

/* renamed from: com.google.android.material.datepicker.a */
public final class C15283a {

    /* renamed from: a */
    public final Rect f34253a;

    /* renamed from: b */
    public final ColorStateList f34254b;

    /* renamed from: c */
    public final ColorStateList f34255c;

    /* renamed from: d */
    public final ColorStateList f34256d;

    /* renamed from: e */
    public final int f34257e;

    /* renamed from: f */
    public final C15401a f34258f;

    public C15283a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C15401a aVar, Rect rect) {
        C0005b.m22P(rect.left);
        C0005b.m22P(rect.top);
        C0005b.m22P(rect.right);
        C0005b.m22P(rect.bottom);
        this.f34253a = rect;
        this.f34254b = colorStateList2;
        this.f34255c = colorStateList;
        this.f34256d = colorStateList3;
        this.f34257e = i;
        this.f34258f = aVar;
    }

    /* renamed from: a */
    public static C15283a m24834a(Context context, int i) {
        C0005b.m20N(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C18161c.f39662E);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a = C14025c.m21582a(context, obtainStyledAttributes, 4);
        ColorStateList a2 = C14025c.m21582a(context, obtainStyledAttributes, 9);
        ColorStateList a3 = C14025c.m21582a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C15401a aVar = new C15401a(C15401a.m24980a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C17575a((float) 0)));
        obtainStyledAttributes.recycle();
        return new C15283a(a, a2, a3, dimensionPixelSize, aVar, rect);
    }

    /* renamed from: b */
    public final void mo53854b(TextView textView) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable();
        materialShapeDrawable.setShapeAppearanceModel(this.f34258f);
        materialShapeDrawable2.setShapeAppearanceModel(this.f34258f);
        materialShapeDrawable.setFillColor(this.f34255c);
        materialShapeDrawable.setStroke((float) this.f34257e, this.f34256d);
        textView.setTextColor(this.f34254b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f34254b.withAlpha(30), materialShapeDrawable, materialShapeDrawable2);
        Rect rect = this.f34253a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5227q(textView, insetDrawable);
    }
}
