package com.etsy.android.lib.requests;

import java.util.Map;
import okhttp3.C19928a0;
import p248tp.C8071s;
import p771sr.C20181d;
import p771sr.C20182e;
import p771sr.C20183f;
import p771sr.C20188k;
import p771sr.C20192o;
import retrofit2.C20145v;

public interface LocaleEndpoint {
    @C20183f("/etsyapps/v3/bespoke/member/locale/preference")
    C8071s<C20145v<C19928a0>> getLocale();

    @C20188k({"Content-Type: application/x-www-form-urlencoded; charset=UTF-8"})
    @C20182e
    @C20192o("/etsyapps/v3/member/locale-preferences")
    C8071s<C20145v<C19928a0>> saveLocale(@C20181d Map<String, String> map);
}
