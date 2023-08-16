package 이헌지;

// 3.진법
// 3.1 10진법과 2진법
// 우리는 일상생활에서 주로 사용하는 것은 10진법이다. 아마도 사람이 10개의 손가락을 가지고 있기 때문이 아닐까,
// 1946년에 개발된 컴퓨터인 에니악(ENIAC)은 사람에게 익숙한 10진법을 사용하도록 설계되었으나 전기회로는 전압이 불안정해서
// 전압을 10단계로 나누어 처리하는데 한계가 있었다. 그래서 1950년에 개발된 에드박(EDVAC)은 단 두가지 단계,
// 전기가 흐르면 1,흐르지 않으면 0,만으로 동작하도록 설계되었고 매우 성공적이었다.
// 손가락의 개수가 10개인 사람에게 10진법이 적합하듯,컴퓨터와 같은 전기회로에는 2진법이 적합한 것이다.
// 그 이후부터 지금까지 대부분의 컴퓨터는 2진 체계로 설계되었기 때문에,2진법을 알지못하면 컴퓨터의 동작원리나 데이터 차리방식을 
// 온전히 이해할 수 없다.지금까지 변수에 값을 저장하면 10진수로 저장되는 것처럼 설명을 하였지만,컴퓨터는 2진수(0과1) 밖에 모르기 때문에
// 아래의 오른쪽과 같이 2진수로 바뀌어 저장된다. 2진수 11001은 10진수로 25이다.
/*
     int age = 25; // 변수 age에 25를 저장
     
     age 25     →   age 11001 
*/ 
// |참고| int타입의 크기가 4 byte이면,32자리의 2진수로 표현해야하지만 앞의 0은 생략하였다. 
//  0을 생략하지 않으면,'11001'이 아니라 '00000000000000000000000000011001'이다.

// 이처럼 2진법은 0과 1로만 데이터를 표현하기 때문에 10진법에 비해 많은 자리수를 필요로 한다.
// 10진수 2와 같이 작은 숫자도 2진수로 표현하려면 2자리가 필요하다. 2진수 한 자리로는 1보다 큰 값을 표현할 수 없기 때문이다.
// 이것은 10진수에서 9보다 큰 수를 표현하기 위해서는 두 자리의 10진수가 필요한 것과 같다.
/*
                           |2진수   | 10진수 |
                           | 0     |     0|
                           | 1     |     1|
   2진수는 2가없으므로 자리    ←   | 10    |     2|
   올림이 발생해서 10이 된다.      | 11    |     3|
                           | 100   |     4|
                           | 101   |     5|
                           | 110   |     6|
                           | 111   |     7|
                           | 1000  |     8|
                           | 1001  |     9|
                           | 1010  |    10|
*/
// 그래서 2진수 1에 1을 더하면 2가 아닌 10이 되고,2진수 11에 1을 더하면 12가 아닌 100이 된다.
// 자리수가 많아지긴 해도 2진수는 10진수를 온전히 표현할 수 있다. 게다가 덧셈이나 뺄셈같은 연산도 10진수와 동일하다.

