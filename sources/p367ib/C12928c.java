package p367ib;

import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20179b;
import p771sr.C20196s;
import retrofit2.C20145v;

/* renamed from: ib.c */
public interface C12928c {
    @C20179b("/etsyapps/v3/bespoke/member/carts/saved-for-later/{cart_id}/to-favorites")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo45701a(@C20196s("cart_id") String str);

    @C20179b("/etsyapps/v3/bespoke/member/carts/saved-for-later/{cart_id}")
    /* renamed from: b */
    C8071s<C20145v<C19928a0>> mo45702b(@C20196s("cart_id") String str);

    @C20179b("/etsyapps/v3/bespoke/member/carts/saved-for-later/{cart_id}/to-cart")
    /* renamed from: c */
    C8071s<C20145v<C19928a0>> mo45703c(@C20196s("cart_id") String str);
}
