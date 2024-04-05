package p321cc;

import com.etsy.android.lib.models.GiftCardAmountValues;
import com.etsy.android.lib.models.GiftCardAmounts;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext;
import com.etsy.android.lib.models.apiv3.sdl.Page;
import com.etsy.android.uikit.util.C11908l;
import kotlin.jvm.internal.C19383o;
import p287xp.C8339g;
import p321cc.C8569c;
import p342ed.C12683b;
import p458uc.C13469d;
import p459ud.C13487j;
import p568fn.C17782b;
import retrofit2.C20145v;

/* renamed from: cc.a */
public final /* synthetic */ class C8567a implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f18656b;

    public /* synthetic */ C8567a(int i) {
        this.f18656b = i;
    }

    public final Object apply(Object obj) {
        T t;
        switch (this.f18656b) {
            case 0:
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                AppsInventoryAddToCartContext appsInventoryAddToCartContext = (AppsInventoryAddToCartContext) vVar.f44615b;
                return (!vVar.mo74384a() || appsInventoryAddToCartContext == null) ? new C8569c.C8576c.C8577a((Throwable) null) : new C8569c.C8576c.C8578b(appsInventoryAddToCartContext);
            case 1:
                GiftCardAmountValues giftCardAmountValues = (GiftCardAmountValues) obj;
                C19383o.m32797g(giftCardAmountValues, "it");
                return new GiftCardAmounts(C17782b.m29864d0(new GiftCardAmountValues(giftCardAmountValues.getType(), giftCardAmountValues.getValues())));
            case 2:
                C20145v vVar2 = (C20145v) obj;
                C19383o.m32797g(vVar2, ResponseConstants.RESPONSE);
                if (vVar2.mo74384a()) {
                    return C13469d.C13471b.f29491a;
                }
                int i = vVar2.f44614a.f44365f;
                return new C13469d.C13470a(0);
            case 3:
                C19383o.m32797g((Throwable) obj, "throwable");
                return new C12683b.C12684a.C12685a();
            case 4:
                C20145v vVar3 = (C20145v) obj;
                C19383o.m32797g(vVar3, ResponseConstants.RESPONSE);
                return (!vVar3.mo74384a() || (t = vVar3.f44615b) == null) ? new C13487j.C13488a() : new C13487j.C13489b((Page) t);
            default:
                C19383o.m32797g((Throwable) obj, "it");
                return C11908l.C11909a.f26469b;
        }
    }
}
