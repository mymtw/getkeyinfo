package com.paypal.pyplcheckout.extensions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.paypal.pyplcheckout.C17165R;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

public final class ViewExtensionsKt {
    public static final Activity getActivity(View view) {
        C19383o.m32797g(view, "<this>");
        Context context = view.getContext();
        if (context != null) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            while (contextWrapper != null) {
                if (contextWrapper instanceof Activity) {
                    return (Activity) contextWrapper;
                }
                Context baseContext = contextWrapper.getBaseContext();
                contextWrapper = baseContext instanceof ContextWrapper ? (ContextWrapper) baseContext : null;
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.ContextWrapper");
    }

    public static final boolean isFading(View view) {
        C19383o.m32797g(view, "<this>");
        Object tag = view.getTag(C17165R.C17167id.IS_VIEW_FADING_TAG);
        return C19383o.m32792b(tag instanceof Boolean ? (Boolean) tag : null, Boolean.TRUE);
    }

    public static final int measureExpectedHeight(View view) {
        int i;
        C19383o.m32797g(view, "<this>");
        if (view.getParent() == null) {
            i = view.getWidth();
        } else {
            ViewParent parent = view.getParent();
            if (parent != null) {
                i = ((View) parent).getWidth();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static final void runOnFinish(ViewPropertyAnimator viewPropertyAnimator, C19846a<C19394m> aVar) {
        C19383o.m32797g(viewPropertyAnimator, "<this>");
        C19383o.m32797g(aVar, "onFinish");
        viewPropertyAnimator.setListener(new ViewExtensionsKt$runOnFinish$1(viewPropertyAnimator, aVar));
    }
}
