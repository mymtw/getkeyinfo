package com.paypal.pyplcheckout.common.cache;

import androidx.datastore.preferences.core.C2493b;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlinx.coroutines.flow.C19597d;

public interface PreferenceStore {
    void clear(String str);

    Object getPreferenceBoolean(String str, C19340c<? super C19597d<Boolean>> cVar);

    Object getPreferenceInt(String str, C19340c<? super C19597d<Integer>> cVar);

    Object getPreferenceString(String str, C19340c<? super C19597d<String>> cVar);

    Object setBoolean(C2493b.C2494a<Boolean> aVar, boolean z, C19340c<? super C19394m> cVar);

    Object setInt(C2493b.C2494a<Integer> aVar, int i, C19340c<? super C19394m> cVar);

    Object setString(C2493b.C2494a<String> aVar, String str, C19340c<? super C19394m> cVar);
}
