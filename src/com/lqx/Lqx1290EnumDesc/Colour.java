package com.lqx.Lqx1290EnumDesc;

public enum Colour {
	green("��ɫ"),mossGreen("̦��ɫ"),emeraldGreen("����ɫ"),oliveGreen("�����"),
	blue("��ɫ"),turquoiseBlue("��������ɫ"),cobaltBlue("����ɫ"),navyBlue("����ɫ"),
	aquamarineBlue("����ɫ"),red("��ɫ"),scarlet("�ɺ�"),mauve("�Ϻ�"),wineRed("���Ѿƺ�"),
	purpleViolet("��ɫ"),lavender("����ɫ"),lilac("ǳ��ɫ"),antiqueViolet("����ɫ"),
	pansy("������ɫ"),white("��ɫ"),offWhite("�Ұ�ɫ"),ivory("����ɫ"),snowyWhite("ѩ��ɫ"),
	oysterWhite("���ɫ"),gray("��ɫ");
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
