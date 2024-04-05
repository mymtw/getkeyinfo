package com.etsy.android.lib.models.apiv3.sdl;

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

public final class FormattedTaxonomyCategoryJsonAdapter extends JsonAdapter<FormattedTaxonomyCategory> {
    public static final int $stable = 8;
    private volatile Constructor<FormattedTaxonomyCategory> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<DelegateSdlEvent>> nullableListOfDelegateSdlEventAdapter;
    private final JsonAdapter<TaxonomyCategory> nullableTaxonomyCategoryAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.FORMATS, ResponseConstants.CATEGORY, ResponseConstants.CLIENT_EVENTS);

    public FormattedTaxonomyCategoryJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, String.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfStringAdapter = yVar.mo68558c(d, emptySet, "formatsField");
        this.nullableTaxonomyCategoryAdapter = yVar.mo68558c(TaxonomyCategory.class, emptySet, "categoryField");
        this.nullableListOfDelegateSdlEventAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, DelegateSdlEvent.class), emptySet, "sdlEventsField");
    }

    public String toString() {
        return "GeneratedJsonAdapter(FormattedTaxonomyCategory)";
    }

    public FormattedTaxonomyCategory fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        TaxonomyCategory taxonomyCategory = null;
        List list2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader2);
                if (list == null) {
                    throw C18215a.m30734m("formatsField", ResponseConstants.FORMATS, jsonReader2);
                }
            } else if (Q == 1) {
                taxonomyCategory = this.nullableTaxonomyCategoryAdapter.fromJson(jsonReader2);
            } else if (Q == 2) {
                list2 = this.nullableListOfDelegateSdlEventAdapter.fromJson(jsonReader2);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i != -5) {
            Constructor<FormattedTaxonomyCategory> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = FormattedTaxonomyCategory.class.getDeclaredConstructor(new Class[]{List.class, TaxonomyCategory.class, List.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "FormattedTaxonomyCategor…his.constructorRef = it }");
            }
            Object[] objArr = new Object[5];
            if (list != null) {
                objArr[0] = list;
                objArr[1] = taxonomyCategory;
                objArr[2] = list2;
                objArr[3] = Integer.valueOf(i);
                objArr[4] = null;
                FormattedTaxonomyCategory newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("formatsField", ResponseConstants.FORMATS, jsonReader2);
        } else if (list != null) {
            return new FormattedTaxonomyCategory(list, taxonomyCategory, list2);
        } else {
            throw C18215a.m30728g("formatsField", ResponseConstants.FORMATS, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, FormattedTaxonomyCategory formattedTaxonomyCategory) {
        C19383o.m32797g(wVar, "writer");
        if (formattedTaxonomyCategory != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.FORMATS);
            this.listOfStringAdapter.toJson(wVar, formattedTaxonomyCategory.getFormatsField());
            wVar.mo68529h(ResponseConstants.CATEGORY);
            this.nullableTaxonomyCategoryAdapter.toJson(wVar, formattedTaxonomyCategory.getCategoryField());
            wVar.mo68529h(ResponseConstants.CLIENT_EVENTS);
            this.nullableListOfDelegateSdlEventAdapter.toJson(wVar, formattedTaxonomyCategory.getSdlEventsField());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
