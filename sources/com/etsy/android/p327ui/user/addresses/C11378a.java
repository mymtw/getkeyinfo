package com.etsy.android.p327ui.user.addresses;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.user.addresses.AddressUIBuilder;
import com.etsy.android.p327ui.user.addresses.C11396e;
import com.etsy.android.p327ui.user.addresses.viewholders.AddressButtonViewHolder;
import com.etsy.android.p327ui.user.addresses.viewholders.AddressTextInputViewHolder;
import com.etsy.android.p327ui.user.addresses.viewholders.AddressToggleSwitchViewHolder;
import com.etsy.android.p327ui.user.addresses.viewholders.C11455b;
import com.etsy.android.p327ui.user.addresses.viewholders.C11457d;
import com.etsy.android.p327ui.user.addresses.viewholders.C11459f;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.etsy.android.stylekit.views.CollageSelectDropdown;
import com.etsy.android.stylekit.views.CollageSwitch;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.stylekit.views.CollageTypeAhead;
import com.etsy.android.uikit.adapter.C11829a;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.List;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0015b;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.addresses.a */
public final class C11378a extends C11829a<C11396e> {

    /* renamed from: b */
    public final C19857l<C11430n, C19394m> f25103b;

    /* renamed from: c */
    public final C19861p<String, C19857l<? super List<PostalCodeSuggestion>, C19394m>, C19394m> f25104c;

    /* renamed from: d */
    public final int f25105d;

    /* renamed from: e */
    public final C11379a f25106e = new C11379a();

    /* renamed from: com.etsy.android.ui.user.addresses.a$a */
    public final class C11379a extends GridLayoutManager.C3075b {
        public C11379a() {
        }

        /* renamed from: d */
        public final int mo11265d(int i) {
            int itemViewType = C11378a.this.getItemViewType(i);
            if (itemViewType != 2) {
                if (itemViewType == 3) {
                    return 1;
                }
            } else if (C11378a.this.f25105d == 1) {
                return 1;
            }
            return 2;
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.a$b */
    public /* synthetic */ class C11380b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25108a;

        static {
            int[] iArr = new int[FieldViewType.values().length];
            iArr[FieldViewType.TEXT_INPUT.ordinal()] = 1;
            iArr[FieldViewType.DROPDOWN.ordinal()] = 2;
            iArr[FieldViewType.PRIMARY_BUTTON.ordinal()] = 3;
            iArr[FieldViewType.SECONDARY_BUTTON.ordinal()] = 4;
            iArr[FieldViewType.CHECKBOX.ordinal()] = 5;
            iArr[FieldViewType.TOGGLE_SWITCH.ordinal()] = 6;
            iArr[FieldViewType.TYPE_AHEAD.ordinal()] = 7;
            f25108a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11378a(FragmentActivity fragmentActivity, C19857l<? super C11430n, C19394m> lVar, C19861p<? super String, ? super C19857l<? super List<PostalCodeSuggestion>, C19394m>, C19394m> pVar, int i) {
        super(fragmentActivity);
        C19383o.m32797g(pVar, "fetchSuggestions");
        this.f25103b = lVar;
        this.f25104c = pVar;
        this.f25105d = i;
    }

    /* renamed from: j */
    public static int m19255j(FieldViewType fieldViewType) {
        switch (C11380b.f25108a[fieldViewType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 8;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getListItemViewType(int i) {
        C11396e eVar = (C11396e) getItem(i);
        if (eVar instanceof C11396e.C11398b) {
            return m19255j(((C11396e.C11398b) eVar).f25125a.f25156d);
        }
        if (eVar instanceof C11396e.C11401e) {
            return m19255j(((C11396e.C11401e) eVar).f25128a.f25173f);
        }
        if (eVar instanceof C11396e.C11407k) {
            return m19255j(((C11396e.C11407k) eVar).f25134a.f25254g);
        }
        if (eVar instanceof C11396e.C11403g) {
            return m19255j(((C11396e.C11403g) eVar).f25130a.f25194g);
        }
        if (eVar instanceof C11396e.C11397a) {
            return m19255j(((C11396e.C11397a) eVar).f25124a.f25142h);
        }
        if (eVar instanceof C11396e.C11405i) {
            return m19255j(((C11396e.C11405i) eVar).f25132a.f25233h);
        }
        if (eVar instanceof C11396e.C11402f) {
            return m19255j(((C11396e.C11402f) eVar).f25129a.f25183f);
        }
        if (eVar instanceof C11396e.C11404h) {
            return m19255j(((C11396e.C11404h) eVar).f25131a.f25212e);
        }
        if (eVar instanceof C11396e.C11399c) {
            return m19255j(((C11396e.C11399c) eVar).f25126a.f25164e);
        }
        if (eVar instanceof C11396e.C11406j) {
            return m19255j(FieldViewType.PRIMARY_BUTTON);
        }
        if (C19383o.m32792b(eVar, C11396e.C11400d.f25127a)) {
            return m19255j(FieldViewType.SECONDARY_BUTTON);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.etsy.android.ui.user.addresses.viewholders.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.etsy.android.ui.user.addresses.viewholders.AddressButtonViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.etsy.android.ui.user.addresses.viewholders.AddressToggleSwitchViewHolder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.etsy.android.ui.user.addresses.viewholders.AddressTextInputViewHolder} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v11, types: [int] */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindListItemViewHolder(androidx.recyclerview.widget.RecyclerView.C3084b0 r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x000c
            int r1 = r11.getItemViewType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x000d
        L_0x000c:
            r1 = r0
        L_0x000d:
            java.lang.String r2 = "getItem(position)"
            if (r1 != 0) goto L_0x0012
            goto L_0x002f
        L_0x0012:
            int r3 = r1.intValue()
            if (r3 != 0) goto L_0x002f
            boolean r1 = r11 instanceof com.etsy.android.p327ui.user.addresses.viewholders.AddressTextInputViewHolder
            if (r1 == 0) goto L_0x001f
            r0 = r11
            com.etsy.android.ui.user.addresses.viewholders.AddressTextInputViewHolder r0 = (com.etsy.android.p327ui.user.addresses.viewholders.AddressTextInputViewHolder) r0
        L_0x001f:
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r11 = r10.getItem(r12)
            kotlin.jvm.internal.C19383o.m32796f(r11, r2)
            com.etsy.android.ui.user.addresses.e r11 = (com.etsy.android.p327ui.user.addresses.C11396e) r11
            r0.mo37304e(r11)
            goto L_0x02ef
        L_0x002f:
            r3 = 5
            if (r1 != 0) goto L_0x0033
            goto L_0x0050
        L_0x0033:
            int r4 = r1.intValue()
            if (r4 != r3) goto L_0x0050
            boolean r1 = r11 instanceof com.etsy.android.p327ui.user.addresses.viewholders.AddressToggleSwitchViewHolder
            if (r1 == 0) goto L_0x0040
            r0 = r11
            com.etsy.android.ui.user.addresses.viewholders.AddressToggleSwitchViewHolder r0 = (com.etsy.android.p327ui.user.addresses.viewholders.AddressToggleSwitchViewHolder) r0
        L_0x0040:
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r11 = r10.getItem(r12)
            kotlin.jvm.internal.C19383o.m32796f(r11, r2)
            com.etsy.android.ui.user.addresses.e r11 = (com.etsy.android.p327ui.user.addresses.C11396e) r11
            r0.mo37309e(r11)
            goto L_0x02ef
        L_0x0050:
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L_0x0057
            goto L_0x01a5
        L_0x0057:
            int r6 = r1.intValue()
            if (r6 != r5) goto L_0x01a5
            boolean r1 = r11 instanceof com.etsy.android.p327ui.user.addresses.viewholders.C11457d
            if (r1 == 0) goto L_0x0064
            com.etsy.android.ui.user.addresses.viewholders.d r11 = (com.etsy.android.p327ui.user.addresses.viewholders.C11457d) r11
            goto L_0x0065
        L_0x0064:
            r11 = r0
        L_0x0065:
            if (r11 == 0) goto L_0x02ef
            java.lang.Object r12 = r10.getItem(r12)
            kotlin.jvm.internal.C19383o.m32796f(r12, r2)
            com.etsy.android.ui.user.addresses.e r12 = (com.etsy.android.p327ui.user.addresses.C11396e) r12
            android.view.View r1 = r11.itemView
            java.lang.String r2 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageSelectDropdown"
            kotlin.jvm.internal.C19383o.m32795e(r1, r2)
            com.etsy.android.stylekit.views.CollageSelectDropdown r1 = (com.etsy.android.stylekit.views.CollageSelectDropdown) r1
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11397a
            if (r2 == 0) goto L_0x0165
            com.etsy.android.stylekit.views.CollageSelectAdapter r2 = new com.etsy.android.stylekit.views.CollageSelectAdapter
            android.view.View r5 = r11.itemView
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "itemView.context"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            r2.<init>(r5, r4, r3, r0)
            r3 = r12
            com.etsy.android.ui.user.addresses.e$a r3 = (com.etsy.android.p327ui.user.addresses.C11396e.C11397a) r3
            com.etsy.android.ui.user.addresses.e0 r5 = r3.f25124a
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f25141g
            java.util.Collection r5 = r5.values()
            r2.addAll(r5)
            r1.setCollageAdapter(r2)
            android.view.View r2 = r11.itemView
            android.content.res.Resources r2 = r2.getResources()
            com.etsy.android.ui.user.addresses.e0 r5 = r3.f25124a
            int r5 = r5.f25137c
            java.lang.String r2 = r2.getString(r5)
            java.lang.String r5 = "itemView.resources.getString(item.data.labelRes)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r5)
            r1.setLabelText(r2)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            android.view.View r6 = r11.itemView
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131953431(0x7f130717, float:1.9543333E38)
            java.lang.String r6 = r6.getString(r7)
            r5.append(r6)
            r6 = 32
            r5.append(r6)
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r7 = "getDefault()"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            java.lang.String r2 = r2.toLowerCase(r6)
            java.lang.String r6 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r2, r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r1.setHint(r2)
            com.etsy.android.ui.user.addresses.e0 r2 = r3.f25124a
            boolean r2 = r2.f25138d
            r1.setRequired(r2)
            com.etsy.android.ui.user.addresses.e0 r2 = r3.f25124a
            java.util.Map<java.lang.String, java.lang.String> r5 = r2.f25141g
            java.lang.String r2 = r2.f25143i
            java.util.Set r6 = r5.keySet()
            java.util.Iterator r6 = r6.iterator()
            r7 = r4
        L_0x0100:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x011d
            java.lang.Object r8 = r6.next()
            int r9 = r7 + 1
            if (r7 < 0) goto L_0x0119
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = kotlin.jvm.internal.C19383o.m32792b(r8, r2)
            if (r8 == 0) goto L_0x0117
            goto L_0x0144
        L_0x0117:
            r7 = r9
            goto L_0x0100
        L_0x0119:
            p568fn.C17782b.m29877o0()
            throw r0
        L_0x011d:
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x0125:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0143
            java.lang.Object r6 = r5.next()
            int r7 = r4 + 1
            if (r4 < 0) goto L_0x013f
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = kotlin.jvm.internal.C19383o.m32792b(r6, r2)
            if (r6 == 0) goto L_0x013d
            r7 = r4
            goto L_0x0144
        L_0x013d:
            r4 = r7
            goto L_0x0125
        L_0x013f:
            p568fn.C17782b.m29877o0()
            throw r0
        L_0x0143:
            r7 = -1
        L_0x0144:
            if (r7 < 0) goto L_0x0149
            r1.setSelection((int) r7)
        L_0x0149:
            com.etsy.android.ui.user.addresses.viewholders.c r2 = new com.etsy.android.ui.user.addresses.viewholders.c
            r2.<init>(r12, r11, r1)
            r1.setOnItemClickListener(r2)
            com.etsy.android.ui.user.addresses.e0 r11 = r3.f25124a
            java.lang.String r11 = r11.f25144j
            boolean r12 = p628nj.C18263b.m30839d0(r11)
            if (r12 == 0) goto L_0x0160
            r1.setErrorText(r11)
            goto L_0x02ef
        L_0x0160:
            r1.setErrorText(r0)
            goto L_0x02ef
        L_0x0165:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11398b
            if (r11 == 0) goto L_0x016b
            r11 = r5
            goto L_0x016d
        L_0x016b:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11402f
        L_0x016d:
            if (r11 == 0) goto L_0x0171
            r11 = r5
            goto L_0x0173
        L_0x0171:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11401e
        L_0x0173:
            if (r11 == 0) goto L_0x0177
            r11 = r5
            goto L_0x0179
        L_0x0177:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11407k
        L_0x0179:
            if (r11 == 0) goto L_0x017d
            r11 = r5
            goto L_0x017f
        L_0x017d:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11403g
        L_0x017f:
            if (r11 == 0) goto L_0x0183
            r11 = r5
            goto L_0x0185
        L_0x0183:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11405i
        L_0x0185:
            if (r11 == 0) goto L_0x0189
            r11 = r5
            goto L_0x018b
        L_0x0189:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11404h
        L_0x018b:
            if (r11 == 0) goto L_0x018f
            r11 = r5
            goto L_0x0191
        L_0x018f:
            boolean r11 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11399c
        L_0x0191:
            if (r11 == 0) goto L_0x0194
            goto L_0x019a
        L_0x0194:
            com.etsy.android.ui.user.addresses.e$j r11 = com.etsy.android.p327ui.user.addresses.C11396e.C11406j.f25133a
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r12, r11)
        L_0x019a:
            if (r5 == 0) goto L_0x019e
            goto L_0x02ef
        L_0x019e:
            com.etsy.android.ui.user.addresses.e$d r11 = com.etsy.android.p327ui.user.addresses.C11396e.C11400d.f25127a
            kotlin.jvm.internal.C19383o.m32792b(r12, r11)
            goto L_0x02ef
        L_0x01a5:
            r6 = 3
            if (r1 != 0) goto L_0x01a9
            goto L_0x01b0
        L_0x01a9:
            int r7 = r1.intValue()
            if (r7 != r3) goto L_0x01b0
            goto L_0x01b9
        L_0x01b0:
            if (r1 != 0) goto L_0x01b3
            goto L_0x01bb
        L_0x01b3:
            int r3 = r1.intValue()
            if (r3 != r6) goto L_0x01bb
        L_0x01b9:
            r3 = r5
            goto L_0x01bc
        L_0x01bb:
            r3 = r4
        L_0x01bc:
            if (r3 == 0) goto L_0x01d5
            boolean r1 = r11 instanceof com.etsy.android.p327ui.user.addresses.viewholders.AddressButtonViewHolder
            if (r1 == 0) goto L_0x01c5
            r0 = r11
            com.etsy.android.ui.user.addresses.viewholders.AddressButtonViewHolder r0 = (com.etsy.android.p327ui.user.addresses.viewholders.AddressButtonViewHolder) r0
        L_0x01c5:
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r11 = r10.getItem(r12)
            kotlin.jvm.internal.C19383o.m32796f(r11, r2)
            com.etsy.android.ui.user.addresses.e r11 = (com.etsy.android.p327ui.user.addresses.C11396e) r11
            r0.mo37301e(r11)
            goto L_0x02ef
        L_0x01d5:
            r3 = 4
            if (r1 != 0) goto L_0x01d9
            goto L_0x0237
        L_0x01d9:
            int r7 = r1.intValue()
            if (r7 != r3) goto L_0x0237
            boolean r1 = r11 instanceof com.etsy.android.p327ui.user.addresses.viewholders.C11455b
            if (r1 == 0) goto L_0x01e6
            r0 = r11
            com.etsy.android.ui.user.addresses.viewholders.b r0 = (com.etsy.android.p327ui.user.addresses.viewholders.C11455b) r0
        L_0x01e6:
            if (r0 == 0) goto L_0x02ef
            java.lang.Object r11 = r10.getItem(r12)
            kotlin.jvm.internal.C19383o.m32796f(r11, r2)
            com.etsy.android.ui.user.addresses.e r11 = (com.etsy.android.p327ui.user.addresses.C11396e) r11
            boolean r12 = r11 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11399c
            if (r12 == 0) goto L_0x02ef
            android.view.View r12 = r0.itemView
            java.lang.String r1 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageCheckbox"
            kotlin.jvm.internal.C19383o.m32795e(r12, r1)
            com.etsy.android.stylekit.views.CollageCheckbox r12 = (com.etsy.android.stylekit.views.CollageCheckbox) r12
            android.view.View r1 = r0.itemView
            android.content.res.Resources r1 = r1.getResources()
            r2 = r11
            com.etsy.android.ui.user.addresses.e$c r2 = (com.etsy.android.p327ui.user.addresses.C11396e.C11399c) r2
            com.etsy.android.ui.user.addresses.h0 r3 = r2.f25126a
            int r3 = r3.f25162c
            java.lang.String r1 = r1.getString(r3)
            r12.setText((java.lang.String) r1)
            com.etsy.android.ui.user.addresses.h0 r1 = r2.f25126a
            java.lang.Boolean r1 = r1.f25165f
            if (r1 == 0) goto L_0x021c
            boolean r4 = r1.booleanValue()
        L_0x021c:
            r12.setChecked(r4)
            com.etsy.android.ui.user.addresses.h0 r1 = r2.f25126a
            java.lang.Boolean r1 = r1.f25163d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
            r1 = r1 ^ r5
            r12.setEnabled(r1)
            com.etsy.android.ui.user.addresses.viewholders.a r1 = new com.etsy.android.ui.user.addresses.viewholders.a
            r1.<init>(r11, r0)
            r12.setOnCheckedChangeListener(r1)
            goto L_0x02ef
        L_0x0237:
            r3 = 8
            if (r1 != 0) goto L_0x023d
            goto L_0x02f0
        L_0x023d:
            int r1 = r1.intValue()
            if (r1 != r3) goto L_0x02f0
            boolean r1 = r11 instanceof com.etsy.android.p327ui.user.addresses.viewholders.C11459f
            if (r1 == 0) goto L_0x024a
            com.etsy.android.ui.user.addresses.viewholders.f r11 = (com.etsy.android.p327ui.user.addresses.viewholders.C11459f) r11
            goto L_0x024b
        L_0x024a:
            r11 = r0
        L_0x024b:
            if (r11 == 0) goto L_0x02ef
            java.lang.Object r12 = r10.getItem(r12)
            kotlin.jvm.internal.C19383o.m32796f(r12, r2)
            com.etsy.android.ui.user.addresses.e r12 = (com.etsy.android.p327ui.user.addresses.C11396e) r12
            kq.p<java.lang.String, kq.l<? super java.util.List<com.etsy.android.ui.user.addresses.PostalCodeSuggestion>, kotlin.m>, kotlin.m> r1 = r10.f25104c
            java.lang.String r2 = "fetchSuggestions"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11398b
            if (r2 == 0) goto L_0x0263
            r2 = r5
            goto L_0x0265
        L_0x0263:
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11402f
        L_0x0265:
            if (r2 == 0) goto L_0x0269
            r2 = r5
            goto L_0x026b
        L_0x0269:
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11401e
        L_0x026b:
            if (r2 == 0) goto L_0x026f
            r2 = r5
            goto L_0x0271
        L_0x026f:
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11407k
        L_0x0271:
            if (r2 == 0) goto L_0x0275
            r2 = r5
            goto L_0x0277
        L_0x0275:
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11403g
        L_0x0277:
            if (r2 == 0) goto L_0x027b
            r2 = r5
            goto L_0x027d
        L_0x027b:
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11397a
        L_0x027d:
            if (r2 == 0) goto L_0x0281
            r2 = r5
            goto L_0x0283
        L_0x0281:
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11404h
        L_0x0283:
            if (r2 == 0) goto L_0x0287
            r2 = r5
            goto L_0x0289
        L_0x0287:
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11399c
        L_0x0289:
            if (r2 == 0) goto L_0x028d
            r2 = r5
            goto L_0x0293
        L_0x028d:
            com.etsy.android.ui.user.addresses.e$d r2 = com.etsy.android.p327ui.user.addresses.C11396e.C11400d.f25127a
            boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r12, r2)
        L_0x0293:
            if (r2 == 0) goto L_0x0296
            goto L_0x029c
        L_0x0296:
            com.etsy.android.ui.user.addresses.e$j r2 = com.etsy.android.p327ui.user.addresses.C11396e.C11406j.f25133a
            boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r12, r2)
        L_0x029c:
            if (r5 != 0) goto L_0x02ef
            boolean r2 = r12 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11405i
            if (r2 == 0) goto L_0x02ef
            android.view.View r2 = r11.itemView
            java.lang.String r3 = "null cannot be cast to non-null type com.etsy.android.stylekit.views.CollageTypeAhead"
            kotlin.jvm.internal.C19383o.m32795e(r2, r3)
            com.etsy.android.stylekit.views.CollageTypeAhead r2 = (com.etsy.android.stylekit.views.CollageTypeAhead) r2
            r2.setTextChangeListener(r0)
            r3 = r12
            com.etsy.android.ui.user.addresses.e$i r3 = (com.etsy.android.p327ui.user.addresses.C11396e.C11405i) r3
            com.etsy.android.ui.user.addresses.m0 r4 = r3.f25132a
            java.lang.String r4 = r4.f25234i
            r2.setText(r4)
            r2.setThreshold(r6)
            com.etsy.android.ui.user.addresses.m0 r4 = r3.f25132a
            boolean r4 = r4.f25229d
            r2.setRequired(r4)
            android.content.Context r4 = r2.getContext()
            com.etsy.android.ui.user.addresses.m0 r5 = r3.f25132a
            int r5 = r5.f25228c
            java.lang.String r4 = r4.getString(r5)
            r2.setLabelText(r4)
            com.etsy.android.ui.user.addresses.m0 r3 = r3.f25132a
            java.lang.String r3 = r3.f25235j
            boolean r4 = p628nj.C18263b.m30839d0(r3)
            if (r4 == 0) goto L_0x02e4
            r2.setErrorText(r3)
            r4 = 500(0x1f4, double:2.47E-321)
            com.etsy.android.stylekit.accessibility.views.extensions.ViewsExtensionsKt.m17422a(r2, r3, r4)
            goto L_0x02e7
        L_0x02e4:
            r2.setErrorText(r0)
        L_0x02e7:
            com.etsy.android.ui.user.addresses.viewholders.AddressTypeAheadViewHolder$bind$1 r0 = new com.etsy.android.ui.user.addresses.viewholders.AddressTypeAheadViewHolder$bind$1
            r0.<init>(r12, r2, r11, r1)
            r2.setTextChangeListener(r0)
        L_0x02ef:
            return
        L_0x02f0:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown itemViewType "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            if (r11 == 0) goto L_0x0302
            int r11 = r11.getItemViewType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
        L_0x0302:
            r1.append(r0)
            java.lang.String r11 = r1.toString()
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.addresses.C11378a.onBindListItemViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public final RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        int i2 = i;
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        if (i2 == 0) {
            Context context = viewGroup.getContext();
            C19383o.m32796f(context, "parent.context");
            CollageTextInput collageTextInput = new CollageTextInput(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            collageTextInput.setId(View.generateViewId());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams.setMargins((int) context.getResources().getDimension(R.dimen.clg_space_16), (int) context.getResources().getDimension(R.dimen.clg_space_8), (int) context.getResources().getDimension(R.dimen.clg_space_16), (int) context.getResources().getDimension(R.dimen.clg_space_8));
            collageTextInput.setLayoutParams(layoutParams);
            collageTextInput.setImeOptions(5);
            collageTextInput.setFocusable(true);
            collageTextInput.setInputType(PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
            return new AddressTextInputViewHolder(collageTextInput, this.f25103b);
        } else if (i2 == 1) {
            Context context2 = viewGroup.getContext();
            C19383o.m32796f(context2, "parent.context");
            CollageSelectDropdown collageSelectDropdown = new CollageSelectDropdown(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            collageSelectDropdown.setId(View.generateViewId());
            ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins((int) context2.getResources().getDimension(R.dimen.clg_space_16), (int) context2.getResources().getDimension(R.dimen.clg_space_8), (int) context2.getResources().getDimension(R.dimen.clg_space_16), (int) context2.getResources().getDimension(R.dimen.clg_space_8));
            collageSelectDropdown.setLayoutParams(layoutParams2);
            return new C11457d(collageSelectDropdown, this.f25103b);
        } else if (i2 == 2) {
            AddressUIBuilder.ButtonPlacement buttonPlacement = this.f25105d == 1 ? AddressUIBuilder.ButtonPlacement.RIGHT : AddressUIBuilder.ButtonPlacement.FULL_WIDTH;
            Context context3 = viewGroup.getContext();
            C19383o.m32796f(context3, "parent.context");
            Button a = AddressUIBuilder.m19254a(context3, R.style.clg_button_primary, buttonPlacement);
            List items = getItems();
            C19383o.m32796f(items, ResponseConstants.ITEMS);
            return new AddressButtonViewHolder(a, items, this.f25103b);
        } else if (i2 == 3) {
            Context context4 = viewGroup.getContext();
            C19383o.m32796f(context4, "parent.context");
            Button a2 = AddressUIBuilder.m19254a(context4, R.style.clg_button_secondary, AddressUIBuilder.ButtonPlacement.LEFT);
            List items2 = getItems();
            C19383o.m32796f(items2, ResponseConstants.ITEMS);
            return new AddressButtonViewHolder(a2, items2, this.f25103b);
        } else if (i2 == 4) {
            Context context5 = viewGroup.getContext();
            C19383o.m32796f(context5, "parent.context");
            ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-1, -2);
            CollageCheckbox collageCheckbox = new CollageCheckbox(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            collageCheckbox.setId(View.generateViewId());
            collageCheckbox.setLayoutParams(layoutParams3);
            return new C11455b(collageCheckbox, this.f25103b);
        } else if (i2 == 5) {
            Context context6 = viewGroup.getContext();
            C19383o.m32796f(context6, "parent.context");
            CollageSwitch collageSwitch = new CollageSwitch(context6, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            collageSwitch.setId(View.generateViewId());
            return new AddressToggleSwitchViewHolder(collageSwitch, this.f25103b);
        } else if (i2 == 8) {
            Context context7 = viewGroup.getContext();
            C19383o.m32796f(context7, "parent.context");
            CollageTypeAhead collageTypeAhead = new CollageTypeAhead(context7, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            collageTypeAhead.setId(View.generateViewId());
            ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins((int) context7.getResources().getDimension(R.dimen.clg_space_16), (int) context7.getResources().getDimension(R.dimen.clg_space_8), (int) context7.getResources().getDimension(R.dimen.clg_space_16), (int) context7.getResources().getDimension(R.dimen.clg_space_8));
            collageTypeAhead.setLayoutParams(layoutParams4);
            List items3 = getItems();
            C19383o.m32796f(items3, ResponseConstants.ITEMS);
            return new C11459f(collageTypeAhead, items3, this.f25103b);
        } else {
            throw new IllegalArgumentException(C0015b.m88g("Unknown viewType ", i2));
        }
    }
}
