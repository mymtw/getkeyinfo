package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.apiv3.addresses.AddressValidationError;
import com.etsy.android.lib.models.apiv3.addresses.UserAddress;
import java.util.List;
import java.util.Map;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20179b;
import p771sr.C20181d;
import p771sr.C20182e;
import p771sr.C20183f;
import p771sr.C20192o;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.user.addresses.b0 */
public interface C11391b0 {
    @C20183f("/etsyapps/v3/public/countries")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo37255a();

    @C20192o("/etsyapps/v3/member/addresses/{addressId}")
    @C20182e
    /* renamed from: b */
    C8071s<UserAddress> mo37256b(@C20196s("addressId") Long l, @C20181d Map<String, String> map);

    @C20183f("/etsyapps/v3/public/addresses/suggestions")
    /* renamed from: c */
    C8071s<List<PostalCodeSuggestion>> mo37257c(@C20197t("country_id") int i, @C20197t("postal_code") String str);

    @C20192o("/etsyapps/v3/member/addresses")
    @C20182e
    /* renamed from: d */
    C8071s<UserAddress> mo37258d(@C20181d Map<String, String> map);

    @C20179b("/etsyapps/v3/member/addresses/{addressId}")
    /* renamed from: e */
    C8071s<C20145v<C19928a0>> mo37259e(@C20196s("addressId") Long l);

    @C20192o("/etsyapps/v3/public/addresses/validate")
    @C20182e
    /* renamed from: f */
    C8071s<List<AddressValidationError>> mo37260f(@C20181d Map<String, String> map);

    @C20183f("/etsyapps/v3/member/addresses")
    /* renamed from: g */
    C8071s<List<UserAddress>> mo37261g();

    @C20183f("/etsyapps/v3/public/addresses/data")
    /* renamed from: h */
    C8071s<AddressDetailsLayoutResponse> mo37262h(@C20197t("country_id") int i);
}
