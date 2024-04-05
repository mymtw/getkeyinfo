package com.etsy.android.p327ui.user.addresses;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.addresses.m */
public final class C11427m {

    /* renamed from: a */
    public final AddressDetailsLayoutResponse f25216a;

    /* renamed from: b */
    public final AddressItemUI f25217b;

    /* renamed from: c */
    public final Map<String, SecondLineType> f25218c = C19294b0.m32562s0(new Pair("address_line_2", SecondLineType.ADDRESS_LINE_2), new Pair("flat_other", SecondLineType.FLAT_OTHER), new Pair("apt_suite_unit", SecondLineType.APT_SUITE_UNIT));

    /* renamed from: d */
    public final Map<String, LocalityType> f25219d = C19294b0.m32562s0(new Pair("city_town", LocalityType.CITY_TOWN), new Pair("city", LocalityType.CITY), new Pair("city_suburb", LocalityType.CITY_SUBURB), new Pair("district", LocalityType.DISTRICT));

    /* renamed from: e */
    public final Map<String, PostalCodeType> f25220e;

    /* renamed from: f */
    public final Map<String, AdministrativeAreaType> f25221f;

    /* renamed from: com.etsy.android.ui.user.addresses.m$a */
    public /* synthetic */ class C11428a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25222a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f25223b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f25224c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f25225d;

        static {
            int[] iArr = new int[SecondLineType.values().length];
            iArr[SecondLineType.ADDRESS_LINE_2.ordinal()] = 1;
            iArr[SecondLineType.FLAT_OTHER.ordinal()] = 2;
            iArr[SecondLineType.APT_SUITE_UNIT.ordinal()] = 3;
            f25222a = iArr;
            int[] iArr2 = new int[LocalityType.values().length];
            iArr2[LocalityType.CITY.ordinal()] = 1;
            iArr2[LocalityType.CITY_SUBURB.ordinal()] = 2;
            iArr2[LocalityType.CITY_TOWN.ordinal()] = 3;
            iArr2[LocalityType.DISTRICT.ordinal()] = 4;
            f25223b = iArr2;
            int[] iArr3 = new int[AdministrativeAreaType.values().length];
            iArr3[AdministrativeAreaType.STATE_PROVINCE_REGION.ordinal()] = 1;
            iArr3[AdministrativeAreaType.PROVINCE.ordinal()] = 2;
            iArr3[AdministrativeAreaType.STATE.ordinal()] = 3;
            iArr3[AdministrativeAreaType.ISLAND.ordinal()] = 4;
            iArr3[AdministrativeAreaType.PARISH.ordinal()] = 5;
            iArr3[AdministrativeAreaType.DEPARTMENT.ordinal()] = 6;
            iArr3[AdministrativeAreaType.COUNTY.ordinal()] = 7;
            iArr3[AdministrativeAreaType.PREFECTURE.ordinal()] = 8;
            iArr3[AdministrativeAreaType.OBLAST.ordinal()] = 9;
            iArr3[AdministrativeAreaType.DO_SI.ordinal()] = 10;
            iArr3[AdministrativeAreaType.EMIRATE.ordinal()] = 11;
            iArr3[AdministrativeAreaType.AREA.ordinal()] = 12;
            iArr3[AdministrativeAreaType.DISTRICT.ordinal()] = 13;
            f25224c = iArr3;
            int[] iArr4 = new int[PostalCodeType.values().length];
            iArr4[PostalCodeType.PIN.ordinal()] = 1;
            iArr4[PostalCodeType.ZIP.ordinal()] = 2;
            iArr4[PostalCodeType.POSTAL.ordinal()] = 3;
            f25225d = iArr4;
        }
    }

    public C11427m(AddressDetailsLayoutResponse addressDetailsLayoutResponse, AddressItemUI addressItemUI) {
        C19383o.m32797g(addressDetailsLayoutResponse, ResponseConstants.RESPONSE);
        this.f25216a = addressDetailsLayoutResponse;
        this.f25217b = addressItemUI;
        PostalCodeType postalCodeType = PostalCodeType.POSTAL;
        this.f25220e = C19294b0.m32562s0(new Pair("postal", postalCodeType), new Pair("Postal", postalCodeType), new Pair("pin", PostalCodeType.PIN), new Pair(ResponseConstants.ZIP, PostalCodeType.ZIP));
        this.f25221f = C19294b0.m32562s0(new Pair("state_province_region", AdministrativeAreaType.STATE_PROVINCE_REGION), new Pair("province", AdministrativeAreaType.PROVINCE), new Pair("state", AdministrativeAreaType.STATE), new Pair("island", AdministrativeAreaType.ISLAND), new Pair("parish", AdministrativeAreaType.PARISH), new Pair("department", AdministrativeAreaType.DEPARTMENT), new Pair("county", AdministrativeAreaType.COUNTY), new Pair("prefecture", AdministrativeAreaType.PREFECTURE), new Pair("oblast", AdministrativeAreaType.OBLAST), new Pair("do_si", AdministrativeAreaType.DO_SI), new Pair("emirate", AdministrativeAreaType.EMIRATE), new Pair("area", AdministrativeAreaType.AREA), new Pair("district", AdministrativeAreaType.DISTRICT));
    }
}
