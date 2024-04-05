package androidx.compose.p015ui.text.font;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.font.C1974z;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p744gq.C19060c;

@C19060c(mo70540c = "androidx.compose.ui.text.font.FontFamilyResolverImpl", mo70541f = "FontFamilyResolver.kt", mo70542l = {47}, mo70543m = "preload")
/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 */
final class FontFamilyResolverImpl$preload$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C1954h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$preload$1(C1954h hVar, C19340c<? super FontFamilyResolverImpl$preload$1> cVar) {
        super(cVar);
        this.this$0 = hVar;
    }

    public final Object invokeSuspend(Object obj) {
        FontFamilyResolverImpl$preload$1 fontFamilyResolverImpl$preload$1;
        C1974z a;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        C1954h hVar = this.this$0;
        hVar.getClass();
        int i = this.label;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            fontFamilyResolverImpl$preload$1 = this;
        } else {
            fontFamilyResolverImpl$preload$1 = new FontFamilyResolverImpl$preload$1(hVar, this);
        }
        Object obj2 = fontFamilyResolverImpl$preload$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = fontFamilyResolverImpl$preload$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            return C19394m.f43287a;
        } else if (i2 == 1) {
            C1952g gVar = (C1952g) fontFamilyResolverImpl$preload$1.L$1;
            C1954h hVar2 = (C1954h) fontFamilyResolverImpl$preload$1.L$0;
            C0761x.m1684O0(obj2);
            ArrayList arrayList = ((C1956j) gVar).f4406d;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1950f fVar = (C1950f) arrayList.get(i3);
                hVar2.f4398b.getClass();
                int i4 = C1964r.f4421a;
                C1959m a2 = hVar2.f4398b.mo7530a(fVar.mo7535b());
                C1964r rVar = hVar2.f4398b;
                int d = fVar.mo7536d();
                rVar.getClass();
                hVar2.f4397a.mo7528b();
                arrayList2.add(new C1972x(gVar, a2, d, 1, (Object) null));
            }
            C1973y yVar = hVar2.f4399c;
            FontFamilyResolverImpl$preload$2 fontFamilyResolverImpl$preload$2 = new FontFamilyResolverImpl$preload$2(hVar2);
            yVar.getClass();
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                C1972x xVar = (C1972x) arrayList2.get(i5);
                synchronized (yVar.f4434a) {
                    a = yVar.f4435b.mo19418a(xVar);
                }
                if (a == null) {
                    try {
                        C1974z zVar = (C1974z) fontFamilyResolverImpl$preload$2.invoke(xVar);
                        if (!(zVar instanceof C1974z.C1975a)) {
                            synchronized (yVar.f4434a) {
                                C1974z b = yVar.f4435b.mo19419b(xVar, zVar);
                            }
                        } else {
                            continue;
                        }
                    } catch (Exception e) {
                        throw new IllegalStateException("Could not load font", e);
                    }
                }
            }
            return C19394m.f43287a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
