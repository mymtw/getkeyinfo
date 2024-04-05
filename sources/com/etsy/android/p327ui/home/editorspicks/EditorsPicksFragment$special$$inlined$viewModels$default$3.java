package com.etsy.android.p327ui.home.editorspicks;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2870k0;
import androidx.lifecycle.C2881n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksFragment$special$$inlined$viewModels$default$3 */
public final class EditorsPicksFragment$special$$inlined$viewModels$default$3 extends Lambda implements C19846a<C2870k0.C2872b> {
    public final /* synthetic */ C19846a $ownerProducer;
    public final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorsPicksFragment$special$$inlined$viewModels$default$3(C19846a aVar, Fragment fragment) {
        super(0);
        this.$ownerProducer = aVar;
        this.$this_viewModels = fragment;
    }

    public final C2870k0.C2872b invoke() {
        Object invoke = this.$ownerProducer.invoke();
        C2870k0.C2872b bVar = null;
        C2881n nVar = invoke instanceof C2881n ? (C2881n) invoke : null;
        if (nVar != null) {
            bVar = nVar.getDefaultViewModelProviderFactory();
        }
        if (bVar == null) {
            bVar = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        C19383o.m32796f(bVar, "(ownerProducer() as? Has…tViewModelProviderFactory");
        return bVar;
    }
}
