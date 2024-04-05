package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p175m1.C7305f;
import p628nj.C18263b;

/* renamed from: androidx.appcompat.widget.i */
public final class C0322i {

    /* renamed from: a */
    public final TextView f812a;

    /* renamed from: b */
    public final C7305f f813b;

    public C0322i(TextView textView) {
        this.f812a = textView;
        this.f813b = new C7305f(textView);
    }

    /* renamed from: a */
    public final InputFilter[] mo3057a(InputFilter[] inputFilterArr) {
        return this.f813b.f16193a.mo19573a(inputFilterArr);
    }

    /* renamed from: b */
    public final boolean mo3058b() {
        return this.f813b.f16193a.mo19574b();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo3059c(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f812a.getContext().obtainStyledAttributes(attributeSet, C18263b.f40079p, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            mo3061e(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public final void mo3060d(boolean z) {
        this.f813b.f16193a.mo19575c(z);
    }

    /* renamed from: e */
    public final void mo3061e(boolean z) {
        this.f813b.f16193a.mo19576d(z);
    }
}
