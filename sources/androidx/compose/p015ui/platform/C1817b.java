package androidx.compose.p015ui.platform;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.b */
public final class C1817b extends C1812a {

    /* renamed from: d */
    public static C1817b f4071d;

    /* renamed from: c */
    public BreakIterator f4072c;

    public C1817b(Locale locale) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        C19383o.m32796f(characterInstance, "getCharacterInstance(locale)");
        this.f4072c = characterInstance;
    }

    /* renamed from: a */
    public final int[] mo7194a(int i) {
        int length = mo7180d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.f4072c;
            if (breakIterator == null) {
                C19383o.m32805o("impl");
                throw null;
            } else if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f4072c;
                if (breakIterator2 != null) {
                    i = breakIterator2.following(i);
                } else {
                    C19383o.m32805o("impl");
                    throw null;
                }
            } else {
                BreakIterator breakIterator3 = this.f4072c;
                if (breakIterator3 != null) {
                    int following = breakIterator3.following(i);
                    if (following == -1) {
                        return null;
                    }
                    return mo7179c(i, following);
                }
                C19383o.m32805o("impl");
                throw null;
            }
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f4072c;
            if (breakIterator == null) {
                C19383o.m32805o("impl");
                throw null;
            } else if (!breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.f4072c;
                if (breakIterator2 != null) {
                    i = breakIterator2.preceding(i);
                } else {
                    C19383o.m32805o("impl");
                    throw null;
                }
            } else {
                BreakIterator breakIterator3 = this.f4072c;
                if (breakIterator3 != null) {
                    int preceding = breakIterator3.preceding(i);
                    if (preceding == -1) {
                        return null;
                    }
                    return mo7179c(preceding, i);
                }
                C19383o.m32805o("impl");
                throw null;
            }
        } while (i != -1);
        return null;
    }

    /* renamed from: e */
    public final void mo7196e(String str) {
        C19383o.m32797g(str, "text");
        this.f4064a = str;
        BreakIterator breakIterator = this.f4072c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            C19383o.m32805o("impl");
            throw null;
        }
    }
}
