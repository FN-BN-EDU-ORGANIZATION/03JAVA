package 이헌지;

// 4.기본형(primitive type)

// 이번 단원에서는 기본형의 보다 세부적인 내용에 대해 살펴볼 것이다. 다소 깊이 있는 내용이므로 어렵다고 느낄 수도 있는데,
// 앞서 배운 기본형에 대한 대략적인 내용만으로도 별 부족함 없이 진도를 나갈 수 있으니까 다 이해하지 못해도 괜찮다.
// 그래도 언젠가는 반드시 알아야하는 내용이므로 가볍게라도 봐둘 필요는 있다.

// 4.1 논리형 - boolean

// 논리형에는'boolean'한가지 밖에 없다. boolean형 변수에는 true와 false중 하나늘 저장할 수 있으며 
// 기본값(defalut)은 false이다. 
// boolean형 변수는 대답(yes/no),스위치(on/off)등의 논리구현에 주로 사용된다. 
// 그리고 boolean형은 true와 false,두 가지의 값만을 표현하면 되므로 1bit만으로도 충분하지만,
// 자바에서는 데이터를 다루는 최소단위가 byte이기 때문에,boolean의 크기가 1byte이다.
// 아래 문장은 power라는 boolean형 변수를 선언하고 true로 변수를 초기화 했다
/*
         boolean power    = true;
         boolean checked  = False;   // 에러. 대소문자가 구분됨. true 또는 false만 가능
*/
// 자바에서는 대소문자가 구별되기 때문에 TRUE와 true는 다른것으로 간주된다는 것에 주의하자.