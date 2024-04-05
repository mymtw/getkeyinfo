package com.etsy.android.p327ui.favorites.add;

import androidx.fragment.app.Fragment;
import com.etsy.android.p327ui.favorites.add.C9754c;
import kotlin.C19394m;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListPresenter$attach$1 */
final class AddToListPresenter$attach$1 extends Lambda implements C19857l<C9754c, C19394m> {
    public final /* synthetic */ boolean $isFavoriting;
    public final /* synthetic */ AddToListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToListPresenter$attach$1(AddToListPresenter addToListPresenter, boolean z) {
        super(1);
        this.this$0 = addToListPresenter;
        this.$isFavoriting = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C9754c) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C9754c cVar) {
        C19383o.m32797g(cVar, "event");
        if (cVar instanceof C9754c.C9756b) {
            AddToListPresenter addToListPresenter = this.this$0;
            addToListPresenter.f21560j = ((C9754c.C9756b) cVar).f21589b;
            if (this.$isFavoriting) {
                addToListPresenter.mo32709a();
            }
        } else if (cVar instanceof C9754c.C9755a) {
            C9754c.C9755a aVar = (C9754c.C9755a) cVar;
            if (aVar.f21587b.isEmpty()) {
                this.this$0.f21560j = EmptySet.INSTANCE;
            } else {
                this.this$0.f21560j = aVar.f21587b;
            }
        } else if (cVar instanceof C9754c.C9757c) {
            Fragment parentFragment = this.this$0.f21551a.getParentFragment();
            AddToListContainerFragment addToListContainerFragment = parentFragment instanceof AddToListContainerFragment ? (AddToListContainerFragment) parentFragment : null;
            if (addToListContainerFragment != null) {
                addToListContainerFragment.nameAList();
            }
        }
    }
}
