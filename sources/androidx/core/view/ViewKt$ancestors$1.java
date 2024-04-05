package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements C19857l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final ViewParent invoke(ViewParent viewParent) {
        C19383o.m32797g(viewParent, "p0");
        return viewParent.getParent();
    }
}
