package inter.impl;

import inter.impl.domain.TbMerchandise;
import inter.impl.domain.TbMerchandisePicture;

/**
 * project alljava
 *
 * @author chenghai on 2018/11/2 0002. - 星期五
 * nickName louyedaren
 */

public class MerchandisVo {
	private TbMerchandise merchandiseInfo;
	private TbMerchandisePicture merchandisePicture;

	private MerchandisVo(Builder builder) {
		setMerchandiseInfo(builder.merchandiseInfo);
		setMerchandisePicture(builder.merchandisePicture);
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static Builder newBuilder(MerchandisVo copy) {
		Builder builder = new Builder();
		builder.merchandiseInfo = copy.getMerchandiseInfo();
		builder.merchandisePicture = copy.getMerchandisePicture();
		return builder;
	}


	public TbMerchandise getMerchandiseInfo() {
		return merchandiseInfo;
	}

	public void setMerchandiseInfo(TbMerchandise merchandiseInfo) {
		this.merchandiseInfo = merchandiseInfo;
	}

	public TbMerchandisePicture getMerchandisePicture() {
		return merchandisePicture;
	}

	public void setMerchandisePicture(TbMerchandisePicture merchandisePicture) {
		this.merchandisePicture = merchandisePicture;
	}

	/**
	 * {@code MerchandisVo} builder static inner class.
	 */
	public static final class Builder {
		private TbMerchandise merchandiseInfo;
		private TbMerchandisePicture merchandisePicture;

		private Builder() {
		}

		/**
		 * Sets the {@code merchandiseInfo} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code merchandiseInfo} to set
		 * @return a reference to this Builder
		 */
		public Builder merchandiseInfo(TbMerchandise val) {
			merchandiseInfo = val;
			return this;
		}

		/**
		 * Sets the {@code merchandisePicture} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code merchandisePicture} to set
		 * @return a reference to this Builder
		 */
		public Builder merchandisePicture(TbMerchandisePicture val) {
			merchandisePicture = val;
			return this;
		}

		/**
		 * Returns a {@code MerchandisVo} built from the parameters previously set.
		 *
		 * @return a {@code MerchandisVo} built with parameters of this {@code MerchandisVo.Builder}
		 */
		public MerchandisVo build() {
			return new MerchandisVo(this);
		}
	}
}
