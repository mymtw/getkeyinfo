package androidx.compose.p015ui.window;

import android.app.Dialog;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.C0114h;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.UUID;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.window.DialogWrapper */
public final class DialogWrapper extends Dialog {

    /* renamed from: b */
    public C19846a<C19394m> f4717b;

    /* renamed from: c */
    public C2089b f4718c;

    /* renamed from: d */
    public final View f4719d;

    /* renamed from: e */
    public final DialogLayout f4720e;

    /* renamed from: androidx.compose.ui.window.DialogWrapper$a */
    public /* synthetic */ class C2085a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4721a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f4721a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogWrapper(C19846a<C19394m> aVar, C2089b bVar, View view, LayoutDirection layoutDirection, C7282b bVar2, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme));
        C19383o.m32797g(aVar, "onDismissRequest");
        C19383o.m32797g(bVar, "properties");
        C19383o.m32797g(view, "composeView");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar2, "density");
        this.f4717b = aVar;
        this.f4718c = bVar;
        this.f4719d = view;
        float f = (float) 30;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            DialogLayout dialogLayout = new DialogLayout(context, window);
            dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            dialogLayout.setClipChildren(false);
            dialogLayout.setElevation(bVar2.mo3789B0(f));
            dialogLayout.setOutlineProvider(new DialogWrapper$1$2());
            this.f4720e = dialogLayout;
            View decorView = window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null) {
                m4519a(viewGroup);
            }
            setContentView(dialogLayout);
            dialogLayout.setTag(R.id.view_tree_lifecycle_owner, C15588c1.m25325f0(view));
            dialogLayout.setTag(R.id.view_tree_view_model_store_owner, C0114h.m295Z(view));
            ViewTreeSavedStateRegistryOwner.m7917b(dialogLayout, ViewTreeSavedStateRegistryOwner.m7916a(view));
            mo7941b(this.f4717b, this.f4718c, layoutDirection);
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }

    /* renamed from: a */
    public static final void m4519a(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof DialogLayout)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 != null) {
                    m4519a(viewGroup2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo7941b(C19846a<C19394m> aVar, C2089b bVar, LayoutDirection layoutDirection) {
        C19383o.m32797g(aVar, "onDismissRequest");
        C19383o.m32797g(bVar, "properties");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        this.f4717b = aVar;
        this.f4718c = bVar;
        boolean a = C2094g.m4527a(bVar.f4727c, AndroidPopup_androidKt.m4516c(this.f4719d));
        Window window = getWindow();
        C19383o.m32794d(window);
        window.setFlags(a ? 8192 : -8193, 8192);
        DialogLayout dialogLayout = this.f4720e;
        int i = C2085a.f4721a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i2);
        this.f4720e.f4715d = bVar.f4728d;
    }

    public final void cancel() {
    }

    public final void onBackPressed() {
        if (this.f4718c.f4725a) {
            this.f4717b.invoke();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f4718c.f4726b) {
            this.f4717b.invoke();
        }
        return onTouchEvent;
    }
}
