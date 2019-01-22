package lang;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/12 0012. - 星期六
 * nickName louyedaren
 */
public class FinalLearn {
	private final String name;
	private String notInit;
	private String text = "test";

	@java.beans.ConstructorProperties({"name", "notInit", "text"})
	FinalLearn(String name, String notInit, String text) {
		this.name = name;
		this.notInit = notInit;
		this.text = text;
	}

	public static FinalLearnBuilder builder() {
		return new FinalLearnBuilder();
	}


	public static class FinalLearnBuilder {
		private String name;
		private String notInit;
		private String text;

		FinalLearnBuilder() {
		}

		public FinalLearnBuilder name(String name) {
			this.name = name;
			return this;
		}

		public FinalLearnBuilder notInit(String notInit) {
			this.notInit = notInit;
			return this;
		}

		public FinalLearnBuilder text(String text) {
			this.text = text;
			return this;
		}

		public FinalLearn build() {
			return new FinalLearn(name, notInit, text);
		}

		public String toString() {
			return "FinalLearn.FinalLearnBuilder(name=" + this.name + ", notInit=" + this.notInit + ", text=" + this.text + ")";
		}
	}
}