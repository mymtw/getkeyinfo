package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p075d.C6614a;
import p260v0.C8184a;
import p515bl.C14091a;
import p550dl.C17585k;
import p656qk.C18465b;

public class MaterialCardView extends CardView implements Checkable, C17585k {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    private static final int[] CHECKABLE_STATE_SET = {16842911};
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int DEF_STYLE_RES = 2132018585;
    private static final int[] DRAGGED_STATE_SET = {R.attr.state_dragged};
    private static final String LOG_TAG = "MaterialCardView";
    private final C18465b cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private C15240a onCheckedChangeListener;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C15240a {
        /* renamed from: a */
        void mo53369a();
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r8.cardViewHelper;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void forceRippleRedrawIfNeeded() {
        /*
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto L_0x002a
            qk.b r0 = r8.cardViewHelper
            android.graphics.drawable.RippleDrawable r1 = r0.f40664n
            if (r1 == 0) goto L_0x002a
            android.graphics.Rect r1 = r1.getBounds()
            int r2 = r1.bottom
            android.graphics.drawable.RippleDrawable r3 = r0.f40664n
            int r4 = r1.left
            int r5 = r1.top
            int r6 = r1.right
            int r7 = r2 + -1
            r3.setBounds(r4, r5, r6, r7)
            android.graphics.drawable.RippleDrawable r0 = r0.f40664n
            int r3 = r1.left
            int r4 = r1.top
            int r1 = r1.right
            r0.setBounds(r3, r4, r1, r2)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.forceRippleRedrawIfNeeded():void");
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.cardViewHelper.f40653c.getBounds());
        return rectF;
    }

    public ColorStateList getCardBackgroundColor() {
        return this.cardViewHelper.f40653c.getFillColor();
    }

    public ColorStateList getCardForegroundColor() {
        return this.cardViewHelper.f40654d.getFillColor();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.cardViewHelper.f40659i;
    }

    public int getCheckedIconMargin() {
        return this.cardViewHelper.f40655e;
    }

    public int getCheckedIconSize() {
        return this.cardViewHelper.f40656f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.cardViewHelper.f40661k;
    }

    public int getContentPaddingBottom() {
        return this.cardViewHelper.f40652b.bottom;
    }

    public int getContentPaddingLeft() {
        return this.cardViewHelper.f40652b.left;
    }

    public int getContentPaddingRight() {
        return this.cardViewHelper.f40652b.right;
    }

    public int getContentPaddingTop() {
        return this.cardViewHelper.f40652b.top;
    }

    public float getProgress() {
        return this.cardViewHelper.f40653c.getInterpolation();
    }

    public float getRadius() {
        return this.cardViewHelper.f40653c.getTopLeftCornerResolvedSize();
    }

    public ColorStateList getRippleColor() {
        return this.cardViewHelper.f40660j;
    }

    public C15401a getShapeAppearanceModel() {
        return this.cardViewHelper.f40662l;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.cardViewHelper.f40663m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.cardViewHelper.f40663m;
    }

    public int getStrokeWidth() {
        return this.cardViewHelper.f40657g;
    }

    public boolean isCheckable() {
        C18465b bVar = this.cardViewHelper;
        return bVar != null && bVar.f40668r;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public boolean isDragged() {
        return this.dragged;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C19543e0.m33317j0(this, this.cardViewHelper.f40653c);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        if (isDragged()) {
            View.mergeDrawableStates(onCreateDrawableState, DRAGGED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        C18465b bVar = this.cardViewHelper;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (bVar.f40665o != null) {
            int i5 = bVar.f40655e;
            int i6 = bVar.f40656f;
            int i7 = (measuredWidth - i5) - i6;
            int i8 = (measuredHeight - i5) - i6;
            if (bVar.f40651a.getUseCompatPadding()) {
                float f = 0.0f;
                i8 -= (int) Math.ceil((double) (((bVar.f40651a.getMaxCardElevation() * 1.5f) + (bVar.mo69981g() ? bVar.mo69976a() : 0.0f)) * 2.0f));
                float maxCardElevation = bVar.f40651a.getMaxCardElevation();
                if (bVar.mo69981g()) {
                    f = bVar.mo69976a();
                }
                i7 -= (int) Math.ceil((double) ((maxCardElevation + f) * 2.0f));
            }
            int i9 = i8;
            int i10 = bVar.f40655e;
            MaterialCardView materialCardView = bVar.f40651a;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            if (C2364y.C2369e.m5233d(materialCardView) == 1) {
                i3 = i7;
                i4 = i10;
            } else {
                i4 = i7;
                i3 = i10;
            }
            bVar.f40665o.setLayerInset(2, i4, bVar.f40655e, i3, i9);
        }
    }

    public void setAncestorContentPadding(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            if (!this.cardViewHelper.f40667q) {
                Log.i(LOG_TAG, "Setting a custom background is not supported.");
                this.cardViewHelper.f40667q = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        C18465b bVar = this.cardViewHelper;
        bVar.f40653c.setFillColor(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C18465b bVar = this.cardViewHelper;
        bVar.f40653c.setElevation(bVar.f40651a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.cardViewHelper.f40654d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.cardViewHelper.f40668r = z;
    }

    public void setChecked(boolean z) {
        if (this.checked != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.cardViewHelper.mo69979e(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.cardViewHelper.f40655e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.cardViewHelper.f40655e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.cardViewHelper.mo69979e(C6614a.m12981a(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.cardViewHelper.f40656f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.cardViewHelper.f40656f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C18465b bVar = this.cardViewHelper;
        bVar.f40661k = colorStateList;
        Drawable drawable = bVar.f40659i;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C18465b bVar = this.cardViewHelper;
        if (bVar != null) {
            Drawable drawable = bVar.f40658h;
            Drawable c = bVar.f40651a.isClickable() ? bVar.mo69977c() : bVar.f40654d;
            bVar.f40658h = c;
            if (drawable == c) {
                return;
            }
            if (bVar.f40651a.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) bVar.f40651a.getForeground()).setDrawable(c);
            } else {
                bVar.f40651a.setForeground(bVar.mo69978d(c));
            }
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        C18465b bVar = this.cardViewHelper;
        bVar.f40652b.set(i, i2, i3, i4);
        bVar.mo69982h();
    }

    public void setDragged(boolean z) {
        if (this.dragged != z) {
            this.dragged = z;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.cardViewHelper.mo69983i();
    }

    public void setOnCheckedChangeListener(C15240a aVar) {
        this.onCheckedChangeListener = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.cardViewHelper.mo69983i();
        this.cardViewHelper.mo69982h();
    }

    public void setProgress(float f) {
        C18465b bVar = this.cardViewHelper;
        bVar.f40653c.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable = bVar.f40654d;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = bVar.f40666p;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if ((r0.f40651a.getPreventCornerOverlap() && !r0.f40653c.isRoundRect()) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setRadius(float r3) {
        /*
            r2 = this;
            super.setRadius(r3)
            qk.b r0 = r2.cardViewHelper
            com.google.android.material.shape.a r1 = r0.f40662l
            com.google.android.material.shape.a r3 = r1.mo54614f(r3)
            r0.mo69980f(r3)
            android.graphics.drawable.Drawable r3 = r0.f40658h
            r3.invalidateSelf()
            boolean r3 = r0.mo69981g()
            if (r3 != 0) goto L_0x002e
            com.google.android.material.card.MaterialCardView r3 = r0.f40651a
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L_0x002b
            com.google.android.material.shape.MaterialShapeDrawable r3 = r0.f40653c
            boolean r3 = r3.isRoundRect()
            if (r3 != 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x0031
        L_0x002e:
            r0.mo69982h()
        L_0x0031:
            boolean r3 = r0.mo69981g()
            if (r3 == 0) goto L_0x003a
            r0.mo69983i()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C18465b bVar = this.cardViewHelper;
        bVar.f40660j = colorStateList;
        int[] iArr = C14091a.f31044a;
        RippleDrawable rippleDrawable = bVar.f40664n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C18465b bVar = this.cardViewHelper;
        ColorStateList b = C8184a.m16459b(getContext(), i);
        bVar.f40660j = b;
        int[] iArr = C14091a.f31044a;
        RippleDrawable rippleDrawable = bVar.f40664n;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(b);
        }
    }

    public void setShapeAppearanceModel(C15401a aVar) {
        setClipToOutline(aVar.mo54613e(getBoundsAsRectF()));
        this.cardViewHelper.mo69980f(aVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        C18465b bVar = this.cardViewHelper;
        if (i != bVar.f40657g) {
            bVar.f40657g = i;
            bVar.f40654d.setStroke((float) i, bVar.f40663m);
        }
        invalidate();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.cardViewHelper.mo69983i();
        this.cardViewHelper.mo69982h();
    }

    public void toggle() {
        if (isCheckable() && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            C18465b bVar = this.cardViewHelper;
            boolean z = this.checked;
            Drawable drawable = bVar.f40659i;
            if (drawable != null) {
                drawable.setAlpha(z ? 255 : 0);
            }
            C15240a aVar = this.onCheckedChangeListener;
            if (aVar != null) {
                aVar.mo53369a();
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C18465b bVar = this.cardViewHelper;
        if (bVar.f40663m != colorStateList) {
            bVar.f40663m = colorStateList;
            bVar.f40654d.setStroke((float) bVar.f40657g, colorStateList);
        }
        invalidate();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r9 = p574gl.C17790a.m29918a(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            r9 = 0
            r8.checked = r9
            r8.dragged = r9
            r7 = 1
            r8.isParentCardViewDoneInitializing = r7
            android.content.Context r0 = r8.getContext()
            int[] r2 = p610kp.C18161c.f39663F
            int[] r5 = new int[r9]
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            qk.b r1 = new qk.b
            r1.<init>(r8, r10, r11, r6)
            r8.cardViewHelper = r1
            android.content.res.ColorStateList r10 = super.getCardBackgroundColor()
            com.google.android.material.shape.MaterialShapeDrawable r11 = r1.f40653c
            r11.setFillColor(r10)
            int r10 = super.getContentPaddingLeft()
            int r11 = super.getContentPaddingTop()
            int r2 = super.getContentPaddingRight()
            int r3 = super.getContentPaddingBottom()
            android.graphics.Rect r4 = r1.f40652b
            r4.set(r10, r11, r2, r3)
            r1.mo69982h()
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            android.content.Context r10 = r10.getContext()
            r11 = 10
            android.content.res.ColorStateList r10 = p507al.C14025c.m21582a(r10, r0, r11)
            r1.f40663m = r10
            if (r10 != 0) goto L_0x005f
            r10 = -1
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            r1.f40663m = r10
        L_0x005f:
            r10 = 11
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r1.f40657g = r10
            boolean r10 = r0.getBoolean(r9, r9)
            r1.f40668r = r10
            com.google.android.material.card.MaterialCardView r11 = r1.f40651a
            r11.setLongClickable(r10)
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            android.content.Context r10 = r10.getContext()
            r11 = 5
            android.content.res.ColorStateList r10 = p507al.C14025c.m21582a(r10, r0, r11)
            r1.f40661k = r10
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            android.content.Context r10 = r10.getContext()
            r11 = 2
            android.graphics.drawable.Drawable r10 = p507al.C14025c.m21585d(r10, r0, r11)
            r1.mo69979e(r10)
            r10 = 4
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r1.f40656f = r10
            r10 = 3
            int r10 = r0.getDimensionPixelSize(r10, r9)
            r1.f40655e = r10
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            android.content.Context r10 = r10.getContext()
            r11 = 6
            android.content.res.ColorStateList r10 = p507al.C14025c.m21582a(r10, r0, r11)
            r1.f40660j = r10
            if (r10 != 0) goto L_0x00b9
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            r11 = 2130969044(0x7f0401d4, float:1.7546759E38)
            int r10 = androidx.compose.p015ui.text.input.C1993m.m4344E(r11, r10)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            r1.f40660j = r10
        L_0x00b9:
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            android.content.Context r10 = r10.getContext()
            android.content.res.ColorStateList r10 = p507al.C14025c.m21582a(r10, r0, r7)
            com.google.android.material.shape.MaterialShapeDrawable r11 = r1.f40654d
            if (r10 != 0) goto L_0x00cb
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r9)
        L_0x00cb:
            r11.setFillColor(r10)
            int[] r9 = p515bl.C14091a.f31044a
            android.graphics.drawable.RippleDrawable r9 = r1.f40664n
            if (r9 == 0) goto L_0x00d9
            android.content.res.ColorStateList r10 = r1.f40660j
            r9.setColor(r10)
        L_0x00d9:
            com.google.android.material.shape.MaterialShapeDrawable r9 = r1.f40653c
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            float r10 = r10.getCardElevation()
            r9.setElevation(r10)
            com.google.android.material.shape.MaterialShapeDrawable r9 = r1.f40654d
            int r10 = r1.f40657g
            float r10 = (float) r10
            android.content.res.ColorStateList r11 = r1.f40663m
            r9.setStroke((float) r10, (android.content.res.ColorStateList) r11)
            com.google.android.material.card.MaterialCardView r9 = r1.f40651a
            com.google.android.material.shape.MaterialShapeDrawable r10 = r1.f40653c
            qk.a r10 = r1.mo69978d(r10)
            r9.setBackgroundInternal(r10)
            com.google.android.material.card.MaterialCardView r9 = r1.f40651a
            boolean r9 = r9.isClickable()
            if (r9 == 0) goto L_0x0106
            android.graphics.drawable.LayerDrawable r9 = r1.mo69977c()
            goto L_0x0108
        L_0x0106:
            com.google.android.material.shape.MaterialShapeDrawable r9 = r1.f40654d
        L_0x0108:
            r1.f40658h = r9
            com.google.android.material.card.MaterialCardView r10 = r1.f40651a
            qk.a r9 = r1.mo69978d(r9)
            r10.setForeground(r9)
            r0.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.f40653c.setFillColor(colorStateList);
    }
}
