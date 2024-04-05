package p175m1;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.C2665e;

/* renamed from: m1.h */
public final class C7311h implements TransformationMethod {

    /* renamed from: b */
    public final TransformationMethod f16203b;

    public C7311h(TransformationMethod transformationMethod) {
        this.f16203b = transformationMethod;
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f16203b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C2665e.m6414a().mo10064b() != 1) {
            return charSequence;
        }
        C2665e a = C2665e.m6414a();
        a.getClass();
        return a.mo10068f(0, charSequence.length(), charSequence);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f16203b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
