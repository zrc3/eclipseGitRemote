package cn.itcast.ssm.po;

public class MOrderdetail {
    private Integer id;

    private Integer mOrdersId;

    private Integer mItemsId;

    private Integer mItemsNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getmOrdersId() {
        return mOrdersId;
    }

    public void setmOrdersId(Integer mOrdersId) {
        this.mOrdersId = mOrdersId;
    }

    public Integer getmItemsId() {
        return mItemsId;
    }

    public void setmItemsId(Integer mItemsId) {
        this.mItemsId = mItemsId;
    }

    public Integer getmItemsNumber() {
        return mItemsNumber;
    }

    public void setmItemsNumber(Integer mItemsNumber) {
        this.mItemsNumber = mItemsNumber;
    }
}