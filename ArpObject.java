
public class ArpObject {
	
	private int ID;
	private String IP;
	private String MAC;
	private String OtherMac;
	private String Unknown;
	
	public ArpObject(int id, String iP, String mAC, String otherMac, String unknown) {
		super();
		ID = id;
		IP = iP;
		MAC = mAC;
		OtherMac = otherMac;
		Unknown = unknown;
	}
	
	public ArpObject() {
		IP = null;
		MAC = null;
		OtherMac = null;
		Unknown = null;
	}



	public String getIP() {
		return IP;
	}



	public void setIP(String iP) {
		IP = iP;
	}



	public String getMAC() {
		return MAC;
	}



	public void setMAC(String mAC) {
		MAC = mAC;
	}



	public String getOtherMac() {
		return OtherMac;
	}



	public void setOtherMac(String otherMac) {
		OtherMac = otherMac;
	}



	public String getUnknown() {
		return Unknown;
	}



	public void setUnknown(String unknown) {
		Unknown = unknown;
	}
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "ArpObject [ID=" + ID + ", IP=" + IP + ", MAC=" + MAC + ", OtherMac=" + OtherMac + ", Unknown=" + Unknown
				+ "]";
	}






}
