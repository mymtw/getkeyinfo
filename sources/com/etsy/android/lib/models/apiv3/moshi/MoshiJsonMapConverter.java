package com.etsy.android.lib.models.apiv3.moshi;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20016y;

public final class MoshiJsonMapConverter {
    public static final int $stable = 8;
    private final C20002r applicationJson = C20002r.C20003a.m34243a("application/json");
    private final JsonAdapter<Map<String, Object>> jsonAdapter;

    public MoshiJsonMapConverter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C20002r.f44260f.getClass();
        this.jsonAdapter = yVar.mo68557b(C17387a0.m29126d(Map.class, String.class, Object.class));
    }

    public final C20016y toJsonBody(Map<String, ? extends Object> map) {
        C19383o.m32797g(map, "fields");
        C20016y.C20017a aVar = C20016y.f44360a;
        String json = this.jsonAdapter.toJson(map);
        C19383o.m32796f(json, "jsonAdapter.toJson(fields)");
        C20002r rVar = this.applicationJson;
        aVar.getClass();
        return C20016y.C20017a.m34281b(json, rVar);
    }
}
