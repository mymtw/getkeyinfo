package p726zi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: zi.m */
public final class C18927m {

    /* renamed from: A */
    public int f42178A;

    /* renamed from: B */
    public int f42179B;

    /* renamed from: C */
    public int f42180C;

    /* renamed from: D */
    public int f42181D;

    /* renamed from: E */
    public StaticLayout f42182E;

    /* renamed from: F */
    public StaticLayout f42183F;

    /* renamed from: G */
    public int f42184G;

    /* renamed from: H */
    public int f42185H;

    /* renamed from: I */
    public int f42186I;

    /* renamed from: J */
    public Rect f42187J;

    /* renamed from: a */
    public final float f42188a;

    /* renamed from: b */
    public final float f42189b;

    /* renamed from: c */
    public final float f42190c;

    /* renamed from: d */
    public final float f42191d;

    /* renamed from: e */
    public final float f42192e;

    /* renamed from: f */
    public final TextPaint f42193f;

    /* renamed from: g */
    public final Paint f42194g;

    /* renamed from: h */
    public final Paint f42195h;

    /* renamed from: i */
    public CharSequence f42196i;

    /* renamed from: j */
    public Layout.Alignment f42197j;

    /* renamed from: k */
    public Bitmap f42198k;

    /* renamed from: l */
    public float f42199l;

    /* renamed from: m */
    public int f42200m;

    /* renamed from: n */
    public int f42201n;

    /* renamed from: o */
    public float f42202o;

    /* renamed from: p */
    public int f42203p;

    /* renamed from: q */
    public float f42204q;

    /* renamed from: r */
    public float f42205r;

    /* renamed from: s */
    public int f42206s;

    /* renamed from: t */
    public int f42207t;

    /* renamed from: u */
    public int f42208u;

    /* renamed from: v */
    public int f42209v;

    /* renamed from: w */
    public int f42210w;

    /* renamed from: x */
    public float f42211x;

    /* renamed from: y */
    public float f42212y;

    /* renamed from: z */
    public float f42213z;

    public C18927m(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16843287, 16843288}, 0, 0);
        this.f42192e = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f42191d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.f42188a = round;
        this.f42189b = round;
        this.f42190c = round;
        TextPaint textPaint = new TextPaint();
        this.f42193f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f42194g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f42195h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    public final void mo70371a(Canvas canvas, boolean z) {
        if (z) {
            StaticLayout staticLayout = this.f42182E;
            StaticLayout staticLayout2 = this.f42183F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate((float) this.f42184G, (float) this.f42185H);
                if (Color.alpha(this.f42208u) > 0) {
                    this.f42194g.setColor(this.f42208u);
                    canvas.drawRect((float) (-this.f42186I), 0.0f, (float) (staticLayout.getWidth() + this.f42186I), (float) staticLayout.getHeight(), this.f42194g);
                }
                int i = this.f42210w;
                boolean z2 = true;
                if (i == 1) {
                    this.f42193f.setStrokeJoin(Paint.Join.ROUND);
                    this.f42193f.setStrokeWidth(this.f42188a);
                    this.f42193f.setColor(this.f42209v);
                    this.f42193f.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else if (i == 2) {
                    TextPaint textPaint = this.f42193f;
                    float f = this.f42189b;
                    float f2 = this.f42190c;
                    textPaint.setShadowLayer(f, f2, f2, this.f42209v);
                } else if (i == 3 || i == 4) {
                    if (i != 3) {
                        z2 = false;
                    }
                    int i2 = -1;
                    int i3 = z2 ? -1 : this.f42209v;
                    if (z2) {
                        i2 = this.f42209v;
                    }
                    float f3 = this.f42189b / 2.0f;
                    this.f42193f.setColor(this.f42206s);
                    this.f42193f.setStyle(Paint.Style.FILL);
                    float f4 = -f3;
                    this.f42193f.setShadowLayer(this.f42189b, f4, f4, i3);
                    staticLayout2.draw(canvas);
                    this.f42193f.setShadowLayer(this.f42189b, f3, f3, i2);
                }
                this.f42193f.setColor(this.f42206s);
                this.f42193f.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                this.f42193f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.f42187J.getClass();
        this.f42198k.getClass();
        canvas.drawBitmap(this.f42198k, (Rect) null, this.f42187J, this.f42195h);
    }
}
