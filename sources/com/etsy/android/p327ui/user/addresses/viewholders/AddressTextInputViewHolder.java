package com.etsy.android.p327ui.user.addresses.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.TextinputKt;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.C11430n;
import com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt;
import com.etsy.android.stylekit.views.CollageTextInput;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.addresses.viewholders.AddressTextInputViewHolder */
public final class AddressTextInputViewHolder extends RecyclerView.C3084b0 {

    /* renamed from: c */
    public static final /* synthetic */ int f25276c = 0;

    /* renamed from: b */
    public final C19857l<C11430n, C19394m> f25277b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressTextInputViewHolder(CollageTextInput collageTextInput, C19857l lVar) {
        super(collageTextInput);
        C19383o.m32797g(lVar, "eventHandler");
        this.f25277b = lVar;
    }

    /* renamed from: g */
    public static void m19272g(CollageTextInput collageTextInput, String str) {
        if (C18263b.m30839d0(str)) {
            collageTextInput.setErrorText(str);
            ViewsExtensionsKt.m17422a(collageTextInput, str, 500);
            return;
        }
        collageTextInput.setErrorText((String) null);
    }

    /* renamed from: e */
    public final void mo37304e(C11396e eVar) {
        View view = this.itemView;
        C19383o.m32795e(view, "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageTextInput");
        CollageTextInput collageTextInput = (CollageTextInput) view;
        collageTextInput.setMultiline(false);
        TextinputKt.m18959a(collageTextInput, AddressTextInputViewHolder$bind$1.INSTANCE);
        if (eVar instanceof C11396e.C11402f) {
            C11396e.C11402f fVar = (C11396e.C11402f) eVar;
            collageTextInput.setLabelText(mo37305f(fVar.f25129a.f25180c));
            collageTextInput.setRequired(fVar.f25129a.f25181d);
            collageTextInput.setText(fVar.f25129a.f25184g);
            if (C19383o.m32792b(fVar.f25129a.f25186i, Boolean.TRUE)) {
                collageTextInput.setImeOptions(6);
            }
            m19272g(collageTextInput, fVar.f25129a.f25185h);
        } else if (eVar instanceof C11396e.C11401e) {
            C11396e.C11401e eVar2 = (C11396e.C11401e) eVar;
            collageTextInput.setLabelText(mo37305f(eVar2.f25128a.f25170c));
            collageTextInput.setRequired(eVar2.f25128a.f25171d);
            collageTextInput.setText(eVar2.f25128a.f25174g);
            if (C19383o.m32792b(eVar2.f25128a.f25176i, Boolean.TRUE)) {
                collageTextInput.setImeOptions(6);
            }
            m19272g(collageTextInput, eVar2.f25128a.f25175h);
        } else if (eVar instanceof C11396e.C11407k) {
            C11396e.C11407k kVar = (C11396e.C11407k) eVar;
            collageTextInput.setLabelText(mo37305f(kVar.f25134a.f25250c));
            collageTextInput.setRequired(kVar.f25134a.f25251d);
            collageTextInput.setText(kVar.f25134a.f25255h);
            if (C19383o.m32792b(kVar.f25134a.f25257j, Boolean.TRUE)) {
                collageTextInput.setImeOptions(6);
            }
            m19272g(collageTextInput, kVar.f25134a.f25256i);
        } else if (eVar instanceof C11396e.C11403g) {
            C11396e.C11403g gVar = (C11396e.C11403g) eVar;
            collageTextInput.setLabelText(mo37305f(gVar.f25130a.f25190c));
            collageTextInput.setRequired(gVar.f25130a.f25191d);
            collageTextInput.setText(gVar.f25130a.f25195h);
            if (C19383o.m32792b(gVar.f25130a.f25197j, Boolean.TRUE)) {
                collageTextInput.setImeOptions(6);
            }
            m19272g(collageTextInput, gVar.f25130a.f25196i);
        } else if (eVar instanceof C11396e.C11405i) {
            C11396e.C11405i iVar = (C11396e.C11405i) eVar;
            collageTextInput.setLabelText(mo37305f(iVar.f25132a.f25228c));
            collageTextInput.setRequired(iVar.f25132a.f25229d);
            collageTextInput.setText(iVar.f25132a.f25234i);
            if (C19383o.m32792b(iVar.f25132a.f25236k, Boolean.TRUE)) {
                collageTextInput.setImeOptions(6);
            }
            m19272g(collageTextInput, iVar.f25132a.f25235j);
        } else if (eVar instanceof C11396e.C11404h) {
            C11396e.C11404h hVar = (C11396e.C11404h) eVar;
            collageTextInput.setLabelText(mo37305f(hVar.f25131a.f25210c));
            collageTextInput.setRequired(hVar.f25131a.f25211d);
            collageTextInput.setText(hVar.f25131a.f25213f);
            if (C19383o.m32792b(hVar.f25131a.f25215h, Boolean.TRUE)) {
                collageTextInput.setImeOptions(6);
            }
            m19272g(collageTextInput, hVar.f25131a.f25214g);
        } else if (eVar instanceof C11396e.C11397a) {
            C11396e.C11397a aVar = (C11396e.C11397a) eVar;
            collageTextInput.setLabelText(mo37305f(aVar.f25124a.f25137c));
            collageTextInput.setRequired(aVar.f25124a.f25138d);
            collageTextInput.setText(aVar.f25124a.f25143i);
            if (C19383o.m32792b(aVar.f25124a.f25145k, Boolean.TRUE)) {
                collageTextInput.setImeOptions(6);
            }
            m19272g(collageTextInput, aVar.f25124a.f25144j);
        } else if (eVar instanceof C11396e.C11398b) {
            C11396e.C11398b bVar = (C11396e.C11398b) eVar;
            collageTextInput.setLabelText(mo37305f(bVar.f25125a.f25155c));
            collageTextInput.setFocusable(false);
            collageTextInput.showCursor(false);
            collageTextInput.setText(bVar.f25125a.f25157e);
            collageTextInput.setEndIconDrawable((int) R.drawable.clg_icon_core_navigateright_v1);
            ViewExtensions.m12866j(collageTextInput, new AddressTextInputViewHolder$bind$2(this));
            bVar.f25125a.getClass();
            m19272g(collageTextInput, (String) null);
        } else {
            if (!(eVar instanceof C11396e.C11399c ? true : C19383o.m32792b(eVar, C11396e.C11400d.f25127a))) {
                C19383o.m32792b(eVar, C11396e.C11406j.f25133a);
            }
        }
        TextinputKt.m18959a(collageTextInput, new AddressTextInputViewHolder$bind$3(this, eVar, collageTextInput));
    }

    /* renamed from: f */
    public final String mo37305f(int i) {
        String string = this.itemView.getResources().getString(i);
        C19383o.m32796f(string, "itemView.resources.getString(labelRes)");
        return string;
    }
}
