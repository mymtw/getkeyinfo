package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractCollection;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.sequences.C19439n;
import kotlin.sequences.SequencesKt___SequencesKt;
import p568fn.C17782b;
import p764pq.C20057i;

public final class MatcherMatchResult$groups$1 extends AbstractCollection<C19450d> {

    /* renamed from: b */
    public final /* synthetic */ MatcherMatchResult f43371b;

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f43371b = matcherMatchResult;
    }

    /* renamed from: a */
    public final int mo5763a() {
        return this.f43371b.f43366a.groupCount() + 1;
    }

    /* renamed from: c */
    public final C19450d mo72025c(int i) {
        Matcher matcher = this.f43371b.f43366a;
        C20057i D0 = C19388s.m32816D0(matcher.start(i), matcher.end(i));
        if (D0.mo74309c().intValue() < 0) {
            return null;
        }
        String group = this.f43371b.f43366a.group(i);
        C19383o.m32796f(group, "matchResult.group(index)");
        return new C19450d(group, D0);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj == null ? true : obj instanceof C19450d)) {
            return false;
        }
        return super.contains((C19450d) obj);
    }

    public final boolean isEmpty() {
        return false;
    }

    public final Iterator<C19450d> iterator() {
        return new C19439n.C19440a(SequencesKt___SequencesKt.m32985p1(C19327t.m32633O0(C17782b.m29857W(this)), new MatcherMatchResult$groups$1$iterator$1(this)));
    }
}
