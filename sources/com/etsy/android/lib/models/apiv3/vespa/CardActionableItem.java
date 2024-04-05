package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.Banner;
import com.etsy.android.lib.models.apiv3.ExploreBanner;
import com.etsy.android.lib.models.cardviewelement.BasicSectionHeader;
import p193o.C7494b;

public class CardActionableItem extends BaseActionableItem {
    public static final String ELEMENT_ACTIONABLE_HEADER = "section_header";
    public static final String ELEMENT_EXPLORE_BANNER = "exploreBanner";
    public static final String ELEMENT_FULL_BLEED = "fullBleedBanner";
    public static final String ELEMENT_HERO_BANNER = "heroBanner";
    public static final String ELEMENT_ICON_BANNER = "iconBanner";
    private static final long serialVersionUID = -4906489063473364845L;

    static {
        C7494b<String, ViewTypeMapping> bVar = BaseActionableItem.sTypeToClassMap;
        bVar.put(ELEMENT_HERO_BANNER, new ViewTypeMapping(R.id.view_type_hero_banner, Banner.class));
        bVar.put(ELEMENT_ICON_BANNER, new ViewTypeMapping(R.id.view_type_icon_banner, Banner.class));
        bVar.put(ELEMENT_FULL_BLEED, new ViewTypeMapping(R.id.view_type_full_bleed_banner, Banner.class));
        bVar.put("section_header", new ViewTypeMapping(R.id.view_type_actionable_header, BasicSectionHeader.class));
        bVar.put(ELEMENT_EXPLORE_BANNER, new ViewTypeMapping(R.id.view_type_explore_banner, ExploreBanner.class));
    }
}
