package com.etsy.android.p327ui.user.addresses.viewholders;

import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.AddressTextInputViewHolder$bind$3 */
public final class AddressTextInputViewHolder$bind$3 extends Lambda implements C19857l<String, C19394m> {
    public final /* synthetic */ CollageTextInput $clg;
    public final /* synthetic */ C11396e $item;
    public final /* synthetic */ AddressTextInputViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressTextInputViewHolder$bind$3(AddressTextInputViewHolder addressTextInputViewHolder, C11396e eVar, CollageTextInput collageTextInput) {
        super(1);
        this.this$0 = addressTextInputViewHolder;
        this.$item = eVar;
        this.$clg = collageTextInput;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C19394m.f43287a;
    }

    public final void invoke(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        C19383o.m32797g(str, "newValue");
        AddressTextInputViewHolder addressTextInputViewHolder = this.this$0;
        C11396e eVar = this.$item;
        int i = AddressTextInputViewHolder.f25276c;
        addressTextInputViewHolder.getClass();
        boolean z4 = true;
        if (eVar instanceof C11396e.C11402f) {
            ((C11396e.C11402f) eVar).f25129a.f25184g = str;
        } else if (eVar instanceof C11396e.C11401e) {
            ((C11396e.C11401e) eVar).f25128a.f25174g = str;
        } else if (eVar instanceof C11396e.C11407k) {
            ((C11396e.C11407k) eVar).f25134a.f25255h = str;
        } else if (eVar instanceof C11396e.C11403g) {
            ((C11396e.C11403g) eVar).f25130a.f25195h = str;
        } else if (eVar instanceof C11396e.C11405i) {
            ((C11396e.C11405i) eVar).f25132a.f25234i = str;
        } else if (eVar instanceof C11396e.C11397a) {
            ((C11396e.C11397a) eVar).f25124a.f25143i = str;
        } else if (eVar instanceof C11396e.C11404h) {
            ((C11396e.C11404h) eVar).f25131a.f25213f = str;
        } else {
            if (eVar instanceof C11396e.C11398b) {
                z2 = true;
            } else {
                z2 = eVar instanceof C11396e.C11399c;
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = C19383o.m32792b(eVar, C11396e.C11400d.f25127a);
            }
            if (!z3) {
                C19383o.m32792b(eVar, C11396e.C11406j.f25133a);
            }
        }
        if (C18263b.m30839d0(str)) {
            this.$clg.setErrorText((String) null);
            AddressTextInputViewHolder addressTextInputViewHolder2 = this.this$0;
            C11396e eVar2 = this.$item;
            addressTextInputViewHolder2.getClass();
            if (eVar2 instanceof C11396e.C11402f) {
                ((C11396e.C11402f) eVar2).f25129a.f25185h = null;
            } else if (eVar2 instanceof C11396e.C11401e) {
                ((C11396e.C11401e) eVar2).f25128a.f25175h = null;
            } else if (eVar2 instanceof C11396e.C11407k) {
                ((C11396e.C11407k) eVar2).f25134a.f25256i = null;
            } else if (eVar2 instanceof C11396e.C11403g) {
                ((C11396e.C11403g) eVar2).f25130a.f25196i = null;
            } else if (eVar2 instanceof C11396e.C11405i) {
                ((C11396e.C11405i) eVar2).f25132a.f25235j = null;
            } else if (eVar2 instanceof C11396e.C11397a) {
                ((C11396e.C11397a) eVar2).f25124a.f25144j = null;
            } else if (eVar2 instanceof C11396e.C11404h) {
                ((C11396e.C11404h) eVar2).f25131a.f25214g = null;
            } else {
                if (eVar2 instanceof C11396e.C11398b) {
                    z = true;
                } else {
                    z = eVar2 instanceof C11396e.C11399c;
                }
                if (!z) {
                    z4 = C19383o.m32792b(eVar2, C11396e.C11400d.f25127a);
                }
                if (!z4) {
                    C19383o.m32792b(eVar2, C11396e.C11406j.f25133a);
                }
            }
        }
        this.this$0.f25277b.invoke(new C11430n.C11437g(this.$item, str));
    }
}
