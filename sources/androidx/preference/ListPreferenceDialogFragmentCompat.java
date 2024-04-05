package androidx.preference;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;

public class ListPreferenceDialogFragmentCompat extends PreferenceDialogFragmentCompat {
    private static final String SAVE_STATE_ENTRIES = "ListPreferenceDialogFragment.entries";
    private static final String SAVE_STATE_ENTRY_VALUES = "ListPreferenceDialogFragment.entryValues";
    private static final String SAVE_STATE_INDEX = "ListPreferenceDialogFragment.index";
    public int mClickedDialogEntryIndex;
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;

    /* renamed from: androidx.preference.ListPreferenceDialogFragmentCompat$a */
    public class C3002a implements DialogInterface.OnClickListener {
        public C3002a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = ListPreferenceDialogFragmentCompat.this;
            listPreferenceDialogFragmentCompat.mClickedDialogEntryIndex = i;
            listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    private ListPreference getListPreference() {
        return (ListPreference) getPreference();
    }

    public static ListPreferenceDialogFragmentCompat newInstance(String str) {
        ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = new ListPreferenceDialogFragmentCompat();
        Bundle bundle = new Bundle(1);
        bundle.putString("key", str);
        listPreferenceDialogFragmentCompat.setArguments(bundle);
        return listPreferenceDialogFragmentCompat;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = getListPreference();
            if (listPreference.f6791W == null || listPreference.f6792X == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.mClickedDialogEntryIndex = listPreference.mo11027L(listPreference.f6793Y);
            this.mEntries = listPreference.f6791W;
            this.mEntryValues = listPreference.f6792X;
            return;
        }
        this.mClickedDialogEntryIndex = bundle.getInt(SAVE_STATE_INDEX, 0);
        this.mEntries = bundle.getCharSequenceArray(SAVE_STATE_ENTRIES);
        this.mEntryValues = bundle.getCharSequenceArray(SAVE_STATE_ENTRY_VALUES);
    }

    public void onDialogClosed(boolean z) {
        int i;
        if (z && (i = this.mClickedDialogEntryIndex) >= 0) {
            String charSequence = this.mEntryValues[i].toString();
            ListPreference listPreference = getListPreference();
            if (listPreference.mo11051a(charSequence)) {
                listPreference.mo11029N(charSequence);
            }
        }
    }

    public void onPrepareDialogBuilder(AlertDialog.C0133a aVar) {
        super.onPrepareDialogBuilder(aVar);
        aVar.mo1237h(this.mEntries, this.mClickedDialogEntryIndex, new C3002a());
        aVar.mo1235g((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(SAVE_STATE_INDEX, this.mClickedDialogEntryIndex);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRIES, this.mEntries);
        bundle.putCharSequenceArray(SAVE_STATE_ENTRY_VALUES, this.mEntryValues);
    }
}
