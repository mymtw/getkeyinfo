package com.etsy.android.lib.models.apiv3.sdl;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8696j;
import com.etsy.android.lib.logger.ITrackedObject;
import com.etsy.android.lib.models.ListingCardSize;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.Money;
import com.etsy.android.lib.models.apiv3.listing.FormattedMoney;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.etsy.android.lib.models.apiv3.vespa.FormattedListingCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.IFormattedListingCard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p415of.C13186o;
import p568fn.C17782b;

@C17403o(generateAdapter = true)
public final class FormattedListingCard implements C13186o, IFormattedListingCard, ITrackedObject {
    public static final int $stable = 8;
    private transient ListingCard card;
    private final com.etsy.android.lib.models.apiv3.listing.ListingCard cardField;
    private transient List<? extends FormattedListingCard.Format> formats;
    private final List<String> formatsField;
    private transient ListingCardSize listingCardSize;
    private transient List<C8696j> onSeenTrackingEvents = new ArrayList();
    private transient String trackingName;

    public FormattedListingCard(@C17402n(name = "card") com.etsy.android.lib.models.apiv3.listing.ListingCard listingCard, @C17402n(name = "formats") List<String> list) {
        C19383o.m32797g(listingCard, "cardField");
        C19383o.m32797g(list, "formatsField");
        this.cardField = listingCard;
        this.formatsField = list;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (String str : list) {
            FormattedListingCard.Format format = FormattedListingCard.Format.SIGNALS_AND_NUDGES;
            if (!C19383o.m32792b(str, format.getFormatName())) {
                FormattedListingCard.Format format2 = FormattedListingCard.Format.MINIMAL;
                if (!C19383o.m32792b(str, format2.getFormatName())) {
                    format2 = FormattedListingCard.Format.MINIMAL_WITH_PRICE;
                    if (!C19383o.m32792b(str, format2.getFormatName())) {
                        format2 = FormattedListingCard.Format.MINIMAL_WITH_PRICE_NO_AD_BADGE;
                        if (!C19383o.m32792b(str, format2.getFormatName())) {
                            format2 = FormattedListingCard.Format.MINIMAL_NO_AD_BADGE;
                            if (!C19383o.m32792b(str, format2.getFormatName())) {
                                format2 = FormattedListingCard.Format.EDGE_TO_EDGE;
                                if (!C19383o.m32792b(str, format2.getFormatName())) {
                                }
                            }
                        }
                    }
                }
                format = format2;
            }
            arrayList.add(format);
        }
        this.formats = arrayList;
        this.card = convertToLegacyListingCard(this.cardField);
        this.listingCardSize = new ListingCardSize(0, 0.0f, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    private final ListingCard convertToLegacyListingCard(com.etsy.android.lib.models.apiv3.listing.ListingCard listingCard) {
        ListingCard listingCard2 = new ListingCard();
        listingCard2.setTitle(listingCard.getTitle());
        listingCard2.setProlistLoggingKey(listingCard.getLoggingKey());
        listingCard2.setProlistDisplayLocation(listingCard.getProlistDisplayLocation());
        listingCard2.setListingId(String.valueOf(listingCard.getListingId()));
        Long shopId = listingCard.getShopId();
        listingCard2.setShopId(shopId != null ? shopId.toString() : null);
        listingCard2.setShopName(listingCard.getShopName());
        listingCard2.setUrl(listingCard.getUrl());
        Boolean isFavorite = listingCard.isFavorite();
        boolean z = false;
        listingCard2.setIsFavorite(isFavorite != null ? isFavorite.booleanValue() : false);
        if (listingCard.getDiscountedPrice() != null) {
            Money money = new Money();
            String currencyCode = listingCard.getDiscountedPrice().getCurrencyCode();
            String str = "";
            if (currencyCode == null) {
                currencyCode = str;
            }
            money.setCurrencyCode(currencyCode);
            String currencyFormattedLong = listingCard.getDiscountedPrice().getCurrencyFormattedLong();
            if (currencyFormattedLong == null) {
                currencyFormattedLong = str;
            }
            money.setCurrencyFormattedLong(currencyFormattedLong);
            String currencyFormattedShort = listingCard.getDiscountedPrice().getCurrencyFormattedShort();
            if (currencyFormattedShort == null) {
                currencyFormattedShort = str;
            }
            money.setCurrencyFormattedShort(currencyFormattedShort);
            String currencyFormattedRaw = listingCard.getDiscountedPrice().getCurrencyFormattedRaw();
            if (currencyFormattedRaw != null) {
                str = currencyFormattedRaw;
            }
            money.setCurrencyFormattedRaw(str);
            money.setDivisor(listingCard.getDiscountedPrice().getDivisor());
            money.setAmount(listingCard.getDiscountedPrice().get_amount());
            listingCard2.setDiscountedPrice(money);
        }
        FormattedMoney discountDescription = listingCard.getDiscountDescription();
        listingCard2.setFormattedDiscountDescription(discountDescription != null ? discountDescription.toString() : null);
        if (!(listingCard.getPrice() == null || listingCard.getCurrencyCode() == null)) {
            C8630b bVar = C8630b.f18964e;
            if (bVar != null) {
                listingCard2.setPrice(bVar.mo21248a(listingCard.getPrice(), listingCard.getCurrencyCode()));
            } else {
                C19383o.m32805o("instance");
                throw null;
            }
        }
        Boolean isSoldOut = listingCard.isSoldOut();
        if (isSoldOut != null) {
            z = isSoldOut.booleanValue();
        }
        listingCard2.setIsSoldOut(z);
        if (listingCard.getContentSource() != null) {
            listingCard2.setContentSource(listingCard.getContentSource());
        }
        listingCard2.setListingImages(C17782b.m29864d0(listingCard.getImg() != null ? new ListingImage((String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, listingCard.getImg().getUrl170x135(), listingCard.getImg().getUrl224xN(), listingCard.getImg().getUrl300x300(), listingCard.getImg().getUrl340x270(), listingCard.getImg().getUrl570xN(), (String) null, (String) null, listingCard.getImg().getUrl680x540(), listingCard.getImg().getUrl75x75(), listingCard.getImg().getUrl(), (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, 0, (String) null, (String) null, false, -7593985, 7, (DefaultConstructorMarker) null) : new ListingImage((String) null, 0, 0, 0, (String) null, (String) null, 0, (Integer) null, (EtsyId) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, 0, 0, (Integer) null, (Integer) null, (Long) null, (String) null, 0, (String) null, (String) null, false, -1, 7, (DefaultConstructorMarker) null)));
        return listingCard2;
    }

    public static /* synthetic */ FormattedListingCard copy$default(FormattedListingCard formattedListingCard, com.etsy.android.lib.models.apiv3.listing.ListingCard listingCard, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            listingCard = formattedListingCard.cardField;
        }
        if ((i & 2) != 0) {
            list = formattedListingCard.formatsField;
        }
        return formattedListingCard.copy(listingCard, list);
    }

    public final com.etsy.android.lib.models.apiv3.listing.ListingCard component1() {
        return this.cardField;
    }

    public final List<String> component2() {
        return this.formatsField;
    }

    public final FormattedListingCard copy(@C17402n(name = "card") com.etsy.android.lib.models.apiv3.listing.ListingCard listingCard, @C17402n(name = "formats") List<String> list) {
        C19383o.m32797g(listingCard, "cardField");
        C19383o.m32797g(list, "formatsField");
        return new FormattedListingCard(listingCard, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedListingCard)) {
            return false;
        }
        FormattedListingCard formattedListingCard = (FormattedListingCard) obj;
        return C19383o.m32792b(this.cardField, formattedListingCard.cardField) && C19383o.m32792b(this.formatsField, formattedListingCard.formatsField);
    }

    public ListingCard getCard() {
        return this.card;
    }

    public final com.etsy.android.lib.models.apiv3.listing.ListingCard getCardField() {
        return this.cardField;
    }

    public List<FormattedListingCard.Format> getFormats() {
        return this.formats;
    }

    public final List<String> getFormatsField() {
        return this.formatsField;
    }

    public ListingCardSize getListingCardSize() {
        return this.listingCardSize;
    }

    public List<C8696j> getOnSeenTrackingEvents() {
        return this.onSeenTrackingEvents;
    }

    @JsonIgnore
    public int getTrackedPosition() {
        return 0;
    }

    public String getTrackingName() {
        return this.trackingName;
    }

    @JsonIgnore
    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return null;
    }

    public int getViewType() {
        return R.id.view_type_formatted_listing_card;
    }

    public int hashCode() {
        return this.formatsField.hashCode() + (this.cardField.hashCode() * 31);
    }

    public void setCard(ListingCard listingCard) {
        C19383o.m32797g(listingCard, "<set-?>");
        this.card = listingCard;
    }

    public void setFormats(List<? extends FormattedListingCard.Format> list) {
        C19383o.m32797g(list, "<set-?>");
        this.formats = list;
    }

    public void setListingCardSize(ListingCardSize listingCardSize2) {
        C19383o.m32797g(listingCardSize2, "<set-?>");
        this.listingCardSize = listingCardSize2;
    }

    public void setOnSeenTrackingEvents(List<C8696j> list) {
        C19383o.m32797g(list, "<set-?>");
        this.onSeenTrackingEvents = list;
    }

    @JsonIgnore
    public void setTrackedPosition(int i) {
    }

    public void setTrackingName(String str) {
        this.trackingName = str;
    }

    @JsonIgnore
    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("FormattedListingCard(cardField=");
        h.append(this.cardField);
        h.append(", formatsField=");
        return C0070b.m186i(h, this.formatsField, ')');
    }
}
