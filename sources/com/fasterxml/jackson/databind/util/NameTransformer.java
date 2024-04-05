package com.fasterxml.jackson.databind.util;

import android.support.p013v4.media.C0072d;
import java.io.Serializable;
import p003a2.C0023f;

public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        public final NameTransformer _t1;
        public final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        public String reverse(String str) {
            String reverse = this._t1.reverse(str);
            return reverse != null ? this._t2.reverse(reverse) : reverse;
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("[ChainedTransformer(");
            h.append(this._t1);
            h.append(", ");
            h.append(this._t2);
            h.append(")]");
            return h.toString();
        }

        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        public String reverse(String str) {
            return str;
        }

        public String transform(String str) {
            return str;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$a */
    public static class C12588a extends NameTransformer {

        /* renamed from: b */
        public final /* synthetic */ String f27782b;

        /* renamed from: c */
        public final /* synthetic */ String f27783c;

        public C12588a(String str, String str2) {
            this.f27782b = str;
            this.f27783c = str2;
        }

        public final String reverse(String str) {
            if (!str.startsWith(this.f27782b)) {
                return null;
            }
            String substring = str.substring(this.f27782b.length());
            if (substring.endsWith(this.f27783c)) {
                return substring.substring(0, substring.length() - this.f27783c.length());
            }
            return null;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("[PreAndSuffixTransformer('");
            h.append(this.f27782b);
            h.append("','");
            return C0023f.m110k(h, this.f27783c, "')]");
        }

        public final String transform(String str) {
            return this.f27782b + str + this.f27783c;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$b */
    public static class C12589b extends NameTransformer {

        /* renamed from: b */
        public final /* synthetic */ String f27784b;

        public C12589b(String str) {
            this.f27784b = str;
        }

        public final String reverse(String str) {
            if (str.startsWith(this.f27784b)) {
                return str.substring(this.f27784b.length());
            }
            return null;
        }

        public final String toString() {
            return C0023f.m110k(C0072d.m201h("[PrefixTransformer('"), this.f27784b, "')]");
        }

        public final String transform(String str) {
            return C0023f.m110k(new StringBuilder(), this.f27784b, str);
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.NameTransformer$c */
    public static class C12590c extends NameTransformer {

        /* renamed from: b */
        public final /* synthetic */ String f27785b;

        public C12590c(String str) {
            this.f27785b = str;
        }

        public final String reverse(String str) {
            if (str.endsWith(this.f27785b)) {
                return str.substring(0, str.length() - this.f27785b.length());
            }
            return null;
        }

        public final String toString() {
            return C0023f.m110k(C0072d.m201h("[SuffixTransformer('"), this.f27785b, "')]");
        }

        public final String transform(String str) {
            StringBuilder h = C0072d.m201h(str);
            h.append(this.f27785b);
            return h.toString();
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(String str, String str2) {
        boolean z = true;
        boolean z2 = str != null && str.length() > 0;
        if (str2 == null || str2.length() <= 0) {
            z = false;
        }
        return z2 ? z ? new C12588a(str, str2) : new C12589b(str) : z ? new C12590c(str2) : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);
}
