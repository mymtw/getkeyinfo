package com.etsy.android.lib.network.oauth2;

import com.etsy.android.p327ui.user.addresses.AddressDetailsLayoutResponse;
import com.etsy.android.p327ui.user.addresses.C11463z;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p287xp.C8339g;

/* renamed from: com.etsy.android.lib.network.oauth2.d0 */
public final /* synthetic */ class C8751d0 implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f19233b;

    public /* synthetic */ C8751d0(int i) {
        this.f19233b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f19233b) {
            case 0:
                OAuth2AccessTokenPayload oAuth2AccessTokenPayload = (OAuth2AccessTokenPayload) obj;
                C19383o.m32797g(oAuth2AccessTokenPayload, "it");
                return C19382n.m32708F0(oAuth2AccessTokenPayload);
            default:
                AddressDetailsLayoutResponse addressDetailsLayoutResponse = (AddressDetailsLayoutResponse) obj;
                C19383o.m32797g(addressDetailsLayoutResponse, "it");
                return new C11463z.C11469f(addressDetailsLayoutResponse);
        }
    }
}
