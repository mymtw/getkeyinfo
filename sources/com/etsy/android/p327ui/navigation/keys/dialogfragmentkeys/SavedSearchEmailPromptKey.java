package com.etsy.android.p327ui.navigation.keys.dialogfragmentkeys;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.fragment.app.DialogFragment;
import com.etsy.android.p327ui.navigation.keys.DialogFragmentNavigationKey;
import com.etsy.android.p327ui.search.savedsearch.SavedSearchEmailPromptFragment;
import kotlin.jvm.internal.C19383o;
import p363he.C12822e;
import p363he.C12824f;

/* renamed from: com.etsy.android.ui.navigation.keys.dialogfragmentkeys.SavedSearchEmailPromptKey */
public final class SavedSearchEmailPromptKey implements DialogFragmentNavigationKey {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SavedSearchEmailPromptKey> CREATOR = new Creator();
    private final String referrer;

    /* renamed from: com.etsy.android.ui.navigation.keys.dialogfragmentkeys.SavedSearchEmailPromptKey$Creator */
    public static final class Creator implements Parcelable.Creator<SavedSearchEmailPromptKey> {
        public final SavedSearchEmailPromptKey createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new SavedSearchEmailPromptKey(parcel.readString());
        }

        public final SavedSearchEmailPromptKey[] newArray(int i) {
            return new SavedSearchEmailPromptKey[i];
        }
    }

    public SavedSearchEmailPromptKey(String str) {
        C19383o.m32797g(str, "referrer");
        this.referrer = str;
    }

    public static /* synthetic */ SavedSearchEmailPromptKey copy$default(SavedSearchEmailPromptKey savedSearchEmailPromptKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedSearchEmailPromptKey.getReferrer();
        }
        return savedSearchEmailPromptKey.copy(str);
    }

    public final String component1() {
        return getReferrer();
    }

    public final SavedSearchEmailPromptKey copy(String str) {
        C19383o.m32797g(str, "referrer");
        return new SavedSearchEmailPromptKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SavedSearchEmailPromptKey) && C19383o.m32792b(getReferrer(), ((SavedSearchEmailPromptKey) obj).getReferrer());
    }

    public DialogFragment getDialogFragment() {
        return new SavedSearchEmailPromptFragment();
    }

    public C12824f getNavigationParams() {
        C12824f fVar = new C12824f();
        fVar.f28304a.put(".ref", getReferrer());
        return fVar;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public int hashCode() {
        return getReferrer().hashCode();
    }

    public int storeDataForKey(Object obj) {
        C19383o.m32797g(obj, "value");
        return C12822e.C12823a.m20464a(obj);
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("SavedSearchEmailPromptKey(referrer=");
        h.append(getReferrer());
        h.append(')');
        return h.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(this.referrer);
    }
}
