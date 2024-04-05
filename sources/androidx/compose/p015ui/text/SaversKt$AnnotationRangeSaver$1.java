package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.runtime.saveable.C1374h;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1 */
public final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements C19861p<C1375i, C1913a.C1916b<? extends Object>, Object> {
    public static final SaversKt$AnnotationRangeSaver$1 INSTANCE = new SaversKt$AnnotationRangeSaver$1();

    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1$a */
    public /* synthetic */ class C1911a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4294a;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
            iArr[AnnotationType.Span.ordinal()] = 2;
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            iArr[AnnotationType.String.ordinal()] = 4;
            f4294a = iArr;
        }
    }

    public SaversKt$AnnotationRangeSaver$1() {
        super(2);
    }

    public final Object invoke(C1375i iVar, C1913a.C1916b<? extends Object> bVar) {
        AnnotationType annotationType;
        T t;
        C19383o.m32797g(iVar, "$this$Saver");
        C19383o.m32797g(bVar, "it");
        T t2 = bVar.f4308a;
        if (t2 instanceof C1978h) {
            annotationType = AnnotationType.Paragraph;
        } else if (t2 instanceof C2012n) {
            annotationType = AnnotationType.Span;
        } else if (t2 instanceof C2037v) {
            annotationType = AnnotationType.VerbatimTts;
        } else {
            annotationType = AnnotationType.String;
        }
        int i = C1911a.f4294a[annotationType.ordinal()];
        if (i == 1) {
            t = SaversKt.m4209a((C1978h) bVar.f4308a, SaversKt.f4280e, iVar);
        } else if (i == 2) {
            t = SaversKt.m4209a((C2012n) bVar.f4308a, SaversKt.f4281f, iVar);
        } else if (i == 3) {
            t = SaversKt.m4209a((C2037v) bVar.f4308a, SaversKt.f4279d, iVar);
        } else if (i == 4) {
            t = bVar.f4308a;
            C1374h hVar = SaversKt.f4276a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return C17782b.m29888u(annotationType, t, Integer.valueOf(bVar.f4309b), Integer.valueOf(bVar.f4310c), bVar.f4311d);
    }
}
