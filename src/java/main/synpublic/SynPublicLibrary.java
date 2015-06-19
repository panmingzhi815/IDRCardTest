package synpublic;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Pointer;
import org.bridj.ann.Convention.Style;
import org.bridj.ann.Convention;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>SynPublic</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("SynIDCardAPI") 
@Runtime(CRuntime.class) 
public class SynPublicLibrary {
	static {
		BridJ.register();
	}
	/**
	 * Original signature : <code>int Syn_SetMaxRFByte(int, unsigned char, int)</code><br>
	 * <i>native declaration : SynPublic.h:22</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetMaxRFByte(int iPort, byte ucByte, int bIfOpen);
	/**
	 * Original signature : <code>int Syn_GetCOMBaud(int, unsigned int*)</code><br>
	 * <i>native declaration : SynPublic.h:23</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_GetCOMBaud(int iPort, Pointer<Integer > puiBaudRate) {
		return Syn_GetCOMBaud(iPort, Pointer.getPeer(puiBaudRate));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_GetCOMBaud(int iPort, @Ptr long puiBaudRate);
	/**
	 * \u8fd4\u56de\u5b9e\u9645\u7684\u6ce2\u7279\u7387,0\u4e3a\u5931\u8d25<br>
	 * Original signature : <code>int Syn_GetCOMBaudEx(int)</code><br>
	 * <i>native declaration : SynPublic.h:24</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_GetCOMBaudEx(int iPort);
	/**
	 * Original signature : <code>int Syn_SetCOMBaud(int, unsigned int, unsigned int)</code><br>
	 * <i>native declaration : SynPublic.h:25</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetCOMBaud(int iPort, int uiCurrBaud, int uiSetBaud);
	/**
	 * Original signature : <code>int Syn_OpenPort(int)</code><br>
	 * <i>native declaration : SynPublic.h:26</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_OpenPort(int iPort);
	/**
	 * Original signature : <code>int Syn_ClosePort(int)</code><br>
	 * <i>native declaration : SynPublic.h:27</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_ClosePort(int iPort);
	/**
	 * Original signature : <code>int Syn_ResetSAM(int, int)</code><br>
	 * <i>native declaration : SynPublic.h:32</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_ResetSAM(int iPort, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_GetSAMStatus(int, int)</code><br>
	 * <i>native declaration : SynPublic.h:33</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_GetSAMStatus(int iPort, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_GetSAMID(int, unsigned char*, int)</code><br>
	 * <i>native declaration : SynPublic.h:34</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_GetSAMID(int iPort, Pointer<Byte > pucSAMID, int iIfOpen) {
		return Syn_GetSAMID(iPort, Pointer.getPeer(pucSAMID), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_GetSAMID(int iPort, @Ptr long pucSAMID, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_GetSAMIDToStr(int, char*, int)</code><br>
	 * <i>native declaration : SynPublic.h:35</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_GetSAMIDToStr(int iPort, Pointer<Byte > pcSAMID, int iIfOpen) {
		return Syn_GetSAMIDToStr(iPort, Pointer.getPeer(pcSAMID), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_GetSAMIDToStr(int iPort, @Ptr long pcSAMID, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_StartFindIDCard(int, unsigned char*, int)</code><br>
	 * <i>native declaration : SynPublic.h:40</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_StartFindIDCard(int iPort, Pointer<Byte > pucIIN, int iIfOpen) {
		return Syn_StartFindIDCard(iPort, Pointer.getPeer(pucIIN), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_StartFindIDCard(int iPort, @Ptr long pucIIN, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_SelectIDCard(int, unsigned char*, int)</code><br>
	 * <i>native declaration : SynPublic.h:41</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_SelectIDCard(int iPort, Pointer<Byte > pucSN, int iIfOpen) {
		return Syn_SelectIDCard(iPort, Pointer.getPeer(pucSN), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_SelectIDCard(int iPort, @Ptr long pucSN, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_ReadBaseMsg(int, unsigned char*, unsigned int*, unsigned char*, unsigned int*, int)</code><br>
	 * <i>native declaration : SynPublic.h:42</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_ReadBaseMsg(int iPort, Pointer<Byte > pucCHMsg, Pointer<Integer > puiCHMsgLen, Pointer<Byte > pucPHMsg, Pointer<Integer > puiPHMsgLen, int iIfOpen) {
		return Syn_ReadBaseMsg(iPort, Pointer.getPeer(pucCHMsg), Pointer.getPeer(puiCHMsgLen), Pointer.getPeer(pucPHMsg), Pointer.getPeer(puiPHMsgLen), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_ReadBaseMsg(int iPort, @Ptr long pucCHMsg, @Ptr long puiCHMsgLen, @Ptr long pucPHMsg, @Ptr long puiPHMsgLen, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_ReadIINSNDN(int, unsigned char*, int)</code><br>
	 * <i>native declaration : SynPublic.h:49</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_ReadIINSNDN(int iPort, Pointer<Byte > pucIINSNDN, int iIfOpen) {
		return Syn_ReadIINSNDN(iPort, Pointer.getPeer(pucIINSNDN), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_ReadIINSNDN(int iPort, @Ptr long pucIINSNDN, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_ReadBaseMsgToFile(int, char*, unsigned int*, char*, unsigned int*, int)</code><br>
	 * <i>native declaration : SynPublic.h:50</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_ReadBaseMsgToFile(int iPort, Pointer<Byte > pcCHMsgFileName, Pointer<Integer > puiCHMsgFileLen, Pointer<Byte > pcPHMsgFileName, Pointer<Integer > puiPHMsgFileLen, int iIfOpen) {
		return Syn_ReadBaseMsgToFile(iPort, Pointer.getPeer(pcCHMsgFileName), Pointer.getPeer(puiCHMsgFileLen), Pointer.getPeer(pcPHMsgFileName), Pointer.getPeer(puiPHMsgFileLen), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_ReadBaseMsgToFile(int iPort, @Ptr long pcCHMsgFileName, @Ptr long puiCHMsgFileLen, @Ptr long pcPHMsgFileName, @Ptr long puiPHMsgFileLen, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_ReadIINSNDNToASCII(int, unsigned char*, int)</code><br>
	 * <i>native declaration : SynPublic.h:58</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_ReadIINSNDNToASCII(int iPort, Pointer<Byte > pucIINSNDN, int iIfOpen) {
		return Syn_ReadIINSNDNToASCII(iPort, Pointer.getPeer(pucIINSNDN), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_ReadIINSNDNToASCII(int iPort, @Ptr long pucIINSNDN, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_ReadNewAppMsg(int, unsigned char*, unsigned int*, int)</code><br>
	 * <i>native declaration : SynPublic.h:59</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_ReadNewAppMsg(int iPort, Pointer<Byte > pucAppMsg, Pointer<Integer > puiAppMsgLen, int iIfOpen) {
		return Syn_ReadNewAppMsg(iPort, Pointer.getPeer(pucAppMsg), Pointer.getPeer(puiAppMsgLen), iIfOpen);
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_ReadNewAppMsg(int iPort, @Ptr long pucAppMsg, @Ptr long puiAppMsgLen, int iIfOpen);
	/**
	 * Original signature : <code>int Syn_GetBmp(int, char*)</code><br>
	 * <i>native declaration : SynPublic.h:60</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_GetBmp(int iPort, Pointer<Byte > Wlt_File) {
		return Syn_GetBmp(iPort, Pointer.getPeer(Wlt_File));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_GetBmp(int iPort, @Ptr long Wlt_File);
	/**
	 * Original signature : <code>int Syn_ReadMsg(int, int, IDCardData*)</code><br>
	 * <i>native declaration : SynPublic.h:62</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_ReadMsg(int iPort, int iIfOpen, Pointer<IDCardData > pIDCardData) {
		return Syn_ReadMsg(iPort, iIfOpen, Pointer.getPeer(pIDCardData));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_ReadMsg(int iPort, int iIfOpen, @Ptr long pIDCardData);
	/**
	 * Original signature : <code>int Syn_FindReader()</code><br>
	 * <i>native declaration : SynPublic.h:63</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_FindReader();
	/**
	 * Original signature : <code>int Syn_BmpToJpeg(char*, char*)</code><br>
	 * <i>native declaration : SynPublic.h:64</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_BmpToJpeg(Pointer<Byte > cBmpName, Pointer<Byte > cJpegName) {
		return Syn_BmpToJpeg(Pointer.getPeer(cBmpName), Pointer.getPeer(cJpegName));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_BmpToJpeg(@Ptr long cBmpName, @Ptr long cJpegName);
	/**
	 * Original signature : <code>int Syn_GetPhotoBmp(char*)</code><br>
	 * <i>native declaration : SynPublic.h:65</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_GetPhotoBmp(Pointer<Byte > cBmpName) {
		return Syn_GetPhotoBmp(Pointer.getPeer(cBmpName));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_GetPhotoBmp(@Ptr long cBmpName);
	/**
	 * Original signature : <code>int Syn_PhotoToStrBase64(char*, int*)</code><br>
	 * <i>native declaration : SynPublic.h:67</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_PhotoToStrBase64(Pointer<Byte > cBase64, Pointer<Integer > iLen) {
		return Syn_PhotoToStrBase64(Pointer.getPeer(cBase64), Pointer.getPeer(iLen));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_PhotoToStrBase64(@Ptr long cBase64, @Ptr long iLen);
	/**
	 * Original signature : <code>int Syn_StrBase64ToPhoto(char*, int, char*)</code><br>
	 * <i>native declaration : SynPublic.h:68</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_StrBase64ToPhoto(Pointer<Byte > cBase64, int iLen, Pointer<Byte > cPhotoName) {
		return Syn_StrBase64ToPhoto(Pointer.getPeer(cBase64), iLen, Pointer.getPeer(cPhotoName));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_StrBase64ToPhoto(@Ptr long cBase64, int iLen, @Ptr long cPhotoName);
	/**
	 * Original signature : <code>int Syn_SetPhotoPath(int, char*)</code><br>
	 * <i>native declaration : SynPublic.h:73</i>
	 */
	@Convention(Convention.Style.StdCall) 
	public static int Syn_SetPhotoPath(int iOption, Pointer<Byte > cPhotoPath) {
		return Syn_SetPhotoPath(iOption, Pointer.getPeer(cPhotoPath));
	}
	@Convention(Convention.Style.StdCall) 
	protected native static int Syn_SetPhotoPath(int iOption, @Ptr long cPhotoPath);
	/**
	 * Original signature : <code>int Syn_SetPhotoType(int)</code><br>
	 * <i>native declaration : SynPublic.h:74</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetPhotoType(int iType);
	/**
	 * Original signature : <code>int Syn_SetPhotoName(int)</code><br>
	 * <i>native declaration : SynPublic.h:75</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetPhotoName(int iType);
	/**
	 * Original signature : <code>int Syn_SetSexType(int)</code><br>
	 * <i>native declaration : SynPublic.h:76</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetSexType(int iType);
	/**
	 * Original signature : <code>int Syn_SetNationType(int)</code><br>
	 * <i>native declaration : SynPublic.h:77</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetNationType(int iType);
	/**
	 * Original signature : <code>int Syn_SetBornType(int)</code><br>
	 * <i>native declaration : SynPublic.h:78</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetBornType(int iType);
	/**
	 * Original signature : <code>int Syn_SetUserLifeBType(int)</code><br>
	 * <i>native declaration : SynPublic.h:79</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetUserLifeBType(int iType);
	/**
	 * Original signature : <code>int Syn_SetUserLifeEType(int, int)</code><br>
	 * <i>native declaration : SynPublic.h:80</i>
	 */
	@Convention(Convention.Style.StdCall) 
	native public static int Syn_SetUserLifeEType(int iType, int iOption);
}