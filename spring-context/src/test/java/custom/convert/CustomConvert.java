package custom.convert;

import custom.convert.entity.ActualEntity;
import custom.convert.entity.RequestEntity;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.TypeMismatchException;
import org.springframework.core.MethodParameter;

import java.lang.reflect.Field;

public class CustomConvert implements TypeConverter {
	@Override
	public <T> T convertIfNecessary(Object value, Class<T> requiredType) throws TypeMismatchException {
		if (value instanceof RequestEntity && requiredType == ActualEntity.class) {
			return (T) ActualEntity.init((RequestEntity) value);
		}
		return null;
	}

	@Override
	public <T> T convertIfNecessary(Object value, Class<T> requiredType, MethodParameter methodParam) throws TypeMismatchException {
		return this.convertIfNecessary(value, requiredType);
	}

	@Override
	public <T> T convertIfNecessary(Object value, Class<T> requiredType, Field field) throws TypeMismatchException {
		return this.convertIfNecessary(value, requiredType);
	}
}
