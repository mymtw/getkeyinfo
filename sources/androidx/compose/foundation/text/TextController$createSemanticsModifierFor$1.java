package androidx.compose.foundation.text;

import androidx.compose.p015ui.semantics.C1894a;
import androidx.compose.p015ui.semantics.C1902i;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import androidx.compose.p015ui.semantics.SemanticsProperties;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2021q;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p568fn.C17782b;
import p753kq.C19857l;

final class TextController$createSemanticsModifierFor$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ C1913a $text;
    public final /* synthetic */ TextController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextController$createSemanticsModifierFor$1(C1913a aVar, TextController textController) {
        super(1);
        this.$text = aVar;
        this.this$0 = textController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        C1913a aVar = this.$text;
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        C19383o.m32797g(aVar, "value");
        qVar.mo7342a(SemanticsProperties.f4208s, C17782b.m29864d0(aVar));
        final TextController textController = this.this$0;
        qVar.mo7342a(C1902i.f4230a, new C1894a((String) null, new C19857l<List<C2021q>, Boolean>() {
            public final Boolean invoke(List<C2021q> list) {
                boolean z;
                C19383o.m32797g(list, "it");
                C2021q qVar = textController.f1923b.f1966f;
                if (qVar != null) {
                    C19383o.m32794d(qVar);
                    list.add(qVar);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }));
    }
}
