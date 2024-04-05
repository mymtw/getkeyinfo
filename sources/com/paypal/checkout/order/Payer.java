package com.paypal.checkout.order;

import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p650pn.C18417a;

public final class Payer {
    @C18417a("address")
    private final Address address;
    @C18417a("birth_date")
    private final String birthDate;
    @C18417a("email_address")
    private final String emailAddress;
    @C18417a("name")
    private final Name name;
    @C18417a("payer_id")
    private final String payerId;
    @C18417a("phone")
    private final Phone phone;
    @C18417a("tax_info")
    private final TaxInfo taxInfo;

    public static final class Address {
        @C18417a("address_line_1")
        private final String addressLine1;
        @C18417a("address_line_2")
        private final String addressLine2;
        @C18417a("admin_area_1")
        private final String adminArea1;
        @C18417a("admin_area_2")
        private final String adminArea2;
        @C18417a("country_code")
        private final String countryCode;
        @C18417a("postal_code")
        private final String postalCode;

        public Address(String str, String str2, String str3, String str4, String str5, String str6) {
            C19383o.m32797g(str6, "countryCode");
            this.addressLine1 = str;
            this.addressLine2 = str2;
            this.adminArea1 = str3;
            this.adminArea2 = str4;
            this.postalCode = str5;
            this.countryCode = str6;
        }

        public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = address.addressLine1;
            }
            if ((i & 2) != 0) {
                str2 = address.addressLine2;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = address.adminArea1;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = address.adminArea2;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = address.postalCode;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = address.countryCode;
            }
            return address.copy(str, str7, str8, str9, str10, str6);
        }

        public final String component1() {
            return this.addressLine1;
        }

        public final String component2() {
            return this.addressLine2;
        }

        public final String component3() {
            return this.adminArea1;
        }

        public final String component4() {
            return this.adminArea2;
        }

        public final String component5() {
            return this.postalCode;
        }

        public final String component6() {
            return this.countryCode;
        }

        public final Address copy(String str, String str2, String str3, String str4, String str5, String str6) {
            C19383o.m32797g(str6, "countryCode");
            return new Address(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            return C19383o.m32792b(this.addressLine1, address.addressLine1) && C19383o.m32792b(this.addressLine2, address.addressLine2) && C19383o.m32792b(this.adminArea1, address.adminArea1) && C19383o.m32792b(this.adminArea2, address.adminArea2) && C19383o.m32792b(this.postalCode, address.postalCode) && C19383o.m32792b(this.countryCode, address.countryCode);
        }

        public final String getAddressLine1() {
            return this.addressLine1;
        }

        public final String getAddressLine2() {
            return this.addressLine2;
        }

        public final String getAdminArea1() {
            return this.adminArea1;
        }

        public final String getAdminArea2() {
            return this.adminArea2;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public int hashCode() {
            String str = this.addressLine1;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.addressLine2;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adminArea1;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.adminArea2;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postalCode;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return this.countryCode.hashCode() + ((hashCode4 + i) * 31);
        }

        public String toString() {
            String str = this.addressLine1;
            String str2 = this.addressLine2;
            String str3 = this.adminArea1;
            String str4 = this.adminArea2;
            String str5 = this.postalCode;
            String str6 = this.countryCode;
            StringBuilder f = C0388a.m1050f("Address(addressLine1=", str, ", addressLine2=", str2, ", adminArea1=");
            C0391c.m1061h(f, str3, ", adminArea2=", str4, ", postalCode=");
            return C0073e.m210j(f, str5, ", countryCode=", str6, ")");
        }
    }

    public static final class Name {
        @C18417a("given_name")
        private final String givenName;
        @C18417a("surname")
        private final String surname;

        public Name(String str, String str2) {
            this.givenName = str;
            this.surname = str2;
        }

        public static /* synthetic */ Name copy$default(Name name, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = name.givenName;
            }
            if ((i & 2) != 0) {
                str2 = name.surname;
            }
            return name.copy(str, str2);
        }

        public final String component1() {
            return this.givenName;
        }

        public final String component2() {
            return this.surname;
        }

        public final Name copy(String str, String str2) {
            return new Name(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Name)) {
                return false;
            }
            Name name = (Name) obj;
            return C19383o.m32792b(this.givenName, name.givenName) && C19383o.m32792b(this.surname, name.surname);
        }

        public final String getGivenName() {
            return this.givenName;
        }

        public final String getSurname() {
            return this.surname;
        }

        public int hashCode() {
            String str = this.givenName;
            int i = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.surname;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return C0048b.m164c("Name(givenName=", this.givenName, ", surname=", this.surname, ")");
        }
    }

    public static final class Phone {
        @C18417a("phone_number")
        private final Number phoneNumber;
        @C18417a("phone_type")
        private final String phoneType;

        public static final class Number {
            @C18417a("national_number")
            private final String nationalNumber;

            public Number(String str) {
                C19383o.m32797g(str, "nationalNumber");
                this.nationalNumber = str;
            }

            public static /* synthetic */ Number copy$default(Number number, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = number.nationalNumber;
                }
                return number.copy(str);
            }

            public final String component1() {
                return this.nationalNumber;
            }

            public final Number copy(String str) {
                C19383o.m32797g(str, "nationalNumber");
                return new Number(str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Number) && C19383o.m32792b(this.nationalNumber, ((Number) obj).nationalNumber);
            }

            public final String getNationalNumber() {
                return this.nationalNumber;
            }

            public int hashCode() {
                return this.nationalNumber.hashCode();
            }

            public String toString() {
                return C0048b.m163a("Number(nationalNumber=", this.nationalNumber, ")");
            }
        }

        public Phone(String str, Number number) {
            C19383o.m32797g(str, "phoneType");
            C19383o.m32797g(number, "phoneNumber");
            this.phoneType = str;
            this.phoneNumber = number;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, Number number, int i, Object obj) {
            if ((i & 1) != 0) {
                str = phone.phoneType;
            }
            if ((i & 2) != 0) {
                number = phone.phoneNumber;
            }
            return phone.copy(str, number);
        }

        public final String component1() {
            return this.phoneType;
        }

        public final Number component2() {
            return this.phoneNumber;
        }

        public final Phone copy(String str, Number number) {
            C19383o.m32797g(str, "phoneType");
            C19383o.m32797g(number, "phoneNumber");
            return new Phone(str, number);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj;
            return C19383o.m32792b(this.phoneType, phone.phoneType) && C19383o.m32792b(this.phoneNumber, phone.phoneNumber);
        }

        public final Number getPhoneNumber() {
            return this.phoneNumber;
        }

        public final String getPhoneType() {
            return this.phoneType;
        }

        public int hashCode() {
            return this.phoneNumber.hashCode() + (this.phoneType.hashCode() * 31);
        }

        public String toString() {
            String str = this.phoneType;
            Number number = this.phoneNumber;
            return "Phone(phoneType=" + str + ", phoneNumber=" + number + ")";
        }
    }

    public static final class TaxInfo {
        @C18417a("tax_id")
        private final String taxId;
        @C18417a("tax_id_type")
        private final String taxIdType;

        public TaxInfo(String str, String str2) {
            C19383o.m32797g(str, "taxId");
            C19383o.m32797g(str2, "taxIdType");
            this.taxId = str;
            this.taxIdType = str2;
        }

        public static /* synthetic */ TaxInfo copy$default(TaxInfo taxInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taxInfo.taxId;
            }
            if ((i & 2) != 0) {
                str2 = taxInfo.taxIdType;
            }
            return taxInfo.copy(str, str2);
        }

        public final String component1() {
            return this.taxId;
        }

        public final String component2() {
            return this.taxIdType;
        }

        public final TaxInfo copy(String str, String str2) {
            C19383o.m32797g(str, "taxId");
            C19383o.m32797g(str2, "taxIdType");
            return new TaxInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaxInfo)) {
                return false;
            }
            TaxInfo taxInfo = (TaxInfo) obj;
            return C19383o.m32792b(this.taxId, taxInfo.taxId) && C19383o.m32792b(this.taxIdType, taxInfo.taxIdType);
        }

        public final String getTaxId() {
            return this.taxId;
        }

        public final String getTaxIdType() {
            return this.taxIdType;
        }

        public int hashCode() {
            return this.taxIdType.hashCode() + (this.taxId.hashCode() * 31);
        }

        public String toString() {
            return C0048b.m164c("TaxInfo(taxId=", this.taxId, ", taxIdType=", this.taxIdType, ")");
        }
    }

    public Payer(String str, String str2, Name name2, Address address2, Phone phone2, String str3, TaxInfo taxInfo2) {
        C19383o.m32797g(str, "payerId");
        C19383o.m32797g(str2, "emailAddress");
        C19383o.m32797g(name2, "name");
        this.payerId = str;
        this.emailAddress = str2;
        this.name = name2;
        this.address = address2;
        this.phone = phone2;
        this.birthDate = str3;
        this.taxInfo = taxInfo2;
    }

    public static /* synthetic */ Payer copy$default(Payer payer, String str, String str2, Name name2, Address address2, Phone phone2, String str3, TaxInfo taxInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payer.payerId;
        }
        if ((i & 2) != 0) {
            str2 = payer.emailAddress;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            name2 = payer.name;
        }
        Name name3 = name2;
        if ((i & 8) != 0) {
            address2 = payer.address;
        }
        Address address3 = address2;
        if ((i & 16) != 0) {
            phone2 = payer.phone;
        }
        Phone phone3 = phone2;
        if ((i & 32) != 0) {
            str3 = payer.birthDate;
        }
        String str5 = str3;
        if ((i & 64) != 0) {
            taxInfo2 = payer.taxInfo;
        }
        return payer.copy(str, str4, name3, address3, phone3, str5, taxInfo2);
    }

    public final String component1() {
        return this.payerId;
    }

    public final String component2() {
        return this.emailAddress;
    }

    public final Name component3() {
        return this.name;
    }

    public final Address component4() {
        return this.address;
    }

    public final Phone component5() {
        return this.phone;
    }

    public final String component6() {
        return this.birthDate;
    }

    public final TaxInfo component7() {
        return this.taxInfo;
    }

    public final Payer copy(String str, String str2, Name name2, Address address2, Phone phone2, String str3, TaxInfo taxInfo2) {
        C19383o.m32797g(str, "payerId");
        C19383o.m32797g(str2, "emailAddress");
        C19383o.m32797g(name2, "name");
        return new Payer(str, str2, name2, address2, phone2, str3, taxInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payer)) {
            return false;
        }
        Payer payer = (Payer) obj;
        return C19383o.m32792b(this.payerId, payer.payerId) && C19383o.m32792b(this.emailAddress, payer.emailAddress) && C19383o.m32792b(this.name, payer.name) && C19383o.m32792b(this.address, payer.address) && C19383o.m32792b(this.phone, payer.phone) && C19383o.m32792b(this.birthDate, payer.birthDate) && C19383o.m32792b(this.taxInfo, payer.taxInfo);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final Name getName() {
        return this.name;
    }

    public final String getPayerId() {
        return this.payerId;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final TaxInfo getTaxInfo() {
        return this.taxInfo;
    }

    public int hashCode() {
        int hashCode = (this.name.hashCode() + C0023f.m105e(this.emailAddress, this.payerId.hashCode() * 31, 31)) * 31;
        Address address2 = this.address;
        int i = 0;
        int hashCode2 = (hashCode + (address2 == null ? 0 : address2.hashCode())) * 31;
        Phone phone2 = this.phone;
        int hashCode3 = (hashCode2 + (phone2 == null ? 0 : phone2.hashCode())) * 31;
        String str = this.birthDate;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        TaxInfo taxInfo2 = this.taxInfo;
        if (taxInfo2 != null) {
            i = taxInfo2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        String str = this.payerId;
        String str2 = this.emailAddress;
        Name name2 = this.name;
        Address address2 = this.address;
        Phone phone2 = this.phone;
        String str3 = this.birthDate;
        TaxInfo taxInfo2 = this.taxInfo;
        StringBuilder f = C0388a.m1050f("Payer(payerId=", str, ", emailAddress=", str2, ", name=");
        f.append(name2);
        f.append(", address=");
        f.append(address2);
        f.append(", phone=");
        f.append(phone2);
        f.append(", birthDate=");
        f.append(str3);
        f.append(", taxInfo=");
        f.append(taxInfo2);
        f.append(")");
        return f.toString();
    }
}
