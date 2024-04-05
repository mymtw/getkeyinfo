package androidx.compose.p015ui.text.font;

import androidx.compose.foundation.layout.C0761x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19478c;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3", mo70541f = "FontListFontFamilyTypefaceAdapter.kt", mo70542l = {115}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3 */
final class FontListFontFamilyTypefaceAdapter$preload$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ List<C1950f> $asyncLoads;
    public final /* synthetic */ C1963q $resourceLoader;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3(List<C1950f> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, C1963q qVar, C19340c<? super FontListFontFamilyTypefaceAdapter$preload$3> cVar) {
        super(2, cVar);
        this.$asyncLoads = list;
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$resourceLoader = qVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(this.$asyncLoads, this.this$0, this.$resourceLoader, cVar);
        fontListFontFamilyTypefaceAdapter$preload$3.L$0 = obj;
        return fontListFontFamilyTypefaceAdapter$preload$3;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var = (C19525d0) this.L$0;
            List<C1950f> list = this.$asyncLoads;
            HashSet hashSet = new HashSet(list.size());
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1950f fVar = list.get(i2);
                if (hashSet.add(fVar)) {
                    arrayList.add(fVar);
                }
            }
            FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
            C1963q qVar = this.$resourceLoader;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(C19697g.m33464b(d0Var, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (C1950f) arrayList.get(i3), qVar, (C19340c<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1>) null)));
            }
            this.label = 1;
            if (C19478c.m33095a(arrayList2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
