package androidx.core.view;

import android.view.View;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class ViewKt$doOnLayout$$inlined$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C19857l $action$inlined;

    public ViewKt$doOnLayout$$inlined$doOnNextLayout$1(C19857l lVar) {
        this.$action$inlined = lVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.$action$inlined.invoke(view);
    }
}
