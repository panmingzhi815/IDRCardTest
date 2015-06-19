package idrcore;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.CLong;
import org.bridj.ann.Convention.Style;
import org.bridj.ann.Convention;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>IDRCore</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("IDRCore") 
@Runtime(CRuntime.class) 
public class IDRCoreLibrary {
	static {
		BridJ.register();
	}
	/**
	 * \u6253\u5f00\u8bbe\u5907<br>
	 * Original signature : <code>long Device_Open()</code><br>
	 * <i>native declaration : IDRCore.h:35</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	native public static long Device_Open();
	/**
	 * \u5173\u95ed\u8bbe\u5907<br>
	 * Original signature : <code>void Device_Close()</code><br>
	 * <i>native declaration : IDRCore.h:37</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static void Device_Close();
	/**
	 * \u89e3\u6790\u8eab\u4efd\u8bc1\u56fe\u7247<br>
	 * Original signature : <code>long Get_IdcPic(int, char*)</code><br>
	 * <i>native declaration : IDRCore.h:39</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_IdcPic(int iCardType, Pointer<Byte > szFileNameIn) {
		return Get_IdcPic(iCardType, Pointer.getPeer(szFileNameIn));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_IdcPic(int iCardType, @Ptr long szFileNameIn);
	/**
	 * \u89e3\u6790\u5176\u5b83\u8bc1\u4ef6\u56fe\u7247<br>
	 * Original signature : <code>long Get_MiscPic(int, char*)</code><br>
	 * <i>native declaration : IDRCore.h:41</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_MiscPic(int iCardType, Pointer<Byte > szFileNameIn) {
		return Get_MiscPic(iCardType, Pointer.getPeer(szFileNameIn));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_MiscPic(int iCardType, @Ptr long szFileNameIn);
	/**
	 * \u89e3\u6790\u8eab\u4efd\u8bc1\u4fe1\u606f<br>
	 * Original signature : <code>long Get_IdcData(int, char*, char*, char*, ID_CARD_S*)</code><br>
	 * <i>native declaration : IDRCore.h:43</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_IdcData(int iCardType, Pointer<Byte > szFileNameIn, Pointer<Byte > szFullFileNameOut, Pointer<Byte > szHeadFileNameOut, Pointer<ID_CARD_S > pstOut) {
		return Get_IdcData(iCardType, Pointer.getPeer(szFileNameIn), Pointer.getPeer(szFullFileNameOut), Pointer.getPeer(szHeadFileNameOut), Pointer.getPeer(pstOut));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_IdcData(int iCardType, @Ptr long szFileNameIn, @Ptr long szFullFileNameOut, @Ptr long szHeadFileNameOut, @Ptr long pstOut);
	/**
	 * Original signature : <code>long Get_IdcData2(int, char*, char*, char*, TERMB_ITEM*)</code><br>
	 * <i>native declaration : IDRCore.h:44</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_IdcData2(int iCardType, Pointer<Byte > szFileNameIn, Pointer<Byte > szFullFileNameOut, Pointer<Byte > szHeadFileNameOut, Pointer<TERMB_ITEM > pstOut) {
		return Get_IdcData2(iCardType, Pointer.getPeer(szFileNameIn), Pointer.getPeer(szFullFileNameOut), Pointer.getPeer(szHeadFileNameOut), Pointer.getPeer(pstOut));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_IdcData2(int iCardType, @Ptr long szFileNameIn, @Ptr long szFullFileNameOut, @Ptr long szHeadFileNameOut, @Ptr long pstOut);
	/**
	 * \u89e3\u6790\u5176\u5b83\u8bc1\u4ef6\u4fe1\u606f<br>
	 * Original signature : <code>long Get_MiscData(int, char*, char*, char*, JL_ITEM*)</code><br>
	 * <i>native declaration : IDRCore.h:46</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_MiscData(int iCardType, Pointer<Byte > szFileNameIn, Pointer<Byte > szFullFileNameOut, Pointer<Byte > szHeadFileNameOut, Pointer<JL_ITEM > pstOut) {
		return Get_MiscData(iCardType, Pointer.getPeer(szFileNameIn), Pointer.getPeer(szFullFileNameOut), Pointer.getPeer(szHeadFileNameOut), Pointer.getPeer(pstOut));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_MiscData(int iCardType, @Ptr long szFileNameIn, @Ptr long szFullFileNameOut, @Ptr long szHeadFileNameOut, @Ptr long pstOut);
	/**
	 * Original signature : <code>long Get_MiscData2(int, char*, char*, char*, TERMB_ITEM*)</code><br>
	 * <i>native declaration : IDRCore.h:47</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_MiscData2(int iCardType, Pointer<Byte > szFileNameIn, Pointer<Byte > szFullFileNameOut, Pointer<Byte > szHeadFileNameOut, Pointer<TERMB_ITEM > pstOut) {
		return Get_MiscData2(iCardType, Pointer.getPeer(szFileNameIn), Pointer.getPeer(szFullFileNameOut), Pointer.getPeer(szHeadFileNameOut), Pointer.getPeer(pstOut));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_MiscData2(int iCardType, @Ptr long szFileNameIn, @Ptr long szFullFileNameOut, @Ptr long szHeadFileNameOut, @Ptr long pstOut);
	/**
	 * \u673a\u8bfb\u4e8c\u4ee3\u8bc1<br>
	 * Original signature : <code>long Get_TermbData(char*, TERMB_ITEM*)</code><br>
	 * <i>native declaration : IDRCore.h:49</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_TermbData(Pointer<Byte > szFileNameIn, Pointer<TERMB_ITEM > pstOut) {
		return Get_TermbData(Pointer.getPeer(szFileNameIn), Pointer.getPeer(pstOut));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_TermbData(@Ptr long szFileNameIn, @Ptr long pstOut);
	/**
	 * \u663e\u793a\u914d\u7f6e\u7a97\u53e3<br>
	 * Original signature : <code>long Show_ConfigWindow(HANDLE*, int)</code><br>
	 * <i>native declaration : IDRCore.h:51</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Show_ConfigWindow(Pointer<IDRCoreLibrary.HANDLE > handle, int iCardType) {
		return Show_ConfigWindow(Pointer.getPeer(handle), iCardType);
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Show_ConfigWindow(@Ptr long handle, int iCardType);
	/**
	 * \u663e\u793a\u9519\u8bef\u6d88\u606f<br>
	 * Original signature : <code>long Format_ErrMsg(int, char**)</code><br>
	 * <i>native declaration : IDRCore.h:53</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Format_ErrMsg(int iErrCodeIn, Pointer<Pointer<Byte > > pErrMsgOut) {
		return Format_ErrMsg(iErrCodeIn, Pointer.getPeer(pErrMsgOut));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Format_ErrMsg(int iErrCodeIn, @Ptr long pErrMsgOut);
	/**
	 * Bmp\u8f6c\u6362\u6210Jpg<br>
	 * Original signature : <code>long BmpToJpg(char*, char*)</code><br>
	 * <i>native declaration : IDRCore.h:55</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long BmpToJpg(Pointer<Byte > szFileNameSrc, Pointer<Byte > szFileNameDest) {
		return BmpToJpg(Pointer.getPeer(szFileNameSrc), Pointer.getPeer(szFileNameDest));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long BmpToJpg(@Ptr long szFileNameSrc, @Ptr long szFileNameDest);
	/**
	 * Original signature : <code>long BmpToJpg2(char*, char*, int, int)</code><br>
	 * <i>native declaration : IDRCore.h:56</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long BmpToJpg2(Pointer<Byte > szFileNameSrc, Pointer<Byte > szFileNameDest, int iWidth, int iHeight) {
		return BmpToJpg2(Pointer.getPeer(szFileNameSrc), Pointer.getPeer(szFileNameDest), iWidth, iHeight);
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long BmpToJpg2(@Ptr long szFileNameSrc, @Ptr long szFileNameDest, int iWidth, int iHeight);
	/**
	 * \u83b7\u53d6\u5f69\u8272\u8bc1\u4ef6\u56fe\u7247<br>
	 * Original signature : <code>long Get_ColorPic(int, char*, char*)</code><br>
	 * <i>native declaration : IDRCore.h:58</i>
	 */
	@Convention(Convention.Style.StdCall) 
	@CLong 
	public static long Get_ColorPic(int iCardType, Pointer<Byte > szFullFileNameOut, Pointer<Byte > szHeadFileNameOut) {
		return Get_ColorPic(iCardType, Pointer.getPeer(szFullFileNameOut), Pointer.getPeer(szHeadFileNameOut));
	}
	@Convention(Convention.Style.StdCall) 
	@CLong 
	protected native static long Get_ColorPic(int iCardType, @Ptr long szFullFileNameOut, @Ptr long szHeadFileNameOut);
	/// Undefined type
	/// Undefined type
	public static interface HANDLE {
		
	};
}
