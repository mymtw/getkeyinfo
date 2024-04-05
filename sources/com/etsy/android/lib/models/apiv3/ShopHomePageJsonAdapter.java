package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.Manufacturer;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopAbout;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.lib.models.finds.FindsModule;
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

public final class ShopHomePageJsonAdapter extends JsonAdapter<ShopHomePage> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ShopHomePage> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<CouponData> nullableCouponDataAdapter;
    private final JsonAdapter<List<FAQ>> nullableListOfFAQAdapter;
    private final JsonAdapter<List<ListingCard>> nullableListOfListingCardAdapter;
    private final JsonAdapter<List<Manufacturer>> nullableListOfManufacturerAdapter;
    private final JsonAdapter<List<ShopSection>> nullableListOfShopSectionAdapter;
    private final JsonAdapter<SellerDetails> nullableSellerDetailsAdapter;
    private final JsonAdapter<ShopAbout> nullableShopAboutAdapter;
    private final JsonAdapter<ShopHomeMemberData> nullableShopHomeMemberDataAdapter;
    private final JsonAdapter<ShopListingLevelReturnPolicies> nullableShopListingLevelReturnPoliciesAdapter;
    private final JsonAdapter<ShopPolicy> nullableShopPolicyAdapter;
    private final JsonAdapter<ShopReviewsResult> nullableShopReviewsResultAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<StructuredShopPolicies> nullableStructuredShopPoliciesAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.SHOP, "featured_listings", FindsModule.FIELD_SECTIONS, ResponseConstants.LISTING_CARDS, "listing_sort_order", ResponseConstants.REVIEWS, "shop_about", "manufacturers", ResponseConstants.POLICIES, "structured_policies", ResponseConstants.FAQ, "seller_details", "coupon_data", "member_data", "use_listing_level_return_policies", "return_policies", "includes_machine_translations");
    private final JsonAdapter<ShopV3> shopV3Adapter;

    public ShopHomePageJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.shopV3Adapter = yVar2.mo68558c(ShopV3.class, emptySet, ResponseConstants.SHOP);
        this.nullableListOfListingCardAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ListingCard.class), emptySet, "featuredListings");
        this.nullableListOfShopSectionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ShopSection.class), emptySet, "shopSections");
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "shopListingSortOrder");
        this.nullableShopReviewsResultAdapter = yVar2.mo68558c(ShopReviewsResult.class, emptySet, "shopReviews");
        this.nullableShopAboutAdapter = yVar2.mo68558c(ShopAbout.class, emptySet, "shopAbout");
        this.nullableListOfManufacturerAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Manufacturer.class), emptySet, "manufacturers");
        this.nullableShopPolicyAdapter = yVar2.mo68558c(ShopPolicy.class, emptySet, "shopPolicy");
        this.nullableStructuredShopPoliciesAdapter = yVar2.mo68558c(StructuredShopPolicies.class, emptySet, "structuredShopPolicies");
        this.nullableListOfFAQAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, FAQ.class), emptySet, "faqs");
        this.nullableSellerDetailsAdapter = yVar2.mo68558c(SellerDetails.class, emptySet, "sellerDetails");
        this.nullableCouponDataAdapter = yVar2.mo68558c(CouponData.class, emptySet, "couponData");
        this.nullableShopHomeMemberDataAdapter = yVar2.mo68558c(ShopHomeMemberData.class, emptySet, "memberData");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "useListingLevelReturnPolicies");
        this.nullableShopListingLevelReturnPoliciesAdapter = yVar2.mo68558c(ShopListingLevelReturnPolicies.class, emptySet, "returnPolicies");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "includesTranslations");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopHomePage)";
    }

    public ShopHomePage fromJson(JsonReader jsonReader) {
        String str;
        int i;
        JsonReader jsonReader2 = jsonReader;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i2 = -1;
        ShopV3 shopV3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str2 = null;
        ShopReviewsResult shopReviewsResult = null;
        ShopAbout shopAbout = null;
        List list4 = null;
        ShopPolicy shopPolicy = null;
        StructuredShopPolicies structuredShopPolicies = null;
        List list5 = null;
        SellerDetails sellerDetails = null;
        CouponData couponData = null;
        ShopHomeMemberData shopHomeMemberData = null;
        Boolean bool2 = null;
        ShopListingLevelReturnPolicies shopListingLevelReturnPolicies = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    shopV3 = this.shopV3Adapter.fromJson(jsonReader2);
                    if (shopV3 != null) {
                        continue;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.SHOP, ResponseConstants.SHOP, jsonReader2);
                    }
                case 1:
                    list = this.nullableListOfListingCardAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    continue;
                case 2:
                    list2 = this.nullableListOfShopSectionAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    continue;
                case 3:
                    list3 = this.nullableListOfListingCardAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    continue;
                case 4:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    shopReviewsResult = this.nullableShopReviewsResultAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    continue;
                case 6:
                    shopAbout = this.nullableShopAboutAdapter.fromJson(jsonReader2);
                    i2 &= -65;
                    continue;
                case 7:
                    list4 = this.nullableListOfManufacturerAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    shopPolicy = this.nullableShopPolicyAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    continue;
                case 9:
                    structuredShopPolicies = this.nullableStructuredShopPoliciesAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    list5 = this.nullableListOfFAQAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    continue;
                case 11:
                    sellerDetails = this.nullableSellerDetailsAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 12:
                    couponData = this.nullableCouponDataAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 13:
                    shopHomeMemberData = this.nullableShopHomeMemberDataAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 14:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 15:
                    shopListingLevelReturnPolicies = this.nullableShopListingLevelReturnPoliciesAdapter.fromJson(jsonReader2);
                    i = -32769;
                    break;
                case 16:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i = -65537;
                        break;
                    } else {
                        throw C18215a.m30734m("includesTranslations", "includes_machine_translations", jsonReader2);
                    }
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 != -131071) {
            Constructor<ShopHomePage> constructor = this.constructorRef;
            if (constructor == null) {
                str = ResponseConstants.SHOP;
                constructor = ShopHomePage.class.getDeclaredConstructor(new Class[]{ShopV3.class, List.class, List.class, List.class, String.class, ShopReviewsResult.class, ShopAbout.class, List.class, ShopPolicy.class, StructuredShopPolicies.class, List.class, SellerDetails.class, CouponData.class, ShopHomeMemberData.class, Boolean.class, ShopListingLevelReturnPolicies.class, Boolean.TYPE, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "ShopHomePage::class.java…his.constructorRef = it }");
            } else {
                str = ResponseConstants.SHOP;
            }
            Object[] objArr = new Object[19];
            if (shopV3 != null) {
                objArr[0] = shopV3;
                objArr[1] = list;
                objArr[2] = list2;
                objArr[3] = list3;
                objArr[4] = str2;
                objArr[5] = shopReviewsResult;
                objArr[6] = shopAbout;
                objArr[7] = list4;
                objArr[8] = shopPolicy;
                objArr[9] = structuredShopPolicies;
                objArr[10] = list5;
                objArr[11] = sellerDetails;
                objArr[12] = couponData;
                objArr[13] = shopHomeMemberData;
                objArr[14] = bool2;
                objArr[15] = shopListingLevelReturnPolicies;
                objArr[16] = bool;
                objArr[17] = Integer.valueOf(i2);
                objArr[18] = null;
                ShopHomePage newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            String str3 = str;
            throw C18215a.m30728g(str3, str3, jsonReader);
        } else if (shopV3 != null) {
            return new ShopHomePage(shopV3, list, list2, list3, str2, shopReviewsResult, shopAbout, list4, shopPolicy, structuredShopPolicies, list5, sellerDetails, couponData, shopHomeMemberData, bool2, shopListingLevelReturnPolicies, bool.booleanValue());
        } else {
            throw C18215a.m30728g(ResponseConstants.SHOP, ResponseConstants.SHOP, jsonReader2);
        }
    }

    public void toJson(C17412w wVar, ShopHomePage shopHomePage) {
        C19383o.m32797g(wVar, "writer");
        if (shopHomePage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.SHOP);
            this.shopV3Adapter.toJson(wVar, shopHomePage.getShop());
            wVar.mo68529h("featured_listings");
            this.nullableListOfListingCardAdapter.toJson(wVar, shopHomePage.getFeaturedListings());
            wVar.mo68529h(FindsModule.FIELD_SECTIONS);
            this.nullableListOfShopSectionAdapter.toJson(wVar, shopHomePage.getShopSections());
            wVar.mo68529h(ResponseConstants.LISTING_CARDS);
            this.nullableListOfListingCardAdapter.toJson(wVar, shopHomePage.getShopListings());
            wVar.mo68529h("listing_sort_order");
            this.nullableStringAdapter.toJson(wVar, shopHomePage.getShopListingSortOrder());
            wVar.mo68529h(ResponseConstants.REVIEWS);
            this.nullableShopReviewsResultAdapter.toJson(wVar, shopHomePage.getShopReviews());
            wVar.mo68529h("shop_about");
            this.nullableShopAboutAdapter.toJson(wVar, shopHomePage.getShopAbout());
            wVar.mo68529h("manufacturers");
            this.nullableListOfManufacturerAdapter.toJson(wVar, shopHomePage.getManufacturers());
            wVar.mo68529h(ResponseConstants.POLICIES);
            this.nullableShopPolicyAdapter.toJson(wVar, shopHomePage.getShopPolicy());
            wVar.mo68529h("structured_policies");
            this.nullableStructuredShopPoliciesAdapter.toJson(wVar, shopHomePage.getStructuredShopPolicies());
            wVar.mo68529h(ResponseConstants.FAQ);
            this.nullableListOfFAQAdapter.toJson(wVar, shopHomePage.getFaqs());
            wVar.mo68529h("seller_details");
            this.nullableSellerDetailsAdapter.toJson(wVar, shopHomePage.getSellerDetails());
            wVar.mo68529h("coupon_data");
            this.nullableCouponDataAdapter.toJson(wVar, shopHomePage.getCouponData());
            wVar.mo68529h("member_data");
            this.nullableShopHomeMemberDataAdapter.toJson(wVar, shopHomePage.getMemberData());
            wVar.mo68529h("use_listing_level_return_policies");
            this.nullableBooleanAdapter.toJson(wVar, shopHomePage.getUseListingLevelReturnPolicies());
            wVar.mo68529h("return_policies");
            this.nullableShopListingLevelReturnPoliciesAdapter.toJson(wVar, shopHomePage.getReturnPolicies());
            wVar.mo68529h("includes_machine_translations");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(shopHomePage.getIncludesTranslations()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
