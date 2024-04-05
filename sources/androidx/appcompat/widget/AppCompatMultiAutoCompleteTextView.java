package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.MultiAutoCompleteTextView;
import com.etsy.android.R;
import kotlin.jvm.internal.C19388s;
import p075d.C6614a;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {
    private static final int[] TINT_ATTRS = {16843126};
    private final C0320h mAppCompatEmojiEditTextHelper;
    private final C0306d mBackgroundTintHelper;
    private final C0343r mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatMultiAutoCompleteTextView appCompatMultiAutoCompleteTextView, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatMultiAutoCompleteTextView.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatMultiAutoCompleteTextView.getBackgroundTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, (AttributeSet) null);
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

    public void initEmojiKeyListener(C0320h hVar) {
        KeyListener keyListener = getKeyListener();
        hVar.getClass();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a = hVar.mo3053a(keyListener);
            if (a != keyListener) {
                super.setKeyListener(a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
            }
        }
    }

    public boolean isEmojiCompatEnabled() {
        return this.mAppCompatEmojiEditTextHelper.f811b.f16179a.f16181b.f16201e;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C19388s.m32876o0(this, editorInfo, onCreateInputConnection);
        return this.mAppCompatEmojiEditTextHelper.mo3055c(onCreateInputConnection, editorInfo);
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

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C6614a.m12981a(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.mo3056d(z);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.mo3053a(keyListener));
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

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3114e(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        C0334m0.m882a(this, getContext());
        C0340p0 m = C0340p0.m891m(getContext(), attributeSet, TINT_ATTRS, i);
        if (m.mo3108l(0)) {
            setDropDownBackgroundDrawable(m.mo3101e(0));
        }
        m.mo3109n();
        C0306d dVar = new C0306d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo3026d(attributeSet, i);
        C0343r rVar = new C0343r(this);
        this.mTextHelper = rVar;
        rVar.mo3113d(attributeSet, i);
        rVar.mo3112b();
        C0320h hVar = new C0320h(this);
        this.mAppCompatEmojiEditTextHelper = hVar;
        hVar.mo3054b(attributeSet, i);
        initEmojiKeyListener(hVar);
    }
}
