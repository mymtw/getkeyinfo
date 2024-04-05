package androidx.compose.p015ui.text;

import androidx.compose.runtime.saveable.C1375i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p157k0.C7174b;
import p157k0.C7175c;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$LocaleListSaver$1 */
public final class SaversKt$LocaleListSaver$1 extends Lambda implements C19861p<C1375i, C7175c, Object> {
    public static final SaversKt$LocaleListSaver$1 INSTANCE = new SaversKt$LocaleListSaver$1();

    public SaversKt$LocaleListSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C7175c cVar) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(cVar, "it");
        List<C7174b> list = cVar.f15951b;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SaversKt.m4209a(list.get(i), SaversKt.f4293r, iVar));
        }
        return arrayList;
    }
}
