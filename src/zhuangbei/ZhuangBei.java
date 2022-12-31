package zhuangbei;

import exceptions.AttributeNumberException;

/**
 * @author spy
 * @version 1.0
 * @since 1.0
 */
public class ZhuangBei {
	MainAttribute[] mainAttribute = new MainAttribute[3];
	SecondaryAttribute[] secondaryAttribute = new SecondaryAttribute[4];

	public ZhuangBei() {
	}

	public ZhuangBei(MainAttribute[] mainAttribute, SecondaryAttribute[] secondaryAttribute) throws AttributeNumberException {
		if (mainAttribute.length != 3) throw new AttributeNumberException();
		this.mainAttribute = mainAttribute;
		this.secondaryAttribute = secondaryAttribute;
	}
}
