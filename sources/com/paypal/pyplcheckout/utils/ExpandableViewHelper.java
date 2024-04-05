package com.paypal.pyplcheckout.utils;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;

public final class ExpandableViewHelper {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    private static final long VIEW_STATE_TRANSITION_DELAY = 0;
    @Deprecated
    private static final long VIEW_STATE_TRANSITION_DURATION = 250;
    private final ExpandableViewTransitionProperties defaultTransitionProperties = new ExpandableViewTransitionProperties(0, VIEW_STATE_TRANSITION_DURATION);
    private final ExpandableView expandableView;
    private Map<Integer, Object> lastViewStateAnimator = new LinkedHashMap();
    /* access modifiers changed from: private */
    public Map<Integer, Boolean> viewHasPreviouslyExpanded = new LinkedHashMap();
    private Map<Integer, ExpandableViewState> viewsState = new LinkedHashMap();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExpandableViewState.values().length];
            iArr[ExpandableViewState.Expanded.ordinal()] = 1;
            iArr[ExpandableViewState.Collapsed.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ExpandableViewHelper(ExpandableView expandableView2) {
        C19383o.m32797g(expandableView2, "expandableView");
        this.expandableView = expandableView2;
    }

    public static /* synthetic */ boolean updateViewExpansionState$default(ExpandableViewHelper expandableViewHelper, View view, ExpandableViewState expandableViewState, C19846a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar = null;
        }
        return expandableViewHelper.updateViewExpansionState(view, expandableViewState, aVar);
    }

    /* access modifiers changed from: private */
    public static final void updateViewExpansionState$finish(ExpandableViewHelper expandableViewHelper, View view, C19846a<C19394m> aVar) {
        expandableViewHelper.lastViewStateAnimator.remove(Integer.valueOf(view.getId()));
        expandableViewHelper.expandableView.onViewExpansionStateUpdateCompleted(view);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static /* synthetic */ void updateViewExpansionStateConditionally$default(ExpandableViewHelper expandableViewHelper, View view, ExpandableViewState expandableViewState, boolean z, C19846a aVar, C19846a aVar2, C19846a aVar3, int i, Object obj) {
        expandableViewHelper.updateViewExpansionStateConditionally(view, expandableViewState, z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : aVar2, (i & 32) != 0 ? null : aVar3);
    }

    public final ExpandableViewState getViewExpansionState(View view) {
        C19383o.m32797g(view, "view");
        return this.viewsState.get(Integer.valueOf(view.getId()));
    }

    public final boolean hasViewPreviouslyExpanded(View view) {
        C19383o.m32797g(view, "view");
        Boolean bool = this.viewHasPreviouslyExpanded.get(Integer.valueOf(view.getId()));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean updateViewExpansionState(View view, ExpandableViewState expandableViewState, C19846a<C19394m> aVar) {
        View view2 = view;
        ExpandableViewState expandableViewState2 = expandableViewState;
        C19846a<C19394m> aVar2 = aVar;
        C19383o.m32797g(view2, "view");
        C19383o.m32797g(expandableViewState2, "state");
        if (getViewExpansionState(view) == expandableViewState2) {
            return false;
        }
        this.viewsState.put(Integer.valueOf(view.getId()), expandableViewState2);
        this.expandableView.onViewExpansionStateUpdateStarted(view2);
        Object obj = this.lastViewStateAnimator.get(Integer.valueOf(view.getId()));
        if (obj != null) {
            if (obj instanceof Animation) {
                ((Animation) obj).cancel();
            } else if (obj instanceof ValueAnimator) {
                ((ValueAnimator) obj).cancel();
            }
        }
        ExpandableViewTransitionProperties viewTransitionProperties = this.expandableView.getViewTransitionProperties(view2, expandableViewState2);
        if (viewTransitionProperties == null) {
            viewTransitionProperties = this.defaultTransitionProperties;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[expandableViewState.ordinal()];
        if (i == 1) {
            Map<Integer, Object> map = this.lastViewStateAnimator;
            Integer valueOf = Integer.valueOf(view.getId());
            AnimationUtils animationUtils = AnimationUtils.INSTANCE;
            long delay = viewTransitionProperties.getDelay();
            map.put(valueOf, AnimationUtils.expand$default(animationUtils, view, viewTransitionProperties.getDuration(), delay, animationUtils.getEaseInOutQuartInterpolator(), false, new ExpandableViewHelper$updateViewExpansionState$2(this, view2, aVar2), 16, (Object) null));
        } else if (i == 2) {
            Map<Integer, Object> map2 = this.lastViewStateAnimator;
            Integer valueOf2 = Integer.valueOf(view.getId());
            AnimationUtils animationUtils2 = AnimationUtils.INSTANCE;
            long delay2 = viewTransitionProperties.getDelay();
            map2.put(valueOf2, AnimationUtils.shrink$default(animationUtils2, view, viewTransitionProperties.getDuration(), delay2, animationUtils2.getEaseInOutQuartInterpolator(), false, new ExpandableViewHelper$updateViewExpansionState$3(this, view2, aVar2), 16, (Object) null));
        }
        return true;
    }

    public final void updateViewExpansionStateConditionally(View view, ExpandableViewState expandableViewState, boolean z, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19846a<C19394m> aVar3) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(expandableViewState, "state");
        if (z) {
            if (aVar != null) {
                aVar.invoke();
            }
            updateViewExpansionState(view, expandableViewState, aVar3);
        } else if (aVar2 != null) {
            aVar2.invoke();
        }
    }
}
