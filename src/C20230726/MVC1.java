package C20230726;

//View와 Model을 이용해서 데이터 처리를 한다.
//화면에 출력하는 건 View를 통해서 한다.
//(입력도 마찬가지로 View를 통해서 한다)
//컨투롤러 부분은 자바  // html 등등 view 담당 // 
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model model = new Model();//모델을 생성
		View view = new View();//화면(View)을 생성
		
		//View를 통해서만 입력을 받을 수 있다.
		int a = view.numInput();
		int b = view.numInput();
		char c = view.charInput();
		
		//model을 통해서만 데이터 처리를 할 수 있다.
		int addNum = model.add(a, b);
		int subtractNum = model.subtract(a, b);
		int multiNum = model.multi(a, b);
		int dvNum = model.dv(a,b);
		int remainNum = model.remain(a,b);
		int test = model.calculator(a, b, c);
		
		//View를 통해서만 결과 출력 가능
		view.showResult(addNum);
		view.showResult(subtractNum);
		view.showResult(multiNum);
		view.showResult(dvNum);
		view.showResult(remainNum);
		view.showResult(test);

	}

}
