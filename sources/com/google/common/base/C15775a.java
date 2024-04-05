package com.google.common.base;

import android.support.p013v4.media.C0072d;

/* renamed from: com.google.common.base.a */
public abstract class C15775a implements C15795m<Character> {

    /* renamed from: com.google.common.base.a$a */
    public static abstract class C15776a extends C15775a {
        @Deprecated
        public final boolean apply(Object obj) {
            return mo55775c(((Character) obj).charValue());
        }
    }

    /* renamed from: com.google.common.base.a$b */
    public static final class C15777b extends C15776a {

        /* renamed from: b */
        public final char f35555b = 'A';

        /* renamed from: c */
        public final char f35556c = 'Z';

        /* renamed from: c */
        public final boolean mo55775c(char c) {
            return this.f35555b <= c && c <= this.f35556c;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CharMatcher.inRange('");
            h.append(C15775a.m25592a(this.f35555b));
            h.append("', '");
            h.append(C15775a.m25592a(this.f35556c));
            h.append("')");
            return h.toString();
        }
    }

    /* renamed from: com.google.common.base.a$c */
    public static final class C15778c extends C15776a {

        /* renamed from: b */
        public final char f35557b;

        public C15778c(char c) {
            this.f35557b = c;
        }

        /* renamed from: c */
        public final boolean mo55775c(char c) {
            return c == this.f35557b;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("CharMatcher.is('");
            h.append(C15775a.m25592a(this.f35557b));
            h.append("')");
            return h.toString();
        }
    }

    /* renamed from: com.google.common.base.a$d */
    public static abstract class C15779d extends C15776a {

        /* renamed from: b */
        public final String f35558b = "CharMatcher.none()";

        public final String toString() {
            return this.f35558b;
        }
    }

    /* renamed from: com.google.common.base.a$e */
    public static final class C15780e extends C15779d {

        /* renamed from: c */
        public static final C15780e f35559c = new C15780e();

        /* renamed from: b */
        public final int mo55774b(int i, CharSequence charSequence) {
            C15794l.m25618l(i, charSequence.length());
            return -1;
        }

        /* renamed from: c */
        public final boolean mo55775c(char c) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m25592a(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: b */
    public int mo55774b(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C15794l.m25618l(i, length);
        while (i < length) {
            if (mo55775c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public abstract boolean mo55775c(char c);
}
