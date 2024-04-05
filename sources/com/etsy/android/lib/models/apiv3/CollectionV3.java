package com.etsy.android.lib.models.apiv3;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.apiv3.Collection;
import com.etsy.android.lib.models.apiv3.listing.User;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p415of.C13186o;

@C17403o(generateAdapter = true)
public final class CollectionV3 implements Parcelable, C13186o, C8698l {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CollectionV3> CREATOR = new Creator();
    private final long collectionId;
    private final Long createDate;
    private final User creator;
    private final Long creatorTypeId;
    private final String key;
    private final int listingsCount;
    private final String name;
    private final Collection.PrivacyLevel privacyLevel;
    private final List<Listing> representativeListings;
    private final String slug;
    private final String type;
    private final Long updateDate;
    private final String url;

    public static final class Creator implements Parcelable.Creator<CollectionV3> {
        public final CollectionV3 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            C19383o.m32797g(parcel2, "parcel");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Collection.PrivacyLevel valueOf = Collection.PrivacyLevel.valueOf(parcel.readString());
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            User createFromParcel = User.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(parcel.readSerializable());
                }
            }
            return new CollectionV3(readLong, readString, readString2, valueOf, readString3, readInt, readString4, readString5, createFromParcel, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        public final CollectionV3[] newArray(int i) {
            return new CollectionV3[i];
        }
    }

    public CollectionV3(@C17402n(name = "id") long j, @C17402n(name = "slug") String str, @C17402n(name = "name") String str2, @C17402n(name = "privacy_level") Collection.PrivacyLevel privacyLevel2, @C17402n(name = "type") String str3, @C17402n(name = "listings_count") int i, @C17402n(name = "url") String str4, @C17402n(name = "key") String str5, @C17402n(name = "creator") User user, @C17402n(name = "representative_listings") List<? extends Listing> list, @C17402n(name = "creator_type_id") Long l, @C17402n(name = "create_date") Long l2, @C17402n(name = "update_date") Long l3) {
        C19383o.m32797g(privacyLevel2, "privacyLevel");
        C19383o.m32797g(user, "creator");
        this.collectionId = j;
        this.slug = str;
        this.name = str2;
        this.privacyLevel = privacyLevel2;
        this.type = str3;
        this.listingsCount = i;
        this.url = str4;
        this.key = str5;
        this.creator = user;
        this.representativeListings = list;
        this.creatorTypeId = l;
        this.createDate = l2;
        this.updateDate = l3;
    }

    public static /* synthetic */ CollectionV3 copy$default(CollectionV3 collectionV3, long j, String str, String str2, Collection.PrivacyLevel privacyLevel2, String str3, int i, String str4, String str5, User user, List list, Long l, Long l2, Long l3, int i2, Object obj) {
        CollectionV3 collectionV32 = collectionV3;
        int i3 = i2;
        return collectionV3.copy((i3 & 1) != 0 ? collectionV32.collectionId : j, (i3 & 2) != 0 ? collectionV32.slug : str, (i3 & 4) != 0 ? collectionV32.name : str2, (i3 & 8) != 0 ? collectionV32.privacyLevel : privacyLevel2, (i3 & 16) != 0 ? collectionV32.type : str3, (i3 & 32) != 0 ? collectionV32.listingsCount : i, (i3 & 64) != 0 ? collectionV32.url : str4, (i3 & 128) != 0 ? collectionV32.key : str5, (i3 & 256) != 0 ? collectionV32.creator : user, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? collectionV32.representativeListings : list, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? collectionV32.creatorTypeId : l, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? collectionV32.createDate : l2, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? collectionV32.updateDate : l3);
    }

    public final long component1() {
        return this.collectionId;
    }

    public final List<Listing> component10() {
        return this.representativeListings;
    }

    public final Long component11() {
        return this.creatorTypeId;
    }

    public final Long component12() {
        return this.createDate;
    }

    public final Long component13() {
        return this.updateDate;
    }

    public final String component2() {
        return this.slug;
    }

    public final String component3() {
        return this.name;
    }

    public final Collection.PrivacyLevel component4() {
        return this.privacyLevel;
    }

    public final String component5() {
        return this.type;
    }

    public final int component6() {
        return this.listingsCount;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.key;
    }

    public final User component9() {
        return this.creator;
    }

    public final CollectionV3 copy(@C17402n(name = "id") long j, @C17402n(name = "slug") String str, @C17402n(name = "name") String str2, @C17402n(name = "privacy_level") Collection.PrivacyLevel privacyLevel2, @C17402n(name = "type") String str3, @C17402n(name = "listings_count") int i, @C17402n(name = "url") String str4, @C17402n(name = "key") String str5, @C17402n(name = "creator") User user, @C17402n(name = "representative_listings") List<? extends Listing> list, @C17402n(name = "creator_type_id") Long l, @C17402n(name = "create_date") Long l2, @C17402n(name = "update_date") Long l3) {
        Collection.PrivacyLevel privacyLevel3 = privacyLevel2;
        C19383o.m32797g(privacyLevel3, "privacyLevel");
        User user2 = user;
        C19383o.m32797g(user2, "creator");
        return new CollectionV3(j, str, str2, privacyLevel3, str3, i, str4, str5, user2, list, l, l2, l3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionV3)) {
            return false;
        }
        CollectionV3 collectionV3 = (CollectionV3) obj;
        return this.collectionId == collectionV3.collectionId && C19383o.m32792b(this.slug, collectionV3.slug) && C19383o.m32792b(this.name, collectionV3.name) && this.privacyLevel == collectionV3.privacyLevel && C19383o.m32792b(this.type, collectionV3.type) && this.listingsCount == collectionV3.listingsCount && C19383o.m32792b(this.url, collectionV3.url) && C19383o.m32792b(this.key, collectionV3.key) && C19383o.m32792b(this.creator, collectionV3.creator) && C19383o.m32792b(this.representativeListings, collectionV3.representativeListings) && C19383o.m32792b(this.creatorTypeId, collectionV3.creatorTypeId) && C19383o.m32792b(this.createDate, collectionV3.createDate) && C19383o.m32792b(this.updateDate, collectionV3.updateDate);
    }

    public final long getCollectionId() {
        return this.collectionId;
    }

    public final Long getCreateDate() {
        return this.createDate;
    }

    public final User getCreator() {
        return this.creator;
    }

    public final Long getCreatorTypeId() {
        return this.creatorTypeId;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getListingsCount() {
        return this.listingsCount;
    }

    public final String getName() {
        return this.name;
    }

    public final Collection.PrivacyLevel getPrivacyLevel() {
        return this.privacyLevel;
    }

    public final List<Listing> getRepresentativeListings() {
        return this.representativeListings;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getUpdateDate() {
        return this.updateDate;
    }

    public final String getUrl() {
        return this.url;
    }

    public int getViewType() {
        return R.id.view_type_collection_listing_card;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.collectionId) * 31;
        String str = this.slug;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (this.privacyLevel.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.type;
        int a = C0069a.m170a(this.listingsCount, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.url;
        int hashCode4 = (a + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.key;
        int hashCode5 = (this.creator.hashCode() + ((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        List<Listing> list = this.representativeListings;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.creatorTypeId;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.createDate;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.updateDate;
        if (l3 != null) {
            i = l3.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CollectionV3(collectionId=");
        h.append(this.collectionId);
        h.append(", slug=");
        h.append(this.slug);
        h.append(", name=");
        h.append(this.name);
        h.append(", privacyLevel=");
        h.append(this.privacyLevel);
        h.append(", type=");
        h.append(this.type);
        h.append(", listingsCount=");
        h.append(this.listingsCount);
        h.append(", url=");
        h.append(this.url);
        h.append(", key=");
        h.append(this.key);
        h.append(", creator=");
        h.append(this.creator);
        h.append(", representativeListings=");
        h.append(this.representativeListings);
        h.append(", creatorTypeId=");
        h.append(this.creatorTypeId);
        h.append(", createDate=");
        h.append(this.createDate);
        h.append(", updateDate=");
        h.append(this.updateDate);
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeLong(this.collectionId);
        parcel.writeString(this.slug);
        parcel.writeString(this.name);
        parcel.writeString(this.privacyLevel.name());
        parcel.writeString(this.type);
        parcel.writeInt(this.listingsCount);
        parcel.writeString(this.url);
        parcel.writeString(this.key);
        this.creator.writeToParcel(parcel, i);
        List<Listing> list = this.representativeListings;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Listing writeSerializable : list) {
                parcel.writeSerializable(writeSerializable);
            }
        }
        Long l = this.creatorTypeId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l);
        }
        Long l2 = this.createDate;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l2);
        }
        Long l3 = this.updateDate;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            C0069a.m180k(parcel, 1, l3);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CollectionV3(long r19, java.lang.String r21, java.lang.String r22, com.etsy.android.lib.models.apiv3.Collection.PrivacyLevel r23, java.lang.String r24, int r25, java.lang.String r26, java.lang.String r27, com.etsy.android.lib.models.apiv3.listing.User r28, java.util.List r29, java.lang.Long r30, java.lang.Long r31, java.lang.Long r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r21
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r22
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001b
            com.etsy.android.lib.models.apiv3.Collection$PrivacyLevel r1 = com.etsy.android.lib.models.apiv3.Collection.PrivacyLevel.PUBLIC
            r8 = r1
            goto L_0x001d
        L_0x001b:
            r8 = r23
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r9 = r2
            goto L_0x0025
        L_0x0023:
            r9 = r24
        L_0x0025:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x002b
            r14 = r2
            goto L_0x002d
        L_0x002b:
            r14 = r29
        L_0x002d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0033
            r15 = r2
            goto L_0x0035
        L_0x0033:
            r15 = r30
        L_0x0035:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x003c
            r16 = r2
            goto L_0x003e
        L_0x003c:
            r16 = r31
        L_0x003e:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0045
            r17 = r2
            goto L_0x0047
        L_0x0045:
            r17 = r32
        L_0x0047:
            r3 = r18
            r4 = r19
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.CollectionV3.<init>(long, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.Collection$PrivacyLevel, java.lang.String, int, java.lang.String, java.lang.String, com.etsy.android.lib.models.apiv3.listing.User, java.util.List, java.lang.Long, java.lang.Long, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
