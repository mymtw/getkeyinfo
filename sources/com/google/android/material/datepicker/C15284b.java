package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.etsy.android.R;
import p507al.C14024b;
import p507al.C14025c;
import p610kp.C18161c;

/* renamed from: com.google.android.material.datepicker.b */
public final class C15284b {

    /* renamed from: a */
    public final C15283a f34259a;

    /* renamed from: b */
    public final C15283a f34260b;

    /* renamed from: c */
    public final C15283a f34261c;

    /* renamed from: d */
    public final C15283a f34262d;

    /* renamed from: e */
    public final C15283a f34263e;

    /* renamed from: f */
    public final C15283a f34264f;

    /* renamed from: g */
    public final C15283a f34265g;

    /* renamed from: h */
    public final Paint f34266h;

    public C15284b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C14024b.m21581b(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C18161c.f39661D);
        this.f34259a = C15283a.m24834a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f34265g = C15283a.m24834a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f34260b = C15283a.m24834a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f34261c = C15283a.m24834a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a = C14025c.m21582a(context, obtainStyledAttributes, 6);
        this.f34262d = C15283a.m24834a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f34263e = C15283a.m24834a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f34264f = C15283a.m24834a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f34266h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
