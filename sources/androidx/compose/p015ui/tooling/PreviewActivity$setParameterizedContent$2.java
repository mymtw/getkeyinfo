package androidx.compose.p015ui.tooling;

import androidx.compose.runtime.C1302d;
import java.util.Arrays;
import kotlin.C19394m;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.tooling.PreviewActivity$setParameterizedContent$2 */
public final class PreviewActivity$setParameterizedContent$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ String $className;
    public final /* synthetic */ String $methodName;
    public final /* synthetic */ Object[] $previewParameters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewActivity$setParameterizedContent$2(String str, String str2, Object[] objArr) {
        super(2);
        this.$className = str;
        this.$methodName = str2;
        this.$previewParameters = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        if ((i & 11) != 2 || !dVar.mo5442i()) {
            String str = this.$className;
            String str2 = this.$methodName;
            Object[] objArr = this.$previewParameters;
            C19382n.m32759m0(str, str2, dVar, Arrays.copyOf(objArr, objArr.length));
            return;
        }
        dVar.mo5396C();
    }
}
