package p415of;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.widget.LinearLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.logger.referrers.Referrer;
import com.etsy.android.lib.models.apiv3.cart.GiftOptions;
import com.etsy.android.lib.models.apiv3.cart.GiftWrap;
import com.etsy.android.lib.models.apiv3.vespa.ServerDrivenAction;
import com.etsy.android.stylekit.views.C9059j;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.vespa.GiftOptionsHelper$setUpGiftMessage$2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p423pf.C13239i;
import p628nj.C18263b;

/* renamed from: of.g */
public final class C13178g {

    /* renamed from: a */
    public final View f29001a;

    /* renamed from: b */
    public final String f29002b;

    /* renamed from: c */
    public final GiftOptions f29003c;

    /* renamed from: d */
    public final List<ServerDrivenAction> f29004d;

    /* renamed from: e */
    public final C13239i f29005e;

    /* renamed from: f */
    public final C8703p f29006f;

    /* renamed from: g */
    public final CollageCheckbox f29007g;

    /* renamed from: h */
    public final CollageCheckbox f29008h;

    /* renamed from: i */
    public final CollageTextInput f29009i;

    /* renamed from: j */
    public final LinearLayout f29010j;

    /* renamed from: k */
    public final CollageCheckbox f29011k;

    /* renamed from: l */
    public final View f29012l;

    public C13178g(View view, String str, GiftOptions giftOptions, List<? extends ServerDrivenAction> list, C13239i iVar, C8703p pVar) {
        C19383o.m32797g(iVar, "clickHandler");
        C19383o.m32797g(pVar, "viewTracker");
        this.f29001a = view;
        this.f29002b = str;
        this.f29003c = giftOptions;
        this.f29004d = list;
        this.f29005e = iVar;
        this.f29006f = pVar;
        this.f29007g = (CollageCheckbox) view.findViewById(R.id.gift_options_gift_checkbox);
        this.f29008h = (CollageCheckbox) view.findViewById(R.id.gift_options_gift_message_checkbox);
        this.f29009i = (CollageTextInput) view.findViewById(R.id.gift_options_gift_message);
        this.f29010j = (LinearLayout) view.findViewById(R.id.gift_options_gift_wrap_container);
        this.f29011k = (CollageCheckbox) view.findViewById(R.id.gift_options_gift_wrap_checkbox);
        this.f29012l = view.findViewById(R.id.gift_options_gift_wrap_details);
    }

    /* renamed from: a */
    public static final Map m20856a(C13178g gVar) {
        return gVar.f29001a.getContext() != null ? C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.REFERRER, new Referrer("cart/kebab menu").toString())) : C19294b0.m32559p0();
    }

    /* renamed from: b */
    public static final void m20857b(C13178g gVar, String str) {
        T t;
        Iterator<T> it = gVar.f29004d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C19383o.m32792b(((ServerDrivenAction) t).getType(), "gift_message")) {
                break;
            }
        }
        ServerDrivenAction serverDrivenAction = (ServerDrivenAction) t;
        gVar.f29003c.setGiftMessage(str);
        if (serverDrivenAction != null) {
            serverDrivenAction.addParam("value", str);
            gVar.f29005e.mo31328c(serverDrivenAction);
        }
    }

    /* renamed from: c */
    public final String mo45898c(boolean z) {
        String string = this.f29001a.getContext().getString(R.string.gift_options_gift_message_desc, new Object[]{this.f29002b});
        C19383o.m32796f(string, "itemView.context.getStri…       shopName\n        )");
        if (!z) {
            return string;
        }
        StringBuilder h = C0072d.m201h(string);
        h.append(this.f29001a.getContext().getString(R.string.gift_options_gift_message_reminder));
        return h.toString();
    }

    /* renamed from: d */
    public final void mo45899d() {
        if (this.f29003c.offersGiftMessage()) {
            ViewExtensions.m12869m(this.f29008h);
            if (this.f29003c.offersGiftMessage() && C18263b.m30839d0(this.f29003c.getGiftMessage())) {
                this.f29008h.setChecked(true);
                ViewExtensions.m12869m(this.f29009i);
                this.f29009i.setText(this.f29003c.getGiftMessage());
            } else {
                this.f29008h.setChecked(false);
                ViewExtensions.m12860d(this.f29009i);
            }
            this.f29008h.setOnCheckedChangeListener(new C13176e(this));
            this.f29009i.setTextChangeListener(new GiftOptionsHelper$setUpGiftMessage$2(this));
            CollageCheckbox collageCheckbox = this.f29008h;
            collageCheckbox.setContentDescription(mo45898c(collageCheckbox.isChecked()));
        } else {
            ViewExtensions.m12860d(this.f29008h);
        }
        if (this.f29003c.getGiftWrap() != null) {
            ViewExtensions.m12869m(this.f29010j);
            this.f29011k.setChecked(this.f29003c.getGiftWrap().isSelected());
            this.f29011k.setText(this.f29001a.getContext().getString(R.string.gift_options_gift_wrap, new Object[]{this.f29003c.getGiftWrap().getPrice().getCurrencyFormattedShort()}));
            this.f29011k.setOnCheckedChangeListener(new C13177f(this));
            GiftWrap giftWrap = this.f29003c.getGiftWrap();
            if (giftWrap == null) {
                return;
            }
            if (giftWrap.getPreviewImage() == null || !C18263b.m30839d0(giftWrap.getDescription())) {
                ViewExtensions.m12860d(this.f29012l);
            } else {
                this.f29012l.setOnClickListener(new C9059j(this, 3));
            }
        } else {
            ViewExtensions.m12860d(this.f29010j);
        }
    }
}
