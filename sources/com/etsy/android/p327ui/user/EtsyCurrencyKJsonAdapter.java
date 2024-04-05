package com.etsy.android.p327ui.user;

import com.etsy.android.lib.currency.CurrencyCode;
import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.Currency;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.user.EtsyCurrencyKJsonAdapter */
public final class EtsyCurrencyKJsonAdapter extends JsonAdapter<EtsyCurrencyK> {
    public static final int $stable = 8;
    private final JsonAdapter<Currency> currencyAtCurrencyCodeAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CODE, "name", "number_precision");
    private final JsonAdapter<String> stringAdapter;

    /* renamed from: com.etsy.android.ui.user.EtsyCurrencyKJsonAdapter$a */
    public /* synthetic */ class C11334a implements CurrencyCode {
        public final /* synthetic */ Class annotationType() {
            return CurrencyCode.class;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CurrencyCode)) {
                return false;
            }
            CurrencyCode currencyCode = (CurrencyCode) obj;
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "@com.etsy.android.lib.currency.CurrencyCode()";
        }
    }

    public EtsyCurrencyKJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.currencyAtCurrencyCodeAdapter = yVar.mo68558c(Currency.class, C19382n.m32702C0(new C11334a()), "currency");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "name");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "numberPrecision");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Currency currency = null;
        String str = null;
        Integer num = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                currency = this.currencyAtCurrencyCodeAdapter.fromJson(jsonReader);
                if (currency == null) {
                    throw C18215a.m30734m("currency", ResponseConstants.CODE, jsonReader);
                }
            } else if (Q == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw C18215a.m30734m("name", "name", jsonReader);
                }
            } else if (Q == 2 && (num = this.intAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("numberPrecision", "number_precision", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (currency == null) {
            throw C18215a.m30728g("currency", ResponseConstants.CODE, jsonReader);
        } else if (str == null) {
            throw C18215a.m30728g("name", "name", jsonReader);
        } else if (num != null) {
            return new EtsyCurrencyK(currency, str, num.intValue());
        } else {
            throw C18215a.m30728g("numberPrecision", "number_precision", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        EtsyCurrencyK etsyCurrencyK = (EtsyCurrencyK) obj;
        C19383o.m32797g(wVar, "writer");
        if (etsyCurrencyK != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CODE);
            this.currencyAtCurrencyCodeAdapter.toJson(wVar, etsyCurrencyK.f24994b);
            wVar.mo68529h("name");
            this.stringAdapter.toJson(wVar, etsyCurrencyK.f24995c);
            wVar.mo68529h("number_precision");
            this.intAdapter.toJson(wVar, Integer.valueOf(etsyCurrencyK.f24996d));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(EtsyCurrencyK)";
    }
}
