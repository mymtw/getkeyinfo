package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ListingMachineTranslationDataJsonAdapter extends JsonAdapter<ListingMachineTranslationData> {
    public static final int $stable = 8;
    private volatile Constructor<ListingMachineTranslationData> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<ListingMachineTranslationTranslatedFields> nullableListingMachineTranslationTranslatedFieldsAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("from_lang_code", "listing_id", "mode", "to_lang_code", "translated", "untranslated", "to_language_standalone", "to_language_in_sentence", "from_language_standalone", "from_language_in_sentence", "show_styled_disclaimer");

    public ListingMachineTranslationDataJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "fromLangCode");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "listingId");
        this.nullableListingMachineTranslationTranslatedFieldsAdapter = yVar.mo68558c(ListingMachineTranslationTranslatedFields.class, emptySet, "translated");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "showStyledDisclaimer");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingMachineTranslationData)";
    }

    public ListingMachineTranslationData fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<ListingMachineTranslationTranslatedFields> cls = ListingMachineTranslationTranslatedFields.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields = null;
        ListingMachineTranslationTranslatedFields listingMachineTranslationTranslatedFields2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
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
                    listingMachineTranslationTranslatedFields = this.nullableListingMachineTranslationTranslatedFieldsAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    listingMachineTranslationTranslatedFields2 = this.nullableListingMachineTranslationTranslatedFieldsAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -1025;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -2048) {
            return new ListingMachineTranslationData(str, l, str2, str3, listingMachineTranslationTranslatedFields, listingMachineTranslationTranslatedFields2, str4, str5, str6, str7, bool);
        }
        Constructor<ListingMachineTranslationData> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingMachineTranslationData.class.getDeclaredConstructor(new Class[]{cls2, Long.class, cls2, cls2, cls, cls, cls2, cls2, cls2, cls2, Boolean.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingMachineTranslatio…his.constructorRef = it }");
        }
        ListingMachineTranslationData newInstance = constructor.newInstance(new Object[]{str, l, str2, str3, listingMachineTranslationTranslatedFields, listingMachineTranslationTranslatedFields2, str4, str5, str6, str7, bool, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingMachineTranslationData listingMachineTranslationData) {
        C19383o.m32797g(wVar, "writer");
        if (listingMachineTranslationData != null) {
            wVar.mo68522b();
            wVar.mo68529h("from_lang_code");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationData.getFromLangCode());
            wVar.mo68529h("listing_id");
            this.nullableLongAdapter.toJson(wVar, listingMachineTranslationData.getListingId());
            wVar.mo68529h("mode");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationData.getMode());
            wVar.mo68529h("to_lang_code");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationData.getToLangCode());
            wVar.mo68529h("translated");
            this.nullableListingMachineTranslationTranslatedFieldsAdapter.toJson(wVar, listingMachineTranslationData.getTranslated());
            wVar.mo68529h("untranslated");
            this.nullableListingMachineTranslationTranslatedFieldsAdapter.toJson(wVar, listingMachineTranslationData.getUntranslated());
            wVar.mo68529h("to_language_standalone");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationData.getToLanguageStandalone());
            wVar.mo68529h("to_language_in_sentence");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationData.getToLanguageInSentence());
            wVar.mo68529h("from_language_standalone");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationData.getFromLanguageStandalone());
            wVar.mo68529h("from_language_in_sentence");
            this.nullableStringAdapter.toJson(wVar, listingMachineTranslationData.getFromLanguageInSentence());
            wVar.mo68529h("show_styled_disclaimer");
            this.nullableBooleanAdapter.toJson(wVar, listingMachineTranslationData.getShowStyledDisclaimer());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
