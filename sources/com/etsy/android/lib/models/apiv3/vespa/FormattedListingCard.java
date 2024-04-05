package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.interfaces.IFormattedListingCard;
import com.etsy.android.lib.models.interfaces.Promotable;
import com.fasterxml.jackson.core.JsonParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p568fn.C17782b;

public final class FormattedListingCard extends BaseFieldModel implements IFormattedListingCard, Promotable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String ITEM_TYPE = "formattedListingCard";
    public ListingCard card;
    private List<? extends Format> formats = C17782b.m29866f0(Format.SIGNALS_AND_NUDGES);
    private ListingCardSize listingCardSize = new ListingCardSize(0, 0.0f, (Integer) null, 7, (DefaultConstructorMarker) null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum Format {
        SIGNALS_AND_NUDGES("signals_and_nudges"),
        MINIMAL("minimal"),
        MINIMAL_WITH_PRICE("minimal_with_price"),
        MINIMAL_WITH_PRICE_NO_AD_BADGE("minimal_with_price_no_ad_badge"),
        MINIMAL_NO_AD_BADGE("minimal_no_ad_badge"),
        EDGE_TO_EDGE("edge_to_edge");
        
        private final String formatName;

        private Format(String str) {
            this.formatName = str;
        }

        public final String getFormatName() {
            return this.formatName;
        }
    }

    public ListingCard getCard() {
        ListingCard listingCard = this.card;
        if (listingCard != null) {
            return listingCard;
        }
        C19383o.m32805o(ResponseConstants.CARD);
        throw null;
    }

    public List<Format> getFormats() {
        return this.formats;
    }

    public ListingCardSize getListingCardSize() {
        return this.listingCardSize;
    }

    public String getProlistDisplayLocation() {
        return getCard().getProlistDisplayLocation();
    }

    public String getProlistLoggingKey() {
        return getCard().getProlistLoggingKey();
    }

    public int getViewType() {
        return R.id.view_type_formatted_listing_card;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", str, ResponseConstants.FORMATS)) {
            List<String> parseStringArray = BaseModel.Companion.parseStringArray(jsonParser);
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(parseStringArray));
            for (String str2 : parseStringArray) {
                Format format = Format.SIGNALS_AND_NUDGES;
                if (!C19383o.m32792b(str2, format.getFormatName())) {
                    Format format2 = Format.MINIMAL;
                    if (!C19383o.m32792b(str2, format2.getFormatName())) {
                        format2 = Format.MINIMAL_WITH_PRICE;
                        if (!C19383o.m32792b(str2, format2.getFormatName())) {
                            format2 = Format.MINIMAL_WITH_PRICE_NO_AD_BADGE;
                            if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                format2 = Format.EDGE_TO_EDGE;
                                if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                    format2 = Format.MINIMAL_NO_AD_BADGE;
                                    if (!C19383o.m32792b(str2, format2.getFormatName())) {
                                    }
                                }
                            }
                        }
                    }
                    format = format2;
                }
                arrayList.add(format);
            }
            setFormats(arrayList);
        } else if (!C19383o.m32792b(str, ResponseConstants.CARD)) {
            return false;
        } else {
            Object parseObject = BaseModel.Companion.parseObject(jsonParser, ListingCard.class);
            C19383o.m32794d(parseObject);
            setCard((ListingCard) parseObject);
        }
        return true;
    }

    public void setCard(ListingCard listingCard) {
        C19383o.m32797g(listingCard, "<set-?>");
        this.card = listingCard;
    }

    public void setFormats(List<? extends Format> list) {
        C19383o.m32797g(list, "<set-?>");
        this.formats = list;
    }

    public void setListingCardSize(ListingCardSize listingCardSize2) {
        C19383o.m32797g(listingCardSize2, "<set-?>");
        this.listingCardSize = listingCardSize2;
    }
}
