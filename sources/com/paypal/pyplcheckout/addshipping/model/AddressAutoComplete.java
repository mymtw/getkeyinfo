package com.paypal.pyplcheckout.addshipping.model;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class AddressAutoComplete {
    private final List<Suggestions> suggestions;

    public AddressAutoComplete(List<Suggestions> list) {
        C19383o.m32797g(list, ResponseConstants.SUGGESTIONS);
        this.suggestions = list;
    }

    public static /* synthetic */ AddressAutoComplete copy$default(AddressAutoComplete addressAutoComplete, List<Suggestions> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addressAutoComplete.suggestions;
        }
        return addressAutoComplete.copy(list);
    }

    public final List<Suggestions> component1() {
        return this.suggestions;
    }

    public final AddressAutoComplete copy(List<Suggestions> list) {
        C19383o.m32797g(list, ResponseConstants.SUGGESTIONS);
        return new AddressAutoComplete(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressAutoComplete) && C19383o.m32792b(this.suggestions, ((AddressAutoComplete) obj).suggestions);
    }

    public final List<Suggestions> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        return this.suggestions.hashCode();
    }

    public String toString() {
        List<Suggestions> list = this.suggestions;
        return "AddressAutoComplete(suggestions=" + list + ")";
    }
}
