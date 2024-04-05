package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.runtime.saveable.C1374h;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2 */
public final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements C19857l<Object, C1913a.C1916b<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    /* renamed from: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2$a */
    public /* synthetic */ class C1912a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4295a;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            iArr[AnnotationType.Paragraph.ordinal()] = 1;
            iArr[AnnotationType.Span.ordinal()] = 2;
            iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            iArr[AnnotationType.String.ordinal()] = 4;
            f4295a = iArr;
        }
    }

    public SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    public final C1913a.C1916b<? extends Object> invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        C19383o.m32794d(annotationType);
        Object obj4 = list.get(2);
        Integer num = obj4 != null ? (Integer) obj4 : null;
        C19383o.m32794d(num);
        int intValue = num.intValue();
        Object obj5 = list.get(3);
        Integer num2 = obj5 != null ? (Integer) obj5 : null;
        C19383o.m32794d(num2);
        int intValue2 = num2.intValue();
        Object obj6 = list.get(4);
        String str = obj6 != null ? (String) obj6 : null;
        C19383o.m32794d(str);
        int i = C1912a.f4295a[annotationType.ordinal()];
        if (i == 1) {
            Object obj7 = list.get(1);
            C1374h hVar = SaversKt.f4280e;
            if (!C19383o.m32792b(obj7, Boolean.FALSE) && obj7 != null) {
                obj3 = (C1978h) hVar.f2979b.invoke(obj7);
            }
            C19383o.m32794d(obj3);
            return new C1913a.C1916b<>(obj3, intValue, intValue2, str);
        } else if (i == 2) {
            Object obj8 = list.get(1);
            C1374h hVar2 = SaversKt.f4281f;
            if (!C19383o.m32792b(obj8, Boolean.FALSE) && obj8 != null) {
                obj3 = (C2012n) hVar2.f2979b.invoke(obj8);
            }
            C19383o.m32794d(obj3);
            return new C1913a.C1916b<>(obj3, intValue, intValue2, str);
        } else if (i == 3) {
            Object obj9 = list.get(1);
            C1374h hVar3 = SaversKt.f4279d;
            if (!C19383o.m32792b(obj9, Boolean.FALSE) && obj9 != null) {
                obj3 = (C2037v) hVar3.f2979b.invoke(obj9);
            }
            C19383o.m32794d(obj3);
            return new C1913a.C1916b<>(obj3, intValue, intValue2, str);
        } else if (i == 4) {
            Object obj10 = list.get(1);
            if (obj10 != null) {
                obj3 = (String) obj10;
            }
            C19383o.m32794d(obj3);
            return new C1913a.C1916b<>(obj3, intValue, intValue2, str);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
