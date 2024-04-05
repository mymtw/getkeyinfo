package com.etsy.android.p327ui.cart.viewholders;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0114h;
import com.braze.p044ui.inappmessage.views.C5701g;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.cart.CartGroupItem;
import com.etsy.android.p327ui.cart.clicklisteners.C9282g;
import com.etsy.android.stylekit.views.C9060k;
import com.etsy.android.stylekit.views.CollageAlert;
import com.etsy.android.vespa.viewholders.C12086e;
import kotlin.jvm.internal.C19383o;
import p114g4.C6865e;

/* renamed from: com.etsy.android.ui.cart.viewholders.j */
public final class C9388j extends C12086e<CartGroupItem> {

    /* renamed from: f */
    public static final /* synthetic */ int f20789f = 0;

    /* renamed from: c */
    public final C9282g f20790c;

    /* renamed from: d */
    public final CollageAlert f20791d;

    /* renamed from: e */
    public final View f20792e = this.itemView.findViewById(R.id.unavailable_msg_bubble);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9388j(ViewGroup viewGroup, C9282g gVar) {
        super(C0114h.m305j0(viewGroup, R.layout.list_item_msco_message_bubble, false));
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        C19383o.m32797g(gVar, "clickHandler");
        this.f20790c = gVar;
        CollageAlert collageAlert = (CollageAlert) this.itemView.findViewById(R.id.alert);
        this.f20791d = collageAlert;
        collageAlert.setIconDrawableRes(R.drawable.clg_icon_core_exclamation_v1);
        collageAlert.setMainButtonClickListener(new C5701g(this, 3));
        collageAlert.setAltButtonClickListener(new C9060k(this, 2));
        collageAlert.setDismissButtonClickListener(new C6865e(this, 3));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19450a(java.lang.Object r11) {
        /*
            r10 = this;
            com.etsy.android.lib.models.apiv3.cart.CartGroupItem r11 = (com.etsy.android.lib.models.apiv3.cart.CartGroupItem) r11
            java.lang.String r0 = "item"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r1 = 0
            r0.setTitleText(r1)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            java.lang.String r2 = "alert"
            kotlin.jvm.internal.C19383o.m32796f(r0, r2)
            r2 = 2
            com.etsy.android.stylekit.views.CollageAlert.setBodyText$default(r0, r1, r1, r2, r1)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r0.setMainButtonText(r1)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r0.setAltButtonText(r1)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r1 = 0
            r0.showDismissButton(r1)
            com.etsy.android.lib.models.BaseModel r0 = r11.getData()
            java.lang.String r3 = "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.cart.CartMessageBubble"
            kotlin.jvm.internal.C19383o.m32795e(r0, r3)
            com.etsy.android.lib.models.apiv3.cart.CartMessageBubble r0 = (com.etsy.android.lib.models.apiv3.cart.CartMessageBubble) r0
            java.lang.String r4 = r0.getType()
            java.lang.String r5 = "cartMessageBubble.type"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            int r5 = r4.hashCode()
            java.lang.String r6 = "notify"
            switch(r5) {
                case -1867169789: goto L_0x0074;
                case -1039689911: goto L_0x006a;
                case 3237038: goto L_0x005e;
                case 96784904: goto L_0x0052;
                case 1124446108: goto L_0x0046;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x0080
        L_0x0046:
            java.lang.String r5 = "warning"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x004f
            goto L_0x0080
        L_0x004f:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r5 = com.etsy.android.stylekit.views.CollageAlert.AlertType.WARNING
            goto L_0x0082
        L_0x0052:
            java.lang.String r5 = "error"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x005b
            goto L_0x0080
        L_0x005b:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r5 = com.etsy.android.stylekit.views.CollageAlert.AlertType.ERROR
            goto L_0x0082
        L_0x005e:
            java.lang.String r5 = "info"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0067
            goto L_0x0080
        L_0x0067:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r5 = com.etsy.android.stylekit.views.CollageAlert.AlertType.INFO
            goto L_0x0082
        L_0x006a:
            boolean r5 = r4.equals(r6)
            if (r5 != 0) goto L_0x0071
            goto L_0x0080
        L_0x0071:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r5 = com.etsy.android.stylekit.views.CollageAlert.AlertType.NEWS
            goto L_0x0082
        L_0x0074:
            java.lang.String r5 = "success"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r5 = com.etsy.android.stylekit.views.CollageAlert.AlertType.SUCCESS
            goto L_0x0082
        L_0x0080:
            com.etsy.android.stylekit.views.CollageAlert$AlertType r5 = com.etsy.android.stylekit.views.CollageAlert.AlertType.INFO
        L_0x0082:
            com.etsy.android.stylekit.views.CollageAlert r7 = r10.f20791d
            r7.setAlertType(r5)
            com.etsy.android.stylekit.views.CollageAlert r5 = r10.f20791d
            java.lang.String r7 = r0.getMessage()
            r5.setTitleText(r7)
            android.view.View r5 = r10.f20792e
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.C19383o.m32795e(r5, r7)
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r6)
            java.lang.String r6 = "itemView.context"
            r7 = 1
            if (r4 == 0) goto L_0x00b2
            com.etsy.android.stylekit.views.CollageAlert r4 = r10.f20791d
            r4.setFullWidth(r7)
            r5.setMarginStart(r1)
            r5.setMarginEnd(r1)
            goto L_0x00e1
        L_0x00b2:
            com.etsy.android.stylekit.views.CollageAlert r4 = r10.f20791d
            r4.setFullWidth(r1)
            r4 = 8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            android.view.View r9 = r10.itemView
            android.content.Context r9 = r9.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r9, r6)
            int r8 = kotlinx.coroutines.C19543e0.m33295K(r8, r9)
            r5.setMarginStart(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            android.view.View r8 = r10.itemView
            android.content.Context r8 = r8.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r8, r6)
            int r4 = kotlinx.coroutines.C19543e0.m33295K(r4, r8)
            r5.setMarginEnd(r4)
        L_0x00e1:
            boolean r4 = r0.getHasPointer()
            if (r4 == 0) goto L_0x014d
            com.etsy.android.stylekit.views.CollageAlert r4 = r10.f20791d
            r4.setShowAnchor(r7)
            com.etsy.android.stylekit.views.CollageAlert r4 = r10.f20791d
            com.etsy.android.stylekit.views.CollageAlert$AnchorDirection r5 = com.etsy.android.stylekit.views.CollageAlert.AnchorDirection.DOWN
            r4.setAnchorDirection(r5)
            java.lang.String r0 = r0.getPointerPosition()
            if (r0 == 0) goto L_0x0131
            int r4 = r0.hashCode()
            r5 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r4 == r5) goto L_0x0125
            r5 = 3317767(0x32a007, float:4.649182E-39)
            if (r4 == r5) goto L_0x0119
            r5 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r4 == r5) goto L_0x010d
            goto L_0x0131
        L_0x010d:
            java.lang.String r4 = "right"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0116
            goto L_0x0131
        L_0x0116:
            com.etsy.android.stylekit.views.CollageAlert$AnchorOffsetDirection r0 = com.etsy.android.stylekit.views.CollageAlert.AnchorOffsetDirection.END
            goto L_0x0133
        L_0x0119:
            java.lang.String r4 = "left"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0122
            goto L_0x0131
        L_0x0122:
            com.etsy.android.stylekit.views.CollageAlert$AnchorOffsetDirection r0 = com.etsy.android.stylekit.views.CollageAlert.AnchorOffsetDirection.START
            goto L_0x0133
        L_0x0125:
            java.lang.String r4 = "center"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x012e
            goto L_0x0131
        L_0x012e:
            com.etsy.android.stylekit.views.CollageAlert$AnchorOffsetDirection r0 = com.etsy.android.stylekit.views.CollageAlert.AnchorOffsetDirection.MIDDLE
            goto L_0x0133
        L_0x0131:
            com.etsy.android.stylekit.views.CollageAlert$AnchorOffsetDirection r0 = com.etsy.android.stylekit.views.CollageAlert.AnchorOffsetDirection.START
        L_0x0133:
            com.etsy.android.stylekit.views.CollageAlert r4 = r10.f20791d
            r5 = 38
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            android.view.View r8 = r10.itemView
            android.content.Context r8 = r8.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r8, r6)
            int r5 = kotlinx.coroutines.C19543e0.m33295K(r5, r8)
            float r5 = (float) r5
            r4.setAnchorOffset(r0, r5)
            goto L_0x0152
        L_0x014d:
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r0.setShowAnchor(r1)
        L_0x0152:
            java.lang.String r0 = "dismiss"
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r0 = r11.getAction(r0)
            if (r0 == 0) goto L_0x0167
            com.etsy.android.stylekit.views.CollageAlert r4 = r10.f20791d
            r4.showDismissButton(r7)
            com.etsy.android.stylekit.views.CollageAlert r4 = r10.f20791d
            r5 = 2131429977(0x7f0b0a59, float:1.8481642E38)
            r4.setTag(r5, r0)
        L_0x0167:
            com.etsy.android.lib.models.BaseModel r0 = r11.getData()
            kotlin.jvm.internal.C19383o.m32795e(r0, r3)
            com.etsy.android.lib.models.apiv3.cart.CartMessageBubble r0 = (com.etsy.android.lib.models.apiv3.cart.CartMessageBubble) r0
            com.etsy.android.lib.models.apiv3.cart.CartErrorResolution r3 = r0.getCartErrorResolution()
            boolean r4 = r0.hasErrorDropdown()
            r5 = 2131429979(0x7f0b0a5b, float:1.8481646E38)
            r6 = 2131429978(0x7f0b0a5a, float:1.8481644E38)
            if (r4 == 0) goto L_0x01cb
            if (r3 == 0) goto L_0x01f0
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            java.lang.String r4 = r3.getPrompt()
            r0.setMainButtonText(r4)
            int r0 = r3.getType()
            if (r0 == r7) goto L_0x01bd
            if (r0 == r2) goto L_0x01aa
            r2 = 3
            if (r0 == r2) goto L_0x0197
            goto L_0x01ee
        L_0x0197:
            java.lang.String r0 = "update_quantity"
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r0 = r11.getAction(r0)
            if (r0 == 0) goto L_0x01ee
            com.etsy.android.stylekit.views.CollageAlert r2 = r10.f20791d
            r2.setTag(r6, r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r0.setTag(r5, r3)
            goto L_0x01ee
        L_0x01aa:
            java.lang.String r0 = "update_shipping_destination"
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r0 = r11.getAction(r0)
            if (r0 == 0) goto L_0x01ee
            com.etsy.android.stylekit.views.CollageAlert r2 = r10.f20791d
            r2.setTag(r6, r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r0.setTag(r5, r3)
            goto L_0x01ee
        L_0x01bd:
            java.lang.String r0 = "resolve_customization"
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r0 = r11.getAction(r0)
            if (r0 == 0) goto L_0x01ee
            com.etsy.android.stylekit.views.CollageAlert r2 = r10.f20791d
            r2.setTag(r6, r0)
            goto L_0x01ee
        L_0x01cb:
            boolean r0 = r0.hasLinkCta()
            if (r0 == 0) goto L_0x01f0
            if (r3 == 0) goto L_0x01f0
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            java.lang.String r2 = r3.getPrompt()
            r0.setMainButtonText(r2)
            java.lang.String r0 = "update_price"
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r0 = r11.getAction(r0)
            if (r0 == 0) goto L_0x01ee
            com.etsy.android.stylekit.views.CollageAlert r2 = r10.f20791d
            r2.setTag(r6, r0)
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r0.setTag(r5, r3)
        L_0x01ee:
            r0 = r7
            goto L_0x01f1
        L_0x01f0:
            r0 = r1
        L_0x01f1:
            java.lang.String r2 = "remove"
            com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction r11 = r11.getAction(r2)
            if (r11 == 0) goto L_0x0234
            java.lang.String r2 = r11.getDisplayName()
            if (r2 == 0) goto L_0x0205
            int r3 = r2.length()
            if (r3 != 0) goto L_0x0206
        L_0x0205:
            r1 = r7
        L_0x0206:
            if (r1 == 0) goto L_0x021a
            android.view.View r1 = r10.itemView
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131953322(0x7f1306aa, float:1.9543112E38)
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r1 = "itemView.resources.getString(R.string.remove)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r1)
        L_0x021a:
            if (r0 == 0) goto L_0x022a
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r1 = 2131429976(0x7f0b0a58, float:1.848164E38)
            r0.setTag(r1, r11)
            com.etsy.android.stylekit.views.CollageAlert r11 = r10.f20791d
            r11.setAltButtonText(r2)
            goto L_0x0234
        L_0x022a:
            com.etsy.android.stylekit.views.CollageAlert r0 = r10.f20791d
            r0.setTag(r6, r11)
            com.etsy.android.stylekit.views.CollageAlert r11 = r10.f20791d
            r11.setMainButtonText(r2)
        L_0x0234:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.cart.viewholders.C9388j.mo19450a(java.lang.Object):void");
    }

    /* renamed from: b */
    public final void mo31374b() {
        this.f20791d.setTag(R.id.tag_alert_primary_action, (Object) null);
        this.f20791d.setTag(R.id.tag_alert_alt_action, (Object) null);
        this.f20791d.setTag(R.id.tag_alert_resolution, (Object) null);
        this.f20791d.setTag(R.id.tag_alert_dismiss, (Object) null);
    }
}
