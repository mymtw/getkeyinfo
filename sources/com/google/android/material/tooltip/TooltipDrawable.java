package com.google.android.material.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.C15362e;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import p507al.C14026d;
import p550dl.C17579e;
import p550dl.C17580f;
import p550dl.C17581g;
import p629nk.C18268a;

public class TooltipDrawable extends MaterialShapeDrawable implements C15362e.C15364b {
    private static final int DEFAULT_STYLE = 2132018676;
    private static final int DEFAULT_THEME_ATTR = 2130970115;
    private int arrowSize;
    private final View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final Context context;
    private final Rect displayFrame;
    private final Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private CharSequence text;
    private final C15362e textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    /* renamed from: com.google.android.material.tooltip.TooltipDrawable$a */
    public class C15540a implements View.OnLayoutChangeListener {
        public C15540a() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            TooltipDrawable.this.updateLocationOnScreen(view);
        }
    }

    private TooltipDrawable(Context context2, AttributeSet attributeSet, int i, int i2) {
        super(context2, attributeSet, i, i2);
        C15362e eVar = new C15362e(this);
        this.textDrawableHelper = eVar;
        this.attachedViewLayoutChangeListener = new C15540a();
        this.displayFrame = new Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context2;
        eVar.f34505a.density = context2.getResources().getDisplayMetrics().density;
        eVar.f34505a.setTextAlign(Paint.Align.CENTER);
    }

    private float calculatePointerOffset() {
        int i;
        if (((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin < 0) {
            i = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else if (((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin <= 0) {
            return 0.0f;
        } else {
            i = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        }
        return (float) i;
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.f34505a.getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics2 = this.fontMetrics;
        return (fontMetrics2.descent + fontMetrics2.ascent) / 2.0f;
    }

    private float calculateTextOriginAndAlignment(Rect rect) {
        return ((float) rect.centerY()) - calculateTextCenterFromBaseline();
    }

    public static TooltipDrawable create(Context context2) {
        return createFromAttributes(context2, (AttributeSet) null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    public static TooltipDrawable createFromAttributes(Context context2, AttributeSet attributeSet, int i, int i2) {
        TooltipDrawable tooltipDrawable = new TooltipDrawable(context2, attributeSet, i, i2);
        tooltipDrawable.loadFromAttributes(attributeSet, i, i2);
        return tooltipDrawable;
    }

    private C17579e createMarkerEdge() {
        float width = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.arrowSize)))) / 2.0f;
        return new C17581g(new C17580f((float) this.arrowSize), Math.min(Math.max(-calculatePointerOffset(), -width), width));
    }

    private void drawText(Canvas canvas) {
        if (this.text != null) {
            Rect bounds = getBounds();
            int calculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(bounds);
            C15362e eVar = this.textDrawableHelper;
            if (eVar.f34510f != null) {
                eVar.f34505a.drawableState = getState();
                C15362e eVar2 = this.textDrawableHelper;
                eVar2.f34510f.mo46847e(this.context, eVar2.f34505a, eVar2.f34506b);
                this.textDrawableHelper.f34505a.setAlpha((int) (this.labelOpacity * 255.0f));
            }
            CharSequence charSequence = this.text;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) calculateTextOriginAndAlignment, this.textDrawableHelper.f34505a);
        }
    }

    private float getTextWidth() {
        CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textDrawableHelper.mo54198a(charSequence.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0047, code lost:
        r10 = r8.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void loadFromAttributes(android.util.AttributeSet r8, int r9, int r10) {
        /*
            r7 = this;
            android.content.Context r0 = r7.context
            int[] r2 = p610kp.C18161c.f39707q1
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            android.content.Context r9 = r7.context
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131166160(0x7f0703d0, float:1.7946558E38)
            int r9 = r9.getDimensionPixelSize(r10)
            r7.arrowSize = r9
            com.google.android.material.shape.a r9 = r7.getShapeAppearanceModel()
            r9.getClass()
            com.google.android.material.shape.a$a r10 = new com.google.android.material.shape.a$a
            r10.<init>(r9)
            dl.e r9 = r7.createMarkerEdge()
            r10.f34593k = r9
            com.google.android.material.shape.a r9 = new com.google.android.material.shape.a
            r9.<init>(r10)
            r7.setShapeAppearanceModel(r9)
            r9 = 6
            java.lang.CharSequence r9 = r8.getText(r9)
            r7.setText(r9)
            android.content.Context r9 = r7.context
            boolean r10 = r8.hasValue(r6)
            if (r10 == 0) goto L_0x0053
            int r10 = r8.getResourceId(r6, r6)
            if (r10 == 0) goto L_0x0053
            al.d r0 = new al.d
            r0.<init>(r9, r10)
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 == 0) goto L_0x0065
            r9 = 1
            boolean r10 = r8.hasValue(r9)
            if (r10 == 0) goto L_0x0065
            android.content.Context r10 = r7.context
            android.content.res.ColorStateList r9 = p507al.C14025c.m21582a(r10, r8, r9)
            r0.f30868j = r9
        L_0x0065:
            r7.setTextAppearance(r0)
            android.content.Context r9 = r7.context
            r10 = 2130969048(0x7f0401d8, float:1.7546767E38)
            java.lang.Class<com.google.android.material.tooltip.TooltipDrawable> r0 = com.google.android.material.tooltip.TooltipDrawable.class
            java.lang.String r0 = r0.getCanonicalName()
            int r9 = p507al.C14024b.m21581b(r9, r10, r0)
            android.content.Context r10 = r7.context
            r0 = 16842801(0x1010031, float:2.3693695E-38)
            java.lang.Class<com.google.android.material.tooltip.TooltipDrawable> r1 = com.google.android.material.tooltip.TooltipDrawable.class
            java.lang.String r1 = r1.getCanonicalName()
            int r10 = p507al.C14024b.m21581b(r10, r0, r1)
            r0 = 229(0xe5, float:3.21E-43)
            int r10 = p289y0.C8351c.m16666h(r10, r0)
            r0 = 153(0x99, float:2.14E-43)
            int r9 = p289y0.C8351c.m16666h(r9, r0)
            int r9 = p289y0.C8351c.m16664f(r9, r10)
            r10 = 7
            int r9 = r8.getColor(r10, r9)
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r7.setFillColor(r9)
            android.content.Context r9 = r7.context
            r10 = 2130969073(0x7f0401f1, float:1.7546818E38)
            java.lang.Class<com.google.android.material.tooltip.TooltipDrawable> r0 = com.google.android.material.tooltip.TooltipDrawable.class
            java.lang.String r0 = r0.getCanonicalName()
            int r9 = p507al.C14024b.m21581b(r9, r10, r0)
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r9)
            r7.setStrokeColor(r9)
            r9 = 2
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.padding = r9
            r9 = 4
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.minWidth = r9
            r9 = 5
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.minHeight = r9
            r9 = 3
            int r9 = r8.getDimensionPixelSize(r9, r6)
            r7.layoutMargin = r9
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tooltip.TooltipDrawable.loadFromAttributes(android.util.AttributeSet, int, int):void");
    }

    /* access modifiers changed from: private */
    public void updateLocationOnScreen(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.locationOnScreenX = iArr[0];
        view.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    public void detachView(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
        }
    }

    public void draw(Canvas canvas) {
        canvas.save();
        float calculatePointerOffset = calculatePointerOffset();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, (((float) getBounds().width()) * 0.5f) + ((float) getBounds().left), (((float) getBounds().height()) * this.tooltipPivotY) + ((float) getBounds().top));
        canvas.translate(calculatePointerOffset, (float) (-((sqrt * ((double) this.arrowSize)) - ((double) this.arrowSize))));
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.textDrawableHelper.f34505a.getTextSize(), (float) this.minHeight);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.padding * 2)) + getTextWidth(), (float) this.minWidth);
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public CharSequence getText() {
        return this.text;
    }

    public C14026d getTextAppearance() {
        return this.textDrawableHelper.f34510f;
    }

    public int getTextPadding() {
        return this.padding;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C15401a shapeAppearanceModel = getShapeAppearanceModel();
        shapeAppearanceModel.getClass();
        C15401a.C15402a aVar = new C15401a.C15402a(shapeAppearanceModel);
        aVar.f34593k = createMarkerEdge();
        setShapeAppearanceModel(aVar.mo54616a());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setLayoutMargin(int i) {
        this.layoutMargin = i;
        invalidateSelf();
    }

    public void setMinHeight(int i) {
        this.minHeight = i;
        invalidateSelf();
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        invalidateSelf();
    }

    public void setRelativeToView(View view) {
        if (view != null) {
            updateLocationOnScreen(view);
            view.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
        }
    }

    public void setRevealFraction(float f) {
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f;
        this.tooltipScaleY = f;
        this.labelOpacity = C18268a.m30884a(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textDrawableHelper.f34508d = true;
            invalidateSelf();
        }
    }

    public void setTextAppearance(C14026d dVar) {
        this.textDrawableHelper.mo54199b(dVar, this.context);
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(new C14026d(this.context, i));
    }

    public void setTextPadding(int i) {
        this.padding = i;
        invalidateSelf();
    }

    public void setTextResource(int i) {
        setText(this.context.getResources().getString(i));
    }

    public static TooltipDrawable createFromAttributes(Context context2, AttributeSet attributeSet) {
        return createFromAttributes(context2, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }
}
