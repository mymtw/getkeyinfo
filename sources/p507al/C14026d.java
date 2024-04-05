package p507al;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.p013v4.media.C0072d;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p280x0.C8292f;
import p610kp.C18161c;

/* renamed from: al.d */
public final class C14026d {

    /* renamed from: a */
    public final ColorStateList f30859a;

    /* renamed from: b */
    public final String f30860b;

    /* renamed from: c */
    public final int f30861c;

    /* renamed from: d */
    public final int f30862d;

    /* renamed from: e */
    public final float f30863e;

    /* renamed from: f */
    public final float f30864f;

    /* renamed from: g */
    public final float f30865g;

    /* renamed from: h */
    public final boolean f30866h;

    /* renamed from: i */
    public final float f30867i;

    /* renamed from: j */
    public ColorStateList f30868j;

    /* renamed from: k */
    public float f30869k;

    /* renamed from: l */
    public final int f30870l;

    /* renamed from: m */
    public boolean f30871m = false;

    /* renamed from: n */
    public Typeface f30872n;

    /* renamed from: al.d$a */
    public class C14027a extends C8292f.C8295c {

        /* renamed from: a */
        public final /* synthetic */ C14029f f30873a;

        public C14027a(C14029f fVar) {
            this.f30873a = fVar;
        }

        /* renamed from: c */
        public final void mo3119c(int i) {
            C14026d.this.f30871m = true;
            this.f30873a.mo46840a(i);
        }

        /* renamed from: d */
        public final void mo3120d(Typeface typeface) {
            C14026d dVar = C14026d.this;
            dVar.f30872n = Typeface.create(typeface, dVar.f30861c);
            C14026d dVar2 = C14026d.this;
            dVar2.f30871m = true;
            this.f30873a.mo46841b(dVar2.f30872n, false);
        }
    }

    public C14026d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C18161c.f39699m1);
        this.f30869k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f30868j = C14025c.m21582a(context, obtainStyledAttributes, 3);
        C14025c.m21582a(context, obtainStyledAttributes, 4);
        C14025c.m21582a(context, obtainStyledAttributes, 5);
        this.f30861c = obtainStyledAttributes.getInt(2, 0);
        this.f30862d = obtainStyledAttributes.getInt(1, 1);
        int i2 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f30870l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f30860b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f30859a = C14025c.m21582a(context, obtainStyledAttributes, 6);
        this.f30863e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f30864f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f30865g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C18161c.f39668K);
        this.f30866h = obtainStyledAttributes2.hasValue(0);
        this.f30867i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void mo46843a() {
        String str;
        if (this.f30872n == null && (str = this.f30860b) != null) {
            this.f30872n = Typeface.create(str, this.f30861c);
        }
        if (this.f30872n == null) {
            int i = this.f30862d;
            if (i == 1) {
                this.f30872n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f30872n = Typeface.SERIF;
            } else if (i != 3) {
                this.f30872n = Typeface.DEFAULT;
            } else {
                this.f30872n = Typeface.MONOSPACE;
            }
            this.f30872n = Typeface.create(this.f30872n, this.f30861c);
        }
    }

    /* renamed from: b */
    public final Typeface mo46844b(Context context) {
        if (this.f30871m) {
            return this.f30872n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a = C8292f.m16582a(context, this.f30870l);
                this.f30872n = a;
                if (a != null) {
                    this.f30872n = Typeface.create(a, this.f30861c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder h = C0072d.m201h("Error loading font ");
                h.append(this.f30860b);
                Log.d("TextAppearance", h.toString(), e);
            }
        }
        mo46843a();
        this.f30871m = true;
        return this.f30872n;
    }

    /* renamed from: c */
    public final void mo46845c(Context context, C14029f fVar) {
        if (mo46846d(context)) {
            mo46844b(context);
        } else {
            mo46843a();
        }
        int i = this.f30870l;
        if (i == 0) {
            this.f30871m = true;
        }
        if (this.f30871m) {
            fVar.mo46841b(this.f30872n, true);
            return;
        }
        try {
            C14027a aVar = new C14027a(fVar);
            ThreadLocal<TypedValue> threadLocal = C8292f.f18172a;
            if (context.isRestricted()) {
                aVar.mo20893a(-4);
                return;
            }
            C8292f.m16583b(context, i, new TypedValue(), 0, aVar, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f30871m = true;
            fVar.mo46840a(1);
        } catch (Exception e) {
            StringBuilder h = C0072d.m201h("Error loading font ");
            h.append(this.f30860b);
            Log.d("TextAppearance", h.toString(), e);
            this.f30871m = true;
            fVar.mo46840a(-3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo46846d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f30870l
            if (r1 == 0) goto L_0x001c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = p280x0.C8292f.f18172a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto L_0x000d
            goto L_0x001c
        L_0x000d:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = p280x0.C8292f.m16583b(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            if (r8 == 0) goto L_0x0021
            r8 = 1
            goto L_0x0022
        L_0x0021:
            r8 = 0
        L_0x0022:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p507al.C14026d.mo46846d(android.content.Context):boolean");
    }

    /* renamed from: e */
    public final void mo46847e(Context context, TextPaint textPaint, C14029f fVar) {
        mo46848f(context, textPaint, fVar);
        ColorStateList colorStateList = this.f30868j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f30865g;
        float f2 = this.f30863e;
        float f3 = this.f30864f;
        ColorStateList colorStateList2 = this.f30859a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void mo46848f(Context context, TextPaint textPaint, C14029f fVar) {
        if (mo46846d(context)) {
            mo46849g(textPaint, mo46844b(context));
            return;
        }
        mo46843a();
        mo46849g(textPaint, this.f30872n);
        mo46845c(context, new C14028e(this, textPaint, fVar));
    }

    /* renamed from: g */
    public final void mo46849g(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f30861c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f30869k);
        if (this.f30866h) {
            textPaint.setLetterSpacing(this.f30867i);
        }
    }
}
