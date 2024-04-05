package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.support.p013v4.media.C0072d;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.core.widget.C2396a;
import androidx.core.widget.C2404h;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;
import p003a2.C0015b;
import p280x0.C8292f;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.r */
public final class C0343r {

    /* renamed from: a */
    public final TextView f880a;

    /* renamed from: b */
    public C0336n0 f881b;

    /* renamed from: c */
    public C0336n0 f882c;

    /* renamed from: d */
    public C0336n0 f883d;

    /* renamed from: e */
    public C0336n0 f884e;

    /* renamed from: f */
    public C0336n0 f885f;

    /* renamed from: g */
    public C0336n0 f886g;

    /* renamed from: h */
    public C0336n0 f887h;

    /* renamed from: i */
    public final C0349t f888i;

    /* renamed from: j */
    public int f889j = 0;

    /* renamed from: k */
    public int f890k = -1;

    /* renamed from: l */
    public Typeface f891l;

    /* renamed from: m */
    public boolean f892m;

    /* renamed from: androidx.appcompat.widget.r$a */
    public class C0344a extends C8292f.C8295c {

        /* renamed from: a */
        public final /* synthetic */ int f893a;

        /* renamed from: b */
        public final /* synthetic */ int f894b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f895c;

        public C0344a(int i, int i2, WeakReference weakReference) {
            this.f893a = i;
            this.f894b = i2;
            this.f895c = weakReference;
        }

        /* renamed from: c */
        public final void mo3119c(int i) {
        }

        /* renamed from: d */
        public final void mo3120d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f893a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f894b & 2) != 0);
            }
            C0343r rVar = C0343r.this;
            WeakReference weakReference = this.f895c;
            if (rVar.f892m) {
                rVar.f891l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    if (C2364y.C2371g.m5245b(textView)) {
                        textView.post(new C0346s(textView, typeface, rVar.f889j));
                    } else {
                        textView.setTypeface(typeface, rVar.f889j);
                    }
                }
            }
        }
    }

    public C0343r(TextView textView) {
        this.f880a = textView;
        this.f888i = new C0349t(textView);
    }

    /* renamed from: c */
    public static C0336n0 m909c(Context context, C0317g gVar, int i) {
        ColorStateList h;
        synchronized (gVar) {
            h = gVar.f803a.mo3067h(context, i);
        }
        if (h == null) {
            return null;
        }
        C0336n0 n0Var = new C0336n0();
        n0Var.f865d = true;
        n0Var.f862a = h;
        return n0Var;
    }

    /* renamed from: a */
    public final void mo3111a(Drawable drawable, C0336n0 n0Var) {
        if (drawable != null && n0Var != null) {
            C0317g.m823e(drawable, n0Var, this.f880a.getDrawableState());
        }
    }

    /* renamed from: b */
    public final void mo3112b() {
        if (!(this.f881b == null && this.f882c == null && this.f883d == null && this.f884e == null)) {
            Drawable[] compoundDrawables = this.f880a.getCompoundDrawables();
            mo3111a(compoundDrawables[0], this.f881b);
            mo3111a(compoundDrawables[1], this.f882c);
            mo3111a(compoundDrawables[2], this.f883d);
            mo3111a(compoundDrawables[3], this.f884e);
        }
        if (this.f885f != null || this.f886g != null) {
            Drawable[] compoundDrawablesRelative = this.f880a.getCompoundDrawablesRelative();
            mo3111a(compoundDrawablesRelative[0], this.f885f);
            mo3111a(compoundDrawablesRelative[2], this.f886g);
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public final void mo3113d(AttributeSet attributeSet, int i) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int resourceId;
        int i4;
        AttributeSet attributeSet2 = attributeSet;
        int i5 = i;
        Context context = this.f880a.getContext();
        C0317g a = C0317g.m820a();
        int[] iArr = C18263b.f40078o;
        C0340p0 m = C0340p0.m891m(context, attributeSet2, iArr, i5);
        TextView textView = this.f880a;
        C2364y.m5200o(textView, textView.getContext(), iArr, attributeSet, m.f876b, i);
        int i6 = m.mo3105i(0, -1);
        if (m.mo3108l(3)) {
            this.f881b = m909c(context, a, m.mo3105i(3, 0));
        }
        if (m.mo3108l(1)) {
            this.f882c = m909c(context, a, m.mo3105i(1, 0));
        }
        if (m.mo3108l(4)) {
            this.f883d = m909c(context, a, m.mo3105i(4, 0));
        }
        if (m.mo3108l(2)) {
            this.f884e = m909c(context, a, m.mo3105i(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (m.mo3108l(5)) {
            this.f885f = m909c(context, a, m.mo3105i(5, 0));
        }
        if (m.mo3108l(6)) {
            this.f886g = m909c(context, a, m.mo3105i(6, 0));
        }
        m.mo3109n();
        boolean z3 = this.f880a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (i6 != -1) {
            C0340p0 p0Var = new C0340p0(context, context.obtainStyledAttributes(i6, C18263b.f40042F));
            if (z3 || !p0Var.mo3108l(14)) {
                z2 = false;
                z = false;
            } else {
                z2 = p0Var.mo3097a(14, false);
                z = true;
            }
            mo3118i(context, p0Var);
            if (p0Var.mo3108l(15)) {
                str2 = p0Var.mo3106j(15);
                i4 = 13;
            } else {
                i4 = 13;
                str2 = null;
            }
            str = p0Var.mo3108l(i4) ? p0Var.mo3106j(i4) : null;
            p0Var.mo3109n();
        } else {
            z2 = false;
            z = false;
            str2 = null;
            str = null;
        }
        C0340p0 p0Var2 = new C0340p0(context, context.obtainStyledAttributes(attributeSet2, C18263b.f40042F, i5, 0));
        if (!z3 && p0Var2.mo3108l(14)) {
            z2 = p0Var2.mo3097a(14, false);
            z = true;
        }
        if (p0Var2.mo3108l(15)) {
            str2 = p0Var2.mo3106j(15);
        }
        if (p0Var2.mo3108l(13)) {
            str = p0Var2.mo3106j(13);
        }
        String str3 = str;
        if (i7 >= 28 && p0Var2.mo3108l(0) && p0Var2.mo3100d(0, -1) == 0) {
            this.f880a.setTextSize(0, 0.0f);
        }
        mo3118i(context, p0Var2);
        p0Var2.mo3109n();
        if (!z3 && z) {
            this.f880a.setAllCaps(z2);
        }
        Typeface typeface = this.f891l;
        if (typeface != null) {
            if (this.f890k == -1) {
                this.f880a.setTypeface(typeface, this.f889j);
            } else {
                this.f880a.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            this.f880a.setFontVariationSettings(str3);
        }
        if (str2 != null) {
            this.f880a.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        C0349t tVar = this.f888i;
        Context context2 = tVar.f932j;
        int[] iArr2 = C18263b.f40079p;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr2, i5, 0);
        TextView textView2 = tVar.f931i;
        TypedArray typedArray = obtainStyledAttributes;
        C2364y.m5200o(textView2, textView2.getContext(), iArr2, attributeSet, obtainStyledAttributes, i);
        if (typedArray.hasValue(5)) {
            tVar.f923a = typedArray.getInt(5, 0);
        }
        float dimension = typedArray.hasValue(4) ? typedArray.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArray.hasValue(2) ? typedArray.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArray.hasValue(1) ? typedArray.getDimension(1, -1.0f) : -1.0f;
        if (typedArray.hasValue(3) && (resourceId = typedArray.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = typedArray.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr3[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                tVar.f928f = C0349t.m947b(iArr3);
                tVar.mo3167h();
            }
            obtainTypedArray.recycle();
        }
        typedArray.recycle();
        if (!tVar.mo3168i()) {
            tVar.f923a = 0;
        } else if (tVar.f923a == 1) {
            if (!tVar.f929g) {
                DisplayMetrics displayMetrics = tVar.f932j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                tVar.mo3169j(dimension2, dimension3, dimension);
            }
            tVar.mo3166g();
        }
        if (C2396a.f5676d0) {
            C0349t tVar2 = this.f888i;
            if (tVar2.f923a != 0) {
                int[] iArr4 = tVar2.f928f;
                if (iArr4.length > 0) {
                    if (((float) this.f880a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f880a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f888i.f926d), Math.round(this.f888i.f927e), Math.round(this.f888i.f925c), 0);
                    } else {
                        this.f880a.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                    }
                }
            }
        }
        C0340p0 p0Var3 = new C0340p0(context, context.obtainStyledAttributes(attributeSet2, C18263b.f40079p));
        int i9 = p0Var3.mo3105i(8, -1);
        Drawable b = i9 != -1 ? a.mo3051b(context, i9) : null;
        int i10 = p0Var3.mo3105i(13, -1);
        Drawable b2 = i10 != -1 ? a.mo3051b(context, i10) : null;
        int i11 = p0Var3.mo3105i(9, -1);
        Drawable b3 = i11 != -1 ? a.mo3051b(context, i11) : null;
        int i12 = p0Var3.mo3105i(6, -1);
        Drawable b4 = i12 != -1 ? a.mo3051b(context, i12) : null;
        int i13 = p0Var3.mo3105i(10, -1);
        Drawable b5 = i13 != -1 ? a.mo3051b(context, i13) : null;
        int i14 = p0Var3.mo3105i(7, -1);
        Drawable b6 = i14 != -1 ? a.mo3051b(context, i14) : null;
        if (b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative = this.f880a.getCompoundDrawablesRelative();
            TextView textView3 = this.f880a;
            if (b5 == null) {
                b5 = compoundDrawablesRelative[0];
            }
            if (b2 == null) {
                b2 = compoundDrawablesRelative[1];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[2];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
        } else if (!(b == null && b2 == null && b3 == null && b4 == null)) {
            Drawable[] compoundDrawablesRelative2 = this.f880a.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f880a.getCompoundDrawables();
                TextView textView4 = this.f880a;
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                TextView textView5 = this.f880a;
                if (b2 == null) {
                    b2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b2, drawable2, b4);
            }
        }
        if (p0Var3.mo3108l(11)) {
            ColorStateList b7 = p0Var3.mo3098b(11);
            TextView textView6 = this.f880a;
            textView6.getClass();
            textView6.setCompoundDrawableTintList(b7);
        }
        if (p0Var3.mo3108l(12)) {
            i2 = -1;
            PorterDuff.Mode d = C0359y.m997d(p0Var3.mo3104h(12, -1), (PorterDuff.Mode) null);
            TextView textView7 = this.f880a;
            textView7.getClass();
            textView7.setCompoundDrawableTintMode(d);
        } else {
            i2 = -1;
        }
        int d2 = p0Var3.mo3100d(15, i2);
        int d3 = p0Var3.mo3100d(18, i2);
        int d4 = p0Var3.mo3100d(19, i2);
        p0Var3.mo3109n();
        if (d2 != i2) {
            C2404h.m5360b(this.f880a, d2);
        }
        if (d3 != i2) {
            C2404h.m5361c(this.f880a, d3);
        }
        if (d4 != i2) {
            C2404h.m5362d(this.f880a, d4);
        }
    }

    /* renamed from: e */
    public final void mo3114e(Context context, int i) {
        String j;
        C0340p0 p0Var = new C0340p0(context, context.obtainStyledAttributes(i, C18263b.f40042F));
        if (p0Var.mo3108l(14)) {
            this.f880a.setAllCaps(p0Var.mo3097a(14, false));
        }
        if (p0Var.mo3108l(0) && p0Var.mo3100d(0, -1) == 0) {
            this.f880a.setTextSize(0, 0.0f);
        }
        mo3118i(context, p0Var);
        if (p0Var.mo3108l(13) && (j = p0Var.mo3106j(13)) != null) {
            this.f880a.setFontVariationSettings(j);
        }
        p0Var.mo3109n();
        Typeface typeface = this.f891l;
        if (typeface != null) {
            this.f880a.setTypeface(typeface, this.f889j);
        }
    }

    /* renamed from: f */
    public final void mo3115f(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C0349t tVar = this.f888i;
        if (tVar.mo3168i()) {
            DisplayMetrics displayMetrics = tVar.f932j.getResources().getDisplayMetrics();
            tVar.mo3169j(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (tVar.mo3166g()) {
                tVar.mo3163a();
            }
        }
    }

    /* renamed from: g */
    public final void mo3116g(int[] iArr, int i) throws IllegalArgumentException {
        C0349t tVar = this.f888i;
        if (tVar.mo3168i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = tVar.f932j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                    }
                }
                tVar.f928f = C0349t.m947b(iArr2);
                if (!tVar.mo3167h()) {
                    StringBuilder h = C0072d.m201h("None of the preset sizes is valid: ");
                    h.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(h.toString());
                }
            } else {
                tVar.f929g = false;
            }
            if (tVar.mo3166g()) {
                tVar.mo3163a();
            }
        }
    }

    /* renamed from: h */
    public final void mo3117h(int i) {
        C0349t tVar = this.f888i;
        if (!tVar.mo3168i()) {
            return;
        }
        if (i == 0) {
            tVar.f923a = 0;
            tVar.f926d = -1.0f;
            tVar.f927e = -1.0f;
            tVar.f925c = -1.0f;
            tVar.f928f = new int[0];
            tVar.f924b = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = tVar.f932j.getResources().getDisplayMetrics();
            tVar.mo3169j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (tVar.mo3166g()) {
                tVar.mo3163a();
            }
        } else {
            throw new IllegalArgumentException(C0015b.m88g("Unknown auto-size text type: ", i));
        }
    }

    /* renamed from: i */
    public final void mo3118i(Context context, C0340p0 p0Var) {
        String j;
        this.f889j = p0Var.mo3104h(2, this.f889j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int h = p0Var.mo3104h(11, -1);
            this.f890k = h;
            if (h != -1) {
                this.f889j = (this.f889j & 2) | 0;
            }
        }
        int i2 = 10;
        if (p0Var.mo3108l(10) || p0Var.mo3108l(12)) {
            this.f891l = null;
            if (p0Var.mo3108l(12)) {
                i2 = 12;
            }
            int i3 = this.f890k;
            int i4 = this.f889j;
            if (!context.isRestricted()) {
                try {
                    Typeface g = p0Var.mo3103g(i2, this.f889j, new C0344a(i3, i4, new WeakReference(this.f880a)));
                    if (g != null) {
                        if (i < 28 || this.f890k == -1) {
                            this.f891l = g;
                        } else {
                            this.f891l = Typeface.create(Typeface.create(g, 0), this.f890k, (this.f889j & 2) != 0);
                        }
                    }
                    this.f892m = this.f891l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f891l == null && (j = p0Var.mo3106j(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f890k == -1) {
                    this.f891l = Typeface.create(j, this.f889j);
                    return;
                }
                Typeface create = Typeface.create(j, 0);
                int i5 = this.f890k;
                if ((this.f889j & 2) != 0) {
                    z = true;
                }
                this.f891l = Typeface.create(create, i5, z);
            }
        } else if (p0Var.mo3108l(1)) {
            this.f892m = false;
            int h2 = p0Var.mo3104h(1, 1);
            if (h2 == 1) {
                this.f891l = Typeface.SANS_SERIF;
            } else if (h2 == 2) {
                this.f891l = Typeface.SERIF;
            } else if (h2 == 3) {
                this.f891l = Typeface.MONOSPACE;
            }
        }
    }
}
