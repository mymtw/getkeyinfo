package p522cl;

import android.graphics.Paint;
import android.graphics.Path;
import p289y0.C8351c;

/* renamed from: cl.a */
public final class C14169a {

    /* renamed from: i */
    public static final int[] f31274i = new int[3];

    /* renamed from: j */
    public static final float[] f31275j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f31276k = new int[4];

    /* renamed from: l */
    public static final float[] f31277l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f31278a = new Paint();

    /* renamed from: b */
    public final Paint f31279b;

    /* renamed from: c */
    public final Paint f31280c;

    /* renamed from: d */
    public int f31281d;

    /* renamed from: e */
    public int f31282e;

    /* renamed from: f */
    public int f31283f;

    /* renamed from: g */
    public final Path f31284g = new Path();

    /* renamed from: h */
    public Paint f31285h = new Paint();

    public C14169a() {
        mo47112a(-16777216);
        this.f31285h.setColor(0);
        Paint paint = new Paint(4);
        this.f31279b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f31280c = new Paint(paint);
    }

    /* renamed from: a */
    public final void mo47112a(int i) {
        this.f31281d = C8351c.m16666h(i, 68);
        this.f31282e = C8351c.m16666h(i, 20);
        this.f31283f = C8351c.m16666h(i, 0);
        this.f31278a.setColor(this.f31281d);
    }
}
