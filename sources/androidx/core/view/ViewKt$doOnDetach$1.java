package androidx.core.view;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class ViewKt$doOnDetach$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C19857l<View, C19394m> $action;
    public final /* synthetic */ View $this_doOnDetach;

    public ViewKt$doOnDetach$1(View view, C19857l<? super View, C19394m> lVar) {
        this.$this_doOnDetach = view;
        this.$action = lVar;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "view");
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "view");
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        this.$action.invoke(view);
    }
}
