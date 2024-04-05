package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.ComposedModifierKt;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt */
public final class SuspendingPointerInputFilterKt {

    /* renamed from: a */
    public static final C1640l f3623a = new C1640l(EmptyList.INSTANCE);

    /* renamed from: a */
    public static final C1436d m3483a(C1436d dVar, Object obj, Object obj2, C19861p<? super C1652w, ? super C19340c<? super C19394m>, ? extends Object> pVar) {
        C19383o.m32797g(dVar, "<this>");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new SuspendingPointerInputFilterKt$pointerInput$4(obj, obj2, pVar));
    }

    /* renamed from: b */
    public static final C1436d m3484b(C1436d dVar, Object obj, C19861p<? super C1652w, ? super C19340c<? super C19394m>, ? extends Object> pVar) {
        C19383o.m32797g(dVar, "<this>");
        C19383o.m32797g(pVar, "block");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new SuspendingPointerInputFilterKt$pointerInput$2(obj, pVar));
    }

    /* renamed from: c */
    public static final C1436d m3485c(C1436d dVar, Object[] objArr, C19861p<? super C1652w, ? super C19340c<? super C19394m>, ? extends Object> pVar) {
        C19383o.m32797g(dVar, "<this>");
        return ComposedModifierKt.m3049a(dVar, InspectableValueKt.f4032a, new SuspendingPointerInputFilterKt$pointerInput$6(objArr, pVar));
    }
}
