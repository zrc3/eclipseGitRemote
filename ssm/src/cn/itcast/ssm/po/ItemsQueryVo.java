package cn.itcast.ssm.po;

import java.util.List;

/*
 * 商品包装对象
 */
public class ItemsQueryVo {
	
	//商品信息
	private MItems items;
	
	//为了系统的可扩展性,对原始生成的pojo类进行扩展
	private ItemsCustom itemsCustom;
	
	//批量商品信息
	private List<ItemsCustom> itemsList;

	public List<ItemsCustom> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<ItemsCustom> itemsList) {
		this.itemsList = itemsList;
	}

	public MItems getItems() {
		return items;
	}

	public void setItems(MItems items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
}
