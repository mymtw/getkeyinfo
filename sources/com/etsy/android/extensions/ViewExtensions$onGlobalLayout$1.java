package com.etsy.android.extensions;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.C19394m;
import p753kq.C19846a;

public final class ViewExtensions$onGlobalLayout$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ C19846a<C19394m> $function;
    public final /* synthetic */ View $this_onGlobalLayout;

    public ViewExtensions$onGlobalLayout$1(View view, C19846a<C19394m> aVar) {
        this.$this_onGlobalLayout = view;
        this.$function = aVar;
    }

    public void onGlobalLayout() {
        this.$this_onGlobalLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.$function.invoke();
    }
}
