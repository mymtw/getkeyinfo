package p175m1;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C2665e;
import java.lang.ref.WeakReference;

/* renamed from: m1.g */
public final class C7309g implements TextWatcher {

    /* renamed from: b */
    public final EditText f16198b;

    /* renamed from: c */
    public final boolean f16199c = false;

    /* renamed from: d */
    public C7310a f16200d;

    /* renamed from: e */
    public boolean f16201e = true;

    /* renamed from: m1.g$a */
    public static class C7310a extends C2665e.C2670e {

        /* renamed from: a */
        public final WeakReference f16202a;

        public C7310a(EditText editText) {
            this.f16202a = new WeakReference(editText);
        }

        /* renamed from: b */
        public final void mo2835b() {
            C7309g.m14025a((EditText) this.f16202a.get(), 1);
        }
    }

    public C7309g(EditText editText) {
        this.f16198b = editText;
    }

    /* renamed from: a */
    public static void m14025a(EditText editText, int i) {
        int i2;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2665e a = C2665e.m6414a();
            if (editableText == null) {
                i2 = 0;
            } else {
                a.getClass();
                i2 = editableText.length();
            }
            a.mo10068f(0, i2, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if ((androidx.emoji2.text.C2665e.f6004k != null) == false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            android.widget.EditText r0 = r3.f16198b
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r3.f16201e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            boolean r0 = r3.f16199c
            if (r0 != 0) goto L_0x001c
            androidx.emoji2.text.e r0 = androidx.emoji2.text.C2665e.f6004k
            if (r0 == 0) goto L_0x0018
            r0 = r2
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0056
        L_0x001f:
            if (r6 > r7) goto L_0x0056
            boolean r6 = r4 instanceof android.text.Spannable
            if (r6 == 0) goto L_0x0056
            androidx.emoji2.text.e r6 = androidx.emoji2.text.C2665e.m6414a()
            int r6 = r6.mo10064b()
            if (r6 == 0) goto L_0x0040
            if (r6 == r2) goto L_0x0035
            r4 = 3
            if (r6 == r4) goto L_0x0040
            goto L_0x0056
        L_0x0035:
            android.text.Spannable r4 = (android.text.Spannable) r4
            androidx.emoji2.text.e r6 = androidx.emoji2.text.C2665e.m6414a()
            int r7 = r7 + r5
            r6.mo10068f(r5, r7, r4)
            goto L_0x0056
        L_0x0040:
            androidx.emoji2.text.e r4 = androidx.emoji2.text.C2665e.m6414a()
            m1.g$a r5 = r3.f16200d
            if (r5 != 0) goto L_0x0051
            m1.g$a r5 = new m1.g$a
            android.widget.EditText r6 = r3.f16198b
            r5.<init>(r6)
            r3.f16200d = r5
        L_0x0051:
            m1.g$a r5 = r3.f16200d
            r4.mo10069g(r5)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p175m1.C7309g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
