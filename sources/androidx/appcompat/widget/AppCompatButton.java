package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import androidx.core.widget.C2396a;
import androidx.core.widget.C2404h;
import com.etsy.android.R;
import java.util.function.IntFunction;

public class AppCompatButton extends Button implements C2396a {
    private C0322i mAppCompatEmojiTextHelper;
    private final C0306d mBackgroundTintHelper;
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

        /* renamed from: androidx.appcompat.widget.AppCompatButton$InspectionCompanion$a */
        public class C0249a implements IntFunction<String> {
            public final Object apply(int i) {
                return i != 0 ? i != 1 ? String.valueOf(i) : "uniform" : "none";
            }
        }

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mAutoSizeMaxTextSizeId = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.autoSizeMaxTextSize);
            this.mAutoSizeMinTextSizeId = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.autoSizeMinTextSize);
            this.mAutoSizeStepGranularityId = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.autoSizeStepGranularity);
            this.mAutoSizeTextTypeId = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.autoSizeTextType, new C0249a());
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mDrawableTintId = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.mDrawableTintModeId = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatButton appCompatButton, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readInt(this.mAutoSizeMaxTextSizeId, appCompatButton.getAutoSizeMaxTextSize());
                propertyReader.readInt(this.mAutoSizeMinTextSizeId, appCompatButton.getAutoSizeMinTextSize());
                propertyReader.readInt(this.mAutoSizeStepGranularityId, appCompatButton.getAutoSizeStepGranularity());
                propertyReader.readIntEnum(this.mAutoSizeTextTypeId, appCompatButton.getAutoSizeTextType());
                propertyReader.readObject(this.mBackgroundTintId, appCompatButton.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatButton.getBackgroundTintMode());
                propertyReader.readObject(this.mDrawableTintId, appCompatButton.getCompoundDrawableTintList());
                propertyReader.readObject(this.mDrawableTintModeId, appCompatButton.getCompoundDrawableTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public AppCompatButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private C0322i getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new C0322i(this);
        }
        return this.mAppCompatEmojiTextHelper;
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

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo3058b();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0343r rVar = this.mTextHelper;
        if (rVar != null && !C2396a.f5676d0) {
            rVar.f888i.mo3163a();
        }
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2404h.m5365g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3061e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo3057a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.f880a.setAllCaps(z);
        }
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

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        C0334m0.m882a(this, getContext());
        C0306d dVar = new C0306d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo3026d(attributeSet, i);
        C0343r rVar = new C0343r(this);
        this.mTextHelper = rVar;
        rVar.mo3113d(attributeSet, i);
        rVar.mo3112b();
        getEmojiTextViewHelper().mo3059c(attributeSet, i);
    }
}
