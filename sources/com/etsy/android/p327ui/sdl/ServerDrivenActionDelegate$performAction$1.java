package com.etsy.android.p327ui.sdl;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.etsy.android.R;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p377jf.C12979a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.sdl.ServerDrivenActionDelegate$performAction$1 */
public final class ServerDrivenActionDelegate$performAction$1 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ ServerDrivenActionDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDrivenActionDelegate$performAction$1(ServerDrivenActionDelegate serverDrivenActionDelegate) {
        super(1);
        this.this$0 = serverDrivenActionDelegate;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Throwable th) {
        C19383o.m32797g(th, "it");
        Fragment fragment = this.this$0.f23630d.get();
        if (fragment != null) {
            FragmentActivity requireActivity = fragment.requireActivity();
            C19383o.m32796f(requireActivity, "fragment.requireActivity()");
            C12979a a = C12979a.C12980a.m20683a(requireActivity);
            a.mo45785e(fragment.getString(R.string.save_search_error));
            a.mo45781a(CollageAlert.AlertType.ERROR);
            a.mo45783c(R.drawable.clg_icon_core_exclamation_v1);
            a.mo45786f();
        }
    }
}
