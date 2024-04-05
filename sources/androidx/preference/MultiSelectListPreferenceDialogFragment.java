package androidx.preference;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class MultiSelectListPreferenceDialogFragment extends PreferenceDialogFragment {
    private static final String SAVE_STATE_CHANGED = "MultiSelectListPreferenceDialogFragment.changed";
    private static final String SAVE_STATE_ENTRIES = "MultiSelectListPreferenceDialogFragment.entries";
    private static final String SAVE_STATE_ENTRY_VALUES = "MultiSelectListPreferenceDialogFragment.entryValues";
    private static final String SAVE_STATE_VALUES = "MultiSelectListPreferenceDialogFragment.values";
    public CharSequence[] mEntries;
    public CharSequence[] mEntryValues;
    public Set<String> mNewValues = new HashSet();
    public boolean mPreferenceChanged;

    /* renamed from: androidx.preference.MultiSelectListPreferenceDialogFragment$a */
    public class C3004a implements DialogInterface.OnMultiChoiceClickListener {
        public C3004a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = MultiSelectListPreferenceDialogFragment.this;
                multiSelectListPreferenceDialogFragment.mPreferenceChanged = multiSelectListPreferenceDialogFragment.mNewValues.add(multiSelectListPreferenceDialogFragment.mEntryValues[i].toString()) | multiSelectListPreferenceDialogFragment.mPreferenceChanged;
                return;
            }
            MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment2 = MultiSelectListPreferenceDialogFragment.this;
            multiSelectListPreferenceDialogFragment2.mPreferenceChanged = multiSelectListPreferenceDialogFragment2.mNewValues.remove(multiSelectListPreferenceDialogFragment2.mEntryValues[i].toString()) | multiSelectListPreferenceDialogFragment2.mPreferenceChanged;
        }
    }

    private MultiSelectListPreference getListPreference() {
        return (MultiSelectListPreference) getPreference();
    }

    @Deprecated
    public static MultiSelectListPreferenceDialogFragment newInstance(String str) {
        MultiSelectListPreferenceDialogFragment multiSelectListPreferenceDialogFragment = new MultiSelectListPreferenceDialogFragment();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragment.setArguments(bundle);
        return multiSelectListPreferenceDialogFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference listPreference = getListPreference();
            if (listPreference.f6800W == null || listPreference.f6801X == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.mNewValues.clear();
            this.mNewValues.addAll(listPreference.f6802Y);
            this.mPreferenceChanged = false;
            this.mEntries = listPreference.f6800W;
            this.mEntryValues = listPreference.f6801X;
            return;
        }
        this.mNewValues.clear();
        this.mNewValues.addAll(bundle.getStringArrayList(SAVE_STATE_VALUES));
        this.mPreferenceChanged = bundle.getBoolean(SAVE_STATE_CHANGED, false);
        this.mEntries = bundle.getCharSequenceArray(SAVE_STATE_ENTRIES);
        this.mEntryValues = bundle.getCharSequenceArray(SAVE_STATE_ENTRY_VALUES);
    }

    @Deprecated
    public void onDialogClosed(boolean z) {
        MultiSelectListPreference listPreference = getListPreference();
        if (z && this.mPreferenceChanged) {
            Set<String> set = this.mNewValues;
            if (listPreference.mo11051a(set)) {
                listPreference.mo11038L(set);
            }
        }
        this.mPreferenceChanged = false;
    }

    public void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        super.onPrepareDialogBuilder(builder);
        int length = this.mEntryValues.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.mNewValues.contains(this.mEntryValues[i].toString());
        }
        builder.setMultiChoiceItems(this.mEntries, zArr, new C3004a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(SAVE_STATE_VALUES, new ArrayList(this.mNewValues));
        bundle.putBoolean(SAVE_STATE_CHANGED, this.mPreferenceChanged);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }
}
