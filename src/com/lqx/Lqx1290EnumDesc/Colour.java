package com.lqx.Lqx1290EnumDesc;

public enum Colour {
	green("绿色"),mossGreen("苔绿色"),emeraldGreen("鲜绿色"),oliveGreen("橄榄绿"),
	blue("蓝色"),turquoiseBlue("土耳其玉色"),cobaltBlue("艳蓝色"),navyBlue("天蓝色"),
	aquamarineBlue("蓝绿色"),red("红色"),scarlet("猩红"),mauve("紫红"),wineRed("葡萄酒红"),
	purpleViolet("紫色"),lavender("淡紫色"),lilac("浅紫色"),antiqueViolet("古紫色"),
	pansy("紫罗兰色"),white("白色"),offWhite("灰白色"),ivory("象牙色"),snowyWhite("雪白色"),
	oysterWhite("乳白色"),gray("灰色");
	private String desc;
	private Colour(String desc) {
		this.setDesc(desc);
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
