package androidx.core.view;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class ViewKt$doOnNextLayout$1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C19857l<View, C19394m> $action;

    public ViewKt$doOnNextLayout$1(C19857l<? super View, C19394m> lVar) {
        this.$action = lVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C19383o.m32797g(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.$action.invoke(view);
    }
}
