package p298z0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;

/* renamed from: z0.b */
public final class C8418b extends RoundedBitmapDrawable {
    public C8418b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    public final void getOutline(Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    public final void gravityCompatApply(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }

    public final boolean hasMipMap() {
        Bitmap bitmap = this.mBitmap;
        return bitmap != null && bitmap.hasMipMap();
    }

    public final void setMipMap(boolean z) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.setHasMipMap(z);
            invalidateSelf();
        }
    }
}
