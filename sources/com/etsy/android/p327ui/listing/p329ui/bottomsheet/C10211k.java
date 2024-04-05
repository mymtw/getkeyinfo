package com.etsy.android.p327ui.listing.p329ui.bottomsheet;

import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.p327ui.BOEActivity;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.stylekit.views.CollageBottomSheet;
import com.etsy.android.uikit.view.ListingFullImageView;
import com.etsy.android.uikit.view.TranslateButton;
import kotlin.jvm.internal.C19383o;
import p466vc.C13573c;

/* renamed from: com.etsy.android.ui.listing.ui.bottomsheet.k */
public final class C10211k {

    /* renamed from: a */
    public final C11786n f22453a;

    /* renamed from: b */
    public final C13573c f22454b;

    /* renamed from: c */
    public final CollageBottomSheet f22455c;

    /* renamed from: d */
    public final TextView f22456d;

    /* renamed from: e */
    public final TextView f22457e;

    /* renamed from: f */
    public final ListingFullImageView f22458f;

    /* renamed from: g */
    public final TranslateButton f22459g;

    /* renamed from: h */
    public C10208h f22460h;

    public C10211k(BOEActivity bOEActivity, C11786n nVar, C13573c cVar) {
        C19383o.m32797g(bOEActivity, "activity");
        this.f22453a = nVar;
        this.f22454b = cVar;
        CollageBottomSheet collageBottomSheet = new CollageBottomSheet(bOEActivity);
        collageBottomSheet.setContentView((int) R.layout.title_body_bottomsheet);
        this.f22455c = collageBottomSheet;
        this.f22456d = (TextView) collageBottomSheet.findViewById(R.id.bottomsheet_title);
        this.f22457e = (TextView) collageBottomSheet.findViewById(R.id.bottomsheet_body);
        this.f22458f = (ListingFullImageView) collageBottomSheet.findViewById(R.id.bottomsheet_image);
        this.f22459g = (TranslateButton) collageBottomSheet.findViewById(R.id.machine_translation_one_click);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r13 == null) goto L_0x0021;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33591a(com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10208h r13) {
        /*
            r12 = this;
            java.lang.String r0 = "bottomSheetContent"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            r12.f22460h = r13
            android.widget.TextView r0 = r12.f22456d
            if (r0 != 0) goto L_0x000c
            goto L_0x0011
        L_0x000c:
            java.lang.String r13 = r13.f22441a
            r0.setText(r13)
        L_0x0011:
            com.etsy.android.ui.listing.ui.bottomsheet.h r13 = r12.f22460h
            java.lang.String r0 = ""
            if (r13 == 0) goto L_0x0021
            java.lang.CharSequence r13 = r13.f22443c
            if (r13 == 0) goto L_0x0021
            java.lang.String r13 = r13.toString()
            if (r13 != 0) goto L_0x0022
        L_0x0021:
            r13 = r0
        L_0x0022:
            android.widget.TextView r1 = r12.f22457e
            if (r1 != 0) goto L_0x0027
            goto L_0x0034
        L_0x0027:
            boolean r2 = p628nj.C18263b.m30810E(r13)
            if (r2 == 0) goto L_0x0031
            android.text.Spanned r13 = p628nj.C18263b.m30867s0(r13)
        L_0x0031:
            r1.setText(r13)
        L_0x0034:
            com.etsy.android.ui.listing.ui.bottomsheet.h r13 = r12.f22460h
            r1 = 0
            if (r13 == 0) goto L_0x0042
            java.lang.Boolean r13 = r13.f22444d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r13, r2)
            goto L_0x0043
        L_0x0042:
            r13 = r1
        L_0x0043:
            r2 = 1
            if (r13 == 0) goto L_0x00cf
            android.widget.TextView r13 = r12.f22457e
            if (r13 == 0) goto L_0x00cf
            r13.setClickable(r2)
            r13.setFocusable(r2)
            com.etsy.android.ui.listing.ui.bottomsheet.i r3 = new com.etsy.android.ui.listing.ui.bottomsheet.i
            com.etsy.android.stylekit.views.CollageBottomSheet r4 = r12.f22455c
            vc.c r5 = r12.f22454b
            r3.<init>(r4, r5)
            com.etsy.android.ui.listing.ui.bottomsheet.h r4 = r12.f22460h
            if (r4 == 0) goto L_0x0069
            java.lang.CharSequence r4 = r4.f22443c
            if (r4 == 0) goto L_0x0069
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = r4
        L_0x0069:
            boolean r0 = p628nj.C18263b.m30810E(r0)
            if (r0 == 0) goto L_0x00ba
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r4 = r13.getText()
            r0.<init>(r4)
            java.lang.CharSequence r4 = r13.getText()
            int r4 = r4.length()
            java.lang.Class<android.text.style.URLSpan> r5 = android.text.style.URLSpan.class
            java.lang.Object[] r4 = r0.getSpans(r1, r4, r5)
            android.text.style.URLSpan[] r4 = (android.text.style.URLSpan[]) r4
            java.lang.String r5 = "urls"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            int r5 = r4.length
            r6 = r1
        L_0x008f:
            if (r6 >= r5) goto L_0x00af
            r7 = r4[r6]
            int r8 = r0.getSpanStart(r7)
            int r9 = r0.getSpanEnd(r7)
            java.lang.String r10 = r7.getURL()
            r0.removeSpan(r7)
            com.etsy.android.ui.listing.ui.bottomsheet.BottomSheetLinkNavigator$navigateHtmlPages$1$clickable$1 r11 = new com.etsy.android.ui.listing.ui.bottomsheet.BottomSheetLinkNavigator$navigateHtmlPages$1$clickable$1
            r11.<init>(r10, r3, r7)
            r7 = 17
            r0.setSpan(r11, r8, r9, r7)
            int r6 = r6 + 1
            goto L_0x008f
        L_0x00af:
            r13.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r13.setMovementMethod(r0)
            goto L_0x00cf
        L_0x00ba:
            com.etsy.android.stylekit.views.CollageBottomSheet r0 = r3.f22449a
            android.content.Context r0 = r0.getContext()
            java.lang.String r4 = "bottomSheet.context"
            kotlin.jvm.internal.C19383o.m32796f(r0, r4)
            com.etsy.android.ui.listing.ui.bottomsheet.BottomSheetLinkNavigator$navigateLinks$1 r4 = new com.etsy.android.ui.listing.ui.bottomsheet.BottomSheetLinkNavigator$navigateLinks$1
            r4.<init>(r3)
            r3 = 8
            com.etsy.android.uikit.util.EtsyLinkify.m19612f(r0, r13, r2, r4, r3)
        L_0x00cf:
            com.etsy.android.ui.listing.ui.bottomsheet.h r13 = r12.f22460h
            if (r13 == 0) goto L_0x00dc
            java.lang.Boolean r13 = r13.f22445e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r13, r0)
            goto L_0x00dd
        L_0x00dc:
            r13 = r1
        L_0x00dd:
            r0 = 0
            if (r13 == 0) goto L_0x0110
            com.etsy.android.uikit.view.TranslateButton r13 = r12.f22459g
            if (r13 == 0) goto L_0x00e7
            com.etsy.android.extensions.ViewExtensions.m12869m(r13)
        L_0x00e7:
            com.etsy.android.uikit.view.TranslateButton r13 = r12.f22459g
            if (r13 == 0) goto L_0x00f5
            com.etsy.android.ui.listing.ui.ListingMachineTranslationHelper r3 = new com.etsy.android.ui.listing.ui.ListingMachineTranslationHelper
            com.etsy.android.ui.util.n r4 = r12.f22453a
            vc.c r5 = r12.f22454b
            r3.<init>(r13, r4, r5)
            goto L_0x00f6
        L_0x00f5:
            r3 = r0
        L_0x00f6:
            if (r3 == 0) goto L_0x00fd
            android.widget.TextView r13 = r3.f22362e
            com.etsy.android.extensions.ViewExtensions.m12860d(r13)
        L_0x00fd:
            com.etsy.android.ui.listing.ui.bottomsheet.h r13 = r12.f22460h
            if (r13 == 0) goto L_0x0117
            if (r3 == 0) goto L_0x0117
            com.etsy.android.ui.listing.ui.MachineTranslationViewState r4 = r13.f22446f
            boolean r13 = r13.f22447g
            com.etsy.android.ui.listing.ui.bottomsheet.ListingBottomSheetHelper$setUpTranslations$1$1 r5 = new com.etsy.android.ui.listing.ui.bottomsheet.ListingBottomSheetHelper$setUpTranslations$1$1
            r5.<init>(r12)
            r3.mo33547a(r4, r13, r5)
            goto L_0x0117
        L_0x0110:
            com.etsy.android.uikit.view.TranslateButton r13 = r12.f22459g
            if (r13 == 0) goto L_0x0117
            com.etsy.android.extensions.ViewExtensions.m12860d(r13)
        L_0x0117:
            com.etsy.android.ui.listing.ui.bottomsheet.h r13 = r12.f22460h
            if (r13 == 0) goto L_0x0120
            boolean r13 = r13.f22448h
            if (r13 != r2) goto L_0x0120
            r1 = r2
        L_0x0120:
            if (r1 == 0) goto L_0x0130
            android.widget.TextView r13 = r12.f22456d
            if (r13 == 0) goto L_0x0129
            p435rb.C13351b.m21019c(r13)
        L_0x0129:
            android.widget.TextView r13 = r12.f22457e
            if (r13 == 0) goto L_0x0130
            p435rb.C13351b.m21019c(r13)
        L_0x0130:
            com.etsy.android.stylekit.views.CollageBottomSheet r13 = r12.f22455c
            r13.setPopover(r2)
            com.etsy.android.uikit.view.ListingFullImageView r13 = r12.f22458f
            if (r13 == 0) goto L_0x0153
            com.etsy.android.ui.listing.ui.bottomsheet.h r1 = r12.f22460h
            if (r1 == 0) goto L_0x0140
            com.etsy.android.lib.models.apiv3.Image r1 = r1.f22442b
            goto L_0x0141
        L_0x0140:
            r1 = r0
        L_0x0141:
            if (r1 != 0) goto L_0x0147
            com.etsy.android.extensions.ViewExtensions.m12860d(r13)
            goto L_0x0153
        L_0x0147:
            com.etsy.android.extensions.ViewExtensions.m12869m(r13)
            com.etsy.android.ui.listing.ui.bottomsheet.h r1 = r12.f22460h
            if (r1 == 0) goto L_0x0150
            com.etsy.android.lib.models.apiv3.Image r0 = r1.f22442b
        L_0x0150:
            r13.setImageInfo(r0)
        L_0x0153:
            com.etsy.android.stylekit.views.CollageBottomSheet r13 = r12.f22455c
            boolean r13 = r13.isShowing()
            if (r13 != 0) goto L_0x0160
            com.etsy.android.stylekit.views.CollageBottomSheet r13 = r12.f22455c
            r13.show()
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.bottomsheet.C10211k.mo33591a(com.etsy.android.ui.listing.ui.bottomsheet.h):void");
    }
}
