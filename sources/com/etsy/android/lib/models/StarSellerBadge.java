package com.etsy.android.lib.models;

public final class StarSellerBadge extends BaseFieldModel {
    public static final int $stable = 8;
    private String eventName = "";
    private String label = "";
    private String modalBody = "";
    private String modalTitle = "";

    public final String getEventName() {
        return this.eventName;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getModalBody() {
        return this.modalBody;
    }

    public final String getModalTitle() {
        return this.modalTitle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
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
                case -1843983802: goto L_0x0041;
                case -1445487628: goto L_0x002f;
                case 102727412: goto L_0x001e;
                case 984174864: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0054
        L_0x000c:
            java.lang.String r0 = "event_name"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0015
            goto L_0x0054
        L_0x0015:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.eventName = r3
            goto L_0x0052
        L_0x001e:
            java.lang.String r0 = "label"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0054
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.label = r3
            goto L_0x0052
        L_0x002f:
            java.lang.String r0 = "modal_body"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0038
            goto L_0x0054
        L_0x0038:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.modalBody = r3
            goto L_0x0052
        L_0x0041:
            java.lang.String r0 = "modal_title"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x004a
            goto L_0x0054
        L_0x004a:
            com.etsy.android.lib.models.BaseModel$Companion r4 = com.etsy.android.lib.models.BaseModel.Companion
            java.lang.String r3 = r4.parseString(r3)
            r2.modalTitle = r3
        L_0x0052:
            r3 = 1
            goto L_0x0055
        L_0x0054:
            r3 = 0
        L_0x0055:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.StarSellerBadge.parseField(com.fasterxml.jackson.core.JsonParser, java.lang.String):boolean");
    }
}
