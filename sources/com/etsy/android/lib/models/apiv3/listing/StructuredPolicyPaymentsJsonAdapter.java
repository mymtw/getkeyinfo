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

public final class StructuredPolicyPaymentsJsonAdapter extends JsonAdapter<StructuredPolicyPayments> {
    public static final int $stable = 8;
    private volatile Constructor<StructuredPolicyPayments> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ACCEPTED_PAYMENT_METHODS, ResponseConstants.ACCEPTS_DIRECT_CHECKOUT, ResponseConstants.ACCEPTS_PAYPAL, ResponseConstants.MANUAL_PAYMENT_METHODS, ResponseConstants.PROTECTED_PAYMENT_METHODS);

    public StructuredPolicyPaymentsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, String.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfStringAdapter = yVar.mo68558c(d, emptySet, "acceptedPaymentMethods");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "acceptsDirectCheckout");
    }

    public String toString() {
        return "GeneratedJsonAdapter(StructuredPolicyPayments)";
    }

    public StructuredPolicyPayments fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Boolean> cls = Boolean.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list2 = null;
        List list3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                list2 = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                i &= -9;
            } else if (Q == 4) {
                list3 = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                i &= -17;
            }
        }
        jsonReader.mo68413e();
        if (i == -32) {
            return new StructuredPolicyPayments(list, bool, bool2, list2, list3);
        }
        Constructor<StructuredPolicyPayments> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = StructuredPolicyPayments.class.getDeclaredConstructor(new Class[]{List.class, cls, cls, List.class, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "StructuredPolicyPayments…his.constructorRef = it }");
        }
        StructuredPolicyPayments newInstance = constructor.newInstance(new Object[]{list, bool, bool2, list2, list3, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, StructuredPolicyPayments structuredPolicyPayments) {
        C19383o.m32797g(wVar, "writer");
        if (structuredPolicyPayments != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ACCEPTED_PAYMENT_METHODS);
            this.nullableListOfStringAdapter.toJson(wVar, structuredPolicyPayments.getAcceptedPaymentMethods());
            wVar.mo68529h(ResponseConstants.ACCEPTS_DIRECT_CHECKOUT);
            this.nullableBooleanAdapter.toJson(wVar, structuredPolicyPayments.getAcceptsDirectCheckout());
            wVar.mo68529h(ResponseConstants.ACCEPTS_PAYPAL);
            this.nullableBooleanAdapter.toJson(wVar, structuredPolicyPayments.getAcceptsPaypal());
            wVar.mo68529h(ResponseConstants.MANUAL_PAYMENT_METHODS);
            this.nullableListOfStringAdapter.toJson(wVar, structuredPolicyPayments.getManualPaymentMethods());
            wVar.mo68529h(ResponseConstants.PROTECTED_PAYMENT_METHODS);
            this.nullableListOfStringAdapter.toJson(wVar, structuredPolicyPayments.getProtectedPaymentMethods());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
