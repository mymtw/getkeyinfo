package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.runtime.saveable.C1374h;
import androidx.compose.runtime.saveable.C1375i;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1 */
public final class SaversKt$AnnotatedStringSaver$1 extends Lambda implements C19861p<C1375i, C1913a, Object> {
    public static final SaversKt$AnnotatedStringSaver$1 INSTANCE = new SaversKt$AnnotatedStringSaver$1();

    public SaversKt$AnnotatedStringSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C1913a aVar) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(aVar, "it");
        String str = aVar.f4296b;
        C1374h hVar = SaversKt.f4276a;
        List<C1913a.C1916b<C2012n>> list = aVar.f4297c;
        C1374h hVar2 = SaversKt.f4277b;
        return C17782b.m29888u(str, SaversKt.m4209a(list, hVar2, iVar), SaversKt.m4209a(aVar.f4298d, hVar2, iVar), SaversKt.m4209a(aVar.f4299e, hVar2, iVar));
    }
}
