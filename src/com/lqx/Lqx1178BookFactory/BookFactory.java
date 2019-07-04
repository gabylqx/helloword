package com.lqx.Lqx1178BookFactory;

public final class BookFactory {
	// 工厂名，人员数，面积
	private String factoryName;
	private int factoryOffer;
	private int factoryArea;

	private static BookFactory bookFactory = new BookFactory();

	private BookFactory() {

	}

	public static BookFactory getBookFactory() {
		return bookFactory;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public int getFactoryOffer() {
		return factoryOffer;
	}

	public void setFactoryOffer(int factoryOffer) {
		this.factoryOffer = factoryOffer;
	}

	public int getFactoryArea() {
		return factoryArea;
	}

	public void setFactoryArea(int factoryArea) {
		this.factoryArea = factoryArea;
	}

	@Override
	public String toString() {
		return "BookFactory [factoryName=" + factoryName + ", factoryOffer=" + factoryOffer + ", factoryArea="
				+ factoryArea + "]";
	}

}
