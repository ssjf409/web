import java.io.*;

public class Sample4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("문자열을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		System.out.println(str + "이 입력되었습니다.");
	}

}
