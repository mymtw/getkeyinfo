package com.etsy.android.p327ui.user.addresses;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.addresses.AddressDetailViewModel;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.google.android.play.core.assetpacks.C15588c1;
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
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailFragment$onCreateView$1 */
public final class AddressDetailFragment$onCreateView$1 extends Lambda implements C19857l<C11430n, C19394m> {
    public final /* synthetic */ AddressDetailFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressDetailFragment$onCreateView$1(AddressDetailFragment addressDetailFragment) {
        super(1);
        this.this$0 = addressDetailFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11430n) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C11430n nVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        C19383o.m32797g(nVar, "it");
        C11409f presenter = this.this$0.getPresenter();
        presenter.getClass();
        boolean z16 = true;
        if (nVar instanceof C11430n.C11437g) {
            AddressDetailViewModel addressDetailViewModel = presenter.f25147b;
            if (addressDetailViewModel != null) {
                C11430n.C11437g gVar = (C11430n.C11437g) nVar;
                C11396e eVar = gVar.f25246a;
                String str = gVar.f25247b;
                C19383o.m32797g(eVar, "item");
                C19383o.m32797g(str, "value");
                if (eVar instanceof C11396e.C11402f) {
                    addressDetailViewModel.f25055g.f25199b = str;
                } else if (eVar instanceof C11396e.C11401e) {
                    addressDetailViewModel.f25055g.f25200c = str;
                } else if (eVar instanceof C11396e.C11407k) {
                    addressDetailViewModel.f25055g.f25201d = str;
                } else if (eVar instanceof C11396e.C11405i) {
                    addressDetailViewModel.f25055g.f25204g = str;
                } else if (eVar instanceof C11396e.C11403g) {
                    addressDetailViewModel.f25055g.f25202e = str;
                } else if (eVar instanceof C11396e.C11397a) {
                    addressDetailViewModel.f25055g.f25203f = str;
                } else if (eVar instanceof C11396e.C11404h) {
                    addressDetailViewModel.f25055g.f25206i = str;
                } else {
                    if (eVar instanceof C11396e.C11398b) {
                        z15 = true;
                    } else {
                        z15 = eVar instanceof C11396e.C11399c;
                    }
                    if (!z15) {
                        z16 = C19383o.m32792b(eVar, C11396e.C11406j.f25133a);
                    }
                    if (!z16) {
                        C19383o.m32792b(eVar, C11396e.C11400d.f25127a);
                    }
                }
            }
        } else if (nVar instanceof C11430n.C11436f) {
            AddressDetailViewModel addressDetailViewModel2 = presenter.f25147b;
            if (addressDetailViewModel2 != null) {
                C11430n.C11436f fVar = (C11430n.C11436f) nVar;
                C11396e eVar2 = fVar.f25244a;
                int i = fVar.f25245b;
                C19383o.m32797g(eVar2, "item");
                if (eVar2 instanceof C11396e.C11397a) {
                    C11425l lVar = addressDetailViewModel2.f25055g;
                    Object[] array = ((C11396e.C11397a) eVar2).f25124a.f25141g.keySet().toArray(new String[0]);
                    C19383o.m32795e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    lVar.f25203f = ((String[]) array)[i];
                    return;
                }
                if (eVar2 instanceof C11396e.C11398b) {
                    z8 = true;
                } else {
                    z8 = eVar2 instanceof C11396e.C11402f;
                }
                if (z8) {
                    z9 = true;
                } else {
                    z9 = eVar2 instanceof C11396e.C11401e;
                }
                if (z9) {
                    z10 = true;
                } else {
                    z10 = eVar2 instanceof C11396e.C11407k;
                }
                if (z10) {
                    z11 = true;
                } else {
                    z11 = eVar2 instanceof C11396e.C11403g;
                }
                if (z11) {
                    z12 = true;
                } else {
                    z12 = eVar2 instanceof C11396e.C11405i;
                }
                if (z12) {
                    z13 = true;
                } else {
                    z13 = eVar2 instanceof C11396e.C11404h;
                }
                if (z13) {
                    z14 = true;
                } else {
                    z14 = eVar2 instanceof C11396e.C11399c;
                }
                if (!z14) {
                    z16 = eVar2 instanceof C11396e.C11406j;
                }
                if (!z16) {
                    C19383o.m32792b(eVar2, C11396e.C11400d.f25127a);
                }
            }
        } else if (nVar instanceof C11430n.C11432b) {
            AddressDetailViewModel addressDetailViewModel3 = presenter.f25147b;
            if (addressDetailViewModel3 != null) {
                List<C11396e> list = ((C11430n.C11432b) nVar).f25238a;
                C19383o.m32797g(list, "existingAddressDetails");
                ConsumerSingleObserver e = SubscribersKt.m32500e(new C19208j(C0391c.m1056b(addressDetailViewModel3.f25050b, C0326j.m860e(addressDetailViewModel3.f25050b, addressDetailViewModel3.f25051c.mo37264a(new C11381a0.C11389h(AddressDetailViewModel.m19247c(addressDetailViewModel3.f25055g))))), C15588c1.f35082h), new AddressDetailViewModel$validateAndSaveAddress$1(addressDetailViewModel3), new AddressDetailViewModel$validateAndSaveAddress$2(addressDetailViewModel3, list));
                C7091a aVar = addressDetailViewModel3.f25053e;
                C19383o.m32798h(aVar, "compositeDisposable");
                aVar.mo19403b(e);
            }
        } else if (nVar instanceof C11430n.C11435e) {
            C11414g gVar2 = presenter.f25146a;
            if (gVar2 != null) {
                gVar2.showCountrySelector();
            }
        } else if (nVar instanceof C11430n.C11433c) {
            AddressDetailViewModel addressDetailViewModel4 = presenter.f25147b;
            if (addressDetailViewModel4 != null) {
                C11430n.C11433c cVar = (C11430n.C11433c) nVar;
                C11396e eVar3 = cVar.f25239a;
                boolean z17 = cVar.f25240b;
                C19383o.m32797g(eVar3, "item");
                if (eVar3 instanceof C11396e.C11399c) {
                    addressDetailViewModel4.f25055g.f25207j = Boolean.valueOf(z17);
                    return;
                }
                if (eVar3 instanceof C11396e.C11398b) {
                    z = true;
                } else {
                    z = eVar3 instanceof C11396e.C11402f;
                }
                if (z) {
                    z2 = true;
                } else {
                    z2 = eVar3 instanceof C11396e.C11401e;
                }
                if (z2) {
                    z3 = true;
                } else {
                    z3 = eVar3 instanceof C11396e.C11407k;
                }
                if (z3) {
                    z4 = true;
                } else {
                    z4 = eVar3 instanceof C11396e.C11403g;
                }
                if (z4) {
                    z5 = true;
                } else {
                    z5 = eVar3 instanceof C11396e.C11405i;
                }
                if (z5) {
                    z6 = true;
                } else {
                    z6 = eVar3 instanceof C11396e.C11404h;
                }
                if (z6) {
                    z7 = true;
                } else {
                    z7 = eVar3 instanceof C11396e.C11406j;
                }
                if (!z7) {
                    z16 = eVar3 instanceof C11396e.C11397a;
                }
                if (!z16) {
                    C19383o.m32792b(eVar3, C11396e.C11400d.f25127a);
                }
            }
        } else if (C19383o.m32792b(nVar, C11430n.C11431a.f25237a)) {
            C11414g gVar3 = presenter.f25146a;
            if (gVar3 != null) {
                gVar3.showDeleteConfirmation();
            }
        } else if (nVar instanceof C11430n.C11434d) {
            C11414g gVar4 = presenter.f25146a;
            if (gVar4 != null) {
                gVar4.hideKeyboard();
            }
            AddressDetailViewModel addressDetailViewModel5 = presenter.f25147b;
            if (addressDetailViewModel5 != null) {
                C11430n.C11434d dVar = (C11430n.C11434d) nVar;
                PostalCodeSuggestion postalCodeSuggestion = dVar.f25241a;
                List<C11396e> list2 = dVar.f25242b;
                C19383o.m32797g(postalCodeSuggestion, ResponseConstants.SUGGESTION);
                C19383o.m32797g(list2, "addressDetails");
                C2895z<AddressDetailViewModel.C11361a> zVar = addressDetailViewModel5.f25054f;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list2);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C11396e.C11403g) {
                        arrayList2.add(next);
                    }
                }
                C11396e.C11403g gVar5 = (C11396e.C11403g) C19327t.m32640V0(arrayList2);
                if (gVar5 != null) {
                    C11424k0 k0Var = gVar5.f25130a;
                    k0Var.f25195h = postalCodeSuggestion.f25099a;
                    k0Var.f25196i = null;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof C11396e.C11405i) {
                        arrayList3.add(next2);
                    }
                }
                C11396e.C11405i iVar = (C11396e.C11405i) C19327t.m32640V0(arrayList3);
                if (iVar != null) {
                    C11429m0 m0Var = iVar.f25132a;
                    m0Var.f25234i = postalCodeSuggestion.f25101c;
                    m0Var.f25235j = null;
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (next3 instanceof C11396e.C11397a) {
                        arrayList4.add(next3);
                    }
                }
                C11396e.C11397a aVar2 = (C11396e.C11397a) C19327t.m32640V0(arrayList4);
                if (aVar2 != null) {
                    C11408e0 e0Var = aVar2.f25124a;
                    e0Var.f25143i = postalCodeSuggestion.f25100b;
                    e0Var.f25144j = null;
                }
                zVar.postValue(new AddressDetailViewModel.C11361a.C11371j(arrayList));
                C11425l lVar2 = addressDetailViewModel5.f25055g;
                lVar2.f25204g = postalCodeSuggestion.f25101c;
                lVar2.f25202e = postalCodeSuggestion.f25099a;
                lVar2.f25203f = postalCodeSuggestion.f25100b;
            }
        }
    }
}
