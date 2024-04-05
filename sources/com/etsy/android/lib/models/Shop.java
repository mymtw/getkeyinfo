package com.etsy.android.lib.models;

import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FAQ;
import com.etsy.android.lib.models.apiv3.FAQs;
import com.etsy.android.lib.models.apiv3.SellerDetails;
import com.etsy.android.lib.models.apiv3.ShopIcon;
import com.etsy.android.lib.models.apiv3.StructuredShopPolicies;
import com.etsy.android.lib.models.apiv3.UserProfileV3;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.interfaces.ListingLike;
import com.etsy.android.lib.models.interfaces.ShopLike;
import com.etsy.android.lib.util.C8885d0;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C19543e0;

public class Shop extends BaseModel implements ShopLike {
    public static final String FIELD_HAS_TAX_PREFERENCES = "has_tax_preferences";
    public static final String STATUS_ACTIVE = "active";
    public static final String STATUS_FROZEN = "frozen";
    private static final long serialVersionUID = 8575542529938126511L;
    private boolean isEnrolledInBuyerPromise;
    private boolean isShopUsBased;
    private ShopAbout mAbout;
    private String mAnnouncement;
    private double mAverageRating;
    private Date mCreationDate;
    private String mCurrencyCode;
    private CustomShopsState mCustomShopsState;
    private int mDigitalListingCount;
    private FAQs mFaqs;
    private List<Listing> mFeatured;
    private boolean mHasOnboardedStructuredPolicies;
    private boolean mHasPrivateReceiptInfo;
    private boolean mHasTaxPreferences;
    private boolean mHasUnstructuredPolicies;
    private String mImageUrl760x100;
    private boolean mInPersonDisplayable;
    private String mInPersonReaderEligibility;
    private String mInPersonSellState;
    private boolean mIsDirectCheckoutOnboarded;
    private boolean mIsOnVacation;
    private boolean mIsUsingStructuredPolicies;
    private boolean mIsWholesaleOnly;
    private List<String> mLanguages;
    private int mListingActiveCount;
    private List<Listing> mListings;
    private String mLoginName;
    private int mNumFavorers;
    private int mNumRatings;
    private List<PaymentTemplate> mPaymentInfo;
    private String mPolicyAdditional;
    private String mPolicyPayment;
    private String mPolicyRefunds;
    private String mPolicyShipping;
    private String mPolicyWelcome;
    private List<ReceiptReview> mReceiptReviews;
    private String mSaleMessage;
    private List<ShopSection> mSections;
    private SellerDetails mSellerDetails;
    private ShopIcon mShopIcon;
    private EtsyId mShopId;
    private String mShopName;
    private String mShopOwnerName;
    private String mStatus;
    private StructuredShopPolicies mStructuredPolicies;
    private String mTitle;
    private String mUrl;
    private User mUser;
    private EtsyId mUserId;
    private String mVacationMessage;
    private String sellerName;
    private UserProfileV3 shopUserProfile;

    public enum CustomShopsState {
        DISABLED(0),
        ENABLED(1),
        DELETED(2),
        PREVIEW(3),
        TRIAL(4),
        DC_DISABLED(5);
        
        private int state;

        private CustomShopsState(int i) {
            this.state = i;
        }

        public static CustomShopsState resolveCustomShopSate(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? DISABLED : DC_DISABLED : TRIAL : PREVIEW : DELETED : ENABLED : DISABLED;
        }

        public int getStateInt() {
            return this.state;
        }

        public boolean shouldShowCustomShopsContent() {
            return this == TRIAL || this == ENABLED;
        }
    }

    public Shop() {
        this.mStatus = "";
        this.mTitle = "";
        this.mShopName = "";
        this.mAnnouncement = "";
        this.mLoginName = "";
        this.mShopOwnerName = "";
        this.mUrl = "";
        this.mImageUrl760x100 = "";
        this.mVacationMessage = "";
        this.mSaleMessage = "";
        this.mCurrencyCode = "";
        this.sellerName = "";
        this.mPolicyWelcome = "";
        this.mPolicyPayment = "";
        this.mPolicyShipping = "";
        this.mPolicyRefunds = "";
        this.mPolicyAdditional = "";
        this.mInPersonDisplayable = false;
        initLists();
    }

    private void initLists() {
        this.mShopId = new EtsyId();
        this.mUserId = new EtsyId();
        this.mListings = new ArrayList(0);
        this.mFeatured = new ArrayList(0);
        this.mPaymentInfo = new ArrayList(0);
        this.mSections = new ArrayList(0);
        this.mReceiptReviews = new ArrayList(0);
        this.mLanguages = new ArrayList(0);
        this.mFaqs = new FAQs();
    }

    public boolean acceptsGiftCards() {
        for (PaymentTemplate allowCc : this.mPaymentInfo) {
            if (allowCc.getAllowCc()) {
                return true;
            }
        }
        return false;
    }

    public boolean containsReviewForListing(EtsyId etsyId) {
        ReceiptReview receiptReview;
        if (!C19543e0.m33306Y(getReceiptReviews()) || (receiptReview = getReceiptReviews().get(0)) == null) {
            return false;
        }
        return receiptReview.containsReviewForListing(etsyId);
    }

    public FAQ findFaqById(EtsyId etsyId) {
        Iterator it = this.mFaqs.iterator();
        while (it.hasNext()) {
            FAQ faq = (FAQ) it.next();
            if (faq.getFaqId().equals(etsyId)) {
                return faq;
            }
        }
        return null;
    }

    public ShopAbout getAbout() {
        return this.mAbout;
    }

    public String getAnnouncement() {
        return this.mAnnouncement;
    }

    public String getAvatarUrl() {
        return (getUser() == null || getUser().getProfile() == null) ? "" : getUser().getProfile().getImageUrl75x75();
    }

    public double getAverageRating() {
        return this.mAverageRating;
    }

    public List<? extends ListingLike> getCardListings() {
        if (getFeaturedListings().size() <= 0) {
            return new ArrayList(getListings());
        }
        ArrayList arrayList = new ArrayList(getListings());
        for (Listing remove : getFeaturedListings()) {
            arrayList.remove(remove);
        }
        arrayList.addAll(0, getFeaturedListings());
        return arrayList;
    }

    public String getCurrencyCode() {
        return this.mCurrencyCode;
    }

    public CustomShopsState getCustomShopsState() {
        return this.mCustomShopsState;
    }

    public int getDigitalListingCount() {
        return this.mDigitalListingCount;
    }

    public FAQs getFAQs() {
        return this.mFaqs;
    }

    public List<Listing> getFeaturedListings() {
        return this.mFeatured;
    }

    public String getFirstShopLanguageCode() {
        return this.mLanguages.size() > 0 ? this.mLanguages.get(0) : "";
    }

    public String getHeadline() {
        return this.mTitle;
    }

    public String getIconUrl(int i) {
        ShopIcon shopIcon = this.mShopIcon;
        if (shopIcon != null) {
            return shopIcon.getImageUrlForPixelWidth(i);
        }
        return null;
    }

    public String getIconUrlOrDefault(int i) {
        ShopIcon shopIcon = this.mShopIcon;
        return shopIcon != null ? shopIcon.getImageUrlForPixelWidth(i) : ShopIcon.getDefaultShopUrlForPixelWidth(i);
    }

    public String getImageUrl760x100() {
        return this.mImageUrl760x100;
    }

    public String getInPersonReaderEligibility() {
        return this.mInPersonReaderEligibility;
    }

    public String getInPersonSellState() {
        return this.mInPersonSellState;
    }

    public int getListingActiveCount() {
        return this.mListingActiveCount;
    }

    public List<Listing> getListings() {
        return this.mListings;
    }

    public String getLocation() {
        return (getUser() == null || getUser().getProfile() == null) ? "" : C8885d0.m17319c(getUser().getProfile());
    }

    public String getLoginName() {
        return this.mLoginName;
    }

    public String getMessageToBuyers() {
        return this.mSaleMessage;
    }

    public int getNumFavorers() {
        return this.mNumFavorers;
    }

    public int getNumRatings() {
        return this.mNumRatings;
    }

    public List<PaymentTemplate> getPaymentInfo() {
        return this.mPaymentInfo;
    }

    public String getPolicyAdditional() {
        return this.mPolicyAdditional;
    }

    public String getPolicyPayment() {
        return this.mPolicyPayment;
    }

    public String getPolicyRefunds() {
        return this.mPolicyRefunds;
    }

    public String getPolicyShipping() {
        return this.mPolicyShipping;
    }

    public String getPolicyWelcome() {
        return this.mPolicyWelcome;
    }

    public List<ReceiptReview> getReceiptReviews() {
        return this.mReceiptReviews;
    }

    public List<ShopSection> getSections() {
        return this.mSections;
    }

    public SellerDetails getSellerDetails() {
        return this.mSellerDetails;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public ShopIcon getShopIcon() {
        return this.mShopIcon;
    }

    public EtsyId getShopId() {
        return this.mShopId;
    }

    public String getShopName() {
        return this.mShopName;
    }

    public Date getShopOpenDate() {
        return this.mCreationDate;
    }

    public String getShopOwnerName() {
        return this.mShopOwnerName;
    }

    public UserProfileV3 getShopUserProfile() {
        return this.shopUserProfile;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public StructuredShopPolicies getStructuredPolicies() {
        return this.mStructuredPolicies;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public User getUser() {
        return this.mUser;
    }

    public EtsyId getUserId() {
        return this.mUserId;
    }

    public String getVacationMessage() {
        return this.mVacationMessage;
    }

    public boolean hasAbout() {
        ShopAbout shopAbout = this.mAbout;
        return shopAbout != null && (C8885d0.m17324h(shopAbout.getStoryHeadline()) || C8885d0.m17324h(this.mAbout.getStory()) || this.mAbout.getMembers().size() > 0);
    }

    public boolean hasAnnouncement() {
        return C8885d0.m17324h(this.mAnnouncement);
    }

    public boolean hasOnboardedStructuredPolicies() {
        return this.mHasOnboardedStructuredPolicies;
    }

    public boolean hasOnlyDigitalListings() {
        return getDigitalListingCount() > 0 && getListingActiveCount() == getDigitalListingCount();
    }

    public boolean hasPolicies() {
        return C8885d0.m17324h(this.mPolicyWelcome) || C8885d0.m17324h(this.mPolicyPayment) || C8885d0.m17324h(this.mPolicyShipping) || C8885d0.m17324h(this.mPolicyRefunds) || C8885d0.m17324h(this.mPolicyAdditional);
    }

    public boolean hasPrivateReceiptInfo() {
        return this.mHasPrivateReceiptInfo;
    }

    public boolean hasRatings() {
        return this.mNumRatings > 0;
    }

    public boolean hasTaxPreferences() {
        return this.mHasTaxPreferences;
    }

    public boolean hasUnstructuredPolicies() {
        return this.mHasUnstructuredPolicies;
    }

    public boolean isActive() {
        return "active".equalsIgnoreCase(this.mStatus);
    }

    public boolean isDirectCheckoutOnboarded() {
        return this.mIsDirectCheckoutOnboarded;
    }

    public boolean isEnrolledInBuyerPromise() {
        return this.isEnrolledInBuyerPromise;
    }

    public boolean isFrozen() {
        return STATUS_FROZEN.equalsIgnoreCase(this.mStatus);
    }

    public boolean isInPersonDisplayable() {
        return this.mInPersonDisplayable;
    }

    public boolean isOnVacation() {
        return this.mIsOnVacation;
    }

    public boolean isShopUsBased() {
        return this.isShopUsBased;
    }

    public boolean isUsingStructuredPolicies() {
        return this.mIsUsingStructuredPolicies;
    }

    public boolean isWholesaleOnly() {
        return this.mIsWholesaleOnly;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                if ("shop_id".equals(currentName)) {
                    this.mShopId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if ("user_id".equals(currentName)) {
                    this.mUserId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
                } else if (ResponseConstants.STATUS.equals(currentName)) {
                    this.mStatus = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.IS_VACATION.equals(currentName)) {
                    this.mIsOnVacation = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.VACATION_MESSAGE.equals(currentName)) {
                    this.mVacationMessage = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.SALE_MESSAGE.equals(currentName)) {
                    this.mSaleMessage = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.LISTING_ACTIVE_COUNT.equals(currentName)) {
                    this.mListingActiveCount = jsonParser.getValueAsInt();
                } else if (ResponseConstants.DIGITAL_LISTING_COUNT.equals(currentName)) {
                    this.mDigitalListingCount = jsonParser.getValueAsInt();
                } else if ("title".equals(currentName)) {
                    this.mTitle = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.SHOP_NAME.equals(currentName)) {
                    this.mShopName = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.ANNOUNCEMENT.equals(currentName)) {
                    this.mAnnouncement = BaseModel.parseString(jsonParser).trim();
                } else if ("login_name".equals(currentName)) {
                    this.mLoginName = BaseModel.parseString(jsonParser);
                } else if ("name".equals(currentName)) {
                    this.mShopOwnerName = BaseModel.parseString(jsonParser);
                } else if ("url".equals(currentName)) {
                    this.mUrl = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.IMAGE_URL_760X100.equals(currentName)) {
                    this.mImageUrl760x100 = BaseModel.parseStringURL(jsonParser);
                } else if (ResponseConstants.POLICY_WELCOME.equals(currentName)) {
                    this.mPolicyWelcome = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.POLICY_PAYMENT.equals(currentName)) {
                    this.mPolicyPayment = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.POLICY_REFUNDS.equals(currentName)) {
                    this.mPolicyRefunds = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.POLICY_SHIPPING.equals(currentName)) {
                    this.mPolicyShipping = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.POLICY_ADDITIONAL.equals(currentName)) {
                    this.mPolicyAdditional = BaseModel.parseString(jsonParser).trim();
                } else if (ResponseConstants.CURRENCY_CODE.equals(currentName)) {
                    this.mCurrencyCode = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.NUM_FAVORERS.equals(currentName)) {
                    this.mNumFavorers = jsonParser.getValueAsInt();
                } else if (ResponseConstants.TOTAL_RATING_COUNT.equals(currentName)) {
                    this.mNumRatings = jsonParser.getValueAsInt();
                } else if (ResponseConstants.AVERAGE_RATING.equals(currentName)) {
                    this.mAverageRating = jsonParser.getValueAsDouble();
                } else if (ResponseConstants.CREATION_TSZ.equals(currentName)) {
                    this.mCreationDate = BaseModel.parseIntoDate(jsonParser);
                } else if (ResponseConstants.LANGUAGES.equals(currentName)) {
                    this.mLanguages = BaseModel.parseStringArray(jsonParser);
                } else if (FIELD_HAS_TAX_PREFERENCES.equals(currentName)) {
                    this.mHasTaxPreferences = jsonParser.getValueAsBoolean();
                } else if ("user".equals(currentName)) {
                    this.shopUserProfile = (UserProfileV3) BaseModel.parseObject(jsonParser, UserProfileV3.class);
                } else if (ResponseConstants.Includes.USER.equals(currentName)) {
                    this.mUser = (User) BaseModel.parseObject(jsonParser, User.class);
                } else if (ResponseConstants.Includes.ABOUT.equals(currentName)) {
                    this.mAbout = (ShopAbout) BaseModel.parseObject(jsonParser, ShopAbout.class);
                } else if (ResponseConstants.Includes.LISTINGS.equals(currentName)) {
                    this.mListings = BaseModel.parseArray(jsonParser, Listing.class);
                } else if (ResponseConstants.Includes.DISPLAYED_FEATURED_LISTINGS.equals(currentName)) {
                    this.mFeatured = BaseModel.parseArray(jsonParser, Listing.class);
                } else if (ResponseConstants.Includes.PAYMENT_TEMPLATES.equals(currentName)) {
                    this.mPaymentInfo = BaseModel.parseArray(jsonParser, PaymentTemplate.class);
                } else if (ResponseConstants.Includes.SECTIONS.equals(currentName)) {
                    this.mSections = BaseModel.parseArray(jsonParser, ShopSection.class);
                } else if (ResponseConstants.Includes.REVIEWS.equals(currentName)) {
                    this.mReceiptReviews = BaseModel.parseArray(jsonParser, ReceiptReview.class);
                } else if (ResponseConstants.IN_PERSON_DISPLAYABLE.equals(currentName)) {
                    this.mInPersonDisplayable = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.IN_PERSON_SELL_STATE.equals(currentName)) {
                    this.mInPersonSellState = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.IN_PERSON_READER_ELIGIBILITY.equals(currentName)) {
                    this.mInPersonReaderEligibility = BaseModel.parseString(jsonParser);
                } else if (ResponseConstants.SHOP_ICON_URL_FULL.equals(currentName)) {
                    this.mShopIcon = new ShopIcon(BaseModel.parseStringURL(jsonParser));
                } else if (ResponseConstants.IS_USING_STRUCTURED_POLICIES.equals(currentName)) {
                    this.mIsUsingStructuredPolicies = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.HAS_ONBOARDED_STRUCTURED_POLICIES.equals(currentName)) {
                    this.mHasOnboardedStructuredPolicies = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.Includes.STRUCTURED_POLICIES.equals(currentName)) {
                    this.mStructuredPolicies = (StructuredShopPolicies) BaseModel.parseObject(jsonParser, StructuredShopPolicies.class);
                } else if (ResponseConstants.HAS_UNSTRUCTURED_POLICIES.equals(currentName)) {
                    this.mHasUnstructuredPolicies = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.Includes.SELLER_DETAILS.equals(currentName)) {
                    this.mSellerDetails = (SellerDetails) BaseModel.parseObject(jsonParser, SellerDetails.class);
                } else if (ResponseConstants.Includes.FAQ.equals(currentName)) {
                    this.mFaqs.clear();
                    this.mFaqs.addAll(BaseModel.parseArray(jsonParser, FAQ.class));
                } else if (ResponseConstants.HAS_PRIVATE_RECEIPT_INFO.equals(currentName)) {
                    this.mHasPrivateReceiptInfo = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.CUSTOM_SHOPS_STATE.equals(currentName)) {
                    this.mCustomShopsState = CustomShopsState.resolveCustomShopSate(jsonParser.getValueAsInt());
                } else if (ResponseConstants.IS_DIRECT_CHECKOUT_ONBOARDED.equals(currentName)) {
                    this.mIsDirectCheckoutOnboarded = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.IS_WHOLESALE_ONLY.equals(currentName)) {
                    this.mIsWholesaleOnly = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.SHOP_SHIPPING_PROMISE.equals(currentName)) {
                    this.isEnrolledInBuyerPromise = jsonParser.getValueAsBoolean();
                } else if (ResponseConstants.IS_SHOP_US_BASED.equals(currentName)) {
                    this.isShopUsBased = jsonParser.getBooleanValue();
                } else {
                    jsonParser.skipChildren();
                }
            }
        }
    }

    public void setAbout(ShopAbout shopAbout) {
        this.mAbout = shopAbout;
    }

    public void setAverageRating(double d) {
        this.mAverageRating = d;
    }

    public void setDigitalListingCount(int i) {
        this.mDigitalListingCount = i;
    }

    public void setFAQs(FAQs fAQs) {
        this.mFaqs = fAQs;
    }

    public void setIsEnrolledInBuyerPromise(boolean z) {
        this.isEnrolledInBuyerPromise = z;
    }

    public void setListingActiveCount(int i) {
        this.mListingActiveCount = i;
    }

    public void setLoginName(String str) {
        this.mLoginName = str;
    }

    public void setNumRatings(int i) {
        this.mNumRatings = i;
    }

    public void setPolicyAdditional(String str) {
        this.mPolicyAdditional = str;
    }

    public void setPolicyPayment(String str) {
        this.mPolicyPayment = str;
    }

    public void setPolicyRefunds(String str) {
        this.mPolicyRefunds = str;
    }

    public void setPolicyShipping(String str) {
        this.mPolicyShipping = str;
    }

    public void setPolicyWelcome(String str) {
        this.mPolicyWelcome = str;
    }

    public void setReceiptReviews(List<ReceiptReview> list) {
        this.mReceiptReviews = list;
    }

    public void setSellerDetails(SellerDetails sellerDetails) {
        this.mSellerDetails = sellerDetails;
    }

    public void setSellerName(String str) {
        this.sellerName = str;
    }

    public void setShopIcon(ShopIcon shopIcon) {
        this.mShopIcon = shopIcon;
    }

    public void setShopId(EtsyId etsyId) {
        this.mShopId = etsyId;
    }

    public void setShopName(String str) {
        this.mShopName = str;
    }

    public void setShopOwnerName(String str) {
        this.mShopOwnerName = str;
    }

    public void setShopUserProfile(UserProfileV3 userProfileV3) {
        this.shopUserProfile = userProfileV3;
    }

    public void setStatus(String str) {
        this.mStatus = str;
    }

    public void setStructuredPolicies(StructuredShopPolicies structuredShopPolicies) {
        this.mStructuredPolicies = structuredShopPolicies;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setUsShopBased(boolean z) {
        this.isShopUsBased = z;
    }

    public void setUser(User user) {
        this.mUser = user;
    }

    public void setUserId(EtsyId etsyId) {
        this.mUserId = etsyId;
    }

    public void setUsingStructuredPolicies(boolean z) {
        this.mIsUsingStructuredPolicies = z;
    }

    public HashMap<AnalyticsProperty, Object> getTrackingParameters() {
        HashMap<AnalyticsProperty, Object> hashMap = new HashMap<>(1);
        hashMap.put(PredefinedAnalyticsProperty.SHOP_ID, this.mShopId.getId());
        return hashMap;
    }

    public Shop(String str) {
        this.mStatus = "";
        this.mTitle = "";
        this.mAnnouncement = "";
        this.mLoginName = "";
        this.mShopOwnerName = "";
        this.mUrl = "";
        this.mImageUrl760x100 = "";
        this.mVacationMessage = "";
        this.mSaleMessage = "";
        this.mCurrencyCode = "";
        this.sellerName = "";
        this.mPolicyWelcome = "";
        this.mPolicyPayment = "";
        this.mPolicyShipping = "";
        this.mPolicyRefunds = "";
        this.mPolicyAdditional = "";
        this.mInPersonDisplayable = false;
        this.mShopName = str;
        initLists();
    }

    public Shop(EtsyId etsyId, EtsyId etsyId2, int i, boolean z, String str, String str2, String str3, String str4, ShopIcon shopIcon, int i2, double d, List<Listing> list, List<Listing> list2, List<String> list3) {
        this.mTitle = "";
        this.mAnnouncement = "";
        this.mLoginName = "";
        this.mShopOwnerName = "";
        this.mUrl = "";
        this.mVacationMessage = "";
        this.mSaleMessage = "";
        this.sellerName = "";
        this.mPolicyWelcome = "";
        this.mPolicyPayment = "";
        this.mPolicyShipping = "";
        this.mPolicyRefunds = "";
        this.mPolicyAdditional = "";
        this.mInPersonDisplayable = false;
        this.mShopId = etsyId;
        this.mUserId = etsyId2;
        this.mListingActiveCount = i;
        this.mIsOnVacation = z;
        this.mStatus = str;
        this.mShopName = str2;
        this.mImageUrl760x100 = str3;
        this.mCurrencyCode = str4;
        this.mShopIcon = shopIcon;
        this.mNumRatings = i2;
        this.mAverageRating = d;
        this.mListings = list;
        this.mFeatured = list2;
        this.mLanguages = list3;
    }
}
