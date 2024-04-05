package androidx.compose.p015ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.viewinterop.AndroidViewHolder;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashMap;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.platform.AndroidViewsHandler */
public final class AndroidViewsHandler extends ViewGroup {
    private final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode = new HashMap<>();
    private final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = new HashMap<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewsHandler(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        setClipChildren(false);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void drawView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        C19383o.m32797g(androidViewHolder, "view");
        C19383o.m32797g(canvas, "canvas");
        androidViewHolder.draw(canvas);
    }

    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    public Void invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
        C19383o.m32797g(view, "child");
        C19383o.m32797g(view2, "target");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Set<AndroidViewHolder> keySet = this.holderToLayoutNode.keySet();
        C19383o.m32796f(keySet, "holderToLayoutNode.keys");
        for (AndroidViewHolder androidViewHolder : keySet) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z = false;
            }
            if (z) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                Set<AndroidViewHolder> keySet = this.holderToLayoutNode.keySet();
                C19383o.m32796f(keySet, "holderToLayoutNode.keys");
                for (AndroidViewHolder remeasure : keySet) {
                    remeasure.remeasure();
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.C1721b bVar = LayoutNode.f3792V;
                layoutNode.mo6754S(false);
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
