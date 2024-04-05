package com.etsy.android.p327ui.favorites.add;

import com.etsy.android.lib.models.apiv3.CheckableListingCollection;
import com.etsy.android.p327ui.favorites.add.C9754c;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.add.AddToListAdapter$onCreateViewHolder$2 */
public final class AddToListAdapter$onCreateViewHolder$2 extends Lambda implements C19857l<CheckableListingCollection, C19394m> {
    public final /* synthetic */ AddToListAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToListAdapter$onCreateViewHolder$2(AddToListAdapter addToListAdapter) {
        super(1);
        this.this$0 = addToListAdapter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CheckableListingCollection) obj);
        return C19394m.f43287a;
    }

    public final void invoke(CheckableListingCollection checkableListingCollection) {
        C19383o.m32797g(checkableListingCollection, "item");
        if (checkableListingCollection.getIsChecked()) {
            AddToListAdapter addToListAdapter = this.this$0;
            C9759d dVar = addToListAdapter.f21546f;
            dVar.f21595a.invoke(new C9754c.C9756b(checkableListingCollection, C19327t.m32664t1(addToListAdapter.f21545e)));
            return;
        }
        AddToListAdapter addToListAdapter2 = this.this$0;
        C9759d dVar2 = addToListAdapter2.f21546f;
        dVar2.f21595a.invoke(new C9754c.C9755a(checkableListingCollection, C19327t.m32664t1(addToListAdapter2.f21545e)));
    }
}
