package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.StarSeller;
import com.etsy.android.lib.models.User;
import com.etsy.android.lib.models.apiv3.listing.ShopRating;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.models.interfaces.ShopLike;
import com.etsy.android.lib.models.interfaces.ShopShareable;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.CharUtils;
import org.apache.commons.lang3.ClassUtils;

public class ShopV3 extends BaseModel implements ShopLike {
    public static final int BRANDING_OPTION_BANNER = 1;
    public static final int BRANDING_OPTION_CAROUSEL = 3;
    public static final int BRANDING_OPTION_COLLAGE = 4;
    public static final int BRANDING_OPTION_LARGE_BANNER = 2;
    public static final int BRANDING_OPTION_NO_BRANDING = 0;
    public static final String MODULE_ABOUT = "module_about";
    public static final String MODULE_FEATURED_ITEMS = "module_featured_items";
    public static final String PAGE_SOLD_ITEMS = "page_sold_items";
    private static final long serialVersionUID = 4707867215497444593L;
    public String headlineTranslated = null;
    public boolean mAboutInfoExists;
    public boolean mAcceptsBankTransfers;
    public boolean mAcceptsChecks;
    public boolean mAcceptsDirectCheckout;
    public boolean mAcceptsGiftCards;
    public boolean mAcceptsMoneyOrders;
    public boolean mAcceptsOther;
    public boolean mAcceptsPayPal;
    public int mActiveListingCount;
    public double mAverageRating;
    public Image mBanner;
    public String mBannerUrl = "";
    public int mBrandingOption;
    public String mCity = "";
    public String mCountryCode = "";
    public Date mCreateDate;
    public String mCurrencyCode = "";
    public int mDigitalListingCount;
    public int mFavoritesCount;
    public String mGoogleAnalyticsPropertyId = "";
    public boolean mHasAbout;
    public boolean mHasAboutPage;
    public boolean mHasBanner;
    public boolean mHasCurrencyCode;
    public boolean mHasIcon;
    public boolean mHasLanguagePreferences;
    public boolean mHasLargeBanner;
    public boolean mHasOwners;
    public boolean mHasPrivateReceiptInfo;
    public boolean mHasPublishedStructuredRefundsPolicy;
    public String mHeadline = "";
    public boolean mIsOpen;
    public boolean mIsUsingStructuredPolicies;
    public boolean mIsVacation;
    public Image mLargeBanner;
    public double mLatitude;
    public boolean mListingRearrangeEnabled;
    public String mLocation = "";
    public double mLongitude;
    public String mMessage = "";
    public Date mMessageUpdateDate;
    public List<String> mModules = new ArrayList(0);
    public String mName = "";
    public String mOnboardingStatus = "";
    public Date mOpenDate;
    public User mOwner;
    public String mPullQuote = "";
    public String mRegion = "";
    public String mSellerAvatarUrl = "";
    public String mSellerName = "";
    public ShopIconV3 mShopIcon;
    public EtsyId mShopId = new EtsyId();
    public List<Language> mShopLanguages = new ArrayList(0);
    public String mShopName = "";
    public String mShopUrl = "";
    public int mSoldCount;
    public String mStatus = "";
    public String mStory = "";
    public String mStoryHeadline = "";
    public String mStoryLeadingParagraph = "";
    public int mTotalRatingCount;
    public Date mUpdateDate;
    public String mUrl = "";
    public EtsyId mUserId = new EtsyId();
    public String mVacationMessage = "";
    public String messageTranslated = null;
    private ShopRating shopRating = null;
    public StarSeller starSeller;
    public String vacationMessageTranslated = null;

    public boolean aboutInfoExists() {
        return this.mAboutInfoExists;
    }

    public boolean acceptsBankTransfers() {
        return this.mAcceptsBankTransfers;
    }

    public boolean acceptsChecks() {
        return this.mAcceptsChecks;
    }

    public boolean acceptsDirectCheckout() {
        return this.mAcceptsDirectCheckout;
    }

    public boolean acceptsGiftCards() {
        return this.mAcceptsGiftCards;
    }

    public boolean acceptsMoneyOrders() {
        return this.mAcceptsMoneyOrders;
    }

    public boolean acceptsOther() {
        return this.mAcceptsOther;
    }

    public boolean acceptsPayPal() {
        return this.mAcceptsPayPal;
    }

    public int getActiveListingCount() {
        return this.mActiveListingCount;
    }

    public String getAvatarUrl() {
        return this.mSellerAvatarUrl;
    }

    public double getAverageRating() {
        return this.mAverageRating;
    }

    public Image getBanner() {
        return this.mBanner;
    }

    public String getBannerUrl() {
        return this.mBannerUrl;
    }

    public int getBrandingOption() {
        return this.mBrandingOption;
    }

    public List<? extends ListingLike> getCardListings() {
        return Collections.emptyList();
    }

    public String getCity() {
        return this.mCity;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public Date getCreateDate() {
        return this.mCreateDate;
    }

    public String getCurrencyCode() {
        return this.mCurrencyCode;
    }

    public int getDigitalListingCount() {
        return this.mDigitalListingCount;
    }

    public int getFavoritesCount() {
        return this.mFavoritesCount;
    }

    public String getGoogleAnalyticsPropertyId() {
        return this.mGoogleAnalyticsPropertyId;
    }

    public boolean getHasPublishedStructuredRefundsPolicy() {
        return this.mHasPublishedStructuredRefundsPolicy;
    }

    public String getHeadline() {
        return this.mHeadline;
    }

    public String getHeadlineTranslated() {
        return this.headlineTranslated;
    }

    public String getIconUrl(int i) {
        ShopIconV3 shopIconV3 = this.mShopIcon;
        if (shopIconV3 != null) {
            return shopIconV3.url;
        }
        return null;
    }

    public Image getLargeBanner() {
        return this.mLargeBanner;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public String getMessageTranslated() {
        return this.messageTranslated;
    }

    public Date getMessageUpdateDate() {
        return this.mMessageUpdateDate;
    }

    public List<String> getModules() {
        return this.mModules;
    }

    public String getName() {
        return this.mName;
    }

    public int getNumRatings() {
        return this.mTotalRatingCount;
    }

    public String getOnboardingStatus() {
        return this.mOnboardingStatus;
    }

    public Date getOpenDate() {
        Date date = this.mOpenDate;
        if (date != null && date.getTime() > 0) {
            return this.mOpenDate;
        }
        Date date2 = this.mCreateDate;
        return date2 != null ? date2 : new Date(0);
    }

    public User getOwner() {
        return this.mOwner;
    }

    public String getPullQuote() {
        return this.mPullQuote;
    }

    public String getRegion() {
        return this.mRegion;
    }

    public String getSellerAvatarUrl() {
        return this.mSellerAvatarUrl;
    }

    public String getSellerName() {
        return this.mSellerName;
    }

    public Shareable getShareable() {
        return new Shareable(this);
    }

    public ShopIconV3 getShopIcon() {
        return this.mShopIcon;
    }

    public EtsyId getShopId() {
        return this.mShopId;
    }

    public List<Language> getShopLanguages() {
        return this.mShopLanguages;
    }

    public String getShopName() {
        return this.mShopName;
    }

    public ShopRating getShopRating() {
        return this.shopRating;
    }

    public String getShopUrl() {
        return this.mShopUrl;
    }

    public int getSoldCount() {
        return this.mSoldCount;
    }

    public StarSeller getStarSeller() {
        return this.starSeller;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public String getStory() {
        return this.mStory;
    }

    public String getStoryHeadline() {
        return this.mStoryHeadline;
    }

    public String getStoryLeadingParagraph() {
        return this.mStoryLeadingParagraph;
    }

    public int getTotalRatingCount() {
        return this.mTotalRatingCount;
    }

    public Date getUpdateDate() {
        return this.mUpdateDate;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public String getVacationMessage() {
        return this.mVacationMessage;
    }

    public String getVacationMessageTranslated() {
        return this.vacationMessageTranslated;
    }

    public boolean hasAbout() {
        return this.mHasAbout;
    }

    public boolean hasAboutPage() {
        return this.mHasAboutPage;
    }

    public boolean hasBanner() {
        return this.mHasBanner;
    }

    public boolean hasCurrencyCode() {
        return this.mHasCurrencyCode;
    }

    public boolean hasIcon() {
        return this.mHasIcon;
    }

    public boolean hasLanguagePreferences() {
        return this.mHasLanguagePreferences;
    }

    public boolean hasLargeBanner() {
        return this.mHasLargeBanner;
    }

    public boolean hasOnlyDigitalListings() {
        return getDigitalListingCount() > 0 && getActiveListingCount() == getDigitalListingCount();
    }

    public boolean hasOwners() {
        return this.mHasOwners;
    }

    public boolean hasPrivateReceiptInfo() {
        return this.mHasPrivateReceiptInfo;
    }

    public boolean hasRatings() {
        return this.mTotalRatingCount > 0;
    }

    public boolean isListingRearrangeEnabled() {
        return this.mListingRearrangeEnabled;
    }

    public boolean isOpen() {
        return this.mIsOpen;
    }

    public boolean isUsingStructuredPolicies() {
        return this.mIsUsingStructuredPolicies;
    }

    public boolean isVacation() {
        return this.mIsVacation;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                currentName.getClass();
                char c = 65535;
                switch (currentName.hashCode()) {
                    case -2103918028:
                        if (currentName.equals(ResponseConstants.SHOP_NAME)) {
                            c = 0;
                            break;
                        }
                        break;
                    case -2066209957:
                        if (currentName.equals(ResponseConstants.ABOUT_INFO_EXISTS)) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1942440317:
                        if (currentName.equals(ResponseConstants.HAS_PRIVATE_RECEIPT_INFO)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1825173825:
                        if (currentName.equals(ResponseConstants.ACCEPTS_CHECKS)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1691267301:
                        if (currentName.equals(ResponseConstants.REARRANGE_ENABLED)) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1470450249:
                        if (currentName.equals(ResponseConstants.ACCEPTS_OTHER)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1458851513:
                        if (currentName.equals(ResponseConstants.ACCEPTS_PAYPAL)) {
                            c = 6;
                            break;
                        }
                        break;
                    case -1396342996:
                        if (currentName.equals(ResponseConstants.BANNER)) {
                            c = 7;
                            break;
                        }
                        break;
                    case -1371821962:
                        if (currentName.equals(ResponseConstants.HAS_CURRENCY_CODE)) {
                            c = 8;
                            break;
                        }
                        break;
                    case -1294951259:
                        if (currentName.equals(ResponseConstants.VACATION_MESSAGE)) {
                            c = 9;
                            break;
                        }
                        break;
                    case -1115058732:
                        if (currentName.equals(ResponseConstants.HEADLINE)) {
                            c = 10;
                            break;
                        }
                        break;
                    case -1092501209:
                        if (currentName.equals(ResponseConstants.FAVORITES_COUNT)) {
                            c = 11;
                            break;
                        }
                        break;
                    case -1031340580:
                        if (currentName.equals(ResponseConstants.BANNER_URL)) {
                            c = 12;
                            break;
                        }
                        break;
                    case -934795532:
                        if (currentName.equals("region")) {
                            c = CharUtils.f44393CR;
                            break;
                        }
                        break;
                    case -905989715:
                        if (currentName.equals(ResponseConstants.DIGITAL_LISTING_COUNT)) {
                            c = 14;
                            break;
                        }
                        break;
                    case -892481550:
                        if (currentName.equals(ResponseConstants.STATUS)) {
                            c = 15;
                            break;
                        }
                        break;
                    case -676204014:
                        if (currentName.equals(ResponseConstants.SHOP_LANGUAGES)) {
                            c = 16;
                            break;
                        }
                        break;
                    case -573930140:
                        if (currentName.equals(ResponseConstants.UPDATE_DATE)) {
                            c = 17;
                            break;
                        }
                        break;
                    case -494058223:
                        if (currentName.equals(ResponseConstants.CREATE_DATE)) {
                            c = 18;
                            break;
                        }
                        break;
                    case -361924039:
                        if (currentName.equals(ResponseConstants.BRANDING_OPTION)) {
                            c = 19;
                            break;
                        }
                        break;
                    case -344955738:
                        if (currentName.equals(ResponseConstants.SHOP_URL)) {
                            c = 20;
                            break;
                        }
                        break;
                    case -147132913:
                        if (currentName.equals("user_id")) {
                            c = 21;
                            break;
                        }
                        break;
                    case 106911:
                        if (currentName.equals(ResponseConstants.LAT)) {
                            c = 22;
                            break;
                        }
                        break;
                    case 107339:
                        if (currentName.equals(ResponseConstants.LON)) {
                            c = 23;
                            break;
                        }
                        break;
                    case 116079:
                        if (currentName.equals("url")) {
                            c = 24;
                            break;
                        }
                        break;
                    case 3053931:
                        if (currentName.equals("city")) {
                            c = 25;
                            break;
                        }
                        break;
                    case 3226745:
                        if (currentName.equals(ResponseConstants.ICON)) {
                            c = 26;
                            break;
                        }
                        break;
                    case 3373707:
                        if (currentName.equals("name")) {
                            c = 27;
                            break;
                        }
                        break;
                    case 53296552:
                        if (currentName.equals(ResponseConstants.HAS_ABOUT)) {
                            c = 28;
                            break;
                        }
                        break;
                    case 106164915:
                        if (currentName.equals(ResponseConstants.OWNER)) {
                            c = 29;
                            break;
                        }
                        break;
                    case 107824392:
                        if (currentName.equals(ResponseConstants.ACCEPTS_DIRECT_CHECKOUT)) {
                            c = 30;
                            break;
                        }
                        break;
                    case 108067080:
                        if (currentName.equals(ResponseConstants.TOTAL_RATING_COUNT)) {
                            c = 31;
                            break;
                        }
                        break;
                    case 109770997:
                        if (currentName.equals(ResponseConstants.STORY)) {
                            c = ' ';
                            break;
                        }
                        break;
                    case 140505854:
                        if (currentName.equals(ResponseConstants.HAS_ICON)) {
                            c = '!';
                            break;
                        }
                        break;
                    case 210311733:
                        if (currentName.equals(ResponseConstants.HAS_LARGE_BANNER)) {
                            c = JsonFactory.DEFAULT_QUOTE_CHAR;
                            break;
                        }
                        break;
                    case 265775609:
                        if (currentName.equals(ResponseConstants.ACCEPTS_BANK_TRANSFERS)) {
                            c = '#';
                            break;
                        }
                        break;
                    case 475124249:
                        if (currentName.equals(ResponseConstants.SELLER_AVATAR)) {
                            c = '$';
                            break;
                        }
                        break;
                    case 633718809:
                        if (currentName.equals("headline_machine_translated")) {
                            c = '%';
                            break;
                        }
                        break;
                    case 703243755:
                        if (currentName.equals(ResponseConstants.ACCEPTS_GIFT_CARD)) {
                            c = '&';
                            break;
                        }
                        break;
                    case 727431652:
                        if (currentName.equals(ResponseConstants.SOLD_COUNT)) {
                            c = '\'';
                            break;
                        }
                        break;
                    case 749610694:
                        if (currentName.equals(ResponseConstants.HAS_ABOUT_PAGE)) {
                            c = '(';
                            break;
                        }
                        break;
                    case 954925063:
                        if (currentName.equals("message")) {
                            c = ')';
                            break;
                        }
                        break;
                    case 997772038:
                        if (currentName.equals("message_machine_translated")) {
                            c = '*';
                            break;
                        }
                        break;
                    case 1077372678:
                        if (currentName.equals(ResponseConstants.GOOGLE_ANALYTICS_PROPERTY_ID)) {
                            c = '+';
                            break;
                        }
                        break;
                    case 1108728155:
                        if (currentName.equals(ResponseConstants.CURRENCY_CODE)) {
                            c = ',';
                            break;
                        }
                        break;
                    case 1179104006:
                        if (currentName.equals("shop_rating")) {
                            c = '-';
                            break;
                        }
                        break;
                    case 1227433863:
                        if (currentName.equals(ResponseConstants.MODULES)) {
                            c = ClassUtils.PACKAGE_SEPARATOR_CHAR;
                            break;
                        }
                        break;
                    case 1247787851:
                        if (currentName.equals(ResponseConstants.SELLER_NAME)) {
                            c = JsonPointer.SEPARATOR;
                            break;
                        }
                        break;
                    case 1250441326:
                        if (currentName.equals(ResponseConstants.HAS_PUBLISHED_STRUCTURED_REFUNDS_POLICY)) {
                            c = '0';
                            break;
                        }
                        break;
                    case 1346120344:
                        if (currentName.equals(ResponseConstants.ACCEPTS_MONEY_ORDERS)) {
                            c = '1';
                            break;
                        }
                        break;
                    case 1358074518:
                        if (currentName.equals(ResponseConstants.ONBOARDING_STATUS)) {
                            c = '2';
                            break;
                        }
                        break;
                    case 1481071862:
                        if (currentName.equals(ResponseConstants.COUNTRY_CODE)) {
                            c = '3';
                            break;
                        }
                        break;
                    case 1545855107:
                        if (currentName.equals(ResponseConstants.OPEN_DATE)) {
                            c = '4';
                            break;
                        }
                        break;
                    case 1675802800:
                        if (currentName.equals(ResponseConstants.LARGE_BANNER)) {
                            c = '5';
                            break;
                        }
                        break;
                    case 1679861873:
                        if (currentName.equals(ResponseConstants.HAS_BANNER)) {
                            c = '6';
                            break;
                        }
                        break;
                    case 1731047790:
                        if (currentName.equals(ResponseConstants.IS_USING_STRUCTURED_POLICIES)) {
                            c = '7';
                            break;
                        }
                        break;
                    case 1736706526:
                        if (currentName.equals(ResponseConstants.STORY_HEADLINE)) {
                            c = '8';
                            break;
                        }
                        break;
                    case 1750359266:
                        if (currentName.equals(ResponseConstants.HAS_LANGUGAE_PREFERENCES)) {
                            c = '9';
                            break;
                        }
                        break;
                    case 1857491244:
                        if (currentName.equals(ResponseConstants.MESSAGE_UPDATE_DATE)) {
                            c = ':';
                            break;
                        }
                        break;
                    case 1873208844:
                        if (currentName.equals("star_seller")) {
                            c = ';';
                            break;
                        }
                        break;
                    case 1874097746:
                        if (currentName.equals(ResponseConstants.IS_VACATION)) {
                            c = '<';
                            break;
                        }
                        break;
                    case 1880344578:
                        if (currentName.equals(ResponseConstants.PULL_QUOTE)) {
                            c = '=';
                            break;
                        }
                        break;
                    case 1901043637:
                        if (currentName.equals("location")) {
                            c = '>';
                            break;
                        }
                        break;
                    case 1903626779:
                        if (currentName.equals(ResponseConstants.ACTIVE_LISTING_COUNT)) {
                            c = RFC1522Codec.SEP;
                            break;
                        }
                        break;
                    case 2031429119:
                        if (currentName.equals(ResponseConstants.AVERAGE_RATING)) {
                            c = '@';
                            break;
                        }
                        break;
                    case 2046295464:
                        if (currentName.equals("vacation_message_machine_translated")) {
                            c = 'A';
                            break;
                        }
                        break;
                    case 2067081988:
                        if (currentName.equals("shop_id")) {
                            c = 'B';
                            break;
                        }
                        break;
                    case 2072350053:
                        if (currentName.equals(ResponseConstants.HAS_OWNERS)) {
                            c = 'C';
                            break;
                        }
                        break;
                    case 2082110527:
                        if (currentName.equals(ResponseConstants.IS_OPEN)) {
                            c = 'D';
                            break;
                        }
                        break;
                    case 2138246827:
                        if (currentName.equals(ResponseConstants.STORY_LEADING_PARAGRAPH)) {
                            c = 'E';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.mShopName = BaseModel.parseString(jsonParser);
                        break;
                    case 1:
                        this.mAboutInfoExists = jsonParser.getValueAsBoolean();
                        break;
                    case 2:
                        this.mHasPrivateReceiptInfo = jsonParser.getValueAsBoolean();
                        break;
                    case 3:
                        this.mAcceptsChecks = jsonParser.getValueAsBoolean();
                        break;
                    case 4:
                        this.mListingRearrangeEnabled = jsonParser.getValueAsBoolean();
                        break;
                    case 5:
                        this.mAcceptsOther = jsonParser.getValueAsBoolean();
                        break;
                    case 6:
                        this.mAcceptsPayPal = jsonParser.getValueAsBoolean();
                        break;
                    case 7:
                        this.mBanner = (Image) BaseModel.parseObject(jsonParser, Image.class);
                        break;
                    case 8:
                        this.mHasCurrencyCode = jsonParser.getValueAsBoolean();
                        break;
                    case 9:
                        this.mVacationMessage = BaseModel.parseString(jsonParser);
                        break;
                    case 10:
                        this.mHeadline = BaseModel.parseString(jsonParser);
                        break;
                    case 11:
                        this.mFavoritesCount = jsonParser.getValueAsInt();
                        break;
                    case 12:
                        this.mBannerUrl = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 13:
                        this.mRegion = BaseModel.parseString(jsonParser);
                        break;
                    case 14:
                        this.mDigitalListingCount = jsonParser.getValueAsInt();
                        break;
                    case 15:
                        this.mStatus = BaseModel.parseString(jsonParser);
                        break;
                    case 16:
                        this.mShopLanguages = BaseModel.parseArray(jsonParser, Language.class);
                        break;
                    case 17:
                        this.mUpdateDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    case 18:
                        this.mCreateDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    case 19:
                        this.mBrandingOption = jsonParser.getValueAsInt();
                        break;
                    case 20:
                        this.mShopUrl = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 21:
                        this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 22:
                        this.mLatitude = jsonParser.getValueAsDouble();
                        break;
                    case 23:
                        this.mLongitude = jsonParser.getValueAsDouble();
                        break;
                    case 24:
                        this.mUrl = BaseModel.parseStringURL(jsonParser);
                        break;
                    case 25:
                        this.mCity = BaseModel.parseString(jsonParser);
                        break;
                    case 26:
                        this.mShopIcon = (ShopIconV3) BaseModel.parseObject(jsonParser, ShopIconV3.class);
                        break;
                    case 27:
                        this.mName = BaseModel.parseString(jsonParser);
                        break;
                    case 28:
                        this.mHasAbout = jsonParser.getValueAsBoolean();
                        break;
                    case 29:
                        this.mOwner = (User) BaseModel.parseObject(jsonParser, User.class);
                        break;
                    case 30:
                        this.mAcceptsDirectCheckout = jsonParser.getValueAsBoolean();
                        break;
                    case 31:
                        this.mTotalRatingCount = jsonParser.getValueAsInt();
                        break;
                    case ' ':
                        this.mStory = BaseModel.parseString(jsonParser);
                        break;
                    case '!':
                        this.mHasIcon = jsonParser.getValueAsBoolean();
                        break;
                    case '\"':
                        this.mHasLargeBanner = jsonParser.getValueAsBoolean();
                        break;
                    case '#':
                        this.mAcceptsBankTransfers = jsonParser.getValueAsBoolean();
                        break;
                    case '$':
                        this.mSellerAvatarUrl = BaseModel.parseStringURL(jsonParser);
                        break;
                    case '%':
                        this.headlineTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case '&':
                        this.mAcceptsGiftCards = jsonParser.getValueAsBoolean();
                        break;
                    case '\'':
                        this.mSoldCount = jsonParser.getValueAsInt();
                        break;
                    case '(':
                        this.mHasAboutPage = jsonParser.getValueAsBoolean();
                        break;
                    case ')':
                        this.mMessage = BaseModel.parseString(jsonParser);
                        break;
                    case '*':
                        this.messageTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case '+':
                        this.mGoogleAnalyticsPropertyId = BaseModel.parseString(jsonParser);
                        break;
                    case ',':
                        this.mCurrencyCode = BaseModel.parseString(jsonParser);
                        break;
                    case '-':
                        this.shopRating = (ShopRating) BaseModel.parseObject(jsonParser, ShopRating.class);
                        break;
                    case '.':
                        this.mModules = BaseModel.parseStringArray(jsonParser);
                        break;
                    case '/':
                        this.mSellerName = BaseModel.parseString(jsonParser);
                        break;
                    case '0':
                        this.mHasPublishedStructuredRefundsPolicy = jsonParser.getValueAsBoolean();
                        break;
                    case '1':
                        this.mAcceptsMoneyOrders = jsonParser.getValueAsBoolean();
                        break;
                    case '2':
                        this.mOnboardingStatus = BaseModel.parseString(jsonParser);
                        break;
                    case '3':
                        this.mCountryCode = BaseModel.parseString(jsonParser);
                        break;
                    case '4':
                        this.mOpenDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    case '5':
                        this.mLargeBanner = (Image) BaseModel.parseObject(jsonParser, Image.class);
                        break;
                    case '6':
                        this.mHasBanner = jsonParser.getValueAsBoolean();
                        break;
                    case '7':
                        this.mIsUsingStructuredPolicies = jsonParser.getValueAsBoolean();
                        break;
                    case '8':
                        this.mStoryHeadline = BaseModel.parseString(jsonParser);
                        break;
                    case '9':
                        this.mHasLanguagePreferences = jsonParser.getValueAsBoolean();
                        break;
                    case ':':
                        this.mMessageUpdateDate = BaseModel.parseIntoDate(jsonParser);
                        break;
                    case ';':
                        this.starSeller = (StarSeller) BaseModel.parseObject(jsonParser, StarSeller.class);
                        break;
                    case '<':
                        this.mIsVacation = jsonParser.getValueAsBoolean();
                        break;
                    case '=':
                        this.mPullQuote = BaseModel.parseString(jsonParser);
                        break;
                    case '>':
                        this.mLocation = BaseModel.parseString(jsonParser);
                        break;
                    case '?':
                        this.mActiveListingCount = jsonParser.getValueAsInt();
                        break;
                    case '@':
                        this.mAverageRating = jsonParser.getValueAsDouble();
                        break;
                    case 'A':
                        this.vacationMessageTranslated = BaseModel.parseString(jsonParser);
                        break;
                    case 'B':
                        this.mShopId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                        break;
                    case 'C':
                        this.mHasOwners = jsonParser.getValueAsBoolean();
                        break;
                    case 'D':
                        this.mIsOpen = jsonParser.getValueAsBoolean();
                        break;
                    case 'E':
                        this.mStoryLeadingParagraph = BaseModel.parseString(jsonParser);
                        break;
                    default:
                        jsonParser.skipChildren();
                        break;
                }
            }
        }
    }

    public void setShopId(EtsyId etsyId) {
        this.mShopId = etsyId;
    }

    public boolean shouldShowLargeBanner() {
        return this.mBrandingOption == 2 && this.mLargeBanner != null;
    }

    public static class Shareable implements ShopShareable {
        public String mHeadline = "";
        public EtsyId mId;
        public String mShareImageUrl = "";
        public String mShareUrl = "";
        public String mShopName = "";

        public Shareable() {
        }

        public String getShareUrl() {
            return this.mShareUrl;
        }

        public Shareable(ShopV3 shopV3) {
            this.mShopName = shopV3.getShopName();
            this.mHeadline = shopV3.getHeadline();
            this.mShareUrl = shopV3.getUrl();
            this.mShareImageUrl = shopV3.getShopIcon().getUrl();
            this.mId = shopV3.getShopId();
        }
    }
}
