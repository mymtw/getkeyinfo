package androidx.activity.compose;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import androidx.activity.ComponentActivity;
import androidx.compose.p015ui.platform.ComposeView;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.etsy.android.R;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.activity.compose.c */
public final class C0109c {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f156a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: a */
    public static void m264a(ComponentActivity componentActivity, ComposableLambdaImpl composableLambdaImpl) {
        C19383o.m32797g(componentActivity, "<this>");
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext((C1324g) null);
            composeView.setContent(composableLambdaImpl);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView2.setParentCompositionContext((C1324g) null);
        composeView2.setContent(composableLambdaImpl);
        View decorView = componentActivity.getWindow().getDecorView();
        C19383o.m32796f(decorView, "window.decorView");
        if (C15588c1.m25325f0(decorView) == null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, componentActivity);
        }
        if (C0114h.m295Z(decorView) == null) {
            decorView.setTag(R.id.view_tree_view_model_store_owner, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.m7916a(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.m7917b(decorView, componentActivity);
        }
        componentActivity.setContentView(composeView2, f156a);
    }
}
