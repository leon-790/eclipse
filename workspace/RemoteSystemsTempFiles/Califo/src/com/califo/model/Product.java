package com.califo.model;

public class Product
{
	private	int id;
	private String item;
	private String approach;
	private float fee;
	private int uid;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getItem()
	{
		return item;
	}
	public void setItem(String item)
	{
		this.item = item;
	}
	public String getApproach()
	{
		return approach;
	}
	public void setApproach(String approach)
	{
		this.approach = approach;
	}
	public float getFee()
	{
		return fee;
	}
	public void setFee(float fee)
	{
		this.fee = fee;
	}
	public int getUid()
	{
		return uid;
	}
	public void setUid(int uid)
	{
		this.uid = uid;
	}
	public Product(int id, String item, String approach, float fee, int uid)
	{
		super();
		this.id = id;
		this.item = item;
		this.approach = approach;
		this.fee = fee;
		this.uid = uid;
	}
	public Product()
	{
		super();
	}
	@Override
	public String toString()
	{
		return "Product [id=" + id + ", item=" + item + ", approach="
				+ approach + ", fee=" + fee + ", uid=" + uid + "]";
	}
}
