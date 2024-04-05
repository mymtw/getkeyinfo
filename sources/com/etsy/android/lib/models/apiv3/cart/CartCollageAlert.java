package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.apiv3.AlertStyle;
import com.etsy.android.stylekit.views.CollageAlert;
import kotlin.jvm.internal.C19383o;

public final class CartCollageAlert extends BaseFieldModel {
    public static final int $stable = 8;
    private String analyticsName;
    private String body;
    private String icon;
    private boolean isDismissible;
    private AlertStyle style = AlertStyle.INLINE;
    private String title;
    private CollageAlert.AlertType type = CollageAlert.AlertType.INFO;

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final AlertStyle getStyle() {
        return this.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final CollageAlert.AlertType getType() {
        return this.type;
    }

    public int getViewType() {
        return R.id.view_type_collage_alert;
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean parseField(com.fasterxml.jackson.core.JsonParser r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "parser"
            java.lang.String r1 = "fieldName"
            int r0 = android.support.p013v4.media.C0072d.m197c(r3, r0, r4, r1)
            switch(r0) {
                case 3029410: goto L_0x010c;
                case 3226745: goto L_0x00fa;
                case 3575610: goto L_0x0095;
                case 109780401: goto L_0x0047;
                case 110371416: goto L_0x0033;
                case 1273617316: goto L_0x001f;
                case 1376031303: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x011f
        L_0x000d:
            java.lang.String r0 = "is_dismissible"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0017
            goto L_0x011f
        L_0x0017:
            boolean r3 = r3.getValueAsBoolean()
            r2.isDismissible = r3
            goto L_0x011d
        L_0x001f:
            java.lang.String r0 = "analytics_name"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0029
            goto L_0x011f
        L_0x0029:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.analyticsName = r3
            goto L_0x011d
        L_0x0033:
            java.lang.String r0 = "title"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003d
            goto L_0x011f
        L_0x003d:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.title = r3
            goto L_0x011d
        L_0x0047:
            java.lang.String r0 = "style"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0051
            goto L_0x011f
        L_0x0051:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1183997287: goto L_0x0083;
                case -892259863: goto L_0x0077;
                case 586401325: goto L_0x006b;
                case 2010122246: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x008f
        L_0x005f:
            java.lang.String r4 = "floating"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0068
            goto L_0x008f
        L_0x0068:
            com.etsy.android.lib.models.apiv3.AlertStyle r3 = com.etsy.android.lib.models.apiv3.AlertStyle.FLOATING
            goto L_0x0091
        L_0x006b:
            java.lang.String r4 = "floating_anchored"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0074
            goto L_0x008f
        L_0x0074:
            com.etsy.android.lib.models.apiv3.AlertStyle r3 = com.etsy.android.lib.models.apiv3.AlertStyle.FLOATING_ANCHORED
            goto L_0x0091
        L_0x0077:
            java.lang.String r4 = "sticky"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0080
            goto L_0x008f
        L_0x0080:
            com.etsy.android.lib.models.apiv3.AlertStyle r3 = com.etsy.android.lib.models.apiv3.AlertStyle.STICKY
            goto L_0x0091
        L_0x0083:
            java.lang.String r4 = "inline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            com.etsy.android.lib.models.apiv3.AlertStyle r3 = com.etsy.android.lib.models.apiv3.AlertStyle.INLINE
            goto L_0x0091
        L_0x008f:
            com.etsy.android.lib.models.apiv3.AlertStyle r3 = com.etsy.android.lib.models.apiv3.AlertStyle.UNKNOWN
        L_0x0091:
            r2.style = r3
            goto L_0x011d
        L_0x0095:
            java.lang.String r0 = "type"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x009f
            goto L_0x011f
        L_0x009f:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1867169789: goto L_0x00e9;
                case -1819348130: goto L_0x00dd;
                case 3237038: goto L_0x00d1;
                case 3377875: goto L_0x00c5;
                case 96784904: goto L_0x00b9;
                case 1124446108: goto L_0x00ad;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00f5
        L_0x00ad:
            java.lang.String r4 = "warning"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00b6
            goto L_0x00f5
        L_0x00b6:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.WARNING
            goto L_0x00f7
        L_0x00b9:
            java.lang.String r4 = "error"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00c2
            goto L_0x00f5
        L_0x00c2:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.ERROR
            goto L_0x00f7
        L_0x00c5:
            java.lang.String r4 = "news"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ce
            goto L_0x00f5
        L_0x00ce:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.NEWS
            goto L_0x00f7
        L_0x00d1:
            java.lang.String r4 = "info"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00da
            goto L_0x00f5
        L_0x00da:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.INFO
            goto L_0x00f7
        L_0x00dd:
            java.lang.String r4 = "info_subtle"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00e6
            goto L_0x00f5
        L_0x00e6:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.INFO_SUBTLE
            goto L_0x00f7
        L_0x00e9:
            java.lang.String r4 = "success"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f2
            goto L_0x00f5
        L_0x00f2:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.SUCCESS
            goto L_0x00f7
        L_0x00f5:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r3 = com.etsy.android.stylekit.views.CollageAlert.AlertType.UNKNOWN
        L_0x00f7:
            r2.type = r3
            goto L_0x011d
        L_0x00fa:
            java.lang.String r0 = "icon"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0103
            goto L_0x011f
        L_0x0103:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.icon = r3
            goto L_0x011d
        L_0x010c:
            java.lang.String r0 = "body"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0115
            goto L_0x011f
        L_0x0115:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.body = r3
        L_0x011d:
            r3 = 1
            return r3
        L_0x011f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.cart.CartCollageAlert.parseField(com.fasterxml.jackson.core.JsonParser, java.lang.String):boolean");
    }

    public final void setAnalyticsName(String str) {
        this.analyticsName = str;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setDismissible(boolean z) {
        this.isDismissible = z;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setStyle(AlertStyle alertStyle) {
        C19383o.m32797g(alertStyle, "<set-?>");
        this.style = alertStyle;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(CollageAlert.AlertType alertType) {
        C19383o.m32797g(alertType, "<set-?>");
        this.type = alertType;
    }
}
