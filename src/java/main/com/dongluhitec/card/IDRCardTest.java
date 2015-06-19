package com.dongluhitec.card;

import idrcore.IDRCoreLibrary;
import idrcore.ID_CARD_S;
import idrcore.JL_ITEM;
import idrcore.TERMB_ITEM;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

import org.bridj.BridJ;
import org.bridj.NativeList;
import org.bridj.Pointer;
import org.bridj.Pointer.ListType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import synpublic.IDCardCord;
import synpublic.IDCardData;
import synpublic.SynPublicLibrary;

import com.google.common.base.Joiner;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

public class IDRCardTest {

	protected Shell shell;
	private Label lblNewLabel;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			IDRCardTest window = new IDRCardTest();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");

		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int Port = SynPublicLibrary.Syn_FindReader();
				System.out.println(Port);
				int nRet = SynPublicLibrary.Syn_OpenPort(Port);
				System.out.println(nRet);
				int syn_SetMaxRFByte = SynPublicLibrary.Syn_SetMaxRFByte(Port, (byte) 80, 0);
				System.out.println(syn_SetMaxRFByte);
				Pointer<Byte> pucIIN = Pointer.allocateBytes(8);
				int syn_StartFindIDCard = SynPublicLibrary.Syn_StartFindIDCard(Port, pucIIN, 0);
				System.out.println("Syn_StartFindIDCard:" + syn_StartFindIDCard);
				Pointer<Byte> pucSN = Pointer.allocateBytes(8);
				int Syn_SelectIDCard = SynPublicLibrary.Syn_SelectIDCard(Port, pucSN, 0);
				System.out.println("Syn_SelectIDCard:" + Syn_SelectIDCard);

				Pointer<IDCardData> pIDCardData = Pointer.allocate(IDCardData.class);
				int syn_ReadMsg = SynPublicLibrary.Syn_ReadMsg(Port, 0, pIDCardData);

				System.out.println("syn_ReadMsg:" + syn_ReadMsg);
				IDCardData idCardData = pIDCardData.get();
				try {
					System.out.println(new String(idCardData.Address().getBytes(), "GBK"));
					System.out.println(new String(idCardData.IDCardNo().getBytes(), "GBK"));
					System.out.println(new String(idCardData.Name().getBytes(), "GBK"));
					System.out.println(new String(idCardData.Nation().getBytes(), "GBK"));
					System.out.println(new String(idCardData.Sex().getBytes(), "GBK"));
				} catch (UnsupportedEncodingException e1) {

					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(28, 133, 80, 27);
		btnNewButton.setText("二代证芯识别");

		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String filepath = "C:\\21.bmp";
				Pointer<Byte> pointerToCString = Pointer.pointerToCString(filepath);
				//直接取照片
				long get_MiscPic = IDRCoreLibrary.Get_IdcPic(2, pointerToCString);
				System.out.println(get_MiscPic);

				Image image = SWTResourceManager.getImage(filepath);
				ImageData scaledTo = image.getImageData().scaledTo(180, 163);
				Image image2 = new Image(shell.getDisplay(), scaledTo);
				lblNewLabel.setImage(image2);

				String szFullFileNameOut = "C:\\22.bmp";
				String szHeadFileNameOut = "C:\\23.bmp";
				Pointer<Byte> pointerToCString2 = Pointer.pointerToCString(szFullFileNameOut);
				Pointer<Byte> pointerToCString3 = Pointer.pointerToCString(szHeadFileNameOut);
				Pointer<ID_CARD_S> allocate = Pointer.allocate(ID_CARD_S.class);
				//
				long get_IdcData = IDRCoreLibrary.Get_IdcData(2, pointerToCString, pointerToCString2, pointerToCString3, allocate);
				
				System.out.println("get_IdcData2:" + get_IdcData);
				ID_CARD_S id_CARD_S = allocate.get();
				System.out.println(id_CARD_S.szText());
				NativeList<Byte> asList = id_CARD_S.szText().asList();
				List<Byte> subList = asList.subList(256, 511);
				System.out.println(subList.toArray().toString());
				byte[] arr = new byte[256];
				for (int i = 0; i < subList.size(); i++) {
					arr[i] = subList.get(i);
				}

				try {
					System.out.println(new String(arr, "GBK"));
				} catch (UnsupportedEncodingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(28, 36, 80, 27);
		btnNewButton_1.setText("二代证扫描识别");

		lblNewLabel = new Label(shell, SWT.BORDER);
		lblNewLabel.setBounds(160, 10, 180, 163);

	}
}
