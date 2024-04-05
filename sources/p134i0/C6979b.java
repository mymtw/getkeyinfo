package p134i0;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.text.android.C1917a;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: i0.b */
public final class C6979b {

    /* renamed from: a */
    public final CharSequence f15466a;

    /* renamed from: b */
    public final int f15467b;

    /* renamed from: c */
    public final int f15468c;

    /* renamed from: d */
    public final BreakIterator f15469d;

    /* renamed from: i0.b$a */
    public static final class C6980a {
        /* renamed from: a */
        public static boolean m13521a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public C6979b(CharSequence charSequence, int i, Locale locale) {
        this.f15466a = charSequence;
        boolean z = true;
        if (charSequence.length() >= 0) {
            if ((i < 0 || i > charSequence.length()) ? false : z) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                C19383o.m32796f(wordInstance, "getWordInstance(locale)");
                this.f15469d = wordInstance;
                this.f15467b = Math.max(0, -50);
                this.f15468c = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new C1917a(i, charSequence));
                return;
            }
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
    }

    /* renamed from: a */
    public final void mo19145a(int i) {
        int i2 = this.f15467b;
        boolean z = false;
        if (i <= this.f15468c && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder h = C0069a.m177h("Invalid offset: ", i, ". Valid range is [");
            h.append(this.f15467b);
            h.append(" , ");
            throw new IllegalArgumentException(C0073e.m208h(h, this.f15468c, ']').toString());
        }
    }

    /* renamed from: b */
    public final boolean mo19146b(int i) {
        return (i <= this.f15468c && this.f15467b + 1 <= i) && Character.isLetterOrDigit(Character.codePointBefore(this.f15466a, i));
    }

    /* renamed from: c */
    public final boolean mo19147c(int i) {
        boolean z = true;
        int i2 = this.f15467b + 1;
        if (i > this.f15468c || i2 > i) {
            z = false;
        }
        if (z) {
            return C6980a.m13521a(Character.codePointBefore(this.f15466a, i));
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo19148d(int i) {
        return (i < this.f15468c && this.f15467b <= i) && Character.isLetterOrDigit(Character.codePointAt(this.f15466a, i));
    }

    /* renamed from: e */
    public final boolean mo19149e(int i) {
        if (i < this.f15468c && this.f15467b <= i) {
            return C6980a.m13521a(Character.codePointAt(this.f15466a, i));
        }
        return false;
    }
}
