package kotlin.text;

import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

final class StringsKt__StringsKt$rangesDelimitedBy$1 extends Lambda implements C19861p<CharSequence, Integer, Pair<? extends Integer, ? extends Integer>> {
    public final /* synthetic */ char[] $delimiters;
    public final /* synthetic */ boolean $ignoreCase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__StringsKt$rangesDelimitedBy$1(char[] cArr, boolean z) {
        super(2);
        this.$delimiters = cArr;
        this.$ignoreCase = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((CharSequence) obj, ((Number) obj2).intValue());
    }

    public final Pair<Integer, Integer> invoke(CharSequence charSequence, int i) {
        C19383o.m32797g(charSequence, "$this$$receiver");
        int m1 = C19459m.m33044m1(i, charSequence, this.$ignoreCase, this.$delimiters);
        if (m1 < 0) {
            return null;
        }
        return new Pair<>(Integer.valueOf(m1), 1);
    }
}
