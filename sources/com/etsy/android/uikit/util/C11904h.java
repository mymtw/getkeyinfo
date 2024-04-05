package com.etsy.android.uikit.util;

import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20179b;
import p771sr.C20192o;
import p771sr.C20196s;
import p771sr.C20197t;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.uikit.util.h */
public interface C11904h {
    @C20179b("/etsyapps/v3/bespoke/member/users/circles/unconnect/{to_user}")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo38466a(@C20196s("to_user") String str, @C20197t("includes") String str2, @C20197t("fields") String str3);

    @C20192o("/etsyapps/v3/bespoke/member/users/circles/connect/{to_user}")
    /* renamed from: b */
    C8071s<C20145v<C19928a0>> mo38467b(@C20196s("to_user") String str, @C20197t("includes") String str2, @C20197t("fields") String str3);
}
