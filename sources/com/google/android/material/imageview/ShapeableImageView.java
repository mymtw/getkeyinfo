package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.C15404b;
import com.google.android.material.shape.MaterialShapeDrawable;
import p260v0.C8184a;
import p550dl.C17585k;

public class ShapeableImageView extends AppCompatImageView implements C17585k {
    private static final int DEF_STYLE_RES = 2132018641;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;
    private int bottomContentPadding;
    private final Paint clearPaint;
    /* access modifiers changed from: private */
    public final RectF destination;
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final C15404b pathProvider;
    private int rightContentPadding;
    /* access modifiers changed from: private */
    public MaterialShapeDrawable shadowDrawable;
    /* access modifiers changed from: private */
    public C15401a shapeAppearanceModel;
    private int startContentPadding;
    private ColorStateList strokeColor;
    private float strokeWidth;
    private int topContentPadding;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    public class C15334a extends ViewOutlineProvider {

        /* renamed from: a */
        public final Rect f34382a = new Rect();

        public C15334a() {
        }

        public final void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.shapeAppearanceModel != null) {
                if (ShapeableImageView.this.shadowDrawable == null) {
                    MaterialShapeDrawable unused = ShapeableImageView.this.shadowDrawable = new MaterialShapeDrawable(ShapeableImageView.this.shapeAppearanceModel);
                }
                ShapeableImageView.this.destination.round(this.f34382a);
                ShapeableImageView.this.shadowDrawable.setBounds(this.f34382a);
                ShapeableImageView.this.shadowDrawable.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    private void drawStroke(Canvas canvas) {
        if (this.strokeColor != null) {
            this.borderPaint.setStrokeWidth(this.strokeWidth);
            int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
            if (this.strokeWidth > 0.0f && colorForState != 0) {
                this.borderPaint.setColor(colorForState);
                canvas.drawPath(this.path, this.borderPaint);
            }
        }
    }

    private boolean isContentPaddingRelative() {
        return (this.startContentPadding == Integer.MIN_VALUE && this.endContentPadding == Integer.MIN_VALUE) ? false : true;
    }

    private boolean isRtl() {
        return getLayoutDirection() == 1;
    }

    private void updateShapeMask(int i, int i2) {
        this.destination.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.pathProvider.mo54622a(this.shapeAppearanceModel, 1.0f, this.destination, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, (float) i, (float) i2);
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.bottomContentPadding;
    }

    public final int getContentPaddingEnd() {
        int i = this.endContentPadding;
        return i != Integer.MIN_VALUE ? i : isRtl() ? this.leftContentPadding : this.rightContentPadding;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i2 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!isRtl() && (i = this.startContentPadding) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.leftContentPadding;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i2 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!isRtl() && (i = this.endContentPadding) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.rightContentPadding;
    }

    public final int getContentPaddingStart() {
        int i = this.startContentPadding;
        return i != Integer.MIN_VALUE ? i : isRtl() ? this.rightContentPadding : this.leftContentPadding;
    }

    public int getContentPaddingTop() {
        return this.topContentPadding;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C15401a getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        drawStroke(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.hasAdjustedPaddingAfterLayoutDirectionResolved && isLayoutDirectionResolved()) {
            this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
            if (isPaddingRelative() || isContentPaddingRelative()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateShapeMask(i, i2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.startContentPadding = Integer.MIN_VALUE;
        this.endContentPadding = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.leftContentPadding) + i, (super.getPaddingTop() - this.topContentPadding) + i2, (super.getPaddingRight() - this.rightContentPadding) + i3, (super.getPaddingBottom() - this.bottomContentPadding) + i4);
        this.leftContentPadding = i;
        this.topContentPadding = i2;
        this.rightContentPadding = i3;
        this.bottomContentPadding = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.topContentPadding) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.bottomContentPadding) + i4);
        this.leftContentPadding = isRtl() ? i3 : i;
        this.topContentPadding = i2;
        if (!isRtl()) {
            i = i3;
        }
        this.rightContentPadding = i;
        this.bottomContentPadding = i4;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    public void setShapeAppearanceModel(C15401a aVar) {
        this.shapeAppearanceModel = aVar;
        MaterialShapeDrawable materialShapeDrawable = this.shadowDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(aVar);
        }
        updateShapeMask(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C8184a.m16459b(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.strokeWidth != f) {
            this.strokeWidth = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = DEF_STYLE_RES
            android.content.Context r7 = p574gl.C17790a.m29918a(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            com.google.android.material.shape.b r7 = com.google.android.material.shape.C15404b.C15405a.f34607a
            r6.pathProvider = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.path = r7
            r7 = 0
            r6.hasAdjustedPaddingAfterLayoutDirectionResolved = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.clearPaint = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.destination = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.maskRect = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.maskPath = r2
            int[] r2 = p610kp.C18161c.f39681Y
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 9
            android.content.res.ColorStateList r4 = p507al.C14025c.m21582a(r1, r2, r4)
            r6.strokeColor = r4
            r4 = 10
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.strokeWidth = r4
            int r7 = r2.getDimensionPixelSize(r7, r7)
            r6.leftContentPadding = r7
            r6.topContentPadding = r7
            r6.rightContentPadding = r7
            r6.bottomContentPadding = r7
            r4 = 3
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.leftContentPadding = r4
            r4 = 6
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.topContentPadding = r4
            r4 = 4
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.rightContentPadding = r4
            int r7 = r2.getDimensionPixelSize(r3, r7)
            r6.bottomContentPadding = r7
            r7 = 5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.startContentPadding = r7
            r7 = 2
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.endContentPadding = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.borderPaint = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            com.google.android.material.shape.a$a r7 = com.google.android.material.shape.C15401a.m24981b(r1, r8, r9, r0)
            com.google.android.material.shape.a r7 = r7.mo54616a()
            r6.shapeAppearanceModel = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
