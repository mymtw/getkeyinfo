package androidx.compose.p015ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1320f;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.Recomposer;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.ref.WeakReference;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19840y0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.android.C19470c;
import kotlinx.coroutines.android.C19472e;
import p514bk.C14088a;
import p628nj.C18263b;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.AbstractComposeView */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<C1324g> cachedViewTreeCompositionContext;
    private C1320f composition;
    private boolean creatingComposition;
    private C19846a<C19394m> disposeViewCompositionStrategy;
    private C1324g parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final C1324g cacheIfAlive(C1324g gVar) {
        C1324g gVar2 = isAlive(gVar) ? gVar : null;
        if (gVar2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(gVar2);
        }
        return gVar;
    }

    private final void checkAddView() {
        if (!this.creatingComposition) {
            StringBuilder h = C0072d.m201h("Cannot add views to ");
            h.append(getClass().getSimpleName());
            h.append("; only Compose content is supported");
            throw new UnsupportedOperationException(h.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = C1886w1.m4161a(this, resolveParentCompositionContext(), C18263b.m30807B(new AbstractComposeView$ensureCompositionCreated$1(this), -656146368, true));
                this.creatingComposition = false;
            } catch (Throwable th) {
                this.creatingComposition = false;
                throw th;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(C1324g gVar) {
        return !(gVar instanceof Recomposer) || ((Recomposer.State) ((Recomposer) gVar).f2788q.getValue()).compareTo(Recomposer.State.ShuttingDown) > 0;
    }

    private final C1324g resolveParentCompositionContext() {
        C1324g gVar;
        Recomposer recomposer;
        C1324g gVar2 = this.parentContext;
        if (gVar2 != null) {
            return gVar2;
        }
        C1324g b = C1877t1.m4118b(this);
        if (b == null) {
            ViewParent parent = getParent();
            while (b == null && (parent instanceof View)) {
                b = C1877t1.m4118b((View) parent);
                parent = parent.getParent();
            }
        }
        C1324g cacheIfAlive = b != null ? cacheIfAlive(b) : null;
        if (cacheIfAlive != null) {
            return cacheIfAlive;
        }
        WeakReference<C1324g> weakReference = this.cachedViewTreeCompositionContext;
        if (weakReference == null || (gVar = weakReference.get()) == null || !isAlive(gVar)) {
            gVar = null;
        }
        if (gVar != null) {
            return gVar;
        }
        if (isAttachedToWindow()) {
            ViewParent parent2 = getParent();
            View view = this;
            while (parent2 instanceof View) {
                View view2 = (View) parent2;
                if (view2.getId() == 16908290) {
                    break;
                }
                view = view2;
                parent2 = view2.getParent();
            }
            C1324g b2 = C1877t1.m4118b(view);
            if (b2 == null) {
                recomposer = C1874s1.f4151a.get().mo7277a(view);
                view.setTag(R.id.androidx_compose_ui_view_composition_context, recomposer);
                C19840y0 y0Var = C19840y0.f43848b;
                Handler handler = view.getHandler();
                C19383o.m32796f(handler, "rootView.handler");
                int i = C19472e.f43408a;
                view.addOnAttachStateChangeListener(new WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(C19697g.m33468f(y0Var, new C19470c(handler, "windowRecomposer cleanup", false).f43407f, (CoroutineStart) null, new C1800xbfd085b3(recomposer, view, (C19340c<? super C1800xbfd085b3>) null), 2)));
            } else if (b2 instanceof Recomposer) {
                recomposer = (Recomposer) b2;
            } else {
                throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
            }
            return cacheIfAlive(recomposer);
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + this + " is not attached to a window").toString());
    }

    private final void setParentContext(C1324g gVar) {
        if (this.parentContext != gVar) {
            this.parentContext = gVar;
            if (gVar != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            C1320f fVar = this.composition;
            if (fVar != null) {
                fVar.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public abstract void Content(C1302d dVar, int i);

    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext != null || isAttachedToWindow()) {
            ensureCompositionCreated();
            return;
        }
        throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
    }

    public final void disposeComposition() {
        C1320f fVar = this.composition;
        if (fVar != null) {
            fVar.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui_release(z, i, i2, i3, i4);
    }

    public final void onMeasure(int i, int i2) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i, i2);
    }

    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(C1324g gVar) {
        setParentContext(gVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        View childAt = getChildAt(0);
        if (childAt != null) {
            ((C1750p) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        C19383o.m32797g(viewCompositionStrategy, ResponseConstants.STRATEGY);
        C19846a<C19394m> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.mo7143a(this);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        setClipChildren(false);
        setClipToPadding(false);
        C1792x994eb477 viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1 = new C1792x994eb477(this);
        addOnAttachStateChangeListener(viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1);
        C1875t tVar = new C1875t();
        C14088a.m21784l(this).f15034a.add(tVar);
        this.disposeViewCompositionStrategy = new C1791x11b1833b(this, viewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1, tVar);
    }

    public void addView(View view, int i) {
        checkAddView();
        super.addView(view, i);
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void addView(View view, int i, int i2) {
        checkAddView();
        super.addView(view, i, i2);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i, layoutParams);
    }
}
