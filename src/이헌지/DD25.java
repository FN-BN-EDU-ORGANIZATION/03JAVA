package 이헌지;


//4.4 실수형 - float,double
//실수형은 실수를 저장하기 위한 타입으로 float와 double,두 가지가 있으며 각 타입의 변수에 저장할 수 있는 값의 범위는 아래와 같다.
/*
                                                  |    크기    | 
    |    타입    |    저장 가능한 값의 범위(양수)           | 정밀도  | bit |byte|  
    |   float   |   1.4 x 10^-45 ~ 3.4 x  10^38   | 7자리  | 32  | 4  |  
    |   double  |   4.9 x 10^-^-324 1.8 x 10^308  | 15자리 | 64  | 8  |  

                    ▲ 표 2-18 실수형의 범위와 정밀도 
*/       
//표의 범위는 '양의 범위'만 적은 것으로,이 범위에 ' - ' 부호를 붙이면 '음의 범위'가 된다.
//예를 들어 float타입으로 표현가능한 음의 범위는'-11.4 x 10^-45 ~ -3.4 x 10^38'이 된다.
//float타입으로 표현가능한 양의 범위와 음의 범위를 함꼐 그림으로 그리면 다음과 같다.
/*
   -3.14 x 10^38             0                     3.4 x 10^38    
      ^_____________________^ ^________________________^
      |                     | |                        |               
  <-------------------------------------------------------->
                            | |
                           →---←
               -1.4 x 10^-45 ~ 1.4 x 10^-45
               
               ▲ flaot타입으로 표현할 수 있는 값의 범위 
*/
//즉,float타입의 표현범위는 '-3.4 x 10^38 ~ 3.4 x 10^38'이지만,'-1.4 x 10^-45 1.4 x 10^-45'
//범위(0은 제외)의 값은 표현할 수 없다. 실수형은 소주점수도 표현해야 하므로 '얼마나 큰 값을 표현할 수 있는가'
//뿐만 아니라 '얼마나 0에 가깝게 표현할 수 있는가'도 중요하다.
/*
실수형도 정수형처럼 저장할 수 있는 범위를 넘게 되면 오버플로우가 발생하나요?
A.앞서 정수형에서 변수의 값이 표현범위를 벗어나는 것을 '오버플로우(overflow)라고 배웠습니다.
실수형에서도 변수의 값이 표현범위의 최대값을 벗어나면 '오버플로우'가 발생하는데요,정수형과 달리 실수형에서는 오버플로우 
발생하면 변수의 값은 '무한대(infinity)'가 됩니다.
그리고 정수형에는 없는 '언더플로우(underflow)'가 있는데, '언더플로우'는 실수형으로 표현할 수 없는 아주 작은 값,
즉 양의 최소값보다 작은 값이 되는 경우를 말합니다. 이 때 변수의 값은 0이 됩니다.
*/
//4byte의 정수로는'약 ± 2 x 10^9'의 값밖에 표현할 수 없는데,어떻게 같은 4byte로 '± 3.4 x 10^38'과 같이
//큰 값을 표현할 수 있는 것일까? 그 이유는 바로 값을 저장하는 형식이 다르기 때문이다.
/* 
            int : 1+ 31 = 32(4 byte)
            S(1) |       31bit
            
            float : 1 + 8 + 23 =32(4byte) 
            S(1) | E(8)     |      M(23)     |
            
               ▲ int 타입과 float타입의 표현형식 
*/
//위 그림은 int타입과 float타입의 표현형식을 비교한 것인데,int타입은 '부호와 값',두 부분으로 이루어져있지만,
//float타입과 같은 실수형 '부호(S),지수(E),가수(M)',세 부분으로 이루어져 있다. 
//즉,'2의 제곱을 곱한 형태(±M ㅌ 2^E)로 저장하기 때문에 이렇게 큰 범위의 값을 저장하는 것이 가능한 것이다.
//그러나 정수형과 달리 실수형은 오차가 발생할 수 있다는 단점이 있다. 
//그래서 실수형에는 표현할 수 있는 값의 범위뿐만 아니라'정밀도(precision)'도 중요한 요소이다.
//표 2-18을 보면 float타입은 정밀도가 7자리인데,이것은 'ax10^n'(1≤a<10)의 형태로 표현된 
//"7자리의 10진수를 오차없이 저장할 수 있다'는 뜻으로 아래의 세 값은 float타입의 
//변수에 저장했을 때 오차없이 저장할 수 있다.
/*

                        1234.567       =  1.234567 x 10^3
                        0.00001234567  =  1.234567 x 10^-5
                        1234567000     =  1.234567 x 10^9
*/
//만일 7자리 이상의 정밀도가 필요하다면,변수의 타입을 double로 해야한다. double타입은 float타입보다 정밀도가 약 2배인,
//10진수로 15자리의 정밀도를 가지므로 float타입보다 훨씬 더 정밀하게 값을 표현할 수 있다.
//실수형 값을 저장할 때,float타입이 아닌 double타입의 변수를 사용하는 경우는 대부분 저장하려는 '값의 범위'
//때문이 아니라 '보다 높은 정밀도'가 필요해서이다.

//| 참고 | double이라는 이름은 float보다 약 2배(double)의 정밀도를 갖는다는 의미에서 붙여진 것이다.

