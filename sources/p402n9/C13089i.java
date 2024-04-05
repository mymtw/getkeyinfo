package p402n9;

import android.net.Uri;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.apiv3.TestAccountToolResponse;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANTooltip;
import com.etsy.android.lib.network.oauth2.SignInError;
import com.etsy.android.lib.network.oauth2.XAuthAccessToken;
import com.etsy.android.lib.toolbar.AdminToolbarJSONActivity;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.conversation.compose.C9456b;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.giftcards.GiftCardCreateFragment;
import com.etsy.android.p327ui.search.listingresults.SearchResultsListingsFragment;
import com.etsy.android.p327ui.search.p330v2.SearchOptions;
import com.etsy.android.p327ui.user.C11684r;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.privacy.C11622b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.functions.Consumer;
import p346fa.C12703a;
import p386l9.C13002a;
import p418pa.C13203e;
import p491ye.C13920d;
import p491ye.C13921e;
import p499zd.C13950a;
import p499zd.C13957e;
import p628nj.C18263b;

/* renamed from: n9.i */
public final /* synthetic */ class C13089i implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28774b;

    /* renamed from: c */
    public final /* synthetic */ Object f28775c;

    public /* synthetic */ C13089i(Object obj, int i) {
        this.f28774b = i;
        this.f28775c = obj;
    }

    public final void accept(Object obj) {
        boolean z;
        T t = null;
        switch (this.f28774b) {
            case 0:
                Throwable th = (Throwable) obj;
                ((C13092l) this.f28775c).getClass();
                C12703a aVar = C18263b.f40051O;
                if (aVar != null) {
                    aVar.mo45474a("braze.init_exception");
                    CrashUtil.m17307a().mo30458c(new Throwable("Problem with Braze registration", th), C8592b.C8595c.f18857a);
                    LogCatKt.m17045a().error(th);
                    return;
                }
                C19383o.m32805o("grafana");
                throw null;
            case 1:
                ((C8694h) this.f28775c).error((Throwable) obj);
                return;
            case 2:
                AdminToolbarJSONActivity.m34873onCreate$lambda3$lambda2((AdminToolbarJSONActivity) this.f28775c, (Uri) obj);
                return;
            case 3:
                C10677n nVar = (C10677n) this.f28775c;
                C11684r.C11685a aVar2 = (C11684r.C11685a) obj;
                C19383o.m32797g(nVar, "this$0");
                if (aVar2 instanceof C11684r.C11685a.C11687b) {
                    C13920d dVar = nVar.f23518h;
                    List<IANTooltip> list = ((C11684r.C11685a.C11687b) aVar2).f25903a;
                    dVar.getClass();
                    C19383o.m32797g(list, "tooltips");
                    if (dVar.f30585a.mo46729a()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                T next = it.next();
                                C13921e eVar = dVar.f30586b;
                                String tooltipType = ((IANTooltip) next).getTooltipType();
                                eVar.getClass();
                                C19383o.m32797g(tooltipType, "tooltip");
                                long j = eVar.f30588a.mo46761a().getLong(tooltipType, 0);
                                int i = dVar.f30586b.f30588a.mo46761a().getInt("tooltip_min_interval_days", 30);
                                dVar.f30587c.getClass();
                                if (TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - j) > ((long) i)) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    t = next;
                                }
                            }
                        }
                        t = (IANTooltip) t;
                    }
                    if (t != null) {
                        nVar.f23529s.onNext(t);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConversationComposeFragment) this.f28775c).handleConversationResult((C9456b) obj);
                return;
            case 5:
                GiftCardCreateFragment.m34988requestGiftCardDesigns$lambda3((GiftCardCreateFragment) this.f28775c, (Throwable) obj);
                return;
            case 6:
                C13957e eVar2 = (C13957e) this.f28775c;
                TestAccountToolResponse testAccountToolResponse = (TestAccountToolResponse) obj;
                C19383o.m32797g(eVar2, "this$0");
                String component1 = testAccountToolResponse.component1();
                String component2 = testAccountToolResponse.component2();
                C8694h a = LogCatKt.m17045a();
                a.mo21310e("Token get! " + component1);
                if (component1 == null || component2 == null) {
                    eVar2.f30689n.postValue(new C13950a.C13951a(new SignInError.Unknown(SignInError.SignInType.SIGN_IN_AS)));
                    LogCatKt.m17045a().mo21306a("Error during sign in as.");
                    return;
                }
                eVar2.f30679d.mo37346a(new C13002a.C13003a(new XAuthAccessToken(component1, component2, "")));
                eVar2.f30689n.postValue(new C13950a.C13953c(C0326j.m864i("Token get! ", component1)));
                return;
            case 7:
                SearchResultsListingsFragment.m35044onCreateView$lambda3((SearchResultsListingsFragment) this.f28775c, (SearchOptions) obj);
                return;
            case 8:
                AddressDetailViewModel addressDetailViewModel = (AddressDetailViewModel) this.f28775c;
                C19383o.m32797g(addressDetailViewModel, "this$0");
                LogCatKt.m17045a().error((Throwable) obj);
                addressDetailViewModel.f25054f.postValue(AddressDetailViewModel.C11361a.C11362a.f25061a);
                return;
            default:
                C11622b bVar = (C11622b) this.f28775c;
                Throwable th2 = (Throwable) obj;
                C19383o.m32797g(bVar, "this$0");
                bVar.f25728f.setValue(C13203e.C13204a.f29039a);
                return;
        }
    }
}
