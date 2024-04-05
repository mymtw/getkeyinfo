package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class MoneyJsonAdapter extends JsonAdapter<Money> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.AMOUNT, ResponseConstants.CURRENCY_CODE, ResponseConstants.CURRENCY_FORMATTED_LONG, ResponseConstants.CURRENCY_FORMATTED_RAW, ResponseConstants.CURRENCY_FORMATTED_SHORT, ResponseConstants.DIVISOR);

    public MoneyJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "_amount");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, ResponseConstants.DIVISOR);
    }

    public String toString() {
        return "GeneratedJsonAdapter(Money)";
    }

    public Money fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num != null) {
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.DIVISOR, ResponseConstants.DIVISOR, jsonReader);
                    }
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            return new Money(str, str2, str3, str4, str5, num.intValue());
        }
        throw C18215a.m30728g(ResponseConstants.DIVISOR, ResponseConstants.DIVISOR, jsonReader);
    }

    public void toJson(C17412w wVar, Money money) {
        C19383o.m32797g(wVar, "writer");
        if (money != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.AMOUNT);
            this.nullableStringAdapter.toJson(wVar, money.get_amount());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, money.getCurrencyCode());
            wVar.mo68529h(ResponseConstants.CURRENCY_FORMATTED_LONG);
            this.nullableStringAdapter.toJson(wVar, money.getCurrencyFormattedLong());
            wVar.mo68529h(ResponseConstants.CURRENCY_FORMATTED_RAW);
            this.nullableStringAdapter.toJson(wVar, money.getCurrencyFormattedRaw());
            wVar.mo68529h(ResponseConstants.CURRENCY_FORMATTED_SHORT);
            this.nullableStringAdapter.toJson(wVar, money.getCurrencyFormattedShort());
            wVar.mo68529h(ResponseConstants.DIVISOR);
            this.intAdapter.toJson(wVar, Integer.valueOf(money.getDivisor()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
