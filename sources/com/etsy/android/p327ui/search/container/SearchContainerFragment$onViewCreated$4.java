package com.etsy.android.p327ui.search.container;

import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p356ge.C12788a;
import p428qc.C13286d;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.search.container.SearchContainerFragment$onViewCreated$4 */
public final class SearchContainerFragment$onViewCreated$4 extends Lambda implements C19857l<C13286d, C19394m> {
    public final /* synthetic */ SearchContainerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchContainerFragment$onViewCreated$4(SearchContainerFragment searchContainerFragment) {
        super(1);
        this.this$0 = searchContainerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13286d) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C13286d dVar) {
        boolean z;
        if (dVar instanceof C13286d.C13288b) {
            z = true;
        } else {
            z = dVar instanceof C13286d.C13291e;
        }
        if (z) {
            try {
                C12788a.m20426e(this.this$0.getActivity());
            } catch (IllegalStateException unused) {
            }
        }
    }
}
