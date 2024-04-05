package com.etsy.android.lib.models.apiv3.editable;

import com.etsy.android.lib.models.datatypes.EtsyId;

public interface IEditableInventoryObject {
    int getId();

    EtsyId getListingId();

    int getParentId();
}
