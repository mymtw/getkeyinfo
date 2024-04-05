package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.widget.C2396a;
import androidx.core.widget.C2404h;
import com.etsy.android.R;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.IntFunction;
import kotlin.jvm.internal.C19388s;
import p075d.C6614a;
import p099f1.C6768a;
import p289y0.C8356g;
import p289y0.C8363m;

public class AppCompatTextView extends TextView implements C2396a {
    private final C0306d mBackgroundTintHelper;
    private C0322i mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<PrecomputedTextCompat> mPrecomputedTextFuture;
    private final C0339p mTextClassifierHelper;
    private final C0343r mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mAutoSizeMaxTextSizeId;
        private int mAutoSizeMinTextSizeId;
        private int mAutoSizeStepGranularityId;
        private int mAutoSizeTextTypeId;
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped = false;

        /* renamed from: androidx.appcompat.widget.AppCompatTextView$InspectionCompanion$a */
        public class C0260a implements IntFunction<String> {
            public final Object apply(int i) {
                return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
            }
        }

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mAutoSizeMaxTextSizeId = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
            this.mAutoSizeMinTextSizeId = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
            this.mAutoSizeStepGranularityId = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
            this.mAutoSizeTextTypeId = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new C0260a());
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatTextView appCompatTextView, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readInt(this.mAutoSizeMaxTextSizeId, appCompatTextView.getAutoSizeMaxTextSize());
                propertyReader.readInt(this.mAutoSizeMinTextSizeId, appCompatTextView.getAutoSizeMinTextSize());
                propertyReader.readInt(this.mAutoSizeStepGranularityId, appCompatTextView.getAutoSizeStepGranularity());
                propertyReader.readIntEnum(this.mAutoSizeTextTypeId, appCompatTextView.getAutoSizeTextType());
                propertyReader.readObject(this.mBackgroundTintId, appCompatTextView.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatTextView.getBackgroundTintMode());
                propertyReader.readObject(this.mDrawableTintId, appCompatTextView.getCompoundDrawableTintList());
                propertyReader.readObject(this.mDrawableTintModeId, appCompatTextView.getCompoundDrawableTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<PrecomputedTextCompat> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C2404h.m5363e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private C0322i getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new C0322i(this);
        }
        return this.mEmojiTextViewHelper;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3023a();
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (C2396a.f5676d0) {
            return super.getAutoSizeMaxTextSize();
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            return Math.round(rVar.f888i.f927e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (C2396a.f5676d0) {
            return super.getAutoSizeMinTextSize();
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            return Math.round(rVar.f888i.f926d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (C2396a.f5676d0) {
            return super.getAutoSizeStepGranularity();
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            return Math.round(rVar.f888i.f925c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (C2396a.f5676d0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0343r rVar = this.mTextHelper;
        return rVar != null ? rVar.f888i.f928f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C2396a.f5676d0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            return rVar.f888i.f923a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C2404h.m5364f(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo3024b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.mo3025c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0336n0 n0Var = this.mTextHelper.f887h;
        if (n0Var != null) {
            return n0Var.f862a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0336n0 n0Var = this.mTextHelper.f887h;
        if (n0Var != null) {
            return n0Var.f863b;
        }
        return null;
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0339p pVar;
        if (Build.VERSION.SDK_INT >= 28 || (pVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = pVar.f874b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) pVar.f873a.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier = TextClassifier.NO_OP;
        }
        return textClassifier;
    }

    public PrecomputedTextCompat.C2270a getTextMetricsParamsCompat() {
        return C2404h.m5359a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo3058b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            C6768a.m13160a(editorInfo, getText());
        }
        C19388s.m32876o0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0343r rVar = this.mTextHelper;
        if (rVar != null && !C2396a.f5676d0) {
            rVar.f888i.mo3163a();
        }
    }

    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0343r rVar = this.mTextHelper;
        if (rVar != null && !C2396a.f5676d0) {
            C0349t tVar = rVar.f888i;
            if (tVar.mo3168i() && tVar.f923a != 0) {
                this.mTextHelper.f888i.mo3163a();
            }
        }
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3060d(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C2396a.f5676d0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3115f(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (C2396a.f5676d0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3116g(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C2396a.f5676d0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3117h(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3027e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3028f(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2404h.m5365g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3061e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo3057a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C2404h.m5360b(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C2404h.m5361c(this, i);
        }
    }

    public void setLineHeight(int i) {
        C2404h.m5362d(this, i);
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        C2404h.m5363e(this, precomputedTextCompat);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3030h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3031i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0343r rVar = this.mTextHelper;
        if (rVar.f887h == null) {
            rVar.f887h = new C0336n0();
        }
        C0336n0 n0Var = rVar.f887h;
        n0Var.f862a = colorStateList;
        n0Var.f865d = colorStateList != null;
        rVar.f881b = n0Var;
        rVar.f882c = n0Var;
        rVar.f883d = n0Var;
        rVar.f884e = n0Var;
        rVar.f885f = n0Var;
        rVar.f886g = n0Var;
        rVar.mo3112b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0343r rVar = this.mTextHelper;
        if (rVar.f887h == null) {
            rVar.f887h = new C0336n0();
        }
        C0336n0 n0Var = rVar.f887h;
        n0Var.f863b = mode;
        n0Var.f864c = mode != null;
        rVar.f881b = n0Var;
        rVar.f882c = n0Var;
        rVar.f883d = n0Var;
        rVar.f884e = n0Var;
        rVar.f885f = n0Var;
        rVar.f886g = n0Var;
        rVar.mo3112b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3114e(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0339p pVar;
        if (Build.VERSION.SDK_INT >= 28 || (pVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            pVar.f874b = textClassifier;
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.C2270a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f5528b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.f5527a);
        setBreakStrategy(aVar.f5529c);
        setHyphenationFrequency(aVar.f5530d);
    }

    public void setTextSize(int i, float f) {
        boolean z = C2396a.f5676d0;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0343r rVar = this.mTextHelper;
        if (rVar != null && !z) {
            C0349t tVar = rVar.f888i;
            if (!(tVar.mo3168i() && tVar.f923a != 0)) {
                rVar.f888i.mo3165f(f, i);
            }
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.mIsSetTypefaceProcessing) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                C8363m mVar = C8356g.f18327a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        this.mIsSetTypefaceProcessing = false;
        C0334m0.m882a(this, getContext());
        C0306d dVar = new C0306d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo3026d(attributeSet, i);
        C0343r rVar = new C0343r(this);
        this.mTextHelper = rVar;
        rVar.mo3113d(attributeSet, i);
        rVar.mo3112b();
        this.mTextClassifierHelper = new C0339p(this);
        getEmojiTextViewHelper().mo3059c(attributeSet, i);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? C6614a.m12981a(context, i) : null;
        Drawable a2 = i2 != 0 ? C6614a.m12981a(context, i2) : null;
        Drawable a3 = i3 != 0 ? C6614a.m12981a(context, i3) : null;
        if (i4 != 0) {
            drawable = C6614a.m12981a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a, a2, a3, drawable);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? C6614a.m12981a(context, i) : null;
        Drawable a2 = i2 != 0 ? C6614a.m12981a(context, i2) : null;
        Drawable a3 = i3 != 0 ? C6614a.m12981a(context, i3) : null;
        if (i4 != 0) {
            drawable = C6614a.m12981a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(a, a2, a3, drawable);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
    }
}
