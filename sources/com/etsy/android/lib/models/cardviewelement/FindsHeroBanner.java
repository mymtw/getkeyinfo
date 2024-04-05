package com.etsy.android.lib.models.cardviewelement;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BannerImage;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.FindsHeroBannerImage;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FindsCard;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import kotlin.jvm.internal.C19383o;

public final class FindsHeroBanner extends FindsCard {
    public static final int $stable = 8;
    private BannerImage bannerImage;
    private String buttonText;
    private String subtitle;

    public final BannerImage formattedBannerImage(int i, boolean z) {
        BannerImage bannerImage2 = this.bannerImage;
        C19383o.m32794d(bannerImage2);
        BannerImage withDisplayWidth = bannerImage2.withDisplayWidth(i, z);
        C19383o.m32796f(withDisplayWidth, "bannerImage!!.withDispla…playWidthPx, isLandscape)");
        return withDisplayWidth;
    }

    public final BannerImage getBannerImage() {
        return this.bannerImage;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getImageUrl() {
        BannerImage bannerImage2 = this.bannerImage;
        if (bannerImage2 == null) {
            return null;
        }
        C19383o.m32794d(bannerImage2);
        return bannerImage2.getImageUrl();
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int getViewType() {
        return R.id.view_type_finds_hero_banner;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if (C0073e.m214n(jsonParser, "jp", str, "fieldName", "images", str)) {
            this.bannerImage = (BannerImage) BaseModel.Companion.parseObject(jsonParser, FindsHeroBannerImage.class);
        } else if (C19383o.m32792b(ResponseConstants.SUB_TITLE, str)) {
            this.subtitle = BaseModel.Companion.parseString(jsonParser);
        } else if (C19383o.m32792b(ResponseConstants.BUTTON_TEXT, str)) {
            this.buttonText = BaseModel.Companion.parseString(jsonParser);
        }
        return super.parseField(jsonParser, str);
    }

    public final void setBannerImage(BannerImage bannerImage2) {
        this.bannerImage = bannerImage2;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }
}
