package synpublic;

import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

public interface IDCardCord extends Library {

	public long Get_MiscPic(int iCardType, String szFileNameIn);

	public long Get_MiscData(int iCardType, String szFileNameIn, String szFullFileNameOut, String szHeadFileNameOut, JL_ITEM pstOut);

	public static class JL_ITEM extends Structure {

		public static class ByReference extends JL_ITEM implements Structure.ByReference {
		}

		public static class ByValue extends JL_ITEM implements Structure.ByValue {
		}

		public char[] pzTxt = new char[256];
		public NativeLong left;
		public NativeLong top;
		public NativeLong right;
		public NativeLong bottom;
	}
}
