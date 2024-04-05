package com.etsy.android.p327ui.user.addresses.viewholders;

import android.content.Context;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.addresses.PostalCodeSuggestion;
import com.etsy.android.stylekit.views.CollageSelectAdapter;
import com.etsy.android.stylekit.views.CollageTypeAhead;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.AddressTypeAheadViewHolder$bind$1$onTextChanged$1 */
public final class AddressTypeAheadViewHolder$bind$1$onTextChanged$1 extends Lambda implements C19857l<List<? extends PostalCodeSuggestion>, C19394m> {
    public final /* synthetic */ CollageTypeAhead $itemView;
    public final /* synthetic */ C11459f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressTypeAheadViewHolder$bind$1$onTextChanged$1(CollageTypeAhead collageTypeAhead, C11459f fVar) {
        super(1);
        this.$itemView = collageTypeAhead;
        this.this$0 = fVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<PostalCodeSuggestion>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<PostalCodeSuggestion> list) {
        C19383o.m32797g(list, ResponseConstants.SUGGESTIONS);
        Context context = this.$itemView.getContext();
        C19383o.m32796f(context, "itemView.context");
        CollageSelectAdapter collageSelectAdapter = new CollageSelectAdapter(context, 0, 2, (DefaultConstructorMarker) null);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (PostalCodeSuggestion postalCodeSuggestion : list) {
            arrayList.add(postalCodeSuggestion.f25101c + ", " + postalCodeSuggestion.f25099a + ", " + postalCodeSuggestion.f25100b + ' ');
        }
        collageSelectAdapter.addAll(arrayList);
        this.$itemView.setCustomAdapter(collageSelectAdapter);
        this.$itemView.showDropdown();
        this.$itemView.setOnItemClickListener(new C11458e(list, this.this$0));
    }
}
