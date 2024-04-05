package androidx.compose.p015ui.viewinterop;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p015ui.node.C1754s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$valueProvider$1 */
public final class AndroidView_androidKt$AndroidView$3$valueProvider$1 extends Lambda implements C19846a<SparseArray<Parcelable>> {
    public final /* synthetic */ C1754s<ViewFactoryHolder<Object>> $viewFactoryHolderRef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$3$valueProvider$1(C1754s<ViewFactoryHolder<Object>> sVar) {
        super(0);
        this.$viewFactoryHolderRef = sVar;
    }

    public final SparseArray<Parcelable> invoke() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        T t = this.$viewFactoryHolderRef.f3945a;
        C19383o.m32794d(t);
        View typedView$ui_release = ((ViewFactoryHolder) t).getTypedView$ui_release();
        if (typedView$ui_release != null) {
            typedView$ui_release.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
