package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.node.C1754s;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6 */
final class AndroidView_androidKt$AndroidView$2$6 extends Lambda implements C19861p<LayoutNode, LayoutDirection, C19394m> {
    public final /* synthetic */ C1754s<ViewFactoryHolder<Object>> $viewFactoryHolderRef;

    /* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$6$a */
    public /* synthetic */ class C2071a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4699a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f4699a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$2$6(C1754s<ViewFactoryHolder<Object>> sVar) {
        super(2);
        this.$viewFactoryHolderRef = sVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LayoutDirection) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutNode, "$this$set");
        C19383o.m32797g(layoutDirection, "it");
        T t = this.$viewFactoryHolderRef.f3945a;
        C19383o.m32794d(t);
        ViewFactoryHolder viewFactoryHolder = (ViewFactoryHolder) t;
        int i = C2071a.f4699a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        viewFactoryHolder.setLayoutDirection(i2);
    }
}
