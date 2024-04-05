package com.google.common.base;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class JdkPattern extends C15783d implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    /* renamed from: com.google.common.base.JdkPattern$a */
    public static final class C15767a extends C15782c {

        /* renamed from: a */
        public final Matcher f35550a;

        public C15767a(Matcher matcher) {
            matcher.getClass();
            this.f35550a = matcher;
        }
    }

    public JdkPattern(Pattern pattern2) {
        pattern2.getClass();
        this.pattern = pattern2;
    }

    public int flags() {
        return this.pattern.flags();
    }

    public C15782c matcher(CharSequence charSequence) {
        return new C15767a(this.pattern.matcher(charSequence));
    }

    public String pattern() {
        return this.pattern.pattern();
    }

    public String toString() {
        return this.pattern.toString();
    }
}
