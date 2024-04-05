package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p515bl.C14091a;
import p550dl.C17585k;

/* renamed from: com.google.android.material.button.a */
public final class C15239a {

    /* renamed from: a */
    public final MaterialButton f34173a;

    /* renamed from: b */
    public C15401a f34174b;

    /* renamed from: c */
    public int f34175c;

    /* renamed from: d */
    public int f34176d;

    /* renamed from: e */
    public int f34177e;

    /* renamed from: f */
    public int f34178f;

    /* renamed from: g */
    public int f34179g;

    /* renamed from: h */
    public int f34180h;

    /* renamed from: i */
    public PorterDuff.Mode f34181i;

    /* renamed from: j */
    public ColorStateList f34182j;

    /* renamed from: k */
    public ColorStateList f34183k;

    /* renamed from: l */
    public ColorStateList f34184l;

    /* renamed from: m */
    public MaterialShapeDrawable f34185m;

    /* renamed from: n */
    public boolean f34186n = false;

    /* renamed from: o */
    public boolean f34187o = false;

    /* renamed from: p */
    public boolean f34188p = false;

    /* renamed from: q */
    public boolean f34189q;

    /* renamed from: r */
    public RippleDrawable f34190r;

    /* renamed from: s */
    public int f34191s;

    public C15239a(MaterialButton materialButton, C15401a aVar) {
        this.f34173a = materialButton;
        this.f34174b = aVar;
    }

    /* renamed from: a */
    public final C17585k mo53321a() {
        RippleDrawable rippleDrawable = this.f34190r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f34190r.getNumberOfLayers() > 2 ? (C17585k) this.f34190r.getDrawable(2) : (C17585k) this.f34190r.getDrawable(1);
    }

    /* renamed from: b */
    public final MaterialShapeDrawable mo53322b(boolean z) {
        RippleDrawable rippleDrawable = this.f34190r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.f34190r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: c */
    public final void mo53323c(C15401a aVar) {
        this.f34174b = aVar;
        if (mo53322b(false) != null) {
            mo53322b(false).setShapeAppearanceModel(aVar);
        }
        if (mo53322b(true) != null) {
            mo53322b(true).setShapeAppearanceModel(aVar);
        }
        if (mo53321a() != null) {
            mo53321a().setShapeAppearanceModel(aVar);
        }
    }

    /* renamed from: d */
    public final void mo53324d(int i, int i2) {
        MaterialButton materialButton = this.f34173a;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int f = C2364y.C2369e.m5235f(materialButton);
        int paddingTop = this.f34173a.getPaddingTop();
        int e = C2364y.C2369e.m5234e(this.f34173a);
        int paddingBottom = this.f34173a.getPaddingBottom();
        int i3 = this.f34177e;
        int i4 = this.f34178f;
        this.f34178f = i2;
        this.f34177e = i;
        if (!this.f34187o) {
            mo53325e();
        }
        C2364y.C2369e.m5240k(this.f34173a, f, (paddingTop + i) - i3, e, (paddingBottom + i2) - i4);
    }

    /* renamed from: e */
    public final void mo53325e() {
        MaterialButton materialButton = this.f34173a;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.f34174b);
        materialShapeDrawable.initializeElevationOverlay(this.f34173a.getContext());
        materialShapeDrawable.setTintList(this.f34182j);
        PorterDuff.Mode mode = this.f34181i;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.setStroke((float) this.f34180h, this.f34183k);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.f34174b);
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke((float) this.f34180h, this.f34186n ? C1993m.m4344E(R.attr.colorSurface, this.f34173a) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.f34174b);
        this.f34185m = materialShapeDrawable3;
        materialShapeDrawable3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(C14091a.m21809c(this.f34184l), new InsetDrawable(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.f34175c, this.f34177e, this.f34176d, this.f34178f), this.f34185m);
        this.f34190r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        MaterialShapeDrawable b = mo53322b(false);
        if (b != null) {
            b.setElevation((float) this.f34191s);
        }
    }

    /* renamed from: f */
    public final void mo53326f() {
        int i = 0;
        MaterialShapeDrawable b = mo53322b(false);
        MaterialShapeDrawable b2 = mo53322b(true);
        if (b != null) {
            b.setStroke((float) this.f34180h, this.f34183k);
            if (b2 != null) {
                float f = (float) this.f34180h;
                if (this.f34186n) {
                    i = C1993m.m4344E(R.attr.colorSurface, this.f34173a);
                }
                b2.setStroke(f, i);
            }
        }
    }
}
