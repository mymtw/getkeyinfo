package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import com.etsy.android.R;
import com.google.android.material.shape.C15401a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p075d.C6614a;
import p260v0.C8184a;
import p515bl.C14091a;
import p550dl.C17585k;

public class MaterialButton extends AppCompatButton implements Checkable, C17585k {
    private static final int[] CHECKABLE_STATE_SET = {16842911};
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int DEF_STYLE_RES = 2132018573;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final C15239a materialButtonHelper;
    private final LinkedHashSet<C15231a> onCheckedChangeListeners;
    private C15232b onPressedChangeListenerInternal;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15230a();

        /* renamed from: b */
        public boolean f34163b;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        public static class C15230a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f34163b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f34163b = parcel.readInt() != 1 ? false : true;
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C15231a {
        /* renamed from: a */
        void mo53296a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C15232b {
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private String getA11yClassName() {
        return (isCheckable() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private boolean isIconEnd() {
        int i = this.iconGravity;
        return i == 3 || i == 4;
    }

    private boolean isIconStart() {
        int i = this.iconGravity;
        return i == 1 || i == 2;
    }

    private boolean isIconTop() {
        int i = this.iconGravity;
        return i == 16 || i == 32;
    }

    private boolean isLayoutRTL() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return C2364y.C2369e.m5233d(this) == 1;
    }

    private boolean isUsingOriginalBackground() {
        C15239a aVar = this.materialButtonHelper;
        return aVar != null && !aVar.f34187o;
    }

    private void resetIconDrawable() {
        if (isIconStart()) {
            setCompoundDrawablesRelative(this.icon, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (isIconEnd()) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.icon, (Drawable) null);
        } else if (isIconTop()) {
            setCompoundDrawablesRelative((Drawable) null, this.icon, (Drawable) null, (Drawable) null);
        }
    }

    private void updateIcon(boolean z) {
        Drawable drawable = this.icon;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.icon = mutate;
            mutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int i = this.iconSize;
            if (i == 0) {
                i = this.icon.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i3 = this.iconLeft;
            int i4 = this.iconTop;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.icon.setVisible(true, z);
        }
        if (z) {
            resetIconDrawable();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!isIconStart() || drawable3 == this.icon) && ((!isIconEnd() || drawable5 == this.icon) && (!isIconTop() || drawable4 == this.icon))) {
            z2 = false;
        }
        if (z2) {
            resetIconDrawable();
        }
    }

    private void updateIconPosition(int i, int i2) {
        if (this.icon != null && getLayout() != null) {
            if (isIconStart() || isIconEnd()) {
                this.iconTop = 0;
                int i3 = this.iconGravity;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.iconLeft = 0;
                    updateIcon(false);
                    return;
                }
                int i4 = this.iconSize;
                if (i4 == 0) {
                    i4 = this.icon.getIntrinsicWidth();
                }
                int textWidth = i - getTextWidth();
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                int e = ((((textWidth - C2364y.C2369e.m5234e(this)) - i4) - this.iconPadding) - C2364y.C2369e.m5235f(this)) / 2;
                boolean isLayoutRTL = isLayoutRTL();
                if (this.iconGravity != 4) {
                    z = false;
                }
                if (isLayoutRTL != z) {
                    e = -e;
                }
                if (this.iconLeft != e) {
                    this.iconLeft = e;
                    updateIcon(false);
                }
            } else if (isIconTop()) {
                this.iconLeft = 0;
                if (this.iconGravity == 16) {
                    this.iconTop = 0;
                    updateIcon(false);
                    return;
                }
                int i5 = this.iconSize;
                if (i5 == 0) {
                    i5 = this.icon.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.iconPadding) - getPaddingBottom()) / 2;
                if (this.iconTop != textHeight) {
                    this.iconTop = textHeight;
                    updateIcon(false);
                }
            }
        }
    }

    public void addOnCheckedChangeListener(C15231a aVar) {
        this.onCheckedChangeListeners.add(aVar);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f34179g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.f34178f;
    }

    public int getInsetTop() {
        return this.materialButtonHelper.f34177e;
    }

    public ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f34184l;
        }
        return null;
    }

    public C15401a getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f34174b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f34183k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.f34180h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.f34182j : super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return isUsingOriginalBackground() ? this.materialButtonHelper.f34181i : super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        C15239a aVar = this.materialButtonHelper;
        return aVar != null && aVar.f34189q;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            C19543e0.m33317j0(this, this.materialButtonHelper.mo53322b(false));
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f34163b);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f34163b = this.checked;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateIconPosition(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(C15231a aVar) {
        this.onCheckedChangeListeners.remove(aVar);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            if (aVar.mo53322b(false) != null) {
                aVar.mo53322b(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w(LOG_TAG, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            C15239a aVar = this.materialButtonHelper;
            aVar.f34187o = true;
            aVar.f34173a.setSupportBackgroundTintList(aVar.f34182j);
            aVar.f34173a.setSupportBackgroundTintMode(aVar.f34181i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C6614a.m12981a(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.f34189q = z;
        }
    }

    public void setChecked(boolean z) {
        if (isCheckable() && isEnabled() && this.checked != z) {
            this.checked = z;
            refreshDrawableState();
            if (!this.broadcasting) {
                this.broadcasting = true;
                Iterator<C15231a> it = this.onCheckedChangeListeners.iterator();
                while (it.hasNext()) {
                    it.next().mo53296a(this, this.checked);
                }
                this.broadcasting = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            if (!aVar.f34188p || aVar.f34179g != i) {
                aVar.f34179g = i;
                aVar.f34188p = true;
                aVar.mo53323c(aVar.f34174b.mo54614f((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.mo53322b(false).setElevation(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.iconGravity != i) {
            this.iconGravity = i;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.iconPadding != i) {
            this.iconPadding = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C6614a.m12981a(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.iconSize != i) {
            this.iconSize = i;
            updateIcon(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C8184a.m16459b(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C15239a aVar = this.materialButtonHelper;
        aVar.mo53324d(aVar.f34177e, i);
    }

    public void setInsetTop(int i) {
        C15239a aVar = this.materialButtonHelper;
        aVar.mo53324d(i, aVar.f34178f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C15232b bVar) {
        this.onPressedChangeListenerInternal = bVar;
    }

    public void setPressed(boolean z) {
        C15232b bVar = this.onPressedChangeListenerInternal;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            if (aVar.f34184l != colorStateList) {
                aVar.f34184l = colorStateList;
                if (aVar.f34173a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) aVar.f34173a.getBackground()).setColor(C14091a.m21809c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setRippleColor(C8184a.m16459b(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(C15401a aVar) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.mo53323c(aVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            aVar.f34186n = z;
            aVar.mo53326f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            if (aVar.f34183k != colorStateList) {
                aVar.f34183k = colorStateList;
                aVar.mo53326f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(C8184a.m16459b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            if (aVar.f34180h != i) {
                aVar.f34180h = i;
                aVar.mo53326f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            if (aVar.f34182j != colorStateList) {
                aVar.f34182j = colorStateList;
                if (aVar.mo53322b(false) != null) {
                    aVar.mo53322b(false).setTintList(aVar.f34182j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (isUsingOriginalBackground()) {
            C15239a aVar = this.materialButtonHelper;
            if (aVar.f34181i != mode) {
                aVar.f34181i = mode;
                if (aVar.mo53322b(false) != null && aVar.f34181i != null) {
                    aVar.mo53322b(false).setTintMode(aVar.f34181i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void toggle() {
        setChecked(!this.checked);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = DEF_STYLE_RES
            android.content.Context r9 = p574gl.C17790a.m29918a(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.onCheckedChangeListeners = r9
            r9 = 0
            r8.checked = r9
            r8.broadcasting = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p610kp.C18161c.f39659B
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C15367g.m24957d(r0, r1, r2, r3, r4, r5)
            r1 = 12
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconPadding = r1
            r1 = 15
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C15370j.m24964e(r1, r3)
            r8.iconTintMode = r1
            android.content.Context r1 = r8.getContext()
            r3 = 14
            android.content.res.ColorStateList r1 = p507al.C14025c.m21582a(r1, r0, r3)
            r8.iconTint = r1
            android.content.Context r1 = r8.getContext()
            r3 = 10
            android.graphics.drawable.Drawable r1 = p507al.C14025c.m21585d(r1, r0, r3)
            r8.icon = r1
            r1 = 11
            r3 = 1
            int r1 = r0.getInteger(r1, r3)
            r8.iconGravity = r1
            r1 = 13
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconSize = r1
            com.google.android.material.shape.a$a r10 = com.google.android.material.shape.C15401a.m24981b(r7, r10, r11, r6)
            com.google.android.material.shape.a r11 = new com.google.android.material.shape.a
            r11.<init>(r10)
            com.google.android.material.button.a r10 = new com.google.android.material.button.a
            r10.<init>(r8, r11)
            r8.materialButtonHelper = r10
            int r11 = r0.getDimensionPixelOffset(r3, r9)
            r10.f34175c = r11
            r11 = 2
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f34176d = r11
            r11 = 3
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f34177e = r11
            r11 = 4
            int r11 = r0.getDimensionPixelOffset(r11, r9)
            r10.f34178f = r11
            r11 = 8
            boolean r1 = r0.hasValue(r11)
            if (r1 == 0) goto L_0x00aa
            int r11 = r0.getDimensionPixelSize(r11, r2)
            r10.f34179g = r11
            com.google.android.material.shape.a r1 = r10.f34174b
            float r11 = (float) r11
            com.google.android.material.shape.a r11 = r1.mo54614f(r11)
            r10.mo53323c(r11)
            r10.f34188p = r3
        L_0x00aa:
            r11 = 20
            int r11 = r0.getDimensionPixelSize(r11, r9)
            r10.f34180h = r11
            r11 = 7
            int r11 = r0.getInt(r11, r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r11 = com.google.android.material.internal.C15370j.m24964e(r11, r1)
            r10.f34181i = r11
            android.content.Context r11 = r8.getContext()
            r1 = 6
            android.content.res.ColorStateList r11 = p507al.C14025c.m21582a(r11, r0, r1)
            r10.f34182j = r11
            android.content.Context r11 = r8.getContext()
            r1 = 19
            android.content.res.ColorStateList r11 = p507al.C14025c.m21582a(r11, r0, r1)
            r10.f34183k = r11
            android.content.Context r11 = r8.getContext()
            r1 = 16
            android.content.res.ColorStateList r11 = p507al.C14025c.m21582a(r11, r0, r1)
            r10.f34184l = r11
            r11 = 5
            boolean r11 = r0.getBoolean(r11, r9)
            r10.f34189q = r11
            r11 = 9
            int r11 = r0.getDimensionPixelSize(r11, r9)
            r10.f34191s = r11
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r11 = androidx.core.view.C2364y.f5646a
            int r11 = androidx.core.view.C2364y.C2369e.m5235f(r8)
            int r1 = r8.getPaddingTop()
            int r2 = androidx.core.view.C2364y.C2369e.m5234e(r8)
            int r4 = r8.getPaddingBottom()
            boolean r5 = r0.hasValue(r9)
            if (r5 == 0) goto L_0x0116
            r10.f34187o = r3
            android.content.res.ColorStateList r5 = r10.f34182j
            r8.setSupportBackgroundTintList(r5)
            android.graphics.PorterDuff$Mode r5 = r10.f34181i
            r8.setSupportBackgroundTintMode(r5)
            goto L_0x0119
        L_0x0116:
            r10.mo53325e()
        L_0x0119:
            int r5 = r10.f34175c
            int r11 = r11 + r5
            int r5 = r10.f34177e
            int r1 = r1 + r5
            int r5 = r10.f34176d
            int r2 = r2 + r5
            int r10 = r10.f34178f
            int r4 = r4 + r10
            androidx.core.view.C2364y.C2369e.m5240k(r8, r11, r1, r2, r4)
            r0.recycle()
            int r10 = r8.iconPadding
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.icon
            if (r10 == 0) goto L_0x0135
            r9 = r3
        L_0x0135:
            r8.updateIcon(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
