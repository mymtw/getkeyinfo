package androidx.compose.p015ui.tooling.preview.datasource;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1 */
final class LoremIpsum$generateLoremIpsum$1 extends Lambda implements C19846a<String> {
    public final /* synthetic */ int $loremIpsumMaxSize;
    public final /* synthetic */ Ref$IntRef $wordsUsed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoremIpsum$generateLoremIpsum$1(Ref$IntRef ref$IntRef, int i) {
        super(0);
        this.$wordsUsed = ref$IntRef;
        this.$loremIpsumMaxSize = i;
    }

    public final String invoke() {
        List<String> list = C2070a.f4695a;
        Ref$IntRef ref$IntRef = this.$wordsUsed;
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        return list.get(i % this.$loremIpsumMaxSize);
    }
}
