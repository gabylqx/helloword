package com.lqx.Lqx1172Contructor;

public class tetete {

	public static void main(String[] args) {
		System.out.println(new B().getValue());
	}

	static class A {
		protected int value;

		public A(int v) {
			setValue(v);
		}

		public void setValue(int Value) {
			this.value = Value;
		}

		public int getValue() {
			try {
				value++;
				System.out.print("try");
				return value;

			} finally {
				this.setValue(value);
				System.out.print("fina");
				System.out.println(value);
			}
		}
	}

	static class B extends A {
		public B() {
			super(5);
			setValue(getValue() - 3);

		}

		public void setValue(int value) {
			super.setValue(2 * value);
			System.out.print("set");
		}
	}
}