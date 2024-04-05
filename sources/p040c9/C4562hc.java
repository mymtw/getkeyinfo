package p040c9;

import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.CurrencyJsonAdapter;
import com.etsy.android.lib.currency.EtsyMoneyJsonAdapter;
import com.etsy.android.lib.models.LegacyBaseModelAdapterFactory;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.apiv3.listing.EmptyArrayToMapAdapter;
import com.etsy.android.lib.models.conversation.context.ConversationContextAdapterFactory;
import com.etsy.android.lib.models.pastpurchase.adapters.ForceToLongJsonAdapter;
import com.etsy.android.lib.parsing.EtsyIdTypeAdapter;
import com.google.android.play.core.assetpacks.C15588c1;
import com.squareup.moshi.C17413x;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.adapters.Rfc3339DateJsonAdapter;
import dagger.internal.C17555d;
import java.util.ArrayList;
import java.util.Date;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: c9.hc */
public final class C4562hc implements C17555d<C17414y> {

    /* renamed from: a */
    public final C15588c1 f10041a;

    /* renamed from: b */
    public final C19011a<C8630b> f10042b;

    /* renamed from: c */
    public final C19011a<EmptyArrayToMapAdapter.EmptyArrayToMapAdapterFactory> f10043c;

    public C4562hc(C15588c1 c1Var, C19011a<C8630b> aVar, C19011a<EmptyArrayToMapAdapter.EmptyArrayToMapAdapterFactory> aVar2) {
        this.f10041a = c1Var;
        this.f10042b = aVar;
        this.f10043c = aVar2;
    }

    public final Object get() {
        C15588c1 c1Var = this.f10041a;
        C8630b bVar = this.f10042b.get();
        EmptyArrayToMapAdapter.EmptyArrayToMapAdapterFactory emptyArrayToMapAdapterFactory = this.f10043c.get();
        c1Var.getClass();
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        C19383o.m32797g(emptyArrayToMapAdapterFactory, "emptyArrayToMapAdapterFactory");
        C17414y.C17415a aVar = new C17414y.C17415a();
        aVar.mo68560a(ConversationContextAdapterFactory.Companion.adapterFactory());
        aVar.mo68560a(LegacyBaseModelAdapterFactory.Companion.adapterFactory());
        aVar.mo68561b(new EtsyIdTypeAdapter());
        aVar.mo68560a(InAppNotification.Companion.adapterFactory());
        Rfc3339DateJsonAdapter rfc3339DateJsonAdapter = new Rfc3339DateJsonAdapter();
        ArrayList arrayList = C17414y.f38021d;
        aVar.mo68560a(new C17413x(Date.class, rfc3339DateJsonAdapter));
        aVar.mo68561b(new EtsyMoneyJsonAdapter(bVar));
        aVar.mo68561b(new CurrencyJsonAdapter());
        aVar.mo68560a(emptyArrayToMapAdapterFactory);
        aVar.mo68561b(new ForceToLongJsonAdapter());
        return new C17414y(aVar);
    }
}
