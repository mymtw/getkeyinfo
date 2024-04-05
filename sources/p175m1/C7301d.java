package p175m1;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C2665e;
import java.lang.ref.WeakReference;

/* renamed from: m1.d */
public final class C7301d implements InputFilter {

    /* renamed from: a */
    public final TextView f16187a;

    /* renamed from: b */
    public C7302a f16188b;

    /* renamed from: m1.d$a */
    public static class C7302a extends C2665e.C2670e {

        /* renamed from: a */
        public final WeakReference f16189a;

        /* renamed from: b */
        public final WeakReference f16190b;

        public C7302a(TextView textView, C7301d dVar) {
            this.f16189a = new WeakReference(textView);
            this.f16190b = new WeakReference(dVar);
        }

        /* renamed from: b */
        public final void mo2835b() {
            boolean z;
            int i;
            InputFilter[] filters;
            TextView textView = (TextView) this.f16189a.get();
            InputFilter inputFilter = (InputFilter) this.f16190b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= filters.length) {
                        break;
                    } else if (filters[i2] == inputFilter) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z = false;
            if (z && textView.isAttachedToWindow()) {
                C2665e a = C2665e.m6414a();
                CharSequence text = textView.getText();
                if (text == null) {
                    i = 0;
                } else {
                    a.getClass();
                    i = text.length();
                }
                CharSequence f = a.mo10068f(0, i, text);
                int selectionStart = Selection.getSelectionStart(f);
                int selectionEnd = Selection.getSelectionEnd(f);
                textView.setText(f);
                if (f instanceof Spannable) {
                    Spannable spannable = (Spannable) f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public C7301d(TextView textView) {
        this.f16187a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f16187a.isInEditMode()) {
            return charSequence;
        }
        int b = C2665e.m6414a().mo10064b();
        if (b != 0) {
            boolean z = true;
            if (b == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f16187a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C2665e.m6414a().mo10068f(0, charSequence.length(), charSequence);
            } else if (b != 3) {
                return charSequence;
            }
        }
        C2665e a = C2665e.m6414a();
        if (this.f16188b == null) {
            this.f16188b = new C7302a(this.f16187a, this);
        }
        a.mo10069g(this.f16188b);
        return charSequence;
    }
}
