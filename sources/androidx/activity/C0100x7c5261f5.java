package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.C19513o;

/* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 */
public final class C0100x7c5261f5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C19513o<Rect> $$this$callbackFlow;
    public final /* synthetic */ View.OnLayoutChangeListener $layoutChangeListener;
    public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
    public final /* synthetic */ View $view;

    public C0100x7c5261f5(C19513o<? super Rect> oVar, View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.$$this$callbackFlow = oVar;
        this.$view = view;
        this.$scrollChangeListener = onScrollChangedListener;
        this.$layoutChangeListener = onLayoutChangeListener;
    }

    public void onViewAttachedToWindow(View view) {
        C19383o.m32797g(view, "v");
        C19513o<Rect> oVar = this.$$this$callbackFlow;
        View view2 = this.$view;
        Rect rect = new Rect();
        view2.getGlobalVisibleRect(rect);
        oVar.offer(rect);
        this.$view.getViewTreeObserver().addOnScrollChangedListener(this.$scrollChangeListener);
        this.$view.addOnLayoutChangeListener(this.$layoutChangeListener);
    }

    public void onViewDetachedFromWindow(View view) {
        C19383o.m32797g(view, "v");
        view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
        view.removeOnLayoutChangeListener(this.$layoutChangeListener);
    }
}
