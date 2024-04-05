package com.etsy.android.lib.models.apiv3.search;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.listing.ListingImage;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p504ai.C13983i;

@C17403o(generateAdapter = true)
public final class TaxonomyNode {
    public static final int $stable = 8;
    private final String allName;
    private final long categoryId;
    private final List<TaxonomyNode> children;
    private final List<Long> childrenIds;
    private final String description;

    /* renamed from: id */
    private final long f19150id;
    private final ListingImage image;
    private final int level;
    private final String name;
    private final String parent;
    private final Long parentId;
    private final String path;
    private final String shortName;

    public TaxonomyNode(@C17402n(name = "id") long j, @C17402n(name = "name") String str, @C17402n(name = "children_ids") List<Long> list, @C17402n(name = "path") String str2, @C17402n(name = "children") List<TaxonomyNode> list2, @C17402n(name = "level") int i, @C17402n(name = "parent") String str3, @C17402n(name = "parent_id") Long l, @C17402n(name = "short_name") String str4, @C17402n(name = "all_name") String str5, @C17402n(name = "description") String str6, @C17402n(name = "category_id") long j2, @C17402n(name = "image") ListingImage listingImage) {
        ListingImage listingImage2 = listingImage;
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, ResponseConstants.PATH);
        C19383o.m32797g(list2, ResponseConstants.CHILDREN);
        C19383o.m32797g(listingImage2, ResponseConstants.IMAGE);
        this.f19150id = j;
        this.name = str;
        this.childrenIds = list;
        this.path = str2;
        this.children = list2;
        this.level = i;
        this.parent = str3;
        this.parentId = l;
        this.shortName = str4;
        this.allName = str5;
        this.description = str6;
        this.categoryId = j2;
        this.image = listingImage2;
    }

    public static /* synthetic */ TaxonomyNode copy$default(TaxonomyNode taxonomyNode, long j, String str, List list, String str2, List list2, int i, String str3, Long l, String str4, String str5, String str6, long j2, ListingImage listingImage, int i2, Object obj) {
        TaxonomyNode taxonomyNode2 = taxonomyNode;
        int i3 = i2;
        return taxonomyNode.copy((i3 & 1) != 0 ? taxonomyNode2.f19150id : j, (i3 & 2) != 0 ? taxonomyNode2.name : str, (i3 & 4) != 0 ? taxonomyNode2.childrenIds : list, (i3 & 8) != 0 ? taxonomyNode2.path : str2, (i3 & 16) != 0 ? taxonomyNode2.children : list2, (i3 & 32) != 0 ? taxonomyNode2.level : i, (i3 & 64) != 0 ? taxonomyNode2.parent : str3, (i3 & 128) != 0 ? taxonomyNode2.parentId : l, (i3 & 256) != 0 ? taxonomyNode2.shortName : str4, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? taxonomyNode2.allName : str5, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? taxonomyNode2.description : str6, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? taxonomyNode2.categoryId : j2, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? taxonomyNode2.image : listingImage);
    }

    public final long component1() {
        return this.f19150id;
    }

    public final String component10() {
        return this.allName;
    }

    public final String component11() {
        return this.description;
    }

    public final long component12() {
        return this.categoryId;
    }

    public final ListingImage component13() {
        return this.image;
    }

    public final String component2() {
        return this.name;
    }

    public final List<Long> component3() {
        return this.childrenIds;
    }

    public final String component4() {
        return this.path;
    }

    public final List<TaxonomyNode> component5() {
        return this.children;
    }

    public final int component6() {
        return this.level;
    }

    public final String component7() {
        return this.parent;
    }

    public final Long component8() {
        return this.parentId;
    }

    public final String component9() {
        return this.shortName;
    }

    public final TaxonomyNode copy(@C17402n(name = "id") long j, @C17402n(name = "name") String str, @C17402n(name = "children_ids") List<Long> list, @C17402n(name = "path") String str2, @C17402n(name = "children") List<TaxonomyNode> list2, @C17402n(name = "level") int i, @C17402n(name = "parent") String str3, @C17402n(name = "parent_id") Long l, @C17402n(name = "short_name") String str4, @C17402n(name = "all_name") String str5, @C17402n(name = "description") String str6, @C17402n(name = "category_id") long j2, @C17402n(name = "image") ListingImage listingImage) {
        String str7 = str;
        C19383o.m32797g(str7, "name");
        String str8 = str2;
        C19383o.m32797g(str8, ResponseConstants.PATH);
        List<TaxonomyNode> list3 = list2;
        C19383o.m32797g(list3, ResponseConstants.CHILDREN);
        C19383o.m32797g(listingImage, ResponseConstants.IMAGE);
        return new TaxonomyNode(j, str7, list, str8, list3, i, str3, l, str4, str5, str6, j2, listingImage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxonomyNode)) {
            return false;
        }
        TaxonomyNode taxonomyNode = (TaxonomyNode) obj;
        return this.f19150id == taxonomyNode.f19150id && C19383o.m32792b(this.name, taxonomyNode.name) && C19383o.m32792b(this.childrenIds, taxonomyNode.childrenIds) && C19383o.m32792b(this.path, taxonomyNode.path) && C19383o.m32792b(this.children, taxonomyNode.children) && this.level == taxonomyNode.level && C19383o.m32792b(this.parent, taxonomyNode.parent) && C19383o.m32792b(this.parentId, taxonomyNode.parentId) && C19383o.m32792b(this.shortName, taxonomyNode.shortName) && C19383o.m32792b(this.allName, taxonomyNode.allName) && C19383o.m32792b(this.description, taxonomyNode.description) && this.categoryId == taxonomyNode.categoryId && C19383o.m32792b(this.image, taxonomyNode.image);
    }

    public final String getAllName() {
        return this.allName;
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final List<TaxonomyNode> getChildren() {
        return this.children;
    }

    public final List<Long> getChildrenIds() {
        return this.childrenIds;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getId() {
        return this.f19150id;
    }

    public final ListingImage getImage() {
        return this.image;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParent() {
        return this.parent;
    }

    public final Long getParentId() {
        return this.parentId;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.name, Long.hashCode(this.f19150id) * 31, 31);
        List<Long> list = this.childrenIds;
        int i = 0;
        int a = C0069a.m170a(this.level, C13983i.m21488g(this.children, C0023f.m105e(this.path, (e + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31);
        String str = this.parent;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.parentId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.shortName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.allName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return this.image.hashCode() + C0071c.m190b(this.categoryId, (hashCode4 + i) * 31, 31);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("TaxonomyNode(id=");
        h.append(this.f19150id);
        h.append(", name=");
        h.append(this.name);
        h.append(", childrenIds=");
        h.append(this.childrenIds);
        h.append(", path=");
        h.append(this.path);
        h.append(", children=");
        h.append(this.children);
        h.append(", level=");
        h.append(this.level);
        h.append(", parent=");
        h.append(this.parent);
        h.append(", parentId=");
        h.append(this.parentId);
        h.append(", shortName=");
        h.append(this.shortName);
        h.append(", allName=");
        h.append(this.allName);
        h.append(", description=");
        h.append(this.description);
        h.append(", categoryId=");
        h.append(this.categoryId);
        h.append(", image=");
        h.append(this.image);
        h.append(')');
        return h.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TaxonomyNode(long r20, java.lang.String r22, java.util.List r23, java.lang.String r24, java.util.List r25, int r26, java.lang.String r27, java.lang.Long r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, long r32, com.etsy.android.lib.models.apiv3.listing.ListingImage r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r23
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0011
            r11 = r2
            goto L_0x0013
        L_0x0011:
            r11 = r27
        L_0x0013:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r28
        L_0x001b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0021
            r13 = r2
            goto L_0x0023
        L_0x0021:
            r13 = r29
        L_0x0023:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0029
            r14 = r2
            goto L_0x002b
        L_0x0029:
            r14 = r30
        L_0x002b:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0031
            r15 = r2
            goto L_0x0033
        L_0x0031:
            r15 = r31
        L_0x0033:
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r24
            r9 = r25
            r10 = r26
            r16 = r32
            r18 = r34
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.apiv3.search.TaxonomyNode.<init>(long, java.lang.String, java.util.List, java.lang.String, java.util.List, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, long, com.etsy.android.lib.models.apiv3.listing.ListingImage, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
