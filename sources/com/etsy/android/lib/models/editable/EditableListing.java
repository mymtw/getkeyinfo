package com.etsy.android.lib.models.editable;

import android.text.TextUtils;
import com.etsy.android.lib.core.EtsyApplication;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.EtsyMoney;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.Category;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.TaxonomyNode;
import com.etsy.android.lib.models.apiv3.editable.EditableAttribute;
import com.etsy.android.lib.models.apiv3.editable.EditableInventoryValue;
import com.etsy.android.lib.models.apiv3.editable.ListingEditConstants;
import com.etsy.android.lib.models.apiv3.editable.ProductionPartner;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.models.enums.WhoMade;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class EditableListing extends Listing {
    public static final String CATEGORY_PATH_JOIN_STRING = " > ";
    public static final String FIELD_CATEGORY_PATH = "category_path";
    public static final String FIELD_ENDING_TSZ = "ending_tsz";
    public static final String FIELD_FEATURED_RANK = "featured_rank";
    public static final String FIELD_HAS_VARIATION_PRICING = "has_variation_pricing";
    public static final String FIELD_HAS_VARIATION_QUANTITY = "has_variation_quantity";
    public static final String FIELD_IMAGE_IDS = "image_ids";
    public static final String FIELD_IS_SUPPLY = "is_supply";
    public static final String FIELD_IS_WHOLESALE = "is_wholesale";
    public static final String FIELD_LAST_MODIFIED_TSZ = "last_modified_tsz";
    public static final String FIELD_MATERIALS = "materials";
    public static final String FIELD_PRODUCTION_PARTNER_IDS = "production_partner_ids";
    public static final String FIELD_RENEW = "renew";
    public static final String FIELD_SECTION_IDS = "section_ids";
    public static final String FIELD_SHIPPING_PROFILE_ID = "shipping_profile_id";
    public static final String FIELD_SHIPPING_TEMPLATE_ID = "shipping_template_id";
    public static final String FIELD_SUGGESTED_TAXONOMY_ID = "suggested_taxonomy_id";
    public static final String FIELD_TAGS = "tags";
    public static final String FIELD_TAXONOMY_PATH = "taxonomy_path";
    public static final String FIELD_TYPE = "type";
    public static final String FIELD_WHEN_MADE = "when_made";
    public static final String FIELD_WHO_MADE = "who_made";
    public static final String LISTING_ID_CUSTOM_ORDER_DRAFT = "-100";
    public static final String LISTING_ID_DEVICE_DRAFT = "-1";
    public static final String LISTING_TYPE_BOTH = "both";
    public static final String LISTING_TYPE_DOWNLOAD = "download";
    public static final String LISTING_TYPE_PHYSICAL = "physical";
    public static final String REQUEST_PARAM_PUBLISH = "publish";
    private static final long serialVersionUID = 5348433468850149081L;
    private boolean isVintage;
    public List<EditableAttribute> mAttributes = new ArrayList(0);
    private String mBuyerUserId = "";
    private boolean mCanWriteInventoryData = false;
    private Category mCategory;
    public ListingEditConstants mClientConstants;
    private String mConversationId = "";
    private Date mExpirationDate;
    private int mFeaturedRank;
    private boolean mHasImageEdits;
    private boolean mHasMachineLearnedTaxonomySuggestion = false;
    private boolean mHasPriceVariations;
    private boolean mHasQuantityVariations;
    private boolean mHasVariations;
    private boolean mInPersonEligible = false;
    private EditableInventoryValue mInventory;
    private EtsyMoney mInventoryMaxPrice = C8630b.f18964e.mo21250c();
    private EtsyMoney mInventoryMinPrice = C8630b.f18964e.mo21250c();
    private int mInventoryProductCount = -1;
    private boolean mIsInventoryBackwardsCompatible;
    private boolean mIsReserved;
    private boolean mIsSupply;
    private boolean mIsWholesale;
    private WhoMade mMaker;
    private final List<String> mMaterials = new ArrayList();
    public long mModifiedTsz;
    private boolean mNonTaxable;
    public List<ProductionPartner> mProductionPartners = new ArrayList();
    public List<EditableAttribute> mRequiredAttributes = new ArrayList(0);
    private final EtsyId mShippingProfileId = new EtsyId();
    private final EtsyId mShippingTemplateId = new EtsyId();
    public final EtsyId mShopSectionId = new EtsyId();
    private boolean mShouldAutoRenew = false;
    private String mSkuSummary = "";
    /* access modifiers changed from: private */
    public TaxonomyNode mSuggestedTaxonomyNode;
    private final List<String> mTags = new ArrayList();
    private TaxonomyNode mTaxonomyNode;
    public String mType = LISTING_TYPE_PHYSICAL;
    private String mVariationsSummary = "";
    private String mWhenMade = "";

    @Retention(RetentionPolicy.SOURCE)
    public @interface ListingType {
    }

    public static class TaxonomyParseState {
        public long mCategoryId = -1;
        public List<String> mCategoryPathList = new ArrayList();
        public long mSuggestedTaxonomyNodeId = -1;
        public long mTaxonomyNodeId = -1;
        public List<Integer> mTaxonomyPathIdList = new ArrayList();
        public List<String> mTaxonomyPathList = new ArrayList();

        public void setCategoryId(long j) {
            this.mCategoryId = j;
        }

        public void setCategoryPathList(List<String> list) {
            this.mCategoryPathList = list;
        }

        public void setSuggestedTaxonomyNodeId(long j) {
            this.mSuggestedTaxonomyNodeId = j;
        }

        public void setTaxonomyNodeId(long j) {
            this.mTaxonomyNodeId = j;
        }

        public void setTaxonomyPathIdList(List<Integer> list) {
            this.mTaxonomyPathIdList = list;
        }

        public void setTaxonomyPathList(List<String> list) {
            this.mTaxonomyPathList = list;
        }

        public void updateListing(EditableListing editableListing) {
            if (this.mTaxonomyNodeId != -1) {
                if (!this.mTaxonomyPathIdList.isEmpty()) {
                    editableListing.setTaxonomyNode(new TaxonomyNode(String.valueOf(this.mTaxonomyNodeId), this.mTaxonomyPathList, this.mTaxonomyPathIdList));
                } else {
                    editableListing.setTaxonomyNode(new TaxonomyNode(String.valueOf(this.mTaxonomyNodeId), this.mTaxonomyPathList));
                }
            }
            if (this.mCategoryId != -1) {
                editableListing.setCategory(new Category(String.valueOf(this.mCategoryId), StringUtils.join((Iterable<?>) this.mCategoryPathList, EditableListing.CATEGORY_PATH_JOIN_STRING)));
            }
            if (this.mSuggestedTaxonomyNodeId != -1) {
                TaxonomyNode unused = editableListing.mSuggestedTaxonomyNode = new TaxonomyNode(String.valueOf(this.mSuggestedTaxonomyNodeId), this.mTaxonomyPathList);
            }
        }
    }

    public EditableListing() {
    }

    public static String getListingTypeForString(String str) {
        str.getClass();
        String str2 = LISTING_TYPE_BOTH;
        if (!str.equals(str2)) {
            str2 = LISTING_TYPE_DOWNLOAD;
            if (!str.equals(str2)) {
                return LISTING_TYPE_PHYSICAL;
            }
        }
        return str2;
    }

    public boolean canWriteInventoryData() {
        return this.mCanWriteInventoryData;
    }

    public List<EditableAttribute> getAttributes() {
        return this.mAttributes;
    }

    public String getBasePrice() {
        return this.mPrice.format();
    }

    public String getBasePriceUnformatted() {
        return this.mPrice.getAmount().toEngineeringString();
    }

    public String getBuyerUserId() {
        return this.mBuyerUserId;
    }

    public Category getCategory() {
        return this.mCategory;
    }

    public ListingEditConstants getClientConstants() {
        return this.mClientConstants;
    }

    public String getCommaSeparatedMaterials() {
        return this.mMaterials.size() > 0 ? TextUtils.join(",", this.mMaterials) : "";
    }

    public String getCommaSeparatedTags() {
        return this.mTags.size() > 0 ? TextUtils.join(",", this.mTags) : "";
    }

    public String getConversationId() {
        return this.mConversationId;
    }

    public String getEquivalentState() {
        return isEditState() ? Listing.INACTIVE_STATE : isOnVacation() ? "active" : this.mState;
    }

    public Date getExpirationDate() {
        return this.mExpirationDate;
    }

    public int getFeaturedRank() {
        return this.mFeaturedRank;
    }

    public EditableInventoryValue getInventory() {
        return this.mInventory;
    }

    public EtsyMoney getInventoryMaxPrice() {
        return this.mInventoryMaxPrice;
    }

    public EtsyMoney getInventoryMinPrice() {
        return this.mInventoryMinPrice;
    }

    public int getInventoryProductCount() {
        return this.mInventoryProductCount;
    }

    public long getLastModifiedTsz() {
        return this.mModifiedTsz;
    }

    public WhoMade getMaker() {
        return this.mMaker;
    }

    public List<String> getMaterials() {
        return this.mMaterials;
    }

    public List<ProductionPartner> getProductionPartners() {
        return this.mProductionPartners;
    }

    public String getProductionPartnersJson() {
        return ProductionPartner.getProductionPartnersJson(getProductionPartners());
    }

    public boolean getRenewalOptionChosen() {
        return this.mRenewalOptionChosen;
    }

    public List<EditableAttribute> getRequiredAttributes() {
        return this.mRequiredAttributes;
    }

    public EtsyId getSectionId() {
        return this.mShopSectionId;
    }

    public EtsyId getShippingProfileId() {
        return this.mShippingProfileId;
    }

    public EtsyId getShippingTemplateId() {
        return this.mShippingTemplateId;
    }

    public boolean getShouldAutoRenew() {
        return this.mShouldAutoRenew;
    }

    public String getSkuSummary() {
        return this.mSkuSummary;
    }

    public TaxonomyNode getSuggestedTaxonomyNode() {
        return this.mSuggestedTaxonomyNode;
    }

    public List<String> getTags() {
        return this.mTags;
    }

    public TaxonomyNode getTaxonomyNode() {
        return this.mTaxonomyNode;
    }

    public String getType() {
        return this.mType;
    }

    public String getVariationsSummary() {
        return this.mVariationsSummary;
    }

    public String getWhenMade() {
        return this.mWhenMade;
    }

    public boolean hasImageEdits() {
        return this.mHasImageEdits;
    }

    public boolean hasMachineLearnedTaxonomySuggestion() {
        return this.mHasMachineLearnedTaxonomySuggestion;
    }

    public boolean hasPriceVariations() {
        return this.mHasPriceVariations;
    }

    public boolean hasQuantityVariations() {
        return this.mHasQuantityVariations;
    }

    public boolean hasVariations() {
        return this.mHasVariations;
    }

    public boolean isActiveOrVacation() {
        return isActive() || isOnVacation();
    }

    public boolean isDeviceDraft() {
        return LISTING_ID_DEVICE_DRAFT.equalsIgnoreCase(this.mListingId.getId());
    }

    public boolean isInPersonEligible() {
        return this.mInPersonEligible;
    }

    public boolean isInactiveAndExpired() {
        return isInactiveOrEdit() && this.mExpirationDate.getTime() < System.currentTimeMillis();
    }

    public boolean isInventoryBackwardsCompatible() {
        return this.mIsInventoryBackwardsCompatible;
    }

    public boolean isReserved() {
        return this.mIsReserved;
    }

    public boolean isSupply() {
        return this.mIsSupply;
    }

    public boolean isTaxable() {
        return !this.mNonTaxable;
    }

    public boolean isVintage() {
        return this.isVintage;
    }

    public boolean isWholesale() {
        return this.mIsWholesale;
    }

    public void parseData(JsonParser jsonParser) throws IOException {
        TaxonomyParseState taxonomyParseState = new TaxonomyParseState();
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (jsonParser.getCurrentToken() != JsonToken.VALUE_NULL) {
                parseEditableListingField(jsonParser, taxonomyParseState, currentName);
            }
        }
        taxonomyParseState.updateListing(this);
        setInventorySummaries();
    }

    public void parseEditableListingField(JsonParser jsonParser, TaxonomyParseState taxonomyParseState, String str) throws IOException {
        if (FIELD_WHO_MADE.equals(str)) {
            this.mMaker = WhoMade.getEnumForJson(BaseModel.parseString(jsonParser));
        } else if (FIELD_IS_SUPPLY.equals(str)) {
            this.mIsSupply = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.NON_TAXABLE.equals(str)) {
            this.mNonTaxable = jsonParser.getValueAsBoolean();
        } else if (FIELD_WHEN_MADE.equals(str)) {
            this.mWhenMade = BaseModel.parseString(jsonParser);
        } else if (ResponseConstants.CATEGORY_ID.equals(str)) {
            taxonomyParseState.setCategoryId(jsonParser.getValueAsLong());
        } else if (FIELD_FEATURED_RANK.equals(str)) {
            this.mFeaturedRank = jsonParser.getValueAsInt();
        } else if (ResponseConstants.SHOP_SECTION_ID.equals(str) || "section_id".equals(str)) {
            this.mShopSectionId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if (ResponseConstants.SHOULD_AUTO_RENEW.equals(str)) {
            this.mShouldAutoRenew = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IN_PERSON_ELIGIBLE.equals(str)) {
            this.mInPersonEligible = jsonParser.getValueAsBoolean();
        } else if (FIELD_LAST_MODIFIED_TSZ.equals(str)) {
            this.mModifiedTsz = jsonParser.getValueAsLong();
        } else if (FIELD_SHIPPING_TEMPLATE_ID.equals(str)) {
            this.mShippingTemplateId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if (FIELD_SHIPPING_PROFILE_ID.equals(str)) {
            this.mShippingProfileId.setId(BaseModel.parseStringIdOrNumericValue(jsonParser));
        } else if (FIELD_ENDING_TSZ.equals(str)) {
            this.mExpirationDate = BaseModel.parseIntoDate(jsonParser);
        } else if (FIELD_TAGS.equals(str)) {
            setTags(BaseModel.parseStringArray(jsonParser));
        } else if (FIELD_MATERIALS.equals(str)) {
            setMaterials(BaseModel.parseStringArray(jsonParser));
        } else if (FIELD_CATEGORY_PATH.equals(str)) {
            taxonomyParseState.setCategoryPathList(BaseModel.parseRawStringArray(jsonParser));
        } else if (ResponseConstants.HAS_VARIATIONS.equals(str)) {
            this.mHasVariations = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.TAXONOMY_ID.equals(str)) {
            taxonomyParseState.setTaxonomyNodeId(jsonParser.getValueAsLong());
        } else if (FIELD_TAXONOMY_PATH.equals(str)) {
            taxonomyParseState.setTaxonomyPathList(BaseModel.parseRawStringArray(jsonParser));
        } else if (FIELD_SUGGESTED_TAXONOMY_ID.equals(str)) {
            taxonomyParseState.setSuggestedTaxonomyNodeId(jsonParser.getValueAsLong());
        } else if (FIELD_IS_WHOLESALE.equals(str)) {
            this.mIsWholesale = jsonParser.getValueAsBoolean();
        } else if (FIELD_HAS_VARIATION_PRICING.equals(str)) {
            this.mHasPriceVariations = jsonParser.getValueAsBoolean();
        } else if (FIELD_HAS_VARIATION_QUANTITY.equals(str)) {
            this.mHasQuantityVariations = jsonParser.getValueAsBoolean();
        } else if ("type".equals(str)) {
            this.mType = getListingTypeForString(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.IS_INVENTORY_BACKWARDS_COMPATIBLE.equals(str)) {
            this.mIsInventoryBackwardsCompatible = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.INVENTORY_MAX_PRICE.equals(str)) {
            this.mInventoryMaxPrice = this.mPrice.withAmount(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.INVENTORY_MIN_PRICE.equals(str)) {
            this.mInventoryMinPrice = this.mPrice.withAmount(BaseModel.parseString(jsonParser));
        } else if (ResponseConstants.INVENTORY_PRODUCT_COUNT.equals(str)) {
            this.mInventoryProductCount = jsonParser.getValueAsInt();
        } else if (ResponseConstants.CAN_WRITE_INVENTORY_DATA.equals(str)) {
            this.mCanWriteInventoryData = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.IS_RESERVED.equals(str)) {
            this.mIsReserved = jsonParser.getValueAsBoolean();
        } else if (ResponseConstants.BUYER_USER_ID.equals(str)) {
            this.mBuyerUserId = BaseModel.parseStringIdOrNumericValue(jsonParser);
        } else if (ResponseConstants.CONVERSATION_ID.equals(str)) {
            this.mConversationId = BaseModel.parseStringIdOrNumericValue(jsonParser);
        } else {
            parseListingField(jsonParser, str);
        }
    }

    public void setAttributes(List<EditableAttribute> list) {
        this.mAttributes = list;
    }

    public void setBuyerUserId(String str) {
        this.mBuyerUserId = str;
    }

    public void setCanWriteInventoryData(boolean z) {
        this.mCanWriteInventoryData = z;
    }

    public void setCategory(Category category) {
        this.mCategory = category;
    }

    public void setConversationId(String str) {
        this.mConversationId = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setEtsyMoneyPrice(EtsyMoney etsyMoney) {
        this.mPrice = etsyMoney;
    }

    public void setExpirationDate(long j) {
        Date date = new Date();
        this.mExpirationDate = date;
        date.setTime(j);
    }

    public void setFeaturedRank(int i) {
        this.mFeaturedRank = i;
    }

    public void setHasImageEdits(boolean z) {
        this.mHasImageEdits = z;
    }

    public void setHasMachineLearnedTaxonomySuggestion(boolean z) {
        this.mHasMachineLearnedTaxonomySuggestion = z;
    }

    public void setHasPriceVariations(boolean z) {
        this.mHasPriceVariations = z;
    }

    public void setHasQuantityVariations(boolean z) {
        this.mHasQuantityVariations = z;
    }

    public void setHasVariations(boolean z) {
        this.mHasVariations = z;
    }

    public void setInventory(EditableInventoryValue editableInventoryValue) {
        this.mInventory = editableInventoryValue;
    }

    public void setInventoryBackwardsCompatible(boolean z) {
        this.mIsInventoryBackwardsCompatible = z;
    }

    public void setInventoryMaxPrice(String str) {
        this.mInventoryMaxPrice = C8630b.f18964e.mo21248a(str, getCurrencyCode());
    }

    public void setInventoryMinPrice(String str) {
        this.mInventoryMinPrice = C8630b.f18964e.mo21248a(str, getCurrencyCode());
    }

    public void setInventoryProductCount(int i) {
        this.mInventoryProductCount = i;
    }

    public void setInventorySummaries() {
        EditableInventoryValue editableInventoryValue = this.mInventory;
        if (editableInventoryValue != null) {
            this.mSkuSummary = EditableInventoryValue.getSkuSummary(editableInventoryValue, EtsyApplication.get());
            this.mVariationsSummary = EditableInventoryValue.getVariationsSummary(this.mInventory, EtsyApplication.get());
        }
    }

    public void setIsDigitalDownload(boolean z) {
        this.mIsDigitalDownload = z;
    }

    public void setIsInPersonEligible(boolean z) {
        this.mInPersonEligible = z;
    }

    public void setIsSupply(boolean z) {
        this.mIsSupply = z;
    }

    public void setIsTaxable(boolean z) {
        this.mNonTaxable = !z;
    }

    public void setIsVintage(boolean z) {
        this.isVintage = z;
    }

    public void setIsWholesale(boolean z) {
        this.mIsWholesale = z;
    }

    public void setMaker(WhoMade whoMade) {
        this.mMaker = whoMade;
    }

    public void setMaterials(List<String> list) {
        this.mMaterials.clear();
        this.mMaterials.addAll(list);
    }

    public void setPriceAndCurrency(String str, String str2) {
        EtsyMoney withAmount = this.mPrice.withAmount(str);
        this.mPrice = withAmount;
        this.mPrice = withAmount.withCurrency(str2);
    }

    public void setProcessingMax(int i) {
        this.mProcessingMax = i;
    }

    public void setProcessingMin(int i) {
        this.mProcessingMin = i;
    }

    public void setProductionPartners(List<ProductionPartner> list) {
        this.mProductionPartners.clear();
        this.mProductionPartners.addAll(list);
    }

    public void setQuantity(int i) {
        this.mQuantity = i;
    }

    public void setRenewalOptionChosen(boolean z) {
        this.mRenewalOptionChosen = z;
    }

    public void setRequiredAttributes(List<EditableAttribute> list) {
        this.mRequiredAttributes = list;
    }

    public void setReserved(boolean z) {
        this.mIsReserved = z;
    }

    public void setSectionId(String str) {
        this.mShopSectionId.setId(str);
    }

    public void setShippingProfileId(String str) {
        this.mShippingProfileId.setId(str);
    }

    public void setShippingTemplateId(String str) {
        this.mShippingTemplateId.setId(str);
    }

    public void setShouldAutoRenew(boolean z) {
        this.mShouldAutoRenew = z;
    }

    public void setSkuSummary(String str) {
        this.mSkuSummary = str;
    }

    public void setState(String str) {
        this.mState = str;
    }

    public void setSuggestedTaxonomyNode(TaxonomyNode taxonomyNode) {
        this.mSuggestedTaxonomyNode = taxonomyNode;
    }

    public void setTags(List<String> list) {
        this.mTags.clear();
        this.mTags.addAll(list);
    }

    public void setTaxonomyNode(TaxonomyNode taxonomyNode) {
        this.mTaxonomyNode = taxonomyNode;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setVariationsSummary(String str) {
        this.mVariationsSummary = str;
    }

    public void setWhenMade(String str) {
        this.mWhenMade = str;
    }

    public static boolean isActiveOrVacation(String str) {
        return Listing.isActive(str) || Listing.isOnVacation(str);
    }

    public EditableListing(EtsyId etsyId, String str, String str2, String str3, String str4, int i) {
        super(etsyId, str, str2, str3, str4, i);
    }
}
