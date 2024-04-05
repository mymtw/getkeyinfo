package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0317g;
import androidx.appcompat.widget.C0359y;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.google.android.material.internal.C15342a;
import com.google.android.material.internal.C15345b;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p032c1.C4353a;
import p075d.C6614a;
import p088e1.C6689b;
import p186n2.C7390d;
import p186n2.C7426q;
import p260v0.C8184a;
import p289y0.C8351c;
import p507al.C14022a;
import p507al.C14025c;
import p629nk.C18268a;

public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = 2132018413;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final long PLACEHOLDER_FADE_DURATION = 87;
    private static final long PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private MaterialShapeDrawable boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderline;
    public final C15342a collapsingTextHelper;
    public boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    public EditText editText;
    private final LinkedHashSet<C15471f> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final LinkedHashSet<C15472g> endIconChangedListeners;
    private final SparseArray<C15499m> endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    /* access modifiers changed from: private */
    public final CheckableImageButton endIconView;
    private final LinearLayout endLayout;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private final CheckableImageButton errorIconView;
    private boolean expandedHintEnabled;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final C15500n indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private int maxWidth;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    /* access modifiers changed from: private */
    public boolean placeholderEnabled;
    private C7390d placeholderFadeIn;
    private C7390d placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    /* access modifiers changed from: private */
    public boolean restoringSavedState;
    private C15401a shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final LinearLayout startLayout;
    private ColorStateList strokeErrorColor;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15465a();

        /* renamed from: b */
        public CharSequence f34729b;

        /* renamed from: c */
        public boolean f34730c;

        /* renamed from: d */
        public CharSequence f34731d;

        /* renamed from: e */
        public CharSequence f34732e;

        /* renamed from: f */
        public CharSequence f34733f;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public static class C15465a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public final String toString() {
            StringBuilder h = C0072d.m201h("TextInputLayout.SavedState{");
            h.append(Integer.toHexString(System.identityHashCode(this)));
            h.append(" error=");
            h.append(this.f34729b);
            h.append(" hint=");
            h.append(this.f34731d);
            h.append(" helperText=");
            h.append(this.f34732e);
            h.append(" placeholderText=");
            h.append(this.f34733f);
            h.append("}");
            return h.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f34729b, parcel, i);
            parcel.writeInt(this.f34730c ? 1 : 0);
            TextUtils.writeToParcel(this.f34731d, parcel, i);
            TextUtils.writeToParcel(this.f34732e, parcel, i);
            TextUtils.writeToParcel(this.f34733f, parcel, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f34729b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f34730c = parcel.readInt() != 1 ? false : true;
            this.f34731d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f34732e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f34733f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C15466a implements TextWatcher {
        public C15466a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.counterEnabled) {
                textInputLayout2.updateCounter(editable.length());
            }
            if (TextInputLayout.this.placeholderEnabled) {
                TextInputLayout.this.updatePlaceholderText(editable.length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C15467b implements Runnable {
        public C15467b() {
        }

        public final void run() {
            TextInputLayout.this.endIconView.performClick();
            TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C15468c implements Runnable {
        public C15468c() {
        }

        public final void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C15469d implements ValueAnimator.AnimatorUpdateListener {
        public C15469d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.mo54190n(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C15470e extends C2273a {

        /* renamed from: a */
        public final TextInputLayout f34738a;

        public C15470e(TextInputLayout textInputLayout) {
            this.f34738a = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            EditText editText = this.f34738a.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f34738a.getHint();
            CharSequence error = this.f34738a.getError();
            CharSequence placeholderText = this.f34738a.getPlaceholderText();
            int counterMaxLength = this.f34738a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f34738a.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f34738a.isHintExpanded();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                bVar.mo18874w(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                bVar.mo18874w(charSequence);
                if (z3 && placeholderText != null) {
                    bVar.mo18874w(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                bVar.mo18874w(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                bVar.f14759a.setHintText(charSequence);
                bVar.f14759a.setShowingHintText(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            bVar.f14759a.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                bVar.f14759a.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C15471f {
        /* renamed from: a */
        void mo55092a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C15472g {
        /* renamed from: a */
        void mo55093a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText != null) {
            boolean z = true;
            if (this.boxBackgroundMode == 1) {
                if (getContext().getResources().getConfiguration().fontScale < 2.0f) {
                    z = false;
                }
                if (z) {
                    EditText editText2 = this.editText;
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2369e.m5240k(editText2, C2364y.C2369e.m5235f(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), C2364y.C2369e.m5234e(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
                } else if (C14025c.m21586e(getContext())) {
                    EditText editText3 = this.editText;
                    WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                    C2364y.C2369e.m5240k(editText3, C2364y.C2369e.m5235f(editText3), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), C2364y.C2369e.m5234e(this.editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
                }
            }
        }
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
            if (canDrawOutlineStroke()) {
                this.boxBackground.setStroke((float) this.boxStrokeWidthPx, this.boxStrokeColor);
            }
            int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
            this.boxBackgroundColor = calculateBoxBackgroundColor;
            this.boxBackground.setFillColor(ColorStateList.valueOf(calculateBoxBackgroundColor));
            if (this.endIconMode == 3) {
                this.editText.getBackground().invalidateSelf();
            }
            applyBoxUnderlineAttributes();
            invalidate();
        }
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderline != null) {
            if (canDrawStroke()) {
                this.boxUnderline.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
            }
            invalidate();
        }
    }

    private void applyCutoutPadding(RectF rectF) {
        float f = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f - ((float) i);
        rectF.right += (float) i;
    }

    private void applyEndIconTint() {
        applyIconTint(this.endIconView, this.hasEndIconTintList, this.endIconTintList, this.hasEndIconTintMode, this.endIconTintMode);
    }

    private void applyIconTint(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void applyStartIconTint() {
        applyIconTint(this.startIconView, this.hasStartIconTintList, this.startIconTintList, this.hasStartIconTintMode, this.startIconTintMode);
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderline = null;
        } else if (i == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderline = new MaterialShapeDrawable();
        } else if (i == 2) {
            if (!this.hintEnabled || (this.boxBackground instanceof C15485g)) {
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            } else {
                this.boxBackground = new C15485g(this.shapeAppearanceModel);
            }
            this.boxUnderline = null;
        } else {
            throw new IllegalArgumentException(C0071c.m191c(new StringBuilder(), this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
    }

    private int calculateBoxBackgroundColor() {
        int i = this.boxBackgroundColor;
        if (this.boxBackgroundMode != 1) {
            return i;
        }
        return C8351c.m16664f(this.boxBackgroundColor, C1993m.m4343D(R.attr.colorSurface, getContext(), 0));
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            boolean z = C2364y.C2369e.m5233d(this) == 1;
            rect2.bottom = rect.bottom;
            int i = this.boxBackgroundMode;
            if (i == 1) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
                rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
                return rect2;
            } else {
                rect2.left = this.editText.getPaddingLeft() + rect.left;
                rect2.top = rect.top - calculateLabelMarginTop();
                rect2.right = rect.right - this.editText.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f) {
        return isSingleLineFilledTextField() ? (int) (((float) rect2.top) + f) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f) {
        if (isSingleLineFilledTextField()) {
            return (int) (((float) rect.centerY()) - (f / 2.0f));
        }
        return this.editText.getCompoundPaddingTop() + rect.top;
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            C15342a aVar = this.collapsingTextHelper;
            TextPaint textPaint = aVar.f34412M;
            textPaint.setTextSize(aVar.f34447m);
            textPaint.setTypeface(aVar.f34459y);
            textPaint.setLetterSpacing(aVar.f34424Y);
            float f = -aVar.f34412M.ascent();
            rect2.left = this.editText.getCompoundPaddingLeft() + rect.left;
            rect2.top = calculateExpandedLabelTop(rect, f);
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            rect2.bottom = calculateExpandedLabelBottom(rect, rect2, f);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateLabelMarginTop() {
        float e;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0 || i == 1) {
            e = this.collapsingTextHelper.mo54182e();
        } else if (i != 2) {
            return 0;
        } else {
            e = this.collapsingTextHelper.mo54182e() / 2.0f;
        }
        return (int) e;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((C15485g) this.boxBackground).mo55107a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (!z || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.mo54190n(1.0f);
        } else {
            animateToExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private C7390d createPlaceholderFadeTransition() {
        C7390d dVar = new C7390d();
        dVar.f16562d = PLACEHOLDER_FADE_DURATION;
        dVar.f16563e = C18268a.f40091a;
        return dVar;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof C15485g);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<C15471f> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo55092a(this);
        }
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator<C15472g> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo55093a(this, i);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderline;
        if (materialShapeDrawable != null) {
            Rect bounds = materialShapeDrawable.getBounds();
            bounds.top = bounds.bottom - this.boxStrokeWidthPx;
            this.boxUnderline.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.mo54181d(canvas);
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (!z || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.mo54190n(0.0f);
        } else {
            animateToExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && (!((C15485g) this.boxBackground).f34757c.isEmpty())) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private C15499m getEndIconDelegate() {
        C15499m mVar = this.endIconDelegates.get(this.endIconMode);
        return mVar != null ? mVar : this.endIconDelegates.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (!hasEndIcon() || !isEndIconVisible()) {
            return null;
        }
        return this.endIconView;
    }

    private int getLabelLeftBoundAlightWithPrefix(int i, boolean z) {
        int compoundPaddingLeft = this.editText.getCompoundPaddingLeft() + i;
        return (this.prefixText == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.prefixTextView.getMeasuredWidth()) + this.prefixTextView.getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i, boolean z) {
        int compoundPaddingRight = i - this.editText.getCompoundPaddingRight();
        return (this.prefixText == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.prefixTextView.getMeasuredWidth() - this.prefixTextView.getPaddingRight());
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText((CharSequence) null);
            C7426q.m14342a(this.inputFrame, this.placeholderFadeOut);
            this.placeholderTextView.setVisibility(4);
        }
    }

    private boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    private int[] mergeIconState(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openCutout() {
        /*
            r13 = this;
            boolean r0 = r13.cutoutEnabled()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r13.tmpRectF
            com.google.android.material.internal.a r1 = r13.collapsingTextHelper
            android.widget.EditText r2 = r13.editText
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r13.editText
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.f34402C
            boolean r4 = r1.mo54179b(r4)
            r1.f34404E = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 17
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 5
            if (r3 == r7) goto L_0x0053
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x0045
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            android.graphics.Rect r10 = r1.f34442i
            if (r4 == 0) goto L_0x0042
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.f34427a0
            goto L_0x0058
        L_0x0042:
            int r10 = r10.left
            goto L_0x004b
        L_0x0045:
            android.graphics.Rect r10 = r1.f34442i
            if (r4 == 0) goto L_0x004d
            int r10 = r10.left
        L_0x004b:
            float r10 = (float) r10
            goto L_0x0059
        L_0x004d:
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.f34427a0
            goto L_0x0058
        L_0x0053:
            float r10 = (float) r2
            float r10 = r10 / r8
            float r11 = r1.f34427a0
            float r11 = r11 / r8
        L_0x0058:
            float r10 = r10 - r11
        L_0x0059:
            r0.left = r10
            android.graphics.Rect r11 = r1.f34442i
            int r12 = r11.top
            float r12 = (float) r12
            r0.top = r12
            if (r3 == r7) goto L_0x0085
            r7 = r3 & 7
            if (r7 != r6) goto L_0x0069
            goto L_0x0085
        L_0x0069:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x007b
            r2 = r3 & 5
            if (r2 != r9) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            if (r4 == 0) goto L_0x0077
            int r2 = r11.right
            goto L_0x0083
        L_0x0077:
            float r2 = r1.f34427a0
            float r2 = r2 + r10
            goto L_0x008b
        L_0x007b:
            if (r4 == 0) goto L_0x0081
            float r2 = r1.f34427a0
            float r2 = r2 + r10
            goto L_0x008b
        L_0x0081:
            int r2 = r11.right
        L_0x0083:
            float r2 = (float) r2
            goto L_0x008b
        L_0x0085:
            float r2 = (float) r2
            float r2 = r2 / r8
            float r3 = r1.f34427a0
            float r3 = r3 / r8
            float r2 = r2 + r3
        L_0x008b:
            r0.right = r2
            float r1 = r1.mo54182e()
            float r1 = r1 + r12
            r0.bottom = r1
            r13.applyCutoutPadding(r0)
            int r1 = r13.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r13.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r8
            float r2 = r2 - r3
            int r3 = r13.boxStrokeWidthPx
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            com.google.android.material.shape.MaterialShapeDrawable r1 = r13.boxBackground
            com.google.android.material.textfield.g r1 = (com.google.android.material.textfield.C15485g) r1
            r1.getClass()
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.mo55107a(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.openCutout():void");
    }

    private void recalculateCutout() {
        if (cutoutEnabled() && !this.hintExpanded) {
            closeCutout();
            openCutout();
        }
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void refreshIconDrawableState(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(mergeIconState(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setEditText(EditText editText2) {
        boolean z;
        boolean z2;
        if (this.editText == null) {
            if (this.endIconMode != 3 && !(editText2 instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.editText = editText2;
            setMinWidth(this.minWidth);
            setMaxWidth(this.maxWidth);
            onApplyBoxBackgroundMode();
            setTextInputAccessibilityDelegate(new C15470e(this));
            C15342a aVar = this.collapsingTextHelper;
            Typeface typeface2 = this.editText.getTypeface();
            C14022a aVar2 = aVar.f34401B;
            if (aVar2 != null) {
                aVar2.f30858c = true;
            }
            if (aVar.f34458x != typeface2) {
                aVar.f34458x = typeface2;
                z = true;
            } else {
                z = false;
            }
            C14022a aVar3 = aVar.f34400A;
            if (aVar3 != null) {
                aVar3.f30858c = true;
            }
            if (aVar.f34459y != typeface2) {
                aVar.f34459y = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                aVar.mo54185i(false);
            }
            C15342a aVar4 = this.collapsingTextHelper;
            float textSize = this.editText.getTextSize();
            if (aVar4.f34447m != textSize) {
                aVar4.f34447m = textSize;
                aVar4.mo54185i(false);
            }
            int gravity = this.editText.getGravity();
            this.collapsingTextHelper.mo54188l((gravity & -113) | 48);
            C15342a aVar5 = this.collapsingTextHelper;
            if (aVar5.f34445k != gravity) {
                aVar5.f34445k = gravity;
                aVar5.mo54185i(false);
            }
            this.editText.addTextChangedListener(new C15466a());
            if (this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }
            if (this.hintEnabled) {
                if (TextUtils.isEmpty(this.hint)) {
                    CharSequence hint2 = this.editText.getHint();
                    this.originalHint = hint2;
                    setHint(hint2);
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.counterView != null) {
                updateCounter(this.editText.getText().length());
            }
            updateEditTextBackground();
            this.indicatorViewController.mo55120b();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            this.endIconFrame.bringToFront();
            this.errorIconView.bringToFront();
            dispatchOnEditTextAttached();
            updatePrefixTextViewPadding();
            updateSuffixTextViewPadding();
            if (!isEnabled()) {
                editText2.setEnabled(false);
            }
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            EditText editText2 = this.editText;
            MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5227q(editText2, materialShapeDrawable);
        }
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.errorIconView.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.endIconFrame;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        updateSuffixTextViewPadding();
        if (!hasEndIcon()) {
            updateDummyDrawables();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.hint)) {
            this.hint = charSequence;
            C15342a aVar = this.collapsingTextHelper;
            if (charSequence == null || !TextUtils.equals(aVar.f34402C, charSequence)) {
                aVar.f34402C = charSequence;
                aVar.f34403D = null;
                Bitmap bitmap = aVar.f34406G;
                if (bitmap != null) {
                    bitmap.recycle();
                    aVar.f34406G = null;
                }
                aVar.mo54185i(false);
            }
            if (!this.hintExpanded) {
                openCutout();
            }
        }
    }

    private static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        boolean a = C2364y.C2367c.m5210a(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (a || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(a);
        checkableImageButton.setPressable(a);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C2364y.C2368d.m5229s(checkableImageButton, i);
    }

    private static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.placeholderTextView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_placeholder);
                C7390d createPlaceholderFadeTransition = createPlaceholderFadeTransition();
                this.placeholderFadeIn = createPlaceholderFadeTransition;
                createPlaceholderFadeTransition.f16561c = PLACEHOLDER_START_DELAY;
                this.placeholderFadeOut = createPlaceholderFadeTransition();
                TextView textView = this.placeholderTextView;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2371g.m5249f(textView, 1);
                setPlaceholderTextAppearance(this.placeholderTextAppearance);
                setPlaceholderTextColor(this.placeholderTextColor);
                addPlaceholderTextView();
            } else {
                removePlaceholderTextView();
                this.placeholderTextView = null;
            }
            this.placeholderEnabled = z;
        }
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.errorIconView.getVisibility() == 0 || ((hasEndIcon() && isEndIconVisible()) || this.suffixText != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return !(getStartIconDrawable() == null && this.prefixText == null) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        EditText editText2 = this.editText;
        return (editText2 == null || this.boxBackground == null || editText2.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    private void showPlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText(this.placeholderText);
            C7426q.m14342a(this.inputFrame, this.placeholderFadeIn);
            this.placeholderTextView.setVisibility(0);
            this.placeholderTextView.bringToFront();
        }
    }

    private void tintEndIconOnError(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            applyEndIconTint();
            return;
        }
        Drawable mutate = getEndIconDrawable().mutate();
        mutate.setTint(this.indicatorViewController.mo55125g());
        this.endIconView.setImageDrawable(mutate);
    }

    private void updateBoxCollapsedPaddingTop() {
        boolean z = true;
        if (this.boxBackgroundMode == 1) {
            if (getContext().getResources().getConfiguration().fontScale < 2.0f) {
                z = false;
            }
            if (z) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (C14025c.m21586e(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderline;
        if (materialShapeDrawable != null) {
            int i = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i - this.boxStrokeWidthFocusedPx, rect.right, i);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText2 = this.editText;
            updateCounter(editText2 == null ? 0 : editText2.getText().length());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (this.counterOverflowed && (colorStateList = this.counterOverflowTextColor) != null) {
                this.counterView.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean updateDummyDrawables() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.editText
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.shouldUpdateStartDummyDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.startLayout
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.startDummyDrawable
            if (r6 == 0) goto L_0x0025
            int r6 = r10.startDummyDrawableWidth
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.startDummyDrawable = r6
            r10.startDummyDrawableWidth = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.startDummyDrawable
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.editText
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.startDummyDrawable
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.editText
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.startDummyDrawable = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.shouldUpdateEndDummyDrawable()
            if (r6 == 0) goto L_0x00d1
            android.widget.TextView r2 = r10.suffixTextView
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r2
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r2 = r2 + r7
        L_0x008c:
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.endDummyDrawableWidth
            if (r8 == r2) goto L_0x00ad
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r3 = r10.endDummyDrawable
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r2, r3, r4)
            goto L_0x00f2
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.endDummyDrawable = r7
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r3]
            android.graphics.drawable.Drawable r3 = r10.endDummyDrawable
            if (r2 == r3) goto L_0x00cf
            r10.originalEditTextEndDrawable = r2
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r2, r3, r4)
            goto L_0x00f2
        L_0x00cf:
            r5 = r0
            goto L_0x00f2
        L_0x00d1:
            android.graphics.drawable.Drawable r6 = r10.endDummyDrawable
            if (r6 == 0) goto L_0x00f3
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r3 != r7) goto L_0x00ef
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.originalEditTextEndDrawable
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x00f0
        L_0x00ef:
            r5 = r0
        L_0x00f0:
            r10.endDummyDrawable = r2
        L_0x00f2:
            r0 = r5
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.updateDummyDrawables():boolean");
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText2;
        if (this.placeholderTextView != null && (editText2 = this.editText) != null) {
            this.placeholderTextView.setGravity(editText2.getGravity());
            this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
    }

    private void updatePlaceholderText() {
        EditText editText2 = this.editText;
        updatePlaceholderText(editText2 == null ? 0 : editText2.getText().length());
    }

    private void updatePrefixTextViewPadding() {
        int i;
        if (this.editText != null) {
            if (isStartIconVisible()) {
                i = 0;
            } else {
                EditText editText2 = this.editText;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                i = C2364y.C2369e.m5235f(editText2);
            }
            TextView textView = this.prefixTextView;
            int compoundPaddingTop = this.editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = this.editText.getCompoundPaddingBottom();
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            C2364y.C2369e.m5240k(textView, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    private void updatePrefixTextVisibility() {
        this.prefixTextView.setVisibility((this.prefixText == null || isHintExpanded()) ? 8 : 0);
        updateDummyDrawables();
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    private void updateSuffixTextViewPadding() {
        int i;
        if (this.editText != null) {
            if (isEndIconVisible() || isErrorIconVisible()) {
                i = 0;
            } else {
                EditText editText2 = this.editText;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                i = C2364y.C2369e.m5234e(editText2);
            }
            TextView textView = this.suffixTextView;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.editText.getPaddingTop();
            int paddingBottom = this.editText.getPaddingBottom();
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            C2364y.C2369e.m5240k(textView, dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = 0;
        boolean z = this.suffixText != null && !isHintExpanded();
        TextView textView = this.suffixTextView;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.suffixTextView.getVisibility()) {
            getEndIconDelegate().mo55095c(z);
        }
        updateDummyDrawables();
    }

    public void addOnEditTextAttachedListener(C15471f fVar) {
        this.editTextAttachedListeners.add(fVar);
        if (this.editText != null) {
            fVar.mo55092a(this);
        }
    }

    public void addOnEndIconChangedListener(C15472g gVar) {
        this.endIconChangedListeners.add(gVar);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void animateToExpansionFraction(float f) {
        if (this.collapsingTextHelper.f34430c != f) {
            if (this.animator == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.animator = valueAnimator;
                valueAnimator.setInterpolator(C18268a.f40092b);
                this.animator.setDuration(167);
                this.animator.addUpdateListener(new C15469d());
            }
            this.animator.setFloatValues(new float[]{this.collapsingTextHelper.f34430c, f});
            this.animator.start();
        }
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    public boolean cutoutIsOpen() {
        return cutoutEnabled() && (((C15485g) this.boxBackground).f34757c.isEmpty() ^ true);
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText2 = this.editText;
        if (editText2 == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint2 = editText2.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.editText.setHint(hint2);
                this.isProvidingHint = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.inputFrame.getChildCount());
            for (int i2 = 0; i2 < this.inputFrame.getChildCount(); i2++) {
                View childAt = this.inputFrame.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.editText) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    public void drawableStateChanged() {
        if (!this.inDrawableStateChanged) {
            boolean z = true;
            this.inDrawableStateChanged = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C15342a aVar = this.collapsingTextHelper;
            boolean p = aVar != null ? aVar.mo54192p(drawableState) | false : false;
            if (this.editText != null) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (!C2364y.C2371g.m5246c(this) || !isEnabled()) {
                    z = false;
                }
                updateLabelState(z);
            }
            updateEditTextBackground();
            updateTextInputBoxState();
            if (p) {
                invalidate();
            }
            this.inDrawableStateChanged = false;
        }
    }

    public int getBaseline() {
        EditText editText2 = this.editText;
        if (editText2 == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText2.getBaseline() + calculateLabelMarginTop();
    }

    public MaterialShapeDrawable getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxBackground.getBottomLeftCornerResolvedSize();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxBackground.getBottomRightCornerResolvedSize();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxBackground.getTopRightCornerResolvedSize();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxBackground.getTopLeftCornerResolvedSize();
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.counterEnabled || !this.counterOverflowed || (textView = this.counterView) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public CharSequence getError() {
        C15500n nVar = this.indicatorViewController;
        if (nVar.f34801k) {
            return nVar.f34800j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.f34803m;
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.mo55125g();
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.indicatorViewController.mo55125g();
    }

    public CharSequence getHelperText() {
        C15500n nVar = this.indicatorViewController;
        if (nVar.f34807q) {
            return nVar.f34806p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.indicatorViewController.f34808r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.mo54182e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C15342a aVar = this.collapsingTextHelper;
        return aVar.mo54183f(aVar.f34450p);
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.f34801k;
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public final boolean isHelperTextDisplayed() {
        C15500n nVar = this.indicatorViewController;
        return nVar.f34798h == 2 && nVar.f34808r != null && !TextUtils.isEmpty(nVar.f34806p);
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.f34807q;
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText2 = this.editText;
        if (editText2 != null) {
            Rect rect = this.tmpRect;
            C15345b.m24941a(this, editText2, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                C15342a aVar = this.collapsingTextHelper;
                float textSize = this.editText.getTextSize();
                if (aVar.f34447m != textSize) {
                    aVar.f34447m = textSize;
                    aVar.mo54185i(false);
                }
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.mo54188l((gravity & -113) | 48);
                C15342a aVar2 = this.collapsingTextHelper;
                if (aVar2.f34445k != gravity) {
                    aVar2.f34445k = gravity;
                    aVar2.mo54185i(false);
                }
                C15342a aVar3 = this.collapsingTextHelper;
                Rect calculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
                aVar3.getClass();
                int i5 = calculateCollapsedTextBounds.left;
                int i6 = calculateCollapsedTextBounds.top;
                int i7 = calculateCollapsedTextBounds.right;
                int i8 = calculateCollapsedTextBounds.bottom;
                Rect rect2 = aVar3.f34442i;
                if (!(rect2.left == i5 && rect2.top == i6 && rect2.right == i7 && rect2.bottom == i8)) {
                    rect2.set(i5, i6, i7, i8);
                    aVar3.f34410K = true;
                    aVar3.mo54184h();
                }
                C15342a aVar4 = this.collapsingTextHelper;
                Rect calculateExpandedTextBounds = calculateExpandedTextBounds(rect);
                aVar4.getClass();
                int i9 = calculateExpandedTextBounds.left;
                int i10 = calculateExpandedTextBounds.top;
                int i11 = calculateExpandedTextBounds.right;
                int i12 = calculateExpandedTextBounds.bottom;
                Rect rect3 = aVar4.f34440h;
                if (!(rect3.left == i9 && rect3.top == i10 && rect3.right == i11 && rect3.bottom == i12)) {
                    rect3.set(i9, i10, i11, i12);
                    aVar4.f34410K = true;
                    aVar4.mo54184h();
                }
                this.collapsingTextHelper.mo54185i(false);
                if (cutoutEnabled() && !this.hintExpanded) {
                    openCutout();
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new C15468c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        updatePrefixTextViewPadding();
        updateSuffixTextViewPadding();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f34729b);
        if (savedState.f34730c) {
            this.endIconView.post(new C15467b());
        }
        setHint(savedState.f34731d);
        setHelperText(savedState.f34732e);
        setPlaceholderText(savedState.f34733f);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.indicatorViewController.mo55123e()) {
            savedState.f34729b = getError();
        }
        savedState.f34730c = hasEndIcon() && this.endIconView.isChecked();
        savedState.f34731d = getHint();
        savedState.f34732e = getHelperText();
        savedState.f34733f = getPlaceholderText();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void refreshEndIconDrawableState() {
        refreshIconDrawableState(this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        refreshIconDrawableState(this.errorIconView, this.errorIconTintList);
    }

    public void refreshStartIconDrawableState() {
        refreshIconDrawableState(this.startIconView, this.startIconTintList);
    }

    public void removeOnEditTextAttachedListener(C15471f fVar) {
        this.editTextAttachedListeners.remove(fVar);
    }

    public void removeOnEndIconChangedListener(C15472g gVar) {
        this.endIconChangedListeners.remove(gVar);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setBoxBackgroundColor(C8184a.C8188d.m16468a(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.boxBackgroundMode) {
            this.boxBackgroundMode = i;
            if (this.editText != null) {
                onApplyBoxBackgroundMode();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.boxCollapsedPaddingTopPx = i;
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null || materialShapeDrawable.getTopLeftCornerResolvedSize() != f || this.boxBackground.getTopRightCornerResolvedSize() != f2 || this.boxBackground.getBottomRightCornerResolvedSize() != f4 || this.boxBackground.getBottomLeftCornerResolvedSize() != f3) {
            C15401a aVar = this.shapeAppearanceModel;
            aVar.getClass();
            C15401a.C15402a aVar2 = new C15401a.C15402a(aVar);
            aVar2.mo54620f(f);
            aVar2.mo54621g(f2);
            aVar2.mo54619e(f4);
            aVar2.mo54618d(f3);
            this.shapeAppearanceModel = new C15401a(aVar2);
            applyBoxAttributes();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface2 = this.typeface;
                if (typeface2 != null) {
                    this.counterView.setTypeface(typeface2);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.mo55119a(this.counterView, 2);
                ((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.mo55127i(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C6614a.m12981a(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo55108b(this.boxBackgroundMode)) {
            getEndIconDelegate().mo55094a();
            applyEndIconTint();
            return;
        }
        StringBuilder h = C0072d.m201h("The current box background mode ");
        h.append(this.boxBackgroundMode);
        h.append(" is not supported by the end icon mode ");
        h.append(i);
        throw new IllegalStateException(h.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            this.hasEndIconTintList = true;
            applyEndIconTint();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            this.hasEndIconTintMode = true;
            applyEndIconTint();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateSuffixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.f34801k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C15500n nVar = this.indicatorViewController;
            nVar.mo55121c();
            nVar.f34800j = charSequence;
            nVar.f34802l.setText(charSequence);
            int i = nVar.f34798h;
            if (i != 1) {
                nVar.f34799i = 1;
            }
            nVar.mo55129k(i, nVar.f34799i, nVar.mo55128j(nVar.f34802l, charSequence));
            return;
        }
        this.indicatorViewController.mo55126h();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C15500n nVar = this.indicatorViewController;
        nVar.f34803m = charSequence;
        AppCompatTextView appCompatTextView = nVar.f34802l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C15500n nVar = this.indicatorViewController;
        if (nVar.f34801k != z) {
            nVar.mo55121c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.f34791a);
                nVar.f34802l = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                nVar.f34802l.setTextAlignment(5);
                Typeface typeface2 = nVar.f34811u;
                if (typeface2 != null) {
                    nVar.f34802l.setTypeface(typeface2);
                }
                int i = nVar.f34804n;
                nVar.f34804n = i;
                AppCompatTextView appCompatTextView2 = nVar.f34802l;
                if (appCompatTextView2 != null) {
                    nVar.f34792b.setTextAppearanceCompatWithErrorFallback(appCompatTextView2, i);
                }
                ColorStateList colorStateList = nVar.f34805o;
                nVar.f34805o = colorStateList;
                AppCompatTextView appCompatTextView3 = nVar.f34802l;
                if (!(appCompatTextView3 == null || colorStateList == null)) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = nVar.f34803m;
                nVar.f34803m = charSequence;
                AppCompatTextView appCompatTextView4 = nVar.f34802l;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                nVar.f34802l.setVisibility(4);
                AppCompatTextView appCompatTextView5 = nVar.f34802l;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2371g.m5249f(appCompatTextView5, 1);
                nVar.mo55119a(nVar.f34802l, 0);
            } else {
                nVar.mo55126h();
                nVar.mo55127i(nVar.f34802l, 0);
                nVar.f34802l = null;
                nVar.f34792b.updateEditTextBackground();
                nVar.f34792b.updateTextInputBoxState();
            }
            nVar.f34801k = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C6614a.m12981a(getContext(), i) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.errorIconTintList = colorStateList;
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C15500n nVar = this.indicatorViewController;
        nVar.f34804n = i;
        AppCompatTextView appCompatTextView = nVar.f34802l;
        if (appCompatTextView != null) {
            nVar.f34792b.setTextAppearanceCompatWithErrorFallback(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C15500n nVar = this.indicatorViewController;
        nVar.f34805o = colorStateList;
        AppCompatTextView appCompatTextView = nVar.f34802l;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            C15500n nVar = this.indicatorViewController;
            nVar.mo55121c();
            nVar.f34806p = charSequence;
            nVar.f34808r.setText(charSequence);
            int i = nVar.f34798h;
            if (i != 2) {
                nVar.f34799i = 2;
            }
            nVar.mo55129k(i, nVar.f34799i, nVar.mo55128j(nVar.f34808r, charSequence));
        } else if (isHelperTextEnabled()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C15500n nVar = this.indicatorViewController;
        nVar.f34810t = colorStateList;
        AppCompatTextView appCompatTextView = nVar.f34808r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C15500n nVar = this.indicatorViewController;
        if (nVar.f34807q != z) {
            nVar.mo55121c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.f34791a);
                nVar.f34808r = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                nVar.f34808r.setTextAlignment(5);
                Typeface typeface2 = nVar.f34811u;
                if (typeface2 != null) {
                    nVar.f34808r.setTypeface(typeface2);
                }
                nVar.f34808r.setVisibility(4);
                AppCompatTextView appCompatTextView2 = nVar.f34808r;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2371g.m5249f(appCompatTextView2, 1);
                int i = nVar.f34809s;
                nVar.f34809s = i;
                AppCompatTextView appCompatTextView3 = nVar.f34808r;
                if (appCompatTextView3 != null) {
                    appCompatTextView3.setTextAppearance(i);
                }
                ColorStateList colorStateList = nVar.f34810t;
                nVar.f34810t = colorStateList;
                AppCompatTextView appCompatTextView4 = nVar.f34808r;
                if (!(appCompatTextView4 == null || colorStateList == null)) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                nVar.mo55119a(nVar.f34808r, 1);
            } else {
                nVar.mo55121c();
                int i2 = nVar.f34798h;
                if (i2 == 2) {
                    nVar.f34799i = 0;
                }
                nVar.mo55129k(i2, nVar.f34799i, nVar.mo55128j(nVar.f34808r, (CharSequence) null));
                nVar.mo55127i(nVar.f34808r, 1);
                nVar.f34808r = null;
                nVar.f34792b.updateEditTextBackground();
                nVar.f34792b.updateTextInputBoxState();
            }
            nVar.f34807q = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C15500n nVar = this.indicatorViewController;
        nVar.f34809s = i;
        AppCompatTextView appCompatTextView = nVar.f34808r;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.C3084b0.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (!z) {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint2 = this.editText.getHint();
                if (!TextUtils.isEmpty(hint2)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint2);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.collapsingTextHelper.mo54186j(i);
        this.focusedTextColor = this.collapsingTextHelper.f34450p;
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.mo54187k(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
        EditText editText2 = this.editText;
        if (editText2 != null && i != -1) {
            editText2.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        EditText editText2 = this.editText;
        if (editText2 != null && i != -1) {
            editText2.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C6614a.m12981a(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        this.hasEndIconTintList = true;
        applyEndIconTint();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        this.hasEndIconTintMode = true;
        applyEndIconTint();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.placeholderEnabled || !TextUtils.isEmpty(charSequence)) {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updatePrefixTextVisibility();
    }

    public void setPrefixTextAppearance(int i) {
        this.prefixTextView.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C6614a.m12981a(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            this.hasStartIconTintList = true;
            applyStartIconTint();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            this.hasStartIconTintMode = true;
            applyStartIconTint();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i) {
        this.suffixTextView.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2132017944);
            Context context = getContext();
            Object obj = C8184a.f17966a;
            textView.setTextColor(C8184a.C8188d.m16468a(context, R.color.design_error));
        }
    }

    public void setTextInputAccessibilityDelegate(C15470e eVar) {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            C2364y.m5201p(editText2, eVar);
        }
    }

    public void setTypeface(Typeface typeface2) {
        boolean z;
        if (typeface2 != this.typeface) {
            this.typeface = typeface2;
            C15342a aVar = this.collapsingTextHelper;
            C14022a aVar2 = aVar.f34401B;
            boolean z2 = true;
            if (aVar2 != null) {
                aVar2.f30858c = true;
            }
            if (aVar.f34458x != typeface2) {
                aVar.f34458x = typeface2;
                z = true;
            } else {
                z = false;
            }
            C14022a aVar3 = aVar.f34400A;
            if (aVar3 != null) {
                aVar3.f30858c = true;
            }
            if (aVar.f34459y != typeface2) {
                aVar.f34459y = typeface2;
            } else {
                z2 = false;
            }
            if (z || z2) {
                aVar.mo54185i(false);
            }
            C15500n nVar = this.indicatorViewController;
            if (typeface2 != nVar.f34811u) {
                nVar.f34811u = typeface2;
                AppCompatTextView appCompatTextView = nVar.f34802l;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface2);
                }
                AppCompatTextView appCompatTextView2 = nVar.f34808r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface2);
                }
            }
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface2);
            }
        }
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText2 = this.editText;
        if (editText2 != null && this.boxBackgroundMode == 0 && (background = editText2.getBackground()) != null) {
            if (C0359y.m994a(background)) {
                background = background.mutate();
            }
            if (this.indicatorViewController.mo55123e()) {
                background.setColorFilter(C0317g.m821c(this.indicatorViewController.mo55125g(), PorterDuff.Mode.SRC_IN));
            } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
                background.clearColorFilter();
                this.editText.refreshDrawableState();
            } else {
                background.setColorFilter(C0317g.m821c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.editText;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateTextInputBoxState() {
        /*
            r6 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.boxBackground
            if (r0 == 0) goto L_0x00f9
            int r0 = r6.boxBackgroundMode
            if (r0 != 0) goto L_0x000a
            goto L_0x00f9
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.editText
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.editText
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.disabledColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x003f:
            com.google.android.material.textfield.n r4 = r6.indicatorViewController
            boolean r4 = r4.mo55123e()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.strokeErrorColor
            if (r4 == 0) goto L_0x004f
            r6.updateStrokeErrorColor(r0, r3)
            goto L_0x0081
        L_0x004f:
            com.google.android.material.textfield.n r4 = r6.indicatorViewController
            int r4 = r4.mo55125g()
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.counterOverflowed
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.counterView
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.strokeErrorColor
            if (r5 == 0) goto L_0x0068
            r6.updateStrokeErrorColor(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.focusedStrokeColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.hoveredStrokeColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.defaultStrokeColor
            r6.boxStrokeColor = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0094
            com.google.android.material.textfield.n r4 = r6.indicatorViewController
            boolean r5 = r4.f34801k
            if (r5 == 0) goto L_0x0094
            boolean r4 = r4.mo55123e()
            if (r4 == 0) goto L_0x0094
            r1 = r2
        L_0x0094:
            r6.setErrorIconVisible(r1)
            r6.refreshErrorIconDrawableState()
            r6.refreshStartIconDrawableState()
            r6.refreshEndIconDrawableState()
            com.google.android.material.textfield.m r1 = r6.getEndIconDelegate()
            r1.getClass()
            boolean r1 = r1 instanceof com.google.android.material.textfield.C15486h
            if (r1 == 0) goto L_0x00b4
            com.google.android.material.textfield.n r1 = r6.indicatorViewController
            boolean r1 = r1.mo55123e()
            r6.tintEndIconOnError(r1)
        L_0x00b4:
            int r1 = r6.boxStrokeWidthPx
            if (r0 == 0) goto L_0x00c3
            boolean r4 = r6.isEnabled()
            if (r4 == 0) goto L_0x00c3
            int r4 = r6.boxStrokeWidthFocusedPx
            r6.boxStrokeWidthPx = r4
            goto L_0x00c7
        L_0x00c3:
            int r4 = r6.boxStrokeWidthDefaultPx
            r6.boxStrokeWidthPx = r4
        L_0x00c7:
            int r4 = r6.boxStrokeWidthPx
            if (r4 == r1) goto L_0x00d3
            int r1 = r6.boxBackgroundMode
            r4 = 2
            if (r1 != r4) goto L_0x00d3
            r6.recalculateCutout()
        L_0x00d3:
            int r1 = r6.boxBackgroundMode
            if (r1 != r2) goto L_0x00f6
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00e2
            int r0 = r6.disabledFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00f6
        L_0x00e2:
            if (r3 == 0) goto L_0x00eb
            if (r0 != 0) goto L_0x00eb
            int r0 = r6.hoveredFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00f6
        L_0x00eb:
            if (r0 == 0) goto L_0x00f2
            int r0 = r6.focusedFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00f6
        L_0x00f2:
            int r0 = r6.defaultFilledBackgroundColor
            r6.boxBackgroundColor = r0
        L_0x00f6:
            r6.applyBoxAttributes()
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.updateTextInputBoxState():void");
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText2 = this.editText;
        boolean z3 = editText2 != null && !TextUtils.isEmpty(editText2.getText());
        EditText editText3 = this.editText;
        boolean z4 = editText3 != null && editText3.hasFocus();
        boolean e = this.indicatorViewController.mo55123e();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.mo54187k(colorStateList2);
            C15342a aVar = this.collapsingTextHelper;
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            if (aVar.f34449o != colorStateList3) {
                aVar.f34449o = colorStateList3;
                aVar.mo54185i(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.defaultHintTextColor;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor;
            this.collapsingTextHelper.mo54187k(ColorStateList.valueOf(colorForState));
            C15342a aVar2 = this.collapsingTextHelper;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (aVar2.f34449o != valueOf) {
                aVar2.f34449o = valueOf;
                aVar2.mo54185i(false);
            }
        } else if (e) {
            C15342a aVar3 = this.collapsingTextHelper;
            AppCompatTextView appCompatTextView = this.indicatorViewController.f34802l;
            aVar3.mo54187k(appCompatTextView != null ? appCompatTextView.getTextColors() : null);
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.mo54187k(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.mo54187k(colorStateList);
        }
        if (z3 || !this.expandedHintEnabled || (isEnabled() && z4)) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
            }
        } else if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    /* access modifiers changed from: private */
    public void updatePlaceholderText(int i) {
        if (i != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            applyEndIconTint();
            refreshEndIconDrawableState();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            applyStartIconTint();
            setStartIconVisible(true);
            refreshStartIconDrawableState();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r28, android.util.AttributeSet r29, int r30) {
        /*
            r27 = this;
            r0 = r27
            r7 = r29
            r8 = r30
            int r9 = DEF_STYLE_RES
            r1 = r28
            android.content.Context r1 = p574gl.C17790a.m29918a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.minWidth = r10
            r0.maxWidth = r10
            com.google.android.material.textfield.n r1 = new com.google.android.material.textfield.n
            r1.<init>(r0)
            r0.indicatorViewController = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpBoundsRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.editTextAttachedListeners = r1
            r11 = 0
            r0.endIconMode = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.endIconDelegates = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.endIconChangedListeners = r1
            com.google.android.material.internal.a r1 = new com.google.android.material.internal.a
            r1.<init>(r0)
            r0.collapsingTextHelper = r1
            android.content.Context r13 = r27.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r13)
            r0.inputFrame = r2
            r2.setAddStatesFromChildren(r14)
            r0.addView(r2)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r13)
            r0.startLayout = r15
            r15.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r4 = 8388611(0x800003, float:1.1754948E-38)
            r3.<init>(r6, r10, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.endLayout = r5
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r6, r10, r4)
            r5.setLayoutParams(r3)
            r2.addView(r5)
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            r4.<init>(r13)
            r0.endIconFrame = r4
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r6, r10)
            r4.setLayoutParams(r2)
            android.view.animation.LinearInterpolator r2 = p629nk.C18268a.f40091a
            r1.f34414O = r2
            r1.mo54185i(r11)
            r1.f34413N = r2
            r1.mo54185i(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo54188l(r2)
            int[] r3 = p610kp.C18161c.f39703o1
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {20, 18, 33, 38, 42} // fill-array
            r16 = r1
            r1 = r13
            r2 = r29
            r17 = r4
            r4 = r30
            r18 = r5
            r5 = r9
            r6 = r16
            androidx.appcompat.widget.p0 r1 = com.google.android.material.internal.C15367g.m24958e(r1, r2, r3, r4, r5, r6)
            r2 = 41
            boolean r2 = r1.mo3097a(r2, r14)
            r0.hintEnabled = r2
            r2 = 4
            java.lang.CharSequence r2 = r1.mo3107k(r2)
            r0.setHint((java.lang.CharSequence) r2)
            r2 = 40
            boolean r2 = r1.mo3097a(r2, r14)
            r0.hintAnimationEnabled = r2
            r2 = 35
            boolean r2 = r1.mo3097a(r2, r14)
            r0.expandedHintEnabled = r2
            r2 = 3
            boolean r3 = r1.mo3108l(r2)
            if (r3 == 0) goto L_0x0106
            int r3 = r1.mo3100d(r2, r10)
            r0.setMinWidth(r3)
        L_0x0106:
            r3 = 2
            boolean r4 = r1.mo3108l(r3)
            if (r4 == 0) goto L_0x0114
            int r4 = r1.mo3100d(r3, r10)
            r0.setMaxWidth(r4)
        L_0x0114:
            com.google.android.material.shape.a$a r4 = com.google.android.material.shape.C15401a.m24981b(r13, r7, r8, r9)
            com.google.android.material.shape.a r5 = new com.google.android.material.shape.a
            r5.<init>(r4)
            r0.shapeAppearanceModel = r5
            android.content.res.Resources r4 = r13.getResources()
            r5 = 2131166152(0x7f0703c8, float:1.7946541E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            r0.boxLabelCutoutPaddingPx = r4
            r4 = 7
            int r4 = r1.mo3099c(r4, r11)
            r0.boxCollapsedPaddingTopPx = r4
            r4 = 14
            android.content.res.Resources r5 = r13.getResources()
            r6 = 2131166153(0x7f0703c9, float:1.7946543E38)
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r1.mo3100d(r4, r5)
            r0.boxStrokeWidthDefaultPx = r4
            r4 = 15
            android.content.res.Resources r5 = r13.getResources()
            r6 = 2131166154(0x7f0703ca, float:1.7946545E38)
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r1.mo3100d(r4, r5)
            r0.boxStrokeWidthFocusedPx = r4
            int r4 = r0.boxStrokeWidthDefaultPx
            r0.boxStrokeWidthPx = r4
            r4 = 11
            android.content.res.TypedArray r5 = r1.f876b
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r5.getDimension(r4, r6)
            r5 = 10
            android.content.res.TypedArray r7 = r1.f876b
            float r5 = r7.getDimension(r5, r6)
            android.content.res.TypedArray r7 = r1.f876b
            r8 = 8
            float r7 = r7.getDimension(r8, r6)
            r9 = 9
            android.content.res.TypedArray r2 = r1.f876b
            float r2 = r2.getDimension(r9, r6)
            com.google.android.material.shape.a r6 = r0.shapeAppearanceModel
            r6.getClass()
            com.google.android.material.shape.a$a r9 = new com.google.android.material.shape.a$a
            r9.<init>(r6)
            r6 = 0
            int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r16 < 0) goto L_0x0191
            r9.mo54620f(r4)
        L_0x0191:
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0198
            r9.mo54621g(r5)
        L_0x0198:
            int r4 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x019f
            r9.mo54619e(r7)
        L_0x019f:
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01a6
            r9.mo54618d(r2)
        L_0x01a6:
            com.google.android.material.shape.a r2 = new com.google.android.material.shape.a
            r2.<init>(r9)
            r0.shapeAppearanceModel = r2
            r2 = 5
            android.content.res.ColorStateList r2 = p507al.C14025c.m21583b(r13, r1, r2)
            if (r2 == 0) goto L_0x0209
            int r4 = r2.getDefaultColor()
            r0.defaultFilledBackgroundColor = r4
            r0.boxBackgroundColor = r4
            boolean r4 = r2.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x01e6
            int[] r4 = new int[r14]
            r4[r11] = r5
            int r4 = r2.getColorForState(r4, r10)
            r0.disabledFilledBackgroundColor = r4
            int[] r4 = new int[r3]
            r4 = {16842908, 16842910} // fill-array
            int r4 = r2.getColorForState(r4, r10)
            r0.focusedFilledBackgroundColor = r4
            int[] r4 = new int[r3]
            r4 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r4, r10)
            r0.hoveredFilledBackgroundColor = r2
            goto L_0x0213
        L_0x01e6:
            int r2 = r0.defaultFilledBackgroundColor
            r0.focusedFilledBackgroundColor = r2
            r2 = 2131100460(0x7f06032c, float:1.7813302E38)
            android.content.res.ColorStateList r2 = p260v0.C8184a.m16459b(r13, r2)
            int[] r4 = new int[r14]
            r4[r11] = r5
            int r4 = r2.getColorForState(r4, r10)
            r0.disabledFilledBackgroundColor = r4
            int[] r4 = new int[r14]
            r5 = 16843623(0x1010367, float:2.3696E-38)
            r4[r11] = r5
            int r2 = r2.getColorForState(r4, r10)
            r0.hoveredFilledBackgroundColor = r2
            goto L_0x0213
        L_0x0209:
            r0.boxBackgroundColor = r11
            r0.defaultFilledBackgroundColor = r11
            r0.disabledFilledBackgroundColor = r11
            r0.focusedFilledBackgroundColor = r11
            r0.hoveredFilledBackgroundColor = r11
        L_0x0213:
            boolean r2 = r1.mo3108l(r14)
            if (r2 == 0) goto L_0x0221
            android.content.res.ColorStateList r2 = r1.mo3098b(r14)
            r0.focusedTextColor = r2
            r0.defaultHintTextColor = r2
        L_0x0221:
            r2 = 12
            android.content.res.ColorStateList r4 = p507al.C14025c.m21583b(r13, r1, r2)
            android.content.res.TypedArray r5 = r1.f876b
            int r2 = r5.getColor(r2, r11)
            r0.focusedStrokeColor = r2
            r2 = 2131100483(0x7f060343, float:1.7813349E38)
            java.lang.Object r5 = p260v0.C8184a.f17966a
            int r2 = p260v0.C8184a.C8188d.m16468a(r13, r2)
            r0.defaultStrokeColor = r2
            r2 = 2131100484(0x7f060344, float:1.781335E38)
            int r2 = p260v0.C8184a.C8188d.m16468a(r13, r2)
            r0.disabledColor = r2
            r2 = 2131100487(0x7f060347, float:1.7813357E38)
            int r2 = p260v0.C8184a.C8188d.m16468a(r13, r2)
            r0.hoveredStrokeColor = r2
            if (r4 == 0) goto L_0x0251
            r0.setBoxStrokeColorStateList(r4)
        L_0x0251:
            r2 = 13
            boolean r4 = r1.mo3108l(r2)
            if (r4 == 0) goto L_0x0260
            android.content.res.ColorStateList r2 = p507al.C14025c.m21583b(r13, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0260:
            r2 = 42
            int r4 = r1.mo3105i(r2, r10)
            if (r4 == r10) goto L_0x026f
            int r2 = r1.mo3105i(r2, r11)
            r0.setHintTextAppearance(r2)
        L_0x026f:
            r2 = 33
            int r2 = r1.mo3105i(r2, r11)
            r4 = 28
            java.lang.CharSequence r4 = r1.mo3107k(r4)
            r5 = 29
            boolean r5 = r1.mo3097a(r5, r11)
            android.content.Context r6 = r27.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131624091(0x7f0e009b, float:1.8875352E38)
            r9 = r18
            android.view.View r6 = r6.inflate(r7, r9, r11)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.errorIconView = r6
            r7 = 2131430074(0x7f0b0aba, float:1.8481839E38)
            r6.setId(r7)
            r6.setVisibility(r8)
            boolean r7 = p507al.C14025c.m21586e(r13)
            if (r7 == 0) goto L_0x02ae
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            r7.setMarginStart(r11)
        L_0x02ae:
            r7 = 30
            boolean r16 = r1.mo3108l(r7)
            if (r16 == 0) goto L_0x02bd
            android.graphics.drawable.Drawable r7 = r1.mo3101e(r7)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r7)
        L_0x02bd:
            r7 = 31
            boolean r16 = r1.mo3108l(r7)
            if (r16 == 0) goto L_0x02cc
            android.content.res.ColorStateList r7 = p507al.C14025c.m21583b(r13, r1, r7)
            r0.setErrorIconTintList(r7)
        L_0x02cc:
            r7 = 32
            boolean r16 = r1.mo3108l(r7)
            r14 = 0
            if (r16 == 0) goto L_0x02e0
            int r7 = r1.mo3104h(r7, r10)
            android.graphics.PorterDuff$Mode r7 = com.google.android.material.internal.C15370j.m24964e(r7, r14)
            r0.setErrorIconTintMode(r7)
        L_0x02e0:
            android.content.res.Resources r7 = r27.getResources()
            r14 = 2131952136(0x7f130208, float:1.9540706E38)
            java.lang.CharSequence r7 = r7.getText(r14)
            r6.setContentDescription(r7)
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r7 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5229s(r6, r3)
            r6.setClickable(r11)
            r6.setPressable(r11)
            r6.setFocusable(r11)
            r7 = 38
            int r7 = r1.mo3105i(r7, r11)
            r14 = 37
            boolean r14 = r1.mo3097a(r14, r11)
            r3 = 36
            java.lang.CharSequence r3 = r1.mo3107k(r3)
            r8 = 50
            int r8 = r1.mo3105i(r8, r11)
            r10 = 49
            java.lang.CharSequence r10 = r1.mo3107k(r10)
            r19 = r8
            r8 = 53
            int r8 = r1.mo3105i(r8, r11)
            r11 = 52
            java.lang.CharSequence r11 = r1.mo3107k(r11)
            r20 = r8
            r8 = 63
            r21 = r11
            r11 = 0
            int r8 = r1.mo3105i(r8, r11)
            r11 = 62
            java.lang.CharSequence r11 = r1.mo3107k(r11)
            r22 = r8
            r8 = 16
            r23 = r11
            r11 = 0
            boolean r8 = r1.mo3097a(r8, r11)
            r11 = 17
            r24 = r8
            r8 = -1
            int r11 = r1.mo3104h(r11, r8)
            r0.setCounterMaxLength(r11)
            r8 = 20
            r11 = 0
            int r8 = r1.mo3105i(r8, r11)
            r0.counterTextAppearance = r8
            r8 = 18
            int r8 = r1.mo3105i(r8, r11)
            r0.counterOverflowTextAppearance = r8
            android.content.Context r8 = r27.getContext()
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r8)
            r25 = r10
            r10 = 2131624092(0x7f0e009c, float:1.8875354E38)
            android.view.View r8 = r8.inflate(r10, r15, r11)
            com.google.android.material.internal.CheckableImageButton r8 = (com.google.android.material.internal.CheckableImageButton) r8
            r0.startIconView = r8
            r10 = 8
            r8.setVisibility(r10)
            boolean r10 = p507al.C14025c.m21586e(r13)
            if (r10 == 0) goto L_0x038a
            android.view.ViewGroup$LayoutParams r10 = r8.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            r10.setMarginEnd(r11)
        L_0x038a:
            r10 = 0
            r0.setStartIconOnClickListener(r10)
            r0.setStartIconOnLongClickListener(r10)
            r10 = 59
            boolean r11 = r1.mo3108l(r10)
            if (r11 == 0) goto L_0x03b9
            android.graphics.drawable.Drawable r10 = r1.mo3101e(r10)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r10)
            r10 = 58
            boolean r11 = r1.mo3108l(r10)
            if (r11 == 0) goto L_0x03af
            java.lang.CharSequence r10 = r1.mo3107k(r10)
            r0.setStartIconContentDescription((java.lang.CharSequence) r10)
        L_0x03af:
            r10 = 57
            r11 = 1
            boolean r10 = r1.mo3097a(r10, r11)
            r0.setStartIconCheckable(r10)
        L_0x03b9:
            r10 = 60
            boolean r11 = r1.mo3108l(r10)
            if (r11 == 0) goto L_0x03c8
            android.content.res.ColorStateList r10 = p507al.C14025c.m21583b(r13, r1, r10)
            r0.setStartIconTintList(r10)
        L_0x03c8:
            r10 = 61
            boolean r11 = r1.mo3108l(r10)
            if (r11 == 0) goto L_0x03dd
            r11 = -1
            int r10 = r1.mo3104h(r10, r11)
            r11 = 0
            android.graphics.PorterDuff$Mode r10 = com.google.android.material.internal.C15370j.m24964e(r10, r11)
            r0.setStartIconTintMode(r10)
        L_0x03dd:
            r10 = 6
            r11 = 0
            int r10 = r1.mo3104h(r10, r11)
            r0.setBoxBackgroundMode(r10)
            android.content.Context r10 = r27.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r29 = r2
            r26 = r4
            r4 = r17
            r2 = 2131624091(0x7f0e009b, float:1.8875352E38)
            android.view.View r2 = r10.inflate(r2, r4, r11)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.endIconView = r2
            r4.addView(r2)
            r10 = 8
            r2.setVisibility(r10)
            boolean r10 = p507al.C14025c.m21586e(r13)
            if (r10 == 0) goto L_0x0416
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.setMarginStart(r11)
        L_0x0416:
            r2 = 24
            int r2 = r1.mo3105i(r2, r11)
            com.google.android.material.textfield.f r10 = new com.google.android.material.textfield.f
            r10.<init>(r0, r2)
            r11 = -1
            r12.append(r11, r10)
            com.google.android.material.textfield.o r10 = new com.google.android.material.textfield.o
            r10.<init>(r0)
            r11 = 0
            r12.append(r11, r10)
            com.google.android.material.textfield.p r10 = new com.google.android.material.textfield.p
            if (r2 != 0) goto L_0x043b
            r17 = r5
            r5 = 45
            int r5 = r1.mo3105i(r5, r11)
            goto L_0x043e
        L_0x043b:
            r17 = r5
            r5 = r2
        L_0x043e:
            r10.<init>(r0, r5)
            r5 = 1
            r12.append(r5, r10)
            com.google.android.material.textfield.a r5 = new com.google.android.material.textfield.a
            r5.<init>(r0, r2)
            r10 = 2
            r12.append(r10, r5)
            com.google.android.material.textfield.h r5 = new com.google.android.material.textfield.h
            r5.<init>(r0, r2)
            r2 = 3
            r12.append(r2, r5)
            r2 = 25
            boolean r5 = r1.mo3108l(r2)
            r10 = 46
            if (r5 == 0) goto L_0x0483
            r5 = 0
            int r2 = r1.mo3104h(r2, r5)
            r0.setEndIconMode(r2)
            r2 = 23
            boolean r5 = r1.mo3108l(r2)
            if (r5 == 0) goto L_0x0478
            java.lang.CharSequence r2 = r1.mo3107k(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0478:
            r2 = 22
            r5 = 1
            boolean r2 = r1.mo3097a(r2, r5)
            r0.setEndIconCheckable(r2)
            goto L_0x04be
        L_0x0483:
            boolean r2 = r1.mo3108l(r10)
            if (r2 == 0) goto L_0x04be
            r2 = 0
            boolean r5 = r1.mo3097a(r10, r2)
            r0.setEndIconMode(r5)
            r2 = 44
            java.lang.CharSequence r2 = r1.mo3107k(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            r2 = 47
            boolean r5 = r1.mo3108l(r2)
            if (r5 == 0) goto L_0x04a9
            android.content.res.ColorStateList r2 = p507al.C14025c.m21583b(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04a9:
            r2 = 48
            boolean r5 = r1.mo3108l(r2)
            if (r5 == 0) goto L_0x04be
            r5 = -1
            int r2 = r1.mo3104h(r2, r5)
            r5 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C15370j.m24964e(r2, r5)
            r0.setEndIconTintMode(r2)
        L_0x04be:
            boolean r2 = r1.mo3108l(r10)
            if (r2 != 0) goto L_0x04e8
            r2 = 26
            boolean r5 = r1.mo3108l(r2)
            if (r5 == 0) goto L_0x04d3
            android.content.res.ColorStateList r2 = p507al.C14025c.m21583b(r13, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04d3:
            r2 = 27
            boolean r5 = r1.mo3108l(r2)
            if (r5 == 0) goto L_0x04e8
            r5 = -1
            int r2 = r1.mo3104h(r2, r5)
            r5 = 0
            android.graphics.PorterDuff$Mode r2 = com.google.android.material.internal.C15370j.m24964e(r2, r5)
            r0.setEndIconTintMode(r2)
        L_0x04e8:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.prefixTextView = r2
            r5 = 2131430142(0x7f0b0afe, float:1.8481977E38)
            r2.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r10 = -2
            r5.<init>(r10, r10)
            r2.setLayoutParams(r5)
            r5 = 1
            androidx.core.view.C2364y.C2371g.m5249f(r2, r5)
            r15.addView(r8)
            r15.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r13)
            r0.suffixTextView = r2
            r5 = 2131430143(0x7f0b0aff, float:1.8481979E38)
            r2.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r8 = 80
            r5.<init>(r10, r10, r8)
            r2.setLayoutParams(r5)
            r5 = 1
            androidx.core.view.C2364y.C2371g.m5249f(r2, r5)
            r9.addView(r2)
            r9.addView(r6)
            r9.addView(r4)
            r0.setHelperTextEnabled(r14)
            r0.setHelperText(r3)
            r0.setHelperTextTextAppearance(r7)
            r2 = r17
            r0.setErrorEnabled(r2)
            r2 = r29
            r0.setErrorTextAppearance(r2)
            r2 = r26
            r0.setErrorContentDescription(r2)
            int r2 = r0.counterTextAppearance
            r0.setCounterTextAppearance(r2)
            int r2 = r0.counterOverflowTextAppearance
            r0.setCounterOverflowTextAppearance(r2)
            r2 = r25
            r0.setPlaceholderText(r2)
            r2 = r19
            r0.setPlaceholderTextAppearance(r2)
            r2 = r21
            r0.setPrefixText(r2)
            r2 = r20
            r0.setPrefixTextAppearance(r2)
            r2 = r23
            r0.setSuffixText(r2)
            r2 = r22
            r0.setSuffixTextAppearance(r2)
            r2 = 34
            boolean r3 = r1.mo3108l(r2)
            if (r3 == 0) goto L_0x057b
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setErrorTextColor(r2)
        L_0x057b:
            r2 = 39
            boolean r3 = r1.mo3108l(r2)
            if (r3 == 0) goto L_0x058a
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setHelperTextColor(r2)
        L_0x058a:
            r2 = 43
            boolean r2 = r1.mo3108l(r2)
            if (r2 == 0) goto L_0x059b
            r2 = 43
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setHintTextColor(r2)
        L_0x059b:
            r2 = 21
            boolean r2 = r1.mo3108l(r2)
            if (r2 == 0) goto L_0x05ac
            r2 = 21
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setCounterTextColor(r2)
        L_0x05ac:
            r2 = 19
            boolean r2 = r1.mo3108l(r2)
            if (r2 == 0) goto L_0x05bd
            r2 = 19
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05bd:
            r2 = 51
            boolean r2 = r1.mo3108l(r2)
            if (r2 == 0) goto L_0x05ce
            r2 = 51
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05ce:
            r2 = 54
            boolean r2 = r1.mo3108l(r2)
            if (r2 == 0) goto L_0x05df
            r2 = 54
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setPrefixTextColor(r2)
        L_0x05df:
            r2 = 64
            boolean r2 = r1.mo3108l(r2)
            if (r2 == 0) goto L_0x05f0
            r2 = 64
            android.content.res.ColorStateList r2 = r1.mo3098b(r2)
            r0.setSuffixTextColor(r2)
        L_0x05f0:
            r2 = r24
            r0.setCounterEnabled(r2)
            r2 = 1
            r3 = 0
            boolean r3 = r1.mo3097a(r3, r2)
            r0.setEnabled(r3)
            r1.mo3109n()
            r1 = 2
            androidx.core.view.C2364y.C2368d.m5229s(r0, r1)
            androidx.core.view.C2364y.C2377l.m5301l(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.indicatorViewController.f34801k);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void updateCounter(int i) {
        boolean z = this.counterOverflowed;
        int i2 = this.counterMaxLength;
        if (i2 == -1) {
            this.counterView.setText(String.valueOf(i));
            this.counterView.setContentDescription((CharSequence) null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = i > i2;
            updateCounterContentDescription(getContext(), this.counterView, i, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(C4353a.m10043c().mo14297e(getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.counterMaxLength)})));
        }
        if (this.editText != null && z != this.counterOverflowed) {
            updateLabelState(false);
            updateTextInputBoxState();
            updateEditTextBackground();
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
