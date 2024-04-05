package p688uk;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.R;
import p289y0.C8351c;
import p507al.C14024b;

/* renamed from: uk.a */
public final class C18602a {

    /* renamed from: f */
    public static final int f41084f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    public final boolean f41085a;

    /* renamed from: b */
    public final int f41086b;

    /* renamed from: c */
    public final int f41087c;

    /* renamed from: d */
    public final int f41088d;

    /* renamed from: e */
    public final float f41089e;

    public C18602a(Context context) {
        TypedValue a = C14024b.m21580a(context, R.attr.elevationOverlayEnabled);
        boolean z = (a == null || a.type != 18 || a.data == 0) ? false : true;
        int D = C1993m.m4343D(R.attr.elevationOverlayColor, context, 0);
        int D2 = C1993m.m4343D(R.attr.elevationOverlayAccentColor, context, 0);
        int D3 = C1993m.m4343D(R.attr.colorSurface, context, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f41085a = z;
        this.f41086b = D;
        this.f41087c = D2;
        this.f41088d = D3;
        this.f41089e = f;
    }

    /* renamed from: a */
    public final int mo70112a(float f, int i) {
        int i2;
        float f2 = this.f41089e;
        float min = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int R = C1993m.m4357R(min, C8351c.m16666h(i, 255), this.f41086b);
        if (min > 0.0f && (i2 = this.f41087c) != 0) {
            R = C8351c.m16664f(C8351c.m16666h(i2, f41084f), R);
        }
        return C8351c.m16666h(R, alpha);
    }

    /* renamed from: b */
    public final int mo70113b(float f, int i) {
        if (this.f41085a) {
            if (C8351c.m16666h(i, 255) == this.f41088d) {
                return mo70112a(f, i);
            }
        }
        return i;
    }
}
