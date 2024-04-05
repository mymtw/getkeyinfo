package androidx.compose.p015ui.viewinterop;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.node.C1754s;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.saveable.C1369e;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1 */
final class AndroidView_androidKt$AndroidView$1 extends Lambda implements C19846a<LayoutNode> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ NestedScrollDispatcher $dispatcher;
    public final /* synthetic */ C19857l<Context, Object> $factory;
    public final /* synthetic */ C1324g $parentReference;
    public final /* synthetic */ String $stateKey;
    public final /* synthetic */ C1369e $stateRegistry;
    public final /* synthetic */ C1754s<ViewFactoryHolder<Object>> $viewFactoryHolderRef;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$1(Context context, C1324g gVar, NestedScrollDispatcher nestedScrollDispatcher, C19857l<? super Context, Object> lVar, C1369e eVar, String str, C1754s<ViewFactoryHolder<Object>> sVar) {
        super(0);
        this.$context = context;
        this.$parentReference = gVar;
        this.$dispatcher = nestedScrollDispatcher;
        this.$factory = lVar;
        this.$stateRegistry = eVar;
        this.$stateKey = str;
        this.$viewFactoryHolderRef = sVar;
    }

    public final LayoutNode invoke() {
        View typedView$ui_release;
        T viewFactoryHolder = new ViewFactoryHolder(this.$context, this.$parentReference, this.$dispatcher);
        viewFactoryHolder.setFactory(this.$factory);
        C1369e eVar = this.$stateRegistry;
        SparseArray sparseArray = null;
        Object d = eVar != null ? eVar.mo5926d(this.$stateKey) : null;
        if (d instanceof SparseArray) {
            sparseArray = (SparseArray) d;
        }
        if (!(sparseArray == null || (typedView$ui_release = viewFactoryHolder.getTypedView$ui_release()) == null)) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.$viewFactoryHolderRef.f3945a = viewFactoryHolder;
        return viewFactoryHolder.getLayoutNode();
    }
}
