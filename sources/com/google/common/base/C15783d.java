package com.google.common.base;

import com.google.common.base.C15792k;
import java.util.regex.Pattern;

/* renamed from: com.google.common.base.d */
public abstract class C15783d {
    public static C15783d compile(String str) {
        C15792k.C15793a aVar = C15792k.f35574a;
        str.getClass();
        C15792k.f35574a.getClass();
        return new JdkPattern(Pattern.compile(str));
    }

    public static boolean isPcreLike() {
        C15792k.f35574a.getClass();
        return true;
    }

    public abstract int flags();

    public abstract C15782c matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
