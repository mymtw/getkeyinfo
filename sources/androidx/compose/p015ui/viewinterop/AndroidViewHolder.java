package androidx.compose.p015ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.draw.DrawModifierKt;
import androidx.compose.p015ui.input.nestedscroll.C1617a;
import androidx.compose.p015ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p015ui.input.pointer.C1653x;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.platform.C1877t1;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.snapshots.C1384e;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.core.view.C2321o;
import androidx.core.view.C2323p;
import androidx.lifecycle.C2887s;
import androidx.savedstate.C3269d;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p174m0.C7282b;
import p174m0.C7283c;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder */
public abstract class AndroidViewHolder extends ViewGroup implements C2321o {
    private C7282b density;
    /* access modifiers changed from: private */
    public final NestedScrollDispatcher dispatcher;
    /* access modifiers changed from: private */
    public boolean hasUpdateBlock;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private C2887s lifecycleOwner;
    private final int[] location;
    private C1436d modifier;
    private final C2323p nestedScrollingParentHelper;
    /* access modifiers changed from: private */
    public final C19857l<AndroidViewHolder, C19394m> onCommitAffectingUpdate;
    private C19857l<? super C7282b, C19394m> onDensityChanged;
    private C19857l<? super C1436d, C19394m> onModifierChanged;
    private C19857l<? super Boolean, C19394m> onRequestDisallowInterceptTouchEvent;
    /* access modifiers changed from: private */
    public final C19846a<C19394m> runUpdate;
    private C3269d savedStateRegistryOwner;
    /* access modifiers changed from: private */
    public final SnapshotStateObserver snapshotObserver;
    private C19846a<C19394m> update;
    private View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(Context context, C1324g gVar, NestedScrollDispatcher nestedScrollDispatcher) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(nestedScrollDispatcher, "dispatcher");
        this.dispatcher = nestedScrollDispatcher;
        if (gVar != null) {
            LinkedHashMap linkedHashMap = C1877t1.f4159a;
            setTag(R.id.androidx_compose_ui_view_composition_context, gVar);
        }
        setSaveFromParentEnabled(false);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.modifier = C1436d.C1437a.f3125b;
        this.density = new C7283c(1.0f, 1.0f);
        this.snapshotObserver = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.onCommitAffectingUpdate = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new C2323p();
        LayoutNode layoutNode2 = new LayoutNode(false);
        C1436d A0 = C15588c1.m25270A0(DrawModifierKt.m3070a(C1653x.m3528a(this), new AndroidViewHolder$layoutNode$1$coreModifier$1(layoutNode2, this)), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode2));
        layoutNode2.mo6729k(this.modifier.mo6148i0(A0));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode2, A0);
        layoutNode2.mo6727g(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode2);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        layoutNode2.f3809M = new AndroidViewHolder$layoutNode$1$3(this, layoutNode2, ref$ObjectRef);
        layoutNode2.f3810N = new AndroidViewHolder$layoutNode$1$4(this, ref$ObjectRef);
        layoutNode2.mo6728j(new AndroidViewHolder$layoutNode$1$5(this, layoutNode2));
        this.layoutNode = layoutNode2;
    }

    /* access modifiers changed from: private */
    public final int obtainMeasureSpec(int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(C19388s.m32833M(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        Region region2 = region;
        region2.op(i, iArr[1], getWidth() + i, getHeight() + this.location[1], Region.Op.DIFFERENCE);
        return true;
    }

    public final C7282b getDensity() {
        return this.density;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.getLayoutParams();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.ViewGroup.LayoutParams getLayoutParams() {
        /*
            r2 = this;
            android.view.View r0 = r2.view
            if (r0 == 0) goto L_0x000a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 != 0) goto L_0x0010
        L_0x000a:
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.viewinterop.AndroidViewHolder.getLayoutParams():android.view.ViewGroup$LayoutParams");
    }

    public final C2887s getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final C1436d getModifier() {
        return this.modifier;
    }

    public int getNestedScrollAxes() {
        C2323p pVar = this.nestedScrollingParentHelper;
        return pVar.f5582b | pVar.f5581a;
    }

    public final C19857l<C7282b, C19394m> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final C19857l<C1436d, C19394m> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final C19857l<Boolean, C19394m> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final C3269d getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final C19846a<C19394m> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.layoutNode.mo6740C();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        View view2 = this.view;
        return view2 != null ? view2.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotObserver.mo5986c();
    }

    public void onDescendantInvalidated(View view2, View view3) {
        C19383o.m32797g(view2, "child");
        C19383o.m32797g(view3, "target");
        super.onDescendantInvalidated(view2, view3);
        this.layoutNode.mo6740C();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1384e eVar = this.snapshotObserver.f3003e;
        if (eVar != null) {
            eVar.dispose();
        }
        this.snapshotObserver.mo5984a();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view2 = this.view;
        if (view2 != null) {
            view2.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onMeasure(int i, int i2) {
        View view2 = this.view;
        if (view2 != null) {
            view2.measure(i, i2);
        }
        View view3 = this.view;
        int i3 = 0;
        int measuredWidth = view3 != null ? view3.getMeasuredWidth() : 0;
        View view4 = this.view;
        if (view4 != null) {
            i3 = view4.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, i3);
        this.lastWidthMeasureSpec = i;
        this.lastHeightMeasureSpec = i2;
    }

    public boolean onNestedFling(View view2, float f, float f2, boolean z) {
        C19383o.m32797g(view2, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C19697g.m33468f(this.dispatcher.mo6538d(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedFling$1(z, this, C1993m.m4370p(f * -1.0f, f2 * -1.0f), (C19340c<? super AndroidViewHolder$onNestedFling$1>) null), 3);
        return false;
    }

    public boolean onNestedPreFling(View view2, float f, float f2) {
        C19383o.m32797g(view2, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C19697g.m33468f(this.dispatcher.mo6538d(), (CoroutineContext) null, (CoroutineStart) null, new AndroidViewHolder$onNestedPreFling$1(this, C1993m.m4370p(f * -1.0f, f2 * -1.0f), (C19340c<? super AndroidViewHolder$onNestedPreFling$1>) null), 3);
        return false;
    }

    public void onNestedPreScroll(View view2, int i, int i2, int[] iArr, int i3) {
        C19383o.m32797g(view2, "target");
        C19383o.m32797g(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float f = (float) -1;
            long q = C19421p.m32952q(((float) i) * f, ((float) i2) * f);
            int i4 = i3 == 0 ? 1 : 2;
            C1617a aVar = nestedScrollDispatcher.f3595c;
            long b = aVar != null ? aVar.mo4012b(i4, q) : C8343c.f18295b;
            iArr[0] = C19388s.m32839P(C8343c.m16642c(b));
            iArr[1] = C19388s.m32839P(C8343c.m16643d(b));
        }
    }

    public void onNestedScroll(View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C19383o.m32797g(view2, "target");
        C19383o.m32797g(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            float f = (float) i;
            float f2 = (float) -1;
            long b = this.dispatcher.mo6536b(C19421p.m32952q(f * f2, ((float) i2) * f2), C19421p.m32952q(((float) i3) * f2, ((float) i4) * f2), i5 == 0 ? 1 : 2);
            iArr[0] = C19388s.m32839P(C8343c.m16642c(b));
            iArr[1] = C19388s.m32839P(C8343c.m16643d(b));
        }
    }

    public void onNestedScrollAccepted(View view2, View view3, int i, int i2) {
        C19383o.m32797g(view2, "child");
        C19383o.m32797g(view3, "target");
        this.nestedScrollingParentHelper.mo8912a(i, i2);
    }

    public boolean onStartNestedScroll(View view2, View view3, int i, int i2) {
        C19383o.m32797g(view2, "child");
        C19383o.m32797g(view3, "target");
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    public void onStopNestedScroll(View view2, int i) {
        C19383o.m32797g(view2, "target");
        C2323p pVar = this.nestedScrollingParentHelper;
        if (i == 1) {
            pVar.f5582b = 0;
        } else {
            pVar.f5581a = 0;
        }
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 != Integer.MIN_VALUE && (i = this.lastHeightMeasureSpec) != Integer.MIN_VALUE) {
            measure(i2, i);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        C19857l<? super Boolean, C19394m> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(C7282b bVar) {
        C19383o.m32797g(bVar, "value");
        if (bVar != this.density) {
            this.density = bVar;
            C19857l<? super C7282b, C19394m> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
        }
    }

    public final void setLifecycleOwner(C2887s sVar) {
        if (sVar != this.lifecycleOwner) {
            this.lifecycleOwner = sVar;
            setTag(R.id.view_tree_lifecycle_owner, sVar);
        }
    }

    public final void setModifier(C1436d dVar) {
        C19383o.m32797g(dVar, "value");
        if (dVar != this.modifier) {
            this.modifier = dVar;
            C19857l<? super C1436d, C19394m> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(C19857l<? super C7282b, C19394m> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui_release(C19857l<? super C1436d, C19394m> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(C19857l<? super Boolean, C19394m> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    public final void setSavedStateRegistryOwner(C3269d dVar) {
        if (dVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = dVar;
            ViewTreeSavedStateRegistryOwner.m7917b(this, dVar);
        }
    }

    public final void setUpdate(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "value");
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final void setView$ui_release(View view2) {
        if (view2 != this.view) {
            this.view = view2;
            removeAllViews();
            if (view2 != null) {
                addView(view2);
                this.runUpdate.invoke();
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public void onNestedScroll(View view2, int i, int i2, int i3, int i4, int i5) {
        C19383o.m32797g(view2, "target");
        if (isNestedScrollingEnabled()) {
            float f = (float) i;
            float f2 = (float) -1;
            this.dispatcher.mo6536b(C19421p.m32952q(f * f2, ((float) i2) * f2), C19421p.m32952q(((float) i3) * f2, ((float) i4) * f2), i5 == 0 ? 1 : 2);
        }
    }
}
