package com.etsy.android.vespa.viewholders;

import android.view.ViewGroup;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.uikit.view.EmptyMessageView;
import p415of.C13171a;

/* renamed from: com.etsy.android.vespa.viewholders.z */
public final class C12114z extends C12086e<MessageCard> {

    /* renamed from: c */
    public C13171a f27015c;

    /* renamed from: d */
    public final EmptyMessageView f27016d = ((EmptyMessageView) this.itemView);

    public C12114z(ViewGroup viewGroup, C13171a aVar) {
        super(new EmptyMessageView(viewGroup.getContext()));
        this.f27015c = aVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        MessageCard messageCard = (MessageCard) obj;
        this.f27016d.bind(messageCard);
        if (!messageCard.getDeepLinkUrl().isEmpty()) {
            this.f27016d.setButtonClickListener(new C12113y(this, messageCard));
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f27016d.recycle();
    }
}
