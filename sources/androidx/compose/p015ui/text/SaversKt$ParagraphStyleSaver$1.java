package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.style.C2029d;
import androidx.compose.p015ui.text.style.C2033h;
import androidx.compose.runtime.saveable.C1374h;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7292j;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1 */
public final class SaversKt$ParagraphStyleSaver$1 extends Lambda implements C19861p<C1375i, C1978h, Object> {
    public static final SaversKt$ParagraphStyleSaver$1 INSTANCE = new SaversKt$ParagraphStyleSaver$1();

    public SaversKt$ParagraphStyleSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C1978h hVar) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(hVar, "it");
        C2029d dVar = hVar.f4439a;
        C1374h hVar2 = SaversKt.f4276a;
        C2033h hVar3 = hVar.f4442d;
        C2033h hVar4 = C2033h.f4620c;
        return C17782b.m29888u(dVar, hVar.f4440b, SaversKt.m4209a(new C7292j(hVar.f4441c), SaversKt.f4290o, iVar), SaversKt.m4209a(hVar3, SaversKt.f4284i, iVar));
    }
}
