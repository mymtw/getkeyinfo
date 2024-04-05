package com.etsy.android.p327ui.conversation.details.models;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

/* renamed from: com.etsy.android.ui.conversation.details.models.ListingPartialDatabaseModelJsonAdapter */
public final class ListingPartialDatabaseModelJsonAdapter extends JsonAdapter<ListingPartialDatabaseModel> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("listing_id", "title", "url", ResponseConstants.IMAGE_URL, ResponseConstants.PRICE, ResponseConstants.CURRENCY_CODE, ResponseConstants.STATUS, "status_value");
    private final JsonAdapter<String> stringAdapter;

    public ListingPartialDatabaseModelJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls2, emptySet, "listingId");
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "title");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, ResponseConstants.PRICE);
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.STATUS);
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num = null;
        String str6 = null;
        while (true) {
            String str7 = str6;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        l = this.longAdapter.fromJson(jsonReader2);
                        if (l == null) {
                            throw C18215a.m30734m("listingId", "listing_id", jsonReader2);
                        }
                        break;
                    case 1:
                        String fromJson = this.stringAdapter.fromJson(jsonReader2);
                        if (fromJson != null) {
                            str = fromJson;
                            break;
                        } else {
                            throw C18215a.m30734m("title", "title", jsonReader2);
                        }
                    case 2:
                        String fromJson2 = this.stringAdapter.fromJson(jsonReader2);
                        if (fromJson2 != null) {
                            str2 = fromJson2;
                            break;
                        } else {
                            throw C18215a.m30734m("url", "url", jsonReader2);
                        }
                    case 3:
                        String fromJson3 = this.stringAdapter.fromJson(jsonReader2);
                        if (fromJson3 != null) {
                            str3 = fromJson3;
                            break;
                        } else {
                            throw C18215a.m30734m("imageUrl", ResponseConstants.IMAGE_URL, jsonReader2);
                        }
                    case 4:
                        str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        num = this.nullableIntAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                        continue;
                }
                str6 = str7;
            } else {
                jsonReader.mo68413e();
                if (l != null) {
                    long longValue = l.longValue();
                    if (str == null) {
                        throw C18215a.m30728g("title", "title", jsonReader2);
                    } else if (str2 == null) {
                        throw C18215a.m30728g("url", "url", jsonReader2);
                    } else if (str3 != null) {
                        return new ListingPartialDatabaseModel(longValue, str, str2, str3, str4, str5, num, str7);
                    } else {
                        throw C18215a.m30728g("imageUrl", ResponseConstants.IMAGE_URL, jsonReader2);
                    }
                } else {
                    throw C18215a.m30728g("listingId", "listing_id", jsonReader2);
                }
            }
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        ListingPartialDatabaseModel listingPartialDatabaseModel = (ListingPartialDatabaseModel) obj;
        C19383o.m32797g(wVar, "writer");
        if (listingPartialDatabaseModel != null) {
            wVar.mo68522b();
            wVar.mo68529h("listing_id");
            this.longAdapter.toJson(wVar, Long.valueOf(listingPartialDatabaseModel.f21186a));
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, listingPartialDatabaseModel.f21187b);
            wVar.mo68529h("url");
            this.stringAdapter.toJson(wVar, listingPartialDatabaseModel.f21188c);
            wVar.mo68529h(ResponseConstants.IMAGE_URL);
            this.stringAdapter.toJson(wVar, listingPartialDatabaseModel.f21189d);
            wVar.mo68529h(ResponseConstants.PRICE);
            this.nullableStringAdapter.toJson(wVar, listingPartialDatabaseModel.f21190e);
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.nullableStringAdapter.toJson(wVar, listingPartialDatabaseModel.f21191f);
            wVar.mo68529h(ResponseConstants.STATUS);
            this.nullableIntAdapter.toJson(wVar, listingPartialDatabaseModel.f21192g);
            wVar.mo68529h("status_value");
            this.nullableStringAdapter.toJson(wVar, listingPartialDatabaseModel.f21193h);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ListingPartialDatabaseModel)";
    }
}
