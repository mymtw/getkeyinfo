package p455u9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.ImageView;

/* renamed from: u9.g */
public final class C13453g extends C13450d {

    /* renamed from: f */
    public int f29475f;

    /* renamed from: u9.g$a */
    public class C13454a extends C13449c {
        public C13454a(ImageView imageView) {
            super(imageView);
        }

        /* renamed from: a */
        public final void mo38983a(Bitmap bitmap) {
            C13453g gVar = C13453g.this;
            int i = gVar.f29475f;
            if (i > 0) {
                int i2 = gVar.f29469c;
                int i3 = gVar.f29470d;
                if (bitmap != null) {
                    if (i2 == -1) {
                        i2 = bitmap.getWidth();
                    }
                    if (i3 == -1) {
                        i3 = bitmap.getHeight();
                    }
                    if (!(i2 == bitmap.getWidth() && i3 == bitmap.getHeight())) {
                        bitmap = Bitmap.createScaledBitmap(bitmap, i2, i3, true);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    Rect rect = new Rect(0, 0, i2, i3);
                    RectF rectF = new RectF(rect);
                    float f = (float) i;
                    paint.setAntiAlias(true);
                    canvas.drawARGB(0, 0, 0, 0);
                    paint.setColor(-12434878);
                    canvas.drawRoundRect(rectF, f, f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rect, paint);
                    bitmap = createBitmap;
                } else {
                    bitmap = null;
                }
            }
            super.mo38983a(bitmap);
        }
    }

    public C13453g(int i, ImageView imageView, String str) {
        super(imageView, str);
        this.f29475f = i;
        this.f29471e = new C13454a(imageView);
    }
}
