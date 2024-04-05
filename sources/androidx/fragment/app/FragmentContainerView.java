package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.appupdate.C15562d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FragmentContainerView extends FrameLayout {
    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    private final List<View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;
    private final List<View> transitioningFragmentViews;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    private final void addDisappearingFragmentView(View view) {
        if (this.transitioningFragmentViews.contains(view)) {
            this.disappearingFragmentChildren.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C19383o.m32797g(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C2348w0 w0Var;
        C19383o.m32797g(windowInsets, "insets");
        C2348w0 k = C2348w0.m5100k((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C19383o.m32796f(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            w0Var = C2348w0.m5100k((View) null, onApplyWindowInsets);
        } else {
            w0Var = C2364y.m5196k(this, k);
        }
        if (!w0Var.f5615a.mo8976n()) {
            int i = 0;
            int childCount = getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i2 = i + 1;
                    C2364y.m5187b(getChildAt(i), w0Var);
                    if (i2 >= childCount) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            for (View drawChild : this.disappearingFragmentChildren) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C19383o.m32797g(canvas, "canvas");
        C19383o.m32797g(view, "child");
        if (!this.drawDisappearingViewsFirst || !(!this.disappearingFragmentChildren.isEmpty()) || !this.disappearingFragmentChildren.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        C19383o.m32797g(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        Fragment fragment;
        FragmentManager fragmentManager;
        FragmentActivity fragmentActivity = null;
        View view = this;
        while (true) {
            if (view == null) {
                fragment = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                break;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (fragment == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                fragmentManager = fragmentActivity.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (fragment.isAdded()) {
            fragmentManager = fragment.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return fragmentManager.mo10352B(getId());
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C19383o.m32797g(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i = childCount - 1;
                View childAt = getChildAt(childCount);
                C19383o.m32796f(childAt, "view");
                addDisappearingFragmentView(childAt);
                if (i < 0) {
                    break;
                }
                childCount = i;
            }
        }
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        C19383o.m32797g(view, "view");
        addDisappearingFragmentView(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C19383o.m32796f(childAt, "view");
        addDisappearingFragmentView(childAt);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        C19383o.m32797g(view, "view");
        addDisappearingFragmentView(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                C19383o.m32796f(childAt, "view");
                addDisappearingFragmentView(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                C19383o.m32796f(childAt, "view");
                addDisappearingFragmentView(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.drawDisappearingViewsFirst = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C19383o.m32797g(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.applyWindowInsetsListener = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C19383o.m32797g(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15562d.f35026k, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + JsonFactory.DEFAULT_QUOTE_CHAR);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(attributeSet, "attrs");
        C19383o.m32797g(fragmentManager, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15562d.f35026k, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment B = fragmentManager.mo10352B(id);
        if (classAttribute != null && B == null) {
            if (id == -1) {
                String l = string != null ? C19383o.m32802l(string, " with tag ") : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + l);
            }
            Fragment a = fragmentManager.mo10357G().mo10411a(context.getClassLoader(), classAttribute);
            C19383o.m32796f(a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a.onInflate(context, attributeSet, (Bundle) null);
            C2740a aVar = new C2740a(fragmentManager);
            aVar.f6261r = true;
            a.mContainer = this;
            aVar.mo10485g(getId(), a, string, 1);
            if (!aVar.f6252i) {
                aVar.f6253j = false;
                aVar.f6218s.mo10405y(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fragmentManager.f6133c.mo10521d().iterator();
        while (it.hasNext()) {
            C2741a0 a0Var = (C2741a0) it.next();
            Fragment fragment = a0Var.f6223c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                a0Var.mo10495b();
            }
        }
    }
}
