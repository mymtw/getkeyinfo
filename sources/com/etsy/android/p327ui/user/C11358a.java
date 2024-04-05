package com.etsy.android.p327ui.user;

import java.util.Map;
import p248tp.C8071s;
import p771sr.C20181d;
import p771sr.C20182e;
import p771sr.C20186i;
import p771sr.C20192o;
import p771sr.C20196s;

/* renamed from: com.etsy.android.ui.user.a */
public interface C11358a {
    @C20192o("/etsyapps/v3/bespoke/public/guests/{guest_id}/carts")
    @C20182e
    /* renamed from: a */
    C8071s<AddToCartResponse> mo37126a(@C20196s("guest_id") String str, @C20186i("X-Page-GUID") String str2, @C20181d Map<String, String> map);

    @C20192o("/etsyapps/v3/bespoke/member/users/carts")
    @C20182e
    /* renamed from: b */
    C8071s<AddToCartResponse> mo37127b(@C20186i("X-Page-GUID") String str, @C20181d Map<String, String> map);
}
