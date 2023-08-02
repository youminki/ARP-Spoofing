import java.net.InetAddress;

public class SoketExample1 {
	public static void main(String[] args) {
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName("www.google.com");
			System.out.println("호스트 이름: " + ip.getHostName());
			System.out.println("호스트 주소: " + ip.getHostAddress());
			System.out.println("내 주소: " + InetAddress.getLocalHost().getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
