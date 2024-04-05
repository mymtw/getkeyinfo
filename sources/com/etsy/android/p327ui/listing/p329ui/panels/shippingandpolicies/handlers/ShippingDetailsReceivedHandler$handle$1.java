package com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers;

import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.p327ui.listing.p329ui.C10195b;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import com.etsy.android.p327ui.listing.p329ui.C10625r;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.ShippingDetailsReceivedHandler$handle$1 */
final class ShippingDetailsReceivedHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13735t3 $event;
    public final /* synthetic */ ListingViewState.C10092d $state;
    public final /* synthetic */ C10583h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingDetailsReceivedHandler$handle$1(C10583h hVar, C13597g.C13735t3 t3Var, ListingViewState.C10092d dVar) {
        super(1);
        this.this$0 = hVar;
        this.$event = t3Var;
        this.$state = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        final C10583h hVar = this.this$0;
        final C13597g.C13735t3 t3Var = this.$event;
        final ListingViewState.C10092d dVar = this.$state;
        gVar.mo33962b(new C19857l<C10195b, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10195b) obj);
                return C19394m.f43287a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x008a  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x009a  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x009d  */
            /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(com.etsy.android.p327ui.listing.p329ui.C10195b r8) {
                /*
                    r7 = this;
                    java.lang.String r0 = "$this$buyBox"
                    kotlin.jvm.internal.C19383o.m32797g(r8, r0)
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.h r0 = r1
                    vc.g$t3 r1 = r2
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r1 = r1.f30257a
                    com.etsy.android.ui.listing.ListingViewState$d r2 = r3
                    com.etsy.android.lib.models.apiv3.listing.ListingFetch r2 = r2.f22239g
                    com.etsy.android.lib.models.apiv3.listing.Listing r2 = r2.getListing()
                    boolean r2 = r2.isDigital()
                    com.etsy.android.ui.listing.ListingViewState$d r3 = r3
                    com.etsy.android.lib.models.apiv3.listing.ListingFetch r3 = r3.f22239g
                    com.etsy.android.lib.models.apiv3.listing.Listing r3 = r3.getListing()
                    boolean r3 = r3.isSoldOut()
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r0 = r0.mo34187a(r1, r2, r3)
                    com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns r1 = r8.f22395u
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.h r2 = r1
                    vc.g$t3 r3 = r2
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r4 = r3.f30257a
                    int r5 = r1.f22634e
                    r2.getClass()
                    java.lang.String r2 = "listingShippingDetails"
                    kotlin.jvm.internal.C19383o.m32797g(r4, r2)
                    java.lang.String r2 = r4.getEstimatedDeliveryDateRange()
                    r4 = 0
                    r6 = 1
                    if (r2 == 0) goto L_0x004a
                    int r2 = r2.length()
                    if (r2 != 0) goto L_0x0048
                    goto L_0x004a
                L_0x0048:
                    r2 = r4
                    goto L_0x004b
                L_0x004a:
                    r2 = r6
                L_0x004b:
                    if (r2 == 0) goto L_0x0060
                    java.lang.String r2 = r0.f23164j
                    if (r2 == 0) goto L_0x0059
                    int r2 = r2.length()
                    if (r2 != 0) goto L_0x0058
                    goto L_0x0059
                L_0x0058:
                    r6 = r4
                L_0x0059:
                    if (r6 == 0) goto L_0x0060
                    if (r5 != 0) goto L_0x0060
                    com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns$SignalsState r2 = com.etsy.android.p327ui.listing.p329ui.buybox.signal.ListingSignalColumns.SignalsState.HIDE
                    goto L_0x0062
                L_0x0060:
                    com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns$SignalsState r2 = com.etsy.android.p327ui.listing.p329ui.buybox.signal.ListingSignalColumns.SignalsState.SHOW
                L_0x0062:
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r3 = r3.f30257a
                    java.lang.String r3 = r3.getEstimatedDeliveryDateRange()
                    r5 = 60
                    com.etsy.android.ui.listing.ui.buybox.signal.ListingSignalColumns r1 = com.etsy.android.p327ui.listing.p329ui.buybox.signal.ListingSignalColumns.m18358b(r1, r3, r0, r2, r5)
                    r8.f22395u = r1
                    com.etsy.android.ui.listing.ListingViewState$d r1 = r3
                    com.etsy.android.ui.listing.ui.f r1 = r1.f22238f
                    com.etsy.android.ui.listing.ui.f$a r1 = r1.f22802e
                    com.etsy.android.ui.listing.ui.j r1 = r1.f22818c
                    boolean r2 = r1 instanceof p375jd.C12971a
                    r3 = 0
                    if (r2 == 0) goto L_0x0080
                    jd.a r1 = (p375jd.C12971a) r1
                    goto L_0x0081
                L_0x0080:
                    r1 = r3
                L_0x0081:
                    if (r1 == 0) goto L_0x008a
                    r2 = 13
                    jd.a r1 = p375jd.C12971a.m20653b(r1, r0, r4, r2)
                    goto L_0x008b
                L_0x008a:
                    r1 = r3
                L_0x008b:
                    com.etsy.android.ui.listing.ListingViewState$d r2 = r3
                    com.etsy.android.ui.listing.ui.f r2 = r2.f22238f
                    com.etsy.android.ui.listing.ui.f$a r2 = r2.f22802e
                    com.etsy.android.ui.listing.ui.j r2 = r2.f22818c
                    boolean r5 = r2 instanceof p375jd.C12974d
                    if (r5 == 0) goto L_0x009a
                    jd.d r2 = (p375jd.C12974d) r2
                    goto L_0x009b
                L_0x009a:
                    r2 = r3
                L_0x009b:
                    if (r2 == 0) goto L_0x00a3
                    r3 = 59
                    jd.d r3 = p375jd.C12974d.m20657b(r2, r0, r4, r3)
                L_0x00a3:
                    if (r1 == 0) goto L_0x00a6
                    goto L_0x00a7
                L_0x00a6:
                    r1 = r3
                L_0x00a7:
                    r8.f22378d = r1
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.ShippingDetailsReceivedHandler$handle$1.C105721.invoke(com.etsy.android.ui.listing.ui.b):void");
            }
        });
        final C13597g.C13735t3 t3Var2 = this.$event;
        final C10583h hVar2 = this.this$0;
        gVar.mo33964d(new C19857l<C10625r, C19394m>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10625r) obj);
                return C19394m.f43287a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.String} */
            /* JADX WARNING: type inference failed for: r0v1 */
            /* JADX WARNING: type inference failed for: r0v7 */
            /* JADX WARNING: type inference failed for: r0v8 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(com.etsy.android.p327ui.listing.p329ui.C10625r r15) {
                /*
                    r14 = this;
                    java.lang.String r0 = "$this$panels"
                    kotlin.jvm.internal.C19383o.m32797g(r15, r0)
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a r1 = r15.f23319c
                    r0 = 0
                    if (r1 == 0) goto L_0x0063
                    vc.g$t3 r2 = r1
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.h r3 = r2
                    r4 = 0
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r5 = r2.f30257a
                    java.lang.String r5 = r5.getEddPreview()
                    r6 = 0
                    com.etsy.android.ui.util.n r7 = r3.f23193b
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r8 = r2.f30257a
                    com.etsy.android.lib.models.apiv3.ShippingDisplay r8 = r8.getShippingDisplay()
                    if (r8 == 0) goto L_0x0025
                    java.lang.String r8 = r8.getPrimaryText()
                    goto L_0x0026
                L_0x0025:
                    r8 = r0
                L_0x0026:
                    r7.getClass()
                    android.text.Spanned r7 = p628nj.C18263b.m30818M(r8)
                    com.etsy.android.ui.util.n r8 = r3.f23193b
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r9 = r2.f30257a
                    com.etsy.android.lib.models.apiv3.ShippingDisplay r9 = r9.getShippingDisplay()
                    if (r9 == 0) goto L_0x003c
                    java.lang.String r9 = r9.getSecondaryText()
                    goto L_0x003d
                L_0x003c:
                    r9 = r0
                L_0x003d:
                    r8.getClass()
                    android.text.Spanned r8 = p628nj.C18263b.m30818M(r9)
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r2 = r2.f30257a
                    boolean r9 = r1.f23228d
                    boolean r10 = r1.f23229e
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r9 = r3.mo34187a(r2, r9, r10)
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = -57377(0xffffffffffff1fdf, float:NaN)
                    r2 = r4
                    r3 = r5
                    r4 = r6
                    r5 = r7
                    r6 = r8
                    r7 = r9
                    r8 = r10
                    r9 = r11
                    r10 = r12
                    r11 = r13
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.structured.a r1 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.structured.C10590a.m18529b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    goto L_0x0064
                L_0x0063:
                    r1 = r0
                L_0x0064:
                    r15.f23319c = r1
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.a r2 = r15.f23318b
                    if (r2 == 0) goto L_0x00b4
                    vc.g$t3 r1 = r1
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.handlers.h r3 = r2
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r4 = r1.f30257a
                    java.lang.String r4 = r4.getEddPreview()
                    com.etsy.android.ui.util.n r5 = r3.f23193b
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r6 = r1.f30257a
                    com.etsy.android.lib.models.apiv3.ShippingDisplay r6 = r6.getShippingDisplay()
                    if (r6 == 0) goto L_0x0083
                    java.lang.String r6 = r6.getPrimaryText()
                    goto L_0x0084
                L_0x0083:
                    r6 = r0
                L_0x0084:
                    r5.getClass()
                    android.text.Spanned r5 = p628nj.C18263b.m30818M(r6)
                    com.etsy.android.ui.util.n r6 = r3.f23193b
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r7 = r1.f30257a
                    com.etsy.android.lib.models.apiv3.ShippingDisplay r7 = r7.getShippingDisplay()
                    if (r7 == 0) goto L_0x0099
                    java.lang.String r0 = r7.getSecondaryText()
                L_0x0099:
                    r6.getClass()
                    android.text.Spanned r0 = p628nj.C18263b.m30818M(r0)
                    com.etsy.android.lib.models.apiv3.ListingShippingDetails r1 = r1.f30257a
                    boolean r6 = r2.f23288c
                    boolean r7 = r2.f23289d
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.f r6 = r3.mo34187a(r1, r6, r7)
                    r7 = 1039487(0xfdc7f, float:1.456632E-39)
                    r3 = r4
                    r4 = r5
                    r5 = r0
                    com.etsy.android.ui.listing.ui.panels.shippingandpolicies.unstructured.a r0 = com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.unstructured.C10615a.m18544b(r2, r3, r4, r5, r6, r7)
                L_0x00b4:
                    r15.f23318b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.panels.shippingandpolicies.handlers.ShippingDetailsReceivedHandler$handle$1.C105732.invoke(com.etsy.android.ui.listing.ui.r):void");
            }
        });
    }
}
