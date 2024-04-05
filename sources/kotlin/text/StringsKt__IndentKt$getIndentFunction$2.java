package kotlin.text;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p003a2.C0023f;
import p753kq.C19857l;

final class StringsKt__IndentKt$getIndentFunction$2 extends Lambda implements C19857l<String, String> {
    public final /* synthetic */ String $indent;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StringsKt__IndentKt$getIndentFunction$2(String str) {
        super(1);
        this.$indent = str;
    }

    public final String invoke(String str) {
        C19383o.m32797g(str, "line");
        return C0023f.m110k(new StringBuilder(), this.$indent, str);
    }
}
