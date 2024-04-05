package androidx.core.view;

import android.view.View;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

public final class ViewKt$doOnAttach$1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C19857l<View, C19394m> $action;
    public final /* synthetic */ View $this_doOnAttach;

    public ViewKt$doOnAttach$1(View view, C19857l<? super View, C19394m> lVar) {
        this.$this_doOnAttach = view;
        this.$action = lVar;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "view");
        this.$this_doOnAttach.removeOnAttachStateChangeListener(this);
        this.$action.invoke(view);
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "view");
    }
}
