package com.etsy.android.p327ui.search.p330v2;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.MenuCount;
import com.etsy.android.lib.models.apiv3.SearchSimplifiedQueries;
import com.etsy.android.lib.models.apiv3.addresses.UserAddress;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.push.settings.C8848c;
import com.etsy.android.p327ui.navigation.bottom.C10681c;
import com.etsy.android.p327ui.search.p330v2.C10975f;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.p327ui.user.addresses.AddressItemUI;
import com.etsy.android.p327ui.user.addresses.C11445t;
import com.etsy.android.p327ui.user.addresses.C11460w;
import com.etsy.android.p327ui.user.addresses.C11463z;
import com.etsy.android.p327ui.user.inappnotifications.C11554h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19543e0;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19208j;
import p248tp.C8071s;
import p287xp.C8339g;
import p628nj.C18263b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.search.v2.h */
public final /* synthetic */ class C11027h implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f24445b;

    /* renamed from: c */
    public final /* synthetic */ Object f24446c;

    public /* synthetic */ C11027h(Object obj, int i) {
        this.f24445b = i;
        this.f24446c = obj;
    }

    public final Object apply(Object obj) {
        Object obj2 = null;
        switch (this.f24445b) {
            case 0:
                C11028i iVar = (C11028i) this.f24446c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(iVar, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                if (!vVar.mo74384a()) {
                    return new C10975f.C10976a(C0761x.m1692S0(vVar, iVar.f24448b), vVar.f44614a.f44365f, 4);
                }
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                if (a0Var != null) {
                    obj2 = MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), SearchSimplifiedQueries.class);
                }
                C19383o.m32794d(obj2);
                return new C10975f.C10977b((SearchSimplifiedQueries) obj2);
            case 1:
                UserBadgeCountManager userBadgeCountManager = (UserBadgeCountManager) this.f24446c;
                C19383o.m32797g(userBadgeCountManager, "this$0");
                C19383o.m32797g((C19394m) obj, "it");
                if (!userBadgeCountManager.f25038b.get().mo45960e()) {
                    return C8071s.m16251e(new C10681c(0, 0, 0));
                }
                List<String> list = C8591a.f18700r;
                if (!C18263b.f40056T.f18706f.mo21132b(C8592b.f18773a)) {
                    return C8071s.m16251e(new C10681c(0, 0, 0));
                }
                C8071s<C20145v<MenuCount>> a = userBadgeCountManager.f25037a.get().mo31295a();
                C8848c cVar = new C8848c(userBadgeCountManager, 4);
                a.getClass();
                return new C19208j(a, cVar);
            case 2:
                C11463z zVar = (C11463z) obj;
                C19383o.m32797g((C11460w) this.f24446c, "this$0");
                C19383o.m32797g(zVar, "result");
                if (zVar instanceof C11463z.C11465b) {
                    C11463z.C11465b bVar = (C11463z.C11465b) zVar;
                    if (C19543e0.m33306Y(bVar.f25312a)) {
                        List<UserAddress> list2 = bVar.f25312a;
                        ArrayList arrayList = new ArrayList();
                        for (UserAddress userAddress : list2) {
                            C19383o.m32797g(userAddress, "userAddress");
                            String name = userAddress.getName();
                            String str = name == null ? "" : name;
                            String first_line = userAddress.getFirst_line();
                            String str2 = first_line == null ? "" : first_line;
                            String second_line = userAddress.getSecond_line();
                            String str3 = second_line == null ? "" : second_line;
                            String city = userAddress.getCity();
                            String str4 = city == null ? "" : city;
                            String state = userAddress.getState();
                            String str5 = state == null ? "" : state;
                            String zip = userAddress.getZip();
                            String str6 = zip == null ? "" : zip;
                            String country_name = userAddress.getCountry_name();
                            String str7 = country_name == null ? "" : country_name;
                            Integer country_id = userAddress.getCountry_id();
                            int intValue = country_id != null ? country_id.intValue() : 0;
                            String phone = userAddress.getPhone();
                            Boolean is_default_shipping = userAddress.is_default_shipping();
                            boolean booleanValue = is_default_shipping != null ? is_default_shipping.booleanValue() : false;
                            Long user_address_id = userAddress.getUser_address_id();
                            arrayList.add(new AddressItemUI(str, str2, str3, str4, str5, str6, str7, intValue, phone, booleanValue, user_address_id != null ? user_address_id.longValue() : -1, userAddress.getFormat()));
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((AddressItemUI) next).is_default_address()) {
                                    obj2 = next;
                                }
                            }
                        }
                        AddressItemUI addressItemUI = (AddressItemUI) obj2;
                        if (addressItemUI != null) {
                            arrayList.remove(addressItemUI);
                            arrayList.add(0, addressItemUI);
                        }
                        return new C11445t.C11451f(arrayList);
                    }
                }
                return new C11445t.C11448c();
            default:
                C11554h hVar = (C11554h) this.f24446c;
                List<InAppNotification> list3 = (List) obj;
                C19383o.m32797g(hVar, "this$0");
                C19383o.m32797g(list3, "it");
                hVar.f25590b = list3;
                return list3;
        }
    }
}
