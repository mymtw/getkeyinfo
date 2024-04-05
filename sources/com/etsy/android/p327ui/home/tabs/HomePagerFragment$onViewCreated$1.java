package com.etsy.android.p327ui.home.tabs;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.p327ui.user.C11611n;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.view.ToggleableSwipeViewPager;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.home.tabs.HomePagerFragment$onViewCreated$1 */
public final class HomePagerFragment$onViewCreated$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ HomePagerFragment this$0;

    public HomePagerFragment$onViewCreated$1(HomePagerFragment homePagerFragment) {
        this.this$0 = homePagerFragment;
    }

    public void onGlobalLayout() {
        ToggleableSwipeViewPager access$getViewPager$p = this.this$0.viewPager;
        View view = null;
        C11914o.m19630b(access$getViewPager$p != null ? access$getViewPager$p.getViewTreeObserver() : null, this);
        if (!C19382n.m32778w0() && !this.this$0.sharedPrefsProvider.mo46761a().getBoolean("dark_mode_tooltip_shown", false) && this.this$0.getViewModel().f22139y) {
            FragmentActivity requireActivity = this.this$0.requireActivity();
            C19383o.m32796f(requireActivity, "requireActivity()");
            C11611n a = C11611n.C11612a.m19358a(requireActivity, this.this$0.sharedPrefsProvider, this.this$0.darkModeTracker);
            int dimensionPixelOffset = a.f25714b.getResources().getDimensionPixelOffset(R.dimen.clg_space_32) + C8914m.m17343a(a.f25714b);
            PopupWindow popupWindow = a.f25713a;
            Window window = a.f25714b.getWindow();
            if (window != null) {
                view = window.getDecorView();
            }
            popupWindow.showAtLocation(view, 49, 0, dimensionPixelOffset);
        }
    }
}
