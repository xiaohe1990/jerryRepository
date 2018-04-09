package zb.com.util;

public class HelpUtil {

	/**
	 * 判断对象是否为空
	 * @param obj
	 * @return 返回true表示为空，否则不为空
	 */
	public static boolean isNull(Object obj)
	{
		if("".equals(obj) || null == obj)
		{
			return true;
		}
		return false;
	}
}
