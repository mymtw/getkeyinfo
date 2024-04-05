package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.interfaces.IHtmlText;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

public class HTMLText extends BaseFieldModel implements IHtmlText {
    public static final String VALUE_CENTER = "center";
    public static final String VALUE_LEFT = "left";
    public static final String VALUE_RIGHT = "right";
    public String mAlignment = "";
    public String mText = "";

    public String getAlignment() {
        return this.mAlignment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getGravity() {
        /*
            r4 = this;
            java.lang.String r0 = r4.mAlignment
            int r1 = r0.hashCode()
            r2 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r3 = 1
            if (r1 == r2) goto L_0x002b
            r2 = 3317767(0x32a007, float:4.649182E-39)
            if (r1 == r2) goto L_0x0021
            r2 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r1 == r2) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r1 = "right"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "left"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = 2
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "center"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0035
            r0 = r3
            goto L_0x0036
        L_0x0035:
            r0 = -1
        L_0x0036:
            if (r0 == 0) goto L_0x003f
            if (r0 == r3) goto L_0x003c
            r0 = 3
            return r0
        L_0x003c:
            r0 = 17
            return r0
        L_0x003f:
            r0 = 5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.cart.HTMLText.getGravity():int");
    }

    public String getText() {
        return this.mText;
    }

    public int getViewType() {
        return R.id.view_type_html_text;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        if ("text".equals(str)) {
            this.mText = BaseModel.parseStringPreserveHTMLEscapeEncoding(jsonParser);
            return true;
        } else if (!ResponseConstants.ALIGNMENT.equals(str)) {
            return false;
        } else {
            this.mAlignment = BaseModel.parseString(jsonParser);
            return true;
        }
    }
}
