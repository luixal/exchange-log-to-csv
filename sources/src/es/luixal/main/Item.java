package es.luixal.main;

import java.util.List;

import org.jsefa.csv.annotation.CsvDataType;
import org.jsefa.csv.annotation.CsvField;

@CsvDataType()
public class Item {

	@CsvField(pos = 1)
	private String firstSyncTime;
	@CsvField(pos = 2)
	private String LastPolicyUpdateTime;
	@CsvField(pos = 3)
	private String LastSyncAttemptTime;
	@CsvField(pos = 4)
	private String LastSuccessSync;
	@CsvField(pos = 5)
	private String DeviceType;
	@CsvField(pos = 6)
	private String DeviceID;
	@CsvField(pos = 7)
	private String DeviceUserAgent;
	@CsvField(pos = 8)
	private String DeviceWipeSentTime;
	@CsvField(pos = 9)
	private String DeviceWipeRequestTime;
	@CsvField(pos = 10)
	private String DeviceWipeAckTime;
	@CsvField(pos = 11)
	private String LastPingHeartbeat;
	@CsvField(pos = 12)
	private String RecoveryPassword;
	@CsvField(pos = 13)
	private String DeviceModel;
	@CsvField(pos = 14)
	private String DeviceIMEI;
	@CsvField(pos = 15)
	private String DeviceFriendlyName;
	@CsvField(pos = 16)
	private String DeviceOS;
	@CsvField(pos = 17)
	private String DeviceOSLanguage;
	@CsvField(pos = 18)
	private String DevicePhoneNumber;
	@CsvField(pos = 19)
	private String Identity;
	
	public Item() {
		super();
	}

	public Item(String firstSyncTime, String lastPolicyUpdateTime,
			String lastSyncAttemptTime, String lastSuccessSync,
			String deviceType, String deviceID, String deviceUserAgent,
			String deviceWipeSentTime, String deviceWipeRequestTime,
			String deviceWipeAckTime, String lastPingHeartbeat,
			String recoveryPassword, String deviceModel, String deviceIMEI,
			String deviceFriendlyName, String deviceOS,
			String deviceOSLanguage, String devicePhoneNumber, String identity) {
		super();
		this.firstSyncTime = firstSyncTime;
		LastPolicyUpdateTime = lastPolicyUpdateTime;
		LastSyncAttemptTime = lastSyncAttemptTime;
		LastSuccessSync = lastSuccessSync;
		DeviceType = deviceType;
		DeviceID = deviceID;
		DeviceUserAgent = deviceUserAgent;
		DeviceWipeSentTime = deviceWipeSentTime;
		DeviceWipeRequestTime = deviceWipeRequestTime;
		DeviceWipeAckTime = deviceWipeAckTime;
		LastPingHeartbeat = lastPingHeartbeat;
		RecoveryPassword = recoveryPassword;
		DeviceModel = deviceModel;
		DeviceIMEI = deviceIMEI;
		DeviceFriendlyName = deviceFriendlyName;
		DeviceOS = deviceOS;
		DeviceOSLanguage = deviceOSLanguage;
		DevicePhoneNumber = devicePhoneNumber;
		Identity = identity;
	}
	
	@Override
	public String toString() {
		return "Item [firstSyncTime=" + firstSyncTime
				+ ", LastPolicyUpdateTime=" + LastPolicyUpdateTime
				+ ", LastSyncAttemptTime=" + LastSyncAttemptTime
				+ ", LastSuccessSync=" + LastSuccessSync + ", DeviceType="
				+ DeviceType + ", DeviceID=" + DeviceID + ", DeviceUserAgent="
				+ DeviceUserAgent + ", DeviceWipeSentTime="
				+ DeviceWipeSentTime + ", DeviceWipeRequestTime="
				+ DeviceWipeRequestTime + ", DeviceWipeAckTime="
				+ DeviceWipeAckTime + ", LastPingHeartbeat="
				+ LastPingHeartbeat + ", RecoveryPassword=" + RecoveryPassword
				+ ", DeviceModel=" + DeviceModel + ", DeviceIMEI=" + DeviceIMEI
				+ ", DeviceFriendlyName=" + DeviceFriendlyName + ", DeviceOS="
				+ DeviceOS + ", DeviceOSLanguage=" + DeviceOSLanguage
				+ ", DevicePhoneNumber=" + DevicePhoneNumber + ", Identity="
				+ Identity + "]";
	}

	public static Item headerObject() {
		return new Item(
				"FirstSyncTime",
				"LastPolicyUpdateTime",
				"LastSyncAttemptTime",
				"LastSuccessSync",
				"DeviceType",
				"DeviceID",
				"DeviceUserAgent",
				"DeviceWipeSentTime",
				"DeviceWipeRequestTime",
				"DeviceWipeAckTime",
				"LastPingHeartbeat",
				"RecoveryPassword",
				"DeviceModel",
				"DeviceIMEI",
				"DeviceFriendlyName",
				"DeviceOS",
				"DeviceOSLanguage",
				"DevicePhoneNumber",
				"Identity");
	}

	public static Item fromTextLines(List<String> lines) {
		
		return new Item(
				getValue(lines.get(0)),
				getValue(lines.get(1)),
				getValue(lines.get(2)),
				getValue(lines.get(3)),
				getValue(lines.get(4)),
				getValue(lines.get(5)),
				getValue(lines.get(6)),
				getValue(lines.get(7)),
				getValue(lines.get(8)),
				getValue(lines.get(9)),
				getValue(lines.get(10)),
				getValue(lines.get(11)),
				getValue(lines.get(12)),
				getValue(lines.get(13)),
				getValue(lines.get(14)),
				getValue(lines.get(15)),
				getValue(lines.get(16)),
				getValue(lines.get(17)),
				getValue(lines.get(18)));
	}
	
	private static String getValue(String line) {
		String[] parts = line.split(": ");
		if (parts.length > 1) return parts[1];
		return "";
	}
	
	
	
}
