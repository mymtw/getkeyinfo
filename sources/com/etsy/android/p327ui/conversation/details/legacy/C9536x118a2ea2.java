package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.lib.models.ListingPartial;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p354gc.C12775i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$linkCardBoundListener$1$onLinkCardBound$2 */
public final class C9536x118a2ea2 extends Lambda implements C19857l<List<? extends ListingPartial>, C19394m> {
    public final /* synthetic */ int $adapterPosition;
    public final /* synthetic */ C12775i $linkCard;
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9536x118a2ea2(C12775i iVar, LegacyConversationDetailsPresenter legacyConversationDetailsPresenter, int i) {
        super(1);
        this.$linkCard = iVar;
        this.this$0 = legacyConversationDetailsPresenter;
        this.$adapterPosition = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<ListingPartial>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<ListingPartial> list) {
        String str;
        C19383o.m32796f(list, "listingCards");
        if (!list.isEmpty()) {
            ListingPartial listingPartial = list.get(0);
            C12775i iVar = this.$linkCard;
            String title = listingPartial.getTitle();
            iVar.getClass();
            C19383o.m32797g(title, "<set-?>");
            iVar.f28229b = title;
            C12775i iVar2 = this.$linkCard;
            if (listingPartial.getLegacyPrice() == null) {
                str = "";
            } else {
                str = this.this$0.f21126h.mo21248a(listingPartial.getLegacyPrice(), listingPartial.getLegacyCurrencyCode()).format();
            }
            iVar2.getClass();
            C19383o.m32797g(str, "<set-?>");
            iVar2.f28230c = str;
            C12775i iVar3 = this.$linkCard;
            String imageUrl170 = listingPartial.getImageUrl170();
            iVar3.getClass();
            C19383o.m32797g(imageUrl170, "<set-?>");
            iVar3.f28231d = imageUrl170;
            this.this$0.f21120b.notifyItemChanged(this.$adapterPosition);
        }
    }
}
