package com.etsy.android.lib.models.apiv3.vespa;

import com.etsy.android.R;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.BaseModel;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p193o.C7494b;

public abstract class BaseActionableItem extends BaseFieldModel {
    public static final C7494b<String, ViewTypeMapping> sTypeToClassMap = new C7494b<>();
    private static final long serialVersionUID = -3051815245247625290L;
    public List<ServerDrivenAction> mActions = new ArrayList();
    public BaseModel mData;
    public boolean mEnabled = true;
    public int mViewType = R.id.view_type_undefined;

    public ServerDrivenAction getAction(String str) {
        for (ServerDrivenAction next : this.mActions) {
            if (str.equals(next.getType())) {
                return next;
            }
        }
        return null;
    }

    public List<ServerDrivenAction> getActions() {
        return this.mActions;
    }

    public BaseModel getData() {
        return this.mData;
    }

    public int getViewType() {
        return this.mViewType;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        ViewTypeMapping orDefault = sTypeToClassMap.getOrDefault(str, null);
        if (orDefault != null) {
            this.mData = (BaseModel) BaseModel.parseObject(jsonParser, orDefault.getModelClass());
            this.mViewType = orDefault.getViewId();
            return true;
        } else if (ResponseConstants.ACTIONS.equals(str)) {
            this.mActions = BaseModel.parseArray(jsonParser, ServerDrivenAction.class);
            return true;
        } else if (!ResponseConstants.ENABLED.equals(str)) {
            return false;
        } else {
            this.mEnabled = jsonParser.getBooleanValue();
            return true;
        }
    }

    public void setActions(List<ServerDrivenAction> list) {
        this.mActions = list;
    }

    public void setData(BaseModel baseModel) {
        this.mData = baseModel;
    }

    public void setViewType(int i) {
        this.mViewType = i;
    }
}
