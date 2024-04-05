package com.paypal.pyplcheckout.model;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.squareup.picasso.C17469y;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RoundedCornersTransformation implements C17469y {
    private final CornerType cornerType;
    private final float diameter;
    private final float margin;
    private final float radius;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CornerType.values().length];
            iArr[CornerType.ALL.ordinal()] = 1;
            iArr[CornerType.TOP_LEFT.ordinal()] = 2;
            iArr[CornerType.TOP_RIGHT.ordinal()] = 3;
            iArr[CornerType.BOTTOM_LEFT.ordinal()] = 4;
            iArr[CornerType.BOTTOM_RIGHT.ordinal()] = 5;
            iArr[CornerType.TOP.ordinal()] = 6;
            iArr[CornerType.BOTTOM.ordinal()] = 7;
            iArr[CornerType.LEFT.ordinal()] = 8;
            iArr[CornerType.RIGHT.ordinal()] = 9;
            iArr[CornerType.OTHER_TOP_LEFT.ordinal()] = 10;
            iArr[CornerType.OTHER_TOP_RIGHT.ordinal()] = 11;
            iArr[CornerType.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            iArr[CornerType.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            iArr[CornerType.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            iArr[CornerType.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RoundedCornersTransformation(float f, float f2, CornerType cornerType2) {
        C19383o.m32797g(cornerType2, "cornerType");
        this.radius = f;
        this.margin = f2;
        this.cornerType = cornerType2;
        this.diameter = f * ((float) 2);
    }

    private final void drawBottomLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        float f4 = this.diameter;
        RectF rectF = new RectF(f3, f2 - f4, f4 + f3, f2);
        float f5 = this.radius;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.margin;
        canvas.drawRect(new RectF(f6, f6, this.diameter + f6, f2 - this.radius), paint);
        float f7 = this.margin;
        canvas.drawRect(new RectF(this.radius + f7, f7, f, f2), paint);
    }

    private final void drawBottomRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.diameter;
        RectF rectF = new RectF(f - f3, f2 - f3, f, f2);
        float f4 = this.radius;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.margin;
        canvas.drawRect(new RectF(f5, f5, f - this.radius, f2), paint);
        float f6 = this.radius;
        canvas.drawRect(new RectF(f - f6, this.margin, f, f2 - f6), paint);
    }

    private final void drawBottomRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.margin, f2 - this.diameter, f, f2);
        float f3 = this.radius;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.margin;
        canvas.drawRect(new RectF(f4, f4, f, f2 - this.radius), paint);
    }

    private final void drawDiagonalFromTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        float f4 = this.diameter;
        RectF rectF = new RectF(f3, f3, f3 + f4, f4 + f3);
        float f5 = this.radius;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.diameter;
        RectF rectF2 = new RectF(f - f6, f2 - f6, f, f2);
        float f7 = this.radius;
        canvas.drawRoundRect(rectF2, f7, f7, paint);
        float f8 = this.margin;
        canvas.drawRect(new RectF(f8, this.radius + f8, f - this.diameter, f2), paint);
        float f9 = this.margin;
        canvas.drawRect(new RectF(this.diameter + f9, f9, f, f2 - this.radius), paint);
    }

    private final void drawDiagonalFromTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.diameter;
        float f4 = this.margin;
        RectF rectF = new RectF(f - f3, f4, f, f3 + f4);
        float f5 = this.radius;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.margin;
        float f7 = this.diameter;
        RectF rectF2 = new RectF(f6, f2 - f7, f7 + f6, f2);
        float f8 = this.radius;
        canvas.drawRoundRect(rectF2, f8, f8, paint);
        float f9 = this.margin;
        float f10 = this.radius;
        canvas.drawRect(new RectF(f9, f9, f - f10, f2 - f10), paint);
        float f11 = this.margin;
        float f12 = this.radius;
        canvas.drawRect(new RectF(f11 + f12, f11 + f12, f, f2), paint);
    }

    private final void drawLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        RectF rectF = new RectF(f3, f3, this.diameter + f3, f2);
        float f4 = this.radius;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.margin;
        canvas.drawRect(new RectF(this.radius + f5, f5, f, f2), paint);
    }

    private final void drawOtherBottomLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        RectF rectF = new RectF(f3, f3, f, this.diameter + f3);
        float f4 = this.radius;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        RectF rectF2 = new RectF(f - this.diameter, this.margin, f, f2);
        float f5 = this.radius;
        canvas.drawRoundRect(rectF2, f5, f5, paint);
        float f6 = this.margin;
        float f7 = this.radius;
        canvas.drawRect(new RectF(f6, f6 + f7, f - f7, f2), paint);
    }

    private final void drawOtherBottomRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        RectF rectF = new RectF(f3, f3, f, this.diameter + f3);
        float f4 = this.radius;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.margin;
        RectF rectF2 = new RectF(f5, f5, this.diameter + f5, f2);
        float f6 = this.radius;
        canvas.drawRoundRect(rectF2, f6, f6, paint);
        float f7 = this.margin;
        float f8 = this.radius;
        canvas.drawRect(new RectF(f7 + f8, f7 + f8, f, f2), paint);
    }

    private final void drawOtherTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.margin, f2 - this.diameter, f, f2);
        float f3 = this.radius;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        RectF rectF2 = new RectF(f - this.diameter, this.margin, f, f2);
        float f4 = this.radius;
        canvas.drawRoundRect(rectF2, f4, f4, paint);
        float f5 = this.margin;
        float f6 = this.radius;
        canvas.drawRect(new RectF(f5, f5, f - f6, f2 - f6), paint);
    }

    private final void drawOtherTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        RectF rectF = new RectF(f3, f3, this.diameter + f3, f2);
        float f4 = this.radius;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        RectF rectF2 = new RectF(this.margin, f2 - this.diameter, f, f2);
        float f5 = this.radius;
        canvas.drawRoundRect(rectF2, f5, f5, paint);
        float f6 = this.margin;
        float f7 = this.radius;
        canvas.drawRect(new RectF(f6 + f7, f6, f, f2 - f7), paint);
    }

    private final void drawRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(f - this.diameter, this.margin, f, f2);
        float f3 = this.radius;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.margin;
        canvas.drawRect(new RectF(f4, f4, f - this.radius, f2), paint);
    }

    private final void drawRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        float f4 = f - f3;
        float f5 = f2 - f3;
        switch (WhenMappings.$EnumSwitchMapping$0[this.cornerType.ordinal()]) {
            case 1:
                float f6 = this.margin;
                RectF rectF = new RectF(f6, f6, f4, f5);
                float f7 = this.radius;
                canvas.drawRoundRect(rectF, f7, f7, paint);
                return;
            case 2:
                drawTopLeftRoundRect(canvas, paint, f4, f5);
                return;
            case 3:
                drawTopRightRoundRect(canvas, paint, f4, f5);
                return;
            case 4:
                drawBottomLeftRoundRect(canvas, paint, f4, f5);
                return;
            case 5:
                drawBottomRightRoundRect(canvas, paint, f4, f5);
                return;
            case 6:
                drawTopRoundRect(canvas, paint, f4, f5);
                return;
            case 7:
                drawBottomRoundRect(canvas, paint, f4, f5);
                return;
            case 8:
                drawLeftRoundRect(canvas, paint, f4, f5);
                return;
            case 9:
                drawRightRoundRect(canvas, paint, f4, f5);
                return;
            case 10:
                drawOtherTopLeftRoundRect(canvas, paint, f4, f5);
                return;
            case 11:
                drawOtherTopRightRoundRect(canvas, paint, f4, f5);
                return;
            case 12:
                drawOtherBottomLeftRoundRect(canvas, paint, f4, f5);
                return;
            case 13:
                drawOtherBottomRightRoundRect(canvas, paint, f4, f5);
                return;
            case 14:
                drawDiagonalFromTopLeftRoundRect(canvas, paint, f4, f5);
                return;
            case 15:
                drawDiagonalFromTopRightRoundRect(canvas, paint, f4, f5);
                return;
            default:
                return;
        }
    }

    private final void drawTopLeftRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        float f4 = this.diameter;
        RectF rectF = new RectF(f3, f3, f3 + f4, f4 + f3);
        float f5 = this.radius;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.margin;
        float f7 = this.radius;
        canvas.drawRect(new RectF(f6, f6 + f7, f7 + f6, f2), paint);
        float f8 = this.margin;
        canvas.drawRect(new RectF(this.radius + f8, f8, f, f2), paint);
    }

    private final void drawTopRightRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.diameter;
        float f4 = this.margin;
        RectF rectF = new RectF(f - f3, f4, f, f3 + f4);
        float f5 = this.radius;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.margin;
        canvas.drawRect(new RectF(f6, f6, f - this.radius, f2), paint);
        float f7 = this.radius;
        canvas.drawRect(new RectF(f - f7, this.margin + f7, f, f2), paint);
    }

    private final void drawTopRoundRect(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.margin;
        RectF rectF = new RectF(f3, f3, f, this.diameter + f3);
        float f4 = this.radius;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.margin;
        canvas.drawRect(new RectF(f5, this.radius + f5, f, f2), paint);
    }

    public String key() {
        float f = this.radius;
        float f2 = this.margin;
        float f3 = this.diameter;
        String name = this.cornerType.name();
        return "RoundedTransformation(radius=" + f + ", margin=" + f2 + ", diameter=" + f3 + ", cornerType=" + name + ")";
    }

    public Bitmap transform(Bitmap bitmap) {
        C19383o.m32797g(bitmap, "source");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        drawRoundRect(canvas, paint, (float) width, (float) height);
        bitmap.recycle();
        C19383o.m32796f(createBitmap, "bitmap");
        return createBitmap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RoundedCornersTransformation(float f, float f2, CornerType cornerType2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, (i & 4) != 0 ? CornerType.ALL : cornerType2);
    }
}
