package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C2282c;
import androidx.core.view.C2329s;
import androidx.core.view.C2364y;
import androidx.core.widget.C2404h;
import androidx.core.widget.C2406i;
import com.etsy.android.R;
import kotlin.jvm.internal.C19388s;
import p099f1.C6768a;
import p099f1.C6769b;
import p099f1.C6770c;

public class AppCompatEditText extends EditText implements C2329s {
    private final C0320h mAppCompatEmojiEditTextHelper;
    private final C0306d mBackgroundTintHelper;
    private final C2406i mDefaultOnReceiveContentListener;
    private final C0339p mTextClassifierHelper;
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

        public void readProperties(AppCompatEditText appCompatEditText, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatEditText.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatEditText.getBackgroundTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public AppCompatEditText(Context context) {
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
        String[] g;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            C6768a.m13160a(editorInfo, getText());
        }
        C19388s.m32876o0(this, editorInfo, onCreateInputConnection);
        if (!(onCreateInputConnection == null || i > 30 || (g = C2364y.m5192g(this)) == null)) {
            editorInfo.contentMimeTypes = g;
            onCreateInputConnection = new C6769b(onCreateInputConnection, new C6770c(this));
        }
        return this.mAppCompatEmojiEditTextHelper.mo3055c(onCreateInputConnection, editorInfo);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C2364y.m5192g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = C0335n.m886a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public C2282c onReceiveContent(C2282c cVar) {
        return this.mDefaultOnReceiveContentListener.mo8916a(this, cVar);
    }

    public boolean onTextContextMenuItem(int i) {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 < 31 && C2364y.m5192g(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                C2282c.C2284b aVar = i2 >= 31 ? new C2282c.C2283a(primaryClip, 1) : new C2282c.C2285c(primaryClip, 1);
                if (i != 16908322) {
                    i3 = 1;
                }
                aVar.setFlags(i3);
                C2364y.m5197l(this, aVar.build());
            }
            i3 = 1;
        }
        if (i3 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    public void setTextClassifier(TextClassifier textClassifier) {
        C0339p pVar;
        if (Build.VERSION.SDK_INT >= 28 || (pVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            pVar.f874b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(TintContextWrapper.wrap(context), attributeSet, i);
        C0334m0.m882a(this, getContext());
        C0306d dVar = new C0306d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.mo3026d(attributeSet, i);
        C0343r rVar = new C0343r(this);
        this.mTextHelper = rVar;
        rVar.mo3113d(attributeSet, i);
        rVar.mo3112b();
        this.mTextClassifierHelper = new C0339p(this);
        this.mDefaultOnReceiveContentListener = new C2406i();
        C0320h hVar = new C0320h(this);
        this.mAppCompatEmojiEditTextHelper = hVar;
        hVar.mo3054b(attributeSet, i);
        initEmojiKeyListener(hVar);
    }
}
