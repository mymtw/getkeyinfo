package com.etsy.android.lib.models.apiv3.addresses;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class UserAddressJsonAdapter extends JsonAdapter<UserAddress> {
    public static final int $stable = 8;
    private volatile Constructor<UserAddress> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<UserAddressFormat> nullableUserAddressFormatAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("city", ResponseConstants.COUNTRY_ID, "country_name", ResponseConstants.CREATE_DATE, ResponseConstants.FIRST_LINE, ResponseConstants.IS_DEFAULT_SHIPPING, "name", ResponseConstants.PHONE, "replacement_address_id", ResponseConstants.SECOND_LINE, "state", ResponseConstants.UPDATE_DATE, ResponseConstants.USER_ADDRESS_ID, "user_id", "verification_state", ResponseConstants.ZIP, ResponseConstants.FORMAT);

    public UserAddressJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(String.class, emptySet, "city");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, ResponseConstants.COUNTRY_ID);
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, ResponseConstants.CREATE_DATE);
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, ResponseConstants.IS_DEFAULT_SHIPPING);
        this.nullableUserAddressFormatAdapter = yVar2.mo68558c(UserAddressFormat.class, emptySet, ResponseConstants.FORMAT);
    }

    public String toString() {
        return "GeneratedJsonAdapter(UserAddress)";
    }

    public UserAddress fromJson(JsonReader jsonReader) {
        int i;
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i2 = -1;
        String str = null;
        Integer num = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        String str5 = null;
        Long l2 = null;
        String str6 = null;
        String str7 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Integer num2 = null;
        String str8 = null;
        UserAddressFormat userAddressFormat = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    continue;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -2;
                    continue;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -3;
                    continue;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -5;
                    continue;
                case 3:
                    l = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -9;
                    continue;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -17;
                    continue;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i2 &= -33;
                    continue;
                case 6:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -65;
                    continue;
                case 7:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -129;
                    continue;
                case 8:
                    l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -257;
                    continue;
                case 9:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -513;
                    continue;
                case 10:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i2 &= -1025;
                    continue;
                case 11:
                    l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -2049;
                    continue;
                case 12:
                    l4 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -4097;
                    continue;
                case 13:
                    l5 = this.nullableLongAdapter.fromJson(jsonReader2);
                    i2 &= -8193;
                    continue;
                case 14:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i2 &= -16385;
                    continue;
                case 15:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i = -32769;
                    break;
                case 16:
                    userAddressFormat = this.nullableUserAddressFormatAdapter.fromJson(jsonReader2);
                    i = -65537;
                    break;
            }
            i2 &= i;
        }
        jsonReader.mo68413e();
        if (i2 == -131072) {
            return new UserAddress(str, num, str2, l, str3, bool, str4, str5, l2, str6, str7, l3, l4, l5, num2, str8, userAddressFormat);
        }
        Constructor<UserAddress> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UserAddress.class.getDeclaredConstructor(new Class[]{cls2, Integer.class, cls2, cls, cls2, Boolean.class, cls2, cls2, cls, cls2, cls2, cls, cls, cls, Integer.class, cls2, UserAddressFormat.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "UserAddress::class.java.…his.constructorRef = it }");
        }
        UserAddress newInstance = constructor.newInstance(new Object[]{str, num, str2, l, str3, bool, str4, str5, l2, str6, str7, l3, l4, l5, num2, str8, userAddressFormat, Integer.valueOf(i2), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, UserAddress userAddress) {
        C19383o.m32797g(wVar, "writer");
        if (userAddress != null) {
            wVar.mo68522b();
            wVar.mo68529h("city");
            this.nullableStringAdapter.toJson(wVar, userAddress.getCity());
            wVar.mo68529h(ResponseConstants.COUNTRY_ID);
            this.nullableIntAdapter.toJson(wVar, userAddress.getCountry_id());
            wVar.mo68529h("country_name");
            this.nullableStringAdapter.toJson(wVar, userAddress.getCountry_name());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableLongAdapter.toJson(wVar, userAddress.getCreate_date());
            wVar.mo68529h(ResponseConstants.FIRST_LINE);
            this.nullableStringAdapter.toJson(wVar, userAddress.getFirst_line());
            wVar.mo68529h(ResponseConstants.IS_DEFAULT_SHIPPING);
            this.nullableBooleanAdapter.toJson(wVar, userAddress.is_default_shipping());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, userAddress.getName());
            wVar.mo68529h(ResponseConstants.PHONE);
            this.nullableStringAdapter.toJson(wVar, userAddress.getPhone());
            wVar.mo68529h("replacement_address_id");
            this.nullableLongAdapter.toJson(wVar, userAddress.getReplacement_address_id());
            wVar.mo68529h(ResponseConstants.SECOND_LINE);
            this.nullableStringAdapter.toJson(wVar, userAddress.getSecond_line());
            wVar.mo68529h("state");
            this.nullableStringAdapter.toJson(wVar, userAddress.getState());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableLongAdapter.toJson(wVar, userAddress.getUpdate_date());
            wVar.mo68529h(ResponseConstants.USER_ADDRESS_ID);
            this.nullableLongAdapter.toJson(wVar, userAddress.getUser_address_id());
            wVar.mo68529h("user_id");
            this.nullableLongAdapter.toJson(wVar, userAddress.getUser_id());
            wVar.mo68529h("verification_state");
            this.nullableIntAdapter.toJson(wVar, userAddress.getVerification_state());
            wVar.mo68529h(ResponseConstants.ZIP);
            this.nullableStringAdapter.toJson(wVar, userAddress.getZip());
            wVar.mo68529h(ResponseConstants.FORMAT);
            this.nullableUserAddressFormatAdapter.toJson(wVar, userAddress.getFormat());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
