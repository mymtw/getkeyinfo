package com.etsy.android.lib.models.apiv3.vespa;

import android.support.p013v4.media.C0073e;
import com.etsy.android.R;
import com.etsy.android.lib.models.BaseBackgroundColorFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Image;
import com.fasterxml.jackson.core.JsonParser;
import kotlin.jvm.internal.C19383o;

public final class ImageBanner extends BaseBackgroundColorFieldModel {
    public static final int $stable = 8;
    public Image image;

    public final Image getImage() {
        Image image2 = this.image;
        if (image2 != null) {
            return image2;
        }
        C19383o.m32805o(ResponseConstants.IMAGE);
        throw null;
    }

    public int getViewType() {
        return R.id.view_type_image_banner;
    }

    public boolean parseField(JsonParser jsonParser, String str) {
        if (!C0073e.m214n(jsonParser, "jp", str, "fieldName", str, ResponseConstants.IMAGE)) {
            return false;
        }
        Object parseObject = BaseModel.Companion.parseObject(jsonParser, Image.class);
        C19383o.m32794d(parseObject);
        setImage((Image) parseObject);
        return true;
    }

    public final void setImage(Image image2) {
        C19383o.m32797g(image2, "<set-?>");
        this.image = image2;
    }
}
