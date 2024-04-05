package p704wk;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.C15404b;
import p289y0.C8351c;

/* renamed from: wk.c */
public final class C18720c extends Drawable {

    /* renamed from: a */
    public final C15404b f41478a = C15404b.C15405a.f34607a;

    /* renamed from: b */
    public final Paint f41479b;

    /* renamed from: c */
    public final Path f41480c = new Path();

    /* renamed from: d */
    public final Rect f41481d = new Rect();

    /* renamed from: e */
    public final RectF f41482e = new RectF();

    /* renamed from: f */
    public final RectF f41483f = new RectF();

    /* renamed from: g */
    public final C18721a f41484g = new C18721a();

    /* renamed from: h */
    public float f41485h;

    /* renamed from: i */
    public int f41486i;

    /* renamed from: j */
    public int f41487j;

    /* renamed from: k */
    public int f41488k;

    /* renamed from: l */
    public int f41489l;

    /* renamed from: m */
    public int f41490m;

    /* renamed from: n */
    public boolean f41491n = true;

    /* renamed from: o */
    public C15401a f41492o;

    /* renamed from: p */
    public ColorStateList f41493p;

    /* renamed from: wk.c$a */
    public class C18721a extends Drawable.ConstantState {
        public C18721a() {
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return C18720c.this;
        }
    }

    public C18720c(C15401a aVar) {
        this.f41492o = aVar;
        Paint paint = new Paint(1);
        this.f41479b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final RectF mo70202a() {
        this.f41483f.set(getBounds());
        return this.f41483f;
    }

    public final void draw(Canvas canvas) {
        if (this.f41491n) {
            Paint paint = this.f41479b;
            Rect rect = this.f41481d;
            copyBounds(rect);
            float height = this.f41485h / ((float) rect.height());
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C8351c.m16664f(this.f41486i, this.f41490m), C8351c.m16664f(this.f41487j, this.f41490m), C8351c.m16664f(C8351c.m16666h(this.f41487j, 0), this.f41490m), C8351c.m16664f(C8351c.m16666h(this.f41489l, 0), this.f41490m), C8351c.m16664f(this.f41489l, this.f41490m), C8351c.m16664f(this.f41488k, this.f41490m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.f41491n = false;
        }
        float strokeWidth = this.f41479b.getStrokeWidth() / 2.0f;
        copyBounds(this.f41481d);
        this.f41482e.set(this.f41481d);
        float min = Math.min(this.f41492o.f34575e.mo68901a(mo70202a()), this.f41482e.width() / 2.0f);
        if (this.f41492o.mo54613e(mo70202a())) {
            this.f41482e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f41482e, min, min, this.f41479b);
        }
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f41484g;
    }

    public final int getOpacity() {
        return this.f41485h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        if (this.f41492o.mo54613e(mo70202a())) {
            outline.setRoundRect(getBounds(), this.f41492o.f34575e.mo68901a(mo70202a()));
            return;
        }
        copyBounds(this.f41481d);
        this.f41482e.set(this.f41481d);
        this.f41478a.mo54622a(this.f41492o, 1.0f, this.f41482e, this.f41480c);
        if (this.f41480c.isConvex()) {
            outline.setConvexPath(this.f41480c);
        }
    }

    public final boolean getPadding(Rect rect) {
        if (!this.f41492o.mo54613e(mo70202a())) {
            return true;
        }
        int round = Math.round(this.f41485h);
        rect.set(round, round, round, round);
        return true;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.f41493p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public final void onBoundsChange(Rect rect) {
        this.f41491n = true;
    }

    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f41493p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f41490m)) == this.f41490m)) {
            this.f41491n = true;
            this.f41490m = colorForState;
        }
        if (this.f41491n) {
            invalidateSelf();
        }
        return this.f41491n;
    }

    public final void setAlpha(int i) {
        this.f41479b.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f41479b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
