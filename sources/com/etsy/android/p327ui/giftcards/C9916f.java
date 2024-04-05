package com.etsy.android.p327ui.giftcards;

import com.etsy.android.lib.models.GiftCardAmountValues;
import com.etsy.android.lib.models.GiftCardDesign;
import java.util.List;
import p248tp.C8048a;
import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20183f;
import p771sr.C20186i;
import p771sr.C20192o;
import p771sr.C20196s;

/* renamed from: com.etsy.android.ui.giftcards.f */
public interface C9916f {
    @C20183f("/etsyapps/v3/public/giftcards/designs")
    /* renamed from: a */
    C8071s<List<GiftCardDesign>> mo33065a();

    @C20192o("/etsyapps/v3/bespoke/public/guests/{guestId}/carts/giftcards")
    /* renamed from: b */
    C8048a mo33066b(@C20196s("guestId") String str, @C20178a GiftCardRequest giftCardRequest);

    @C20183f("/etsyapps/v3/public/types/enum/giftcard-amount")
    /* renamed from: c */
    C8071s<GiftCardAmountValues> mo33067c(@C20186i("X-Detected-Locale") String str);

    @C20192o("/etsyapps/v3/bespoke/member/carts/giftcards/add-to-cart")
    /* renamed from: d */
    C8048a mo33068d(@C20178a GiftCardRequest giftCardRequest);
}
