package com.etsy.android.p327ui.cart.googlepay.models;

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

/* renamed from: com.etsy.android.ui.cart.googlepay.models.GooglePayIsReadyToPayJsonAdapter */
public final class GooglePayIsReadyToPayJsonAdapter extends JsonAdapter<GooglePayIsReadyToPay> {
    public static final int $stable = 8;
    private volatile Constructor<GooglePayIsReadyToPay> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<GooglePayPaymentMethods>> listOfGooglePayPaymentMethodsAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("apiVersion", "apiVersionMinor", "existingPaymentMethodRequired", "allowedPaymentMethods");

    public GooglePayIsReadyToPayJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "apiVersion");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "existingPaymentMethodRequired");
        this.listOfGooglePayPaymentMethodsAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, GooglePayPaymentMethods.class), emptySet, "allowedPaymentMethods");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                num = this.intAdapter.fromJson(jsonReader2);
                if (num == null) {
                    throw C18215a.m30734m("apiVersion", "apiVersion", jsonReader2);
                }
            } else if (Q == 1) {
                num2 = this.intAdapter.fromJson(jsonReader2);
                if (num2 == null) {
                    throw C18215a.m30734m("apiVersionMinor", "apiVersionMinor", jsonReader2);
                }
            } else if (Q == 2) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3 && (list = this.listOfGooglePayPaymentMethodsAdapter.fromJson(jsonReader2)) == null) {
                throw C18215a.m30734m("allowedPaymentMethods", "allowedPaymentMethods", jsonReader2);
            }
        }
        jsonReader.mo68413e();
        if (i != -5) {
            Constructor<GooglePayIsReadyToPay> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                constructor = GooglePayIsReadyToPay.class.getDeclaredConstructor(new Class[]{cls, cls, Boolean.class, List.class, cls, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "GooglePayIsReadyToPay::c…his.constructorRef = it }");
            }
            Object[] objArr = new Object[6];
            if (num != null) {
                objArr[0] = Integer.valueOf(num.intValue());
                if (num2 != null) {
                    objArr[1] = Integer.valueOf(num2.intValue());
                    objArr[2] = bool;
                    if (list != null) {
                        objArr[3] = list;
                        objArr[4] = Integer.valueOf(i);
                        objArr[5] = null;
                        GooglePayIsReadyToPay newInstance = constructor.newInstance(objArr);
                        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                        return newInstance;
                    }
                    throw C18215a.m30728g("allowedPaymentMethods", "allowedPaymentMethods", jsonReader2);
                }
                throw C18215a.m30728g("apiVersionMinor", "apiVersionMinor", jsonReader2);
            }
            throw C18215a.m30728g("apiVersion", "apiVersion", jsonReader2);
        } else if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                int intValue2 = num2.intValue();
                if (list != null) {
                    return new GooglePayIsReadyToPay(intValue, intValue2, bool, list);
                }
                throw C18215a.m30728g("allowedPaymentMethods", "allowedPaymentMethods", jsonReader2);
            }
            throw C18215a.m30728g("apiVersionMinor", "apiVersionMinor", jsonReader2);
        } else {
            throw C18215a.m30728g("apiVersion", "apiVersion", jsonReader2);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        GooglePayIsReadyToPay googlePayIsReadyToPay = (GooglePayIsReadyToPay) obj;
        C19383o.m32797g(wVar, "writer");
        if (googlePayIsReadyToPay != null) {
            wVar.mo68522b();
            wVar.mo68529h("apiVersion");
            this.intAdapter.toJson(wVar, Integer.valueOf(googlePayIsReadyToPay.f20552a));
            wVar.mo68529h("apiVersionMinor");
            this.intAdapter.toJson(wVar, Integer.valueOf(googlePayIsReadyToPay.f20553b));
            wVar.mo68529h("existingPaymentMethodRequired");
            this.nullableBooleanAdapter.toJson(wVar, googlePayIsReadyToPay.f20554c);
            wVar.mo68529h("allowedPaymentMethods");
            this.listOfGooglePayPaymentMethodsAdapter.toJson(wVar, googlePayIsReadyToPay.f20555d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(GooglePayIsReadyToPay)";
    }
}
