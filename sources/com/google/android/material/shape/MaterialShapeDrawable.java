package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.etsy.android.R;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.C15404b;
import com.google.android.material.shape.C15408d;
import java.util.BitSet;
import java.util.Objects;
import p507al.C14024b;
import p522cl.C14169a;
import p550dl.C17576b;
import p550dl.C17577c;
import p550dl.C17582h;
import p550dl.C17584j;
import p550dl.C17585k;
import p688uk.C18602a;

public class MaterialShapeDrawable extends Drawable implements C17585k {
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = "MaterialShapeDrawable";
    private static final Paint clearPaint;
    /* access modifiers changed from: private */
    public final BitSet containsIncompatibleShadowOp;
    /* access modifiers changed from: private */
    public final C15408d.C15414f[] cornerShadowOperation;
    private C15400c drawableState;
    /* access modifiers changed from: private */
    public final C15408d.C15414f[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private final Matrix matrix;
    private final Path path;
    private final RectF pathBounds;
    /* access modifiers changed from: private */
    public boolean pathDirty;
    private final Path pathInsetByStroke;
    private final C15404b pathProvider;
    private final C15404b.C15406b pathShadowListener;
    private final RectF rectF;
    private int resolvedTintColor;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final C14169a shadowRenderer;
    private final Paint strokePaint;
    private C15401a strokeShapeAppearance;
    private PorterDuffColorFilter strokeTintFilter;
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$a */
    public class C15398a implements C15404b.C15406b {
        public C15398a() {
        }
    }

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$b */
    public class C15399b implements C15401a.C15403b {

        /* renamed from: a */
        public final /* synthetic */ float f34548a;

        public C15399b(float f) {
            this.f34548a = f;
        }

        /* renamed from: a */
        public final C17577c mo54610a(C17577c cVar) {
            return cVar instanceof C17582h ? cVar : new C17576b(this.f34548a, cVar);
        }
    }

    static {
        Class<MaterialShapeDrawable> cls = MaterialShapeDrawable.class;
        Paint paint = new Paint(1);
        clearPaint = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public /* synthetic */ MaterialShapeDrawable(C15400c cVar, C15398a aVar) {
        this(cVar);
    }

    private PorterDuffColorFilter calculatePaintColorTintFilter(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
        this.resolvedTintColor = compositeElevationOverlayIfNeeded;
        if (compositeElevationOverlayIfNeeded != color) {
            return new PorterDuffColorFilter(compositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void calculatePath(RectF rectF2, Path path2) {
        calculatePathForSize(rectF2, path2);
        if (this.drawableState.f34557i != 1.0f) {
            this.matrix.reset();
            Matrix matrix2 = this.matrix;
            float f = this.drawableState.f34557i;
            matrix2.setScale(f, f, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
            path2.transform(this.matrix);
        }
        path2.computeBounds(this.pathBounds, true);
    }

    private void calculateStrokePath() {
        C15401a g = getShapeAppearanceModel().mo54615g(new C15399b(-getStrokeInsetLength()));
        this.strokeShapeAppearance = g;
        this.pathProvider.mo54622a(g, this.drawableState.f34558j, getBoundsInsetByStroke(), this.pathInsetByStroke);
    }

    private PorterDuffColorFilter calculateTintColorTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = compositeElevationOverlayIfNeeded(colorForState);
        }
        this.resolvedTintColor = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter calculateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? calculatePaintColorTintFilter(paint, z) : calculateTintColorTintFilter(colorStateList, mode, z);
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    private void drawCompatShadow(Canvas canvas) {
        if (this.containsIncompatibleShadowOp.cardinality() > 0) {
            Log.w(TAG, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.drawableState.f34566r != 0) {
            canvas.drawPath(this.path, this.shadowRenderer.f31278a);
        }
        for (int i = 0; i < 4; i++) {
            C15408d.C15414f fVar = this.cornerShadowOperation[i];
            C14169a aVar = this.shadowRenderer;
            int i2 = this.drawableState.f34565q;
            Matrix matrix2 = C15408d.C15414f.f34632a;
            fVar.mo54625a(matrix2, aVar, i2, canvas);
            this.edgeShadowOperation[i].mo54625a(matrix2, this.shadowRenderer, this.drawableState.f34565q, canvas);
        }
        if (this.shadowBitmapDrawingEnable) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate((float) (-shadowOffsetX), (float) (-shadowOffsetY));
            canvas.drawPath(this.path, clearPaint);
            canvas.translate((float) shadowOffsetX, (float) shadowOffsetY);
        }
    }

    private void drawFillShape(Canvas canvas) {
        drawShape(canvas, this.fillPaint, this.path, this.drawableState.f34549a, getBoundsAsRectF());
    }

    private RectF getBoundsInsetByStroke() {
        this.insetRectF.set(getBoundsAsRectF());
        float strokeInsetLength = getStrokeInsetLength();
        this.insetRectF.inset(strokeInsetLength, strokeInsetLength);
        return this.insetRectF;
    }

    private float getStrokeInsetLength() {
        if (hasStroke()) {
            return this.strokePaint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean hasCompatShadow() {
        C15400c cVar = this.drawableState;
        int i = cVar.f34564p;
        return i != 1 && cVar.f34565q > 0 && (i == 2 || requiresCompatShadow());
    }

    private boolean hasFill() {
        Paint.Style style = this.drawableState.f34569u;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean hasStroke() {
        Paint.Style style = this.drawableState.f34569u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.strokePaint.getStrokeWidth() > 0.0f;
    }

    private void invalidateSelfIgnoreShape() {
        super.invalidateSelf();
    }

    private void maybeDrawCompatShadow(Canvas canvas) {
        if (hasCompatShadow()) {
            canvas.save();
            prepareCanvasForShadow(canvas);
            if (!this.shadowBitmapDrawingEnable) {
                drawCompatShadow(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.pathBounds.width() - ((float) getBounds().width()));
            int height = (int) (this.pathBounds.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap((this.drawableState.f34565q * 2) + ((int) this.pathBounds.width()) + width, (this.drawableState.f34565q * 2) + ((int) this.pathBounds.height()) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) ((getBounds().left - this.drawableState.f34565q) - width);
            float f2 = (float) ((getBounds().top - this.drawableState.f34565q) - height);
            canvas2.translate(-f, -f2);
            drawCompatShadow(canvas2);
            canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    private static int modulateAlpha(int i, int i2) {
        return ((i2 + (i2 >>> 7)) * i) >>> 8;
    }

    private void prepareCanvasForShadow(Canvas canvas) {
        canvas.translate((float) getShadowOffsetX(), (float) getShadowOffsetY());
    }

    private boolean updateColorsForState(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.drawableState.f34551c == null || (color2 = this.fillPaint.getColor()) == (colorForState2 = this.drawableState.f34551c.getColorForState(iArr, color2))) {
            z = false;
        } else {
            this.fillPaint.setColor(colorForState2);
            z = true;
        }
        if (this.drawableState.f34552d == null || (color = this.strokePaint.getColor()) == (colorForState = this.drawableState.f34552d.getColorForState(iArr, color))) {
            return z;
        }
        this.strokePaint.setColor(colorForState);
        return true;
    }

    private boolean updateTintFilter() {
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        C15400c cVar = this.drawableState;
        this.tintFilter = calculateTintFilter(cVar.f34554f, cVar.f34555g, this.fillPaint, true);
        C15400c cVar2 = this.drawableState;
        this.strokeTintFilter = calculateTintFilter(cVar2.f34553e, cVar2.f34555g, this.strokePaint, false);
        C15400c cVar3 = this.drawableState;
        if (cVar3.f34568t) {
            this.shadowRenderer.mo47112a(cVar3.f34554f.getColorForState(getState(), 0));
        }
        return !Objects.equals(porterDuffColorFilter, this.tintFilter) || !Objects.equals(porterDuffColorFilter2, this.strokeTintFilter);
    }

    private void updateZ() {
        float z = getZ();
        this.drawableState.f34565q = (int) Math.ceil((double) (0.75f * z));
        this.drawableState.f34566r = (int) Math.ceil((double) (z * 0.25f));
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public final void calculatePathForSize(RectF rectF2, Path path2) {
        C15404b bVar = this.pathProvider;
        C15400c cVar = this.drawableState;
        C15401a aVar = cVar.f34549a;
        float f = cVar.f34558j;
        bVar.mo54623b(aVar, f, rectF2, this.pathShadowListener, path2);
    }

    public int compositeElevationOverlayIfNeeded(int i) {
        float parentAbsoluteElevation = getParentAbsoluteElevation() + getZ();
        C18602a aVar = this.drawableState.f34550b;
        return aVar != null ? aVar.mo70113b(parentAbsoluteElevation, i) : i;
    }

    public void draw(Canvas canvas) {
        this.fillPaint.setColorFilter(this.tintFilter);
        int alpha = this.fillPaint.getAlpha();
        this.fillPaint.setAlpha(modulateAlpha(alpha, this.drawableState.f34560l));
        this.strokePaint.setColorFilter(this.strokeTintFilter);
        this.strokePaint.setStrokeWidth(this.drawableState.f34559k);
        int alpha2 = this.strokePaint.getAlpha();
        this.strokePaint.setAlpha(modulateAlpha(alpha2, this.drawableState.f34560l));
        if (this.pathDirty) {
            calculateStrokePath();
            calculatePath(getBoundsAsRectF(), this.path);
            this.pathDirty = false;
        }
        maybeDrawCompatShadow(canvas);
        if (hasFill()) {
            drawFillShape(canvas);
        }
        if (hasStroke()) {
            drawStrokeShape(canvas);
        }
        this.fillPaint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha2);
    }

    public void drawShape(Canvas canvas, Paint paint, Path path2, RectF rectF2) {
        drawShape(canvas, paint, path2, this.drawableState.f34549a, rectF2);
    }

    public void drawStrokeShape(Canvas canvas) {
        drawShape(canvas, this.strokePaint, this.pathInsetByStroke, this.strokeShapeAppearance, getBoundsInsetByStroke());
    }

    public float getBottomLeftCornerResolvedSize() {
        return this.drawableState.f34549a.f34578h.mo68901a(getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        return this.drawableState.f34549a.f34577g.mo68901a(getBoundsAsRectF());
    }

    public RectF getBoundsAsRectF() {
        this.rectF.set(getBounds());
        return this.rectF;
    }

    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public float getElevation() {
        return this.drawableState.f34562n;
    }

    public ColorStateList getFillColor() {
        return this.drawableState.f34551c;
    }

    public float getInterpolation() {
        return this.drawableState.f34558j;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.drawableState.f34564p != 2) {
            if (isRoundRect()) {
                outline.setRoundRect(getBounds(), getTopLeftCornerResolvedSize() * this.drawableState.f34558j);
                return;
            }
            calculatePath(getBoundsAsRectF(), this.path);
            if (this.path.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.path);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.drawableState.f34556h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.drawableState.f34569u;
    }

    public float getParentAbsoluteElevation() {
        return this.drawableState.f34561m;
    }

    @Deprecated
    public void getPathForSize(int i, int i2, Path path2) {
        calculatePathForSize(new RectF(0.0f, 0.0f, (float) i, (float) i2), path2);
    }

    public int getResolvedTintColor() {
        return this.resolvedTintColor;
    }

    public float getScale() {
        return this.drawableState.f34557i;
    }

    public int getShadowCompatRotation() {
        return this.drawableState.f34567s;
    }

    public int getShadowCompatibilityMode() {
        return this.drawableState.f34564p;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        C15400c cVar = this.drawableState;
        return (int) (Math.sin(Math.toRadians((double) cVar.f34567s)) * ((double) cVar.f34566r));
    }

    public int getShadowOffsetY() {
        C15400c cVar = this.drawableState;
        return (int) (Math.cos(Math.toRadians((double) cVar.f34567s)) * ((double) cVar.f34566r));
    }

    public int getShadowRadius() {
        return this.drawableState.f34565q;
    }

    public int getShadowVerticalOffset() {
        return this.drawableState.f34566r;
    }

    public C15401a getShapeAppearanceModel() {
        return this.drawableState.f34549a;
    }

    @Deprecated
    public C17584j getShapedViewModel() {
        C15401a shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof C17584j) {
            return (C17584j) shapeAppearanceModel;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        return this.drawableState.f34552d;
    }

    public ColorStateList getStrokeTintList() {
        return this.drawableState.f34553e;
    }

    public float getStrokeWidth() {
        return this.drawableState.f34559k;
    }

    public ColorStateList getTintList() {
        return this.drawableState.f34554f;
    }

    public float getTopLeftCornerResolvedSize() {
        return this.drawableState.f34549a.f34575e.mo68901a(getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        return this.drawableState.f34549a.f34576f.mo68901a(getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.drawableState.f34563o;
    }

    public Region getTransparentRegion() {
        this.transparentRegion.set(getBounds());
        calculatePath(getBoundsAsRectF(), this.path);
        this.scratchRegion.setPath(this.path, this.transparentRegion);
        this.transparentRegion.op(this.scratchRegion, Region.Op.DIFFERENCE);
        return this.transparentRegion;
    }

    public float getZ() {
        return getTranslationZ() + getElevation();
    }

    public void initializeElevationOverlay(Context context) {
        this.drawableState.f34550b = new C18602a(context);
        updateZ();
    }

    public void invalidateSelf() {
        this.pathDirty = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        C18602a aVar = this.drawableState.f34550b;
        return aVar != null && aVar.f41085a;
    }

    public boolean isElevationOverlayInitialized() {
        return this.drawableState.f34550b != null;
    }

    public boolean isPointInTransparentRegion(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    public boolean isRoundRect() {
        return this.drawableState.f34549a.mo54613e(getBoundsAsRectF());
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i = this.drawableState.f34564p;
        return i == 0 || i == 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.drawableState.f34552d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.drawableState.f34551c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.drawableState.f34554f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.drawableState.f34553e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            com.google.android.material.shape.MaterialShapeDrawable$c r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.f34554f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            com.google.android.material.shape.MaterialShapeDrawable$c r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.f34553e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            com.google.android.material.shape.MaterialShapeDrawable$c r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.f34552d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            com.google.android.material.shape.MaterialShapeDrawable$c r0 = r1.drawableState
            android.content.res.ColorStateList r0 = r0.f34551c
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.shape.MaterialShapeDrawable.isStateful():boolean");
    }

    public Drawable mutate() {
        this.drawableState = new C15400c(this.drawableState);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z = updateColorsForState(iArr) || updateTintFilter();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public boolean requiresCompatShadow() {
        return !isRoundRect() && !this.path.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public void setAlpha(int i) {
        C15400c cVar = this.drawableState;
        if (cVar.f34560l != i) {
            cVar.f34560l = i;
            invalidateSelfIgnoreShape();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.getClass();
        invalidateSelfIgnoreShape();
    }

    public void setCornerSize(float f) {
        setShapeAppearanceModel(this.drawableState.f34549a.mo54614f(f));
    }

    public void setEdgeIntersectionCheckEnable(boolean z) {
        this.pathProvider.f34606l = z;
    }

    public void setElevation(float f) {
        C15400c cVar = this.drawableState;
        if (cVar.f34562n != f) {
            cVar.f34562n = f;
            updateZ();
        }
    }

    public void setFillColor(ColorStateList colorStateList) {
        C15400c cVar = this.drawableState;
        if (cVar.f34551c != colorStateList) {
            cVar.f34551c = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f) {
        C15400c cVar = this.drawableState;
        if (cVar.f34558j != f) {
            cVar.f34558j = f;
            this.pathDirty = true;
            invalidateSelf();
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        C15400c cVar = this.drawableState;
        if (cVar.f34556h == null) {
            cVar.f34556h = new Rect();
        }
        this.drawableState.f34556h.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.drawableState.f34569u = style;
        invalidateSelfIgnoreShape();
    }

    public void setParentAbsoluteElevation(float f) {
        C15400c cVar = this.drawableState;
        if (cVar.f34561m != f) {
            cVar.f34561m = f;
            updateZ();
        }
    }

    public void setScale(float f) {
        C15400c cVar = this.drawableState;
        if (cVar.f34557i != f) {
            cVar.f34557i = f;
            invalidateSelf();
        }
    }

    public void setShadowBitmapDrawingEnable(boolean z) {
        this.shadowBitmapDrawingEnable = z;
    }

    public void setShadowColor(int i) {
        this.shadowRenderer.mo47112a(i);
        this.drawableState.f34568t = false;
        invalidateSelfIgnoreShape();
    }

    public void setShadowCompatRotation(int i) {
        C15400c cVar = this.drawableState;
        if (cVar.f34567s != i) {
            cVar.f34567s = i;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShadowCompatibilityMode(int i) {
        C15400c cVar = this.drawableState;
        if (cVar.f34564p != i) {
            cVar.f34564p = i;
            invalidateSelfIgnoreShape();
        }
    }

    @Deprecated
    public void setShadowElevation(int i) {
        setElevation((float) i);
    }

    @Deprecated
    public void setShadowEnabled(boolean z) {
        setShadowCompatibilityMode(z ^ true ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i) {
        this.drawableState.f34565q = i;
    }

    public void setShadowVerticalOffset(int i) {
        C15400c cVar = this.drawableState;
        if (cVar.f34566r != i) {
            cVar.f34566r = i;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShapeAppearanceModel(C15401a aVar) {
        this.drawableState.f34549a = aVar;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(C17584j jVar) {
        setShapeAppearanceModel(jVar);
    }

    public void setStroke(float f, int i) {
        setStrokeWidth(f);
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C15400c cVar = this.drawableState;
        if (cVar.f34552d != colorStateList) {
            cVar.f34552d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.drawableState.f34553e = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public void setStrokeWidth(float f) {
        this.drawableState.f34559k = f;
        invalidateSelf();
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.f34554f = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C15400c cVar = this.drawableState;
        if (cVar.f34555g != mode) {
            cVar.f34555g = mode;
            updateTintFilter();
            invalidateSelfIgnoreShape();
        }
    }

    public void setTranslationZ(float f) {
        C15400c cVar = this.drawableState;
        if (cVar.f34563o != f) {
            cVar.f34563o = f;
            updateZ();
        }
    }

    public void setUseTintColorForShadow(boolean z) {
        C15400c cVar = this.drawableState;
        if (cVar.f34568t != z) {
            cVar.f34568t = z;
            invalidateSelf();
        }
    }

    public void setZ(float f) {
        setTranslationZ(f - getElevation());
    }

    public MaterialShapeDrawable() {
        this(new C15401a());
    }

    public static MaterialShapeDrawable createWithElevationOverlay(Context context, float f) {
        Class<MaterialShapeDrawable> cls = MaterialShapeDrawable.class;
        int b = C14024b.m21581b(context, R.attr.colorSurface, "MaterialShapeDrawable");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(b));
        materialShapeDrawable.setElevation(f);
        return materialShapeDrawable;
    }

    private void drawShape(Canvas canvas, Paint paint, Path path2, C15401a aVar, RectF rectF2) {
        if (aVar.mo54613e(rectF2)) {
            float a = aVar.f34576f.mo68901a(rectF2) * this.drawableState.f34558j;
            canvas.drawRoundRect(rectF2, a, a, paint);
            return;
        }
        canvas.drawPath(path2, paint);
    }

    public void setCornerSize(C17577c cVar) {
        C15401a aVar = this.drawableState.f34549a;
        aVar.getClass();
        C15401a.C15402a aVar2 = new C15401a.C15402a(aVar);
        aVar2.f34587e = cVar;
        aVar2.f34588f = cVar;
        aVar2.f34589g = cVar;
        aVar2.f34590h = cVar;
        setShapeAppearanceModel(aVar2.mo54616a());
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C15401a.m24981b(context, attributeSet, i, i2).mo54616a());
    }

    public void setStroke(float f, ColorStateList colorStateList) {
        setStrokeWidth(f);
        setStrokeColor(colorStateList);
    }

    @Deprecated
    public MaterialShapeDrawable(C17584j jVar) {
        this((C15401a) jVar);
    }

    public void setStrokeTint(int i) {
        setStrokeTint(ColorStateList.valueOf(i));
    }

    public MaterialShapeDrawable(C15401a aVar) {
        this(new C15400c(aVar));
    }

    private MaterialShapeDrawable(C15400c cVar) {
        C15404b bVar;
        this.cornerShadowOperation = new C15408d.C15414f[4];
        this.edgeShadowOperation = new C15408d.C15414f[4];
        this.containsIncompatibleShadowOp = new BitSet(8);
        this.matrix = new Matrix();
        this.path = new Path();
        this.pathInsetByStroke = new Path();
        this.rectF = new RectF();
        this.insetRectF = new RectF();
        this.transparentRegion = new Region();
        this.scratchRegion = new Region();
        Paint paint = new Paint(1);
        this.fillPaint = paint;
        Paint paint2 = new Paint(1);
        this.strokePaint = paint2;
        this.shadowRenderer = new C14169a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            bVar = C15404b.C15405a.f34607a;
        } else {
            bVar = new C15404b();
        }
        this.pathProvider = bVar;
        this.pathBounds = new RectF();
        this.shadowBitmapDrawingEnable = true;
        this.drawableState = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        updateTintFilter();
        updateColorsForState(getState());
        this.pathShadowListener = new C15398a();
    }

    /* renamed from: com.google.android.material.shape.MaterialShapeDrawable$c */
    public static final class C15400c extends Drawable.ConstantState {

        /* renamed from: a */
        public C15401a f34549a;

        /* renamed from: b */
        public C18602a f34550b;

        /* renamed from: c */
        public ColorStateList f34551c = null;

        /* renamed from: d */
        public ColorStateList f34552d = null;

        /* renamed from: e */
        public ColorStateList f34553e = null;

        /* renamed from: f */
        public ColorStateList f34554f = null;

        /* renamed from: g */
        public PorterDuff.Mode f34555g = PorterDuff.Mode.SRC_IN;

        /* renamed from: h */
        public Rect f34556h = null;

        /* renamed from: i */
        public float f34557i = 1.0f;

        /* renamed from: j */
        public float f34558j = 1.0f;

        /* renamed from: k */
        public float f34559k;

        /* renamed from: l */
        public int f34560l = 255;

        /* renamed from: m */
        public float f34561m = 0.0f;

        /* renamed from: n */
        public float f34562n = 0.0f;

        /* renamed from: o */
        public float f34563o = 0.0f;

        /* renamed from: p */
        public int f34564p = 0;

        /* renamed from: q */
        public int f34565q = 0;

        /* renamed from: r */
        public int f34566r = 0;

        /* renamed from: s */
        public int f34567s = 0;

        /* renamed from: t */
        public boolean f34568t = false;

        /* renamed from: u */
        public Paint.Style f34569u = Paint.Style.FILL_AND_STROKE;

        public C15400c(C15401a aVar) {
            this.f34549a = aVar;
            this.f34550b = null;
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this, (C15398a) null);
            boolean unused = materialShapeDrawable.pathDirty = true;
            return materialShapeDrawable;
        }

        public C15400c(C15400c cVar) {
            this.f34549a = cVar.f34549a;
            this.f34550b = cVar.f34550b;
            this.f34559k = cVar.f34559k;
            this.f34551c = cVar.f34551c;
            this.f34552d = cVar.f34552d;
            this.f34555g = cVar.f34555g;
            this.f34554f = cVar.f34554f;
            this.f34560l = cVar.f34560l;
            this.f34557i = cVar.f34557i;
            this.f34566r = cVar.f34566r;
            this.f34564p = cVar.f34564p;
            this.f34568t = cVar.f34568t;
            this.f34558j = cVar.f34558j;
            this.f34561m = cVar.f34561m;
            this.f34562n = cVar.f34562n;
            this.f34563o = cVar.f34563o;
            this.f34565q = cVar.f34565q;
            this.f34567s = cVar.f34567s;
            this.f34553e = cVar.f34553e;
            this.f34569u = cVar.f34569u;
            if (cVar.f34556h != null) {
                this.f34556h = new Rect(cVar.f34556h);
            }
        }
    }
}
