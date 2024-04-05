package com.etsy.android.lib.models.apiv3;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C17403o(generateAdapter = true)
public final class CollectionsUpdateResponse {
    public static final int $stable = 8;
    private List<String> failedCollectionKeys;
    private Boolean socialInvitesFlag;

    public CollectionsUpdateResponse() {
        this((Boolean) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public CollectionsUpdateResponse(@C17402n(name = "social_invites_flag") Boolean bool, @C17402n(name = "failed_collection_keys") List<String> list) {
        this.socialInvitesFlag = bool;
        this.failedCollectionKeys = list;
    }

    public static /* synthetic */ CollectionsUpdateResponse copy$default(CollectionsUpdateResponse collectionsUpdateResponse, Boolean bool, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = collectionsUpdateResponse.socialInvitesFlag;
        }
        if ((i & 2) != 0) {
            list = collectionsUpdateResponse.failedCollectionKeys;
        }
        return collectionsUpdateResponse.copy(bool, list);
    }

    public final Boolean component1() {
        return this.socialInvitesFlag;
    }

    public final List<String> component2() {
        return this.failedCollectionKeys;
    }

    public final CollectionsUpdateResponse copy(@C17402n(name = "social_invites_flag") Boolean bool, @C17402n(name = "failed_collection_keys") List<String> list) {
        return new CollectionsUpdateResponse(bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionsUpdateResponse)) {
            return false;
        }
        CollectionsUpdateResponse collectionsUpdateResponse = (CollectionsUpdateResponse) obj;
        return C19383o.m32792b(this.socialInvitesFlag, collectionsUpdateResponse.socialInvitesFlag) && C19383o.m32792b(this.failedCollectionKeys, collectionsUpdateResponse.failedCollectionKeys);
    }

    public final List<String> getFailedCollectionKeys() {
        return this.failedCollectionKeys;
    }

    public final Boolean getSocialInvitesFlag() {
        return this.socialInvitesFlag;
    }

    public int hashCode() {
        Boolean bool = this.socialInvitesFlag;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.failedCollectionKeys;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final void setFailedCollectionKeys(List<String> list) {
        this.failedCollectionKeys = list;
    }

    public final void setSocialInvitesFlag(Boolean bool) {
        this.socialInvitesFlag = bool;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("CollectionsUpdateResponse(socialInvitesFlag=");
        h.append(this.socialInvitesFlag);
        h.append(", failedCollectionKeys=");
        return C0070b.m186i(h, this.failedCollectionKeys, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollectionsUpdateResponse(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? EmptyList.INSTANCE : list);
    }
}
