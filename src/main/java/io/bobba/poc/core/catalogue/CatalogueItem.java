package io.bobba.poc.core.catalogue;

import io.bobba.poc.core.items.BaseItem;

public class CatalogueItem {
	private int id;
	private BaseItem baseItem;
	private String name;
	private int cost;
	private int amount;
	public int getId() {
		return id;
	}
	public BaseItem getBaseItem() {
		return baseItem;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	public int getAmount() {
		return amount;
	}
	
	public CatalogueItem(int id, BaseItem baseItem, String name, int cost, int amount) {
		this.id = id;
		this.baseItem = baseItem;
		this.name = name;
		this.cost = cost;
		this.amount = amount;
	}
}
