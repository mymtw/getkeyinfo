package com.etsy.android.p327ui.cardview.viewholders;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import com.etsy.android.lib.models.cardviewelement.IPageLink;
import com.etsy.android.lib.models.interfaces.IServerDrivenAction;
import com.etsy.android.p327ui.cardview.clickhandlers.C9120e;
import com.etsy.android.stylekit.accessibility.views.AccessibilityClassNames;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.FavHeartButton;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.vespa.IVespaListSectionHeader;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p260v0.C8184a;
import p396mb.C13046k;
import p404nb.C13100a;
import p435rb.C13351b;

/* renamed from: com.etsy.android.ui.cardview.viewholders.e */
public final class C9171e extends C12086e<IVespaListSectionHeader> {

    /* renamed from: c */
    public final C9120e f20189c;

    /* renamed from: d */
    public TextView f20190d;

    /* renamed from: e */
    public TextView f20191e;

    /* renamed from: f */
    public View f20192f;

    /* renamed from: g */
    public ListingFullImageView f20193g;

    /* renamed from: h */
    public FavHeartButton f20194h;

    /* renamed from: i */
    public C13046k f20195i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9171e(ViewGroup viewGroup, C9120e eVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.section_header_carded_with_arrow, viewGroup, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(eVar, "clickHandler");
        this.f20189c = eVar;
    }

    /* renamed from: a */
    public final void mo19450a(Object obj) {
        IVespaListSectionHeader iVespaListSectionHeader = (IVespaListSectionHeader) obj;
        C19383o.m32797g(iVespaListSectionHeader, "basicSectionHeader");
        BasicSectionHeader basicSectionHeader = (BasicSectionHeader) iVespaListSectionHeader;
        List<ListingCard> listingCards = basicSectionHeader.getListingCards();
        ListingCard listingCard = listingCards != null ? listingCards.get(0) : null;
        if (listingCard != null) {
            View view = this.itemView;
            View findViewById = view.findViewById(R.id.headerTitle);
            C19383o.m32796f(findViewById, "findViewById(R.id.headerTitle)");
            this.f20190d = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.favorite_button);
            C19383o.m32796f(findViewById2, "findViewById(R.id.favorite_button)");
            this.f20194h = (FavHeartButton) findViewById2;
            View findViewById3 = view.findViewById(R.id.listingText);
            C19383o.m32796f(findViewById3, "findViewById(R.id.listingText)");
            this.f20191e = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.headerTitle);
            C19383o.m32796f(findViewById4, "findViewById(R.id.headerTitle)");
            this.f20190d = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.headerImage);
            C19383o.m32796f(findViewById5, "findViewById(R.id.headerImage)");
            this.f20193g = (ListingFullImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.listingCard);
            C19383o.m32796f(findViewById6, "findViewById(R.id.listingCard)");
            this.f20192f = findViewById6;
            FavHeartButton favHeartButton = this.f20194h;
            if (favHeartButton != null) {
                boolean isFavorite = listingCard.isFavorite();
                String title = listingCard.getTitle();
                C19383o.m32796f(title, "listing.title");
                favHeartButton.setFav(isFavorite, title, false);
                favHeartButton.setOnClickListener(new C9164c(this, listingCard, favHeartButton));
                TextView textView = this.f20191e;
                if (textView != null) {
                    String title2 = listingCard.getTitle();
                    if (title2 == null) {
                        title2 = "";
                    }
                    textView.setText(title2);
                    ListingFullImageView listingFullImageView = this.f20193g;
                    if (listingFullImageView != null) {
                        listingFullImageView.setImageInfo(listingCard.getListingImage());
                        TextView textView2 = this.f20190d;
                        if (textView2 != null) {
                            textView2.setText(basicSectionHeader.getTitle());
                            if (basicSectionHeader.getPageLink() != null) {
                                TextView textView3 = this.f20190d;
                                if (textView3 != null) {
                                    C13351b.m21017a(textView3, (Integer) null);
                                } else {
                                    C19383o.m32805o("headerTitle");
                                    throw null;
                                }
                            }
                            View view2 = this.itemView;
                            StringBuilder sb = new StringBuilder();
                            TextView textView4 = this.f20190d;
                            if (textView4 != null) {
                                sb.append(textView4.getText());
                                sb.append(", ");
                                TextView textView5 = this.f20191e;
                                if (textView5 != null) {
                                    sb.append(textView5.getText());
                                    view2.setContentDescription(sb.toString());
                                    IServerDrivenAction action = iVespaListSectionHeader.getAction();
                                    IPageLink pageLink = iVespaListSectionHeader.getPageLink();
                                    if (action != null) {
                                        View view3 = this.itemView;
                                        Context context = view3.getContext();
                                        Object obj2 = C8184a.f17966a;
                                        view3.setBackground(C8184a.C8187c.m16466b(context, R.drawable.clg_touch_feedback));
                                        View view4 = this.itemView;
                                        C19383o.m32796f(view4, "itemView");
                                        ViewExtensions.m12866j(view4, new CardedHeaderWithArrowViewHolder$setClickHandler$1(this, action));
                                    } else if (pageLink != null) {
                                        View view5 = this.itemView;
                                        Context context2 = view5.getContext();
                                        Object obj3 = C8184a.f17966a;
                                        view5.setBackground(C8184a.C8187c.m16466b(context2, R.drawable.clg_touch_feedback));
                                        View view6 = this.itemView;
                                        C19383o.m32796f(view6, "itemView");
                                        ViewExtensions.m12866j(view6, new CardedHeaderWithArrowViewHolder$setClickHandler$2(this, pageLink));
                                        View view7 = this.itemView;
                                        C19383o.m32796f(view7, "itemView");
                                        ViewsExtensionsKt.m17423b(view7, AccessibilityClassNames.BUTTON);
                                        C13046k kVar = new C13046k(pageLink.getLinkTitle());
                                        this.f20195i = kVar;
                                        View view8 = this.itemView;
                                        C19383o.m32796f(view8, "itemView");
                                        C13100a.m20770a(view8, kVar);
                                    }
                                    View view9 = this.f20192f;
                                    if (view9 != null) {
                                        ViewExtensions.m12866j(view9, new CardedHeaderWithArrowViewHolder$setClickHandler$4(this, listingCard));
                                        View view10 = this.f20192f;
                                        if (view10 != null) {
                                            view10.setOnLongClickListener(new C9167d(this, listingCard));
                                        } else {
                                            C19383o.m32805o(ListingCard.LISTING_CARD_ITEM_TYPE);
                                            throw null;
                                        }
                                    } else {
                                        C19383o.m32805o(ListingCard.LISTING_CARD_ITEM_TYPE);
                                        throw null;
                                    }
                                } else {
                                    C19383o.m32805o("listingText");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("headerTitle");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("headerTitle");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o(ResponseConstants.IMAGE);
                        throw null;
                    }
                } else {
                    C19383o.m32805o("listingText");
                    throw null;
                }
            } else {
                C19383o.m32805o("favoriteButton");
                throw null;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: b */
    public final void mo31374b() {
        View view = this.itemView;
        view.setBackground((Drawable) null);
        view.setOnClickListener((View.OnClickListener) null);
        ViewsExtensionsKt.m17423b(view, AccessibilityClassNames.TEXT_VIEW);
        C13046k kVar = this.f20195i;
        if (kVar != null) {
            View view2 = this.itemView;
            C19383o.m32796f(view2, "itemView");
            C13100a.m20772c(view2, kVar);
        }
        FavHeartButton favHeartButton = this.f20194h;
        if (favHeartButton != null) {
            favHeartButton.setOnClickListener((View.OnClickListener) null);
            View view3 = this.f20192f;
            if (view3 != null) {
                view3.setOnClickListener((View.OnClickListener) null);
                View view4 = this.f20192f;
                if (view4 != null) {
                    view4.setOnLongClickListener((View.OnLongClickListener) null);
                } else {
                    C19383o.m32805o(ListingCard.LISTING_CARD_ITEM_TYPE);
                    throw null;
                }
            } else {
                C19383o.m32805o(ListingCard.LISTING_CARD_ITEM_TYPE);
                throw null;
            }
        } else {
            C19383o.m32805o("favoriteButton");
            throw null;
        }
    }
}
