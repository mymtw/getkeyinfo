package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.C2033h;
import androidx.compose.runtime.saveable.C1374h;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7292j;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$TextIndentSaver$1 */
public final class SaversKt$TextIndentSaver$1 extends Lambda implements C19861p<C1375i, C2033h, Object> {
    public static final SaversKt$TextIndentSaver$1 INSTANCE = new SaversKt$TextIndentSaver$1();

    public SaversKt$TextIndentSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C2033h hVar) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(hVar, "it");
        C7292j jVar = new C7292j(hVar.f4621a);
        C1374h hVar2 = SaversKt.f4290o;
        return C17782b.m29888u(SaversKt.m4209a(jVar, hVar2, iVar), SaversKt.m4209a(new C7292j(hVar.f4622b), hVar2, iVar));
    }
}
