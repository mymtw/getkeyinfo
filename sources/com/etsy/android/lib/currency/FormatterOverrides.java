package com.etsy.android.lib.currency;

import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8694h;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p340ea.C12673n;
import p486y9.C13886b;
import p486y9.C13887c;
import p753kq.C19857l;

public final class FormatterOverrides {

    /* renamed from: a */
    public final C8694h f18962a;

    /* renamed from: b */
    public HashMap<Locale, Map<Currency, NumberFormat>> f18963b = new HashMap<>();

    public FormatterOverrides(C8694h hVar, C13886b bVar, final C12673n nVar) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(bVar, "configUpdates");
        this.f18962a = hVar;
        mo21242a("{\n   \"en_NZ\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_ES\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"it_IT\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_AU\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_CA\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\",\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HK\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_MX\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"MXN\":\"MX$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_SG\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_DE\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"ja_JP\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_GB\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"AUD\":\"AU$\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_US\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HU\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_IN\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_US\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_CA\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_FR\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"pl_PL\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"PLN\":\"z\\u0142\",\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   }\n}");
        SubscribersKt.m32501f(bVar.mo46713a(), new C19857l<Throwable, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C19394m.f43287a;
            }

            public final void invoke(Throwable th) {
                C19383o.m32797g(th, "e");
                C12673n nVar = nVar;
                if (nVar != null) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    nVar.mo45449a(message);
                }
            }
        }, new C19857l<C13887c, C19394m>(this) {
            public final /* synthetic */ FormatterOverrides this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke(C13887c cVar) {
                C19383o.m32797g(cVar, "event");
                String f = cVar.f30553a.f18706f.mo21136f(C8592b.f18809m);
                if (f == null) {
                    f = "{\n   \"en_NZ\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_ES\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"it_IT\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_AU\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_CA\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\",\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HK\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_MX\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"MXN\":\"MX$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_SG\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_DE\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"ja_JP\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_GB\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"AUD\":\"AU$\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_US\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HU\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_IN\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_US\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_CA\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_FR\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"pl_PL\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"PLN\":\"z\\u0142\",\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   }\n}";
                }
                this.this$0.mo21242a(f);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C13887c) obj);
                return C19394m.f43287a;
            }
        }, 2);
    }

    /* renamed from: a */
    public final void mo21242a(String str) {
        HashMap<Locale, Map<Currency, NumberFormat>> hashMap;
        if (C19457k.m33020X0(str)) {
            mo21243b("{\n   \"en_NZ\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_ES\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"it_IT\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_AU\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_CA\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\",\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HK\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"es_MX\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"MXN\":\"MX$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_SG\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_DE\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"ja_JP\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_GB\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"AUD\":\"AU$\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"de_US\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\".\",\n      \"d\":\",\",\n      \"c\":{\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"en_HU\":{\n      \"p\":\"\\u00a4#,##0\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4#,##0\"\n   },\n   \"en_IN\":{\n      \"p\":\"\\u00a4 #,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-\\u00a4 #,##0.00\"\n   },\n   \"en_US\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\",\n         \"USD\":\"$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"en_CA\":{\n      \"p\":\"\\u00a4#,##0.00\",\n      \"g\":\",\",\n      \"d\":\".\",\n      \"c\":{\n         \"CAD\":\"CA$\"\n      },\n      \"n\":\"-\\u00a4#,##0.00\"\n   },\n   \"fr_FR\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   },\n   \"pl_PL\":{\n      \"p\":\"#,##0.00 \\u00a4\",\n      \"g\":\"\\u00a0\",\n      \"d\":\",\",\n      \"c\":{\n         \"PLN\":\"z\\u0142\",\n         \"EUR\":\"\\u20ac\",\n         \"USD\":\"US$\"\n      },\n      \"n\":\"-#,##0.00 \\u00a4\"\n   }\n}");
            return;
        }
        try {
            hashMap = mo21243b(str);
        } catch (IOException e) {
            this.f18962a.mo21309d("bad json. couldn't parse", e);
            hashMap = new HashMap<>();
        }
        this.f18963b = hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0024 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap<java.util.Locale, java.util.Map<java.util.Currency, java.text.NumberFormat>> mo21243b(java.lang.String r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            q9.i r0 = p425q9.C13258i.f29122d     // Catch:{ NullPointerException -> 0x0185 }
            com.fasterxml.jackson.databind.ObjectMapper r0 = r0.f29123a     // Catch:{ NullPointerException -> 0x0185 }
            r3 = r19
            com.fasterxml.jackson.databind.JsonNode r3 = r0.readTree((java.lang.String) r3)     // Catch:{ NullPointerException -> 0x0185 }
            if (r3 != 0) goto L_0x0020
            com.etsy.android.lib.logger.h r0 = r1.f18962a
            java.lang.String r2 = "null bigJSONObject parsing JSON"
            r0.mo21306a(r2)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        L_0x0020:
            java.util.Iterator r4 = r3.fieldNames()
        L_0x0024:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0184
            java.lang.Object r0 = r4.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "languageTag"
            kotlin.jvm.internal.C19383o.m32796f(r5, r0)     // Catch:{ Exception -> 0x0167 }
            java.util.Locale r0 = p486y9.C13889e.m21414a(r5)     // Catch:{ Exception -> 0x0167 }
            com.fasterxml.jackson.databind.JsonNode r6 = r3.get((java.lang.String) r5)
            if (r6 != 0) goto L_0x0041
            goto L_0x0024
        L_0x0041:
            java.lang.String r7 = "p"
            boolean r8 = r6.hasNonNull((java.lang.String) r7)
            r9 = 0
            if (r8 == 0) goto L_0x0053
            com.fasterxml.jackson.databind.JsonNode r7 = r6.get((java.lang.String) r7)
            java.lang.String r7 = r7.asText()
            goto L_0x0054
        L_0x0053:
            r7 = r9
        L_0x0054:
            java.lang.String r8 = "g"
            boolean r10 = r6.hasNonNull((java.lang.String) r8)
            r11 = 0
            java.lang.String r12 = "this as java.lang.String).toCharArray()"
            if (r10 == 0) goto L_0x007b
            com.fasterxml.jackson.databind.JsonNode r8 = r6.get((java.lang.String) r8)
            java.lang.String r8 = r8.asText()
            int r10 = r8.length()
            if (r10 <= 0) goto L_0x007b
            char[] r8 = r8.toCharArray()
            kotlin.jvm.internal.C19383o.m32796f(r8, r12)
            char r8 = r8[r11]
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            goto L_0x007c
        L_0x007b:
            r8 = r9
        L_0x007c:
            java.lang.String r10 = "d"
            boolean r13 = r6.hasNonNull((java.lang.String) r10)
            if (r13 == 0) goto L_0x009f
            com.fasterxml.jackson.databind.JsonNode r10 = r6.get((java.lang.String) r10)
            java.lang.String r10 = r10.asText()
            int r13 = r10.length()
            if (r13 <= 0) goto L_0x009f
            char[] r9 = r10.toCharArray()
            kotlin.jvm.internal.C19383o.m32796f(r9, r12)
            char r9 = r9[r11]
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
        L_0x009f:
            java.lang.String r10 = "c"
            boolean r11 = r6.hasNonNull((java.lang.String) r10)
            if (r11 == 0) goto L_0x0024
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.text.DecimalFormatSymbols r12 = new java.text.DecimalFormatSymbols
            r12.<init>(r0)
            java.lang.String r13 = "uninitialized currency code"
            com.fasterxml.jackson.databind.JsonNode r14 = r6.get((java.lang.String) r10)     // Catch:{ IllegalArgumentException -> 0x0130 }
            java.util.Iterator r14 = r14.fieldNames()     // Catch:{ IllegalArgumentException -> 0x0130 }
        L_0x00bb:
            boolean r15 = r14.hasNext()     // Catch:{ IllegalArgumentException -> 0x012c }
            if (r15 == 0) goto L_0x0125
            java.lang.Object r15 = r14.next()     // Catch:{ IllegalArgumentException -> 0x012c }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IllegalArgumentException -> 0x012c }
            r19 = r4
            java.util.Currency r4 = java.util.Currency.getInstance(r15)     // Catch:{ IllegalArgumentException -> 0x012c }
            r12.setCurrency(r4)     // Catch:{ IllegalArgumentException -> 0x012c }
            r16 = r13
            com.fasterxml.jackson.databind.JsonNode r13 = r6.get((java.lang.String) r10)     // Catch:{ IllegalArgumentException -> 0x012e }
            com.fasterxml.jackson.databind.JsonNode r13 = r13.get((java.lang.String) r15)     // Catch:{ IllegalArgumentException -> 0x012e }
            if (r13 == 0) goto L_0x00e3
            java.lang.String r13 = r13.asText()     // Catch:{ IllegalArgumentException -> 0x012e }
            r12.setCurrencySymbol(r13)     // Catch:{ IllegalArgumentException -> 0x012e }
        L_0x00e3:
            if (r8 == 0) goto L_0x00ec
            char r13 = r8.charValue()     // Catch:{ IllegalArgumentException -> 0x012e }
            r12.setGroupingSeparator(r13)     // Catch:{ IllegalArgumentException -> 0x012e }
        L_0x00ec:
            if (r9 == 0) goto L_0x00f5
            char r13 = r9.charValue()     // Catch:{ IllegalArgumentException -> 0x012e }
            r12.setDecimalSeparator(r13)     // Catch:{ IllegalArgumentException -> 0x012e }
        L_0x00f5:
            if (r7 == 0) goto L_0x0104
            java.lang.String r13 = "currencyCode"
            kotlin.jvm.internal.C19383o.m32796f(r15, r13)     // Catch:{ IllegalArgumentException -> 0x012e }
            java.text.DecimalFormat r13 = new java.text.DecimalFormat     // Catch:{ IllegalArgumentException -> 0x0102 }
            r13.<init>(r7, r12)     // Catch:{ IllegalArgumentException -> 0x0102 }
            goto L_0x0115
        L_0x0102:
            r13 = r15
            goto L_0x0130
        L_0x0104:
            java.text.NumberFormat r13 = java.text.NumberFormat.getCurrencyInstance(r0)     // Catch:{ IllegalArgumentException -> 0x012e }
            java.lang.String r15 = "getCurrencyInstance(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r13, r15)     // Catch:{ IllegalArgumentException -> 0x012e }
            r15 = r13
            java.text.DecimalFormat r15 = (java.text.DecimalFormat) r15     // Catch:{ IllegalArgumentException -> 0x012e }
            r15.setDecimalFormatSymbols(r12)     // Catch:{ IllegalArgumentException -> 0x012e }
            r15 = r16
        L_0x0115:
            r17 = r6
            java.lang.String r6 = "currency"
            kotlin.jvm.internal.C19383o.m32796f(r4, r6)     // Catch:{ IllegalArgumentException -> 0x0102 }
            r11.put(r4, r13)     // Catch:{ IllegalArgumentException -> 0x0102 }
            r4 = r19
            r13 = r15
            r6 = r17
            goto L_0x00bb
        L_0x0125:
            r19 = r4
            r2.put(r0, r11)
            goto L_0x0024
        L_0x012c:
            r16 = r13
        L_0x012e:
            r13 = r16
        L_0x0130:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Info pertaining to [BOE-3051] - "
            r0.<init>(r2)
            java.lang.String r2 = "languageTag: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = "\n"
            r0.append(r2)
            java.lang.String r4 = "patternOverride: "
            r0.append(r4)
            java.lang.String r4 = "currencyCode: "
            androidx.compose.animation.C0391c.m1061h(r0, r7, r2, r4, r13)
            r0.append(r2)
            java.lang.String r2 = "rawJson: "
            r0.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0167:
            r0 = move-exception
            r19 = r4
            com.etsy.android.lib.logger.h r4 = r1.f18962a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "couldn't form a Locale based on passed languageTag: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.mo21309d(r5, r0)
            r4 = r19
            goto L_0x0024
        L_0x0184:
            return r2
        L_0x0185:
            r0 = move-exception
            com.etsy.android.lib.logger.h r2 = r1.f18962a
            java.lang.String r3 = "null passed where json was expected. currency format overrides are NOT in effect"
            r2.mo21309d(r3, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.currency.FormatterOverrides.mo21243b(java.lang.String):java.util.HashMap");
    }
}
