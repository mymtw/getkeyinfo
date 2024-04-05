package com.paypal.pyplcheckout.animation.sequences;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.room.C3251q;
import androidx.room.C3252r;
import androidx.room.C3253s;
import androidx.room.C3254t;
import com.appboy.p043ui.C4950e;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.animation.fading.FadeInAnimation;
import com.paypal.pyplcheckout.animation.fading.FadeOutAnimation;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Calendar;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p726zi.C18911f;

public final class CheckoutAnimationSequence {
    private ArrayDeque<ActionObject> actionList;
    private CheckoutAnimationCallback callback;
    private boolean cancelled;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Action.values().length];
            iArr[Action.FadeOut.ordinal()] = 1;
            iArr[Action.FadeIn.ordinal()] = 2;
            iArr[Action.CycleInOut.ordinal()] = 3;
            iArr[Action.Hide.ordinal()] = 4;
            iArr[Action.Show.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CheckoutAnimationSequence() {
        this((CheckoutAnimationCallback) null, 1, (DefaultConstructorMarker) null);
    }

    public CheckoutAnimationSequence(CheckoutAnimationCallback checkoutAnimationCallback) {
        this.callback = checkoutAnimationCallback;
        this.actionList = new ArrayDeque<>();
    }

    public static /* synthetic */ CheckoutAnimationSequence addAction$default(CheckoutAnimationSequence checkoutAnimationSequence, Action action, View view, Duration duration, String str, Drawable drawable, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = Duration.NONE;
        }
        return checkoutAnimationSequence.addAction(action, view, duration, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : drawable);
    }

    public static /* synthetic */ CheckoutAnimationSequence andThen$default(CheckoutAnimationSequence checkoutAnimationSequence, Action action, View view, Duration duration, String str, Drawable drawable, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = Duration.NONE;
        }
        return checkoutAnimationSequence.andThen(action, view, duration, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : drawable);
    }

    private final void cycleIV(ActionObject actionObject) {
        View view = actionObject.getView().get();
        if (view != null) {
            ImageView imageView = (ImageView) view;
            imageView.setImageDrawable(actionObject.getImageResource());
            Calendar.getInstance().add(13, actionObject.getDuration().getDuration());
            Drawable imageResource = actionObject.getImageResource();
            if (imageResource != null) {
                AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) imageResource;
                CheckoutAnimationSequence$cycleIV$animatedCallBack$1 checkoutAnimationSequence$cycleIV$animatedCallBack$1 = new CheckoutAnimationSequence$cycleIV$animatedCallBack$1(animatedVectorDrawable);
                animatedVectorDrawable.registerAnimationCallback(checkoutAnimationSequence$cycleIV$animatedCallBack$1);
                imageView.postDelayed(new C3253s(2, animatedVectorDrawable, checkoutAnimationSequence$cycleIV$animatedCallBack$1), (long) actionObject.getDuration().getDuration());
                animatedVectorDrawable.start();
                imageView.postDelayed(new C3254t(this, 4), (long) actionObject.getDuration().getDuration());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
    }

    /* access modifiers changed from: private */
    /* renamed from: cycleIV$lambda-4  reason: not valid java name */
    public static final void m35204cycleIV$lambda4(AnimatedVectorDrawable animatedVectorDrawable, CheckoutAnimationSequence$cycleIV$animatedCallBack$1 checkoutAnimationSequence$cycleIV$animatedCallBack$1) {
        C19383o.m32797g(animatedVectorDrawable, "$animatedVectorDrawable");
        C19383o.m32797g(checkoutAnimationSequence$cycleIV$animatedCallBack$1, "$animatedCallBack");
        animatedVectorDrawable.unregisterAnimationCallback(checkoutAnimationSequence$cycleIV$animatedCallBack$1);
    }

    /* access modifiers changed from: private */
    /* renamed from: cycleIV$lambda-5  reason: not valid java name */
    public static final void m35205cycleIV$lambda5(CheckoutAnimationSequence checkoutAnimationSequence) {
        C19383o.m32797g(checkoutAnimationSequence, "this$0");
        checkoutAnimationSequence.start();
    }

    private final void fadeInView(ActionObject actionObject) {
        if (!this.cancelled) {
            View view = actionObject.getView().get();
            if (view != null) {
                if ((view instanceof TextView) && actionObject.getNewText() != null) {
                    ((TextView) view).setText(actionObject.getNewText());
                } else if ((view instanceof ImageView) && actionObject.getImageResource() != null) {
                    ((ImageView) view).setImageDrawable(actionObject.getImageResource());
                }
                FadeInAnimation fadeInAnimation = new FadeInAnimation();
                fadeInAnimation.prepare(view);
                fadeInAnimation.setDuration((long) Duration.SHORT.getDuration());
                fadeInAnimation.start();
                view.setVisibility(0);
            }
            if (view != null) {
                view.postDelayed(new C18911f(this, 1), (long) actionObject.getDuration().getDuration());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fadeInView$lambda-3  reason: not valid java name */
    public static final void m35206fadeInView$lambda3(CheckoutAnimationSequence checkoutAnimationSequence) {
        C19383o.m32797g(checkoutAnimationSequence, "this$0");
        checkoutAnimationSequence.start();
    }

    private final void fadeOutView(ActionObject actionObject) {
        if (!this.cancelled) {
            View view = actionObject.getView().get();
            if (view != null) {
                FadeOutAnimation fadeOutAnimation = new FadeOutAnimation();
                fadeOutAnimation.prepare(view);
                fadeOutAnimation.setDuration((long) actionObject.getDuration().getDuration());
                fadeOutAnimation.start();
            }
            View view2 = actionObject.getView().get();
            if (view2 != null) {
                view2.postDelayed(new C3252r(this, 5), (long) actionObject.getDuration().getDuration());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fadeOutView$lambda-2  reason: not valid java name */
    public static final void m35207fadeOutView$lambda2(CheckoutAnimationSequence checkoutAnimationSequence) {
        C19383o.m32797g(checkoutAnimationSequence, "this$0");
        checkoutAnimationSequence.start();
    }

    private final void hideView(ActionObject actionObject) {
        View view = actionObject.getView().get();
        if (view != null) {
            view.setVisibility(4);
        }
        View view2 = actionObject.getView().get();
        if (view2 != null) {
            view2.postDelayed(new C4950e(this, 7), (long) actionObject.getDuration().getDuration());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: hideView$lambda-0  reason: not valid java name */
    public static final void m35208hideView$lambda0(CheckoutAnimationSequence checkoutAnimationSequence) {
        C19383o.m32797g(checkoutAnimationSequence, "this$0");
        checkoutAnimationSequence.start();
    }

    private final void showView(ActionObject actionObject) {
        View view = actionObject.getView().get();
        if ((view instanceof TextView) && actionObject.getNewText() != null) {
            ((TextView) view).setText(actionObject.getNewText());
        } else if ((view instanceof ImageView) && actionObject.getImageResource() != null) {
            ((ImageView) view).setImageDrawable(actionObject.getImageResource());
        }
        if (view != null) {
            view.setVisibility(0);
        }
        if (view != null) {
            view.postDelayed(new C3251q(this, 3), (long) actionObject.getDuration().getDuration());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showView$lambda-1  reason: not valid java name */
    public static final void m35209showView$lambda1(CheckoutAnimationSequence checkoutAnimationSequence) {
        C19383o.m32797g(checkoutAnimationSequence, "this$0");
        checkoutAnimationSequence.start();
    }

    public static /* synthetic */ CheckoutAnimationSequence with$default(CheckoutAnimationSequence checkoutAnimationSequence, Action action, View view, Duration duration, String str, Drawable drawable, int i, Object obj) {
        if ((i & 4) != 0) {
            duration = Duration.NONE;
        }
        return checkoutAnimationSequence.with(action, view, duration, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : drawable);
    }

    public final CheckoutAnimationSequence addAction(Action action, View view) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        return addAction$default(this, action, view, (Duration) null, (String) null, (Drawable) null, 28, (Object) null);
    }

    public final CheckoutAnimationSequence addAction(Action action, View view, Duration duration) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        return addAction$default(this, action, view, duration, (String) null, (Drawable) null, 24, (Object) null);
    }

    public final CheckoutAnimationSequence addAction(Action action, View view, Duration duration, String str) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        return addAction$default(this, action, view, duration, str, (Drawable) null, 16, (Object) null);
    }

    public final CheckoutAnimationSequence addAction(Action action, View view, Duration duration, String str, Drawable drawable) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        this.actionList.add(new ActionObject(duration, new WeakReference(view), action, str, drawable));
        return this;
    }

    public final void addCallBack(CheckoutAnimationCallback checkoutAnimationCallback) {
        C19383o.m32797g(checkoutAnimationCallback, "callback");
        this.callback = checkoutAnimationCallback;
    }

    public final CheckoutAnimationSequence andThen(Action action, View view) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        return andThen$default(this, action, view, (Duration) null, (String) null, (Drawable) null, 28, (Object) null);
    }

    public final CheckoutAnimationSequence andThen(Action action, View view, Duration duration) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        return andThen$default(this, action, view, duration, (String) null, (Drawable) null, 24, (Object) null);
    }

    public final CheckoutAnimationSequence andThen(Action action, View view, Duration duration, String str) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        return andThen$default(this, action, view, duration, str, (Drawable) null, 16, (Object) null);
    }

    public final CheckoutAnimationSequence andThen(Action action, View view, Duration duration, String str, Drawable drawable) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        if (this.actionList.size() != 0) {
            addAction(action, view, duration, str, drawable);
            return this;
        }
        throw new AssertionError("This cannot be the first action");
    }

    public final void cancel() {
        this.actionList.clear();
        this.cancelled = true;
    }

    public final CheckoutAnimationCallback getCallback() {
        return this.callback;
    }

    public final boolean getCancelled() {
        return this.cancelled;
    }

    public final void setCallback(CheckoutAnimationCallback checkoutAnimationCallback) {
        this.callback = checkoutAnimationCallback;
    }

    public final void setCancelled(boolean z) {
        this.cancelled = z;
    }

    public final void start() {
        ActionObject poll = this.actionList.poll();
        if (poll == null || this.cancelled) {
            CheckoutAnimationCallback checkoutAnimationCallback = this.callback;
            if (checkoutAnimationCallback != null) {
                checkoutAnimationCallback.onAnimationEnd();
                return;
            }
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[poll.getAction().ordinal()];
        if (i == 1) {
            fadeOutView(poll);
        } else if (i == 2) {
            fadeInView(poll);
        } else if (i == 3) {
            cycleIV(poll);
        } else if (i == 4) {
            hideView(poll);
        } else if (i == 5) {
            showView(poll);
        }
    }

    public final CheckoutAnimationSequence with(Action action, View view) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        return with$default(this, action, view, (Duration) null, (String) null, (Drawable) null, 28, (Object) null);
    }

    public final CheckoutAnimationSequence with(Action action, View view, Duration duration) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        return with$default(this, action, view, duration, (String) null, (Drawable) null, 24, (Object) null);
    }

    public final CheckoutAnimationSequence with(Action action, View view, Duration duration, String str) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        return with$default(this, action, view, duration, str, (Drawable) null, 16, (Object) null);
    }

    public final CheckoutAnimationSequence with(Action action, View view, Duration duration, String str, Drawable drawable) {
        C19383o.m32797g(action, ResponseConstants.ACTION);
        C19383o.m32797g(view, "view");
        C19383o.m32797g(duration, "duration");
        if (this.actionList.size() != 0) {
            Duration duration2 = this.actionList.getLast().getDuration();
            this.actionList.getLast().setDuration(Duration.NONE);
            if (duration2.getDuration() > duration.getDuration()) {
                addAction(action, view, this.actionList.getLast().getDuration(), str, drawable);
            } else {
                addAction(action, view, duration, str, drawable);
            }
            return this;
        }
        throw new AssertionError("This cannot be the first action");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckoutAnimationSequence(CheckoutAnimationCallback checkoutAnimationCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : checkoutAnimationCallback);
    }
}
