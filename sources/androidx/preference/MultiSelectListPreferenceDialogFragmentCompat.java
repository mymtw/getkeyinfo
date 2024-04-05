package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private static final String SAVE_STATE_CHANGED = "MultiSelectListPreferenceDialogFragmentCompat.changed";
    private static final String SAVE_STATE_ENTRIES = "MultiSelectListPreferenceDialogFragmentCompat.entries";
    private static final String SAVE_STATE_ENTRY_VALUES = "MultiSelectListPreferenceDialogFragmentCompat.entryValues";
    private static final String SAVE_STATE_VALUES = "MultiSelectListPreferenceDialogFragmentCompat.values";
    public CharSequence[] mEntries;
    public CharSequence[] mEntryValues;
    public Set<String> mNewValues = new HashSet();
    public boolean mPreferenceChanged;

    /* renamed from: androidx.preference.MultiSelectListPreferenceDialogFragmentCompat$a */
    public class C3005a implements DialogInterface.OnMultiChoiceClickListener {
        public C3005a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
            if (z) {
                MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = MultiSelectListPreferenceDialogFragmentCompat.this;
                multiSelectListPreferenceDialogFragmentCompat.mPreferenceChanged = multiSelectListPreferenceDialogFragmentCompat.mNewValues.add(multiSelectListPreferenceDialogFragmentCompat.mEntryValues[i].toString()) | multiSelectListPreferenceDialogFragmentCompat.mPreferenceChanged;
                return;
            }
            MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat2 = MultiSelectListPreferenceDialogFragmentCompat.this;
            multiSelectListPreferenceDialogFragmentCompat2.mPreferenceChanged = multiSelectListPreferenceDialogFragmentCompat2.mNewValues.remove(multiSelectListPreferenceDialogFragmentCompat2.mEntryValues[i].toString()) | multiSelectListPreferenceDialogFragmentCompat2.mPreferenceChanged;
        }
    }

    private MultiSelectListPreference getListPreference() {
        return (MultiSelectListPreference) getPreference();
    }

    public static MultiSelectListPreferenceDialogFragmentCompat newInstance(String str) {
        MultiSelectListPreferenceDialogFragmentCompat multiSelectListPreferenceDialogFragmentCompat = new MultiSelectListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        multiSelectListPreferenceDialogFragmentCompat.setArguments(bundle);
        return multiSelectListPreferenceDialogFragmentCompat;
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

    public void onDialogClosed(boolean z) {
        if (z && this.mPreferenceChanged) {
            MultiSelectListPreference listPreference = getListPreference();
            if (listPreference.mo11051a(this.mNewValues)) {
                listPreference.mo11038L(this.mNewValues);
            }
        }
        this.mPreferenceChanged = false;
    }

    public void onPrepareDialogBuilder(AlertDialog.C0133a aVar) {
        super.onPrepareDialogBuilder(aVar);
        int length = this.mEntryValues.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.mNewValues.contains(this.mEntryValues[i].toString());
        }
        aVar.mo1232d(this.mEntries, zArr, new C3005a());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList(SAVE_STATE_VALUES, new ArrayList(this.mNewValues));
        bundle.putBoolean(SAVE_STATE_CHANGED, this.mPreferenceChanged);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }
}
