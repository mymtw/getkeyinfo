package com.etsy.android.p327ui.favorites.add;

import android.widget.TextView;
import androidx.compose.animation.C0472h;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListPresenter$attach$2 */
final class AddToListPresenter$attach$2 extends Lambda implements C19857l<Throwable, C19394m> {
    public final /* synthetic */ AddToListPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToListPresenter$attach$2(AddToListPresenter addToListPresenter) {
        super(1);
        this.this$0 = addToListPresenter;
    }

    public final void invoke(Throwable th) {
        C0472h.m1248k(th, "it", th);
        ViewExtensions.m12860d((RecyclerView) this.this$0.f21551a._$_findCachedViewById(R.id.add_to_list_recyclerview));
        ViewExtensions.m12869m((TextView) this.this$0.f21551a._$_findCachedViewById(R.id.add_to_list_error));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C19394m.f43287a;
    }
}
