package com.meiyang.javacard.demo;


import javacard.framework.*;
//import javacard.framework.service.*;

public class JCDemo extends Applet{
	private static byte[] RAM_SSKEY16;


	private JCDemo() {
		// Allocates an RMI service and sets for the Java Card platform
		// the initial reference
		RAM_SSKEY16 = JCSystem.makeTransientByteArray((short)16, JCSystem.CLEAR_ON_RESET);

	}

	public static void install(byte[] buffer, short offset, byte length) {


		// Allocates and registers the applet
		(new JCDemo()).register();
	}

	public void process(APDU apdu) {
		// TODO Auto-generated method stub
		if(selectingApplet()){
			return;
		}

		byte[] apduBuf = apdu.getBuffer();
		byte temp = 0;
		apdu.setIncomingAndReceive();
		short bytesToSend = 0;
		short p1 = apduBuf[ISO7816.OFFSET_P1];
		short p2 = apduBuf[ISO7816.OFFSET_P2];
		short off = 0;
		try {
			switch(apduBuf[ISO7816.OFFSET_INS]){
			case  (byte)0x26: //0x06 echo whats been sent in apdu. 
				bytesToSend = (short)(apduBuf[ISO7816.OFFSET_LC]);
				break;
			default:
				ISOException.throwIt(ISO7816.SW_INS_NOT_SUPPORTED);
				break;
			}//endofswitch
		}catch(ISOException isoe){
			ISOException.throwIt(isoe.getReason());
		}catch(Exception e){
			ISOException.throwIt(ISO7816.SW_COMMAND_NOT_ALLOWED);
		}
		if(bytesToSend!=0){
			apdu.setOutgoingAndSend(ISO7816.OFFSET_CDATA, bytesToSend);
		}	

	}


	public void deselect(boolean arg0) {
		// TODO Auto-generated method stub
		
	}

	public boolean select(boolean arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}





