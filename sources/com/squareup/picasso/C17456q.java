package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: com.squareup.picasso.q */
public final class C17456q extends BitmapDrawable {

    /* renamed from: h */
    public static final Paint f38137h = new Paint();

    /* renamed from: a */
    public final boolean f38138a;

    /* renamed from: b */
    public final float f38139b;

    /* renamed from: c */
    public final Picasso.LoadedFrom f38140c;

    /* renamed from: d */
    public Drawable f38141d;

    /* renamed from: e */
    public long f38142e;

    /* renamed from: f */
    public boolean f38143f;

    /* renamed from: g */
    public int f38144g = 255;

    public C17456q(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f38138a = z2;
        this.f38139b = context.getResources().getDisplayMetrics().density;
        this.f38140c = loadedFrom;
        if (loadedFrom != Picasso.LoadedFrom.MEMORY && !z) {
            this.f38141d = drawable;
            this.f38143f = true;
            this.f38142e = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    public static void m29311a(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new C17456q(context, bitmap, drawable, loadedFrom, z, z2));
    }

    /* renamed from: b */
    public static void m29312b(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    public final void draw(Canvas canvas) {
        if (!this.f38143f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f38142e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f38143f = false;
                this.f38141d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f38141d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f38144g) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f38144g);
            }
        }
        if (this.f38138a) {
            Paint paint = f38137h;
            paint.setColor(-1);
            Path path = new Path();
            float f = (float) 0;
            path.moveTo(f, f);
            float f2 = (float) (((int) (this.f38139b * 16.0f)) + 0);
            path.lineTo(f2, f);
            path.lineTo(f, f2);
            canvas.drawPath(path, paint);
            paint.setColor(this.f38140c.debugColor);
            Path path2 = new Path();
            path2.moveTo(f, f);
            float f3 = (float) (((int) (this.f38139b * 15.0f)) + 0);
            path2.lineTo(f3, f);
            path2.lineTo(f, f3);
            canvas.drawPath(path2, paint);
        }
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f38141d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i) {
        this.f38144g = i;
        Drawable drawable = this.f38141d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f38141d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
