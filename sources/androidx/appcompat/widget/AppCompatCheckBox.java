package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckBox;
import com.etsy.android.R;
import p075d.C6614a;

public class AppCompatCheckBox extends CheckBox {
    private C0322i mAppCompatEmojiTextHelper;
    private final C0306d mBackgroundTintHelper;
    private final C0310f mCompoundButtonHelper;
    private final C0343r mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mButtonTintId;
        private int mButtonTintModeId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mButtonTintId = propertyMapper.mapObject("buttonTint", R.attr.buttonTint);
            this.mButtonTintModeId = propertyMapper.mapObject("buttonTintMode", R.attr.buttonTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatCheckBox appCompatCheckBox, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatCheckBox.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatCheckBox.getBackgroundTintMode());
                propertyReader.readObject(this.mButtonTintId, appCompatCheckBox.getButtonTintList());
                propertyReader.readObject(this.mButtonTintModeId, appCompatCheckBox.getButtonTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public AppCompatCheckBox(Context context) {
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

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0310f fVar = this.mCompoundButtonHelper;
        if (fVar != null) {
            fVar.getClass();
        }
        return compoundPaddingLeft;
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

    public ColorStateList getSupportButtonTintList() {
        C0310f fVar = this.mCompoundButtonHelper;
        if (fVar != null) {
            return fVar.f764b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0310f fVar = this.mCompoundButtonHelper;
        if (fVar != null) {
            return fVar.f765c;
        }
        return null;
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo3058b();
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo3060d(z);
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

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0310f fVar = this.mCompoundButtonHelper;
        if (fVar == null) {
            return;
        }
        if (fVar.f768f) {
            fVar.f768f = false;
            return;
        }
        fVar.f768f = true;
        fVar.mo3035a();
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3061e(z);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo3057a(inputFilterArr));
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

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0310f fVar = this.mCompoundButtonHelper;
        if (fVar != null) {
            fVar.f764b = colorStateList;
            fVar.f766d = true;
            fVar.mo3035a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0310f fVar = this.mCompoundButtonHelper;
        if (fVar != null) {
            fVar.f765c = mode;
            fVar.f767e = true;
            fVar.mo3035a();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        C0334m0.m882a(this, getContext());
        C0310f fVar = new C0310f(this);
        this.mCompoundButtonHelper = fVar;
        fVar.mo3036b(attributeSet, i);
        C0306d dVar = new C0306d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo3026d(attributeSet, i);
        C0343r rVar = new C0343r(this);
        this.mTextHelper = rVar;
        rVar.mo3113d(attributeSet, i);
        getEmojiTextViewHelper().mo3059c(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C6614a.m12981a(getContext(), i));
    }
}
