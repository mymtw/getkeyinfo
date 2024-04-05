package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class FormattedMoneyJsonAdapter extends JsonAdapter<FormattedMoney> {
    public static final int $stable = 8;
    private volatile Constructor<FormattedMoney> constructorRef;
    private final JsonAdapter<List<Money>> nullableListOfMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.FORMAT, ResponseConstants.ARGUMENTS);

    public FormattedMoneyJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, ResponseConstants.FORMAT);
        this.nullableListOfMoneyAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Money.class), emptySet, ResponseConstants.ARGUMENTS);
    }

    public String toString() {
        return "GeneratedJsonAdapter(FormattedMoney)";
    }

    public FormattedMoney fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                list = this.nullableListOfMoneyAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new FormattedMoney(str, list);
        }
        Constructor<FormattedMoney> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FormattedMoney.class.getDeclaredConstructor(new Class[]{String.class, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "FormattedMoney::class.ja…his.constructorRef = it }");
        }
        FormattedMoney newInstance = constructor.newInstance(new Object[]{str, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, FormattedMoney formattedMoney) {
        C19383o.m32797g(wVar, "writer");
        if (formattedMoney != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.nullableStringAdapter.toJson(wVar, formattedMoney.getFormat());
            wVar.mo68529h(ResponseConstants.ARGUMENTS);
            this.nullableListOfMoneyAdapter.toJson(wVar, formattedMoney.getArguments());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
