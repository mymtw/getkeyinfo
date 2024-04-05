package com.etsy.android.p327ui.home.tabs;

import java.util.Map;
import okhttp3.C19928a0;
import okhttp3.C20016y;
import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20183f;
import p771sr.C20192o;
import p771sr.C20198u;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.home.tabs.d */
public interface C10054d {
    @C20192o("/etsyapps/v3/bespoke/member/homescreen")
    /* renamed from: a */
    C8071s<C20145v<C19928a0>> mo33354a(@C20198u Map<String, String> map, @C20178a C20016y yVar);

    @C20183f("/etsyapps/v3/bespoke/member/homescreen/tabs")
    /* renamed from: b */
    C8071s<C20145v<C19928a0>> mo33355b(@C20198u Map<String, String> map);

    @C20183f("/etsyapps/v3/bespoke/member/sdl-samples-screen")
    /* renamed from: c */
    C8071s<C20145v<C19928a0>> mo33356c(@C20198u Map<String, String> map);
}
