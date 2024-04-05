package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import com.etsy.android.R;

public class DropDownPreference extends ListPreference {

    /* renamed from: j1 */
    public final ArrayAdapter f6783j1;

    /* renamed from: k1 */
    public Spinner f6784k1;

    /* renamed from: l1 */
    public final C2995a f6785l1 = new C2995a();

    /* renamed from: androidx.preference.DropDownPreference$a */
    public class C2995a implements AdapterView.OnItemSelectedListener {
        public C2995a() {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                String charSequence = DropDownPreference.this.f6792X[i].toString();
                if (!charSequence.equals(DropDownPreference.this.f6793Y) && DropDownPreference.this.mo11051a(charSequence)) {
                    DropDownPreference.this.mo11029N(charSequence);
                }
            }
        }

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f6783j1 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f6791W;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f6783j1.add(charSequence.toString());
            }
        }
    }

    /* renamed from: j */
    public final void mo11005j() {
        super.mo11005j();
        ArrayAdapter arrayAdapter = this.f6783j1;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    /* renamed from: n */
    public final void mo11000n(C3051h hVar) {
        Spinner spinner = (Spinner) hVar.itemView.findViewById(R.id.spinner);
        this.f6784k1 = spinner;
        spinner.setAdapter(this.f6783j1);
        this.f6784k1.setOnItemSelectedListener(this.f6785l1);
        Spinner spinner2 = this.f6784k1;
        String str = this.f6793Y;
        CharSequence[] charSequenceArr = this.f6792X;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (charSequenceArr[length].equals(str)) {
                    i = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo11000n(hVar);
    }

    /* renamed from: o */
    public final void mo11003o() {
        this.f6784k1.performClick();
    }
}
