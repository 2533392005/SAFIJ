package com.utec.epro.deliver;

public class Test {
	/*** @param args the command line arguments*/

	public static void main(String[] args) throws Exception {
		Encryption en = new Encryption();
		String encryptedData = en.encrypt("La informacion vertida en esta cadena es de vital importancia para todos los usuarios que hacen uso de nuestra tecnologia. "
				+ "Por tanto, es imperativo para todos mantenerse al tanto de los avances presentados por este medio.");
		
		String encryptedData_trama = en.encrypt("<xml><ttd000>001</ttd000><ttd001>000</ttd001><ttd002>000</ttd002><ttd003>000</ttd003><ttd004/><ttd005/><ttd006/><ttd007/><ttd008/><ttd009>999</ttd009><ttd010>0031</ttd010><ttd011>1536955278151</ttd011><ttd012>LUIS</ttd012><ttd013>EDGARDO</ttd013><ttd014>CRUZ</ttd014><ttd015>CARBAJAL</ttd015><ttd016/><ttd017>000000000</ttd017><ttd018>047468922</ttd018><ttd019>10702</ttd019><ttd020>02012011</ttd020><ttd021>9300</ttd021><ttd022>06143112921041</ttd022><ttd023>10702</ttd023><ttd024>06022015</ttd024><ttd025>9300</ttd025><ttd026/><ttd027>00000</ttd027><ttd028>00000000</ttd028><ttd029/><ttd030>10614</ttd030><ttd031>000</ttd031><ttd032>CG MINISTERIO DE ECONOMIA    </ttd032><ttd033>JEFE DE RECURSOS HUMANOS</ttd033><ttd034>42</ttd034><ttd035>M</ttd035><ttd036>1</ttd036><ttd037>31</ttd037><ttd038>12</ttd038><ttd039>1992</ttd039><ttd040>M</ttd040><ttd041>1</ttd041><ttd042>153655</ttd042><ttd043>CORREO@DOMINIO.COM</ttd043><ttd044>0131</ttd044><ttd045>PA</ttd045><ttd046>UNIV</ttd046><ttd047>ARTI</ttd047><ttd048>SALA</ttd048><ttd049>75897415</ttd049><ttd050>22212416</ttd050><ttd051>25143094</ttd051><ttd052>00000000000</ttd052><ttd053>A </ttd053><ttd054/><ttd055/><ttd056/><ttd057/><ttd058>0003</ttd058><ttd059>010</ttd059><ttd060>A</ttd060><ttd061>10101</ttd061><ttd062>9</ttd062><ttd063>0125</ttd063><ttd064>009C</ttd064><ttd065>0303</ttd065><ttd066>60302002</ttd066><ttd067>18022025</ttd067><ttd068>01012030</ttd068><ttd069>ADN</ttd069><ttd070>A</ttd070><ttd071>0</ttd071><ttd072>86000</ttd072><ttd073>000000000000000</ttd073><ttd074>000</ttd074><ttd075>0001</ttd075><ttd076/><ttd077/><ttd078/><ttd079/><ttd080/><ttd081/><ttd082/><ttd083/><ttd084/><ttd085/><ttd086/><ttd087/><ttd088/><ttd089/><ttd090/><ttd091/><ttd092/><ttd093/><ttd094/><ttd095/><ttd096>4</ttd096><ttd097>4</ttd097><ttd098/><ttd099/><ttd100/><ttd101/><ttd102/><ttd103/><ttd104/><ttd105/><ttd106/><ttd107/><ttd108/><ttd109/><ttd110/><ttd111/><ttd112/><ttd113/><ttd114/><ttd115/><ttd116/><ttd117>4</ttd117><ttd118>4</ttd118><ttd119> </ttd119><ttd120>10614</ttd120></xml>"
		);
//		String encryptedWord = en.encrypt("A");
		String overEncryptedData = en.encrypt(encryptedData_trama);
		System.out.println("Encrypted word is : " + encryptedData);
		System.out.println("Over Encrypted word is : " + overEncryptedData);
		String enviarTrama = overEncryptedData;
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Se esta enviando la data: " + enviarTrama);

		System.out.println(" ");
		System.out.println(" ");
		
		Decryption de = new Decryption();
		String deOverEncyptedData = de.decrypt(overEncryptedData);
		System.out.println("deOverEncyptedWord: " + deOverEncyptedData);
		System.out.println("Over Decrypted word is : " + de.decrypt(overEncryptedData));
		System.out.println("Decrypted word is : " + de.decrypt(deOverEncyptedData));
	}
}
