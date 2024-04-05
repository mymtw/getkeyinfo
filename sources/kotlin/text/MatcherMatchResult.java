package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.C19289b;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p764pq.C20057i;

public final class MatcherMatchResult implements C19451e {

    /* renamed from: a */
    public final Matcher f43366a;

    /* renamed from: b */
    public final CharSequence f43367b;

    /* renamed from: c */
    public final MatcherMatchResult$groups$1 f43368c = new MatcherMatchResult$groups$1(this);

    /* renamed from: d */
    public C19443a f43369d;

    /* renamed from: kotlin.text.MatcherMatchResult$a */
    public static final class C19443a extends C19289b<String> {

        /* renamed from: b */
        public final /* synthetic */ MatcherMatchResult f43370b;

        public C19443a(MatcherMatchResult matcherMatchResult) {
            this.f43370b = matcherMatchResult;
        }

        /* renamed from: a */
        public final int mo5763a() {
            return this.f43370b.f43366a.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        public final Object get(int i) {
            String group = this.f43370b.f43366a.group(i);
            return group == null ? "" : group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        C19383o.m32797g(charSequence, "input");
        this.f43366a = matcher;
        this.f43367b = charSequence;
    }

    /* renamed from: a */
    public final List<String> mo72020a() {
        if (this.f43369d == null) {
            this.f43369d = new C19443a(this);
        }
        C19443a aVar = this.f43369d;
        C19383o.m32794d(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final C20057i mo72021b() {
        Matcher matcher = this.f43366a;
        return C19388s.m32816D0(matcher.start(), matcher.end());
    }

    /* renamed from: c */
    public final MatcherMatchResult$groups$1 mo72022c() {
        return this.f43368c;
    }

    public final String getValue() {
        String group = this.f43366a.group();
        C19383o.m32796f(group, "matchResult.group()");
        return group;
    }

    public final MatcherMatchResult next() {
        int end = this.f43366a.end() + (this.f43366a.end() == this.f43366a.start() ? 1 : 0);
        if (end > this.f43367b.length()) {
            return null;
        }
        Matcher matcher = this.f43366a.pattern().matcher(this.f43367b);
        C19383o.m32796f(matcher, "matcher.pattern().matcher(input)");
        CharSequence charSequence = this.f43367b;
        if (!matcher.find(end)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }
}
