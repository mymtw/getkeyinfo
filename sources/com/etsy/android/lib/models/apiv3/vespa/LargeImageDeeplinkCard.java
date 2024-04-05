package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0072d;
import com.etsy.android.R;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

public final class LargeImageDeeplinkCard extends BaseFieldModel {
    public static final int $stable = 8;
    public Image image;
    public String link;
    public String title;

    public final Image getImage() {
        Image image2 = this.image;
        if (image2 != null) {
            return image2;
        }
        C19383o.m32805o(ResponseConstants.IMAGE);
        throw null;
    }

    public final String getLink() {
        String str = this.link;
        if (str != null) {
            return str;
        }
        C19383o.m32805o(ResponseConstants.LINK);
        throw null;
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        C19383o.m32805o("title");
        throw null;
    }

    public Map<AnalyticsProperty, Object> getTrackingParameters() {
        return C19294b0.m32561r0(new Pair(PredefinedAnalyticsProperty.LINK_CARD, getTitle()), new Pair(PredefinedAnalyticsProperty.LINK_CARD_URL, getLink()));
    }

    public int getViewType() {
        return R.id.view_type_large_image_deep_link_card;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        int c = C0072d.m197c(jsonParser, "jp", str, "fieldName");
        if (c != 3321850) {
            if (c != 100313435) {
                if (c == 110371416 && str.equals("title")) {
                    setTitle(BaseModel.Companion.parseString(jsonParser));
                    return true;
                }
            } else if (str.equals(ResponseConstants.IMAGE)) {
                Object parseObject = BaseModel.Companion.parseObject(jsonParser, Image.class);
                C19383o.m32794d(parseObject);
                setImage((Image) parseObject);
                return true;
            }
        } else if (str.equals(ResponseConstants.LINK)) {
            setLink(BaseModel.Companion.parseString(jsonParser));
            return true;
        }
        return false;
    }

    public final void setImage(Image image2) {
        C19383o.m32797g(image2, "<set-?>");
        this.image = image2;
    }

    public final void setLink(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.link = str;
    }

    public final void setTitle(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.title = str;
    }

    public void setTrackingParameters(Map<AnalyticsProperty, Object> map) {
    }
}
