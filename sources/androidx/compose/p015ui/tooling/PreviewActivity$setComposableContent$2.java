package androidx.compose.p015ui.tooling;

import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.PreviewActivity$setComposableContent$2 */
public final class PreviewActivity$setComposableContent$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ String $className;
    public final /* synthetic */ String $methodName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewActivity$setComposableContent$2(String str, String str2) {
        super(2);
        this.$className = str;
        this.$methodName = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            C19382n.m32759m0(this.$className, this.$methodName, dVar, new Object[0]);
        } else {
            dVar.mo5396C();
        }
    }
}
