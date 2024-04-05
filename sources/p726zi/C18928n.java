package p726zi;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import p636oi.C18296a;

/* renamed from: zi.n */
public final class C18928n {
    /* renamed from: a */
    public static void m32023a(C18296a.C18297a aVar) {
        aVar.f40174k = -3.4028235E38f;
        aVar.f40173j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f40164a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f40164a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = aVar.f40164a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public static float m32024b(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = (float) i3;
        } else if (i == 1) {
            f2 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f;
        }
        return f * f2;
    }
}
