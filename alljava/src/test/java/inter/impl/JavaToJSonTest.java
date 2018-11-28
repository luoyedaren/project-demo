package inter.impl;

import com.alibaba.fastjson.JSONObject;
import inter.impl.domain.TbMerchandise;
import inter.impl.domain.TbMerchandisePicture;
import inter.impl.domain.TbOrderMain;
import org.testng.annotations.Test;

/**
 * project alljava
 *
 * @author chenghai on 2018/11/2 0002. - 星期五
 * nickName louyedaren
 */
public class JavaToJSonTest {

	@Test
	public void testToJsonStr() {
		TbMerchandise t = new TbMerchandise();
		TbOrderMain t1 = new TbOrderMain();
		String s = JSONObject.toJSONString(t);
		System.out.println(s);
	}

	@Test
	public void test2() {
		TbMerchandise info = new TbMerchandise();
		TbMerchandisePicture pic = new TbMerchandisePicture();
		MerchandisVo v = MerchandisVo.newBuilder().merchandiseInfo(info).merchandisePicture(pic).build();
		System.out.println(JSONObject.toJSONString(v));

	}
}
