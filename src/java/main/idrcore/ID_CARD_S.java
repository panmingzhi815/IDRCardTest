package idrcore;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : IDRCore.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("IDRCore") 
public class ID_CARD_S extends StructObject {
	public ID_CARD_S() {
		super();
	}
	/// C type : char[10][256]
	@Array({10, 256}) 
	@Field(0) 
	public Pointer<Byte > szText() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : HY_RECT_S[10]
	@Array({10}) 
	@Field(1) 
	public Pointer<HY_RECT_S > idRect() {
		return this.io.getPointerField(this, 1);
	}
	public ID_CARD_S(Pointer pointer) {
		super(pointer);
	}
}