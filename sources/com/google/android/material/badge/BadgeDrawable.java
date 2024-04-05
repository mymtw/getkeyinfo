package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.google.android.material.internal.C15362e;
import com.google.android.material.internal.C15367g;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import p507al.C14025c;
import p507al.C14026d;
import p610kp.C18161c;
import p680tk.C18558a;

public class BadgeDrawable extends Drawable implements C15362e.C15364b {
    private static final int BADGE_NUMBER_NONE = -1;
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    public static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    private static final int DEFAULT_STYLE = 2132018564;
    private static final int DEFAULT_THEME_ATTR = 2130968671;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;
    private WeakReference<View> anchorViewRef;
    private final Rect badgeBounds = new Rect();
    private float badgeCenterX;
    private float badgeCenterY;
    private float badgeRadius;
    private float badgeWidePadding;
    private float badgeWithTextRadius;
    private final WeakReference<Context> contextRef;
    private float cornerRadius;
    private WeakReference<FrameLayout> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;
    private final SavedState savedState;
    private final MaterialShapeDrawable shapeDrawable = new MaterialShapeDrawable();
    private final C15362e textDrawableHelper;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    public class C15193a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f34088b;

        /* renamed from: c */
        public final /* synthetic */ FrameLayout f34089c;

        public C15193a(View view, FrameLayout frameLayout) {
            this.f34088b = view;
            this.f34089c = frameLayout;
        }

        public final void run() {
            BadgeDrawable.this.updateBadgeCoordinates(this.f34088b, this.f34089c);
        }
    }

    private BadgeDrawable(Context context) {
        this.contextRef = new WeakReference<>(context);
        C15367g.m24956c(context, C15367g.f34514b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.badgeRadius = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.badgeWidePadding = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.badgeWithTextRadius = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        C15362e eVar = new C15362e(this);
        this.textDrawableHelper = eVar;
        eVar.f34505a.setTextAlign(Paint.Align.CENTER);
        this.savedState = new SavedState(context);
        setTextAppearanceResource(2132018027);
    }

    private void calculateCenterAndBounds(Context context, Rect rect, View view) {
        int totalVerticalOffsetForState = getTotalVerticalOffsetForState();
        int access$500 = this.savedState.badgeGravity;
        if (access$500 == 8388691 || access$500 == 8388693) {
            this.badgeCenterY = (float) (rect.bottom - totalVerticalOffsetForState);
        } else {
            this.badgeCenterY = (float) (rect.top + totalVerticalOffsetForState);
        }
        if (getNumber() <= 9) {
            float f = !hasNumber() ? this.badgeRadius : this.badgeWithTextRadius;
            this.cornerRadius = f;
            this.halfBadgeHeight = f;
            this.halfBadgeWidth = f;
        } else {
            float f2 = this.badgeWithTextRadius;
            this.cornerRadius = f2;
            this.halfBadgeHeight = f2;
            this.halfBadgeWidth = (this.textDrawableHelper.mo54198a(getBadgeText()) / 2.0f) + this.badgeWidePadding;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(hasNumber() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
        int totalHorizontalOffsetForState = getTotalHorizontalOffsetForState();
        int access$5002 = this.savedState.badgeGravity;
        if (access$5002 == 8388659 || access$5002 == 8388691) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            this.badgeCenterX = C2364y.C2369e.m5233d(view) == 0 ? (((float) rect.left) - this.halfBadgeWidth) + ((float) dimensionPixelSize) + ((float) totalHorizontalOffsetForState) : ((((float) rect.right) + this.halfBadgeWidth) - ((float) dimensionPixelSize)) - ((float) totalHorizontalOffsetForState);
            return;
        }
        WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
        this.badgeCenterX = C2364y.C2369e.m5233d(view) == 0 ? ((((float) rect.right) + this.halfBadgeWidth) - ((float) dimensionPixelSize)) - ((float) totalHorizontalOffsetForState) : (((float) rect.left) - this.halfBadgeWidth) + ((float) dimensionPixelSize) + ((float) totalHorizontalOffsetForState);
    }

    public static BadgeDrawable create(Context context) {
        return createFromAttributes(context, (AttributeSet) null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    private static BadgeDrawable createFromAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.loadDefaultStateFromAttributes(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    public static BadgeDrawable createFromResource(Context context, int i) {
        AttributeSet a = C18558a.m31317a(context, i, "badge");
        int styleAttribute = a.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = DEFAULT_STYLE;
        }
        return createFromAttributes(context, a, DEFAULT_THEME_ATTR, styleAttribute);
    }

    public static BadgeDrawable createFromSavedState(Context context, SavedState savedState2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.restoreFromSavedState(savedState2);
        return badgeDrawable;
    }

    private void drawText(Canvas canvas) {
        Rect rect = new Rect();
        String badgeText = getBadgeText();
        this.textDrawableHelper.f34505a.getTextBounds(badgeText, 0, badgeText.length(), rect);
        canvas.drawText(badgeText, this.badgeCenterX, this.badgeCenterY + ((float) (rect.height() / 2)), this.textDrawableHelper.f34505a);
    }

    private String getBadgeText() {
        if (getNumber() <= this.maxBadgeNumber) {
            return NumberFormat.getInstance().format((long) getNumber());
        }
        Context context = this.contextRef.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.maxBadgeNumber), DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX});
    }

    private int getTotalHorizontalOffsetForState() {
        return this.savedState.additionalHorizontalOffset + (hasNumber() ? this.savedState.horizontalOffsetWithText : this.savedState.horizontalOffsetWithoutText);
    }

    private int getTotalVerticalOffsetForState() {
        return this.savedState.additionalVerticalOffset + (hasNumber() ? this.savedState.verticalOffsetWithText : this.savedState.verticalOffsetWithoutText);
    }

    private void loadDefaultStateFromAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray d = C15367g.m24957d(context, attributeSet, C18161c.f39686e, i, i2, new int[0]);
        setMaxCharacterCount(d.getInt(8, 4));
        if (d.hasValue(9)) {
            setNumber(d.getInt(9, 0));
        }
        setBackgroundColor(readColorFromAttributes(context, d, 0));
        if (d.hasValue(3)) {
            setBadgeTextColor(readColorFromAttributes(context, d, 3));
        }
        setBadgeGravity(d.getInt(1, TOP_END));
        setHorizontalOffsetWithoutText(d.getDimensionPixelOffset(6, 0));
        setVerticalOffsetWithoutText(d.getDimensionPixelOffset(10, 0));
        setHorizontalOffsetWithText(d.getDimensionPixelOffset(7, getHorizontalOffsetWithoutText()));
        setVerticalOffsetWithText(d.getDimensionPixelOffset(11, getVerticalOffsetWithoutText()));
        if (d.hasValue(2)) {
            this.badgeRadius = (float) d.getDimensionPixelSize(2, (int) this.badgeRadius);
        }
        if (d.hasValue(4)) {
            this.badgeWidePadding = (float) d.getDimensionPixelSize(4, (int) this.badgeWidePadding);
        }
        if (d.hasValue(5)) {
            this.badgeWithTextRadius = (float) d.getDimensionPixelSize(5, (int) this.badgeWithTextRadius);
        }
        d.recycle();
    }

    private static int readColorFromAttributes(Context context, TypedArray typedArray, int i) {
        return C14025c.m21582a(context, typedArray, i).getDefaultColor();
    }

    private void restoreFromSavedState(SavedState savedState2) {
        setMaxCharacterCount(savedState2.maxCharacterCount);
        if (savedState2.number != -1) {
            setNumber(savedState2.number);
        }
        setBackgroundColor(savedState2.backgroundColor);
        setBadgeTextColor(savedState2.badgeTextColor);
        setBadgeGravity(savedState2.badgeGravity);
        setHorizontalOffsetWithoutText(savedState2.horizontalOffsetWithoutText);
        setVerticalOffsetWithoutText(savedState2.verticalOffsetWithoutText);
        setHorizontalOffsetWithText(savedState2.horizontalOffsetWithText);
        setVerticalOffsetWithText(savedState2.verticalOffsetWithText);
        setAdditionalHorizontalOffset(savedState2.additionalHorizontalOffset);
        setAdditionalVerticalOffset(savedState2.additionalVerticalOffset);
        setVisible(savedState2.isVisible);
    }

    private void setTextAppearance(C14026d dVar) {
        Context context;
        if (this.textDrawableHelper.f34510f != dVar && (context = this.contextRef.get()) != null) {
            this.textDrawableHelper.mo54199b(dVar, context);
            updateCenterAndBounds();
        }
    }

    private void setTextAppearanceResource(int i) {
        Context context = this.contextRef.get();
        if (context != null) {
            setTextAppearance(new C14026d(context, i));
        }
    }

    private void tryWrapAnchorInCompatParent(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != R.id.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
            if (weakReference == null || weakReference.get() != viewGroup) {
                updateAnchorParentToNotClip(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(R.id.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.customBadgeParentRef = new WeakReference<>(frameLayout);
                frameLayout.post(new C15193a(view, frameLayout));
            }
        }
    }

    private static void updateAnchorParentToNotClip(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void updateCenterAndBounds() {
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.badgeBounds);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            calculateCenterAndBounds(context, rect2, view);
            Rect rect3 = this.badgeBounds;
            float f = this.badgeCenterX;
            float f2 = this.badgeCenterY;
            float f3 = this.halfBadgeWidth;
            float f4 = this.halfBadgeHeight;
            rect3.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
            this.shapeDrawable.setCornerSize(this.cornerRadius);
            if (!rect.equals(this.badgeBounds)) {
                this.shapeDrawable.setBounds(this.badgeBounds);
            }
        }
    }

    private void updateMaxBadgeNumber() {
        this.maxBadgeNumber = ((int) Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
    }

    public void clearNumber() {
        int unused = this.savedState.number = -1;
        updateCenterAndBounds();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.shapeDrawable.draw(canvas);
            if (hasNumber()) {
                drawText(canvas);
            }
        }
    }

    public int getAdditionalHorizontalOffset() {
        return this.savedState.additionalHorizontalOffset;
    }

    public int getAdditionalVerticalOffset() {
        return this.savedState.additionalVerticalOffset;
    }

    public int getAlpha() {
        return this.savedState.alpha;
    }

    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.savedState.badgeGravity;
    }

    public int getBadgeTextColor() {
        return this.textDrawableHelper.f34505a.getColor();
    }

    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!hasNumber()) {
            return this.savedState.contentDescriptionNumberless;
        }
        if (this.savedState.contentDescriptionQuantityStrings <= 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        if (getNumber() <= this.maxBadgeNumber) {
            return context.getResources().getQuantityString(this.savedState.contentDescriptionQuantityStrings, getNumber(), new Object[]{Integer.valueOf(getNumber())});
        }
        return context.getString(this.savedState.contentDescriptionExceedsMaxBadgeNumberRes, new Object[]{Integer.valueOf(this.maxBadgeNumber)});
    }

    public FrameLayout getCustomBadgeParent() {
        WeakReference<FrameLayout> weakReference = this.customBadgeParentRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getHorizontalOffset() {
        return this.savedState.horizontalOffsetWithoutText;
    }

    public int getHorizontalOffsetWithText() {
        return this.savedState.horizontalOffsetWithText;
    }

    public int getHorizontalOffsetWithoutText() {
        return this.savedState.horizontalOffsetWithoutText;
    }

    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getMaxCharacterCount() {
        return this.savedState.maxCharacterCount;
    }

    public int getNumber() {
        if (!hasNumber()) {
            return 0;
        }
        return this.savedState.number;
    }

    public int getOpacity() {
        return -3;
    }

    public SavedState getSavedState() {
        return this.savedState;
    }

    public int getVerticalOffset() {
        return this.savedState.verticalOffsetWithoutText;
    }

    public int getVerticalOffsetWithText() {
        return this.savedState.verticalOffsetWithText;
    }

    public int getVerticalOffsetWithoutText() {
        return this.savedState.verticalOffsetWithoutText;
    }

    public boolean hasNumber() {
        return this.savedState.number != -1;
    }

    public boolean isStateful() {
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void onTextSizeChange() {
        invalidateSelf();
    }

    public void setAdditionalHorizontalOffset(int i) {
        int unused = this.savedState.additionalHorizontalOffset = i;
        updateCenterAndBounds();
    }

    public void setAdditionalVerticalOffset(int i) {
        int unused = this.savedState.additionalVerticalOffset = i;
        updateCenterAndBounds();
    }

    public void setAlpha(int i) {
        int unused = this.savedState.alpha = i;
        this.textDrawableHelper.f34505a.setAlpha(i);
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        int unused = this.savedState.backgroundColor = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.shapeDrawable.getFillColor() != valueOf) {
            this.shapeDrawable.setFillColor(valueOf);
            invalidateSelf();
        }
    }

    public void setBadgeGravity(int i) {
        if (this.savedState.badgeGravity != i) {
            int unused = this.savedState.badgeGravity = i;
            WeakReference<View> weakReference = this.anchorViewRef;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.anchorViewRef.get();
                WeakReference<FrameLayout> weakReference2 = this.customBadgeParentRef;
                updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
            }
        }
    }

    public void setBadgeTextColor(int i) {
        int unused = this.savedState.badgeTextColor = i;
        if (this.textDrawableHelper.f34505a.getColor() != i) {
            this.textDrawableHelper.f34505a.setColor(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i) {
        int unused = this.savedState.contentDescriptionExceedsMaxBadgeNumberRes = i;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        CharSequence unused = this.savedState.contentDescriptionNumberless = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(int i) {
        int unused = this.savedState.contentDescriptionQuantityStrings = i;
    }

    public void setHorizontalOffset(int i) {
        setHorizontalOffsetWithoutText(i);
        setHorizontalOffsetWithText(i);
    }

    public void setHorizontalOffsetWithText(int i) {
        int unused = this.savedState.horizontalOffsetWithText = i;
        updateCenterAndBounds();
    }

    public void setHorizontalOffsetWithoutText(int i) {
        int unused = this.savedState.horizontalOffsetWithoutText = i;
        updateCenterAndBounds();
    }

    public void setMaxCharacterCount(int i) {
        if (this.savedState.maxCharacterCount != i) {
            int unused = this.savedState.maxCharacterCount = i;
            updateMaxBadgeNumber();
            this.textDrawableHelper.f34508d = true;
            updateCenterAndBounds();
            invalidateSelf();
        }
    }

    public void setNumber(int i) {
        int max = Math.max(0, i);
        if (this.savedState.number != max) {
            int unused = this.savedState.number = max;
            this.textDrawableHelper.f34508d = true;
            updateCenterAndBounds();
            invalidateSelf();
        }
    }

    public void setVerticalOffset(int i) {
        setVerticalOffsetWithoutText(i);
        setVerticalOffsetWithText(i);
    }

    public void setVerticalOffsetWithText(int i) {
        int unused = this.savedState.verticalOffsetWithText = i;
        updateCenterAndBounds();
    }

    public void setVerticalOffsetWithoutText(int i) {
        int unused = this.savedState.verticalOffsetWithoutText = i;
        updateCenterAndBounds();
    }

    public void setVisible(boolean z) {
        setVisible(z, false);
        boolean unused = this.savedState.isVisible = z;
    }

    @Deprecated
    public void updateBadgeCoordinates(View view, ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            updateBadgeCoordinates(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    public void updateBadgeCoordinates(View view) {
        updateBadgeCoordinates(view, (FrameLayout) null);
    }

    public void updateBadgeCoordinates(View view, FrameLayout frameLayout) {
        this.anchorViewRef = new WeakReference<>(view);
        this.customBadgeParentRef = new WeakReference<>(frameLayout);
        updateAnchorParentToNotClip(view);
        updateCenterAndBounds();
        invalidateSelf();
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15192a();
        /* access modifiers changed from: private */
        public int additionalHorizontalOffset;
        /* access modifiers changed from: private */
        public int additionalVerticalOffset;
        /* access modifiers changed from: private */
        public int alpha = 255;
        /* access modifiers changed from: private */
        public int backgroundColor;
        /* access modifiers changed from: private */
        public int badgeGravity;
        /* access modifiers changed from: private */
        public int badgeTextColor;
        /* access modifiers changed from: private */
        public int contentDescriptionExceedsMaxBadgeNumberRes;
        /* access modifiers changed from: private */
        public CharSequence contentDescriptionNumberless;
        /* access modifiers changed from: private */
        public int contentDescriptionQuantityStrings;
        /* access modifiers changed from: private */
        public int horizontalOffsetWithText;
        /* access modifiers changed from: private */
        public int horizontalOffsetWithoutText;
        /* access modifiers changed from: private */
        public boolean isVisible;
        /* access modifiers changed from: private */
        public int maxCharacterCount;
        /* access modifiers changed from: private */
        public int number = -1;
        /* access modifiers changed from: private */
        public int verticalOffsetWithText;
        /* access modifiers changed from: private */
        public int verticalOffsetWithoutText;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        public static class C15192a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(2132018027, C18161c.f39699m1);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList a = C14025c.m21582a(context, obtainStyledAttributes, 3);
            C14025c.m21582a(context, obtainStyledAttributes, 4);
            C14025c.m21582a(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
            obtainStyledAttributes.getResourceId(i, 0);
            obtainStyledAttributes.getString(i);
            obtainStyledAttributes.getBoolean(14, false);
            C14025c.m21582a(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(2132018027, C18161c.f39668K);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.badgeTextColor = a.getDefaultColor();
            this.contentDescriptionNumberless = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.contentDescriptionQuantityStrings = R.plurals.mtrl_badge_content_description;
            this.contentDescriptionExceedsMaxBadgeNumberRes = R.string.mtrl_exceed_max_badge_number_content_description;
            this.isVisible = true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.backgroundColor);
            parcel.writeInt(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeString(this.contentDescriptionNumberless.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeInt(this.badgeGravity);
            parcel.writeInt(this.horizontalOffsetWithoutText);
            parcel.writeInt(this.verticalOffsetWithoutText);
            parcel.writeInt(this.horizontalOffsetWithText);
            parcel.writeInt(this.verticalOffsetWithText);
            parcel.writeInt(this.additionalHorizontalOffset);
            parcel.writeInt(this.additionalVerticalOffset);
            parcel.writeInt(this.isVisible ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.backgroundColor = parcel.readInt();
            this.badgeTextColor = parcel.readInt();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = parcel.readInt();
            this.horizontalOffsetWithoutText = parcel.readInt();
            this.verticalOffsetWithoutText = parcel.readInt();
            this.horizontalOffsetWithText = parcel.readInt();
            this.verticalOffsetWithText = parcel.readInt();
            this.additionalHorizontalOffset = parcel.readInt();
            this.additionalVerticalOffset = parcel.readInt();
            this.isVisible = parcel.readInt() != 0;
        }
    }
}
