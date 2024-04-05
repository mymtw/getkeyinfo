package p415of;

import com.etsy.android.lib.models.ReviewCarouselCard;
import com.etsy.android.lib.models.SignedOutMessageCard;
import com.etsy.android.lib.models.StyledBannerModel;
import com.etsy.android.lib.models.apiv3.Button;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.DeepLinkSegmentList;
import com.etsy.android.lib.models.apiv3.EditorialCard;
import com.etsy.android.lib.models.apiv3.ExploreBanner;
import com.etsy.android.lib.models.apiv3.ExploreHeader;
import com.etsy.android.lib.models.apiv3.FindsCard;
import com.etsy.android.lib.models.apiv3.ListReminder;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.apiv3.SearchSuggestion;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.models.apiv3.TaxonomyCategory;
import com.etsy.android.lib.models.apiv3.cart.CartCollageAlert;
import com.etsy.android.lib.models.apiv3.cart.CartGroup;
import com.etsy.android.lib.models.apiv3.cart.CartGroupDivider;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.lib.models.apiv3.cart.CartThankYouGroup;
import com.etsy.android.lib.models.apiv3.cart.EmptyCart;
import com.etsy.android.lib.models.apiv3.cart.HTMLText;
import com.etsy.android.lib.models.apiv3.cart.SavedCart;
import com.etsy.android.lib.models.apiv3.cart.SavedForLaterCarouselHeader;
import com.etsy.android.lib.models.apiv3.ordershippingstate.OrderShippingStatusCard;
import com.etsy.android.lib.models.apiv3.vespa.CardActionableItem;
import com.etsy.android.lib.models.apiv3.vespa.DeeplinkTableRow;
import com.etsy.android.lib.models.apiv3.vespa.Divider;
import com.etsy.android.lib.models.apiv3.vespa.FormattedListingCard;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTaxonomyCategory;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopic;
import com.etsy.android.lib.models.apiv3.vespa.FormattedTopicFirstFeatured;
import com.etsy.android.lib.models.apiv3.vespa.ImageBanner;
import com.etsy.android.lib.models.apiv3.vespa.LargeImageDeeplinkCard;
import com.etsy.android.lib.models.apiv3.vespa.NavigationalPageHeader;
import com.etsy.android.lib.models.apiv3.vespa.SavableSearchQuery;
import com.etsy.android.lib.models.apiv3.vespa.SearchBar;
import com.etsy.android.lib.models.apiv3.vespa.SizeableText;
import com.etsy.android.lib.models.finds.FindsModule;
import com.etsy.android.lib.models.finds.GiftCardBanner;
import com.etsy.android.lib.models.homescreen.MessageCard;
import com.etsy.android.lib.models.homescreen.RelatedTagLink;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;

/* renamed from: of.p */
public final class C13187p {

    /* renamed from: a */
    public static final Map<String, Class<? extends C13186o>> f29017a = C19294b0.m32562s0(new Pair(ShopCard.SHOP_CARD, ShopCard.class), new Pair("wideShopCard", ShopCard.class), new Pair("actionableItem", CardActionableItem.class), new Pair("listingCollection", Collection.class), new Pair("htmlText", HTMLText.class), new Pair("cartItem", CartGroupItem.class), new Pair("cartThankYouGroup", CartThankYouGroup.class), new Pair("cartGroup", CartGroup.class), new Pair("cartListing", SavedCart.class), new Pair("savedForLaterCard", SavedCart.class), new Pair("searchTerm", SearchSuggestion.class), new Pair(SearchSuggestion.WITH_IMAGE_ITEM_TYPE, SearchSuggestion.class), new Pair("exploreHeader", ExploreHeader.class), new Pair(ListingCard.LISTING_CARD_ITEM_TYPE, ListingCard.class), new Pair(ListingCard.ANCHOR_LISTING_ITEM_TYPE, ListingCard.class), new Pair(ListingCard.DISCOVER_LISTING_ITEM_TYPE, ListingCard.class), new Pair("taxonomyCategory", TaxonomyCategory.class), new Pair("taxonomyNode", TaxonomyCategory.class), new Pair(MessageCard.ITEM_TYPE, MessageCard.class), new Pair("giftCardBanner", GiftCardBanner.class), new Pair(ListReminder.LIST_CARD_ITEM_TYPE, ListReminder.class), new Pair("imageBanner", ImageBanner.class), new Pair(FormattedTopicFirstFeatured.ITEM_TYPE, FormattedTopicFirstFeatured.class), new Pair("sizeableText", SizeableText.class), new Pair(DeeplinkTableRow.ITEM_TYPE, DeeplinkTableRow.class), new Pair("formattedTaxonomyCategory", FormattedTaxonomyCategory.class), new Pair("searchBar", SearchBar.class), new Pair(FormattedListingCard.ITEM_TYPE, FormattedListingCard.class), new Pair("savableSearchQuery", SavableSearchQuery.class), new Pair(NavigationalPageHeader.ITEM_TYPE, NavigationalPageHeader.class), new Pair("divider", Divider.class), new Pair(FormattedTopic.ITEM_TYPE, FormattedTopic.class), new Pair("largeImageDeepLinkCard", LargeImageDeeplinkCard.class), new Pair("button", Button.class), new Pair(FindsModule.EDITORIAL, EditorialCard.class), new Pair(CardActionableItem.ELEMENT_EXPLORE_BANNER, ExploreBanner.class), new Pair("deeplinkSegmentList", DeepLinkSegmentList.class), new Pair("findsBanner", FindsCard.class), new Pair("smallFindsBanner", FindsCard.class), new Pair(CartGroupItem.ELEMENT_CART_GROUP_DIVIDER, CartGroupDivider.class), new Pair(CartGroupItem.ELEMENT_EMPTY_CART, EmptyCart.class), new Pair(CartGroupItem.ELEMENT_SAVED_FOR_LATER_CAROUSEL_HEADER, SavedForLaterCarouselHeader.class), new Pair("styledBanner", StyledBannerModel.class), new Pair(ReviewCarouselCard.REVIEW_CAROUSEL, ReviewCarouselCard.class), new Pair(RelatedTagLink.ITEM_TYPE, RelatedTagLink.class), new Pair(SignedOutMessageCard.SIGNED_OUT_CART_MESSAGE_CARD_TYPE, SignedOutMessageCard.class), new Pair("collageAlert", CartCollageAlert.class), new Pair(OrderShippingStatusCard.ORDER_SHIPPING_STATUS_CARD, OrderShippingStatusCard.class));
}
