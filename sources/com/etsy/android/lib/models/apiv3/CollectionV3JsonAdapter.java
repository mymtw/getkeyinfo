package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.listing.User;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class CollectionV3JsonAdapter extends JsonAdapter<CollectionV3> {
    public static final int $stable = 8;
    private volatile Constructor<CollectionV3> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<Listing>> nullableListOfListingAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("id", "slug", "name", ResponseConstants.PRIVACY_LEVEL, "type", ResponseConstants.LISTINGS_COUNT, "url", "key", "creator", "representative_listings", "creator_type_id", ResponseConstants.CREATE_DATE, ResponseConstants.UPDATE_DATE);
    private final JsonAdapter<Collection.PrivacyLevel> privacyLevelAdapter;
    private final JsonAdapter<User> userAdapter;

    public CollectionV3JsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar.mo68558c(cls, emptySet, "collectionId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "slug");
        this.privacyLevelAdapter = yVar.mo68558c(Collection.PrivacyLevel.class, emptySet, "privacyLevel");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "listingsCount");
        this.userAdapter = yVar.mo68558c(User.class, emptySet, "creator");
        this.nullableListOfListingAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Listing.class), emptySet, "representativeListings");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "creatorTypeId");
    }

    public String toString() {
        return "GeneratedJsonAdapter(CollectionV3)";
    }

    public CollectionV3 fromJson(JsonReader jsonReader) {
        String str;
        JsonReader jsonReader2 = jsonReader;
        Class<Long> cls = Long.class;
        Class<String> cls2 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Long l = null;
        Integer num = null;
        String str2 = null;
        String str3 = null;
        Collection.PrivacyLevel privacyLevel = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        User user = null;
        List list = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        while (true) {
            Class<Long> cls3 = cls;
            Class<String> cls4 = cls2;
            if (jsonReader.mo68414f()) {
                switch (jsonReader2.mo68406Q(this.options)) {
                    case -1:
                        jsonReader.mo68408S();
                        jsonReader.mo68411c0();
                        break;
                    case 0:
                        l = this.longAdapter.fromJson(jsonReader2);
                        if (l != null) {
                            break;
                        } else {
                            throw C18215a.m30734m("collectionId", "id", jsonReader2);
                        }
                    case 1:
                        str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -3;
                        break;
                    case 2:
                        str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -5;
                        break;
                    case 3:
                        privacyLevel = this.privacyLevelAdapter.fromJson(jsonReader2);
                        if (privacyLevel != null) {
                            i &= -9;
                            break;
                        } else {
                            throw C18215a.m30734m("privacyLevel", ResponseConstants.PRIVACY_LEVEL, jsonReader2);
                        }
                    case 4:
                        str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                        i &= -17;
                        break;
                    case 5:
                        num = this.intAdapter.fromJson(jsonReader2);
                        if (num != null) {
                            break;
                        } else {
                            throw C18215a.m30734m("listingsCount", ResponseConstants.LISTINGS_COUNT, jsonReader2);
                        }
                    case 6:
                        str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        user = this.userAdapter.fromJson(jsonReader2);
                        if (user != null) {
                            break;
                        } else {
                            throw C18215a.m30734m("creator", "creator", jsonReader2);
                        }
                    case 9:
                        list = this.nullableListOfListingAdapter.fromJson(jsonReader2);
                        i &= -513;
                        break;
                    case 10:
                        l2 = this.nullableLongAdapter.fromJson(jsonReader2);
                        i &= -1025;
                        break;
                    case 11:
                        l3 = this.nullableLongAdapter.fromJson(jsonReader2);
                        i &= -2049;
                        break;
                    case 12:
                        l4 = this.nullableLongAdapter.fromJson(jsonReader2);
                        i &= -4097;
                        break;
                }
                cls = cls3;
                cls2 = cls4;
            } else {
                jsonReader.mo68413e();
                if (i != -7711) {
                    Constructor<CollectionV3> constructor = this.constructorRef;
                    String str7 = "collectionId";
                    if (constructor == null) {
                        str = "id";
                        Class cls5 = Integer.TYPE;
                        constructor = CollectionV3.class.getDeclaredConstructor(new Class[]{Long.TYPE, cls4, cls4, Collection.PrivacyLevel.class, cls4, cls5, cls4, cls4, User.class, List.class, cls3, cls3, cls3, cls5, C18215a.f39928c});
                        this.constructorRef = constructor;
                        C19383o.m32796f(constructor, "CollectionV3::class.java…his.constructorRef = it }");
                    } else {
                        str = "id";
                    }
                    Object[] objArr = new Object[15];
                    if (l != null) {
                        objArr[0] = Long.valueOf(l.longValue());
                        objArr[1] = str2;
                        objArr[2] = str3;
                        objArr[3] = privacyLevel;
                        objArr[4] = str4;
                        if (num != null) {
                            objArr[5] = Integer.valueOf(num.intValue());
                            objArr[6] = str5;
                            objArr[7] = str6;
                            if (user != null) {
                                objArr[8] = user;
                                objArr[9] = list;
                                objArr[10] = l2;
                                objArr[11] = l3;
                                objArr[12] = l4;
                                objArr[13] = Integer.valueOf(i);
                                objArr[14] = null;
                                CollectionV3 newInstance = constructor.newInstance(objArr);
                                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                                return newInstance;
                            }
                            throw C18215a.m30728g("creator", "creator", jsonReader2);
                        }
                        throw C18215a.m30728g("listingsCount", ResponseConstants.LISTINGS_COUNT, jsonReader2);
                    }
                    throw C18215a.m30728g(str7, str, jsonReader2);
                } else if (l != null) {
                    long longValue = l.longValue();
                    C19383o.m32795e(privacyLevel, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.Collection.PrivacyLevel");
                    if (num != null) {
                        int intValue = num.intValue();
                        if (user != null) {
                            return new CollectionV3(longValue, str2, str3, privacyLevel, str4, intValue, str5, str6, user, list, l2, l3, l4);
                        }
                        throw C18215a.m30728g("creator", "creator", jsonReader2);
                    }
                    throw C18215a.m30728g("listingsCount", ResponseConstants.LISTINGS_COUNT, jsonReader2);
                } else {
                    throw C18215a.m30728g("collectionId", "id", jsonReader2);
                }
            }
        }
    }

    public void toJson(C17412w wVar, CollectionV3 collectionV3) {
        C19383o.m32797g(wVar, "writer");
        if (collectionV3 != null) {
            wVar.mo68522b();
            wVar.mo68529h("id");
            this.longAdapter.toJson(wVar, Long.valueOf(collectionV3.getCollectionId()));
            wVar.mo68529h("slug");
            this.nullableStringAdapter.toJson(wVar, collectionV3.getSlug());
            wVar.mo68529h("name");
            this.nullableStringAdapter.toJson(wVar, collectionV3.getName());
            wVar.mo68529h(ResponseConstants.PRIVACY_LEVEL);
            this.privacyLevelAdapter.toJson(wVar, collectionV3.getPrivacyLevel());
            wVar.mo68529h("type");
            this.nullableStringAdapter.toJson(wVar, collectionV3.getType());
            wVar.mo68529h(ResponseConstants.LISTINGS_COUNT);
            this.intAdapter.toJson(wVar, Integer.valueOf(collectionV3.getListingsCount()));
            wVar.mo68529h("url");
            this.nullableStringAdapter.toJson(wVar, collectionV3.getUrl());
            wVar.mo68529h("key");
            this.nullableStringAdapter.toJson(wVar, collectionV3.getKey());
            wVar.mo68529h("creator");
            this.userAdapter.toJson(wVar, collectionV3.getCreator());
            wVar.mo68529h("representative_listings");
            this.nullableListOfListingAdapter.toJson(wVar, collectionV3.getRepresentativeListings());
            wVar.mo68529h("creator_type_id");
            this.nullableLongAdapter.toJson(wVar, collectionV3.getCreatorTypeId());
            wVar.mo68529h(ResponseConstants.CREATE_DATE);
            this.nullableLongAdapter.toJson(wVar, collectionV3.getCreateDate());
            wVar.mo68529h(ResponseConstants.UPDATE_DATE);
            this.nullableLongAdapter.toJson(wVar, collectionV3.getUpdateDate());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
