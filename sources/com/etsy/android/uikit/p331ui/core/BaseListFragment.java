package com.etsy.android.uikit.p331ui.core;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.EditText;
import android.widget.ListView;
import androidx.fragment.app.ListFragment;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.uikit.util.C11901e;
import p357gf.C12794c;
import p463v9.C13537b;
import p628nj.C18263b;

@Deprecated
/* renamed from: com.etsy.android.uikit.ui.core.BaseListFragment */
public abstract class BaseListFragment extends ListFragment implements C12794c {

    /* renamed from: com.etsy.android.uikit.ui.core.BaseListFragment$a */
    public class C11885a implements AbsListView.RecyclerListener {
        public final void onMovedToScrapHeap(View view) {
            if (view.hasFocus()) {
                view.clearFocus();
                if (view instanceof EditText) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        }
    }

    private void setFocusHackListener() {
        ListView listView = getListView();
        if (listView == null) {
            C8694h.f19097a.mo21313g("unable to apply the listview hack, sad pandas all around");
        } else {
            listView.setRecyclerListener(new C11885a());
        }
    }

    public C13537b getPostManager() {
        return C18263b.f40057V.f29142h;
    }

    public boolean handleBackPressed() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroyView() {
        C11901e.m19622a(getView());
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setFocusHackListener();
    }
}
