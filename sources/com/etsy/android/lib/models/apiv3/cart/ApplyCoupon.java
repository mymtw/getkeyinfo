package com.etsy.android.lib.models.apiv3.cart;

import com.etsy.android.lib.models.BaseFieldModel;

public final class ApplyCoupon extends BaseFieldModel {
    public static final int $stable = 8;
    private String modalApplyButtonText = "";
    private String modalInputHelperText = "";
    private String modalInputLabelText = "";
    private String modalTitleText = "";
    private String prompt = "";

    public final String getModalApplyButtonText() {
        return this.modalApplyButtonText;
    }

    public final String getModalInputHelperText() {
        return this.modalInputHelperText;
    }

    public final String getModalInputLabelText() {
        return this.modalInputLabelText;
    }

    public final String getModalTitleText() {
        return this.modalTitleText;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean parseField(com.fasterxml.jackson.core.JsonParser r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "parser"
            java.lang.String r1 = "fieldName"
            int r0 = android.support.p013v4.media.C0072d.m197c(r3, r0, r4, r1)
            switch(r0) {
                case -1843983802: goto L_0x0069;
                case -1833157372: goto L_0x0057;
                case -979805852: goto L_0x0045;
                case -783340011: goto L_0x0033;
                case 1273617316: goto L_0x0020;
                case 1363769261: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x007c
        L_0x000d:
            java.lang.String r0 = "modal_input_label"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0017
            goto L_0x007c
        L_0x0017:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.modalInputLabelText = r3
            goto L_0x007a
        L_0x0020:
            java.lang.String r0 = "analytics_name"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0029
            goto L_0x007c
        L_0x0029:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            kotlin.jvm.internal.C19388s.m32896y0(r2, r3)
            goto L_0x007a
        L_0x0033:
            java.lang.String r0 = "modal_input_helper"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003c
            goto L_0x007c
        L_0x003c:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.modalInputHelperText = r3
            goto L_0x007a
        L_0x0045:
            java.lang.String r0 = "prompt"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004e
            goto L_0x007c
        L_0x004e:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.prompt = r3
            goto L_0x007a
        L_0x0057:
            java.lang.String r0 = "modal_button"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0060
            goto L_0x007c
        L_0x0060:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.modalApplyButtonText = r3
            goto L_0x007a
        L_0x0069:
            java.lang.String r0 = "modal_title"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0072
            goto L_0x007c
        L_0x0072:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.modalTitleText = r3
        L_0x007a:
            r3 = 1
            goto L_0x007d
        L_0x007c:
            r3 = 0
        L_0x007d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.cart.ApplyCoupon.parseField(com.fasterxml.jackson.core.JsonParser, java.lang.String):boolean");
    }
}
