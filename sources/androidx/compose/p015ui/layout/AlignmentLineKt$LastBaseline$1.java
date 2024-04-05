package androidx.compose.p015ui.layout;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19861p;
import p757mq.C19917a;

/* renamed from: androidx.compose.ui.layout.AlignmentLineKt$LastBaseline$1 */
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements C19861p<Integer, Integer, Integer> {
    public static final AlignmentLineKt$LastBaseline$1 INSTANCE = new AlignmentLineKt$LastBaseline$1();

    public AlignmentLineKt$LastBaseline$1() {
        super(2, C19917a.class, ResponseConstants.MAX, "max(II)I", 1);
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.max(i, i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
