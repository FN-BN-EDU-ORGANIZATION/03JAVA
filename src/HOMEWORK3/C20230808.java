package HOMEWORK3;
	//의문점
	//정리
		//Servlet을 하다가 Spring으로 넘어오니까 이해가 더 잘 되는 것 같다.
		//프로젝트를 본격적으로 만들게 되면 Servlet에서보다는 조금 덜 헤맬 수 있을 거라 생각한다..!
		//많은 애노테이션들이 있고 그걸 잘 이용하면 좀 더 간단한 코드를 작성할 수 있겠다.
public class C20230808 {
	//예제1 : Spring 복습하기 (파라미터 받기)
//	@Controller - 컨트롤러 애노테이션 작성. 컨트롤러로 만들기!
//	@Slf4j - 로그를 남기기 위한 애노테이션. 
//	@RequestMapping("/test") - 사용자의 요청을 괄호 안의 url로 맵핑. http://localhost:8080/app/test/ (테스트는 폴더!!) 
//	public class ParamController {
//		@GetMapping("/param01") - Get방식으로 맵핑
//		public void p1(@RequestParam(required = true) String name) { - 파라미터를 전달받지 않으면 맵핑이 안됨(required=true)
//			log.info("GET /test/param01.."+name);
//		}
//		
//		@GetMapping("/param02") 
//		public void p2(@RequestParam(required = false) String name) { - 파라미터가 없어도 맵핑 됨 (기본값 false)
//			log.info("GET /test/param02.."+name);
//		}
//
//		@GetMapping("/param03") 
//		public void p3(@RequestParam(required = false,defaultValue = "홍길동") String name) { - defaultValue는 기본 파라미터값을 지정해주는 것. 파라미터를 url에 직접 지정하지 않으면 기본값으로 맵핑됨.
//			log.info("GET /test/param03.."+name);
//		}
//
//		@GetMapping("/param04") 
//		public void p4(String name, int age, String addr) { - 파라미터 여러개도 전달 가능!
//			log.info("GET /test/param04.."+name+" "+age+" "+addr);
//		}
//		
//		@GetMapping("/param05") 
//		public void p5(Person person) { - Object형태의 파라미터도 전달 가능! (url에 파라미터 적어주어야 함. 안적으면 null값 들어감)
//			log.info("GET /test/param05.."+person);
//		}
//		
//		@GetMapping("/param06/{name}/{age}/{addr}") - 파라미터 전달방식 바꾸기(~~/param06/홍길동/55/대구)
//		public void p6(Person person) {
//			log.info("GET /test/param06.."+person);
//		}
//		
		//view로 연결하는 작업
//		@GetMapping("/param07/{name}/{age}/{addr}") - url경로가 view파일과 같을 경우에는 void로 두어도 맵핑 가능함
//		public String p7(Person person) {
//			log.info("GET /test/param07.."+person);
//			return "test/param07";	메서드 형식을 String으로 바꾸고 return에 jsp파일 경로 적기(jsp파일이 url경로와 다른 이름을 가진 파일일 경우에!)
//		}

//		@GetMapping("/param07") - 파라미터를 view로 전달 (각각 파라미터 전달)
//		public void p7(Person person, Model model) { - view로 전달하기 위해서 Model 객체 사용!
//			log.info("GET /test/param07.."+person);
//			log.info("Model : " + model);
//			model.addAttribute("name",person.getName()); - model객체에 저장된 person의 이름 가져오기
//			model.addAttribute("age",person.getAge()); - model객체에 저장된 person의 나이 가져오기
//			model.addAttribute("addr",person.getAddr()); - model객체에 저장된 person의 주소 가져오기
//		}
//
//		@GetMapping("/param08") - 파라미터를 view로 전달(object전체로 전달)
//		public void p8(Person person, Model model) {
//			log.info("GET /test/param08.."+person);
//			log.info("Model : " + model);
//			model.addAttribute("person",person);
//		}
//		
//		@GetMapping("/param09/{name}/{age}/{addr}")
//		public String p9(Person person, Model model) {
//			log.info("GET /test/param09.."+person);
//			model.addAttribute("person",person);
//			return "test/param09"; - url에 중괄호로 파라미터 받을 때 경로 잡아주기
//		}
//		
//		@GetMapping("/param10/{name}/{age}/{addr}")
//		public ModelAndView p10(Person person) { - ModelAndView객체로 파라미터 받기 (자료형을 ModelAndView로)
//			log.info("GET /test/param10.."+person);
//			//ModelAndView
//			ModelAndView modelAndView = new ModelAndView();
//			//속성추가
//			modelAndView.addObject("person",person);
//			//뷰경로 추가
//			modelAndView.setViewName("test/sample"); 
//			
//			return modelAndView; 
//		}
//		
//		//Servlet 방식으로 받아보기
//		@GetMapping("/servlet_test")
//		public void servlet_test(HttpServletRequest req, HttpServletResponse resp) {
//			System.out.println("req : " + req);
//			System.out.println("req : " + req.getParameter("id"));
//			System.out.println("context : " + req.getSession().getServletContext());
//			System.out.println("resp : " + resp);
//		}
//		
//		@GetMapping("/form")
//		public void form() {
//			log.info("GET /test/form.."); - 1번 순서! -> 뷰 form.jsp(2번 순서)
//		}
////		@PostMapping("/post01")
////		public void post_01(int id, String text, String writer) {
////			log.info("POST /test/post01.." + id +" "+text+" "+writer);
////		}
//		@PostMapping("/post01")
//		public void post_01(@RequestParam("id") int no, String text, String writer) { - jsp파일의 요청파라미터(id)와 받는 파라미터의 이름(no)이 다를 경우 RequestParam으로 맵핑!)
//			log.info("POST /test/post01.." + no +" "+text+" "+writer);
//		}
//		
//		@GetMapping("/form2")
//		public void form2() {
//			log.info("GET /test/form.."); - 1번 순서! -> 뷰 form.jsp로 이동(2번 순서)
//		}
//		@PostMapping("/post02") - 2번에서 받은 파라미터를 3번 순서(여기)로 전달
//		public void post_02(@ModelAttribute("memo") MemoDto dto) { 
//			log.info("POST /test/post02.." +dto);
//		}
//		
//	}

	
	//예제2 : Spring 복습하기 (유효성체크하기)
//	@Controller - 컨트롤러 애노테이션 작성
//	@Slf4j - 로그를 남기기 위한 애노테이션
//	@RequestMapping("/memo") //http://localhost:8080/app/memo/ - 사용자의 요청을 받기 위한 리퀘스트 맵핑
//	public class MemoController {
//		
//		@GetMapping("/form") - Get방식으로 맵핑
//		public void get() {
//			log.info("GET /memo/form..");
//		}
//		@PostMapping("/post") - Post방식으로 맵핑
//		public String post(@Valid MemoDto dto,BindingResult bindingResult,Model model) { - 유효성체크를 위해서 @Valid 애노테이션 변수에 추가, BindingResult에서 유효성체크에 문제 생길 시 결과 확인
//			log.info("POST /memo/post.." + dto);
//			log.info("POST /memo/post..isError " +bindingResult.getFieldError("id"));
//			if(bindingResult.hasFieldErrors()) {
////				log.info("POST /memo/post..isError " +bindingResult.getFieldError("id").getDefaultMessage()); //MemoDto에서 지정했던 메시지도 확인 가능
//				for(FieldError error : bindingResult.getFieldErrors()) {
//					log.info(error.getField()+" : "+error.getDefaultMessage());
//					model.addAttribute(error.getField(), error.getDefaultMessage());
//				}
//				return "memo/form"; - 메서드의 형식을 void가 아니라 다른 것으로 바꾸면 view를 보낼 return값을 입력해야함!
//			}
//			return ""; 
//		}
//		
//	}

}
