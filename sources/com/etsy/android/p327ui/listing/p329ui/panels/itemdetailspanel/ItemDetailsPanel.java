package com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel;

import android.support.p013v4.media.C0072d;
import android.text.SpannedString;
import androidx.compose.animation.C0391c;
import com.etsy.android.p327ui.listing.ListingViewTypes;
import com.etsy.android.p327ui.listing.p329ui.C10423j;
import com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p498zc.C13949d;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel */
public final class ItemDetailsPanel extends C10423j implements C13949d {

    /* renamed from: a */
    public final CharSequence f23009a;

    /* renamed from: b */
    public final CharSequence f23010b;

    /* renamed from: c */
    public final List<C10487a> f23011c;

    /* renamed from: d */
    public final String f23012d;

    /* renamed from: e */
    public final String f23013e;

    /* renamed from: f */
    public final Boolean f23014f;

    /* renamed from: g */
    public final Boolean f23015g;

    /* renamed from: h */
    public final String f23016h;

    /* renamed from: i */
    public final String f23017i;

    /* renamed from: j */
    public final boolean f23018j;

    /* renamed from: k */
    public final String f23019k;

    /* renamed from: l */
    public final String f23020l;

    /* renamed from: m */
    public final String f23021m;

    /* renamed from: n */
    public final MachineTranslationViewState f23022n;

    /* renamed from: o */
    public final boolean f23023o;

    /* renamed from: com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel$Companion */
    public static final class Companion {
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0199  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01a1  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01ba  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01bf  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01f3  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x01f6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel m18464a(com.etsy.android.lib.models.apiv3.listing.ListingFetch r24, com.etsy.android.p327ui.listing.p329ui.C10425l r25, com.etsy.android.p327ui.util.C11786n r26, com.etsy.android.lib.util.C8923u r27, java.lang.Boolean r28) {
            /*
                r0 = r25
                r1 = r26
                r2 = r27
                java.lang.String r3 = "resourceProvider"
                kotlin.jvm.internal.C19383o.m32797g(r1, r3)
                java.lang.String r3 = "machineTranslationHelper"
                kotlin.jvm.internal.C19383o.m32797g(r2, r3)
                com.etsy.android.lib.models.apiv3.listing.SellerMarketingBOEMessage r3 = r24.getPromoMessage()
                if (r3 == 0) goto L_0x001b
                java.lang.String r3 = r3.getSellerDescription()
                goto L_0x001c
            L_0x001b:
                r3 = 0
            L_0x001c:
                java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
                java.lang.String r4 = " "
                r5 = 17
                r6 = 0
                r7 = 1
                if (r3 == 0) goto L_0x005f
                boolean r8 = p628nj.C18263b.m30839d0(r3)
                if (r8 == 0) goto L_0x002f
                goto L_0x0030
            L_0x002f:
                r3 = 0
            L_0x0030:
                if (r3 == 0) goto L_0x005f
                android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
                r8.<init>()
                android.text.style.StyleSpan r9 = new android.text.style.StyleSpan
                r9.<init>(r7)
                int r10 = r8.length()
                r11 = 2131952099(0x7f1301e3, float:1.9540631E38)
                java.lang.Object[] r12 = new java.lang.Object[r6]
                java.lang.String r11 = r1.mo38059c(r11, r12)
                r8.append(r11)
                int r11 = r8.length()
                r8.setSpan(r9, r10, r11, r5)
                r8.append(r4)
                r8.append(r3)
                android.text.SpannedString r3 = new android.text.SpannedString
                r3.<init>(r8)
                goto L_0x0060
            L_0x005f:
                r3 = 0
            L_0x0060:
                r9 = r3
                com.etsy.android.lib.models.apiv3.listing.ListingDetailedFreeShipping r3 = r24.getDetailedFreeShipping()
                if (r3 == 0) goto L_0x006c
                java.lang.String r3 = r3.getSellerDescription()
                goto L_0x006d
            L_0x006c:
                r3 = 0
            L_0x006d:
                java.lang.String r3 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
                if (r3 == 0) goto L_0x00aa
                boolean r8 = p628nj.C18263b.m30839d0(r3)
                if (r8 == 0) goto L_0x007a
                goto L_0x007b
            L_0x007a:
                r3 = 0
            L_0x007b:
                if (r3 == 0) goto L_0x00aa
                android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
                r8.<init>()
                android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
                r10.<init>(r7)
                int r7 = r8.length()
                r11 = 2131952288(0x7f1302a0, float:1.9541015E38)
                java.lang.Object[] r12 = new java.lang.Object[r6]
                java.lang.String r11 = r1.mo38059c(r11, r12)
                r8.append(r11)
                int r11 = r8.length()
                r8.setSpan(r10, r7, r11, r5)
                r8.append(r4)
                r8.append(r3)
                android.text.SpannedString r3 = new android.text.SpannedString
                r3.<init>(r8)
                goto L_0x00ab
            L_0x00aa:
                r3 = 0
            L_0x00ab:
                r10 = r3
                boolean r3 = r0.f22893a
                java.lang.String r4 = ""
                if (r3 == 0) goto L_0x00c1
                boolean r3 = r0.f22894b
                if (r3 == 0) goto L_0x00c1
                java.lang.String r3 = r0.f22897e
                if (r3 != 0) goto L_0x00bb
                r3 = r4
            L_0x00bb:
                java.lang.String r5 = r0.f22898f
                if (r5 != 0) goto L_0x00cd
                r5 = r4
                goto L_0x00cd
            L_0x00c1:
                com.etsy.android.lib.models.apiv3.listing.Listing r3 = r24.getListing()
                java.lang.String r3 = r3.getDescription()
                if (r3 != 0) goto L_0x00cc
                r3 = r4
            L_0x00cc:
                r5 = 0
            L_0x00cd:
                boolean r7 = r0.f22894b
                if (r7 != 0) goto L_0x00d5
                boolean r7 = r0.f22893a
                if (r7 == 0) goto L_0x00f8
            L_0x00d5:
                com.etsy.android.lib.config.c r7 = r2.f19685b
                com.etsy.android.lib.config.EtsyConfigKey r8 = com.etsy.android.lib.config.C8592b.f18797i
                o9.l r7 = r7.mo21137g(r8)
                java.lang.String[] r7 = r7.mo45845l()
                java.util.List r7 = kotlin.collections.C19318k.m32620l1(r7)
                y9.d r2 = r2.f19684a
                java.util.Locale r2 = r2.mo46718b()
                java.lang.String r2 = r2.getLanguage()
                boolean r2 = r7.contains(r2)
                if (r2 == 0) goto L_0x00f8
                com.etsy.android.ui.listing.ui.MachineTranslationViewState r2 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.VISIBLE
                goto L_0x00fa
            L_0x00f8:
                com.etsy.android.ui.listing.ui.MachineTranslationViewState r2 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.GONE
            L_0x00fa:
                r22 = r2
                java.util.List r11 = r24.getManufacturers()
                if (r11 == 0) goto L_0x010f
                r13 = 0
                r14 = 0
                com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel$Companion$from$manufacturers$1 r15 = com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel$Companion$from$manufacturers$1.INSTANCE
                r16 = 30
                java.lang.String r12 = ""
                java.lang.String r2 = kotlin.collections.C19327t.m32644Z0(r11, r12, r13, r14, r15, r16)
                goto L_0x0110
            L_0x010f:
                r2 = 0
            L_0x0110:
                r17 = r2
                boolean r2 = r0.f22894b
                if (r2 == 0) goto L_0x011b
                java.lang.String r2 = r0.f22900h
                java.lang.String r7 = r0.f22899g
                goto L_0x011f
            L_0x011b:
                java.lang.String r2 = r0.f22899g
                java.lang.String r7 = r0.f22900h
            L_0x011f:
                r20 = r2
                r21 = r7
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r7 = r28
                boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r7, r2)
                if (r2 == 0) goto L_0x01a1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.List r7 = r24.getItemDetails()
                if (r7 == 0) goto L_0x01a2
                java.util.Iterator r7 = r7.iterator()
            L_0x013c:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x01a2
                java.lang.Object r8 = r7.next()
                com.etsy.android.lib.models.apiv3.listing.ItemDetail r8 = (com.etsy.android.lib.models.apiv3.listing.ItemDetail) r8
                java.util.List r11 = r8.getDisplayText()
                if (r11 == 0) goto L_0x015a
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 62
                java.lang.String r12 = ", "
                java.lang.String r11 = kotlin.collections.C19327t.m32644Z0(r11, r12, r13, r14, r15, r16)
                goto L_0x015b
            L_0x015a:
                r11 = 0
            L_0x015b:
                boolean r12 = p628nj.C18263b.m30839d0(r11)
                if (r12 == 0) goto L_0x013c
                com.etsy.android.ui.listing.ui.panels.itemdetailspanel.a r12 = new com.etsy.android.ui.listing.ui.panels.itemdetailspanel.a
                java.lang.String r8 = r8.getIcon()
                boolean r13 = p628nj.C18263b.m30839d0(r8)
                if (r13 == 0) goto L_0x0190
                java.lang.String r13 = "name"
                kotlin.jvm.internal.C19383o.m32797g(r8, r13)
                android.app.Application r13 = r1.f26257a
                android.content.res.Resources r13 = r13.getResources()
                java.lang.String r15 = "clg_icon_core_"
                java.lang.String r14 = "_v1"
                java.lang.String r8 = p010a9.C0048b.m163a(r15, r8, r14)
                android.app.Application r14 = r1.f26257a
                java.lang.String r14 = r14.getPackageName()
                java.lang.String r15 = "drawable"
                int r8 = r13.getIdentifier(r8, r15, r14)
                if (r8 == 0) goto L_0x0190
                r14 = r8
                goto L_0x0193
            L_0x0190:
                r14 = 2131231349(0x7f080275, float:1.8078777E38)
            L_0x0193:
                java.lang.String r8 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r11)
                if (r8 != 0) goto L_0x019a
                r8 = r4
            L_0x019a:
                r12.<init>(r14, r8)
                r2.add(r12)
                goto L_0x013c
            L_0x01a1:
                r2 = 0
            L_0x01a2:
                r11 = r2
                com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel r2 = new com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel
                java.lang.String r12 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r3)
                r7 = 2131952394(0x7f13030a, float:1.954123E38)
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.String r13 = r1.mo38059c(r7, r8)
                int r1 = r3.length()
                if (r1 != 0) goto L_0x01ba
                r1 = 1
                goto L_0x01bb
            L_0x01ba:
                r1 = r6
            L_0x01bb:
                if (r1 == 0) goto L_0x01bf
                r1 = 0
                goto L_0x01ce
            L_0x01bf:
                int r1 = r3.length()
                r7 = 115(0x73, float:1.61E-43)
                if (r1 > r7) goto L_0x01c9
                r1 = 1
                goto L_0x01ca
            L_0x01c9:
                r1 = r6
            L_0x01ca:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            L_0x01ce:
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r7)
                if (r1 != 0) goto L_0x01e0
                java.lang.Boolean r1 = m18465b(r3)
                boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r7)
                if (r1 == 0) goto L_0x01e1
            L_0x01e0:
                r6 = 1
            L_0x01e1:
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r6)
                java.lang.Boolean r15 = m18465b(r3)
                java.lang.String r16 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r5)
                boolean r1 = r0.f22894b
                java.lang.String r0 = r0.f22899g
                if (r0 != 0) goto L_0x01f6
                r19 = r4
                goto L_0x01f8
            L_0x01f6:
                r19 = r0
            L_0x01f8:
                r23 = 16384(0x4000, float:2.2959E-41)
                r8 = r2
                r18 = r1
                r8.<init>((android.text.SpannedString) r9, (android.text.SpannedString) r10, (java.util.ArrayList) r11, (java.lang.String) r12, (java.lang.String) r13, (java.lang.Boolean) r14, (java.lang.Boolean) r15, (java.lang.String) r16, (java.lang.String) r17, (boolean) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21, (com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState) r22, (int) r23)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel.Companion.m18464a(com.etsy.android.lib.models.apiv3.listing.ListingFetch, com.etsy.android.ui.listing.ui.l, com.etsy.android.ui.util.n, com.etsy.android.lib.util.u, java.lang.Boolean):com.etsy.android.ui.listing.ui.panels.itemdetailspanel.ItemDetailsPanel");
        }

        /* renamed from: b */
        public static Boolean m18465b(String str) {
            boolean z = true;
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            if (116 > length || length >= 501) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public ItemDetailsPanel() {
        this((SpannedString) null, (SpannedString) null, (ArrayList) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (MachineTranslationViewState) null, 32767);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ItemDetailsPanel(android.text.SpannedString r20, android.text.SpannedString r21, java.util.ArrayList r22, java.lang.String r23, java.lang.String r24, java.lang.Boolean r25, java.lang.Boolean r26, java.lang.String r27, java.lang.String r28, boolean r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState r33, int r34) {
        /*
            r19 = this;
            r0 = r34
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r20
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r21
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r22
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r23
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r24
        L_0x002b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0033
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r9 = r1
            goto L_0x0035
        L_0x0033:
            r9 = r25
        L_0x0035:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x003d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10 = r1
            goto L_0x003f
        L_0x003d:
            r10 = r26
        L_0x003f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0045
            r11 = r2
            goto L_0x0047
        L_0x0045:
            r11 = r27
        L_0x0047:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004d
            r12 = r2
            goto L_0x004f
        L_0x004d:
            r12 = r28
        L_0x004f:
            r1 = r0 & 512(0x200, float:7.175E-43)
            r3 = 0
            if (r1 == 0) goto L_0x0056
            r13 = r3
            goto L_0x0058
        L_0x0056:
            r13 = r29
        L_0x0058:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x005e
            r14 = r2
            goto L_0x0060
        L_0x005e:
            r14 = r30
        L_0x0060:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0066
            r15 = r2
            goto L_0x0068
        L_0x0066:
            r15 = r31
        L_0x0068:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x006f
            r16 = r2
            goto L_0x0071
        L_0x006f:
            r16 = r32
        L_0x0071:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x007a
            com.etsy.android.ui.listing.ui.MachineTranslationViewState r0 = com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState.VISIBLE
            r17 = r0
            goto L_0x007c
        L_0x007a:
            r17 = r33
        L_0x007c:
            r18 = 0
            r3 = r19
            r3.<init>((java.lang.CharSequence) r4, (java.lang.CharSequence) r5, (java.util.List<com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.C10487a>) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.Boolean) r9, (java.lang.Boolean) r10, (java.lang.String) r11, (java.lang.String) r12, (boolean) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (com.etsy.android.p327ui.listing.p329ui.MachineTranslationViewState) r17, (boolean) r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.itemdetailspanel.ItemDetailsPanel.<init>(android.text.SpannedString, android.text.SpannedString, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, com.etsy.android.ui.listing.ui.MachineTranslationViewState, int):void");
    }

    /* renamed from: a */
    public final ListingViewTypes mo33574a() {
        return ListingViewTypes.ITEM_DETAILS_PANEL;
    }

    /* renamed from: b */
    public final boolean mo34050b() {
        return this.f23018j && C18263b.m30839d0(this.f23019k) && C18263b.m30839d0(this.f23020l) && !C19383o.m32792b(this.f23019k, this.f23020l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemDetailsPanel)) {
            return false;
        }
        ItemDetailsPanel itemDetailsPanel = (ItemDetailsPanel) obj;
        return C19383o.m32792b(this.f23009a, itemDetailsPanel.f23009a) && C19383o.m32792b(this.f23010b, itemDetailsPanel.f23010b) && C19383o.m32792b(this.f23011c, itemDetailsPanel.f23011c) && C19383o.m32792b(this.f23012d, itemDetailsPanel.f23012d) && C19383o.m32792b(this.f23013e, itemDetailsPanel.f23013e) && C19383o.m32792b(this.f23014f, itemDetailsPanel.f23014f) && C19383o.m32792b(this.f23015g, itemDetailsPanel.f23015g) && C19383o.m32792b(this.f23016h, itemDetailsPanel.f23016h) && C19383o.m32792b(this.f23017i, itemDetailsPanel.f23017i) && this.f23018j == itemDetailsPanel.f23018j && C19383o.m32792b(this.f23019k, itemDetailsPanel.f23019k) && C19383o.m32792b(this.f23020l, itemDetailsPanel.f23020l) && C19383o.m32792b(this.f23021m, itemDetailsPanel.f23021m) && this.f23022n == itemDetailsPanel.f23022n && this.f23023o == itemDetailsPanel.f23023o;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f23009a;
        int i = 0;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f23010b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List<C10487a> list = this.f23011c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f23012d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23013e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f23014f;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f23015g;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f23016h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23017i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.f23018j;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        String str5 = this.f23019k;
        int hashCode10 = (i2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f23020l;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f23021m;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int hashCode12 = (this.f23022n.hashCode() + ((hashCode11 + i) * 31)) * 31;
        boolean z3 = this.f23023o;
        if (!z3) {
            z2 = z3;
        }
        return hashCode12 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ItemDetailsPanel(specialOfferDetails=");
        h.append(this.f23009a);
        h.append(", freeShippingDetails=");
        h.append(this.f23010b);
        h.append(", itemDetails=");
        h.append(this.f23011c);
        h.append(", description=");
        h.append(this.f23012d);
        h.append(", descriptionTitleText=");
        h.append(this.f23013e);
        h.append(", showInlineDescription=");
        h.append(this.f23014f);
        h.append(", ellipsizeDescription=");
        h.append(this.f23015g);
        h.append(", descriptionInAlternateLanguage=");
        h.append(this.f23016h);
        h.append(", manufacturers=");
        h.append(this.f23017i);
        h.append(", isTranslated=");
        h.append(this.f23018j);
        h.append(", originalLanguageCode=");
        h.append(this.f23019k);
        h.append(", languageCode=");
        h.append(this.f23020l);
        h.append(", alternateLanguageCode=");
        h.append(this.f23021m);
        h.append(", machineTranslationViewState=");
        h.append(this.f23022n);
        h.append(", isExpanded=");
        return C0391c.m1058d(h, this.f23023o, ')');
    }

    public ItemDetailsPanel(CharSequence charSequence, CharSequence charSequence2, List<C10487a> list, String str, String str2, Boolean bool, Boolean bool2, String str3, String str4, boolean z, String str5, String str6, String str7, MachineTranslationViewState machineTranslationViewState, boolean z2) {
        MachineTranslationViewState machineTranslationViewState2 = machineTranslationViewState;
        C19383o.m32797g(machineTranslationViewState2, "machineTranslationViewState");
        this.f23009a = charSequence;
        this.f23010b = charSequence2;
        this.f23011c = list;
        this.f23012d = str;
        this.f23013e = str2;
        this.f23014f = bool;
        this.f23015g = bool2;
        this.f23016h = str3;
        this.f23017i = str4;
        this.f23018j = z;
        this.f23019k = str5;
        this.f23020l = str6;
        this.f23021m = str7;
        this.f23022n = machineTranslationViewState2;
        this.f23023o = z2;
    }
}
