package com.etsy.android.p327ui.sdl;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.models.apiv3.sdl.Page;
import com.etsy.android.lib.models.apiv3.sdl.ServerDrivenResult;
import com.etsy.android.lib.models.apiv3.vespa.BaseServerDrivenActionResult;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.SdlModalBottomSheetKey;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19421p;
import p356ge.C12790b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.sdl.ServerDrivenActionDelegate$performAction$2 */
public final class ServerDrivenActionDelegate$performAction$2 extends Lambda implements C19857l<ServerDrivenResult, C19394m> {
    public final /* synthetic */ ServerDrivenActionDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDrivenActionDelegate$performAction$2(ServerDrivenActionDelegate serverDrivenActionDelegate) {
        super(1);
        this.this$0 = serverDrivenActionDelegate;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ServerDrivenResult) obj);
        return C19394m.f43287a;
    }

    public final void invoke(ServerDrivenResult serverDrivenResult) {
        ServerDrivenActionDelegate serverDrivenActionDelegate = this.this$0;
        C19383o.m32796f(serverDrivenResult, "it");
        serverDrivenActionDelegate.getClass();
        if (C19383o.m32792b(serverDrivenResult.getType(), BaseServerDrivenActionResult.MODAL) && serverDrivenResult.getContent() != null) {
            Page content = serverDrivenResult.getContent();
            C19383o.m32794d(content);
            Fragment fragment = serverDrivenActionDelegate.f23630d.get();
            Fragment fragment2 = serverDrivenActionDelegate.f23630d.get();
            C12790b.m20430b(fragment, new SdlModalBottomSheetKey(C19421p.m32935c0(fragment2 != null ? fragment2.getActivity() : null), content));
        }
    }
}
