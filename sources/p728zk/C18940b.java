package p728zk;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.R;
import com.google.android.material.internal.C15367g;
import p507al.C14025c;
import p610kp.C18161c;

/* renamed from: zk.b */
public abstract class C18940b {

    /* renamed from: a */
    public int f42224a;

    /* renamed from: b */
    public int f42225b;

    /* renamed from: c */
    public int[] f42226c = new int[0];

    /* renamed from: d */
    public int f42227d;

    /* renamed from: e */
    public int f42228e;

    /* renamed from: f */
    public int f42229f;

    public C18940b(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray d = C15367g.m24957d(context, attributeSet, C18161c.f39687f, i, i2, new int[0]);
        this.f42224a = C14025c.m21584c(context, d, 8, dimensionPixelSize);
        this.f42225b = Math.min(C14025c.m21584c(context, d, 7, 0), this.f42224a / 2);
        this.f42228e = d.getInt(4, 0);
        this.f42229f = d.getInt(1, 0);
        if (!d.hasValue(2)) {
            this.f42226c = new int[]{C1993m.m4343D(R.attr.colorPrimary, context, -1)};
        } else if (d.peekValue(2).type != 1) {
            this.f42226c = new int[]{d.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(d.getResourceId(2, -1));
            this.f42226c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (d.hasValue(6)) {
            this.f42227d = d.getColor(6, -1);
        } else {
            this.f42227d = this.f42226c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.f42227d = C1993m.m4375u(this.f42227d, (int) (f * 255.0f));
        }
        d.recycle();
    }

    /* renamed from: a */
    public abstract void mo70376a();
}
