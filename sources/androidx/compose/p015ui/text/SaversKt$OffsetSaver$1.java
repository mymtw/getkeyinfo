package androidx.compose.p015ui.text;

import androidx.compose.runtime.saveable.C1374h;
import androidx.compose.runtime.saveable.C1375i;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p288y.C8343c;
import p568fn.C17782b;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.text.SaversKt$OffsetSaver$1 */
public final class SaversKt$OffsetSaver$1 extends Lambda implements C19861p<C1375i, C8343c, Object> {
    public static final SaversKt$OffsetSaver$1 INSTANCE = new SaversKt$OffsetSaver$1();

    public SaversKt$OffsetSaver$1() {
        super(2);
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m34815invokeUv8p0NA((C1375i) obj, ((C8343c) obj2).f18299a);
    }

    /* renamed from: invoke-Uv8p0NA  reason: not valid java name */
    public final Object m34815invokeUv8p0NA(C1375i iVar, long j) {
        C19383o.m32797g(iVar, "$this$Saver");
        int i = C8343c.f18298e;
        if (C8343c.m16640a(j, C8343c.f18297d)) {
            return Boolean.FALSE;
        }
        Float valueOf = Float.valueOf(C8343c.m16642c(j));
        C1374h hVar = SaversKt.f4276a;
        return C17782b.m29888u(valueOf, Float.valueOf(C8343c.m16643d(j)));
    }
}
