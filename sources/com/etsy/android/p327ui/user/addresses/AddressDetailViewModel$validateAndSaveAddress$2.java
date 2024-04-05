package com.etsy.android.p327ui.user.addresses;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.addresses.AddressValidationError;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11463z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p514bk.C14088a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$validateAndSaveAddress$2 */
final class AddressDetailViewModel$validateAndSaveAddress$2 extends Lambda implements C19857l<C11463z.C11464a, C19394m> {
    public final /* synthetic */ List<C11396e> $existingAddressDetails;
    public final /* synthetic */ AddressDetailViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailViewModel$validateAndSaveAddress$2(AddressDetailViewModel addressDetailViewModel, List<? extends C11396e> list) {
        super(1);
        this.this$0 = addressDetailViewModel;
        this.$existingAddressDetails = list;
    }

    public final void invoke(C11463z.C11464a aVar) {
        Long l;
        C19383o.m32797g(aVar, "it");
        List<AddressValidationError> list = aVar.f25311a;
        if (list.isEmpty()) {
            AddressDetailViewModel addressDetailViewModel = this.this$0;
            int i = addressDetailViewModel.f25056h;
            if (i == 0) {
                C11462y c = AddressDetailViewModel.m19247c(addressDetailViewModel.f25055g);
                addressDetailViewModel.f25054f.postValue(AddressDetailViewModel.C11361a.C11367f.f25065a);
                ConsumerSingleObserver e = SubscribersKt.m32500e(new C19208j(C0391c.m1056b(addressDetailViewModel.f25050b, C0326j.m860e(addressDetailViewModel.f25050b, addressDetailViewModel.f25051c.mo37264a(new C11381a0.C11387f(c)))), C11416h.f25158b), new AddressDetailViewModel$saveAddress$1(addressDetailViewModel), new AddressDetailViewModel$saveAddress$2(addressDetailViewModel));
                C7091a aVar2 = addressDetailViewModel.f25053e;
                C19383o.m32798h(aVar2, "compositeDisposable");
                aVar2.mo19403b(e);
            } else if (i == 1 && (l = addressDetailViewModel.f25055g.f25198a) != null) {
                long longValue = l.longValue();
                C11462y c2 = AddressDetailViewModel.m19247c(addressDetailViewModel.f25055g);
                addressDetailViewModel.f25054f.postValue(AddressDetailViewModel.C11361a.C11367f.f25065a);
                ConsumerSingleObserver e2 = SubscribersKt.m32500e(new C19208j(C0391c.m1056b(addressDetailViewModel.f25050b, C0326j.m860e(addressDetailViewModel.f25050b, addressDetailViewModel.f25051c.mo37264a(new C11381a0.C11383b(longValue, c2)))), C14088a.f31026g), new AddressDetailViewModel$editAddress$1$1(addressDetailViewModel), new AddressDetailViewModel$editAddress$1$2(addressDetailViewModel));
                C7091a aVar3 = addressDetailViewModel.f25053e;
                C19383o.m32798h(aVar3, "compositeDisposable");
                aVar3.mo19403b(e2);
            }
        } else {
            AddressDetailViewModel addressDetailViewModel2 = this.this$0;
            List<C11396e> list2 = this.$existingAddressDetails;
            addressDetailViewModel2.getClass();
            C19383o.m32797g(list2, "existingItems");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list2);
            for (AddressValidationError addressValidationError : list) {
                String field = addressValidationError.getField();
                if (field != null) {
                    switch (field.hashCode()) {
                        case -161037277:
                            if (field.equals(ResponseConstants.FIRST_LINE)) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (next instanceof C11396e.C11401e) {
                                        arrayList2.add(next);
                                    }
                                }
                                C11396e.C11401e eVar = (C11396e.C11401e) C19327t.m32640V0(arrayList2);
                                if (eVar == null) {
                                    break;
                                } else {
                                    eVar.f25128a.f25175h = addressValidationError.getMessage();
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 120609:
                            if (field.equals(ResponseConstants.ZIP)) {
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    Object next2 = it2.next();
                                    if (next2 instanceof C11396e.C11405i) {
                                        arrayList3.add(next2);
                                    }
                                }
                                C11396e.C11405i iVar = (C11396e.C11405i) C19327t.m32640V0(arrayList3);
                                if (iVar == null) {
                                    break;
                                } else {
                                    iVar.f25132a.f25235j = addressValidationError.getMessage();
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 3053931:
                            if (field.equals("city")) {
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    Object next3 = it3.next();
                                    if (next3 instanceof C11396e.C11403g) {
                                        arrayList4.add(next3);
                                    }
                                }
                                C11396e.C11403g gVar = (C11396e.C11403g) C19327t.m32640V0(arrayList4);
                                if (gVar == null) {
                                    break;
                                } else {
                                    gVar.f25130a.f25196i = addressValidationError.getMessage();
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 3373707:
                            if (field.equals("name")) {
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it4 = arrayList.iterator();
                                while (it4.hasNext()) {
                                    Object next4 = it4.next();
                                    if (next4 instanceof C11396e.C11402f) {
                                        arrayList5.add(next4);
                                    }
                                }
                                C11396e.C11402f fVar = (C11396e.C11402f) C19327t.m32640V0(arrayList5);
                                if (fVar == null) {
                                    break;
                                } else {
                                    fVar.f25129a.f25185h = addressValidationError.getMessage();
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 106642798:
                            if (field.equals(ResponseConstants.PHONE)) {
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    Object next5 = it5.next();
                                    if (next5 instanceof C11396e.C11404h) {
                                        arrayList6.add(next5);
                                    }
                                }
                                C11396e.C11404h hVar = (C11396e.C11404h) C19327t.m32640V0(arrayList6);
                                if (hVar == null) {
                                    break;
                                } else {
                                    hVar.f25131a.f25214g = addressValidationError.getMessage();
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 109757585:
                            if (field.equals("state")) {
                                ArrayList arrayList7 = new ArrayList();
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    Object next6 = it6.next();
                                    if (next6 instanceof C11396e.C11397a) {
                                        arrayList7.add(next6);
                                    }
                                }
                                C11396e.C11397a aVar4 = (C11396e.C11397a) C19327t.m32640V0(arrayList7);
                                if (aVar4 == null) {
                                    break;
                                } else {
                                    aVar4.f25124a.f25144j = addressValidationError.getMessage();
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 265211103:
                            if (field.equals(ResponseConstants.SECOND_LINE)) {
                                ArrayList arrayList8 = new ArrayList();
                                Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    Object next7 = it7.next();
                                    if (next7 instanceof C11396e.C11407k) {
                                        arrayList8.add(next7);
                                    }
                                }
                                C11396e.C11407k kVar = (C11396e.C11407k) C19327t.m32640V0(arrayList8);
                                if (kVar == null) {
                                    break;
                                } else {
                                    kVar.f25134a.f25256i = addressValidationError.getMessage();
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
            this.this$0.f25054f.postValue(new AddressDetailViewModel.C11361a.C11371j(arrayList));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11463z.C11464a) obj);
        return C19394m.f43287a;
    }
}
