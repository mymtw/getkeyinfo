package kotlin.text;

import android.support.p013v4.media.C0069a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C19324q;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.C19429f;
import kotlin.sequences.C19431g;
import kotlin.sequences.C19434j;
import p568fn.C17782b;
import p753kq.C19857l;

public final class Regex implements Serializable {
    public static final C19445a Companion = new C19445a();
    private Set<? extends RegexOption> _options;
    /* access modifiers changed from: private */
    public final Pattern nativePattern;

    public static final class Serialized implements Serializable {
        public static final C19444a Companion = new C19444a();
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        /* renamed from: kotlin.text.Regex$Serialized$a */
        public static final class C19444a {
        }

        public Serialized(String str, int i) {
            C19383o.m32797g(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            C19383o.m32796f(compile, "compile(pattern, flags)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    /* renamed from: kotlin.text.Regex$a */
    public static final class C19445a {
    }

    public Regex(Pattern pattern) {
        C19383o.m32797g(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static /* synthetic */ C19451e find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    public static /* synthetic */ C19431g findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    public static /* synthetic */ C19431g splitToSequence$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.splitToSequence(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        C19383o.m32796f(pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    public final C19451e find(CharSequence charSequence, int i) {
        C19383o.m32797g(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C19383o.m32796f(matcher, "nativePattern.matcher(input)");
        if (!matcher.find(i)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    public final C19431g<C19451e> findAll(CharSequence charSequence, int i) {
        C19383o.m32797g(charSequence, "input");
        if (i < 0 || i > charSequence.length()) {
            StringBuilder h = C0069a.m177h("Start index out of bounds: ", i, ", input length: ");
            h.append(charSequence.length());
            throw new IndexOutOfBoundsException(h.toString());
        }
        Regex$findAll$1 regex$findAll$1 = new Regex$findAll$1(this, charSequence, i);
        Regex$findAll$2 regex$findAll$2 = Regex$findAll$2.INSTANCE;
        C19383o.m32797g(regex$findAll$2, "nextFunction");
        return new C19429f(regex$findAll$1, regex$findAll$2);
    }

    public final Set<RegexOption> getOptions() {
        Set<? extends RegexOption> set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet<E> allOf = EnumSet.allOf(RegexOption.class);
        C19383o.m32796f(allOf, "");
        C19324q.m32630L0(allOf, new Regex$special$$inlined$fromInt$1(flags), false);
        Set<? extends RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C19383o.m32796f(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        C19383o.m32796f(pattern, "nativePattern.pattern()");
        return pattern;
    }

    public final C19451e matchAt(CharSequence charSequence, int i) {
        C19383o.m32797g(charSequence, "input");
        Matcher region = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (region.lookingAt()) {
            return new MatcherMatchResult(region, charSequence);
        }
        return null;
    }

    public final C19451e matchEntire(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        C19383o.m32796f(matcher, "nativePattern.matcher(input)");
        if (!matcher.matches()) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    public final boolean matches(CharSequence charSequence) {
        C19383o.m32797g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean matchesAt(CharSequence charSequence, int i) {
        C19383o.m32797g(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    public final String replace(CharSequence charSequence, String str) {
        C19383o.m32797g(charSequence, "input");
        C19383o.m32797g(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        C19383o.m32796f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String replaceFirst(CharSequence charSequence, String str) {
        C19383o.m32797g(charSequence, "input");
        C19383o.m32797g(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        C19383o.m32796f(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List<String> split(CharSequence charSequence, int i) {
        C19383o.m32797g(charSequence, "input");
        C19459m.m33053v1(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return C17782b.m29864d0(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        int i4 = i - 1;
        do {
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i3, matcher.start()).toString());
            i3 = matcher.end();
            break;
        } while (!matcher.find());
        arrayList.add(charSequence.subSequence(i3, charSequence.length()).toString());
        return arrayList;
    }

    public final C19431g<String> splitToSequence(CharSequence charSequence, int i) {
        C19383o.m32797g(charSequence, "input");
        C19459m.m33053v1(i);
        return new C19434j(new Regex$splitToSequence$1(this, charSequence, i, (C19340c<? super Regex$splitToSequence$1>) null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String pattern = this.nativePattern.toString();
        C19383o.m32796f(pattern, "nativePattern.toString()");
        return pattern;
    }

    public final String replace(CharSequence charSequence, C19857l<? super C19451e, ? extends CharSequence> lVar) {
        C19383o.m32797g(charSequence, "input");
        C19383o.m32797g(lVar, "transform");
        int i = 0;
        C19451e find$default = find$default(this, charSequence, 0, 2, (Object) null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, find$default.mo72021b().mo74309c().intValue());
            sb.append((CharSequence) lVar.invoke(find$default));
            i = find$default.mo72021b().mo74311g().intValue() + 1;
            find$default = find$default.next();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C19383o.m32796f(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r2, kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.C19383o.m32797g(r3, r0)
            kotlin.text.Regex$a r0 = Companion
            int r3 = r3.getValue()
            r0.getClass()
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0019
            r3 = r3 | 64
        L_0x0019:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureUnicodeCase(option.value))"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(java.lang.String r4, java.util.Set<? extends kotlin.text.RegexOption> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            kotlin.text.Regex$a r0 = Companion
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        L_0x0011:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r5.next()
            kotlin.text.c r2 = (kotlin.text.C19449c) r2
            int r2 = r2.getValue()
            r1 = r1 | r2
            goto L_0x0011
        L_0x0023:
            r0.getClass()
            r5 = r1 & 2
            if (r5 == 0) goto L_0x002c
            r1 = r1 | 64
        L_0x002c:
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r1)
            java.lang.String r5 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r3.<init>((java.util.regex.Pattern) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
