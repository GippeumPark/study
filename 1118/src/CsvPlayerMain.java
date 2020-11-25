import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class CsvPlayerMain {

	public static void main(String[] args) {
		//각 데이터의 제약 조건 설정
		CellProcessor [] processor = new CellProcessor[] {
			new NotNull(), new ParseInt(new NotNull()), 
			new ParseDate("yyyy-MM-dd"), new Optional(), new Optional()	
		};
		//데이터 목록 저장할 List 생성
		List<CsvPlayer> list = new ArrayList<CsvPlayer>();
		
		
		try(ICsvBeanReader beanReader = 
				new CsvBeanReader(
						new BufferedReader(
								new InputStreamReader(
									new FileInputStream(
										"C:\\Users\\20208\\Desktop\\학습폴더\\volleyball.csv"))),
					CsvPreference.STANDARD_PREFERENCE)){
			
			//헤더 가져오기
			String [] header = 
					beanReader.getHeader(true);
			for(String heading : header) {
				System.out.printf("%s\n", heading);
			}
			
			while(true) {
				//하나의 데이터를 CsvPlayer로 읽어서 저장하기
				CsvPlayer player = beanReader.read(CsvPlayer.class, header,processor);
				//읽은게 없으면 중단
				if(player == null) {
					break;
				}
				list.add(player);
			}
			
			//list의 데이터 출력
			for(CsvPlayer player : list) {
			System.out.printf("%s\n", player);
			}
		}catch(Exception e) {
			System.out.printf("읽기 예외:%s\n", e.getMessage());
			e.printStackTrace();
		}

	}

}
