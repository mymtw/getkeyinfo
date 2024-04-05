package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.editable.EditableListing;
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

public final class ListingMachineTranslationTranslatedFieldsJsonAdapter extends JsonAdapter<ListingMachineTranslationTranslatedFields> {
    public static final int $stable = 8;
    private volatile Constructor<ListingMachineTranslationTranslatedFields> constructorRef;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "language", "title", "description", "description_plaintext", EditableListing.FIELD_TAGS, "promotion_description", EditableListing.FIELD_MATERIALS);

    public ListingMachineTranslationTranslatedFieldsJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "listingId");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "language");
        this.nullableListOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, EditableListing.FIELD_TAGS);
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingMachineTranslationTranslatedFields)";
    }

    public ListingMachineTranslationTranslatedFields fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        List list2 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -256) {
            return new ListingMachineTranslationTranslatedFields(l, str, str2, str3, str4, list, str5, list2);
        }
        Constructor<ListingMachineTranslationTranslatedFields> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingMachineTranslationTranslatedFields.class.getDeclaredConstructor(new Class[]{Long.class, cls, cls, cls, cls, List.class, cls, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingMachineTranslatio…his.constructorRef = it }");
        }
        ListingMachineTranslationTranslatedFields newInstance = constructor.newInstance(new Object[]{l, str, str2, str3, str4, list, str5, list2, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields) {
        C19383o.m32797g(wVar, "writer");
        if (listingMachineTranslationTranslatedFields != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getListingId());
            wVar.mo68529h("language");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getLanguage());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getTitle());
            wVar.mo68529h("description");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getDescription());
            wVar.mo68529h("description_plaintext");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getDescriptionPlaintext());
            wVar.mo68529h(EditableListing.FIELD_TAGS);
            this.nullableListOfStringAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getTags());
            wVar.mo68529h("promotion_description");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getPromotionDescription());
            wVar.mo68529h(EditableListing.FIELD_MATERIALS);
            this.nullableListOfStringAdapter.toJson(wVar, listingMachineTranslationTranslatedFields.getMaterials());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
