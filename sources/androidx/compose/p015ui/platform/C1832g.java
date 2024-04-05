package androidx.compose.p015ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.g */
public final class C1832g extends C1812a {

    /* renamed from: d */
    public static C1832g f4091d;

    /* renamed from: c */
    public BreakIterator f4092c;

    public C1832g(Locale locale) {
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        C19383o.m32796f(wordInstance, "getWordInstance(locale)");
        this.f4092c = wordInstance;
    }

    /* renamed from: a */
    public final int[] mo7194a(int i) {
        if (mo7180d().length() <= 0 || i >= mo7180d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!mo7221g(i)) {
            boolean z = true;
            if (!mo7221g(i) || (i != 0 && mo7221g(i - 1))) {
                z = false;
            }
            if (z) {
                break;
            }
            BreakIterator breakIterator = this.f4092c;
            if (breakIterator != null) {
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            } else {
                C19383o.m32805o("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f4092c;
        if (breakIterator2 != null) {
            int following = breakIterator2.following(i);
            if (following == -1 || !mo7220f(following)) {
                return null;
            }
            return mo7179c(i, following);
        }
        C19383o.m32805o("impl");
        throw null;
    }

    /* renamed from: b */
    public final int[] mo7195b(int i) {
        int length = mo7180d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !mo7221g(i - 1) && !mo7220f(i)) {
            BreakIterator breakIterator = this.f4092c;
            if (breakIterator != null) {
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            } else {
                C19383o.m32805o("impl");
                throw null;
            }
        }
        BreakIterator breakIterator2 = this.f4092c;
        if (breakIterator2 != null) {
            int preceding = breakIterator2.preceding(i);
            if (preceding != -1) {
                boolean z = true;
                if (!mo7221g(preceding) || (preceding != 0 && mo7221g(preceding - 1))) {
                    z = false;
                }
                if (z) {
                    return mo7179c(preceding, i);
                }
            }
            return null;
        }
        C19383o.m32805o("impl");
        throw null;
    }

    /* renamed from: e */
    public final void mo7219e(String str) {
        C19383o.m32797g(str, "text");
        this.f4064a = str;
        BreakIterator breakIterator = this.f4092c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            C19383o.m32805o("impl");
            throw null;
        }
    }

    /* renamed from: f */
    public final boolean mo7220f(int i) {
        return i > 0 && mo7221g(i + -1) && (i == mo7180d().length() || !mo7221g(i));
    }

    /* renamed from: g */
    public final boolean mo7221g(int i) {
        if (i < 0 || i >= mo7180d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(mo7180d().codePointAt(i));
    }
}
