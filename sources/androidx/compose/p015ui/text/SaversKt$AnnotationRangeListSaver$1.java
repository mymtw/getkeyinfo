package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.runtime.saveable.C1375i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1 */
public final class SaversKt$AnnotationRangeListSaver$1 extends Lambda implements C19861p<C1375i, List<? extends C1913a.C1916b<? extends Object>>, Object> {
    public static final SaversKt$AnnotationRangeListSaver$1 INSTANCE = new SaversKt$AnnotationRangeListSaver$1();

    public SaversKt$AnnotationRangeListSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, List<? extends C1913a.C1916b<? extends Object>> list) {
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(list, "it");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(SaversKt.m4209a((C1913a.C1916b) list.get(i), SaversKt.f4278c, iVar));
        }
        return arrayList;
    }
}
