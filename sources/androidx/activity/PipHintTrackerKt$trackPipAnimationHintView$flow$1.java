package androidx.activity;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.ProduceKt;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", mo70541f = "PipHintTracker.kt", mo70542l = {88}, mo70543m = "invokeSuspend")
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends SuspendLambda implements C19861p<C19513o<? super Rect>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    public int label;

    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$a */
    public static final class C0098a implements View.OnLayoutChangeListener {

        /* renamed from: b */
        public final /* synthetic */ C19513o<Rect> f145b;

        public C0098a(C19513o<? super Rect> oVar) {
            this.f145b = oVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
                C19513o<Rect> oVar = this.f145b;
                C19383o.m32796f(view, "v");
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                oVar.offer(rect);
            }
        }
    }

    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$b */
    public static final class C0099b implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: b */
        public final /* synthetic */ C19513o<Rect> f146b;

        /* renamed from: c */
        public final /* synthetic */ View f147c;

        public C0099b(C19513o<? super Rect> oVar, View view) {
            this.f146b = oVar;
            this.f147c = view;
        }

        public final void onScrollChanged() {
            C19513o<Rect> oVar = this.f146b;
            View view = this.f147c;
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            oVar.offer(rect);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, C19340c<? super PipHintTrackerKt$trackPipAnimationHintView$flow$1> cVar) {
        super(2, cVar);
        this.$view = view;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, cVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    public final Object invoke(C19513o<? super Rect> oVar, C19340c<? super C19394m> cVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(oVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19513o oVar = (C19513o) this.L$0;
            final C0098a aVar = new C0098a(oVar);
            View view = this.$view;
            final C0099b bVar = new C0099b(oVar, view);
            final C0100x7c5261f5 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 = new C0100x7c5261f5(oVar, view, bVar, aVar);
            View view2 = this.$view;
            C19383o.m32797g(view2, "view");
            if (view2.isAttachedToWindow()) {
                View view3 = this.$view;
                Rect rect = new Rect();
                view3.getGlobalVisibleRect(rect);
                oVar.offer(rect);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(bVar);
                this.$view.addOnLayoutChangeListener(aVar);
            }
            this.$view.addOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
            final View view4 = this.$view;
            C00971 r4 = new C19846a<C19394m>() {
                public final void invoke() {
                    view4.getViewTreeObserver().removeOnScrollChangedListener(bVar);
                    view4.removeOnLayoutChangeListener(aVar);
                    view4.removeOnAttachStateChangeListener(pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1);
                }
            };
            this.label = 1;
            if (ProduceKt.m33138a(oVar, r4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
