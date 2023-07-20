package 이헌지;

package C023진법;

//3.3 8진법과 16진법

//2진법은 오직 0과 1, 두 개의 기호만으로 값을 표현하기 때문에,2진법으로 값을 표현하면 자리수가 상당히 길어진다는 단점이 있다.
//이러한 단점을 보완하기 위해 2진법 대신 8진법이나 16진법을 사용한다.
//8진수는 2진수 3자리를,16진수는 2진수 4자리를 각각 한자리로 표현할 수 있기 떄문에 
//자리수가 짦아져서 알아보기 쉽고 서로 간의 변환방법 또한 매우 간단하다.

//8진법은 값을 표현하는데 8개의 기호가 필요하므로 0~7의 숫자를 기호로 사용하면 되지만,16진법은 16개의 기호가 필요하므로
//0~9의 숫자만으로는 부족하다. 그래서 6개의 문자(A-F)를 추가로 사용한다. 
//예를 들어 16진수 A는 10진수로 10이고,F는 15이다.

//2진수를 8진수,16진수로 변환
//2진수를 8진수로 변환하려면,2진수를뒤에서부터 3자리씩 끊어서 그에 해당하는 8진수로 바꾸면 된디.
//8은 2^3이기 때문에,8진수 한 자리가 2진수 3자리를 대신할 수 있는 것이다.
//2진수를 16진수로 변환하는 방법 역시 이와 비슷한데.3자리가 아닌 4자리씩 끊어서 바꾼다는 점만 다르다.

//|참고| 8진수 또는 16진수를 2진수로 변환하려면 위와 반대의 과정을 거치기만 하면 된다.
/*

1010101100 ->        512 128 64 32 8 4  -> 748  
16 진수로 변환   2 10(A)12(C) = 2AC   8진수로 변환 = 1(1)010(2)(101(5)100(4) => 1254
*/
