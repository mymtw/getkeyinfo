package com.google.gson.internal.bind;

import com.google.gson.C16708i;
import com.google.gson.C16807t;
import com.google.gson.C16808u;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.C16727b;
import p675sn.C18541a;

public final class JsonAdapterAnnotationTypeAdapterFactory implements C16808u {

    /* renamed from: b */
    public final C16727b f37002b;

    public JsonAdapterAnnotationTypeAdapterFactory(C16727b bVar) {
        this.f37002b = bVar;
    }

    /* JADX WARNING: type inference failed for: r8v13, types: [com.google.gson.t] */
    /* JADX WARNING: type inference failed for: r8v14, types: [com.google.gson.t] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.C16807t m27736b(com.google.gson.internal.C16727b r8, com.google.gson.C16708i r9, p675sn.C18541a r10, com.google.gson.annotations.JsonAdapter r11) {
        /*
            java.lang.Class r0 = r11.value()
            sn.a r0 = p675sn.C18541a.get(r0)
            com.google.gson.internal.g r8 = r8.mo59573a(r0)
            java.lang.Object r8 = r8.mo1134i()
            boolean r0 = r8 instanceof com.google.gson.C16807t
            if (r0 == 0) goto L_0x0017
            com.google.gson.t r8 = (com.google.gson.C16807t) r8
            goto L_0x0071
        L_0x0017:
            boolean r0 = r8 instanceof com.google.gson.C16808u
            if (r0 == 0) goto L_0x0022
            com.google.gson.u r8 = (com.google.gson.C16808u) r8
            com.google.gson.t r8 = r8.mo59482a(r9, r10)
            goto L_0x0071
        L_0x0022:
            boolean r0 = r8 instanceof com.google.gson.C16804r
            if (r0 != 0) goto L_0x0057
            boolean r1 = r8 instanceof com.google.gson.C16799m
            if (r1 == 0) goto L_0x002b
            goto L_0x0057
        L_0x002b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r11 = android.support.p013v4.media.C0072d.m201h(r11)
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            r11.append(r8)
            java.lang.String r8 = " as a @JsonAdapter for "
            r11.append(r8)
            java.lang.String r8 = r10.toString()
            r11.append(r8)
            java.lang.String r8 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L_0x0057:
            r1 = 0
            if (r0 == 0) goto L_0x005f
            r0 = r8
            com.google.gson.r r0 = (com.google.gson.C16804r) r0
            r3 = r0
            goto L_0x0060
        L_0x005f:
            r3 = r1
        L_0x0060:
            boolean r0 = r8 instanceof com.google.gson.C16799m
            if (r0 == 0) goto L_0x0067
            r1 = r8
            com.google.gson.m r1 = (com.google.gson.C16799m) r1
        L_0x0067:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r8 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r8
            r5 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0071:
            if (r8 == 0) goto L_0x007f
            boolean r9 = r11.nullSafe()
            if (r9 == 0) goto L_0x007f
            com.google.gson.s r9 = new com.google.gson.s
            r9.<init>(r8)
            r8 = r9
        L_0x007f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.m27736b(com.google.gson.internal.b, com.google.gson.i, sn.a, com.google.gson.annotations.JsonAdapter):com.google.gson.t");
    }

    /* renamed from: a */
    public final <T> C16807t<T> mo59482a(C16708i iVar, C18541a<T> aVar) {
        JsonAdapter jsonAdapter = (JsonAdapter) aVar.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return m27736b(this.f37002b, iVar, aVar, jsonAdapter);
    }
}
