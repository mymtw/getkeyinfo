package p452te;

import android.content.res.Resources;
import com.etsy.android.R;
import com.etsy.android.lib.models.apiv3.ShopV3;
import com.etsy.android.p327ui.shop.C11192q0;
import p628nj.C18263b;

/* renamed from: te.f */
public final class C13397f {

    /* renamed from: a */
    public boolean f29339a;

    /* renamed from: b */
    public C11192q0 f29340b;

    /* renamed from: c */
    public String f29341c;

    /* renamed from: d */
    public String f29342d;

    /* renamed from: e */
    public String f29343e;

    /* renamed from: f */
    public String f29344f;

    /* renamed from: g */
    public boolean f29345g;

    public C13397f(ShopV3 shopV3, C11192q0 q0Var, Resources resources) {
        this.f29342d = q0Var.mo36861a(shopV3.getVacationMessage(), shopV3.getVacationMessageTranslated());
        this.f29341c = resources.getString(R.string.shop_home_vacation_title, new Object[]{shopV3.getShopName()});
        this.f29343e = resources.getString(R.string.shop_home_vacation_notify_message);
        this.f29344f = resources.getString(R.string.shop_home_vacation_dont_notify_message);
        boolean z = !shopV3.getUserId().equals(C18263b.f40057V.mo45958c());
        this.f29345g = z;
        this.f29340b = q0Var;
        if (q0Var.f24754n) {
            this.f29339a = false;
        } else if (z && C18263b.f40057V.mo45960e()) {
            this.f29339a = true;
        }
    }
}
