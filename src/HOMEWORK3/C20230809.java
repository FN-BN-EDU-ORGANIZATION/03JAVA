package HOMEWORK3;
	//의문점
	//정리
		//프로젝트 관련 내용을 저장하기 위한 DB연결과 오류에 대비하기 위한 예외처리!
public class C20230809 {
	//예제1 : Spring 복습(예외처리)
//	@ControllerAdvice - 예외처리 전역설정 도와주는 애노테이션!
//	public class GlobalExceptionHandler { - 전역 예외처리를 해주는 핸들러클래스 만들기~
//		@ExceptionHandler(FileNotFoundException.class) - FileNotFoundException 예외만 처리해줌
//		public String error1(Exception ex, Model model) { - 예외처리 객체와 모델 객체 받도록 하기
//			System.out.println("GlobalExceptionHandler FileNotFoundException.. ex " + ex);
//			System.out.println("GlobalExceptionHandler FileNotFoundException.. ex ");
//			model.addAttribute("ex",ex); - 뷰로 예외처리 된 것 보내기
//			return "memo/error"; - 메서드 형식이 void가 아니기 때문에 결과를 return할 view 경로 적기
//		}
//		
//		@ExceptionHandler(ArithmeticException.class) - ArithmeticException 예외만 처리
//		public String error2(Exception ex, Model model) {
//			System.out.println("GlobalExceptionHandler ArithmeticException.. ex " + ex);
//			System.out.println("GlobalExceptionHandler ArithmeticException.. ex ");
//			model.addAttribute("ex",ex);
//			return "memo/error";
//		}
//		
//		@ExceptionHandler(Exception.class) - 기타등등 예외 처리
//		public String error3(Exception ex, Model model) {
//			System.out.println("GlobalExceptionHandler Exception.. ex " + ex);
//			System.out.println("GlobalExceptionHandler Exception.. ex ");
//			model.addAttribute("ex",ex);
//			return "memo/error";
//		}
	
	//view에서 ex확인하기
//	<h1>MEMO ERROR PAGE</h1>	
//	EXCEPTION : ${ex} <br />
//	EXCEPTION : ${ex.stackTrace} <br /> - 예외가 발생한 위치 등 알 수 있는 함수!
//	EXCEPTION : ${ex.getMessage()} <br /> - 예외의 원인, 상황 등 알 수 있는 함수!

	
	//예제2 : Spring 복습(데이터베이스연결)
	
	//연결을 위해 pom.xml에 mysql connector, jdbc, hikariCP dependency 작성 필수!
	
	//Spring-jdbc DataSource
//	@Bean - 빈 설정하는 애노테이션
//	public DataSource dataSource()
//	{
//		DriverManagerDataSource dataSource = new DriverManagerDataSource(); - jdbc datasource 객체 생성
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); - jdbc 클래스 설정
//		dataSource.setUrl("jdbc:mysql://localhost:3306/bookdb"); - DB 연결 url 설정
//		dataSource.setUsername("root"); - DB 연결할 사용자 이름 설정
//		dataSource.setPassword("1234");	- 해당 사용자의 비밀번호 설정
//		return dataSource;
//	}

	//HikariCP DataSource
//	@Bean
//	public HikariDataSource dataSource2()
//	{
//		HikariDataSource dataSource = new HikariDataSource(); - hikari datasource 객체 생성
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); - 클래스 설정
//		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/bookdb"); - DB 연결 url 설정
//		dataSource.setUsername("root"); - 사용자 이름 설정
//		dataSource.setPassword("1234"); - 비밀번호 설정
//		
//		return dataSource;
//	}
	
	
	
}
