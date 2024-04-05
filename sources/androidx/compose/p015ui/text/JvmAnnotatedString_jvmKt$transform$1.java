package androidx.compose.p015ui.text;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p753kq.C19857l;
import p753kq.C19862q;

/* renamed from: androidx.compose.ui.text.JvmAnnotatedString_jvmKt$transform$1 */
final class JvmAnnotatedString_jvmKt$transform$1 extends Lambda implements C19857l<List<? extends Integer>, Integer> {
    public final /* synthetic */ Map<Integer, Integer> $offsetMap;
    public final /* synthetic */ Ref$ObjectRef<String> $resultStr;
    public final /* synthetic */ C1913a $this_transform;
    public final /* synthetic */ C19862q<String, Integer, Integer, String> $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmAnnotatedString_jvmKt$transform$1(Ref$ObjectRef<String> ref$ObjectRef, C19862q<? super String, ? super Integer, ? super Integer, String> qVar, C1913a aVar, Map<Integer, Integer> map) {
        super(1);
        this.$resultStr = ref$ObjectRef;
        this.$transform = qVar;
        this.$this_transform = aVar;
        this.$offsetMap = map;
    }

    public final Integer invoke(List<Integer> list) {
        C19383o.m32797g(list, "<name for destructuring parameter 0>");
        int intValue = list.get(0).intValue();
        int intValue2 = list.get(1).intValue();
        Ref$ObjectRef<String> ref$ObjectRef = this.$resultStr;
        ref$ObjectRef.element = ((String) this.$resultStr.element) + this.$transform.invoke(this.$this_transform.f4296b, Integer.valueOf(intValue), Integer.valueOf(intValue2));
        return this.$offsetMap.put(Integer.valueOf(intValue2), Integer.valueOf(((String) this.$resultStr.element).length()));
    }
}
