package p425q9;

import com.etsy.android.R;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import p447t9.C13384a;

@Deprecated
/* renamed from: q9.f */
public class C13254f<Result> extends C13384a {

    /* renamed from: c */
    public int f29113c;

    /* renamed from: d */
    public String f29114d;

    /* renamed from: e */
    public boolean f29115e;

    /* renamed from: f */
    public final ArrayList f29116f;

    /* renamed from: g */
    public Class<Result> f29117g;

    public C13254f() {
        throw null;
    }

    public C13254f(Exception exc) {
        super(exc);
        this.f29116f = new ArrayList(0);
        new ArrayList(0);
        this.f29117g = null;
        C13255g gVar = this.f29314b;
        this.f29113c = gVar != null ? gVar.f29119b : -1;
        try {
            this.f29114d = EtsyApplication.get().getString(R.string.loading_problem);
        } catch (IllegalStateException unused) {
            this.f29114d = "Uh oh, there was a problem";
        }
        mo45946f();
    }

    /* renamed from: f */
    public void mo45946f() {
        boolean z = false;
        this.f29115e = false;
        C8694h hVar = C8694h.f19097a;
        hVar.mo21309d("Network error : parseError", this.f29313a);
        hVar.mo21306a(toString());
        if (this.f29314b == null) {
            Exception exc = this.f29313a;
            if (exc != null) {
                this.f29114d = exc.getMessage();
            }
        } else if (mo46068a() != null) {
            C13255g gVar = this.f29314b;
            if (!(gVar == null || gVar.f29120c == null)) {
                z = true;
            }
            if (z) {
                try {
                    this.f29114d = new String(mo46068a(), mo46072e());
                } catch (UnsupportedEncodingException e) {
                    C8694h.f19097a.mo21309d("parseError UnsupportedEncodingException parsing error response", e);
                }
            } else {
                this.f29114d = new String(mo46068a(), Charset.forName("UTF-8"));
            }
            C8694h.f19097a.mo21306a(this.f29114d);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0078 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45947g(java.lang.Class<Result> r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x0144
            java.lang.Class<com.etsy.android.lib.models.BaseModel> r0 = com.etsy.android.lib.models.BaseModel.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L_0x000c
            goto L_0x0144
        L_0x000c:
            java.lang.annotation.Annotation[] r0 = r10.getAnnotations()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x0013:
            r4 = 1
            if (r3 >= r1) goto L_0x0021
            r5 = r0[r3]
            boolean r5 = r5 instanceof com.squareup.moshi.C17403o
            if (r5 == 0) goto L_0x001e
            r0 = r4
            goto L_0x0022
        L_0x001e:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0021:
            r0 = r2
        L_0x0022:
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "Moshi model parsed as null in parseResponseData()"
            java.lang.String r1 = "NullPointerException trying to parse moshi model in parseResponseData()"
            java.lang.String r3 = "IOException trying to parse moshi model in parseResponseData()"
            com.etsy.android.lib.core.EtsyApplication r5 = com.etsy.android.lib.core.EtsyApplication.get()
            com.squareup.moshi.y r5 = r5.getMoshi()
            com.squareup.moshi.JsonAdapter r6 = r5.mo68556a(r10)     // Catch:{ JsonDataException -> 0x00ca }
            lr.f r7 = new lr.f     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r7.<init>()     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            byte[] r8 = r9.mo46068a()     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r7.write((byte[]) r8)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            java.lang.Object r6 = r6.fromJson((p756lr.C19897i) r7)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            if (r6 == 0) goto L_0x004f
            java.util.ArrayList r0 = r9.f29116f     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r0.add(r6)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            goto L_0x0147
        L_0x004f:
            com.etsy.android.lib.logger.h r6 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r7.<init>()     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r7.append(r0)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r7.append(r10)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r6.mo21306a(r7)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r6.<init>()     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r6.append(r0)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r6.append(r10)     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            java.lang.String r0 = r6.toString()     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r9.f29115e = r2     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            r9.f29114d = r0     // Catch:{ IOException -> 0x00a1, NullPointerException -> 0x0078 }
            goto L_0x0147
        L_0x0078:
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ JsonDataException -> 0x00ca }
            r6.<init>()     // Catch:{ JsonDataException -> 0x00ca }
            r6.append(r1)     // Catch:{ JsonDataException -> 0x00ca }
            r6.append(r10)     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.String r6 = r6.toString()     // Catch:{ JsonDataException -> 0x00ca }
            r0.mo21306a(r6)     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JsonDataException -> 0x00ca }
            r0.<init>()     // Catch:{ JsonDataException -> 0x00ca }
            r0.append(r1)     // Catch:{ JsonDataException -> 0x00ca }
            r0.append(r10)     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.String r0 = r0.toString()     // Catch:{ JsonDataException -> 0x00ca }
            r9.f29115e = r2     // Catch:{ JsonDataException -> 0x00ca }
            r9.f29114d = r0     // Catch:{ JsonDataException -> 0x00ca }
            goto L_0x0147
        L_0x00a1:
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JsonDataException -> 0x00ca }
            r1.<init>()     // Catch:{ JsonDataException -> 0x00ca }
            r1.append(r3)     // Catch:{ JsonDataException -> 0x00ca }
            r1.append(r10)     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.String r1 = r1.toString()     // Catch:{ JsonDataException -> 0x00ca }
            r0.mo21306a(r1)     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JsonDataException -> 0x00ca }
            r0.<init>()     // Catch:{ JsonDataException -> 0x00ca }
            r0.append(r3)     // Catch:{ JsonDataException -> 0x00ca }
            r0.append(r10)     // Catch:{ JsonDataException -> 0x00ca }
            java.lang.String r0 = r0.toString()     // Catch:{ JsonDataException -> 0x00ca }
            r9.f29115e = r2     // Catch:{ JsonDataException -> 0x00ca }
            r9.f29114d = r0     // Catch:{ JsonDataException -> 0x00ca }
            goto L_0x0147
        L_0x00ca:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "Expected BEGIN_OBJECT but was BEGIN_ARRAY at path $"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0147
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r4]
            r1[r2] = r10
            lp.a$b r0 = com.squareup.moshi.C17387a0.m29126d(r0, r1)
            lr.f r1 = new lr.f
            r1.<init>()
            byte[] r4 = r9.mo46068a()
            r1.write((byte[]) r4)
            com.squareup.moshi.JsonAdapter r0 = r5.mo68557b(r0)     // Catch:{ IOException -> 0x0102 }
            java.lang.Object r0 = r0.fromJson((p756lr.C19897i) r1)     // Catch:{ IOException -> 0x0102 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ IOException -> 0x0102 }
            java.util.ArrayList r1 = r9.f29116f     // Catch:{ IOException -> 0x0102 }
            r1.addAll(r0)     // Catch:{ IOException -> 0x0102 }
            java.util.ArrayList r0 = r9.f29116f     // Catch:{ IOException -> 0x0102 }
            r0.size()     // Catch:{ IOException -> 0x0102 }
            goto L_0x0147
        L_0x0102:
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.mo21306a(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.f29115e = r2
            r9.f29114d = r10
            goto L_0x0147
        L_0x012a:
            r9.mo45952l(r10)
            com.etsy.android.lib.logger.h r0 = com.etsy.android.lib.logger.C8694h.f19097a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown model parse type in parseResponseData(), falling back to jackson parser. type is:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.mo21313g(r10)
            goto L_0x0147
        L_0x0144:
            r9.mo45952l(r10)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p425q9.C13254f.mo45947g(java.lang.Class):void");
    }

    /* renamed from: h */
    public void mo45948h() throws NumberFormatException {
        C13255g gVar = this.f29314b;
        boolean z = true;
        if (!((gVar == null || gVar.f29120c == null) ? false : true) && BuildTarget.getAudience().isInternal()) {
            C8694h.f19097a.mo21306a("NULL HEADERS IN v2");
        } else if (BuildTarget.getAudience().isInternal()) {
            C13255g gVar2 = this.f29314b;
            if (gVar2 == null || gVar2.f29120c == null) {
                z = false;
            }
            if (z) {
                for (Map.Entry entry : gVar2.f29120c.entrySet()) {
                    C8694h hVar = C8694h.f19097a;
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    hVar.mo21308c();
                }
            }
        }
    }

    /* renamed from: i */
    public void mo45949i(JsonParser jsonParser, Class<Result> cls) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (ResponseConstants.COUNT.equals(currentName)) {
                jsonParser.getValueAsInt();
            } else if (ResponseConstants.CODE.equals(currentName)) {
                this.f29113c = jsonParser.getValueAsInt();
                this.f29115e = mo46071d();
            } else if ("error".equals(currentName)) {
                String valueAsString = jsonParser.getValueAsString();
                this.f29115e = false;
                this.f29114d = valueAsString;
            } else if (ResponseConstants.RESULTS.equals(currentName)) {
                mo45950j(jsonParser, cls);
                this.f29116f.size();
            } else {
                jsonParser.skipChildren();
            }
        }
    }

    /* renamed from: j */
    public final void mo45950j(JsonParser jsonParser, Class<Result> cls) throws IOException {
        if (cls == null) {
            C8694h.f19097a.mo21313g("NO RESPONSE TYPE! - Skipping parseResponseResults");
        }
        if (jsonParser.getCurrentToken() == JsonToken.START_ARRAY) {
            while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT || jsonParser.getCurrentToken() == JsonToken.VALUE_NUMBER_INT) {
                    mo45951k(jsonParser, cls);
                } else if (jsonParser.getCurrentToken() == null) {
                    return;
                }
            }
        } else if (jsonParser.getCurrentToken() == JsonToken.START_OBJECT) {
            C8694h hVar = C8694h.f19097a;
            hVar.mo21313g("Json results were not array parsing as a single model " + cls);
            mo45951k(jsonParser, cls);
        } else {
            C8694h.f19097a.mo21313g("Received response with no start object. Skipping.");
            jsonParser.skipChildren();
        }
    }

    /* renamed from: k */
    public final void mo45951k(JsonParser jsonParser, Class<Result> cls) throws IOException {
        if (cls == null) {
            C8694h.f19097a.mo21306a("parseResultModel skipping - no result type");
            return;
        }
        Result create = ModelFactory.create(jsonParser, cls);
        if (create != null) {
            this.f29116f.add(create);
            return;
        }
        C8694h hVar = C8694h.f19097a;
        hVar.mo21306a("Debug Warning: ModelFactory could not create BaseModel. Return type was " + cls);
    }

    /* renamed from: l */
    public final void mo45952l(Class<Result> cls) {
        JsonParser jsonParser = null;
        try {
            jsonParser = C13258i.f29122d.mo45955a(mo46068a());
            jsonParser.nextToken();
            mo45949i(jsonParser, cls);
            if (!jsonParser.isClosed()) {
                try {
                    jsonParser.close();
                } catch (IOException e) {
                    C8694h.f19097a.mo21309d("couldn't close JsonParser - ignoring", e);
                }
            }
        } catch (IOException e2) {
            C8694h.f19097a.mo21309d("parseResponseData NEW error", e2);
            if (jsonParser != null && !jsonParser.isClosed()) {
                jsonParser.close();
            }
        } catch (Throwable th) {
            if (jsonParser != null && !jsonParser.isClosed()) {
                try {
                    jsonParser.close();
                } catch (IOException e3) {
                    C8694h.f19097a.mo21309d("couldn't close JsonParser - ignoring", e3);
                }
            }
            throw th;
        }
    }

    public C13254f(C13255g gVar, Class<Result> cls) {
        super(gVar);
        this.f29116f = new ArrayList(0);
        new ArrayList(0);
        this.f29117g = cls;
        C13255g gVar2 = this.f29314b;
        this.f29113c = gVar2 != null ? gVar2.f29119b : -1;
        try {
            this.f29114d = EtsyApplication.get().getString(R.string.loading_problem);
        } catch (IllegalStateException unused) {
            this.f29114d = "Uh oh, there was a problem";
        }
        if (!mo46071d()) {
            mo45946f();
        } else if ("application/json".equalsIgnoreCase(mo46069b("Content-Type"))) {
            try {
                this.f29115e = mo46071d();
                C8694h hVar = C8694h.f19097a;
                C13255g gVar3 = this.f29314b;
                hVar.mo21308c();
                mo45948h();
                mo45947g(this.f29117g);
            } catch (NullPointerException | OutOfMemoryError e) {
                C8694h.f19097a.mo21309d(EventsNameKt.GENERIC_ERROR_MESSAGE, e);
            } catch (NumberFormatException e2) {
                C8694h.f19097a.mo21309d("Error parsing total count header", e2);
            }
        } else {
            int i = this.f29113c;
            if (i == 204 || i == 205) {
                this.f29115e = true;
                C8694h.f19097a.mo21308c();
            }
        }
    }
}
