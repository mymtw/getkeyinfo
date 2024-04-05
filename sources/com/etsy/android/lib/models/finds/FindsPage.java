package com.etsy.android.lib.models.finds;

import android.support.p013v4.media.C0073e;
import com.etsy.android.lib.models.BannerImage;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.FindsHeroBannerImage;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FindsCard;
import com.etsy.android.lib.models.apiv3.ListingCard;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p628nj.C18263b;

public final class FindsPage extends FindsCard {
    public static final int $stable = 8;
    private BannerImage bannerImage;
    private EtsyId findsPagePublishedId = new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
    private List<ListingCard> heroListings = new ArrayList();
    private List<FindsModule> modules = new ArrayList();
    private String subtitle = "";

    public final HashMap<String, Object> getAnalyticsAttributes() {
        return C19294b0.m32561r0(new Pair("slug", getSlug()), new Pair(ResponseConstants.FINDS_PAGE_ID, getFindsPageId()));
    }

    public final String getAnalyticsName() {
        return "finds_page";
    }

    public final BannerImage getBannerImage() {
        return this.bannerImage;
    }

    public final EtsyId getFindsPagePublishedId() {
        return this.findsPagePublishedId;
    }

    public final List<ListingCard> getHeroListings() {
        return this.heroListings;
    }

    public final List<FindsModule> getModules() {
        return this.modules;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", "title", str)) {
            setTitle(BaseModel.Companion.parseString(jsonParser));
            return true;
        } else if (C19383o.m32792b("subtitle", str)) {
            this.subtitle = BaseModel.Companion.parseString(jsonParser);
            return true;
        } else if (C19383o.m32792b(ResponseConstants.MODULES, str)) {
            List<FindsModule> parseArray = BaseModel.Companion.parseArray(jsonParser, FindsModule.class);
            this.modules.clear();
            for (FindsModule findsModule : parseArray) {
                if (C18263b.m30839d0(findsModule.getType())) {
                    List<FindsModule> list = this.modules;
                    FindsModule typed = findsModule.getTyped();
                    C19383o.m32796f(typed, "module.typed");
                    list.add(typed);
                }
            }
            return true;
        } else if (C19383o.m32792b("page", str)) {
            super.parseData(jsonParser);
            return true;
        } else if (C19383o.m32792b(ResponseConstants.HERO_LISTINGS, str)) {
            this.heroListings = BaseModel.Companion.parseArray(jsonParser, ListingCard.class);
            return true;
        } else if (C19383o.m32792b(ResponseConstants.HEADER_IMAGES, str)) {
            this.bannerImage = (BannerImage) BaseModel.Companion.parseObject(jsonParser, FindsHeroBannerImage.class);
            return true;
        } else if (!C19383o.m32792b(ResponseConstants.FINDS_PAGE_PUBLISHED_ID, str)) {
            return super.parseField(jsonParser, str);
        } else {
            this.findsPagePublishedId.setIdKt(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
    }
}
