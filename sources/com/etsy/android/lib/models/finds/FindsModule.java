package com.etsy.android.lib.models.finds;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.GiftCardBannerImage;
import com.etsy.android.lib.models.apiv3.EditorialCard;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.finds.FindsCrossLinkModule;
import com.etsy.android.lib.models.finds.FindsTwoTitledListingsModule;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p415of.C13186o;

public class FindsModule extends BaseFieldModel {
    public static final String CATEGORY_CARDS_TYPE = "category_cards";
    public static final String CROSSLINK_TYPE = "cross_link";
    public static final String EDITORIAL = "editorial";
    public static final String FIELD_CATEGORIES = "categories";
    public static final String FIELD_CTA = "cta";
    public static final String FIELD_IMAGES = "images";
    public static final String FIELD_LISTINGS = "listings";
    public static final String FIELD_PAGES = "pages";
    public static final String FIELD_SECTIONS = "sections";
    public static final String FIELD_SHOPS = "shops";
    public static final String FIELD_TEXT = "text";
    public static final String FIELD_TITLE = "title";
    public static final String FIELD_TYPE = "type";
    public static final String GIFT_CARD_BANNER = "gift_card_banner";
    public static final String HEADING_TYPE = "heading";
    private static final Map<String, Class<? extends FindsModule>> KNOWN_TYPES;
    public static final String LISTINGS_CARD_TYPE = "listings";
    public static final String SHOPS_CARD_TYPE = "shops";
    public static final String SMALL_CROSSLINK_TYPE = "small_cross_link";
    public static final String TWO_TITLED_LISTINGS_TYPE = "two_title_listings";
    public List<EditorialCard> editorials;
    public List<FindsSearchCategory> mCategories;
    public String mCta;
    public GiftCardBannerImage mGiftCardBannerImage;
    public List<ListingCard> mListings;
    public List<FindsCrossLinkModule.Page> mPages;
    public List<FindsTwoTitledListingsModule.Section> mSections;
    public List<ShopCard> mShops;
    public String mText;
    public String mTitle;
    public String mType;

    static {
        HashMap hashMap = new HashMap();
        KNOWN_TYPES = hashMap;
        hashMap.put(HEADING_TYPE, FindsHeadingModule.class);
        hashMap.put(CATEGORY_CARDS_TYPE, FindsCategoryModule.class);
        hashMap.put("shops", FindsShopModule.class);
        hashMap.put("listings", FindsListingsModules.class);
        hashMap.put(TWO_TITLED_LISTINGS_TYPE, FindsTwoTitledListingsModule.class);
        hashMap.put(CROSSLINK_TYPE, FindsCrossLinkModule.class);
        hashMap.put(SMALL_CROSSLINK_TYPE, FindsCrossLinkModule.class);
        hashMap.put(GIFT_CARD_BANNER, GiftCardBanner.class);
        hashMap.put(EDITORIAL, EditorialModule.class);
    }

    public List<? extends C13186o> getCardViewElements() {
        return new ArrayList(0);
    }

    public String getCta() {
        return this.mCta;
    }

    public GiftCardBannerImage getGiftCardBannerImages() {
        return this.mGiftCardBannerImage;
    }

    public String getText() {
        return this.mText;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getType() {
        return this.mType;
    }

    public FindsModule getTyped() {
        Class cls = KNOWN_TYPES.get(this.mType);
        try {
            FindsModule findsModule = (FindsModule) cls.newInstance();
            findsModule.setFromGeneric(this);
            return findsModule;
        } catch (InstantiationException e) {
            C8694h hVar = C8694h.f19097a;
            hVar.mo21309d("InstantiationException creating class=" + cls, e);
            return null;
        } catch (IllegalAccessException e2) {
            C8694h hVar2 = C8694h.f19097a;
            hVar2.mo21309d("IllegalAccessException creating class=" + cls, e2);
            return null;
        }
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("type".equals(str)) {
            String parseString = BaseModel.parseString(jsonParser);
            if (!KNOWN_TYPES.containsKey(parseString)) {
                return false;
            }
            this.mType = parseString;
            return true;
        } else if ("text".equals(str)) {
            this.mText = BaseModel.parseString(jsonParser);
            return true;
        } else if (EDITORIAL.equals(str)) {
            this.editorials = BaseModel.parseArray(jsonParser, EditorialCard.class);
            return true;
        } else if ("categories".equals(str)) {
            this.mCategories = BaseModel.parseArray(jsonParser, FindsSearchCategory.class);
            return true;
        } else if ("shops".equals(str)) {
            this.mShops = BaseModel.parseArray(jsonParser, ShopCard.class);
            return true;
        } else if ("listings".equals(str)) {
            this.mListings = BaseModel.parseArray(jsonParser, ListingCard.class);
            return true;
        } else if (FIELD_SECTIONS.equals(str)) {
            this.mSections = BaseModel.parseArray(jsonParser, FindsTwoTitledListingsModule.Section.class);
            return true;
        } else if (FIELD_PAGES.equals(str)) {
            this.mPages = BaseModel.parseArray(jsonParser, FindsCrossLinkModule.Page.class);
            return true;
        } else if ("images".equals(str)) {
            this.mGiftCardBannerImage = (GiftCardBannerImage) BaseModel.parseObject(jsonParser, GiftCardBannerImage.class);
            return true;
        } else if (FIELD_CTA.equals(str)) {
            this.mCta = BaseModel.parseString(jsonParser);
            return true;
        } else if (!"title".equals(str)) {
            return false;
        } else {
            this.mTitle = BaseModel.parseString(jsonParser);
            return true;
        }
    }

    public void setFromGeneric(FindsModule findsModule) {
        this.mType = findsModule.mType;
    }
}
