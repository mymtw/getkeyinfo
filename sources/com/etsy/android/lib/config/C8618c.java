package com.etsy.android.lib.config;

import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.EtsyConfigKey;
import com.etsy.android.lib.logger.C8677e;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19452f;
import p409o9.C13122d;
import p409o9.C13125f;
import p409o9.C13132l;
import p409o9.C13134m;
import p409o9.C13137p;

/* renamed from: com.etsy.android.lib.config.c */
public class C8618c {

    /* renamed from: a */
    public EtsyConfigKey.Environment f18941a;

    /* renamed from: b */
    public boolean f18942b;

    /* renamed from: c */
    public HashMap<String, C13132l> f18943c;

    /* renamed from: d */
    public C8619a f18944d;

    /* renamed from: e */
    public boolean f18945e = BuildTarget.getAudience().isInternal();

    /* renamed from: com.etsy.android.lib.config.c$a */
    public static class C8619a {

        /* renamed from: a */
        public String f18946a;

        /* renamed from: b */
        public String f18947b;

        /* renamed from: c */
        public String f18948c;

        public C8619a(String str, String str2, String str3) {
            this.f18946a = str;
            this.f18947b = str2;
            this.f18948c = str3;
        }
    }

    public C8618c(EtsyConfigKey.Environment environment, C8619a aVar) {
        this.f18941a = environment;
        this.f18944d = aVar;
        this.f18943c = new HashMap<>(1000);
    }

    /* renamed from: a */
    public final void mo21131a(JsonNode jsonNode) throws IOException {
        if (jsonNode == null) {
            return;
        }
        if (this.f18945e) {
            C13134m mVar = new C13134m();
            Iterator<String> fieldNames = jsonNode.fieldNames();
            C19383o.m32796f(fieldNames, "jsonNode.fieldNames()");
            while (fieldNames.hasNext()) {
                String next = fieldNames.next();
                JsonNode jsonNode2 = jsonNode.get(next);
                if (jsonNode2 != null) {
                    String i = C0326j.m864i("", next);
                    if (!jsonNode2.isValueNode()) {
                        mVar.mo45847a(i, jsonNode2);
                    } else if (!C8591a.f18700r.contains(next)) {
                        mVar.mo45848b(i, jsonNode2);
                    }
                }
            }
            this.f18943c = new HashMap<>(mVar.f28884a);
            return;
        }
        mo21139i("", jsonNode);
    }

    /* renamed from: b */
    public final boolean mo21132b(EtsyConfigKey etsyConfigKey) {
        return mo21137g(etsyConfigKey).mo45840h();
    }

    /* renamed from: c */
    public C13132l mo21133c(EtsyConfigKey etsyConfigKey, String str) {
        C13132l lVar = this.f18943c.get(str);
        return lVar == null ? mo21137g(etsyConfigKey) : lVar;
    }

    /* renamed from: d */
    public final int mo21134d(C13137p pVar) {
        return mo21137g(pVar).mo45843j();
    }

    /* renamed from: e */
    public final long mo21135e(EtsyConfigKey etsyConfigKey) {
        return mo21137g(etsyConfigKey).mo45844k();
    }

    /* renamed from: f */
    public final String mo21136f(C13137p pVar) {
        return mo21137g(pVar).f28871b;
    }

    /* renamed from: g */
    public C13132l mo21137g(C13137p pVar) {
        if (this.f18941a != EtsyConfigKey.Environment.TEST) {
            LinkedHashMap linkedHashMap = C13125f.f28856a;
            if (C13125f.C13126a.m20790a().containsKey(pVar.getName())) {
                String str = (String) C13125f.C13126a.m20790a().get(pVar.getName());
                C8694h.f19097a.mo21313g(String.format("WARNING using Override Config flag value for: [ %s ] with a value of: [ %s ]", new Object[]{pVar.getName(), str}));
                return new C13132l(pVar.getName(), str);
            }
        }
        C13132l lVar = this.f18943c.get(pVar.getName());
        return lVar == null ? pVar.mo21103d(this.f18941a, this.f18942b) : lVar;
    }

    /* renamed from: h */
    public final void mo21138h() {
        this.f18942b = mo21137g(C8592b.f18782d).mo45840h();
        EtsyConfigKey.Environment environment = this.f18941a;
        C8619a aVar = this.f18944d;
        synchronized (C8592b.class) {
            if (aVar != null) {
                if (aVar.f18946a != null) {
                    EtsyConfigKey etsyConfigKey = C8592b.f18819p0;
                    EtsyConfigKey.Environment environment2 = EtsyConfigKey.Environment.DEVELOPMENT;
                    etsyConfigKey.mo21101b(environment2, "https://www." + aVar.f18946a);
                    EtsyConfigKey etsyConfigKey2 = C8592b.f18822q0;
                    etsyConfigKey2.mo21101b(environment2, "http://api." + aVar.f18946a);
                    EtsyConfigKey etsyConfigKey3 = C8592b.f18825r0;
                    etsyConfigKey3.mo21101b(environment2, "http://api." + aVar.f18946a + "/etsyapps/v3");
                    EtsyConfigKey etsyConfigKey4 = C8592b.f18828s0;
                    etsyConfigKey4.mo21101b(environment2, "http://api." + aVar.f18946a);
                    EtsyConfigKey etsyConfigKey5 = C8592b.f18831t0;
                    etsyConfigKey5.mo21101b(environment2, "ws://franz." + aVar.f18946a + ":4200/debug/ws");
                    EtsyConfigKey etsyConfigKey6 = C8592b.f18837v0;
                    etsyConfigKey6.mo21101b(environment2, "" + aVar.f18946a);
                }
                String str = aVar.f18947b;
                if (str != null) {
                    C8592b.f18744L0.mo21101b(environment, str);
                }
                String str2 = aVar.f18948c;
                if (str2 != null) {
                    C8592b.f18746M0.mo21101b(environment, str2);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo21139i(String str, JsonNode jsonNode) throws IOException {
        Iterator<String> it;
        Iterator<String> fieldNames = jsonNode.fieldNames();
        while (fieldNames.hasNext()) {
            String next = fieldNames.next();
            JsonNode jsonNode2 = jsonNode.get(next);
            if (jsonNode2 != null) {
                String i = C0326j.m864i(str, next);
                if (!jsonNode2.isValueNode()) {
                    if (jsonNode2.has(ResponseConstants.ENABLED)) {
                        JsonNode jsonNode3 = jsonNode2.get(ResponseConstants.ENABLED);
                        String asText = jsonNode3 != null ? jsonNode3.asText() : "";
                        String asText2 = jsonNode2.hasNonNull("config_hash") ? jsonNode2.get("config_hash").asText() : null;
                        if (!jsonNode2.hasNonNull("test_name") || !jsonNode2.hasNonNull("selector")) {
                            it = fieldNames;
                            this.f18943c.put(i, new C13132l(i, asText, (String) null, (String) null, (List<? extends C8677e.C8678a>) Collections.emptyList(), (C13122d) null, asText2));
                        } else {
                            String asText3 = jsonNode2.get("test_name").asText();
                            String asText4 = jsonNode2.get("selector").asText();
                            ArrayList arrayList = new ArrayList();
                            if (jsonNode2.hasNonNull("pes")) {
                                JsonNode jsonNode4 = jsonNode2.get("pes");
                                if (jsonNode4.isArray()) {
                                    Iterator<JsonNode> it2 = jsonNode4.iterator();
                                    while (it2.hasNext()) {
                                        Iterator<String> it3 = fieldNames;
                                        JsonNode next2 = it2.next();
                                        if (next2.hasNonNull("test_name") && next2.hasNonNull(ResponseConstants.ENABLED) && next2.hasNonNull("selector")) {
                                            String asText5 = next2.get("test_name").asText();
                                            arrayList.add(new C13132l(asText5, next2.get(ResponseConstants.ENABLED).asText(), asText5, next2.get("selector").asText(), (List<? extends C8677e.C8678a>) Collections.emptyList(), (C13122d) null, next2.hasNonNull("config_hash") ? next2.get("config_hash").asText() : null));
                                        }
                                        fieldNames = it3;
                                    }
                                }
                            }
                            it = fieldNames;
                            this.f18943c.put(i, new C13132l(i, asText, asText3, asText4, (List<? extends C8677e.C8678a>) arrayList, (C13122d) null, asText2));
                        }
                    } else {
                        it = fieldNames;
                    }
                    mo21139i(i + ".", jsonNode2);
                } else {
                    it = fieldNames;
                    if (!C8591a.f18700r.contains(next)) {
                        this.f18943c.put(i, new C13132l(i, jsonNode2.asText()));
                    }
                }
                fieldNames = it;
            }
        }
    }

    public final String toString() {
        double d;
        double doubleValue;
        StringBuilder sb = new StringBuilder(100);
        for (Map.Entry next : this.f18943c.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(": { String: ");
            sb.append(((C13132l) next.getValue()).f28871b);
            sb.append(", \nboolean: ");
            sb.append(((C13132l) next.getValue()).mo45840h());
            sb.append(", \nint: ");
            sb.append(((C13132l) next.getValue()).mo45843j());
            sb.append(", \nlong: ");
            sb.append(((C13132l) next.getValue()).mo45844k());
            sb.append(", \ndouble: ");
            C13132l lVar = (C13132l) next.getValue();
            Double d2 = lVar.f28880k;
            if (d2 != null) {
                d = d2.doubleValue();
            } else {
                synchronized (lVar) {
                    if (lVar.f28880k == null) {
                        String str = lVar.f28871b;
                        C19383o.m32797g(str, "<this>");
                        Double d3 = null;
                        try {
                            if (C19452f.f43389a.matches(str)) {
                                d3 = Double.valueOf(Double.parseDouble(str));
                            }
                        } catch (NumberFormatException unused) {
                        }
                        if (d3 == null) {
                            d3 = Double.valueOf(ShadowDrawableWrapper.COS_45);
                        }
                        lVar.f28880k = d3;
                    }
                    Double d4 = lVar.f28880k;
                    C19383o.m32794d(d4);
                    doubleValue = d4.doubleValue();
                }
                d = doubleValue;
            }
            sb.append(d);
            sb.append(", \nStringArray: ");
            sb.append(Arrays.toString(((C13132l) next.getValue()).mo45845l()));
            sb.append(", \nintArray: ");
            sb.append(Arrays.toString(((C13132l) next.getValue()).mo45842i()));
            sb.append("}, \n\n");
        }
        return sb.toString();
    }

    public C8618c(C8623e eVar) {
        this.f18943c = eVar.f18943c;
        this.f18941a = eVar.f18941a;
        this.f18942b = eVar.f18942b;
    }
}
