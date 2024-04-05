package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.WeakHashMap;
import p003a2.C0023f;
import p032c1.C4356c;
import p507al.C14022a;
import p507al.C14026d;
import p629nk.C18268a;

/* renamed from: com.google.android.material.internal.a */
public final class C15342a {

    /* renamed from: A */
    public C14022a f34400A;

    /* renamed from: B */
    public C14022a f34401B;

    /* renamed from: C */
    public CharSequence f34402C;

    /* renamed from: D */
    public CharSequence f34403D;

    /* renamed from: E */
    public boolean f34404E;

    /* renamed from: F */
    public boolean f34405F = true;

    /* renamed from: G */
    public Bitmap f34406G;

    /* renamed from: H */
    public float f34407H;

    /* renamed from: I */
    public float f34408I;

    /* renamed from: J */
    public int[] f34409J;

    /* renamed from: K */
    public boolean f34410K;

    /* renamed from: L */
    public final TextPaint f34411L;

    /* renamed from: M */
    public final TextPaint f34412M;

    /* renamed from: N */
    public TimeInterpolator f34413N;

    /* renamed from: O */
    public TimeInterpolator f34414O;

    /* renamed from: P */
    public float f34415P;

    /* renamed from: Q */
    public float f34416Q;

    /* renamed from: R */
    public float f34417R;

    /* renamed from: S */
    public ColorStateList f34418S;

    /* renamed from: T */
    public float f34419T;

    /* renamed from: U */
    public float f34420U;

    /* renamed from: V */
    public float f34421V;

    /* renamed from: W */
    public ColorStateList f34422W;

    /* renamed from: X */
    public float f34423X;

    /* renamed from: Y */
    public float f34424Y;

    /* renamed from: Z */
    public StaticLayout f34425Z;

    /* renamed from: a */
    public final View f34426a;

    /* renamed from: a0 */
    public float f34427a0;

    /* renamed from: b */
    public boolean f34428b;

    /* renamed from: b0 */
    public float f34429b0;

    /* renamed from: c */
    public float f34430c;

    /* renamed from: c0 */
    public float f34431c0;

    /* renamed from: d */
    public boolean f34432d;

    /* renamed from: d0 */
    public float f34433d0;

    /* renamed from: e */
    public float f34434e;

    /* renamed from: e0 */
    public CharSequence f34435e0;

    /* renamed from: f */
    public float f34436f;

    /* renamed from: f0 */
    public int f34437f0 = 1;

    /* renamed from: g */
    public int f34438g;

    /* renamed from: g0 */
    public float f34439g0 = 0.0f;

    /* renamed from: h */
    public final Rect f34440h;

    /* renamed from: h0 */
    public float f34441h0 = 1.0f;

    /* renamed from: i */
    public final Rect f34442i;

    /* renamed from: i0 */
    public int f34443i0 = 1;

    /* renamed from: j */
    public final RectF f34444j;

    /* renamed from: k */
    public int f34445k = 16;

    /* renamed from: l */
    public int f34446l = 16;

    /* renamed from: m */
    public float f34447m = 15.0f;

    /* renamed from: n */
    public float f34448n = 15.0f;

    /* renamed from: o */
    public ColorStateList f34449o;

    /* renamed from: p */
    public ColorStateList f34450p;

    /* renamed from: q */
    public int f34451q;

    /* renamed from: r */
    public float f34452r;

    /* renamed from: s */
    public float f34453s;

    /* renamed from: t */
    public float f34454t;

    /* renamed from: u */
    public float f34455u;

    /* renamed from: v */
    public float f34456v;

    /* renamed from: w */
    public float f34457w;

    /* renamed from: x */
    public Typeface f34458x;

    /* renamed from: y */
    public Typeface f34459y;

    /* renamed from: z */
    public Typeface f34460z;

    /* renamed from: com.google.android.material.internal.a$a */
    public class C15343a implements C14022a.C14023a {
        public C15343a() {
        }

        /* renamed from: a */
        public final void mo46842a(Typeface typeface) {
            C15342a aVar = C15342a.this;
            C14022a aVar2 = aVar.f34401B;
            boolean z = true;
            if (aVar2 != null) {
                aVar2.f30858c = true;
            }
            if (aVar.f34458x != typeface) {
                aVar.f34458x = typeface;
            } else {
                z = false;
            }
            if (z) {
                aVar.mo54185i(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.a$b */
    public class C15344b implements C14022a.C14023a {
        public C15344b() {
        }

        /* renamed from: a */
        public final void mo46842a(Typeface typeface) {
            C15342a aVar = C15342a.this;
            C14022a aVar2 = aVar.f34400A;
            boolean z = true;
            if (aVar2 != null) {
                aVar2.f30858c = true;
            }
            if (aVar.f34459y != typeface) {
                aVar.f34459y = typeface;
            } else {
                z = false;
            }
            if (z) {
                aVar.mo54185i(false);
            }
        }
    }

    public C15342a(View view) {
        this.f34426a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f34411L = textPaint;
        this.f34412M = new TextPaint(textPaint);
        this.f34442i = new Rect();
        this.f34440h = new Rect();
        this.f34444j = new RectF();
        float f = this.f34434e;
        this.f34436f = C0023f.m103b(1.0f, f, 0.5f, f);
    }

    /* renamed from: a */
    public static int m24923a(float f, int i, int i2) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    /* renamed from: g */
    public static float m24924g(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        LinearInterpolator linearInterpolator = C18268a.f40091a;
        return C0023f.m103b(f2, f, f3, f);
    }

    /* renamed from: b */
    public final boolean mo54179b(CharSequence charSequence) {
        View view = this.f34426a;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        boolean z = true;
        if (C2364y.C2369e.m5233d(view) != 1) {
            z = false;
        }
        if (!this.f34405F) {
            return z;
        }
        return (z ? C4356c.f9596d : C4356c.f9595c).mo14301b(charSequence.length(), charSequence);
    }

    /* renamed from: c */
    public final void mo54180c(float f, boolean z) {
        float f2;
        boolean z2;
        StaticLayout staticLayout;
        if (this.f34402C != null) {
            float width = (float) this.f34442i.width();
            float width2 = (float) this.f34440h.width();
            int i = 1;
            if (Math.abs(f - this.f34448n) < 0.001f) {
                f2 = this.f34448n;
                this.f34407H = 1.0f;
                Typeface typeface = this.f34460z;
                Typeface typeface2 = this.f34458x;
                if (typeface != typeface2) {
                    this.f34460z = typeface2;
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                float f3 = this.f34447m;
                Typeface typeface3 = this.f34460z;
                Typeface typeface4 = this.f34459y;
                if (typeface3 != typeface4) {
                    this.f34460z = typeface4;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Math.abs(f - f3) < 0.001f) {
                    this.f34407H = 1.0f;
                } else {
                    this.f34407H = f / this.f34447m;
                }
                float f4 = this.f34448n / this.f34447m;
                width = (!z && width2 * f4 > width) ? Math.min(width / f4, width2) : width2;
                f2 = f3;
            }
            if (width > 0.0f) {
                z2 = this.f34408I != f2 || this.f34410K || z2;
                this.f34408I = f2;
                this.f34410K = false;
            }
            if (this.f34403D == null || z2) {
                this.f34411L.setTextSize(this.f34408I);
                this.f34411L.setTypeface(this.f34460z);
                this.f34411L.setLinearText(this.f34407H != 1.0f);
                boolean b = mo54179b(this.f34402C);
                this.f34404E = b;
                int i2 = this.f34437f0;
                if (i2 > 1 && (!b || this.f34432d)) {
                    i = i2;
                }
                try {
                    StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat((int) width, this.f34402C, this.f34411L);
                    staticLayoutBuilderCompat.f34399l = TextUtils.TruncateAt.END;
                    staticLayoutBuilderCompat.f34398k = b;
                    staticLayoutBuilderCompat.f34392e = Layout.Alignment.ALIGN_NORMAL;
                    staticLayoutBuilderCompat.f34397j = false;
                    staticLayoutBuilderCompat.f34393f = i;
                    float f5 = this.f34439g0;
                    float f6 = this.f34441h0;
                    staticLayoutBuilderCompat.f34394g = f5;
                    staticLayoutBuilderCompat.f34395h = f6;
                    staticLayoutBuilderCompat.f34396i = this.f34443i0;
                    staticLayout = staticLayoutBuilderCompat.mo54174a();
                } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e) {
                    Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                    staticLayout = null;
                }
                staticLayout.getClass();
                this.f34425Z = staticLayout;
                this.f34403D = staticLayout.getText();
            }
        }
    }

    /* renamed from: d */
    public final void mo54181d(Canvas canvas) {
        int save = canvas.save();
        if (this.f34403D != null && this.f34428b) {
            boolean z = true;
            float lineStart = (this.f34456v + (this.f34437f0 > 1 ? (float) this.f34425Z.getLineStart(0) : this.f34425Z.getLineLeft(0))) - (this.f34433d0 * 2.0f);
            this.f34411L.setTextSize(this.f34408I);
            float f = this.f34456v;
            float f2 = this.f34457w;
            float f3 = this.f34407H;
            if (f3 != 1.0f && !this.f34432d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (this.f34437f0 <= 1 || (this.f34404E && !this.f34432d)) {
                z = false;
            }
            if (!z || (this.f34432d && this.f34430c <= this.f34436f)) {
                canvas.translate(f, f2);
                this.f34425Z.draw(canvas);
            } else {
                int alpha = this.f34411L.getAlpha();
                canvas.translate(lineStart, f2);
                float f4 = (float) alpha;
                this.f34411L.setAlpha((int) (this.f34431c0 * f4));
                this.f34425Z.draw(canvas);
                this.f34411L.setAlpha((int) (this.f34429b0 * f4));
                int lineBaseline = this.f34425Z.getLineBaseline(0);
                CharSequence charSequence = this.f34435e0;
                float f5 = (float) lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.f34411L);
                if (!this.f34432d) {
                    String trim = this.f34435e0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    this.f34411L.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f34425Z.getLineEnd(0), str.length()), 0.0f, f5, this.f34411L);
                }
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: e */
    public final float mo54182e() {
        TextPaint textPaint = this.f34412M;
        textPaint.setTextSize(this.f34448n);
        textPaint.setTypeface(this.f34458x);
        textPaint.setLetterSpacing(this.f34423X);
        return -this.f34412M.ascent();
    }

    /* renamed from: f */
    public final int mo54183f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f34409J;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* renamed from: h */
    public final void mo54184h() {
        this.f34428b = this.f34442i.width() > 0 && this.f34442i.height() > 0 && this.f34440h.width() > 0 && this.f34440h.height() > 0;
    }

    /* renamed from: i */
    public final void mo54185i(boolean z) {
        float f;
        StaticLayout staticLayout;
        if ((this.f34426a.getHeight() > 0 && this.f34426a.getWidth() > 0) || z) {
            float f2 = this.f34408I;
            mo54180c(this.f34448n, z);
            CharSequence charSequence = this.f34403D;
            if (!(charSequence == null || (staticLayout = this.f34425Z) == null)) {
                this.f34435e0 = TextUtils.ellipsize(charSequence, this.f34411L, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
            }
            if (this.f34435e0 != null) {
                TextPaint textPaint = new TextPaint(this.f34411L);
                textPaint.setLetterSpacing(this.f34423X);
                CharSequence charSequence2 = this.f34435e0;
                this.f34427a0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f34427a0 = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f34446l, this.f34404E ? 1 : 0);
            int i = absoluteGravity & 112;
            if (i == 48) {
                this.f34453s = (float) this.f34442i.top;
            } else if (i != 80) {
                this.f34453s = ((float) this.f34442i.centerY()) - ((this.f34411L.descent() - this.f34411L.ascent()) / 2.0f);
            } else {
                this.f34453s = this.f34411L.ascent() + ((float) this.f34442i.bottom);
            }
            int i2 = absoluteGravity & 8388615;
            if (i2 == 1) {
                this.f34455u = ((float) this.f34442i.centerX()) - (this.f34427a0 / 2.0f);
            } else if (i2 != 5) {
                this.f34455u = (float) this.f34442i.left;
            } else {
                this.f34455u = ((float) this.f34442i.right) - this.f34427a0;
            }
            mo54180c(this.f34447m, z);
            StaticLayout staticLayout2 = this.f34425Z;
            float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
            StaticLayout staticLayout3 = this.f34425Z;
            this.f34451q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
            CharSequence charSequence3 = this.f34403D;
            float measureText = charSequence3 != null ? this.f34411L.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
            StaticLayout staticLayout4 = this.f34425Z;
            if (staticLayout4 != null && this.f34437f0 > 1) {
                measureText = (float) staticLayout4.getWidth();
            }
            StaticLayout staticLayout5 = this.f34425Z;
            this.f34433d0 = staticLayout5 != null ? this.f34437f0 > 1 ? (float) staticLayout5.getLineStart(0) : staticLayout5.getLineLeft(0) : 0.0f;
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f34445k, this.f34404E ? 1 : 0);
            int i3 = absoluteGravity2 & 112;
            if (i3 == 48) {
                this.f34452r = (float) this.f34440h.top;
            } else if (i3 != 80) {
                this.f34452r = ((float) this.f34440h.centerY()) - (height / 2.0f);
            } else {
                this.f34452r = this.f34411L.descent() + (((float) this.f34440h.bottom) - height);
            }
            int i4 = absoluteGravity2 & 8388615;
            if (i4 == 1) {
                this.f34454t = ((float) this.f34440h.centerX()) - (measureText / 2.0f);
            } else if (i4 != 5) {
                this.f34454t = (float) this.f34440h.left;
            } else {
                this.f34454t = ((float) this.f34440h.right) - measureText;
            }
            Bitmap bitmap = this.f34406G;
            if (bitmap != null) {
                bitmap.recycle();
                this.f34406G = null;
            }
            mo54191o(f2);
            float f3 = this.f34430c;
            if (this.f34432d) {
                this.f34444j.set(f3 < this.f34436f ? this.f34440h : this.f34442i);
            } else {
                this.f34444j.left = m24924g((float) this.f34440h.left, (float) this.f34442i.left, f3, this.f34413N);
                this.f34444j.top = m24924g(this.f34452r, this.f34453s, f3, this.f34413N);
                this.f34444j.right = m24924g((float) this.f34440h.right, (float) this.f34442i.right, f3, this.f34413N);
                this.f34444j.bottom = m24924g((float) this.f34440h.bottom, (float) this.f34442i.bottom, f3, this.f34413N);
            }
            if (!this.f34432d) {
                this.f34456v = m24924g(this.f34454t, this.f34455u, f3, this.f34413N);
                this.f34457w = m24924g(this.f34452r, this.f34453s, f3, this.f34413N);
                mo54191o(m24924g(this.f34447m, this.f34448n, f3, this.f34414O));
                f = f3;
            } else if (f3 < this.f34436f) {
                this.f34456v = this.f34454t;
                this.f34457w = this.f34452r;
                mo54191o(this.f34447m);
                f = 0.0f;
            } else {
                this.f34456v = this.f34455u;
                this.f34457w = this.f34453s - ((float) Math.max(0, this.f34438g));
                mo54191o(this.f34448n);
                f = 1.0f;
            }
            FastOutSlowInInterpolator fastOutSlowInInterpolator = C18268a.f40092b;
            this.f34429b0 = 1.0f - m24924g(0.0f, 1.0f, 1.0f - f3, fastOutSlowInInterpolator);
            View view = this.f34426a;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(view);
            this.f34431c0 = m24924g(1.0f, 0.0f, f3, fastOutSlowInInterpolator);
            C2364y.C2368d.m5221k(this.f34426a);
            ColorStateList colorStateList = this.f34450p;
            ColorStateList colorStateList2 = this.f34449o;
            if (colorStateList != colorStateList2) {
                this.f34411L.setColor(m24923a(f, mo54183f(colorStateList2), mo54183f(this.f34450p)));
            } else {
                this.f34411L.setColor(mo54183f(colorStateList));
            }
            float f4 = this.f34423X;
            float f5 = this.f34424Y;
            if (f4 != f5) {
                this.f34411L.setLetterSpacing(m24924g(f5, f4, f3, fastOutSlowInInterpolator));
            } else {
                this.f34411L.setLetterSpacing(f4);
            }
            this.f34411L.setShadowLayer(m24924g(this.f34419T, this.f34415P, f3, (TimeInterpolator) null), m24924g(this.f34420U, this.f34416Q, f3, (TimeInterpolator) null), m24924g(this.f34421V, this.f34417R, f3, (TimeInterpolator) null), m24923a(f3, mo54183f(this.f34422W), mo54183f(this.f34418S)));
            if (this.f34432d) {
                int alpha = this.f34411L.getAlpha();
                float f6 = this.f34436f;
                this.f34411L.setAlpha((int) ((f3 <= f6 ? C18268a.m30884a(1.0f, 0.0f, this.f34434e, f6, f3) : C18268a.m30884a(0.0f, 1.0f, f6, 1.0f, f3)) * ((float) alpha)));
            }
            C2364y.C2368d.m5221k(this.f34426a);
        }
    }

    /* renamed from: j */
    public final void mo54186j(int i) {
        C14026d dVar = new C14026d(this.f34426a.getContext(), i);
        ColorStateList colorStateList = dVar.f30868j;
        if (colorStateList != null) {
            this.f34450p = colorStateList;
        }
        float f = dVar.f30869k;
        if (f != 0.0f) {
            this.f34448n = f;
        }
        ColorStateList colorStateList2 = dVar.f30859a;
        if (colorStateList2 != null) {
            this.f34418S = colorStateList2;
        }
        this.f34416Q = dVar.f30863e;
        this.f34417R = dVar.f30864f;
        this.f34415P = dVar.f30865g;
        this.f34423X = dVar.f30867i;
        C14022a aVar = this.f34401B;
        if (aVar != null) {
            aVar.f30858c = true;
        }
        C15343a aVar2 = new C15343a();
        dVar.mo46843a();
        this.f34401B = new C14022a(aVar2, dVar.f30872n);
        dVar.mo46845c(this.f34426a.getContext(), this.f34401B);
        mo54185i(false);
    }

    /* renamed from: k */
    public final void mo54187k(ColorStateList colorStateList) {
        if (this.f34450p != colorStateList) {
            this.f34450p = colorStateList;
            mo54185i(false);
        }
    }

    /* renamed from: l */
    public final void mo54188l(int i) {
        if (this.f34446l != i) {
            this.f34446l = i;
            mo54185i(false);
        }
    }

    /* renamed from: m */
    public final void mo54189m(int i) {
        C14026d dVar = new C14026d(this.f34426a.getContext(), i);
        ColorStateList colorStateList = dVar.f30868j;
        if (colorStateList != null) {
            this.f34449o = colorStateList;
        }
        float f = dVar.f30869k;
        if (f != 0.0f) {
            this.f34447m = f;
        }
        ColorStateList colorStateList2 = dVar.f30859a;
        if (colorStateList2 != null) {
            this.f34422W = colorStateList2;
        }
        this.f34420U = dVar.f30863e;
        this.f34421V = dVar.f30864f;
        this.f34419T = dVar.f30865g;
        this.f34424Y = dVar.f30867i;
        C14022a aVar = this.f34400A;
        if (aVar != null) {
            aVar.f30858c = true;
        }
        C15344b bVar = new C15344b();
        dVar.mo46843a();
        this.f34400A = new C14022a(bVar, dVar.f30872n);
        dVar.mo46845c(this.f34426a.getContext(), this.f34400A);
        mo54185i(false);
    }

    /* renamed from: n */
    public final void mo54190n(float f) {
        float f2;
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.f34430c) {
            this.f34430c = f;
            if (this.f34432d) {
                this.f34444j.set(f < this.f34436f ? this.f34440h : this.f34442i);
            } else {
                this.f34444j.left = m24924g((float) this.f34440h.left, (float) this.f34442i.left, f, this.f34413N);
                this.f34444j.top = m24924g(this.f34452r, this.f34453s, f, this.f34413N);
                this.f34444j.right = m24924g((float) this.f34440h.right, (float) this.f34442i.right, f, this.f34413N);
                this.f34444j.bottom = m24924g((float) this.f34440h.bottom, (float) this.f34442i.bottom, f, this.f34413N);
            }
            if (!this.f34432d) {
                this.f34456v = m24924g(this.f34454t, this.f34455u, f, this.f34413N);
                this.f34457w = m24924g(this.f34452r, this.f34453s, f, this.f34413N);
                mo54191o(m24924g(this.f34447m, this.f34448n, f, this.f34414O));
                f2 = f;
            } else if (f < this.f34436f) {
                this.f34456v = this.f34454t;
                this.f34457w = this.f34452r;
                mo54191o(this.f34447m);
                f2 = 0.0f;
            } else {
                this.f34456v = this.f34455u;
                this.f34457w = this.f34453s - ((float) Math.max(0, this.f34438g));
                mo54191o(this.f34448n);
                f2 = 1.0f;
            }
            FastOutSlowInInterpolator fastOutSlowInInterpolator = C18268a.f40092b;
            this.f34429b0 = 1.0f - m24924g(0.0f, 1.0f, 1.0f - f, fastOutSlowInInterpolator);
            View view = this.f34426a;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(view);
            this.f34431c0 = m24924g(1.0f, 0.0f, f, fastOutSlowInInterpolator);
            C2364y.C2368d.m5221k(this.f34426a);
            ColorStateList colorStateList = this.f34450p;
            ColorStateList colorStateList2 = this.f34449o;
            if (colorStateList != colorStateList2) {
                this.f34411L.setColor(m24923a(f2, mo54183f(colorStateList2), mo54183f(this.f34450p)));
            } else {
                this.f34411L.setColor(mo54183f(colorStateList));
            }
            float f3 = this.f34423X;
            float f4 = this.f34424Y;
            if (f3 != f4) {
                this.f34411L.setLetterSpacing(m24924g(f4, f3, f, fastOutSlowInInterpolator));
            } else {
                this.f34411L.setLetterSpacing(f3);
            }
            this.f34411L.setShadowLayer(m24924g(this.f34419T, this.f34415P, f, (TimeInterpolator) null), m24924g(this.f34420U, this.f34416Q, f, (TimeInterpolator) null), m24924g(this.f34421V, this.f34417R, f, (TimeInterpolator) null), m24923a(f, mo54183f(this.f34422W), mo54183f(this.f34418S)));
            if (this.f34432d) {
                int alpha = this.f34411L.getAlpha();
                float f5 = this.f34436f;
                this.f34411L.setAlpha((int) ((f <= f5 ? C18268a.m30884a(1.0f, 0.0f, this.f34434e, f5, f) : C18268a.m30884a(0.0f, 1.0f, f5, 1.0f, f)) * ((float) alpha)));
            }
            C2364y.C2368d.m5221k(this.f34426a);
        }
    }

    /* renamed from: o */
    public final void mo54191o(float f) {
        mo54180c(f, false);
        View view = this.f34426a;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5221k(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r3 = r2.f34449o;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54192p(int[] r3) {
        /*
            r2 = this;
            r2.f34409J = r3
            android.content.res.ColorStateList r3 = r2.f34450p
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L_0x000e
            boolean r3 = r3.isStateful()
            if (r3 != 0) goto L_0x0018
        L_0x000e:
            android.content.res.ColorStateList r3 = r2.f34449o
            if (r3 == 0) goto L_0x001a
            boolean r3 = r3.isStateful()
            if (r3 == 0) goto L_0x001a
        L_0x0018:
            r3 = r0
            goto L_0x001b
        L_0x001a:
            r3 = r1
        L_0x001b:
            if (r3 == 0) goto L_0x0021
            r2.mo54185i(r1)
            return r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C15342a.mo54192p(int[]):boolean");
    }
}
