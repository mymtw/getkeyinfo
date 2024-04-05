package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.CheckedTextView;
import androidx.core.widget.C2404h;
import com.etsy.android.R;
import kotlin.jvm.internal.C19388s;
import p075d.C6614a;

public class AppCompatCheckedTextView extends CheckedTextView {
    private C0322i mAppCompatEmojiTextHelper;
    private final C0306d mBackgroundTintHelper;
    private final C0308e mCheckedHelper;
    private final C0343r mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mCheckMarkTintId;
        private int mCheckMarkTintModeId;
        private boolean mPropertiesMapped = false;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBackgroundTintId = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.mBackgroundTintModeId = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.mCheckMarkTintId = propertyMapper.mapObject("checkMarkTint", R.attr.checkMarkTint);
            this.mCheckMarkTintModeId = propertyMapper.mapObject("checkMarkTintMode", R.attr.checkMarkTintMode);
            this.mPropertiesMapped = true;
        }

        public void readProperties(AppCompatCheckedTextView appCompatCheckedTextView, PropertyReader propertyReader) {
            if (this.mPropertiesMapped) {
                propertyReader.readObject(this.mBackgroundTintId, appCompatCheckedTextView.getBackgroundTintList());
                propertyReader.readObject(this.mBackgroundTintModeId, appCompatCheckedTextView.getBackgroundTintMode());
                propertyReader.readObject(this.mCheckMarkTintId, appCompatCheckedTextView.getCheckMarkTintList());
                propertyReader.readObject(this.mCheckMarkTintModeId, appCompatCheckedTextView.getCheckMarkTintMode());
                return;
            }
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
    }

    public AppCompatCheckedTextView(Context context) {
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
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3112b();
        }
        C0306d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.mo3023a();
        }
        C0308e eVar = this.mCheckedHelper;
        if (eVar != null) {
            eVar.mo3032a();
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

    public ColorStateList getSupportCheckMarkTintList() {
        C0308e eVar = this.mCheckedHelper;
        if (eVar != null) {
            return eVar.f757b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0308e eVar = this.mCheckedHelper;
        if (eVar != null) {
            return eVar.f758c;
        }
        return null;
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().mo3058b();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C19388s.m32876o0(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
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

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0308e eVar = this.mCheckedHelper;
        if (eVar == null) {
            return;
        }
        if (eVar.f761f) {
            eVar.f761f = false;
            return;
        }
        eVar.f761f = true;
        eVar.mo3032a();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C2404h.m5365g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo3061e(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0308e eVar = this.mCheckedHelper;
        if (eVar != null) {
            eVar.f757b = colorStateList;
            eVar.f759d = true;
            eVar.mo3032a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0308e eVar = this.mCheckedHelper;
        if (eVar != null) {
            eVar.f758c = mode;
            eVar.f760e = true;
            eVar.mo3032a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0343r rVar = this.mTextHelper;
        if (rVar != null) {
            rVar.mo3114e(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f A[SYNTHETIC, Splitter:B:11:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007f A[Catch:{ all -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008f A[Catch:{ all -> 0x00a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatCheckedTextView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            android.content.Context r8 = androidx.appcompat.widget.TintContextWrapper.wrap(r8)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            androidx.appcompat.widget.C0334m0.m882a(r7, r8)
            androidx.appcompat.widget.r r8 = new androidx.appcompat.widget.r
            r8.<init>(r7)
            r7.mTextHelper = r8
            r8.mo3113d(r9, r10)
            r8.mo3112b()
            androidx.appcompat.widget.d r8 = new androidx.appcompat.widget.d
            r8.<init>(r7)
            r7.mBackgroundTintHelper = r8
            r8.mo3026d(r9, r10)
            androidx.appcompat.widget.e r8 = new androidx.appcompat.widget.e
            r8.<init>(r7)
            r7.mCheckedHelper = r8
            android.content.Context r0 = r7.getContext()
            int[] r3 = p628nj.C18263b.f40082s
            androidx.appcompat.widget.p0 r0 = androidx.appcompat.widget.C0340p0.m891m(r0, r9, r3, r10)
            android.content.Context r2 = r7.getContext()
            android.content.res.TypedArray r5 = r0.f876b
            r1 = r7
            r4 = r9
            r6 = r10
            androidx.core.view.C2364y.m5200o(r1, r2, r3, r4, r5, r6)
            r1 = 1
            boolean r2 = r0.mo3108l(r1)     // Catch:{ all -> 0x00a9 }
            r3 = 0
            if (r2 == 0) goto L_0x005c
            int r2 = r0.mo3105i(r1, r3)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x005c
            android.content.Context r4 = r7.getContext()     // Catch:{ NotFoundException -> 0x005c }
            android.graphics.drawable.Drawable r2 = p075d.C6614a.m12981a(r4, r2)     // Catch:{ NotFoundException -> 0x005c }
            r7.setCheckMarkDrawable((android.graphics.drawable.Drawable) r2)     // Catch:{ NotFoundException -> 0x005c }
            goto L_0x005d
        L_0x005c:
            r1 = r3
        L_0x005d:
            if (r1 != 0) goto L_0x0078
            boolean r1 = r0.mo3108l(r3)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x0078
            int r1 = r0.mo3105i(r3, r3)     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x0078
            android.widget.CheckedTextView r2 = r8.f756a     // Catch:{ all -> 0x00a9 }
            android.content.Context r3 = r2.getContext()     // Catch:{ all -> 0x00a9 }
            android.graphics.drawable.Drawable r1 = p075d.C6614a.m12981a(r3, r1)     // Catch:{ all -> 0x00a9 }
            r2.setCheckMarkDrawable(r1)     // Catch:{ all -> 0x00a9 }
        L_0x0078:
            r1 = 2
            boolean r2 = r0.mo3108l(r1)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x0088
            android.widget.CheckedTextView r2 = r8.f756a     // Catch:{ all -> 0x00a9 }
            android.content.res.ColorStateList r1 = r0.mo3098b(r1)     // Catch:{ all -> 0x00a9 }
            r2.setCheckMarkTintList(r1)     // Catch:{ all -> 0x00a9 }
        L_0x0088:
            r1 = 3
            boolean r2 = r0.mo3108l(r1)     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x009e
            android.widget.CheckedTextView r8 = r8.f756a     // Catch:{ all -> 0x00a9 }
            r2 = -1
            int r1 = r0.mo3104h(r1, r2)     // Catch:{ all -> 0x00a9 }
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.C0359y.m997d(r1, r2)     // Catch:{ all -> 0x00a9 }
            r8.setCheckMarkTintMode(r1)     // Catch:{ all -> 0x00a9 }
        L_0x009e:
            r0.mo3109n()
            androidx.appcompat.widget.i r8 = r7.getEmojiTextViewHelper()
            r8.mo3059c(r9, r10)
            return
        L_0x00a9:
            r8 = move-exception
            r0.mo3109n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatCheckedTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C6614a.m12981a(getContext(), i));
    }
}
