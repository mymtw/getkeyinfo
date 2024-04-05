package com.etsy.android.lib.models.apiv3.sdl;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingCard;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class FormattedListingCardJsonAdapter extends JsonAdapter<FormattedListingCard> {
    public static final int $stable = 8;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<ListingCard> listingCardAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.CARD, ResponseConstants.FORMATS);

    public FormattedListingCardJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listingCardAdapter = yVar.mo68558c(ListingCard.class, emptySet, "cardField");
        this.listOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, String.class), emptySet, "formatsField");
    }

    public String toString() {
        return "GeneratedJsonAdapter(FormattedListingCard)";
    }

    public FormattedListingCard fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        ListingCard listingCard = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                listingCard = this.listingCardAdapter.fromJson(jsonReader);
                if (listingCard == null) {
                    throw C18215a.m30734m("cardField", ResponseConstants.CARD, jsonReader);
                }
            } else if (Q == 1 && (list = this.listOfStringAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("formatsField", ResponseConstants.FORMATS, jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (listingCard == null) {
            throw C18215a.m30728g("cardField", ResponseConstants.CARD, jsonReader);
        } else if (list != null) {
            return new FormattedListingCard(listingCard, list);
        } else {
            throw C18215a.m30728g("formatsField", ResponseConstants.FORMATS, jsonReader);
        }
    }

    public void toJson(C17412w wVar, FormattedListingCard formattedListingCard) {
        C19383o.m32797g(wVar, "writer");
        if (formattedListingCard != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.CARD);
            this.listingCardAdapter.toJson(wVar, formattedListingCard.getCardField());
            wVar.mo68529h(ResponseConstants.FORMATS);
            this.listOfStringAdapter.toJson(wVar, formattedListingCard.getFormatsField());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
