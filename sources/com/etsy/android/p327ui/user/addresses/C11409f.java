package com.etsy.android.p327ui.user.addresses;

import android.os.Bundle;
import com.etsy.android.lib.logger.C8672b;
import p456ua.C13461f;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.user.addresses.f */
public final class C11409f {

    /* renamed from: a */
    public C11414g f25146a;

    /* renamed from: b */
    public AddressDetailViewModel f25147b;

    /* renamed from: c */
    public C8672b f25148c;

    /* renamed from: d */
    public Integer f25149d;

    public C11409f(C13461f fVar) {
    }

    /* renamed from: a */
    public final void mo37269a(Bundle bundle) {
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("ADDRESS_DETAIL_ACTION")) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i = bundle.getInt("KEY_ADDRESSDETAIL_COUNTRY_ID", -1);
            String string = bundle.getString("KEY_ADDRESSDETAIL_COUNTRY_NAME", "");
            if (i == -1 || !C18263b.m30839d0(string)) {
                C11414g gVar = this.f25146a;
                if (gVar != null) {
                    gVar.showAddressDetailError();
                    return;
                }
                return;
            }
            AddressDetailViewModel addressDetailViewModel = this.f25147b;
            if (addressDetailViewModel != null) {
                addressDetailViewModel.mo37150b(Integer.valueOf(i), string, Boolean.valueOf(bundle.getBoolean("HIDE_DEFAULT_ADDRESS_TOGGLE")));
            }
            AddressDetailViewModel addressDetailViewModel2 = this.f25147b;
            if (addressDetailViewModel2 != null) {
                addressDetailViewModel2.f25056h = 0;
            }
            this.f25149d = Integer.valueOf(i);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            AddressItemUI addressItemUI = (AddressItemUI) bundle.getParcelable("KEY_USER_ADDRESS");
            if (addressItemUI != null) {
                AddressDetailViewModel addressDetailViewModel3 = this.f25147b;
                if (addressDetailViewModel3 != null) {
                    addressDetailViewModel3.f25058j = addressItemUI;
                    C11425l lVar = addressDetailViewModel3.f25055g;
                    lVar.f25200c = addressItemUI.getFirst_line();
                    AddressItemUI addressItemUI2 = addressDetailViewModel3.f25058j;
                    lVar.f25201d = addressItemUI2 != null ? addressItemUI2.getSecond_line() : null;
                    AddressItemUI addressItemUI3 = addressDetailViewModel3.f25058j;
                    lVar.f25207j = addressItemUI3 != null ? Boolean.valueOf(addressItemUI3.is_default_address()) : null;
                    AddressItemUI addressItemUI4 = addressDetailViewModel3.f25058j;
                    lVar.f25199b = addressItemUI4 != null ? addressItemUI4.getName() : null;
                    AddressItemUI addressItemUI5 = addressDetailViewModel3.f25058j;
                    lVar.f25205h = addressItemUI5 != null ? Integer.valueOf(addressItemUI5.getCountryId()) : null;
                    AddressItemUI addressItemUI6 = addressDetailViewModel3.f25058j;
                    lVar.f25204g = addressItemUI6 != null ? addressItemUI6.getPostal_code() : null;
                    AddressItemUI addressItemUI7 = addressDetailViewModel3.f25058j;
                    lVar.f25203f = addressItemUI7 != null ? addressItemUI7.getAdministrative_area() : null;
                    AddressItemUI addressItemUI8 = addressDetailViewModel3.f25058j;
                    lVar.f25202e = addressItemUI8 != null ? addressItemUI8.getLocality() : null;
                    AddressItemUI addressItemUI9 = addressDetailViewModel3.f25058j;
                    lVar.f25206i = addressItemUI9 != null ? addressItemUI9.getPhoneNumber() : null;
                    AddressItemUI addressItemUI10 = addressDetailViewModel3.f25058j;
                    lVar.f25198a = addressItemUI10 != null ? Long.valueOf(addressItemUI10.getUserAddressId()) : null;
                }
                AddressDetailViewModel addressDetailViewModel4 = this.f25147b;
                if (addressDetailViewModel4 != null) {
                    addressDetailViewModel4.mo37150b(Integer.valueOf(addressItemUI.getCountryId()), (String) null, Boolean.FALSE);
                }
                AddressDetailViewModel addressDetailViewModel5 = this.f25147b;
                if (addressDetailViewModel5 != null) {
                    addressDetailViewModel5.f25056h = 1;
                }
                this.f25149d = Integer.valueOf(addressItemUI.getCountryId());
                return;
            }
            C11414g gVar2 = this.f25146a;
            if (gVar2 != null) {
                gVar2.showAddressDetailError();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r5 != r0.intValue()) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (r5 != r0.intValue()) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37270b(com.etsy.android.lib.models.apiv3.addresses.UserAddress r7) {
        /*
            r6 = this;
            com.etsy.android.lib.logger.b r0 = r6.f25148c
            if (r0 == 0) goto L_0x000a
            java.lang.String r1 = "new_or_existing_address_saved"
            r2 = 0
            r0.mo21333d(r1, r2)
        L_0x000a:
            java.lang.Boolean r0 = r7.is_default_shipping()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x006c
            com.etsy.android.ui.user.addresses.AddressDetailViewModel r0 = r6.f25147b
            if (r0 == 0) goto L_0x004d
            int r3 = r0.f25056h
            if (r3 == 0) goto L_0x003d
            if (r3 == r1) goto L_0x0023
            goto L_0x0048
        L_0x0023:
            com.etsy.android.ui.user.addresses.AddressItemUI r3 = r0.f25058j
            if (r3 == 0) goto L_0x002c
            boolean r3 = r3.is_default_address()
            goto L_0x002d
        L_0x002c:
            r3 = r2
        L_0x002d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.etsy.android.ui.user.addresses.l r0 = r0.f25055g
            java.lang.Boolean r0 = r0.f25207j
            boolean r0 = kotlin.jvm.internal.C19383o.m32792b(r3, r0)
            if (r0 != 0) goto L_0x0048
            r0 = r1
            goto L_0x0049
        L_0x003d:
            com.etsy.android.ui.user.addresses.l r0 = r0.f25055g
            java.lang.Boolean r0 = r0.f25207j
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.booleanValue()
            goto L_0x0049
        L_0x0048:
            r0 = r2
        L_0x0049:
            if (r0 != r1) goto L_0x004d
            r0 = r1
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            if (r0 == 0) goto L_0x006c
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r0 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.NEW_DEFAULT_ADDRESS_ID
            java.lang.Long r3 = r7.getUser_address_id()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r0, r3)
            java.util.Map r0 = kotlin.reflect.C19421p.m32931U(r4)
            com.etsy.android.lib.logger.b r3 = r6.f25148c
            if (r3 == 0) goto L_0x006c
            java.lang.String r4 = "set_as_default_toggle_tapped"
            r3.mo21333d(r4, r0)
        L_0x006c:
            com.etsy.android.ui.user.addresses.AddressDetailViewModel r0 = r6.f25147b
            if (r0 == 0) goto L_0x00aa
            java.lang.Integer r3 = r6.f25149d
            int r4 = r0.f25056h
            r5 = -1
            if (r4 == 0) goto L_0x0090
            if (r4 == r1) goto L_0x007a
            goto L_0x00a5
        L_0x007a:
            com.etsy.android.ui.user.addresses.AddressItemUI r3 = r0.f25058j
            if (r3 == 0) goto L_0x0082
            int r5 = r3.getCountryId()
        L_0x0082:
            com.etsy.android.ui.user.addresses.l r0 = r0.f25055g
            java.lang.Integer r0 = r0.f25205h
            if (r0 != 0) goto L_0x0089
            goto L_0x00a3
        L_0x0089:
            int r0 = r0.intValue()
            if (r5 == r0) goto L_0x00a5
            goto L_0x00a3
        L_0x0090:
            if (r3 == 0) goto L_0x0096
            int r5 = r3.intValue()
        L_0x0096:
            com.etsy.android.ui.user.addresses.l r0 = r0.f25055g
            java.lang.Integer r0 = r0.f25205h
            if (r0 != 0) goto L_0x009d
            goto L_0x00a3
        L_0x009d:
            int r0 = r0.intValue()
            if (r5 == r0) goto L_0x00a5
        L_0x00a3:
            r0 = r1
            goto L_0x00a6
        L_0x00a5:
            r0 = r2
        L_0x00a6:
            if (r0 != r1) goto L_0x00aa
            r0 = r1
            goto L_0x00ab
        L_0x00aa:
            r0 = r2
        L_0x00ab:
            if (r0 == 0) goto L_0x00dd
            r0 = 2
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r3 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.NEW_COUNTRY_ID
            java.lang.Integer r7 = r7.getCountry_id()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r7)
            r0[r2] = r4
            com.etsy.android.lib.logger.PredefinedAnalyticsProperty r7 = com.etsy.android.lib.logger.PredefinedAnalyticsProperty.OLD_COUNTRY_ID
            java.lang.Integer r2 = r6.f25149d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r7, r2)
            r0[r1] = r3
            java.util.Map r7 = kotlin.collections.C19294b0.m32562s0(r0)
            com.etsy.android.lib.logger.b r0 = r6.f25148c
            if (r0 == 0) goto L_0x00dd
            java.lang.String r1 = "change_country_tapped"
            r0.mo21333d(r1, r7)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.addresses.C11409f.mo37270b(com.etsy.android.lib.models.apiv3.addresses.UserAddress):void");
    }
}
