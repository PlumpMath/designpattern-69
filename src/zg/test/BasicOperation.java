package zg.test;

public enum BasicOperation implements Operation {
	PLUS("+") {
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},
	SUB("-") {
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},
	DIV("/") {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	},
	MUlti("*") {
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	};
	private String symple;

	private BasicOperation(String symple) {
		this.symple = symple;
	}

	@Override
	public String toString() {
		return this.symple;
	}
}
