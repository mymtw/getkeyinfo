package com.etsy.android.p327ui.shop;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0326j;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import com.etsy.android.lib.config.C8623e;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.ShopSection;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.cardview.clickhandlers.C9125j;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.p327ui.shop.homesection.C11151a;
import com.etsy.android.p327ui.shop.homesection.C11155e;
import com.etsy.android.p327ui.shop.homesection.C11156f;
import com.etsy.android.p327ui.shop.homesection.C11157g;
import com.etsy.android.p327ui.shop.homesection.C11158h;
import com.etsy.android.p327ui.shop.homesection.C11160j;
import com.etsy.android.p327ui.shop.homesection.C11161k;
import com.etsy.android.p327ui.shop.homesection.C11162l;
import com.etsy.android.p327ui.shop.homesection.C11164n;
import com.etsy.android.p327ui.shop.homesection.C11165o;
import com.etsy.android.p327ui.shop.homesection.C11166p;
import com.etsy.android.p327ui.shop.viewholder.C11257a;
import com.etsy.android.p327ui.shop.viewholder.C11259a0;
import com.etsy.android.p327ui.shop.viewholder.C11264b;
import com.etsy.android.p327ui.shop.viewholder.C11266c;
import com.etsy.android.p327ui.shop.viewholder.C11267c0;
import com.etsy.android.p327ui.shop.viewholder.C11269d0;
import com.etsy.android.p327ui.shop.viewholder.C11271e0;
import com.etsy.android.p327ui.shop.viewholder.C11273f0;
import com.etsy.android.p327ui.shop.viewholder.C11274g;
import com.etsy.android.p327ui.shop.viewholder.C11276h;
import com.etsy.android.p327ui.shop.viewholder.C11280j;
import com.etsy.android.p327ui.shop.viewholder.C11281j0;
import com.etsy.android.p327ui.shop.viewholder.C11284k0;
import com.etsy.android.p327ui.shop.viewholder.C11288m;
import com.etsy.android.p327ui.shop.viewholder.C11292o;
import com.etsy.android.p327ui.shop.viewholder.C11294q;
import com.etsy.android.p327ui.shop.viewholder.C11295r;
import com.etsy.android.p327ui.shop.viewholder.C11296s;
import com.etsy.android.p327ui.shop.viewholder.C11297t;
import com.etsy.android.p327ui.shop.viewholder.C11298u;
import com.etsy.android.p327ui.shop.viewholder.C11299v;
import com.etsy.android.p327ui.shop.viewholder.C11300w;
import com.etsy.android.p327ui.shop.viewholder.ShopFAQTranslationHeader;
import com.etsy.android.p327ui.shop.viewholder.ShopItemsRedesignedSearchViewHolder;
import com.etsy.android.uikit.text.ClickableSpanTouchListener;
import com.etsy.android.uikit.viewholder.C11991f;
import com.etsy.android.uikit.viewholder.C11997k;
import com.etsy.android.uikit.viewholder.C12001n;
import com.etsy.android.uikit.viewholder.C12007s;
import com.etsy.android.uikit.viewholder.C12008t;
import com.etsy.android.uikit.viewholder.C12016y;
import com.etsy.android.uikit.viewholder.ListingCardViewHolder;
import com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions;
import com.etsy.android.vespa.viewholders.C12086e;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p357gf.C12796e;
import p407nf.C13113a;
import p415of.C13171a;
import p415of.C13172b;
import p415of.C13179h;
import p415of.C13180i;
import p415of.C13182k;
import p423pf.C13240j;
import p425q9.C13265p;
import p438re.C13355a;
import p438re.C13356b;
import p438re.C13357c;
import p438re.C13361d;
import p460ue.C13499i;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.shop.v0 */
public final class C11249v0 extends C13172b {

    /* renamed from: j */
    public C11178m0 f24830j;

    /* renamed from: k */
    public C11192q0 f24831k;

    /* renamed from: l */
    public C13895a f24832l;

    /* renamed from: m */
    public C8703p f24833m;

    /* renamed from: n */
    public C12008t f24834n;

    /* renamed from: o */
    public C11192q0.C11193a f24835o;

    /* renamed from: p */
    public C8923u f24836p;

    /* renamed from: com.etsy.android.ui.shop.v0$a */
    public class C11250a extends C13171a {
        public C11250a(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            C11192q0.C11193a aVar = C11249v0.this.f24831k.f24741a;
            if (aVar != null) {
                aVar.loadMoreListings();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.shop.v0$b */
    public class C11251b extends C13171a {
        public C11251b(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            C11249v0.this.f24835o.navigateToAllReviews();
        }
    }

    /* renamed from: com.etsy.android.ui.shop.v0$c */
    public class C11252c extends C13171a<C13499i> {
        public C11252c(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            C11249v0.this.f24830j.mo36805c(((C13499i) obj).f29535a);
        }
    }

    /* renamed from: com.etsy.android.ui.shop.v0$d */
    public class C11253d extends C13171a {
        public C11253d(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            C11249v0.this.f24830j.mo36803a();
        }
    }

    /* renamed from: com.etsy.android.ui.shop.v0$e */
    public class C11254e extends C13361d {
        public C11254e(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            C13357c cVar = (C13357c) obj;
            if (cVar instanceof C13357c.C13358a) {
                C11249v0.this.f24830j.mo36803a();
            } else if (cVar instanceof C13357c.C13359b) {
                C11192q0.C11193a aVar = C11249v0.this.f24835o;
                if (aVar != null) {
                    aVar.performShopFavorite(((C13357c.C13359b) cVar).f29287a);
                }
            } else if (cVar instanceof C13357c.C13360c) {
                C13357c.C13360c cVar2 = (C13357c.C13360c) cVar;
                C11249v0.this.f28983b.mo21333d(cVar2.f29290c, (Map<? extends AnalyticsProperty, Object>) null);
                C11249v0.this.f24835o.showDetailsBottomSheet(cVar2.f29288a, cVar2.f29289b);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.shop.v0$f */
    public class C11255f extends C13171a<C11997k.C11998a> {
        public C11255f(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            C11249v0.this.f28983b.mo21333d("shop_section_view_all_tapped", (Map<? extends AnalyticsProperty, Object>) null);
            Object obj2 = ((C11997k.C11998a) obj).f26737d;
            if (obj2 instanceof ShopSection) {
                ShopSection shopSection = (ShopSection) obj2;
                C11249v0.this.f24830j.mo36804b(shopSection.getListingActiveCount(), shopSection.getShopSectionId().getId(), C11249v0.this.f24831k.mo36861a(shopSection.getTitle(), shopSection.getTitleTranslated()));
            }
        }
    }

    /* renamed from: com.etsy.android.ui.shop.v0$g */
    public class C11256g extends C13171a<C11259a0.C11260a> {
        public C11256g(Fragment fragment, C8703p pVar) {
            super(fragment, pVar);
        }

        /* renamed from: c */
        public final void mo31328c(Object obj) {
            C11259a0.C11260a aVar = (C11259a0.C11260a) obj;
            if (aVar instanceof C11259a0.C11260a.C11263c) {
                C11249v0.this.f28983b.mo21333d("shop_section_sticky_header_selection", (Map<? extends AnalyticsProperty, Object>) null);
            } else if (aVar instanceof C11259a0.C11260a.C11262b) {
                C11249v0.this.f28983b.mo21333d("shop_section_sticky_header_dismissed", (Map<? extends AnalyticsProperty, Object>) null);
            } else if (aVar instanceof C11259a0.C11260a.C11261a) {
                C11249v0.this.f28983b.mo21333d("shop_section_sticky_header_tapped", (Map<? extends AnalyticsProperty, Object>) null);
                ShopSection shopSection = ((C11259a0.C11260a.C11261a) aVar).f24867a;
                C11192q0 q0Var = C11249v0.this.f24831k;
                if (q0Var != null && shopSection != null) {
                    ShopSection shopSection2 = q0Var.f24746f;
                    q0Var.f24744d = "";
                    q0Var.f24745e = "";
                    if ((shopSection2 == null || !shopSection2.equals(shopSection)) && q0Var.f24747g.contains(shopSection)) {
                        q0Var.f24746f = shopSection;
                        C11192q0.C11193a aVar2 = q0Var.f24741a;
                        if (aVar2 != null) {
                            aVar2.didSelectSection(shopSection);
                            q0Var.f24741a.performScrollToSection(shopSection);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11249v0(Fragment fragment, C8703p pVar, C13180i iVar, C13895a aVar, C13265p pVar2, C8923u uVar, C12796e eVar) {
        super(new C13179h(fragment, pVar, iVar, (C13182k) null));
        C19383o.m32797g(fragment, "value");
        C19383o.m32797g(pVar, "value");
        this.f24832l = aVar;
        this.f24833m = pVar;
        this.f24836p = uVar;
        this.f24834n = new C12008t(fragment.requireActivity(), pVar, pVar.f19116n, pVar2, eVar);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: b */
    public final C12086e mo31854b(ViewGroup viewGroup, int i) {
        C12086e fVar;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        C8623e eVar = this.f28983b.f19116n;
        C19383o.m32797g(eVar, "configMap");
        Fragment d = mo45892d();
        if (i2 == R.id.view_type_shop_home_cover_photo) {
            return new C11264b(viewGroup2);
        }
        if (i2 == R.id.view_type_shop_home_icon) {
            return new C11273f0(viewGroup2);
        }
        if (i2 == R.id.view_type_shop_home_info) {
            return new C11292o(viewGroup2, this.f24830j, this.f24831k);
        }
        if (i2 == R.id.view_type_shop_home_info_redesign) {
            fVar = new C11288m(viewGroup2, (C13361d) mo45891c(i2), this.f24833m);
        } else if (i2 == R.id.view_type_shop_home_featured_listing) {
            C12008t tVar = this.f24834n;
            C19383o.m32797g(viewGroup2, ResponseConstants.PARENT);
            C19383o.m32797g(tVar, "dependencies");
            return new ListingCardViewHolder((C13113a) mo45891c(i2), false, false, tVar, new ListingCardViewHolderOptions.ShopHome("shop_home_featured_item", eVar), new C12007s(viewGroup2));
        } else if (i2 == R.id.view_type_shop_home_section_selector) {
            fVar = new C11259a0(viewGroup2, mo45891c(i2), this.f24831k);
        } else if (i2 == R.id.view_type_shop_home_section_header) {
            return new C11300w(viewGroup2, this.f24830j, this.f24831k, true);
        } else {
            if (i2 == R.id.view_type_shop_home_section_header_all_items) {
                return new C11300w(viewGroup2, this.f24830j, this.f24831k, false);
            }
            if (i2 == R.id.view_type_shop_home_section_footer) {
                fVar = new C11991f(viewGroup2, mo45891c(i2));
            } else if (i2 == R.id.view_type_shop_home_listing) {
                C12008t tVar2 = this.f24834n;
                C19383o.m32797g(viewGroup2, ResponseConstants.PARENT);
                C19383o.m32797g(tVar2, "dependencies");
                return new ListingCardViewHolder((C13113a) mo45891c(i2), false, false, tVar2, new ListingCardViewHolderOptions.ShopHome("shop_home_all_items", eVar), new C12007s(viewGroup2));
            } else if (i2 == R.id.view_type_shop_home_announcement_info) {
                return new C11276h(viewGroup2);
            } else {
                if (i2 == R.id.view_type_shop_home_announcement_content) {
                    fVar = new C11274g(viewGroup2, (C11266c) mo45891c(i2));
                } else if (i2 == R.id.view_type_shop_home_reviews_description) {
                    return new C11284k0(viewGroup2);
                } else {
                    if (i2 == R.id.view_type_shop_home_load_button_listings || i2 == R.id.view_type_shop_home_load_button_reviews) {
                        fVar = new C11991f(viewGroup2, mo45891c(i2));
                    } else if (i2 == R.id.view_type_shop_home_section_heading) {
                        return new C11158h(viewGroup2);
                    } else {
                        if (i2 == R.id.view_type_shop_home_about_images) {
                            return new C11155e(viewGroup2, this.f24830j, this.f24832l);
                        }
                        if (i2 == R.id.view_type_shop_home_section_content) {
                            C11269d0 d0Var = new C11269d0(viewGroup2, R.layout.shop_home_section_content_text, R.id.body_text_view, false);
                            d0Var.f24879c.setOnTouchListener(new ClickableSpanTouchListener());
                            return d0Var;
                        } else if (i2 == R.id.view_type_shop_home_related_link) {
                            fVar = new C11157g(viewGroup2, (C13240j) mo45891c(i2));
                        } else if (i2 == R.id.view_type_shop_home_subsection_heading) {
                            return new C11269d0(viewGroup2, R.layout.shop_home_subsection_title, R.id.title, false);
                        } else {
                            if (i2 == R.id.view_type_shop_home_heading_member || i2 == R.id.view_type_shop_home_heading_review_response || i2 == R.id.view_type_shop_home_heading_review || i2 == R.id.view_type_shop_home_heading_shop_owner) {
                                fVar = new C12001n(C0326j.m859c(viewGroup2, R.layout.horizontal_image_and_heading, viewGroup2, false), mo45891c(i2));
                            } else if (i2 == R.id.view_type_shop_home_structured_policies_shipping) {
                                return new C11165o(viewGroup2);
                            } else {
                                if (i2 == R.id.view_type_shop_home_structured_policies_downloads) {
                                    return new C12086e(C0326j.m859c(viewGroup2, R.layout.structured_policies_section_downloads, viewGroup2, false));
                                }
                                if (i2 == R.id.view_type_shop_home_structured_policies_payments) {
                                    fVar = new C11162l(viewGroup2, (C13356b) mo45891c(i2));
                                } else if (i2 == R.id.view_type_shop_home_policies_refunds) {
                                    fVar = new C11151a(viewGroup2, (C13356b) mo45891c(i2));
                                } else if (i2 == R.id.view_type_shop_home_hybrid_policies_refunds) {
                                    fVar = new C11161k(viewGroup2, (C13356b) mo45891c(i2), this.f24831k);
                                } else if (i2 == R.id.view_type_shop_home_structured_policies_privacy) {
                                    return new C11164n(viewGroup, (C13356b) mo45891c(i2), this.f24833m, this.f24836p, eVar);
                                } else if (i2 == R.id.view_type_shop_home_terms_and_conditions_link) {
                                    fVar = new C11267c0(viewGroup2, mo45891c(i2));
                                } else if (i2 == R.id.view_type_shop_home_dispute_resolution) {
                                    return new C11269d0(viewGroup2, R.layout.shop_home_section_content_text, R.id.body_text_view, true);
                                } else {
                                    if (i2 == R.id.view_type_shop_home_vacation_banner) {
                                        return new C11271e0(viewGroup2);
                                    }
                                    if (i2 == R.id.view_type_shop_home_review_rating) {
                                        return new C11296s(viewGroup2);
                                    }
                                    if (i2 == R.id.view_type_shop_home_review_appreciation_photo) {
                                        return new C11280j(viewGroup2, this.f24830j);
                                    }
                                    if (i2 == R.id.view_type_shop_home_review_message) {
                                        return new C11295r(viewGroup2, this.f24836p);
                                    }
                                    if (i2 == R.id.view_type_shop_home_review_listing_info) {
                                        fVar = new C11281j0(viewGroup2, (C13113a) mo45891c(i2));
                                    } else if (i2 == R.id.view_type_shop_home_section_extra_space && d != null) {
                                        return new C12016y(d.requireActivity(), viewGroup2);
                                    } else {
                                        if (i2 != R.id.view_type_shop_home_seller_details) {
                                            return i2 == R.id.view_type_shop_home_faq_subsection_heading ? new ShopFAQTranslationHeader(viewGroup2, this.f24831k, this.f24836p.f19684a) : i2 == R.id.view_type_shop_home_faq_content ? new C11156f(viewGroup2, this.f24831k) : i2 == R.id.view_type_shop_home_empty_layout ? new C11257a(viewGroup2) : i2 == R.id.view_type_shop_home_loading_with_description ? new C11269d0(viewGroup2, R.layout.loading_with_description, R.id.loading_description, false) : (i2 == R.id.view_type_shop_home_sticky_boundary || i2 == R.id.view_type_shop_home_items_section_start || i2 == R.id.view_type_shop_home_items_section_end) ? new C11294q(viewGroup2) : i2 == R.id.view_type_shop_home_items_search_redesign ? new ShopItemsRedesignedSearchViewHolder(viewGroup2) : i2 == R.id.view_type_shop_home_section_divider ? new C11299v(viewGroup2) : i2 == R.id.view_type_shop_home_reviews_summary ? new C11298u(viewGroup2) : i2 == R.id.view_type_shop_home_reviews_summary_tappable ? new C11297t(viewGroup2, new C11247u0(this)) : i2 == R.id.view_type_shop_translations_section_body ? new C11166p(viewGroup2, this.f24835o) : super.mo31854b(viewGroup, i);
                                        }
                                        C13356b bVar = (C13356b) mo45891c(i2);
                                        fVar = new C11160j(viewGroup2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return fVar;
    }

    /* renamed from: g */
    public final int mo33127g(int i, int i2) {
        Fragment d = mo45892d();
        if (d != null) {
            return 0;
        }
        Resources resources = d.getResources();
        return i == R.id.view_type_shop_home_icon ? resources.getInteger(R.integer.shop_home_icon_span) : i == R.id.view_type_shop_home_info ? resources.getInteger(R.integer.shop_home_info_span) : i == R.id.view_type_shop_home_listing ? resources.getInteger(R.integer.vespa_listing_card_span) : i == R.id.view_type_shop_home_featured_listing ? resources.getInteger(R.integer.shop_home_featured_listing_span) : resources.getInteger(R.integer.vespa_grid_layout_max_span);
    }

    /* renamed from: h */
    public final void mo32273h() {
        C11178m0 m0Var = this.f24830j;
        if (m0Var != null) {
            C9125j e = m0Var.mo36806e();
            mo45894i(R.id.view_type_shop_home_listing, e);
            mo45894i(R.id.view_type_shop_home_featured_listing, e);
            mo45894i(R.id.view_type_shop_home_review_listing_info, e);
            C13356b k = this.f24830j.mo36810k();
            mo45894i(R.id.view_type_shop_home_structured_policies_downloads, k);
            mo45894i(R.id.view_type_shop_home_structured_policies_shipping, k);
            mo45894i(R.id.view_type_shop_home_structured_policies_payments, k);
            mo45894i(R.id.view_type_shop_home_structured_policies_privacy, k);
            mo45894i(R.id.view_type_shop_home_policies_refunds, k);
            mo45894i(R.id.view_type_shop_home_seller_details, k);
            C13355a aVar = new C13355a(mo45892d(), this.f28983b, this.f24830j);
            mo45894i(R.id.view_type_shop_home_heading_member, aVar);
            mo45894i(R.id.view_type_shop_home_heading_review, aVar);
            mo45894i(R.id.view_type_shop_home_heading_review_response, aVar);
            mo45894i(R.id.view_type_shop_home_heading_shop_owner, aVar);
            mo45894i(R.id.view_type_shop_home_load_button_listings, new C11250a(mo45892d(), this.f28983b));
            mo45894i(R.id.view_type_shop_home_load_button_reviews, new C11251b(mo45892d(), this.f28983b));
            mo45894i(R.id.view_type_shop_home_terms_and_conditions_link, new C11252c(mo45892d(), this.f28983b));
            mo45894i(R.id.view_type_shop_home_action_buttons, new C11253d(mo45892d(), this.f28983b));
            mo45894i(R.id.view_type_shop_home_related_link, new C13240j(mo45892d(), this.f28983b));
            mo45894i(R.id.view_type_shop_home_announcement_content, new C11266c(mo45892d(), this.f28983b, this.f28987f));
            mo45894i(R.id.view_type_shop_home_info_redesign, new C11254e(mo45892d(), this.f28983b));
            mo45894i(R.id.view_type_shop_home_section_footer, new C11255f(mo45892d(), this.f28983b));
            mo45894i(R.id.view_type_shop_home_section_selector, new C11256g(mo45892d(), this.f28983b));
        }
    }
}
