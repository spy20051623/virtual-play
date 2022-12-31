package zhuangbei;

import exceptions.AttributeIncompatibleException;

/**
 * @author spy
 * @version 1.0
 * @since 1.0
 */
public class MainAttribute {
	Attributes attribute;
	double value;

	public MainAttribute(Attributes attribute, double value) throws AttributeIncompatibleException {
		if (attribute == Attributes.wcfh) throw new AttributeIncompatibleException();
		this.attribute = attribute;
		this.value = value;
	}
}
